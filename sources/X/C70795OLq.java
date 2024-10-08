package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.OLq  reason: case insensitive filesystem */
public final class C70795OLq {
    public LRm A00 = new LRm(new C65288Lqh(this, 3));
    public String A01;
    public String A02 = "";
    public boolean A03;
    public final UserSession A04;
    public final C71865Os7 A05;
    public final OA0 A06;
    public final Integer A07;
    public final AnonymousClass0eM A08;

    public final void A00() {
        Y44 y44 = this.A05.A00;
        for (AnonymousClass0Ai Cgf : y44.values()) {
            Cgf.Cgf();
        }
        y44.clear();
    }

    public C70795OLq(UserSession userSession, 2el r4, C71865Os7 os7, OA0 oa0, Integer num) {
        this.A04 = userSession;
        this.A06 = oa0;
        this.A05 = os7;
        this.A07 = num;
        this.A08 = AnonymousClass1YB.A00(new C73667Phg(17, r4, this));
    }
}
