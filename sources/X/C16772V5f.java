package X;

import android.os.StrictMode;
import java.util.UUID;

/* renamed from: X.V5f  reason: case insensitive filesystem */
public abstract class C16772V5f {
    public static final UUID A00() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return UUID.randomUUID();
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}
