package X;

import java.io.File;

/* renamed from: X.WiS  reason: case insensitive filesystem */
public final class C19955WiS implements Runnable {
    public final /* synthetic */ 274 A00;

    public C19955WiS(274 r1) {
        this.A00 = r1;
    }

    public final void run() {
        274 r2 = this.A00;
        r2.A07();
        if (!r2.A0C) {
            1xT r1 = r2.A0H.A0y;
            if (r1.A0G) {
                String str = r1.A0E;
                String str2 = r1.A0F;
                if (!str.equalsIgnoreCase(str2)) {
                    r2.A0C = true;
                    File file = new File(002.A0R(str2, "/ExoPlayerCacheDir/videocache"));
                    if (file.exists()) {
                        274.A05(file);
                    }
                }
            }
        }
    }
}
