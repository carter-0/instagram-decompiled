package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.4de  reason: invalid class name and case insensitive filesystem */
public final class C268584de extends AnonymousClass1Pe {
    public final /* synthetic */ long A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass1PF A02;
    public final /* synthetic */ Iterable A03;
    public final /* synthetic */ Object A04;
    public final /* synthetic */ String A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C268584de(UserSession userSession, AnonymousClass1PF r5, Iterable iterable, Object obj, String str, long j) {
        super(604168644, 3, false, false);
        this.A00 = j;
        this.A05 = str;
        this.A02 = r5;
        this.A01 = userSession;
        this.A03 = iterable;
        this.A04 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: X.3n0} */
    /* JADX WARNING: type inference failed for: r9v6, types: [java.lang.Object, X.3kn] */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x020f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0210, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0213, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0049, code lost:
        if (X.182.A06(r11, r4, 36321468975424908L) != false) goto L_0x004b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r18 = this;
            r6 = r18
            long r4 = r6.A00
            X.1Pc r0 = X.1Pb.A01
            java.lang.String r3 = r6.A05
            java.util.concurrent.ConcurrentHashMap r0 = r0.A00
            java.lang.Object r0 = r0.get(r3)
            java.util.concurrent.atomic.AtomicLong r0 = (java.util.concurrent.atomic.AtomicLong) r0
            if (r0 != 0) goto L_0x009f
            r1 = 0
        L_0x0014:
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0214
            X.1PF r10 = r6.A02
            com.instagram.common.session.UserSession r4 = r6.A01
            java.lang.Iterable r9 = r6.A03
            java.lang.Object r5 = r6.A04
            X.3mF r5 = (X.C250903mF) r5
            r7 = 0
            r8 = 1
            X.0qQ.A0B(r9, r8)
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream
            r6.<init>()
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter
            r2.<init>(r6)
            X.0Tu r11 = X.0Tu.A05
            r0 = 36310542583791794(0x81003f004f00b2, double:3.026271568584663E-306)
            boolean r0 = X.182.A06(r11, r4, r0)
            if (r0 != 0) goto L_0x004b
            r0 = 36321468975424908(0x810a2f0000258c, double:3.033181462650492E-306)
            boolean r0 = X.182.A06(r11, r4, r0)
            r17 = 0
            if (r0 == 0) goto L_0x004d
        L_0x004b:
            r17 = 1
        L_0x004d:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r16 = r9.iterator()
            r15 = 0
            r13 = 0
        L_0x0058:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x00a5
            java.lang.Object r11 = r16.next()
            r14 = r11
            X.3n0 r14 = (X.C251373n0) r14
            int r13 = r13 + 1
            if (r13 != r8) goto L_0x006a
            r15 = r14
        L_0x006a:
            java.lang.Integer r1 = r14.Bxj()
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 == r0) goto L_0x009b
            if (r13 == r8) goto L_0x009b
            r0 = 2
            if (r13 != r0) goto L_0x0058
            if (r17 == 0) goto L_0x0058
            X.0sP r0 = r10.A01
            java.lang.Object r9 = r0.invoke(r4)
            X.2mN r9 = (X.C228812mN) r9
            if (r15 != 0) goto L_0x008d
            java.lang.String r0 = "firstItem"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x008d:
            java.lang.Object r1 = r15.BTb()
            java.lang.Object r0 = r14.BTb()
            boolean r0 = r9.ACN(r1, r0)
            if (r0 == 0) goto L_0x0058
        L_0x009b:
            r12.add(r11)
            goto L_0x0058
        L_0x009f:
            long r1 = r0.get()
            goto L_0x0014
        L_0x00a5:
            r0 = 10
            int r0 = X.0Yv.A1E(r12, r0)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r0)
            java.util.Iterator r14 = r12.iterator()
        L_0x00b4:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x00fe
            java.lang.Object r9 = r14.next()
            X.3n0 r9 = (X.C251373n0) r9
            java.lang.Object r0 = r9.BTb()
            X.3mM r0 = (X.C250973mM) r0
            com.instagram.model.reels.Reel r0 = r0.A0H
            X.3HX r13 = r0.A0N
            if (r13 == 0) goto L_0x00f6
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.model.reels.ReelResponseItem"
            X.0qQ.A0C(r13, r0)
            long r0 = r9.AsM()
            java.lang.String r12 = r9.BnF()
            java.lang.String r10 = r9.BnL()
            r9 = 3
            X.0qQ.A0B(r12, r9)
            r9 = 4
            X.0qQ.A0B(r10, r9)
            X.3kn r9 = new X.3kn
            r9.<init>()
            r9.A01 = r13
            r9.A00 = r0
            r9.A02 = r12
            r9.A03 = r10
            r11.add(r9)
            goto L_0x00b4
        L_0x00f6:
            java.lang.String r1 = "Recent response item captured for this Reel is null."
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x00fe:
            if (r5 != 0) goto L_0x011d
            java.lang.String r1 = ""
            X.3mF r5 = new X.3mF
            r5.<init>()
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A01 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r5.A03 = r0
            r5.A05 = r1
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r0.getClass()
            r5.A02 = r0
        L_0x011d:
            java.lang.Integer r0 = r5.A02(r7)
            int r10 = r0.intValue()
            java.lang.Integer r0 = r5.A00()
            int r9 = r0.intValue()
            java.lang.Integer r0 = r5.A01(r7)
            int r8 = r0.intValue()
            X.3Ce r0 = r5.A00
            java.lang.String r7 = r0.A00
            java.lang.Integer r0 = r5.A02
            java.lang.String r5 = X.C271804jc.A00(r0)
            r0 = 5
            X.0qQ.A0B(r7, r0)
            X.15p r0 = X.AnonymousClass15o.A00
            X.17W r2 = r0.A0A(r2)
            r2.A0c()     // Catch:{ all -> 0x020d }
            java.lang.String r0 = "stories_items"
            X.16P.A03(r2, r0)     // Catch:{ all -> 0x020d }
            java.util.Iterator r13 = r11.iterator()     // Catch:{ all -> 0x020d }
        L_0x0155:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x020d }
            if (r0 == 0) goto L_0x0191
            java.lang.Object r12 = r13.next()     // Catch:{ all -> 0x020d }
            X.3kn r12 = (X.C250033kn) r12     // Catch:{ all -> 0x020d }
            if (r12 == 0) goto L_0x0155
            r2.A0c()     // Catch:{ all -> 0x020d }
            X.3HX r0 = r12.A01     // Catch:{ all -> 0x020d }
            if (r0 == 0) goto L_0x0174
            java.lang.String r0 = "reel"
            r2.A0q(r0)     // Catch:{ all -> 0x020d }
            X.3HX r0 = r12.A01     // Catch:{ all -> 0x020d }
            X.AnonymousClass3HR.A00(r2, r0)     // Catch:{ all -> 0x020d }
        L_0x0174:
            long r0 = r12.A00     // Catch:{ all -> 0x020d }
            java.lang.String r11 = "delivered_at"
            r2.A0Q(r11, r0)     // Catch:{ all -> 0x020d }
            java.lang.String r1 = r12.A02     // Catch:{ all -> 0x020d }
            if (r1 == 0) goto L_0x0184
            java.lang.String r0 = "request_id"
            r2.A0R(r0, r1)     // Catch:{ all -> 0x020d }
        L_0x0184:
            java.lang.String r1 = r12.A03     // Catch:{ all -> 0x020d }
            if (r1 == 0) goto L_0x018d
            java.lang.String r0 = "request_uuid"
            r2.A0R(r0, r1)     // Catch:{ all -> 0x020d }
        L_0x018d:
            r2.A0Z()     // Catch:{ all -> 0x020d }
            goto L_0x0155
        L_0x0191:
            r2.A0Y()     // Catch:{ all -> 0x020d }
            java.lang.String r0 = "next_ad_request_index"
            r2.A0P(r0, r10)     // Catch:{ all -> 0x020d }
            java.lang.String r0 = "ads_pool_threshold_for_next_request"
            r2.A0P(r0, r9)     // Catch:{ all -> 0x020d }
            java.lang.String r0 = "earliest_request_position"
            r2.A0P(r0, r8)     // Catch:{ all -> 0x020d }
            java.lang.String r0 = "index_calculation_strategy"
            r2.A0R(r0, r7)     // Catch:{ all -> 0x020d }
            java.lang.String r0 = "delivery_source"
            r2.A0R(r0, r5)     // Catch:{ all -> 0x020d }
            r2.A0Z()     // Catch:{ all -> 0x020d }
            r2.close()
            byte[] r0 = r6.toByteArray()
            X.0qQ.A07(r0)
            X.3kg r2 = new X.3kg
            r2.<init>(r3, r0)
            r0 = 8
            X.WxR r1 = new X.WxR     // Catch:{ SQLException -> 0x0200 }
            r1.<init>(r4, r0)     // Catch:{ SQLException -> 0x0200 }
            java.lang.Class<X.1Pb> r0 = X.1Pb.class
            java.lang.Object r0 = r4.A01(r0, r1)     // Catch:{ SQLException -> 0x0200 }
            X.1Pb r0 = (X.1Pb) r0     // Catch:{ SQLException -> 0x0200 }
            X.0eM r0 = r0.A00     // Catch:{ SQLException -> 0x0200 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ SQLException -> 0x0200 }
            X.1Vn r0 = (X.1Vn) r0     // Catch:{ SQLException -> 0x0200 }
            X.3oI r1 = r0.A01     // Catch:{ SQLException -> 0x0200 }
            r1.beginTransaction()     // Catch:{ SQLException -> 0x0200 }
            r0.A00(r3)     // Catch:{ all -> 0x01fb }
            r1.assertNotSuspendingTransaction()     // Catch:{ all -> 0x01fb }
            r1.beginTransaction()     // Catch:{ all -> 0x01fb }
            X.1Vf r0 = r0.A00     // Catch:{ all -> 0x01f6 }
            r0.insert(r2)     // Catch:{ all -> 0x01f6 }
            r1.setTransactionSuccessful()     // Catch:{ all -> 0x01f6 }
            r1.endTransaction()     // Catch:{ all -> 0x01fb }
            r1.setTransactionSuccessful()     // Catch:{ all -> 0x01fb }
            r1.endTransaction()     // Catch:{ SQLException -> 0x0200 }
            return
        L_0x01f6:
            r0 = move-exception
            r1.endTransaction()     // Catch:{ all -> 0x01fb }
            throw r0     // Catch:{ all -> 0x01fb }
        L_0x01fb:
            r0 = move-exception
            r1.endTransaction()     // Catch:{ SQLException -> 0x0200 }
            throw r0     // Catch:{ SQLException -> 0x0200 }
        L_0x0200:
            r2 = move-exception
            java.lang.String r0 = "Failed to replace pool with SQLException. Surface: "
            java.lang.String r1 = X.002.A0R(r0, r3)
            java.lang.String r0 = "AdsStore::Persistence"
            X.0wb.A06(r0, r1, r2)
            return
        L_0x020d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x020f }
        L_0x020f:
            r0 = move-exception
            X.1zE.A00(r2, r1)
            throw r0
        L_0x0214:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C268584de.run():void");
    }
}
