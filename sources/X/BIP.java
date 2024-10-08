package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.GuideTypeStr;

public final class BIP extends AnonymousClass0T0 implements C46312DUp {
    public final int A00;
    public final GuideTypeStr A01;
    public final BIR A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public BIP(GuideTypeStr guideTypeStr, BIR bir, String str, String str2, String str3, int i) {
        0qQ.A0B(str2, 2);
        0qQ.A0B(guideTypeStr, 6);
        this.A03 = str;
        this.A04 = str2;
        this.A02 = bir;
        this.A00 = i;
        this.A05 = str3;
        this.A01 = guideTypeStr;
    }

    public final BIP FE6(1E9 r1) {
        return this;
    }

    public final BIP FE7(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BIP) {
                BIP bip = (BIP) obj;
                if (!0qQ.A0K(this.A03, bip.A03) || !0qQ.A0K(this.A04, bip.A04) || !0qQ.A0K(this.A02, bip.A02) || this.A00 != bip.A00 || !0qQ.A0K(this.A05, bip.A05) || this.A01 != bip.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ DTY BTT() {
        return this.A02;
    }

    public final int BWv() {
        return this.A00;
    }

    public final GuideTypeStr CAN() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTMediaGuideMetadata", C44739Ck7.A00(this));
    }

    public final String getDescription() {
        return this.A03;
    }

    public final String getId() {
        return this.A04;
    }

    public final String getTitle() {
        return this.A05;
    }

    public final int hashCode() {
        int A0E = AnonymousClass7TG.A0E(this.A03) * 31;
        return AnonymousClass7TE.A0N(this.A01, (((((AnonymousClass7TF.A08(this.A04, A0E) + AnonymousClass7TG.A0C(this.A02)) * 31) + this.A00) * 31) + C41845B3m.A00(this.A05)) * 31);
    }

    public final C46312DUp E9i(1E9 r1) {
        return this;
    }
}
