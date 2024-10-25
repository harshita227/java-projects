import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;
    public Album(String name,String artist){
        this.name=name;
        this.artist=artist;
        this.songs=new ArrayList<>();
    }
    public Album(){

    }
    public Song findSong(String title){
        for(Song checkedSong :songs){
            if(checkedSong.getTitle().equals(title))return checkedSong;
        }
        return null;
    }
    
    public boolean addSong(String title ,double duration){
        if(findSong(title)==null){
            songs.add(new Song(title,duration));
            System.out.println(title+"Successfully Added to the List");
            return true;
        }else{
            System.out.println("Song with name "+title+"already exist in the list");
            return false;
        }
    }

    public boolean addToPlaylist(String title ,LinkedList<Song>Playlist){
        for(Song checkedSong :this.songs){
            if(checkedSong.getTitle().equals(title)){
                Playlist.add(checkedSong);
                return true;
            }
        }
            System.out.println(title +"There is no such song in Album");
            return false;
        }
    } 

