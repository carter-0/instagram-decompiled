package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.Fvm  reason: case insensitive filesystem */
public final class C51540Fvm implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Activity A02;
    public final /* synthetic */ View A03;
    public final /* synthetic */ View A04;
    public final /* synthetic */ 1Av A05;

    public C51540Fvm(Activity activity, View view, View view2, 1Av r4, int i, int i2) {
        this.A04 = view;
        this.A02 = activity;
        this.A01 = i;
        this.A03 = view2;
        this.A05 = r4;
        this.A00 = i2;
    }

    public final void run() {
        AnonymousClass5Gt A0V = DbZ.A0V(this.A02, this.A01);
        A0V.A01();
        A0V.A03(this.A03);
        DbU.A1T(A0V);
        this.A05.A0z(C273654mx.A00(3138), this.A00 + 1);
    }
}
