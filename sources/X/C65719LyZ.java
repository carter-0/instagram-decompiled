package X;

import android.view.View;

/* renamed from: X.LyZ  reason: case insensitive filesystem */
public final class C65719LyZ implements C295005nO {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C294975nL A02;

    public C65719LyZ(View view, C294975nL r2, int i) {
        this.A02 = r2;
        this.A01 = view;
        this.A00 = i;
    }

    public final void onFinish() {
        this.A02.A05 = null;
        C247763gs.A03(this.A01, this.A00);
    }
}
