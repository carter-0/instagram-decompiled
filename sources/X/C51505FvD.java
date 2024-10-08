package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.FvD  reason: case insensitive filesystem */
public final class C51505FvD implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ C234222xL A03;

    public C51505FvD(Activity activity, View view, C234222xL r3, int i) {
        this.A01 = activity;
        this.A00 = i;
        this.A02 = view;
        this.A03 = r3;
    }

    public final void run() {
        AnonymousClass5Gt A0V = DbZ.A0V(this.A01, this.A00);
        A0V.A03(this.A02);
        A0V.A02();
        A0V.A0B = false;
        A0V.A0A = true;
        A0V.A04 = this.A03;
        DbU.A1T(A0V);
    }
}
