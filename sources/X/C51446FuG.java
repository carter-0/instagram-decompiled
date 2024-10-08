package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.FuG  reason: case insensitive filesystem */
public final class C51446FuG implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ 1Av A02;

    public C51446FuG(Activity activity, View view, 1Av r3) {
        this.A01 = view;
        this.A00 = activity;
        this.A02 = r3;
    }

    public final void run() {
        View view = this.A01;
        03T.A00(view, new C51500Fv8(this.A00, view, view, this.A02));
    }
}
