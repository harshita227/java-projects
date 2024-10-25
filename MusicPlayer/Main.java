
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static ArrayList<Album> albums =new ArrayList<>();
    public static void main(String[] args) {
        Album album=new Album("Album1","AC/DC");
        album.addSong("TNT", 4.5);
        album.addSong("Highway", 3.5);
        album.addSong("ThuderStruck", 5.0);
        albums.add(album);
        album=new Album("Album2","Eminem");
        album.addSong("Rap god",4.5 );
        album.addSong("NotAfraid", 3.4);
        album.addSong("Love Yourself", 4.5);
        albums.add(album);
        LinkedList<Song> plaList_1=new LinkedList<>();
        albums.get(0).addToPlaylist("TNT", plaList_1);
        albums.get(0).addToPlaylist("Highway", plaList_1);
        albums.get(0).addToPlaylist("NotAfraid", plaList_1);
        albums.get(0).addToPlaylist("Love Yourself", plaList_1);
        play(plaList_1);


    }
    private static void play(LinkedList<Song> playList){
        Scanner sc=new Scanner(System.in);
        boolean quit =false;
        boolean forward=true;
        ListIterator<Song> listIterator=playList.listIterator();

        if(playList.size()==0){
            System.out.println("This playlist have no song");

        }else{
            System.out.println("Now playing"+ listIterator.next().toString());
            printMenu();
        }
        while(!quit){
            int action=sc.nextInt();
            sc.nextLine();
          
            switch (action) {
                case 0:
                System.out.println("Playlist Complete ");
                quit = true;
                break;
                case 1:
                if(!forward){
                    if(listIterator.hasNext()){
                        listIterator.next();
                    }
                    forward=true;
                }
                if(listIterator.hasNext()){
                    System.out.println("Now playing"+listIterator.next().toString());
                }else{
                    System.out.println("No Song Available,reach to the end of list");
                    forward=false;
                }
                    
                    break;
                     case 2:
                if(forward){
                    if(listIterator.hasPrevious()){
                        listIterator.previous();
                    }
                    forward=false;
                }
                if(listIterator.hasPrevious()){
                    System.out.println("Now playing"+listIterator.previous().toString());
                }else{
                    System.out.println("We are at the first song");
                    forward=false;
                }
                    
                    break;

             case 3:
                if(forward){
                    if(listIterator.hasPrevious()){
                    System.out.println("Now playing"+listIterator.previous().toString());
                    
                    forward=false;
                }else{ 
                    System.out.println("We are at the start of the list ");}
                }else{
                   if(listIterator.hasNext()){
                    System.out.println("Now playing"+listIterator.next().toString());
                    
                    forward=true;
                }else{
                    System.out.println("we have reached to the end of list");
                }
                }
                    
                    break;

case 4:
printList(playList);
break;
case 5:
printMenu();
break;
case 6:
    if(playList.size()>0){
        listIterator.remove();
        if(listIterator.hasNext()){
            System.out.println("Now Playing"+listIterator.next().toString());
        }else{
            if(listIterator.hasPrevious())
            {
                System.out.println("now palying "+listIterator.previous().toString());
            }
        }
    }
}}}


                
public static void printMenu(){
    System.out.println("Available options \n press");
    System.out.println("0 - to quit \n" +
    "1 - to play next song \n"+
    "2 - to play previous song \n"+
    "3 - to replay the current song\n"+
    "4 - list of all songs \n"+
    "5 - print all available options\n"+
    "6 - delete current song");
}
private static void printList(LinkedList<Song> playList){
    Iterator<Song> iterator=playList.iterator();
    System.out.println("-----------------------");
    while(iterator.hasNext()){
        System.out.println(iterator.next());
    }
    System.out.println("-------------------------");
}
        


    

    }
