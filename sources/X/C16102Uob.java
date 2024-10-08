package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.NativeInfoCardCommentLayout;

/* renamed from: X.Uob  reason: case insensitive filesystem */
public final class C16102Uob extends 17P implements C21030XAj {
    public final C21031XAk ApO() {
        return (C21031XAk) A05(795620109, C16108Uoh.class);
    }

    public final C21032XAl BEM() {
        return (C21032XAl) A05(-1390435021, C16109Uoi.class);
    }

    public final NativeInfoCardCommentLayout BLl() {
        return (NativeInfoCardCommentLayout) A0N(-1109722326, C20729Wy2.A00);
    }

    public final C21031XAk CCr() {
        return (C21031XAk) A05(339340927, C16108Uoh.class);
    }

    public final XAX CCv() {
        return (XAX) A05(-1382195328, C16110Uoj.class);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, X.XAj, X.Uob] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(C16830V7l.A00(this), this);
    }

    public final UNG F6e() {
        UNM unm;
        UNN unn;
        UNM unm2;
        C21031XAk ApO = ApO();
        UNO uno = null;
        if (ApO != null) {
            unm = ApO.F6j();
        } else {
            unm = null;
        }
        C21032XAl BEM = BEM();
        if (BEM != null) {
            unn = BEM.F6k();
        } else {
            unn = null;
        }
        NativeInfoCardCommentLayout BLl = BLl();
        C21031XAk CCr = CCr();
        if (CCr != null) {
            unm2 = CCr.F6j();
        } else {
            unm2 = null;
        }
        XAX CCv = CCv();
        if (CCv != null) {
            uno = CCv.F6l();
        }
        return new UNG(BLl, unm, unm2, unn, uno);
    }
}
