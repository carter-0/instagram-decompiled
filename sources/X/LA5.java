package X;

import android.view.View;
import com.instagram.common.session.UserSession;

public final class LA5 {
    public final View A00;
    public final UserSession A01;
    public final C313666go A02;
    public final AnonymousClass0eM A03 = MMN.A00(this, 35);
    public final AnonymousClass0eM A04;
    public final AnonymousClass4DH A05;

    public LA5(View view, AnonymousClass4DH r7, UserSession userSession, C313666go r9) {
        0qQ.A0B(userSession, 2);
        this.A05 = r7;
        this.A01 = userSession;
        this.A00 = view;
        this.A02 = r9;
        MMN mmn = new MMN(this, 39);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new MMN(new MMN(r7, 36), 37));
        this.A04 = DbS.A0I(new MMN(A002, 38), mmn, C66304MMn.A01(A002, (Object) null, 7), DbS.A0z(C60126Jg7.class));
        07U r4 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = r7.getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new C59845JaL(viewLifecycleOwner, r4, this, (AnonymousClass4D7) null, 40), AnonymousClass07a.A00(viewLifecycleOwner));
    }
}
