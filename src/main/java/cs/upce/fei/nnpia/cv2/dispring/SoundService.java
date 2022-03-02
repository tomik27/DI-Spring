package cs.upce.fei.nnpia.cv2.dispring;

import org.springframework.stereotype.Service;

@Service
public class SoundService {
    public SoundService() {
        System.out.println("Sound service created. Singleton?");
    }

    public void makeNoise(String sound){
        System.out.println(sound);
    }
}
