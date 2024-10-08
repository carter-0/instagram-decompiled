package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.Fv6  reason: case insensitive filesystem */
public final class C51498Fv6 implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ 0rk A03;

    public C51498Fv6(Activity activity, View view, View view2, 0rk r4) {
        this.A02 = view;
        this.A00 = activity;
        this.A03 = r4;
        this.A01 = view2;
    }

    public final void run() {
        AnonymousClass5Gt A0V = DbZ.A0V(this.A00, this.A03.A00);
        A0V.A01();
        A0V.A03(this.A01);
        DbU.A1T(A0V);
    }
}
