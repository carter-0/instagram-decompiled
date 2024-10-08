package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.mediatype.ProductType;
import com.instagram.user.model.User;

/* renamed from: X.2zk  reason: invalid class name and case insensitive filesystem */
public final class C235332zk implements C250603lj {
    public final 0uX A00;
    public final UserSession A01;

    public final void ATF(AnonymousClass30Y r6, C252093oY r7) {
        0tj A002;
        0qQ.A0B(r6, 0);
        0qQ.A0B(r7, 1);
        int intValue = r7.CEk(r6).intValue();
        if (intValue == 0 || intValue == 1) {
            A002 = A00(r6);
            if (A002 != null) {
                A002.A00(r7.CFe(r6));
            } else {
                return;
            }
        } else {
            A002 = A00(r6);
            if (A002 != null) {
                AnonymousClass0tt r2 = A002.A02;
                if (r2.A03(r2.A04.now())) {
                    A002.A07 = true;
                }
            } else {
                return;
            }
        }
        this.A00.A05(A002);
    }

    private final 0tj A00(AnonymousClass30Y r6) {
        String A2s;
        String str;
        1Xj A1c = ((1Xj) r6.A03).A1c(((AnonymousClass4HA) r6.A04).A00);
        String str2 = null;
        if (A1c == null || (A2s = A1c.A2s()) == null) {
            return null;
        }
        0tj A012 = this.A00.A01(A1c.A2s());
        if (A012 != null) {
            return A012;
        }
        User A2A = A1c.A2A(this.A01);
        if (A2A != null) {
            str = A2A.getId();
        } else {
            str = null;
        }
        ProductType A1v = A1c.A1v();
        if (A1v != null) {
            str2 = A1v.A00;
        }
        return new 0tj(A2s, str, str2);
    }

    public C235332zk(UserSession userSession, 0uX r2) {
        this.A00 = r2;
        this.A01 = userSession;
    }
}
