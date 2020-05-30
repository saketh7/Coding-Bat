import java.util.HashSet;
import java.util.Set;

public class IsRepeatingPlaylist {
    private String name;
    private IsRepeatingPlaylist nextSong;

    public IsRepeatingPlaylist(String name) {
        this.name = name;
    }

    public void setNextSong(IsRepeatingPlaylist nextSong) {
        this.nextSong = nextSong;
    }

    public boolean isRepeatingPlaylist() {
    	
    	Set<IsRepeatingPlaylist> songs= new HashSet<>();
    	songs.add(this);
    	IsRepeatingPlaylist current = this.getNextSong();
    		while(current.getNextSong()!=null && !songs.contains(current.getNextSong())) {
    			songs.add(current);
    			current=current.getNextSong();
    		}
    	
    	return songs.contains(current.getNextSong());
    	
    }

    private IsRepeatingPlaylist getNextSong() {
		return nextSong;
	}

	public static void main(String[] args) {
    	IsRepeatingPlaylist first = new IsRepeatingPlaylist("Hello");
    	IsRepeatingPlaylist second = new IsRepeatingPlaylist("Eye of the tiger");
    	IsRepeatingPlaylist third = new IsRepeatingPlaylist("Third of the tiger");
        
    	first.setNextSong(second);
    	second.setNextSong(third);
        third.setNextSong(second);

        System.out.println(first.isRepeatingPlaylist());
    }
}