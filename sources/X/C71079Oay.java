package X;

import com.instagram.zero.headers.IGZeroHeadersConfigFetch;
import com.instagram.zero.headers.IGZeroHeadersPing;
import libraries.zero.headers.ZeroHeadersEntry;

/* renamed from: X.Oay  reason: case insensitive filesystem */
public final class C71079Oay {
    public long A00;
    public ZeroHeadersEntry A01;
    public final OYZ A02;
    public final IGZeroHeadersConfigFetch A03;
    public final OL0 A04;
    public final IGZeroHeadersPing A05;
    public final 136 A06 = new 136();

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDi, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.1Hj A01(java.lang.String r6, java.lang.String r7, X.AnonymousClass4D7 r8, X.C71079Oay r9, int r10) {
        /*
            r3 = 4
            boolean r0 = X.C66130MDi.A01(r3, r8)
            if (r0 == 0) goto L_0x0058
            r5 = r8
            X.MDi r5 = (X.C66130MDi) r5
            int r2 = r5.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0058
            int r2 = r2 - r1
            r5.A01 = r2
        L_0x0015:
            java.lang.Object r4 = r5.A03
            X.1Hj r3 = X.1Hj.A02
            int r0 = r5.A01
            r2 = 1
            if (r0 == 0) goto L_0x0041
            if (r0 != r2) goto L_0x0080
            java.lang.Object r7 = r5.A02
            java.lang.String r7 = (java.lang.String) r7
            X.0eS.A00(r4)
        L_0x0027:
            X.ONX r4 = (X.ONX) r4
            int r1 = r4.A00
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L_0x0072
            java.lang.String r2 = r4.A01
            r1 = 0
            java.lang.String r0 = "for (;;);"
            boolean r0 = X.00p.A0k(r2, r0, r1)
            if (r0 == 0) goto L_0x005e
            r0 = 9
            java.lang.String r2 = X.C66580MXl.A0z(r2, r0)
            goto L_0x005e
        L_0x0041:
            X.0eS.A00(r4)
            com.instagram.zero.headers.IGZeroHeadersPing r1 = r9.A05
            X.ONQ r0 = new X.ONQ
            r0.<init>(r6, r7)
            r5.A02 = r7
            r5.A00 = r10
            r5.A01 = r2
            java.lang.Object r4 = r1.A00(r5, r0)
            if (r4 != r3) goto L_0x0027
            return r3
        L_0x0058:
            X.MDi r5 = new X.MDi
            r5.<init>(r9, r8, r3)
            goto L_0x0015
        L_0x005e:
            com.google.gson.Gson r1 = new com.google.gson.Gson     // Catch:{ Exception -> 0x0068 }
            r1.<init>()     // Catch:{ Exception -> 0x0068 }
            java.lang.Class<libraries.zero.headers.ZeroHeadersUtils$HeadersSiteResponse> r0 = libraries.zero.headers.ZeroHeadersUtils$HeadersSiteResponse.class
            r1.A08(r2, r0)     // Catch:{ Exception -> 0x0068 }
        L_0x0068:
            java.lang.Integer r2 = X.AnonymousClass05K.A0j
            java.lang.String r1 = "Ping Response Parsing Failure"
            X.Nnr r0 = new X.Nnr
            r0.<init>(r7, r2, r1)
            throw r0
        L_0x0072:
            java.lang.Integer r2 = X.AnonymousClass05K.A0j
            java.lang.String r0 = "Bad Response Code: "
            java.lang.String r1 = X.002.A0O(r0, r1)
            X.Nnr r0 = new X.Nnr
            r0.<init>(r7, r2, r1)
            throw r0
        L_0x0080:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71079Oay.A01(java.lang.String, java.lang.String, X.4D7, X.Oay, int):X.1Hj");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r10v1, types: [X.Per, X.4D7] */
    /* JADX WARNING: type inference failed for: r10v4 */
    /* JADX WARNING: type inference failed for: r10v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004c, code lost:
        r2 = r6.A03;
        r1 = r6.A02;
        A02(r6, r13, r14, r2, r10);
        r10.A07 = r13;
        r10.A01 = 2;
        r11 = X.C56378HxX.A01(r1, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005c, code lost:
        if (r11 == r8) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005e, code lost:
        r5 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0077, code lost:
        A02(r6, r5, r14, (java.lang.Object) null, r10);
        r10.A07 = null;
        r10.A01 = 3;
        r11 = r2.A00(r13, (java.lang.String) r11, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0085, code lost:
        if (r11 != r8) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0087, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0097, code lost:
        r11 = (X.ONW) r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009b, code lost:
        if (r11.A01 == false) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009d, code lost:
        r3 = r11.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009f, code lost:
        if (r3 == null) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a1, code lost:
        r2 = r6.A04;
        r1 = X.AnonymousClass05K.A0C;
        r10.A03 = r6;
        r10.A04 = r14;
        r10.A05 = r3;
        r10.A01 = 4;
        r2.A00(r14, r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00bb, code lost:
        throw new X.C69547Nnr(r14, X.AnonymousClass05K.A01, "Response Data is null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c5, code lost:
        throw new X.C69547Nnr(r14, X.AnonymousClass05K.A01, "Bad Response");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x012a, code lost:
        r12 = r3.A02;
        r13 = r3.A01;
        r7 = r3.A03;
        r9 = r3.A00;
        r1 = r3.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0138, code lost:
        if (r12.length() != 0) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x013e, code lost:
        if (r13.length() != 0) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0140, code lost:
        if (r1 != false) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x014b, code lost:
        throw new X.C69547Nnr(r14, X.AnonymousClass05K.A0N, "No ping or headwind program");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x014c, code lost:
        r2 = java.lang.System.nanoTime();
        r5 = r6.A06;
        A02(r6, r14, r12, r13, r10);
        r10.A07 = r7;
        r10.A08 = r5;
        r10.A00 = r9;
        r10.A09 = r1;
        r10.A02 = r2;
        r10.A01 = 5;
        r13 = r13;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0166, code lost:
        if (X.136.A00(r10, r5) != r8) goto L_0x0188;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0168, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0188, code lost:
        if (r1 == false) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r3 = r6.A02;
        A02(r14, r7, r5, (java.lang.Object) null, r10);
        r10.A07 = null;
        r10.A08 = null;
        r10.A01 = 6;
        r2 = X.OYZ.A00(r3);
        r1 = (java.util.Map) r2.get(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01a0, code lost:
        if (r1 == null) goto L_0x01a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01a2, code lost:
        r1.remove(X.JTO.A0w(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01a9, code lost:
        X.OYZ.A01(r3, r2);
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01bd, code lost:
        throw new X.C69547Nnr(r14, X.AnonymousClass05K.A0N, X.002.A0R("Device has opted out of ", r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01c2, code lost:
        if (r6.A00 <= r2) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01c4, code lost:
        r3 = r6.A04;
        r2 = X.AnonymousClass05K.A0N;
        r10.A03 = r6;
        r10.A04 = r5;
        r10.A05 = null;
        r10.A06 = null;
        r10.A07 = null;
        r10.A08 = null;
        r10.A01 = 7;
        r3.A00(r14, r2, "Entry fetched by another thread");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01e0, code lost:
        r0 = r6.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01e2, code lost:
        r5.A05((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01e5, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r2 = r6.A04;
        r1 = X.AnonymousClass05K.A0Y;
        A02(r6, r14, r12, r13, r10);
        r10.A07 = r7;
        r10.A08 = r5;
        r10.A00 = r9;
        r10.A01 = 8;
        r2.A00(r14, r1, r12);
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01fe, code lost:
        if (r12.length() <= 0) goto L_0x0264;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0200, code lost:
        A02(r6, r14, r7, r5, r10);
        r10.A07 = null;
        r10.A08 = null;
        r10.A00 = r9;
        r10.A01 = 9;
        r11 = A01(r12, r14, r10, r6, r9);
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0211, code lost:
        if (r11 != r8) goto L_0x0217;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0213, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0217, code lost:
        r11 = (libraries.zero.headers.ZeroHeadersEntry) r11;
        r2 = r6.A04;
        r1 = X.AnonymousClass05K.A0u;
        A02(r6, r7, r5, r11, r10);
        r10.A07 = null;
        r10.A08 = null;
        r10.A00 = r9;
        r10.A01 = 10;
        r2.A00(r14, r1, "");
        r8 = r11;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0234, code lost:
        r3 = r6.A02;
        A02(r6, r5, r8, (java.lang.Object) null, r10);
        r10.A01 = 11;
        r2 = X.OYZ.A00(r3);
        r1 = (java.util.Map) r2.get(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0247, code lost:
        if (r1 != null) goto L_0x025c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0249, code lost:
        r2.put(r7, X.0Yt.A07(X.DbW.A1b(X.JTO.A0w(r9), r8)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0258, code lost:
        X.OYZ.A01(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x025c, code lost:
        r1.put(X.JTO.A0w(r9), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x026f, code lost:
        throw new X.C69547Nnr("", X.AnonymousClass05K.A0j, "Headwind not implemented");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0270, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0281, code lost:
        r6.A00 = java.lang.System.nanoTime();
        r6.A01 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0289, code lost:
        r5.A05((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x028c, code lost:
        return r8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0272  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(java.lang.String r13, java.lang.String r14, X.AnonymousClass4D7 r15, X.C71079Oay r16) {
        /*
            r6 = r16
            boolean r0 = r15 instanceof X.C73553Per
            if (r0 == 0) goto L_0x0024
            r10 = r15
            X.Per r10 = (X.C73553Per) r10
            int r2 = r10.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0024
            int r2 = r2 - r1
            r10.A01 = r2
        L_0x0014:
            java.lang.Object r11 = r10.A0A
            X.1Hj r8 = X.1Hj.A02
            int r0 = r10.A01
            r2 = 1
            r4 = 0
            switch(r0) {
                case 0: goto L_0x002a;
                case 1: goto L_0x003d;
                case 2: goto L_0x0060;
                case 3: goto L_0x0088;
                case 4: goto L_0x011b;
                case 5: goto L_0x0169;
                case 6: goto L_0x00c6;
                case 7: goto L_0x00d4;
                case 8: goto L_0x00de;
                case 9: goto L_0x00f7;
                case 10: goto L_0x0109;
                case 11: goto L_0x0272;
                default: goto L_0x001f;
            }
        L_0x001f:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0x()
            throw r2
        L_0x0024:
            X.Per r10 = new X.Per
            r10.<init>(r6, r15)
            goto L_0x0014
        L_0x002a:
            X.0eS.A00(r11)
            X.OL0 r1 = r6.A04
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r10.A03 = r6
            r10.A04 = r13
            r10.A05 = r14
            r10.A01 = r2
            r1.A00(r14, r0, r13)
            goto L_0x004c
        L_0x003d:
            java.lang.Object r14 = r10.A05
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r13 = r10.A04
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r6 = r10.A03
            X.Oay r6 = (X.C71079Oay) r6
            X.0eS.A00(r11)
        L_0x004c:
            com.instagram.zero.headers.IGZeroHeadersConfigFetch r2 = r6.A03
            X.OYZ r1 = r6.A02
            A02(r6, r13, r14, r2, r10)
            r10.A07 = r13
            r0 = 2
            r10.A01 = r0
            java.lang.Object r11 = X.C56378HxX.A01(r1, r10)
            if (r11 == r8) goto L_0x0087
            r5 = r13
            goto L_0x0077
        L_0x0060:
            java.lang.Object r13 = r10.A07
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r2 = r10.A06
            com.instagram.zero.headers.IGZeroHeadersConfigFetch r2 = (com.instagram.zero.headers.IGZeroHeadersConfigFetch) r2
            java.lang.Object r14 = r10.A05
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r5 = r10.A04
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r10.A03
            X.Oay r6 = (X.C71079Oay) r6
            X.0eS.A00(r11)
        L_0x0077:
            java.lang.String r11 = (java.lang.String) r11
            A02(r6, r5, r14, r4, r10)
            r10.A07 = r4
            r0 = 3
            r10.A01 = r0
            java.lang.Object r11 = r2.A00(r13, r11, r10)
            if (r11 != r8) goto L_0x0097
        L_0x0087:
            return r8
        L_0x0088:
            java.lang.Object r14 = r10.A05
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r5 = r10.A04
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r10.A03
            X.Oay r6 = (X.C71079Oay) r6
            X.0eS.A00(r11)
        L_0x0097:
            X.ONW r11 = (X.ONW) r11
            boolean r0 = r11.A01
            if (r0 == 0) goto L_0x00bc
            X.ONd r3 = r11.A00
            if (r3 == 0) goto L_0x00b2
            X.OL0 r2 = r6.A04
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            r10.A03 = r6
            r10.A04 = r14
            r10.A05 = r3
            r0 = 4
            r10.A01 = r0
            r2.A00(r14, r1, r5)
            goto L_0x012a
        L_0x00b2:
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            java.lang.String r1 = "Response Data is null"
            X.Nnr r0 = new X.Nnr
            r0.<init>(r14, r2, r1)
            throw r0
        L_0x00bc:
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            java.lang.String r1 = "Bad Response"
            X.Nnr r0 = new X.Nnr
            r0.<init>(r14, r2, r1)
            throw r0
        L_0x00c6:
            java.lang.Object r5 = r10.A05
            X.136 r5 = (X.136) r5
            java.lang.Object r7 = r10.A04
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r14 = r10.A03
            java.lang.String r14 = (java.lang.String) r14
            goto L_0x01ad
        L_0x00d4:
            java.lang.Object r5 = r10.A04
            X.136 r5 = (X.136) r5
            java.lang.Object r6 = r10.A03
            X.Oay r6 = (X.C71079Oay) r6
            goto L_0x01dd
        L_0x00de:
            int r9 = r10.A00
            java.lang.Object r5 = r10.A08
            X.136 r5 = (X.136) r5
            java.lang.Object r7 = r10.A07
            java.lang.Object r12 = r10.A05
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r14 = r10.A04
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r6 = r10.A03
            X.Oay r6 = (X.C71079Oay) r6
            X.0eS.A00(r11)     // Catch:{ all -> 0x028d }
            goto L_0x01fa
        L_0x00f7:
            int r9 = r10.A00
            java.lang.Object r5 = r10.A06
            X.136 r5 = (X.136) r5
            java.lang.Object r7 = r10.A05
            java.lang.Object r14 = r10.A04
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r6 = r10.A03
            X.Oay r6 = (X.C71079Oay) r6
            goto L_0x0214
        L_0x0109:
            int r9 = r10.A00
            java.lang.Object r8 = r10.A06
            libraries.zero.headers.ZeroHeadersEntry r8 = (libraries.zero.headers.ZeroHeadersEntry) r8
            java.lang.Object r5 = r10.A05
            X.136 r5 = (X.136) r5
            java.lang.Object r7 = r10.A04
            java.lang.Object r6 = r10.A03
            X.Oay r6 = (X.C71079Oay) r6
            goto L_0x0231
        L_0x011b:
            java.lang.Object r3 = r10.A05
            X.ONd r3 = (X.C70831ONd) r3
            java.lang.Object r14 = r10.A04
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r6 = r10.A03
            X.Oay r6 = (X.C71079Oay) r6
            X.0eS.A00(r11)
        L_0x012a:
            java.lang.String r12 = r3.A02
            java.lang.String r13 = r3.A01
            java.lang.String r7 = r3.A03
            int r9 = r3.A00
            boolean r1 = r3.A04
            int r0 = r12.length()
            if (r0 != 0) goto L_0x014c
            int r0 = r13.length()
            if (r0 != 0) goto L_0x014c
            if (r1 != 0) goto L_0x014c
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            java.lang.String r0 = "No ping or headwind program"
            X.Nnr r2 = new X.Nnr
            r2.<init>(r14, r1, r0)
            throw r2
        L_0x014c:
            long r2 = java.lang.System.nanoTime()
            X.136 r5 = r6.A06
            A02(r6, r14, r12, r13, r10)
            r10.A07 = r7
            r10.A08 = r5
            r10.A00 = r9
            r10.A09 = r1
            r10.A02 = r2
            r0 = 5
            r10.A01 = r0
            java.lang.Object r0 = X.136.A00(r10, r5)
            if (r0 != r8) goto L_0x0188
            return r8
        L_0x0169:
            long r2 = r10.A02
            boolean r1 = r10.A09
            int r9 = r10.A00
            java.lang.Object r5 = r10.A08
            X.136 r5 = (X.136) r5
            java.lang.Object r7 = r10.A07
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r13 = r10.A06
            java.lang.Object r12 = r10.A05
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r14 = r10.A04
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r6 = r10.A03
            X.Oay r6 = (X.C71079Oay) r6
            X.0eS.A00(r11)
        L_0x0188:
            if (r1 == 0) goto L_0x01be
            X.OYZ r3 = r6.A02     // Catch:{ all -> 0x0270 }
            A02(r14, r7, r5, r4, r10)     // Catch:{ all -> 0x0270 }
            r10.A07 = r4     // Catch:{ all -> 0x0270 }
            r10.A08 = r4     // Catch:{ all -> 0x0270 }
            r0 = 6
            r10.A01 = r0     // Catch:{ all -> 0x0270 }
            java.util.Map r2 = X.OYZ.A00(r3)     // Catch:{ all -> 0x0270 }
            java.lang.Object r1 = r2.get(r7)     // Catch:{ all -> 0x0270 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x0270 }
            if (r1 == 0) goto L_0x01a9
            java.lang.Integer r0 = X.JTO.A0w(r9)     // Catch:{ all -> 0x0270 }
            r1.remove(r0)     // Catch:{ all -> 0x0270 }
        L_0x01a9:
            X.OYZ.A01(r3, r2)     // Catch:{ all -> 0x0270 }
            goto L_0x01b0
        L_0x01ad:
            X.0eS.A00(r11)     // Catch:{ all -> 0x028d }
        L_0x01b0:
            java.lang.Integer r2 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x028d }
            java.lang.String r0 = "Device has opted out of "
            java.lang.String r1 = X.002.A0R(r0, r7)     // Catch:{ all -> 0x028d }
            X.Nnr r0 = new X.Nnr     // Catch:{ all -> 0x028d }
            r0.<init>(r14, r2, r1)     // Catch:{ all -> 0x028d }
            throw r0     // Catch:{ all -> 0x028d }
        L_0x01be:
            long r0 = r6.A00     // Catch:{ all -> 0x0270 }
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 <= 0) goto L_0x01e6
            X.OL0 r3 = r6.A04     // Catch:{ all -> 0x0270 }
            java.lang.Integer r2 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x0270 }
            java.lang.String r1 = "Entry fetched by another thread"
            r10.A03 = r6     // Catch:{ all -> 0x0270 }
            r10.A04 = r5     // Catch:{ all -> 0x0270 }
            r10.A05 = r4     // Catch:{ all -> 0x0270 }
            r10.A06 = r4     // Catch:{ all -> 0x0270 }
            r10.A07 = r4     // Catch:{ all -> 0x0270 }
            r10.A08 = r4     // Catch:{ all -> 0x0270 }
            r0 = 7
            r10.A01 = r0     // Catch:{ all -> 0x0270 }
            r3.A00(r14, r2, r1)     // Catch:{ all -> 0x0270 }
            goto L_0x01e0
        L_0x01dd:
            X.0eS.A00(r11)     // Catch:{ all -> 0x028d }
        L_0x01e0:
            libraries.zero.headers.ZeroHeadersEntry r0 = r6.A01     // Catch:{ all -> 0x028d }
            r5.A05(r4)
            return r0
        L_0x01e6:
            X.OL0 r2 = r6.A04     // Catch:{ all -> 0x0270 }
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y     // Catch:{ all -> 0x0270 }
            A02(r6, r14, r12, r13, r10)     // Catch:{ all -> 0x0270 }
            r10.A07 = r7     // Catch:{ all -> 0x0270 }
            r10.A08 = r5     // Catch:{ all -> 0x0270 }
            r10.A00 = r9     // Catch:{ all -> 0x0270 }
            r0 = 8
            r10.A01 = r0     // Catch:{ all -> 0x0270 }
            r2.A00(r14, r1, r12)     // Catch:{ all -> 0x0270 }
        L_0x01fa:
            int r0 = r12.length()     // Catch:{ all -> 0x0270 }
            if (r0 <= 0) goto L_0x0264
            A02(r6, r14, r7, r5, r10)     // Catch:{ all -> 0x0270 }
            r10.A07 = r4     // Catch:{ all -> 0x0270 }
            r10.A08 = r4     // Catch:{ all -> 0x0270 }
            r10.A00 = r9     // Catch:{ all -> 0x0270 }
            r0 = 9
            r10.A01 = r0     // Catch:{ all -> 0x0270 }
            X.1Hj r11 = A01(r12, r14, r10, r6, r9)     // Catch:{ all -> 0x0270 }
            if (r11 != r8) goto L_0x0217
            return r8
        L_0x0214:
            X.0eS.A00(r11)     // Catch:{ all -> 0x028d }
        L_0x0217:
            libraries.zero.headers.ZeroHeadersEntry r11 = (libraries.zero.headers.ZeroHeadersEntry) r11     // Catch:{ all -> 0x028d }
            X.OL0 r2 = r6.A04     // Catch:{ all -> 0x028d }
            java.lang.Integer r1 = X.AnonymousClass05K.A0u     // Catch:{ all -> 0x028d }
            A02(r6, r7, r5, r11, r10)     // Catch:{ all -> 0x028d }
            r10.A07 = r4     // Catch:{ all -> 0x028d }
            r10.A08 = r4     // Catch:{ all -> 0x028d }
            r10.A00 = r9     // Catch:{ all -> 0x028d }
            r0 = 10
            r10.A01 = r0     // Catch:{ all -> 0x028d }
            java.lang.String r0 = ""
            r2.A00(r14, r1, r0)     // Catch:{ all -> 0x028d }
            r8 = r11
            goto L_0x0234
        L_0x0231:
            X.0eS.A00(r11)     // Catch:{ all -> 0x028f }
        L_0x0234:
            X.OYZ r3 = r6.A02     // Catch:{ all -> 0x028f }
            A02(r6, r5, r8, r4, r10)     // Catch:{ all -> 0x028f }
            r0 = 11
            r10.A01 = r0     // Catch:{ all -> 0x028f }
            java.util.Map r2 = X.OYZ.A00(r3)     // Catch:{ all -> 0x028f }
            java.lang.Object r1 = r2.get(r7)     // Catch:{ all -> 0x028f }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x028f }
            if (r1 != 0) goto L_0x025c
            java.lang.Integer r0 = X.JTO.A0w(r9)     // Catch:{ all -> 0x028f }
            X.0eP[] r0 = X.DbW.A1b(r0, r8)     // Catch:{ all -> 0x028f }
            java.util.LinkedHashMap r0 = X.0Yt.A07(r0)     // Catch:{ all -> 0x028f }
            r2.put(r7, r0)     // Catch:{ all -> 0x028f }
        L_0x0258:
            X.OYZ.A01(r3, r2)     // Catch:{ all -> 0x028f }
            goto L_0x0281
        L_0x025c:
            java.lang.Integer r0 = X.JTO.A0w(r9)     // Catch:{ all -> 0x028f }
            r1.put(r0, r8)     // Catch:{ all -> 0x028f }
            goto L_0x0258
        L_0x0264:
            java.lang.Integer r3 = X.AnonymousClass05K.A0j     // Catch:{ all -> 0x0270 }
            java.lang.String r2 = ""
            java.lang.String r1 = "Headwind not implemented"
            X.Nnr r0 = new X.Nnr     // Catch:{ all -> 0x0270 }
            r0.<init>(r2, r3, r1)     // Catch:{ all -> 0x0270 }
            throw r0     // Catch:{ all -> 0x0270 }
        L_0x0270:
            r2 = move-exception
            goto L_0x0290
        L_0x0272:
            java.lang.Object r8 = r10.A05
            libraries.zero.headers.ZeroHeadersEntry r8 = (libraries.zero.headers.ZeroHeadersEntry) r8
            java.lang.Object r5 = r10.A04
            X.136 r5 = (X.136) r5
            java.lang.Object r6 = r10.A03
            X.Oay r6 = (X.C71079Oay) r6
            X.0eS.A00(r11)     // Catch:{ all -> 0x028d }
        L_0x0281:
            long r0 = java.lang.System.nanoTime()     // Catch:{ all -> 0x028d }
            r6.A00 = r0     // Catch:{ all -> 0x028d }
            r6.A01 = r8     // Catch:{ all -> 0x028d }
            r5.A05(r4)
            return r8
        L_0x028d:
            r2 = move-exception
            goto L_0x0290
        L_0x028f:
            r2 = move-exception
        L_0x0290:
            r5.A05(r4)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71079Oay.A00(java.lang.String, java.lang.String, X.4D7, X.Oay):java.lang.Object");
    }

    public static void A02(Object obj, Object obj2, Object obj3, Object obj4, C73553Per per) {
        per.A03 = obj;
        per.A04 = obj2;
        per.A05 = obj3;
        per.A06 = obj4;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDj, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(java.lang.String r9, java.lang.String r10, X.AnonymousClass4D7 r11) {
        /*
            r8 = this;
            r3 = 28
            boolean r0 = X.C66131MDj.A01(r3, r11)
            if (r0 == 0) goto L_0x002d
            r4 = r11
            X.MDj r4 = (X.C66131MDj) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002d
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r7 = r4.A03
            X.1Hj r2 = X.1Hj.A02
            int r1 = r4.A00
            r6 = 3
            r5 = 2
            r0 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0040
            if (r1 == r0) goto L_0x0037
            if (r1 == r5) goto L_0x0033
            if (r1 == r6) goto L_0x0033
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x002d:
            X.MDj r4 = new X.MDj
            r4.<init>(r8, r11, r3)
            goto L_0x0016
        L_0x0033:
            X.0eS.A00(r7)
            return r3
        L_0x0037:
            java.lang.Object r10 = r4.A02
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r1 = r4.A01
            X.Oay r1 = (X.C71079Oay) r1
            goto L_0x0052
        L_0x0040:
            X.0eS.A00(r7)
            r4.A01 = r8     // Catch:{ Nnr -> 0x0072, Exception -> 0x0058 }
            r4.A02 = r10     // Catch:{ Nnr -> 0x0072, Exception -> 0x0058 }
            r4.A00 = r0     // Catch:{ Nnr -> 0x0072, Exception -> 0x0058 }
            java.lang.Object r7 = A00(r9, r10, r4, r8)     // Catch:{ Nnr -> 0x0072, Exception -> 0x0058 }
            if (r7 != r2) goto L_0x0050
            return r2
        L_0x0050:
            r1 = r8
            goto L_0x0055
        L_0x0052:
            X.0eS.A00(r7)     // Catch:{ Nnr -> 0x0075, Exception -> 0x005b }
        L_0x0055:
            libraries.zero.headers.ZeroHeadersEntry r7 = (libraries.zero.headers.ZeroHeadersEntry) r7     // Catch:{ Nnr -> 0x0075, Exception -> 0x005b }
            return r7
        L_0x0058:
            r0 = move-exception
            r1 = r8
            goto L_0x005c
        L_0x005b:
            r0 = move-exception
        L_0x005c:
            X.OL0 r2 = r1.A04
            java.lang.Integer r1 = X.AnonymousClass05K.A15
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L_0x0068
            java.lang.String r0 = ""
        L_0x0068:
            r4.A01 = r3
            r4.A02 = r3
            r4.A00 = r6
            r2.A00(r10, r1, r0)
            return r3
        L_0x0072:
            r0 = move-exception
            r1 = r8
            goto L_0x0076
        L_0x0075:
            r0 = move-exception
        L_0x0076:
            X.OL0 r2 = r1.A04
            java.lang.Integer r1 = r0.A00
            java.lang.String r0 = r0.A01
            r4.A01 = r3
            r4.A02 = r3
            r4.A00 = r5
            r2.A00(r10, r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71079Oay.A03(java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    public C71079Oay(IGZeroHeadersConfigFetch iGZeroHeadersConfigFetch, OL0 ol0, IGZeroHeadersPing iGZeroHeadersPing, OYZ oyz) {
        this.A03 = iGZeroHeadersConfigFetch;
        this.A05 = iGZeroHeadersPing;
        this.A02 = oyz;
        this.A04 = ol0;
    }
}
