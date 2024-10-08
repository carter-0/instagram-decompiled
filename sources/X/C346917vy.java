package X;

import android.animation.ArgbEvaluator;
import android.view.View;

/* renamed from: X.7vy  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C346917vy implements C295005nO {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C295005nO A02;

    public /* synthetic */ C346917vy(View view, C295005nO r2, int i) {
        this.A01 = view;
        this.A00 = i;
        this.A02 = r2;
    }

    public final void onFinish() {
        View view = this.A01;
        int i = this.A00;
        C295005nO r1 = this.A02;
        ArgbEvaluator argbEvaluator = C294975nL.A0b;
        view.setVisibility(i);
        if (r1 != null) {
            r1.onFinish();
        }
    }
}
