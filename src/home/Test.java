package home;

public class Test {

    public static void main(String[] args){


        SmartDevices devices=new SmartDevices();
        Android samsung_watch=new SmartWatch();

        Android sony_tv=new SmartTv();

        Android smart_phone=new SmartPhone();


        devices.addAndroidDevice(samsung_watch);

        devices.addAndroidDevice(sony_tv);

        devices.addAndroidDevice(smart_phone);


        devices.syncWeather();




    }   
}
