package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.Ao2  reason: case insensitive filesystem */
public final class C41080Ao2 implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass7FA A01;

    public C41080Ao2(View view, AnonymousClass7FA r2) {
        this.A01 = r2;
        this.A00 = view;
    }

    public final void run() {
        ViewGroup viewGroup = this.A01.A01;
        if (viewGroup != null) {
            View view = this.A00;
            viewGroup.removeAllViews();
            viewGroup.addView(view);
            viewGroup.setVisibility(0);
        }
    }
}
