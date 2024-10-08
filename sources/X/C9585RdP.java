package X;

import android.os.StatFs;
import java.io.File;
import java.util.Map;

/* renamed from: X.RdP  reason: case insensitive filesystem */
public abstract class C9585RdP {
    public static final void A00(File file, String str, Map map) {
        if (file != null && file.exists()) {
            StatFs statFs = new StatFs(file.getPath());
            map.put(str, new C12285Sqj(statFs.getAvailableBytes(), statFs.getFreeBytes(), statFs.getTotalBytes()));
        }
    }
}
