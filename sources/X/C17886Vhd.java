package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Vhd  reason: case insensitive filesystem */
public final class C17886Vhd {
    public Integer A00 = AnonymousClass05K.A0C;
    public final UserSession A01;
    public final C15345Uav A02;
    public final Context A03;
    public final AnonymousClass07i A04;

    public C17886Vhd(Context context, AnonymousClass07i r3, UserSession userSession, C15345Uav uav) {
        0qQ.A0B(userSession, 2);
        this.A03 = context;
        this.A01 = userSession;
        this.A04 = r3;
        this.A02 = uav;
    }

    public final void A00(String str) {
        0qQ.A0B(str, 0);
        1NY A0b = AnonymousClass7TG.A0b(this.A01);
        A0b.A0K(AnonymousClass000.A00(2908), new Object[]{str});
        1OC A0S = DbU.A0S(A0b, 1XO.class, 1XW.class);
        C15622Ufo.A00(A0S, this, 5);
        1ES.A00(this.A03, this.A04, A0S);
    }
}
