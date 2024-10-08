package X;

/* renamed from: X.WHv  reason: case insensitive filesystem */
public final class C19043WHv implements AnonymousClass2Kv {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C19043WHv(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARNING: type inference failed for: r3v10, types: [X.V41, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v16, types: [X.V4K, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v41, types: [X.V3q, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v29, types: [java.lang.Object, X.1K2] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:205:0x04fd */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(X.AnonymousClass3JD r27) {
        /*
            r26 = this;
            r2 = r26
            int r0 = r2.A00
            r4 = r27
            switch(r0) {
                case 0: goto L_0x0532;
                case 1: goto L_0x0421;
                case 2: goto L_0x0185;
                case 3: goto L_0x00c0;
                case 4: goto L_0x001f;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r1 = r2.A01
            X.Ub9 r1 = (X.C15357Ub9) r1
            java.lang.Object r0 = r2.A02
            com.instagram.model.venue.Venue r0 = (com.instagram.model.venue.Venue) r0
            java.lang.String r0 = r0.A05()
            X.UXv r0 = X.VEV.A00(r4, r0)
            r1.A0F = r0
            X.C13990Tnq.A1L(r1)
        L_0x001e:
            return
        L_0x001f:
            if (r27 == 0) goto L_0x001e
            X.3lr r5 = X.C41845B3m.A0U(r4)
            if (r5 == 0) goto L_0x001e
            java.lang.Class<X.UQb> r4 = X.C15112UQb.class
            r3 = 0
            java.lang.String r1 = "xfb_live_location_sessions_for_thread_query(data:$data)"
            r0 = 1896830883(0x710f57a3, float:7.0979684E29)
            X.3lr r5 = r5.getOptionalTreeField(r3, r1, r4, r0)
            if (r5 == 0) goto L_0x001e
            java.lang.Class<X.UQa> r4 = X.C15111UQa.class
            java.lang.String r1 = "live_location_sessions"
            r0 = -1420324719(0xffffffffab579091, float:-7.658397E-13)
            com.google.common.collect.ImmutableList r1 = r5.getRequiredCompactedTreeListField(r3, r1, r4, r0)
            if (r1 == 0) goto L_0x001e
            java.util.concurrent.Executor r0 = X.C17145VJx.A00
            java.lang.Object r5 = r2.A02
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.Object r4 = r2.A01
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r10 = r1.iterator()
        L_0x0053:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x06b7
            java.lang.Object r1 = r10.next()
            X.3lr r1 = (X.C250663lr) r1
            java.lang.String r0 = "live_location_session_id"
            java.lang.String r9 = r1.A08(r0)
            com.google.common.util.concurrent.SettableFuture r2 = new com.google.common.util.concurrent.SettableFuture
            r2.<init>()
            if (r9 != 0) goto L_0x0070
            r0 = 0
            r2.set(r0)
        L_0x0070:
            r18 = 0
            X.2IS r8 = new X.2IS
            r8.<init>()
            X.2IS r7 = new X.2IS
            r7.<init>()
            X.0K0 r1 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r0 = "live_location_id"
            X.0Df r1 = X.C41845B3m.A03(r1, r9, r0)
            java.lang.String r0 = "data"
            X.1vR r12 = X.C41847B3o.A04(r1, r8, r0)
            java.util.Map r14 = r8.getParamsCopy()
            java.util.Map r15 = r7.getParamsCopy()
            java.lang.Class<X.Bov> r16 = X.C42979Bov.class
            java.util.ArrayList r22 = new java.util.ArrayList
            r22.<init>()
            java.lang.String r13 = "IGDirectLiveLocationSharerSampleEntityQuery"
            java.lang.String r21 = "xfb_ls_live_location_sharer_sample_entity_query"
            com.facebook.pando.PandoGraphQLRequest r11 = new com.facebook.pando.PandoGraphQLRequest
            r17 = r3
            r19 = r3
            r20 = r18
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.1vn r8 = X.1vm.A01(r5)
            r0 = 14
            X.DFg r7 = new X.DFg
            r7.<init>(r2, r0)
            r1 = 4
            X.WHf r0 = new X.WHf
            r0.<init>(r2, r1)
            r8.ATL(r0, r7, r11)
            r6.add(r2)
            goto L_0x0053
        L_0x00c0:
            r14 = 0
            if (r27 == 0) goto L_0x071f
            X.3lr r4 = X.C41845B3m.A0U(r4)
            if (r4 == 0) goto L_0x071f
            X.Uyd r1 = X.C16641Uyd.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r3 = 0
            java.lang.String r0 = "fetch_attribution_event_compliance_action(consent_type:\"OTHER_COMPANY_TRACKERS_ON_FOA\")"
            java.lang.Enum r4 = r4.getOptionalEnumField(r3, r0, r1)
            X.Uyd r4 = (X.C16641Uyd) r4
            if (r4 == 0) goto L_0x0720
            int r1 = r4.ordinal()
            r0 = 3
            if (r1 == r0) goto L_0x0181
            r0 = 2
            if (r1 == r0) goto L_0x017d
            r0 = 1
            if (r1 != r0) goto L_0x0720
            java.lang.Integer r7 = X.AnonymousClass05K.A0C
        L_0x00e5:
            java.lang.Object r1 = r2.A01
            X.VgN r1 = (X.C17810VgN) r1
            X.Vhh r5 = r1.A01
            X.Vyy r6 = r5.A04
            int r0 = r7.intValue()
            switch(r0) {
                case 0: goto L_0x0179;
                case 1: goto L_0x0175;
                default: goto L_0x00f4;
            }
        L_0x00f4:
            java.lang.String r2 = "BUFFER"
        L_0x00f6:
            java.util.List r4 = r1.A00
            java.lang.String r1 = "get_compliance_action_success"
            r0 = 2
            X.0qQ.A0B(r4, r0)
            java.lang.String r0 = X.C18724Vyy.A00(r1, r2, r14, r4)
            java.lang.String r2 = "info"
            X.C18724Vyy.A01(r0, r2, r6)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r7 != r0) goto L_0x0163
            r10 = 0
            X.F1d r0 = r5.A02
            java.lang.String r8 = r0.A00()
        L_0x0112:
            X.VRN r2 = r5.A01
            X.WtY r1 = new X.WtY
            r1.<init>(r4, r5)
            java.util.ArrayList r6 = X.AnonymousClass7TG.A0r(r4)
            java.util.Iterator r9 = r4.iterator()
        L_0x0121:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x06c6
            java.lang.Object r5 = r9.next()
            X.EVX r5 = (X.EVX) r5
            X.2IV r7 = new X.2IV
            r7.<init>()
            java.lang.String r0 = "adid"
            r7.A09(r8, r0)
            int r5 = X.DbU.A02(r5, r3)
            if (r5 == r3) goto L_0x0160
            r0 = 1
            if (r5 == r0) goto L_0x0159
            r0 = 4
            if (r5 == r0) goto L_0x0156
            r5 = 0
        L_0x0144:
            java.lang.String r0 = "event_name"
            r7.A09(r5, r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r10)
            java.lang.String r0 = "no_advertisement_id"
            r7.A08(r0, r5)
            r6.add(r7)
            goto L_0x0121
        L_0x0156:
            java.lang.String r5 = "RESURRECTION"
            goto L_0x0144
        L_0x0159:
            r0 = 4394(0x112a, float:6.157E-42)
            java.lang.String r5 = X.AnonymousClass000.A00(r0)
            goto L_0x0144
        L_0x0160:
            java.lang.String r5 = "LOGIN"
            goto L_0x0144
        L_0x0163:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r7 != r0) goto L_0x001e
            java.lang.String r1 = "buffer_events"
            java.lang.String r0 = "server_side"
            java.lang.String r0 = X.C18724Vyy.A00(r1, r0, r14, r4)
            X.C18724Vyy.A01(r0, r2, r6)
            r10 = 1
            r8 = 0
            goto L_0x0112
        L_0x0175:
            java.lang.String r2 = "IGNORE"
            goto L_0x00f6
        L_0x0179:
            java.lang.String r2 = "REPORT"
            goto L_0x00f6
        L_0x017d:
            java.lang.Integer r7 = X.AnonymousClass05K.A01
            goto L_0x00e5
        L_0x0181:
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            goto L_0x00e5
        L_0x0185:
            java.lang.Object r3 = r2.A02
            X.VXZ r3 = (X.VXZ) r3
            if (r27 == 0) goto L_0x0412
            java.lang.Object r9 = r4.Bny()
            if (r9 == 0) goto L_0x0412
            X.3ls r9 = (X.C250673ls) r9
            X.3lr r9 = (X.C250663lr) r9
            r13 = 0
            X.0qQ.A0B(r9, r13)
            java.lang.Class<X.UQI> r8 = X.UQI.class
            java.lang.String r6 = "xfb_messaging_acs_issue(config_id:$configId,message:$message,project_name:$projectName)"
            r5 = -1542067540(0xffffffffa415eaac, float:-3.2508E-17)
            X.3lr r0 = r9.A03(r8, r6, r5)
            if (r0 != 0) goto L_0x020b
            r7 = 0
        L_0x01a7:
            X.3lr r0 = r9.A03(r8, r6, r5)
            if (r0 != 0) goto L_0x01f8
            r6 = 0
        L_0x01ae:
            if (r7 == 0) goto L_0x03f9
            if (r6 == 0) goto L_0x03f9
            int r2 = r7.size()
            byte[][] r12 = new byte[r2][]
            r5 = 0
            r4 = 0
        L_0x01ba:
            int r0 = r7.size()
            r11 = 8
            if (r4 >= r0) goto L_0x021d
            java.lang.Object r1 = r7.get(r4)
            X.3ls r1 = (X.C250673ls) r1
            X.3lr r1 = (X.C250663lr) r1
            X.0qQ.A0B(r1, r13)
            java.lang.String r0 = "data"
            java.lang.String r8 = r1.getOptionalStringField(r13, r0)
            if (r8 == 0) goto L_0x01f5
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01eb }
            r1.<init>(r8)     // Catch:{ JSONException -> 0x01eb }
            java.lang.String r0 = "evaluation_data"
            java.lang.String r0 = r1.getString(r0)     // Catch:{ JSONException -> 0x01eb }
            byte[] r0 = r0.getBytes()     // Catch:{ JSONException -> 0x01eb }
            byte[] r0 = android.util.Base64.decode(r0, r11)     // Catch:{ JSONException -> 0x01eb }
            r12[r4] = r0     // Catch:{ JSONException -> 0x01eb }
            goto L_0x01f5
        L_0x01eb:
            byte[] r0 = r8.getBytes()
            byte[] r0 = android.util.Base64.decode(r0, r11)
            r12[r4] = r0
        L_0x01f5:
            int r4 = r4 + 1
            goto L_0x01ba
        L_0x01f8:
            X.3lr r5 = r9.A03(r8, r6, r5)
            if (r5 == 0) goto L_0x0408
            java.lang.Class<X.UQH> r4 = X.UQH.class
            r2 = 1
            java.lang.String r1 = "proof"
            r0 = -1888178776(0xffffffff8f74ada8, float:-1.2063574E-29)
            com.google.common.collect.ImmutableList r6 = r5.getRequiredCompactedTreeListField(r2, r1, r4, r0)
            goto L_0x01ae
        L_0x020b:
            X.3lr r4 = r9.A03(r8, r6, r5)
            if (r4 == 0) goto L_0x040d
            java.lang.Class<X.UQG> r2 = X.UQG.class
            java.lang.String r1 = "evaluation"
            r0 = -1781691225(0xffffffff95cd8ca7, float:-8.302075E-26)
            com.google.common.collect.ImmutableList r7 = r4.getRequiredCompactedTreeListField(r13, r1, r2, r0)
            goto L_0x01a7
        L_0x021d:
            r6.size()
        L_0x0220:
            int r0 = r6.size()
            if (r5 >= r0) goto L_0x026c
            java.lang.Object r1 = r6.get(r5)
            X.3ls r1 = (X.C250673ls) r1
            X.3lr r1 = (X.C250663lr) r1
            X.0qQ.A0B(r1, r13)
            java.lang.String r0 = "c"
            java.lang.String r4 = r1.getOptionalStringField(r13, r0)
            java.lang.Object r1 = r6.get(r5)
            X.3ls r1 = (X.C250673ls) r1
            X.3lr r1 = (X.C250663lr) r1
            X.0qQ.A0B(r1, r13)
            java.lang.String r0 = "s"
            java.lang.String r1 = r1.A08(r0)
            if (r4 == 0) goto L_0x025d
            if (r1 == 0) goto L_0x025d
            byte[] r0 = r4.getBytes()
            android.util.Base64.decode(r0, r11)
            byte[] r0 = r1.getBytes()
            android.util.Base64.decode(r0, r11)
            int r5 = r5 + 1
            goto L_0x0220
        L_0x025d:
            java.lang.String r0 = "Empty proofResult"
            java.lang.Throwable r1 = new java.lang.Throwable
            r1.<init>(r0)
            X.VXY r0 = r3.A00
            X.X5z r0 = r0.A01
            r0.onFailure(r1)
            return
        L_0x026c:
            X.VZ9 r1 = r3.A01
            java.lang.System.currentTimeMillis()
            X.V41 r10 = r3.A02
            java.util.ArrayList r0 = r3.A03
            r23 = r0
            X.VXY r9 = r3.A00
            X.X8I r14 = r1.A00     // Catch:{ V1h -> 0x03f2 }
            java.util.ArrayList r8 = X.Pxg.A14(r23)     // Catch:{ V1h -> 0x03f2 }
            int r0 = r23.size()     // Catch:{ V1h -> 0x03f2 }
            if (r2 != r0) goto L_0x03de
            r7 = 0
        L_0x0286:
            int r0 = r23.size()     // Catch:{ V1h -> 0x03f2 }
            if (r7 >= r0) goto L_0x0306
            r0 = r23
            java.lang.Object r6 = r0.get(r7)     // Catch:{ V1h -> 0x03f2 }
            X.V3d r6 = (X.C16720V3d) r6     // Catch:{ V1h -> 0x03f2 }
            if (r6 == 0) goto L_0x02fd
            byte[] r0 = r6.A01     // Catch:{ V1h -> 0x03f2 }
            if (r0 == 0) goto L_0x02fd
            byte[] r0 = r6.A00     // Catch:{ V1h -> 0x03f2 }
            if (r0 == 0) goto L_0x02fd
            r0 = r12[r7]     // Catch:{ V1h -> 0x03f2 }
            if (r0 == 0) goto L_0x02fd
            r20 = 0
            int r0 = r14.getCurveBytes()     // Catch:{ V1h -> 0x03f2 }
            byte[] r5 = new byte[r0]     // Catch:{ V1h -> 0x03f2 }
            byte[] r4 = r10.A06     // Catch:{ V1h -> 0x03f2 }
            byte[] r1 = r6.A01     // Catch:{ V1h -> 0x03f2 }
            byte[] r0 = r6.A00     // Catch:{ V1h -> 0x03f2 }
            r18 = r12[r7]     // Catch:{ V1h -> 0x03f2 }
            r17 = r0
            r19 = r13
            r21 = r20
            r22 = r5
            r15 = r4
            r16 = r1
            int r1 = r14.unblind(r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ V1h -> 0x03f2 }
            if (r1 != 0) goto L_0x03e6
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ V1h -> 0x03f2 }
            long r0 = r10.A04     // Catch:{ V1h -> 0x03f2 }
            long r2 = r2 + r0
            byte[] r15 = r6.A02     // Catch:{ V1h -> 0x03f2 }
            java.lang.String r0 = r10.A05     // Catch:{ V1h -> 0x03f2 }
            X.V3q r1 = new X.V3q     // Catch:{ V1h -> 0x03f2 }
            r1.<init>()     // Catch:{ V1h -> 0x03f2 }
            r1.A02 = r15     // Catch:{ V1h -> 0x03f2 }
            r1.A03 = r5     // Catch:{ V1h -> 0x03f2 }
            r1.A01 = r0     // Catch:{ V1h -> 0x03f2 }
            r1.A00 = r2     // Catch:{ V1h -> 0x03f2 }
            r8.add(r1)     // Catch:{ V1h -> 0x03f2 }
            android.util.Base64.encodeToString(r4, r11)     // Catch:{ V1h -> 0x03f2 }
            byte[] r0 = r1.A02     // Catch:{ V1h -> 0x03f2 }
            android.util.Base64.encodeToString(r0, r11)     // Catch:{ V1h -> 0x03f2 }
            byte[] r0 = r6.A00     // Catch:{ V1h -> 0x03f2 }
            android.util.Base64.encodeToString(r0, r11)     // Catch:{ V1h -> 0x03f2 }
            byte[] r0 = r6.A01     // Catch:{ V1h -> 0x03f2 }
            android.util.Base64.encodeToString(r0, r11)     // Catch:{ V1h -> 0x03f2 }
            r0 = r12[r7]     // Catch:{ V1h -> 0x03f2 }
            android.util.Base64.encodeToString(r0, r11)     // Catch:{ V1h -> 0x03f2 }
            byte[] r0 = r1.A03     // Catch:{ V1h -> 0x03f2 }
            android.util.Base64.encodeToString(r0, r11)     // Catch:{ V1h -> 0x03f2 }
            int r7 = r7 + 1
            goto L_0x0286
        L_0x02fd:
            java.lang.String r0 = "Token or its blinding factor or its blinded once or its signed blinded nonce is null."
            X.V1h r1 = new X.V1h     // Catch:{ V1h -> 0x03f2 }
            r1.<init>(r0)     // Catch:{ V1h -> 0x03f2 }
            goto L_0x03f1
        L_0x0306:
            java.util.ArrayList r2 = X.Pxg.A14(r8)     // Catch:{ V1h -> 0x03f2 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ V1h -> 0x03f2 }
        L_0x030e:
            boolean r0 = r8.hasNext()     // Catch:{ V1h -> 0x03f2 }
            if (r0 == 0) goto L_0x036d
            java.lang.Object r4 = r8.next()     // Catch:{ V1h -> 0x03f2 }
            X.V3q r4 = (X.C16733V3q) r4     // Catch:{ V1h -> 0x03f2 }
            if (r4 == 0) goto L_0x0364
            byte[] r7 = r4.A02     // Catch:{ V1h -> 0x03f2 }
            if (r7 == 0) goto L_0x0364
            byte[] r3 = r4.A03     // Catch:{ V1h -> 0x03f2 }
            if (r3 == 0) goto L_0x0364
            r0 = 64
            byte[] r6 = new byte[r0]     // Catch:{ V1h -> 0x03f2 }
            int r1 = r14.computeSharedSecret(r7, r3, r6)     // Catch:{ V1h -> 0x03f2 }
            if (r1 != 0) goto L_0x0357
            java.lang.String r5 = r4.A01     // Catch:{ V1h -> 0x03f2 }
            byte[] r0 = r10.A06     // Catch:{ V1h -> 0x03f2 }
            android.util.Base64.encodeToString(r0, r11)     // Catch:{ V1h -> 0x03f2 }
            android.util.Base64.encodeToString(r7, r11)     // Catch:{ V1h -> 0x03f2 }
            android.util.Base64.encodeToString(r3, r11)     // Catch:{ V1h -> 0x03f2 }
            android.util.Base64.encodeToString(r6, r11)     // Catch:{ V1h -> 0x03f2 }
            long r0 = r4.A00     // Catch:{ V1h -> 0x03f2 }
            int r4 = r10.A02     // Catch:{ V1h -> 0x03f2 }
            X.V4K r3 = new X.V4K     // Catch:{ V1h -> 0x03f2 }
            r3.<init>()     // Catch:{ V1h -> 0x03f2 }
            r3.A03 = r5     // Catch:{ V1h -> 0x03f2 }
            r3.A04 = r7     // Catch:{ V1h -> 0x03f2 }
            r3.A05 = r6     // Catch:{ V1h -> 0x03f2 }
            r3.A02 = r0     // Catch:{ V1h -> 0x03f2 }
            r3.A00 = r4     // Catch:{ V1h -> 0x03f2 }
            r3.A01 = r13     // Catch:{ V1h -> 0x03f2 }
            r2.add(r3)     // Catch:{ V1h -> 0x03f2 }
            goto L_0x030e
        L_0x0357:
            java.lang.String r0 = "VOPRF computeSharedSecret(...) returned error code: "
            java.lang.String r0 = X.002.A0O(r0, r1)     // Catch:{ V1h -> 0x03f2 }
            X.V1h r1 = new X.V1h     // Catch:{ V1h -> 0x03f2 }
            r1.<init>(r0)     // Catch:{ V1h -> 0x03f2 }
            goto L_0x03f1
        L_0x0364:
            java.lang.String r0 = "Server configuration or token or its fields used for shared secret derivation are null during getting a cached token."
            X.V1h r1 = new X.V1h     // Catch:{ V1h -> 0x03f2 }
            r1.<init>(r0)     // Catch:{ V1h -> 0x03f2 }
            goto L_0x03f1
        L_0x036d:
            X.VZ9 r6 = r9.A00
            X.V41 r4 = r9.A02
            byte[] r3 = r9.A03
            X.X5z r5 = r9.A01
            int r1 = r2.size()
            r0 = 1
            if (r1 >= r0) goto L_0x0387
            java.lang.String r1 = "No tokens received from ACS."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
        L_0x0383:
            r5.onFailure(r0)
            return
        L_0x0387:
            java.lang.Object r1 = r2.get(r13)
            X.V4K r1 = (X.V4K) r1
            java.lang.String r0 = r1.A03
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0397
            r0 = 1
            goto L_0x0399
        L_0x0397:
            int r0 = r4.A00
        L_0x0399:
            X.V40 r4 = X.VZ9.A00(r6, r1, r3, r0)     // Catch:{ V1h | IllegalStateException | InvalidKeyException | NoSuchAlgorithmException -> 0x03a8 }
            if (r4 == 0) goto L_0x03a0
            goto L_0x03aa
        L_0x03a0:
            java.lang.String r1 = "Redeemable token not generated."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ V1h | IllegalStateException | InvalidKeyException | NoSuchAlgorithmException -> 0x03a8 }
            r0.<init>(r1)     // Catch:{ V1h | IllegalStateException | InvalidKeyException | NoSuchAlgorithmException -> 0x03a8 }
            throw r0     // Catch:{ V1h | IllegalStateException | InvalidKeyException | NoSuchAlgorithmException -> 0x03a8 }
        L_0x03a8:
            r0 = move-exception
            goto L_0x0383
        L_0x03aa:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x03b3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x03cf
            java.lang.Object r1 = r2.next()
            X.V4K r1 = (X.V4K) r1
            boolean r0 = r1.A00()
            if (r0 == 0) goto L_0x03c9
            r3.add(r1)
            goto L_0x03b3
        L_0x03c9:
            X.W2O r0 = r6.A02
            r0.A05(r1)
            goto L_0x03b3
        L_0x03cf:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x03da
            X.W2O r0 = r6.A02
            r0.A06(r3)
        L_0x03da:
            r5.DoF(r4)
            return
        L_0x03de:
            java.lang.String r0 = "Number of signatures do not match number of credentials requested."
            X.V1h r1 = new X.V1h     // Catch:{ V1h -> 0x03f2 }
            r1.<init>(r0)     // Catch:{ V1h -> 0x03f2 }
            goto L_0x03f1
        L_0x03e6:
            java.lang.String r0 = "VOPRF unblind(...) returned error code: "
            java.lang.String r0 = X.002.A0O(r0, r1)     // Catch:{ V1h -> 0x03f2 }
            X.V1h r1 = new X.V1h     // Catch:{ V1h -> 0x03f2 }
            r1.<init>(r0)     // Catch:{ V1h -> 0x03f2 }
        L_0x03f1:
            throw r1     // Catch:{ V1h -> 0x03f2 }
        L_0x03f2:
            r1 = move-exception
            X.X5z r0 = r9.A01
            r0.onFailure(r1)
            return
        L_0x03f9:
            java.lang.String r0 = "Empty AcsIssueQuery response body"
            java.lang.Throwable r1 = new java.lang.Throwable
            r1.<init>(r0)
            X.VXY r0 = r3.A00
            X.X5z r0 = r0.A01
            r0.onFailure(r1)
            return
        L_0x0408:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x040d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0412:
            java.lang.String r0 = "Empty AcsIssueQuery Response"
            java.lang.Throwable r1 = new java.lang.Throwable
            r1.<init>(r0)
            X.VXY r0 = r3.A00
            X.X5z r0 = r0.A01
            r0.onFailure(r1)
            return
        L_0x0421:
            java.lang.Object r8 = r2.A02
            X.VQv r8 = (X.C17316VQv) r8
            if (r27 != 0) goto L_0x0436
            java.lang.String r0 = "Empty ACS Config Result"
            java.lang.Throwable r1 = new java.lang.Throwable
            r1.<init>(r0)
            X.VgW r0 = r8.A00
            X.X5z r0 = r0.A01
            r0.onFailure(r1)
            return
        L_0x0436:
            java.lang.Object r3 = r4.Bny()
            X.3ls r3 = (X.C250673ls) r3
            if (r3 != 0) goto L_0x044d
            java.lang.String r0 = "Empty ACS Config Response"
            java.lang.Throwable r1 = new java.lang.Throwable
            r1.<init>(r0)
            X.VgW r0 = r8.A00
            X.X5z r0 = r0.A01
            r0.onFailure(r1)
            return
        L_0x044d:
            X.3lr r3 = (X.C250663lr) r3
            r10 = 0
            X.0qQ.A0B(r3, r10)
            java.lang.Class<X.UQE> r2 = X.UQE.class
            java.lang.String r1 = "acs_config(project_name:$projectName)"
            r0 = 2004947533(0x7781124d, float:5.2357616E33)
            X.3lr r3 = r3.getOptionalTreeField(r10, r1, r2, r0)
            if (r3 == 0) goto L_0x051c
            java.lang.String r4 = "id"
            java.lang.String r0 = r3.getOptionalStringField(r10, r4)
            if (r0 == 0) goto L_0x051c
            java.lang.String r9 = "cipher_suite"
            boolean r0 = r3.hasFieldValue(r9)
            if (r0 == 0) goto L_0x051c
            java.lang.String r2 = "public_key"
            java.lang.String r0 = r3.A09(r2)
            if (r0 == 0) goto L_0x051c
            java.lang.String r7 = "max_evals"
            boolean r0 = r3.hasFieldValue(r7)
            if (r0 == 0) goto L_0x051c
            java.lang.String r6 = "redemption_limit"
            boolean r0 = r3.hasFieldValue(r6)
            if (r0 == 0) goto L_0x051c
            java.lang.String r5 = "expire_time"
            java.lang.String r0 = r3.A0C(r5)
            if (r0 == 0) goto L_0x051c
            java.lang.String r1 = "token_ttl"
            boolean r0 = r3.hasFieldValue(r1)
            if (r0 == 0) goto L_0x051c
            java.lang.String r12 = r3.getOptionalStringField(r10, r4)
            java.lang.String r4 = "Required value was null."
            if (r12 == 0) goto L_0x0516
            r0 = 1
            int r11 = r3.getCoercedIntField(r0, r9)
            java.lang.String r2 = r3.A09(r2)
            if (r2 == 0) goto L_0x0510
            java.nio.charset.Charset r0 = X.AnonymousClass15Q.A05
            byte[] r2 = X.Pxf.A1V(r2, r0)
            r0 = 8
            byte[] r10 = android.util.Base64.decode(r2, r0)
            r0 = 3
            int r9 = r3.getCoercedIntField(r0, r7)
            r0 = 4
            int r2 = r3.getCoercedIntField(r0, r6)
            java.lang.String r0 = r3.A0C(r5)
            if (r0 == 0) goto L_0x050a
            long r6 = java.lang.Long.parseLong(r0)
            r4 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r4
            r0 = 6
            int r0 = r3.getCoercedIntField(r0, r1)
            long r0 = (long) r0
            long r4 = r4 * r0
            X.V41 r3 = new X.V41
            r3.<init>()
            r3.A05 = r12
            r3.A00 = r11
            r3.A06 = r10
            r3.A01 = r9
            r3.A02 = r2
            r3.A03 = r6
            r3.A04 = r4
            X.VZ9 r0 = r8.A01
            java.lang.System.currentTimeMillis()
            X.W2O r2 = r0.A02
            monitor-enter(r2)
            java.util.HashMap r1 = X.W2O.A00(r2)     // Catch:{ JSONException -> 0x04fd }
            java.lang.String r0 = r3.A05     // Catch:{ JSONException -> 0x04fd }
            r1.put(r0, r3)     // Catch:{ JSONException -> 0x04fd }
            X.W2O.A02(r2, r1)     // Catch:{ JSONException -> 0x04fd }
            goto L_0x0500
        L_0x04fd:
            r2.A04()     // Catch:{ all -> 0x0507 }
        L_0x0500:
            monitor-exit(r2)
            X.VgW r0 = r8.A00
            r0.A00(r3)
            return
        L_0x0507:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x050a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x0510:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x0516:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x051c:
            java.lang.String r1 = "IGDirectACSConfigFetcher"
            java.lang.String r0 = "Failed to fetch required ACS Server Config fields."
            X.0KC.A0C(r1, r0)
            java.lang.String r0 = "Empty ACS Server Config"
            java.lang.Throwable r1 = new java.lang.Throwable
            r1.<init>(r0)
            X.VgW r0 = r8.A00
            X.X5z r0 = r0.A01
            r0.onFailure(r1)
            return
        L_0x0532:
            if (r27 != 0) goto L_0x0543
            java.lang.Object r2 = r2.A01
            X.X5y r2 = (X.X5y) r2
            java.lang.String r1 = "Empty OHAI Config Result"
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>(r1)
            r2.onFailure(r0)
            return
        L_0x0543:
            java.lang.Object r8 = r4.Bny()
            X.3ls r8 = (X.C250673ls) r8
            if (r8 != 0) goto L_0x055a
            java.lang.Object r2 = r2.A01
            X.X5y r2 = (X.X5y) r2
            java.lang.String r1 = "Empty OHAI Config Response"
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>(r1)
            r2.onFailure(r0)
            return
        L_0x055a:
            java.lang.Object r5 = r2.A02
            X.Vh4 r5 = (X.C17851Vh4) r5
            X.3lr r8 = (X.C250663lr) r8
            r4 = 0
            X.0qQ.A0B(r8, r4)
            java.lang.Class<X.UQL> r7 = X.UQL.class
            java.lang.String r6 = "xfb_ohai_configurations"
            r1 = 1035517138(0x3db8bcd2, float:0.090203896)
            X.3lr r0 = r8.getOptionalTreeField(r4, r6, r7, r1)
            if (r0 != 0) goto L_0x0588
            X.0sn r1 = X.0sn.A00
        L_0x0573:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0632
            java.lang.Object r2 = r2.A01
            X.X5y r2 = (X.X5y) r2
            java.lang.String r1 = "No OHAI Configs returned from server"
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>(r1)
            r2.onFailure(r0)
            return
        L_0x0588:
            com.google.common.collect.ImmutableList$Builder r3 = new com.google.common.collect.ImmutableList$Builder
            r3.<init>()
            X.3lr r8 = r8.getOptionalTreeField(r4, r6, r7, r1)
            java.lang.String r1 = "Required value was null."
            if (r8 == 0) goto L_0x06b1
            java.lang.Class<X.UQK> r7 = X.UQK.class
            java.lang.String r6 = "ohai_configs"
            r0 = 354115122(0x151b5e32, float:3.1376308E-26)
            com.google.common.collect.ImmutableList r0 = r8.getRequiredCompactedTreeListField(r4, r6, r7, r0)
            X.3kO r15 = X.C66580MXl.A0J(r0)
        L_0x05a4:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0629
            java.lang.Object r8 = r15.next()
            X.3lr r8 = (X.C250663lr) r8
            java.lang.String r14 = "key_id"
            boolean r0 = r8.hasFieldValue(r14)
            if (r0 == 0) goto L_0x0620
            java.lang.String r13 = "public_key"
            java.lang.String r0 = r8.A08(r13)
            if (r0 == 0) goto L_0x0620
            java.lang.String r12 = "kem_id"
            boolean r0 = r8.hasFieldValue(r12)
            if (r0 == 0) goto L_0x0620
            java.lang.String r11 = "kdf_id"
            boolean r0 = r8.hasFieldValue(r11)
            if (r0 == 0) goto L_0x0620
            java.lang.String r10 = "aead_id"
            boolean r0 = r8.hasFieldValue(r10)
            if (r0 == 0) goto L_0x0620
            java.lang.String r9 = "expiration_date"
            java.lang.String r0 = r8.A0C(r9)
            if (r0 == 0) goto L_0x0620
            r7 = 6
            java.lang.String r6 = "last_updated_time"
            java.lang.String r0 = r8.getOptionalStringField(r7, r6)
            if (r0 == 0) goto L_0x0620
            int r18 = r8.getCoercedIntField(r4, r14)
            java.lang.String r17 = r8.A08(r13)
            if (r17 == 0) goto L_0x06ab
            int r19 = r8.A00(r12)
            r0 = 3
            int r20 = r8.getCoercedIntField(r0, r11)
            r0 = 4
            int r21 = r8.getCoercedIntField(r0, r10)
            java.lang.String r0 = r8.A0C(r9)
            if (r0 == 0) goto L_0x06a5
            long r22 = java.lang.Long.parseLong(r0)
            java.lang.String r0 = r8.getOptionalStringField(r7, r6)
            if (r0 == 0) goto L_0x069f
            long r24 = java.lang.Long.parseLong(r0)
            com.facebook.ohai.ohaiconfigprovider.base.OHAIConfig r0 = new com.facebook.ohai.ohaiconfigprovider.base.OHAIConfig
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r24)
            r3.add(r0)
            goto L_0x05a4
        L_0x0620:
            java.lang.String r6 = "IGDirectOHAIConfigFetcher"
            java.lang.String r0 = "Missing required fields in OHAI Config"
            X.0KC.A0C(r6, r0)
            goto L_0x05a4
        L_0x0629:
            com.google.common.collect.ImmutableList r1 = r3.build()
            X.0qQ.A07(r1)
            goto L_0x0573
        L_0x0632:
            java.lang.Object r3 = r1.get(r4)
            r6 = 1
            java.util.List r0 = X.00k.A0c(r1, r6)
            java.util.Iterator r10 = r0.iterator()
        L_0x063f:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0658
            java.lang.Object r9 = r10.next()
            com.facebook.ohai.ohaiconfigprovider.base.OHAIConfig r9 = (com.facebook.ohai.ohaiconfigprovider.base.OHAIConfig) r9
            long r7 = r9.A04
            r0 = r3
            com.facebook.ohai.ohaiconfigprovider.base.OHAIConfig r0 = (com.facebook.ohai.ohaiconfigprovider.base.OHAIConfig) r0
            long r0 = r0.A04
            int r4 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x063f
            r3 = r9
            goto L_0x063f
        L_0x0658:
            r4 = r3
            com.facebook.ohai.ohaiconfigprovider.base.OHAIConfig r4 = (com.facebook.ohai.ohaiconfigprovider.base.OHAIConfig) r4
            long r7 = r4.A04
            r0 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r0
            long r9 = java.lang.System.currentTimeMillis()
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x0677
            java.lang.Object r2 = r2.A01
            X.X5y r2 = (X.X5y) r2
            java.lang.String r1 = "Latest OHAI Config is already expired"
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>(r1)
            r2.onFailure(r0)
            return
        L_0x0677:
            X.3mC r1 = X.C250863mB.A03
            X.Wsk r0 = X.C20504Wsk.A00
            java.lang.String r3 = r1.A02(r3, r0)
            X.1Uk r0 = r5.A00
            X.1W3 r1 = r0.AR0()
            java.lang.String r0 = "ohai_config"
            r1.A09(r0, r3)
            boolean r0 = r1.A0B()
            if (r0 != 0) goto L_0x0697
            java.lang.String r1 = "OHAIConfigFetcherBase"
            java.lang.String r0 = "Failed to write OHAI Config to local storage"
            X.0KC.A0C(r1, r0)
        L_0x0697:
            java.lang.Object r0 = r2.A01
            X.X5y r0 = (X.X5y) r0
            r0.DoE(r4, r6)
            return
        L_0x069f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x06a5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x06ab:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x06b1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x06b7:
            X.MmO r2 = X.C255183ti.A00(r6)
            X.WMs r1 = new X.WMs
            r1.<init>(r4, r3)
            java.util.concurrent.Executor r0 = X.C17145VJx.A00
            X.C255183ti.A04(r1, r2, r0)
            return
        L_0x06c6:
            X.QNI r7 = new X.QNI
            r7.<init>()
            java.lang.String r0 = "events"
            r7.A05(r0, r6)
            java.lang.String r5 = X.AnonymousClass7TF.A0b()
            java.lang.String r0 = "client_mutation_id"
            r7.A07(r5, r0)
            com.instagram.common.session.UserSession r0 = r2.A00
            java.lang.String r5 = r0.A06
            java.lang.String r0 = "actor_id"
            r7.A07(r5, r0)
            X.2IS r6 = new X.2IS
            r6.<init>()
            X.2IS r5 = new X.2IS
            r5.<init>()
            java.lang.String r0 = "input"
            X.1vR r8 = X.JTP.A0L(r7, r6, r0)
            java.util.Map r10 = r6.getParamsCopy()
            java.util.Map r11 = r5.getParamsCopy()
            java.lang.Class<com.instagram.attribution.ReportAttributionEventsMutationResponseImpl> r12 = com.instagram.attribution.ReportAttributionEventsMutationResponseImpl.class
            java.util.ArrayList r18 = new java.util.ArrayList
            r18.<init>()
            java.lang.String r9 = "ReportAttributionEventsMutation"
            r13 = 1
            r15 = 96
            java.lang.String r17 = "report_attribution_events"
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r16 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.1vn r6 = r2.A01
            X.WHs r5 = new X.WHs
            r5.<init>(r1, r13)
            X.DFB r0 = new X.DFB
            r0.<init>((int) r3, (java.lang.Object) r1, (java.lang.Object) r4, (java.lang.Object) r2)
            r6.ATL(r0, r5, r7)
            return
        L_0x071f:
            r4 = r14
        L_0x0720:
            r0 = 673(0x2a1, float:9.43E-43)
            java.lang.String r1 = X.C66579MXk.A00(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Unsupported compliance action: "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r4, r3, r0)
            X.0wb.A03(r1, r0)
            java.lang.Object r1 = r2.A01
            X.VgN r1 = (X.C17810VgN) r1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r4, r3, r0)
            r1.A00(r0, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19043WHv.invoke(X.3JD):void");
    }
}
