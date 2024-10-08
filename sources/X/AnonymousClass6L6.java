package X;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.TextView;

/* renamed from: X.6L6  reason: invalid class name */
public final class AnonymousClass6L6 implements Runnable {
    public final /* synthetic */ AnonymousClass6PB A00;

    public AnonymousClass6L6(AnonymousClass6PB r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass6PB r3 = this.A00;
        View view = r3.A04;
        AnonymousClass479 r6 = new AnonymousClass479(view);
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr);
        TextView textView = r3.A0G.A00;
        textView.getLocationOnScreen(iArr2);
        int i = iArr2[0] - iArr[0];
        r6.A00.add(new TouchDelegate(new Rect(i, iArr2[1] - iArr[1], textView.getWidth() + i, view.getHeight()), textView));
        view.setTouchDelegate(r6);
    }
}
