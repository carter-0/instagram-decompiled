package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class BDv extends AnonymousClass0T0 implements DU3 {
    public final DSF A00;
    public final C257593xe A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public final BDv F0r() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BDv) {
                BDv bDv = (BDv) obj;
                if (!0qQ.A0K(this.A02, bDv.A02) || !0qQ.A0K(this.A01, bDv.A01) || !0qQ.A0K(this.A03, bDv.A03) || !0qQ.A0K(this.A04, bDv.A04) || !0qQ.A0K(this.A00, bDv.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String Ac5() {
        return this.A02;
    }

    public final C257593xe AgG() {
        return this.A01;
    }

    public final String AgQ() {
        return this.A03;
    }

    public final DSF BzZ() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTBloksStickerDataDict", C44079CUw.A00(this));
    }

    public final String getId() {
        return this.A04;
    }

    public final int hashCode() {
        return (((((((AnonymousClass7TG.A0E(this.A02) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public BDv(DSF dsf, C257593xe r2, String str, String str2, String str3) {
        this.A02 = str;
        this.A01 = r2;
        this.A03 = str2;
        this.A04 = str3;
        this.A00 = dsf;
    }
}
