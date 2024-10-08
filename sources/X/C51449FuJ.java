package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.FuJ  reason: case insensitive filesystem */
public final class C51449FuJ implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ 1Av A02;

    public C51449FuJ(Activity activity, View view, 1Av r3) {
        this.A01 = view;
        this.A00 = activity;
        this.A02 = r3;
    }

    public final void run() {
        View view = this.A01;
        if (view.isAttachedToWindow()) {
            AnonymousClass5Gt A0V = DbZ.A0V(this.A00, 2131957273);
            A0V.A03(view);
            A0V.A01();
            A0V.A07(C283255Gu.A07);
            A0V.A0A = true;
            C47898ELs.A00(A0V, this.A02, 5).A06();
        }
    }
}
