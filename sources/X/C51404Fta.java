package X;

import android.view.View;

/* renamed from: X.Fta  reason: case insensitive filesystem */
public final class C51404Fta implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C47505E5n A01;

    public C51404Fta(View view, C47505E5n e5n) {
        this.A01 = e5n;
        this.A00 = view;
    }

    public final void run() {
        C47505E5n e5n = this.A01;
        e5n.A03 = this.A00.getHeight();
        C47505E5n.A00(e5n);
    }
}
