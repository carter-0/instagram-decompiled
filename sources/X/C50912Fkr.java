package X;

import com.instagram.registration.model.RegFlowExtras;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Fkr  reason: case insensitive filesystem */
public final class C50912Fkr implements G6L {
    public final /* synthetic */ AnonymousClass4DH A00;
    public final /* synthetic */ AnonymousClass0aP A01;
    public final /* synthetic */ C47698EDh A02;
    public final /* synthetic */ RegFlowExtras A03;
    public final /* synthetic */ EXD A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ AtomicInteger A06;

    public C50912Fkr(AnonymousClass4DH r1, AnonymousClass0aP r2, C47698EDh eDh, RegFlowExtras regFlowExtras, EXD exd, Integer num, AtomicInteger atomicInteger) {
        this.A01 = r2;
        this.A06 = atomicInteger;
        this.A03 = regFlowExtras;
        this.A04 = exd;
        this.A00 = r1;
        this.A02 = eDh;
        this.A05 = num;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002c, code lost:
        if (r1 < 600) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ADD(X.C268654dm r22, X.C49679F1m r23) {
        /*
            r21 = this;
            r6 = r21
            X.0aP r10 = r6.A01
            X.02m r2 = X.02m.A0p
            r1 = 4197923(0x400e23, float:5.882543E-39)
            r0 = 3
            r2.markerEnd(r1, r0)
            r5 = r22
            java.lang.Throwable r0 = r5.A01()
            r4 = r23
            if (r0 != 0) goto L_0x002e
            boolean r0 = r5 instanceof X.C268674do
            if (r0 == 0) goto L_0x002e
            java.lang.Object r0 = r5.A00()
            r0.getClass()
            X.1XQ r0 = (X.1XQ) r0
            int r1 = r0.mStatusCode
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 < r0) goto L_0x00d7
            r0 = 600(0x258, float:8.41E-43)
            if (r1 >= r0) goto L_0x00d7
        L_0x002e:
            java.util.concurrent.atomic.AtomicInteger r2 = r6.A06
            int r0 = r2.get()
            r9 = 1
            if (r0 != r9) goto L_0x00d7
            com.instagram.registration.model.RegFlowExtras r7 = r6.A03
            java.lang.String r0 = r7.A0Z
            if (r0 == 0) goto L_0x00d7
            java.lang.String r0 = r7.A0P
            if (r0 == 0) goto L_0x00d7
            java.lang.Integer r1 = X.C50144FRb.A00()
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 == r0) goto L_0x00d7
            X.1Q0 r0 = X.1Q0.A1J
            X.FGI r3 = r0.A02(r10)
            X.DiE r1 = X.C46634DiE.DONE
            X.EXD r0 = r6.A04
            X.FBm r8 = r3.A06(r0, r1)
            java.lang.Integer r0 = X.C50144FRb.A00()
            java.lang.String r3 = X.C49108EpX.A00(r0)
            int r1 = r2.get()
            java.lang.String r0 = "retry_strategy"
            r8.A04(r0, r3)
            java.lang.String r0 = "attempt_count"
            r8.A03(r0, r1)
            r8.A02()
            java.lang.Integer r0 = X.C50144FRb.A00()
            int r1 = r0.intValue()
            if (r1 == r9) goto L_0x0091
            r0 = 2
            if (r1 != r0) goto L_0x008a
            r2.incrementAndGet()
            X.4DH r2 = r6.A00
            java.lang.Integer r1 = r6.A05
            X.EDh r0 = r6.A02
            X.C50144FRb.A05(r2, r10, r0, r7, r1)
            return
        L_0x008a:
            java.lang.String r0 = "Unsupported retry strategy type."
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0091:
            X.4DH r3 = r6.A00
            java.lang.String r12 = X.DbZ.A0i(r3)
            X.0qv r1 = X.0qv.A02
            android.content.Context r0 = r3.requireContext()
            java.lang.String r15 = r1.A05(r0)
            r2.incrementAndGet()
            java.lang.String r2 = r7.A0Z
            java.lang.String r1 = ""
            java.util.regex.Pattern r0 = X.0mp.A01
            if (r2 != 0) goto L_0x00ad
            r2 = r1
        L_0x00ad:
            java.lang.String r0 = r7.A0P
            if (r0 != 0) goto L_0x00b2
            r0 = r1
        L_0x00b2:
            int r20 = X.FGv.A00()
            r11 = 0
            r13 = r11
            r14 = r11
            r17 = r11
            r19 = r11
            r16 = r0
            r18 = r2
            X.1OC r1 = X.FHA.A0D(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r12 = 7
            X.EDW r0 = new X.EDW
            r11 = r0
            r13 = r5
            r14 = r6
            r15 = r4
            r16 = r10
            r11.<init>(r12, r13, r14, r15, r16)
            r1.A00 = r0
            r3.schedule(r1)
            return
        L_0x00d7:
            r4.A00(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50912Fkr.ADD(X.4dm, X.F1m):void");
    }
}
