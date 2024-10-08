package X;

import com.instagram.api.schemas.ACRType;
import com.instagram.api.schemas.SmartReelType;
import com.instagram.model.reels.ReelType;

/* renamed from: X.Jx3  reason: case insensitive filesystem */
public final class C61092Jx3 extends AnonymousClass0T0 implements C46234DRp {
    public final BDn A00;
    public final ACRType A01;
    public final SmartReelType A02;
    public final ReelType A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final DT1 A09;
    public final 1Xj A0A;

    public final C61092Jx3 F0A(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61092Jx3) {
                C61092Jx3 jx3 = (C61092Jx3) obj;
                if (!0qQ.A0K(this.A00, jx3.A00) || this.A01 != jx3.A01 || !0qQ.A0K(this.A04, jx3.A04) || !0qQ.A0K(this.A05, jx3.A05) || !0qQ.A0K(this.A0A, jx3.A0A) || !0qQ.A0K(this.A06, jx3.A06) || !0qQ.A0K(this.A07, jx3.A07) || !0qQ.A0K(this.A08, jx3.A08) || this.A02 != jx3.A02 || this.A03 != jx3.A03 || !0qQ.A0K(this.A09, jx3.A09)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((AnonymousClass7TF.A07(this.A0A, AnonymousClass7TF.A08(this.A05, ((((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31)) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A09);
    }

    public C61092Jx3(BDn bDn, ACRType aCRType, SmartReelType smartReelType, DT1 dt1, 1Xj r5, ReelType reelType, String str, String str2, String str3, String str4, String str5) {
        AnonymousClass7TG.A1R(str2, r5);
        this.A00 = bDn;
        this.A01 = aCRType;
        this.A04 = str;
        this.A05 = str2;
        this.A0A = r5;
        this.A06 = str3;
        this.A07 = str4;
        this.A08 = str5;
        this.A02 = smartReelType;
        this.A03 = reelType;
        this.A09 = dt1;
    }

    public final C46234DRp E70(1E9 r1) {
        return this;
    }
}
