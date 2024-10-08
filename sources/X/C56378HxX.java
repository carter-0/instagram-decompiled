package X;

/* renamed from: X.HxX  reason: case insensitive filesystem */
public abstract class C56378HxX {
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object A00(X.OYZ r6, java.lang.String r7, X.AnonymousClass4D7 r8) {
        /*
            r1 = 0
            r4 = 23
            boolean r0 = X.C58075Il7.A02(r4, r8)
            if (r0 == 0) goto L_0x008e
            r5 = r8
            X.Il7 r5 = (X.C58075Il7) r5
            int r3 = r5.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L_0x008e
            int r3 = r3 - r2
            r5.A00 = r3
        L_0x0017:
            java.lang.Object r0 = r5.A02
            X.1Hj r4 = X.1Hj.A02
            int r3 = r5.A00
            r2 = 1
            if (r3 == 0) goto L_0x0074
            if (r3 != r2) goto L_0x0094
            java.lang.Object r1 = r5.A01
            X.0eS.A00(r0)
        L_0x0027:
            java.util.Map r0 = (java.util.Map) r0
            if (r1 == 0) goto L_0x0030
            java.lang.Object r3 = r0.get(r1)
        L_0x002f:
            return r3
        L_0x0030:
            java.util.Iterator r5 = X.AnonymousClass7TF.A0u(r0)
            boolean r0 = r5.hasNext()
            r3 = 0
            if (r0 != 0) goto L_0x0045
            r4 = r3
        L_0x003c:
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            if (r4 == 0) goto L_0x002f
            java.lang.Object r3 = r4.getValue()
            return r3
        L_0x0045:
            java.lang.Object r4 = r5.next()
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x003c
            r0 = r4
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            libraries.zero.headers.ZeroHeadersEntry r0 = (libraries.zero.headers.ZeroHeadersEntry) r0
            int r2 = r0.A01
        L_0x005a:
            java.lang.Object r1 = r5.next()
            r0 = r1
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            libraries.zero.headers.ZeroHeadersEntry r0 = (libraries.zero.headers.ZeroHeadersEntry) r0
            int r0 = r0.A01
            if (r2 >= r0) goto L_0x006d
            r4 = r1
            r2 = r0
        L_0x006d:
            boolean r0 = r5.hasNext()
            if (r0 != 0) goto L_0x005a
            goto L_0x003c
        L_0x0074:
            X.0eS.A00(r0)
            r5.A01 = r1
            r5.A00 = r2
            java.util.Map r0 = X.OYZ.A00(r6)
            java.lang.Object r0 = r0.get(r7)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L_0x008b
            X.0sm r0 = X.0Yt.A0E()
        L_0x008b:
            if (r0 != r4) goto L_0x0027
            return r4
        L_0x008e:
            X.Il7 r5 = new X.Il7
            r5.<init>(r4, r8)
            goto L_0x0017
        L_0x0094:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56378HxX.A00(X.OYZ, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object A01(X.OYZ r7, X.AnonymousClass4D7 r8) {
        /*
            r4 = 34
            boolean r0 = X.C58074Il6.A02(r4, r8)
            if (r0 == 0) goto L_0x0095
            r3 = r8
            X.Il6 r3 = (X.C58074Il6) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0095
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r4 = r3.A01
            X.1Hj r8 = X.1Hj.A02
            int r1 = r3.A00
            r0 = 1
            if (r1 == 0) goto L_0x002f
            if (r1 != r0) goto L_0x00b1
            X.0eS.A00(r4)
        L_0x0024:
            java.util.Map r4 = (java.util.Map) r4
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x009c
            java.lang.String r8 = ""
            return r8
        L_0x002f:
            X.0eS.A00(r4)
            r3.A00 = r0
            java.util.Map r1 = X.OYZ.A00(r7)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0045
            X.0sm r4 = X.0Yt.A0E()
        L_0x0042:
            if (r4 != r8) goto L_0x0024
            return r8
        L_0x0045:
            int r0 = r1.size()
            java.util.ArrayList r7 = X.DbS.A0v(r0)
            java.util.Iterator r6 = X.AnonymousClass7TF.A0u(r1)
        L_0x0051:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0090
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r6)
            java.lang.Object r5 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.util.LinkedHashMap r4 = X.C51975G9x.A0o(r0)
            java.util.Iterator r3 = X.AnonymousClass7TF.A0u(r0)
        L_0x006d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x008c
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r3)
            java.lang.Object r2 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            libraries.zero.headers.ZeroHeadersEntry r0 = (libraries.zero.headers.ZeroHeadersEntry) r0
            int r1 = r0.A01
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            r4.put(r2, r0)
            goto L_0x006d
        L_0x008c:
            X.AnonymousClass7TF.A1I(r5, r4, r7)
            goto L_0x0051
        L_0x0090:
            java.util.Map r4 = X.0Yt.A08(r7)
            goto L_0x0042
        L_0x0095:
            X.Il6 r3 = new X.Il6
            r3.<init>(r4, r8)
            goto L_0x0016
        L_0x009c:
            X.3mC r3 = X.C250863mB.A03
            X.3u9 r2 = X.C255453u9.A01
            X.8eK r0 = X.C360278eK.A00
            X.3zM r1 = new X.3zM
            r1.<init>(r0, r0)
            X.3zM r0 = new X.3zM
            r0.<init>(r2, r1)
            java.lang.String r8 = r3.A02(r4, r0)
            return r8
        L_0x00b1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56378HxX.A01(X.OYZ, X.4D7):java.lang.Object");
    }
}
