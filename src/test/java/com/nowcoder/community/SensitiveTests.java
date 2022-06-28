package com.nowcoder.community;

import com.nowcoder.CommunityApplication;
import com.nowcoder.community.util.SensitiveFilter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author guofan
 * @Date 2022-06-01 19:53
 * @Description
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class SensitiveTests {

    @Autowired
    private SensitiveFilter sensitiveFilter;

    @Test
    public void testSensitiveFilter(){
        String text = "这里不可以吸毒，不可以嫖娼，不可以吸毒，不可以开票！哈哈哈。";
        text = sensitiveFilter.filter(text);
        System.out.println(text);

        text = "这里不可以☆吸☆毒☆，不可以☆嫖☆娼☆，不可以☆吸☆毒☆，不可以☆开☆票☆！哈哈哈。";
        text = sensitiveFilter.filter(text);
        System.out.println(text);
    }
}
