package X;

import android.app.Application;
import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.ONk  reason: case insensitive filesystem */
public final class C70838ONk {
    public boolean A00 = true;
    public final UserSession A01;
    public final AnonymousClass65E A02;
    public final NUX A03;
    public final C70967OTo A04;
    public final C70714OHj A05;
    public final ODU A06;
    public final ODV A07;
    public final C70674OFv A08;
    public final ODW A09;
    public final C70675OFw A0A;
    public final C70971OTs A0B;
    public final C67458MoD A0C;
    public final O6E A0D;
    public final C67460MoF A0E;

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d7, code lost:
        r12 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0029, code lost:
        if (r28 != X.C69295Niv.Exists) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(androidx.fragment.app.Fragment r25, X.C74312Pso r26, X.C69295Niv r27, X.C69295Niv r28, java.lang.Integer r29, boolean r30) {
        /*
            r24 = this;
            r11 = 0
            r0 = 1
            r20 = 3
            r3 = r26
            X.0qQ.A0B(r3, r0)
            r19 = 2
            r8 = 4
            r2 = r29
            r0 = r19
            X.0qQ.A0B(r2, r0)
            r5 = 5
            r23 = r25
            androidx.fragment.app.FragmentActivity r0 = r23.getActivity()
            r4 = r24
            X.65E r6 = r4.A02
            boolean r0 = r6.A02(r0)
            if (r0 == 0) goto L_0x002b
            X.Niv r0 = X.C69295Niv.Exists
            r1 = 1
            r7 = r28
            if (r7 == r0) goto L_0x002c
        L_0x002b:
            r1 = 0
        L_0x002c:
            X.Niv r0 = X.C69295Niv.Exists
            r7 = r27
            boolean r0 = X.AnonymousClass7TF.A1W(r7, r0)
            if (r1 != 0) goto L_0x02e3
            if (r0 != 0) goto L_0x02e3
            X.MoD r9 = r4.A0C
            long r12 = r9.A05()
            com.instagram.common.session.UserSession r6 = r6.A00
            r0 = 36597424926559028(0x82052a00710b34, double:3.2076971173331345E-306)
            long r6 = X.AnonymousClass65A.A00(r6, r0)
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x02db
            r6 = 0
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x02db
            long r0 = X.C51966G9m.A07(r12)
            double r6 = (double) r0
            r13 = 4725570615333879808(0x4194997000000000, double:8.64E7)
            double r6 = r6 / r13
            X.OTs r9 = r4.A0B
            int r1 = r9.A00
            java.util.List r0 = r9.A08
            java.lang.Object r0 = X.00k.A0J(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x02d8
            int r12 = r0.intValue()
        L_0x0070:
            java.util.List r0 = r9.A07
            java.lang.Object r0 = X.00k.A0J(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r10 = X.C66582MXn.A06(r0)
            double r0 = (double) r1
            int r9 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r9 < 0) goto L_0x02c2
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
        L_0x0083:
            int r1 = r0.intValue()
            r0 = r20
            if (r1 == r0) goto L_0x0267
            if (r1 == r8) goto L_0x01ba
            if (r1 != r5) goto L_0x00c4
            boolean r0 = r4.A00
            if (r0 == 0) goto L_0x00c4
            r4.A00 = r11
            X.OTo r10 = r4.A04
            androidx.fragment.app.FragmentActivity r15 = r23.getActivity()
            r18 = 1
            java.lang.Integer r17 = X.AnonymousClass05K.A00
            r0 = r17
            if (r2 != r0) goto L_0x00c4
            if (r15 == 0) goto L_0x00c4
            X.0eM r0 = r10.A06
            r22 = r0
            com.instagram.common.session.UserSession r0 = X.C66581MXm.A0S(r22)
            r8 = 36315949951487803(0x81052a008a0f3b, double:3.029691209689341E-306)
            boolean r0 = X.AnonymousClass65A.A02(r0, r8)
            if (r0 == 0) goto L_0x00c5
            X.MoD r0 = r10.A04
            X.0xa r1 = r0.A00
            java.lang.String r0 = "EB_BLOCK_RELEASE_IMPRESSION"
            boolean r0 = r1.getBoolean(r0, r11)
            if (r0 == 0) goto L_0x00c5
        L_0x00c4:
            return
        L_0x00c5:
            X.MoD r4 = r10.A04
            boolean r0 = X.C67458MoD.A04(r4)
            if (r0 != 0) goto L_0x016f
            r2 = 0
        L_0x00ce:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r16 = "EB_BLOCK_FIRST_SHOWN_TIMESTAMP_MS"
            if (r2 == 0) goto L_0x0166
            X.0xa r12 = r4.A00
            java.lang.String r3 = "EB_BlOCK_FIRST_SHOWN_TIMESTAMP_OVERRIDE_MS"
            r2 = 99999(0x1869f, float:1.40128E-40)
            int r3 = r12.getInt(r3, r2)
            if (r3 == r2) goto L_0x0166
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            if (r2 == 0) goto L_0x0166
            long r4 = java.lang.System.currentTimeMillis()
            long r0 = (long) r3
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r0 * r2
            long r4 = r4 - r0
        L_0x00f4:
            X.0eM r0 = r10.A08
            r21 = r0
            r21.getValue()
            long r0 = X.C51966G9m.A07(r4)
            double r4 = (double) r0
            double r4 = r4 / r13
            X.OTs r14 = r10.A03
            r13 = r30
            if (r30 == 0) goto L_0x0163
            long r2 = r14.A01
        L_0x0109:
            com.instagram.common.session.UserSession r0 = X.C66581MXm.A0S(r22)
            boolean r0 = X.AnonymousClass65A.A02(r0, r8)
            r8 = 0
            if (r0 == 0) goto L_0x0185
            double r0 = (double) r2
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x0185
            r1 = r23
            r0 = r18
            X.C70967OTo.A00(r15, r1, r10, r0, r13)
            com.instagram.common.session.UserSession r2 = r10.A01
            androidx.fragment.app.FragmentActivity r0 = r23.getActivity()
            if (r0 == 0) goto L_0x012c
            android.app.Application r8 = r0.getApplication()
        L_0x012c:
            java.lang.String r1 = "show HARD BLOCK RELEASE for days after hard block "
            int r0 = X.AnonymousClass1GB.A00(r4)
            java.lang.String r0 = X.002.A0O(r1, r0)
            X.C69902Nu4.A00(r2, r8, r0)
            if (r30 != 0) goto L_0x0179
            android.content.Context r1 = r23.requireContext()
            java.lang.Integer r0 = X.AnonymousClass05K.A1I
            X.OO6 r1 = X.C69891Ntt.A00(r1, r2, r0)
            X.0eM r0 = r10.A07
            java.lang.Object r3 = X.AnonymousClass7TE.A14(r0)
            X.1a8 r3 = (X.1a8) r3
            X.P0v r2 = new X.P0v
            r2.<init>(r10)
            r0 = r19
            X.0qQ.A0B(r3, r0)
            r0 = r17
            X.1aU r1 = r1.A04(r3, r0)
            r0 = r20
            X.PU8.A00(r1, r3, r2, r0)
            return
        L_0x0163:
            long r2 = r14.A02
            goto L_0x0109
        L_0x0166:
            X.0xa r12 = r4.A00
            r2 = r16
            long r4 = r12.getLong(r2, r0)
            goto L_0x00f4
        L_0x016f:
            X.0xa r1 = r4.A00
            java.lang.String r0 = "EB_SHOULD_OVERRIDE_CUTOVER_TIMESTAMP"
            boolean r2 = r1.getBoolean(r0, r11)
            goto L_0x00ce
        L_0x0179:
            X.0xY r3 = r12.AR4()
            java.lang.String r1 = "EB_BLOCK_RELEASE_IMPRESSION"
            r0 = r18
            r3.E5T(r1, r0)
            goto L_0x01b6
        L_0x0185:
            int r3 = r14.A00
            double r0 = (double) r3
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x00c4
            r0 = r23
            X.C70967OTo.A00(r15, r0, r10, r11, r13)
            com.instagram.common.session.UserSession r1 = r10.A01
            androidx.fragment.app.FragmentActivity r0 = r23.getActivity()
            if (r0 == 0) goto L_0x019d
            android.app.Application r8 = r0.getApplication()
        L_0x019d:
            java.lang.String r0 = "show HARD BLOCK for interval "
            java.lang.String r0 = X.002.A0O(r0, r3)
            X.C69902Nu4.A00(r1, r8, r0)
            r21.getValue()
            long r1 = java.lang.System.currentTimeMillis()
            X.0xY r3 = r12.AR4()
            r0 = r16
            r3.E5c(r0, r1)
        L_0x01b6:
            r3.apply()
            return
        L_0x01ba:
            X.OFw r5 = r4.A0A
            androidx.fragment.app.FragmentActivity r10 = r23.getActivity()
            if (r10 == 0) goto L_0x00c4
            X.OTs r0 = r5.A02
            java.util.List r0 = r0.A08
            java.util.List r0 = X.00k.A0Y(r0)
            java.util.Iterator r9 = r0.iterator()
        L_0x01ce:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00c4
            int r4 = X.AnonymousClass7TG.A0F(r9)
            double r0 = (double) r4
            int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r8 < 0) goto L_0x01ce
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            if (r6 == 0) goto L_0x00c4
            X.MoD r8 = r5.A03
            X.0xa r7 = r8.A00
            java.lang.String r1 = "EB_WARN_SOFT_BLOCK_INTERVALS_EXHAUSTED"
            r0 = 0
            java.lang.String r0 = r7.getString(r1, r0)
            if (r0 == 0) goto L_0x0243
            java.util.Set r0 = X.C67458MoD.A02(r0)
        L_0x01f4:
            java.lang.Integer r15 = X.AnonymousClass05K.A0Y
            boolean r7 = r8.A0A(r15, r4)
            boolean r1 = r0.contains(r6)
            if (r1 != 0) goto L_0x0246
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            if (r2 != r1) goto L_0x0246
            X.PYP r2 = new X.PYP
            r2.<init>(r5, r4)
            r0 = 500(0x1f4, double:2.47E-321)
            X.11Z.A04(r2, r0)
            X.0eM r1 = r5.A04
            boolean r0 = X.C66582MXn.A1X(r1)
            if (r0 == 0) goto L_0x0240
            java.lang.Object r0 = r1.getValue()
            X.65E r0 = (X.AnonymousClass65E) r0
            boolean r0 = r0.A02(r10)
            if (r0 == 0) goto L_0x0240
            X.Njy r12 = X.C69358Njy.GDRIVE_OPTIN_SOFT_BLOCK
        L_0x0224:
            X.OW5 r9 = r5.A01
            java.lang.Integer r14 = X.AnonymousClass05K.A1I
            X.NiX r13 = X.C69271NiX.BOTTOM_SHEET
            android.os.Bundle r11 = X.AnonymousClass7TE.A0a()
            r16 = r6
            r9.A01(r10, r11, r12, r13, r14, r15, r16)
            com.instagram.common.session.UserSession r3 = r5.A00
            android.app.Application r2 = r10.getApplication()
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "show WARN soft block for interval "
            goto L_0x02b2
        L_0x0240:
            X.Njy r12 = X.C69358Njy.CREATE_PIN_SELL_WARN_NUX_V3
            goto L_0x0224
        L_0x0243:
            X.0sl r0 = X.0sl.A00
            goto L_0x01f4
        L_0x0246:
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L_0x00c4
            if (r7 != 0) goto L_0x00c4
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r2 != r0) goto L_0x00c4
            r8.A07(r4, r15)
            X.Nit r0 = X.C69293Nit.V3_WARN_BANNER
            r3.CnM(r0, r4)
            com.instagram.common.session.UserSession r3 = r5.A00
            android.app.Application r2 = r10.getApplication()
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "show WARN banner for interval "
            goto L_0x02b2
        L_0x0267:
            X.ODW r8 = r4.A09
            androidx.fragment.app.FragmentActivity r9 = r23.getActivity()
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r2 != r0) goto L_0x00c4
            X.OTs r0 = r8.A01
            java.util.List r0 = r0.A07
            java.util.List r0 = X.00k.A0Y(r0)
            java.util.Iterator r5 = r0.iterator()
        L_0x027d:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00c4
            int r4 = X.AnonymousClass7TG.A0F(r5)
            double r1 = (double) r4
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x027d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            if (r0 == 0) goto L_0x00c4
            X.MoD r2 = r8.A02
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            boolean r0 = r2.A0A(r1, r4)
            if (r0 != 0) goto L_0x00c4
            r2.A07(r4, r1)
            X.Nit r0 = X.C69293Nit.V3_SELL_BANNER
            r3.CnM(r0, r4)
            com.instagram.common.session.UserSession r3 = r8.A00
            if (r9 == 0) goto L_0x02c0
            android.app.Application r2 = r9.getApplication()
        L_0x02ac:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "show SELL banner for interval "
        L_0x02b2:
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            X.C69902Nu4.A00(r3, r2, r0)
            return
        L_0x02c0:
            r2 = 0
            goto L_0x02ac
        L_0x02c2:
            double r0 = (double) r12
            int r9 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r9 < 0) goto L_0x02cb
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            goto L_0x0083
        L_0x02cb:
            double r0 = (double) r10
            int r9 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r9 < 0) goto L_0x02d4
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            goto L_0x0083
        L_0x02d4:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x0083
        L_0x02d8:
            r12 = 6
            goto L_0x0070
        L_0x02db:
            long r0 = java.lang.System.currentTimeMillis()
            r9.A09(r0)
            return
        L_0x02e3:
            X.NUX r2 = r4.A03
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            java.lang.String r0 = "DEVICE_ONBOARDED_WITH_PORTABLE_KEY"
            r2.A0H(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70838ONk.A00(androidx.fragment.app.Fragment, X.Pso, X.Niv, X.Niv, java.lang.Integer, boolean):void");
    }

    public final void A01(Fragment fragment, C74312Pso pso, C69295Niv niv, C69295Niv niv2, Integer num, boolean z) {
        ODV odv;
        FragmentActivity activity;
        int A0F;
        Application application;
        int i;
        int i2;
        UserSession userSession;
        String str;
        Fragment fragment2 = fragment;
        C74312Pso pso2 = pso;
        boolean A1U = AnonymousClass7TF.A1U(0, fragment2, pso2);
        C69295Niv niv3 = niv;
        C69295Niv niv4 = niv2;
        Integer num2 = num;
        C51974G9v.A1M(num2, niv3, niv4);
        UserSession userSession2 = this.A02.A00;
        if (AnonymousClass65A.A02(userSession2, 36315949950963509L)) {
            Application application2 = null;
            0xY AR4 = this.A0D.A00.AR4();
            if (!z) {
                AR4.E5T("eb_primary_device_onboarding_impression", false);
                AR4.apply();
                userSession = this.A01;
                FragmentActivity activity2 = fragment2.getActivity();
                if (activity2 != null) {
                    application2 = activity2.getApplication();
                }
                str = "NOT Primary Device - Hide Onboarding";
            } else {
                AR4.E5T("eb_primary_device_onboarding_impression", A1U);
                AR4.apply();
                userSession = this.A01;
                FragmentActivity activity3 = fragment2.getActivity();
                if (activity3 != null) {
                    application2 = activity3.getApplication();
                }
                str = "Primary Device - Hide Onboarding";
            }
            C69902Nu4.A00(userSession, application2, str);
            this.A03.A0H("PRIMARY_DEVICE_TARGETING_ONBOARDING", AnonymousClass05K.A0C);
            return;
        }
        C67458MoD moD = this.A0C;
        long A052 = moD.A05();
        if (A052 < AnonymousClass65A.A00(userSession2, 36597424926559028L)) {
            A052 = 0;
        }
        if (moD.A00.getBoolean("EB_BLOCKSTORE_SETUP_FAILED", false)) {
            A00(fragment2, pso2, niv3, niv4, num2, false);
        } else {
            if (A052 == 0) {
                NUX nux = this.A03;
                Integer num3 = AnonymousClass05K.A00;
                nux.A0H("SHOW_ONBOARDING", num3);
                odv = this.A07;
                activity = fragment2.getActivity();
                if (num2 == num3) {
                    List list = odv.A01.A03;
                    Number number = (Number) 00k.A0J(list);
                    if (number != null) {
                        i = Math.abs(number.intValue());
                    } else {
                        i = 7;
                    }
                    A0F = -i;
                    C67458MoD moD2 = odv.A02;
                    moD2.A07(A0F, AnonymousClass05K.A01);
                    pso2.CnM(C69293Nit.V3_INTRODUCE_BANNER, A0F);
                    Number number2 = (Number) 00k.A0J(list);
                    if (number2 != null) {
                        i2 = Math.abs(number2.intValue());
                    } else {
                        i2 = 7;
                    }
                    moD2.A09(System.currentTimeMillis() + (((long) i2) * 86400000));
                }
            } else {
                long currentTimeMillis = A052 - System.currentTimeMillis();
                if (currentTimeMillis <= 0) {
                    C70714OHj oHj = this.A05;
                    Context context = fragment2.getContext();
                    FragmentActivity activity4 = fragment2.getActivity();
                    UserSession userSession3 = oHj.A02.A00;
                    Integer A0j = JTP.A0j(AnonymousClass65A.A02(userSession3, 36326627231348619L) ? 1 : 0);
                    if (oHj.A00 || context == null || activity4 == null || num2 != A0j) {
                        ((NUX) oHj.A06.getValue()).A0H("CUTOVER_INVALID", AnonymousClass05K.A0C);
                    } else {
                        oHj.A00 = A1U;
                        UserSession userSession4 = oHj.A01;
                        C69902Nu4.A00(userSession4, activity4.getApplication(), "show CUTOVER screen");
                        Integer num4 = AnonymousClass05K.A00;
                        ((NUX) oHj.A06.getValue()).A0H("SHOW_ONBOARDING", num4);
                        OW5 ow5 = oHj.A03;
                        C69358Njy njy = C69358Njy.E2EE_NUX_V3;
                        Integer num5 = AnonymousClass05K.A02;
                        ow5.A01(activity4, AnonymousClass7TE.A0a(), njy, C69271NiX.BOTTOM_SHEET, num5, AnonymousClass05K.A0C, 0);
                        new OKI(userSession4).A00(activity4, (1a8) AnonymousClass7TE.A14(oHj.A07), num5, num4, new C74193PqZ(oHj, 35), AnonymousClass65A.A02(userSession3, 2342158959163412260L));
                    }
                } else {
                    NUX nux2 = this.A03;
                    Integer num6 = AnonymousClass05K.A00;
                    nux2.A0H("SHOW_ONBOARDING", num6);
                    odv = this.A07;
                    activity = fragment2.getActivity();
                    if (num2 == num6) {
                        double d = ((double) currentTimeMillis) / 8.64E7d;
                        Iterator it = 00k.A0Y(odv.A01.A03).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            A0F = AnonymousClass7TG.A0F(it);
                            if (d <= ((double) Math.abs(A0F))) {
                                if (Integer.valueOf(A0F) != null) {
                                    C67458MoD moD3 = odv.A02;
                                    Integer num7 = AnonymousClass05K.A01;
                                    if (!moD3.A0A(num7, A0F)) {
                                        moD3.A07(A0F, num7);
                                        pso2.CnM(C69293Nit.V3_INTRODUCE_BANNER, A0F);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            UserSession userSession5 = odv.A00;
            if (activity != null) {
                application = activity.getApplication();
            } else {
                application = null;
            }
            C69902Nu4.A00(userSession5, application, 002.A0O("show INTRODUCE banner for interval ", A0F));
        }
        double A072 = ((double) C51966G9m.A07(A052)) / 8.64E7d;
        if (this.A0E.A00()) {
            A02(fragment2, pso2, num2, A072);
        }
    }

    public /* synthetic */ C70838ONk(UserSession userSession) {
        UserSession userSession2 = userSession;
        C70971OTs oTs = new C70971OTs(userSession2);
        C67458MoD moD = new C67458MoD(userSession2);
        ODV odv = new ODV(userSession2);
        C70674OFv oFv = new C70674OFv(userSession2);
        ODU odu = new ODU(userSession2);
        C67460MoF moF = new C67460MoF(userSession2);
        C70714OHj oHj = new C70714OHj(userSession2);
        ODW odw = new ODW(userSession2);
        C70675OFw oFw = new C70675OFw(userSession2);
        C70967OTo oTo = new C70967OTo(userSession2);
        AnonymousClass65E A002 = AnonymousClass65D.A00(userSession2);
        O6E o6e = new O6E(userSession2);
        NUX A003 = C69895Ntx.A00(userSession2);
        DbW.A1P(userSession2, 1, A002);
        0qQ.A0B(A003, 14);
        this.A01 = userSession2;
        this.A0B = oTs;
        this.A0C = moD;
        this.A07 = odv;
        this.A08 = oFv;
        this.A06 = odu;
        this.A0E = moF;
        this.A05 = oHj;
        this.A09 = odw;
        this.A0A = oFw;
        this.A04 = oTo;
        this.A02 = A002;
        this.A0D = o6e;
        this.A03 = A003;
    }

    public final void A02(Fragment fragment, C74312Pso pso, Integer num, double d) {
        int i;
        int i2;
        double d2;
        int A0F;
        UserSession userSession;
        Application application;
        Application application2;
        StringBuilder A1A;
        String str;
        C74312Pso pso2 = pso;
        Integer num2 = num;
        Fragment fragment2 = fragment;
        AnonymousClass7TG.A1U(fragment2, pso2, num2);
        FragmentActivity activity = fragment2.getActivity();
        C70971OTs oTs = this.A0B;
        Number number = (Number) 00k.A0J(oTs.A04);
        if (number != null) {
            i = number.intValue();
        } else {
            i = 7;
        }
        Number number2 = (Number) 00k.A0J(oTs.A05);
        if (number2 != null) {
            i2 = number2.intValue();
        } else {
            i2 = 2;
        }
        if (d >= ((double) i)) {
            C67460MoF moF = this.A0E;
            if (182.A06(moF.A00, moF.A01, 36326455432525582L)) {
                ODU odu = this.A06;
                if (num2 == AnonymousClass05K.A00) {
                    Iterator it = 00k.A0Y(odu.A01.A04).iterator();
                    while (it.hasNext()) {
                        A0F = AnonymousClass7TG.A0F(it);
                        if (d >= ((double) A0F)) {
                            if (Integer.valueOf(A0F) != null) {
                                C67458MoD moD = odu.A02;
                                Integer num3 = AnonymousClass05K.A0u;
                                if (!moD.A0A(num3, A0F)) {
                                    moD.A07(A0F, num3);
                                    pso2.CnM(C69293Nit.MEX_EB_UPSELL_BANNER, A0F);
                                    userSession = odu.A00;
                                    if (activity != null) {
                                        application2 = activity.getApplication();
                                    } else {
                                        application2 = null;
                                    }
                                    A1A = AnonymousClass7TE.A1A();
                                    str = "show ebupsell banner for interval ";
                                    A1A.append(str);
                                    A1A.append(A0F);
                                    C69902Nu4.A00(userSession, application2, A1A.toString());
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
        if (d >= ((double) i2)) {
            C70674OFv oFv = this.A08;
            0xa r7 = oFv.A03.A00;
            float f = r7.getFloat("CUSTOM_DISK_SPACE_THRESHOLD", 0.0f);
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            long availableBlocksLong = (statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) / 1073741824;
            C67460MoF moF2 = oFv.A04;
            UserSession userSession2 = moF2.A01;
            0Tu r9 = moF2.A00;
            double A002 = 182.A00(r9, userSession2, 37170880362775058L);
            boolean z = true;
            if (182.A06(r9, userSession2, 36326455433312018L)) {
                d2 = (double) f;
            } else {
                d2 = (double) availableBlocksLong;
            }
            if (0.0d > d2 || d2 > A002) {
                z = false;
            }
            if (moF2.A00() && z && DbT.A1a(r7, "MEX_EB_LOW_STORAGE_MODE_TOGGLE_SHOWN") && num2 == AnonymousClass05K.A00) {
                Iterator it2 = 00k.A0Y(oFv.A01.A05).iterator();
                while (it2.hasNext()) {
                    A0F = AnonymousClass7TG.A0F(it2);
                    if (d >= ((double) A0F)) {
                        if (Integer.valueOf(A0F) != null) {
                            C67458MoD moD2 = oFv.A02;
                            Integer num4 = AnonymousClass05K.A15;
                            if (!moD2.A0A(num4, A0F)) {
                                moD2.A07(A0F, num4);
                                pso2.CnM(C69293Nit.MEX_EB_LOW_DISK_SPACE_BANNER, A0F);
                                userSession = oFv.A00;
                                if (activity != null) {
                                    application = activity.getApplication();
                                } else {
                                    application = null;
                                }
                                A1A = AnonymousClass7TE.A1A();
                                str = "show LowDiskSpace banner for interval ";
                                A1A.append(str);
                                A1A.append(A0F);
                                C69902Nu4.A00(userSession, application2, A1A.toString());
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }
}
