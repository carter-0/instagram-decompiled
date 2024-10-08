package X;

import com.facebook.rsys.mediasync.gen.MediaSyncState;
import com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments;

/* renamed from: X.Pa7  reason: case insensitive filesystem */
public final class C73289Pa7 implements Runnable {
    public final /* synthetic */ C74438Put A00;
    public final /* synthetic */ C70959OTg A01;
    public final /* synthetic */ String A02;

    public C73289Pa7(C74438Put put, C70959OTg oTg, String str) {
        this.A01 = oTg;
        this.A02 = str;
        this.A00 = put;
    }

    public final void run() {
        O9Q o9q;
        C70959OTg oTg = this.A01;
        String str = this.A02;
        C74438Put put = this.A00;
        synchronized (oTg.A05) {
            if (0qQ.A0K(str, oTg.A01)) {
                o9q = oTg.A00;
            } else {
                o9q = null;
            }
        }
        if (o9q != null) {
            0qQ.A0B(put, 0);
            C69133NfE nfE = o9q.A00;
            nfE.A01 = put;
            05G r5 = nfE.A0F;
            MediaSyncState mediaSyncState = nfE.A00;
            C61070Jw8 jw8 = new C61070Jw8(mediaSyncState, nfE.A0A.A0C(mediaSyncState, put), (RtcStartCoWatchPlaybackArguments) null, nfE.A03);
            0qQ.A0B(r5, 0);
            r5.FIA(jw8);
        }
    }
}
