package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

/* renamed from: X.BGu  reason: case insensitive filesystem */
public final class C42091BGu extends AnonymousClass0T0 implements DUR {
    public final C42136BIr A00;
    public final User A01;
    public final String A02;
    public final String A03;

    public final C42091BGu FA6(1E9 r1) {
        return this;
    }

    public final C42091BGu FA7(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42091BGu) {
                C42091BGu bGu = (C42091BGu) obj;
                if (!0qQ.A0K(this.A02, bGu.A02) || !0qQ.A0K(this.A01, bGu.A01) || !0qQ.A0K(this.A00, bGu.A00) || !0qQ.A0K(this.A03, bGu.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String AbN() {
        return this.A02;
    }

    public final User Amt() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ C46295DTy AyW() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTStoryFundraiserDonationsResponse", C44397CeH.A00(this));
    }

    public final String getFundraiserId() {
        return this.A03;
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0E(this.A02) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + C41845B3m.A00(this.A03);
    }

    public C42091BGu(C42136BIr bIr, User user, String str, String str2) {
        this.A02 = str;
        this.A01 = user;
        this.A00 = bIr;
        this.A03 = str2;
    }

    public final DUR E8Y(1E9 r1) {
        return this;
    }
}
