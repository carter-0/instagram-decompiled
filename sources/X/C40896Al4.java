package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.Al4  reason: case insensitive filesystem */
public final class C40896Al4 implements Runnable {
    public final /* synthetic */ View A00;

    public C40896Al4(View view) {
        this.A00 = view;
    }

    public final void run() {
        ViewGroup.LayoutParams layoutParams;
        View view = this.A00;
        if (view.getLayoutParams() == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, C226122ff.A01());
        } else {
            layoutParams = view.getLayoutParams();
            view.getLayoutParams().width = -1;
            view.getLayoutParams().height = C226122ff.A01();
        }
        view.setLayoutParams(layoutParams);
        0nA.A0e(view, -C226122ff.A01());
    }
}
