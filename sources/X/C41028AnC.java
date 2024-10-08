package X;

import android.view.View;

/* renamed from: X.AnC  reason: case insensitive filesystem */
public final class C41028AnC implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass8AT A01;

    public C41028AnC(View view, AnonymousClass8AT r2) {
        this.A01 = r2;
        this.A00 = view;
    }

    public final void run() {
        this.A01.A00 = this.A00.getWidth();
    }
}
