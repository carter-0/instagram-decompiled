package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.InterestPivotRedirect;
import com.instagram.api.schemas.InterestPivotStyle;

/* renamed from: X.Dsr  reason: case insensitive filesystem */
public final class C47204Dsr extends AnonymousClass0T0 implements C51956G8z {
    public final InterestPivotRedirect A00;
    public final InterestPivotStyle A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public final C47204Dsr F5G() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47204Dsr) {
                C47204Dsr dsr = (C47204Dsr) obj;
                if (!0qQ.A0K(this.A02, dsr.A02) || this.A00 != dsr.A00 || !0qQ.A0K(this.A03, dsr.A03) || this.A01 != dsr.A01 || !0qQ.A0K(this.A04, dsr.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String BE9() {
        return this.A02;
    }

    public final InterestPivotRedirect BkS() {
        return this.A00;
    }

    public final String Bpv() {
        return this.A03;
    }

    public final InterestPivotStyle C22() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTInterestPivotDict", C48337Ecu.A00(this));
    }

    public final String getText() {
        return this.A04;
    }

    public final int hashCode() {
        return (((((((AnonymousClass7TG.A0E(this.A02) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + C41845B3m.A00(this.A04);
    }

    public C47204Dsr(InterestPivotRedirect interestPivotRedirect, InterestPivotStyle interestPivotStyle, String str, String str2, String str3) {
        this.A02 = str;
        this.A00 = interestPivotRedirect;
        this.A03 = str2;
        this.A01 = interestPivotStyle;
        this.A04 = str3;
    }
}
