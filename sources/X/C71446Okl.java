package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.Okl  reason: case insensitive filesystem */
public final class C71446Okl implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;

    public C71446Okl(Activity activity, View view) {
        this.A00 = activity;
        this.A01 = view;
    }

    public final void onGlobalLayout() {
        C66732Mbd.A00(this.A00);
        C51967G9n.A0y(this.A01, this);
    }
}
