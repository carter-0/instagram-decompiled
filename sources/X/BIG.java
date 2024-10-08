package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.HashMap;
import java.util.Map;

public final class BIG extends AnonymousClass0T0 implements DUV {
    public final Boolean A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final HashMap A05;

    public final BIG FDM() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BIG) {
                BIG big = (BIG) obj;
                if (!0qQ.A0K(this.A02, big.A02) || !0qQ.A0K(this.A05, big.A05) || !0qQ.A0K(this.A03, big.A03) || !0qQ.A0K(this.A04, big.A04) || !0qQ.A0K(this.A00, big.A00) || !0qQ.A0K(this.A01, big.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String AgA() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ Map AgL() {
        return this.A05;
    }

    public final String BXf() {
        return this.A04;
    }

    public final Boolean BuN() {
        return this.A00;
    }

    public final Integer Bw4() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTVoterRegistrationStickerTappableData", C44582ChG.A00(this));
    }

    public final String getId() {
        return this.A03;
    }

    public final int hashCode() {
        return (((((((((AnonymousClass7TG.A0E(this.A02) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public BIG(Boolean bool, Integer num, String str, String str2, String str3, HashMap hashMap) {
        this.A02 = str;
        this.A05 = hashMap;
        this.A03 = str2;
        this.A04 = str3;
        this.A00 = bool;
        this.A01 = num;
    }
}
