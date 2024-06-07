package org.designpattern;

import org.phone.OS;
import org.phone.OperatingSystemFactory;
/**
 * Hello world!
 *
 */
public class FactoryMain
{
    public static void main( String[] args )
    {
        //OS obj = new Windows();
        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS obj = osf.getInstance("abcd");
        obj.spec();

    }
}
