package X;

import java.io.IOException;

/* renamed from: X.Syl  reason: case insensitive filesystem */
public abstract class C12586Syl implements C13957TmK {
    public int zza = 0;

    public abstract int A0I(C13845TiL tiL);

    /* JADX WARNING: type inference failed for: r6v0, types: [java.util.Collection, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0H(java.lang.Iterable r6, java.util.List r7) {
        /*
            java.nio.charset.Charset r0 = X.SS6.A02
            boolean r0 = r6 instanceof X.C13978TnU
            java.lang.String r4 = " is null."
            java.lang.String r3 = "Element at index "
            if (r0 == 0) goto L_0x004e
            X.TnU r6 = (X.C13978TnU) r6
            java.util.List r0 = r6.FPv()
            r6 = r7
            X.TnU r6 = (X.C13978TnU) r6
            int r5 = r7.size()
            java.util.Iterator r2 = r0.iterator()
        L_0x001b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0096
            java.lang.Object r1 = r2.next()
            if (r1 != 0) goto L_0x003b
            int r0 = X.DbT.A02(r6, r5)
            java.lang.String r1 = X.002.A0c(r3, r4, r0)
            int r0 = r6.size()
        L_0x0033:
            int r0 = r0 + -1
            if (r0 < r5) goto L_0x0049
            r6.remove(r0)
            goto L_0x0033
        L_0x003b:
            boolean r0 = r1 instanceof X.TAQ
            if (r0 == 0) goto L_0x0045
            X.TAQ r1 = (X.TAQ) r1
            r6.FQ2(r1)
            goto L_0x001b
        L_0x0045:
            r6.add(r1)
            goto L_0x001b
        L_0x0049:
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r1)
            throw r0
        L_0x004e:
            boolean r0 = r6 instanceof X.C13484TbB
            if (r0 != 0) goto L_0x0097
            boolean r0 = r7 instanceof java.util.ArrayList
            if (r0 == 0) goto L_0x0065
            r2 = r7
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r1 = r7.size()
            int r0 = r6.size()
            int r1 = r1 + r0
            r2.ensureCapacity(r1)
        L_0x0065:
            int r2 = r7.size()
            java.util.Iterator r1 = r6.iterator()
        L_0x006d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0096
            java.lang.Object r0 = r1.next()
            if (r0 != 0) goto L_0x008d
            int r0 = X.DbT.A02(r7, r2)
            java.lang.String r1 = X.002.A0c(r3, r4, r0)
            int r0 = r7.size()
        L_0x0085:
            int r0 = r0 + -1
            if (r0 < r2) goto L_0x0091
            r7.remove(r0)
            goto L_0x0085
        L_0x008d:
            r7.add(r0)
            goto L_0x006d
        L_0x0091:
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r1)
            throw r0
        L_0x0096:
            return
        L_0x0097:
            r7.addAll(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12586Syl.A0H(java.lang.Iterable, java.util.List):void");
    }

    public final byte[] A0J() {
        try {
            int FPo = FPo();
            byte[] bArr = new byte[FPo];
            C8567Qx5 A05 = C8567Qx5.A05(bArr, FPo);
            FQP(A05);
            A05.A08();
            return bArr;
        } catch (IOException e) {
            throw Pxe.A0u(002.A0g("Serializing ", C66581MXm.A0y(this), " to a byte array threw an IOException (should never happen)."), e);
        }
    }
}
