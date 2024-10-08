package X;

import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Pmu  reason: case insensitive filesystem */
public final class C73976Pmu extends 0Yg implements 0sP {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C70416O5t A02;
    public final /* synthetic */ TransportPayload A03;
    public final /* synthetic */ C69405Nkj A04;
    public final /* synthetic */ OZM A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73976Pmu(C70416O5t o5t, TransportPayload transportPayload, C69405Nkj nkj, OZM ozm, String str, String str2, long j, long j2) {
        super(1);
        this.A05 = ozm;
        this.A07 = str;
        this.A00 = j;
        this.A03 = transportPayload;
        this.A01 = j2;
        this.A06 = str2;
        this.A04 = nkj;
        this.A02 = o5t;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        1GK nqw;
        OE3 oe3 = (OE3) obj;
        0qQ.A0B(oe3, 0);
        AnonymousClass2Ep r2 = (AnonymousClass2Ep) oe3.A01;
        if (r2 != null) {
            OZM ozm = this.A05;
            OO2 oo2 = ozm.A04;
            String str = this.A07;
            oo2.A01.A02(str, "thread_fetch_in_render_end");
            long j = this.A00;
            TransportPayload transportPayload = this.A03;
            long j2 = this.A01;
            nqw = OZM.A00(transportPayload, this.A04, r2, ozm, str, this.A06, j, j2);
        } else {
            OZM ozm2 = this.A05;
            OO2 oo22 = ozm2.A04;
            String str2 = this.A07;
            int i = oe3.A00;
            List list = oe3.A02;
            C71033OZu oZu = oo22.A01;
            if (C71033OZu.A01(oZu, str2)) {
                oZu.A00.markerAnnotate(724174487, C71033OZu.A00(oZu, str2), "thread_fetch_failure_error_code", i);
            }
            oZu.A05(str2, (Integer[]) list.toArray(new Integer[0]));
            oZu.A04(str2, 3);
            0KC.A0C("ArmadilloExpressMessageProcessor", "Thread is still missing after ThreadSnapshot operation");
            ozm2.A06.A07(this.A06, str2, "Thread missing", true);
            C70808OMd oMd = ozm2.A05;
            ArrayList A0S = 00k.A0S(list, C66582MXn.A0z(i));
            ArrayList A0r = AnonymousClass7TG.A0r(A0S);
            Iterator it = A0S.iterator();
            while (it.hasNext()) {
                AnonymousClass7TE.A1Y(A0r, (long) AnonymousClass7TG.A0F(it));
            }
            oMd.A00(str2, A0r, 7035, 2);
            oMd.A01(str2, false);
            C372178zu A002 = C372178zu.A0A.A00();
            if (A002 != null) {
                OQ5.A01(ozm2.A00, this.A04, A002, (String) null, str2);
            }
            C66957Mfq A003 = C66957Mfq.A0A.A00();
            if (A003 != null) {
                OQ5.A00(A003, ozm2.A00, this.A04, (String) null, str2);
            }
            Exception exc = new Exception("Thread is still missing after ThreadSnapshot operation");
            nqw = new NQW();
            nqw.A09(exc);
        }
        nqw.A03(new C72221Oyp((Object) this.A02, 6));
        return C60340gF.A00;
    }
}
