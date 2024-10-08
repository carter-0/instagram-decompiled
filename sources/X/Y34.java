package X;

import android.media.MediaCodec;
import android.os.Handler;

public final class Y34 implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ C22146XwA A01;
    public final /* synthetic */ C341737nR A02;

    public Y34(Handler handler, C22146XwA xwA, C341737nR r3) {
        this.A01 = xwA;
        this.A02 = r3;
        this.A00 = handler;
    }

    public final void run() {
        C22146XwA xwA = this.A01;
        C341737nR r3 = this.A02;
        Handler handler = this.A00;
        if (xwA.A08 != AnonymousClass05K.A01) {
            C18091VlL.A01(handler, r3, DbW.A0c("prepare() must be called before starting audio encoding. Current state is: ", XUR.A00(xwA.A08)));
            return;
        }
        try {
            MediaCodec mediaCodec = xwA.A01;
            if (mediaCodec != null) {
                0fX.A05(mediaCodec, 876997999);
                xwA.A08 = AnonymousClass05K.A0C;
                if (xwA instanceof XIK) {
                    XIK xik = (XIK) xwA;
                    xik.A03.post(xik.A01);
                }
                C18091VlL.A00(handler, r3);
                return;
            }
            C18091VlL.A01(handler, r3, AnonymousClass7TE.A0z("Unexpected null MediaCodec during start"));
        } catch (Exception e) {
            C18091VlL.A01(handler, r3, e);
        }
    }
}
