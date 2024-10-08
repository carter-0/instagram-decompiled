package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.57E  reason: invalid class name */
public final class AnonymousClass57E {
    public final AnonymousClass2lC A00;
    public final C228152ks A01;
    public final C310696bT A02;
    public final C233612w1 A03;
    public final C16080Uo7 A04;

    public AnonymousClass57E(UserSession userSession, AnonymousClass2lC r5, C228152ks r6) {
        C310696bT r1;
        C233612w1 r0;
        this.A00 = r5;
        this.A01 = r6;
        0Tu r2 = 0Tu.A05;
        if (!182.A06(r2, userSession, 36320897744774074L) || !182.A06(r2, userSession, 36320897744905148L)) {
            r1 = new C310686bS();
        } else {
            r1 = new C19440WZo();
        }
        C310696bT r12 = r1;
        this.A02 = r12;
        boolean isEnabled = r12.isEnabled();
        if (isEnabled) {
            r0 = new C19658WdM(userSession, r12);
        } else {
            r0 = new AnonymousClass2w0();
        }
        this.A03 = r0;
        C16080Uo7 uo7 = new C16080Uo7(this);
        this.A04 = uo7;
        if (isEnabled) {
            r5.A8h(r0);
            r6.EBt(uo7);
        }
    }
}
