package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.3Pv  reason: invalid class name and case insensitive filesystem */
public abstract class C241603Pv {
    public static final Object A00(AnonymousClass4D7 r2) {
        return A01(r2, 500);
    }

    public static final Object A01(AnonymousClass4D7 r3, long j) {
        if (j > 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = 1IW.A04;
            1IW r32 = new 1IW(1, 1Ey.A02(r3));
            r32.A0I();
            if (j < Long.MAX_VALUE) {
                A04(r32.A01).EKQ(r32, j);
            }
            Object A0E = r32.A0E();
            if (A0E == 1Hj.A02) {
                return A0E;
            }
        }
        return C60340gF.A00;
    }

    public static final Object A02(AnonymousClass4D7 r3, long j) {
        long j2;
        if (j > 0) {
            j2 = AnonymousClass30M.A03(AnonymousClass30M.A05(j, AnonymousClass30K.A04(AnonymousClass30J.NANOSECONDS, 999999)));
        } else {
            j2 = 0;
        }
        Object A01 = A01(r3, j2);
        if (A01 != 1Hj.A02) {
            return C60340gF.A00;
        }
        return A01;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.7cP, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.1Hj A03(X.AnonymousClass4D7 r5) {
        /*
            boolean r0 = r5 instanceof X.C335117cP
            if (r0 == 0) goto L_0x0025
            r4 = r5
            X.7cP r4 = (X.C335117cP) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0025
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0012:
            java.lang.Object r1 = r4.A01
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x002b
            if (r0 == r2) goto L_0x0045
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0025:
            X.7cP r4 = new X.7cP
            r4.<init>(r5)
            goto L_0x0012
        L_0x002b:
            X.0eS.A00(r1)
            r4.A00 = r2
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.1IW.A04
            X.4D7 r1 = X.1Ey.A02(r4)
            X.1IW r0 = new X.1IW
            r0.<init>(r2, r1)
            r0.A0I()
            java.lang.Object r0 = r0.A0E()
            if (r0 != r3) goto L_0x0048
            return r3
        L_0x0045:
            X.0eS.A00(r1)
        L_0x0048:
            X.MCr r0 = new X.MCr
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C241603Pv.A03(X.4D7):X.1Hj");
    }

    public static final C262114Ce A04(C262094Cc r1) {
        C262114Ce r12;
        C262084Cb r13 = r1.get(C262104Cd.A00);
        if (!(r13 instanceof C262114Ce) || (r12 = (C262114Ce) r13) == null) {
            return C634912w.A00;
        }
        return r12;
    }
}
