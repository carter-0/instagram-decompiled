package X;

import android.content.Context;
import java.io.File;
import java.util.concurrent.ExecutorService;

public final class S30 {
    public Context A00;
    public C13724Tfu A01;
    public C13725Tfv A02;
    public C13590TdI A03;
    public C13780Tgv A04;
    public C13598TdQ A05;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.S30, java.lang.Object] */
    public static S30 A00(Context context, C13725Tfv tfv, C13590TdI tdI, C13780Tgv tgv, C13598TdQ tdQ) {
        ? obj = new Object();
        obj.A00 = context;
        obj.A05 = tdQ;
        obj.A03 = tdI;
        obj.A02 = tfv;
        obj.A04 = tgv;
        return obj;
    }

    public final C13855Tia A01(SJL sjl, C266754aI r15, C10862RzN rzN, C13726Tfw tfw, ExecutorService executorService, boolean z) {
        boolean z2;
        C10862RzN rzN2 = rzN;
        C7334Q4k q4k = rzN2.A0B;
        if (q4k instanceof C7967QeF) {
            z2 = 182.A06(0Tu.A05, ((C7967QeF) q4k).A00, 36316190465265742L);
        } else {
            z2 = false;
        }
        File file = r15.A04;
        if (file != null) {
            Q1U.A00(file.getPath(), "video/mp4", z2);
        }
        C13726Tfw tfw2 = tfw;
        if (r15.A01(z2)) {
            Context context = this.A00;
            C13724Tfu tfu = this.A01;
            tfu.getClass();
            return new C12375SsO(context, tfu, rzN2, tfw2);
        }
        Context context2 = this.A00;
        C13598TdQ tdQ = this.A05;
        return new Q1S(context2, this.A02, sjl, this.A03, this.A04, rzN2, tfw2, tdQ, executorService, z);
    }
}
