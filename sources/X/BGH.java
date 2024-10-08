package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class BGH extends AnonymousClass0T0 implements DUA {
    public final Boolean A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public final BGH F8k() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BGH) {
                BGH bgh = (BGH) obj;
                if (!0qQ.A0K(this.A04, bgh.A04) || !0qQ.A0K(this.A01, bgh.A01) || !0qQ.A0K(this.A02, bgh.A02) || !0qQ.A0K(this.A00, bgh.A00) || !0qQ.A0K(this.A03, bgh.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final List Arm() {
        return this.A04;
    }

    public final String Bjz() {
        return this.A01;
    }

    public final String BrW() {
        return this.A02;
    }

    public final Boolean Bu2() {
        return this.A00;
    }

    public final String CAh() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTRightsManagerFlagInfoDict", C44322Cd4.A00(this));
    }

    public final int hashCode() {
        return (((((((AnonymousClass7TG.A0C(this.A04) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + C41845B3m.A00(this.A03);
    }

    public BGH(Boolean bool, String str, String str2, String str3, List list) {
        this.A04 = list;
        this.A01 = str;
        this.A02 = str2;
        this.A00 = bool;
        this.A03 = str3;
    }
}
