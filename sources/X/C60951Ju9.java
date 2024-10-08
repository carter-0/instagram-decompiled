package X;

import com.instagram.share.facebook.model.FBReelsAudienceType;

/* renamed from: X.Ju9  reason: case insensitive filesystem */
public final class C60951Ju9 extends AnonymousClass0T0 {
    public final C62616Kin A00;
    public final FBReelsAudienceType A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06 = true;

    public C60951Ju9(C62616Kin kin, FBReelsAudienceType fBReelsAudienceType, String str, String str2, String str3, String str4) {
        AnonymousClass7TG.A1R(str2, str3);
        this.A02 = str;
        this.A01 = fBReelsAudienceType;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A00 = kin;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60951Ju9) {
                C60951Ju9 ju9 = (C60951Ju9) obj;
                if (!0qQ.A0K(this.A02, ju9.A02) || this.A01 != ju9.A01 || this.A06 != ju9.A06 || !0qQ.A0K(this.A03, ju9.A03) || !0qQ.A0K(this.A04, ju9.A04) || !0qQ.A0K(this.A05, ju9.A05) || this.A00 != ju9.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0O(this.A02))))) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }
}
