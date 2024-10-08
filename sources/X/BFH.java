package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class BFH extends AnonymousClass0T0 implements C46297DUa {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;

    public final BFH F5J() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BFH) {
                BFH bfh = (BFH) obj;
                if (!0qQ.A0K(this.A00, bfh.A00) || !0qQ.A0K(this.A01, bfh.A01) || !0qQ.A0K(this.A02, bfh.A02) || !0qQ.A0K(this.A03, bfh.A03) || !0qQ.A0K(this.A04, bfh.A04) || !0qQ.A0K(this.A05, bfh.A05) || !0qQ.A0K(this.A06, bfh.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String B0s() {
        return this.A01;
    }

    public final String BZ0() {
        return this.A03;
    }

    public final String Bzi() {
        return this.A04;
    }

    public final List C9X() {
        return this.A06;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTKaraokeStickerTappableData", C44198CZl.A00(this));
    }

    public final String getBackgroundColor() {
        return this.A00;
    }

    public final String getId() {
        return this.A02;
    }

    public final String getTextColor() {
        return this.A05;
    }

    public final int hashCode() {
        return (((((((((((AnonymousClass7TG.A0E(this.A00) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TE.A0L(this.A06);
    }

    public BFH(String str, String str2, String str3, String str4, String str5, String str6, List list) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
        this.A05 = str6;
        this.A06 = list;
    }
}
