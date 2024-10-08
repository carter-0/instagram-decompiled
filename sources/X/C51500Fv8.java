package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.Fv8  reason: case insensitive filesystem */
public final class C51500Fv8 implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ 1Av A03;

    public C51500Fv8(Activity activity, View view, View view2, 1Av r4) {
        this.A02 = view;
        this.A00 = activity;
        this.A01 = view2;
        this.A03 = r4;
    }

    public final void run() {
        AnonymousClass5Gt A0V = DbZ.A0V(this.A00, 2131958742);
        A0V.A01();
        A0V.A03(this.A01);
        A0V.A0A = true;
        C47898ELs.A00(A0V, this.A03, 3).A06();
    }
}
