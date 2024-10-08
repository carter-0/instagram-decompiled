package X;

import android.view.View;

/* renamed from: X.Wmk  reason: case insensitive filesystem */
public final class C20186Wmk implements Runnable {
    public final /* synthetic */ View.OnFocusChangeListener A00;
    public final /* synthetic */ View A01;

    public C20186Wmk(View.OnFocusChangeListener onFocusChangeListener, View view) {
        this.A01 = view;
        this.A00 = onFocusChangeListener;
    }

    public final void run() {
        View view = this.A01;
        view.clearFocus();
        view.requestFocus();
        view.setOnFocusChangeListener(this.A00);
    }
}
