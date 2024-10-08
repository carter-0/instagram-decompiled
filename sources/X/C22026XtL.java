package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.XtL  reason: case insensitive filesystem */
public final class C22026XtL {
    public final Integer A00;
    public final Map A01 = AnonymousClass7TE.A1E();

    public static void A01(C22008Xqr xqr, XZz xZz) {
        int i;
        byte b = xZz.A00;
        short s = xZz.A01;
        if (b == 2) {
            xqr.A00 = Short.valueOf(s);
            return;
        }
        byte b2 = C22008Xqr.A05[b];
        short s2 = xqr.A02;
        if (s <= s2 || (i = s - s2) > 15) {
            xqr.A03.write(b2);
            C22008Xqr.A00(xqr, (s >> 31) ^ (s << 1));
        } else {
            xqr.A03.write((byte) ((i << 4) | b2));
        }
        xqr.A02 = s;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01a0, code lost:
        r3 = (byte[]) r3;
        r2 = r3.length;
        X.C22008Xqr.A00(r8, r2);
        r8.A03.write(r3, 0, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(X.C22008Xqr r8) {
        /*
            r7 = this;
            java.lang.Integer r0 = r7.A00
            int r0 = r0.intValue()
            r8.A01()
            switch(r0) {
                case 0: goto L_0x0215;
                case 1: goto L_0x01be;
                case 2: goto L_0x01ae;
                case 3: goto L_0x017f;
                case 4: goto L_0x0059;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.util.Map r2 = r7.A01
            X.XZz r0 = X.C21954Xmj.A0s
            A03(r8, r0, r2)
            X.XZz r0 = X.C21954Xmj.A0t
            A02(r8, r0, r2)
            X.XZz r1 = X.C21954Xmj.A0r
        L_0x001a:
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x0032
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x0032
            A01(r8, r1)
            java.lang.Object r0 = r2.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r8.A04(r0)
        L_0x0032:
            r1 = 0
            java.io.OutputStream r0 = r8.A03
            r0.write(r1)
            java.util.List r1 = r8.A01
            java.lang.Object r0 = X.C66582MXn.A0r(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            short r0 = r0.shortValue()
            r8.A02 = r0
            int r0 = r1.size()
            int r0 = r0 + -1
            java.lang.Object r0 = r1.remove(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            short r0 = r0.shortValue()
            r8.A02 = r0
            return
        L_0x0059:
            java.util.Map r3 = r7.A01
            X.XZz r0 = X.C21954Xmj.A0U
            A03(r8, r0, r3)
            X.XZz r0 = X.C21954Xmj.A0d
            A03(r8, r0, r3)
            X.XZz r0 = X.C21954Xmj.A0c
            A03(r8, r0, r3)
            X.XZz r1 = X.C21954Xmj.A0V
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x0084
            java.lang.Object r0 = r3.get(r1)
            if (r0 == 0) goto L_0x0084
            A01(r8, r1)
            java.lang.Object r0 = r3.get(r1)
            X.XtL r0 = (X.C22026XtL) r0
            r0.A06(r8)
        L_0x0084:
            X.XZz r1 = X.C21954Xmj.A0Z
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x009e
            java.lang.Object r0 = r3.get(r1)
            if (r0 == 0) goto L_0x009e
            A01(r8, r1)
            java.lang.Object r0 = r3.get(r1)
            X.XtL r0 = (X.C22026XtL) r0
            r0.A06(r8)
        L_0x009e:
            X.XZz r0 = X.C21954Xmj.A0Y
            A03(r8, r0, r3)
            X.XZz r1 = X.C21954Xmj.A0X
            boolean r0 = r3.containsKey(r1)
            r4 = 11
            if (r0 == 0) goto L_0x00ce
            java.lang.Object r0 = r3.get(r1)
            if (r0 == 0) goto L_0x00ce
            java.util.Iterator r6 = A00(r8, r1, r3, r4)
        L_0x00b7:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00ce
            java.lang.Object r5 = r6.next()
            byte[] r5 = (byte[]) r5
            int r2 = r5.length
            r1 = 0
            X.C22008Xqr.A00(r8, r2)
            java.io.OutputStream r0 = r8.A03
            r0.write(r5, r1, r2)
            goto L_0x00b7
        L_0x00ce:
            X.XZz r1 = X.C21954Xmj.A0a
            boolean r0 = r3.containsKey(r1)
            r2 = 12
            if (r0 == 0) goto L_0x00f2
            java.lang.Object r0 = r3.get(r1)
            if (r0 == 0) goto L_0x00f2
            java.util.Iterator r1 = A00(r8, r1, r3, r2)
        L_0x00e2:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00f2
            java.lang.Object r0 = r1.next()
            X.XtL r0 = (X.C22026XtL) r0
            r0.A06(r8)
            goto L_0x00e2
        L_0x00f2:
            X.XZz r1 = X.C21954Xmj.A0W
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x0114
            java.lang.Object r0 = r3.get(r1)
            if (r0 == 0) goto L_0x0114
            java.util.Iterator r1 = A00(r8, r1, r3, r2)
        L_0x0104:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0114
            java.lang.Object r0 = r1.next()
            X.XtL r0 = (X.C22026XtL) r0
            r0.A06(r8)
            goto L_0x0104
        L_0x0114:
            X.XZz r0 = X.C21954Xmj.A0e
            A03(r8, r0, r3)
            X.XZz r1 = X.C21954Xmj.A0T
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x0169
            java.lang.Object r0 = r3.get(r1)
            if (r0 == 0) goto L_0x0169
            A01(r8, r1)
            java.lang.Object r2 = r3.get(r1)
            java.util.Map r2 = (java.util.Map) r2
            int r0 = r2.size()
            if (r0 != 0) goto L_0x015e
            r0 = 0
        L_0x0137:
            byte r1 = (byte) r0
            java.io.OutputStream r0 = r8.A03
            r0.write(r1)
            java.util.Iterator r2 = X.AnonymousClass7TF.A0u(r2)
        L_0x0141:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0169
            java.util.Map$Entry r1 = X.AnonymousClass7TE.A1J(r2)
            java.lang.Object r0 = r1.getKey()
            java.lang.String r0 = (java.lang.String) r0
            r8.A04(r0)
            java.lang.Object r0 = r1.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r8.A04(r0)
            goto L_0x0141
        L_0x015e:
            X.C22008Xqr.A00(r8, r0)
            byte[] r0 = X.C22008Xqr.A05
            byte r1 = r0[r4]
            int r0 = r1 << 4
            r0 = r0 | r1
            goto L_0x0137
        L_0x0169:
            X.XZz r1 = X.C21954Xmj.A0b
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x0032
            java.lang.Object r0 = r3.get(r1)
            if (r0 == 0) goto L_0x0032
            A01(r8, r1)
            java.lang.Object r3 = r3.get(r1)
            goto L_0x01a0
        L_0x017f:
            java.util.Map r2 = r7.A01
            X.XZz r0 = X.C21954Xmj.A0S
            A03(r8, r0, r2)
            X.XZz r0 = X.C21954Xmj.A0Q
            A02(r8, r0, r2)
            X.XZz r1 = X.C21954Xmj.A0R
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x0032
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x0032
            A01(r8, r1)
            java.lang.Object r3 = r2.get(r1)
        L_0x01a0:
            byte[] r3 = (byte[]) r3
            int r2 = r3.length
            r1 = 0
            X.C22008Xqr.A00(r8, r2)
            java.io.OutputStream r0 = r8.A03
            r0.write(r3, r1, r2)
            goto L_0x0032
        L_0x01ae:
            java.util.Map r2 = r7.A01
            X.XZz r0 = X.C21954Xmj.A0v
            A03(r8, r0, r2)
            X.XZz r0 = X.C21954Xmj.A0u
            A03(r8, r0, r2)
            X.XZz r1 = X.C21954Xmj.A0w
            goto L_0x001a
        L_0x01be:
            java.util.Map r2 = r7.A01
            X.XZz r0 = X.C21954Xmj.A0p
            A03(r8, r0, r2)
            X.XZz r1 = X.C21954Xmj.A0k
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x0305
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x0305
            A01(r8, r1)
            java.lang.Object r0 = r2.get(r1)
            long r0 = X.AnonymousClass7TE.A0R(r0)
            r8.A03(r0)
            X.XZz r0 = X.C21954Xmj.A0l
            A02(r8, r0, r2)
            X.XZz r0 = X.C21954Xmj.A0f
            A02(r8, r0, r2)
            X.XZz r0 = X.C21954Xmj.A0i
            A03(r8, r0, r2)
            X.XZz r0 = X.C21954Xmj.A0n
            A03(r8, r0, r2)
            X.XZz r0 = X.C21954Xmj.A0o
            A02(r8, r0, r2)
            X.XZz r0 = X.C21954Xmj.A0g
            A03(r8, r0, r2)
            X.XZz r0 = X.C21954Xmj.A0h
            A03(r8, r0, r2)
            X.XZz r0 = X.C21954Xmj.A0m
            A03(r8, r0, r2)
            X.XZz r0 = X.C21954Xmj.A0j
            A05(r8, r0, r2)
            X.XZz r0 = X.C21954Xmj.A0q
            A05(r8, r0, r2)
            goto L_0x0032
        L_0x0215:
            java.util.Map r2 = r7.A01
            X.XZz r0 = X.C21954Xmj.A0P
            A05(r8, r0, r2)
            X.XZz r0 = X.C21954Xmj.A0O
            A03(r8, r0, r2)
            X.XZz r0 = X.C21954Xmj.A01
            A05(r8, r0, r2)
            X.XZz r0 = X.C21954Xmj.A09
            A05(r8, r0, r2)
            X.XZz r0 = X.C21954Xmj.A0L
            A02(r8, r0, r2)
            X.XZz r0 = X.C21954Xmj.A0J
            A04(r8, r0, r2)
            X.XZz r0 = X.C21954Xmj.A0G
            A04(r8, r0, r2)
            X.XZz r0 = X.C21954Xmj.A07
            A03(r8, r0, r2)
            X.XZz r0 = X.C21954Xmj.A0E
            A04(r8, r0, r2)
            X.XZz r0 = X.C21954Xmj.A0I
            A02(r8, r0, r2)
            X.XZz r0 = X.C21954Xmj.A0H
            A02(r8, r0, r2)
            X.XZz r0 = X.C21954Xmj.A03
            A05(r8, r0, r2)
            X.XZz r0 = X.C21954Xmj.A02
            A03(r8, r0, r2)
            X.XZz r1 = X.C21954Xmj.A0N
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x0293
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x0293
            A01(r8, r1)
            java.lang.Object r3 = r2.get(r1)
            java.util.List r3 = (java.util.List) r3
            r1 = 8
            int r0 = r3.size()
            r8.A02(r0, r1)
            java.util.Iterator r3 = r3.iterator()
        L_0x027c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0293
            java.lang.Object r0 = r3.next()
            int r0 = X.AnonymousClass7TE.A0M(r0)
            int r1 = r0 << 1
            int r0 = r0 >> 31
            r0 = r0 ^ r1
            X.C22008Xqr.A00(r8, r0)
            goto L_0x027c
        L_0x0293:
            X.XZz r0 = X.C21954Xmj.A05
            A03(r8, r0, r2)
            X.XZz r0 = X.C21954Xmj.A00
            A05(r8, r0, r2)
            X.XZz r0 = X.C21954Xmj.A0K
            A04(r8, r0, r2)
            X.XZz r1 = X.C21954Xmj.A06
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x02c3
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x02c3
            A01(r8, r1)
            java.lang.Object r4 = r2.get(r1)
            byte[] r4 = (byte[]) r4
            int r3 = r4.length
            r1 = 0
            X.C22008Xqr.A00(r8, r3)
            java.io.OutputStream r0 = r8.A03
            r0.write(r4, r1, r3)
        L_0x02c3:
            X.XZz r0 = X.C21954Xmj.A0M
            A03(r8, r0, r2)
            X.XZz r0 = X.C21954Xmj.A08
            A03(r8, r0, r2)
            X.XZz r0 = X.C21954Xmj.A0F
            A05(r8, r0, r2)
            X.XZz r1 = X.C21954Xmj.A04
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x02f2
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x02f2
            A01(r8, r1)
            java.lang.Object r0 = r2.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            byte r1 = r0.byteValue()
            java.io.OutputStream r0 = r8.A03
            r0.write(r1)
        L_0x02f2:
            X.XZz r0 = X.C21954Xmj.A0A
            A05(r8, r0, r2)
            X.XZz r0 = X.C21954Xmj.A0B
            A03(r8, r0, r2)
            X.XZz r0 = X.C21954Xmj.A0C
            A03(r8, r0, r2)
            X.XZz r1 = X.C21954Xmj.A0D
            goto L_0x001a
        L_0x0305:
            java.lang.String r0 = "Required field 'GetIrisDiffs.lastSeqId' was not present!"
            java.io.IOException r0 = X.JTO.A0u(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22026XtL.A06(X.Xqr):void");
    }

    public C22026XtL(Integer num) {
        this.A00 = num;
    }

    public static Iterator A00(C22008Xqr xqr, XZz xZz, Map map, byte b) {
        A01(xqr, xZz);
        List list = (List) map.get(xZz);
        xqr.A02(list.size(), b);
        return list.iterator();
    }

    public static void A02(C22008Xqr xqr, XZz xZz, Map map) {
        if (map.containsKey(xZz) && map.get(xZz) != null) {
            A01(xqr, xZz);
            int intValue = ((Number) map.get(xZz)).intValue();
            C22008Xqr.A00(xqr, (intValue >> 31) ^ (intValue << 1));
        }
    }

    public static void A03(C22008Xqr xqr, XZz xZz, Map map) {
        if (map.containsKey(xZz) && map.get(xZz) != null) {
            A01(xqr, xZz);
            xqr.A04((String) map.get(xZz));
        }
    }

    public static void A04(C22008Xqr xqr, XZz xZz, Map map) {
        int i;
        if (map.containsKey(xZz) && map.get(xZz) != null) {
            A01(xqr, xZz);
            boolean booleanValue = ((Boolean) map.get(xZz)).booleanValue();
            Short sh = xqr.A00;
            int i2 = 1;
            if (sh != null) {
                short shortValue = sh.shortValue();
                if (!booleanValue) {
                    i2 = 2;
                }
                short s = xqr.A02;
                if (shortValue <= s || (i = shortValue - s) > 15) {
                    xqr.A03.write(i2);
                    C22008Xqr.A00(xqr, (shortValue >> 31) ^ (shortValue << 1));
                } else {
                    xqr.A03.write((byte) ((i << 4) | i2));
                }
                xqr.A02 = shortValue;
                xqr.A00 = null;
                return;
            }
            if (!booleanValue) {
                i2 = 2;
            }
            xqr.A03.write(i2);
        }
    }

    public static void A05(C22008Xqr xqr, XZz xZz, Map map) {
        if (map.containsKey(xZz) && map.get(xZz) != null) {
            A01(xqr, xZz);
            xqr.A03(((Number) map.get(xZz)).longValue());
        }
    }
}
