package X;

import android.view.View;

public final class MAI implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C315626kE A02;
    public final /* synthetic */ C315626kE A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ C62320sa A05;
    public final /* synthetic */ C62320sa A06;
    public final /* synthetic */ C62320sa A07;

    public MAI(View view, View view2, C315626kE r3, C315626kE r4, String str, C62320sa r6, C62320sa r7, C62320sa r8) {
        this.A00 = view;
        this.A04 = str;
        this.A01 = view2;
        this.A07 = r6;
        this.A06 = r7;
        this.A02 = r3;
        this.A03 = r4;
        this.A05 = r8;
    }

    public final void run() {
        View view = this.A00;
        String str = this.A04;
        if (!LK2.A01(view, str)) {
            View view2 = this.A01;
            if (!LK2.A01(view2, str) && C51971G9r.A1b(this.A07)) {
                this.A06.invoke();
                C315626kE r3 = this.A02;
                AnonymousClass7TF.A1F(view, 0, r3);
                C294975nL A002 = LK2.A00(view, new C65731Lyl(view, r3, 1.0f));
                A002.A0U(1.0f, 0.0f, -1.0f);
                A002.A0V(1.0f, 0.0f, -1.0f);
                A002.A08 = str;
                A002.A0H();
                C315626kE r32 = this.A03;
                0qQ.A0B(view2, 0);
                C294975nL A003 = LK2.A00(view2, new C65731Lyl(view2, r32, 0.0f));
                A003.A0U(0.0f, 1.0f, -1.0f);
                A003.A0V(0.0f, 1.0f, -1.0f);
                A003.A05 = new C65724Lye(this.A05, 23);
                A003.A08 = str;
                A003.A0H();
            }
        }
    }
}
