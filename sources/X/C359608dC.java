package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.8dC  reason: invalid class name and case insensitive filesystem */
public abstract class C359608dC {
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0012, code lost:
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0047, code lost:
        r2 = r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C252503pD A00(java.lang.Object r4) {
        /*
            r2 = 0
            if (r4 != 0) goto L_0x0004
            return r2
        L_0x0004:
            boolean r0 = r4 instanceof java.util.Map
            if (r0 == 0) goto L_0x003d
            java.util.Map r4 = (java.util.Map) r4
            java.util.Set r0 = r4.entrySet()
            java.util.Iterator r4 = r0.iterator()
        L_0x0012:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0079
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r0 = r1.getKey()
            java.lang.String r3 = java.lang.String.valueOf(r0)
            java.lang.Object r0 = r1.getValue()
            X.3pD r1 = A00(r0)
            if (r1 == 0) goto L_0x0012
            if (r2 != 0) goto L_0x0039
            X.4fB r0 = X.C269474fB.A00
            X.4cw r2 = new X.4cw
            r2.<init>(r0)
        L_0x0039:
            r2.A0B(r1, r3)
            goto L_0x0012
        L_0x003d:
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0064
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.Iterator r3 = r4.iterator()
        L_0x0047:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r3.next()
            X.3pD r1 = A00(r0)
            if (r0 == 0) goto L_0x0047
            if (r2 != 0) goto L_0x0060
            X.4fB r0 = X.C269474fB.A00
            X.5E9 r2 = new X.5E9
            r2.<init>(r0)
        L_0x0060:
            r2.A0B(r1)
            goto L_0x0047
        L_0x0064:
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x00ca
            boolean r0 = r4 instanceof java.lang.Float
            if (r0 == 0) goto L_0x007a
            java.lang.String r0 = java.lang.String.valueOf(r4)
            double r0 = java.lang.Double.parseDouble(r0)
        L_0x0074:
            X.9gG r2 = new X.9gG
            r2.<init>(r0)
        L_0x0079:
            return r2
        L_0x007a:
            boolean r0 = r4 instanceof java.lang.Double
            if (r0 == 0) goto L_0x0087
            java.lang.Number r4 = (java.lang.Number) r4
            if (r4 == 0) goto L_0x00d7
            double r0 = r4.doubleValue()
            goto L_0x0074
        L_0x0087:
            boolean r0 = r4 instanceof java.lang.Byte
            if (r0 != 0) goto L_0x00ca
            boolean r0 = r4 instanceof java.lang.Short
            if (r0 == 0) goto L_0x009d
            java.lang.Number r4 = (java.lang.Number) r4
            if (r4 == 0) goto L_0x00d7
            short r0 = r4.shortValue()
            X.9gI r2 = new X.9gI
            r2.<init>(r0)
            return r2
        L_0x009d:
            boolean r0 = r4 instanceof java.lang.Long
            if (r0 == 0) goto L_0x00af
            java.lang.Number r4 = (java.lang.Number) r4
            if (r4 == 0) goto L_0x00d7
            long r0 = r4.longValue()
            X.5Dx r2 = new X.5Dx
            r2.<init>(r0)
            return r2
        L_0x00af:
            boolean r0 = r4 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x00c1
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r0 = r4.booleanValue()
            if (r0 == 0) goto L_0x00be
            X.8gK r2 = X.C361498gK.A02
            return r2
        L_0x00be:
            X.8gK r2 = X.C361498gK.A01
            return r2
        L_0x00c1:
            java.lang.String r0 = java.lang.String.valueOf(r4)
            X.5Dv r2 = X.C282585Dv.A00(r0)
            return r2
        L_0x00ca:
            java.lang.Number r4 = (java.lang.Number) r4
            if (r4 == 0) goto L_0x00d7
            int r0 = r4.intValue()
            X.5E0 r2 = X.AnonymousClass5E0.A00(r0)
            return r2
        L_0x00d7:
            X.9gL r2 = X.C383839gL.A00
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C359608dC.A00(java.lang.Object):X.3pD");
    }

    public static HashMap A01(Map map) {
        C252503pD A00;
        HashMap hashMap = new HashMap();
        if (!map.isEmpty()) {
            hashMap.put("server_params", map);
        }
        HashMap hashMap2 = new HashMap();
        String str = "{}";
        if (!hashMap.isEmpty() && (A00 = A00(hashMap)) != null) {
            str = A00.toString();
        }
        hashMap2.put("params", str);
        return hashMap2;
    }
}
