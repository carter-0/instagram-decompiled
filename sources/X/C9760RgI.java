package X;

import java.io.File;

/* renamed from: X.RgI  reason: case insensitive filesystem */
public abstract class C9760RgI {
    public static final void A00(0xF r5, File file, String str) {
        long j;
        0xF r4 = new 0xF();
        long j2 = 0;
        if (file != null) {
            j = file.getFreeSpace();
        } else {
            j = 0;
        }
        0xF.A00(r4, Long.valueOf(j), "free");
        if (file != null) {
            j2 = file.getTotalSpace();
        }
        0xF.A00(r4, Long.valueOf(j2), "total");
        0xF.A00(r5, r4, str);
    }
}
