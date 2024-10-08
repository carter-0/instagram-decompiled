package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.WPd  reason: case insensitive filesystem */
public final class C19197WPd implements AnonymousClass0iw {
    public static final String __redex_internal_original_name = "DirectLocationSharingLogger";
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final 0wc A03;
    public final String A04;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f0, code lost:
        r2.AAJ(r0, r1);
        r2.Cgf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f6, code lost:
        r7.A01 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0130, code lost:
        X.DbS.A1J(r2, r0);
        r2.AAJ(com.facebook.proxygen.TraceFieldType.Duration, com.instagram.realtimeclient.RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        r2.Cgf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x013d, code lost:
        r7.A00 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0140, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0144, code lost:
        r7.A02 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0146, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(java.lang.String r8) {
        /*
            r7 = this;
            r0 = 2
            X.0qQ.A0B(r8, r0)
            java.lang.String r1 = "action="
            r3 = 0
            boolean r0 = X.00l.A0d(r8, r1, r3)
            if (r0 == 0) goto L_0x0039
            java.lang.String r1 = X.00l.A0K(r8, r1, r8)
            java.lang.String r0 = " "
            java.lang.String r6 = X.00l.A0L(r1, r0, r1)
            r0 = 9
            java.lang.Integer[] r5 = X.AnonymousClass05K.A00(r0)
            int r4 = r5.length
            r2 = 0
        L_0x001f:
            if (r2 >= r4) goto L_0x0039
            r1 = r5[r2]
            int r0 = r1.intValue()
            switch(r0) {
                case 1: goto L_0x005f;
                case 2: goto L_0x0062;
                case 3: goto L_0x0065;
                case 4: goto L_0x0068;
                case 5: goto L_0x006b;
                case 6: goto L_0x006e;
                case 7: goto L_0x0071;
                case 8: goto L_0x0074;
                default: goto L_0x002a;
            }
        L_0x002a:
            java.lang.String r0 = "POINTS_OF_INTEREST_SELECTED"
        L_0x002c:
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x005c
            int r0 = r1.intValue()
            switch(r0) {
                case 0: goto L_0x0141;
                case 1: goto L_0x0143;
                case 2: goto L_0x0077;
                case 3: goto L_0x0098;
                case 4: goto L_0x003a;
                case 5: goto L_0x00b9;
                case 6: goto L_0x00d7;
                case 7: goto L_0x00f9;
                case 8: goto L_0x0115;
                default: goto L_0x0039;
            }
        L_0x0039:
            return
        L_0x003a:
            boolean r0 = r7.A01
            if (r0 == 0) goto L_0x0039
            X.0wc r1 = r7.A03
            java.lang.String r0 = "direct_location_pin"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0039
            java.lang.String r1 = r7.A04
            java.lang.String r0 = "open_thread_id"
            r2.AAJ(r0, r1)
            java.lang.String r0 = "drag"
            X.DbS.A1J(r2, r0)
            r2.Cgf()
            return
        L_0x005c:
            int r2 = r2 + 1
            goto L_0x001f
        L_0x005f:
            java.lang.String r0 = "POINTS_OF_INTEREST_UPDATED"
            goto L_0x002c
        L_0x0062:
            java.lang.String r0 = "LOADED"
            goto L_0x002c
        L_0x0065:
            java.lang.String r0 = "PIN_DRAGGING_STARTED"
            goto L_0x002c
        L_0x0068:
            java.lang.String r0 = "MAP_MOVED"
            goto L_0x002c
        L_0x006b:
            java.lang.String r0 = "PIN_DRAGGING_STOPPED"
            goto L_0x002c
        L_0x006e:
            java.lang.String r0 = "PIN_ADDRESS_SHARED"
            goto L_0x002c
        L_0x0071:
            java.lang.String r0 = "LIVE_LOCATION_STARTED"
            goto L_0x002c
        L_0x0074:
            java.lang.String r0 = "LIVE_LOCATION_STOPPED"
            goto L_0x002c
        L_0x0077:
            boolean r0 = r7.A02
            if (r0 == 0) goto L_0x0095
            X.0wc r1 = r7.A03
            java.lang.String r0 = "direct_location_static_share"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0095
            java.lang.String r1 = r7.A04
            java.lang.String r0 = "open_thread_id"
            r2.AAJ(r0, r1)
            java.lang.String r0 = "search_bar"
            X.DbV.A1J(r2, r0)
        L_0x0095:
            r7.A02 = r3
            return
        L_0x0098:
            X.0wc r1 = r7.A03
            java.lang.String r0 = "direct_location_pin"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x00b5
            java.lang.String r1 = r7.A04
            java.lang.String r0 = "open_thread_id"
            r2.AAJ(r0, r1)
            java.lang.String r0 = "tap"
            X.DbS.A1J(r2, r0)
            r2.Cgf()
        L_0x00b5:
            r0 = 1
            r7.A01 = r0
            return
        L_0x00b9:
            boolean r0 = r7.A02
            if (r0 != 0) goto L_0x00f6
            X.0wc r1 = r7.A03
            java.lang.String r0 = "direct_location_pin"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x00f6
            java.lang.String r1 = r7.A04
            java.lang.String r0 = "open_thread_id"
            r2.AAJ(r0, r1)
            java.lang.String r1 = "cancel"
            java.lang.String r0 = "action"
            goto L_0x00f0
        L_0x00d7:
            X.0wc r1 = r7.A03
            java.lang.String r0 = "direct_location_static_share"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x00f6
            java.lang.String r1 = r7.A04
            java.lang.String r0 = "open_thread_id"
            r2.AAJ(r0, r1)
            java.lang.String r1 = "pinned"
            java.lang.String r0 = "entry_point"
        L_0x00f0:
            r2.AAJ(r0, r1)
            r2.Cgf()
        L_0x00f6:
            r7.A01 = r3
            return
        L_0x00f9:
            boolean r0 = r7.A00
            if (r0 == 0) goto L_0x013d
            X.0wc r1 = r7.A03
            java.lang.String r0 = "direct_location_live_share"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x013d
            java.lang.String r1 = r7.A04
            java.lang.String r0 = "open_thread_id"
            r2.AAJ(r0, r1)
            java.lang.String r0 = "start"
            goto L_0x0130
        L_0x0115:
            boolean r0 = r7.A00
            if (r0 == 0) goto L_0x013d
            X.0wc r1 = r7.A03
            java.lang.String r0 = "direct_location_live_share"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x013d
            java.lang.String r1 = r7.A04
            java.lang.String r0 = "open_thread_id"
            r2.AAJ(r0, r1)
            java.lang.String r0 = "stop"
        L_0x0130:
            X.DbS.A1J(r2, r0)
            java.lang.String r1 = "1"
            java.lang.String r0 = "duration"
            r2.AAJ(r0, r1)
            r2.Cgf()
        L_0x013d:
            r0 = 1
            r7.A00 = r0
            return
        L_0x0141:
            r0 = 1
            goto L_0x0144
        L_0x0143:
            r0 = 0
        L_0x0144:
            r7.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19197WPd.A00(java.lang.String):void");
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public C19197WPd(UserSession userSession, String str) {
        this.A03 = AnonymousClass0kN.A01(this, userSession);
        this.A04 = str == null ? "" : str;
    }
}
