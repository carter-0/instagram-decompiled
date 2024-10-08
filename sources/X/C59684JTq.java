package X;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* renamed from: X.JTq  reason: case insensitive filesystem */
public final class C59684JTq extends 0ng {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C59682JTo A02;
    public final /* synthetic */ String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59684JTq(Context context, C59682JTo jTo, String str, long j) {
        super(154, 4, false, false);
        this.A02 = jTo;
        this.A01 = context;
        this.A03 = str;
        this.A00 = j;
    }

    public final void run() {
        Context context = this.A01;
        C228532lp r2 = this.A02.A01;
        1UX.A00(context, r2.A01).A03(this.A03);
        AnonymousClass2l3 r22 = r2.A02;
        long j = this.A00;
        if (r22.A0I.A0U() && AnonymousClass02Q.A00()) {
            0ff.A01("ig_cold_start_to_cached_content", 27635112);
            0ff.A00(1056309089);
        }
        AnonymousClass1H7 r1 = r22.A0H.A01.A00;
        1Gq r0 = r1.A01;
        1Gq.A00(r0).markerPoint(15335435, "CACHED_FEED_UI_RENDER_END", j, TimeUnit.MILLISECONDS);
        r1.A00().A00(1Gx.A08);
    }
}
