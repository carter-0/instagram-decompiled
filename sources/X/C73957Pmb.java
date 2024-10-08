package X;

import com.instagram.direct.msys.reverb.InstamadilloLoggingContext;
import java.util.List;

/* renamed from: X.Pmb  reason: case insensitive filesystem */
public final class C73957Pmb extends 0Yg implements 0sP {
    public final /* synthetic */ long A00;
    public final /* synthetic */ OKF A01;
    public final /* synthetic */ C331237Qc A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ 0sP A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73957Pmb(OKF okf, C331237Qc r3, List list, List list2, 0sP r6, long j) {
        super(1);
        this.A00 = j;
        this.A04 = list;
        this.A01 = okf;
        this.A02 = r3;
        this.A05 = r6;
        this.A03 = list2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        NAZ naz = (NAZ) obj;
        0qQ.A0B(naz, 0);
        long j = this.A00;
        String valueOf = String.valueOf(j);
        List list = this.A04;
        OKF okf = this.A01;
        C331237Qc r7 = this.A02;
        naz.A00(new C71680Ooz(1, j, this.A03, this.A05, okf, r7), (InstamadilloLoggingContext) null, valueOf, list, (List) null, false);
        return C60340gF.A00;
    }
}
