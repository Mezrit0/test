import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        /**
         * file reader
         */
//        public boolean loadMap() {
//            try (BufferedReader br = new BufferedReader(new FileReader("worldmap.txt"))) {
//                String line;
//                while ((line = br.readLine()) != null) {
//                    String[] lines = line.split(";");
//                    Location location = new Location(lines[1], Integer.parseInt(lines[0]), Arrays.copyOfRange(lines, 2, 6));
//                    world.put(Integer.valueOf(lines[0]), location);
//                }
//
//                return true;
//            } catch (IOException e) {
//                return false;
//            }
//
//        }

        /**
         * comparable
         */

//        jestli int:
//        public int compareTo (Object o){
//            return Integer.compare(o.getNeco, this.getNeco)
//        }
//
//        jestli String:
//        public int compareTo (Object o){
//            return this.getNeco.compareTo(o.getNeco)
//        }

//        Comparable je genericky interface takze kdyz implementujes tak bys mel pouzit implements Comparable<Vec co comparujes>

//
        /**
         * serializace
         */
//        public void saveToFile(String file) throws IOException {
//            ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(file));
//            stream.writeObject(this);
//            stream.close();
//        }
//
//        public Dragon getFromFile(String file) throws IOException, ClassNotFoundException{
//            ObjectInputStream stream = new ObjectInputStream(new FileInputStream(file));
//            Dragon dragon = (Dragon) stream.readObject();
//            stream.close();
//            return dragon;
//        }

    }
}