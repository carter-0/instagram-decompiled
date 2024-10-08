package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.7gC  reason: invalid class name and case insensitive filesystem */
public final class C337347gC implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass3E5 A01;

    public C337347gC(Activity activity, AnonymousClass3E5 r2) {
        this.A01 = r2;
        this.A00 = activity;
    }

    public final void onGlobalLayout() {
        View view;
        AnonymousClass3E5 r3 = this.A01;
        if ((!r3.A0G.isEmpty()) && (view = r3.A05) != null) {
            boolean isInMultiWindowMode = this.A00.isInMultiWindowMode();
            int height = view.getHeight();
            if (r3.A04 != height) {
                AnonymousClass3E5.A04(r3, height, isInMultiWindowMode);
                r3.A04 = height;
            }
        }
    }
}
