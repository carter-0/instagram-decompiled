package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GWq  reason: case insensitive filesystem */
public final class C52539GWq implements C229222n2 {
    public final UserSession A00;
    public final boolean A01;

    public final String BK2(AnonymousClass30Y r4) {
        int i;
        0qQ.A0B(r4, 0);
        C296935qt r2 = (C296935qt) r4.A03;
        if (!this.A01 || !(r2 instanceof C52435GSn)) {
            return r2.getKey();
        }
        C52435GSn gSn = (C52435GSn) r2;
        String A0F = C231122qu.A0F(this.A00, gSn.BPf());
        if (A0F != null) {
            i = A0F.hashCode();
        } else {
            i = 0;
        }
        return 002.A0R(Integer.toHexString(i), gSn.getKey());
    }

    public C52539GWq(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = 182.A06(0Tu.A06, userSession, 36315902697934498L);
    }
}
