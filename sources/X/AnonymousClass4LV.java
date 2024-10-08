package X;

import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.4LV  reason: invalid class name */
public final class AnonymousClass4LV {
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        if (r2.isEmpty() != false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(java.util.Map r8) {
        /*
            r7 = 0
            java.io.StringWriter r6 = new java.io.StringWriter     // Catch:{ IOException -> 0x0058 }
            r6.<init>()     // Catch:{ IOException -> 0x0058 }
            X.15p r0 = X.AnonymousClass15o.A00     // Catch:{ IOException -> 0x0058 }
            X.17W r5 = r0.A0A(r6)     // Catch:{ IOException -> 0x0058 }
            r5.A0b()     // Catch:{ IOException -> 0x0058 }
            java.util.Collection r0 = r8.values()     // Catch:{ IOException -> 0x0058 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ IOException -> 0x0058 }
        L_0x0017:
            boolean r0 = r4.hasNext()     // Catch:{ IOException -> 0x0058 }
            if (r0 == 0) goto L_0x004d
            java.lang.Object r3 = r4.next()     // Catch:{ IOException -> 0x0058 }
            X.4jW r3 = (X.C271744jW) r3     // Catch:{ IOException -> 0x0058 }
            java.util.List r2 = r3.BUP()     // Catch:{ IOException -> 0x0058 }
            if (r2 == 0) goto L_0x0030
            boolean r1 = r2.isEmpty()     // Catch:{ IOException -> 0x0058 }
            r0 = 1
            if (r1 == 0) goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            if (r0 == 0) goto L_0x0049
            if (r2 == 0) goto L_0x0017
            java.util.Iterator r1 = r2.iterator()     // Catch:{ IOException -> 0x0058 }
        L_0x0039:
            boolean r0 = r1.hasNext()     // Catch:{ IOException -> 0x0058 }
            if (r0 == 0) goto L_0x0017
            java.lang.Object r0 = r1.next()     // Catch:{ IOException -> 0x0058 }
            X.4jW r0 = (X.C271744jW) r0     // Catch:{ IOException -> 0x0058 }
            A01(r5, r0)     // Catch:{ IOException -> 0x0058 }
            goto L_0x0039
        L_0x0049:
            A01(r5, r3)     // Catch:{ IOException -> 0x0058 }
            goto L_0x0017
        L_0x004d:
            r5.A0Y()     // Catch:{ IOException -> 0x0058 }
            r5.close()     // Catch:{ IOException -> 0x0058 }
            java.lang.String r0 = r6.toString()     // Catch:{ IOException -> 0x0058 }
            return r0
        L_0x0058:
            r3 = move-exception
            java.lang.Class<X.4LV> r2 = X.AnonymousClass4LV.class
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r0 = "Failed to convert a collection to json"
            X.0KC.A07(r2, r0, r3, r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4LV.A00(java.util.Map):java.lang.String");
    }

    public static final void A01(17Z r2, C271744jW r3) {
        int i;
        int i2;
        r2.A0c();
        switch (r3.BJb().intValue()) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            default:
                i = 0;
                break;
        }
        r2.A0P("item_type", i);
        r2.A0R("item_id", r3.getId());
        r2.A0P(TraceFieldType.CurrentState, r3.Bz6().A00);
        r2.A0P("priority_index", r3.Bfh());
        r2.A0P("insertion_index", r3.BHd());
        r2.A0R("ad_pod_id", r3.AZC());
        if (r3 instanceof C271824je) {
            i2 = ((C271824je) r3).A04;
        } else {
            i2 = 0;
        }
        r2.A0P("multi_ads_type", i2);
        r2.A0Z();
    }
}
