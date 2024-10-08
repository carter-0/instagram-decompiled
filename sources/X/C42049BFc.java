package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.BFc  reason: case insensitive filesystem */
public final class C42049BFc extends AnonymousClass0T0 implements C46298DUb {
    public final int A00;
    public final DSY A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public final C42049BFc F6S() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42049BFc) {
                C42049BFc bFc = (C42049BFc) obj;
                if (!0qQ.A0K(this.A01, bFc.A01) || !0qQ.A0K(this.A02, bFc.A02) || !0qQ.A0K(this.A03, bFc.A03) || this.A00 != bFc.A00 || !0qQ.A0K(this.A04, bFc.A04) || !0qQ.A0K(this.A05, bFc.A05) || !0qQ.A0K(this.A06, bFc.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final DSY Ar4() {
        return this.A01;
    }

    public final String BUR() {
        return this.A02;
    }

    public final String BUW() {
        return this.A03;
    }

    public final int BUX() {
        return this.A00;
    }

    public final String BUZ() {
        return this.A04;
    }

    public final String BUa() {
        return this.A05;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTMultiAdsInfo", C44222Caj.A00(this));
    }

    public final String getTitle() {
        return this.A06;
    }

    public final int hashCode() {
        return (((((((((((AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + this.A00) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + C41845B3m.A00(this.A06);
    }

    public C42049BFc(DSY dsy, String str, String str2, String str3, String str4, String str5, int i) {
        this.A01 = dsy;
        this.A02 = str;
        this.A03 = str2;
        this.A00 = i;
        this.A04 = str3;
        this.A05 = str4;
        this.A06 = str5;
    }
}
