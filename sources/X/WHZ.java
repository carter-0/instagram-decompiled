package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

public final class WHZ implements C64721Te {
    public final Drawable ALw(Resources resources, 1U1 r7, C240483Lb r8) {
        Bitmap CBJ;
        AnonymousClass7TG.A1T(resources, r8, r7);
        AnonymousClass1Sz.A00();
        if (!(r8 instanceof AnonymousClass3LZ)) {
            return null;
        }
        AnonymousClass3LZ r82 = (AnonymousClass3LZ) r8;
        C226672hf r4 = r7.A0J;
        Boolean bool = true;
        if (!bool.equals(r82.A00.get(AnonymousClass000.A00(3457))) || r4 == null || !r4.A02) {
            CBJ = r82.CBJ();
            if (r4 != null) {
                C14982UIa uIa = new C14982UIa(resources, CBJ);
                if (!r4.A02) {
                    float[] fArr = r4.A03;
                    if (fArr != null) {
                        uIa.Ehg(fArr);
                        return uIa;
                    }
                    uIa.Ehh(r4.A00);
                    return uIa;
                }
                uIa.ERU(true);
                return uIa;
            }
        } else {
            CBJ = r82.CBJ();
        }
        return new BitmapDrawable(resources, CBJ);
    }
}
