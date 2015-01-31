package Test;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JLabel;

import Operations.Word;

/**
 *
 * @author Gökhan
 */

/**
 * Aciklama :  Bu CLASS'in işlevi oyunun gövdesidir. Daha sonra bunu FORM a cevirebiliriz. 
 * 
 * Kurallar:
 * 1-) Oyun başla tuşuna basildiginda ilk olarak zamanlama ayarlanir;
 *   1.1- ) WordTimer class'i sayesinde RandomWord Class'indan bir kelime getirilir ve bu kelimenin puani hesaplanir bir yerde depolanir,
 *   1.2- ) Kelime alindiginda bu kelime FormOperation ile form üzerinde kaydilirmaya baslar. burada FormOperation'in gorevi büyük cunku;
 *          hem KeyboardControl Class'indan donecek sonucu surekli dinleyecek buna göre SoundControl'ü devreye sokacak ki sesler ortaya çıksın,
 *          onun yaninda bir de kendi icinde puanlamayi tutup form üzerinde bir yerde not edicek. Tüm işlemler bu sırayla giderse tahminimce
 *          oyunumuz ortaya cikacaktir :D 
 * 
 */
public class KelimeYagmuru{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    	Pencere objPencere = new Pencere();
    	
    	objPencere.setSize(500, 500);
    	objPencere.setLocationRelativeTo(null);
    	objPencere.setResizable(false);
    	objPencere.setVisible(true);
    	
    	
    }

}
