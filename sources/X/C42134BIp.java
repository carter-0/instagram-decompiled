package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

/* renamed from: X.BIp  reason: case insensitive filesystem */
public final class C42134BIp extends AnonymousClass0T0 implements C46293DTw {
    public final User A00;
    public final String A01;

    public final C42134BIp FGD(1E9 r1) {
        return this;
    }

    public final C42134BIp FGE(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42134BIp) {
                C42134BIp bIp = (C42134BIp) obj;
                if (!0qQ.A0K(this.A00, bIp.A00) || !0qQ.A0K(this.A01, bIp.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final User Amy() {
        return this.A00;
    }

    public final String Bhv() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTDonationsPromptInfoDict", C44972CoB.A00(this));
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public C42134BIp(User user, String str) {
        AnonymousClass7TG.A1O(user, str);
        this.A00 = user;
        this.A01 = str;
    }

    public final C46293DTw EAI(1E9 r1) {
        return this;
    }
}
