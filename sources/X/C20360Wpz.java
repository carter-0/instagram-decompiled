package X;

import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: X.Wpz  reason: case insensitive filesystem */
public final class C20360Wpz implements Runnable {
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0523, code lost:
        if (java.lang.Math.abs(r10.C7M() - r3.C7M()) > com.facebook.proxygen.LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT) goto L_0x04e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0525, code lost:
        r13.remove(r3);
        r1 = r9.A01(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0534, code lost:
        if (X.0qQ.A0K(r1, r9.A01(r3)) == false) goto L_0x056c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0536, code lost:
        X.0qQ.A0B(r1, 0);
        r11 = (X.X39) r9.A0A.get(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0541, code lost:
        if (r11 == null) goto L_0x056c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0543, code lost:
        r2 = r10;
        r0 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0551, code lost:
        if (X.0qQ.A0K(X.C16817V6y.A00(r10.BwS()), "primary") == false) goto L_0x0555;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0553, code lost:
        r0 = r10;
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0555, code lost:
        r0 = r11.FMs(r0, r2);
        r2 = new java.util.ArrayList();
        r1 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0566, code lost:
        if (r1.hasNext() == false) goto L_0x056e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0568, code lost:
        A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x056c, code lost:
        r2 = X.0sn.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x056e, code lost:
        r0 = r9.A00(r3.BwS()).FMr(r3);
        r11 = new java.util.ArrayList();
        r1 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0587, code lost:
        if (r1.hasNext() == false) goto L_0x058d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0589, code lost:
        A00(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x058d, code lost:
        r0 = r9.A00(r10.BwS()).FMr(r10);
        r9 = new java.util.ArrayList();
        r1 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x05a6, code lost:
        if (r1.hasNext() == false) goto L_0x05ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x05a8, code lost:
        A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x05ac, code lost:
        r2 = new X.C61084JwM(r10, r3, (java.util.List) X.00k.A0S(r9, X.00k.A0S(r11, r2)));
        r4.add(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02ae, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02af, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02b2, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x05f8 A[LOOP:23: B:218:0x05f2->B:220:0x05f8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0615  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x062a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r34 = this;
            X.W2G r33 = X.W2G.A0E
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            X.0xM r0 = X.W2G.A07
            java.lang.String r32 = "eventDebuggerFilters"
            if (r0 == 0) goto L_0x0113
            java.util.ArrayList r0 = X.C13991Tnr.A0n(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r0.iterator()
        L_0x001a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x003d
            java.lang.Object r2 = r3.next()
            r1 = r2
            com.instagram.common.analytics.intf.AnalyticsEventDebugInfo r1 = (com.instagram.common.analytics.intf.AnalyticsEventDebugInfo) r1
            X.Vw0 r0 = X.W2G.A02
            if (r0 == 0) goto L_0x03e3
            java.lang.String r1 = r1.A00
            if (r1 != 0) goto L_0x0031
            java.lang.String r1 = ""
        L_0x0031:
            java.util.Set r0 = r0.A0C
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x001a
            r4.add(r2)
            goto L_0x001a
        L_0x003d:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r10 = r4.iterator()
        L_0x0046:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0116
            java.lang.Object r2 = r10.next()
            com.instagram.common.analytics.intf.AnalyticsEventDebugInfo r2 = (com.instagram.common.analytics.intf.AnalyticsEventDebugInfo) r2
            X.0qQ.A0A(r2)
            X.Vw0 r0 = X.W2G.A02
            if (r0 == 0) goto L_0x03e3
            java.util.Map r9 = r0.A05
            java.util.Map r1 = r0.A04
            X.AnonymousClass7TG.A1T(r2, r9, r1)
            X.0xI r6 = com.instagram.common.analytics.intf.AnalyticsEventDebugInfo.A00(r2)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            if (r6 == 0) goto L_0x010e
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.String r0 = r6.A04
            X.WN1 r3 = new X.WN1
            r3.<init>(r6, r0)
            java.util.Set r0 = r1.entrySet()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r8 = r0.iterator()
        L_0x0084:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00a1
            java.lang.Object r1 = r8.next()
            r0 = r1
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            X.X3A r0 = (X.X3A) r0
            boolean r0 = X.W0i.A02(r3, r0)
            if (r0 == 0) goto L_0x0084
            r2.add(r1)
            goto L_0x0084
        L_0x00a1:
            java.util.ArrayList r8 = X.AnonymousClass7TF.A0p(r2)
            java.util.Iterator r2 = r2.iterator()
        L_0x00a9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00be
            java.lang.Object r1 = X.C13991Tnr.A0Y(r2)
            java.lang.String r1 = (java.lang.String) r1
            X.WN1 r0 = new X.WN1
            r0.<init>(r6, r1)
            r8.add(r0)
            goto L_0x00a9
        L_0x00be:
            X.00k.A0r(r8, r4)
            java.util.Set r0 = r9.entrySet()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r2 = r0.iterator()
        L_0x00ce:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00eb
            java.lang.Object r1 = r2.next()
            r0 = r1
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            boolean r0 = X.W0i.A03(r3, r0)
            if (r0 == 0) goto L_0x00ce
            r8.add(r1)
            goto L_0x00ce
        L_0x00eb:
            java.util.ArrayList r3 = X.AnonymousClass7TF.A0p(r8)
            java.util.Iterator r2 = r8.iterator()
        L_0x00f3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0108
            java.lang.Object r1 = X.C13991Tnr.A0Y(r2)
            java.lang.String r1 = (java.lang.String) r1
            X.WN1 r0 = new X.WN1
            r0.<init>(r6, r1)
            r3.add(r0)
            goto L_0x00f3
        L_0x0108:
            X.00k.A0r(r3, r4)
            r5.addAll(r4)
        L_0x010e:
            r7.add(r5)
            goto L_0x0046
        L_0x0113:
            X.0sn r10 = X.0sn.A00
            goto L_0x011a
        L_0x0116:
            java.util.ArrayList r10 = X.0Yv.A1F(r7)
        L_0x011a:
            X.1Mx r22 = X.AnonymousClass1Mv.A01
            java.util.ArrayList r0 = r22.A01()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r15 = r0.iterator()
        L_0x0129:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x02b3
            java.lang.Object r2 = r15.next()
            X.1QS r2 = (X.1QS) r2
            X.Vw0 r6 = X.W2G.A02
            if (r6 == 0) goto L_0x03e3
            r7 = 0
            X.0qQ.A0B(r2, r7)
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.util.Map r0 = X.C17148VKa.A00
            java.util.Iterator r1 = X.AnonymousClass7TF.A0u(r0)
        L_0x0148:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0129
            java.util.Map$Entry r14 = X.AnonymousClass7TE.A1J(r1)
            java.net.URI r0 = r2.A09
            java.lang.String r4 = X.DbT.A10(r0)
            java.lang.Object r0 = r14.getKey()
            X.11S r0 = (X.11S) r0
            boolean r0 = r0.A07(r4)
            if (r0 == 0) goto L_0x0148
            X.1Px r0 = r2.A06
            r2 = 0
            if (r0 == 0) goto L_0x016d
            java.io.InputStream r2 = r0.E15()
        L_0x016d:
            java.lang.String r1 = "utf-8"
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x02ac }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x02ac }
            java.lang.String r0 = X.1r9.A00(r0)     // Catch:{ all -> 0x02ac }
            if (r2 == 0) goto L_0x017d
            r2.close()
        L_0x017d:
            java.lang.String r2 = java.net.URLDecoder.decode(r0)
            X.0qQ.A0B(r2, r7)
            r3 = 1
            char[] r1 = new char[r3]
            r0 = 38
            r1[r7] = r0
            java.util.List r0 = X.00l.A0Q(r2, r1, r7)
            java.util.Iterator r8 = r0.iterator()
        L_0x0193:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x01cb
            java.lang.String r2 = X.AnonymousClass7TE.A18(r8)
            char[] r1 = new char[r3]
            r0 = 61
            r1[r7] = r0
            r0 = 2
            java.util.List r2 = X.00l.A0Q(r2, r1, r0)
            java.lang.Object r1 = r2.get(r7)
            java.lang.String r0 = "signed_body"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0193
            java.lang.Object r1 = r2.get(r3)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0 = 46
            int r0 = X.00l.A04(r1, r0, r7)
            java.lang.String r1 = X.AnonymousClass7TE.A19(r2, r3)
            int r0 = r0 + 1
            java.lang.String r2 = X.C66580MXl.A0z(r1, r0)
            goto L_0x01cd
        L_0x01cb:
            java.lang.String r2 = ""
        L_0x01cd:
            X.3mC r1 = X.C250863mB.A03     // Catch:{ 1pa -> 0x0217 }
            kotlinx.serialization.json.JsonElementSerializer r0 = kotlinx.serialization.json.JsonElementSerializer.A00     // Catch:{ 1pa -> 0x0217 }
            java.lang.Object r0 = r1.A00(r2, r0)     // Catch:{ 1pa -> 0x0217 }
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0     // Catch:{ 1pa -> 0x0217 }
            kotlinx.serialization.json.JsonObject r1 = X.C271114hv.A03(r0)     // Catch:{ 1pa -> 0x0217 }
            int r0 = r1.size()     // Catch:{ 1pa -> 0x0217 }
            int r0 = X.0se.A0L(r0)     // Catch:{ 1pa -> 0x0217 }
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap     // Catch:{ 1pa -> 0x0217 }
            r8.<init>(r0)     // Catch:{ 1pa -> 0x0217 }
            java.util.Set r0 = r1.entrySet()     // Catch:{ 1pa -> 0x0217 }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ 1pa -> 0x0217 }
        L_0x01f0:
            boolean r0 = r12.hasNext()     // Catch:{ 1pa -> 0x0217 }
            if (r0 == 0) goto L_0x021b
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r12)     // Catch:{ 1pa -> 0x0217 }
            java.lang.Object r2 = r0.getKey()     // Catch:{ 1pa -> 0x0217 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ 1pa -> 0x0217 }
            kotlinx.serialization.json.JsonElement r1 = (kotlinx.serialization.json.JsonElement) r1     // Catch:{ 1pa -> 0x0217 }
            boolean r0 = r1 instanceof kotlinx.serialization.json.JsonPrimitive     // Catch:{ 1pa -> 0x0217 }
            if (r0 == 0) goto L_0x0212
            kotlinx.serialization.json.JsonPrimitive r1 = (kotlinx.serialization.json.JsonPrimitive) r1     // Catch:{ 1pa -> 0x0217 }
            java.lang.String r0 = r1.A00()     // Catch:{ 1pa -> 0x0217 }
        L_0x020e:
            r8.put(r2, r0)     // Catch:{ 1pa -> 0x0217 }
            goto L_0x01f0
        L_0x0212:
            java.lang.String r0 = r1.toString()     // Catch:{ 1pa -> 0x0217 }
            goto L_0x020e
        L_0x0217:
            X.0sm r8 = X.0Yt.A0E()
        L_0x021b:
            r5.putAll(r8)
            java.lang.Object r1 = r14.getValue()
            X.0qQ.A0B(r1, r7)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.Map r0 = X.C17148VKa.A01
            java.lang.Object r0 = r0.get(r1)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L_0x0278
            java.util.Iterator r13 = X.AnonymousClass7TF.A0u(r0)
        L_0x0238:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0278
            java.util.Map$Entry r12 = X.AnonymousClass7TE.A1J(r13)
            java.lang.Object r0 = r12.getValue()
            java.lang.String r8 = r0.toString()
            char[] r1 = new char[r3]
            r0 = 34
            r1[r7] = r0
            java.lang.String r8 = X.00l.A0M(r8, r1)
            java.lang.String r1 = "\\\\"
            java.lang.String r0 = "\\"
            java.lang.String r1 = X.00p.A0g(r8, r1, r0, r7)
            X.11S r0 = new X.11S
            r0.<init>(r1)
            X.5gs r0 = r0.A06(r4, r7)
            if (r0 == 0) goto L_0x0238
            java.util.regex.Matcher r0 = r0.A01
            java.lang.String r1 = r0.group()
            X.0qQ.A07(r1)
            java.lang.Object r0 = r12.getKey()
            r2.put(r0, r1)
            goto L_0x0238
        L_0x0278:
            r5.putAll(r2)
            java.lang.Object r4 = r14.getValue()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r14.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.util.Map r2 = r6.A05
            java.util.Map r1 = r6.A04
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            long r29 = r0.getTime()
            java.util.Map r28 = X.0Yt.A0B(r5)
            X.WN2 r0 = new X.WN2
            r23 = r0
            r24 = r4
            r25 = r3
            r26 = r2
            r27 = r1
            r23.<init>(r24, r25, r26, r27, r28, r29)
            r9.add(r0)
            goto L_0x0129
        L_0x02ac:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x02ae }
        L_0x02ae:
            r0 = move-exception
            X.1zE.A00(r2, r1)
            throw r0
        L_0x02b3:
            X.Vrt r14 = X.W2G.A05
            if (r14 == 0) goto L_0x03a1
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r21 = r10.iterator()
        L_0x02c0:
            boolean r0 = r21.hasNext()
            if (r0 == 0) goto L_0x03a4
            java.lang.Object r12 = r21.next()
            X.X8K r12 = (X.X8K) r12
            java.util.Map r8 = X.C18446Vrt.A02
            java.lang.String r0 = r12.BwS()
            boolean r0 = r8.containsKey(r0)
            if (r0 == 0) goto L_0x02c0
            java.util.List r7 = r14.A01
            java.util.Iterator r20 = r7.iterator()
        L_0x02de:
            boolean r0 = r20.hasNext()
            if (r0 == 0) goto L_0x0394
            java.lang.Object r6 = r20.next()
            X.X8K r6 = (X.X8K) r6
            java.lang.String r0 = r6.BwS()
            java.lang.Object r2 = r8.get(r0)
            java.util.Set r2 = (java.util.Set) r2
            r1 = 1
            if (r2 == 0) goto L_0x02de
            java.lang.String r0 = r12.BwS()
            boolean r0 = r2.contains(r0)
            if (r0 != r1) goto L_0x02de
            X.Vw0 r5 = r14.A00
            r0 = 2
            X.0qQ.A0B(r5, r0)
            java.util.Map r1 = r5.A09
            java.lang.String r0 = r6.BwS()
            java.util.List r4 = X.C66580MXl.A13(r0, r1)
            if (r4 != 0) goto L_0x0315
            X.0sn r4 = X.0sn.A00
        L_0x0315:
            java.lang.String r0 = r12.BwS()
            java.util.List r3 = X.C66580MXl.A13(r0, r1)
            if (r3 != 0) goto L_0x0321
            X.0sn r3 = X.0sn.A00
        L_0x0321:
            java.util.ArrayList r19 = new java.util.ArrayList
            r19.<init>()
            int r1 = r4.size()
            int r0 = r3.size()
            if (r1 != r0) goto L_0x0399
            r2 = 0
            int r18 = r4.size()
        L_0x0335:
            r0 = r18
            if (r2 >= r0) goto L_0x0374
            java.lang.String r0 = X.AnonymousClass7TE.A19(r4, r2)
            java.lang.String r17 = r5.A02(r6, r0)
            java.lang.String r0 = X.AnonymousClass7TE.A19(r3, r2)
            java.lang.String r16 = r5.A02(r12, r0)
            r0 = r17
            java.lang.String r15 = X.W0i.A00(r6, r0)
            r0 = r16
            java.lang.String r1 = X.W0i.A00(r12, r0)
            boolean r0 = X.0qQ.A0K(r15, r1)
            if (r0 != 0) goto L_0x0371
            r28 = 3
            X.QP5 r0 = new X.QP5
            r23 = r0
            r24 = r17
            r25 = r15
            r26 = r16
            r27 = r1
            r23.<init>(r24, r25, r26, r27, r28)
            r1 = r19
            r1.add(r0)
        L_0x0371:
            int r2 = r2 + 1
            goto L_0x0335
        L_0x0374:
            boolean r0 = r19.isEmpty()
            if (r0 == 0) goto L_0x02de
            r7.remove(r6)
            java.lang.String r1 = r6.BwS()
            java.lang.String r0 = "alevent:navigation_event"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x038a
            r12 = r6
        L_0x038a:
            X.WN0 r0 = new X.WN0
            r0.<init>(r14, r12)
            r13.add(r0)
            goto L_0x02c0
        L_0x0394:
            r7.add(r12)
            goto L_0x02c0
        L_0x0399:
            java.lang.String r0 = "Parameter lists to compare must have equal numbers of parameters"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x03a1:
            java.lang.String r32 = "linkClickPrimaryEventSource"
            goto L_0x03e3
        L_0x03a4:
            java.util.List r2 = r14.A01
            r17 = 5000(0x1388, double:2.4703E-320)
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            long r0 = r0.getTime()
            java.util.List r0 = X.W0i.A01(r2, r0)
            r2.removeAll(r0)
            r11.addAll(r10)
            r11.addAll(r9)
            X.0xM r0 = X.W2G.A07
            if (r0 == 0) goto L_0x03c7
            X.1Mx r0 = r0.A00
            r0.A02()
        L_0x03c7:
            r22.A02()
            X.0s0 r1 = X.W2G.A0G
            X.0YZ[] r3 = X.W2G.A0J
            r4 = 0
            r0 = r33
            boolean r0 = X.AnonymousClass7TG.A1a(r0, r1, r3, r4)
            if (r0 == 0) goto L_0x046d
            boolean r0 = X.DbT.A1b(r11)
            if (r0 == 0) goto L_0x046d
            X.VRE r6 = X.W2G.A04
            if (r6 != 0) goto L_0x03eb
            java.lang.String r32 = "generalModeEventHandler"
        L_0x03e3:
            X.0qQ.A0F(r32)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x03eb:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r9 = r11.iterator()
        L_0x03f4:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x042a
            java.lang.Object r5 = r9.next()
            r7 = r5
            X.X8K r7 = (X.X8K) r7
            X.0qQ.A0B(r7, r4)
            X.Vw0 r8 = r6.A00
            X.X3A r0 = X.C18576VuS.A08
            boolean r0 = X.W0i.A02(r7, r0)
            if (r0 == 0) goto L_0x03f4
            java.util.Map r1 = r8.A05
            java.lang.String r0 = r7.BwS()
            boolean r0 = r1.containsKey(r0)
            if (r0 != 0) goto L_0x0426
            java.util.Map r1 = r8.A04
            java.lang.String r0 = r7.BwS()
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x03f4
        L_0x0426:
            r2.add(r5)
            goto L_0x03f4
        L_0x042a:
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r2)
            java.util.Iterator r7 = r2.iterator()
        L_0x0432:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0468
            java.lang.Object r4 = r7.next()
            X.X8K r4 = (X.X8K) r4
            X.Vw0 r1 = r6.A00
            java.lang.String r0 = r4.BwS()
            X.X3A r0 = r1.A00(r0)
            java.util.List r0 = r0.FMr(r4)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r0.iterator()
        L_0x0455:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x045f
            A00(r2, r1)
            goto L_0x0455
        L_0x045f:
            X.JwM r0 = new X.JwM
            r0.<init>((X.X8K) r4, (X.X8K) r4, (java.util.List) r2)
            r5.add(r0)
            goto L_0x0432
        L_0x0468:
            java.util.List r0 = r6.A01
            X.00k.A0r(r5, r0)
        L_0x046d:
            X.0s0 r1 = X.W2G.A0H
            r6 = 1
            r0 = r33
            boolean r0 = X.AnonymousClass7TG.A1a(r0, r1, r3, r6)
            if (r0 == 0) goto L_0x07d6
            boolean r0 = X.W2G.A0B
            if (r0 == 0) goto L_0x07d6
            X.VZC r5 = X.W2G.A06
            if (r5 != 0) goto L_0x0484
            java.lang.String r32 = "secondChannelEventHandler"
            goto L_0x03e3
        L_0x0484:
            java.util.ArrayList r0 = X.00k.A0S(r13, r11)
            java.util.Iterator r31 = r0.iterator()
        L_0x048c:
            boolean r0 = r31.hasNext()
            if (r0 == 0) goto L_0x07d6
            java.lang.Object r10 = r31.next()
            X.X8K r10 = (X.X8K) r10
            X.Vw0 r9 = r5.A00
            r11 = 0
            X.0qQ.A0B(r10, r11)
            java.util.Map r1 = r9.A05
            java.lang.String r0 = r10.BwS()
            boolean r0 = r1.containsKey(r0)
            if (r0 != 0) goto L_0x04b6
            java.util.Map r1 = r9.A04
            java.lang.String r0 = r10.BwS()
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x048c
        L_0x04b6:
            java.lang.String r0 = r10.BwS()
            java.lang.String r0 = X.C16817V6y.A00(r0)
            java.lang.String r8 = "primary"
            boolean r3 = X.0qQ.A0K(r0, r8)
            r7 = 0
            java.lang.String r0 = r10.BwS()
            java.lang.String r1 = X.C16817V6y.A00(r0)
            java.lang.String r0 = "secondary"
            boolean r0 = X.0qQ.A0K(r1, r0)
            r2 = 0
            if (r3 == 0) goto L_0x05bd
            java.util.List r13 = r5.A02
            java.util.List r12 = r5.A01
        L_0x04da:
            java.util.List r4 = r5.A03
            X.DbZ.A0t(r6, r13, r12, r4)
            X.X39 r1 = r9.A01
            java.util.Iterator r16 = r13.iterator()
        L_0x04e5:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x05c5
            java.lang.Object r3 = r16.next()
            X.X8K r3 = (X.X8K) r3
            X.AnonymousClass7TF.A1B(r1, r6, r3)
            java.util.List r0 = r1.FMs(r10, r3)
            java.util.Iterator r15 = r0.iterator()
        L_0x04fc:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0513
            java.lang.Object r14 = r15.next()
            r0 = r14
            X.X8L r0 = (X.X8L) r0
            boolean r0 = r0.CYw()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x04fc
            if (r14 != 0) goto L_0x04e5
        L_0x0513:
            long r19 = r10.C7M()
            long r14 = r3.C7M()
            long r19 = r19 - r14
            long r14 = java.lang.Math.abs(r19)
            int r0 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r0 > 0) goto L_0x04e5
            r13.remove(r3)
            java.lang.String r1 = r9.A01(r10)
            java.lang.String r0 = r9.A01(r3)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x056c
            X.0qQ.A0B(r1, r11)
            java.util.Map r0 = r9.A0A
            java.lang.Object r11 = r0.get(r1)
            X.X39 r11 = (X.X39) r11
            if (r11 == 0) goto L_0x056c
            r2 = r10
            java.lang.String r0 = r10.BwS()
            java.lang.String r0 = X.C16817V6y.A00(r0)
            boolean r1 = X.0qQ.A0K(r0, r8)
            r0 = r3
            if (r1 == 0) goto L_0x0555
            r0 = r10
            r2 = r3
        L_0x0555:
            java.util.List r0 = r11.FMs(r0, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r0.iterator()
        L_0x0562:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x056e
            A00(r2, r1)
            goto L_0x0562
        L_0x056c:
            X.0sn r2 = X.0sn.A00
        L_0x056e:
            java.lang.String r0 = r3.BwS()
            X.X3A r0 = r9.A00(r0)
            java.util.List r0 = r0.FMr(r3)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r1 = r0.iterator()
        L_0x0583:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x058d
            A00(r11, r1)
            goto L_0x0583
        L_0x058d:
            java.lang.String r0 = r10.BwS()
            X.X3A r0 = r9.A00(r0)
            java.util.List r0 = r0.FMr(r10)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r1 = r0.iterator()
        L_0x05a2:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x05ac
            A00(r9, r1)
            goto L_0x05a2
        L_0x05ac:
            java.util.ArrayList r0 = X.00k.A0S(r11, r2)
            java.util.ArrayList r0 = X.00k.A0S(r9, r0)
            X.JwM r2 = new X.JwM
            r2.<init>((X.X8K) r10, (X.X8K) r3, (java.util.List) r0)
            r4.add(r2)
            goto L_0x05c8
        L_0x05bd:
            if (r0 == 0) goto L_0x05c8
            java.util.List r13 = r5.A01
            java.util.List r12 = r5.A02
            goto L_0x04da
        L_0x05c5:
            r12.add(r10)
        L_0x05c8:
            java.util.List r9 = r5.A01
            java.util.List r4 = r5.A02
            java.util.ArrayList r3 = X.00k.A0S(r4, r9)
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            long r0 = r0.getTime()
            java.util.List r0 = X.W0i.A01(r3, r0)
            r9.removeAll(r0)
            r4.removeAll(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r30 = 10
            java.util.ArrayList r9 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x05f2:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0607
            java.lang.Object r1 = r3.next()
            X.X8K r1 = (X.X8K) r1
            X.JwM r0 = new X.JwM
            r0.<init>((X.X8K) r1)
            r9.add(r0)
            goto L_0x05f2
        L_0x0607:
            java.util.List r1 = X.00k.A0a(r9)
            java.util.List r0 = r5.A03
            r0.addAll(r1)
            r4.addAll(r1)
            if (r2 == 0) goto L_0x0620
            java.lang.Object r0 = r2.A01
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.isEmpty()
            X.DbV.A1U(r2, r4, r0)
        L_0x0620:
            java.util.Iterator r29 = r4.iterator()
        L_0x0624:
            boolean r0 = r29.hasNext()
            if (r0 == 0) goto L_0x048c
            java.lang.Object r2 = r29.next()
            X.JwM r2 = (X.C61084JwM) r2
            java.lang.String r28 = "two measurement"
            X.0qQ.A0B(r2, r6)
            X.Vw0 r11 = X.W2G.A02
            if (r11 == 0) goto L_0x03e3
            X.0Ae r1 = X.W2G.A01
            if (r1 == 0) goto L_0x07d2
            X.3L3 r14 = X.W2G.A09
            if (r14 != 0) goto L_0x0645
            java.lang.String r32 = "correlationManager"
            goto L_0x03e3
        L_0x0645:
            java.lang.Object r3 = r2.A00
            X.X8K r3 = (X.X8K) r3
            X.0qQ.A0B(r3, r7)
            java.lang.String r0 = r3.BwS()
            java.lang.String r0 = X.C16817V6y.A00(r0)
            boolean r0 = X.0qQ.A0K(r0, r8)
            if (r0 == 0) goto L_0x06e0
            java.lang.String r10 = "secondary_channel"
        L_0x065c:
            java.lang.String r27 = r3.getDisplayName()
            java.lang.String r26 = "content_id"
            r0 = r26
            java.lang.String r13 = r3.getStringForKey(r0)
            java.lang.String r25 = r11.A01(r3)
            java.lang.String r4 = r11.A01(r3)
            java.lang.String r0 = "ad_"
            boolean r24 = X.00l.A0d(r4, r0, r7)
            java.lang.String r0 = "media_pk"
            java.lang.String r0 = r11.A02(r3, r0)
            java.lang.String r23 = r3.getStringForKey(r0)
            java.lang.String r12 = "container_module"
            java.lang.String r0 = r11.A02(r3, r12)
            java.lang.String r22 = r3.getStringForKey(r0)
            java.lang.String r9 = "nav_chain"
            java.lang.String r21 = r3.getStringForKey(r9)
            java.lang.String r0 = r14.Ara()
            boolean r4 = X.C51966G9m.A1X(r0)
            java.lang.String r20 = "dummy_id"
            if (r4 == 0) goto L_0x06dd
            java.lang.String r19 = r14.Ara()
        L_0x06a0:
            java.lang.Object r2 = r2.A01
            java.util.List r2 = (java.util.List) r2
            r0 = 2
            X.0qQ.A0B(r2, r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r15 = "Validation mode: "
            java.lang.String r14 = " |"
            r0 = r28
            java.lang.String r0 = X.002.A0g(r15, r0, r14)
            r3.append(r0)
            java.lang.String r0 = " missing "
            X.C66580MXl.A1V(r0, r10, r3)
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r16 = r2.iterator()
        L_0x06c8:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x06e4
            java.lang.Object r14 = r16.next()
            r0 = r14
            X.X8L r0 = (X.X8L) r0
            boolean r0 = r0.CYw()
            X.DbV.A1U(r14, r15, r0)
            goto L_0x06c8
        L_0x06dd:
            r19 = r20
            goto L_0x06a0
        L_0x06e0:
            java.lang.String r10 = "primary_channel"
            goto L_0x065c
        L_0x06e4:
            java.util.Iterator r15 = r15.iterator()
        L_0x06e8:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0712
            java.lang.Object r14 = r15.next()
            X.X8L r14 = (X.X8L) r14
            java.lang.String r0 = "Expect:"
            r3.append(r0)
            java.lang.String r0 = r14.B2e()
            r3.append(r0)
            java.lang.String r0 = " Actual:"
            r3.append(r0)
            java.lang.String r0 = r14.AYp()
            r3.append(r0)
            java.lang.String r0 = " | "
            r3.append(r0)
            goto L_0x06e8
        L_0x0712:
            java.lang.String r14 = r3.toString()
            java.util.ArrayList r15 = X.DbV.A15(r14)
            java.util.Iterator r3 = r2.iterator()
        L_0x071e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0738
            java.lang.Object r2 = r3.next()
            X.X8L r2 = (X.X8L) r2
            boolean r0 = r2.CYw()
            if (r0 != 0) goto L_0x071e
            java.util.List r0 = r2.B5d()
            r15.addAll(r0)
            goto L_0x071e
        L_0x0738:
            java.lang.String r2 = ","
            r0 = 0
            java.lang.String r3 = ""
            java.lang.String r2 = X.00k.A0P(r2, r3, r3, r15, r0)
            java.lang.String r0 = "instagram_metric_guardrail"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0624
            java.lang.String r15 = "event"
            r0 = r27
            r1.AAJ(r15, r0)
            java.lang.String r15 = "validation_mode"
            r0 = r28
            r1.AAJ(r15, r0)
            java.lang.String r0 = "error_message"
            r1.AAJ(r0, r14)
            java.lang.String r0 = "dsp_event_id"
            r1.AAJ(r0, r3)
            java.lang.String r14 = "metric"
            r0 = r25
            r1.AAJ(r14, r0)
            X.0qQ.A0B(r13, r7)
            r0 = r30
            java.lang.Long r13 = X.00y.A0n(r0, r13)
            r0 = r26
            r1.A9F(r0, r13)
            r0 = r23
            X.C51965G9l.A1I(r1, r0)
            r0 = r22
            r1.AAJ(r12, r0)
            r0 = r21
            r1.AAJ(r9, r0)
            X.VuS r0 = r11.A00
            java.lang.String r11 = r0.A00
            java.lang.String r9 = "mguard_config_version"
            r0 = r24
            java.lang.Boolean r9 = X.JTP.A0g(r1, r9, r11, r0)
            java.lang.String r0 = "is_ad"
            r1.A7p(r0, r9)
            java.lang.String r0 = "primary_channel"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x07c7
            java.lang.String r3 = "missing_1st_channel"
        L_0x07a4:
            java.lang.String r0 = "two_m_failure_reason"
            r1.AAJ(r0, r3)
            java.lang.String r0 = "failed_validation_field"
            r1.AAJ(r0, r2)
            java.lang.String r2 = "correlation_id"
            r0 = r19
            java.lang.Boolean r2 = X.JTP.A0g(r1, r2, r0, r4)
            java.lang.String r0 = "is_correlation_enabled"
            r1.A7p(r0, r2)
            java.lang.String r2 = "trigger_id"
            r0 = r20
            r1.AAJ(r2, r0)
            r1.Cgf()
            goto L_0x0624
        L_0x07c7:
            java.lang.String r0 = "secondary_channel"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x07a4
            java.lang.String r3 = "missing_2nd_channel"
            goto L_0x07a4
        L_0x07d2:
            java.lang.String r32 = "logger"
            goto L_0x03e3
        L_0x07d6:
            boolean r0 = X.W2G.A00
            if (r0 == 0) goto L_0x07dd
            X.W2G.A01(r33)
        L_0x07dd:
            android.os.Handler r2 = X.W2G.A0D
            r0 = 1000(0x3e8, double:4.94E-321)
            r3 = r34
            r2.postDelayed(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20360Wpz.run():void");
    }

    public static void A00(AbstractCollection abstractCollection, Iterator it) {
        Object next = it.next();
        if (!((X8L) next).CYw()) {
            abstractCollection.add(next);
        }
    }
}
