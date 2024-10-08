package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.Igz  reason: case insensitive filesystem */
public final class C57820Igz implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewGroup A01;

    public C57820Igz(ViewGroup viewGroup, View view) {
        this.A00 = view;
        this.A01 = viewGroup;
    }

    public final void run() {
        View view = this.A00;
        0qQ.A0A(view);
        view.setVisibility(8);
        this.A01.removeView(view);
        view.setOnTouchListener((View.OnTouchListener) null);
    }
}
