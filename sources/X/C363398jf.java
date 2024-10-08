package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.8jf  reason: invalid class name and case insensitive filesystem */
public final class C363398jf {
    public final UserSession A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0121, code lost:
        if (r14 != null) goto L_0x0125;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C299935wF A00(com.facebook.common.callercontext.CallerContext r22) {
        /*
            r21 = this;
            r4 = r21
            X.0eM r2 = r4.A02
            java.lang.Object r0 = r2.getValue()
            X.8jg r0 = (X.C363408jg) r0
            java.lang.String r7 = "ig_android_service_cache_crossposting_setting"
            java.lang.String r10 = "CROSS_POSTING_SETTING"
            X.8ji r1 = r0.A00
            java.util.List r0 = java.util.Collections.singletonList(r10)
            X.0qQ.A07(r0)
            r3 = r22
            java.util.Map r0 = r1.A00(r3, r7, r0)
            java.lang.Object r0 = r0.get(r10)
            java.util.List r0 = (java.util.List) r0
            r14 = 0
            if (r0 == 0) goto L_0x0076
            java.lang.Object r0 = X.00k.A0J(r0)
            X.8jm r0 = (X.C363468jm) r0
            if (r0 == 0) goto L_0x0076
            java.util.List r0 = r0.A01
            if (r0 == 0) goto L_0x0076
            java.lang.Object r6 = X.00k.A0J(r0)
            X.8jo r6 = (X.C363488jo) r6
            if (r6 == 0) goto L_0x0077
            java.lang.String r5 = r6.A01
        L_0x003c:
            java.lang.Object r0 = r2.getValue()
            X.8jg r0 = (X.C363408jg) r0
            java.util.List r9 = java.util.Collections.singletonList(r10)
            X.0qQ.A07(r9)
            X.8ji r2 = r0.A00
            boolean r0 = r2.A07()
            if (r0 == 0) goto L_0x00a8
            boolean r0 = r2.A08(r3, r7)
            if (r0 == 0) goto L_0x00a8
            java.util.Map r0 = r2.A00
            if (r0 == 0) goto L_0x00a8
            r2.A06(r9)
            X.1wg r1 = r2.A04
            java.lang.String r0 = r3.A02
            X.0qQ.A07(r0)
            r1.A03(r7, r0, r9)
            java.util.Map r0 = r2.A00
            if (r0 != 0) goto L_0x0079
            java.lang.String r0 = "customServiceObjectData"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0076:
            r6 = r14
        L_0x0077:
            r5 = r14
            goto L_0x003c
        L_0x0079:
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r7 = r0.iterator()
        L_0x0086:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00ac
            java.lang.Object r2 = r7.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r0 = r2.getKey()
            boolean r0 = r9.contains(r0)
            if (r0 == 0) goto L_0x0086
            java.lang.Object r1 = r2.getKey()
            java.lang.Object r0 = r2.getValue()
            r8.put(r1, r0)
            goto L_0x0086
        L_0x00a8:
            X.0sm r8 = X.0Yt.A0E()
        L_0x00ac:
            java.lang.Object r7 = r8.get(r10)
            X.3lr r7 = (X.C250663lr) r7
            if (r7 == 0) goto L_0x019e
            java.lang.Class<X.5wG> r2 = X.C299945wG.class
            r9 = 1
            java.lang.String r1 = "CrossPostingCustomClientServiceData"
            r0 = 356624974(0x1541aa4e, float:3.9110386E-26)
            X.3lr r10 = r7.reinterpretIfFulfillsType(r9, r1, r2, r0)
            X.5wG r10 = (X.C299945wG) r10
            if (r10 == 0) goto L_0x019f
            java.lang.Class<X.613> r8 = X.AnonymousClass613.class
            r2 = 0
            java.lang.String r1 = "destination_metadata_service_data"
            r0 = -1470166025(0xffffffffa85f0bf7, float:-1.2381581E-14)
            X.3lr r7 = r10.getOptionalTreeField(r2, r1, r8, r0)
            X.3lr r1 = r10.getOptionalTreeField(r2, r1, r8, r0)
            if (r1 == 0) goto L_0x01a0
            java.lang.String r0 = "destination_profile_url_link"
            java.lang.String r15 = r1.getOptionalStringField(r9, r0)
        L_0x00dc:
            java.lang.String r17 = ""
            if (r15 != 0) goto L_0x00e2
            r15 = r17
        L_0x00e2:
            if (r6 == 0) goto L_0x019a
            java.util.List r2 = r6.A03
        L_0x00e6:
            java.lang.String r0 = "FB_PAGE"
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 == 0) goto L_0x0108
            java.lang.String r13 = r6.A00
            if (r7 == 0) goto L_0x00fa
            java.lang.String r0 = "destination_name"
            java.lang.String r14 = r7.A07(r0)
            if (r14 != 0) goto L_0x00fc
        L_0x00fa:
            r14 = r17
        L_0x00fc:
            java.lang.Integer r11 = X.AnonymousClass05K.A0N
        L_0x00fe:
            java.lang.Integer r12 = X.AnonymousClass05K.A01
            X.5wF r9 = new X.5wF
            r16 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            return r9
        L_0x0108:
            java.lang.String r0 = "FB_USER"
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 == 0) goto L_0x0130
            java.lang.String r13 = r6.A02
            int r0 = r13.length()
            if (r0 <= 0) goto L_0x0130
            if (r7 == 0) goto L_0x0123
            r1 = 0
            java.lang.String r0 = "destination_name"
            java.lang.String r14 = r7.getOptionalStringField(r1, r0)
        L_0x0121:
            if (r14 != 0) goto L_0x0125
        L_0x0123:
            r14 = r17
        L_0x0125:
            java.lang.Integer r11 = X.AnonymousClass05K.A01
            X.5wF r9 = new X.5wF
            r12 = r11
            r16 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            return r9
        L_0x0130:
            java.lang.String r0 = "FB_ADDITIONAL_PROFILE"
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 == 0) goto L_0x0150
            java.lang.String r13 = r6.A02
            int r0 = r13.length()
            if (r0 <= 0) goto L_0x0150
            if (r7 == 0) goto L_0x014b
            r1 = 0
            java.lang.String r0 = "destination_name"
            java.lang.String r14 = r7.getOptionalStringField(r1, r0)
            if (r14 != 0) goto L_0x014d
        L_0x014b:
            r14 = r17
        L_0x014d:
            java.lang.Integer r11 = X.AnonymousClass05K.A0C
            goto L_0x00fe
        L_0x0150:
            com.instagram.common.session.UserSession r6 = r4.A00
            X.0Tu r5 = X.0Tu.A05
            r0 = 36330466931917452(0x81125e0000428c, double:3.0388718065682395E-306)
            boolean r0 = X.182.A06(r5, r6, r0)
            if (r0 == 0) goto L_0x0170
            java.lang.Integer r16 = X.AnonymousClass05K.A01
            java.lang.Integer r15 = X.AnonymousClass05K.A00
            X.0sn r20 = X.0sn.A00
            X.5wF r9 = new X.5wF
            r13 = r9
            r18 = r17
            r19 = r17
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            return r9
        L_0x0170:
            X.0eM r0 = r4.A01
            java.lang.Object r1 = r0.getValue()
            X.2Ly r1 = (X.2Ly) r1
            java.lang.String r0 = "ig_android_linking_cache_ig_to_fb_crossposting_eligibility_check"
            fxcache.model.FxCalAccount r0 = r1.A01(r3, r0)
            if (r0 != 0) goto L_0x0191
            java.lang.Integer r16 = X.AnonymousClass05K.A01
            java.lang.Integer r15 = X.AnonymousClass05K.A00
            X.0sn r20 = X.0sn.A00
            X.5wF r9 = new X.5wF
            r13 = r9
            r18 = r17
            r19 = r17
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            return r9
        L_0x0191:
            java.lang.String r13 = r0.A07
            if (r13 != 0) goto L_0x0197
            r13 = r17
        L_0x0197:
            java.lang.String r14 = r0.A06
            goto L_0x0121
        L_0x019a:
            X.0sn r2 = X.0sn.A00
            goto L_0x00e6
        L_0x019e:
            r10 = r14
        L_0x019f:
            r7 = r14
        L_0x01a0:
            r15 = r14
            goto L_0x00dc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C363398jf.A00(com.facebook.common.callercontext.CallerContext):X.5wF");
    }

    public C363398jf(UserSession userSession) {
        this.A00 = userSession;
        0eO r2 = 0eO.A02;
        this.A01 = AnonymousClass0eN.A00(r2, new AnonymousClass9L5(this, 26));
        this.A02 = AnonymousClass0eN.A00(r2, new AnonymousClass9L5(this, 27));
    }
}
