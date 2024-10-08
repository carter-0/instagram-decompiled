package X;

import android.util.Log;
import java.io.File;

public abstract class Pz8 {
    public static void A00(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to delete file which is a directory ");
            sb.append(file2);
            Log.e("AtomicFile", sb.toString());
        }
        if (!file.renameTo(file2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C66579MXk.A00(566));
            sb2.append(file);
            sb2.append(" to ");
            sb2.append(file2);
            Log.e("AtomicFile", sb2.toString());
        }
    }
}
