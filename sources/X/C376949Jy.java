package X;

import com.instagram.feed.media.flashmedia.FlashMediaLocalDataSource;

/* renamed from: X.9Jy  reason: invalid class name and case insensitive filesystem */
public final class C376949Jy extends AnonymousClass1Ek implements 0sK {
    public Object A00;
    public Object A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C376949Jy(FlashMediaLocalDataSource flashMediaLocalDataSource, AnonymousClass4D7 r3) {
        super(3, r3);
        this.A02 = 6;
        this.A01 = flashMediaLocalDataSource;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        r1 = new X.C376949Jy(r0, r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        r1 = new X.C376949Jy(r0, r6);
        r1.A00 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r1.A01 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        return r1.invokeSuspend(X.C60340gF.A00);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
        /*
            r3 = this;
            int r0 = r3.A02
            X.4D7 r6 = (X.AnonymousClass4D7) r6
            switch(r0) {
                case 0: goto L_0x0019;
                case 1: goto L_0x001b;
                case 2: goto L_0x001f;
                case 3: goto L_0x0023;
                case 4: goto L_0x002c;
                case 5: goto L_0x002e;
                case 6: goto L_0x0030;
                case 7: goto L_0x003c;
                default: goto L_0x0007;
            }
        L_0x0007:
            r0 = 8
        L_0x0009:
            X.9Jy r1 = new X.9Jy
            r1.<init>((int) r0, (X.AnonymousClass4D7) r6)
            r1.A00 = r4
        L_0x0010:
            r1.A01 = r5
        L_0x0012:
            X.0gF r0 = X.C60340gF.A00
            java.lang.Object r0 = r1.invokeSuspend(r0)
            return r0
        L_0x0019:
            r0 = 0
            goto L_0x0009
        L_0x001b:
            java.lang.Object r0 = r3.A00
            r2 = 1
            goto L_0x0026
        L_0x001f:
            java.lang.Object r0 = r3.A00
            r2 = 2
            goto L_0x0026
        L_0x0023:
            java.lang.Object r0 = r3.A00
            r2 = 3
        L_0x0026:
            X.9Jy r1 = new X.9Jy
            r1.<init>(r0, r6, r2)
            goto L_0x0010
        L_0x002c:
            r0 = 4
            goto L_0x0009
        L_0x002e:
            r0 = 5
            goto L_0x0009
        L_0x0030:
            java.lang.Object r0 = r3.A01
            com.instagram.feed.media.flashmedia.FlashMediaLocalDataSource r0 = (com.instagram.feed.media.flashmedia.FlashMediaLocalDataSource) r0
            X.9Jy r1 = new X.9Jy
            r1.<init>((com.instagram.feed.media.flashmedia.FlashMediaLocalDataSource) r0, (X.AnonymousClass4D7) r6)
            r1.A00 = r5
            goto L_0x0012
        L_0x003c:
            r0 = 7
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C376949Jy.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01c0, code lost:
        r3.markerEnd(r1, r2, 4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.A02
            switch(r0) {
                case 0: goto L_0x0012;
                case 1: goto L_0x0175;
                case 2: goto L_0x018c;
                case 3: goto L_0x01a5;
                case 4: goto L_0x0005;
                case 5: goto L_0x01c5;
                case 6: goto L_0x01df;
                case 7: goto L_0x0005;
                case 8: goto L_0x01fe;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.0eS.A00(r9)
            java.lang.Object r1 = r8.A00
            java.lang.Object r0 = r8.A01
            X.0eP r2 = new X.0eP
            r2.<init>(r1, r0)
            return r2
        L_0x0012:
            X.0eS.A00(r9)
            java.lang.Object r7 = r8.A00
            X.A4c r7 = (X.C39662A4c) r7
            java.lang.Object r5 = r8.A01
            androidx.datastore.preferences.core.Preferences r5 = (androidx.datastore.preferences.core.Preferences) r5
            r0 = r5
            X.5Lm r0 = (X.C284235Lm) r0
            java.util.Map r0 = r0.A00
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            X.0qQ.A07(r0)
            java.util.Set r1 = r0.keySet()
            r0 = 10
            int r0 = X.0Yv.A1E(r1, r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x003c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x004e
            java.lang.Object r0 = r1.next()
            X.5Ka r0 = (X.AnonymousClass5Ka) r0
            java.lang.String r0 = r0.A00
            r4.add(r0)
            goto L_0x003c
        L_0x004e:
            android.content.SharedPreferences r0 = r7.A00
            java.util.Map r0 = r0.getAll()
            X.0qQ.A07(r0)
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L_0x0064:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x008a
            java.lang.Object r2 = r3.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r1 = r2.getKey()
            java.util.Set r0 = r7.A01
            if (r0 == 0) goto L_0x007e
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0064
        L_0x007e:
            java.lang.Object r1 = r2.getKey()
            java.lang.Object r0 = r2.getValue()
            r6.put(r1, r0)
            goto L_0x0064
        L_0x008a:
            int r0 = r6.size()
            int r0 = X.0se.A0L(r0)
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>(r0)
            java.util.Set r0 = r6.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L_0x009f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00c1
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getKey()
            java.lang.Object r1 = r0.getValue()
            boolean r0 = r1 instanceof java.util.Set
            if (r0 == 0) goto L_0x00bd
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Set r1 = X.00k.A0k(r1)
        L_0x00bd:
            r7.put(r2, r1)
            goto L_0x009f
        L_0x00c1:
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            java.util.Set r0 = r7.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L_0x00ce:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00f2
            java.lang.Object r2 = r3.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r0 = r2.getKey()
            boolean r0 = r4.contains(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00ce
            java.lang.Object r1 = r2.getKey()
            java.lang.Object r0 = r2.getValue()
            r6.put(r1, r0)
            goto L_0x00ce
        L_0x00f2:
            X.5Lm r5 = (X.C284235Lm) r5
            java.util.Map r0 = r5.A00
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r0)
            X.0qQ.A07(r1)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r1)
            r5 = 0
            X.5Lm r4 = new X.5Lm
            r4.<init>(r0, r5)
            java.util.Set r0 = r6.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L_0x0110:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0160
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r0.getValue()
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 != 0) goto L_0x0154
            boolean r0 = r1 instanceof java.lang.Float
            if (r0 != 0) goto L_0x0154
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x0154
            boolean r0 = r1 instanceof java.lang.Long
            if (r0 != 0) goto L_0x0154
            boolean r0 = r1 instanceof java.lang.String
            if (r0 != 0) goto L_0x0154
            boolean r0 = r1 instanceof java.util.Set
            if (r0 == 0) goto L_0x0110
            X.0qQ.A0B(r2, r5)
            X.5Ka r0 = new X.5Ka
            r0.<init>(r2)
            if (r1 != 0) goto L_0x015c
            r0 = 3676(0xe5c, float:5.151E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0154:
            X.0qQ.A0B(r2, r5)
            X.5Ka r0 = new X.5Ka
            r0.<init>(r2)
        L_0x015c:
            r4.A01(r0, r1)
            goto L_0x0110
        L_0x0160:
            java.util.Map r0 = r4.A00
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            X.0qQ.A07(r0)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r0)
            r0 = 1
            X.5Lm r2 = new X.5Lm
            r2.<init>(r1, r0)
            return r2
        L_0x0175:
            X.0eS.A00(r9)
            java.lang.Object r0 = r8.A01
            if (r0 == 0) goto L_0x01fb
            boolean r0 = r0 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L_0x01fb
            java.lang.Object r0 = r8.A00
            X.7iQ r0 = (X.C338727iQ) r0
            X.02m r3 = r0.A02
            int r2 = r0.A00
            r1 = 17635885(0x10d1a2d, float:2.591639E-38)
            goto L_0x01c0
        L_0x018c:
            X.0eS.A00(r9)
            java.lang.Object r0 = r8.A01
            if (r0 == 0) goto L_0x01fb
            boolean r0 = r0 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L_0x01fb
            java.lang.Object r0 = r8.A00
            X.7iO r0 = (X.C338707iO) r0
            X.02m r3 = X.02m.A0p
            int r2 = X.C338707iO.A00(r0)
            r1 = 17640585(0x10d2c89, float:2.5929562E-38)
            goto L_0x01c0
        L_0x01a5:
            X.0eS.A00(r9)
            java.lang.Object r0 = r8.A01
            if (r0 == 0) goto L_0x01fb
            boolean r0 = r0 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L_0x01fb
            java.lang.Object r0 = r8.A00
            X.7uZ r0 = (X.C346077uZ) r0
            X.02m r3 = X.02m.A0p
            X.0qQ.A07(r3)
            int r2 = X.C346077uZ.A00(r0)
            r1 = 17631244(0x10d080c, float:2.5903383E-38)
        L_0x01c0:
            r0 = 4
            r3.markerEnd(r1, r2, r0)
            goto L_0x01fb
        L_0x01c5:
            X.0eS.A00(r9)
            java.lang.Object r1 = r8.A00
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r0 = r8.A01
            if (r0 == 0) goto L_0x01d5
            java.lang.Object r2 = r1.get(r0)
            return r2
        L_0x01d5:
            X.0sl r3 = X.0sl.A00
            r1 = 0
            r0 = 0
            X.8gX r2 = new X.8gX
            r2.<init>(r0, r0, r3, r1)
            return r2
        L_0x01df:
            X.0eS.A00(r9)
            java.lang.Object r3 = r8.A00
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.Object r0 = r8.A01
            com.instagram.feed.media.flashmedia.FlashMediaLocalDataSource r0 = (com.instagram.feed.media.flashmedia.FlashMediaLocalDataSource) r0
            java.lang.String r2 = "getWithLimit"
            X.0fA r1 = r0.A00
            r0 = 817892378(0x30c00c1a, float:1.3973278E-9)
            X.0f9 r0 = r1.AEf(r2, r0)
            r0.ERJ(r3)
            r0.report()
        L_0x01fb:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x01fe:
            X.0eS.A00(r9)
            java.lang.Object r0 = r8.A00
            X.0eP r0 = (X.0eP) r0
            java.lang.Object r1 = r8.A01
            if (r0 == 0) goto L_0x0211
            java.lang.Object r0 = r0.A01
        L_0x020b:
            X.0eP r2 = new X.0eP
            r2.<init>(r0, r1)
            return r2
        L_0x0211:
            r0 = 0
            goto L_0x020b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C376949Jy.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C376949Jy(Object obj, AnonymousClass4D7 r3, int i) {
        super(3, r3);
        this.A02 = i;
        this.A00 = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C376949Jy(int i, AnonymousClass4D7 r3) {
        super(3, r3);
        this.A02 = i;
    }
}
