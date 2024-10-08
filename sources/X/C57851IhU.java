package X;

import android.view.View;

/* renamed from: X.IhU  reason: case insensitive filesystem */
public final class C57851IhU implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C314186hn A01;

    public C57851IhU(View view, C314186hn r2) {
        this.A01 = r2;
        this.A00 = view;
    }

    public final void run() {
        HZU.A00(this.A00, false).start();
        AnonymousClass2S0.A01.A03();
    }
}
