package X;

import java.util.List;
import java.util.Set;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

public final class SzA implements C3736596k {
    public final /* synthetic */ C11329SNi A00;
    public final /* synthetic */ C10321RqJ A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ List A03;

    public SzA(C11329SNi sNi, C10321RqJ rqJ, String str, List list) {
        this.A00 = sNi;
        this.A03 = list;
        this.A01 = rqJ;
        this.A02 = str;
    }

    public final void onFailure(Exception e) {
        C10321RqJ rqJ;
        RHJ rhj;
        List list;
        String str;
        0qQ.A0B(e, 0);
        C11329SNi sNi = this.A00;
        S7S s7s = sNi.A04;
        s7s.A05((String) null);
        SNC snc = sNi.A02;
        if (e instanceof C8360QpI) {
            Set set = snc.A00;
            int i = ((RKT) e).A00.A00;
            if (Pxf.A1U(set, i)) {
                try {
                    SE4 se4 = sNi.A00;
                    int i2 = se4.A00;
                    int i3 = se4.A01;
                    if (i2 < i3) {
                        int i4 = i2;
                        if (i2 > i3) {
                            i4 = i3;
                        }
                        se4.A00 = i2 + 1;
                        RHJ A002 = RHJ.A00(i);
                        List list2 = this.A03;
                        list2.add(A002);
                        sNi.A06.schedule(new C13044TJa(sNi, this.A01, this.A02, list2), (long) ((int) (250.0d * Math.pow(2.0d, (double) i4))), TimeUnit.MILLISECONDS);
                        return;
                    }
                    throw AnonymousClass7TE.A0z("Max retries reached");
                } catch (IllegalStateException e2) {
                    e = e2;
                    s7s.A00();
                    rqJ = this.A01;
                    rhj = RHJ.A0X;
                    list = this.A03;
                    str = "Token retrieval failed after too many retries";
                } catch (RejectedExecutionException e3) {
                    e = e3;
                    s7s.A00();
                    rqJ = this.A01;
                    rhj = RHJ.A0V;
                    list = this.A03;
                    str = "Unable to schedule retry for token retrieval";
                }
            }
        }
        s7s.A00();
        rqJ = this.A01;
        rhj = RHJ.A0W;
        list = this.A03;
        str = "Retry not allowed";
        RuntimeException runtimeException = new RuntimeException(str, e);
        00k.A0S(AnonymousClass7TE.A1I(rhj), list);
        rqJ.A00.setException(runtimeException);
    }
}
