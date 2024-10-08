package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.BFv  reason: case insensitive filesystem */
public final class C42068BFv extends AnonymousClass0T0 implements C46282DTl {
    public final 1Xj A00;
    public final String A01;

    public final C42068BFv F7p(1E9 r1) {
        return this;
    }

    public final C42068BFv F7q(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42068BFv) {
                C42068BFv bFv = (C42068BFv) obj;
                if (!0qQ.A0K(this.A01, bFv.A01) || !0qQ.A0K(this.A00, bFv.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String BDb() {
        return this.A01;
    }

    public final 1Xj BPf() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTProductDetailsMediaContent", C44259Cbu.A00(this));
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TE.A0O(this.A01));
    }

    public C42068BFv(1Xj r1, String str) {
        AnonymousClass7TG.A1O(str, r1);
        this.A01 = str;
        this.A00 = r1;
    }

    public final C46282DTl E80(1E9 r1) {
        return this;
    }
}
