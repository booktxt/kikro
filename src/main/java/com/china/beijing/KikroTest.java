package com.china.beijing;

import com.china.beijing.feature.SimpleMailSender;
import com.china.beijing.model.MailSenderInfo;

/**
 * @author wenjd
 * @date 2018/06/20
 */
public class KikroTest {
    public static void main(String[] args) throws Exception{
        MailSenderInfo mailInfo = new MailSenderInfo();
        mailInfo.setMailServerHost("smtp.qq.com");
        mailInfo.setValidate(true);
        //支持smtp协议的邮箱
        mailInfo.setUserName("xxx");
        //邮箱密码
        mailInfo.setPassword("xxxx");
        //发件地址   后边的认证需要用户名和发件地址一致
        mailInfo.setFromAddress("xxx@qq.com");
        //收件人地址
        mailInfo.setToAddress("xxx@qq.com");
        mailInfo.setSubject("测试报警");
        mailInfo.setContent("测试报警信息");
        SimpleMailSender.sendEmail(mailInfo);
        System.out.println("============================================");
    }
}
