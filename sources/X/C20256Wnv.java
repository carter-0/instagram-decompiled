package X;

import android.graphics.Bitmap;

/* renamed from: X.Wnv  reason: case insensitive filesystem */
public final class C20256Wnv implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ C64863LjP A01;

    public C20256Wnv(Bitmap bitmap, C64863LjP ljP) {
        this.A01 = ljP;
        this.A00 = bitmap;
    }

    public final void run() {
        C17545VZy vZy = (C17545VZy) this.A01.A01;
        int A002 = C17545VZy.A00(this.A00);
        vZy.A01 = A002;
        C17398VTz vTz = vZy.A03;
        if (vTz != null) {
            vTz.A00.A02("sBrush", A002);
        }
    }
}
