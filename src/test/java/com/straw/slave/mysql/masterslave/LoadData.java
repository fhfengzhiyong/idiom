package com.straw.slave.mysql.masterslave;

import com.straw.slave.model.Yesoulchenyu;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.util.StringUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.util.UUID;

public class LoadData {
    @Test
    public void t1() {
        File file = new File("C:\\Users\\Administrator\\Desktop\\YesoulChenYu.txt");
        FileReader fileReader = null;
        SqlSession sqlSession =null;
        try {
            String resouce="mybatis-config.xml";
            InputStream is= Resources.getResourceAsStream(resouce);
            SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
            System.out.println(sqlSessionFactory.getConfiguration());
            System.out.println(sqlSessionFactory.getConfiguration().isSafeRowBoundsEnabled());
            sqlSession = sqlSessionFactory.openSession();


            fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String start = "|";
            String line =null;
            while (!StringUtils.isEmpty(line=bufferedReader.readLine())&&!equals("-1")){
                //System.out.println(line);
                if (line.startsWith(start)) {
                    String[] split = line.split("\\|");
                    if (split != null && split.length > 0) {
                        Yesoulchenyu yesoulChenYu = new Yesoulchenyu();
                        yesoulChenYu.setId(UUID.randomUUID().toString());
                        yesoulChenYu.setContext(split[1].trim());
                        yesoulChenYu.setPingYin(split[2].trim());
                        yesoulChenYu.setShiYi(split[3].trim());
                        yesoulChenYu.setChuChu(split[4].trim());
                        yesoulChenYu.setLiZi(split[5].trim());
                        yesoulChenYu.setSpingYin(split[5].trim());
                        sqlSession.insert("com.straw.slave.dao.YesoulChenYuDao.insert",yesoulChenYu);
                    }
                }
            }
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.close();
        }
    }
}
