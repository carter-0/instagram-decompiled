package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.4Hv  reason: invalid class name and case insensitive filesystem */
public final class C263124Hv extends AnonymousClass0T0 implements C263134Hw {
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final String A04;
    public final List A05;

    public C263124Hv(Integer num, Integer num2, Integer num3, Integer num4, String str, List list) {
        0qQ.A0B(list, 2);
        this.A00 = num;
        this.A05 = list;
        this.A01 = num2;
        this.A02 = num3;
        this.A03 = num4;
        this.A04 = str;
    }

    public final C263124Hv FEW() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C263124Hv) {
                C263124Hv r5 = (C263124Hv) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A00;
        int i = 0;
        int hashCode = (((num == null ? 0 : num.hashCode()) * 31) + this.A05.hashCode()) * 31;
        Integer num2 = this.A01;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.A02;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.A03;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str = this.A04;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode4 + i;
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
        return new TreeUpdaterJNI("XDTDonationAmountConfig", C41885B5d.A00(this));
    }
}
