package X;

import android.os.Environment;
import android.os.StatFs;

/* renamed from: X.8cg  reason: invalid class name and case insensitive filesystem */
public abstract class C359348cg {
    public static final C359358ch A00() {
        if (new StatFs(Environment.getDataDirectory().getPath()).getAvailableBytes() / 10 <= 10000000) {
            return null;
        }
        long availableBytes = new StatFs(Environment.getDataDirectory().getPath()).getAvailableBytes() / 10;
        if (availableBytes > 100000000) {
            availableBytes = 100000000;
        }
        return new C359358ch((int) availableBytes);
    }
}
