package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

public final class BHC extends AnonymousClass0T0 implements DUC {
    public final User A00;
    public final Integer A01;
    public final Integer A02;

    public final BHC FB1(1E9 r1) {
        return this;
    }

    public final BHC FB2(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BHC) {
                BHC bhc = (BHC) obj;
                if (!0qQ.A0K(this.A01, bhc.A01) || !0qQ.A0K(this.A02, bhc.A02) || !0qQ.A0K(this.A00, bhc.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Integer Abv() {
        return this.A01;
    }

    public final Integer CA7() {
        return this.A02;
    }

    public final User CCd() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTStoryQuizParticipantDict", C44429Cen.A00(this));
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public BHC(User user, Integer num, Integer num2) {
        this.A01 = num;
        this.A02 = num2;
        this.A00 = user;
    }

    public final DUC E8x(1E9 r1) {
        return this;
    }
}
