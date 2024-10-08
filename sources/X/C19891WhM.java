package X;

import android.view.ViewParent;

/* renamed from: X.WhM  reason: case insensitive filesystem */
public final class C19891WhM implements Runnable {
    public final /* synthetic */ WC5 A00;

    public C19891WhM(WC5 wc5) {
        this.A00 = wc5;
    }

    public final void run() {
        ViewParent parent = this.A00.A07.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }
}
