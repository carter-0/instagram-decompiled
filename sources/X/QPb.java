package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.BwPPostClickLandingExperineceType;
import java.util.List;

public final class QPb extends AnonymousClass0T0 implements C13902TjP {
    public final BwPPostClickLandingExperineceType A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;

    public final QPb F14() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof QPb) {
                QPb qPb = (QPb) obj;
                if (!0qQ.A0K(this.A01, qPb.A01) || !0qQ.A0K(this.A05, qPb.A05) || this.A00 != qPb.A00 || !0qQ.A0K(this.A02, qPb.A02) || !0qQ.A0K(this.A03, qPb.A03) || !0qQ.A0K(this.A04, qPb.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String B7k() {
        return this.A01;
    }

    public final List BEH() {
        return this.A05;
    }

    public final BwPPostClickLandingExperineceType Be0() {
        return this.A00;
    }

    public final String Be1() {
        return this.A02;
    }

    public final String Bfb() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTBuyWithPrimeInfo", C9762RgK.A00(this));
    }

    public final String getSecondaryText() {
        return this.A04;
    }

    public final int hashCode() {
        return (((((((((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + C41845B3m.A00(this.A04);
    }

    public QPb(BwPPostClickLandingExperineceType bwPPostClickLandingExperineceType, String str, String str2, String str3, String str4, List list) {
        this.A01 = str;
        this.A05 = list;
        this.A00 = bwPPostClickLandingExperineceType;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
    }
}
