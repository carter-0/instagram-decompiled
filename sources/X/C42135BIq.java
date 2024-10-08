package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

/* renamed from: X.BIq  reason: case insensitive filesystem */
public final class C42135BIq extends AnonymousClass0T0 implements C46294DTx {
    public final User A00;
    public final Long A01;
    public final String A02;

    public final C42135BIq FGF(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42135BIq) {
                C42135BIq bIq = (C42135BIq) obj;
                if (!0qQ.A0K(this.A02, bIq.A02) || !0qQ.A0K(this.A01, bIq.A01) || !0qQ.A0K(this.A00, bIq.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Long C7Y() {
        return this.A01;
    }

    public final User CCd() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTStoryFundraiserDonation", C44974CoD.A00(this));
    }

    public final String getAmount() {
        return this.A02;
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0E(this.A02) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public C42135BIq(User user, Long l, String str) {
        this.A02 = str;
        this.A01 = l;
        this.A00 = user;
    }

    public final C46294DTx EAJ(1E9 r1) {
        return this;
    }
}
