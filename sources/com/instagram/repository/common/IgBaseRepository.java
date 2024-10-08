package com.instagram.repository.common;

import X.05G;
import X.19E;
import X.AnonymousClass4HU;
import X.AnonymousClass4HW;
import X.C262224Cq;
import X.C335967dq;
import X.DbS;
import X.KXB;
import X.MXY;
import java.io.Closeable;
import java.util.concurrent.CancellationException;

public abstract class IgBaseRepository implements Closeable {
    public final AnonymousClass4HW A00 = C335967dq.A00(AnonymousClass4HU.A00);
    public final MemoryCache A01;
    public final MXY A02;
    public final C262224Cq A03;
    public final 05G A04;

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDt, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.repository.common.IgBaseRepository r7, X.C324516zR r8, X.C66457MSl r9, X.AnonymousClass4D7 r10) {
        /*
            r3 = 5
            boolean r0 = X.C66141MDt.A02(r3, r10)
            if (r0 == 0) goto L_0x008c
            r6 = r10
            X.MDt r6 = (X.C66141MDt) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x008c
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0015:
            java.lang.Object r2 = r6.A08
            X.1Hj r4 = X.1Hj.A02
            int r0 = r6.A00
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0044
            if (r0 == r1) goto L_0x0059
            if (r0 != r3) goto L_0x0092
            java.lang.Object r5 = r6.A07
            X.0rm r5 = (X.0rm) r5
            java.lang.Object r1 = r6.A06
            java.lang.Object r4 = r6.A05
            java.lang.Object r3 = r6.A04
            X.0rm r3 = (X.0rm) r3
            java.lang.Object r8 = r6.A02
            java.lang.Object r7 = r6.A01
            com.instagram.repository.common.IgBaseRepository r7 = (com.instagram.repository.common.IgBaseRepository) r7
            X.0eS.A00(r2)
        L_0x0038:
            com.instagram.repository.common.MemoryCache r0 = r7.A01
            if (r0 == 0) goto L_0x003f
            r0.A01(r8, r1)
        L_0x003f:
            r5.A00 = r4
        L_0x0041:
            java.lang.Object r4 = r3.A00
        L_0x0043:
            return r4
        L_0x0044:
            X.0eS.A00(r2)
            X.0rm r5 = X.C51965G9l.A11()
            X.MXY r0 = r7.A02
            X.C66141MDt.A00(r7, r8, r9, r5, r6)
            r6.A00 = r1
            java.lang.Object r2 = r0.AXI(r8, r6)
            if (r2 != r4) goto L_0x0068
            return r4
        L_0x0059:
            java.lang.Object r5 = r6.A04
            X.0rm r5 = (X.0rm) r5
            java.lang.Object r9 = r6.A03
            java.lang.Object r8 = r6.A02
            java.lang.Object r7 = r6.A01
            com.instagram.repository.common.IgBaseRepository r7 = (com.instagram.repository.common.IgBaseRepository) r7
            X.0eS.A00(r2)
        L_0x0068:
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0086
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r1 = r2.A00
            X.C66141MDt.A00(r7, r8, r9, r5, r6)
            r6.A05 = r1
            r6.A06 = r1
            r6.A07 = r5
            r6.A00 = r3
            java.lang.Object r0 = A01(r7, r1, r6)
            if (r0 == r4) goto L_0x0043
            r4 = r1
            r3 = r5
            goto L_0x0038
        L_0x0086:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0097
            r3 = r5
            goto L_0x0041
        L_0x008c:
            X.MDt r6 = new X.MDt
            r6.<init>(r7, r10, r3)
            goto L_0x0015
        L_0x0092:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0097:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.repository.common.IgBaseRepository.A00(com.instagram.repository.common.IgBaseRepository, X.6zR, X.MSl, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(com.instagram.repository.common.IgBaseRepository r6, X.AnonymousClass4D7 r7) {
        /*
            r5 = 0
            r4 = 14
            boolean r0 = X.MEA.A03(r4, r7)
            if (r0 == 0) goto L_0x002e
            r3 = r7
            X.MEA r3 = (X.MEA) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002e
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0017:
            java.lang.Object r2 = r3.A02
            int r1 = r3.A00
            r0 = 1
            if (r1 == 0) goto L_0x0042
            if (r1 != r0) goto L_0x003d
            X.0eS.A00(r2)
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = "updateToMemoryCache"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x002e:
            X.MEA r3 = new X.MEA
            r3.<init>((com.instagram.repository.common.IgBaseRepository) r6, (X.AnonymousClass4D7) r7, (int) r4)
            goto L_0x0017
        L_0x0034:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0045
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x003d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0042:
            X.0eS.A00(r2)
        L_0x0045:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.repository.common.IgBaseRepository.A02(com.instagram.repository.common.IgBaseRepository, X.4D7):java.lang.Object");
    }

    public /* synthetic */ IgBaseRepository(MemoryCache memoryCache, MXY mxy, C262224Cq r4) {
        KXB kxb = new KXB();
        this.A03 = r4;
        this.A01 = memoryCache;
        this.A02 = mxy;
        this.A04 = DbS.A10(kxb);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.instagram.repository.common.IgBaseRepository r5, java.lang.Object r6, X.AnonymousClass4D7 r7) {
        /*
            r4 = 16
            boolean r0 = X.MEA.A03(r4, r7)
            if (r0 == 0) goto L_0x002d
            r3 = r7
            X.MEA r3 = (X.MEA) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002d
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r3.A02
            int r1 = r3.A00
            r0 = 1
            if (r1 == 0) goto L_0x0049
            if (r1 != r0) goto L_0x0044
            X.0eS.A00(r2)
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0033
            java.lang.String r0 = "element"
            java.lang.NullPointerException r1 = X.AnonymousClass7TE.A11(r0)
            throw r1
        L_0x002d:
            X.MEA r3 = new X.MEA
            r3.<init>((com.instagram.repository.common.IgBaseRepository) r5, (X.AnonymousClass4D7) r7, (int) r4)
            goto L_0x0016
        L_0x0033:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = "Update exception from Local Data Source"
            X.MCv r1 = new X.MCv
            r1.<init>(r0)
            throw r1
        L_0x003f:
            X.Wub r1 = X.AnonymousClass7TE.A1K()
            throw r1
        L_0x0044:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0x()
            throw r1
        L_0x0049:
            X.0eS.A00(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.repository.common.IgBaseRepository.A01(com.instagram.repository.common.IgBaseRepository, java.lang.Object, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.4D7, X.MEA] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(X.C324516zR r12, X.C66457MSl r13, X.AnonymousClass4D7 r14) {
        /*
            r11 = this;
            r3 = 13
            boolean r0 = X.MEA.A03(r3, r14)
            r7 = r11
            if (r0 == 0) goto L_0x0048
            r4 = r14
            X.MEA r4 = (X.MEA) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0048
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0017:
            java.lang.Object r3 = r4.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x0031
            if (r0 != r1) goto L_0x004e
            X.0eS.A00(r3)
        L_0x0025:
            X.5mw r3 = (X.C294735mw) r3
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.mvvm.SingleFlightResult.Result<M of com.instagram.repository.common.IgBaseRepository?>"
            X.0qQ.A0C(r3, r0)
            X.5mv r3 = (X.C294725mv) r3
            java.lang.Object r0 = r3.A00
            return r0
        L_0x0031:
            X.0eS.A00(r3)
            X.4HW r0 = r11.A00
            r9 = 0
            r10 = 3
            X.MEN r5 = new X.MEN
            r8 = r12
            r6 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            r4.A00 = r1
            java.lang.Object r3 = r0.A00(r12, r4, r5)
            if (r3 != r2) goto L_0x0025
            return r2
        L_0x0048:
            X.MEA r4 = new X.MEA
            r4.<init>((com.instagram.repository.common.IgBaseRepository) r11, (X.AnonymousClass4D7) r14, (int) r3)
            goto L_0x0017
        L_0x004e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.repository.common.IgBaseRepository.A03(X.6zR, X.MSl, X.4D7):java.lang.Object");
    }

    public final void close() {
        19E.A05((CancellationException) null, this.A03);
    }
}
