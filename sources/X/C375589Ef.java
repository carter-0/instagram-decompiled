package X;

import android.util.Log;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9Ef  reason: invalid class name and case insensitive filesystem */
public abstract class C375589Ef {
    public AnonymousClass3DG A00;
    public UUID A01;
    public boolean A02;
    public final Set A03;

    public final void A02(C255343ty r2) {
        0qQ.A0B(r2, 0);
        this.A00.A0B = r2;
    }

    public final void A03(Integer num, TimeUnit timeUnit, long j) {
        this.A02 = true;
        AnonymousClass3DG r2 = this.A00;
        r2.A0F = num;
        long millis = timeUnit.toMillis(j);
        if (millis > 18000000) {
            AnonymousClass389.A00();
            Log.w(AnonymousClass3DG.A0O, "Backoff delay duration exceeds maximum value");
        }
        if (millis < 10000) {
            AnonymousClass389.A00();
            Log.w(AnonymousClass3DG.A0O, "Backoff delay duration less than minimum value");
        }
        r2.A03 = C229632nm.A06(millis, 10000, 18000000);
    }

    public final void A04(String str) {
        0qQ.A0B(str, 0);
        this.A03.add(str);
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [java.lang.Object, X.3tw] */
    /* JADX WARNING: type inference failed for: r8v0, types: [java.lang.Object, X.3tw] */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
        if (r1.A06 != false) goto L_0x006c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C375659En A00() {
        /*
            r48 = this;
            r11 = r48
            boolean r1 = r11 instanceof X.C375579Ee
            boolean r0 = r11.A02
            if (r1 == 0) goto L_0x0034
            if (r0 == 0) goto L_0x001a
            X.3DG r0 = r11.A00
            X.3ty r0 = r0.A0B
            boolean r0 = r0.A06
            if (r0 == 0) goto L_0x001a
            java.lang.String r1 = "Cannot set backoff criteria on an idle mode job"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x001a:
            X.3DG r2 = r11.A00
            boolean r0 = r2.A0J
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x002c
            java.util.UUID r1 = r11.A01
            java.util.Set r0 = r11.A03
            X.9Em r10 = new X.9Em
            r10.<init>(r2, r0, r1)
            goto L_0x0051
        L_0x002c:
            java.lang.String r1 = "PeriodicWorkRequests cannot be expedited"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0034:
            if (r0 == 0) goto L_0x0046
            X.3DG r0 = r11.A00
            X.3ty r0 = r0.A0B
            boolean r0 = r0.A06
            if (r0 == 0) goto L_0x0046
            java.lang.String r1 = "Cannot set backoff criteria on an idle mode job"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0046:
            java.util.UUID r2 = r11.A01
            X.3DG r1 = r11.A00
            java.util.Set r0 = r11.A03
            X.QFt r10 = new X.QFt
            r10.<init>(r1, r0, r2)
        L_0x0051:
            X.3DG r0 = r11.A00
            X.3ty r1 = r0.A0B
            java.util.Set r0 = r1.A03
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x006c
            boolean r0 = r1.A04
            if (r0 != 0) goto L_0x006c
            boolean r0 = r1.A05
            if (r0 != 0) goto L_0x006c
            boolean r0 = r1.A06
            r2 = 0
            if (r0 == 0) goto L_0x006d
        L_0x006c:
            r2 = 1
        L_0x006d:
            X.3DG r1 = r11.A00
            boolean r0 = r1.A0J
            if (r0 == 0) goto L_0x008f
            r0 = r2 ^ 1
            if (r0 == 0) goto L_0x0087
            long r3 = r1.A05
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x008f
            java.lang.String r1 = "Expedited jobs cannot be delayed"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0087:
            java.lang.String r1 = "Expedited jobs only support network and storage constraints"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x008f:
            java.util.UUID r0 = java.util.UUID.randomUUID()
            X.0qQ.A07(r0)
            r11.A01 = r0
            java.lang.String r21 = r0.toString()
            X.0qQ.A07(r21)
            X.3DG r9 = r11.A00
            java.lang.String r0 = r9.A0I
            r47 = r0
            X.39t r0 = r9.A0E
            r18 = r0
            java.lang.String r0 = r9.A0H
            r46 = r0
            X.3tw r0 = r9.A0C
            X.3tw r12 = new X.3tw
            r12.<init>()
            java.util.Map r1 = r0.A00
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r1)
            r12.A00 = r0
            X.3tw r0 = r9.A0D
            X.3tw r8 = new X.3tw
            r8.<init>()
            java.util.Map r1 = r0.A00
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r1)
            r8.A00 = r0
            long r0 = r9.A05
            r31 = r0
            long r0 = r9.A06
            r33 = r0
            long r0 = r9.A04
            r22 = r0
            X.3ty r0 = r9.A0B
            X.3ty r13 = new X.3ty
            r13.<init>(r0)
            int r0 = r9.A02
            r24 = r0
            java.lang.Integer r0 = r9.A0F
            r19 = r0
            long r15 = r9.A03
            long r6 = r9.A07
            long r4 = r9.A08
            long r2 = r9.A0A
            boolean r0 = r9.A0J
            r17 = r0
            java.lang.Integer r0 = r9.A0G
            r20 = r0
            int r0 = r9.A01
            r25 = r0
            long r0 = r9.A09
            int r14 = r9.A00
            r27 = r14
            int r9 = r9.A0L
            r14 = r9
            r26 = 0
            X.3DG r9 = new X.3DG
            r28 = r14
            r29 = r31
            r31 = r33
            r33 = r22
            r35 = r15
            r37 = r6
            r39 = r4
            r41 = r2
            r43 = r0
            r45 = r17
            r14 = r9
            r15 = r13
            r16 = r12
            r17 = r8
            r22 = r47
            r23 = r46
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r31, r33, r35, r37, r39, r41, r43, r45)
            r11.A00 = r9
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C375589Ef.A00():X.9En");
    }

    public final void A01(long j, TimeUnit timeUnit) {
        this.A00.A05 = timeUnit.toMillis(j);
        if (Long.MAX_VALUE - System.currentTimeMillis() <= this.A00.A05) {
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }
    }

    public C375589Ef(Class cls) {
        UUID randomUUID = UUID.randomUUID();
        0qQ.A07(randomUUID);
        this.A01 = randomUUID;
        String obj = randomUUID.toString();
        0qQ.A07(obj);
        String name = cls.getName();
        0qQ.A07(name);
        this.A00 = new AnonymousClass3DG(obj, name);
        this.A03 = 0sc.A06(new String[]{name});
    }
}
