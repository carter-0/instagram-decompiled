package X;

import android.graphics.Rect;
import android.view.View;
import android.widget.TextView;

/* renamed from: X.Wox  reason: case insensitive filesystem */
public final class C20308Wox implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ UE8 A02;

    public C20308Wox(View view, UE8 ue8, int i) {
        this.A02 = ue8;
        this.A00 = i;
        this.A01 = view;
    }

    public final void run() {
        Rect rect = new Rect();
        TextView textView = this.A02.A00;
        textView.getHitRect(rect);
        int i = -this.A00;
        rect.inset(i, i);
        C66581MXm.A18(rect, textView, this.A01);
    }
}
