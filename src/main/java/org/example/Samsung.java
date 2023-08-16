package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component//("samsung")//default name -> Non qualified and de capitalized
public class Samsung {
    @Autowired
    //if we want to mention the name, it is another way select between
    // multi components with same function implemented the interface
    @Qualifier("mediaTek")
    MobileProcessor cpu;

    public MobileProcessor getCpu() {
        return cpu;
    }

    public void setCpu(MobileProcessor cpu) {
        this.cpu = cpu;
    }

    public void config() {
        System.out.println("Octa Core, 4gb Ram, 12MP, camera");
        cpu.process();
    }
}
