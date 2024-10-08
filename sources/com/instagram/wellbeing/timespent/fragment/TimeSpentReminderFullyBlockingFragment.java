package com.instagram.wellbeing.timespent.fragment;

import X.02m;
import X.0Tu;
import X.0oI;
import X.0qQ;
import X.2Au;
import X.2Ay;
import X.2B0;
import X.2B1;
import X.2Ct;
import X.2Cu;
import X.AnonymousClass0fD;
import X.AnonymousClass0fU;
import X.AnonymousClass0wW;
import X.AnonymousClass16q;
import X.AnonymousClass3FV;
import X.AnonymousClass3HA;
import X.AnonymousClass4DH;
import X.AnonymousClass4DR;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C227842k3;
import X.C267504bf;
import X.C317756nm;
import X.C49253Erw;
import X.C50070FNl;
import X.C50109FOz;
import X.C51317FsB;
import X.DbU;
import X.DbV;
import X.DbW;
import X.DbX;
import X.DbY;
import X.Dba;
import X.EWJ;
import X.FO6;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.api.schemas.ScreenTimeScreenType;
import com.instagram.api.schemas.XFBYPRequestStatus;
import com.instagram.common.session.UserSession;

public final class TimeSpentReminderFullyBlockingFragment extends AnonymousClass4DH implements AnonymousClass4DR {
    public View A00;
    public UserSession A01;
    public 2Ay A02;
    public EWJ A03 = null;
    public int A04 = 0;
    public 2Cu A05;
    public final Handler A06 = AnonymousClass7TF.A0D();
    public final Runnable A07 = new C51317FsB(this);
    public final boolean A08 = 2Au.A01(this.A01);

    private void A01(View view) {
        View.OnClickListener fOz;
        if (this.A02 == 2Ay.A03) {
            UserSession userSession = this.A01;
            2B1 r1 = 2B0.A01;
            if (!r1.A0E(userSession) || AnonymousClass3FV.A0A(this.A01)) {
                View requireViewById = view.requireViewById(R.id.footer_button);
                requireViewById.setVisibility(0);
                if (!r1.A0E(this.A01) || !AnonymousClass3FV.A07(this.A01)) {
                    fOz = new C50109FOz((Object) this, 20);
                } else {
                    AnonymousClass16q C31 = DbV.A0k(this.A01).C31();
                    if (C31 != null) {
                        C267504bf BLd = C31.BLd();
                        if (BLd == null || BLd.BzL() != XFBYPRequestStatus.PENDING) {
                            requireViewById.setEnabled(true);
                        } else {
                            requireViewById.setEnabled(false);
                        }
                    }
                    Context context = getContext();
                    if (context != null) {
                        fOz = new FO6(19, this, context, this, requireViewById);
                    } else {
                        return;
                    }
                }
                AnonymousClass0fU.A00(fOz, requireViewById);
            }
        }
    }

    private void A03(TextView textView) {
        boolean A1Y = DbY.A1Y(0Tu.A05, this.A01, 36324969373774361L);
        int i = 2131973150;
        if (A1Y) {
            i = 2131957368;
        }
        textView.setText(i);
        textView.setTextColor(A00());
        AnonymousClass0fU.A00(new C50070FNl(10, this, this, A1Y), textView);
    }

    private void A04(TextView textView) {
        if (this.A02 != 2Ay.A03 || !0oI.A0C(requireContext()) || !Dba.A1W(this) || AnonymousClass3FV.A0A(this.A01)) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(2131963246);
        textView.setTextColor(A00());
        C50109FOz.A00(textView, 17, this);
    }

    public final String getModuleName() {
        int ordinal = this.A02.ordinal();
        if (ordinal == 2) {
            return "take_a_break";
        }
        if (ordinal != 0) {
            if (ordinal == 7 || ordinal == 6 || ordinal == 8) {
                return "quiet_mode";
            }
        } else if (!Dba.A1W(this)) {
            return "daily_limit";
        }
        return "guardian_daily_limit_reached";
    }

    public final AnonymousClass0wW getSession() {
        return this.A01;
    }

