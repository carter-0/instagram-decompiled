package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ProductCollection;

/* renamed from: X.BEn  reason: case insensitive filesystem */
public final class C42035BEn extends AnonymousClass0T0 implements C46308DUl {
    public final DTJ A00;
    public final ProductCollection A01;
    public final Boolean A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final C42035BEn F3A(1E9 r1) {
        return this;
    }

    public final C42035BEn F3B(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42035BEn) {
                C42035BEn bEn = (C42035BEn) obj;
                if (!0qQ.A0K(this.A01, bEn.A01) || !0qQ.A0K(this.A03, bEn.A03) || !0qQ.A0K(this.A00, bEn.A00) || !0qQ.A0K(this.A04, bEn.A04) || !0qQ.A0K(this.A05, bEn.A05) || !0qQ.A0K(this.A02, bEn.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final ProductCollection Aoo() {
        return this.A01;
    }

    public final String Aov() {
        return this.A03;
    }

    public final DTJ Axv() {
        return this.A00;
    }

    public final String BDT() {
        return this.A04;
    }

    public final String BDU() {
        return this.A05;
    }

    public final Boolean CP7() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTFeedProductCollectionTagDict", C44143CXi.A00(this));
    }

    public final int hashCode() {
        return (((((((((AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }

    public C42035BEn(DTJ dtj, ProductCollection productCollection, Boolean bool, String str, String str2, String str3) {
        this.A01 = productCollection;
        this.A03 = str;
        this.A00 = dtj;
        this.A04 = str2;
        this.A05 = str3;
        this.A02 = bool;
    }

    public final C46308DUl E7P(1E9 r1) {
        return this;
    }
}
