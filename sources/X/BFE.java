package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class BFE extends AnonymousClass0T0 implements C46280DTj {
    public final Boolean A00;
    public final Boolean A01;
    public final Integer A02;

    public final BFE F55() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BFE) {
                BFE bfe = (BFE) obj;
                if (!0qQ.A0K(this.A00, bfe.A00) || !0qQ.A0K(this.A02, bfe.A02) || !0qQ.A0K(this.A01, bfe.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ C45332Cua AKE() {
        return new C45332Cua(this);
    }

    public final Boolean Aa6() {
        return this.A00;
    }

    public final Integer Ahk() {
        return this.A02;
    }

    public final Boolean CeX() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTIGTVAdsInfoDict", CZS.A00(this));
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public BFE(Boolean bool, Boolean bool2, Integer num) {
        this.A00 = bool;
        this.A02 = num;
        this.A01 = bool2;
    }
}