    public final C227842k3 getStatusBarType() {
        return C227842k3.FORCED_DARK_MODE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        requireActivity().moveTaskToBack(true);
        r4 = r6.A01;
        X.DbT.A1T(r4, X.AnonymousClass05K.A00, r6.A02.A00, X.Dba.A02(X.2Aq.A03(r4), r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0034, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onBackPressed() {
        /*
            r6 = this;
            X.2Ay r2 = r6.A02
            int r0 = r2.ordinal()
            r5 = 1
            switch(r0) {
                case 0: goto L_0x000c;
                case 1: goto L_0x000a;
                case 2: goto L_0x000b;
                case 3: goto L_0x0035;
                case 4: goto L_0x0035;
                case 5: goto L_0x001a;
                case 6: goto L_0x000b;
                case 7: goto L_0x000b;
                case 8: goto L_0x0035;
                default: goto L_0x000a;
            }
        L_0x000a:
            r5 = 0
        L_0x000b:
            return r5
        L_0x000c:
            boolean r0 = X.Dba.A1W(r6)
            if (r0 == 0) goto L_0x000b
            com.instagram.common.session.UserSession r0 = r6.A01
            boolean r0 = X.AnonymousClass3FV.A08(r0)
            if (r0 != 0) goto L_0x000b
        L_0x001a:
            androidx.fragment.app.FragmentActivity r0 = r6.requireActivity()
            r0.moveTaskToBack(r5)
            com.instagram.common.session.UserSession r4 = r6.A01
            X.2Ay r0 = r6.A02
            java.lang.String r3 = r0.A00
            X.2Aq r0 = X.2Aq.A03(r4)
            long r1 = X.Dba.A02(r0, r4)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.DbT.A1T(r4, r0, r3, r1)
            return r5
        L_0x0035:
            java.lang.String r1 = "Unrecognized reminder type "
            java.lang.String r0 = r2.A00
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.String r0 = "TimeSpentReminderFullyBlockingFragment_shouldFinishActivityUponResume"
            X.0wb.A03(r0, r1)
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment.onBackPressed():boolean");
    }

    private int A00() {
        return requireContext().getColor(R.color.design_dark_default_color_on_background);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0346, code lost:
        if (r13.A03 == X.EWJ.IG_TS_ENTRY_POINT_TAKE_A_BREAK_FIRST_TIME_BLOCKING) goto L_0x0348;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A02(android.view.View r14) {
        /*
            r13 = this;
            r0 = 2131433724(0x7f0b18fc, float:1.8489242E38)
            android.widget.TextView r2 = X.DbU.A0G(r14, r0)
            r0 = 2131433721(0x7f0b18f9, float:1.8489236E38)
            android.widget.TextView r7 = X.DbU.A0G(r14, r0)
            android.content.Context r11 = r13.getContext()
            X.2Ay r3 = r13.A02
            int r0 = r3.ordinal()
            r9 = 2
            r8 = 1
            r6 = 0
            switch(r0) {
                case 0: goto L_0x0096;
                case 1: goto L_0x001e;
                case 2: goto L_0x02f8;
                case 3: goto L_0x02ea;
                case 4: goto L_0x02ea;
                case 5: goto L_0x01ea;
                case 6: goto L_0x001f;
                case 7: goto L_0x001f;
                case 8: goto L_0x02ea;
                default: goto L_0x001e;
            }
        L_0x001e:
            return
        L_0x001f:
            android.content.res.Resources r4 = X.DbV.A05(r13)
            boolean r8 = r13.A08
            r3 = 2131971181(0x7f134c6d, float:1.9579334E38)
            if (r8 == 0) goto L_0x002d
            r3 = 2131973928(0x7f135728, float:1.9584906E38)
        L_0x002d:
            android.content.res.Resources r1 = X.DbV.A05(r13)
            r0 = 2131951730(0x7f130072, float:1.9539883E38)
            r6 = 2131951730(0x7f130072, float:1.9539883E38)
            java.lang.String r0 = r1.getString(r0)
            X.DbY.A0y(r4, r2, r0, r3)
            int r0 = r13.A00()
            r2.setTextColor(r0)
            com.instagram.common.session.UserSession r0 = r13.A01
            X.3FW r10 = new X.3FW
            r10.<init>(r0)
            android.content.res.Resources r5 = X.DbV.A05(r13)
            r4 = 2131971180(0x7f134c6c, float:1.9579332E38)
            if (r8 == 0) goto L_0x0058
            r4 = 2131973927(0x7f135727, float:1.9584904E38)
        L_0x0058:
            long r2 = r10.A01()
            int r9 = (int) r2
            long r0 = (long) r9
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 != 0) goto L_0x02e4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            android.content.Context r0 = r13.requireContext()
            java.lang.String r9 = X.C49927FFd.A00(r0, r1)
            long r2 = r10.A00()
            int r10 = (int) r2
            long r0 = (long) r10
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 != 0) goto L_0x02de
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            android.content.Context r0 = r13.requireContext()
            java.lang.String r1 = X.C49927FFd.A00(r0, r1)
            android.content.res.Resources r0 = X.DbV.A05(r13)
            java.lang.String r0 = r0.getString(r6)
            java.lang.Object[] r0 = new java.lang.Object[]{r9, r1, r0}
            java.lang.String r1 = r5.getString(r4, r0)
            goto L_0x0246
        L_0x0096:
            boolean r0 = X.Dba.A1W(r13)
            if (r0 == 0) goto L_0x01bd
            com.instagram.common.session.UserSession r0 = r13.A01
            boolean r0 = X.AnonymousClass3FV.A08(r0)
            if (r0 != 0) goto L_0x01bd
            if (r11 == 0) goto L_0x00f5
            boolean r0 = X.0oI.A09(r11)
            if (r0 == 0) goto L_0x00f5
            com.instagram.common.session.UserSession r4 = r13.A01
            X.0Tu r3 = X.DbS.A0J(r4, r6)
            r0 = 36325746763052226(0x810e13000334c2, double:3.035886752771276E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x00f5
            r0 = 2131957354(0x7f13166a, float:1.955129E38)
            java.lang.String r3 = r13.getString(r0)
            com.instagram.common.session.UserSession r1 = r13.A01
            X.2Cd r0 = new X.2Cd
            r0.<init>(r1)
            long r0 = r0.A00()
            android.content.res.Resources r10 = X.DbV.A05(r13)
            r9 = 2131957351(0x7f131667, float:1.9551283E38)
            java.lang.Object[] r5 = new java.lang.Object[r8]
            android.content.res.Resources r4 = X.DbV.A05(r13)
            java.lang.String r0 = X.C49927FFd.A02(r4, r0)
        L_0x00e0:
            r5[r6] = r0
            java.lang.String r0 = r10.getString(r9, r5)
            r7.setText(r0)
        L_0x00e9:
            r2.setText(r3)
            int r0 = r13.A00()
            r2.setTextColor(r0)
            goto L_0x0249
        L_0x00f5:
            com.instagram.common.session.UserSession r0 = r13.A01
            boolean r0 = X.AnonymousClass3FV.A0A(r0)
            if (r0 == 0) goto L_0x018b
            r0 = 2131957354(0x7f13166a, float:1.955129E38)
            java.lang.String r3 = r13.getString(r0)
            com.instagram.common.session.UserSession r1 = r13.A01
            X.2Cd r0 = new X.2Cd
            r0.<init>(r1)
            long r0 = r0.A00()
            android.content.res.Resources r10 = X.DbV.A05(r13)
            r9 = 2131957349(0x7f131665, float:1.955128E38)
            if (r11 == 0) goto L_0x0183
            boolean r4 = X.0oI.A09(r11)
            if (r4 == 0) goto L_0x0183
            android.content.res.Resources r5 = X.DbV.A05(r13)
            r4 = 2131951625(0x7f130009, float:1.953967E38)
        L_0x0125:
            java.lang.String r5 = r5.getString(r4)
            android.content.res.Resources r4 = X.DbV.A05(r13)
            java.lang.String r0 = X.C49927FFd.A02(r4, r0)
            java.lang.String r0 = X.DbV.A0w(r10, r5, r0, r9)
            r7.setText(r0)
            com.instagram.common.session.UserSession r0 = r13.A01
            X.4Cl r0 = X.DbV.A0k(r0)
            X.16q r0 = r0.C31()
            if (r0 == 0) goto L_0x00e9
            X.4bf r4 = r0.BLd()
            if (r4 == 0) goto L_0x00e9
            com.instagram.api.schemas.XFBYPRequestStatus r1 = r4.BzL()
            com.instagram.api.schemas.XFBYPRequestStatus r0 = com.instagram.api.schemas.XFBYPRequestStatus.REJECTED
            if (r1 != r0) goto L_0x00e9
            r1 = 2131957355(0x7f13166b, float:1.9551292E38)
            java.lang.String r0 = r4.Ava()
            java.lang.String r3 = X.DbV.A0z(r13, r0, r1)
            android.content.res.Resources r10 = X.DbV.A05(r13)
            r9 = 2131957350(0x7f131666, float:1.9551281E38)
            java.lang.Object[] r5 = new java.lang.Object[r8]
            if (r11 == 0) goto L_0x017b
            boolean r0 = X.0oI.A09(r11)
            if (r0 == 0) goto L_0x017b
            android.content.res.Resources r1 = X.DbV.A05(r13)
            r0 = 2131951625(0x7f130009, float:1.953967E38)
        L_0x0175:
            java.lang.String r0 = r1.getString(r0)
            goto L_0x00e0
        L_0x017b:
            android.content.res.Resources r1 = X.DbV.A05(r13)
            r0 = 2131951730(0x7f130072, float:1.9539883E38)
            goto L_0x0175
        L_0x0183:
            android.content.res.Resources r5 = X.DbV.A05(r13)
            r4 = 2131951730(0x7f130072, float:1.9539883E38)
            goto L_0x0125
        L_0x018b:
            if (r11 == 0) goto L_0x01b1
            boolean r0 = X.0oI.A09(r11)
            if (r0 == 0) goto L_0x01b1
            android.content.res.Resources r4 = X.DbV.A05(r13)
            r3 = 2131957364(0x7f131674, float:1.955131E38)
            android.content.res.Resources r1 = X.DbV.A05(r13)
            r0 = 2131951625(0x7f130009, float:1.953967E38)
            java.lang.String r0 = r1.getString(r0)
            java.lang.String r3 = X.AnonymousClass7TF.A0e(r4, r0, r3)
        L_0x01a9:
            r0 = 2131957366(0x7f131676, float:1.9551314E38)
            r7.setText(r0)
            goto L_0x00e9
        L_0x01b1:
            android.content.res.Resources r1 = X.DbV.A05(r13)
            r0 = 2131957365(0x7f131675, float:1.9551312E38)
            java.lang.String r3 = r1.getString(r0)
            goto L_0x01a9
        L_0x01bd:
            com.instagram.common.session.UserSession r0 = r13.A01
            long r3 = X.AnonymousClass3FV.A02(r0)
            r0 = 2131957357(0x7f13166d, float:1.9551296E38)
            X.DbU.A1G(r2, r13, r0)
            int r0 = r13.A00()
            r2.setTextColor(r0)
            r0 = 2131957353(0x7f131669, float:1.9551288E38)
            java.lang.String r0 = r13.getString(r0)
            r2.setContentDescription(r0)
            r1 = 2131957356(0x7f13166c, float:1.9551294E38)
            android.content.res.Resources r0 = X.DbV.A05(r13)
            java.lang.String r0 = X.C49927FFd.A02(r0, r3)
            java.lang.String r1 = X.DbV.A0z(r13, r0, r1)
            goto L_0x0246
        L_0x01ea:
            com.instagram.common.session.UserSession r0 = r13.A01
            X.G8w r1 = X.C49953FGi.A02(r0)
            if (r1 == 0) goto L_0x001e
            java.lang.Integer r5 = r1.B1c()
            if (r5 == 0) goto L_0x001e
            com.instagram.common.session.UserSession r0 = r13.A01
            java.lang.Integer r0 = X.C49953FGi.A04(r1, r0)
            if (r0 == 0) goto L_0x0201
            r5 = r0
        L_0x0201:
            if (r11 == 0) goto L_0x0251
            boolean r0 = X.0oI.A09(r11)
            if (r0 == 0) goto L_0x0251
            com.instagram.common.session.UserSession r4 = r13.A01
            X.0Tu r3 = X.DbS.A0J(r4, r6)
            r0 = 36325746763052226(0x810e13000334c2, double:3.035886752771276E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x0251
            android.content.res.Resources r1 = X.DbV.A05(r13)
            r0 = 2131973964(0x7f13574c, float:1.9584979E38)
            java.lang.String r4 = r1.getString(r0)
            android.content.res.Resources r8 = X.DbV.A05(r13)
            r6 = 2131973940(0x7f135734, float:1.958493E38)
            android.content.Context r0 = r13.requireContext()
            java.lang.String r0 = X.C49927FFd.A00(r0, r5)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
        L_0x0238:
            java.lang.String r1 = r8.getString(r6, r0)
        L_0x023c:
            r2.setText(r4)
            int r0 = r13.A00()
            r2.setTextColor(r0)
        L_0x0246:
            r7.setText(r1)
        L_0x0249:
            int r0 = r13.A00()
            r7.setTextColor(r0)
            return
        L_0x0251:
            com.instagram.common.session.UserSession r0 = r13.A01
            boolean r0 = X.AnonymousClass3FV.A0A(r0)
            if (r0 == 0) goto L_0x029f
            android.content.res.Resources r3 = X.DbV.A05(r13)
            boolean r1 = r13.A08
            r0 = 2131972665(0x7f135239, float:1.9582344E38)
            if (r1 == 0) goto L_0x0267
            r0 = 2131973964(0x7f13574c, float:1.9584979E38)
        L_0x0267:
            java.lang.String r4 = r3.getString(r0)
            android.content.res.Resources r8 = X.DbV.A05(r13)
            r6 = 2131971189(0x7f134c75, float:1.957935E38)
            if (r1 == 0) goto L_0x0277
            r6 = 2131973938(0x7f135732, float:1.9584926E38)
        L_0x0277:
            android.content.Context r0 = r13.requireContext()
            java.lang.String r3 = X.C49927FFd.A00(r0, r5)
            if (r11 == 0) goto L_0x0297
            boolean r0 = X.0oI.A09(r11)
            if (r0 == 0) goto L_0x0297
            android.content.res.Resources r1 = X.DbV.A05(r13)
            r0 = 2131951625(0x7f130009, float:1.953967E38)
        L_0x028e:
            java.lang.String r0 = r1.getString(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r0}
            goto L_0x0238
        L_0x0297:
            android.content.res.Resources r1 = X.DbV.A05(r13)
            r0 = 2131951730(0x7f130072, float:1.9539883E38)
            goto L_0x028e
        L_0x029f:
            if (r11 == 0) goto L_0x02d2
            boolean r0 = X.0oI.A09(r11)
            if (r0 == 0) goto L_0x02d2
            android.content.res.Resources r4 = X.DbV.A05(r13)
            r3 = 2131957364(0x7f131674, float:1.955131E38)
            android.content.res.Resources r1 = X.DbV.A05(r13)
            r0 = 2131951625(0x7f130009, float:1.953967E38)
            java.lang.String r0 = r1.getString(r0)
            java.lang.String r4 = X.AnonymousClass7TF.A0e(r4, r0, r3)
        L_0x02bd:
            r3 = 2131972666(0x7f13523a, float:1.9582346E38)
            android.content.res.Resources r1 = X.DbV.A05(r13)
            android.content.Context r0 = r13.requireContext()
            java.lang.String r0 = X.C49927FFd.A00(r0, r5)
            java.lang.String r1 = X.AnonymousClass7TF.A0e(r1, r0, r3)
            goto L_0x023c
        L_0x02d2:
            android.content.res.Resources r1 = X.DbV.A05(r13)
            r0 = 2131972667(0x7f13523b, float:1.9582348E38)
            java.lang.String r4 = r1.getString(r0)
            goto L_0x02bd
        L_0x02de:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            r0.<init>()
            throw r0
        L_0x02e4:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            r0.<init>()
            throw r0
        L_0x02ea:
            java.lang.String r1 = "Unrecognized reminder type "
            java.lang.String r0 = r3.A00
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.String r0 = "TimeSpentReminderFullyBlockingFragment_setupView"
            X.0wb.A03(r0, r1)
            return
        L_0x02f8:
            com.instagram.common.session.UserSession r0 = r13.A01
            long r0 = X.DbW.A05(r0)
            int r5 = (int) r0
            if (r5 > 0) goto L_0x0303
            int r5 = r13.A04
        L_0x0303:
            r0 = 2131975006(0x7f135b5e, float:1.9587092E38)
            r2.setText(r0)
            int r0 = r13.A00()
            r2.setTextColor(r0)
            android.content.res.Resources r4 = X.DbV.A05(r13)
            r0 = 60
            int r5 = r5 / r0
            com.instagram.common.session.UserSession r3 = r13.A01
            X.0Tu r2 = X.DbS.A0J(r3, r6)
            r0 = 36313725149448399(0x810324000108cf, double:3.0282842359210634E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            java.lang.String r12 = X.C49927FFd.A01(r4, r5, r0, r6)
            com.instagram.common.session.UserSession r0 = r13.A01
            X.0qQ.A0B(r0, r6)
            X.2B1 r5 = X.2B0.A01
            X.0xa r0 = r5.A07(r0)
            java.lang.String r4 = "LAST_TAKE_A_BREAK_REMINDER_SEEN"
            r2 = 0
            long r10 = r0.getLong(r4, r2)
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0348
            X.EWJ r1 = r13.A03
            X.EWJ r0 = X.EWJ.IG_TS_ENTRY_POINT_TAKE_A_BREAK_FIRST_TIME_BLOCKING
            r10 = 0
            if (r1 != r0) goto L_0x0349
        L_0x0348:
            r10 = 1
        L_0x0349:
            android.content.res.Resources r11 = X.DbV.A05(r13)
            if (r10 == 0) goto L_0x0398
            r10 = 2131975001(0x7f135b59, float:1.9587082E38)
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r9[r6] = r12
            android.content.res.Resources r1 = X.DbV.A05(r13)
            r0 = 2131951730(0x7f130072, float:1.9539883E38)
            java.lang.String r12 = r1.getString(r0)
        L_0x0361:
            r9[r8] = r12
            java.lang.String r0 = r11.getString(r10, r9)
            r7.setText(r0)
            android.content.Context r0 = r13.requireContext()
            r8 = 2131099826(0x7f0600b2, float:1.7812016E38)
            X.DbT.A17(r0, r7, r8)
            r0 = 2131433722(0x7f0b18fa, float:1.8489238E38)
            android.widget.TextView r7 = X.DbU.A0G(r14, r0)
            com.instagram.common.session.UserSession r0 = r13.A01
            X.0qQ.A0B(r0, r6)
            X.0xa r0 = r5.A07(r0)
            long r4 = r0.getLong(r4, r2)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x03ab
            X.EWJ r1 = r13.A03
            X.EWJ r0 = X.EWJ.IG_TS_ENTRY_POINT_TAKE_A_BREAK_FIRST_TIME_BLOCKING
            if (r1 == r0) goto L_0x03ab
            r0 = 8
            r7.setVisibility(r0)
            return
        L_0x0398:
            r10 = 2131975003(0x7f135b5b, float:1.9587086E38)
            java.lang.Object[] r9 = new java.lang.Object[r9]
            android.content.res.Resources r1 = X.DbV.A05(r13)
            r0 = 2131951730(0x7f130072, float:1.9539883E38)
            java.lang.String r0 = r1.getString(r0)
            r9[r6] = r0
            goto L_0x0361
        L_0x03ab:
            r7.setVisibility(r6)
            r0 = 2131975002(0x7f135b5a, float:1.9587084E38)
            r7.setText(r0)
            android.content.Context r0 = r13.requireContext()
            X.DbT.A17(r0, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment.A02(android.view.View):void");
    }

    public final void onCreate(Bundle bundle) {
        EWJ ewj;
        int A022 = AnonymousClass0fD.A02(528221384);
        TimeSpentReminderFullyBlockingFragment.super.onCreate(bundle);
        AnonymousClass3HA.A00(requireContext());
        Bundle requireArguments = requireArguments();
        this.A01 = DbX.A0U(this);
        this.A02 = 2Ay.valueOf(DbU.A0l(requireArguments, "reminder_type"));
        this.A05 = 2Ct.A00(this.A01);
        if (this.A02.ordinal() == 2) {
            this.A04 = (int) DbW.A05(this.A01);
        }
        AnonymousClass3FV.A01.add(this);
        String string = requireArguments.getString("timespent_dashbaord_entrypoint");
        if (string != null) {
            if (string.equalsIgnoreCase("ig_ts_entry_point_take_a_break_first_time_blocking")) {
                ewj = EWJ.IG_TS_ENTRY_POINT_TAKE_A_BREAK_FIRST_TIME_BLOCKING;
            } else if (string.equalsIgnoreCase("ig_ts_entry_point_take_a_break_blocking")) {
                ewj = EWJ.IG_TS_ENTRY_POINT_TAKE_A_BREAK_BLOCKING;
            } else if (string.equalsIgnoreCase("ig_ts_entry_point_daily_limit_blocking")) {
                ewj = EWJ.IG_TS_ENTRY_POINT_DAILY_LIMIT_BLOCKING;
            }
            this.A03 = ewj;
        }
        AnonymousClass0fD.A09(-2001930559, A022);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0061, code lost:
        if (X.AnonymousClass3FV.A0A(r13.A01) != false) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0063, code lost:
        r1 = X.DbV.A05(r13);
        r0 = com.instagram.android.R.drawable.ig_illustrations_qp_moon_refresh;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0071, code lost:
        r6 = X.DbU.A0F(r13.A00, com.instagram.android.R.id.menu_icon);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0082, code lost:
        switch(r13.A02.ordinal()) {
            case 0: goto L_0x0204;
            case 1: goto L_0x0085;
            case 2: goto L_0x01d5;
            case 3: goto L_0x0248;
            case 4: goto L_0x0248;
            case 5: goto L_0x0211;
            case 6: goto L_0x0248;
            case 7: goto L_0x0248;
            case 8: goto L_0x0248;
            default: goto L_0x0085;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0085, code lost:
        A02(r13.A00);
        r2 = X.DbU.A0G(r13.A00, com.instagram.android.R.id.guardian_limit_reached_primary);
        r3 = r13.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0099, code lost:
        switch(r3.ordinal()) {
            case 0: goto L_0x0180;
            case 1: goto L_0x009c;
            case 2: goto L_0x0170;
            case 3: goto L_0x01ab;
            case 4: goto L_0x01ab;
            case 5: goto L_0x0193;
            case 6: goto L_0x01ba;
            case 7: goto L_0x01ba;
            case 8: goto L_0x01ab;
            default: goto L_0x009c;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x009c, code lost:
        r6 = X.DbU.A0G(r13.A00, com.instagram.android.R.id.guardian_limit_reached_secondary);
        r2 = r13.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00ab, code lost:
        switch(r2.ordinal()) {
            case 0: goto L_0x0109;
            case 1: goto L_0x00ae;
            case 2: goto L_0x00f9;
            case 3: goto L_0x0146;
            case 4: goto L_0x0146;
            case 5: goto L_0x0139;
            case 6: goto L_0x0155;
            case 7: goto L_0x0155;
            case 8: goto L_0x0146;
            default: goto L_0x00ae;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00ae, code lost:
        r5 = X.DbU.A0G(r13.A00, com.instagram.android.R.id.guardian_limit_reached_tertiary);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00bb, code lost:
        if (r13.A02 != X.2Ay.A03) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00c5, code lost:
        if (X.0oI.A0C(requireContext()) == false) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00cb, code lost:
        if (X.Dba.A1W(r13) == false) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00da, code lost:
        if (X.DbY.A1Y(X.0Tu.A05, r13.A01, 36324969373774361L) == false) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e2, code lost:
        if (X.AnonymousClass3FV.A0A(r13.A01) != false) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e4, code lost:
        A03(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e7, code lost:
        A01(r13.A00);
        r1 = r13.A00;
        X.AnonymousClass0fD.A09(959660893, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f4, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f5, code lost:
        A04(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f9, code lost:
        r6.setText(2131975005);
        r6.setTextColor(A00());
        r0 = 18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x010d, code lost:
        if (X.Dba.A1W(r13) == false) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0115, code lost:
        if (X.AnonymousClass3FV.A0A(r13.A01) == false) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0117, code lost:
        r6.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0128, code lost:
        if (X.DbY.A1Y(X.0Tu.A05, r13.A01, 36324969373774361L) == false) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0132, code lost:
        if (X.0oI.A0C(requireContext()) == false) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0134, code lost:
        A04(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x013f, code lost:
        if (X.AnonymousClass3FV.A0A(r13.A01) != false) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0141, code lost:
        A03(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0146, code lost:
        X.0wb.A03("TimeSpentReminderFullyBlockingFragment_setupView", X.002.A0R("Unrecognized reminder type ", r2.A00));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0155, code lost:
        r0 = 2131971179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x015a, code lost:
        if (r13.A08 == false) goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x015c, code lost:
        r0 = 2131973926;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x015f, code lost:
        r6.setText(r0);
        r6.setTextColor(A00());
        r0 = 19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x016b, code lost:
        X.C50109FOz.A00(r6, r0, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0170, code lost:
        r2.setText(2131975004);
        r2.setTextColor(A00());
        r0 = 21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0184, code lost:
        if (X.Dba.A1W(r13) == false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x018c, code lost:
        if (X.AnonymousClass3FV.A0A(r13.A01) == false) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x018e, code lost:
        r2.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0199, code lost:
        if (X.AnonymousClass3FV.A0A(r13.A01) != false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x019b, code lost:
        r2.setText(2131957367);
        r2.setTextColor(A00());
        r0 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01ab, code lost:
        X.0wb.A03("TimeSpentReminderFullyBlockingFragment_setupView", X.002.A0R("Unrecognized reminder type ", r3.A00));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01ba, code lost:
        r0 = 2131971178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01bf, code lost:
        if (r13.A08 == false) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01c1, code lost:
        r0 = 2131973925;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01c4, code lost:
        r2.setText(r0);
        r2.setTextColor(A00());
        r0 = 22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01d0, code lost:
        X.C50109FOz.A00(r2, r0, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01d5, code lost:
        X.DbU.A13(requireContext(), r6, com.instagram.android.R.drawable.instagram_more_horizontal_outline_44);
        X.DbT.A16(requireContext(), r6, com.instagram.android.R.color.black);
        r6.setVisibility(0);
        r10 = requireContext();
        r11 = r13.A01;
        r12 = r13.A03;
        X.0qQ.A0B(r11, 1);
        r7 = new X.FO6(18, X.DbS.A0W(r11), r10, r11, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0208, code lost:
        if (X.Dba.A1W(r13) == false) goto L_0x0248;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x020a, code lost:
        r0 = X.AnonymousClass3FV.A07(r13.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0211, code lost:
        r0 = X.AnonymousClass3FV.A0A(r13.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0217, code lost:
        if (r0 == false) goto L_0x0248;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0219, code lost:
        X.DbU.A13(requireContext(), r6, com.instagram.android.R.drawable.instagram_more_horizontal_outline_44);
        r6.setVisibility(0);
        r7 = r13.A01;
        r3 = r13.A02.A00;
        r1 = X.Dba.A01(r7);
        X.0qQ.A0B(r7, 0);
        X.DbT.A1T(r7, X.AnonymousClass05K.A0j, r3, r1);
        r7 = new X.C50102FOs(8, (java.lang.Object) r13, (java.lang.Object) X.DbT.A0M(r13, r13.A01), (java.lang.Object) r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0243, code lost:
        X.AnonymousClass0fU.A00(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0248, code lost:
        r6.setVisibility(8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r14, android.view.ViewGroup r15, android.os.Bundle r16) {
        /*
            r13 = this;
            r0 = 1772700778(0x69a9446a, float:2.5578942E25)
            int r4 = X.AnonymousClass0fD.A02(r0)
            android.content.Context r0 = r13.requireContext()
            android.view.LayoutInflater r1 = r14.cloneInContext(r0)
            r0 = 2131625939(0x7f0e07d3, float:1.88791E38)
            r8 = 0
            android.view.View r1 = r1.inflate(r0, r15, r8)
            r13.A00 = r1
            r0 = 2131433867(0x7f0b198b, float:1.8489532E38)
            android.widget.ImageView r3 = X.DbU.A0F(r1, r0)
            X.2Ay r2 = r13.A02
            int r0 = r2.ordinal()
            switch(r0) {
                case 0: goto L_0x0044;
                case 1: goto L_0x0029;
                case 2: goto L_0x003c;
                case 3: goto L_0x0071;
                case 4: goto L_0x0071;
                case 5: goto L_0x005b;
                case 6: goto L_0x0063;
                case 7: goto L_0x0063;
                case 8: goto L_0x0071;
                default: goto L_0x0029;
            }
        L_0x0029:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            r0 = 115(0x73, float:1.61E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r2, r0, r1)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x003c:
            android.content.res.Resources r1 = X.DbV.A05(r13)
            r0 = 2131237672(0x7f081b28, float:1.8091601E38)
            goto L_0x006a
        L_0x0044:
            boolean r0 = X.Dba.A1W(r13)
            if (r0 == 0) goto L_0x0053
            com.instagram.common.session.UserSession r0 = r13.A01
            boolean r0 = X.AnonymousClass3FV.A0A(r0)
            if (r0 != 0) goto L_0x0053
            goto L_0x0071
        L_0x0053:
            android.content.res.Resources r1 = X.DbV.A05(r13)
            r0 = 2131237677(0x7f081b2d, float:1.8091611E38)
            goto L_0x006a
        L_0x005b:
            com.instagram.common.session.UserSession r0 = r13.A01
            boolean r0 = X.AnonymousClass3FV.A0A(r0)
            if (r0 == 0) goto L_0x0071
        L_0x0063:
            android.content.res.Resources r1 = X.DbV.A05(r13)
            r0 = 2131237686(0x7f081b36, float:1.809163E38)
        L_0x006a:
            android.graphics.drawable.Drawable r0 = X.AnonymousClass2dd.A00(r1, r0)
            r3.setImageDrawable(r0)
        L_0x0071:
            android.view.View r1 = r13.A00
            r0 = 2131436129(0x7f0b2261, float:1.849412E38)
            android.widget.ImageView r6 = X.DbU.A0F(r1, r0)
            X.2Ay r0 = r13.A02
            int r0 = r0.ordinal()
            r5 = 8
            switch(r0) {
                case 0: goto L_0x0204;
                case 1: goto L_0x0085;
                case 2: goto L_0x01d5;
                case 3: goto L_0x0248;
                case 4: goto L_0x0248;
                case 5: goto L_0x0211;
                case 6: goto L_0x0248;
                case 7: goto L_0x0248;
                case 8: goto L_0x0248;
                default: goto L_0x0085;
            }
        L_0x0085:
            android.view.View r0 = r13.A00
            r13.A02(r0)
            android.view.View r1 = r13.A00
            r0 = 2131433719(0x7f0b18f7, float:1.8489232E38)
            android.widget.TextView r2 = X.DbU.A0G(r1, r0)
            X.2Ay r3 = r13.A02
            int r0 = r3.ordinal()
            switch(r0) {
                case 0: goto L_0x0180;
                case 1: goto L_0x009c;
                case 2: goto L_0x0170;
                case 3: goto L_0x01ab;
                case 4: goto L_0x01ab;
                case 5: goto L_0x0193;
                case 6: goto L_0x01ba;
                case 7: goto L_0x01ba;
                case 8: goto L_0x01ab;
                default: goto L_0x009c;
            }
        L_0x009c:
            android.view.View r1 = r13.A00
            r0 = 2131433720(0x7f0b18f8, float:1.8489234E38)
            android.widget.TextView r6 = X.DbU.A0G(r1, r0)
            X.2Ay r2 = r13.A02
            int r0 = r2.ordinal()
            switch(r0) {
                case 0: goto L_0x0109;
                case 1: goto L_0x00ae;
                case 2: goto L_0x00f9;
                case 3: goto L_0x0146;
                case 4: goto L_0x0146;
                case 5: goto L_0x0139;
                case 6: goto L_0x0155;
                case 7: goto L_0x0155;
                case 8: goto L_0x0146;
                default: goto L_0x00ae;
            }
        L_0x00ae:
            android.view.View r1 = r13.A00
            r0 = 2131433723(0x7f0b18fb, float:1.848924E38)
            android.widget.TextView r5 = X.DbU.A0G(r1, r0)
            X.2Ay r1 = r13.A02
            X.2Ay r0 = X.2Ay.A03
            if (r1 != r0) goto L_0x00f5
            android.content.Context r0 = r13.requireContext()
            boolean r0 = X.0oI.A0C(r0)
            if (r0 == 0) goto L_0x00f5
            boolean r0 = X.Dba.A1W(r13)
            if (r0 == 0) goto L_0x00f5
            com.instagram.common.session.UserSession r3 = r13.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324969373774361(0x810d5e00003219, double:3.035395128661659E-306)
            boolean r0 = X.DbY.A1Y(r2, r3, r0)
            if (r0 == 0) goto L_0x00f5
            com.instagram.common.session.UserSession r0 = r13.A01
            boolean r0 = X.AnonymousClass3FV.A0A(r0)
            if (r0 != 0) goto L_0x00f5
            r13.A03(r5)
        L_0x00e7:
            android.view.View r0 = r13.A00
            r13.A01(r0)
            android.view.View r1 = r13.A00
            r0 = 959660893(0x3933435d, float:1.7095865E-4)
            X.AnonymousClass0fD.A09(r0, r4)
            return r1
        L_0x00f5:
            r13.A04(r5)
            goto L_0x00e7
        L_0x00f9:
            r0 = 2131975005(0x7f135b5d, float:1.958709E38)
            r6.setText(r0)
            int r0 = r13.A00()
            r6.setTextColor(r0)
            r0 = 18
            goto L_0x016b
        L_0x0109:
            boolean r0 = X.Dba.A1W(r13)
            if (r0 == 0) goto L_0x00ae
            com.instagram.common.session.UserSession r0 = r13.A01
            boolean r0 = X.AnonymousClass3FV.A0A(r0)
            if (r0 == 0) goto L_0x011b
            r6.setVisibility(r5)
            goto L_0x00ae
        L_0x011b:
            com.instagram.common.session.UserSession r3 = r13.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324969373774361(0x810d5e00003219, double:3.035395128661659E-306)
            boolean r0 = X.DbY.A1Y(r2, r3, r0)
            if (r0 == 0) goto L_0x0141
            android.content.Context r0 = r13.requireContext()
            boolean r0 = X.0oI.A0C(r0)
            if (r0 == 0) goto L_0x0141
            r13.A04(r6)
            goto L_0x00ae
        L_0x0139:
            com.instagram.common.session.UserSession r0 = r13.A01
            boolean r0 = X.AnonymousClass3FV.A0A(r0)
            if (r0 != 0) goto L_0x00ae
        L_0x0141:
            r13.A03(r6)
            goto L_0x00ae
        L_0x0146:
            java.lang.String r1 = "Unrecognized reminder type "
            java.lang.String r0 = r2.A00
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.String r0 = "TimeSpentReminderFullyBlockingFragment_setupView"
            X.0wb.A03(r0, r1)
            goto L_0x00ae
        L_0x0155:
            boolean r1 = r13.A08
            r0 = 2131971179(0x7f134c6b, float:1.957933E38)
            if (r1 == 0) goto L_0x015f
            r0 = 2131973926(0x7f135726, float:1.9584902E38)
        L_0x015f:
            r6.setText(r0)
            int r0 = r13.A00()
            r6.setTextColor(r0)
            r0 = 19
        L_0x016b:
            X.C50109FOz.A00(r6, r0, r13)
            goto L_0x00ae
        L_0x0170:
            r0 = 2131975004(0x7f135b5c, float:1.9587088E38)
            r2.setText(r0)
            int r0 = r13.A00()
            r2.setTextColor(r0)
            r0 = 21
            goto L_0x01d0
        L_0x0180:
            boolean r0 = X.Dba.A1W(r13)
            if (r0 == 0) goto L_0x009c
            com.instagram.common.session.UserSession r0 = r13.A01
            boolean r0 = X.AnonymousClass3FV.A0A(r0)
            if (r0 == 0) goto L_0x019b
            r2.setVisibility(r5)
            goto L_0x009c
        L_0x0193:
            com.instagram.common.session.UserSession r0 = r13.A01
            boolean r0 = X.AnonymousClass3FV.A0A(r0)
            if (r0 != 0) goto L_0x009c
        L_0x019b:
            r0 = 2131957367(0x7f131677, float:1.9551316E38)
            r2.setText(r0)
            int r0 = r13.A00()
            r2.setTextColor(r0)
            r0 = 16
            goto L_0x01d0
        L_0x01ab:
            java.lang.String r1 = "Unrecognized reminder type "
            java.lang.String r0 = r3.A00
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.String r0 = "TimeSpentReminderFullyBlockingFragment_setupView"
            X.0wb.A03(r0, r1)
            goto L_0x009c
        L_0x01ba:
            boolean r1 = r13.A08
            r0 = 2131971178(0x7f134c6a, float:1.9579328E38)
            if (r1 == 0) goto L_0x01c4
            r0 = 2131973925(0x7f135725, float:1.95849E38)
        L_0x01c4:
            r2.setText(r0)
            int r0 = r13.A00()
            r2.setTextColor(r0)
            r0 = 22
        L_0x01d0:
            X.C50109FOz.A00(r2, r0, r13)
            goto L_0x009c
        L_0x01d5:
            android.content.Context r1 = r13.requireContext()
            r0 = 2131238561(0x7f081ea1, float:1.8093404E38)
            X.DbU.A13(r1, r6, r0)
            android.content.Context r1 = r13.requireContext()
            r0 = 2131099778(0x7f060082, float:1.7811919E38)
            X.DbT.A16(r1, r6, r0)
            r6.setVisibility(r8)
            android.content.Context r10 = r13.requireContext()
            com.instagram.common.session.UserSession r11 = r13.A01
            X.EWJ r12 = r13.A03
            r0 = 1
            X.0qQ.A0B(r11, r0)
            X.7Pr r9 = X.DbS.A0W(r11)
            r8 = 18
            X.FO6 r7 = new X.FO6
            r7.<init>(r8, r9, r10, r11, r12)
            goto L_0x0243
        L_0x0204:
            boolean r0 = X.Dba.A1W(r13)
            if (r0 == 0) goto L_0x0248
            com.instagram.common.session.UserSession r0 = r13.A01
            boolean r0 = X.AnonymousClass3FV.A07(r0)
            goto L_0x0217
        L_0x0211:
            com.instagram.common.session.UserSession r0 = r13.A01
            boolean r0 = X.AnonymousClass3FV.A0A(r0)
        L_0x0217:
            if (r0 == 0) goto L_0x0248
            android.content.Context r1 = r13.requireContext()
            r0 = 2131238561(0x7f081ea1, float:1.8093404E38)
            X.DbU.A13(r1, r6, r0)
            r6.setVisibility(r8)
            com.instagram.common.session.UserSession r7 = r13.A01
            X.2Ay r0 = r13.A02
            java.lang.String r3 = r0.A00
            long r1 = X.Dba.A01(r7)
            X.0qQ.A0B(r7, r8)
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            X.DbT.A1T(r7, r0, r3, r1)
            com.instagram.common.session.UserSession r0 = r13.A01
            X.2nI r0 = X.DbT.A0M(r13, r0)
            X.FOs r7 = new X.FOs
            r7.<init>((int) r5, (java.lang.Object) r13, (java.lang.Object) r0, (java.lang.Object) r13)
        L_0x0243:
            X.AnonymousClass0fU.A00(r7, r6)
            goto L_0x0085
        L_0x0248:
            r6.setVisibility(r5)
            goto L_0x0085
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1375942213);
        this.A05.A00(Dba.A01(this.A01));
        super.onDestroy();
        AnonymousClass0fD.A09(-1745216303, A022);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0100, code lost:
        if ((!X.C49953FGi.A07(r10.A01, r2)) != false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011f, code lost:
        if (new X.AnonymousClass3FW(r10.A01).A07(r1) != false) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0123, code lost:
        X.C317756nm.A01(requireActivity(), r10, r10.A01, com.instagram.android.R.color.grey_4, true, false, false);
        r1 = r10.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0136, code lost:
        if (r1 == X.2Ay.A06) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x013a, code lost:
        if (r1 == X.2Ay.A08) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x013e, code lost:
        if (r1 != X.2Ay.A09) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0146, code lost:
        if (X.AnonymousClass3FV.A0A(r10.A01) == false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
        X.DbT.A1K(r10);
        X.C317756nm.A02(requireActivity(), r10, r10.A01, true, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0148, code lost:
        X.DbU.A11(requireContext(), r4, com.instagram.android.R.drawable.full_screen_background_gradient);
        X.2db.A04(requireActivity(), r10, requireContext().getColor(com.instagram.android.R.color.purple_9), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0027, code lost:
        A02(r4);
        A01(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onResume() {
        /*
            r17 = this;
            r0 = -770965030(0xffffffffd20c01da, float:-1.50331621E11)
            int r3 = X.AnonymousClass0fD.A02(r0)
            r10 = r17
            super.onResume()
            android.view.View r4 = r10.A00
            if (r4 == 0) goto L_0x002d
            X.2Ay r2 = r10.A02
            int r0 = r2.ordinal()
            switch(r0) {
                case 0: goto L_0x00e8;
                case 1: goto L_0x0019;
                case 2: goto L_0x0123;
                case 3: goto L_0x00d9;
                case 4: goto L_0x00d9;
                case 5: goto L_0x00f8;
                case 6: goto L_0x0104;
                case 7: goto L_0x0104;
                case 8: goto L_0x00d9;
                default: goto L_0x0019;
            }
        L_0x0019:
            X.DbT.A1K(r10)
            androidx.fragment.app.FragmentActivity r5 = r10.requireActivity()
            com.instagram.common.session.UserSession r2 = r10.A01
            r1 = 1
            r0 = 0
            X.C317756nm.A02(r5, r10, r2, r1, r0)
        L_0x0027:
            r10.A02(r4)
            r10.A01(r4)
        L_0x002d:
            X.2Ay r1 = r10.A02
            X.2Ay r0 = X.2Ay.A03
            if (r1 != r0) goto L_0x00bd
            com.instagram.common.session.UserSession r0 = r10.A01
            X.2B1 r6 = X.2B0.A01
            boolean r0 = r6.A0E(r0)
            if (r0 == 0) goto L_0x00bd
            com.instagram.common.session.UserSession r2 = r10.A01
            com.instagram.api.schemas.ScreenTimeScreenType r9 = com.instagram.api.schemas.ScreenTimeScreenType.A04
            long r13 = X.AnonymousClass7TG.A0I()
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.lang.String r12 = r9.toString()
            X.4zy r11 = r6.A08(r2, r12)
            if (r11 != 0) goto L_0x0059
            X.4zy r11 = new X.4zy
            r15 = r13
            r11.<init>(r12, r13, r15)
        L_0x0059:
            java.util.Date r1 = r11.A03
            java.util.Calendar r0 = X.C280084zy.A00()
            java.util.Date r0 = r0.getTime()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00d6
            long r4 = r11.A00
        L_0x006b:
            long r0 = r11.A01()
            long r4 = r4 - r0
            r7 = 0
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0095
            java.util.Date r1 = r11.A04
            java.util.Calendar r0 = X.C280084zy.A00()
            java.util.Date r0 = r0.getTime()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00d3
            long r0 = r11.A02
            long r0 = r0 + r4
            r11.A02 = r0
        L_0x008b:
            java.util.Calendar r0 = X.C280084zy.A00()
            java.util.Date r0 = r0.getTime()
            r11.A04 = r0
        L_0x0095:
            r11.A01 = r13
            java.util.Calendar r0 = X.C280084zy.A00()
            java.util.Date r0 = r0.getTime()
            r11.A03 = r0
            r11.A00 = r13
            java.util.Calendar r0 = X.C280084zy.A00()
            java.util.Date r0 = r0.getTime()
            r11.A03 = r0
            java.lang.String r0 = r9.toString()
            r6.A0D(r2, r11, r0)
            android.os.Handler r4 = r10.A06
            java.lang.Runnable r2 = r10.A07
            r0 = 10000(0x2710, double:4.9407E-320)
            r4.postDelayed(r2, r0)
        L_0x00bd:
            X.2Ay r1 = r10.A02
            X.2Ay r0 = X.2Ay.A06
            if (r1 != r0) goto L_0x00cc
            android.os.Handler r4 = r10.A06
            java.lang.Runnable r2 = r10.A07
            r0 = 10000(0x2710, double:4.9407E-320)
            r4.postDelayed(r2, r0)
        L_0x00cc:
            r0 = -2002018119(0xffffffff88aba0b9, float:-1.0329474E-33)
            X.AnonymousClass0fD.A09(r0, r3)
            return
        L_0x00d3:
            r11.A02 = r4
            goto L_0x008b
        L_0x00d6:
            r4 = 0
            goto L_0x006b
        L_0x00d9:
            java.lang.String r1 = "Unrecognized reminder type "
            java.lang.String r0 = r2.A00
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.String r0 = "TimeSpentReminderFullyBlockingFragment_shouldFinishActivityUponResume"
            X.0wb.A03(r0, r1)
            goto L_0x0019
        L_0x00e8:
            boolean r0 = X.Dba.A1W(r10)
            if (r0 == 0) goto L_0x0123
            com.instagram.common.session.UserSession r0 = r10.A01
            boolean r0 = X.AnonymousClass3FV.A08(r0)
            if (r0 != 0) goto L_0x0123
            X.2Ay r2 = r10.A02
        L_0x00f8:
            com.instagram.common.session.UserSession r0 = r10.A01
            boolean r0 = X.C49953FGi.A07(r0, r2)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0123
            goto L_0x0019
        L_0x0104:
            com.instagram.common.session.UserSession r0 = r10.A01
            com.instagram.user.model.User r0 = X.DbT.A0j(r0)
            long r1 = X.AnonymousClass7TG.A0I()
            boolean r0 = r0.A1Z()
            if (r0 == 0) goto L_0x0019
            com.instagram.common.session.UserSession r5 = r10.A01
            X.3FW r0 = new X.3FW
            r0.<init>(r5)
            boolean r0 = r0.A07(r1)
            if (r0 != 0) goto L_0x0123
            goto L_0x0019
        L_0x0123:
            androidx.fragment.app.FragmentActivity r9 = r10.requireActivity()
            com.instagram.common.session.UserSession r11 = r10.A01
            r13 = 1
            r12 = 2131100269(0x7f06026d, float:1.7812915E38)
            r14 = 0
            r15 = r14
            X.C317756nm.A01(r9, r10, r11, r12, r13, r14, r15)
            X.2Ay r1 = r10.A02
            X.2Ay r0 = X.2Ay.A06
            if (r1 == r0) goto L_0x0148
            X.2Ay r0 = X.2Ay.A08
            if (r1 == r0) goto L_0x0148
            X.2Ay r0 = X.2Ay.A09
            if (r1 != r0) goto L_0x0027
            com.instagram.common.session.UserSession r0 = r10.A01
            boolean r0 = X.AnonymousClass3FV.A0A(r0)
            if (r0 == 0) goto L_0x0027
        L_0x0148:
            android.content.Context r1 = r10.requireContext()
            r0 = 2131237349(0x7f0819e5, float:1.8090946E38)
            X.DbU.A11(r1, r4, r0)
            androidx.fragment.app.FragmentActivity r2 = r10.requireActivity()
            android.content.Context r1 = r10.requireContext()
            r0 = 2131100694(0x7f060416, float:1.7813777E38)
            int r0 = r1.getColor(r0)
            X.2db.A04(r2, r10, r0, r13)
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment.onResume():void");
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(1922776769);
        if (this.A02 == 2Ay.A03 && Dba.A1W(this)) {
            C49253Erw.A00(ScreenTimeScreenType.A04, this.A01, AnonymousClass7TG.A0I());
        }
        this.A06.removeCallbacks(this.A07);
        C317756nm.A02(requireActivity(), this, this.A01, true, false);
        TimeSpentReminderFullyBlockingFragment.super.onStop();
        AnonymousClass0fD.A09(701851311, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        2Cu r4 = this.A05;
        2Ay r1 = this.A02;
        0qQ.A0B(r1, 0);
        if (2Cu.A06.contains(r1)) {
            r4.A02 = r1;
            r4.A00 = AnonymousClass7TG.A0I();
            02m r3 = r4.A03;
            r3.markerPoint(191636345, "show_blocking_view_controller");
            r3.markerAnnotate(191636345, "blocking_type", String.valueOf(r4.A02));
        }
    }
}
