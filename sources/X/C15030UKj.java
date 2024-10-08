package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.UKj  reason: case insensitive filesystem */
public final class C15030UKj extends AnonymousClass0T0 {
    public final int A00;
    public final C273014lo A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final C62320sa A05;
    public final boolean A06;
    public final boolean A07;
    public final Integer A08;

    public C15030UKj(C273014lo r2, Integer num, String str, String str2, String str3, C62320sa r7, int i, boolean z, boolean z2) {
        0qQ.A0B(str, 1);
        this.A03 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A01 = r2;
        this.A07 = z;
        this.A06 = z2;
        this.A00 = i;
        this.A08 = num;
        this.A05 = r7;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15030UKj) {
                C15030UKj uKj = (C15030UKj) obj;
                if (!(0qQ.A0K(this.A03, uKj.A03) && 0qQ.A0K(this.A04, uKj.A04) && 0qQ.A0K(this.A02, uKj.A02) && this.A01 == uKj.A01 && this.A07 == uKj.A07 && this.A06 == uKj.A06 && this.A00 == uKj.A00 && this.A08 == uKj.A08 && 0qQ.A0K(this.A05, uKj.A05))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A09 = (AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A08(this.A04, AnonymousClass7TE.A0O(this.A03)))))) + this.A00) * 31;
        int intValue = this.A08.intValue();
        switch (intValue) {
            case 1:
                str = "ONE_CLICK_CHECKOUT";
                break;
            case 2:
                str = "ADD_TO_CART";
                break;
            case 3:
                str = "VIEW_IN_CART";
                break;
            case 4:
                str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
            default:
                str = "EXTERNAL_LINK";
                break;
        }
        return AnonymousClass7TE.A0N(this.A05, C51971G9r.A0F(str, intValue, A09));
    }
}
