package GroupA;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App{
    public static void main( String[] args ){

        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");

  Instagram instagram=new Instagram();
  instagram.getSocialMedia();
  System.out.println(instagram);

  Facebook facebook=new Facebook();
  facebook.getSocialMedia();
  System.out.println(facebook);

  SocialMediaa socialMediaa=applicationContext.getBean("SocialMediaa",SocialMediaa.class);
  System.out.println(socialMediaa);

  applicationContext.close();

    }
}
