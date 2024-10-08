package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.65F  reason: invalid class name */
public final class AnonymousClass65F {
    public final UserSession A00;
    public final 0xa A01;
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A00(0eO.A02, new AnonymousClass9L0(this, 32));

    public static final void A00(AnonymousClass65F r3, Boolean bool, boolean z, boolean z2, boolean z3, boolean z4) {
        AnonymousClass65G r1 = (AnonymousClass65G) r3.A02.getValue();
        if (!r1.A00) {
            r1.A00 = true;
            02m r32 = r1.A01;
            r32.markerAnnotate(724764879, "MC_VALUE", AnonymousClass65G.A00(Boolean.valueOf(z)));
            r32.markerAnnotate(724764879, "STORED_VALUE", AnonymousClass65G.A00(bool));
            r32.markerAnnotate(724764879, "LOGIN_BIT", AnonymousClass65G.A00(Boolean.valueOf(z2)));
            r32.markerAnnotate(724764879, "KILLSWITCH_VALUE", AnonymousClass65G.A00(Boolean.valueOf(z3)));
            r32.markerAnnotate(724764879, "RESULT", AnonymousClass65G.A00(Boolean.valueOf(z4)));
            r32.markerEnd(724764879, 2);
        }
    }

    public AnonymousClass65F(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = 1Al.A01(userSession).A04(1An.A3V, getClass());
    }
}
