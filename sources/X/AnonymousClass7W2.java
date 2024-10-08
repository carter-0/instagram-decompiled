package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.7W2  reason: invalid class name */
public final class AnonymousClass7W2 implements 1wn {
    public final /* synthetic */ C332677Vy A00;

    public AnonymousClass7W2(C332677Vy r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(379759625);
        C330887Oq r9 = (C330887Oq) obj;
        int A032 = AnonymousClass0fD.A03(1671580360);
        0qQ.A0B(r9, 0);
        C332677Vy r0 = this.A00;
        String str = r9.A03;
        String str2 = r9.A02;
        AnonymousClass4DH r6 = r0.A03;
        FragmentActivity requireActivity = r6.requireActivity();
        if (str == null) {
            Context requireContext = r6.requireContext();
            UserSession userSession = r0.A0J;
            int i = 2131958704;
            if (182.A05(0Tu.A05, userSession)) {
                i = 2131958703;
            }
            str = requireContext.getString(i);
            0qQ.A07(str);
        }
        if (str2 == null) {
            str2 = r6.requireContext().getString(2131960632);
            0qQ.A07(str2);
        }
        C358248ab r1 = new C358248ab((Activity) requireActivity);
        r1.A05 = str;
        r1.A0q(str2);
        r1.A0E(new AKA(requireActivity));
        AnonymousClass0fN.A00(r1.A02());
        AnonymousClass0fD.A0A(-610431262, A032);
        AnonymousClass0fD.A0A(-868267089, A03);
    }
}
