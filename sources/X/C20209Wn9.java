package X;

import android.view.View;

/* renamed from: X.Wn9  reason: case insensitive filesystem */
public final class C20209Wn9 implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C17692VcN A01;

    public C20209Wn9(View view, C17692VcN vcN) {
        this.A00 = view;
        this.A01 = vcN;
    }

    public final void run() {
        int height = (this.A00.getHeight() / 2) / 2;
        if (height != 0) {
            this.A01.A09.setPadding(0, height, 0, 0);
        }
    }
}
