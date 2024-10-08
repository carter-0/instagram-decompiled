package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.FrJ  reason: case insensitive filesystem */
public final class C51264FrJ implements Runnable {
    public final /* synthetic */ C50870Fjo A00;

    public C51264FrJ(C50870Fjo fjo) {
        this.A00 = fjo;
    }

    public final void run() {
        Bundle A0a = AnonymousClass7TE.A0a();
        C48975EnD.A00(A0a, EVZ.ARGUMENT_EDIT_PROFILE_FLOW);
        C50870Fjo fjo = this.A00;
        FragmentActivity fragmentActivity = fjo.A00;
        UserSession userSession = fjo.A01;
        C309516Yo A0M = DbS.A0M(fragmentActivity, userSession);
        A0M.A0B(A0a, DbW.A0X().A01(userSession));
        A0M.A04();
    }
}
