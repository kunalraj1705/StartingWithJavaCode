package File;

import java.io.File;
import java.io.FilenameFilter;

public class FilenameFilterExample {
    public static void main(String[] args){
        String dirName = "C:\\Users\\kunal\\IdeaProjects\\StartingWithJavaCode";
        File file = new File(dirName);
        String[] allFiles = file.list();

        System.out.println("List of Available Files : ");
        assert allFiles != null;
        for(String fileName : allFiles){
            System.out.println(fileName);
        }

        FilenameFilter filenameFilter = new OnlyExt("txt");
        System.out.println("-----------------------------");
        System.out.println("Printing all the files with extension txt after Filtering");
        String[] f1 = file.list(filenameFilter);
        assert f1 != null;
        for (String filename : f1) {
            System.out.println(filename);
        }
    }
}

class OnlyExt implements FilenameFilter{

    String ext;
    public OnlyExt(String ext){
        this.ext = "." + ext;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }
}
