package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.BGm  reason: case insensitive filesystem */
public final class C42083BGm extends AnonymousClass0T0 implements C46310DUn {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public final C42083BGm F9r() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42083BGm) {
                C42083BGm bGm = (C42083BGm) obj;
                if (!0qQ.A0K(this.A00, bGm.A00) || !0qQ.A0K(this.A01, bGm.A01) || !0qQ.A0K(this.A02, bGm.A02) || !0qQ.A0K(this.A03, bGm.A03) || !0qQ.A0K(this.A04, bGm.A04) || !0qQ.A0K(this.A05, bGm.A05) || !0qQ.A0K(this.A06, bGm.A06) || !0qQ.A0K(this.A07, bGm.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String B4B() {
        return this.A00;
    }

    public final String B4C() {
        return this.A01;
    }

    public final String B4D() {
        return this.A02;
    }

    public final String B4E() {
        return this.A03;
    }

    public final String B4F() {
        return this.A04;
    }

    public final String B4V() {
        return this.A05;
    }

    public final String BSu() {
        return this.A06;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTStoryFBCommunityStickerDict", C44389Ce9.A00(this));
    }

    public final String getPk() {
        return this.A07;
    }

    public final int hashCode() {
        return (((((((((((((AnonymousClass7TG.A0E(this.A00) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + C41845B3m.A00(this.A07);
    }

    public C42083BGm(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
        this.A05 = str6;
        this.A06 = str7;
        this.A07 = str8;
    }
}
