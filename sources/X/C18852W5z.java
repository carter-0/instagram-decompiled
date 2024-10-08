package X;

import android.media.MediaCodec;

/* renamed from: X.W5z  reason: case insensitive filesystem */
public final /* synthetic */ class C18852W5z implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ C296395pz A00;
    public final /* synthetic */ C251393n2 A01;

    public /* synthetic */ C18852W5z(C296395pz r1, C251393n2 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        this.A00.DGx(this.A01, j, j2);
    }
}
