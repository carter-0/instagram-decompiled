package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.TextAppTextFragmentType;

public final class Up1 extends 17P implements C21037XAq {
    public C51955G8y A00;

    public final XAJ B53() {
        return (XAJ) A05(1209835371, C16119Uox.class);
    }

    public final TextAppTextFragmentType B7y() {
        return (TextAppTextFragmentType) A0N(-858826807, C20736Wy9.A00);
    }

    public final XAR BMl() {
        return (XAR) A05(2132983029, C16120Uoy.class);
    }

    public final C51955G8y BRe() {
        C51955G8y g8y = this.A00;
        if (g8y == null) {
            return (C51955G8y) A05(-252379899, EON.class);
        }
        return g8y;
    }

    public final XAK C3t() {
        return (XAK) A05(-742702763, C16122Up0.class);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, X.XAq, X.Up1] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(V8U.A00(this), this);
    }

    public final String Bcv() {
        return A0i(1973234167);
    }

    public final C21037XAq E9O(1E9 r2) {
        C51955G8y BRe = BRe();
        if (BRe != null) {
            BRe.E9N(r2);
        } else {
            BRe = null;
        }
        this.A00 = BRe;
        return this;
    }

    public final C15065UNi FCW(1E9 r8) {
        C15061UNe uNe;
        C15062UNf uNf;
        C47218Dt5 dt5;
        XAJ B53 = B53();
        C15064UNh uNh = null;
        if (B53 != null) {
            uNe = B53.FCP();
        } else {
            uNe = null;
        }
        TextAppTextFragmentType B7y = B7y();
        XAR BMl = BMl();
        if (BMl != null) {
            uNf = BMl.FCQ();
        } else {
            uNf = null;
        }
        C51955G8y BRe = BRe();
        if (BRe != null) {
            dt5 = BRe.FCR(r8);
        } else {
            dt5 = null;
        }
        String A0i = A0i(1973234167);
        XAK C3t = C3t();
        if (C3t != null) {
            uNh = C3t.FCV();
        }
        return new C15065UNi(uNe, uNf, dt5, uNh, B7y, A0i);
    }

    public final C15065UNi FCX(1E6 r2) {
        return FCW(C41847B3o.A0q(r2));
    }
}
