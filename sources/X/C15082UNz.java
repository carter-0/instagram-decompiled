package X;

import com.instagram.user.model.Product;
import java.util.List;

/* renamed from: X.UNz  reason: case insensitive filesystem */
public final class C15082UNz extends AnonymousClass0T0 implements C232262tL {
    public C15080UNx A00;
    public final 1Xj A01;
    public final Uw7 A02;
    public final C16605Uxz A03;
    public final Product A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;
    public final boolean A0A;
    public final Integer A0B;

    public C15082UNz(1Xj r2, Uw7 uw7, C16605Uxz uxz, C15080UNx uNx, Product product, Integer num, Integer num2, String str, String str2, String str3, List list, boolean z) {
        0qQ.A0B(uxz, 6);
        this.A07 = str;
        this.A09 = list;
        this.A0A = z;
        this.A04 = product;
        this.A06 = str2;
        this.A03 = uxz;
        this.A01 = r2;
        this.A02 = uw7;
        this.A05 = num;
        this.A08 = str3;
        this.A0B = num2;
        this.A00 = uNx;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15082UNz) {
                C15082UNz uNz = (C15082UNz) obj;
                if (!0qQ.A0K(this.A07, uNz.A07) || !0qQ.A0K(this.A09, uNz.A09) || this.A0A != uNz.A0A || !0qQ.A0K(this.A04, uNz.A04) || !0qQ.A0K(this.A06, uNz.A06) || this.A03 != uNz.A03 || !0qQ.A0K(this.A01, uNz.A01) || this.A02 != uNz.A02 || !0qQ.A0K(this.A05, uNz.A05) || !0qQ.A0K(this.A08, uNz.A08) || this.A0B != uNz.A0B || !0qQ.A0K(this.A00, uNz.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A07;
    }

    public final int hashCode() {
        int A092 = AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A07(this.A09, AnonymousClass7TE.A0O(this.A07)));
        C16605Uxz uxz = this.A03;
        Uw7 uw7 = this.A02;
        int A082 = AnonymousClass7TF.A08(this.A08, (AnonymousClass7TF.A07(uw7, (AnonymousClass7TF.A07(uxz, (AnonymousClass7TF.A07(this.A04, A092) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31);
        Integer num = this.A0B;
        return AnonymousClass7TG.A0B(num, VHG.A00(num), A082) + AnonymousClass7TE.A0L(this.A00);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
