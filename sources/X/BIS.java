package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class BIS extends AnonymousClass0T0 implements C46314DUr {
    public final int A00;
    public final int A01;
    public final int A02;
    public final BFT A03;
    public final Long A04;
    public final List A05;
    public final List A06;

    public BIS(BFT bft, Long l, List list, List list2, int i, int i2, int i3) {
        0qQ.A0B(list2, 5);
        this.A00 = i;
        this.A05 = list;
        this.A04 = l;
        this.A01 = i2;
        this.A06 = list2;
        this.A03 = bft;
        this.A02 = i3;
    }

    public final BIS FED(1E9 r1) {
        return this;
    }

    public final BIS FEE(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BIS) {
                BIS bis = (BIS) obj;
                if (this.A00 != bis.A00 || !0qQ.A0K(this.A05, bis.A05) || !0qQ.A0K(this.A04, bis.A04) || this.A01 != bis.A01 || !0qQ.A0K(this.A06, bis.A06) || !0qQ.A0K(this.A03, bis.A03) || this.A02 != bis.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int AdF() {
        return this.A00;
    }

    public final List AqJ() {
        return this.A05;
    }

    public final Long B2n() {
        return this.A04;
    }

    public final int BPs() {
        return this.A01;
    }

    public final List Bf5() {
        return this.A06;
    }

    public final /* bridge */ /* synthetic */ DUO Bhn() {
        return this.A03;
    }

    public final int C1Y() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTPotatoContainerMediaInfo", C44747CkG.A00(this));
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A07(this.A06, ((((((this.A00 * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + this.A01) * 31) + AnonymousClass7TE.A0L(this.A03)) * 31) + this.A02;
    }

    public final C46314DUr E9m(1E9 r1) {
        return this;
    }
}
