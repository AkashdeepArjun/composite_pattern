package home;

public class SmartWatch implements Android{

    @Override
    public void showWeather() {
       
        MyUtils.log("SMART WATCH ", "showing weather");            
    }

    @Override
    public void playVideos() {
        MyUtils.log("SMART WATCH", "playing videos");      
    }

    @Override
    public void playMusic() {
        
        MyUtils.log("SMART WATCH", "playing music");   
    }

    @Override
    public void playMovies() {
        
        MyUtils.log("SMART WATCH", "playing movies");
        
    }
    
}
