package json;

import java.io.File;
import java.io.FilenameFilter;

public class ReadJsonText {
    String directory = "C:\\Users\\UserK\\Desktop\\javaFile\\LPVS\\RESULTS";
    FilenameFilter filter = new FilenameFilter() {
        @Override
        public boolean accept(File dir, String name) {
            return name.contains(".json");
        }
    };

    public static void main(String[] args) {
        ReadJsonText readJsonText = new ReadJsonText();

        File dir = new File(readJsonText.directory);
        String[] list = dir.list(readJsonText.filter);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
