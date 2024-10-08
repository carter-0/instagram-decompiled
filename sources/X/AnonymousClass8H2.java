package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.8H2  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8H2 implements AnonymousClass2gO {
    public final /* synthetic */ AnonymousClass80R A00;

    public /* synthetic */ AnonymousClass8H2(AnonymousClass80R r1) {
        this.A00 = r1;
    }

    public final void onChanged(Object obj) {
        AnonymousClass80R r5 = this.A00;
        AnonymousClass84D r11 = (AnonymousClass84D) obj;
        C357638Yz r4 = r5.A0W;
        C3494680m r3 = r4.A08;
        if ((r3.A00 instanceof AnonymousClass80O) && (r11 instanceof AnonymousClass8YD)) {
            AnonymousClass8YD r6 = (AnonymousClass8YD) r11;
            String str = r6.A02;
            if (0qQ.A0K(str, "324984895725671") || 0qQ.A0K(str, "389287015265096")) {
                UserSession userSession = r5.A0R;
                0qQ.A0B(userSession, 0);
                182.A06(0Tu.A05, userSession, 36327627958598215L);
            }
            C352888Fl r1 = r5.A0l;
            if (r1.A0N() != null && r1.A0N().intValue() == 0 && C378629Qo.A00(r5.A0R, str)) {
                r1.A0Z((Runnable) null, (Runnable) null);
            }
            if (!str.equals("389287015265096")) {
                C358088aL r12 = C358088aL.A0K;
                if (r4.A0V(r12)) {
                    r4.A0M(r12);
                    C3504884v r0 = r5.A1L;
                    r0.getClass();
                    r0.A03();
                }
            } else {
                C358088aL r2 = C358088aL.A0K;
                if (!r4.A0S((C279284yO) r3.A00, r2) && r4.A0U(r2) && AnonymousClass84B.GREEN_SCREEN_TOOL != r6.A01) {
                    r4.A0K(r2);
                    C3504884v r02 = r5.A1L;
                    r02.getClass();
                    r02.A0Z.Epw(true);
                }
            }
        }
        if ((r3.A00 instanceof AnonymousClass80O) && (r11 instanceof AnonymousClass84C)) {
            C358088aL r13 = C358088aL.A0K;
            if (r4.A0V(r13)) {
                r4.A0M(r13);
                C3504884v r03 = r5.A1L;
                r03.getClass();
                r03.A03();
            }
        }
    }
}
