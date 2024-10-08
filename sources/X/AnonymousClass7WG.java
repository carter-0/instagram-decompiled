package X;

import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.7WG  reason: invalid class name */
public final class AnonymousClass7WG implements 1wn {
    public final /* synthetic */ C332677Vy A00;

    public AnonymousClass7WG(C332677Vy r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(116852770);
        int A032 = AnonymousClass0fD.A03(1983586197);
        C332677Vy r8 = this.A00;
        String string = r8.A03.requireContext().getString(2131957274);
        0qQ.A07(string);
        AnonymousClass9H7 r6 = r8.A0P.A00;
        r6.A1I.A00(C331637Rt.class, new C73943PmN(string, r6, 38));
        AnonymousClass7UW r0 = r8.A0L;
        C330447Mu r1 = r0.A00;
        if (r1 != null) {
            FragmentActivity requireActivity = r0.A03.requireActivity();
            TextView textView = r1.A0F;
            if (textView != null) {
                textView.postDelayed(new C41219AqH(requireActivity, textView, r1, string), 500);
            }
        }
        AnonymousClass0fD.A0A(-1921485851, A032);
        AnonymousClass0fD.A0A(-636236476, A03);
    }
}
