package X;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;

/* renamed from: X.SiB  reason: case insensitive filesystem */
public final class C11878SiB implements C13916TlI {
    public final C13916TlI A00;

    public final void FK7(MessageDigest messageDigest) {
        this.A00.FK7(messageDigest);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11878SiB) {
            return this.A00.equals(((C11878SiB) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C11878SiB(C13916TlI tlI) {
        C9217RTu.A00(tlI);
        this.A00 = tlI;
    }

    public final C13796ThF FHe(Context context, C13796ThF thF, int i, int i2) {
        C13813Thg thg = SUv.A00(context).A01;
        C11271SIi sIi = ((Q6Z) thF.get()).A09.A00;
        C11911Sik sik = new C11911Sik(sIi.A03, thg);
        C13916TlI tlI = this.A00;
        C13796ThF FHe = tlI.FHe(context, sik, i, i2);
        if (!sik.equals(FHe)) {
            sik.recycle();
        }
        sIi.A01((Bitmap) FHe.get(), tlI);
        return thF;
    }
}
