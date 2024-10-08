package X;

import java.nio.ByteBuffer;

public final class WKr implements C20971X7b {
    public final /* synthetic */ C18078Vl7 A00;

    public final void D4I(ByteBuffer byteBuffer) {
        0qQ.A0B(byteBuffer, 0);
        C363058j1.A02.A03("sup:LiveMediaStreamController", "Video Codec Received");
        this.A00.A0I = byteBuffer;
    }

    public WKr(C18078Vl7 vl7) {
        this.A00 = vl7;
    }

    public final void DGt(X0x x0x) {
        UMn uMn;
        if ((x0x instanceof UMn) && (uMn = (UMn) x0x) != null) {
            C18078Vl7 vl7 = this.A00;
            C363058j1.A02.A03("sup:LiveMediaStreamController", 002.A0Q("Video frame data received at ", uMn.A04));
            vl7.A01 = uMn.A01;
            vl7.A02 = uMn.A02;
            vl7.A03 = uMn.A03;
        }
    }

    public final void Dvz(0sP r4) {
        C363058j1.A02.A01("sup:LiveMediaStreamController", "Video user action callback received");
    }
}
