package X;

import java.io.File;
import java.io.FileFilter;
import java.util.concurrent.TimeUnit;

public final class Ahu implements FileFilter {
    public static final Ahu A00 = new Ahu();

    public final boolean accept(File file) {
        0qQ.A0B(file, 0);
        if (file.lastModified() >= System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1)) {
            return true;
        }
        return false;
    }
}
