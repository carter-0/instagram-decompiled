package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* renamed from: X.SiC  reason: case insensitive filesystem */
public final class C11879SiC implements C13916TlI {
    public final C13916TlI A00;
    public final boolean A01;

    public final void FK7(MessageDigest messageDigest) {
        this.A00.FK7(messageDigest);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11879SiC) {
            return this.A00.equals(((C11879SiC) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C11879SiC(C13916TlI tlI, boolean z) {
        this.A00 = tlI;
        this.A01 = z;
    }

    public final C13796ThF FHe(Context context, C13796ThF thF, int i, int i2) {
        C13813Thg thg = SUv.A00(context).A01;
        Drawable drawable = (Drawable) thF.get();
        C11911Sik A002 = C11119SAy.A00(drawable, thg, i, i2);
        if (A002 != null) {
            C13796ThF FHe = this.A00.FHe(context, A002, i, i2);
            if (!FHe.equals(A002)) {
                return new C11912Sil(context.getResources(), FHe);
            }
            FHe.recycle();
            return thF;
        } else if (!this.A01) {
            return thF;
        } else {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Unable to convert ");
            A1A.append(drawable);
            throw Pxg.A0d(" to a Bitmap", A1A);
        }
    }
}
