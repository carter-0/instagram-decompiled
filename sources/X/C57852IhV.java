package X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: X.IhV  reason: case insensitive filesystem */
public final class C57852IhV implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C56010HrI A01;

    public C57852IhV(C56010HrI hrI, int i) {
        this.A01 = hrI;
        this.A00 = i;
    }

    public final void run() {
        C56010HrI hrI = this.A01;
        View view = hrI.A03;
        int width = view.getWidth();
        hrI.A04.setClipBounds(new Rect(0, 0, (this.A00 * width) / 100, view.getHeight()));
    }
}
