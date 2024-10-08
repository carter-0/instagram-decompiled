package X;

import com.facebook.msys.mci.EventLogSubscriber;

/* renamed from: X.3k5  reason: invalid class name and case insensitive filesystem */
public final class C249613k5 extends EventLogSubscriber {
    public final /* synthetic */ 1wk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C249613k5(1wk r2, String[] strArr) {
        super(1, strArr);
        this.A00 = r2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0063, code lost:
        r5.put(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b3, code lost:
        if (r3.A03 != null) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b5, code lost:
        r9 = r3.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b7, code lost:
        r5.put(r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00be, code lost:
        if (r9 == false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c0, code lost:
        r9 = new java.util.HashMap();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLogTalEvent(com.facebook.msys.mci.EventLoggingData r13) {
        /*
            r12 = this;
            long r0 = r13.mEventId
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "client_event"
            X.0xI r2 = X.0xI.A01(r1, r0)
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            X.62V[] r7 = r13.mParams
            int r6 = r7.length
            r11 = 0
            r4 = 0
        L_0x0016:
            r9 = 1
            if (r4 >= r6) goto L_0x00c6
            r3 = r7[r4]
            long r0 = r3.A02
            java.lang.String r8 = java.lang.Long.toString(r0)
            byte r0 = r3.A00
            r0 = r0 & 1
            if (r0 > 0) goto L_0x0028
            r9 = 0
        L_0x0028:
            int r0 = r3.A01
            r1 = 0
            switch(r0) {
                case 0: goto L_0x0036;
                case 1: goto L_0x004d;
                case 2: goto L_0x0067;
                case 3: goto L_0x0067;
                case 4: goto L_0x0067;
                case 5: goto L_0x006e;
                case 6: goto L_0x006e;
                case 7: goto L_0x006e;
                case 8: goto L_0x006e;
                case 9: goto L_0x006e;
                case 10: goto L_0x006e;
                case 11: goto L_0x006e;
                case 12: goto L_0x006e;
                case 13: goto L_0x006e;
                case 14: goto L_0x007a;
                case 15: goto L_0x007a;
                case 16: goto L_0x007a;
                case 17: goto L_0x007a;
                case 18: goto L_0x00b1;
                case 19: goto L_0x00b1;
                case 20: goto L_0x00b1;
                case 21: goto L_0x00b1;
                case 22: goto L_0x0036;
                case 23: goto L_0x004d;
                case 24: goto L_0x0067;
                default: goto L_0x002e;
            }
        L_0x002e:
            X.AnonymousClass62U.A00(r11)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x0036:
            if (r9 != 0) goto L_0x003c
            java.lang.Object r0 = r3.A03
            if (r0 == 0) goto L_0x00ba
        L_0x003c:
            java.lang.Object r0 = r3.A03
            if (r0 == 0) goto L_0x0063
            java.lang.Object r0 = r3.A03
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            goto L_0x0063
        L_0x004d:
            if (r9 != 0) goto L_0x0053
            java.lang.Object r0 = r3.A03
            if (r0 == 0) goto L_0x00ba
        L_0x0053:
            java.lang.Object r0 = r3.A03
            if (r0 == 0) goto L_0x0063
            java.lang.Object r0 = r3.A03
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
        L_0x0063:
            r5.put(r8, r1)
            goto L_0x00ba
        L_0x0067:
            if (r9 != 0) goto L_0x00b5
            java.lang.Object r0 = r3.A03
            if (r0 == 0) goto L_0x00ba
            goto L_0x00b5
        L_0x006e:
            java.lang.Object r0 = r3.A03
            if (r0 != 0) goto L_0x00b5
            if (r9 == 0) goto L_0x00ba
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            goto L_0x00b7
        L_0x007a:
            java.lang.Object r0 = r3.A03
            if (r0 == 0) goto L_0x00be
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.lang.Object r0 = r3.A03
            java.util.Map r0 = (java.util.Map) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r10 = r0.iterator()
        L_0x008f:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00b7
            java.lang.Object r3 = r10.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r0 = r3.getKey()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            java.lang.String r1 = java.lang.Long.toString(r0)
            java.lang.Object r0 = r3.getValue()
            r9.put(r1, r0)
            goto L_0x008f
        L_0x00b1:
            java.lang.Object r0 = r3.A03
            if (r0 == 0) goto L_0x00be
        L_0x00b5:
            java.lang.Object r9 = r3.A03
        L_0x00b7:
            r5.put(r8, r9)
        L_0x00ba:
            int r4 = r4 + 1
            goto L_0x0016
        L_0x00be:
            if (r9 == 0) goto L_0x00ba
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            goto L_0x00b7
        L_0x00c6:
            java.lang.String r4 = "event_id"
            boolean r0 = r5.containsKey(r4)
            r0 = r0 ^ 1
            X.AnonymousClass62U.A00(r0)
            java.lang.String r3 = "__is_tal_event"
            boolean r0 = r5.containsKey(r3)
            r0 = r0 ^ 1
            X.AnonymousClass62U.A00(r0)
            long r0 = r13.mEventId
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.put(r4, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            r5.put(r3, r0)
            java.util.Set r0 = r5.entrySet()
            java.util.Iterator r4 = r0.iterator()
        L_0x00f4:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0176
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r1.getValue()
            boolean r0 = r3 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x0114
            java.lang.Object r0 = r1.getKey()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r2.A09(r0, r3)
            goto L_0x00f4
        L_0x0114:
            boolean r0 = r3 instanceof java.lang.Double
            if (r0 == 0) goto L_0x0124
            java.lang.Object r0 = r1.getKey()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Double r3 = (java.lang.Double) r3
            r2.A0A(r0, r3)
            goto L_0x00f4
        L_0x0124:
            boolean r0 = r3 instanceof java.lang.Long
            if (r0 == 0) goto L_0x0134
            java.lang.Object r0 = r1.getKey()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Long r3 = (java.lang.Long) r3
            r2.A0B(r0, r3)
            goto L_0x00f4
        L_0x0134:
            boolean r0 = r3 instanceof java.lang.String
            if (r0 != 0) goto L_0x0162
            if (r3 == 0) goto L_0x0162
            boolean r0 = r3 instanceof java.util.List
            if (r0 == 0) goto L_0x014e
            java.lang.Object r1 = r1.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.util.List r3 = (java.util.List) r3
            X.0xE r0 = X.1wk.A01(r3)
            r2.A06(r0, r1)
            goto L_0x00f4
        L_0x014e:
            boolean r0 = r3 instanceof java.util.Map
            if (r0 == 0) goto L_0x016e
            java.lang.Object r1 = r1.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.util.Map r3 = (java.util.Map) r3
            X.0xF r0 = X.1wk.A00(r3)
            r2.A05(r0, r1)
            goto L_0x00f4
        L_0x0162:
            java.lang.Object r0 = r1.getKey()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r3 = (java.lang.String) r3
            r2.A0C(r0, r3)
            goto L_0x00f4
        L_0x016e:
            java.lang.String r0 = "Unexpected value type."
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        L_0x0176:
            X.1wk r0 = r12.A00
            X.0iu r0 = r0.A00
            r0.EFq(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C249613k5.onLogTalEvent(com.facebook.msys.mci.EventLoggingData):void");
    }
}
