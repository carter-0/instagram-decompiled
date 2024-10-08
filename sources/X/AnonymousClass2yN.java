package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2yN  reason: invalid class name */
public final class AnonymousClass2yN implements C250603lj {
    public final UserSession A00;

    public final void ATF(AnonymousClass30Y r13, C252093oY r14) {
        Integer num;
        int i;
        0qQ.A0B(r13, 0);
        0qQ.A0B(r14, 1);
        1Xj r2 = (1Xj) r13.A03;
        if (r2 != null && r2.CcK() && r14.CEk(r13) == (num = AnonymousClass05K.A00)) {
            int position = ((AnonymousClass3W1) r13.A04).getPosition();
            int i2 = C242573Va.A01;
            if (i2 != -1 && ((position - i2) - 1 == 0 || i == 1)) {
                UserSession userSession = this.A00;
                String A07 = C231122qu.A07(userSession, r2);
                if (A07 == null) {
                    A07 = "";
                }
                String id = r2.getId();
                if (id == null) {
                    id = "";
                }
                String A2v = r2.A2v();
                if (A2v == null) {
                    A2v = "";
                }
                UserSession userSession2 = AnonymousClass4LW.A00(userSession).A00;
                if (182.A06(0Tu.A05, userSession2, 36316860475577018L)) {
                    1Zp A01 = 1Zm.A00(userSession2).A01(AnonymousClass05K.A03, num, false);
                    A01.A03("CURRENT_GAP", String.valueOf(i));
                    A01.A03("current_position", String.valueOf(position));
                    A01.A03("last_sponsored_item_position", String.valueOf(i2));
                    A01.A03("ad_id", A07);
                    A01.A03("media_id", id);
                    A01.A03("tracking_token", A2v);
                    A01.A03("logview_group_by", "CURRENT_GAP");
                    A01.A00();
                }
            }
            C242573Va.A01 = position;
        }
    }

    public AnonymousClass2yN(UserSession userSession) {
        this.A00 = userSession;
    }
}
