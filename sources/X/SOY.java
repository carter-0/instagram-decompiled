package X;

import android.util.SparseArray;
import java.util.List;

public final class SOY {
    public static final SOY A00 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0065, code lost:
        if (r0 == false) goto L_0x0067;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02(X.C276694tk r9, java.lang.Object r10, java.lang.Object r11, long r12, boolean r14) {
        /*
            r8 = this;
            r2 = 3
            X.0qQ.A0B(r11, r2)
            r0 = 60
            long r12 = r12 >>> r0
            int r1 = (int) r12
            boolean r0 = X.C250563lf.A0n(r1)
            r7 = 0
            if (r0 == 0) goto L_0x0133
            r0 = 1
            if (r1 == r0) goto L_0x011f
            r0 = 2
            if (r1 == r0) goto L_0x0100
            if (r1 == r2) goto L_0x008d
            r0 = 4
            if (r1 == r0) goto L_0x003b
            r0 = 5
            if (r1 != r0) goto L_0x0027
            r3 = 1
            if (r14 != 0) goto L_0x0132
            X.Rt1 r11 = (X.C10486Rt1) r11     // Catch:{ Exception -> 0x0133 }
            X.4tV r0 = r11.A01     // Catch:{ Exception -> 0x0133 }
            if (r0 != r10) goto L_0x0131
            return r3
        L_0x0027:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0133 }
            java.lang.Object[] r1 = new java.lang.Object[]{r0}     // Catch:{ Exception -> 0x0133 }
            r0 = 2383(0x94f, float:3.339E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ Exception -> 0x0133 }
            java.lang.IllegalArgumentException r0 = X.Pxf.A0X(r0, r1)     // Catch:{ Exception -> 0x0133 }
            goto L_0x011c
        L_0x003b:
            X.S6O r11 = (X.S6O) r11     // Catch:{ Exception -> 0x0133 }
            boolean r0 = r10 instanceof X.S6C     // Catch:{ Exception -> 0x0133 }
            if (r0 == 0) goto L_0x0118
            X.S6C r10 = (X.S6C) r10     // Catch:{ Exception -> 0x0133 }
            if (r10 == 0) goto L_0x0118
            int r2 = r10.A01     // Catch:{ Exception -> 0x0133 }
            int r5 = r10.A00     // Catch:{ Exception -> 0x0133 }
            X.4tV r4 = r10.A02     // Catch:{ Exception -> 0x0133 }
            int r1 = r11.A01     // Catch:{ Exception -> 0x0133 }
            X.2Ta r3 = r11.A02     // Catch:{ Exception -> 0x0133 }
            int r0 = r3.getWidth()     // Catch:{ Exception -> 0x0133 }
            boolean r0 = X.Q33.A00(r1, r2, r0)     // Catch:{ Exception -> 0x0133 }
            r2 = 1
            if (r0 == 0) goto L_0x0067
            int r1 = r11.A00     // Catch:{ Exception -> 0x0133 }
            int r0 = r3.getHeight()     // Catch:{ Exception -> 0x0133 }
            boolean r0 = X.Q33.A00(r1, r5, r0)     // Catch:{ Exception -> 0x0133 }
            r3 = 1
            if (r0 != 0) goto L_0x0068
        L_0x0067:
            r3 = 0
        L_0x0068:
            if (r14 != 0) goto L_0x0132
            X.4tV r0 = r11.A03     // Catch:{ Exception -> 0x0133 }
            if (r0 != r4) goto L_0x008b
            if (r3 == 0) goto L_0x008b
            int r1 = r4.A04     // Catch:{ Exception -> 0x0133 }
            r0 = 13317(0x3405, float:1.8661E-41)
            if (r1 == r0) goto L_0x008b
            r0 = 13387(0x344b, float:1.8759E-41)
            if (r1 == r0) goto L_0x008b
            r0 = 14093(0x370d, float:1.9748E-41)
            if (r1 == r0) goto L_0x008b
            r0 = 16071(0x3ec7, float:2.252E-41)
            if (r1 == r0) goto L_0x008b
            r0 = 16181(0x3f35, float:2.2674E-41)
            if (r1 == r0) goto L_0x008b
            r0 = 16468(0x4054, float:2.3077E-41)
            if (r1 == r0) goto L_0x008b
            return r2
        L_0x008b:
            r2 = 0
            return r2
        L_0x008d:
            if (r14 != 0) goto L_0x011d
            boolean r0 = r10 instanceof X.C10632RvQ     // Catch:{ Exception -> 0x0133 }
            if (r0 == 0) goto L_0x00fb
            X.RvQ r10 = (X.C10632RvQ) r10     // Catch:{ Exception -> 0x0133 }
            if (r10 == 0) goto L_0x00fb
            X.Rt2 r11 = (X.C10487Rt2) r11     // Catch:{ Exception -> 0x0133 }
            X.4tV r1 = r11.A01     // Catch:{ Exception -> 0x0133 }
            X.4tV r0 = r10.A02     // Catch:{ Exception -> 0x0133 }
            if (r1 != r0) goto L_0x0131
            X.S4m r1 = r9.A02     // Catch:{ Exception -> 0x0133 }
            int r6 = r0.A03     // Catch:{ Exception -> 0x0133 }
            java.lang.Object r5 = r1.A02     // Catch:{ Exception -> 0x0133 }
            monitor-enter(r5)     // Catch:{ Exception -> 0x0133 }
            android.util.SparseArray r0 = r1.A00     // Catch:{ all -> 0x00f8 }
            java.lang.Object r4 = r0.get(r6)     // Catch:{ all -> 0x00f8 }
            java.util.List r0 = r1.A03     // Catch:{ all -> 0x00f8 }
            r3 = 0
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x00f8 }
        L_0x00b3:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x00f8 }
            if (r0 == 0) goto L_0x00cd
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x00f8 }
            X.Spk r1 = (X.C12230Spk) r1     // Catch:{ all -> 0x00f8 }
            int r0 = r1.A00     // Catch:{ all -> 0x00f8 }
            if (r0 != r6) goto L_0x00b3
            if (r3 != 0) goto L_0x00c9
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x00f8 }
        L_0x00c9:
            r3.add(r1)     // Catch:{ all -> 0x00f8 }
            goto L_0x00b3
        L_0x00cd:
            monitor-exit(r5)     // Catch:{ Exception -> 0x0133 }
            if (r3 == 0) goto L_0x00ee
            boolean r0 = r3.isEmpty()     // Catch:{ Exception -> 0x0133 }
            if (r0 != 0) goto L_0x00ee
            java.util.Iterator r2 = r3.iterator()     // Catch:{ Exception -> 0x0133 }
            r1 = r4
        L_0x00db:
            boolean r0 = r2.hasNext()     // Catch:{ Exception -> 0x0133 }
            if (r0 == 0) goto L_0x00ef
            java.lang.Object r0 = r2.next()     // Catch:{ Exception -> 0x0133 }
            X.Spk r0 = (X.C12230Spk) r0     // Catch:{ Exception -> 0x0133 }
            X.1MD r0 = r0.A01     // Catch:{ Exception -> 0x0133 }
            java.lang.Object r1 = r0.apply(r1)     // Catch:{ Exception -> 0x0133 }
            goto L_0x00db
        L_0x00ee:
            r1 = r4
        L_0x00ef:
            r10.A00 = r1     // Catch:{ Exception -> 0x0133 }
            r10.A01 = r3     // Catch:{ Exception -> 0x0133 }
            boolean r3 = X.Q06.A00(r1, r4)     // Catch:{ Exception -> 0x0133 }
            return r3
        L_0x00f8:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ Exception -> 0x0133 }
            goto L_0x011c
        L_0x00fb:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ Exception -> 0x0133 }
            goto L_0x011c
        L_0x0100:
            if (r14 != 0) goto L_0x011d
            X.R9Z r11 = (X.R9Z) r11     // Catch:{ Exception -> 0x0133 }
            boolean r0 = X.0u4.A08(r10)     // Catch:{ Exception -> 0x0133 }
            if (r0 == 0) goto L_0x0113
            if (r10 == 0) goto L_0x0113
            java.util.List r0 = r11.A00     // Catch:{ Exception -> 0x0133 }
            boolean r3 = X.Q06.A00(r10, r0)     // Catch:{ Exception -> 0x0133 }
            return r3
        L_0x0113:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ Exception -> 0x0133 }
            goto L_0x011c
        L_0x0118:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ Exception -> 0x0133 }
        L_0x011c:
            throw r0     // Catch:{ Exception -> 0x0133 }
        L_0x011d:
            r3 = 1
            return r3
        L_0x011f:
            r3 = 1
            if (r14 != 0) goto L_0x0132
            X.R9a r11 = (X.C8774R9a) r11     // Catch:{ Exception -> 0x0133 }
            java.lang.String[] r1 = r11.A02     // Catch:{ Exception -> 0x0133 }
            if (r1 == 0) goto L_0x0132
            X.S53 r0 = r9.A01     // Catch:{ Exception -> 0x0133 }
            boolean r0 = r0.A01(r1)     // Catch:{ Exception -> 0x0133 }
            if (r0 != 0) goto L_0x0131
            return r3
        L_0x0131:
            r3 = 0
        L_0x0132:
            return r3
        L_0x0133:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SOY.A02(X.4tk, java.lang.Object, java.lang.Object, long, boolean):boolean");
    }

    public static final C8774R9a A00(Exception exc, Object obj, long j) {
        S6N s6n;
        int i = (int) (j >>> 60);
        if (C250563lf.A0n(i)) {
            if (i != 1) {
                if (!(i == 2 || i == 3 || i == 4 || i == 5)) {
                    exc = DbZ.A0Z(Integer.valueOf(i));
                }
            } else if ((obj instanceof S6N) && (s6n = (S6N) obj) != null) {
                C8774R9a r9a = new C8774R9a((SparseArray) null, s6n.A03, (List) null, (String[]) null);
                0qQ.A0C(r9a, "null cannot be cast to non-null type T of com.instagram.common.bloks.signals.SignalHelper.handleErrorWithFallback");
                return r9a;
            }
        }
        throw exc;
    }

    public final String A01(long j) {
        int i = (int) (j >>> 60);
        switch (i) {
            case 0:
                return "Test";
            case 1:
                return "AttributeBinding";
            case 2:
                return "MergeList";
            case 3:
                return "Resolve";
            case 4:
                return "Layout";
            case 5:
                return "RenderUnit";
            case 6:
                return "MountBinder";
            case 7:
                return "Extension";
            case 8:
                return "RUExecution";
            default:
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append("Unknown signal type: ");
                A1A.append(i);
                throw AnonymousClass7TE.A0w(Pxg.A0u(" for signal with id: ", A1A, j));
        }
    }
}
