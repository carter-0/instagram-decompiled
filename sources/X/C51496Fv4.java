package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.Fv4  reason: case insensitive filesystem */
public final class C51496Fv4 implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C333357Yq A02;
    public final /* synthetic */ String A03;

    public C51496Fv4(Activity activity, View view, C333357Yq r3, String str) {
        this.A01 = view;
        this.A00 = activity;
        this.A03 = str;
        this.A02 = r3;
    }

    public final void run() {
        View view = this.A01;
        View view2 = view;
        03T.A00(view, new C51531Fvd(this.A00, view, view2, this.A02, this.A03));
    }
}
