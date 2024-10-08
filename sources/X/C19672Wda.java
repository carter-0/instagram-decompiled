package X;

import android.animation.ArgbEvaluator;
import android.view.View;

/* renamed from: X.Wda  reason: case insensitive filesystem */
public final /* synthetic */ class C19672Wda implements C295005nO {
    public final /* synthetic */ long A00;
    public final /* synthetic */ View A01;

    public /* synthetic */ C19672Wda(View view, long j) {
        this.A01 = view;
        this.A00 = j;
    }

    public final void onFinish() {
        View view = this.A01;
        long j = this.A00;
        ArgbEvaluator argbEvaluator = C294975nL.A0b;
        11Z.A04(new C20086Wkk(view), j);
    }
}
