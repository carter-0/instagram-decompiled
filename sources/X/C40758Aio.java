package X;

import android.view.View;

/* renamed from: X.Aio  reason: case insensitive filesystem */
public final class C40758Aio implements Runnable {
    public final /* synthetic */ View A00;

    public C40758Aio(View view) {
        this.A00 = view;
    }

    public final void run() {
        View view = this.A00;
        view.setOutlineProvider(new C52851Gdk(view));
        view.setClipToOutline(true);
    }
}
