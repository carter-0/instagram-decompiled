package X;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;

/* renamed from: X.Igr  reason: case insensitive filesystem */
public final /* synthetic */ class C57812Igr implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;

    public /* synthetic */ C57812Igr(View view, View view2) {
        this.A00 = view;
        this.A01 = view2;
    }

    public final void run() {
        View view = this.A00;
        View view2 = this.A01;
        int A02 = DbS.A02(view.getContext(), 15);
        Rect A0W = AnonymousClass7TE.A0W();
        view.getHitRect(A0W);
        A0W.top -= A02;
        A0W.left -= A02;
        A0W.bottom += A02;
        A0W.right += A02;
        view2.setTouchDelegate(new TouchDelegate(A0W, view));
    }
}
