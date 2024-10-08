package X;

import android.content.Intent;

/* renamed from: X.IhR  reason: case insensitive filesystem */
public final /* synthetic */ class C57848IhR implements Runnable {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ AnonymousClass6W8 A01;

    public /* synthetic */ C57848IhR(Intent intent, AnonymousClass6W8 r2) {
        this.A01 = r2;
        this.A00 = intent;
    }

    public final void run() {
        AnonymousClass6W8 r3 = this.A01;
        Intent intent = this.A00;
        if (C226122ff.A01() == 0) {
            0wb.A03(C273654mx.A00(1309), String.format("Status bar height is zero: %s: %s", new Object[]{C51968G9o.A16(r3.A0L), r3.A0O}));
        }
        0kR.A0B(r3.A0L, intent);
    }
}
