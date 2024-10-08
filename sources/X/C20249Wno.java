package X;

import android.os.Handler;

/* renamed from: X.Wno  reason: case insensitive filesystem */
public final class C20249Wno implements Runnable {
    public final /* synthetic */ C14886UDo A00;
    public final /* synthetic */ WSI A01;

    public C20249Wno(C14886UDo uDo, WSI wsi) {
        this.A01 = wsi;
        this.A00 = uDo;
    }

    public final void run() {
        WSI wsi = this.A01;
        if (wsi.A01.A02) {
            C14886UDo uDo = this.A00;
            VGM.A00(uDo, wsi);
            Handler handler = uDo.A01;
            Runnable runnable = uDo.A00;
            0qQ.A0A(runnable);
            handler.postDelayed(runnable, 1000);
        }
    }
}
