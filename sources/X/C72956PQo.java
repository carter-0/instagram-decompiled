package X;

/* renamed from: X.PQo  reason: case insensitive filesystem */
public final class C72956PQo implements C273414mX {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C72956PQo(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
        this.A03 = str;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.1qK, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v14, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Cyc() {
        /*
            r13 = this;
            int r0 = r13.A00
            switch(r0) {
                case 0: goto L_0x001c;
                case 1: goto L_0x0036;
                case 2: goto L_0x00ba;
                case 3: goto L_0x00d7;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r13.A02
            X.Hs7 r0 = (X.C56058Hs7) r0
            java.lang.String r5 = r13.A03
            java.lang.Object r1 = r13.A01
            X.HMr r1 = (X.C54660HMr) r1
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            X.HMp r2 = X.C54658HMp.REMIX_SETTINGS
            java.util.LinkedHashMap r6 = X.AnonymousClass7TE.A1H()
            r4 = r3
            r0.A00(r1, r2, r3, r4, r5, r6)
            return
        L_0x001c:
            java.lang.Object r1 = r13.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            r3 = 0
            r0 = 1
            X.C331227Qb.A01(r1, r0)
            java.lang.Object r2 = r13.A01
            X.7I3 r2 = (X.AnonymousClass7I3) r2
            java.lang.String r1 = r13.A03
            boolean r0 = r1 instanceof X.C69503Nml
            if (r0 == 0) goto L_0x0032
            r3 = r1
            X.Nml r3 = (X.C69503Nml) r3
        L_0x0032:
            r2.A08(r3)
            return
        L_0x0036:
            java.lang.Object r1 = r13.A02
            X.NVW r1 = (X.NVW) r1
            X.JwH r0 = X.C67750Mu3.A00(r1)
            java.lang.Object r2 = r0.A01
            X.NkD r0 = X.C69373NkD.CUSTOM
            if (r2 != r0) goto L_0x005e
            X.JwH r0 = X.C67750Mu3.A00(r1)
            java.lang.String r0 = r0.A02
            boolean r0 = X.00l.A0W(r0)
            if (r0 == 0) goto L_0x005e
            X.Mu3 r2 = r1.A04()
            java.lang.Object r1 = r13.A01
            X.NkD r1 = (X.C69373NkD) r1
            java.lang.String r0 = r13.A03
            r2.A01(r1, r0)
            return
        L_0x005e:
            X.0eM r0 = r1.A00
            X.OyR r4 = X.C66580MXl.A0T(r0)
            com.instagram.model.direct.DirectThreadKey r0 = r1.A06()
            java.lang.String r6 = r0.A00
            com.instagram.model.direct.DirectThreadKey r0 = r1.A06()
            java.lang.String r7 = r0.A01
            int r3 = r1.A00
            X.JwH r0 = X.C67750Mu3.A00(r1)
            java.lang.Object r0 = r0.A01
            X.NkD r0 = (X.C69373NkD) r0
            java.lang.String r2 = r0.A03
            if (r2 != 0) goto L_0x0084
            X.JwH r0 = X.C67750Mu3.A00(r1)
            java.lang.String r2 = r0.A02
        L_0x0084:
            X.JwH r0 = X.C67750Mu3.A00(r1)
            java.lang.String r0 = r0.A02
            int r0 = r0.length()
            boolean r1 = X.AnonymousClass7TF.A1R(r0)
            r0 = 3
            X.0qQ.A0B(r2, r0)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            java.lang.String r0 = "selected_prize"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r0, r2)
            if (r1 == 0) goto L_0x00b7
            java.lang.String r1 = "True"
        L_0x00a4:
            java.lang.String r0 = "custom_prize"
            java.util.LinkedHashMap r12 = X.DbY.A0p(r0, r1, r2)
            java.lang.String r8 = "challenge_prize_selected"
            java.lang.String r9 = "tap"
            java.lang.String r10 = "done_button"
            java.lang.String r11 = "prize_bottom_sheet"
            r3 = 0
            X.C72202OyR.A03(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x00b7:
            java.lang.String r1 = "False"
            goto L_0x00a4
        L_0x00ba:
            java.lang.Object r0 = r13.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.INA r1 = new X.INA
            r1.<init>(r0)
            X.HOp r4 = X.C54684HOp.ADD_SCHOOL
            java.lang.Object r3 = r13.A01
            X.HOd r3 = (X.C54672HOd) r3
            java.lang.String r2 = r13.A03
            com.instagram.common.session.UserSession r0 = r1.A00
            X.0wc r1 = X.AnonymousClass0kN.A01(r1, r0)
            java.lang.String r0 = "ig_school_registration_success_dismiss_action"
            X.C51976G9y.A0U(r3, r4, r1, r0, r2)
            return
        L_0x00d7:
            java.lang.Object r2 = r13.A02
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r2)
            X.FWJ r0 = new X.FWJ
            r0.<init>()
            r1.A00(r0)
            X.0iw r0 = X.C46359DdX.A00
            X.DcM r3 = X.F8V.A00(r0, r2)
            java.lang.Object r2 = r13.A01
            X.3FW r2 = (X.AnonymousClass3FW) r2
            r0 = 0
            X.F10 r2 = r2.A03(r0)
            java.lang.String r1 = r13.A03
            java.lang.String r0 = "ig_quiet_mode_pause_bottom_sheet_dismiss"
            X.DcM.A03(r3, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72956PQo.Cyc():void");
    }

    public final void Cyf() {
    }
}
