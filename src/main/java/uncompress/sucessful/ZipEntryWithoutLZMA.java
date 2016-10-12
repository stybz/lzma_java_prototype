package uncompress.sucessful;

import java.io.BufferedInputStream;
import java.net.URL;
import java.util.zip.ZipInputStream;

public class ZipEntryWithoutLZMA {
    public static void main(String[] args) throws Throwable {
        URL brra = new URL("https://sty.bz/brra2016.zip");
        ZipInputStream zis = new ZipInputStream(new BufferedInputStream(brra.openStream()));
        java.util.zip.ZipEntry entry;

        //Exception in thread "main" java.util.zip.ZipException: invalid compression method
        while ((entry = zis.getNextEntry()) != null) {
            System.out.println("Extracting: " + entry);
        }
    }
}