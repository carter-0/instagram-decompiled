package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.BEv  reason: case insensitive filesystem */
public final class C42043BEv extends AnonymousClass0T0 implements AnonymousClass605 {
    public final User A00;
    public final Integer A01;
    public final List A02;

    public C42043BEv(User user, Integer num, List list) {
        0qQ.A0B(user, 2);
        this.A02 = list;
        this.A00 = user;
        this.A01 = num;
    }

    public final C42043BEv F3V(1E9 r1) {
        return this;
    }

    public final C42043BEv F3W(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42043BEv) {
                C42043BEv bEv = (C42043BEv) obj;
                if (!0qQ.A0K(this.A02, bEv.A02) || !0qQ.A0K(this.A00, bEv.A00) || !0qQ.A0K(this.A01, bEv.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final List B4z() {
        return this.A02;
    }

    public final User B9t() {
        return this.A00;
    }

    public final Integer BXK() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTGroupNoteResponseInfo", CYE.A00(this));
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A00, AnonymousClass7TG.A0C(this.A02) * 31) + AnonymousClass7TE.A0L(this.A01);
    }
}
