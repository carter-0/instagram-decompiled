package X;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;

public final class EEL extends C252233om implements CallerContextable {
    public static final String __redex_internal_original_name = "FacebookConnectHelper";
    public final Fragment A00;
    public final UserSession A01;
    public final C49776F6j A02;
    public final EE3 A03;
    public final C230762qD A04;
    public final C50959Flm A05 = new C50959Flm(this);

    public EEL(Fragment fragment, AnonymousClass4DJ r3, UserSession userSession, C49776F6j f6j, C230762qD r6) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = fragment;
        this.A04 = r6;
        this.A02 = f6j;
        r3.registerLifecycleListener(this);
        this.A03 = new EE3(this);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            CallerContext callerContext = 1KM.A00;
            if (i == 64206) {
                1KM.A01(intent, this.A01, this.A05);
            }
        }
    }
}
