package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.DtX  reason: case insensitive filesystem */
public final class C47246DtX extends AnonymousClass0T0 implements C232262tL {
    public final C2609047m A00;
    public final ImageUrl A01;
    public final ImageUrl A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public C47246DtX(C2609047m r2, ImageUrl imageUrl, ImageUrl imageUrl2, Integer num, Integer num2, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        DbW.A1O(str, 3, str3);
        this.A01 = imageUrl;
        this.A02 = imageUrl2;
        this.A06 = str;
        this.A07 = str2;
        this.A0B = z;
        this.A08 = str3;
        this.A09 = z2;
        this.A05 = str4;
        this.A04 = num;
        this.A0A = z3;
        this.A03 = num2;
        this.A00 = r2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47246DtX) {
                C47246DtX dtX = (C47246DtX) obj;
                if (!0qQ.A0K(this.A01, dtX.A01) || !0qQ.A0K(this.A02, dtX.A02) || !0qQ.A0K(this.A06, dtX.A06) || !0qQ.A0K(this.A07, dtX.A07) || this.A0B != dtX.A0B || !0qQ.A0K(this.A08, dtX.A08) || this.A09 != dtX.A09 || !0qQ.A0K(this.A05, dtX.A05) || !0qQ.A0K(this.A04, dtX.A04) || this.A0A != dtX.A0A || !0qQ.A0K(this.A03, dtX.A03) || !0qQ.A0K(this.A00, dtX.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return Integer.valueOf(this.A08.hashCode());
    }

    public final int hashCode() {
        String str = this.A06;
        int A082 = AnonymousClass7TF.A08(this.A08, AnonymousClass7TF.A09(this.A0B, (AnonymousClass7TF.A08(str, ((AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31));
        return ((AnonymousClass7TF.A09(this.A0A, (((AnonymousClass7TF.A09(this.A09, A082) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
