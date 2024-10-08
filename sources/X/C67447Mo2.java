package X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: X.Mo2  reason: case insensitive filesystem */
public final class C67447Mo2 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;

    public C67447Mo2(View view, int i, View view2) {
        this.A02 = view;
        this.A00 = i;
        this.A01 = view2;
    }

    public final void run() {
        Rect A0W = AnonymousClass7TE.A0W();
        View view = this.A02;
        view.getHitRect(A0W);
        int i = A0W.top;
        int i2 = this.A00;
        A0W.top = i - i2;
        A0W.bottom += i2;
        A0W.left -= i2;
        A0W.right += i2;
        C66581MXm.A18(A0W, view, this.A01);
    }
}
