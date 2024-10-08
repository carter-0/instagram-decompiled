package X;

/* renamed from: X.74c  reason: invalid class name and case insensitive filesystem */
public final class C3257774c implements AnonymousClass786 {
    public final C333517Zg A00;
    public final C330707Nw A01;
    public final C332297Uk A02;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Long} */
    /* JADX WARNING: type inference failed for: r6v4, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FHO(X.AnonymousClass9I5 r11) {
        /*
            r10 = this;
            boolean r0 = r11.A01
            if (r0 == 0) goto L_0x003b
            r6 = 0
            X.7Uk r8 = r10.A02
            com.instagram.common.session.UserSession r7 = r8.A04
            X.4kA r0 = X.AnonymousClass4k9.A00(r7)
            X.0xa r0 = r0.A00
            java.lang.String r4 = "direct_shh_mode_emoji_rain_seen_count"
            int r1 = r0.getInt(r4, r6)
            r0 = 7
            if (r1 > r0) goto L_0x010d
            X.7Nn r0 = r8.A02
            if (r0 == 0) goto L_0x001f
            r0.setVisibility(r6)
        L_0x001f:
            X.Acb r5 = new X.Acb
            r5.<init>(r8)
            int r2 = 10 - r1
            long r0 = X.C18372VqY.A00
            X.VRy r3 = new X.VRy
            r3.<init>(r2, r0)
            X.7Nj r2 = r8.A01
            if (r2 != 0) goto L_0x00ed
            java.lang.String r0 = "emitterAnimationCanvasRenderer"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x003b:
            X.7Zg r0 = r10.A00
            X.7S7 r5 = r0.C6l()
            X.3t3 r4 = r5.CBU()
            X.3t0 r3 = r5.BN3()
            r2 = 1
            r1 = 0
            if (r3 == 0) goto L_0x00e2
            X.7ZA r0 = r0.C62()
            r0.FHN(r3, r1, r2, r1)
            if (r4 == 0) goto L_0x0130
        L_0x0056:
            X.7Nw r9 = r10.A01
            int r0 = r11.A00
            if (r0 != 0) goto L_0x00de
            X.7Vi r3 = X.C332517Vi.A04
        L_0x005e:
            X.3t0 r2 = r5.BN3()
            r1 = 0
            r6 = 0
            boolean r8 = r4 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            if (r8 == 0) goto L_0x00d9
            com.instagram.model.direct.threadkey.impl.MsysThreadId r0 = X.C300965yF.A04(r4)
            if (r0 == 0) goto L_0x0074
            long r0 = r0.A00
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x0074:
            if (r2 == 0) goto L_0x007a
            java.lang.String r6 = X.C300965yF.A07(r2)
        L_0x007a:
            r7 = r6
            r6 = r1
        L_0x007c:
            X.0sa r0 = r9.A01
            java.lang.Object r1 = r0.invoke()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x00d7
            r0 = 10
            java.lang.Long r4 = X.00y.A0n(r0, r1)
        L_0x008c:
            java.lang.Integer r5 = r3.A00
            java.lang.Integer r3 = r3.A01
            X.0wc r2 = r9.A00
            java.lang.String r1 = "direct_shh_mode_exit"
            X.0kJ r0 = r2.A00
            X.0Aj r2 = r2.A00(r0, r1)
            int r0 = r5.intValue()
            int r0 = 1 - r0
            if (r0 == 0) goto L_0x00d4
            java.lang.String r1 = "SWIPE"
        L_0x00a4:
            java.lang.String r0 = "action"
            r2.AAJ(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)
            java.lang.String r0 = "is_e2ee"
            r2.A7p(r0, r1)
            java.lang.String r0 = "open_thread_id"
            r2.AAJ(r0, r7)
            r0 = 568(0x238, float:7.96E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A9F(r0, r6)
            java.lang.String r0 = "recipient_id"
            r2.A9F(r0, r4)
            if (r3 == 0) goto L_0x00d2
            java.lang.String r1 = "MESSAGE"
        L_0x00c9:
            java.lang.String r0 = "entry_point"
            r2.AAJ(r0, r1)
            r2.Cgf()
            return
        L_0x00d2:
            r1 = 0
            goto L_0x00c9
        L_0x00d4:
            java.lang.String r1 = "TAP"
            goto L_0x00a4
        L_0x00d7:
            r4 = 0
            goto L_0x008c
        L_0x00d9:
            java.lang.String r7 = X.C300965yF.A07(r4)
            goto L_0x007c
        L_0x00de:
            X.7Vi r3 = X.C332517Vi.A05
            goto L_0x005e
        L_0x00e2:
            if (r4 == 0) goto L_0x0130
            X.7ZA r0 = r0.C62()
            r0.FHN(r4, r1, r1, r1)
            goto L_0x0056
        L_0x00ed:
            X.WVV r1 = new X.WVV
            r1.<init>(r5, r8)
            java.lang.String r0 = "🤫"
            X.C395139zH.A00(r2, r3, r1, r0)
            X.4kA r0 = X.AnonymousClass4k9.A00(r7)
            X.0xa r0 = r0.A00
            X.0xY r1 = r0.AR4()
            int r0 = r0.getInt(r4, r6)
            int r0 = r0 + 1
            r1.E5Z(r4, r0)
            r1.apply()
        L_0x010d:
            X.7Zg r5 = r10.A00
            X.7S7 r4 = r5.C6l()
            X.3t3 r3 = r4.CBU()
            if (r3 == 0) goto L_0x0130
            X.7Nw r2 = r10.A01
            int r0 = r11.A00
            if (r0 != 0) goto L_0x0131
            X.7Vi r1 = X.C332517Vi.A04
        L_0x0121:
            X.3t0 r0 = r4.BN3()
            r2.A00(r1, r0, r3)
            X.7ZA r1 = r5.C62()
            r0 = 1
            r1.FHN(r3, r0, r6, r6)
        L_0x0130:
            return
        L_0x0131:
            X.7Vi r1 = X.C332517Vi.A05
            goto L_0x0121
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3257774c.FHO(X.9I5):void");
    }

    public C3257774c(C333517Zg r1, C330707Nw r2, C332297Uk r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }
}
