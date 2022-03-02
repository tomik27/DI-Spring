package cs.upce.fei.nnpia.cv2.dispring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DiSpringApplication {

    @Autowired
    MailService mailService;

    @Autowired
    CallService callService;

    public static void main(String[] args) {
      /*  AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext("cs.upce.fei.nnpia.cv2.dispring");
      context.getBean(DiSpringApplication.class).process();*/
        SpringApplication.run(DiSpringApplication.class);
    }
@PostConstruct
    private void process() {
        mailService.receiveMail();
        callService.receiveCall();
    }

}
