package praktikum;
import java.util.ArrayList;
import java.util.List;

public class latihan {


	    public static void main(String[] args) {
	        // membuat objek Hewan dan mengisinya dengan beberapa hewan
	        List<String> hewan = new ArrayList<>();
	        hewan.add("Sapi");
	        hewan.add("Kelinci");
	        hewan.add("Kambing");
	        hewan.add("Unta");
	        hewan.add("Domba");

	        // membuat objek DeleteHewan dan mengisinya dengan beberapa hewan yang akan dihapus
	        List<String> deleteHewan = new ArrayList<>();
	        deleteHewan.add("Kelinci");
	        deleteHewan.add("Kambing");
	        deleteHewan.add("Unta");

	        // menghapus hewan yang ada di objek DeleteHewan dari objek Hewan
	        hewan.removeAll(deleteHewan);

	        // menampilkan hasil setelah penghapusan
	        System.out.println("Output Hewan : " + hewan);
	    }
	
}
