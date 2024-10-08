package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

public final class L9Q {
    public C262204Co A00;
    public final View A01;
    public final Fragment A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;

    public L9Q(View view, Fragment fragment, UserSession userSession, C313666go r11) {
        0qQ.A0B(userSession, 3);
        this.A02 = fragment;
        this.A01 = view;
        C20704Wxb wxb = new C20704Wxb(41, this, r11, userSession);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new MMN(new MMN(fragment, 26), 27));
        this.A04 = DbS.A0I(new MMN(A002, 28), wxb, C66304MMn.A01(A002, (Object) null, 5), DbS.A0z(C60181Jh0.class));
        AnonymousClass0eM A003 = AnonymousClass1YB.A00(C66304MMn.A01(this, r11, 4));
        this.A03 = A003;
        LYT.A00(AnonymousClass7TE.A0c(A003), 11, this);
        this.A00 = JTS.A0t(fragment, new C66186MGx(this, (AnonymousClass4D7) null, 47), ((C60181Jh0) this.A04.getValue()).A03);
    }
}
