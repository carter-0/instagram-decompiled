package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;

public final class M7F implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C59962JcV A01;

    public M7F(View view, C59962JcV jcV) {
        this.A01 = jcV;
        this.A00 = view;
    }

    public final void run() {
        C59962JcV jcV = this.A01;
        FragmentActivity activity = jcV.getActivity();
        if (activity != null) {
            AnonymousClass5Gt A0f = AnonymousClass7TG.A0f(activity, AnonymousClass7TE.A16(jcV.requireContext(), 2131962268));
            A0f.A02();
            A0f.A03(this.A00);
            A0f.A04 = new KSO(jcV, 5);
            A0f.A00().A07(AnonymousClass7TE.A0l(jcV.A0i));
        }
    }
}
