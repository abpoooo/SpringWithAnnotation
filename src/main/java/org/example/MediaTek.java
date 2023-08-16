package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
// if there are 2 and more we need to mention @primary
//@Primary // or do not mention @Primary then use @Qualifier in Samsung
public class MediaTek implements MobileProcessor{

    public void process() {
        System.out.println("2nd Best CPU");
    }
}
