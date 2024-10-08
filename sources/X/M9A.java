package X;

import android.content.Context;
import android.view.View;

public final class M9A implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C62320sa A01;
    public final /* synthetic */ C62320sa A02;

    public M9A(View view, C62320sa r2, C62320sa r3) {
        this.A00 = view;
        this.A02 = r2;
        this.A01 = r3;
    }

    public final void run() {
        View view = this.A00;
        if (!LK2.A01(view, "show_memory_badge_animator_key") && C51971G9r.A1b(this.A02)) {
            C294975nL A002 = LK2.A00(view, C65735Lyp.A00);
            Context A0S = AnonymousClass7TE.A0S(view);
            A002.A0J(0nA.A00(A0S, -5.0f));
            A002.A0K(0nA.A00(A0S, -4.0f));
            A002.A0O(0.0f, -7.0f);
            A002.A05 = new C65724Lye(this.A01, 23);
            A002.A08 = "show_memory_badge_animator_key";
            A002.A0H();
        }
    }
}
