package X;

import android.widget.RadioGroup;
import java.util.List;

/* renamed from: X.OlH  reason: case insensitive filesystem */
public final class C71473OlH implements RadioGroup.OnCheckedChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C71473OlH(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public static String A00(C71473OlH olH, int i) {
        return ((C70953OTa) ((List) olH.A01).get(i)).A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x013c, code lost:
        if (r5.equals(r1) != false) goto L_0x013e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCheckedChanged(android.widget.RadioGroup r17, int r18) {
        /*
            r16 = this;
            r6 = r16
            int r0 = r6.A00
            r2 = r18
            switch(r0) {
                case 0: goto L_0x00c2;
                case 1: goto L_0x0193;
                case 2: goto L_0x0092;
                case 3: goto L_0x0026;
                case 4: goto L_0x00f5;
                case 5: goto L_0x00e6;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r1 = r6.A01
            X.61u r1 = (X.C3021461u) r1
            r0 = 1
            r1.setPrimaryButtonEnabled(r0)
            java.lang.Object r1 = r6.A02
            X.R8P r1 = (X.R8P) r1
            boolean r0 = r1.A0A
            if (r0 == 0) goto L_0x0025
            r3 = r17
            android.view.View r0 = r3.requireViewById(r2)
            r3.indexOfChild(r0)
            r1.getSession()
        L_0x0025:
            return
        L_0x0026:
            java.lang.String r0 = A00(r6, r2)
            X.0qQ.A07(r0)
            java.lang.Integer r3 = X.00y.A0l(r0)
            if (r3 == 0) goto L_0x0025
            java.lang.Object r0 = r6.A02
            X.Nga r0 = (X.C69184Nga) r0
            int r6 = r3.intValue()
            X.MuD r4 = X.C69184Nga.A07(r0)
            X.0eM r5 = r4.A0A
            java.lang.Object r1 = r5.getValue()
            X.MoD r1 = (X.C67458MoD) r1
            boolean r0 = X.C67458MoD.A04(r1)
            if (r0 == 0) goto L_0x005b
            X.0xa r0 = r1.A00
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "EB_CUTOVER_TIMESTAMP_OVERRIDE_MS"
            r1.E5Z(r0, r6)
            r1.apply()
        L_0x005b:
            X.0eM r0 = r4.A0C
            com.instagram.common.session.UserSession r2 = X.C66581MXm.A0S(r0)
            r0 = 36315949951487803(0x81052a008a0f3b, double:3.029691209689341E-306)
            boolean r0 = X.AnonymousClass65A.A02(r2, r0)
            if (r0 == 0) goto L_0x008c
            X.0eM r0 = r4.A0B
            java.lang.Object r0 = r0.getValue()
            X.OTs r0 = (X.C70971OTs) r0
            int r0 = r0.A00
            if (r6 < r0) goto L_0x008c
            java.lang.Object r0 = r5.getValue()
            X.MoD r0 = (X.C67458MoD) r0
            X.0xa r0 = r0.A00
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "EB_BlOCK_FIRST_SHOWN_TIMESTAMP_OVERRIDE_MS"
            r1.ED3(r0)
            r1.apply()
        L_0x008c:
            X.05G r0 = r4.A0K
            r0.FIA(r3)
            return
        L_0x0092:
            java.lang.String r0 = A00(r6, r2)
            X.0qQ.A07(r0)
            java.lang.Integer r1 = X.00y.A0l(r0)
            if (r1 == 0) goto L_0x0025
            java.lang.Object r0 = r6.A02
            X.Nga r0 = (X.C69184Nga) r0
            int r2 = r1.intValue()
            X.MuD r0 = X.C69184Nga.A07(r0)
            X.0eM r0 = r0.A0A
            java.lang.Object r0 = r0.getValue()
            X.MoD r0 = (X.C67458MoD) r0
            X.0xa r0 = r0.A00
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "EB_BlOCK_FIRST_SHOWN_TIMESTAMP_OVERRIDE_MS"
            r1.E5Z(r0, r2)
            r1.apply()
            return
        L_0x00c2:
            java.lang.String r1 = A00(r6, r2)
            java.lang.String r0 = "right_side"
            boolean r5 = r0.equals(r1)
            java.lang.Object r4 = r6.A02
            X.LlO r4 = (X.C64985LlO) r4
            X.1Av r3 = r4.A05
            X.0s0 r2 = r3.A60
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 298(0x12a, float:4.18E-43)
            X.AnonymousClass7TF.A1J(r3, r2, r1, r0, r5)
            X.C64985LlO.A00(r4)
            X.MS0 r0 = r4.A00
            if (r0 == 0) goto L_0x0025
            r0.DRL()
            return
        L_0x00e6:
            java.lang.Object r1 = r6.A02
            X.UsJ r1 = (X.C16299UsJ) r1
            java.lang.String r0 = A00(r6, r2)
            X.0qQ.A07(r0)
            X.C16299UsJ.A06(r1, r0)
            return
        L_0x00f5:
            java.lang.String r5 = A00(r6, r2)
            java.lang.Object r2 = r6.A02
            X.NgL r2 = (X.NgL) r2
            X.0qQ.A0A(r5)
            X.0eM r0 = r2.A04
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.3t3 r0 = r2.A01
            if (r0 != 0) goto L_0x0112
            X.C66580MXl.A18()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0112:
            X.3t0 r0 = (X.C254763t0) r0
            java.lang.String r4 = r0.A00
            r0 = 41
            X.Phi r3 = new X.Phi
            r3.<init>(r5, r2, r0)
            r12 = 0
            boolean r10 = X.C51973G9u.A1b(r1, r4, r5)
            X.1vn r2 = X.1vm.A01(r1)
            java.lang.String r7 = "EVERYONE"
            boolean r0 = r5.equals(r7)
            if (r0 != 0) goto L_0x013f
            java.lang.String r1 = "PEOPLE_YOU_FOLLOW"
            boolean r0 = r5.equals(r1)
            if (r0 != 0) goto L_0x013e
            java.lang.String r1 = "ONLY_YOU"
            boolean r0 = r5.equals(r1)
            if (r0 == 0) goto L_0x013f
        L_0x013e:
            r7 = r1
        L_0x013f:
            X.2IS r6 = X.C41845B3m.A04()
            X.2IS r9 = X.C41845B3m.A04()
            X.0K0 r8 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r11 = 0
            java.lang.String r0 = "ig_thread_igid"
            X.0Df r4 = X.C41845B3m.A03(r8, r4, r0)
            java.lang.String r1 = "metadata"
            X.2IV r5 = r6.A00
            X.0Df r0 = r5.A02()
            r0.A0E(r4, r1)
            java.lang.String r0 = "nickname_setting"
            X.0Df r4 = X.C41845B3m.A03(r8, r7, r0)
            java.lang.String r1 = "data"
            X.0Df r0 = r5.A02()
            r0.A0E(r4, r1)
            X.1vR r5 = X.C41845B3m.A05()
            java.util.Map r7 = r6.getParamsCopy()
            java.util.Map r8 = r9.getParamsCopy()
            java.lang.Class<com.instagram.direct.request.graphql.IGDirectNicknameSettingChangeQueryResponseImpl> r9 = com.instagram.direct.request.graphql.IGDirectNicknameSettingChangeQueryResponseImpl.class
            java.util.ArrayList r15 = X.AnonymousClass7TE.A1C()
            java.lang.String r6 = "IGDirectNicknameSettingChangeQuery"
            java.lang.String r14 = "xig_direct_change_nickname_settings"
            com.facebook.pando.PandoGraphQLRequest r4 = new com.facebook.pando.PandoGraphQLRequest
            r13 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0 = 8
            X.On7 r1 = new X.On7
            r1.<init>(r3, r0)
            X.On0 r0 = X.C71565On0.A00
            r2.ATL(r0, r1, r4)
            return
        L_0x0193:
            java.lang.Object r4 = r6.A02
            X.ONj r4 = (X.C70837ONj) r4
            java.lang.String r0 = A00(r6, r2)
            X.0qQ.A07(r0)
            X.ODT r3 = X.C69886Nto.A00(r0)
            if (r3 != 0) goto L_0x01ac
            r2 = 0
            r1 = -1
            r0 = 0
            X.ODT r3 = new X.ODT
            r3.<init>(r2, r1, r0)
        L_0x01ac:
            X.Psn r0 = r4.A03
            r0.FKB(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71473OlH.onCheckedChanged(android.widget.RadioGroup, int):void");
    }
}
