package X;

/* renamed from: X.8k2  reason: invalid class name and case insensitive filesystem */
public final class C363608k2 implements AnonymousClass8k3 {
    public final /* synthetic */ C363268jR A00;
    public final /* synthetic */ AnonymousClass8k0 A01;

    public C363608k2(C363268jR r1, AnonymousClass8k0 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void DED() {
        this.A01.DEc("FbUnifiedConfigCrossPostingSettingDataProvider - Fetch failed");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: X.5p3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: X.5p3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: X.5p3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: X.3lr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: X.5p3} */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0063, code lost:
        if (r4.getCoercedBooleanField(1, "is_auto_crosspost_enabled") != true) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ac, code lost:
        if (r5.getCoercedBooleanField(1, "is_auto_crosspost_enabled") != true) goto L_0x00ae;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DoU(X.C363628k5 r10) {
        /*
            r9 = this;
            X.8jR r7 = r9.A00
            X.5p1 r6 = X.C295855p1.FB
            if (r10 == 0) goto L_0x011d
            java.lang.Class<X.5p2> r3 = X.C295865p2.class
            r2 = 0
            java.lang.String r1 = "xcxp_unified_crossposting_configs_root(configs_request:$configs_request)"
            r0 = 144118627(0x8971363, float:9.09254E-34)
            X.3lr r4 = r10.getOptionalTreeField(r2, r1, r3, r0)
        L_0x0012:
            r8 = 0
            if (r4 == 0) goto L_0x0042
            java.lang.Class<X.5p3> r3 = X.C295875p3.class
            r2 = 0
            java.lang.String r1 = "account_linking_configs"
            r0 = -1116170300(0xffffffffbd7897c4, float:-0.06069161)
            com.google.common.collect.ImmutableList r0 = r4.getRequiredCompactedTreeListField(r2, r1, r3, r0)
            if (r0 == 0) goto L_0x0042
            java.util.Iterator r5 = r0.iterator()
        L_0x0027:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0040
            java.lang.Object r4 = r5.next()
            r3 = r4
            X.3lr r3 = (X.C250663lr) r3
            X.5p1 r2 = X.C295855p1.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r1 = 2
            java.lang.String r0 = "destination_app"
            java.lang.Enum r0 = r3.getOptionalEnumField(r1, r0, r2)
            if (r0 != r6) goto L_0x0027
            r8 = r4
        L_0x0040:
            X.5p3 r8 = (X.C295875p3) r8
        L_0x0042:
            X.0eM r3 = r7.A02
            java.lang.Object r0 = r3.getValue()
            X.1Av r0 = (X.1Av) r0
            X.0xa r1 = r0.A01
            java.lang.String r5 = "auto_cross_post_to_facebook_feed"
            r0 = 0
            boolean r2 = r1.getBoolean(r5, r0)
            X.5p6 r0 = X.C295905p6.FEED
            X.5p7 r4 = X.C363268jR.A00(r0, r8)
            r6 = 1
            if (r4 == 0) goto L_0x0065
            java.lang.String r0 = "is_auto_crosspost_enabled"
            boolean r0 = r4.getCoercedBooleanField(r6, r0)
            r1 = 1
            if (r0 == r6) goto L_0x0066
        L_0x0065:
            r1 = 0
        L_0x0066:
            java.lang.Object r0 = r3.getValue()
            X.1Av r0 = (X.1Av) r0
            X.0xa r0 = r0.A01
            X.0xY r0 = r0.AR4()
            r0.E5T(r5, r1)
            r0.apply()
            if (r2 == r1) goto L_0x0085
            X.0eM r0 = r7.A01
            java.lang.Object r0 = r0.getValue()
            X.2D6 r0 = (X.2D6) r0
            r0.A04(r1)
        L_0x0085:
            java.lang.Object r5 = r3.getValue()
            X.1Av r5 = (X.1Av) r5
            X.0s0 r2 = r5.A1B
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 132(0x84, float:1.85E-43)
            r0 = r1[r0]
            java.lang.Object r0 = r2.CDM(r5, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r2 = r0.booleanValue()
            X.5p6 r0 = X.C295905p6.STORY
            X.5p7 r5 = X.C363268jR.A00(r0, r8)
            if (r5 == 0) goto L_0x00ae
            java.lang.String r0 = "is_auto_crosspost_enabled"
            boolean r0 = r5.getCoercedBooleanField(r6, r0)
            r1 = 1
            if (r0 == r6) goto L_0x00af
        L_0x00ae:
            r1 = 0
        L_0x00af:
            java.lang.Object r0 = r3.getValue()
            X.1Av r0 = (X.1Av) r0
            r0.A1L(r1)
            if (r2 == r1) goto L_0x00c5
            X.0eM r0 = r7.A01
            java.lang.Object r0 = r0.getValue()
            X.2D6 r0 = (X.2D6) r0
            r0.A05(r1)
        L_0x00c5:
            X.5p6 r0 = X.C295905p6.REELS
            X.5p7 r2 = X.C363268jR.A00(r0, r8)
            X.0eM r0 = r7.A01
            java.lang.Object r1 = r0.getValue()
            X.2D6 r1 = (X.2D6) r1
            if (r2 == 0) goto L_0x011b
            java.lang.String r0 = "is_auto_crosspost_enabled"
            boolean r0 = r2.getCoercedBooleanField(r6, r0)
            if (r0 != r6) goto L_0x011b
        L_0x00dd:
            r1.A09(r6)
            if (r5 == 0) goto L_0x00fd
            r1 = 2
            java.lang.String r0 = "auto_crosspost_setting_timestamp"
            int r2 = r5.getCoercedIntField(r1, r0)
            java.lang.Object r0 = r3.getValue()
            X.1Av r0 = (X.1Av) r0
            X.0xa r0 = r0.A01
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "xpost_to_facebook_story_server_mtime_in_second"
            r1.E5Z(r0, r2)
            r1.apply()
        L_0x00fd:
            if (r4 == 0) goto L_0x011a
            r1 = 2
            java.lang.String r0 = "auto_crosspost_setting_timestamp"
            int r2 = r4.getCoercedIntField(r1, r0)
            java.lang.Object r0 = r3.getValue()
            X.1Av r0 = (X.1Av) r0
            X.0xa r0 = r0.A01
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "xpost_to_facebook_feed_server_mtime_in_second"
            r1.E5Z(r0, r2)
            r1.apply()
        L_0x011a:
            return
        L_0x011b:
            r6 = 0
            goto L_0x00dd
        L_0x011d:
            r4 = 0
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C363608k2.DoU(X.8k5):void");
    }
}
