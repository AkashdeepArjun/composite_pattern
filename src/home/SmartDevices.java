package home;

import java.util.ArrayList;
import java.util.List;
public class SmartDevices implements Android{

    List<Android> devices;

    public SmartDevices(){
        devices=new ArrayList<Android>();
    }

    public void addAndroidDevice(Android device){
        this.devices.add(device);
    }

    public void removeAndroidDevice(Android device){

        this.devices.remove(device);

    }

    public void syncWeather(){
        for(Android device:this.devices){
            device.showWeather();
        }
    }


    @Override
    public void showWeather() {
       
        MyUtils.log("SMART DEVICE", "showing weather");            
    }

    @Override
    public void playVideos() {
        MyUtils.log("SMART DEVICE", "playing videos");      
    }

    @Override
    public void playMusic() {
        
        MyUtils.log("SMART DEVICE", "playing music");   
    }

    @Override
    public void playMovies() {
        
        MyUtils.log("SMART DEVICE", "playing movies");
        
    }
    
}
