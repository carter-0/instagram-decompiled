package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.BEr  reason: case insensitive filesystem */
public final class C42039BEr extends AnonymousClass0T0 implements DUL {
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final String A04;
    public final List A05;

    public final C42039BEr F3H() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42039BEr) {
                C42039BEr bEr = (C42039BEr) obj;
                if (!0qQ.A0K(this.A00, bEr.A00) || !0qQ.A0K(this.A05, bEr.A05) || !0qQ.A0K(this.A01, bEr.A01) || !0qQ.A0K(this.A02, bEr.A02) || !0qQ.A0K(this.A03, bEr.A03) || !0qQ.A0K(this.A04, bEr.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Integer Avz() {
        return this.A00;
    }

    public final List AyT() {
        return this.A05;
    }

    public final Integer BPX() {
        return this.A01;
    }

    public final Integer BTO() {
        return this.A02;
    }

    public final Integer Bem() {
        return this.A03;
    }

    public final String CCj() {
        return this.A04;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTFundRaiserDonationAmountConfig", C44154CXt.A00(this));
    }

    public final int hashCode() {
        return (((((((((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + C41845B3m.A00(this.A04);
    }

    public C42039BEr(Integer num, Integer num2, Integer num3, Integer num4, String str, List list) {
        this.A00 = num;
        this.A05 = list;
        this.A01 = num2;
        this.A02 = num3;
        this.A03 = num4;
        this.A04 = str;
    }
}
