package X;

import java.nio.charset.Charset;

/* renamed from: X.7BP  reason: invalid class name */
public abstract class AnonymousClass7BP {
    public C268654dm A00 = AnonymousClass7BQ.A00();
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public C74340PtG A04;
    public boolean A05;
    public final /* synthetic */ 1bO A06;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        if (X.182.A06(X.0Tu.A05, r7.A0M, 36321473270982057L) != false) goto L_0x0042;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00() {
        /*
            r11 = this;
            r1 = r11
            X.7BO r1 = (X.AnonymousClass7BO) r1
            java.lang.String r8 = r1.A02
            if (r8 == 0) goto L_0x0093
            X.1bO r7 = r1.A06
            java.nio.charset.Charset r0 = X.1bO.A0w
            X.0eM r0 = r7.A0h
            java.lang.Object r0 = r0.getValue()
            X.2Dm r0 = (X.2Dm) r0
            X.2Dr r0 = (X.2Dr) r0
            X.3U9 r6 = r0.A0N(r8)
            if (r6 == 0) goto L_0x0042
            java.lang.Integer r2 = r6.BMT()
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r2 != r0) goto L_0x0042
            boolean r4 = r1.A04
            if (r4 != 0) goto L_0x002d
            boolean r0 = r6.CKK()
            if (r0 != 0) goto L_0x0042
        L_0x002d:
            X.3Tu r0 = r6.AiM()
            if (r0 != 0) goto L_0x0066
            com.instagram.common.session.UserSession r5 = r7.A0M
            X.0Tu r0 = X.0Tu.A05
            r2 = 36321473270982057(0x810a30000925a9, double:3.03318417917813E-306)
            boolean r0 = X.182.A06(r0, r5, r2)
            if (r0 == 0) goto L_0x0066
        L_0x0042:
            X.43N r5 = r7.A0N
            long r2 = r7.A01
            java.lang.Long r7 = java.lang.Long.valueOf(r2)
            if (r6 == 0) goto L_0x0064
            java.lang.String r9 = r6.C6P()
        L_0x0050:
            boolean r10 = r1.A04
            com.instagram.direct.perf.constants.ThreadFetchReason r6 = r1.A01
            X.6BH r5 = r5.A05(r6, r7, r8, r9, r10)
        L_0x0058:
            r1.A00 = r5
        L_0x005a:
            X.6BH r0 = r1.A00
            if (r0 == 0) goto L_0x00de
            java.util.List r0 = r0.A06
            r0.add(r1)
            return
        L_0x0064:
            r9 = 0
            goto L_0x0050
        L_0x0066:
            X.43N r0 = r7.A0N
            java.util.List r0 = X.AnonymousClass43O.A00(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x0070:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0091
            java.lang.Object r5 = r3.next()
            r2 = r5
            X.6BH r2 = (X.AnonymousClass6BH) r2
            java.lang.String r0 = r2.A02
            boolean r0 = X.0qQ.A0K(r0, r8)
            if (r0 == 0) goto L_0x0070
            java.lang.String r2 = r2.A01
            r0 = 0
            if (r2 != 0) goto L_0x008b
            r0 = 1
        L_0x008b:
            r0 = r0 ^ r4
            if (r0 == 0) goto L_0x0070
        L_0x008e:
            X.6BH r5 = (X.AnonymousClass6BH) r5
            goto L_0x0058
        L_0x0091:
            r5 = 0
            goto L_0x008e
        L_0x0093:
            java.util.List r3 = r1.A03
            if (r3 == 0) goto L_0x005a
            X.1bO r2 = r1.A06
            java.nio.charset.Charset r0 = X.1bO.A0w
            X.43N r7 = r2.A0N
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r3)
            long r2 = r2.A01
            java.lang.Long r8 = java.lang.Long.valueOf(r2)
            boolean r10 = r1.A05
            com.instagram.direct.perf.constants.ThreadFetchReason r6 = r1.A01
            java.util.List r0 = X.AnonymousClass43O.A00(r7)
            java.util.Iterator r2 = r0.iterator()
        L_0x00b4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00dc
            java.lang.Object r5 = r2.next()
            r0 = r5
            X.6BH r0 = (X.AnonymousClass6BH) r0
            java.util.List r0 = r0.A04
            boolean r0 = X.0qQ.A0K(r0, r9)
            if (r0 == 0) goto L_0x00b4
        L_0x00c9:
            X.6BH r5 = (X.AnonymousClass6BH) r5
            if (r5 != 0) goto L_0x0058
            X.6BH r5 = new X.6BH
            r5.<init>(r6, r7, r8, r9, r10)
            java.util.List r0 = r7.A0B
            r0.add(r5)
            r7.A08()
            goto L_0x0058
        L_0x00dc:
            r5 = 0
            goto L_0x00c9
        L_0x00de:
            X.1bO r6 = r1.A06
            java.nio.charset.Charset r0 = X.1bO.A0w
            long r4 = r6.A01
            r2 = -1
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r3 = 0
            if (r0 == 0) goto L_0x00ec
            r3 = 1
        L_0x00ec:
            android.os.Handler r2 = r6.A0I
            X.7BS r0 = new X.7BS
            r0.<init>(r1, r3)
            r2.post(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7BP.A00():void");
    }

    public void A01() {
        AnonymousClass7BO r1 = (AnonymousClass7BO) this;
        AnonymousClass6BH r0 = r1.A00;
        if (r0 != null) {
            r0.A06(r1);
            r1.A00 = null;
        }
    }

    public AnonymousClass7BP(C74340PtG ptG, 1bO r3) {
        this.A06 = r3;
        this.A04 = ptG;
    }

    public final void A02() {
        if (!this.A05 && !this.A01) {
            this.A05 = true;
            1bO r1 = this.A06;
            Charset charset = 1bO.A0w;
            r1.A0J.obtainMessage(9, this).sendToTarget();
            this.A04 = null;
        }
    }

    public final void A03() {
        1bO r1 = this.A06;
        Charset charset = 1bO.A0w;
        r1.A0J.obtainMessage(8, this).sendToTarget();
    }

    public final void A04(C268654dm r2, boolean z, boolean z2) {
        if (!this.A05 && !this.A01) {
            this.A01 = true;
            this.A03 = z;
            this.A02 = z2;
            this.A00 = r2;
            C74340PtG ptG = this.A04;
            if (ptG != null) {
                ptG.Dlb(this);
            }
        }
    }
}
