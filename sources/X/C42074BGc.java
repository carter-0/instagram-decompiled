package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.BGc  reason: case insensitive filesystem */
public final class C42074BGc extends AnonymousClass0T0 implements C2808054e {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public final C42074BGc F9V() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42074BGc) {
                C42074BGc bGc = (C42074BGc) obj;
                if (!0qQ.A0K(this.A00, bGc.A00) || !0qQ.A0K(this.A01, bGc.A01) || !0qQ.A0K(this.A02, bGc.A02) || !0qQ.A0K(this.A03, bGc.A03) || !0qQ.A0K(this.A04, bGc.A04) || !0qQ.A0K(this.A05, bGc.A05) || !0qQ.A0K(this.A06, bGc.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String Ac1() {
        return this.A00;
    }

    public final String Ac4() {
        return this.A01;
    }

    public final String BMi() {
        return this.A04;
    }

    public final String Bf8() {
        return this.A06;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTStoryAppAttributionDict", C44377Cdx.A00(this));
    }

    public final String getContentUrl() {
        return this.A02;
    }

    public final String getId() {
        return this.A03;
    }

    public final String getName() {
        return this.A05;
    }

    public final int hashCode() {
        return (((((((((((AnonymousClass7TG.A0E(this.A00) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + C41845B3m.A00(this.A06);
    }

    public C42074BGc(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
        this.A05 = str6;
        this.A06 = str7;
    }
}
