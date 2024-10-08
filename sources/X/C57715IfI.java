package X;

import android.view.View;

/* renamed from: X.IfI  reason: case insensitive filesystem */
public final /* synthetic */ class C57715IfI implements Runnable {
    public final /* synthetic */ View A00;

    public /* synthetic */ C57715IfI(View view) {
        this.A00 = view;
    }

    public final void run() {
        View view = this.A00;
        View view2 = (View) view.getParent();
        if (view2 != null) {
            view2.post(new C57812Igr(view, view2));
        }
    }
}
