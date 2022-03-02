package cs.upce.fei.nnpia.cv2.dispring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MailService {

@Autowired
SoundService soundService;



    public void receiveMail(){
        soundService.makeNoise("Tudů");
    }
}
