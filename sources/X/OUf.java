package X;

public final class OUf {
    public static final OUf A00 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02ac, code lost:
        if (r10 == null) goto L_0x01f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x043e, code lost:
        if (r0 == false) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009d, code lost:
        if (r0 == false) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x011a, code lost:
        if (((X.1bp) r4).A03() == null) goto L_0x011c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(com.instagram.common.session.UserSession r22, X.1OS r23, com.instagram.model.direct.DirectThreadKey r24, int r25) {
        /*
            r21 = this;
            r4 = r23
            r18 = 0
            r7 = 1
            boolean r6 = r4 instanceof X.1bp
            if (r6 == 0) goto L_0x0463
            r0 = r4
            X.1bp r0 = (X.1bp) r0
            java.lang.String r9 = r0.A06()
        L_0x0010:
            if (r9 != 0) goto L_0x0019
            java.lang.String r1 = "ArmadilloExpressSendLogger"
            java.lang.String r0 = "Empty offlineThreadingId for the thread."
            X.0KC.A0C(r1, r0)
        L_0x0019:
            r0 = 2654(0xa5e, float:3.719E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            r10 = r22
            X.0wc r1 = X.DbW.A0J(r10, r2)
            java.lang.String r0 = "message_sends_client"
            X.0Aj r8 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r8.isSampled()
            if (r0 == 0) goto L_0x021b
            java.lang.String[] r0 = new java.lang.String[]{r2}
            java.util.ArrayList r5 = X.0sr.A1M(r0)
            X.MaY r0 = r4.A02
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x0044
            java.lang.String r0 = "vanish_mode"
            r5.add(r0)
        L_0x0044:
            java.lang.String r0 = r4.A02()
            r5.add(r0)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            X.MaY r0 = r4.A02
            X.ODs r0 = r0.A00
            r1 = 0
            if (r0 == 0) goto L_0x0460
            X.Nkj r11 = r0.A00
        L_0x005a:
            X.Nkj r0 = X.C69405Nkj.DISAPPEARING_MESSAGE
            if (r11 != r0) goto L_0x006d
            r3 = 3
            X.Nmi r0 = X.C69500Nmi.A04
            r2.add(r0)
            boolean r0 = r4 instanceof X.C65481cr
            if (r0 == 0) goto L_0x0442
            X.Nmi r0 = X.C69500Nmi.A0D
            r2.add(r0)
        L_0x006d:
            boolean r13 = r4 instanceof X.AnonymousClass1fu
            if (r13 == 0) goto L_0x00a0
            X.Nmi r0 = X.C69500Nmi.A0B
            r2.add(r0)
            r0 = r4
            X.1fu r0 = (X.AnonymousClass1fu) r0
            X.9cJ r0 = r0.A07()
            if (r0 == 0) goto L_0x009f
            java.lang.String r3 = r0.A06
            if (r3 == 0) goto L_0x009f
            int r11 = r3.hashCode()
            r0 = -1212837439(0xffffffffb7b591c1, float:-2.1644753E-5)
            if (r11 == r0) goto L_0x009f
            r0 = 3415681(0x341e81, float:4.786389E-39)
            if (r11 == r0) goto L_0x0437
            r0 = 668488878(0x27d854ae, float:6.0043853E-15)
            if (r11 != r0) goto L_0x009f
            java.lang.String r0 = "permanent"
            boolean r0 = r3.equals(r0)
            r3 = 0
            if (r0 != 0) goto L_0x00a0
        L_0x009f:
            r3 = 2
        L_0x00a0:
            boolean r14 = r4 instanceof X.1jN
            if (r14 == 0) goto L_0x00b9
            X.Nmi r0 = X.C69500Nmi.A02
            r2.add(r0)
            r0 = r4
            X.1jN r0 = (X.1jN) r0
            X.6o8 r0 = r0.A02
            if (r0 == 0) goto L_0x00b9
            int r0 = r0.A0C
            if (r0 <= r7) goto L_0x00b9
            X.Nmi r0 = X.C69500Nmi.A0C
            r2.add(r0)
        L_0x00b9:
            boolean r12 = r4 instanceof X.1cE
            if (r12 == 0) goto L_0x00dc
            r0 = r4
            X.1cE r0 = (X.1cE) r0
            X.OKm r11 = r0.A02
            if (r11 == 0) goto L_0x00dc
            X.Nmi r0 = X.C69500Nmi.A0A
            r2.add(r0)
            X.5FY r0 = r11.A00()
            X.5FV r0 = r0.A00
            if (r0 != 0) goto L_0x00d3
            X.5FV r0 = X.AnonymousClass5FV.None
        L_0x00d3:
            boolean r0 = r0.A01
            if (r0 != r7) goto L_0x00dc
            X.Nmi r0 = X.C69500Nmi.A02
            r2.add(r0)
        L_0x00dc:
            boolean r11 = r4 instanceof X.C65481cr
            if (r11 == 0) goto L_0x00f1
            r0 = r4
            X.1cr r0 = (X.C65481cr) r0
            java.lang.String r0 = r0.A08
            if (r0 == 0) goto L_0x00f1
            X.Nmi r0 = X.C69500Nmi.A0D
            r2.add(r0)
            X.Nmi r0 = X.C69500Nmi.A02
            r2.add(r0)
        L_0x00f1:
            r20 = r24
            r0 = r20
            X.3U9 r15 = X.C66582MXn.A0a(r10, r0)
            if (r15 == 0) goto L_0x0106
            boolean r0 = r15.A0M()
            if (r0 == 0) goto L_0x041d
            X.Nmi r0 = X.C69500Nmi.A06
            r2.add(r0)
        L_0x0106:
            boolean r0 = r4 instanceof X.C66241l9
            if (r0 == 0) goto L_0x010f
            X.Nmi r10 = X.C69500Nmi.A09
            r2.add(r10)
        L_0x010f:
            if (r6 == 0) goto L_0x011c
            r6 = r4
            X.1bp r6 = (X.1bp) r6
            X.3tI r6 = r6.A03()
            r17 = 1
            if (r6 != 0) goto L_0x011e
        L_0x011c:
            r17 = 0
        L_0x011e:
            X.MaY r6 = r4.A02
            X.ODs r6 = r6.A00
            if (r6 == 0) goto L_0x0419
            java.lang.Long r6 = r6.A01
            if (r6 == 0) goto L_0x0419
            java.lang.Long r16 = X.C66582MXn.A0n(r6)
        L_0x012c:
            boolean r6 = r4 instanceof X.1dd
            r10 = 4
            if (r6 != 0) goto L_0x0415
            boolean r15 = r4 instanceof X.1dI
            if (r15 != 0) goto L_0x0415
            boolean r15 = r4 instanceof X.AnonymousClass1dS
            if (r15 != 0) goto L_0x0415
            if (r11 != 0) goto L_0x0415
            boolean r15 = r4 instanceof X.C65611ei
            if (r15 != 0) goto L_0x0415
            boolean r15 = r4 instanceof X.AnonymousClass1dM
            if (r15 != 0) goto L_0x0415
            boolean r15 = r4 instanceof X.AnonymousClass1cj
            if (r15 == 0) goto L_0x02df
            r10 = 3
        L_0x0148:
            java.lang.String r0 = "message_type"
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            X.AnonymousClass7TE.A1W(r8, r0, r10)
            java.lang.String r0 = "event_type"
            r10 = r25
            X.AnonymousClass7TE.A1W(r8, r0, r10)
            java.lang.String r0 = "backend"
            X.AnonymousClass7TE.A1W(r8, r0, r7)
            java.lang.String r0 = "additional_tags"
            r8.AAe(r0, r5)
            java.lang.String r0 = "offline_threading_id"
            r8.AAJ(r0, r9)
            r0 = r20
            java.lang.String r0 = r0.A01
            if (r0 == 0) goto L_0x02dc
            java.lang.Long r7 = X.AnonymousClass7TE.A10(r0)
        L_0x016f:
            java.lang.String r0 = "messaging_thread_fbid"
            r8.A9F(r0, r7)
            java.lang.String r0 = "nonce"
            r8.AAJ(r0, r1)
            java.lang.String r7 = "send_attribution"
            r0 = r18
            X.AnonymousClass7TE.A1W(r8, r7, r0)
            X.MaY r0 = r4.A02
            java.lang.String r7 = r0.A04
            java.lang.String r0 = "send_attribution_raw"
            r8.AAJ(r0, r7)
            java.lang.String r7 = "msg_ttl"
            r0 = r16
            r8.A9F(r7, r0)
            X.XSR r7 = X.XSR.A02
            java.lang.String r0 = "group_thread_subtype"
            r8.A8M(r7, r0)
            X.XSQ r7 = X.XSQ.A02
            java.lang.String r0 = "messaging_thread_type"
            r8.A8M(r7, r0)
            java.lang.String r0 = "initiating_app_id"
            r8.A9F(r0, r1)
            java.lang.String r0 = "message_attachment_fbids"
            r8.AAe(r0, r1)
            java.lang.String r0 = "recipient_fbids"
            r8.AAe(r0, r1)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r17)
            java.lang.String r0 = "is_reply"
            r8.A7p(r0, r7)
            java.lang.String r0 = "igd_action"
            r8.AAJ(r0, r1)
            boolean r14 = r4 instanceof X.AnonymousClass1g2
            if (r14 == 0) goto L_0x02d9
            r0 = r4
            X.1g2 r0 = (X.AnonymousClass1g2) r0
            X.OW8 r0 = r0.A00
            java.lang.String r7 = r0.A05
        L_0x01c6:
            java.lang.String r0 = "igd_action_source"
            r8.AAJ(r0, r7)
            java.lang.String r0 = "igd_verb"
            r8.AAJ(r0, r1)
            java.lang.String r7 = ""
            java.lang.String r19 = "feed_mention"
            java.lang.String r18 = "comment_mention"
            r0 = 1851(0x73b, float:2.594E-42)
            java.lang.String r17 = X.AnonymousClass000.A00(r0)
            java.lang.String r10 = "note_reply"
            r0 = 1557(0x615, float:2.182E-42)
            java.lang.String r16 = X.AnonymousClass000.A00(r0)
            java.lang.String r15 = "clip_mention"
            if (r12 == 0) goto L_0x0247
            X.1cE r4 = (X.1cE) r4
            X.2FW r4 = r4.A06
            if (r4 == 0) goto L_0x01f7
            X.NyX r0 = X.C70179NyX.$redex_init_class
            int r0 = r4.ordinal()
            switch(r0) {
                case 24: goto L_0x02d2;
                case 25: goto L_0x02d6;
                case 26: goto L_0x02ca;
                case 27: goto L_0x02ce;
                case 29: goto L_0x0241;
                case 32: goto L_0x02c3;
                case 34: goto L_0x0226;
                case 37: goto L_0x022d;
                case 40: goto L_0x0220;
                case 51: goto L_0x02c7;
                case 58: goto L_0x023a;
                case 59: goto L_0x0244;
                case 64: goto L_0x0237;
                case 65: goto L_0x0230;
                case 79: goto L_0x0223;
                default: goto L_0x01f7;
            }
        L_0x01f7:
            java.lang.String r7 = "text"
        L_0x01f9:
            java.lang.String r0 = "igd_target_type"
            r8.AAJ(r0, r7)
            java.lang.String r0 = "message_id"
            r8.AAJ(r0, r9)
            java.lang.String r0 = "view_mode"
            if (r3 == r13) goto L_0x021c
            X.AnonymousClass7TE.A1W(r8, r0, r3)
        L_0x020a:
            java.lang.String r0 = "feature_tags"
            r8.AAe(r0, r2)
            r0 = r20
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "igd_django_thread_id"
            r8.AAJ(r0, r1)
            r8.Cgf()
        L_0x021b:
            return
        L_0x021c:
            r8.AAJ(r0, r1)
            goto L_0x020a
        L_0x0220:
            java.lang.String r7 = "ar_effect"
            goto L_0x01f9
        L_0x0223:
            java.lang.String r7 = "fundraiser"
            goto L_0x01f9
        L_0x0226:
            r0 = 1709(0x6ad, float:2.395E-42)
            java.lang.String r7 = X.AnonymousClass000.A00(r0)
            goto L_0x01f9
        L_0x022d:
            java.lang.String r7 = "igtv_share"
            goto L_0x01f9
        L_0x0230:
            r0 = 3977(0xf89, float:5.573E-42)
            java.lang.String r7 = X.AnonymousClass000.A00(r0)
            goto L_0x01f9
        L_0x0237:
            java.lang.String r7 = "shop_collection"
            goto L_0x01f9
        L_0x023a:
            r0 = 3860(0xf14, float:5.409E-42)
            java.lang.String r7 = X.AnonymousClass000.A00(r0)
            goto L_0x01f9
        L_0x0241:
            java.lang.String r7 = "story_share"
            goto L_0x01f9
        L_0x0244:
            java.lang.String r7 = "location_share"
            goto L_0x01f9
        L_0x0247:
            if (r6 == 0) goto L_0x024c
            java.lang.String r7 = "clip"
            goto L_0x01f9
        L_0x024c:
            boolean r0 = r4 instanceof X.1di
            if (r0 != 0) goto L_0x02d6
            if (r11 == 0) goto L_0x0259
            r0 = 797(0x31d, float:1.117E-42)
            java.lang.String r7 = X.AnonymousClass000.A00(r0)
            goto L_0x01f9
        L_0x0259:
            boolean r0 = r4 instanceof X.1du
            if (r0 != 0) goto L_0x02d2
            boolean r0 = r4 instanceof X.AnonymousClass1dS
            if (r0 == 0) goto L_0x0288
            X.1dS r4 = (X.AnonymousClass1dS) r4
            X.9JI r0 = r4.A00
            java.lang.Object r0 = r0.A00
            X.1Xj r0 = (X.1Xj) r0
            boolean r0 = r0.CeS()
            if (r0 == 0) goto L_0x0272
            java.lang.String r7 = "reshare_video"
            goto L_0x01f9
        L_0x0272:
            X.9JI r0 = r4.A00
            java.lang.Object r0 = r0.A00
            X.1Xj r0 = (X.1Xj) r0
            X.1iA r4 = r0.BR7()
            X.1iA r0 = X.1iA.A09
            if (r4 != r0) goto L_0x0284
            java.lang.String r7 = "sidecar"
            goto L_0x01f9
        L_0x0284:
            java.lang.String r7 = "reshare_photo"
            goto L_0x01f9
        L_0x0288:
            boolean r0 = r4 instanceof X.1dq
            if (r0 != 0) goto L_0x02ce
            boolean r0 = r4 instanceof X.C65611ei
            if (r0 == 0) goto L_0x0294
            java.lang.String r7 = "profile"
            goto L_0x01f9
        L_0x0294:
            boolean r0 = r4 instanceof X.C65561e1
            if (r0 != 0) goto L_0x02ca
            boolean r0 = r4 instanceof X.1cX
            if (r0 == 0) goto L_0x02a0
            java.lang.String r7 = "link"
            goto L_0x01f9
        L_0x02a0:
            boolean r0 = r4 instanceof X.1jn
            if (r0 != 0) goto L_0x02c7
            if (r14 == 0) goto L_0x02b0
            X.1g2 r4 = (X.AnonymousClass1g2) r4
            X.OW8 r0 = r4.A00
            java.lang.String r10 = r0.A03
            if (r10 != 0) goto L_0x02c7
            goto L_0x01f9
        L_0x02b0:
            boolean r0 = r4 instanceof X.AnonymousClass1dM
            if (r0 != 0) goto L_0x02c3
            java.lang.String r6 = "Uncaught Target Type with Mutation: "
            java.lang.String r0 = r4.A02()
            java.lang.String r0 = X.002.A0R(r6, r0)
            r5.add(r0)
            goto L_0x01f9
        L_0x02c3:
            r7 = r16
            goto L_0x01f9
        L_0x02c7:
            r7 = r10
            goto L_0x01f9
        L_0x02ca:
            r7 = r18
            goto L_0x01f9
        L_0x02ce:
            r7 = r19
            goto L_0x01f9
        L_0x02d2:
            r7 = r17
            goto L_0x01f9
        L_0x02d6:
            r7 = r15
            goto L_0x01f9
        L_0x02d9:
            r7 = 0
            goto L_0x01c6
        L_0x02dc:
            r7 = r1
            goto L_0x016f
        L_0x02df:
            boolean r15 = r4 instanceof X.1cX
            if (r15 != 0) goto L_0x0412
            if (r12 != 0) goto L_0x0412
            boolean r15 = r4 instanceof X.1fi
            if (r15 == 0) goto L_0x02f8
            r0 = r4
            X.1fi r0 = (X.1fi) r0
            X.5yB r13 = r0.A04
            X.1iA r10 = r13.A01
            X.1iA r0 = X.1iA.A09
            if (r10 != r0) goto L_0x0325
            r10 = 30
            goto L_0x0148
        L_0x02f8:
            boolean r15 = r4 instanceof X.AnonymousClass1g2
            if (r15 == 0) goto L_0x0311
            r0 = r4
            X.1g2 r0 = (X.AnonymousClass1g2) r0
            X.OW8 r0 = r0.A00
            java.lang.String r10 = r0.A07
            java.lang.String r0 = "created"
            boolean r0 = X.0qQ.A0K(r10, r0)
            r10 = 27
            if (r0 == 0) goto L_0x0148
            r10 = 20
            goto L_0x0148
        L_0x0311:
            boolean r15 = r4 instanceof X.C65711gJ
            if (r15 == 0) goto L_0x0319
            r10 = 26
            goto L_0x0148
        L_0x0319:
            if (r13 == 0) goto L_0x0331
            r0 = r4
            X.1fu r0 = (X.AnonymousClass1fu) r0
            X.7Qt r0 = r0.A01
            boolean r0 = r0.A01()
            goto L_0x0329
        L_0x0325:
            boolean r0 = r13.A05()
        L_0x0329:
            r10 = 8
            if (r0 == 0) goto L_0x0148
            r10 = 10
            goto L_0x0148
        L_0x0331:
            boolean r13 = r4 instanceof X.C66311lu
            if (r13 == 0) goto L_0x0339
            r10 = 43
            goto L_0x0148
        L_0x0339:
            if (r14 != 0) goto L_0x0148
            boolean r13 = r4 instanceof X.1fV
            if (r13 == 0) goto L_0x034f
            r0 = r4
            X.1fV r0 = (X.1fV) r0
            X.5yB r0 = r0.A02
            if (r0 == 0) goto L_0x034c
            boolean r0 = r0.A0A
            if (r0 != r7) goto L_0x034c
            goto L_0x0148
        L_0x034c:
            r10 = 6
            goto L_0x0148
        L_0x034f:
            boolean r10 = r4 instanceof X.C65691fy
            if (r10 == 0) goto L_0x0357
            r10 = 11
            goto L_0x0148
        L_0x0357:
            boolean r10 = r4 instanceof X.1di
            if (r10 == 0) goto L_0x035f
            r10 = 39
            goto L_0x0148
        L_0x035f:
            boolean r10 = r4 instanceof X.1du
            if (r10 == 0) goto L_0x0367
            r10 = 41
            goto L_0x0148
        L_0x0367:
            boolean r10 = r4 instanceof X.C65561e1
            if (r10 == 0) goto L_0x036f
            r10 = 40
            goto L_0x0148
        L_0x036f:
            boolean r10 = r4 instanceof X.1dq
            if (r10 == 0) goto L_0x0377
            r10 = 38
            goto L_0x0148
        L_0x0377:
            boolean r10 = r4 instanceof X.C66141jr
            if (r10 == 0) goto L_0x037f
            r10 = 42
            goto L_0x0148
        L_0x037f:
            if (r0 == 0) goto L_0x0402
            r0 = r4
            X.1l9 r0 = (X.C66241l9) r0
            X.3su r14 = r0.A08()
            X.2FW r15 = r14.A10
            X.2FW r0 = X.2FW.A0y
            r10 = 1
            if (r15 != r0) goto L_0x03e4
            boolean r15 = r14.A1S()
            if (r15 == 0) goto L_0x03f1
            java.lang.String r0 = r14.A1o
            if (r0 == 0) goto L_0x03f1
            org.json.JSONObject r15 = X.C66580MXl.A17(r0)     // Catch:{ JSONException -> 0x03dd }
            int r13 = X.C66581MXm.A05(r15)     // Catch:{ JSONException -> 0x03dd }
            r0 = 221584371(0xd351bf3, float:5.5808574E-31)
            if (r13 == r0) goto L_0x03d9
            int r13 = X.C66581MXm.A05(r15)     // Catch:{ JSONException -> 0x03dd }
            r0 = 1959039784(0x74c49328, float:1.245941E32)
            if (r13 == r0) goto L_0x03d9
            int r13 = X.C66581MXm.A05(r15)     // Catch:{ JSONException -> 0x03dd }
            r0 = 1055290394(0x3ee6741a, float:0.45010453)
            if (r13 == r0) goto L_0x03d9
            int r13 = X.C66581MXm.A05(r15)     // Catch:{ JSONException -> 0x03dd }
            r0 = -1051647809(0xffffffffc15120bf, float:-13.070495)
            if (r13 == r0) goto L_0x03d9
            int r13 = X.C66581MXm.A05(r15)     // Catch:{ JSONException -> 0x03dd }
            r0 = -1075368948(0xffffffffbfe72c0c, float:-1.8060317)
            if (r13 == r0) goto L_0x03d9
            java.lang.String r13 = "Uncaught receiverFetchParams: "
            java.lang.String r0 = r14.A0n()     // Catch:{ JSONException -> 0x03dd }
            java.lang.String r0 = X.002.A0R(r13, r0)     // Catch:{ JSONException -> 0x03dd }
            r5.add(r0)     // Catch:{ JSONException -> 0x03dd }
            goto L_0x0148
        L_0x03d9:
            r10 = 13
            goto L_0x0148
        L_0x03dd:
            java.lang.String r0 = "JsonException"
            r5.add(r0)
            goto L_0x0148
        L_0x03e4:
            java.lang.StringBuilder r13 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Invalid Message Type: "
            r13.append(r0)
            r13.append(r15)
            goto L_0x03fd
        L_0x03f1:
            java.lang.StringBuilder r13 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Invalid message Content: message.isArmadilloExpress = "
            r13.append(r0)
            r13.append(r15)
        L_0x03fd:
            X.DbU.A1X(r13, r5)
            goto L_0x0148
        L_0x0402:
            java.lang.String r10 = "Uncaught Send Type with Mutation: "
            java.lang.String r0 = r4.A02()
            java.lang.String r0 = X.002.A0R(r10, r0)
            r5.add(r0)
            r10 = 1
            goto L_0x0148
        L_0x0412:
            r10 = 0
            goto L_0x0148
        L_0x0415:
            r10 = 13
            goto L_0x0148
        L_0x0419:
            r16 = r1
            goto L_0x012c
        L_0x041d:
            boolean r0 = r15.CVb()
            if (r0 == 0) goto L_0x042a
            X.Nmi r0 = X.C69500Nmi.A07
            r2.add(r0)
            goto L_0x0106
        L_0x042a:
            boolean r0 = r15.CVZ(r10)
            if (r0 == 0) goto L_0x0106
            X.Nmi r0 = X.C69500Nmi.A08
            r2.add(r0)
            goto L_0x0106
        L_0x0437:
            java.lang.String r0 = "once"
            boolean r0 = r3.equals(r0)
            r3 = 1
            if (r0 != 0) goto L_0x00a0
            goto L_0x009f
        L_0x0442:
            boolean r0 = r4 instanceof X.1cE
            if (r0 != 0) goto L_0x044d
            X.Nmi r0 = X.C69500Nmi.A03
            r2.add(r0)
            goto L_0x006d
        L_0x044d:
            r0 = r4
            X.1cE r0 = (X.1cE) r0
            X.2FW r0 = r0.A06
            if (r0 == 0) goto L_0x006d
            X.Nmi r0 = X.C69500Nmi.A03
            r2.add(r0)
            X.Nmi r0 = X.C69500Nmi.A05
            r2.add(r0)
            goto L_0x006d
        L_0x0460:
            r11 = r1
            goto L_0x005a
        L_0x0463:
            boolean r0 = r4 instanceof X.C65711gJ
            if (r0 == 0) goto L_0x046e
            r0 = r4
            X.1gJ r0 = (X.C65711gJ) r0
            java.lang.String r9 = r0.A01
            goto L_0x0010
        L_0x046e:
            boolean r0 = r4 instanceof X.AnonymousClass1g2
            if (r0 == 0) goto L_0x047f
            r0 = r4
            X.1g2 r0 = (X.AnonymousClass1g2) r0
            X.OW8 r0 = r0.A00
            java.lang.String r9 = r0.A06
            if (r9 != 0) goto L_0x0010
            java.lang.String r9 = r4.A05
            goto L_0x0010
        L_0x047f:
            r9 = 0
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OUf.A00(com.instagram.common.session.UserSession, X.1OS, com.instagram.model.direct.DirectThreadKey, int):void");
    }
}
