package X;

import java.util.concurrent.Callable;

/* renamed from: X.Tyt  reason: case insensitive filesystem */
public final class C14589Tyt implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C14585Typ A03;
    public final /* synthetic */ C14588Tys A04;
    public final /* synthetic */ C14588Tys A05;
    public final /* synthetic */ AnonymousClass6TA A06;
    public final /* synthetic */ C244943c0 A07;
    public final /* synthetic */ C276544tV A08;
    public final /* synthetic */ C276694tk A09;
    public final /* synthetic */ boolean A0A;

    public C14589Tyt(C14585Typ typ, C14588Tys tys, C14588Tys tys2, AnonymousClass6TA r4, C244943c0 r5, C276544tV r6, C276694tk r7, int i, int i2, int i3, boolean z) {
        this.A05 = tys;
        this.A04 = tys2;
        this.A08 = r6;
        this.A09 = r7;
        this.A07 = r5;
        this.A03 = typ;
        this.A00 = i;
        this.A06 = r4;
        this.A02 = i2;
        this.A01 = i3;
        this.A0A = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x012d, code lost:
        if (X.0qQ.A00(r10.A00 ^ X.AnonymousClass972.MUTABLE_FLAG_MASK, r0.A00 ^ X.AnonymousClass972.MUTABLE_FLAG_MASK) <= 0) goto L_0x012f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0109  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r22 = this;
            r1 = r22
            X.Tys r7 = r1.A05
            int r6 = r7.A00()
            X.Tys r5 = r1.A04
            int r3 = r5.A00()
            X.4tV r2 = r1.A08
            X.4tk r0 = r1.A09
            r21 = r0
            X.3c0 r0 = r1.A07
            r20 = r0
            X.Typ r4 = r1.A03
            long r12 = X.C244873bt.A00(r6, r3)
            r6 = 1
            r8 = r4
            r9 = r0
            r10 = r2
            r11 = r21
            r14 = r6
            X.6Sh r8 = X.C14586Tyq.A02(r8, r9, r10, r11, r12, r14)
            r4.A01(r8, r2, r6)
            boolean r0 = r7.A02()
            if (r0 == 0) goto L_0x0039
            boolean r0 = r5.A02()
            if (r0 == 0) goto L_0x0039
        L_0x0038:
            return r8
        L_0x0039:
            X.3dH r0 = r8.A01
            int r7 = r0.A01()
            int r5 = r0.A00()
            int r3 = r1.A00
            X.6TA r0 = r1.A06
            r19 = r0
            int r9 = r1.A02
            int r0 = r1.A01
            boolean r14 = r1.A0A
            X.4tV r17 = X.C14587Tyr.A00(r2)
            if (r17 != 0) goto L_0x0086
            X.8eN r10 = new X.8eN
            r10.<init>(r7)
            X.8eN r0 = new X.8eN
            r0.<init>(r5)
        L_0x005f:
            int r1 = r10.A00
            int r3 = r0.A00
            if (r1 != r7) goto L_0x0067
            if (r3 == r5) goto L_0x0038
        L_0x0067:
            int r0 = X.AnonymousClass3XX.A00
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0)
            long r8 = X.C244873bt.A00(r1, r0)
            r0 = 0
            r5 = r20
            r6 = r2
            r7 = r21
            r10 = r0
            X.6Sh r8 = X.C14586Tyq.A02(r4, r5, r6, r7, r8, r10)
            r4.A01(r8, r2, r0)
            return r8
        L_0x0086:
            r11 = r5
            r18 = r7
            if (r3 != r6) goto L_0x008e
            r11 = r7
            r18 = r5
        L_0x008e:
            int r13 = android.view.View.MeasureSpec.getMode(r0)
            int r1 = android.view.View.MeasureSpec.getSize(r0)
            int r10 = android.view.View.MeasureSpec.getMode(r9)
            int r9 = android.view.View.MeasureSpec.getSize(r9)
            X.4tV r0 = X.C14587Tyr.A00(r2)
            X.Tys r16 = X.C14586Tyq.A01(r0, r10, r9, r3)
            X.4tV r0 = X.C14587Tyr.A00(r2)
            X.Tys r10 = X.C14586Tyq.A00(r0, r13, r1, r3)
            X.4tV r15 = X.C14587Tyr.A00(r2)
            r12 = 0
            if (r13 == 0) goto L_0x00b6
            r12 = r1
        L_0x00b6:
            r9 = 0
            if (r3 != r6) goto L_0x013e
            if (r15 == 0) goto L_0x0144
            r0 = 41
        L_0x00bd:
            java.lang.String r0 = r15.A0K(r0)
        L_0x00c1:
            X.8eN r9 = X.C14586Tyq.A04(r0, r9, r12)
            if (r9 == 0) goto L_0x00d2
            int r0 = r9.A00
            int r0 = r10.A01(r0)
            X.8eN r9 = new X.8eN
            r9.<init>(r0)
        L_0x00d2:
            java.lang.Float r0 = X.C14587Tyr.A01(r17)
            if (r0 == 0) goto L_0x0109
            double r11 = X.C291925i6.A00(r18)
            float r0 = r0.floatValue()
            double r0 = (double) r0
            if (r3 != r6) goto L_0x0107
            double r11 = r11 * r0
        L_0x00e4:
            int r11 = X.AnonymousClass1GB.A00(r11)
        L_0x00e8:
            int r9 = r10.A01(r11)
            r1 = r16
            r0 = r18
            int r1 = r1.A01(r0)
            r0 = r1
            if (r3 != r6) goto L_0x00f8
            r0 = r9
        L_0x00f8:
            X.8eN r10 = new X.8eN
            r10.<init>(r0)
            if (r3 != r6) goto L_0x0100
            r9 = r1
        L_0x0100:
            X.8eN r0 = new X.8eN
            r0.<init>(r9)
            goto L_0x005f
        L_0x0107:
            double r11 = r11 / r0
            goto L_0x00e4
        L_0x0109:
            r12 = 0
            if (r13 == 0) goto L_0x010d
            r12 = r1
        L_0x010d:
            if (r14 == 0) goto L_0x00e8
            X.6TA r1 = X.AnonymousClass6TA.STRETCH
            r0 = r19
            if (r0 != r1) goto L_0x00e8
            if (r9 != 0) goto L_0x00e8
            boolean r0 = r10.A02()
            if (r0 != 0) goto L_0x00e8
            X.8eN r0 = r10.A01
            if (r0 == 0) goto L_0x012f
            int r9 = r10.A00
            int r1 = r0.A00
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r9 ^ r0
            r1 = r1 ^ r0
            int r0 = X.0qQ.A00(r9, r1)
            if (r0 > 0) goto L_0x00e8
        L_0x012f:
            int r9 = r10.A01(r12)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r11 ^ r0
            r0 = r0 ^ r9
            if (r1 == r0) goto L_0x00e8
            if (r1 >= r0) goto L_0x00e8
            r11 = r9
            goto L_0x00e8
        L_0x013e:
            if (r15 == 0) goto L_0x0144
            r0 = 35
            goto L_0x00bd
        L_0x0144:
            r0 = r9
            goto L_0x00c1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14589Tyt.call():java.lang.Object");
    }
}
