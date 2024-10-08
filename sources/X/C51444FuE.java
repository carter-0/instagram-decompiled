package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.FuE  reason: case insensitive filesystem */
public final class C51444FuE implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ 0rk A02;

    public C51444FuE(Activity activity, View view, 0rk r3) {
        this.A01 = view;
        this.A00 = activity;
        this.A02 = r3;
    }

    public final void run() {
        View view = this.A01;
        03T.A00(view, new C51498Fv6(this.A00, view, view, this.A02));
    }
}
