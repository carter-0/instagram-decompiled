package X;

import android.content.res.Resources;

/* renamed from: X.Sjs  reason: case insensitive filesystem */
public final class C11977Sjs implements C13538TcA {
    public final Resources A00;

    public final C13796ThF FHZ(C11856Shi shi, C13796ThF thF) {
        Resources resources = this.A00;
        if (thF == null) {
            return null;
        }
        return new C11912Sil(resources, thF);
    }

    public C11977Sjs(Resources resources) {
        this.A00 = resources;
    }
}
