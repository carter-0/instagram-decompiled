package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class UN4 extends AnonymousClass0T0 implements C21034XAn {
    public final C21022XAb A00;
    public final C21038XAr A01;
    public final XAN A02;
    public final Boolean A03;
    public final String A04;
    public final String A05;

    public final UN4 F4m() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UN4) {
                UN4 un4 = (UN4) obj;
                if (!0qQ.A0K(this.A00, un4.A00) || !0qQ.A0K(this.A03, un4.A03) || !0qQ.A0K(this.A04, un4.A04) || !0qQ.A0K(this.A01, un4.A01) || !0qQ.A0K(this.A02, un4.A02) || !0qQ.A0K(this.A05, un4.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C21022XAb ArL() {
        return this.A00;
    }

    public final Boolean BIh() {
        return this.A03;
    }

    public final C21038XAr C5i() {
        return this.A01;
    }

    public final XAN C7O() {
        return this.A02;
    }

    public final String CA1() {
        return this.A05;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGNativeSmartTextOverlay", V7O.A00(this));
    }

    public final String getText() {
        return this.A04;
    }

    public final int hashCode() {
        return (((((((((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + C41845B3m.A00(this.A05);
    }

    public UN4(C21022XAb xAb, C21038XAr xAr, XAN xan, Boolean bool, String str, String str2) {
        this.A00 = xAb;
        this.A03 = bool;
        this.A04 = str;
        this.A01 = xAr;
        this.A02 = xan;
        this.A05 = str2;
    }
}
