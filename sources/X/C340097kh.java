package X;

import java.util.List;

/* renamed from: X.7kh  reason: invalid class name and case insensitive filesystem */
public final class C340097kh {
    public final C340087kg A00;
    public final AnonymousClass0eK A01;
    public final boolean A02;
    public final C240463Kz A03;
    public final AnonymousClass0JR A04;
    public final AnonymousClass3L3 A05;

    public final void A00(C296605qL r27, AnonymousClass57r r28, C39663A4d a4d, C296505qA r30, Boolean bool) {
        String str;
        Double d;
        Boolean bool2;
        Boolean bool3;
        Long l;
        Long l2;
        Long l3;
        Long l4;
        long j;
        Boolean bool4;
        Boolean bool5;
        Boolean bool6;
        Boolean bool7;
        List list;
        String str2;
        String str3;
        Boolean bool8 = bool;
        C340087kg r3 = this.A00;
        C296505qA r4 = r30;
        boolean z = r4.A02;
        C296605qL r5 = r27;
        if (r27 != null) {
            str = r5.A01;
        } else {
            str = null;
        }
        0wc A002 = C340087kg.A00(r3, str, z);
        if (A002 != null) {
            1Ln r32 = new 1Ln(A002.A00(A002.A00, "gnv_generic_click"), 162);
            if (r32.A00.isSampled()) {
                C39663A4d a4d2 = a4d;
                C296545qF r7 = a4d2.A00;
                if (r7 != null) {
                    bool2 = r7.A05;
                    bool3 = r7.A06;
                    l = Long.valueOf((long) r7.A02);
                    l2 = Long.valueOf((long) r7.A03);
                    l3 = Long.valueOf((long) r7.A04);
                    l4 = Long.valueOf((long) r7.A01);
                    d = Double.valueOf((double) r7.A00);
                } else {
                    d = null;
                    bool2 = null;
                    bool3 = null;
                    l = null;
                    l2 = null;
                    l3 = null;
                    l4 = null;
                }
                AnonymousClass57r r2 = r4.A00;
                long j2 = 0;
                if (r28 != null) {
                    j2 = r28.BEV();
                    j = r28.BZx();
                    bool8 = r28.CWF();
                    bool5 = r28.CbB();
                    bool4 = Boolean.valueOf(r28.AkU());
                    bool6 = Boolean.valueOf(r28.Ak4());
                    bool7 = Boolean.valueOf(r28.Ake());
                    list = r28.BkB();
                } else if (r2 != null) {
                    j2 = r2.BEV();
                    j = r2.BZx();
                    if (bool == null) {
                        bool8 = r2.CWF();
                    }
                    bool5 = r2.CbB();
                    bool4 = Boolean.valueOf(r2.AkU());
                    bool6 = Boolean.valueOf(r2.Ak4());
                    bool7 = Boolean.valueOf(r2.Ake());
                    list = r2.BkB();
                } else {
                    j = 0;
                    bool4 = null;
                    bool5 = null;
                    bool6 = null;
                    bool7 = null;
                    list = null;
                }
                C240463Kz r72 = this.A03;
                if (r72 != null) {
                    str2 = r72.C9x(AnonymousClass05K.A0C);
                } else {
                    str2 = null;
                }
                r32.A0R("purpose", "mutation_2nd_channel");
                r32.A0R("clicked_target_description", a4d2.A01);
                r32.A0O("clicked_target_is_enabled", bool2);
                r32.A0O("clicked_target_is_selected", bool3);
                r32.A0Q("clicked_target_origin_x", l);
                r32.A0Q("clicked_target_origin_y", l2);
                r32.A0Q("clicked_target_width", l3);
                r32.A0Q("clicked_target_height", l4);
                r32.A0P("clicked_target_alpha", d);
                if (r27 != null) {
                    str3 = r5.A01;
                } else {
                    str3 = null;
                }
                String str4 = "";
                if (str3 == null) {
                    str3 = str4;
                }
                r32.A0n(str3);
                if (r27 != null) {
                    str4 = r5.A00;
                }
                r32.A0R("module_class", str4);
                r32.A0Q("content_id", Long.valueOf(j2));
                r32.A0Q(AnonymousClass000.A00(1222), Long.valueOf(j));
                r32.A0O("content_is_liked", bool8);
                r32.A0O("content_is_saved", bool5);
                r32.A0O("content_can_save", bool4);
                r32.A0O("content_can_comment", bool6);
                r32.A0O("content_can_share", bool7);
                r32.A0S(AnonymousClass000.A00(3843), list);
                r32.A0S(AnonymousClass000.A00(4126), C52314GNg.A01(r4.A0G));
                r32.A0S("tracking_models", C52314GNg.A00(r4.A0F));
                r32.A0S("class_names", r4.A00());
                r32.A0M(r4.A0B, "gesture_type");
                r32.A0Q("tap_index", r4.A01);
                r32.A0Q("gesture_timestamp", Long.valueOf(r4.A07));
                r32.A0Q("gesture_duration", Long.valueOf(r4.A06));
                r32.A0P("gesture_coordinate_x", Double.valueOf((double) r4.A03));
                r32.A0P("gesture_coordinate_y", Double.valueOf((double) r4.A04));
                r32.A0M(r4.A0A, "previous_gesture_type");
                r32.A0Q("previous_gesture_timestamp", Long.valueOf(r4.A08));
                AnonymousClass3L3 r0 = this.A05;
                if (r0 != null) {
                    r32.A0R("correlation_id", r0.Ara());
                }
                if (str2 != null) {
                    r32.A0R("trigger_id", str2);
                }
                if (!this.A02) {
                    r32.A0u((String) this.A01.get());
                }
                r32.Cgf();
                if (str2 != null && r72 != null) {
                    r72.Chg(str2);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x01db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C296505qA r12, X.AnonymousClass3LR r13, java.util.List r14, double r15, boolean r17) {
        /*
            r11 = this;
            X.7kg r2 = r11.A00
            boolean r1 = r12.A02
            java.lang.String r0 = r13.Bxu()
            X.0wc r2 = X.C340087kg.A00(r2, r0, r1)
            if (r2 == 0) goto L_0x01f1
            java.lang.String r1 = "central_nav_from_gesture"
            X.0kJ r0 = r2.A00
            X.0Aj r1 = r2.A00(r0, r1)
            r0 = 10
            X.1Ln r6 = new X.1Ln
            r6.<init>(r1, r0)
            X.0Aj r0 = r6.A00
            boolean r0 = r0.isSampled()
            if (r0 == 0) goto L_0x01f1
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3 = 0
            if (r14 == 0) goto L_0x00a4
            java.util.Iterator r9 = r14.iterator()
        L_0x0045:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0075
            java.lang.Object r8 = r9.next()
            X.3LR r8 = (X.AnonymousClass3LR) r8
            java.lang.String r0 = r8.Bxu()
            r7.add(r0)
            java.lang.String r0 = r8.Bxt()
            r5.add(r0)
            java.lang.String r0 = r8.AwW()
            r2.add(r0)
            java.lang.String r0 = r8.AwV()
            r4.add(r0)
            java.lang.String r0 = r8.AwX()
            r1.add(r0)
            goto L_0x0045
        L_0x0075:
            int r0 = r14.size()
            int r9 = r0 + -1
            if (r9 < 0) goto L_0x00a4
        L_0x007d:
            int r10 = r9 + -1
            java.lang.Object r0 = r14.get(r9)
            X.3LQ r0 = (X.AnonymousClass3LQ) r0
            X.0xI r0 = r0.A01
            java.lang.String r8 = "event_trace_id"
            X.0xF r0 = r0.A06
            java.lang.String r0 = r0.A05(r8)
            if (r0 == 0) goto L_0x00a0
            java.lang.Object r0 = r14.get(r9)
            X.3LQ r0 = (X.AnonymousClass3LQ) r0
            X.0xI r0 = r0.A01
            X.0xF r0 = r0.A06
            java.lang.String r0 = r0.A05(r8)
            goto L_0x00a5
        L_0x00a0:
            if (r10 < 0) goto L_0x00a4
            r9 = r10
            goto L_0x007d
        L_0x00a4:
            r0 = r3
        L_0x00a5:
            X.3Kz r8 = r11.A03
            if (r8 == 0) goto L_0x00af
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            java.lang.String r3 = r8.C9x(r3)
        L_0x00af:
            java.util.List r9 = r12.A0G
            java.util.ArrayList r10 = X.C52314GNg.A01(r9)
            java.lang.String r9 = "before_tracking_nodes"
            r6.A0S(r9, r10)
            java.util.List r9 = r12.A0F
            java.util.ArrayList r10 = X.C52314GNg.A00(r9)
            java.lang.String r9 = "before_tracking_models"
            r6.A0S(r9, r10)
            java.util.ArrayList r10 = r12.A00()
            java.lang.String r9 = "before_class_names"
            r6.A0S(r9, r10)
            java.lang.String r10 = r13.Bxu()
            java.lang.String r9 = "before_module"
            r6.A0R(r9, r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.lang.String r9 = "after_tracking_nodes"
            r6.A0S(r9, r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.lang.String r9 = "after_tracking_models"
            r6.A0S(r9, r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.lang.String r9 = "after_class_names"
            r6.A0S(r9, r10)
            java.lang.String r10 = r13.AwW()
            java.lang.String r9 = "after_module"
            r6.A0R(r9, r10)
            boolean r9 = r12.A02
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r9)
            java.lang.String r9 = "gesture_is_ad"
            r6.A0O(r9, r10)
            java.lang.String r10 = r12.A0D
            java.lang.String r9 = "gesture_session_id"
            r6.A0R(r9, r10)
            java.lang.String r9 = "nav_event_source_modules"
            r6.A0S(r9, r7)
            java.lang.String r7 = "nav_event_dest_modules"
            r6.A0S(r7, r2)
            java.lang.String r2 = "nav_event_dest_uris"
            r6.A0S(r2, r1)
            java.lang.String r2 = r13.Bxt()
            java.lang.String r1 = "before_module_class"
            r6.A0R(r1, r2)
            java.lang.String r2 = r13.AwV()
            java.lang.String r1 = "after_module_class"
            r6.A0R(r1, r2)
            java.lang.String r2 = r13.AwX()
            java.lang.String r1 = "after_module_uri"
            r6.A0R(r1, r2)
            java.lang.Double r2 = java.lang.Double.valueOf(r15)
            java.lang.String r1 = "gesture_nav_check_delay_time"
            r6.A0P(r1, r2)
            X.5q9 r2 = r12.A0B
            java.lang.String r1 = "gesture_type"
            r6.A0M(r2, r1)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r17)
            java.lang.String r1 = "gesture_generate_link_click"
            r6.A0O(r1, r2)
            long r1 = r12.A07
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = "gesture_timestamp"
            r6.A0Q(r1, r2)
            X.5q9 r2 = r12.A0A
            java.lang.String r1 = "previous_gesture_type"
            r6.A0M(r2, r1)
            long r1 = r12.A08
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = "previous_gesture_timestamp"
            r6.A0Q(r1, r2)
            java.lang.String r1 = "nav_event_source_module_classes"
            r6.A0S(r1, r5)
            java.lang.String r1 = "nav_event_dest_module_classes"
            r6.A0S(r1, r4)
            java.lang.String r1 = "nav_event_event_trace_id"
            r6.A0R(r1, r0)
            float r0 = r12.A03
            double r0 = (double) r0
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "gesture_coordinate_x"
            r6.A0P(r0, r1)
            float r0 = r12.A04
            double r0 = (double) r0
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "gesture_coordinate_y"
            r6.A0P(r0, r1)
            X.3L3 r0 = r11.A05
            if (r0 == 0) goto L_0x01a4
            java.lang.String r1 = r0.Ara()
            java.lang.String r0 = "correlation_id"
            r6.A0R(r0, r1)
        L_0x01a4:
            if (r3 == 0) goto L_0x01ab
            java.lang.String r0 = "trigger_id"
            r6.A0R(r0, r3)
        L_0x01ab:
            X.57r r0 = r12.A00
            if (r0 == 0) goto L_0x01c6
            java.lang.String r0 = r0.BDl()
            if (r0 == 0) goto L_0x01c6
            long r0 = java.lang.Long.parseLong(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = 2453(0x995, float:3.437E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r6.A0Q(r0, r1)
        L_0x01c6:
            X.57r r0 = r12.A00
            if (r0 == 0) goto L_0x01d7
            long r0 = r0.BEV()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "content_id"
            r6.A0Q(r0, r1)
        L_0x01d7:
            boolean r0 = r11.A02
            if (r0 != 0) goto L_0x01e6
            X.0eK r0 = r11.A01
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            r6.A0u(r0)
        L_0x01e6:
            r6.Cgf()
            if (r3 == 0) goto L_0x01f1
            if (r8 == 0) goto L_0x01f1
            r8.Chg(r3)
            return
        L_0x01f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C340097kh.A01(X.5qA, X.3LR, java.util.List, double, boolean):void");
    }

    public C340097kh(C240463Kz r1, C340087kg r2, AnonymousClass0JR r3, AnonymousClass3L3 r4, AnonymousClass0eK r5, boolean z) {
        this.A00 = r2;
        this.A04 = r3;
        this.A01 = r5;
        this.A05 = r4;
        this.A03 = r1;
        this.A02 = z;
    }
}
