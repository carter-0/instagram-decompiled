package X;

import com.instagram.api.schemas.BonusPromoDialogAudienceType;

/* renamed from: X.DrT  reason: case insensitive filesystem */
public final class C47152DrT extends AnonymousClass0T0 {
    public final BonusPromoDialogAudienceType A00;
    public final String A01;
    public final boolean A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47152DrT) {
                C47152DrT drT = (C47152DrT) obj;
                if (!0qQ.A0K(this.A03, drT.A03) || this.A00 != drT.A00 || !0qQ.A0K(this.A01, drT.A01) || this.A02 != drT.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A02, ((((AnonymousClass7TG.A0E(this.A03) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + C41845B3m.A00(this.A01)) * 31);
    }

    public C47152DrT(BonusPromoDialogAudienceType bonusPromoDialogAudienceType, String str, String str2, boolean z) {
        this.A03 = str;
        this.A00 = bonusPromoDialogAudienceType;
        this.A01 = str2;
        this.A02 = z;
    }
}
