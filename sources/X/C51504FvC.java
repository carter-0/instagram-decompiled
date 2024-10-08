package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.FvC  reason: case insensitive filesystem */
public final /* synthetic */ class C51504FvC implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ C234222xL A03;

    public /* synthetic */ C51504FvC(Activity activity, View view, C234222xL r3, int i) {
        this.A01 = activity;
        this.A00 = i;
        this.A02 = view;
        this.A03 = r3;
    }

    public final void run() {
        Activity activity = this.A01;
        int i = this.A00;
        View view = this.A02;
        C234222xL r2 = this.A03;
        AnonymousClass5Gt A0f = AnonymousClass7TG.A0f(activity, activity.getString(i));
        A0f.A03(view);
        A0f.A02();
        A0f.A0B = false;
        A0f.A0A = true;
        A0f.A04 = r2;
        DbU.A1T(A0f);
    }
}
