package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.7WC  reason: invalid class name */
public final class AnonymousClass7WC implements 1wn {
    public final /* synthetic */ C332677Vy A00;

    public AnonymousClass7WC(C332677Vy r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(-188501532);
        int A032 = AnonymousClass0fD.A03(254756327);
        C332677Vy r2 = this.A00;
        UserSession userSession = r2.A0J;
        0xa r1 = 1Au.A00(userSession).A01;
        String A002 = AnonymousClass000.A00(1698);
        if (!r1.getBoolean(A002, false)) {
            FragmentActivity requireActivity = r2.A03.requireActivity();
            C47516E5z e5z = new C47516E5z();
            AnonymousClass0Dg.A00(new Bundle(), userSession);
            C331127Pr r12 = new C331127Pr(userSession);
            r12.A0a = false;
            C331157Pu A003 = r12.A00();
            0qQ.A0A(e5z);
            OXC.A02(requireActivity, e5z, A003, (C62320sa) null);
            1Au.A00(userSession).A13(A002, true);
        }
        AnonymousClass0fD.A0A(-1600128796, A032);
        AnonymousClass0fD.A0A(1987445825, A03);
    }
}
