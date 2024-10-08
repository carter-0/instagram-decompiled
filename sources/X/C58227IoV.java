package X;

import android.animation.TimeInterpolator;

/* renamed from: X.IoV  reason: case insensitive filesystem */
public final class C58227IoV extends 0Yg implements C62320sa {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C59535JNh A02;
    public final /* synthetic */ AnonymousClass3Y5 A03;
    public final /* synthetic */ C52733Gbk A04;
    public final /* synthetic */ JSK A05;
    public final /* synthetic */ C53672GsP A06;
    public final /* synthetic */ 0eP A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58227IoV(C59535JNh jNh, AnonymousClass3Y5 r3, C52733Gbk gbk, JSK jsk, C53672GsP gsP, 0eP r7, int i, long j) {
        super(0);
        this.A02 = jNh;
        this.A04 = gbk;
        this.A06 = gsP;
        this.A00 = i;
        this.A03 = r3;
        this.A01 = j;
        this.A05 = jsk;
        this.A07 = r7;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        TimeInterpolator timeInterpolator = C52689Gb1.A09;
        boolean CRB = this.A02.CRB();
        C52733Gbk gbk = this.A04;
        int i = this.A06.A00;
        int i2 = this.A00;
        float A022 = C51969G9p.A02(this.A03, this.A01);
        JSK jsk = this.A05;
        0eP r2 = this.A07;
        HLQ hlq = (HLQ) r2.A00;
        float EId = jsk.EId(hlq, false);
        HLQ hlq2 = (HLQ) r2.A01;
        return new C52689Gb1(C52692Gb4.A00(EId, jsk.EId(hlq2, false)), C52692Gb4.A00(jsk.EId(hlq, true), jsk.EId(hlq2, true)), gbk, A022, i, i2, CRB);
    }
}
