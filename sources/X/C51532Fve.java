package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.Fve  reason: case insensitive filesystem */
public final class C51532Fve implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Activity A02;
    public final /* synthetic */ View A03;
    public final /* synthetic */ 1Av A04;

    public C51532Fve(Activity activity, View view, 1Av r3, int i, int i2) {
        this.A03 = view;
        this.A02 = activity;
        this.A01 = i;
        this.A04 = r3;
        this.A00 = i2;
    }

    public final void run() {
        View view = this.A03;
        View view2 = view;
        03T.A00(view, new C51540Fvm(this.A02, view, view2, this.A04, this.A01, this.A00));
    }
}
