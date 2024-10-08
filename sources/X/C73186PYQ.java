package X;

import android.content.res.Resources;

/* renamed from: X.PYQ  reason: case insensitive filesystem */
public final class C73186PYQ implements Runnable {
    public final /* synthetic */ C266444Yx A00;
    public final /* synthetic */ C67714MtT A01;

    public C73186PYQ(C266444Yx r1, C67714MtT mtT) {
        this.A01 = mtT;
        this.A00 = r1;
    }

    public final void run() {
        1xC r4 = 1xC.A01;
        C310336ap A0a = DbS.A0a();
        A0a.A0C(C310346aq.SUCCESS);
        Resources A0A = AnonymousClass7TF.A0A(this.A01.A0D());
        C266444Yx r1 = this.A00;
        0qQ.A0B(r1, 1);
        A0a.A0D = r1.A00(A0A);
        DbY.A1K(r4, A0a);
    }
}
