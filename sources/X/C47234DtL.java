package X;

import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* renamed from: X.DtL  reason: case insensitive filesystem */
public final class C47234DtL extends AnonymousClass0T0 implements C232262tL {
    public final Reel A00;
    public final User A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47234DtL) {
                C47234DtL dtL = (C47234DtL) obj;
                if (!0qQ.A0K(this.A01, dtL.A01) || !0qQ.A0K(this.A00, dtL.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return 002.A0R(this.A01.getId(), this.A00.getId());
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TE.A0K(this.A01));
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        User user;
        C47234DtL dtL = (C47234DtL) obj;
        String id = this.A01.getId();
        if (dtL == null || (user = dtL.A01) == null) {
            str = null;
        } else {
            str = user.getId();
        }
        if (!0qQ.A0K(id, str) || !0qQ.A0K(this.A00.getId(), dtL.A00.getId())) {
            return false;
        }
        return true;
    }

    public C47234DtL(Reel reel, User user) {
        this.A01 = user;
        this.A00 = reel;
    }
}
