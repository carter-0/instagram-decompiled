package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.JzF  reason: case insensitive filesystem */
public final class C61222JzF extends AnonymousClass0T0 implements C66565MWt {
    public final C61224JzH A00;
    public final String A01;
    public final String A02;

    public C61222JzF(C61224JzH jzH, String str, String str2) {
        0qQ.A0B(str2, 3);
        this.A01 = str;
        this.A00 = jzH;
        this.A02 = str2;
    }

    public final C61222JzF FF0() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61222JzF) {
                C61222JzF jzF = (C61222JzF) obj;
                if (!0qQ.A0K(this.A01, jzF.A01) || !0qQ.A0K(this.A00, jzF.A00) || !0qQ.A0K(this.A02, jzF.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ C66562MWq BoO() {
        return this.A00;
    }

    public final String BoQ() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTShoppingNetegoInStoryLabel", C63330KvD.A00(this));
    }

    public final String getDestination() {
        return this.A01;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A02, ((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TE.A0L(this.A00)) * 31);
    }
}
