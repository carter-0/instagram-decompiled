package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;

public final class Fd2 implements MVB {
    public final /* synthetic */ C226062fZ A00;

    public final void onDismiss() {
    }

    public final void onShow() {
    }

    public final /* synthetic */ void onTextClick(View view) {
    }

    public Fd2(C226062fZ r1) {
        this.A00 = r1;
    }

    public final void onButtonClick(View view) {
        C226062fZ r5 = this.A00;
        UserSession userSession = r5.A07;
        userSession.getClass();
        if (!AnonymousClass3EM.A03()) {
            String str = userSession.A05;
            Bundle A0B = DbV.A0B(str, 0);
            DbS.A1A(A0B, str);
            DbS.A1B(A0B, "login_snack_bar");
            A0B.putBoolean(C273654mx.A00(93), FFT.A02(userSession));
            A0B.putBoolean(AnonymousClass000.A00(627), false);
            A0B.putBoolean(AnonymousClass000.A00(628), false);
            C331157Pu A0T = DbW.A0T(userSession);
            Context context = r5.A02;
            E6S e6s = new E6S();
            e6s.setArguments(A0B);
            A0T.A03(context, e6s);
        } else if (!C46399DeM.A06()) {
            C46399DeM.A03(r5.A02, C46398DeL.A0B, userSession, AnonymousClass05K.A00);
        }
    }
}
