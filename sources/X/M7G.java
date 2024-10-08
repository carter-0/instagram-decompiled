package X;

import android.view.View;

public final class M7G implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C59962JcV A01;

    public M7G(View view, C59962JcV jcV) {
        this.A01 = jcV;
        this.A00 = view;
    }

    public final void run() {
        C59962JcV jcV = this.A01;
        AnonymousClass5Gt A0f = AnonymousClass7TG.A0f(jcV.requireActivity(), AnonymousClass7TE.A16(jcV.requireContext(), 2131962270));
        A0f.A01();
        View view = this.A00;
        0qQ.A0A(view);
        A0f.A03(view);
        A0f.A04 = new KSO(jcV, 6);
        A0f.A00().A07(AnonymousClass7TE.A0l(jcV.A0i));
    }
}
