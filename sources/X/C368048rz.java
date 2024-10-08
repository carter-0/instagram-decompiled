package X;

@Deprecated
/* renamed from: X.8rz  reason: invalid class name and case insensitive filesystem */
public abstract class C368048rz {
    /* JADX WARNING: type inference failed for: r9v2, types: [X.9Gs, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Object, X.9Gt] */
    /* JADX WARNING: type inference failed for: r2v8, types: [X.9Gs, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v3, types: [java.lang.Object, X.9Gt] */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0026, code lost:
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0026, code lost:
        r2 = r2;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C376149Gs A00(android.content.Context r19, X.0lg r20, java.lang.Boolean r21, java.lang.String r22) {
        /*
            java.util.UUID r0 = X.AnonymousClass0HM.A00()
            java.lang.String r14 = r0.toString()
            boolean r0 = r21.booleanValue()
            r7 = 1
            r5 = 0
            r6 = r20
            if (r0 == 0) goto L_0x00bb
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            X.1G4 r0 = X.1G4.A05
            r1.add(r0)
            X.1G4 r0 = X.1G4.A06
            r1.add(r0)
            java.util.Iterator r10 = r1.iterator()
            r2 = 0
        L_0x0026:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00bd
            java.lang.Object r9 = r10.next()
            X.1G4 r9 = (X.1G4) r9
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r0 = r9.ordinal()
            if (r0 == r5) goto L_0x0047
            if (r0 == r7) goto L_0x0047
            java.lang.String r1 = "SsoApplication not supported."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0047:
            X.8s5 r3 = X.C368108s5.A03
            X.8sI r1 = X.C368238sI.ACTIVE_ACCOUNT
            X.FEV r0 = new X.FEV
            r0.<init>(r3, r1)
            r4.add(r0)
            X.8sF r1 = new X.8sF
            r1.<init>(r6)
            java.lang.String r0 = "InstagramSsoLoginUtil"
            java.util.ArrayList r1 = X.C49264Es7.A00(r14, r0, r4, r1)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0026
            java.lang.Object r0 = r1.get(r5)
            if (r0 == 0) goto L_0x0026
            java.lang.Object r0 = r1.get(r5)
            X.F3S r0 = (X.F3S) r0
            java.lang.String r0 = r0.A01
            if (r0 == 0) goto L_0x0026
            java.lang.Object r1 = r1.get(r5)
            X.F3S r1 = (X.F3S) r1
            X.9Gs r2 = new X.9Gs
            r2.<init>()
            java.lang.String r0 = r1.A01
            r2.A02 = r0
            X.9Gt r8 = new X.9Gt
            r8.<init>()
            java.lang.String r0 = r1.A02
            r8.A01 = r0
            java.util.Map r4 = r1.A03
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x00b5
            r0 = 1717(0x6b5, float:2.406E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r0)
            boolean r1 = r4.containsKey(r3)
            java.lang.String r0 = ""
            if (r1 == 0) goto L_0x00a5
            r4.get(r3)
        L_0x00a5:
            java.lang.String r3 = "user_name"
            boolean r1 = r4.containsKey(r3)
            if (r1 == 0) goto L_0x00b3
            java.lang.Object r0 = r4.get(r3)
            java.lang.String r0 = (java.lang.String) r0
        L_0x00b3:
            r8.A00 = r0
        L_0x00b5:
            r2.A00 = r8
            r2.A01 = r9
            goto L_0x0026
        L_0x00bb:
            r12 = 0
            goto L_0x00c0
        L_0x00bd:
            if (r2 != 0) goto L_0x01fb
            r12 = 1
        L_0x00c0:
            X.8s0 r1 = new X.8s0
            r1.<init>()
            X.8sE r0 = new X.8sE
            r2 = r22
            r0.<init>(r6, r2)
            r1.A03 = r0
            X.8sF r0 = new X.8sF
            r0.<init>(r6)
            r1.A04 = r0
            X.8sG r4 = new X.8sG
            r4.<init>(r1)
            java.util.Set r0 = X.AnonymousClass1G3.A02()
            java.util.Iterator r11 = r0.iterator()
            r2 = 0
        L_0x00e3:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0195
            java.lang.Object r8 = r11.next()
            X.1G4 r8 = (X.1G4) r8
            java.lang.String r15 = "InstagramSsoLoginUtil"
            android.content.Context r13 = r19.getApplicationContext()     // Catch:{ all -> 0x0186 }
            java.util.ArrayList r16 = new java.util.ArrayList     // Catch:{ all -> 0x0186 }
            r16.<init>()     // Catch:{ all -> 0x0186 }
            X.8s1 r1 = r4.A06     // Catch:{ all -> 0x0186 }
            java.lang.Class<X.8s4> r0 = X.C368098s4.class
            java.util.EnumSet r0 = java.util.EnumSet.allOf(r0)     // Catch:{ all -> 0x0186 }
            java.util.List r0 = r1.A00(r0)     // Catch:{ all -> 0x0186 }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ all -> 0x0186 }
        L_0x010a:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x0186 }
            if (r0 == 0) goto L_0x0157
            java.lang.Object r3 = r10.next()     // Catch:{ all -> 0x0186 }
            X.8s9 r3 = (X.C368148s9) r3     // Catch:{ all -> 0x0186 }
            X.8s4 r9 = r3.A04     // Catch:{ all -> 0x0186 }
            int r1 = r8.ordinal()     // Catch:{ all -> 0x0186 }
            if (r1 == r5) goto L_0x0126
            if (r1 == r7) goto L_0x0126
            r0 = 2
            if (r1 != r0) goto L_0x014f
            X.8s4 r0 = X.C368098s4.FACEBOOK_LITE     // Catch:{ all -> 0x0186 }
            goto L_0x0128
        L_0x0126:
            X.8s4 r0 = X.C368098s4.FACEBOOK     // Catch:{ all -> 0x0186 }
        L_0x0128:
            if (r9 != r0) goto L_0x010a
            java.lang.String r0 = r3.A02     // Catch:{ all -> 0x0186 }
            java.lang.String r1 = r8.A01     // Catch:{ all -> 0x0186 }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0186 }
            if (r0 == 0) goto L_0x010a
            android.content.pm.PackageManager r0 = r19.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0142 }
            X.0qQ.A0A(r1)     // Catch:{ NameNotFoundException -> 0x0142 }
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r5)     // Catch:{ NameNotFoundException -> 0x0142 }
            int r1 = r0.versionCode     // Catch:{ NameNotFoundException -> 0x0142 }
            goto L_0x0143
        L_0x0142:
            r1 = -1
        L_0x0143:
            int r0 = r8.A00     // Catch:{ all -> 0x0186 }
            if (r1 < r0) goto L_0x010a
            r18 = r4
            r17 = r3
            X.C368218sG.A02(r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0186 }
            goto L_0x010a
        L_0x014f:
            java.lang.String r1 = "SsoApplication not supported."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0186 }
            r0.<init>(r1)     // Catch:{ all -> 0x0186 }
            throw r0     // Catch:{ all -> 0x0186 }
        L_0x0157:
            java.util.List r1 = java.util.Collections.unmodifiableList(r16)     // Catch:{ all -> 0x0186 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0186 }
            if (r0 != 0) goto L_0x00e3
            java.lang.Object r0 = r1.get(r5)     // Catch:{ all -> 0x0186 }
            X.9Gr r0 = (X.C376139Gr) r0     // Catch:{ all -> 0x0186 }
            X.9Gs r9 = new X.9Gs     // Catch:{ all -> 0x0186 }
            r9.<init>()     // Catch:{ all -> 0x0186 }
            X.9Gp r1 = r0.A01     // Catch:{ all -> 0x0186 }
            java.lang.String r0 = r1.A00     // Catch:{ all -> 0x0186 }
            r9.A02 = r0     // Catch:{ all -> 0x0186 }
            X.9Gt r3 = new X.9Gt     // Catch:{ all -> 0x0186 }
            r3.<init>()     // Catch:{ all -> 0x0186 }
            X.9Go r1 = r1.A01     // Catch:{ all -> 0x0186 }
            java.lang.String r0 = r1.A02     // Catch:{ all -> 0x0186 }
            r3.A01 = r0     // Catch:{ all -> 0x0186 }
            java.lang.String r0 = r1.A00     // Catch:{ all -> 0x0186 }
            r3.A00 = r0     // Catch:{ all -> 0x0186 }
            r9.A00 = r3     // Catch:{ all -> 0x0186 }
            r9.A01 = r8     // Catch:{ all -> 0x0186 }
            goto L_0x0194
        L_0x0186:
            r3 = move-exception
            java.lang.String r0 = r8.A01
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "Exception occurred while resolving sso session from %s"
            X.0KC.A0L(r15, r0, r3, r1)
            goto L_0x00e3
        L_0x0194:
            r2 = r9
        L_0x0195:
            if (r12 == 0) goto L_0x01fb
            if (r2 == 0) goto L_0x01fb
            X.8sF r11 = new X.8sF
            r11.<init>(r6)
            java.lang.String r0 = "FACEBOOK"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.List r1 = java.util.Arrays.asList(r0)
            java.lang.String r0 = "ACTIVE_ACCOUNT"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.List r4 = java.util.Arrays.asList(r0)
            X.AvY r10 = new X.AvY
            r10.<init>(r14)
            if (r1 == 0) goto L_0x01fb
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x01fb
            if (r4 == 0) goto L_0x01fb
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x01fb
            java.util.Iterator r3 = r1.iterator()
        L_0x01cb:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01fb
            java.lang.Object r6 = r3.next()
            java.lang.String r6 = (java.lang.String) r6
            java.util.Iterator r1 = r4.iterator()
        L_0x01db:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01cb
            java.lang.Object r7 = r1.next()
            java.lang.String r7 = (java.lang.String) r7
            X.8sJ r5 = X.C368248sJ.FETCH_FAILURE
            r0 = 986(0x3da, float:1.382E-42)
            java.lang.String r8 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "waterfall_id"
            java.lang.Object r9 = r10.get(r0)
            java.lang.String r9 = (java.lang.String) r9
            X.C368188sD.A00(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x01db
        L_0x01fb:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C368048rz.A00(android.content.Context, X.0lg, java.lang.Boolean, java.lang.String):X.9Gs");
    }
}
