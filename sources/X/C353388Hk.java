package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.8Hk  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C353388Hk implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ AnonymousClass82X A02;

    public /* synthetic */ C353388Hk(Activity activity, View view, AnonymousClass82X r3) {
        this.A01 = view;
        this.A00 = activity;
        this.A02 = r3;
    }

    public final void run() {
        View view = this.A01;
        Activity activity = this.A00;
        AnonymousClass82X r2 = this.A02;
        r2.A05.A02 = new AnonymousClass6e8((int) (((float) view.getHeight()) / activity.getResources().getDisplayMetrics().density));
    }
}
