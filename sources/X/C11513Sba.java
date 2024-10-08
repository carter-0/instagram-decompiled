package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.Sba  reason: case insensitive filesystem */
public final class C11513Sba implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C7571QKc A01;
    public final /* synthetic */ String A02;

    public C11513Sba(View view, C7571QKc qKc, String str) {
        this.A00 = view;
        this.A01 = qKc;
        this.A02 = str;
    }

    public final void onGlobalLayout() {
        long j;
        View view = this.A00;
        if (view.getViewTreeObserver().isAlive()) {
            C7571QKc qKc = this.A01;
            QKY qky = qKc.A01;
            Integer num = AnonymousClass05K.A00;
            String str = qKc.A02;
            String str2 = this.A02;
            String str3 = qKc.A02.A09;
            if (str3 != null) {
                j = Long.parseLong(str3);
            } else {
                j = 0;
            }
            qky.A0G(num, str, str2, j);
            C51967G9n.A0y(view, this);
        }
    }
}
