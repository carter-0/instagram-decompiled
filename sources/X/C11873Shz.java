package X;

import android.content.res.Resources;

/* renamed from: X.Shz  reason: case insensitive filesystem */
public final class C11873Shz implements C13691Tf9 {
    public final Resources A00;
    public final C13691Tf9 A01;

    public final C13796ThF ANe(C11856Shi shi, Object obj, int i, int i2) {
        C13796ThF ANe = this.A01.ANe(shi, obj, i, i2);
        Resources resources = this.A00;
        if (ANe == null) {
            return null;
        }
        return new C11912Sil(resources, ANe);
    }

    public final boolean CJU(C11856Shi shi, Object obj) {
        return this.A01.CJU(shi, obj);
    }

    public C11873Shz(Resources resources, C13691Tf9 tf9) {
        this.A00 = resources;
        this.A01 = tf9;
    }
}
