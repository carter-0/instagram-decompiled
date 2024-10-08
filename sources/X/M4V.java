package X;

import android.view.View;

public final class M4V implements Runnable {
    public final /* synthetic */ C61420K6r A00;

    public M4V(C61420K6r k6r) {
        this.A00 = k6r;
    }

    public final void run() {
        C61420K6r k6r = this.A00;
        if (k6r.getActivity() != null) {
            View view = k6r.A00;
            if (view != null) {
                int height = view.getHeight() / 2;
                AnonymousClass5Gt A0f = AnonymousClass7TG.A0f(k6r.requireActivity(), AnonymousClass7TF.A0d(DbV.A05(k6r), 2131964012));
                View view2 = k6r.A00;
                if (view2 != null) {
                    A0f.A04(view2, 0, height, true);
                    A0f.A01();
                    A0f.A0A = true;
                    A0f.A0F = true;
                    A0f.A00().A07(AnonymousClass7TE.A0l(k6r.A08));
                }
            }
            0qQ.A0F("toggleAspectRatioButton");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass0eM r4 = k6r.A08;
        1Av A0h = DbX.A0h(r4);
        AnonymousClass7TF.A1J(A0h, A0h.A0n, 1Av.A8a, 248, true);
        1NY A0L = DbZ.A0L(DbT.A0X(r4));
        A0L.A0A("nux/write_nux_type/");
        DbX.A1M(A0L, AnonymousClass000.A00(725), "igtv_aspect_ratio");
        DbT.A0U(A0L, true).run();
    }
}
