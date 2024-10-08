package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.BGp  reason: case insensitive filesystem */
public final class C42086BGp extends AnonymousClass0T0 implements DUB {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public final C42086BGp F9w() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42086BGp) {
                C42086BGp bGp = (C42086BGp) obj;
                if (!0qQ.A0K(this.A00, bGp.A00) || !0qQ.A0K(this.A01, bGp.A01) || !0qQ.A0K(this.A02, bGp.A02) || !0qQ.A0K(this.A03, bGp.A03) || !0qQ.A0K(this.A04, bGp.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String B4W() {
        return this.A00;
    }

    public final String B4X() {
        return this.A01;
    }

    public final String B4a() {
        return this.A02;
    }

    public final String B4b() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTStoryFBTagStickerDict", C44392CeC.A00(this));
    }

    public final String getPk() {
        return this.A04;
    }

    public final int hashCode() {
        return (((((((AnonymousClass7TG.A0E(this.A00) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + C41845B3m.A00(this.A04);
    }

    public C42086BGp(String str, String str2, String str3, String str4, String str5) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
    }
}
