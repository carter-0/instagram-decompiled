package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.FuC  reason: case insensitive filesystem */
public final class C51442FuC implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;

    public C51442FuC(Activity activity, View view, View view2) {
        this.A02 = view;
        this.A00 = activity;
        this.A01 = view2;
    }

    public final void run() {
        AnonymousClass5Gt A0V = DbZ.A0V(this.A00, 2131971904);
        A0V.A01();
        A0V.A03(this.A01);
        DbU.A1T(A0V);
    }
}
