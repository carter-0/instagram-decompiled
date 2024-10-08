package X;

/* renamed from: X.9KY  reason: invalid class name */
public final class AnonymousClass9KY extends AnonymousClass1Ek implements 0sL {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9KY(Object obj, Object obj2, String str, AnonymousClass4D7 r5, int i) {
        super(2, r5);
        this.A00 = i;
        this.A02 = obj;
        this.A03 = str;
        this.A01 = obj2;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.9KY, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r8) {
        int i;
        int i2 = this.A00;
        Object obj2 = this.A02;
        String str = this.A03;
        Object obj3 = this.A01;
        switch (i2) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            default:
                i = 2;
                break;
        }
        return new AnonymousClass9KY(obj2, obj3, str, r8, i);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AnonymousClass9KY) create(obj, (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01b6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        X.1zE.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01ba, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01bd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01be, code lost:
        X.1zE.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01c1, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.A00
            X.0eS.A00(r11)
            switch(r0) {
                case 0: goto L_0x005b;
                case 1: goto L_0x0140;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.Object r1 = r10.A02
            X.1ua r1 = (X.1ua) r1
            com.instagram.common.session.UserSession r0 = r1.A01
            java.lang.String r6 = r0.A05
            java.lang.String r7 = r10.A03
            java.lang.Object r0 = r10.A01
            X.3Q2 r0 = (X.AnonymousClass3Q2) r0
            if (r0 == 0) goto L_0x001c
            X.1iA r4 = r0.A1G
            if (r4 != 0) goto L_0x001e
        L_0x001c:
            X.1iA r4 = X.1iA.A0Z
        L_0x001e:
            if (r0 == 0) goto L_0x0026
            com.instagram.pendingmedia.model.constants.ShareType r5 = r0.A0E()
            if (r5 != 0) goto L_0x0028
        L_0x0026:
            com.instagram.pendingmedia.model.constants.ShareType r5 = com.instagram.pendingmedia.model.constants.ShareType.UNKNOWN
        L_0x0028:
            if (r0 == 0) goto L_0x0059
            X.28D r3 = r0.A0i
        L_0x002c:
            java.lang.String r8 = "user post"
            r9 = -1
            X.JvL r2 = new X.JvL
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            X.0eM r3 = r1.A09
            java.lang.Object r1 = r3.getValue()
            X.385 r1 = (X.AnonymousClass385) r1
            java.lang.String r0 = "PENDING_MEDIA_UPLOAD-"
            java.lang.String r2 = r2.A04
            java.lang.String r0 = X.002.A0R(r0, r2)
            r1.A05(r0)
            java.lang.Object r1 = r3.getValue()
            X.385 r1 = (X.AnonymousClass385) r1
            java.lang.String r0 = "PENDING_MEDIA_NETWORK-"
            java.lang.String r0 = X.002.A0R(r0, r2)
            r1.A05(r0)
        L_0x0056:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0059:
            r3 = 0
            goto L_0x002c
        L_0x005b:
            java.lang.Object r2 = r10.A02
            X.41x r2 = (X.C2594941x) r2
            java.lang.String r7 = r10.A03
            java.lang.Object r6 = r10.A01
            X.9IL r6 = (X.AnonymousClass9IL) r6
            java.lang.Object r1 = r6.A02
            X.4VX r1 = (X.AnonymousClass4VX) r1
            X.0eM r5 = r2.A01
            java.lang.Object r0 = r5.getValue()
            X.1LQ r0 = (X.1LQ) r0
            if (r1 != 0) goto L_0x009d
            r0.remove(r7)
        L_0x0076:
            long r2 = r6.A01
            r6 = 0
            X.0qQ.A0B(r7, r6)
            java.lang.String r0 = "/lastFetchTime"
            java.lang.String r4 = X.002.A0R(r7, r0)
            java.lang.Object r0 = r5.getValue()
            X.2jB r0 = (X.C227392jB) r0
            X.2ij r1 = r0.A00
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            X.0qQ.A0B(r4, r6)
            r0 = 1
            X.0qQ.A0B(r2, r0)
            X.1FL r1 = r1.A00
            java.lang.String r0 = "metadata"
            r1.A04(r4, r2, r0)
            goto L_0x0056
        L_0x009d:
            java.io.OutputStream r4 = r0.write(r7)
            X.41w r2 = r2.A00     // Catch:{ all -> 0x01bb }
            X.0qQ.A0A(r4)     // Catch:{ all -> 0x01bb }
            r0 = 0
            X.0qQ.A0B(r4, r0)     // Catch:{ all -> 0x01bb }
            boolean r0 = r2.A00     // Catch:{ all -> 0x01bb }
            if (r0 == 0) goto L_0x0100
            boolean r0 = r1 instanceof X.AnonymousClass4VW     // Catch:{ all -> 0x01bb }
            if (r0 == 0) goto L_0x0100
            X.4VW r1 = (X.AnonymousClass4VW) r1     // Catch:{ all -> 0x01bb }
            r0 = 1
            X.0qQ.A0B(r1, r0)     // Catch:{ all -> 0x01bb }
            X.15p r0 = X.AnonymousClass15o.A00     // Catch:{ all -> 0x01bb }
            X.4bd r3 = r0.A08(r4)     // Catch:{ all -> 0x01bb }
            X.9Iu r8 = r1.A00     // Catch:{ all -> 0x01b4 }
            r3.A0c()     // Catch:{ all -> 0x01b4 }
            java.lang.Object r1 = r8.A00     // Catch:{ all -> 0x01b4 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x01b4 }
            if (r1 == 0) goto L_0x00f6
            java.lang.String r0 = "promotions"
            X.16P.A03(r3, r0)     // Catch:{ all -> 0x01b4 }
            java.util.Iterator r2 = r1.iterator()     // Catch:{ all -> 0x01b4 }
        L_0x00d2:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x01b4 }
            if (r0 == 0) goto L_0x00f3
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x01b4 }
            X.4VQ r0 = (X.AnonymousClass4VQ) r0     // Catch:{ all -> 0x01b4 }
            if (r0 == 0) goto L_0x00d2
            r3.A0c()     // Catch:{ all -> 0x01b4 }
            X.4UC r1 = r0.A01     // Catch:{ all -> 0x01b4 }
            if (r1 == 0) goto L_0x00ef
            java.lang.String r0 = "quick_promotion"
            r3.A0q(r0)     // Catch:{ all -> 0x01b4 }
            X.AnonymousClass4V6.A00(r3, r1)     // Catch:{ all -> 0x01b4 }
        L_0x00ef:
            r3.A0Z()     // Catch:{ all -> 0x01b4 }
            goto L_0x00d2
        L_0x00f3:
            r3.A0Y()     // Catch:{ all -> 0x01b4 }
        L_0x00f6:
            java.lang.String r1 = r8.A01     // Catch:{ all -> 0x01b4 }
            if (r1 == 0) goto L_0x0135
            java.lang.String r0 = "bloksVersionId"
            r3.A0R(r0, r1)     // Catch:{ all -> 0x01b4 }
            goto L_0x0135
        L_0x0100:
            boolean r0 = r1 instanceof X.AVG     // Catch:{ all -> 0x01bb }
            if (r0 == 0) goto L_0x013b
            X.AVG r1 = (X.AVG) r1     // Catch:{ all -> 0x01bb }
            r0 = 1
            X.0qQ.A0B(r1, r0)     // Catch:{ all -> 0x01bb }
            X.15p r0 = X.AnonymousClass15o.A00     // Catch:{ all -> 0x01bb }
            X.4bd r3 = r0.A08(r4)     // Catch:{ all -> 0x01bb }
            X.JV7 r2 = r1.A00     // Catch:{ all -> 0x01b4 }
            r3.A0c()     // Catch:{ all -> 0x01b4 }
            java.lang.String r1 = r2.A02     // Catch:{ all -> 0x01b4 }
            if (r1 == 0) goto L_0x011e
            java.lang.String r0 = "userId"
            r3.A0R(r0, r1)     // Catch:{ all -> 0x01b4 }
        L_0x011e:
            java.lang.Object r1 = r2.A00     // Catch:{ all -> 0x01b4 }
            X.4W5 r1 = (X.AnonymousClass4W5) r1     // Catch:{ all -> 0x01b4 }
            if (r1 == 0) goto L_0x012c
            java.lang.String r0 = "qpResponse"
            r3.A0q(r0)     // Catch:{ all -> 0x01b4 }
            X.C283605Im.A00(r3, r1)     // Catch:{ all -> 0x01b4 }
        L_0x012c:
            java.lang.String r1 = r2.A01     // Catch:{ all -> 0x01b4 }
            if (r1 == 0) goto L_0x0135
            java.lang.String r0 = "bloksVersionId"
            r3.A0R(r0, r1)     // Catch:{ all -> 0x01b4 }
        L_0x0135:
            r3.A0Z()     // Catch:{ all -> 0x01b4 }
            r3.close()     // Catch:{ all -> 0x01bb }
        L_0x013b:
            r4.close()
            goto L_0x0076
        L_0x0140:
            java.lang.Object r9 = r10.A02
            X.565 r9 = (X.AnonymousClass565) r9
            X.B2C r0 = r9.A00
            if (r0 == 0) goto L_0x0056
            java.lang.String r8 = r10.A03
            java.lang.Object r6 = r10.A01
            X.0sP r6 = (X.0sP) r6
            com.instagram.igsignals.core.IgSignalsExampleData r7 = r0.EIq(r8)
            if (r7 == 0) goto L_0x0056
            X.0sJ r5 = r9.A07
            double r0 = r7.A00
            java.lang.Double r4 = new java.lang.Double
            r4.<init>(r0)
            java.util.List r3 = r7.A03
            long r1 = r7.A01
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r1)
            java.lang.Object r5 = r5.invoke(r8, r4, r3, r0)
            X.LsL r5 = (X.C65380LsL) r5
            r5.A00 = r9
            java.util.List r0 = r7.A04
            r5.A01 = r0
            java.util.Map r4 = r5.A06
            java.util.List r2 = r7.A05
            r0 = 10
            int r0 = X.0Yv.A1E(r2, r0)
            int r1 = X.0se.A0L(r0)
            r0 = 16
            if (r1 >= r0) goto L_0x0186
            r1 = 16
        L_0x0186:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
        L_0x018f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01ac
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.instagram.igsignals.core.IgSignalsModelPrediction r0 = (com.instagram.igsignals.core.IgSignalsModelPrediction) r0
            X.Vzm r0 = r0.A02
            if (r0 == 0) goto L_0x01a6
            java.lang.String r0 = r0.A00()
            if (r0 != 0) goto L_0x01a8
        L_0x01a6:
            java.lang.String r0 = "none"
        L_0x01a8:
            r3.put(r0, r1)
            goto L_0x018f
        L_0x01ac:
            r4.putAll(r3)
            r6.invoke(r5)
            goto L_0x0056
        L_0x01b4:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01b6 }
        L_0x01b6:
            r0 = move-exception
            X.1zE.A00(r3, r1)     // Catch:{ all -> 0x01bb }
            throw r0     // Catch:{ all -> 0x01bb }
        L_0x01bb:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01bd }
        L_0x01bd:
            r0 = move-exception
            X.1zE.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9KY.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
