package X;

public final class MCm implements 02o {
    public final int A00;
    public final Object A01;

    public MCm(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static MCm A00(Object obj, int i) {
        return new MCm(obj, i);
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDh, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.MQ0 r10, X.AnonymousClass4D7 r11) {
        /*
            r9 = this;
            r3 = 32
            boolean r0 = X.C66129MDh.A01(r3, r11)
            if (r0 == 0) goto L_0x00ca
            r5 = r11
            X.MDh r5 = (X.C66129MDh) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00ca
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r5.A02
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x0055
            if (r0 != r3) goto L_0x00d6
            java.lang.Object r1 = r5.A01
            X.MCm r1 = (X.MCm) r1
            X.0eS.A00(r2)
        L_0x0028:
            X.0gF r0 = X.C60340gF.A00
            X.JTj r10 = new X.JTj
            r10.<init>(r0, r3)
        L_0x002f:
            java.lang.Object r1 = r1.A01
            X.Ne0 r1 = (X.C69063Ne0) r1
            boolean r0 = r10 instanceof X.C59702JUj
            if (r0 != 0) goto L_0x0052
            boolean r0 = X.C59678JTj.A01(r3, r10)
            if (r0 != 0) goto L_0x0052
            boolean r0 = X.C59678JTj.A02(r10)
            if (r0 == 0) goto L_0x00d1
            X.OSj r2 = r1.A02
            java.lang.String r1 = "token_fetch_error"
            java.lang.String r0 = "error_message"
            java.util.Map r1 = X.AnonymousClass7TF.A0w(r0, r1)
            java.lang.String r0 = "igd_campaign_list_fetch_error"
            X.C70936OSj.A00(r2, r0, r1)
        L_0x0052:
            X.0gF r4 = X.C60340gF.A00
        L_0x0054:
            return r4
        L_0x0055:
            X.0eS.A00(r2)
            java.lang.Object r6 = r9.A01
            X.Ne0 r6 = (X.C69063Ne0) r6
            boolean r0 = r10 instanceof X.C59702JUj
            if (r0 != 0) goto L_0x00c7
            boolean r0 = X.C59678JTj.A01(r3, r10)
            if (r0 == 0) goto L_0x00bc
            X.JTj r10 = (X.C59678JTj) r10
            java.lang.Object r1 = r10.A01
            X.UX1 r1 = (X.UX1) r1
            com.instagram.common.session.UserSession r0 = r6.A01
            java.lang.String r8 = r1.A00
            if (r8 != 0) goto L_0x0074
            java.lang.String r8 = ""
        L_0x0074:
            X.0qQ.A0B(r8, r3)
            r7 = 0
            X.1NY r2 = X.AnonymousClass7TG.A0b(r0)
            java.lang.String r0 = "direct_v2/ads_for_ctd_ads_thread_view/"
            r2.A0A(r0)
            java.lang.String r1 = "number_of_ads"
            r0 = 20
            r2.A0C(r1, r0)
            r0 = 318(0x13e, float:4.46E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r2.A9m(r0, r8)
            java.lang.Class<X.NGp> r1 = X.NGp.class
            java.lang.Class<X.OOa> r0 = X.C70847OOa.class
            X.1OC r1 = X.DbU.A0S(r2, r1, r0)
            r0 = 1316016357(0x4e70d0e5, float:1.01005549E9)
            X.032 r2 = r1.A03(r0)
            r1 = 12
            X.MEQ r0 = new X.MEQ
            r0.<init>(r1, r7)
            X.MCA r1 = X.JUM.A01(r0, r2)
            X.MCm r0 = A00(r6, r3)
            r5.A01 = r9
            r5.A00 = r3
            java.lang.Object r0 = r1.collect(r0, r5)
            if (r0 == r4) goto L_0x0054
            r1 = r9
            goto L_0x0028
        L_0x00bc:
            boolean r0 = X.C59678JTj.A02(r10)
            if (r0 != 0) goto L_0x00c7
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00c7:
            r1 = r9
            goto L_0x002f
        L_0x00ca:
            X.MDh r5 = new X.MDh
            r5.<init>(r9, r11, r3)
            goto L_0x0016
        L_0x00d1:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00d6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MCm.A02(X.MQ0, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [X.4D7, X.MDp] */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(X.MQ0 r13, X.AnonymousClass4D7 r14) {
        /*
            r12 = this;
            r3 = 46
            boolean r0 = X.C66137MDp.A02(r3, r14)
            if (r0 == 0) goto L_0x0032
            r8 = r14
            X.MDp r8 = (X.C66137MDp) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0032
            int r2 = r2 - r1
            r8.A00 = r2
        L_0x0016:
            java.lang.Object r4 = r8.A02
            X.1Hj r9 = X.1Hj.A02
            int r0 = r8.A00
            r7 = 5
            r6 = 4
            r1 = 3
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0037
            if (r0 == r2) goto L_0x00bc
            if (r0 == r3) goto L_0x00bc
            if (r0 == r1) goto L_0x00bc
            if (r0 == r6) goto L_0x00bc
            if (r0 == r7) goto L_0x00bc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0032:
            X.MDp r8 = X.C66137MDp.A00(r12, r14, r3)
            goto L_0x0016
        L_0x0037:
            X.0eS.A00(r4)
            boolean r0 = r13 instanceof X.C59702JUj
            if (r0 == 0) goto L_0x005c
            java.lang.Object r1 = r12.A01
            com.instagram.mediakit.repository.MediaKitRepository r1 = (com.instagram.mediakit.repository.MediaKitRepository) r1
            X.JzE r0 = com.instagram.mediakit.repository.MediaKitRepository.A00(r1)
            if (r0 == 0) goto L_0x0053
            X.LtG r0 = X.C65432LtG.A00
            r8.A00 = r2
            java.lang.Object r0 = com.instagram.mediakit.repository.MediaKitRepository.A02(r0, r1, r8)
        L_0x0050:
            if (r0 != r9) goto L_0x00bf
            return r9
        L_0x0053:
            X.LtF r0 = X.C65431LtF.A00
            r8.A00 = r3
            java.lang.Object r0 = com.instagram.mediakit.repository.MediaKitRepository.A02(r0, r1, r8)
            goto L_0x0050
        L_0x005c:
            boolean r0 = X.C59678JTj.A02(r13)
            r5 = 0
            if (r0 == 0) goto L_0x006e
            java.lang.Object r0 = r12.A01
            com.instagram.mediakit.repository.MediaKitRepository r0 = (com.instagram.mediakit.repository.MediaKitRepository) r0
            r8.A00 = r1
            java.lang.Object r0 = com.instagram.mediakit.repository.MediaKitRepository.A01(r5, r0, r8)
            goto L_0x0050
        L_0x006e:
            boolean r0 = X.C59678JTj.A01(r2, r13)
            if (r0 == 0) goto L_0x00c2
            java.lang.Object r4 = r12.A01
            com.instagram.mediakit.repository.MediaKitRepository r4 = (com.instagram.mediakit.repository.MediaKitRepository) r4
            X.LFM r11 = r4.A02
            X.JTj r13 = (X.C59678JTj) r13
            java.lang.Object r0 = r13.A01
            X.JtX r0 = (X.C60913JtX) r0
            java.util.List r10 = r0.A00
            java.util.Iterator r3 = X.JTP.A0x(r10)
        L_0x0086:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x009e
            java.lang.Object r2 = r3.next()
            X.JzE r2 = (X.C61221JzE) r2
            java.util.HashMap r1 = r11.A05
            java.lang.String r0 = r2.A03
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.put(r0, r2)
            goto L_0x0086
        L_0x009e:
            java.lang.Object r0 = X.00k.A0J(r10)
            X.JzE r0 = (X.C61221JzE) r0
            if (r0 == 0) goto L_0x00b3
            java.lang.String r0 = r0.A03
            if (r0 == 0) goto L_0x00b3
            r8.A01 = r12
            r8.A00 = r6
            java.lang.Object r0 = com.instagram.mediakit.repository.MediaKitRepository.A03(r4, r0, r8)
            goto L_0x0050
        L_0x00b3:
            r8.A01 = r5
            r8.A00 = r7
            java.lang.Object r0 = com.instagram.mediakit.repository.MediaKitRepository.A01(r5, r4, r8)
            goto L_0x0050
        L_0x00bc:
            X.0eS.A00(r4)
        L_0x00bf:
            X.0gF r9 = X.C60340gF.A00
            return r9
        L_0x00c2:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MCm.A03(X.MQ0, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.4D7, X.MDp] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(java.util.List r8, X.AnonymousClass4D7 r9) {
        /*
            r7 = this;
            r3 = 18
            boolean r0 = X.C66137MDp.A02(r3, r9)
            if (r0 == 0) goto L_0x007a
            r6 = r9
            X.MDp r6 = (X.C66137MDp) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x007a
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A02
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 != r4) goto L_0x007f
            java.lang.Object r0 = r6.A01
            X.MCm r0 = (X.MCm) r0
            X.0eS.A00(r1)
        L_0x0028:
            java.lang.Object r2 = r0.A01
            X.MYL r2 = (X.MYL) r2
            X.MKx r1 = X.C66262MKx.A00
            X.PGX r0 = new X.PGX
            r0.<init>(r1)
            r2.A0P(r0)
        L_0x0036:
            X.0gF r5 = X.C60340gF.A00
        L_0x0038:
            return r5
        L_0x0039:
            X.0eS.A00(r1)
            java.lang.Object r0 = X.00k.A0J(r8)
            X.N4t r0 = (X.N4t) r0
            if (r0 == 0) goto L_0x0056
            java.lang.String r0 = r0.A09
            if (r0 == 0) goto L_0x0056
            java.util.List r0 = X.DbX.A0x(r0)
            if (r0 == 0) goto L_0x0056
            java.lang.Object r3 = X.00k.A0J(r0)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x0058
        L_0x0056:
            java.lang.String r3 = ""
        L_0x0058:
            java.lang.Object r2 = r7.A01
            X.MYL r2 = (X.MYL) r2
            r1 = 45
            X.PmN r0 = new X.PmN
            r0.<init>(r3, r8, r1)
            r2.A0R(r0)
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0036
            r0 = 250(0xfa, double:1.235E-321)
            r6.A01 = r7
            r6.A00 = r4
            java.lang.Object r0 = X.C241603Pv.A01(r6, r0)
            if (r0 == r5) goto L_0x0038
            r0 = r7
            goto L_0x0028
        L_0x007a:
            X.MDp r6 = X.C66137MDp.A00(r7, r9, r3)
            goto L_0x0016
        L_0x007f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MCm.A04(java.util.List, X.4D7):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: X.4D7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: X.ME6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: X.MDo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v36, resolved type: X.ME3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v83, resolved type: X.4D7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v85, resolved type: X.ME6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v89, resolved type: X.MDo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v90, resolved type: X.4D7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v91, resolved type: X.MDo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v92, resolved type: X.4D7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v94, resolved type: X.ME3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v97, resolved type: X.ME3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v98, resolved type: X.ME3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v100, resolved type: X.ME3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v103, resolved type: X.ME3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v106, resolved type: X.ME3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v107, resolved type: X.ME3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v108, resolved type: X.ME3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v114, resolved type: X.ME3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v117, resolved type: X.ME6} */
    /* JADX WARNING: type inference failed for: r4v10, types: [X.ME7, X.4D7] */
    /* JADX WARNING: type inference failed for: r8v2, types: [X.MDo, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v58, types: [X.ME3, X.4D7] */
    /* JADX WARNING: type inference failed for: r0v225, types: [X.2tL, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v87 */
    /* JADX WARNING: type inference failed for: r4v88 */
    /* JADX WARNING: type inference failed for: r8v20 */
    /* JADX WARNING: type inference failed for: r8v22 */
    /* JADX WARNING: type inference failed for: r4v110 */
    /* JADX WARNING: type inference failed for: r4v111 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02b5, code lost:
        r3 = new X.MGW(r4, r0, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0421, code lost:
        if (r0 == null) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0423, code lost:
        r0.setPrimaryActionIsLoading(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0473, code lost:
        r9 = null;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0482, code lost:
        r5 = X.C346827vp.A00(r4.getLifecycle(), r7, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x048c, code lost:
        if (r5 != X.1Hj.A02) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x048e, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x051f, code lost:
        r4.A00 = r3;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0603, code lost:
        r3 = A01(r6, r2);
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x060c, code lost:
        if (X.AnonymousClass7TE.A0M(r0) == -1) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x068e, code lost:
        if ((r0 instanceof X.C61910KRf) != false) goto L_0x0690;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0690, code lost:
        r8.A00 = r4;
        r0 = r3.emit(r0, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b5, code lost:
        X.0qQ.A0F(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bc, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0953, code lost:
        r1.Epw(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:0x0a02, code lost:
        X.0eS.A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x0a93, code lost:
        r4.A00 = r3;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x0aac, code lost:
        if (r0.A1f == r3) goto L_0x0aae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x0aae, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:0x0aaf, code lost:
        r9 = new X.C61077JwF((java.lang.Object) r2, r7, 13, r1);
        r4.A00 = 1;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x0ab8, code lost:
        r0 = r6.emit(r9, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x0abd, code lost:
        if (r0 != null) goto L_0x0aa9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x0ad4, code lost:
        if (r0 != r5) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x0ad6, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:515:0x0b3a, code lost:
        X.0qQ.A0F(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:0x0b41, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x02e8  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0383  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0390  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x03bf  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x03cc  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x044e  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x045b  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x04ae  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x04bb  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0505  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0512  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x05ca  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x05f6  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x063a  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x067b  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x0688  */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x08d6  */
    /* JADX WARNING: Removed duplicated region for block: B:437:0x09f5  */
    /* JADX WARNING: Removed duplicated region for block: B:442:0x0a07  */
    /* JADX WARNING: Removed duplicated region for block: B:474:0x0a85  */
    /* JADX WARNING: Removed duplicated region for block: B:476:0x0a96  */
    /* JADX WARNING: Removed duplicated region for block: B:489:0x0ac3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object r17, X.AnonymousClass4D7 r18) {
        /*
            r16 = this;
            r6 = r16
            r0 = r17
            int r1 = r6.A00
            r7 = r18
            switch(r1) {
                case 0: goto L_0x099f;
                case 1: goto L_0x0958;
                case 2: goto L_0x0b65;
                case 3: goto L_0x094d;
                case 4: goto L_0x0946;
                case 5: goto L_0x093f;
                case 6: goto L_0x0938;
                case 7: goto L_0x0931;
                case 8: goto L_0x092a;
                case 9: goto L_0x0923;
                case 10: goto L_0x091c;
                case 11: goto L_0x0915;
                case 12: goto L_0x090e;
                case 13: goto L_0x08ee;
                case 14: goto L_0x08e3;
                case 15: goto L_0x08b7;
                case 16: goto L_0x0098;
                case 17: goto L_0x087c;
                case 18: goto L_0x086c;
                case 19: goto L_0x0864;
                case 20: goto L_0x000b;
                case 21: goto L_0x000b;
                case 22: goto L_0x000b;
                case 23: goto L_0x0854;
                case 24: goto L_0x0844;
                case 25: goto L_0x083c;
                case 26: goto L_0x0834;
                case 27: goto L_0x082c;
                case 28: goto L_0x0817;
                case 29: goto L_0x07d8;
                case 30: goto L_0x07bf;
                case 31: goto L_0x075c;
                case 32: goto L_0x073e;
                case 33: goto L_0x06fe;
                case 34: goto L_0x0ad7;
                case 35: goto L_0x0698;
                case 36: goto L_0x065c;
                case 37: goto L_0x0647;
                case 38: goto L_0x061b;
                case 39: goto L_0x0610;
                case 40: goto L_0x05d7;
                case 41: goto L_0x05ab;
                case 42: goto L_0x059b;
                case 43: goto L_0x0b5e;
                case 44: goto L_0x0523;
                case 45: goto L_0x04e6;
                case 46: goto L_0x04de;
                case 47: goto L_0x048f;
                case 48: goto L_0x0476;
                case 49: goto L_0x042f;
                case 50: goto L_0x0428;
                case 51: goto L_0x0417;
                case 52: goto L_0x040c;
                case 53: goto L_0x03a0;
                case 54: goto L_0x0364;
                case 55: goto L_0x02f4;
                case 56: goto L_0x0b57;
                case 57: goto L_0x02bc;
                case 58: goto L_0x02ae;
                case 59: goto L_0x02a6;
                case 60: goto L_0x026b;
                case 61: goto L_0x01f7;
                case 62: goto L_0x0137;
                case 63: goto L_0x00ef;
                case 64: goto L_0x00d6;
                case 65: goto L_0x0074;
                case 66: goto L_0x0048;
                case 67: goto L_0x0038;
                case 68: goto L_0x0017;
                case 69: goto L_0x09d6;
                case 70: goto L_0x0428;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = r6.A01
            X.Ne7 r1 = (X.C69068Ne7) r1
            X.C69068Ne7.A01(r1, r0)
        L_0x0014:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x0017:
            int r3 = X.AnonymousClass7TE.A0M(r0)
            java.lang.Object r2 = r6.A01
            com.instagram.pendingmedia.service.impl.PendingMediaWorker r2 = (com.instagram.pendingmedia.service.impl.PendingMediaWorker) r2
            X.OI4 r1 = r2.A01
            java.lang.Integer r0 = r1.A06
            if (r0 == 0) goto L_0x002b
            int r0 = r0.intValue()
            if (r0 == r3) goto L_0x0014
        L_0x002b:
            java.lang.Integer r0 = X.JTO.A0w(r3)
            r1.A06 = r0
            r0 = 0
            java.lang.Object r5 = com.instagram.pendingmedia.service.impl.PendingMediaWorker.A02(r2, r7, r0)
            goto L_0x048a
        L_0x0038:
            java.lang.Object r1 = r6.A01
            com.instagram.nux.aymh.viewmodel.AymhViewModel r1 = (com.instagram.nux.aymh.viewmodel.AymhViewModel) r1
            X.0eM r1 = r1.A08
            java.lang.Object r1 = r1.getValue()
            X.2Fk r1 = (X.2Fk) r1
            r1.A0B(r0)
            goto L_0x0014
        L_0x0048:
            r5 = 12
            boolean r1 = X.ME6.A02(r5, r7)
            if (r1 == 0) goto L_0x006e
            r4 = r7
            X.ME6 r4 = (X.ME6) r4
            int r3 = r4.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x006e
            int r3 = r3 - r2
            r4.A00 = r3
        L_0x005e:
            java.lang.Object r2 = r4.A02
            X.1Hj r5 = X.1Hj.A02
            int r1 = r4.A00
            r3 = 1
            if (r1 == 0) goto L_0x0a85
            if (r1 == r3) goto L_0x0a02
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0x()
            throw r1
        L_0x006e:
            X.ME6 r4 = new X.ME6
            r4.<init>(r6, r7, r5)
            goto L_0x005e
        L_0x0074:
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r4 = r6.A01
            X.JUw r4 = (X.C59713JUw) r4
            X.JZz r1 = r4.A03
            java.lang.String r3 = "adapter"
            if (r1 == 0) goto L_0x00b5
            X.2re r1 = r1.mDiffer
            java.util.List r1 = r1.A02
            boolean r1 = X.0qQ.A0K(r1, r0)
            if (r1 != 0) goto L_0x0014
            X.JZz r2 = r4.A03
            if (r2 == 0) goto L_0x00b5
            X.Ja2 r1 = new X.Ja2
            r1.<init>(r4)
            r2.submitList(r0, r1)
            goto L_0x0014
        L_0x0098:
            X.JwH r0 = (X.C61079JwH) r0
            com.instagram.common.recyclerview.ViewModelListUpdate r3 = X.DbS.A0R()
            java.lang.Object r2 = r0.A00
            boolean r1 = r2 instanceof X.KRD
            if (r1 == 0) goto L_0x00bd
            java.lang.Object r0 = r0.A01
            java.util.List r0 = (java.util.List) r0
            r3.A01(r0)
        L_0x00ab:
            java.lang.Object r0 = r6.A01
            X.NKD r0 = (X.NKD) r0
            X.2t9 r0 = r0.A02
            if (r0 != 0) goto L_0x00d1
            java.lang.String r3 = "igRecyclerViewAdapter"
        L_0x00b5:
            X.0qQ.A0F(r3)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x00bd:
            boolean r1 = r2 instanceof X.KRG
            if (r1 == 0) goto L_0x00ab
            java.lang.Object r0 = r0.A01
            java.util.List r0 = (java.util.List) r0
            r3.A01(r0)
            X.LhT r0 = new X.LhT
            r0.<init>()
            r3.A00(r0)
            goto L_0x00ab
        L_0x00d1:
            r0.A05(r3)
            goto L_0x0014
        L_0x00d6:
            X.3Ii r0 = (X.C239803Ii) r0
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x0014
            java.lang.Object r1 = r6.A01
            com.instagram.music.search.query.viewmodel.MusicSearchQueryViewModel r1 = (com.instagram.music.search.query.viewmodel.MusicSearchQueryViewModel) r1
            X.2Fj r1 = r1.A0C
            X.3Ih r0 = (X.C239793Ih) r0
            java.lang.Object r0 = r0.A00
            X.CFx r0 = (X.C43857CFx) r0
            java.util.List r0 = r0.A01
            r1.A0B(r0)
            goto L_0x0014
        L_0x00ef:
            X.KlI r0 = (X.C62718KlI) r0
            boolean r1 = r0 instanceof X.C61331K2s
            if (r1 != 0) goto L_0x0124
            boolean r1 = r0 instanceof X.C61330K2r
            if (r1 == 0) goto L_0x0b6c
            java.lang.Object r5 = r6.A01
            X.AJ9 r5 = (X.AJ9) r5
            java.lang.ref.WeakReference r1 = r5.A0P
            java.lang.Object r2 = r1.get()
            r1 = 8
            java.lang.String r1 = X.C273654mx.A00(r1)
            X.0qQ.A0C(r2, r1)
            androidx.fragment.app.FragmentActivity r4 = X.DbZ.A0E(r2)
            if (r4 == 0) goto L_0x0124
            com.instagram.common.session.UserSession r3 = r5.A0I
            X.K2r r0 = (X.C61330K2r) r0
            com.instagram.avatars.coinflip.AvatarCoinFlipConfig r2 = r0.A00
            r0 = 15
            X.Lyz r1 = new X.Lyz
            r1.<init>(r5, r0)
            java.lang.String r0 = "ig_music_search"
            X.C49739F4e.A00(r4, r2, r3, r1, r0)
        L_0x0124:
            java.lang.Object r0 = r6.A01
            X.AJ9 r0 = (X.AJ9) r0
            X.0eM r0 = r0.A0T
            java.lang.Object r0 = r0.getValue()
            X.6i1 r0 = (X.C314326i1) r0
            if (r0 == 0) goto L_0x0014
            r0.A01()
            goto L_0x0014
        L_0x0137:
            X.Knj r0 = (X.C62869Knj) r0
            X.Ka4 r1 = X.C62099Ka4.A00
            boolean r1 = X.0qQ.A0K(r0, r1)
            if (r1 != 0) goto L_0x01ae
            X.Ka3 r1 = X.C62098Ka3.A00
            boolean r1 = X.0qQ.A0K(r0, r1)
            if (r1 != 0) goto L_0x01ae
            boolean r1 = r0 instanceof X.C62096Ka1
            if (r1 == 0) goto L_0x01c7
            java.lang.Object r4 = r6.A01
            X.AJ9 r4 = (X.AJ9) r4
            X.Ka1 r0 = (X.C62096Ka1) r0
            X.6nz r0 = r0.A00
            java.util.List r0 = r0.A0O
            r9 = 0
            java.lang.Object r0 = r0.get(r9)
            X.6o8 r0 = (X.C317966o8) r0
            com.instagram.common.typedurl.ImageUrl r0 = r0.A0H
            java.lang.String r8 = X.JTP.A0o(r0)
            android.widget.ImageView r0 = r4.A03
            r3 = 0
            if (r0 == 0) goto L_0x01c5
            android.graphics.drawable.Drawable r5 = r0.getDrawable()
        L_0x016d:
            boolean r0 = r5 instanceof X.C60002JdB
            if (r0 == 0) goto L_0x019a
            X.JdB r5 = (X.C60002JdB) r5
            if (r5 == 0) goto L_0x019a
            X.JvS r0 = r5.A01
            boolean r12 = r0.A04
            r11 = 1
            X.JvS r7 = new X.JvS
            r10 = r9
            r7.<init>(r8, r9, r10, r11, r12)
            r5.A01 = r7
            X.1NK r2 = X.1NK.A00()
            X.JvS r0 = r5.A01
            java.lang.String r0 = r0.A01
            com.instagram.common.typedurl.SimpleImageUrl r1 = X.DbS.A0V(r0)
            java.lang.String r0 = "AVATAR_STICKER_TOGGLE"
            X.1OO r0 = r2.A0J(r1, r0)
            r0.A02(r5)
            r0.A01()
        L_0x019a:
            android.widget.ImageView r2 = r4.A03
            if (r2 == 0) goto L_0x01ae
            android.content.Context r1 = r2.getContext()
            if (r1 == 0) goto L_0x01ab
            r0 = 2131967752(0x7f133f08, float:1.957238E38)
            java.lang.String r3 = r1.getString(r0)
        L_0x01ab:
            r2.setContentDescription(r3)
        L_0x01ae:
            java.lang.Object r0 = r6.A01
            X.AJ9 r0 = (X.AJ9) r0
            X.0eM r0 = r0.A0S
            java.lang.Object r0 = r0.getValue()
            X.Jii r0 = (X.C60286Jii) r0
            if (r0 == 0) goto L_0x0014
            X.05G r1 = r0.A03
            X.Ka3 r0 = X.C62098Ka3.A00
            r1.Epw(r0)
            goto L_0x0014
        L_0x01c5:
            r5 = r3
            goto L_0x016d
        L_0x01c7:
            boolean r1 = r0 instanceof X.C62095Ka0
            if (r1 == 0) goto L_0x01e7
            java.lang.Object r1 = r6.A01
            X.AJ9 r1 = (X.AJ9) r1
            X.Ka0 r0 = (X.C62095Ka0) r0
            X.6nz r0 = r0.A00
            r1.A07 = r0
            if (r0 == 0) goto L_0x01e0
            X.7w8 r0 = X.AJ9.A00(r0, r1)
            r1.A05 = r0
            X.AJ9.A07(r1)
        L_0x01e0:
            r0 = 1
            r1.A0B = r0
            X.AJ9.A02(r1)
            goto L_0x01ae
        L_0x01e7:
            X.Ka2 r1 = X.C62097Ka2.A00
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x0b71
            java.lang.Object r0 = r6.A01
            X.AJ9 r0 = (X.AJ9) r0
            X.AJ9.A06(r0)
            goto L_0x01ae
        L_0x01f7:
            X.KnG r0 = (X.C62840KnG) r0
            X.KUe r1 = X.C61981KUe.A00
            boolean r1 = X.0qQ.A0K(r0, r1)
            if (r1 != 0) goto L_0x0260
            X.KUg r1 = X.C61983KUg.A00
            boolean r1 = X.0qQ.A0K(r0, r1)
            if (r1 != 0) goto L_0x0260
            X.KUf r1 = X.C61982KUf.A00
            boolean r1 = X.0qQ.A0K(r0, r1)
            if (r1 == 0) goto L_0x023f
            java.lang.Object r1 = r6.A01
            X.AJ9 r1 = (X.AJ9) r1
            r0 = 0
            r1.A0B = r0
            X.0eM r0 = r1.A0S
            java.lang.Object r0 = r0.getValue()
            X.Jii r0 = (X.C60286Jii) r0
            if (r0 == 0) goto L_0x0229
            X.05G r1 = r0.A03
            X.Ka2 r0 = X.C62097Ka2.A00
            r1.Epw(r0)
        L_0x0229:
            java.lang.Object r0 = r6.A01
            X.AJ9 r0 = (X.AJ9) r0
            X.0eM r0 = r0.A0Q
            java.lang.Object r0 = r0.getValue()
            X.JgY r0 = (X.C60153JgY) r0
            if (r0 == 0) goto L_0x0014
            X.05G r1 = r0.A02
            r0 = 0
            r1.Epw(r0)
            goto L_0x0014
        L_0x023f:
            boolean r1 = r0 instanceof X.C61980KUd
            if (r1 == 0) goto L_0x0259
            java.lang.Object r1 = r6.A01
            X.AJ9 r1 = (X.AJ9) r1
            X.KUd r0 = (X.C61980KUd) r0
            X.6nz r0 = r0.A00
            r1.A07 = r0
            if (r0 == 0) goto L_0x0229
            X.7w8 r0 = X.AJ9.A00(r0, r1)
            r1.A05 = r0
            X.AJ9.A07(r1)
            goto L_0x0229
        L_0x0259:
            if (r0 == 0) goto L_0x0229
            X.Wub r1 = X.AnonymousClass7TE.A1K()
            throw r1
        L_0x0260:
            java.lang.Object r1 = r6.A01
            X.AJ9 r1 = (X.AJ9) r1
            r0 = 1
            r1.A0B = r0
            X.AJ9.A04(r1)
            goto L_0x0229
        L_0x026b:
            X.KlI r0 = (X.C62718KlI) r0
            boolean r1 = r0 instanceof X.C61331K2s
            if (r1 != 0) goto L_0x0295
            boolean r1 = r0 instanceof X.C61330K2r
            if (r1 == 0) goto L_0x0b76
            java.lang.Object r5 = r6.A01
            X.K3N r5 = (X.K3N) r5
            androidx.fragment.app.FragmentActivity r4 = r5.getActivity()
            if (r4 == 0) goto L_0x0295
            X.0eM r1 = r5.A07
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r1)
            X.K2r r0 = (X.C61330K2r) r0
            com.instagram.avatars.coinflip.AvatarCoinFlipConfig r2 = r0.A00
            r0 = 14
            X.Lyz r1 = new X.Lyz
            r1.<init>(r5, r0)
            java.lang.String r0 = "ig_music_search"
            X.C49739F4e.A00(r4, r2, r3, r1, r0)
        L_0x0295:
            java.lang.Object r0 = r6.A01
            X.K3N r0 = (X.K3N) r0
            X.0eM r0 = r0.A06
            java.lang.Object r0 = r0.getValue()
            X.6i1 r0 = (X.C314326i1) r0
            r0.A01()
            goto L_0x0014
        L_0x02a6:
            java.lang.Object r4 = r6.A01
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            r2 = 0
            r1 = 25
            goto L_0x02b5
        L_0x02ae:
            java.lang.Object r4 = r6.A01
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            r2 = 0
            r1 = 24
        L_0x02b5:
            X.MGW r3 = new X.MGW
            r3.<init>(r4, r0, r2, r1)
            goto L_0x0482
        L_0x02bc:
            r5 = 36
            boolean r1 = X.ME3.A03(r5, r7)
            if (r1 == 0) goto L_0x02e2
            r4 = r7
            X.ME3 r4 = (X.ME3) r4
            int r3 = r4.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x02e2
            int r3 = r3 - r2
            r4.A00 = r3
        L_0x02d2:
            java.lang.Object r2 = r4.A02
            X.1Hj r5 = X.1Hj.A02
            int r1 = r4.A00
            r3 = 1
            if (r1 == 0) goto L_0x02e8
            if (r1 == r3) goto L_0x0a02
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0x()
            throw r1
        L_0x02e2:
            X.ME3 r4 = new X.ME3
            r4.<init>(r6, r7, r5)
            goto L_0x02d2
        L_0x02e8:
            X.02o r6 = A01(r6, r2)
            X.Jz9 r0 = (X.C61216Jz9) r0
            if (r0 == 0) goto L_0x0473
            X.JzE r9 = r0.A00
            goto L_0x051f
        L_0x02f4:
            X.MQ0 r0 = (X.MQ0) r0
            boolean r1 = X.C59678JTj.A03(r0)
            r7 = 0
            r2 = 0
            if (r1 == 0) goto L_0x033f
            X.JTj r0 = (X.C59678JTj) r0
            java.lang.Object r0 = r0.A01
            X.JtX r0 = (X.C60913JtX) r0
            java.util.List r5 = r0.A00
            java.lang.Object r4 = r6.A01
            com.instagram.mediakit.repository.MediaKitRepository r4 = (com.instagram.mediakit.repository.MediaKitRepository) r4
            X.05G r3 = r4.A06
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            java.lang.Object r0 = X.00k.A0J(r5)
            X.JzE r0 = (X.C61221JzE) r0
            if (r0 == 0) goto L_0x031a
            java.lang.String r2 = r0.A03
        L_0x031a:
            X.0eP r0 = X.AnonymousClass7TE.A1L(r1, r2)
            r3.Epw(r0)
            X.LFM r4 = r4.A02
            java.util.Iterator r3 = X.JTP.A0x(r5)
        L_0x0327:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r2 = r3.next()
            X.JzE r2 = (X.C61221JzE) r2
            java.util.HashMap r1 = r4.A05
            java.lang.String r0 = r2.A03
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.put(r0, r2)
            goto L_0x0327
        L_0x033f:
            boolean r1 = X.C59678JTj.A01(r7, r0)
            if (r1 == 0) goto L_0x0358
            java.lang.Object r0 = r6.A01
            com.instagram.mediakit.repository.MediaKitRepository r0 = (com.instagram.mediakit.repository.MediaKitRepository) r0
            X.05G r1 = r0.A06
        L_0x034b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            X.0eP r0 = X.AnonymousClass7TE.A1L(r0, r2)
            r1.Epw(r0)
            goto L_0x0014
        L_0x0358:
            boolean r0 = r0 instanceof X.C59702JUj
            if (r0 == 0) goto L_0x0b7b
            java.lang.Object r0 = r6.A01
            com.instagram.mediakit.repository.MediaKitRepository r0 = (com.instagram.mediakit.repository.MediaKitRepository) r0
            X.05G r1 = r0.A06
            r7 = 1
            goto L_0x034b
        L_0x0364:
            r5 = 30
            boolean r1 = X.ME3.A03(r5, r7)
            if (r1 == 0) goto L_0x038a
            r4 = r7
            X.ME3 r4 = (X.ME3) r4
            int r3 = r4.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x038a
            int r3 = r3 - r2
            r4.A00 = r3
        L_0x037a:
            java.lang.Object r2 = r4.A02
            X.1Hj r5 = X.1Hj.A02
            int r1 = r4.A00
            r3 = 1
            if (r1 == 0) goto L_0x0390
            if (r1 == r3) goto L_0x0a02
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0x()
            throw r1
        L_0x038a:
            X.ME3 r4 = new X.ME3
            r4.<init>(r6, r7, r5)
            goto L_0x037a
        L_0x0390:
            X.02o r1 = A01(r6, r2)
            X.0eP r0 = (X.0eP) r0
            java.lang.Object r0 = r0.A01
            r4.A00 = r3
            java.lang.Object r0 = r1.emit(r0, r4)
            goto L_0x0ad4
        L_0x03a0:
            r5 = 29
            boolean r1 = X.ME3.A03(r5, r7)
            if (r1 == 0) goto L_0x03c6
            r4 = r7
            X.ME3 r4 = (X.ME3) r4
            int r3 = r4.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x03c6
            int r3 = r3 - r2
            r4.A00 = r3
        L_0x03b6:
            java.lang.Object r2 = r4.A02
            X.1Hj r5 = X.1Hj.A02
            int r1 = r4.A00
            r3 = 1
            if (r1 == 0) goto L_0x03cc
            if (r1 == r3) goto L_0x0a02
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0x()
            throw r1
        L_0x03c6:
            X.ME3 r4 = new X.ME3
            r4.<init>(r6, r7, r5)
            goto L_0x03b6
        L_0x03cc:
            X.02o r6 = A01(r6, r2)
            X.MQ0 r0 = (X.MQ0) r0
            boolean r1 = X.C59678JTj.A01(r3, r0)
            r2 = 0
            r7 = 0
            if (r1 == 0) goto L_0x03ec
            X.JTj r0 = (X.C59678JTj) r0
            java.lang.Object r0 = r0.A01
            X.JtN r0 = (X.C60903JtN) r0
            if (r0 == 0) goto L_0x03e4
            java.lang.String r2 = r0.A00
        L_0x03e4:
            r0 = 3
            X.JZA r9 = new X.JZA
            r9.<init>((java.lang.String) r2, (boolean) r3, (boolean) r7, (int) r0)
            goto L_0x051f
        L_0x03ec:
            boolean r1 = r0 instanceof X.C59702JUj
            if (r1 == 0) goto L_0x03f8
            r0 = 3
            X.JZA r9 = new X.JZA
            r9.<init>((java.lang.String) r2, (boolean) r7, (boolean) r3, (int) r0)
            goto L_0x051f
        L_0x03f8:
            boolean r1 = X.C59678JTj.A01(r7, r0)
            if (r1 == 0) goto L_0x0b80
            X.JTj r0 = (X.C59678JTj) r0
            java.lang.Object r1 = r0.A01
            java.lang.String r1 = (java.lang.String) r1
            r0 = 3
            X.JZA r9 = new X.JZA
            r9.<init>((java.lang.String) r1, (boolean) r7, (boolean) r7, (int) r0)
            goto L_0x051f
        L_0x040c:
            boolean r1 = X.AnonymousClass7TE.A1a(r0)
            java.lang.Object r0 = r6.A01
            X.UaL r0 = (X.C15314UaL) r0
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = r0.A05
            goto L_0x0421
        L_0x0417:
            boolean r1 = X.AnonymousClass7TE.A1a(r0)
            java.lang.Object r0 = r6.A01
            X.UaK r0 = (X.C15313UaK) r0
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = r0.A04
        L_0x0421:
            if (r0 == 0) goto L_0x0014
            r0.setPrimaryActionIsLoading(r1)
            goto L_0x0014
        L_0x0428:
            java.lang.Object r1 = r6.A01
            X.C51965G9l.A1W(r1, r0)
            goto L_0x0014
        L_0x042f:
            r5 = 22
            boolean r1 = X.ME3.A03(r5, r7)
            if (r1 == 0) goto L_0x0455
            r4 = r7
            X.ME3 r4 = (X.ME3) r4
            int r3 = r4.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x0455
            int r3 = r3 - r2
            r4.A00 = r3
        L_0x0445:
            java.lang.Object r2 = r4.A02
            X.1Hj r5 = X.1Hj.A02
            int r1 = r4.A00
            r3 = 1
            if (r1 == 0) goto L_0x045b
            if (r1 == r3) goto L_0x0a02
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0x()
            throw r1
        L_0x0455:
            X.ME3 r4 = new X.ME3
            r4.<init>(r6, r7, r5)
            goto L_0x0445
        L_0x045b:
            X.02o r6 = A01(r6, r2)
            X.MQ0 r0 = (X.MQ0) r0
            boolean r1 = X.C59678JTj.A01(r3, r0)
            if (r1 == 0) goto L_0x0473
            X.JTj r0 = (X.C59678JTj) r0
            java.lang.Object r0 = r0.A01
            X.371 r0 = (X.AnonymousClass371) r0
            java.lang.Object r9 = r0.FH3()
            goto L_0x051f
        L_0x0473:
            r9 = 0
            goto L_0x051f
        L_0x0476:
            java.lang.Object r4 = r6.A01
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            r2 = 0
            r1 = 47
            X.Pfo r3 = new X.Pfo
            r3.<init>(r0, r4, r2, r1)
        L_0x0482:
            X.07V r0 = r4.getLifecycle()
            java.lang.Object r5 = X.C346827vp.A00(r0, r7, r3)
        L_0x048a:
            X.1Hj r0 = X.1Hj.A02
            if (r5 != r0) goto L_0x0014
            return r5
        L_0x048f:
            r5 = 17
            boolean r1 = X.ME3.A03(r5, r7)
            if (r1 == 0) goto L_0x04b5
            r4 = r7
            X.ME3 r4 = (X.ME3) r4
            int r3 = r4.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x04b5
            int r3 = r3 - r2
            r4.A00 = r3
        L_0x04a5:
            java.lang.Object r2 = r4.A02
            X.1Hj r5 = X.1Hj.A02
            int r1 = r4.A00
            r3 = 1
            if (r1 == 0) goto L_0x04bb
            if (r1 == r3) goto L_0x0a02
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0x()
            throw r1
        L_0x04b5:
            X.ME3 r4 = new X.ME3
            r4.<init>(r6, r7, r5)
            goto L_0x04a5
        L_0x04bb:
            X.02o r6 = A01(r6, r2)
            X.3Ii r0 = (X.C239803Ii) r0
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x04d9
            X.3Ih r0 = (X.C239793Ih) r0
            java.lang.Object r0 = r0.A00
            X.CFO r0 = (X.CFO) r0
            com.google.common.collect.ImmutableList$Builder r1 = com.google.common.collect.ImmutableList.builder()
            java.util.List r0 = r0.A00
            r1.addAll(r0)
            com.google.common.collect.ImmutableList r9 = r1.build()
            goto L_0x051f
        L_0x04d9:
            com.google.common.collect.ImmutableList r9 = com.google.common.collect.ImmutableList.of()
            goto L_0x051f
        L_0x04de:
            java.lang.Object r1 = r6.A01
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r1 = (com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel) r1
            X.05G r1 = r1.A0J
            goto L_0x0953
        L_0x04e6:
            r5 = 16
            boolean r1 = X.ME3.A03(r5, r7)
            if (r1 == 0) goto L_0x050c
            r4 = r7
            X.ME3 r4 = (X.ME3) r4
            int r3 = r4.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x050c
            int r3 = r3 - r2
            r4.A00 = r3
        L_0x04fc:
            java.lang.Object r2 = r4.A02
            X.1Hj r5 = X.1Hj.A02
            int r1 = r4.A00
            r3 = 1
            if (r1 == 0) goto L_0x0512
            if (r1 == r3) goto L_0x0a02
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0x()
            throw r1
        L_0x050c:
            X.ME3 r4 = new X.ME3
            r4.<init>(r6, r7, r5)
            goto L_0x04fc
        L_0x0512:
            X.02o r6 = A01(r6, r2)
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            X.LM6 r9 = new X.LM6
            r9.<init>(r0)
        L_0x051f:
            r4.A00 = r3
            goto L_0x0ab8
        L_0x0523:
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r0.iterator()
        L_0x052d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0542
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.Juf r0 = (X.C60983Juf) r0
            boolean r0 = r0.A0G
            if (r0 == 0) goto L_0x052d
            r5.add(r1)
            goto L_0x052d
        L_0x0542:
            java.lang.Object r4 = r6.A01
            X.JWW r4 = (X.JWW) r4
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r5)
            java.util.Iterator r6 = r5.iterator()
        L_0x054e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x058f
            java.lang.Object r5 = r6.next()
            X.Juf r5 = (X.C60983Juf) r5
            int r0 = r5.A00
            java.lang.String r0 = java.lang.String.valueOf(r0)
            X.3Q2 r2 = X.AnonymousClass9T3.A02(r0)
            X.Jup r1 = r5.A08
            java.lang.String r8 = r1.A04
            r2.A3Z = r8
            X.Juq r0 = r5.A07
            java.lang.String r0 = r0.A03
            r2.A33 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.A02 = r0
            long r9 = r1.A03
            com.instagram.common.session.UserSession r7 = r4.A00
            r11 = r9
            com.instagram.pendingmedia.model.ClipInfo r1 = X.Q0X.A03(r7, r8, r9, r11)
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r2.A1N = r1
            r0 = 1
            r2.A5S = r0
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.IGTV
            r2.A0e(r0)
            r3.add(r2)
            goto L_0x054e
        L_0x058f:
            X.05G r1 = r4.A02
            X.JZ6 r0 = new X.JZ6
            r0.<init>(r3)
            r1.Epw(r0)
            goto L_0x0014
        L_0x059b:
            java.lang.Object r3 = r6.A01
            X.MYL r3 = (X.MYL) r3
            r2 = 34
            X.J6i r1 = new X.J6i
            r1.<init>(r0, r2)
            r3.A0R(r1)
            goto L_0x0014
        L_0x05ab:
            r4 = 34
            boolean r1 = X.C66136MDo.A01(r4, r7)
            if (r1 == 0) goto L_0x05d1
            r8 = r7
            X.MDo r8 = (X.C66136MDo) r8
            int r3 = r8.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x05d1
            int r3 = r3 - r2
            r8.A00 = r3
        L_0x05c1:
            java.lang.Object r2 = r8.A02
            X.1Hj r5 = X.1Hj.A02
            int r1 = r8.A00
            r4 = 1
            if (r1 == 0) goto L_0x0603
            if (r1 == r4) goto L_0x0a02
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0x()
            throw r1
        L_0x05d1:
            X.MDo r8 = new X.MDo
            r8.<init>(r6, r7, r4)
            goto L_0x05c1
        L_0x05d7:
            r4 = 33
            boolean r1 = X.C66136MDo.A01(r4, r7)
            if (r1 == 0) goto L_0x05fd
            r8 = r7
            X.MDo r8 = (X.C66136MDo) r8
            int r3 = r8.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x05fd
            int r3 = r3 - r2
            r8.A00 = r3
        L_0x05ed:
            java.lang.Object r2 = r8.A02
            X.1Hj r5 = X.1Hj.A02
            int r1 = r8.A00
            r4 = 1
            if (r1 == 0) goto L_0x0603
            if (r1 == r4) goto L_0x0a02
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0x()
            throw r1
        L_0x05fd:
            X.MDo r8 = new X.MDo
            r8.<init>(r6, r7, r4)
            goto L_0x05ed
        L_0x0603:
            X.02o r3 = A01(r6, r2)
            int r2 = X.AnonymousClass7TE.A0M(r0)
            r1 = -1
            if (r2 == r1) goto L_0x0014
            goto L_0x0690
        L_0x0610:
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = r6.A01
            X.JlH r1 = (X.C60424JlH) r1
            r1.A00(r0)
            goto L_0x0014
        L_0x061b:
            r5 = 25
            boolean r1 = X.C66136MDo.A01(r5, r7)
            if (r1 == 0) goto L_0x0641
            r4 = r7
            X.MDo r4 = (X.C66136MDo) r4
            int r3 = r4.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x0641
            int r3 = r3 - r2
            r4.A00 = r3
        L_0x0631:
            java.lang.Object r2 = r4.A02
            X.1Hj r5 = X.1Hj.A02
            int r1 = r4.A00
            r8 = 1
            if (r1 == 0) goto L_0x0a96
            if (r1 == r8) goto L_0x0a02
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0x()
            throw r1
        L_0x0641:
            X.MDo r4 = new X.MDo
            r4.<init>(r6, r7, r5)
            goto L_0x0631
        L_0x0647:
            boolean r0 = r0 instanceof X.C61916KRl
            if (r0 == 0) goto L_0x0b85
            java.lang.Object r0 = r6.A01
            android.content.Context r1 = X.DbT.A08(r0)
            r0 = 74
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.C59689JTv.A0B(r1, r0)
            goto L_0x0014
        L_0x065c:
            r4 = 21
            boolean r1 = X.C66136MDo.A01(r4, r7)
            if (r1 == 0) goto L_0x0682
            r8 = r7
            X.MDo r8 = (X.C66136MDo) r8
            int r3 = r8.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x0682
            int r3 = r3 - r2
            r8.A00 = r3
        L_0x0672:
            java.lang.Object r2 = r8.A02
            X.1Hj r5 = X.1Hj.A02
            int r1 = r8.A00
            r4 = 1
            if (r1 == 0) goto L_0x0688
            if (r1 == r4) goto L_0x0a02
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0x()
            throw r1
        L_0x0682:
            X.MDo r8 = new X.MDo
            r8.<init>(r6, r7, r4)
            goto L_0x0672
        L_0x0688:
            X.02o r3 = A01(r6, r2)
            boolean r1 = r0 instanceof X.C61910KRf
            if (r1 == 0) goto L_0x0014
        L_0x0690:
            r8.A00 = r4
            java.lang.Object r0 = r3.emit(r0, r8)
            goto L_0x0ad4
        L_0x0698:
            X.Kms r0 = (X.C62816Kms) r0
            java.lang.Object r5 = r6.A01
            X.Ubn r5 = (X.C15388Ubn) r5
            X.KRi r2 = X.C61913KRi.A00
            boolean r1 = X.0qQ.A0K(r0, r2)
            if (r1 != 0) goto L_0x06ad
            X.0hq r1 = r5.getParentFragmentManager()
            X.SQH.A01(r1)
        L_0x06ad:
            X.KRh r1 = X.C61912KRh.A00
            boolean r1 = X.0qQ.A0K(r0, r1)
            if (r1 == 0) goto L_0x06ba
            X.DbT.A1I(r5)
            goto L_0x0014
        L_0x06ba:
            boolean r1 = X.0qQ.A0K(r0, r2)
            if (r1 == 0) goto L_0x06c9
            X.0hq r0 = r5.getParentFragmentManager()
            X.SQH.A02(r0)
            goto L_0x0014
        L_0x06c9:
            X.KRg r1 = X.C61911KRg.A00
            boolean r1 = X.0qQ.A0K(r0, r1)
            r4 = 0
            if (r1 == 0) goto L_0x06d8
            r0 = 1
            X.C15388Ubn.A02(r5, r0, r4)
            goto L_0x0014
        L_0x06d8:
            boolean r1 = r0 instanceof X.C61914KRj
            r3 = 0
            if (r1 == 0) goto L_0x0b28
            android.content.Context r2 = r5.requireContext()
            X.KRj r0 = (X.C61914KRj) r0
            X.4Yx r0 = r0.A00
            if (r0 == 0) goto L_0x06eb
            java.lang.CharSequence r3 = X.C66909Mes.A01(r5, r0)
        L_0x06eb:
            r1 = 0
            X.C59689JTv.A03(r2, r3, r1, r4)
            X.0eM r0 = r5.A0B
            java.lang.Object r0 = r0.getValue()
            X.Jfh r0 = (X.C60101Jfh) r0
            X.05G r0 = r0.A09
            r0.Epw(r1)
            goto L_0x0014
        L_0x06fe:
            X.9IA r0 = (X.AnonymousClass9IA) r0
            boolean r0 = r0.A03
            java.lang.Object r3 = r6.A01
            X.A7D r3 = (X.A7D) r3
            if (r0 == 0) goto L_0x0737
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = r3.A02
            X.AnonymousClass7TF.A16(r0)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r2 = r3.A02
            if (r2 == 0) goto L_0x0721
            android.view.View r0 = r3.A04
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131956481(0x7f131301, float:1.9549519E38)
            java.lang.CharSequence r0 = r1.getText(r0)
            r2.setPrimaryActionText(r0)
        L_0x0721:
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r2 = r3.A02
            if (r2 == 0) goto L_0x0014
            android.view.View r0 = r3.A04
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131957531(0x7f13171b, float:1.9551649E38)
            java.lang.CharSequence r0 = r1.getText(r0)
            r2.setSecondaryActionText(r0)
            goto L_0x0014
        L_0x0737:
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = r3.A02
            X.AnonymousClass7TH.A0R(r0)
            goto L_0x0014
        L_0x073e:
            X.9IA r0 = (X.AnonymousClass9IA) r0
            boolean r1 = r0.A03
            java.lang.Object r2 = r6.A01
            X.A7D r2 = (X.A7D) r2
            com.instagram.user.follow.FollowButton r0 = r2.A03
            if (r1 == 0) goto L_0x075a
            r1 = 8
        L_0x074c:
            if (r0 == 0) goto L_0x0751
            r0.setVisibility(r1)
        L_0x0751:
            com.instagram.common.ui.base.IgView r0 = r2.A01
            if (r0 == 0) goto L_0x0014
            r0.setVisibility(r1)
            goto L_0x0014
        L_0x075a:
            r1 = 0
            goto L_0x074c
        L_0x075c:
            X.JtA r0 = (X.C60890JtA) r0
            java.lang.Object r1 = r6.A01
            X.JjT r1 = (X.C60324JjT) r1
            X.05G r2 = r1.A03
        L_0x0764:
            java.lang.Object r3 = r2.getValue()
            r1 = r3
            X.N4R r1 = (X.N4R) r1
            r6 = 0
            if (r0 == 0) goto L_0x0770
            java.lang.String r6 = r0.A02
        L_0x0770:
            r5 = 0
            if (r6 == 0) goto L_0x07b5
            boolean r4 = X.00l.A0W(r6)
            if (r4 != 0) goto L_0x07b5
            X.GKw r5 = new X.GKw
            r5.<init>(r6)
        L_0x077e:
            long r14 = r0.A00
            r8 = 2131976980(0x7f136314, float:1.9591096E38)
            r9 = 2131238472(0x7f081e48, float:1.8093224E38)
            java.lang.String r4 = r0.A03
            X.GKw r6 = X.JUH.A00(r4)
            r10 = 2131976964(0x7f136304, float:1.9591063E38)
            r11 = 2131964557(0x7f13328d, float:1.95659E38)
            r13 = 2131964884(0x7f1333d4, float:1.9566562E38)
            java.lang.Integer r7 = X.JTO.A0w(r13)
            r12 = 2131964554(0x7f13328a, float:1.9565893E38)
            X.Glz r4 = new X.Glz
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            java.util.List r4 = X.AnonymousClass7TE.A1I(r4)
            java.lang.Object r1 = r1.A02
            java.util.List r1 = (java.util.List) r1
            X.N4R r1 = X.N4R.A01(r4, r1)
            boolean r1 = r2.AIY(r3, r1)
            if (r1 == 0) goto L_0x0764
            goto L_0x0014
        L_0x07b5:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r4 = 2131972954(0x7f13535a, float:1.958293E38)
            X.GKO r5 = X.DbS.A0Q(r5, r4)
            goto L_0x077e
        L_0x07bf:
            java.lang.Object r5 = r6.A01
            X.3pa r5 = (X.C252733pa) r5
            X.4Cq r4 = r5.A01
            X.12T r0 = X.AnonymousClass12T.A00
            r3 = 0
            X.0nV r2 = X.DbX.A0c(r0)
            r1 = 48
            X.MHI r0 = new X.MHI
            r0.<init>((java.lang.Object) r5, (X.AnonymousClass4D7) r3, (int) r1)
            X.1Eo.A05(r2, r0, r4)
            goto L_0x0014
        L_0x07d8:
            X.Gmi r0 = (X.C53358Gmi) r0
            java.util.List r1 = r0.A05
            r0 = 3
            java.util.List r0 = X.00k.A0d(r1, r0)
            java.util.ArrayList r4 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x07e9:
            boolean r0 = r3.hasNext()
            r2 = 1
            if (r0 == 0) goto L_0x0803
            java.lang.Object r0 = r3.next()
            X.Gn4 r0 = (X.C53374Gn4) r0
            java.lang.String r2 = r0.A03
            java.lang.String r1 = r0.A04
            com.instagram.model.direct.DirectShareTarget r0 = new com.instagram.model.direct.DirectShareTarget
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)
            r4.add(r0)
            goto L_0x07e9
        L_0x0803:
            java.lang.Object r1 = r6.A01
            X.KX8 r1 = (X.KX8) r1
            boolean r0 = r4 instanceof java.util.List
            if (r0 == 0) goto L_0x0810
            X.05G r0 = r1.A02
            r0.Epw(r4)
        L_0x0810:
            X.05G r0 = r1.A01
            X.AnonymousClass7TF.A1O(r0, r2)
            goto L_0x0014
        L_0x0817:
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = r6.A01
            X.Ne7 r1 = (X.C69068Ne7) r1
            X.C69068Ne7.A01(r1, r0)
            X.05G r0 = r1.A0F
            X.JTR.A1V(r0)
            X.05G r0 = r1.A0E
            X.JTR.A1W(r0)
            goto L_0x0014
        L_0x082c:
            java.lang.Object r1 = r6.A01
            X.Ne7 r1 = (X.C69068Ne7) r1
            X.05G r1 = r1.A0G
            goto L_0x0953
        L_0x0834:
            java.lang.Object r1 = r6.A01
            X.Ne7 r1 = (X.C69068Ne7) r1
            X.05G r1 = r1.A0C
            goto L_0x0953
        L_0x083c:
            java.lang.Object r1 = r6.A01
            X.Ne7 r1 = (X.C69068Ne7) r1
            X.05G r1 = r1.A0D
            goto L_0x0953
        L_0x0844:
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Object r1 = r6.A01
            X.Ne7 r1 = (X.C69068Ne7) r1
            java.util.List r1 = r1.A09
            r1.clear()
            r1.addAll(r0)
            goto L_0x0014
        L_0x0854:
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Object r1 = r6.A01
            X.Ne7 r1 = (X.C69068Ne7) r1
            java.util.List r1 = r1.A0A
            r1.clear()
            r1.addAll(r0)
            goto L_0x0014
        L_0x0864:
            java.lang.Object r1 = r6.A01
            X.Ne7 r1 = (X.C69068Ne7) r1
            X.05G r1 = r1.A0E
            goto L_0x0953
        L_0x086c:
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = r6.A01
            X.Ne7 r1 = (X.C69068Ne7) r1
            X.C69068Ne7.A01(r1, r0)
            X.05G r0 = r1.A0F
            X.JTR.A1V(r0)
            goto L_0x0014
        L_0x087c:
            X.Gmi r0 = (X.C53358Gmi) r0
            java.util.List r1 = r0.A05
            r0 = 3
            java.util.List r0 = X.00k.A0d(r1, r0)
            java.util.ArrayList r4 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x088d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x08a6
            java.lang.Object r0 = r3.next()
            X.Gn4 r0 = (X.C53374Gn4) r0
            java.lang.String r2 = r0.A03
            java.lang.String r1 = r0.A04
            com.instagram.model.direct.DirectShareTarget r0 = new com.instagram.model.direct.DirectShareTarget
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)
            r4.add(r0)
            goto L_0x088d
        L_0x08a6:
            java.lang.Object r0 = r6.A01
            X.L2P r0 = (X.L2P) r0
            X.Lwq r1 = r0.A00
            r1.A01 = r4
            X.7fw r0 = r1.A00
            if (r0 == 0) goto L_0x0014
            r0.Dam(r1)
            goto L_0x0014
        L_0x08b7:
            r5 = 22
            boolean r1 = X.ME7.A02(r5, r7)
            if (r1 == 0) goto L_0x08dd
            r4 = r7
            X.ME7 r4 = (X.ME7) r4
            int r3 = r4.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x08dd
            int r3 = r3 - r2
            r4.A00 = r3
        L_0x08cd:
            java.lang.Object r2 = r4.A02
            X.1Hj r5 = X.1Hj.A02
            int r1 = r4.A00
            r3 = 1
            if (r1 == 0) goto L_0x0ac3
            if (r1 == r3) goto L_0x0a02
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0x()
            throw r1
        L_0x08dd:
            X.ME7 r4 = new X.ME7
            r4.<init>(r6, r7, r5)
            goto L_0x08cd
        L_0x08e3:
            java.lang.Object r0 = r6.A01
            java.lang.Object r0 = X.C51966G9m.A18(r0)
            X.DbS.A1U(r0)
            goto L_0x0014
        L_0x08ee:
            X.JwM r0 = (X.C61084JwM) r0
            java.lang.Object r1 = r6.A01
            X.Ggv r1 = (X.C53004Ggv) r1
            X.05G r5 = r1.A06
            java.lang.Object r4 = r0.A01
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r3 = r0.A00
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.lang.Object r2 = r0.A02
            java.util.List r2 = (java.util.List) r2
            r1 = 33
            X.JwM r0 = new X.JwM
            r0.<init>((java.lang.Integer) r4, (java.lang.Integer) r3, (java.util.List) r2, (int) r1)
            r5.Epw(r0)
            goto L_0x0014
        L_0x090e:
            java.lang.Object r1 = r6.A01
            X.MtP r1 = (X.C67710MtP) r1
            X.05G r1 = r1.A0B
            goto L_0x0953
        L_0x0915:
            java.lang.Object r1 = r6.A01
            X.MtP r1 = (X.C67710MtP) r1
            X.05G r1 = r1.A09
            goto L_0x0953
        L_0x091c:
            java.lang.Object r1 = r6.A01
            X.MtP r1 = (X.C67710MtP) r1
            X.05G r1 = r1.A08
            goto L_0x0953
        L_0x0923:
            java.lang.Object r1 = r6.A01
            X.MtP r1 = (X.C67710MtP) r1
            X.05G r1 = r1.A04
            goto L_0x0953
        L_0x092a:
            java.lang.Object r1 = r6.A01
            X.MtP r1 = (X.C67710MtP) r1
            X.05G r1 = r1.A03
            goto L_0x0953
        L_0x0931:
            java.lang.Object r1 = r6.A01
            X.MtP r1 = (X.C67710MtP) r1
            X.05G r1 = r1.A06
            goto L_0x0953
        L_0x0938:
            java.lang.Object r1 = r6.A01
            X.MtP r1 = (X.C67710MtP) r1
            X.05G r1 = r1.A05
            goto L_0x0953
        L_0x093f:
            java.lang.Object r1 = r6.A01
            X.MtP r1 = (X.C67710MtP) r1
            X.05G r1 = r1.A02
            goto L_0x0953
        L_0x0946:
            java.lang.Object r1 = r6.A01
            X.MtP r1 = (X.C67710MtP) r1
            X.05G r1 = r1.A07
            goto L_0x0953
        L_0x094d:
            java.lang.Object r1 = r6.A01
            X.MtP r1 = (X.C67710MtP) r1
            X.05G r1 = r1.A0A
        L_0x0953:
            r1.Epw(r0)
            goto L_0x0014
        L_0x0958:
            java.lang.Object r3 = r6.A01
            X.Ne0 r3 = (X.C69063Ne0) r3
            boolean r1 = r0 instanceof X.C59702JUj
            if (r1 != 0) goto L_0x0973
            r2 = 1
            boolean r1 = X.C59678JTj.A01(r2, r0)
            if (r1 == 0) goto L_0x0994
            X.05G r1 = r3.A03
            r1.Epw(r0)
            X.0gF r1 = X.C60340gF.A00
            X.JTj r0 = new X.JTj
            r0.<init>(r1, r2)
        L_0x0973:
            boolean r1 = r0 instanceof X.C59702JUj
            if (r1 != 0) goto L_0x0014
            boolean r1 = X.C59678JTj.A03(r0)
            if (r1 != 0) goto L_0x0014
            boolean r0 = X.C59678JTj.A02(r0)
            if (r0 == 0) goto L_0x0b8a
            X.OSj r2 = r3.A02
            java.lang.String r1 = "campaign_list_fetch_error"
            java.lang.String r0 = "error_message"
            java.util.Map r1 = X.AnonymousClass7TF.A0w(r0, r1)
            java.lang.String r0 = "igd_campaign_list_fetch_error"
            X.C70936OSj.A00(r2, r0, r1)
            goto L_0x0014
        L_0x0994:
            boolean r1 = X.C59678JTj.A02(r0)
            if (r1 != 0) goto L_0x0973
            X.Wub r1 = X.AnonymousClass7TE.A1K()
            throw r1
        L_0x099f:
            X.JwM r0 = (X.C61084JwM) r0
            if (r0 == 0) goto L_0x0014
            java.lang.Object r5 = r6.A01
            com.instagram.igds.components.actionbar.IgdsActionBar r5 = (com.instagram.igds.components.actionbar.IgdsActionBar) r5
            r3 = 1
            boolean r1 = com.facebook.systrace.Systrace.A0E(r3)
            if (r1 == 0) goto L_0x09b7
            r2 = 1874635379(0x6fbcaa73, float:1.1677848E29)
            java.lang.String r1 = "BindActionBar"
            X.0fS.A01(r1, r2)
        L_0x09b7:
            r5.A01(r0)     // Catch:{ all -> 0x09c8 }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r3)
            if (r0 == 0) goto L_0x0014
            r0 = -1466104832(0xffffffffa89d0400, float:-1.7432236E-14)
            X.0fS.A00(r0)
            goto L_0x0014
        L_0x09c8:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r3)
            if (r0 == 0) goto L_0x09fb
            r0 = 850554483(0x32b26e73, float:2.0772154E-8)
            X.0fS.A00(r0)
            throw r1
        L_0x09d6:
            r5 = 39
            boolean r1 = X.ME6.A02(r5, r7)
            if (r1 == 0) goto L_0x09fc
            r4 = r7
            X.ME6 r4 = (X.ME6) r4
            int r3 = r4.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x09fc
            int r3 = r3 - r2
            r4.A00 = r3
        L_0x09ec:
            java.lang.Object r2 = r4.A02
            X.1Hj r5 = X.1Hj.A02
            int r1 = r4.A00
            r3 = 1
            if (r1 == 0) goto L_0x0a07
            if (r1 == r3) goto L_0x0a02
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0x()
        L_0x09fb:
            throw r1
        L_0x09fc:
            X.ME6 r4 = new X.ME6
            r4.<init>(r6, r7, r5)
            goto L_0x09ec
        L_0x0a02:
            X.0eS.A00(r2)
            goto L_0x0014
        L_0x0a07:
            X.02o r6 = A01(r6, r2)
            java.util.Map r0 = (java.util.Map) r0
            boolean r12 = r0.isEmpty()
            java.lang.String r1 = "bootstrap_override_enabled"
            java.lang.Object r2 = r0.get(r1)
            boolean r1 = r2 instanceof java.lang.Boolean
            r7 = 0
            if (r1 == 0) goto L_0x0a83
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L_0x0a83
            boolean r13 = r2.booleanValue()
        L_0x0a24:
            java.lang.String r1 = "display_source_as_search_subtitle"
            java.lang.Object r2 = r0.get(r1)
            boolean r1 = r2 instanceof java.lang.Boolean
            if (r1 == 0) goto L_0x0a81
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L_0x0a81
            boolean r14 = r2.booleanValue()
        L_0x0a36:
            r1 = 1250(0x4e2, float:1.752E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            java.lang.Object r2 = r0.get(r1)
            boolean r1 = r2 instanceof java.lang.Integer
            if (r1 == 0) goto L_0x0a7f
            java.lang.Number r2 = (java.lang.Number) r2
        L_0x0a46:
            r11 = 3
            if (r2 == 0) goto L_0x0a7d
            int r10 = r2.intValue()
        L_0x0a4d:
            r1 = 1138(0x472, float:1.595E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            java.lang.Object r2 = r0.get(r1)
            boolean r1 = r2 instanceof java.lang.Integer
            if (r1 == 0) goto L_0x0a63
            java.lang.Number r2 = (java.lang.Number) r2
            if (r2 == 0) goto L_0x0a63
            int r11 = r2.intValue()
        L_0x0a63:
            java.lang.String r1 = "csm_override_enabled"
            java.lang.Object r1 = r0.get(r1)
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x0a7b
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L_0x0a7b
            boolean r15 = r1.booleanValue()
        L_0x0a75:
            X.UKV r9 = new X.UKV
            r9.<init>(r10, r11, r12, r13, r14, r15)
            goto L_0x0a93
        L_0x0a7b:
            r15 = 0
            goto L_0x0a75
        L_0x0a7d:
            r10 = 3
            goto L_0x0a4d
        L_0x0a7f:
            r2 = r7
            goto L_0x0a46
        L_0x0a81:
            r14 = 0
            goto L_0x0a36
        L_0x0a83:
            r13 = 0
            goto L_0x0a24
        L_0x0a85:
            X.02o r6 = A01(r6, r2)
            java.util.Map r0 = (java.util.Map) r0
            java.util.Collection r0 = r0.values()
            java.util.List r9 = X.00k.A0a(r0)
        L_0x0a93:
            r4.A00 = r3
            goto L_0x0ab8
        L_0x0a96:
            X.02o r6 = A01(r6, r2)
            X.3Q2 r0 = (X.AnonymousClass3Q2) r0
            r2 = 0
            if (r0 == 0) goto L_0x0ac0
            java.lang.String r7 = r0.A33
            X.3QD r1 = r0.A1f
        L_0x0aa3:
            X.3QD r3 = X.AnonymousClass3QD.CONFIGURED
            if (r1 != r3) goto L_0x0abd
            X.1Xj r2 = r0.A1C
        L_0x0aa9:
            X.3QD r0 = r0.A1f
            r1 = 1
            if (r0 != r3) goto L_0x0aaf
        L_0x0aae:
            r1 = 0
        L_0x0aaf:
            r0 = 13
            X.JwF r9 = new X.JwF
            r9.<init>((java.lang.Object) r2, (java.lang.String) r7, (int) r0, (boolean) r1)
            r4.A00 = r8
        L_0x0ab8:
            java.lang.Object r0 = r6.emit(r9, r4)
            goto L_0x0ad4
        L_0x0abd:
            if (r0 == 0) goto L_0x0aae
            goto L_0x0aa9
        L_0x0ac0:
            r7 = r2
            r1 = r2
            goto L_0x0aa3
        L_0x0ac3:
            X.02o r2 = A01(r6, r2)
            r1 = r0
            X.JwK r1 = (X.C61082JwK) r1
            boolean r1 = r1.A01
            if (r1 == 0) goto L_0x0014
            r4.A00 = r3
            java.lang.Object r0 = r2.emit(r0, r4)
        L_0x0ad4:
            if (r0 != r5) goto L_0x0014
            return r5
        L_0x0ad7:
            X.Kmr r0 = (X.C62815Kmr) r0
            java.lang.Object r3 = r6.A01
            X.E7N r3 = (X.E7N) r3
            boolean r1 = r0 instanceof X.KRb
            java.lang.String r2 = "spinner"
            if (r1 == 0) goto L_0x0b17
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r3.A00
            if (r1 == 0) goto L_0x0b3a
            X.JTO.A1X(r1)
            X.KRb r0 = (X.KRb) r0
            java.util.List r0 = r0.A00
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0af6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0b12
            com.instagram.user.model.User r8 = X.JTP.A0d(r1)
            java.lang.Integer r9 = X.AnonymousClass05K.A0C
            r5 = 0
            r11 = 0
            r12 = 1
            r10 = 1788(0x6fc, float:2.506E-42)
            X.N5z r4 = new X.N5z
            r6 = r5
            r7 = r5
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r2.add(r4)
            goto L_0x0af6
        L_0x0b12:
            r3.A0B(r2)
            goto L_0x0014
        L_0x0b17:
            X.KRc r1 = X.KRc.A00
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x0b94
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r3.A00
            if (r0 == 0) goto L_0x0b3a
            X.DbS.A1T(r0)
            goto L_0x0014
        L_0x0b28:
            boolean r1 = r0 instanceof X.C61915KRk
            if (r1 == 0) goto L_0x0b8f
            X.IaK r1 = r5.A08
            boolean r1 = r1.CJz()
            if (r1 == 0) goto L_0x0b45
            X.UdG r1 = r5.A01
            if (r1 != 0) goto L_0x0b42
            java.lang.String r2 = "adapter"
        L_0x0b3a:
            X.0qQ.A0F(r2)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x0b42:
            r1.A0C()
        L_0x0b45:
            X.2dZ r1 = r5.A00
            if (r1 != 0) goto L_0x0b4c
            java.lang.String r2 = "actionBarService"
            goto L_0x0b3a
        L_0x0b4c:
            X.KRk r0 = (X.C61915KRk) r0
            boolean r0 = r0.A01
            r1.ARb(r4, r0)
            r5.A04 = r0
            goto L_0x0014
        L_0x0b57:
            X.MQ0 r0 = (X.MQ0) r0
            java.lang.Object r5 = r6.A03(r0, r7)
            return r5
        L_0x0b5e:
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r5 = r6.A04(r0, r7)
            return r5
        L_0x0b65:
            X.MQ0 r0 = (X.MQ0) r0
            java.lang.Object r5 = r6.A02(r0, r7)
            return r5
        L_0x0b6c:
            X.Wub r1 = X.AnonymousClass7TE.A1K()
            throw r1
        L_0x0b71:
            X.Wub r1 = X.AnonymousClass7TE.A1K()
            throw r1
        L_0x0b76:
            X.Wub r1 = X.AnonymousClass7TE.A1K()
            throw r1
        L_0x0b7b:
            X.Wub r1 = X.AnonymousClass7TE.A1K()
            throw r1
        L_0x0b80:
            X.Wub r1 = X.AnonymousClass7TE.A1K()
            throw r1
        L_0x0b85:
            X.Wub r1 = X.AnonymousClass7TE.A1K()
            throw r1
        L_0x0b8a:
            X.Wub r1 = X.AnonymousClass7TE.A1K()
            throw r1
        L_0x0b8f:
            X.Wub r1 = X.AnonymousClass7TE.A1K()
            throw r1
        L_0x0b94:
            X.Wub r1 = X.AnonymousClass7TE.A1K()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MCm.emit(java.lang.Object, X.4D7):java.lang.Object");
    }

    public static 02o A01(MCm mCm, Object obj) {
        0eS.A00(obj);
        return (02o) mCm.A01;
    }
}
