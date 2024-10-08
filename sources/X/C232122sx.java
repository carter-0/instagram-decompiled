package X;

import java.util.HashMap;

/* renamed from: X.2sx  reason: invalid class name and case insensitive filesystem */
public final class C232122sx {
    public final C232132sy A00 = new Object();

    public final HashMap A01(AnonymousClass4VR r5, AnonymousClass426 r6, AnonymousClass4VU r7) {
        0qQ.A0B(r5, 0);
        HashMap hashMap = new HashMap();
        if (r7 != null) {
            for (AnonymousClass4VV r1 : r7.A02) {
                hashMap.put(r1, Boolean.valueOf(this.A00.A00(r5, r6, r1).A02));
            }
            for (AnonymousClass4VU A01 : r7.A01) {
                hashMap.putAll(A01(r5, r6, A01));
            }
        }
        return hashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (r2 == false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        if (r2 != false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0057, code lost:
        if (r2 != false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0089, code lost:
        if (r1 == false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ab, code lost:
        if (r1 != false) goto L_0x008b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x003a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass5IZ A00(X.C232122sx r8, X.AnonymousClass4VR r9, X.AnonymousClass426 r10, X.AnonymousClass4VU r11) {
        /*
            java.lang.Integer r6 = r11.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r6 == r0) goto L_0x0111
            java.util.List r5 = r11.A02
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0016
            java.util.List r0 = r11.A01
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0111
        L_0x0016:
            java.util.Iterator r4 = r5.iterator()
        L_0x001a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x005d
            java.lang.Object r3 = r4.next()
            X.4VV r3 = (X.AnonymousClass4VV) r3
            X.2sy r0 = r8.A00
            X.5IZ r0 = r0.A00(r9, r10, r3)
            boolean r2 = r0.A02
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            if (r6 != r1) goto L_0x004c
            if (r2 != 0) goto L_0x005a
        L_0x0034:
            java.lang.Integer r1 = X.AnonymousClass05K.A01
        L_0x0036:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x001a
            int r2 = r1.intValue()
            r1 = 1
            r0 = 0
            if (r2 == r0) goto L_0x00c7
            if (r2 == r1) goto L_0x00fe
            java.lang.String r1 = "No boolean equivalent for UNSET"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x004c:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r6 != r0) goto L_0x0053
            if (r2 == 0) goto L_0x005a
            goto L_0x0036
        L_0x0053:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r6 != r0) goto L_0x005a
            if (r2 == 0) goto L_0x005a
            goto L_0x0034
        L_0x005a:
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            goto L_0x0036
        L_0x005d:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r0 = r11.A01
            java.util.Iterator r7 = r0.iterator()
        L_0x0068:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00b4
            java.lang.Object r0 = r7.next()
            X.4VU r0 = (X.AnonymousClass4VU) r0
            X.5IZ r3 = A00(r8, r9, r10, r0)
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            if (r6 != r2) goto L_0x0083
            boolean r0 = r3.A02
            if (r0 != 0) goto L_0x0083
            r4.add(r3)
        L_0x0083:
            boolean r1 = r3.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r6 != r0) goto L_0x00a1
            if (r1 != 0) goto L_0x00ae
        L_0x008b:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r2 == r0) goto L_0x0068
            int r2 = r2.intValue()
            r1 = 1
            r0 = 0
            if (r2 == r0) goto L_0x00c7
            if (r2 == r1) goto L_0x00b1
            java.lang.String r1 = "No boolean equivalent for UNSET"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00a1:
            if (r6 != r2) goto L_0x00a7
            if (r1 == 0) goto L_0x00ae
            r2 = r0
            goto L_0x008b
        L_0x00a7:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r6 != r0) goto L_0x00ae
            if (r1 == 0) goto L_0x00ae
            goto L_0x008b
        L_0x00ae:
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            goto L_0x008b
        L_0x00b1:
            com.google.common.collect.ImmutableList r2 = r3.A00
            goto L_0x0104
        L_0x00b4:
            int r1 = r6.intValue()
            r0 = 1
            if (r1 == r0) goto L_0x00cf
            r0 = 2
            if (r1 == r0) goto L_0x00c7
            r0 = 0
            if (r1 == r0) goto L_0x00c7
            X.2sw r0 = new X.2sw
            r0.<init>()
            throw r0
        L_0x00c7:
            r1 = 0
            r0 = 1
            X.5IZ r3 = new X.5IZ
            r3.<init>(r1, r1, r0)
            return r3
        L_0x00cf:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x00f9
            com.google.common.collect.ImmutableList$Builder r2 = com.google.common.collect.ImmutableList.builder()
            java.util.Iterator r1 = r4.iterator()
        L_0x00dd:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00f1
            java.lang.Object r0 = r1.next()
            X.5IZ r0 = (X.AnonymousClass5IZ) r0
            com.google.common.collect.ImmutableList r0 = r0.A00
            if (r0 == 0) goto L_0x00dd
            r2.addAll(r0)
            goto L_0x00dd
        L_0x00f1:
            com.google.common.collect.ImmutableList r2 = r2.build()
            X.0qQ.A07(r2)
            goto L_0x0104
        L_0x00f9:
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r5)
            goto L_0x0104
        L_0x00fe:
            if (r3 != 0) goto L_0x010c
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.of()
        L_0x0104:
            r1 = 0
            r0 = 0
            X.5IZ r3 = new X.5IZ
            r3.<init>(r2, r1, r0)
            return r3
        L_0x010c:
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.of(r3)
            goto L_0x0104
        L_0x0111:
            X.2sw r0 = new X.2sw
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C232122sx.A00(X.2sx, X.4VR, X.426, X.4VU):X.5IZ");
    }
}
