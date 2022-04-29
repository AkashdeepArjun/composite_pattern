package home;

public class SmartTv implements Android{

    @Override
    public void showWeather() {
       
        MyUtils.log("SMART TV", "showing weather");            
    }

    @Override
    public void playVideos() {
        MyUtils.log("SMART Tv", "playing videos");      
    }

    @Override
    public void playMusic() {
        
        MyUtils.log("SMART Tv", "playing music");   
    }

    @Override
    public void playMovies() {
        
        MyUtils.log("SMART Tv", "playing movies");
        
    }

    
}
