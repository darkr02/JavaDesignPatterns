package org.phone;

public class OperatingSystemFactory {

    public OS getInstance(String osName)
    {
        if (osName.equals("Open"))
        {
            return new Android();
        }
        else if (osName.equals("Closed"))
        {
            return new IOS();
        }
        else
        {
            return new Windows();
        }
    }
}
