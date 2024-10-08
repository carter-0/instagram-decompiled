package X;

import android.graphics.Bitmap;

public final class TKD implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ Bitmap A02;
    public final /* synthetic */ SOP A03;
    public final /* synthetic */ Integer A04;

    public TKD(Bitmap bitmap, SOP sop, Integer num, long j, long j2) {
        this.A03 = sop;
        this.A01 = j;
        this.A02 = bitmap;
        this.A00 = j2;
        this.A04 = num;
    }

    public final void run() {
        SOP sop = this.A03;
        long j = this.A01;
        SOP.A00(this.A02, sop, this.A04, DbY.A0p("snapshot_type", "image", AnonymousClass7TE.A1L("capture_latency_ms", String.valueOf(this.A00))), j);
    }
}
