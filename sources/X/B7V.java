package X;

public abstract class B7V {
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0131 A[LOOP:2: B:41:0x012b->B:43:0x0131, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0169  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.ArrayList A00(com.google.common.collect.ImmutableList r19) {
        /*
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r19)
            java.util.Iterator r4 = r19.iterator()
        L_0x0008:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0022
            java.lang.Object r3 = r4.next()
            X.3lr r3 = (X.C250663lr) r3
            java.lang.Class<X.B7W> r2 = X.B7W.class
            r1 = 0
            r0 = -314843505(0xffffffffed3bde8f, float:-3.633922E27)
            X.3lr r0 = r3.reinterpretRequired(r1, r2, r0)
            r5.add(r0)
            goto L_0x0008
        L_0x0022:
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r9 = r5.iterator()
        L_0x002a:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x017b
            java.lang.Object r3 = r9.next()
            X.3lr r3 = (X.C250663lr) r3
            java.lang.Class<X.B7X> r5 = X.B7X.class
            r4 = 4
            java.lang.String r1 = "spec_id"
            r0 = 1471571354(0x57b6659a, float:4.01094983E14)
            X.3lr r4 = r3.getOptionalTreeField(r4, r1, r5, r0)
            r12 = 0
            if (r4 == 0) goto L_0x0177
            java.lang.Class<X.B7Y> r1 = X.B7Y.class
            r5 = 0
            r0 = -1840317228(0xffffffff924efcd4, float:-6.5313773E-28)
            X.3lr r4 = r4.reinterpretRequired(r5, r1, r0)
            if (r4 == 0) goto L_0x0177
            X.Mpm r1 = X.C67552Mpm.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "intervention_type"
            java.lang.Enum r0 = r4.getOptionalEnumField(r5, r0, r1)
            X.Mpm r0 = (X.C67552Mpm) r0
            if (r0 == 0) goto L_0x0177
            java.lang.String r17 = r0.name()
        L_0x0061:
            r6 = 3
            java.lang.String r0 = "sync_ttl_ts"
            int r5 = r3.getCoercedIntField(r6, r0)
            X.DhD r1 = X.C46571DhD.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r4 = 1
            java.lang.String r0 = "eligibility"
            java.lang.Enum r0 = r3.getOptionalEnumField(r4, r0, r1)
            X.DhD r0 = (X.C46571DhD) r0
            if (r0 == 0) goto L_0x0174
            int r1 = r0.ordinal()
            if (r1 == r4) goto L_0x0170
            r0 = 2
            if (r1 == r0) goto L_0x016c
            if (r1 != r6) goto L_0x0174
            java.lang.Integer r14 = X.AnonymousClass05K.A0C
        L_0x0082:
            r1 = 2
            java.lang.String r0 = "expiration_ts"
            int r4 = r3.getCoercedIntField(r1, r0)
            r1 = 5
            java.lang.String r0 = "priority"
            int r19 = r3.getCoercedIntField(r1, r0)
            java.lang.Class<X.B7Z> r7 = X.B7Z.class
            r6 = 0
            java.lang.String r1 = "context"
            r0 = 1088003989(0x40d99f95, float:6.80073)
            X.3lr r7 = r3.getOptionalTreeField(r6, r1, r7, r0)
            if (r7 == 0) goto L_0x0169
            java.lang.Class<X.B7a> r1 = X.C41923B7a.class
            r0 = -777638435(0xffffffffd1a62ddd, float:-8.9216754E10)
            X.3lr r1 = r7.reinterpretRequired(r6, r1, r0)
            if (r1 == 0) goto L_0x0169
            java.lang.String r0 = "payload"
            java.lang.String r0 = r1.getOptionalStringField(r6, r0)
            X.9VF r13 = new X.9VF
            r13.<init>(r0)
        L_0x00b4:
            java.lang.Class<X.Bsr> r8 = X.C43105Bsr.class
            r7 = 6
            java.lang.String r1 = "ixt_flow"
            r0 = 1416459693(0x546d75ad, float:4.07952608E12)
            X.3lr r7 = r3.getOptionalTreeField(r7, r1, r8, r0)
            if (r7 == 0) goto L_0x00e0
            java.lang.Class<X.CCp> r1 = X.C43771CCp.class
            r0 = 694122433(0x295f77c1, float:4.9619817E-14)
            X.3lr r0 = r7.A01(r1, r0)
            X.DZ1 r0 = (X.DZ1) r0
            if (r0 == 0) goto L_0x00e0
            java.lang.String r1 = r0.B6c()
            java.lang.String r0 = r0.B6Z()
            if (r1 == 0) goto L_0x00e0
            if (r0 == 0) goto L_0x00e0
            X.BB6 r12 = new X.BB6
            r12.<init>(r1, r0)
        L_0x00e0:
            java.lang.Class<X.B7b> r8 = X.C41924B7b.class
            r7 = 7
            java.lang.String r1 = "impression_settings"
            r0 = -1635713611(0xffffffff9e80fdb5, float:-1.3657458E-20)
            X.3lr r7 = r3.getOptionalTreeField(r7, r1, r8, r0)
            if (r7 == 0) goto L_0x0167
            java.lang.Class<X.B7c> r1 = X.C41925B7c.class
            r0 = 8068514(0x7b1da2, float:1.1306396E-38)
            X.3lr r0 = r7.reinterpretRequired(r6, r1, r0)
            X.DZQ r0 = (X.DZQ) r0
            if (r0 == 0) goto L_0x0167
            int r8 = r0.BPZ()
            int r7 = r0.BPa()
            int r1 = r0.BGX()
            X.30J r0 = X.AnonymousClass30J.SECONDS
            long r0 = X.AnonymousClass30K.A03(r0, r1)
            X.9VH r11 = new X.9VH
            r11.<init>(r8, r7, r0)
        L_0x0112:
            java.lang.Class<X.B7d> r8 = X.C41926B7d.class
            r7 = 8
            java.lang.String r1 = "targets"
            r0 = 2087441862(0x7c6bd5c6, float:4.8981024E36)
            com.google.common.collect.ImmutableList r0 = r3.getRequiredCompactedTreeListField(r7, r1, r8, r0)
            X.0qQ.A07(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r8 = r0.iterator()
        L_0x012b:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x014d
            java.lang.Object r7 = r8.next()
            X.3lr r7 = (X.C250663lr) r7
            java.lang.Class<X.B7e> r1 = X.C41927B7e.class
            r0 = 1100471306(0x4197dc0a, float:18.98244)
            X.3lr r0 = r7.reinterpretRequired(r6, r1, r0)
            X.Px3 r0 = (X.C74559Px3) r0
            X.0qQ.A07(r0)
            X.9VG r0 = X.C67549Mpj.A00(r0)
            r3.add(r0)
            goto L_0x012b
        L_0x014d:
            if (r17 == 0) goto L_0x002a
            if (r11 == 0) goto L_0x002a
            long r0 = (long) r5
            java.lang.Long r15 = java.lang.Long.valueOf(r0)
            long r0 = (long) r4
            java.lang.Long r16 = java.lang.Long.valueOf(r0)
            X.9VE r10 = new X.9VE
            r18 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r2.add(r10)
            goto L_0x002a
        L_0x0167:
            r11 = 0
            goto L_0x0112
        L_0x0169:
            r13 = 0
            goto L_0x00b4
        L_0x016c:
            java.lang.Integer r14 = X.AnonymousClass05K.A01
            goto L_0x0082
        L_0x0170:
            java.lang.Integer r14 = X.AnonymousClass05K.A00
            goto L_0x0082
        L_0x0174:
            r14 = 0
            goto L_0x0082
        L_0x0177:
            r17 = r12
            goto L_0x0061
        L_0x017b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B7V.A00(com.google.common.collect.ImmutableList):java.util.ArrayList");
    }
}
