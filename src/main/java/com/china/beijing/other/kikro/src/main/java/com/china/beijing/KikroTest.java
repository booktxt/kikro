package main.java.com.china.beijing;

import main.java.com.china.beijing.feature.SimpleMailSender;
import main.java.com.china.beijing.model.MailSenderInfo;

/**
 * @author wenjd
 * @date 2018/06/20
 */
public class KikroTest {
    public static void main(String[] args) throws Exception{
        MailSenderInfo mailInfo = new MailSenderInfo();
        mailInfo.setMailServerHost("smtp.163.com");
        mailInfo.setMailServerPort("25");
        mailInfo.setValidate(true);
        mailInfo.setUserName("mybooktxt2@163.com");
        mailInfo.setPassword("123456");
        mailInfo.setFromAddress("mybooktxt2@163.com");
        mailInfo.setToAddress("524031053@qq.com");
        mailInfo.setSubject("Pinpoint报警");
        mailInfo.setContent("测试报警信息");
        SimpleMailSender.sendEmail(mailInfo);
    }
}
