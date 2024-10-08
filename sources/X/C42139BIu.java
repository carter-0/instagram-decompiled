package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

/* renamed from: X.BIu  reason: case insensitive filesystem */
public final class C42139BIu extends AnonymousClass0T0 implements C46296DTz {
    public final User A00;
    public final Float A01;
    public final Integer A02;

    public final C42139BIu FGU(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42139BIu) {
                C42139BIu bIu = (C42139BIu) obj;
                if (!0qQ.A0K(this.A02, bIu.A02) || !0qQ.A0K(this.A00, bIu.A00) || !0qQ.A0K(this.A01, bIu.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Integer CA7() {
        return this.A02;
    }

    public final User CCd() {
        return this.A00;
    }

    public final Float CFx() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTStorySliderVoterObject", C45004Coh.A00(this));
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0C(this.A02) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public C42139BIu(User user, Float f, Integer num) {
        this.A02 = num;
        this.A00 = user;
        this.A01 = f;
    }

    public final C46296DTz EAS(1E9 r1) {
        return this;
    }
}
