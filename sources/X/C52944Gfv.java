package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.Gfv  reason: case insensitive filesystem */
public final class C52944Gfv extends C287475aC implements C288885ce {
    public final C55859Hog A00;
    public final 0sP A01;

    public C52944Gfv(C55859Hog hog, 0sP r3) {
        super(C287655aY.A00);
        this.A00 = hog;
        this.A01 = r3;
    }

    public final /* bridge */ /* synthetic */ Object CoX(C268024cd r4, Object obj) {
        return new IGB(this.A00, this.A01);
    }

    public final boolean equals(Object obj) {
        C52944Gfv gfv;
        0sP r2 = this.A01;
        0sP r0 = null;
        if ((obj instanceof C52944Gfv) && (gfv = (C52944Gfv) obj) != null) {
            r0 = gfv.A01;
        }
        return 0qQ.A0K(r2, r0);
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public final boolean AB4(0sP r2) {
        return C287455aA.A00(this, r2);
    }

    public final Object AW8(Object obj, 0sL r3) {
        return r3.invoke(obj, this);
    }

    public final Modifier Ezh(Modifier modifier) {
        return C285235Qj.A00(this, modifier);
    }
}
