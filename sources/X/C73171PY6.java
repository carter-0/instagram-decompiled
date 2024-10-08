package X;

import androidx.media.AudioAttributesCompat;
import java.util.Set;

/* renamed from: X.PY6  reason: case insensitive filesystem */
public final class C73171PY6 implements Runnable {
    public final /* synthetic */ C71125OdK A00;
    public final /* synthetic */ boolean A01;

    public C73171PY6(C71125OdK odK, boolean z) {
        this.A00 = odK;
        this.A01 = z;
    }

    public final void run() {
        C71125OdK odK = this.A00;
        AudioAttributesCompat audioAttributesCompat = C71125OdK.A0M;
        Set<0sP> set = odK.A0A;
        boolean z = this.A01;
        for (0sP A1O : set) {
            odK.A07.A00(002.A1D("isAudioDisabledBySystem - callback ", z), new Object[0]);
            C51968G9o.A1O(A1O, odK.A01);
        }
    }
}
