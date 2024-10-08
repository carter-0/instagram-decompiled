package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fco  reason: case insensitive filesystem */
public final class C50502Fco implements C66491MTu {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ 2Ay A01;
    public final /* synthetic */ 2Aq A02;

    public C50502Fco(FragmentActivity fragmentActivity, 2Ay r2, 2Aq r3) {
        this.A02 = r3;
        this.A00 = fragmentActivity;
        this.A01 = r2;
    }

    public final void D1x(Context context) {
        2Aq r1 = this.A02;
        2Aq.A0A(this.A00, r1);
        r1.A0R();
        UserSession userSession = r1.A05;
        DbT.A1T(userSession, AnonymousClass05K.A03, this.A01.A00, Dba.A02(r1, userSession));
    }

    public final void onDismiss() {
        2Aq r1 = this.A02;
        r1.A0R();
        UserSession userSession = r1.A05;
        DbT.A1T(userSession, AnonymousClass05K.A1I, this.A01.A00, Dba.A02(r1, userSession));
    }
}
