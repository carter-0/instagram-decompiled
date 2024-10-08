package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.Fsl  reason: case insensitive filesystem */
public final class C51353Fsl implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;

    public C51353Fsl(Activity activity, View view) {
        this.A01 = view;
        this.A00 = activity;
    }

    public final void run() {
        View view = this.A01;
        03T.A00(view, new C51443FuD(this.A00, view, view));
    }
}
