package X;

import java.io.File;
import java.io.FileFilter;

public final /* synthetic */ class T95 implements FileFilter {
    public static final /* synthetic */ T95 A00 = new Object();

    public final boolean accept(File file) {
        return file.getName().endsWith(".apk");
    }
}
