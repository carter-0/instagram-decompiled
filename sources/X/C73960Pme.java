package X;

import com.instagram.direct.armadilloexpress.memtransporteventpayload.TransportEvent;

/* renamed from: X.Pme  reason: case insensitive filesystem */
public final class C73960Pme extends 0Yg implements 0sP {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C70416O5t A02;
    public final /* synthetic */ TransportEvent.Event A03;
    public final /* synthetic */ OTY A04;
    public final /* synthetic */ String A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73960Pme(C70416O5t o5t, TransportEvent.Event event, OTY oty, String str, long j, long j2) {
        super(1);
        this.A04 = oty;
        this.A00 = j;
        this.A05 = str;
        this.A03 = event;
        this.A01 = j2;
        this.A02 = o5t;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        OE3 oe3 = (OE3) obj;
        0qQ.A0B(oe3, 0);
        AnonymousClass2Ep r1 = (AnonymousClass2Ep) oe3.A01;
        if (r1 != null) {
            OTY oty = this.A04;
            long j = this.A00;
            this.A02.A00.A0A(OTY.A00(this.A03, r1, oty, this.A05, j, this.A01));
        } else {
            0KC.A0C("ArmadilloExpressTransportEventProcessor", "Thread is still missing after ThreadSnapshot operation");
            this.A04.A02.A01(this.A05, false);
            C70416O5t o5t = this.A02;
            o5t.A00.A09(new Exception("Thread is still missing after ThreadSnapshot operation"));
        }
        return C60340gF.A00;
    }
}
