package X;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.Sqs  reason: case insensitive filesystem */
public final class C12294Sqs implements AnonymousClass46H, Serializable, Cloneable {
    public static final AnonymousClass46E A07 = new AnonymousClass46E("clientRequestId", (byte) 11, 9);
    public static final AnonymousClass46E A08 = new AnonymousClass46E("inForegroundApp", (byte) 2, 1);
    public static final AnonymousClass46E A09 = new AnonymousClass46E("inForegroundDevice", (byte) 2, 2);
    public static final AnonymousClass46E A0A = new AnonymousClass46E("keepAliveTimeout", (byte) 8, 3);
    public static final AnonymousClass46E A0B = new AnonymousClass46E("requestId", (byte) 10, 8);
    public static final AnonymousClass46E A0C = new AnonymousClass46E("subscribeGenericTopics", (byte) 15, 5);
    public static final AnonymousClass46E A0D = new AnonymousClass46E("subscribeTopics", (byte) 15, 4);
    public static final AnonymousClass46E A0E = new AnonymousClass46E("unsubscribeGenericTopics", (byte) 15, 7);
    public static final AnonymousClass46E A0F = new AnonymousClass46E("unsubscribeTopics", (byte) 15, 6);
    public static final AnonymousClass46D A0G = new Object();
    public final Boolean A00;
    public final Integer A01;
    public final String A02;
    public final List A03;
    public final List A04;
    public final List A05;
    public final List A06;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (r1 == null) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r5 = 0
            if (r7 == 0) goto L_0x00a8
            r4 = 1
            if (r6 == r7) goto L_0x0093
            boolean r0 = r7 instanceof X.C12294Sqs
            if (r0 == 0) goto L_0x00a8
            X.Sqs r7 = (X.C12294Sqs) r7
            java.lang.Boolean r3 = r6.A00
            boolean r2 = X.AnonymousClass7TF.A1V(r3)
            java.lang.Boolean r1 = r7.A00
            boolean r0 = X.AnonymousClass7TF.A1V(r1)
            r0 = r0 ^ r2
            if (r0 != 0) goto L_0x00a8
            if (r2 == 0) goto L_0x0021
            if (r3 != 0) goto L_0x00a2
            if (r1 != 0) goto L_0x00a8
        L_0x0021:
            java.lang.Integer r3 = r6.A01
            boolean r2 = X.AnonymousClass7TF.A1V(r3)
            java.lang.Integer r1 = r7.A01
            boolean r0 = X.AnonymousClass7TF.A1V(r1)
            r0 = r0 ^ r2
            if (r0 != 0) goto L_0x00a8
            if (r2 == 0) goto L_0x0036
            if (r3 != 0) goto L_0x009b
            if (r1 != 0) goto L_0x00a8
        L_0x0036:
            java.util.List r3 = r6.A04
            boolean r2 = X.AnonymousClass7TF.A1V(r3)
            java.util.List r1 = r7.A04
            boolean r0 = X.AnonymousClass7TF.A1V(r1)
            boolean r0 = X.SPv.A03(r3, r1, r2, r0)
            if (r0 == 0) goto L_0x00a8
            java.util.List r3 = r6.A03
            boolean r2 = X.AnonymousClass7TF.A1V(r3)
            java.util.List r1 = r7.A03
            boolean r0 = X.AnonymousClass7TF.A1V(r1)
            boolean r0 = X.SPv.A03(r3, r1, r2, r0)
            if (r0 == 0) goto L_0x00a8
            java.util.List r3 = r6.A06
            boolean r2 = X.AnonymousClass7TF.A1V(r3)
            java.util.List r1 = r7.A06
            boolean r0 = X.AnonymousClass7TF.A1V(r1)
            boolean r0 = X.SPv.A03(r3, r1, r2, r0)
            if (r0 == 0) goto L_0x00a8
            java.util.List r3 = r6.A05
            boolean r2 = X.AnonymousClass7TF.A1V(r3)
            java.util.List r1 = r7.A05
            boolean r0 = X.AnonymousClass7TF.A1V(r1)
            boolean r0 = X.SPv.A03(r3, r1, r2, r0)
            if (r0 == 0) goto L_0x00a8
            java.lang.String r3 = r6.A02
            boolean r2 = X.AnonymousClass7TF.A1V(r3)
            java.lang.String r1 = r7.A02
            boolean r0 = X.AnonymousClass7TF.A1V(r1)
            r0 = r0 ^ r2
            if (r0 != 0) goto L_0x00a8
            if (r2 == 0) goto L_0x0093
            if (r3 != 0) goto L_0x0094
            if (r1 != 0) goto L_0x00a8
        L_0x0093:
            return r4
        L_0x0094:
            boolean r0 = r3.equals(r1)
            if (r0 != 0) goto L_0x0093
            return r5
        L_0x009b:
            boolean r0 = r3.equals(r1)
            if (r0 != 0) goto L_0x0036
            return r5
        L_0x00a2:
            boolean r0 = r3.equals(r1)
            if (r0 != 0) goto L_0x0021
        L_0x00a8:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12294Sqs.equals(java.lang.Object):boolean");
    }

    public final String toString() {
        return SPv.A01(this, AnonymousClass7TE.A1A(), 1);
    }

    public final int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.A00, null, this.A01, this.A04, this.A03, this.A06, this.A05, null, this.A02});
    }

    public C12294Sqs(Boolean bool, Integer num, String str, List list, List list2, List list3, List list4) {
        this.A00 = bool;
        this.A01 = num;
        this.A04 = list;
        this.A03 = list2;
        this.A06 = list3;
        this.A05 = list4;
        this.A02 = str;
    }
}
