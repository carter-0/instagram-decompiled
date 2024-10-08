package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Pml  reason: case insensitive filesystem */
public final class C73967Pml extends 0Yg implements 0sP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ C70416O5t A04;
    public final /* synthetic */ OTX A05;
    public final /* synthetic */ String A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73967Pml(C70416O5t o5t, OTX otx, String str, int i, int i2, long j, long j2) {
        super(1);
        this.A05 = otx;
        this.A01 = i;
        this.A02 = j;
        this.A06 = str;
        this.A03 = j2;
        this.A00 = i2;
        this.A04 = o5t;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List A1I;
        OE3 oe3 = (OE3) obj;
        0qQ.A0B(oe3, 0);
        AnonymousClass2Ep r0 = (AnonymousClass2Ep) oe3.A01;
        if (r0 != null) {
            OTX otx = this.A05;
            int i = this.A01;
            long j = this.A02;
            A1I = OTX.A00(r0, otx, this.A06, i, this.A00, j, this.A03);
        } else {
            C70808OMd oMd = this.A05.A03;
            String str = this.A06;
            ArrayList A0S = 00k.A0S(oe3.A02, C66582MXn.A0z(oe3.A00));
            ArrayList A0r = AnonymousClass7TG.A0r(A0S);
            Iterator it = A0S.iterator();
            while (it.hasNext()) {
                AnonymousClass7TE.A1Y(A0r, (long) AnonymousClass7TG.A0F(it));
            }
            oMd.A00(str, A0r, 7035, 2);
            oMd.A01(str, false);
            A1I = AnonymousClass7TE.A1I(new C68980NcB("Thread is still missing after ThreadSnapshot operation"));
        }
        this.A04.A00.A0A(A1I);
        return C60340gF.A00;
    }
}
