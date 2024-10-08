package X;

import java.io.Serializable;

/* renamed from: X.4cy  reason: invalid class name and case insensitive filesystem */
public abstract class C268214cy extends C252503pD implements Serializable {
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r7.A05.A0D(X.C269424f6.WRITE_EMPTY_JSON_ARRAYS) != false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void EN9(X.17Z r6, X.C269504fE r7) {
        /*
            r5 = this;
            r2 = r5
            X.4cw r2 = (X.C268194cw) r2
            if (r7 == 0) goto L_0x0010
            X.4f6 r1 = X.C269424f6.WRITE_EMPTY_JSON_ARRAYS
            X.4et r0 = r7.A05
            boolean r0 = r0.A0D(r1)
            r4 = 1
            if (r0 == 0) goto L_0x0011
        L_0x0010:
            r4 = 0
        L_0x0011:
            r6.A0o(r2)
            java.util.Map r0 = r2.A00
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L_0x001e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x004c
            java.lang.Object r2 = r3.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r1 = r2.getValue()
            X.4cy r1 = (X.C268214cy) r1
            if (r4 == 0) goto L_0x003f
            boolean r0 = r1.A0A()
            if (r0 == 0) goto L_0x003f
            boolean r0 = r1.A01(r7)
            if (r0 == 0) goto L_0x003f
            goto L_0x001e
        L_0x003f:
            java.lang.Object r0 = r2.getKey()
            java.lang.String r0 = (java.lang.String) r0
            r6.A0q(r0)
            r1.EN9(r6, r7)
            goto L_0x001e
        L_0x004c:
            r6.A0Z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C268214cy.EN9(X.17Z, X.4fE):void");
    }

    public abstract int hashCode();

    /* JADX WARNING: Unknown top exception splitter block from list: {B:31:0x0066=Splitter:B:31:0x0066, B:27:0x0057=Splitter:B:27:0x0057} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r7 = this;
            X.5E3 r6 = X.AnonymousClass5E1.A00     // Catch:{ IOException -> 0x0084 }
            X.15p r1 = r6.A00     // Catch:{ IOException -> 0x0084 }
            X.16A r0 = r1.A0B()     // Catch:{ IOException -> 0x0084 }
            X.5EB r4 = new X.5EB     // Catch:{ IOException -> 0x0084 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x0084 }
            X.17W r3 = r1.A0A(r4)     // Catch:{ 1bF -> 0x007c, IOException -> 0x007e }
            X.4et r5 = r6.A03     // Catch:{ 1bF -> 0x007c, IOException -> 0x007e }
            r5.A0C(r3)     // Catch:{ 1bF -> 0x007c, IOException -> 0x007e }
            X.5E5 r2 = r6.A01     // Catch:{ 1bF -> 0x007c, IOException -> 0x007e }
            X.15w r1 = r2.A00     // Catch:{ 1bF -> 0x007c, IOException -> 0x007e }
            if (r1 == 0) goto L_0x002e
            X.15w r0 = X.AnonymousClass5E3.A06     // Catch:{ 1bF -> 0x007c, IOException -> 0x007e }
            if (r1 != r0) goto L_0x0022
            r1 = 0
            goto L_0x002c
        L_0x0022:
            boolean r0 = r1 instanceof X.C638815x     // Catch:{ 1bF -> 0x007c, IOException -> 0x007e }
            if (r0 == 0) goto L_0x002c
            X.15x r1 = (X.C638815x) r1     // Catch:{ 1bF -> 0x007c, IOException -> 0x007e }
            X.15v r1 = r1.AMF()     // Catch:{ 1bF -> 0x007c, IOException -> 0x007e }
        L_0x002c:
            r3.A00 = r1     // Catch:{ 1bF -> 0x007c, IOException -> 0x007e }
        L_0x002e:
            X.15z r0 = r2.A01     // Catch:{ 1bF -> 0x007c, IOException -> 0x007e }
            if (r0 == 0) goto L_0x0034
            r3.A01 = r0     // Catch:{ 1bF -> 0x007c, IOException -> 0x007e }
        L_0x0034:
            X.4f6 r0 = X.C269424f6.CLOSE_CLOSEABLE     // Catch:{ 1bF -> 0x007c, IOException -> 0x007e }
            boolean r0 = r5.A0D(r0)     // Catch:{ 1bF -> 0x007c, IOException -> 0x007e }
            if (r0 == 0) goto L_0x005b
            boolean r0 = r7 instanceof java.io.Closeable     // Catch:{ 1bF -> 0x007c, IOException -> 0x007e }
            if (r0 == 0) goto L_0x005b
            r2 = r7
            java.io.Closeable r2 = (java.io.Closeable) r2     // Catch:{ 1bF -> 0x007c, IOException -> 0x007e }
            X.4fD r1 = r6.A04     // Catch:{ Exception -> 0x0055 }
            X.4fG r0 = r6.A05     // Catch:{ Exception -> 0x0055 }
            X.4fD r0 = r1.A0W(r5, r0)     // Catch:{ Exception -> 0x0055 }
            r0.A0X(r3, r7)     // Catch:{ Exception -> 0x0055 }
            r1 = 0
            r2.close()     // Catch:{ Exception -> 0x0053 }
            goto L_0x0066
        L_0x0053:
            r0 = move-exception
            goto L_0x0057
        L_0x0055:
            r0 = move-exception
            r1 = r2
        L_0x0057:
            X.C269574fL.A0B(r3, r1, r0)     // Catch:{ 1bF -> 0x007c, IOException -> 0x007e }
            goto L_0x0077
        L_0x005b:
            X.4fD r1 = r6.A04     // Catch:{ Exception -> 0x0073 }
            X.4fG r0 = r6.A05     // Catch:{ Exception -> 0x0073 }
            X.4fD r0 = r1.A0W(r5, r0)     // Catch:{ Exception -> 0x0073 }
            r0.A0X(r3, r7)     // Catch:{ Exception -> 0x0073 }
        L_0x0066:
            r3.close()     // Catch:{ 1bF -> 0x007c, IOException -> 0x007e }
            X.16I r1 = r4.A00     // Catch:{ IOException -> 0x0084 }
            java.lang.String r0 = r1.A06()     // Catch:{ IOException -> 0x0084 }
            r1.A07()     // Catch:{ IOException -> 0x0084 }
            return r0
        L_0x0073:
            r0 = move-exception
            X.C269574fL.A0C(r3, r0)     // Catch:{ 1bF -> 0x007c, IOException -> 0x007e }
        L_0x0077:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ 1bF -> 0x007c, IOException -> 0x007e }
            throw r0     // Catch:{ 1bF -> 0x007c, IOException -> 0x007e }
        L_0x007c:
            r0 = move-exception
            goto L_0x0083
        L_0x007e:
            r0 = move-exception
            X.4iD r0 = X.AnonymousClass4iD.A01(r0)     // Catch:{ IOException -> 0x0084 }
        L_0x0083:
            throw r0     // Catch:{ IOException -> 0x0084 }
        L_0x0084:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C268214cy.toString():java.lang.String");
    }
}
