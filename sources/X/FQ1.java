package X;

import android.widget.CompoundButton;

public final class FQ1 implements CompoundButton.OnCheckedChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public FQ1(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02be, code lost:
        r2 = X.AnonymousClass7TE.A1E();
        r2.put("enabled", java.lang.String.valueOf(r11));
        r2.put("entrypoint", "settings");
        X.OWQ.A00(r5, r3, X.C66579MXk.A00(1155), r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02db, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02dc, code lost:
        r0 = "suggestedReplyLogger";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x03fb, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0402, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCheckedChanged(android.widget.CompoundButton r10, boolean r11) {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x02f6;
                case 1: goto L_0x015a;
                case 2: goto L_0x03ce;
                case 3: goto L_0x00e1;
                case 4: goto L_0x009e;
                case 5: goto L_0x0082;
                case 6: goto L_0x02e0;
                case 7: goto L_0x004f;
                case 8: goto L_0x02a7;
                case 9: goto L_0x028e;
                case 10: goto L_0x0017;
                case 11: goto L_0x027a;
                case 12: goto L_0x0241;
                case 13: goto L_0x020d;
                case 14: goto L_0x01e0;
                case 15: goto L_0x017e;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r9.A02
            X.EwP r1 = (X.C49484EwP) r1
            X.FH4 r0 = r1.A00
            com.instagram.common.session.UserSession r3 = r0.A04
            java.lang.String r2 = r1.A01
            X.0iw r1 = r0.A03
            java.lang.String r0 = "logout_d1_toggle_tapped"
            X.FCF.A02(r1, r3, r0, r2, r11)
        L_0x0016:
            return
        L_0x0017:
            java.lang.Object r7 = r9.A02
            X.ESI r7 = (X.ESI) r7
            r8 = r11 ^ 1
            java.lang.Object r6 = r9.A01
            X.1vn r5 = r7.A04
            if (r5 == 0) goto L_0x0016
            X.2IS r4 = X.C41845B3m.A04()
            X.2IS r3 = X.C41845B3m.A04()
            X.0K0 r2 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)
            java.lang.String r0 = "is_seo_indexing_opted_out"
            X.0Df r0 = X.C41845B3m.A03(r2, r1, r0)
            X.C41848B3p.A1L(r0, r4)
            com.facebook.pando.PandoGraphQLRequest r3 = X.C50172FSe.A00(r4, r3)
            r0 = 27
            X.DFg r2 = new X.DFg
            r2.<init>(r6, r0)
            r1 = 1
            X.FRh r0 = new X.FRh
            r0.<init>(r1, r7, r8)
            r5.ATL(r0, r2, r3)
            return
        L_0x004f:
            if (r11 == 0) goto L_0x0016
            java.lang.Object r0 = r9.A02
            X.E1q r0 = (X.C47422E1q) r0
            X.0eM r0 = r0.A04
            java.lang.Object r1 = r0.getValue()
            X.DkZ r1 = (X.C46746DkZ) r1
            java.lang.Object r4 = r9.A01
            X.EWM r4 = (X.EWM) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.05G r3 = r1.A00
        L_0x0067:
            java.lang.Object r2 = r3.getValue()
            r0 = r2
            X.N4R r0 = (X.N4R) r0
            java.lang.Object r1 = r0.A00
            java.util.List r1 = (java.util.List) r1
            r0 = 1
            X.0qQ.A0B(r1, r0)
            X.N4R r0 = new X.N4R
            r0.<init>((X.EWM) r4, (java.util.List) r1)
            boolean r0 = r3.AIY(r2, r0)
            if (r0 == 0) goto L_0x0067
            return
        L_0x0082:
            if (r11 == 0) goto L_0x0016
            java.lang.Object r0 = r9.A02
            X.E1g r0 = (X.C47412E1g) r0
            X.0eM r0 = r0.A03
            java.lang.Object r2 = r0.getValue()
            X.DkY r2 = (X.C46745DkY) r2
            java.lang.Object r0 = r9.A01
            java.lang.Integer r0 = (java.lang.Integer) r0
            java.lang.String r1 = X.C48764Ejn.A00(r0)
            X.05G r0 = r2.A00
            r0.Epw(r1)
            return
        L_0x009e:
            java.lang.Object r0 = r9.A01
            X.Dvr r0 = (X.C47357Dvr) r0
            java.lang.Integer r1 = r0.A01
            if (r1 == 0) goto L_0x0016
            java.lang.Object r0 = r9.A02
            X.Dls r0 = (X.C46816Dls) r0
            int r1 = r1.intValue()
            X.E4G r3 = r0.A00
            androidx.recyclerview.widget.RecyclerView r0 = r3.A00
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.A1E()
            if (r0 != 0) goto L_0x0016
            java.util.Set r2 = r3.A09
            if (r11 != 0) goto L_0x00d9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r2.contains(r1)
            if (r0 == 0) goto L_0x00cb
            r2.remove(r1)
        L_0x00cb:
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = r3.A04
            if (r1 == 0) goto L_0x0016
            boolean r0 = r2.isEmpty()
            r0 = r0 ^ 1
            r1.setPrimaryButtonEnabled(r0)
            return
        L_0x00d9:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2.add(r0)
            goto L_0x00cb
        L_0x00e1:
            java.lang.Object r0 = r9.A01
            X.EbA r0 = (X.C48229EbA) r0
            X.Dvs r0 = r0.A00
            java.lang.Integer r1 = r0.A01
            if (r1 == 0) goto L_0x0016
            java.lang.Object r0 = r9.A02
            X.Dlr r0 = (X.C46815Dlr) r0
            int r2 = r1.intValue()
            X.E4H r3 = r0.A00
            androidx.recyclerview.widget.RecyclerView r0 = r3.A00
            r4 = 1
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.A1E()
            if (r0 != 0) goto L_0x0016
            java.util.Set r5 = r3.A0A
            if (r11 != 0) goto L_0x0152
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            boolean r0 = r5.contains(r1)
            if (r0 == 0) goto L_0x0111
            r5.remove(r1)
        L_0x0111:
            java.util.List r0 = r3.A07
            java.util.Iterator r8 = r0.iterator()
        L_0x0117:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x03b8
            java.lang.Object r6 = r8.next()
            X.EbA r6 = (X.C48229EbA) r6
            X.Dvs r7 = r6.A00
            java.lang.Integer r0 = r7.A01
            if (r0 == 0) goto L_0x0135
            int r0 = r0.intValue()
            if (r0 != r2) goto L_0x0135
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            r7.A00 = r0
        L_0x0135:
            if (r11 == 0) goto L_0x014a
            int r1 = r5.size()
            r0 = 2
            if (r1 != r0) goto L_0x0117
            java.lang.Integer r0 = r7.A01
            boolean r0 = X.00k.A0u(r5, r0)
            if (r0 != 0) goto L_0x0117
            r1 = 0
        L_0x0147:
            r6.A01 = r1
            goto L_0x0117
        L_0x014a:
            int r0 = r5.size()
            r1 = 1
            if (r0 != r4) goto L_0x0117
            goto L_0x0147
        L_0x0152:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r5.add(r0)
            goto L_0x0111
        L_0x015a:
            if (r11 == 0) goto L_0x017b
            java.lang.String r0 = "on"
        L_0x015e:
            java.lang.Object r4 = r9.A02
            X.4tV r4 = (X.C276544tV) r4
            X.4uI r3 = r4.A09()
            if (r3 == 0) goto L_0x0016
            X.6Tl r2 = X.DbU.A0T(r4)
            r2.A02(r0)
            r1 = 2
            java.lang.Object r0 = r9.A01
            X.6Rm r0 = (X.C307786Rm) r0
            r2.A03(r0, r1)
            X.DbT.A1R(r0, r4, r2, r3)
            return
        L_0x017b:
            java.lang.String r0 = "off"
            goto L_0x015e
        L_0x017e:
            java.lang.Object r0 = r9.A02
            X.ES7 r0 = (X.ES7) r0
            com.instagram.common.session.UserSession r5 = r0.A00
            X.0qQ.A0A(r5)
            r1 = 1
            X.0qQ.A0B(r5, r1)
            X.1QP r4 = X.AnonymousClass1QO.A00(r5)
            r0 = 1917(0x77d, float:2.686E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r0)
            java.lang.Object r0 = r9.A01
            X.1Av r0 = (X.1Av) r0
            X.0xY r2 = X.AnonymousClass7TE.A0p(r0)
            r0 = 296(0x128, float:4.15E-43)
            if (r11 == 0) goto L_0x01c6
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.E5Z(r0, r1)
            r2.apply()
            r2 = 0
            r0 = 3242(0xcaa, float:4.543E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 0
            X.FCT.A01(r0, r5, r3, r1, r0)
            r0 = 681252206(0x289b156e, float:1.721775E-14)
        L_0x01b9:
            long r1 = r4.flowStartForMarker(r0, r3, r2)
            java.lang.String r0 = "entry_point"
            r4.flowAnnotate(r1, r0, r3)
            r4.flowEndSuccess(r1)
            return
        L_0x01c6:
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 0
            r2.E5Z(r1, r0)
            r2.apply()
            r2 = 0
            r0 = 3241(0xca9, float:4.542E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 0
            X.FCT.A01(r0, r5, r3, r1, r0)
            r0 = 681257100(0x289b288c, float:1.7226041E-14)
            goto L_0x01b9
        L_0x01e0:
            r3 = 0
            r2 = 1
            java.lang.Object r0 = r9.A02
            X.ES7 r0 = (X.ES7) r0
            if (r11 == 0) goto L_0x01fc
            X.ES7.A06(r0, r3)
            java.lang.Object r0 = r9.A01
            X.1Av r0 = (X.1Av) r0
            X.0xY r1 = X.AnonymousClass7TE.A0p(r0)
            java.lang.String r0 = "data_saver_mode_on"
            r1.E5Z(r0, r2)
        L_0x01f8:
            r1.apply()
            return
        L_0x01fc:
            X.ES7.A06(r0, r2)
            java.lang.Object r0 = r9.A01
            X.1Av r0 = (X.1Av) r0
            X.0xY r1 = X.AnonymousClass7TE.A0p(r0)
            java.lang.String r0 = "data_saver_mode_on"
            r1.E5Z(r0, r3)
            goto L_0x01f8
        L_0x020d:
            java.lang.Object r2 = r9.A02
            X.FF7 r2 = (X.FF7) r2
            java.lang.Object r1 = r9.A01
            X.0r1 r1 = (X.0r1) r1
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x021d
            r0 = 1
            r1.A00 = r0
            return
        L_0x021d:
            r0 = 0
            r10.setEnabled(r0)
            com.instagram.common.session.UserSession r5 = r2.A04
            r0 = 4
            X.FSG r4 = new X.FSG
            r4.<init>(r0, r10, r2)
            r0 = 5
            X.FSG r3 = new X.FSG
            r3.<init>(r0, r10, r2)
            X.FRj r2 = new X.FRj
            r2.<init>(r10, r1, r11)
            X.0sn r1 = X.0sn.A00
            r0 = 1
            if (r11 == 0) goto L_0x023d
            X.F5s.A01(r2, r4, r5, r1, r0)
            return
        L_0x023d:
            X.F5s.A00(r2, r3, r5, r1, r0)
            return
        L_0x0241:
            java.lang.Object r4 = r9.A02
            X.ESI r4 = (X.ESI) r4
            java.lang.Object r3 = r9.A01
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            X.4Cl r1 = r3.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            r1.EhF(r0)
            X.0eM r0 = r4.A0E
            X.0lg r0 = X.DbT.A0X(r0)
            X.1NY r2 = X.AnonymousClass7TG.A0a(r0)
            java.lang.String r0 = "users/update_profile_picture_expansion_setting/"
            r2.A0A(r0)
            java.lang.String r0 = "enable_profile_picture_expansion"
            r2.A0H(r0, r11)
            java.lang.Class<X.1XP> r1 = X.1XP.class
            java.lang.Class<X.1XY> r0 = X.1XY.class
            X.1OC r2 = X.DbU.A0S(r2, r1, r0)
            r1 = 3
            X.EDQ r0 = new X.EDQ
            r0.<init>((int) r1, (java.lang.Object) r4, (java.lang.Object) r3, (boolean) r11)
            r2.A00 = r0
            r4.schedule(r2)
            return
        L_0x027a:
            java.lang.Object r3 = r9.A02
            X.ESI r3 = (X.ESI) r3
            java.lang.Object r2 = r9.A01
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            if (r11 == 0) goto L_0x028b
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
        L_0x0286:
            r0 = 0
            X.ESI.A09(r3, r2, r1, r0)
            return
        L_0x028b:
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            goto L_0x0286
        L_0x028e:
            java.lang.Object r3 = r9.A01
            X.4kA r3 = (X.AnonymousClass4kA) r3
            X.0s0 r2 = r3.A0T
            X.0YZ[] r1 = X.AnonymousClass4kA.A0c
            r0 = 8
            X.AnonymousClass7TF.A1J(r3, r2, r1, r0, r11)
            java.lang.Object r0 = r9.A02
            X.ERm r0 = (X.C48023ERm) r0
            X.OWQ r5 = r0.A00
            r4 = 0
            if (r5 == 0) goto L_0x02dc
            X.3tr r3 = X.C255273tr.A07
            goto L_0x02be
        L_0x02a7:
            java.lang.Object r3 = r9.A01
            X.4kA r3 = (X.AnonymousClass4kA) r3
            X.0s0 r2 = r3.A0S
            X.0YZ[] r1 = X.AnonymousClass4kA.A0c
            r0 = 7
            X.AnonymousClass7TF.A1J(r3, r2, r1, r0, r11)
            java.lang.Object r0 = r9.A02
            X.ERm r0 = (X.C48023ERm) r0
            X.OWQ r5 = r0.A00
            r4 = 0
            if (r5 == 0) goto L_0x02dc
            X.3tr r3 = X.C255273tr.A08
        L_0x02be:
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()
            java.lang.String r1 = java.lang.String.valueOf(r11)
            java.lang.String r0 = "enabled"
            r2.put(r0, r1)
            java.lang.String r1 = "settings"
            java.lang.String r0 = "entrypoint"
            r2.put(r0, r1)
            r0 = 1155(0x483, float:1.618E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.OWQ.A00(r5, r3, r0, r4, r2)
            return
        L_0x02dc:
            java.lang.String r0 = "suggestedReplyLogger"
            goto L_0x03fb
        L_0x02e0:
            java.lang.Object r0 = r9.A02
            X.E4V r0 = (X.E4V) r0
            X.DkL r1 = X.E4V.A00(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            r1.A02 = r0
            java.lang.Object r0 = r9.A01
            com.instagram.igds.components.textcell.IgdsListCell r0 = (com.instagram.igds.components.textcell.IgdsListCell) r0
            r0.setChecked(r11)
            return
        L_0x02f6:
            if (r11 == 0) goto L_0x0369
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            X.0qQ.A07(r2)
            r1 = 6
            r0 = 30
            r2.add(r1, r0)
            long r1 = r2.getTimeInMillis()
            java.lang.Object r5 = r9.A02
            X.R8X r5 = (X.R8X) r5
            java.util.Locale r6 = java.util.Locale.getDefault()
            X.0qQ.A07(r6)
            java.util.Date r4 = new java.util.Date
            r4.<init>(r1)
            r0 = 526(0x20e, float:7.37E-43)
            java.lang.String r3 = X.Pxd.A00(r0)
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            r0.<init>(r3, r6)
            java.lang.String r4 = r0.format(r4)
            X.0qQ.A07(r4)
            java.lang.Object r3 = r9.A01
            com.instagram.igds.components.textcell.IgdsListCell r3 = (com.instagram.igds.components.textcell.IgdsListCell) r3
            r0 = 2131956561(0x7f131351, float:1.9549681E38)
            java.lang.String r0 = r5.getString(r0)
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r4)
            X.0qQ.A07(r0)
            r3.A0H(r0)
            X.0eM r0 = r5.A06
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.SRr.A02(r0, r1)
        L_0x0349:
            X.6ap r1 = X.DbV.A0W()
            r0 = 2131956563(0x7f131353, float:1.9549685E38)
            if (r11 == 0) goto L_0x0355
            r0 = 2131956562(0x7f131352, float:1.9549683E38)
        L_0x0355:
            X.DbS.A1E(r5, r1, r0)
            r1.A06()
            X.DbY.A1N(r1)
            if (r11 == 0) goto L_0x0366
            java.lang.String r0 = "BROWSER_SETTINGS_AUTOMATIC_AUTOFILL_OPT_IN"
        L_0x0362:
            X.R8X.A02(r5, r0)
            return
        L_0x0366:
            java.lang.String r0 = "BROWSER_SETTINGS_AUTOMATIC_AUTOFILL_OPT_OUT"
            goto L_0x0362
        L_0x0369:
            java.lang.Object r1 = r9.A01
            com.instagram.igds.components.textcell.IgdsListCell r1 = (com.instagram.igds.components.textcell.IgdsListCell) r1
            java.lang.String r0 = ""
            r1.A0H(r0)
            java.lang.Object r5 = r9.A02
            X.R8X r5 = (X.R8X) r5
            X.0eM r0 = r5.A06
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            X.1Av r2 = X.1Au.A00(r4)
            r0 = 0
            X.0xa r6 = r2.A01
            X.0xY r3 = r6.AR4()
            r2 = 694(0x2b6, float:9.73E-43)
            java.lang.String r2 = X.Pxd.A00(r2)
            r3.E5c(r2, r0)
            r3.apply()
            r2 = 0
            X.0xY r1 = r6.AR4()
            r0 = 695(0x2b7, float:9.74E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            r1.E5T(r0, r2)
            r1.apply()
            java.lang.String r3 = "AUTO_AUTOFILL_OPT_OUT"
            r0 = 4
            X.CH5 r2 = new X.CH5
            r2.<init>(r0)
            r0 = 56
            java.lang.String r1 = X.Pxd.A00(r0)
            r0 = 0
            X.SRr.A01(r2, r4, r0, r1, r3)
            goto L_0x0349
        L_0x03b8:
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r2 = r3.A04
            if (r2 == 0) goto L_0x03c7
            int r1 = r5.size()
            r0 = 2
            if (r1 == r0) goto L_0x03c4
            r4 = 0
        L_0x03c4:
            r2.setPrimaryButtonEnabled(r4)
        L_0x03c7:
            X.Dlr r2 = r3.A01
            if (r2 != 0) goto L_0x0415
            java.lang.String r0 = "adapter"
            goto L_0x03fb
        L_0x03ce:
            java.lang.Object r5 = r9.A02
            X.ERb r5 = (X.C48014ERb) r5
            X.2BT r4 = r5.A03
            if (r4 == 0) goto L_0x03f5
            X.0lg r1 = r4.A06
            boolean r0 = r1 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x03f5
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.1Av r3 = X.1Au.A00(r1)
            X.0s0 r2 = r3.A68
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 38
            X.AnonymousClass7TF.A1J(r3, r2, r1, r0, r11)
            java.lang.String r1 = "RageShakeSensorHelper"
            java.lang.String r0 = "UserPreferences setRageShakeEnabledNewFlow is set"
            X.0KC.A0D(r1, r0)
            X.2BT.A00(r4)
        L_0x03f5:
            X.F1f r1 = r5.A01
            if (r1 != 0) goto L_0x0403
            java.lang.String r0 = "logger"
        L_0x03fb:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0403:
            if (r11 == 0) goto L_0x0412
            java.lang.Integer r0 = X.AnonymousClass05K.A00
        L_0x0407:
            r1.A00(r0)
            java.lang.Object r0 = r9.A01
            android.content.Context r0 = (android.content.Context) r0
            X.C48014ERb.A06(r0, r5)
            return
        L_0x0412:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x0407
        L_0x0415:
            java.util.List r1 = r3.A07
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.util.List r0 = r2.A01
            X.DbW.A0z(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FQ1.onCheckedChanged(android.widget.CompoundButton, boolean):void");
    }
}
