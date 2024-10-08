package X;

import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;

public final class F23 {
    public final AnonymousClass4DH A00;
    public final AnonymousClass0aP A01;

    public F23(AnonymousClass4DH r2, AnonymousClass0aP r3) {
        0qQ.A0B(r3, 1);
        this.A01 = r3;
        this.A00 = r2;
    }

    public final void A00(C49708F2t f2t, String str) {
        FragmentActivity activity;
        Window window;
        boolean z = true;
        if (f2t == null || !f2t.A02) {
            z = false;
        }
        DbT.A15();
        AnonymousClass0aP r3 = this.A01;
        Bundle A0C = DbX.A0C("IgSessionManager.LOGGED_OUT_TOKEN");
        A0C.putString("com.instagram.android.login.fragment.ARGUMENT_OMNISTRING", str);
        A0C.putBoolean("com.instagram.android.login.fragment.ARGUMENT_USER_IS_VALID", z);
        C47483E4i e4i = new C47483E4i();
        e4i.setArguments(A0C);
        AnonymousClass4DH r1 = this.A00;
        DbY.A14(e4i, r1.requireActivity(), r3);
        FragmentActivity activity2 = r1.getActivity();
        if (activity2 != null && activity2.getWindow() != null && (activity = r1.getActivity()) != null && (window = activity.getWindow()) != null) {
            window.clearFlags(8192);
        }
    }
}
