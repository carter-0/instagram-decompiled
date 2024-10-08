package X;

import android.content.Intent;

/* renamed from: X.QtE  reason: case insensitive filesystem */
public final class C8406QtE extends C298485tV {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ C13806ThV A01;

    public C8406QtE(Intent intent, C13806ThV thV) {
        this.A00 = intent;
        this.A01 = thV;
    }

    public final void A00() {
        Intent intent = this.A00;
        if (intent != null) {
            this.A01.startActivityForResult(intent, 2);
        }
    }
}
