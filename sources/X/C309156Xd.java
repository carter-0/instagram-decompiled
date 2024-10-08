package X;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.6Xd  reason: invalid class name and case insensitive filesystem */
public final class C309156Xd implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Rect A03;
    public final /* synthetic */ View A04;
    public final /* synthetic */ View A05;

    public C309156Xd(Rect rect, View view, View view2, int i, int i2, int i3) {
        this.A05 = view;
        this.A03 = rect;
        this.A04 = view2;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = i3;
    }

    public final void run() {
        View view = this.A05;
        Rect rect = this.A03;
        view.getHitRect(rect);
        View view2 = this.A04;
        0qQ.A0C(view2, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) view2).offsetDescendantRectToMyCoords(view, rect);
        rect.top += this.A01;
        rect.bottom += this.A00;
        int i = rect.right;
        int i2 = this.A02;
        rect.right = i + i2;
        rect.left += i2;
        view2.setTouchDelegate(new TouchDelegate(rect, view));
    }
}
