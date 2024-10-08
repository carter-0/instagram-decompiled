package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6c7  reason: invalid class name and case insensitive filesystem */
public final class C311086c7 extends C230502pj {
    public final 0wc A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v31, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v33, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v38, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v40, resolved type: java.lang.Double} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ATF(X.AnonymousClass30Y r15, X.C252093oY r16) {
        /*
            r14 = this;
            r5 = 0
            X.0qQ.A0B(r15, r5)
            r3 = 1
            r6 = r16
            X.0qQ.A0B(r6, r3)
            java.lang.Object r2 = r15.A03
            r9 = r2
            X.3uh r9 = (X.C255773uh) r9
            java.lang.String r8 = r9.A0j
            X.0qQ.A07(r8)
            java.util.Map r0 = X.AnonymousClass59A.A02
            java.lang.Object r4 = r0.get(r8)
            X.59B r4 = (X.AnonymousClass59B) r4
            java.lang.Integer r1 = r6.CEk(r15)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x02a8
            if (r4 == 0) goto L_0x029f
            java.util.Set r0 = r4.A01
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x029f
            java.lang.Object r0 = r15.A04
            X.6YY r0 = (X.AnonymousClass6YY) r0
            X.6Yf r6 = r0.A02
            double r0 = r6.A00
            double r4 = r6.A03
            double r0 = r0 - r4
            java.util.Map r11 = X.AnonymousClass59A.A01
            boolean r4 = r11.containsKey(r8)
            if (r4 != 0) goto L_0x004b
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r11.put(r8, r4)
        L_0x004b:
            java.lang.Object r4 = r11.get(r8)
            java.util.AbstractMap r4 = (java.util.AbstractMap) r4
            if (r4 == 0) goto L_0x005c
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "dwell_time"
            r4.put(r0, r1)
        L_0x005c:
            float r1 = r6.A0A
            boolean r0 = r11.containsKey(r8)
            if (r0 != 0) goto L_0x006c
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r11.put(r8, r0)
        L_0x006c:
            java.lang.Object r6 = r11.get(r8)
            java.util.AbstractMap r6 = (java.util.AbstractMap) r6
            if (r6 == 0) goto L_0x0084
            double r0 = (double) r1
            r4 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r0 = r0 / r4
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "end_scene_start_time_in_seconds"
            r6.put(r0, r1)
        L_0x0084:
            X.0qQ.A06(r2)
            java.util.LinkedHashMap r10 = X.C244083ac.A02(r8)
            boolean r0 = r10.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x029f
            X.0wc r2 = r14.A00
            java.lang.String r1 = "ig_rendering_validation_automatic"
            X.0kJ r0 = r2.A00
            X.0Aj r7 = r2.A00(r0, r1)
            boolean r0 = r7.isSampled()
            if (r0 == 0) goto L_0x029f
            X.1Xj r1 = r9.A0b
            r4 = 0
            if (r1 == 0) goto L_0x01c0
            com.instagram.common.session.UserSession r0 = r14.A01
            java.lang.String r6 = X.C231122qu.A07(r0, r1)
        L_0x00ae:
            X.59A r0 = X.AnonymousClass59A.A00
            java.util.ArrayList r2 = X.AnonymousClass59A.A02(r8)
            java.util.ArrayList r1 = r0.A07(r8)
            X.GkG r5 = new X.GkG
            r5.<init>()
            if (r1 == 0) goto L_0x01ef
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x01ef
            java.lang.String r0 = "client_cop_options"
            r5.A07(r0, r2)
            java.lang.String r0 = "server_cop_options"
            r5.A07(r0, r1)
            java.lang.Double r1 = X.AnonymousClass59A.A01(r8)
            java.lang.String r0 = "dwell_time"
            r5.A04(r0, r1)
            java.lang.Object r1 = r11.get(r8)
            java.util.AbstractMap r1 = (java.util.AbstractMap) r1
            r2 = 0
            if (r1 == 0) goto L_0x01bd
            java.lang.String r0 = "is_end_scene_in_server_options"
            java.lang.Object r1 = r1.get(r0)
        L_0x00e7:
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x00ec
            r2 = r1
        L_0x00ec:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r0 = X.0qQ.A0K(r2, r3)
            if (r0 == 0) goto L_0x0158
            boolean r0 = r11.containsKey(r8)
            r1 = 0
            if (r0 == 0) goto L_0x0122
            java.lang.Object r0 = r11.get(r8)
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            java.lang.String r2 = "end_scene_duration"
            if (r0 == 0) goto L_0x01ba
            java.lang.Object r0 = r0.get(r2)
        L_0x010b:
            boolean r0 = r0 instanceof java.lang.Double
            if (r0 == 0) goto L_0x0122
            java.lang.Object r0 = r11.get(r8)
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            if (r0 == 0) goto L_0x011b
            java.lang.Object r1 = r0.get(r2)
        L_0x011b:
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Double"
            X.0qQ.A0C(r1, r0)
            java.lang.Double r1 = (java.lang.Double) r1
        L_0x0122:
            java.lang.String r0 = "end_scene_duration"
            r5.A04(r0, r1)
            boolean r0 = r11.containsKey(r8)
            r1 = 0
            if (r0 == 0) goto L_0x0153
            java.lang.Object r0 = r11.get(r8)
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            java.lang.String r2 = "end_scene_start_time_in_seconds"
            if (r0 == 0) goto L_0x01b8
            java.lang.Object r0 = r0.get(r2)
        L_0x013c:
            boolean r0 = r0 instanceof java.lang.Double
            if (r0 == 0) goto L_0x0153
            java.lang.Object r0 = r11.get(r8)
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            if (r0 == 0) goto L_0x014c
            java.lang.Object r1 = r0.get(r2)
        L_0x014c:
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Double"
            X.0qQ.A0C(r1, r0)
            java.lang.Double r1 = (java.lang.Double) r1
        L_0x0153:
            java.lang.String r0 = "end_scene_start_time"
            r5.A04(r0, r1)
        L_0x0158:
            java.lang.Object r1 = r11.get(r8)
            java.util.AbstractMap r1 = (java.util.AbstractMap) r1
            r2 = 0
            if (r1 == 0) goto L_0x01b6
            java.lang.String r0 = "is_v2c_in_server_options"
            java.lang.Object r1 = r1.get(r0)
        L_0x0167:
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x016c
            r2 = r1
        L_0x016c:
            boolean r0 = X.0qQ.A0K(r2, r3)
            if (r0 == 0) goto L_0x01ef
            boolean r0 = r11.containsKey(r8)
            r3 = 0
            if (r0 == 0) goto L_0x01ea
            java.lang.Object r1 = r11.get(r8)
            java.util.AbstractMap r1 = (java.util.AbstractMap) r1
            if (r1 == 0) goto L_0x01b4
            java.lang.String r0 = "video_to_carousel_start_times"
            java.lang.Object r12 = r1.get(r0)
        L_0x0187:
            boolean r0 = r12 instanceof java.util.ArrayList
            if (r0 == 0) goto L_0x01ea
            r0 = r12
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01ea
            r11 = r12
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r2 = r11.iterator()
        L_0x01a2:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01c3
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof java.lang.Double
            if (r0 == 0) goto L_0x01a2
            r13.add(r1)
            goto L_0x01a2
        L_0x01b4:
            r12 = r3
            goto L_0x0187
        L_0x01b6:
            r1 = r2
            goto L_0x0167
        L_0x01b8:
            r0 = r1
            goto L_0x013c
        L_0x01ba:
            r0 = r1
            goto L_0x010b
        L_0x01bd:
            r1 = r2
            goto L_0x00e7
        L_0x01c0:
            r6 = r4
            goto L_0x00ae
        L_0x01c3:
            int r1 = r13.size()
            java.util.AbstractCollection r12 = (java.util.AbstractCollection) r12
            int r0 = r12.size()
            if (r1 != r0) goto L_0x01ea
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r11.iterator()
        L_0x01d8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01ea
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof java.lang.Double
            if (r0 == 0) goto L_0x01d8
            r3.add(r1)
            goto L_0x01d8
        L_0x01ea:
            java.lang.String r0 = "video_to_carousel_card_start_times"
            r5.A07(r0, r3)
        L_0x01ef:
            X.6KP r3 = X.AnonymousClass59A.A00(r8)
            java.util.Map r0 = X.AnonymousClass59A.A07
            java.lang.Object r2 = r0.get(r8)
            X.0bb r2 = (X.0bb) r2
            if (r2 != 0) goto L_0x0202
            X.6Px r2 = new X.6Px
            r2.<init>()
        L_0x0202:
            com.instagram.common.session.UserSession r12 = r14.A01
            X.0Tu r11 = X.0Tu.A05
            r0 = 36315155374279724(0x810471000c0c2c, double:3.0291887158634464E-306)
            boolean r0 = X.182.A06(r11, r12, r0)
            if (r0 == 0) goto L_0x02a5
            java.util.Map r0 = X.AnonymousClass59A.A04
            java.lang.Object r1 = r0.get(r8)
            X.0bb r1 = (X.0bb) r1
        L_0x0219:
            java.lang.String r11 = ""
            if (r6 != 0) goto L_0x021e
            r6 = r11
        L_0x021e:
            java.lang.String r0 = "ad_id"
            r7.AAJ(r0, r6)
            com.instagram.user.model.User r0 = r9.A0i
            if (r0 == 0) goto L_0x02a3
            java.lang.String r6 = r0.getId()
        L_0x022b:
            java.lang.String r0 = "a_pk"
            r7.AAJ(r0, r6)
            java.lang.String r0 = "m_pk"
            r7.AAJ(r0, r8)
            java.lang.String r6 = r9.ByO(r12)
            if (r6 != 0) goto L_0x023c
            r6 = r11
        L_0x023c:
            java.lang.String r0 = "tracking_token"
            r7.AAJ(r0, r6)
            X.4DU r0 = r14.A02
            java.lang.String r0 = r0.getModuleName()
            if (r0 == 0) goto L_0x024a
            r11 = r0
        L_0x024a:
            java.lang.String r0 = "source_of_action"
            r7.AAJ(r0, r11)
            java.lang.String r6 = X.AnonymousClass1Q2.A00()
            java.lang.String r0 = "locale"
            r7.AAJ(r0, r6)
            java.util.Locale r0 = X.AnonymousClass1Q2.A02()
            java.lang.String r6 = r0.getCountry()
            java.lang.String r0 = "country"
            r7.AAJ(r0, r6)
            X.1iA r0 = r9.A0C()
            if (r0 == 0) goto L_0x026f
            java.lang.String r4 = r0.name()
        L_0x026f:
            java.lang.String r0 = "media_type"
            r7.AAJ(r0, r4)
            java.lang.String r0 = "pc_component_dict_new"
            r7.A9H(r0, r10)
            boolean r0 = X.AnonymousClass1GD.A03()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_dark_mode"
            r7.A7p(r0, r4)
            java.lang.String r0 = "creative_optimizations"
            r7.AAK(r5, r0)
            java.lang.String r0 = "layout_info"
            r7.AAK(r3, r0)
            java.lang.String r0 = "showreel_template_info"
            r7.AAK(r2, r0)
            if (r1 == 0) goto L_0x029c
            java.lang.String r0 = "lead_gen_info"
            r7.AAK(r1, r0)
        L_0x029c:
            r7.Cgf()
        L_0x029f:
            X.AnonymousClass59A.A03(r8)
            return
        L_0x02a3:
            r6 = r11
            goto L_0x022b
        L_0x02a5:
            r1 = r4
            goto L_0x0219
        L_0x02a8:
            r14.A02(r15, r6, r8, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C311086c7.ATF(X.30Y, X.3oY):void");
    }

    public C311086c7(UserSession userSession, AnonymousClass4DU r3) {
        super(userSession);
        this.A01 = userSession;
        this.A02 = r3;
        this.A00 = AnonymousClass0kN.A00(r3, 0kJ.A05, userSession);
    }
}
