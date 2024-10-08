package X;

import java.io.File;
import java.io.FilenameFilter;

public final class T98 implements FilenameFilter {
    public static final T98 A00 = new T98();

    public final boolean accept(File file, String str) {
        0qQ.A0B(str, 1);
        if (!C66580MXl.A1a("preview_audio_", 1, str)) {
            return false;
        }
        0qQ.A0B(".wav", 1);
        if (str.endsWith(".wav")) {
            return true;
        }
        return false;
    }
}
