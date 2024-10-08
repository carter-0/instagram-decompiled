package X;

import com.facebook.exoplayer.monitor.VpsEventCallback;
import java.io.IOException;

/* renamed from: X.5fK  reason: invalid class name and case insensitive filesystem */
public final class C290445fK implements C250813m6 {
    public int A00;
    public long A01;
    public long A02;
    public String A03;
    public final 28b A04;
    public final VpsEventCallback A05;
    public final C264014Of A06;
    public final C290435fJ A07;

    public final void Czk(C257113ws r1, C257263x7 r2, int i, boolean z) {
    }

    public final void DFs(C257183wz r1, long j, long j2, long j3) {
    }

    public final void DFt(long j, long j2) {
    }

    public final void DtW() {
    }

    public final void DtX(C257113ws r1, C257263x7 r2, boolean z) {
    }

    public final void DtY(IOException iOException) {
    }

    public final void Dtb(String str, Object obj) {
        Object obj2 = obj;
        if ("live_trace".equals(str)) {
            2AC r5 = (2AC) obj2;
            if (this.A03 != null) {
                int i = (int) (r5.A00 - this.A02);
                for (int i2 = 0; i2 < r5.A07.length; i2++) {
                    VpsEventCallback vpsEventCallback = this.A05;
                    long j = this.A01;
                    this.A01 = 1 + j;
                    vpsEventCallback.callback(new UUA(r5, this.A03, r5.A01, i2, i, this.A00, j));
                    this.A07.A01(new C18466VsG(r5, i2, false));
                }
            }
        }
    }

    public final void Dtf(C257113ws r1, C257263x7 r2, boolean z, boolean z2) {
    }

    public final void EUi(String str) {
    }

    public final void A00(C18466VsG vsG) {
        String str = this.A03;
        if (str != null) {
            long currentTimeMillis = System.currentTimeMillis();
            VpsEventCallback vpsEventCallback = this.A05;
            C18466VsG vsG2 = vsG;
            2AC r5 = vsG2.A01;
            int i = vsG2.A00;
            long j = this.A01;
            this.A01 = 1 + j;
            int i2 = this.A00;
            boolean z = vsG2.A02;
            2Z1 r6 = 2Z1.A0E;
            AnonymousClass2AE r0 = 2AC.A09;
            vpsEventCallback.callback(new UUC(r5, r6, r0.A00, r0.A03, str, i, i2, j, currentTimeMillis, z));
            long[] jArr = {r5.A07[i].A01};
            if (this.A03 != null) {
                this.A06.DNz(new C17183VLn(jArr));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r3.equals(r2.A03) != false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(java.lang.String r28, java.lang.String r29, int r30) {
        /*
            r27 = this;
            r2 = r27
            r3 = r29
            if (r29 == 0) goto L_0x000f
            java.lang.String r0 = r2.A03
            boolean r1 = r3.equals(r0)
            r0 = 1
            if (r1 == 0) goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A03 = r3
            r1 = r30
            r2.A00 = r1
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x007a
            long r25 = java.lang.System.currentTimeMillis()
            java.util.HashMap r23 = new java.util.HashMap
            r23.<init>()
            java.lang.String r18 = ""
            java.lang.String r22 = "STREAM_INFO"
            X.2AE r0 = X.2AC.A09
            double r0 = java.lang.Math.random()
            r4 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            double r0 = r0 * r4
            long r4 = (long) r0
            r0 = 0
            r8 = 0
            X.VQz r6 = new X.VQz
            r6.<init>(r4, r0)
            r16 = 0
            X.VQz[] r24 = new X.C17320VQz[]{r6}
            X.2AC r5 = new X.2AC
            r19 = r28
            r17 = r5
            r20 = r8
            r21 = r8
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            if (r29 == 0) goto L_0x007a
            r10 = 0
        L_0x0055:
            X.VQz[] r0 = r5.A07
            int r0 = r0.length
            if (r10 >= r0) goto L_0x007a
            com.facebook.exoplayer.monitor.VpsEventCallback r3 = r2.A05
            long r12 = r2.A01
            r0 = 1
            long r0 = r0 + r12
            r2.A01 = r0
            java.lang.String r9 = r2.A03
            int r11 = r2.A00
            X.2Z1 r6 = X.2Z1.A08
            X.2AE r0 = X.2AC.A09
            java.lang.String r7 = r0.A03
            long r14 = r5.A00
            X.UU7 r4 = new X.UU7
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r14, r16)
            r3.callback(r4)
            int r10 = r10 + 1
            goto L_0x0055
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C290445fK.A01(java.lang.String, java.lang.String, int):void");
    }

    public C290445fK(28b r3, VpsEventCallback vpsEventCallback, C264014Of r5, C290435fJ r6) {
        this.A01 = 0;
        this.A05 = vpsEventCallback;
        this.A07 = r6;
        this.A04 = r3;
        this.A06 = r5;
    }

    public final void Dtd(C257183wz r3, C257263x7 r4) {
        this.A02 = System.currentTimeMillis();
    }

    public C290445fK() {
    }
}
