package org.designpattern;

import org.buildphone.CustomPhone;
import org.buildphone.CustomPhoneBuilder;

public class BuilderMain {
    public static void main(String[] args) {

        //CustomPhone cp = new CustomPhone("Android",2,"QualComm",5.5,3000);
        CustomPhone cp = new CustomPhoneBuilder()
                .setOs("Android")
                .setRam(2)
                .getPhone();
        System.out.println(cp);
    }
}
