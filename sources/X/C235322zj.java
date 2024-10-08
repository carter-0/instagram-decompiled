package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.mediatype.ProductType;
import com.instagram.user.model.User;

/* renamed from: X.2zj  reason: invalid class name and case insensitive filesystem */
public final class C235322zj implements C250603lj {
    public final 0uX A00;
    public final UserSession A01;

    public final void ATF(AnonymousClass30Y r6, C252093oY r7) {
        0qQ.A0B(r6, 0);
        0qQ.A0B(r7, 1);
        int intValue = r7.CEk(r6).intValue();
        if (intValue == 0) {
            A01(r6, r7);
            C71342cb.A00(this.A01).A0E = ((1Xj) r6.A03).A2n();
        } else if (intValue != 1) {
            0tj A002 = A00(r6);
            A002.A03 = Integer.valueOf(((AnonymousClass3W1) r6.A04).getPosition());
            AnonymousClass0tt r2 = A002.A02;
            if (r2.A03(r2.A04.now())) {
                A002.A07 = true;
            }
            this.A00.A05(A002);
        } else {
            if (!182.A06(0Tu.A05, this.A01, 36312127421547436L) || ((AnonymousClass3W1) r6.A04).A02() > 0) {
                A01(r6, r7);
            }
        }
    }

    private final 0tj A00(AnonymousClass30Y r6) {
        String str;
        0uX r1 = this.A00;
        1Xj r4 = (1Xj) r6.A03;
        0tj A012 = r1.A01(r4.getId());
        if (A012 != null) {
            return A012;
        }
        String id = r4.getId();
        if (id != null) {
            User A2A = r4.A2A(this.A01);
            String str2 = null;
            if (A2A != null) {
                str = A2A.getId();
            } else {
                str = null;
            }
            ProductType A1v = r4.A1v();
            if (A1v != null) {
                str2 = A1v.A00;
            }
            return new 0tj(id, str, str2);
        }
        throw new IllegalStateException("Required value was null.");
    }

    public C235322zj(UserSession userSession, 0uX r2) {
        this.A00 = r2;
        this.A01 = userSession;
    }

    private final void A01(AnonymousClass30Y r3, C252093oY r4) {
        0tj A002 = A00(r3);
        A002.A00(r4.CFe(r3));
        A002.A03 = Integer.valueOf(((AnonymousClass3W1) r3.A04).getPosition());
        this.A00.A05(A002);
    }
}
