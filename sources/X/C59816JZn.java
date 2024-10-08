package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.JZn  reason: case insensitive filesystem */
public final class C59816JZn extends C252733pa implements AnonymousClass0lh {
    public boolean A00;
    public final 1E6 A01;
    public final UserSession A02;
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(new C66217MIy(this, 47));
    public final 05G A04;
    public final AnonymousClass0Ud A05;

    public final void A00(C262224Cq r6) {
        if (!AnonymousClass7TF.A1Z(this.A03)) {
            05G r4 = this.A04;
            do {
            } while (!r4.AIY(r4.getValue(), new C59678JTj(0sn.A00, 1)));
            return;
        }
        C51971G9r.A1P(this, r6, 45);
    }

    public final void onSessionWillEnd() {
        05G r2 = this.A04;
        do {
        } while (!r2.AIY(r2.getValue(), C59702JUj.A00));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59816JZn(1E6 r3, UserSession userSession) {
        super("ActivityFeed", AnonymousClass43D.A00(79542307));
        AnonymousClass7TG.A1O(userSession, r3);
        this.A02 = userSession;
        this.A01 = r3;
        02z A012 = 106.A01(C59702JUj.A00);
        this.A04 = A012;
        this.A05 = 10b.A03(A012);
    }
}
