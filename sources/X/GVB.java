package X;

public final class GVB extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GVB(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        super(0);
        this.A00 = i;
        this.A04 = obj;
        this.A05 = z;
        this.A01 = obj2;
        this.A03 = obj3;
        this.A02 = obj4;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003c, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0080, code lost:
        if (r0 != null) goto L_0x018e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x011d, code lost:
        r4 = new X.C59104J6m(r2, (java.lang.Object) r6, r3, r5);
        r6 = X.AnonymousClass30J.HOURS;
        r2 = X.AnonymousClass30M.A06(r6, r0);
        r5 = X.AnonymousClass30J.MINUTES;
        r10 = (int) r2;
        X.AnonymousClass0fN.A00(new android.app.TimePickerDialog(r7, com.instagram.android.R.style.SpinnerTimePickerDialog, new X.I85(r4, 0), r10, (int) (X.AnonymousClass30M.A06(r5, r0) - X.AnonymousClass30M.A06(r5, X.AnonymousClass30K.A03(r6, r10))), android.text.format.DateFormat.is24HourFormat(r7)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x018c, code lost:
        if (r8 != false) goto L_0x018e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x018e, code lost:
        r0.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01c1, code lost:
        X.C51967G9n.A16(r7.A00, r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r13 = this;
            int r0 = r13.A00
            switch(r0) {
                case 0: goto L_0x020c;
                case 1: goto L_0x0274;
                case 2: goto L_0x01e9;
                case 3: goto L_0x01c8;
                case 4: goto L_0x0193;
                case 5: goto L_0x0150;
                case 6: goto L_0x0103;
                case 7: goto L_0x00e8;
                case 8: goto L_0x0084;
                case 9: goto L_0x005a;
                case 10: goto L_0x0040;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r6 = r13.A04
            X.Iec r6 = (X.C57673Iec) r6
            boolean r0 = r13.A05
            if (r0 == 0) goto L_0x003d
            java.lang.String r5 = "midcard_primary_cta_tap"
        L_0x000f:
            java.lang.Object r4 = r13.A02
            com.instagram.api.schemas.InstagramMidcardType r4 = (com.instagram.api.schemas.InstagramMidcardType) r4
            java.lang.Object r3 = r13.A01
            com.instagram.api.schemas.ClipsMidCardSubtype r3 = (com.instagram.api.schemas.ClipsMidCardSubtype) r3
            com.instagram.common.session.UserSession r0 = r6.A03
            X.GAc r2 = r6.A07
            X.0Aj r1 = X.C51972G9s.A0M(r2, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x002c
            X.93T r0 = X.C51979GAc.A00(r1, r2, r5)
            X.I3w.A02(r1, r3, r4, r0)
        L_0x002c:
            X.8gU r4 = r6.A04
            r2 = 4000(0xfa0, double:1.9763E-320)
            java.lang.Object r1 = r13.A03
            r0 = 4
            X.IwK r0 = X.C58711IwK.A00(r1, r0)
            r4.A00(r0, r2)
        L_0x003a:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x003d:
            java.lang.String r5 = "midcard_secondary_cta_tap"
            goto L_0x000f
        L_0x0040:
            boolean r0 = r13.A05
            if (r0 == 0) goto L_0x0057
            java.lang.Object r0 = r13.A02
        L_0x0046:
            X.DbS.A1U(r0)
            java.lang.Object r2 = r13.A01
            X.3sc r2 = (X.C254523sc) r2
            java.lang.Object r1 = r13.A03
            X.0wc r1 = (X.0wc) r1
            X.HOu r0 = X.C54689HOu.A0P
            X.C54988HaL.A00(r0, r1, r2)
            goto L_0x003a
        L_0x0057:
            java.lang.Object r0 = r13.A04
            goto L_0x0046
        L_0x005a:
            boolean r0 = r13.A05
            if (r0 == 0) goto L_0x006f
            java.lang.Object r1 = r13.A03
            X.2V5 r1 = (X.2V5) r1
            r0 = 1065353216(0x3f800000, float:1.0)
            X.C51967G9n.A19(r1, r0)
            java.lang.Object r1 = r13.A01
            X.2V5 r1 = (X.2V5) r1
            r0 = 0
            X.C51967G9n.A19(r1, r0)
        L_0x006f:
            java.lang.Object r1 = r13.A02
            X.2Wa r1 = (X.2Wa) r1
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0v()
            r1.A02(r0)
            java.lang.Object r0 = r13.A04
            X.GvX r0 = (X.C53866GvX) r0
            X.0sa r0 = r0.A04
            if (r0 == 0) goto L_0x003a
            goto L_0x018e
        L_0x0084:
            X.02m r4 = X.C51965G9l.A0l()
            boolean r6 = r13.A05
            java.lang.Object r1 = r13.A01
            java.lang.Number r1 = (java.lang.Number) r1
            java.lang.Object r5 = r13.A04
            java.lang.Number r5 = (java.lang.Number) r5
            java.lang.Object r3 = r13.A03
            java.lang.Number r3 = (java.lang.Number) r3
            r2 = 309476254(0x12723b9e, float:7.643522E-28)
            r4.markerStart(r2)
            java.lang.String r0 = "is_self_media"
            r4.markerAnnotate(r2, r0, r6)
            int r0 = r1.intValue()
            switch(r0) {
                case 1: goto L_0x00df;
                case 2: goto L_0x00e2;
                case 3: goto L_0x00e5;
                default: goto L_0x00a8;
            }
        L_0x00a8:
            java.lang.String r1 = "click"
        L_0x00aa:
            java.lang.String r0 = "funnel_trigger"
            r4.markerAnnotate(r2, r0, r1)
            int r0 = r5.intValue()
            switch(r0) {
                case 1: goto L_0x00d9;
                case 2: goto L_0x00dc;
                default: goto L_0x00b6;
            }
        L_0x00b6:
            java.lang.String r1 = "bulk_manage_comments"
        L_0x00b8:
            r0 = 1013(0x3f5, float:1.42E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r4.markerAnnotate(r2, r0, r1)
            int r0 = r3.intValue()
            int r0 = 1 - r0
            if (r0 == 0) goto L_0x00d6
            r0 = 1547(0x60b, float:2.168E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
        L_0x00cf:
            java.lang.String r0 = "surface"
            r4.markerAnnotate(r2, r0, r1)
            goto L_0x003a
        L_0x00d6:
            java.lang.String r1 = "mvvm"
            goto L_0x00cf
        L_0x00d9:
            java.lang.String r1 = "comment_actions_popup"
            goto L_0x00b8
        L_0x00dc:
            java.lang.String r1 = "action_bar_icons"
            goto L_0x00b8
        L_0x00df:
            java.lang.String r1 = "long_click"
            goto L_0x00aa
        L_0x00e2:
            java.lang.String r1 = "undo_delete_toast"
            goto L_0x00aa
        L_0x00e5:
            java.lang.String r1 = "comment_controls_menu"
            goto L_0x00aa
        L_0x00e8:
            boolean r0 = r13.A05
            if (r0 == 0) goto L_0x003a
            java.lang.Object r7 = r13.A01
            android.content.Context r7 = (android.content.Context) r7
            java.lang.Object r6 = r13.A03
            X.5Oz r6 = (X.C284945Oz) r6
            X.0eM r0 = X.I6Z.A00
            X.GlI r0 = X.C51966G9m.A10(r6)
            long r0 = r0.A00
            java.lang.Object r5 = r13.A04
            java.lang.Object r3 = r13.A02
            r2 = 31
            goto L_0x011d
        L_0x0103:
            boolean r0 = r13.A05
            if (r0 == 0) goto L_0x003a
            java.lang.Object r7 = r13.A01
            android.content.Context r7 = (android.content.Context) r7
            java.lang.Object r6 = r13.A03
            X.5Oz r6 = (X.C284945Oz) r6
            X.0eM r0 = X.I6Z.A00
            X.GlI r0 = X.C51966G9m.A10(r6)
            long r0 = r0.A01
            java.lang.Object r5 = r13.A04
            java.lang.Object r3 = r13.A02
            r2 = 30
        L_0x011d:
            X.J6m r4 = new X.J6m
            r4.<init>((int) r2, (java.lang.Object) r6, (java.lang.Object) r3, (java.lang.Object) r5)
            X.30J r6 = X.AnonymousClass30J.HOURS
            long r2 = X.AnonymousClass30M.A06(r6, r0)
            X.30J r5 = X.AnonymousClass30J.MINUTES
            long r0 = X.AnonymousClass30M.A06(r5, r0)
            int r10 = (int) r2
            long r2 = X.AnonymousClass30K.A03(r6, r10)
            long r2 = X.AnonymousClass30M.A06(r5, r2)
            long r0 = r0 - r2
            r8 = 2132018200(0x7f140418, float:1.96747E38)
            r2 = 0
            X.I85 r9 = new X.I85
            r9.<init>(r4, r2)
            int r11 = (int) r0
            boolean r12 = android.text.format.DateFormat.is24HourFormat(r7)
            android.app.TimePickerDialog r6 = new android.app.TimePickerDialog
            r6.<init>(r7, r8, r9, r10, r11, r12)
            X.AnonymousClass0fN.A00(r6)
            goto L_0x003a
        L_0x0150:
            java.lang.Object r2 = r13.A03
            r1 = 38
            X.Ivq r0 = new X.Ivq
            r0.<init>(r2, r1)
            boolean r8 = r13.A05
            java.lang.Object r7 = r13.A04
            X.Hj9 r7 = (X.C55527Hj9) r7
            java.lang.Object r1 = r13.A01
            X.INA r1 = (X.INA) r1
            java.lang.Object r6 = r13.A02
            X.HOd r6 = (X.C54672HOd) r6
            X.HOp r5 = X.C54684HOp.SCHOOL_SETTINGS
            r4 = 1
            X.0wc r2 = X.INA.A02(r1, r6, r4)
            java.lang.String r1 = "ig_school_reliability_switch_school_tap"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r2, r1)
            boolean r1 = r3.isSampled()
            if (r1 == 0) goto L_0x018c
            X.C51971G9r.A15(r6, r5, r3)
            java.lang.String r2 = ""
            java.lang.String r1 = "waterfall_id"
            r3.AAJ(r1, r2)
            java.lang.String r1 = "button_string"
            r3.AAJ(r1, r2)
            X.DbX.A1L(r3)
        L_0x018c:
            if (r8 == 0) goto L_0x01c1
        L_0x018e:
            r0.invoke()
            goto L_0x003a
        L_0x0193:
            java.lang.Object r1 = r13.A01
            X.INA r1 = (X.INA) r1
            X.HOp r3 = X.C54684HOp.UPDATE_GRADUATION
            java.lang.Object r2 = r13.A02
            X.HOd r2 = (X.C54672HOd) r2
            r0 = 1
            X.0wc r1 = X.INA.A02(r1, r2, r0)
            java.lang.String r0 = "ig_school_reliability_graduation_date_row_tap"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x01b4
            X.C51965G9l.A1B(r2, r1)
            X.C51974G9v.A0j(r3, r1)
        L_0x01b4:
            boolean r1 = r13.A05
            java.lang.Object r7 = r13.A03
            X.Hj9 r7 = (X.C55527Hj9) r7
            java.lang.Object r0 = r13.A04
            X.0sa r0 = (X.C62320sa) r0
            if (r1 != 0) goto L_0x018e
            r4 = 1
        L_0x01c1:
            X.5Oz r0 = r7.A00
            X.C51967G9n.A16(r0, r4)
            goto L_0x003a
        L_0x01c8:
            boolean r0 = r13.A05
            if (r0 == 0) goto L_0x01e6
            java.lang.Object r0 = r13.A03
        L_0x01ce:
            X.DbS.A1U(r0)
            java.lang.Object r3 = r13.A04
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            java.lang.Object r2 = r13.A01
            X.0iw r2 = (X.AnonymousClass0iw) r2
            java.lang.String r1 = "tap"
            r0 = 2940(0xb7c, float:4.12E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.I7S.A0A(r2, r3, r1, r0)
            goto L_0x003a
        L_0x01e6:
            java.lang.Object r0 = r13.A02
            goto L_0x01ce
        L_0x01e9:
            java.lang.Object r0 = r13.A04
            X.MiI r0 = (X.C67098MiI) r0
            com.instagram.common.session.UserSession r4 = r0.A02
            java.lang.Object r0 = r13.A02
            X.3sy r0 = (X.C254743sy) r0
            com.instagram.model.direct.DirectThreadKey r0 = X.C66647MaG.A03(r0)
            java.lang.String r3 = r0.A00
            if (r3 == 0) goto L_0x028c
            java.lang.Object r0 = r13.A01
            X.N4G r0 = (X.N4G) r0
            int r2 = r0.A00
            boolean r1 = r13.A05
            java.lang.Object r0 = r13.A03
            java.lang.Integer r0 = (java.lang.Integer) r0
            X.C3265677h.A0l(r4, r0, r3, r2, r1)
            goto L_0x003a
        L_0x020c:
            java.lang.Object r5 = r13.A04
            X.Qf0 r5 = (X.C8013Qf0) r5
            X.0sJ r4 = r5.A08
            boolean r0 = r13.A05
            if (r0 == 0) goto L_0x0271
            r0 = 858(0x35a, float:1.202E-42)
        L_0x0218:
            java.lang.String r3 = X.Pxd.A00(r0)
            java.lang.Object r1 = r13.A01
            com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem r1 = (com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem) r1
            java.lang.String r0 = r1.A0F
            java.lang.Long r2 = X.DbV.A0q(r0)
            X.XRm r1 = r1.A09
            r0 = 925(0x39d, float:1.296E-42)
            java.lang.String r0 = X.Pxd.A00(r0)
            r4.invoke(r0, r3, r2, r1)
            java.lang.Object r6 = r13.A03
            X.Qf5 r6 = (X.C8018Qf5) r6
            java.lang.Object r4 = r13.A02
            X.SUj r4 = (X.SUj) r4
            X.C8013Qf0.A07(r6)
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            java.lang.Object r2 = r4.A01
            com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem r2 = (com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem) r2
            if (r2 == 0) goto L_0x003a
            r1 = 12
            java.lang.String r0 = r2.A0F
            r3.put(r1, r0)
            r1 = 39
            X.RGo r0 = r2.A0A
            r3.put(r1, r0)
            X.0sL r1 = r5.A07
            java.lang.Integer r0 = r2.A0B
            if (r0 == 0) goto L_0x0291
            java.lang.Object r3 = r1.invoke(r3, r0)
            X.2Fk r3 = (X.2Fk) r3
            X.07Z r2 = r5.A01
            r0 = 41
            X.Iwy r1 = new X.Iwy
            r1.<init>(r0, r4, r5, r6)
            r0 = 8
            X.C51969G9p.A15(r2, r3, r1, r0)
            goto L_0x003a
        L_0x0271:
            r0 = 854(0x356, float:1.197E-42)
            goto L_0x0218
        L_0x0274:
            java.lang.Object r4 = r13.A04
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.Object r1 = r13.A01
            X.818 r1 = (X.AnonymousClass818) r1
            java.lang.Object r2 = r13.A03
            X.819 r2 = (X.AnonymousClass819) r2
            java.lang.Object r3 = r13.A02
            X.81A r3 = (X.AnonymousClass81A) r3
            boolean r5 = r13.A05
            X.81D r0 = new X.81D
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L_0x028c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0291:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GVB.invoke():java.lang.Object");
    }
}
