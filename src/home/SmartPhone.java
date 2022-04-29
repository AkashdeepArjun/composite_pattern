package home;

public class SmartPhone implements Android{

    @Override
    public void showWeather() {
       
        MyUtils.log("SMART PHONE", "showing weather");            
    }

    @Override
    public void playVideos() {
        MyUtils.log("SMART PHONE", "playing videos");      
    }

    @Override
    public void playMusic() {
        
        MyUtils.log("SMART PHONE", "playing music");   
    }

    @Override
    public void playMovies() {
        
        MyUtils.log("SMART PHONE", "playing movies");
        
    }
    
}
