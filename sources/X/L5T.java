package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

public final class L5T {
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01;

    public L5T(View view, Fragment fragment, UserSession userSession) {
        boolean A1Y = DbW.A1Y(userSession);
        C66293MMc mMc = new C66293MMc(userSession, 26);
        AnonymousClass0eM A012 = C66293MMc.A01(new C66293MMc(fragment, 22), 0eO.A02, 23);
        this.A01 = DbS.A0I(new C66293MMc(A012, 24), mMc, C66304MMn.A01(A012, (Object) null, 27), DbS.A0z(C60116Jfx.class));
        this.A00 = C66293MMc.A00(view, 25);
        DbV.A1F(fragment.getViewLifecycleOwner(), ((C60116Jfx) this.A01.getValue()).A00, new MPC(this, A1Y ? 1 : 0), 63);
    }
}
