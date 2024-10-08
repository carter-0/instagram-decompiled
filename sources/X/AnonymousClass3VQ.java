package X;

import android.os.MessageQueue;

/* renamed from: X.3VQ  reason: invalid class name */
public final class AnonymousClass3VQ implements MessageQueue.IdleHandler {
    public final /* synthetic */ AnonymousClass2l3 A00;

    public AnonymousClass3VQ(AnonymousClass2l3 r1) {
        this.A00 = r1;
    }

    public final boolean queueIdle() {
        Integer num;
        AnonymousClass2l3 r3 = this.A00;
        if (r3.A0O == AnonymousClass05K.A0j) {
            num = AnonymousClass05K.A1I;
        } else {
            num = AnonymousClass05K.A1F;
        }
        r3.A0O = num;
        AnonymousClass1H2 r2 = r3.A0H.A02.A01;
        r2.A05("NETWORK_FEED_UI_RENDER_END", (Long) null);
        r2.A00().A00(1Gx.A08);
        AnonymousClass2l3.A01(r3);
        return false;
    }
}
