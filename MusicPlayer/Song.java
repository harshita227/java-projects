public class Song {
    private String title;
    private double duration; 
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public double getDuration() {
        return duration;
    }
    public void setDuration(double duration) {
        this.duration = duration;
    }
    public Song(String title,double duration){
        this.duration=duration;
        this.title=title;


    }
    public Song(){

    }

    @Override
    public String toString(){
        return "Song{"+
          " title= ' " + title + '\'' +  ",duration=" +duration+'}';
        }
    }



