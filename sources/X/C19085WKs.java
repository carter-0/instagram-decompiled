package X;

import java.nio.ByteBuffer;

/* renamed from: X.WKs  reason: case insensitive filesystem */
public final class C19085WKs implements C20971X7b {
    public final /* synthetic */ C18078Vl7 A00;
    public final /* synthetic */ C20971X7b A01;

    public final void D4I(ByteBuffer byteBuffer) {
        0qQ.A0B(byteBuffer, 0);
        this.A01.D4I(byteBuffer);
        C363058j1.A02.A03("sup:LiveMediaStreamController", "Audio Codec Received");
        this.A00.A0H = byteBuffer;
    }

    public C19085WKs(C18078Vl7 vl7, C20971X7b x7b) {
        this.A01 = x7b;
        this.A00 = vl7;
    }

    public final void DGt(X0x x0x) {
        UMm uMm;
        this.A01.DGt(x0x);
        C363068j2 r3 = C363058j1.A02;
        StringBuilder sb = new StringBuilder();
        sb.append("Audio frame data received at ");
        Long l = null;
        if ((x0x instanceof UMm) && (uMm = (UMm) x0x) != null) {
            l = Long.valueOf(uMm.A00);
        }
        r3.A03("sup:LiveMediaStreamController", AnonymousClass7TF.A0i(l, sb));
    }

    public final void Dvz(0sP r4) {
        this.A01.Dvz(r4);
        C363058j1.A02.A01("sup:LiveMediaStreamController", "Audio user action callback received");
    }
}
