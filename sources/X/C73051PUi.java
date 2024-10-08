package X;

import android.media.AudioAttributes;
import android.util.SparseIntArray;
import androidx.media.AudioAttributesCompat;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.PUi  reason: case insensitive filesystem */
public final class C73051PUi implements Runnable {
    public final /* synthetic */ C70827OMz A00;

    public C73051PUi(C70827OMz oMz) {
        this.A00 = oMz;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.9uV, java.lang.Object] */
    public final void run() {
        String str;
        C69308Nj9 nj9;
        C70827OMz oMz = this.A00;
        if (!oMz.A01 && oMz.A0C < 3) {
            SparseIntArray sparseIntArray = AudioAttributesCompat.A01;
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(3);
            builder.setContentType(2);
            builder.setUsage(1);
            AudioAttributesCompat A0G = C66583MXo.A0G(builder);
            int i = oMz.A05.get();
            ? obj = new Object();
            obj.A03 = C39894ADw.A05;
            if (i == 1 || i == 2 || i == 3 || i == 4) {
                obj.A00 = i;
                obj.A01(oMz.A03);
                obj.A03 = A0G;
                C39894ADw A002 = obj.A00();
                oMz.A00 = A002;
                C263534Mj r0 = oMz.A02;
                0qQ.A0A(A002);
                int A01 = r0.A01(A002);
                if (A01 != 1) {
                    if (A01 == 2) {
                        str = "Delayed";
                    } else {
                        str = "Failed";
                    }
                    27B.A01("AudioFocusManager", 002.A0R(str, " to acquire audio focus"), new Object[0]);
                    oMz.A04.DEP(A01);
                    AtomicReference atomicReference = oMz.A06;
                    if (A01 == 2) {
                        nj9 = C69308Nj9.ACQUIRE_DELAYED;
                    } else {
                        nj9 = C69308Nj9.ACQUIRE_FAILED;
                    }
                    atomicReference.set(nj9);
                    oMz.A0C++;
                    return;
                }
                oMz.A01 = true;
                oMz.A0C = 0;
                oMz.A06.set(C69308Nj9.ACQUIRED);
                return;
            }
            throw DbW.A0a("Illegal audio focus gain type ", i);
        }
    }
}
