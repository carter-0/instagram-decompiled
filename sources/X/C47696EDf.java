package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.common.session.UserSession;
import com.instagram.ui.emptystaterow.EmptyStateView;
import com.instagram.user.model.User;
import go.Seq;
import java.util.List;

/* renamed from: X.EDf  reason: case insensitive filesystem */
public final class C47696EDf extends 1P0 {
    public final int A00;
    public final Object A01;

    public C47696EDf(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(AnonymousClass4DH r1, 1OC r2, int i) {
        r2.A00 = new C47696EDf(r1, i);
        r1.schedule(r2);
    }

    public static void A01(1OC r1, Object obj, int i) {
        r1.A00 = new C47696EDf(obj, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:119:0x050f, code lost:
        X.AnonymousClass0fD.A0A(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0512, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x06c0, code lost:
        X.AnonymousClass0fD.A0A(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x06c3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0094, code lost:
        X.0qQ.A0F(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009b, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFail(X.C268654dm r15) {
        /*
            r14 = this;
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x0647;
                case 1: goto L_0x0627;
                case 2: goto L_0x05f8;
                case 3: goto L_0x05c9;
                case 4: goto L_0x05ba;
                case 5: goto L_0x0589;
                case 6: goto L_0x0567;
                case 7: goto L_0x0005;
                case 8: goto L_0x0553;
                case 9: goto L_0x0513;
                case 10: goto L_0x0076;
                case 11: goto L_0x0005;
                case 12: goto L_0x0005;
                case 13: goto L_0x0005;
                case 14: goto L_0x04ee;
                case 15: goto L_0x04a7;
                case 16: goto L_0x0479;
                case 17: goto L_0x0461;
                case 18: goto L_0x0438;
                case 19: goto L_0x03e1;
                case 20: goto L_0x0005;
                case 21: goto L_0x03b1;
                case 22: goto L_0x0005;
                case 23: goto L_0x0396;
                case 24: goto L_0x0005;
                case 25: goto L_0x0005;
                case 26: goto L_0x0005;
                case 27: goto L_0x0375;
                case 28: goto L_0x0356;
                case 29: goto L_0x0301;
                case 30: goto L_0x02dd;
                case 31: goto L_0x0005;
                case 32: goto L_0x02be;
                case 33: goto L_0x0295;
                case 34: goto L_0x0274;
                case 35: goto L_0x0253;
                case 36: goto L_0x0005;
                case 37: goto L_0x0005;
                case 38: goto L_0x0228;
                case 39: goto L_0x01fc;
                case 40: goto L_0x0005;
                case 41: goto L_0x01e7;
                case 42: goto L_0x01cc;
                case 43: goto L_0x01bd;
                case 44: goto L_0x01aa;
                case 45: goto L_0x018c;
                case 46: goto L_0x016f;
                case 47: goto L_0x0005;
                case 48: goto L_0x00ed;
                case 49: goto L_0x00b5;
                case 50: goto L_0x0005;
                case 51: goto L_0x004a;
                case 52: goto L_0x0022;
                case 53: goto L_0x0005;
                case 54: goto L_0x0005;
                case 55: goto L_0x0005;
                case 56: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.C47696EDf.super.onFail(r15)
            return
        L_0x0009:
            r0 = -1570650811(0xffffffffa261c545, float:-3.059762E-18)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r14.A01
            X.E6b r0 = (X.C47517E6b) r0
            X.6rr r1 = X.C320156rr.ERROR
            com.instagram.ui.emptystaterow.EmptyStateView r0 = r0.A01
            if (r0 == 0) goto L_0x001d
            r0.A0P(r1)
        L_0x001d:
            r0 = 226592450(0xd8186c2, float:7.982681E-31)
            goto L_0x050f
        L_0x0022:
            r0 = 811847198(0x3063ce1e, float:8.287503E-10)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.6ap r2 = X.DbV.A0X()
            java.lang.String r0 = "batch_remove_spam_followers_request_failed"
            r2.A0H = r0
            java.lang.Object r0 = r14.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.content.res.Resources r1 = X.DbV.A05(r0)
            r0 = 2131972102(0x7f135006, float:1.9581202E38)
            X.DbT.A1D(r1, r2, r0)
            r2.A06()
            X.DbY.A1N(r2)
            r0 = -59822764(0xfffffffffc6f2d54, float:-4.9675133E36)
            goto L_0x050f
        L_0x004a:
            r0 = -2117625626(0xffffffff81c798e6, float:-7.3320453E-38)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r3 = r14.A01
            X.Der r3 = (X.C46430Der) r3
            r0 = 16923645(0x1023bfd, float:2.3920268E-38)
            X.Dbc.A10(r3, r0)
            X.6rm r2 = r3.A09
            java.lang.String r1 = "latencyPerfLogger"
            if (r2 == 0) goto L_0x0094
            java.lang.String r0 = "fetch_request_fail"
            r2.A0E(r0)
            X.6rm r0 = r3.A09
            if (r0 == 0) goto L_0x0094
            X.34p r0 = r0.A00
            r0.A01()
            r0 = 1624892658(0x60d9e4f2, float:1.2560752E20)
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        L_0x0076:
            r0 = -1196946105(0xffffffffb8a80d47, float:-8.013337E-5)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r5 = r14.A01
            X.E3E r5 = (X.E3E) r5
            android.content.Context r4 = r5.getContext()
            r2 = 2131972232(0x7f135088, float:1.9581466E38)
            r1 = 1
            java.lang.String r0 = "fetch_user_failed"
            X.C59689JTv.A01(r4, r0, r2, r1)
            android.view.View r1 = r5.A01
            if (r1 != 0) goto L_0x009c
            java.lang.String r1 = "retryRequestButton"
        L_0x0094:
            X.0qQ.A0F(r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x009c:
            r0 = 0
            r1.setVisibility(r0)
            X.FBX r0 = r5.A0F
            if (r0 != 0) goto L_0x00a7
            java.lang.String r1 = "qplHelper"
            goto L_0x0094
        L_0x00a7:
            r2 = 857808781(0x33211f8d, float:3.751443E-8)
            X.02m r1 = r0.A00
            r0 = 3
            r1.markerEnd(r2, r0)
            r0 = -400328513(0xffffffffe82378bf, float:-3.0878924E24)
            goto L_0x050f
        L_0x00b5:
            r0 = -807656286(0xffffffffcfdc24a2, float:-7.3867766E9)
            int r3 = X.AnonymousClass7TG.A0D(r15, r0)
            X.C47696EDf.super.onFail(r15)
            java.lang.Object r2 = r14.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            java.lang.String r4 = X.DbZ.A0j(r2)
            boolean r0 = r15 instanceof X.C268674do
            if (r0 == 0) goto L_0x00de
            X.4do r15 = (X.C268674do) r15
            java.lang.Object r0 = r15.A00
            X.1XT r0 = (X.AnonymousClass1XT) r0
            java.lang.String r1 = r0.getErrorMessage()
            if (r1 == 0) goto L_0x00de
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00de
            r4 = r1
        L_0x00de:
            androidx.fragment.app.FragmentActivity r2 = r2.getActivity()
            java.lang.String r1 = "UserList onFail"
            r0 = 1
            X.C59689JTv.A03(r2, r4, r1, r0)
            r0 = 1261798723(0x4b358543, float:1.1896131E7)
            goto L_0x050f
        L_0x00ed:
            r0 = -1219973509(0xffffffffb748ae7b, float:-1.1961553E-5)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r4 = 0
            X.0qQ.A0B(r15, r4)
            X.C47696EDf.super.onFail(r15)
            java.lang.Object r3 = r14.A01
            X.E2j r3 = (X.C47437E2j) r3
            r2 = 1
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = r3.A02
            if (r1 == 0) goto L_0x0107
            r1.setPrimaryButtonEnabled(r2)
        L_0x0107:
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r2 = r3.A02
            if (r2 == 0) goto L_0x0111
            r1 = 2131974670(0x7f135a0e, float:1.958641E38)
            X.DbZ.A1A(r3, r2, r1)
        L_0x0111:
            com.instagram.ui.widget.spinner.SpinnerImageView r2 = r3.A03
            if (r2 == 0) goto L_0x011a
            X.3uy r1 = X.C255943uy.FAILED
            r2.setLoadingStatus(r1)
        L_0x011a:
            com.instagram.ui.widget.spinner.SpinnerImageView r2 = r3.A03
            if (r2 == 0) goto L_0x0123
            android.view.View$OnClickListener r1 = r3.A06
            X.AnonymousClass0fU.A00(r1, r2)
        L_0x0123:
            androidx.recyclerview.widget.RecyclerView r1 = r3.A00
            if (r1 == 0) goto L_0x012a
            r1.setVisibility(r4)
        L_0x012a:
            X.FEs r5 = r3.A04
            if (r5 == 0) goto L_0x016a
            X.FAI r2 = r5.A09
            java.util.Map r1 = r2.A02
            java.util.Set r1 = r1.keySet()
            com.google.common.collect.ImmutableList r11 = X.DbU.A0K(r1)
            java.util.Deque r1 = r2.A01
            com.google.common.collect.ImmutableList r1 = X.DbU.A0K(r1)
            java.util.HashMap r12 = X.C49918FEs.A01(r1)
            java.lang.String r10 = r5.A01
            X.EZf r6 = X.C48137EZf.BLOCKED_ACCOUNTS
            X.EZZ r7 = X.EZZ.SUGGESTED_BLOCKS
            com.instagram.common.session.UserSession r9 = r5.A07
            X.0iw r8 = r5.A06
            r1 = 2
            X.DbW.A1N(r10, r1, r9)
            r13 = 6
            X.0qQ.A0B(r8, r13)
            X.C49760F5m.A01(r6, r7, r8, r9, r10, r11, r12, r13)
            android.content.Context r1 = r5.A05
            android.content.Context r3 = r1.getApplicationContext()
            r2 = 2131953877(0x7f1308d5, float:1.9544237E38)
            java.lang.String r1 = "block_all_failure"
            X.C59689JTv.A01(r3, r1, r2, r4)
            r5.A02()
        L_0x016a:
            r1 = 730232649(0x2b867749, float:9.554381E-13)
            goto L_0x06c0
        L_0x016f:
            r0 = -1100156192(0xffffffffbe6cf2e0, float:-0.23139524)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r4 = r14.A01
            android.content.Context r4 = (android.content.Context) r4
            r0 = 2131974093(0x7f1357cd, float:1.958524E38)
            java.lang.String r2 = r4.getString(r0)
            java.lang.String r1 = "update_friend_map_note_mute_state_failure"
            r0 = 0
            X.C59689JTv.A03(r4, r2, r1, r0)
            r0 = 1862946042(0x6f0a4cfa, float:4.280199E28)
            goto L_0x050f
        L_0x018c:
            r0 = 1647969011(0x623a02f3, float:8.578267E20)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r14.A01
            X.G7Q r2 = (X.G7Q) r2
            r0 = 0
            java.lang.Object r1 = r15.A00()
            if (r1 == 0) goto L_0x01a2
            X.DwR r1 = (X.DwR) r1
            java.lang.String r0 = r1.A02
        L_0x01a2:
            r2.DwL(r0)
            r0 = -1705686000(0xffffffff9a554c10, float:-4.410881E-23)
            goto L_0x050f
        L_0x01aa:
            r0 = 1385755258(0x5298f27a, float:3.28451555E11)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r14.A01
            X.G81 r0 = (X.G81) r0
            r0.DED()
            r0 = -1861029356(0xffffffff9112f214, float:-1.1591965E-28)
            goto L_0x050f
        L_0x01bd:
            r0 = 2032231999(0x7921663f, float:5.23771E34)
            int r3 = X.AnonymousClass7TG.A0D(r15, r0)
            X.C47696EDf.super.onFail(r15)
            r0 = 604246553(0x24041219, float:2.8638267E-17)
            goto L_0x050f
        L_0x01cc:
            r0 = -983285830(0xffffffffc5643fba, float:-3651.983)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r14.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            android.os.Bundle r0 = r0.requireArguments()
            X.FHB.A03(r1, r0)
            r0 = 746118966(0x2c78df36, float:3.5366827E-12)
            goto L_0x050f
        L_0x01e7:
            r0 = -1942498962(0xffffffff8c37d16e, float:-1.416083E-31)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r14.A01
            X.F2K r0 = (X.F2K) r0
            X.G7O r0 = r0.A00
            r0.DwC()
            r0 = -578209633(0xffffffffdd89389f, float:-1.23597848E18)
            goto L_0x050f
        L_0x01fc:
            r0 = 436361814(0x1a025a56, float:2.6956343E-23)
            int r0 = X.AnonymousClass7TG.A0D(r15, r0)
            X.C47696EDf.super.onFail(r15)
            java.lang.Object r1 = r14.A01
            X.F2U r1 = (X.F2U) r1
            X.E6C r3 = r1.A00
            X.E9B r2 = r3.A00
            if (r2 == 0) goto L_0x0214
            r1 = 0
            r2.A00(r1)
        L_0x0214:
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r3.A02
            if (r1 == 0) goto L_0x021b
            X.DbS.A1T(r1)
        L_0x021b:
            com.instagram.ui.widget.spinner.SpinnerImageView r2 = r3.A02
            if (r2 == 0) goto L_0x0223
            r1 = 1
            r2.setClickable(r1)
        L_0x0223:
            r1 = 1275690006(0x4c097c16, float:3.6040792E7)
            goto L_0x06c0
        L_0x0228:
            r0 = 112992361(0x6bc2069, float:7.076536E-35)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r2 = 0
            X.0qQ.A0B(r15, r2)
            X.C47696EDf.super.onFail(r15)
            java.lang.Object r1 = r14.A01
            X.ESG r1 = (X.ESG) r1
            r0 = 1
            r1.A07 = r0
            r1.A06 = r2
            X.Eq3 r0 = new X.Eq3
            r0.<init>()
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            r1.setItems(r0)
            X.ESG.A07(r1)
            r0 = -513363366(0xffffffffe166b25a, float:-2.6597517E20)
            goto L_0x050f
        L_0x0253:
            r0 = 381491637(0x16bd19b5, float:3.055082E-25)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.C47696EDf.super.onFail(r15)
            java.lang.String r1 = "FxSettingsSecurityTransitionResponse"
            r0 = 446(0x1be, float:6.25E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0wb.A03(r1, r0)
            java.lang.Object r0 = r14.A01
            X.ESE r0 = (X.ESE) r0
            X.ESE.A07(r0)
            r0 = -2019520579(0xffffffff87a08fbd, float:-2.4158606E-34)
            goto L_0x050f
        L_0x0274:
            r0 = -1579623673(0xffffffffa1d8db07, float:-1.4694705E-18)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r4 = 0
            X.0qQ.A0B(r15, r4)
            X.C47696EDf.super.onFail(r15)
            java.lang.Object r0 = r14.A01
            androidx.fragment.app.FragmentActivity r2 = X.DbZ.A0E(r0)
            java.lang.String r1 = "story_push_notification_launch_request_failed"
            r0 = 2131974495(0x7f13595f, float:1.9586056E38)
            X.C59689JTv.A01(r2, r1, r0, r4)
            r0 = -356600877(0xffffffffeabeb3d3, float:-1.1527255E26)
            goto L_0x050f
        L_0x0295:
            r0 = -1394882102(0xffffffffacdbc9ca, float:-6.2467575E-12)
            int r3 = X.AnonymousClass7TG.A0D(r15, r0)
            X.C47696EDf.super.onFail(r15)
            java.lang.Object r2 = r14.A01
            X.ESH r2 = (X.ESH) r2
            X.Epz r0 = new X.Epz
            r0.<init>()
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            r2.setItems(r0)
            r1 = 13
            X.DhF r0 = new X.DhF
            r0.<init>(r2, r1)
            X.ESH.A08(r2, r0)
            r0 = -1595656458(0xffffffffa0e436f6, float:-3.8661072E-19)
            goto L_0x050f
        L_0x02be:
            r0 = -492882100(0xffffffffe29f374c, float:-1.4685084E21)
            int r3 = X.AnonymousClass7TG.A0D(r15, r0)
            X.C47696EDf.super.onFail(r15)
            java.lang.Object r2 = r14.A01
            X.E26 r2 = (X.E26) r2
            X.E26.A02(r2)
            r1 = 7
            X.DhF r0 = new X.DhF
            r0.<init>(r2, r1)
            X.E26.A05(r2, r0)
            r0 = -1602438185(0xffffffffa07cbbd7, float:-2.1407381E-19)
            goto L_0x050f
        L_0x02dd:
            r0 = -4421526(0xffffffffffbc886a, float:NaN)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r14.A01
            X.FQO r0 = (X.FQO) r0
            java.lang.Object r1 = r0.A01
            X.ESA r1 = (X.ESA) r1
            java.util.ArrayList r0 = X.ESA.A06(r1)
            r1.setItems(r0)
            android.content.Context r1 = r1.getContext()
            java.lang.String r0 = "add_donate_action_failed"
            X.C59689JTv.A0E(r1, r0)
            r0 = 1057781702(0x3f0c77c6, float:0.5487026)
            goto L_0x050f
        L_0x0301:
            r0 = -2110122993(0xffffffff823a140f, float:-1.3670878E-37)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r14.A01
            X.FEp r2 = (X.C49915FEp) r2
            X.4DH r1 = r2.A02
            r0 = 2131961758(0x7f13279e, float:1.9560222E38)
            java.lang.String r8 = r1.getString(r0)
            boolean r0 = r15 instanceof X.C268674do
            if (r0 == 0) goto L_0x032f
            java.lang.Object r1 = r15.A00()
            if (r1 == 0) goto L_0x032f
            X.1XP r1 = (X.1XP) r1
            java.lang.String r0 = r1.getErrorMessage()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x032f
            java.lang.String r8 = r1.getErrorMessage()
        L_0x032f:
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r2.A03
            java.lang.String r5 = "switch_back"
            r9 = 0
            java.lang.String r6 = "setting"
            java.lang.String r7 = "switch_back_button"
            X.Xtl r4 = new X.Xtl
            r10 = r9
            r11 = r9
            r12 = r9
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r0.Ckh(r4)
            com.instagram.common.session.UserSession r0 = r2.A07
            X.0wX r0 = r0.A03
            android.content.Context r2 = r0.A06()
            java.lang.String r1 = "switch_to_personal_account_failed"
            r0 = 0
            X.C59689JTv.A03(r2, r8, r1, r0)
            r0 = 726159837(0x2b4851dd, float:7.116788E-13)
            goto L_0x050f
        L_0x0356:
            r0 = 850526727(0x32b20207, float:2.072285E-8)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = 0
            X.0qQ.A0B(r15, r0)
            X.C47696EDf.super.onFail(r15)
            java.lang.Object r1 = r14.A01
            X.ES8 r1 = (X.ES8) r1
            r1.A03 = r0
            r0 = 0
            r1.A02 = r0
            X.ES8.A06(r1)
            r0 = -1373618071(0xffffffffae204069, float:-3.6436996E-11)
            goto L_0x050f
        L_0x0375:
            r0 = 1825897040(0x6cd4fa50, float:2.0597947E27)
            int r3 = X.AnonymousClass7TG.A0D(r15, r0)
            X.C47696EDf.super.onFail(r15)
            java.lang.String r1 = "FxSettingsAdsTransitionResponse"
            r0 = 446(0x1be, float:6.25E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0wb.A03(r1, r0)
            java.lang.Object r0 = r14.A01
            X.ES8 r0 = (X.ES8) r0
            X.ES8.A06(r0)
            r0 = -255727399(0xfffffffff0c1e8d9, float:-4.8009682E29)
            goto L_0x050f
        L_0x0396:
            r0 = -2146342474(0xffffffff801169b6, float:-1.599125E-39)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r14.A01
            android.content.Context r4 = X.DbT.A07(r0)
            r2 = 2131972232(0x7f135088, float:1.9581466E38)
            r1 = 1
            java.lang.String r0 = "createBlockedReelsTask_request_error"
            X.C59689JTv.A01(r4, r0, r2, r1)
            r0 = 394854267(0x1788ff7b, float:8.853286E-25)
            goto L_0x050f
        L_0x03b1:
            r0 = 701146092(0x29caa3ec, float:8.999038E-14)
            int r0 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r14.A01
            X.FAY r2 = (X.FAY) r2
            androidx.fragment.app.Fragment r1 = r2.A01
            boolean r1 = r1.isAdded()
            if (r1 != 0) goto L_0x03c9
            r1 = 1555973657(0x5cbe4619, float:4.2845855E17)
            goto L_0x06c0
        L_0x03c9:
            androidx.fragment.app.FragmentActivity r4 = r2.A02
            r1 = 2131975959(0x7f135f17, float:1.9589025E38)
            java.lang.String r3 = r4.getString(r1)
            r1 = 284(0x11c, float:3.98E-43)
            java.lang.String r2 = X.Pxd.A00(r1)
            r1 = 0
            X.C59689JTv.A03(r4, r3, r2, r1)
            r1 = -1491448493(0xffffffffa71a4d53, float:-2.141371E-15)
            goto L_0x06c0
        L_0x03e1:
            r0 = 2104132851(0x7d6a84f3, float:1.9483104E37)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = 0
            X.0qQ.A0B(r15, r0)
            X.C47696EDf.super.onFail(r15)
            java.lang.Object r7 = r14.A01
            X.Fk2 r7 = (X.C50884Fk2) r7
            X.4DH r0 = r7.A01
            android.content.Context r6 = r0.getContext()
            if (r6 == 0) goto L_0x0433
            X.Dc2 r0 = r7.A00
            if (r0 == 0) goto L_0x0405
            X.DbX.A1R(r0)
            r0 = 0
            r7.A00 = r0
        L_0x0405:
            r5 = 1
            X.PHs r4 = new X.PHs
            r4.<init>(r7, r5)
            X.6ap r2 = X.DbV.A0X()
            boolean r1 = X.C61970qY.A0F(r6)
            r0 = 2131968398(0x7f13418e, float:1.957369E38)
            if (r1 == 0) goto L_0x041b
            r0 = 2131974093(0x7f1357cd, float:1.958524E38)
        L_0x041b:
            X.DbS.A19(r6, r2, r0)
            r0 = 2131972371(0x7f135113, float:1.9581748E38)
            X.DbW.A0q(r6, r2, r0)
            r2.A0L = r5
            r0 = 6
            X.FdH.A00(r2, r4, r0)
            X.Dc2 r0 = r2.A00()
            X.DbX.A1S(r0)
            r7.A00 = r0
        L_0x0433:
            r0 = 1305971605(0x4dd78b95, float:4.52031136E8)
            goto L_0x050f
        L_0x0438:
            r0 = -1212610396(0xffffffffb7b908a4, float:-2.2057742E-5)
            int r3 = X.AnonymousClass7TG.A0D(r15, r0)
            java.lang.Object r0 = r14.A01
            X.Fjy r0 = (X.C50880Fjy) r0
            android.content.Context r2 = r0.A00
            r0 = 2131972232(0x7f135088, float:1.9581466E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r2, r0)
            X.1XT r0 = X.DbT.A0L(r15)
            if (r0 == 0) goto L_0x0459
            java.lang.String r0 = r0.getErrorMessage()
            if (r0 == 0) goto L_0x0459
            r1 = r0
        L_0x0459:
            X.C59689JTv.A09(r2, r1)
            r0 = 1748586461(0x68394fdd, float:3.500444E24)
            goto L_0x050f
        L_0x0461:
            r0 = -1726415293(0xffffffff9918fe43, float:-7.9095636E-24)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r14.A01
            X.Fjq r0 = (X.C50872Fjq) r0
            android.content.Context r1 = r0.A00
            r0 = 2131961936(0x7f132850, float:1.9560583E38)
            X.C59689JTv.A07(r1, r0)
            r0 = -984319115(0xffffffffc5547b75, float:-3399.716)
            goto L_0x050f
        L_0x0479:
            r0 = -26884695(0xfffffffffe65c5a9, float:-7.635488E37)
            int r0 = X.AnonymousClass7TG.A0D(r15, r0)
            X.1XT r1 = X.DbT.A0L(r15)
            if (r1 == 0) goto L_0x048c
            java.lang.String r2 = r1.getErrorMessage()
            if (r2 != 0) goto L_0x0499
        L_0x048c:
            java.lang.Object r1 = r14.A01
            X.Fjp r1 = (X.C50871Fjp) r1
            android.content.Context r2 = r1.A00
            r1 = 2131972232(0x7f135088, float:1.9581466E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r2, r1)
        L_0x0499:
            java.lang.Object r1 = r14.A01
            X.Fjp r1 = (X.C50871Fjp) r1
            android.content.Context r1 = r1.A00
            X.C59689JTv.A09(r1, r2)
            r1 = 1918042881(0x72530301, float:4.179518E30)
            goto L_0x06c0
        L_0x04a7:
            r0 = 143902385(0x893c6b1, float:8.893953E-34)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r6 = r14.A01
            X.Fk1 r6 = (X.C50883Fk1) r6
            android.content.Context r5 = r6.A00
            r4 = 2131959231(0x7f131dbf, float:1.9555097E38)
            r0 = 2131238258(0x7f081d72, float:1.809279E38)
            android.graphics.drawable.Drawable r2 = r5.getDrawable(r0)
            X.6ap r1 = X.DbS.A0a()
            X.6ar r0 = X.C310356ar.CIRCULAR
            r1.A0B(r0)
            X.DbS.A19(r5, r1, r4)
            r1.A06()
            if (r2 == 0) goto L_0x04da
            int r0 = X.2Yu.A05(r5)
            int r0 = r5.getColor(r0)
            r1.A08(r2, r0)
        L_0x04da:
            r0 = 2131972371(0x7f135113, float:1.9581748E38)
            X.DbW.A0q(r5, r1, r0)
            r0 = 4
            X.FdH.A00(r1, r6, r0)
            r0 = 1
            r1.A0L = r0
            X.Dbb.A1Q(r1)
            r0 = -1632761584(0xffffffff9eae0910, float:-1.8426715E-20)
            goto L_0x050f
        L_0x04ee:
            r0 = 1009372358(0x3c29ccc6, float:0.010363763)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.6ap r2 = X.DbV.A0X()
            java.lang.String r0 = "batch_delete_stories_error"
            r2.A0H = r0
            java.lang.Object r0 = r14.A01
            X.Fjg r0 = (X.C50862Fjg) r0
            android.content.Context r1 = r0.A00
            r0 = 2131953733(0x7f130845, float:1.9543945E38)
            X.DbS.A19(r1, r2, r0)
            X.Dbb.A1Q(r2)
            r0 = -744665918(0xffffffffd39d4cc2, float:-1.3511953E12)
        L_0x050f:
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        L_0x0513:
            r0 = -2144454084(0xffffffff802e3a3c, float:-4.245323E-39)
            int r0 = X.AnonymousClass7TG.A0D(r15, r0)
            java.lang.Object r4 = r14.A01
            X.E31 r4 = (X.E31) r4
            androidx.fragment.app.FragmentActivity r2 = r4.getActivity()
            if (r2 == 0) goto L_0x0532
            r1 = 2131974093(0x7f1357cd, float:1.958524E38)
            java.lang.String r3 = X.AnonymousClass7TE.A16(r2, r1)
            X.6aq r2 = X.C310346aq.ERROR
            java.lang.String r1 = "multiple_links_delete_bio_link_request_failed"
            X.E31.A00(r2, r3, r1)
        L_0x0532:
            X.0eM r3 = r4.A07
            java.lang.Object r2 = r3.getValue()
            X.6ve r2 = (X.C322326ve) r2
            java.lang.Throwable r1 = r15.A01()
            if (r1 == 0) goto L_0x0546
            java.lang.String r1 = r1.getMessage()
            if (r1 != 0) goto L_0x0548
        L_0x0546:
            java.lang.String r1 = ""
        L_0x0548:
            r2.A02(r1)
            X.Dbb.A1W(r3)
            r1 = -2135319683(0xffffffff80b99b7d, float:-1.7045345E-38)
            goto L_0x06c0
        L_0x0553:
            r0 = -1148985729(0xffffffffbb83de7f, float:-0.0040243263)
            int r0 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r14.A01
            X.0sP r2 = (X.0sP) r2
            r1 = 0
            r2.invoke(r1)
            r1 = -405371367(0xffffffffe7d68619, float:-2.0261202E24)
            goto L_0x06c0
        L_0x0567:
            r0 = -1405722716(0xffffffffac365fa4, float:-2.5916847E-12)
            int r0 = X.AnonymousClass7TG.A0D(r15, r0)
            X.C47696EDf.super.onFail(r15)
            java.lang.Object r1 = r14.A01
            X.FnK r1 = (X.C51028FnK) r1
            com.instagram.common.session.UserSession r1 = r1.A02
            X.F3s r3 = X.C49061Eof.A00(r1)
            X.EWT r2 = X.EWT.UNFOLLOW_USER_FLOW
            java.lang.String r1 = r15.toString()
            r3.A04(r2, r1)
            r1 = -1256691027(0xffffffffb5186aad, float:-5.6779646E-7)
            goto L_0x06c0
        L_0x0589:
            r0 = -744408166(0xffffffffd3a13b9a, float:-1.38497937E12)
            int r0 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r14.A01
            X.FgX r1 = (X.C50672FgX) r1
            com.instagram.profile.fragment.UserDetailFragment r1 = r1.A04
            android.content.Context r4 = r1.getContext()
            android.content.Context r1 = r1.getContext()
            if (r1 == 0) goto L_0x05b8
            android.content.res.Resources r2 = r1.getResources()
            if (r2 == 0) goto L_0x05b8
            r1 = 2131971973(0x7f134f85, float:1.958094E38)
            java.lang.String r3 = r2.getString(r1)
        L_0x05ad:
            java.lang.String r2 = "unlink_self_failed"
            r1 = 0
            X.C59689JTv.A03(r4, r3, r2, r1)
            r1 = -557456634(0xffffffffdec5e306, float:-7.1296237E18)
            goto L_0x06c0
        L_0x05b8:
            r3 = 0
            goto L_0x05ad
        L_0x05ba:
            r0 = 1843183384(0x6ddcbf18, float:8.539715E27)
            int r0 = X.AnonymousClass7TG.A0D(r15, r0)
            X.C47696EDf.super.onFail(r15)
            r1 = 919226276(0x36ca47a4, float:6.028409E-6)
            goto L_0x06c0
        L_0x05c9:
            r0 = 755961402(0x2d0f0e3a, float:8.131768E-12)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r6 = 0
            X.0qQ.A0B(r15, r6)
            X.C47696EDf.super.onFail(r15)
            java.lang.Object r1 = r14.A01
            X.Dkh r1 = (X.C46754Dkh) r1
            X.05G r5 = r1.A03
            java.lang.Object r1 = r5.getValue()
            X.EPH r1 = (X.EPH) r1
            java.util.List r4 = r1.A00
            boolean r3 = r1.A02
            r2 = 1
            X.0qQ.A0B(r4, r6)
            X.EPH r1 = new X.EPH
            r1.<init>(r4, r3, r2)
            r5.Epw(r1)
            r1 = 1774472621(0x69c44dad, float:2.9664534E25)
            goto L_0x06c0
        L_0x05f8:
            r0 = 96355166(0x5be435e, float:1.7892261E-35)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.C47696EDf.super.onFail(r15)
            java.lang.String r1 = X.FFi.A00
            android.net.Uri r2 = X.C318866pf.A00(r1)
            java.lang.Object r1 = r14.A01
            X.6pf r1 = (X.C318866pf) r1
            X.4DH r4 = r1.A02
            android.content.Context r3 = r4.getContext()
            com.instagram.common.session.UserSession r5 = r1.A05
            java.lang.String r7 = r2.toString()
            r1 = 897(0x381, float:1.257E-42)
            java.lang.String r6 = X.C273654mx.A00(r1)
            r8 = 0
            X.FFi.A01(r3, r4, r5, r6, r7, r8)
            r1 = -1162716139(0xffffffffbab25c15, float:-0.0013607765)
            goto L_0x06c0
        L_0x0627:
            r0 = 1553565640(0x5c9987c8, float:3.45719716E17)
            int r0 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r3 = r14.A01
            X.E33 r3 = (X.E33) r3
            r2 = 0
            X.2dZ r1 = r3.A01
            if (r1 == 0) goto L_0x063a
            r1.setIsLoading(r2)
        L_0x063a:
            java.lang.String r2 = "edit_username_failed"
            android.content.Context r1 = r3.requireContext()
            X.C59689JTv.A0B(r1, r2)
            r1 = 2127842709(0x7ed44d95, float:1.4109958E38)
            goto L_0x06c0
        L_0x0647:
            r0 = 143293681(0x88a7cf1, float:8.3349465E-34)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r4 = 0
            X.0qQ.A0B(r15, r4)
            X.C47696EDf.super.onFail(r15)
            java.lang.Object r6 = r14.A01
            X.E33 r6 = (X.E33) r6
            X.2dZ r1 = r6.A01
            if (r1 == 0) goto L_0x0660
            r1.setIsLoading(r4)
        L_0x0660:
            X.1XT r3 = X.DbT.A0L(r15)
            r7 = 0
            if (r3 == 0) goto L_0x067e
            java.util.List r2 = r3.getErrorStrings()
            if (r2 == 0) goto L_0x0677
            boolean r1 = X.AnonymousClass7TE.A1b(r2)
            if (r1 == 0) goto L_0x0677
            java.lang.Object r7 = r2.get(r4)
        L_0x0677:
            java.lang.String r1 = r3.getErrorMessage()
            if (r1 == 0) goto L_0x067e
            r7 = r1
        L_0x067e:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L_0x068b
            java.lang.String r2 = "edit_username_failed"
            android.content.Context r1 = r6.requireContext()
            X.C59689JTv.A03(r1, r7, r2, r4)
        L_0x068b:
            X.6ve r9 = r6.A05
            if (r9 == 0) goto L_0x06aa
            java.lang.String r8 = "edit_username_failed"
            long r2 = r9.A02
            r4 = 0
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x06aa
            r1 = 1
            r9.A06 = r1
            com.facebook.quicklog.reliability.UserFlowLoggerImpl r4 = r9.A0A
            java.lang.String r1 = "failure_reason"
            r4.flowAnnotate(r2, r1, r8)
            long r2 = r9.A02
            java.lang.String r1 = "username_change_error"
            r4.flowMarkPoint(r2, r1)
        L_0x06aa:
            X.6ve r2 = r6.A05
            if (r2 == 0) goto L_0x06bd
            long r3 = r2.A02
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x06bd
            com.facebook.quicklog.reliability.UserFlowLoggerImpl r2 = r2.A0A
            java.lang.String r1 = "failure_reason"
            r2.flowAnnotate(r3, r1, r7)
        L_0x06bd:
            r1 = -1501827265(0xffffffffa67bef3f, float:-8.740736E-16)
        L_0x06c0:
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47696EDf.onFail(X.4dm):void");
    }

    public final void onFailInBackground(C268654dm r6) {
        int i;
        int i2;
        switch (this.A00) {
            case 54:
                i = AnonymousClass0fD.A03(1183324461);
                1Av A002 = 1Au.A00((UserSession) this.A01);
                long currentTimeMillis = System.currentTimeMillis();
                0xY A0p = AnonymousClass7TE.A0p(A002);
                A0p.E5c(AnonymousClass000.A00(1544), currentTimeMillis);
                A0p.apply();
                i2 = 1719102911;
                break;
            case 57:
                i = AnonymousClass0fD.A03(1709647404);
                AnonymousClass7TF.A0D().post(new C51415Ftl(this, (C47449E2v) this.A01));
                i2 = -1145908879;
                break;
            case 58:
                i = AnonymousClass0fD.A03(2028636841);
                AnonymousClass7TF.A0D().post(new C51416Ftm(this, (C47449E2v) this.A01));
                i2 = -2062561091;
                break;
            default:
                C47696EDf.super.onFailInBackground(r6);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final void onFinish() {
        int i;
        int i2;
        switch (this.A00) {
            case 6:
                i = AnonymousClass0fD.A03(1146395853);
                C47696EDf.super.onFinish();
                C49061Eof.A00(((C51028FnK) this.A01).A02).A01(EWT.UNFOLLOW_USER_FLOW, (Integer) null);
                i2 = 187720241;
                break;
            case 9:
                i = AnonymousClass0fD.A03(-298871097);
                FragmentActivity A0E = DbZ.A0E(this.A01);
                if (A0E != null) {
                    Dba.A0m(A0E, 2dZ.A0t);
                }
                i2 = -1972859157;
                break;
            case 10:
                i = AnonymousClass0fD.A03(1056829817);
                View view = ((E3E) this.A01).A00;
                if (view != null) {
                    view.setVisibility(8);
                    i2 = 790562132;
                    break;
                } else {
                    0qQ.A0F("loadingSpinner");
                    throw AnonymousClass00P.createAndThrow();
                }
            case 25:
                i = AnonymousClass0fD.A03(-1408949756);
                ((E59) this.A01).A07.A00();
                i2 = -1727690558;
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                i = AnonymousClass0fD.A03(-1901984967);
                C47696EDf.super.onFinish();
                C49915FEp fEp = (C49915FEp) this.A01;
                FragmentActivity fragmentActivity = fEp.A01;
                2dY r3 = 2dZ.A0t;
                r3.A03(fragmentActivity).Ett((View.OnClickListener) null, false);
                r3.A03(fragmentActivity).setIsLoading(false);
                fEp.A00 = false;
                i2 = -642156107;
                break;
            case 49:
                i = AnonymousClass0fD.A03(-104300449);
                C47527E6n e6n = (C47527E6n) this.A01;
                e6n.A02 = false;
                E9N e9n = e6n.A00;
                if (e9n != null) {
                    e9n.A0C = false;
                }
                DbY.A17(e6n, 2dZ.A0t, false);
                C46445Df7.A01(e6n, false);
                i2 = 573602961;
                break;
            case 52:
                i = AnonymousClass0fD.A03(414951351);
                C46445Df7.A00(((Fragment) this.A01).mView, false);
                i2 = 337978759;
                break;
            default:
                C47696EDf.super.onFinish();
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final void onStart() {
        int i;
        int i2;
        switch (this.A00) {
            case 3:
                i = AnonymousClass0fD.A03(-1766339513);
                C47696EDf.super.onStart();
                05G r4 = ((C46754Dkh) this.A01).A03;
                EPH eph = (EPH) r4.getValue();
                List list = eph.A00;
                boolean z = eph.A01;
                0qQ.A0B(list, 0);
                r4.Epw(new EPH(list, true, z));
                i2 = 694049559;
                break;
            case 9:
                i = AnonymousClass0fD.A03(-578050227);
                FragmentActivity A0E = DbZ.A0E(this.A01);
                if (A0E != null) {
                    Dba.A0n(A0E, 2dZ.A0t);
                }
                i2 = -15859907;
                break;
            case 25:
                i = AnonymousClass0fD.A03(-1241748518);
                ((E59) this.A01).A07.A01();
                i2 = -163497593;
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                i = AnonymousClass0fD.A03(-1548365098);
                C47696EDf.super.onStart();
                C49915FEp fEp = (C49915FEp) this.A01;
                fEp.A00 = true;
                FragmentActivity fragmentActivity = fEp.A01;
                2dY r2 = 2dZ.A0t;
                r2.A03(fragmentActivity).Ett((View.OnClickListener) null, true);
                r2.A03(fragmentActivity).setIsLoading(true);
                i2 = 706816047;
                break;
            case Seq.NULL_REFNUM:
                i = AnonymousClass0fD.A03(-1444696233);
                i2 = 1290212786;
                break;
            case 49:
                i = AnonymousClass0fD.A03(-1214587588);
                C47527E6n e6n = (C47527E6n) this.A01;
                e6n.A02 = true;
                E9N e9n = e6n.A00;
                if (e9n != null) {
                    e9n.A0C = true;
                }
                DbY.A17(e6n, 2dZ.A0t, true);
                C46445Df7.A01(e6n, true);
                i2 = 749661992;
                break;
            case 56:
                i = AnonymousClass0fD.A03(-2113875281);
                C320156rr r1 = C320156rr.LOADING;
                EmptyStateView emptyStateView = ((C47517E6b) this.A01).A01;
                if (emptyStateView != null) {
                    emptyStateView.A0P(r1);
                }
                i2 = 625379416;
                break;
            default:
                C47696EDf.super.onStart();
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    /* JADX WARNING: type inference failed for: r0v362, types: [X.6uq, X.1qK, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v26, types: [X.6Ye, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0920, code lost:
        if (r8 != null) goto L_0x0924;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0ab2, code lost:
        r14 = androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0dbd, code lost:
        if (r0.booleanValue() == false) goto L_0x0dbf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0df7, code lost:
        if (r1 == 0) goto L_0x0df9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0179, code lost:
        r12 = "followListAdapter";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x0fe1, code lost:
        X.0qQ.A0F(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x1018, code lost:
        if (r2.A06 != false) goto L_0x101a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:550:0x114a, code lost:
        X.0qQ.A0F(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:606:0x13e4, code lost:
        X.AnonymousClass0fD.A0A(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:607:0x13e7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:609:0x13ed, code lost:
        r12 = androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_USER;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:615:0x1421, code lost:
        X.0qQ.A0F(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:617:0x1428, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:618:0x1429, code lost:
        r12 = androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:620:0x143f, code lost:
        X.AnonymousClass0fD.A0A(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:621:0x1442, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x038f, code lost:
        if (X.00k.A0u(X.C49846F9l.A00, r3) != false) goto L_0x0391;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r18) {
        /*
            r17 = this;
            r5 = r18
            r2 = r17
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x1349;
                case 1: goto L_0x130a;
                case 2: goto L_0x12cb;
                case 3: goto L_0x13f0;
                case 4: goto L_0x1291;
                case 5: goto L_0x0009;
                case 6: goto L_0x1265;
                case 7: goto L_0x123f;
                case 8: goto L_0x121b;
                case 9: goto L_0x11cd;
                case 10: goto L_0x0d4a;
                case 11: goto L_0x0d2a;
                case 12: goto L_0x0cfa;
                case 13: goto L_0x0ccb;
                case 14: goto L_0x0c9a;
                case 15: goto L_0x0c52;
                case 16: goto L_0x0be9;
                case 17: goto L_0x0bb8;
                case 18: goto L_0x0b6c;
                case 19: goto L_0x0b10;
                case 20: goto L_0x0ae7;
                case 21: goto L_0x0ab6;
                case 22: goto L_0x09da;
                case 23: goto L_0x09aa;
                case 24: goto L_0x08e1;
                case 25: goto L_0x0890;
                case 26: goto L_0x0865;
                case 27: goto L_0x0812;
                case 28: goto L_0x07c9;
                case 29: goto L_0x0741;
                case 30: goto L_0x06e9;
                case 31: goto L_0x0009;
                case 32: goto L_0x0691;
                case 33: goto L_0x1113;
                case 34: goto L_0x05ee;
                case 35: goto L_0x05a1;
                case 36: goto L_0x04ec;
                case 37: goto L_0x0498;
                case 38: goto L_0x0445;
                case 39: goto L_0x03fe;
                case 40: goto L_0x03de;
                case 41: goto L_0x03ba;
                case 42: goto L_0x0353;
                case 43: goto L_0x02ff;
                case 44: goto L_0x02df;
                case 45: goto L_0x02a9;
                case 46: goto L_0x0009;
                case 47: goto L_0x0268;
                case 48: goto L_0x01fd;
                case 49: goto L_0x01ab;
                case 50: goto L_0x017d;
                case 51: goto L_0x012f;
                case 52: goto L_0x0081;
                case 53: goto L_0x0fc1;
                case 54: goto L_0x0009;
                case 55: goto L_0x0040;
                case 56: goto L_0x000d;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.C47696EDf.super.onSuccess(r5)
            return
        L_0x000d:
            r0 = -187714967(0xfffffffff4cfb269, float:-1.3164356E32)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.7ax r5 = (X.C334247ax) r5
            r0 = 167595134(0x9fd4c7e, float:6.0979467E-33)
            int r3 = X.AnonymousClass7TG.A0D(r5, r0)
            java.lang.Object r2 = r2.A01
            X.E6b r2 = (X.C47517E6b) r2
            X.6rr r1 = X.C320156rr.GONE
            com.instagram.ui.emptystaterow.EmptyStateView r0 = r2.A01
            if (r0 == 0) goto L_0x002a
            r0.A0P(r1)
        L_0x002a:
            X.7aO r1 = r2.A03
            if (r1 == 0) goto L_0x0035
            java.util.List r0 = r5.getItems()
            r1.A03(r0)
        L_0x0035:
            r0 = -492666745(0xffffffffe2a28087, float:-1.498817E21)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = -1056078306(0xffffffffc10d861e, float:-8.845243)
            goto L_0x143f
        L_0x0040:
            r0 = 1374563488(0x51ee2ca0, float:1.27868862E11)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.Dul r5 = (X.C47318Dul) r5
            r0 = 797206554(0x2f84681a, float:2.408463E-10)
            int r3 = X.AnonymousClass7TG.A0D(r5, r0)
            java.lang.Object r2 = r2.A01
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            X.G8g r0 = r5.A00
            if (r0 == 0) goto L_0x1429
            X.Dsy r0 = (X.C47211Dsy) r0
            boolean r0 = r0.A00
            X.4Cl r1 = r2.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.EQg(r0)
            X.G8g r0 = r5.A00
            if (r0 == 0) goto L_0x1429
            X.Dsy r0 = (X.C47211Dsy) r0
            boolean r0 = r0.A01
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            X.4Cl r0 = r2.A03
            r0.EOW(r1)
            r0 = -1437791206(0xffffffffaa4d0c1a, float:-1.8211856E-13)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 1130930931(0x4368a2f3, float:232.63652)
            goto L_0x143f
        L_0x0081:
            r0 = -689308002(0xffffffffd6e9fe9e, float:-1.28639891E14)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.CDq r5 = (X.C43798CDq) r5
            r0 = -404593729(0xffffffffe7e263bf, float:-2.1381896E24)
            int r6 = X.AnonymousClass0fD.A03(r0)
            r11 = 0
            java.util.ArrayList r7 = X.AnonymousClass7TF.A0q(r5, r11)
            X.DrG r0 = r5.A00
            if (r0 == 0) goto L_0x1429
            java.util.HashMap r0 = r0.A01
            java.util.Iterator r3 = X.AnonymousClass7TF.A0s(r0)
        L_0x00a0:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00b8
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r3)
            java.lang.String r1 = X.DbT.A13(r0)
            java.lang.Object r0 = r2.A01
            X.Der r0 = (X.C46430Der) r0
            X.0eM r0 = r0.A0u
            X.Dbb.A1U(r1, r7, r0)
            goto L_0x00a0
        L_0x00b8:
            java.lang.Object r8 = r2.A01
            X.Der r8 = (X.C46430Der) r8
            X.Dex r0 = r8.A0E
            if (r0 == 0) goto L_0x0179
            X.C46435Dex.A02(r0, r8, r7)
            r7 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            X.DrG r0 = r5.A00
            if (r0 == 0) goto L_0x1429
            java.lang.Boolean r0 = r0.A00
            boolean r10 = r1.equals(r0)
            android.content.res.Resources r9 = X.DbV.A05(r8)
            r5 = 2131820921(0x7f110179, float:1.927457E38)
            if (r10 == 0) goto L_0x00de
            r5 = 2131820920(0x7f110178, float:1.9274569E38)
        L_0x00de:
            int r3 = r8.A00
            java.util.Locale r0 = X.AnonymousClass1Q2.A02()
            java.text.NumberFormat r2 = java.text.NumberFormat.getNumberInstance(r0)
            r2.setGroupingUsed(r7)
            r2.setMaximumFractionDigits(r11)
            long r0 = (long) r3
            java.lang.String r0 = r2.format(r0)
            X.0qQ.A07(r0)
            java.lang.String r3 = X.DbY.A0e(r9, r0, r5, r3)
            if (r10 == 0) goto L_0x012c
            android.content.res.Resources r1 = X.DbV.A05(r8)
            r0 = 2131972141(0x7f13502d, float:1.9581281E38)
            java.lang.String r2 = r1.getString(r0)
        L_0x0107:
            X.0qQ.A0A(r2)
            X.6ap r1 = X.DbV.A0W()
            java.lang.String r0 = "remove_spam_followers"
            r1.A0H = r0
            r1.A0D = r3
            r1.A0I = r2
            r1.A0N = r7
            r1.A06()
            X.DbY.A1N(r1)
            X.C46430Der.A0E(r8)
            r0 = 804401692(0x2ff2321c, float:4.4055148E-10)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = 1937868529(0x738186f1, float:2.052439E31)
            goto L_0x143f
        L_0x012c:
            java.lang.String r2 = ""
            goto L_0x0107
        L_0x012f:
            r0 = 1641219398(0x61d30546, float:4.8658037E20)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.Dee r5 = (X.C46417Dee) r5
            r0 = 1751534847(0x68664cff, float:4.3502585E24)
            int r3 = X.AnonymousClass7TG.A0D(r5, r0)
            java.lang.Object r2 = r2.A01
            X.Der r2 = (X.C46430Der) r2
            r0 = 16915824(0x1021d70, float:2.389835E-38)
            X.Dbc.A10(r2, r0)
            X.6rm r1 = r2.A09
            java.lang.String r12 = "latencyPerfLogger"
            if (r1 == 0) goto L_0x1421
            java.lang.String r0 = "fetch_request_end"
            r1.A0E(r0)
            X.6rm r0 = r2.A09
            if (r0 == 0) goto L_0x1421
            X.C46329Dbx.A00(r0)
            X.Dex r1 = r2.A0E
            if (r1 == 0) goto L_0x0179
            X.3UH r0 = r5.A02
            X.0qQ.A07(r0)
            r1.A0C(r0)
            java.util.List r0 = r5.A00()
            X.C46430Der.A0N(r2, r0)
            r0 = -105056665(0xfffffffff9bcf667, float:-1.2264368E35)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = -1583019744(0xffffffffa1a50920, float:-1.118325E-18)
            goto L_0x143f
        L_0x0179:
            java.lang.String r12 = "followListAdapter"
            goto L_0x1421
        L_0x017d:
            r0 = 29879861(0x1c7ee35, float:7.3442865E-38)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = 1493545670(0x5905b2c6, float:2.35204596E15)
            int r3 = X.AnonymousClass7TG.A0D(r5, r0)
            X.C47696EDf.super.onSuccess(r5)
            java.lang.Object r0 = r2.A01
            X.Der r0 = (X.C46430Der) r0
            X.Dex r1 = r0.A0E
            if (r1 != 0) goto L_0x019a
            java.lang.String r14 = "followListAdapter"
            goto L_0x114a
        L_0x019a:
            r0 = 889605770(0x35064e8a, float:5.003318E-7)
            X.0fE.A00(r1, r0)
            r0 = 105152927(0x644819f, float:3.6958733E-35)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = -2042465181(0xffffffff86427463, float:-3.6572852E-35)
            goto L_0x143f
        L_0x01ab:
            r0 = -1997331819(0xffffffff88f32295, float:-1.4633161E-33)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.7ax r5 = (X.C334247ax) r5
            r0 = -550790965(0xffffffffdf2b98cb, float:-1.2364856E19)
            int r6 = X.AnonymousClass0fD.A03(r0)
            r11 = 0
            X.0qQ.A0B(r5, r11)
            java.util.List r8 = r5.getItems()
            java.lang.Object r5 = r2.A01
            X.E6n r5 = (X.C47527E6n) r5
            X.E9N r0 = r5.A00
            if (r0 == 0) goto L_0x01ce
            r0.A04(r8)
        L_0x01ce:
            boolean r0 = X.AnonymousClass7TE.A1b(r8)
            if (r0 == 0) goto L_0x01f2
            X.0eM r0 = r5.A06
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r0)
            X.0lg r3 = X.DbT.A0X(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36328637275848178(0x8110b400003df2, double:3.037714724702597E-306)
            boolean r12 = X.182.A06(r2, r3, r0)
            r9 = 0
            X.1OC r0 = X.C320126ro.A04(r7, r8, r9, r11, r12)
            r5.schedule(r0)
        L_0x01f2:
            r0 = 2054483242(0x7a74ed2a, float:3.1793267E35)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = 1826702440(0x6ce14468, float:2.1786508E27)
            goto L_0x143f
        L_0x01fd:
            r0 = -1356233972(0xffffffffaf29830c, float:-1.5417018E-10)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r1 = -176526403(0xfffffffff57a6bbd, float:-3.1744614E32)
            int r3 = X.AnonymousClass0fD.A03(r1)
            r6 = 0
            X.0qQ.A0B(r5, r6)
            X.C47696EDf.super.onSuccess(r5)
            java.lang.Object r5 = r2.A01
            X.E2j r5 = (X.C47437E2j) r5
            r4 = 0
            r2 = 8
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r5.A03
            if (r1 == 0) goto L_0x0220
            r1.setVisibility(r2)
        L_0x0220:
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r5.A03
            if (r1 == 0) goto L_0x0227
            X.AnonymousClass0fU.A00(r4, r1)
        L_0x0227:
            androidx.recyclerview.widget.RecyclerView r1 = r5.A00
            if (r1 == 0) goto L_0x022e
            r1.setVisibility(r6)
        L_0x022e:
            X.FEs r4 = r5.A04
            if (r4 == 0) goto L_0x025d
            java.util.List r12 = r4.A03
            java.util.List r1 = r4.A02
            java.util.HashMap r13 = X.C49918FEs.A01(r1)
            java.lang.String r11 = r4.A01
            X.EZf r7 = X.C48137EZf.BLOCKED_ACCOUNTS
            X.EZZ r8 = X.EZZ.SUGGESTED_BLOCKS
            com.instagram.common.session.UserSession r10 = r4.A07
            X.0iw r9 = r4.A06
            X.AnonymousClass7TF.A1B(r12, r6, r11)
            r14 = 5
            X.DbW.A1O(r10, r14, r9)
            X.C49760F5m.A01(r7, r8, r9, r10, r11, r12, r13, r14)
            android.content.Context r1 = r4.A05
            android.content.Context r2 = r1.getApplicationContext()
            r1 = 2131953879(0x7f1308d7, float:1.9544241E38)
            X.C59689JTv.A07(r2, r1)
            r4.A02()
        L_0x025d:
            r1 = 977878159(0x3a493c8f, float:7.6765654E-4)
            X.AnonymousClass0fD.A0A(r1, r3)
            r1 = 1584906454(0x5e77c0d6, float:4.46312605E18)
            goto L_0x13e4
        L_0x0268:
            r0 = 1881835349(0x702a8755, float:2.1110423E29)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.7ax r5 = (X.C334247ax) r5
            r0 = -628069010(0xffffffffda906d6e, float:-2.03263579E16)
            int r6 = X.AnonymousClass7TG.A0D(r5, r0)
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.List r0 = r5.getItems()
            java.util.Iterator r1 = r0.iterator()
        L_0x0284:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x028e
            X.DbY.A1W(r3, r1)
            goto L_0x0284
        L_0x028e:
            java.lang.Object r2 = r2.A01
            X.E6P r2 = (X.E6P) r2
            android.os.Bundle r1 = r2.requireArguments()
            java.lang.String r0 = "SimilarAccountsFragment.ARGUMENT_CHAINED_IDS"
            r1.putStringArrayList(r0, r3)
            r2.A0d()
            r0 = 537464781(0x20090fcd, float:1.160958E-19)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = 778359958(0x2e64d496, float:5.2030012E-11)
            goto L_0x143f
        L_0x02a9:
            r0 = 1154294198(0x44cd21b6, float:1641.0535)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.DwR r5 = (X.DwR) r5
            r0 = 1902799760(0x716a6b90, float:1.16079244E30)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r2.A01
            X.G7Q r2 = (X.G7Q) r2
            X.6rp r0 = r5.A00()
            java.lang.Boolean r0 = r0.A06
            boolean r1 = X.AnonymousClass7TG.A1X(r0)
            X.6rp r0 = r5.A00()
            java.lang.Boolean r0 = r0.A05
            boolean r0 = X.AnonymousClass7TG.A1X(r0)
            r2.DwN(r1, r0)
            r0 = -1244148883(0xffffffffb5d7cb6d, float:-1.6077953E-6)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = -1999768304(0xffffffff88cdf510, float:-1.2395603E-33)
            goto L_0x143f
        L_0x02df:
            r0 = -960544443(0xffffffffc6bf4145, float:-24480.635)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = 475199314(0x1c52f752, float:6.9802825E-22)
            int r1 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r2.A01
            X.G81 r0 = (X.G81) r0
            r0.onSuccess()
            r0 = 171009528(0xa3165f8, float:8.541418E-33)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = -1210657374(0xffffffffb7d6d5a2, float:-2.5610268E-5)
            goto L_0x143f
        L_0x02ff:
            r0 = -912539244(0xffffffffc99bc194, float:-1275954.5)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.DwA r5 = (X.DwA) r5
            r0 = 1687745603(0x6498f443, float:2.2572048E22)
            int r6 = X.AnonymousClass7TG.A0D(r5, r0)
            X.C47696EDf.super.onSuccess(r5)
            com.instagram.user.model.User r0 = r5.A03
            java.lang.Object r3 = r2.A01
            X.E6a r3 = (X.E6a) r3
            if (r0 != 0) goto L_0x0328
            java.lang.String r0 = "null_featured_user_response"
            X.0xI r2 = X.0xI.A00(r3, r0)
            java.lang.String r1 = r3.A03
            if (r1 != 0) goto L_0x033a
            java.lang.String r12 = "displayedUsername"
            goto L_0x1421
        L_0x0328:
            X.E8z r1 = r3.A02
            if (r1 != 0) goto L_0x0330
            java.lang.String r12 = "adapter"
            goto L_0x1421
        L_0x0330:
            r1.A01 = r5
            X.3UH r0 = r5.A00
            r1.A00 = r0
            X.C47587E8z.A00(r1)
            goto L_0x0348
        L_0x033a:
            java.lang.String r0 = "queried_username"
            r2.A0C(r0, r1)
            X.0eM r0 = r3.A07
            X.0lg r0 = X.DbT.A0X(r0)
            X.DbU.A1R(r2, r0)
        L_0x0348:
            r0 = -1735771207(0xffffffff988a3bb9, float:-3.573247E-24)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = -2079209396(0xffffffff8411c84c, float:-1.713664E-36)
            goto L_0x143f
        L_0x0353:
            r0 = 848674312(0x3295be08, float:1.74323E-8)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.Dv5 r5 = (X.C47338Dv5) r5
            r1 = 1852171607(0x6e65e557, float:1.778733E28)
            int r6 = X.AnonymousClass7TG.A0D(r5, r1)
            java.lang.String r3 = r5.A00
            if (r3 == 0) goto L_0x03aa
            int r1 = r3.length()
            if (r1 == 0) goto L_0x03aa
            android.net.Uri r5 = X.0cp.A03(r3)
            if (r5 == 0) goto L_0x03aa
            boolean r1 = X.C49846F9l.A00(r5)
            if (r1 != 0) goto L_0x0391
            java.lang.String r4 = r5.getScheme()
            java.lang.String r3 = r5.getHost()
            java.lang.String r1 = "instagram"
            boolean r1 = r1.equalsIgnoreCase(r4)
            if (r1 == 0) goto L_0x03aa
            java.util.List r1 = X.C49846F9l.A00
            boolean r1 = X.00k.A0u(r1, r3)
            if (r1 == 0) goto L_0x03aa
        L_0x0391:
            java.lang.Object r3 = r2.A01
            X.E2A r3 = (X.E2A) r3
            android.os.Handler r2 = r3.A00
            X.Fth r1 = new X.Fth
            r1.<init>(r5, r3)
            r2.post(r1)
        L_0x039f:
            r1 = 976121954(0x3a2e7062, float:6.6543196E-4)
            X.AnonymousClass0fD.A0A(r1, r6)
            r1 = 660590114(0x275fce22, float:3.1059212E-15)
            goto L_0x13e4
        L_0x03aa:
            java.lang.Object r1 = r2.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            androidx.fragment.app.FragmentActivity r2 = r1.requireActivity()
            android.os.Bundle r1 = r1.requireArguments()
            X.FHB.A03(r2, r1)
            goto L_0x039f
        L_0x03ba:
            r0 = 611109812(0x246ccbb4, float:5.1346886E-17)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.92k r5 = (X.C3727892k) r5
            r0 = -1620952716(0xffffffff9f623974, float:-4.7904886E-20)
            int r1 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r2.A01
            X.F2K r0 = (X.F2K) r0
            X.G7O r0 = r0.A00
            r0.DwD(r5)
            r0 = -386888175(0xffffffffe8f08e11, float:-9.087909E24)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = 1131870694(0x4376f9e6, float:246.97617)
            goto L_0x143f
        L_0x03de:
            r0 = 2002874075(0x77616edb, float:4.572325E33)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = 1939492844(0x739a4fec, float:2.4451743E31)
            int r1 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r2.A01
            X.K99 r0 = (X.K99) r0
            r0.A0C()
            r0 = 1257387733(0x4af236d5, float:7936874.5)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = 305565036(0x12368d6c, float:5.760339E-28)
            goto L_0x143f
        L_0x03fe:
            r0 = 218023285(0xcfec575, float:3.9253737E-31)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.DvO r5 = (X.DvO) r5
            r0 = -37302267(0xfffffffffdc6d005, float:-3.3033405E37)
            int r6 = X.AnonymousClass0fD.A03(r0)
            r3 = 0
            X.0qQ.A0B(r5, r3)
            X.C47696EDf.super.onSuccess(r5)
            java.lang.Object r0 = r2.A01
            X.F2U r0 = (X.F2U) r0
            X.E6C r2 = r0.A00
            X.E9B r1 = r2.A00
            if (r1 == 0) goto L_0x0426
            X.Ex0 r0 = r5.A00
            if (r0 == 0) goto L_0x0441
            r1.A00(r0)
        L_0x0426:
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r2.A02
            if (r1 == 0) goto L_0x042f
            X.3uy r0 = X.C255943uy.SUCCESS
            r1.setLoadingStatus(r0)
        L_0x042f:
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r2.A02
            if (r0 == 0) goto L_0x0436
            r0.setClickable(r3)
        L_0x0436:
            r0 = 2109460369(0x7dbbcf91, float:3.1205423E37)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = 643468603(0x265a8d3b, float:7.5825347E-16)
            goto L_0x143f
        L_0x0441:
            java.lang.String r12 = "info"
            goto L_0x1421
        L_0x0445:
            r0 = -485659486(0xffffffffe30d6ca2, float:-2.6088187E21)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.371 r5 = (X.AnonymousClass371) r5
            r0 = 1359113381(0x51026ca5, float:3.5010531E10)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = 0
            X.0qQ.A0B(r5, r0)
            X.C47696EDf.super.onSuccess(r5)
            java.lang.Object r1 = r2.A01
            X.ESG r1 = (X.ESG) r1
            r1.A06 = r0
            java.lang.Object r0 = r5.FH3()
            X.Dr8 r0 = (X.C47131Dr8) r0
            boolean r0 = r0.A00
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A05 = r0
            X.Dc2 r0 = r1.A01
            if (r0 == 0) goto L_0x047a
            X.DbX.A1R(r0)
            r0 = 0
            r1.A01 = r0
        L_0x047a:
            boolean r0 = r1.A06
            if (r0 != 0) goto L_0x048d
            boolean r0 = r1.A08
            if (r0 != 0) goto L_0x048d
            boolean r0 = r1.A07
            if (r0 != 0) goto L_0x048d
            java.util.List r0 = X.ESG.A06(r1)
            r1.setItems(r0)
        L_0x048d:
            r0 = -283867818(0xffffffffef148556, float:-4.5964975E28)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 1556212892(0x5cc1ec9c, float:4.36678602E17)
            goto L_0x143f
        L_0x0498:
            r0 = -775320808(0xffffffffd1c98b18, float:-1.08202754E11)
            int r4 = X.AnonymousClass0fD.A03(r0)
            com.instagram.settings.controlcenter.api.DataDownloadStatusCheckResponse r5 = (com.instagram.settings.controlcenter.api.DataDownloadStatusCheckResponse) r5
            r0 = -1567788214(0xffffffffa28d734a, float:-3.8340194E-18)
            int r6 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r7 = r2.A01
            X.EQs r7 = (X.C48009EQs) r7
            r7.A02 = r5
            X.C48009EQs.A00(r7)
            com.instagram.settings.controlcenter.api.DataDownloadStatusCheckResponse r3 = r7.A02
            if (r3 == 0) goto L_0x04e1
            com.instagram.settings.controlcenter.api.DataDownloadStatusCheckResponse$JobStatus r1 = r3.A00
            com.instagram.settings.controlcenter.api.DataDownloadStatusCheckResponse$JobStatus r0 = com.instagram.settings.controlcenter.api.DataDownloadStatusCheckResponse.JobStatus.NO_VALID_DOWNLOADABLE
            if (r1 == r0) goto L_0x04e1
            java.lang.String r5 = r3.A03
            java.lang.String r1 = r3.A02
            r0 = 9
            X.FHb r3 = new X.FHb
            r3.<init>(r2, r0)
            X.8ab r2 = X.DbW.A0V(r7)
            r2.A05 = r5
            r2.A0q(r1)
            r1 = 2131968772(0x7f134304, float:1.9574448E38)
            r0 = 36
            X.FJg r0 = X.C50021FJg.A00(r7, r0)
            r2.A0H(r0, r1)
            r2.A0B(r3)
            X.DbT.A1V(r2)
        L_0x04e1:
            r0 = -931456777(0xffffffffc87b18f7, float:-257123.86)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = 1776907210(0x69e973ca, float:3.5278314E25)
            goto L_0x143f
        L_0x04ec:
            r0 = -1167878378(0xffffffffba639716, float:-8.6818764E-4)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.Duo r5 = (X.C47321Duo) r5
            r1 = 46234583(0x2c17bd7, float:2.8429882E-37)
            int r6 = X.AnonymousClass0fD.A03(r1)
            r9 = 0
            X.0qQ.A0B(r5, r9)
            X.DrQ r4 = r5.A00
            if (r4 == 0) goto L_0x0ab2
            com.instagram.api.schemas.UserCallSettings r5 = r4.A00
            com.instagram.api.schemas.UserCallSettings r1 = com.instagram.api.schemas.UserCallSettings.SPECIFIC_PEOPLE
            if (r5 != r1) goto L_0x0516
            java.lang.Object r3 = r2.A01
            X.ERz r3 = (X.C48034ERz) r3
            java.util.List r1 = r4.A01
            int r1 = r1.size()
            r3.A00 = r1
        L_0x0516:
            java.lang.Object r8 = r2.A01
            X.ERz r8 = (X.C48034ERz) r8
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            r1 = 2131976385(0x7f1360c1, float:1.958989E38)
            X.C46448DfA.A02(r7, r1)
            int r2 = r5.ordinal()
            r1 = 3
            if (r2 == r1) goto L_0x056a
            r1 = 2
            if (r2 == r1) goto L_0x056a
            r1 = 6
            if (r2 != r1) goto L_0x055c
            r3 = 2131976387(0x7f1360c3, float:1.9589893E38)
            r2 = 68
            X.FP9 r1 = new X.FP9
            r1.<init>((java.lang.Object) r8, (int) r2)
            X.OTn r5 = new X.OTn
            r5.<init>((android.view.View.OnClickListener) r1, (int) r3)
            android.content.res.Resources r4 = X.DbV.A05(r8)
            r3 = 2131820565(0x7f110015, float:1.9273849E38)
            int r2 = r8.A00
            java.lang.Object[] r1 = X.AnonymousClass7TF.A1b(r9)
            java.lang.String r1 = r4.getQuantityString(r3, r2, r1)
            r5.A03 = r1
            r7.add(r5)
            r1 = 2131976388(0x7f1360c4, float:1.9589895E38)
        L_0x0559:
            X.FGF.A01(r7, r1)
        L_0x055c:
            r8.setItems(r7)
            r1 = 183581489(0xaf13b31, float:2.3229721E-32)
            X.AnonymousClass0fD.A0A(r1, r6)
            r1 = 1159341260(0x451a24cc, float:2466.2998)
            goto L_0x13e4
        L_0x056a:
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            com.instagram.api.schemas.UserCallSettings r1 = com.instagram.api.schemas.UserCallSettings.PEOPLE_YOU_FOLLOW
            java.lang.String r3 = r1.A00
            android.content.Context r2 = r8.requireContext()
            r1 = 2131976383(0x7f1360bf, float:1.9589885E38)
            java.lang.String r1 = r2.getString(r1)
            X.DbV.A1V(r3, r1, r4)
            com.instagram.api.schemas.UserCallSettings r1 = com.instagram.api.schemas.UserCallSettings.OFF
            java.lang.String r3 = r1.A00
            android.content.Context r2 = r8.requireContext()
            r1 = 2131976384(0x7f1360c0, float:1.9589887E38)
            java.lang.String r1 = r2.getString(r1)
            X.DbV.A1V(r3, r1, r4)
            java.lang.String r3 = r5.A00
            r2 = 3
            X.FQV r1 = new X.FQV
            r1.<init>(r2, r8, r4)
            X.DbU.A1F(r1, r3, r7, r4)
            r1 = 2131976386(0x7f1360c2, float:1.9589891E38)
            goto L_0x0559
        L_0x05a1:
            r0 = -172258671(0xfffffffff5bb8a91, float:-4.7547362E32)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.3JC r5 = (X.AnonymousClass3JC) r5
            r0 = 1886621442(0x70738f02, float:3.0151097E29)
            int r8 = X.AnonymousClass0fD.A03(r0)
            if (r5 == 0) goto L_0x05e3
            java.lang.Object r7 = r5.A01
            if (r7 == 0) goto L_0x05e3
            X.3FZ r7 = (X.AnonymousClass3FZ) r7
            java.lang.Class<X.DqV> r6 = X.C47094DqV.class
            java.lang.String r5 = "fxcal_settings"
            X.3FZ r0 = r7.A00(r6, r5)
            if (r0 == 0) goto L_0x05e3
            java.lang.Object r3 = r2.A01
            X.ESE r3 = (X.ESE) r3
            X.3FZ r1 = r7.A00(r6, r5)
            java.lang.String r0 = "security_accounts_center_subtitle"
            r1.A05(r0)
            X.3FZ r2 = r7.A00(r6, r5)
            java.lang.Class<X.DqU> r1 = X.C47093DqU.class
            java.lang.String r0 = "ac_transition_option_two_group_of_settings_banner"
            X.3FZ r0 = r2.A00(r1, r0)
            X.DqU r0 = (X.C47093DqU) r0
            r3.A01 = r0
            X.ESE.A07(r3)
        L_0x05e3:
            r0 = 53096145(0x32a2ed1, float:5.0012253E-37)
            X.AnonymousClass0fD.A0A(r0, r8)
            r0 = 955229474(0x38efa522, float:1.14271665E-4)
            goto L_0x143f
        L_0x05ee:
            r0 = 1875401871(0x6fc85c8f, float:1.240178E29)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.371 r5 = (X.AnonymousClass371) r5
            r1 = 13952913(0xd4e791, float:1.9552196E-38)
            int r4 = X.AnonymousClass0fD.A03(r1)
            r8 = 0
            X.0qQ.A0B(r5, r8)
            X.C47696EDf.super.onSuccess(r5)
            java.lang.Object r1 = r5.FH3()
            X.Dr7 r1 = (X.C47130Dr7) r1
            X.3HX r3 = r1.A00
            if (r3 != 0) goto L_0x0628
            java.lang.Object r1 = r2.A01
            androidx.fragment.app.FragmentActivity r3 = X.DbZ.A0E(r1)
            java.lang.String r2 = "story_push_notification_launch_response_is_null"
            r1 = 2131974495(0x7f13595f, float:1.9586056E38)
            X.C59689JTv.A01(r3, r2, r1, r8)
            r1 = -1144870403(0xffffffffbbc2a9fd, float:-0.0059406743)
        L_0x0620:
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = -1015302697(0xffffffffc37bb5d7, float:-251.71031)
            goto L_0x13e4
        L_0x0628:
            java.lang.Object r5 = r2.A01
            X.E1x r5 = (X.C47428E1x) r5
            X.0eM r9 = r5.A08
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r9)
            com.instagram.reels.store.ReelStore r2 = X.1OP.A05(r1)
            r1 = 1
            com.instagram.model.reels.Reel r10 = r2.A0I(r3, r1)
            com.instagram.model.reels.ReelViewerConfig r7 = com.instagram.model.reels.ReelViewerConfig.A00()
            X.6Ye r6 = new X.6Ye
            r6.<init>()
            java.util.List r3 = X.AnonymousClass7TE.A1I(r10)
            java.lang.String r2 = r10.getId()
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r9)
            r6.A02(r1, r2, r3)
            java.lang.String r1 = r10.getId()
            java.lang.String[] r1 = new java.lang.String[]{r1}
            java.util.ArrayList r1 = X.0sr.A1L(r1)
            r6.A0A(r1)
            r6.A03 = r7
            X.3BQ r1 = X.AnonymousClass3BQ.BIRTHDAY_BOTTOM_SHEET
            r6.A03(r1)
            X.DbY.A1R(r6)
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r9)
            r6.A01(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r6.A04(r1)
            X.0lg r3 = X.DbT.A0X(r9)
            android.os.Bundle r2 = r6.A00()
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            X.6W8 r1 = X.AnonymousClass6W8.A01(r1, r2, r3)
            X.DbT.A1M(r5, r1)
            r1 = 1565099301(0x5d498525, float:9.0756583E17)
            goto L_0x0620
        L_0x0691:
            r0 = -1958230947(0xffffffff8b47c45d, float:-3.8473733E-32)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.371 r5 = (X.AnonymousClass371) r5
            r0 = -947712454(0xffffffffc7830e3a, float:-67100.45)
            int r3 = X.AnonymousClass7TG.A0D(r5, r0)
            X.C47696EDf.super.onSuccess(r5)
            java.lang.Object r6 = r2.A01
            X.E26 r6 = (X.E26) r6
            X.E26.A02(r6)
            X.E26.A01(r6)
            java.lang.Object r0 = r5.FH3()
            X.Dr3 r0 = (X.C47126Dr3) r0
            int r1 = r0.A00
            X.EWN r2 = X.EWN.A07
            int r0 = r2.A00
            if (r1 == r0) goto L_0x06de
            java.lang.Object r0 = r5.FH3()
            X.Dr3 r0 = (X.C47126Dr3) r0
            int r0 = r0.A00
            java.util.Map r1 = X.EWN.A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r1.get(r0)
            if (r1 != 0) goto L_0x06d1
            r1 = r2
        L_0x06d1:
            X.0eM r0 = r6.A0O
            java.lang.Object r0 = r0.getValue()
            X.Dkc r0 = (X.C46749Dkc) r0
            X.05G r0 = r0.A00
            r0.Epw(r1)
        L_0x06de:
            r0 = -1324866890(0xffffffffb10822b6, float:-1.9810336E-9)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 480373851(0x1ca1ec5b, float:1.0715183E-21)
            goto L_0x143f
        L_0x06e9:
            r0 = -1278883624(0xffffffffb3c5c8d8, float:-9.2100606E-8)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.Dum r5 = (X.C47319Dum) r5
            r0 = 1722830168(0x66b04d58, float:4.1628162E23)
            int r6 = X.AnonymousClass0fD.A03(r0)
            X.G8i r0 = r5.A01
            if (r0 == 0) goto L_0x0ab2
            X.Dt0 r0 = (X.C47213Dt0) r0
            com.instagram.api.schemas.FundraiserCampaignStateEnum r0 = r0.A00
            if (r0 != 0) goto L_0x0705
            com.instagram.api.schemas.FundraiserCampaignStateEnum r0 = com.instagram.api.schemas.FundraiserCampaignStateEnum.UNRECOGNIZED
        L_0x0705:
            java.lang.String r5 = r0.A00
            java.lang.Object r0 = r2.A01
            X.FQO r0 = (X.FQO) r0
            java.lang.Object r3 = r0.A01
            X.ESA r3 = (X.ESA) r3
            com.instagram.user.model.User r1 = r3.A02
            java.lang.String r0 = "READY"
            boolean r0 = r0.equals(r5)
            X.4Cl r1 = r1.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.EXu(r0)
            com.instagram.common.session.UserSession r0 = r3.A00
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r0)
            com.instagram.user.model.User r0 = r3.A02
            java.lang.String r1 = r0.getId()
            X.6uq r0 = new X.6uq
            r0.<init>()
            r0.A00 = r1
            r2.A00(r0)
            r0 = 662943218(0x2783b5f2, float:3.655707E-15)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = 1730823298(0x672a4482, float:8.0406605E23)
            goto L_0x143f
        L_0x0741:
            r0 = -1702323908(0xffffffff9a88993c, float:-5.6495845E-23)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.370 r5 = (X.AnonymousClass370) r5
            r1 = 1282602580(0x4c72f654, float:6.3691088E7)
            int r4 = X.AnonymousClass0fD.A03(r1)
            com.instagram.user.model.User r7 = X.C324696zk.A00(r5)
            if (r7 == 0) goto L_0x07c0
            java.lang.Object r5 = r2.A01
            X.FEp r5 = (X.C49915FEp) r5
            com.instagram.common.session.UserSession r3 = r5.A07
            X.1Ng r6 = X.AnonymousClass1Nd.A00(r3)
            r2 = 1
            r12 = 0
            X.6ui r1 = new X.6ui
            r1.<init>(r7)
            r6.A00(r1)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r5.A03
            java.lang.String r9 = "switch_back"
            java.lang.String r10 = "setting"
            java.lang.String r11 = "switch_back_button"
            X.Xtl r8 = new X.Xtl
            r13 = r12
            r14 = r12
            r15 = r12
            r16 = r12
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r1.Ckg(r8)
            X.DbT.A1S(r3, r7)
            r7.A0d(r3)
            X.1Av r1 = X.1Au.A00(r3)
            r1.A1g(r2)
            android.os.Handler r2 = X.AnonymousClass7TF.A0D()
            X.Fre r1 = new X.Fre
            r1.<init>(r5)
            r2.post(r1)
            X.FEd r1 = X.FA1.A01
            r1.A02(r3)
            X.4DH r3 = r5.A02
            boolean r1 = r3 instanceof X.ESS
            if (r1 == 0) goto L_0x07b5
            android.os.Handler r2 = X.AnonymousClass7TF.A0D()
            X.ESS r3 = (X.ESS) r3
            r3.getClass()
            X.Frf r1 = new X.Frf
            r1.<init>(r3)
            r2.post(r1)
        L_0x07b5:
            r1 = 1123416622(0x42f5fa2e, float:122.98863)
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = -1797296834(0xffffffff94df6d3e, float:-2.2560334E-26)
            goto L_0x13e4
        L_0x07c0:
            X.4do r1 = new X.4do
            r1.<init>(r5)
            r2.onFail(r1)
            goto L_0x07b5
        L_0x07c9:
            r0 = 1250043882(0x4a8227ea, float:4264949.0)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.3JC r5 = (X.AnonymousClass3JC) r5
            r1 = 1424100647(0x54e20d27, float:7.7670661E12)
            int r6 = X.AnonymousClass7TG.A0D(r5, r1)
            java.lang.Object r5 = r5.A01
            X.2mg r5 = (X.C229002mg) r5
            if (r5 != 0) goto L_0x07ea
            r1 = -1097993305(0xffffffffbe8df3a7, float:-0.27724954)
        L_0x07e2:
            X.AnonymousClass0fD.A0A(r1, r6)
            r1 = -559608258(0xffffffffdea50e3e, float:-5.9467559E18)
            goto L_0x13e4
        L_0x07ea:
            X.4LE r4 = r5.CGz()
            r3 = 1
            if (r4 == 0) goto L_0x0801
            boolean r1 = r4.CJw()
            if (r1 != r3) goto L_0x0801
            java.lang.Object r3 = r2.A01
            X.ES8 r3 = (X.ES8) r3
            boolean r1 = r4.BJ0()
            r3.A03 = r1
        L_0x0801:
            java.lang.Object r2 = r2.A01
            X.ES8 r2 = (X.ES8) r2
            java.lang.String r1 = r5.B9A()
            r2.A02 = r1
            X.ES8.A06(r2)
            r1 = 1463634976(0x573d4c20, float:2.08134652E14)
            goto L_0x07e2
        L_0x0812:
            r0 = -2078660224(0xffffffff841a2980, float:-1.8121669E-36)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.3JC r5 = (X.AnonymousClass3JC) r5
            r1 = -362571914(0xffffffffea639776, float:-6.8785354E25)
            int r6 = X.AnonymousClass7TG.A0D(r5, r1)
            java.lang.Object r4 = r5.A01
            X.3FZ r4 = (X.AnonymousClass3FZ) r4
            if (r4 == 0) goto L_0x0861
            java.lang.Class<X.DqQ> r3 = X.C47089DqQ.class
            java.lang.String r1 = "fxcal_settings"
            X.3FZ r4 = r4.A00(r3, r1)
            if (r4 == 0) goto L_0x0861
            java.lang.Object r3 = r2.A01
            X.ES8 r3 = (X.ES8) r3
            java.lang.String r1 = "ads_accounts_center_subtitle"
            r4.A05(r1)
            java.lang.Class<X.DqP> r2 = X.C47088DqP.class
            java.lang.String r1 = "ac_transition_option_two_group_of_settings_banner"
            X.3FZ r1 = r4.A00(r2, r1)
            X.DqP r1 = (X.C47088DqP) r1
            r3.A00 = r1
            java.lang.String r1 = "should_show_node_in_accounts_center"
            boolean r1 = r4.A06(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r3.A01 = r1
            X.ES8.A06(r3)
            r1 = 353369386(0x150ffd2a, float:2.907833E-26)
        L_0x0859:
            X.AnonymousClass0fD.A0A(r1, r6)
            r1 = 784369100(0x2ec085cc, float:8.754916E-11)
            goto L_0x13e4
        L_0x0861:
            r1 = -1983619509(0xffffffff89c45e4b, float:-4.7273956E-33)
            goto L_0x0859
        L_0x0865:
            r0 = -1577025362(0xffffffffa20080ae, float:-1.7415357E-18)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.DvN r5 = (X.DvN) r5
            r0 = 1011801199(0x3c4edc6f, float:0.012625798)
            int r3 = X.AnonymousClass7TG.A0D(r5, r0)
            java.lang.Object r2 = r2.A01
            X.ESI r2 = (X.ESI) r2
            java.lang.Boolean r1 = X.AnonymousClass7TE.A0v()
            java.lang.Boolean r0 = r5.A00
            boolean r0 = r1.equals(r0)
            r2.A0B = r0
            r0 = 848781431(0x32976077, float:1.762258E-8)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 1915129324(0x72268dec, float:3.2989494E30)
            goto L_0x143f
        L_0x0890:
            r0 = -1462736181(0xffffffffa8d06acb, float:-2.3138953E-14)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.Dvz r5 = (X.C47365Dvz) r5
            r1 = 200700792(0xbf67378, float:9.492949E-32)
            int r4 = X.AnonymousClass0fD.A03(r1)
            boolean r1 = r5.A02
            if (r1 == 0) goto L_0x08d3
            java.lang.Object r5 = r2.A01
            X.E59 r5 = (X.E59) r5
            r3 = 1
            r5.A0F = r3
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r5.A0A
            r1.setShowProgressBar(r3)
            android.os.Handler r2 = r5.A00
            java.lang.Runnable r1 = r5.A0J
            r2.removeCallbacks(r1)
            com.instagram.registration.model.RegFlowExtras r2 = r5.A05
            com.instagram.ui.widget.searchedittext.SearchEditText r1 = r5.A0B
            java.lang.String r1 = X.AnonymousClass7TF.A0f(r1)
            r2.A0Z = r1
            com.instagram.registration.model.RegFlowExtras r1 = r5.A05
            r1.A0u = r3
            X.E59.A03(r5)
        L_0x08c8:
            r1 = 1526907498(0x5b02c26a, float:3.6805507E16)
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = 1668010688(0x636bd2c0, float:4.350171E21)
            goto L_0x13e4
        L_0x08d3:
            java.lang.String r3 = r5.A01
            if (r3 == 0) goto L_0x08c8
            java.lang.Object r2 = r2.A01
            X.E59 r2 = (X.E59) r2
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            r2.EuV(r3, r1)
            goto L_0x08c8
        L_0x08e1:
            r0 = 943954703(0x38439b0f, float:4.6636032E-5)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.CEn r5 = (X.C43821CEn) r5
            r9 = r2
            monitor-enter(r9)
            r0 = -905281162(0xffffffffca0a8176, float:-2269277.5)
            int r3 = X.AnonymousClass0fD.A03(r0)     // Catch:{ all -> 0x09a7 }
            r6 = 0
            X.0qQ.A0B(r5, r6)     // Catch:{ all -> 0x09a7 }
            X.DrL r0 = r5.FH3()     // Catch:{ all -> 0x09a7 }
            java.util.List r0 = r0.A00     // Catch:{ all -> 0x09a7 }
            r1 = 0
            if (r0 == 0) goto L_0x0922
            java.lang.Object r0 = X.00k.A0O(r0, r6)     // Catch:{ all -> 0x09a7 }
            X.G8R r0 = (X.G8R) r0     // Catch:{ all -> 0x09a7 }
            if (r0 == 0) goto L_0x0922
            X.Dse r0 = (X.C47192Dse) r0     // Catch:{ all -> 0x09a7 }
            java.lang.String r1 = r0.A02     // Catch:{ all -> 0x09a7 }
            X.Dre r0 = r0.A00     // Catch:{ all -> 0x09a7 }
            if (r0 == 0) goto L_0x0922
            java.util.List r0 = r0.A01     // Catch:{ all -> 0x09a7 }
            if (r0 == 0) goto L_0x0922
            java.lang.Object r0 = X.00k.A0O(r0, r6)     // Catch:{ all -> 0x09a7 }
            X.PwS r0 = (X.C74533PwS) r0     // Catch:{ all -> 0x09a7 }
            if (r0 == 0) goto L_0x0922
            X.N5K r0 = (X.N5K) r0     // Catch:{ all -> 0x09a7 }
            java.util.List r8 = r0.A00     // Catch:{ all -> 0x09a7 }
            if (r8 != 0) goto L_0x0924
        L_0x0922:
            X.0sn r8 = X.0sn.A00     // Catch:{ all -> 0x09a7 }
        L_0x0924:
            java.lang.Object r6 = r2.A01     // Catch:{ all -> 0x09a7 }
            X.TvZ r6 = (X.C14406TvZ) r6     // Catch:{ all -> 0x09a7 }
            r6.A01 = r1     // Catch:{ all -> 0x09a7 }
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x09a7 }
            java.util.Iterator r5 = r8.iterator()     // Catch:{ all -> 0x09a7 }
        L_0x0932:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x09a7 }
            if (r0 == 0) goto L_0x0959
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x09a7 }
            X.PwR r0 = (X.C74532PwR) r0     // Catch:{ all -> 0x09a7 }
            X.Dt4 r0 = (X.C47217Dt4) r0     // Catch:{ all -> 0x09a7 }
            com.instagram.user.model.User r2 = r0.A00     // Catch:{ all -> 0x09a7 }
            if (r2 == 0) goto L_0x0932
            X.DbY.A1O(r2)     // Catch:{ all -> 0x09a7 }
            java.lang.String r1 = X.DbS.A0o(r2)     // Catch:{ all -> 0x09a7 }
            X.4Cl r0 = r2.A03     // Catch:{ all -> 0x09a7 }
            r0.EjP(r1)     // Catch:{ all -> 0x09a7 }
            X.Ma1 r0 = new X.Ma1     // Catch:{ all -> 0x09a7 }
            r0.<init>(r2)     // Catch:{ all -> 0x09a7 }
            r7.add(r0)     // Catch:{ all -> 0x09a7 }
            goto L_0x0932
        L_0x0959:
            java.util.ArrayList r0 = X.00k.A0U(r7)     // Catch:{ all -> 0x09a7 }
            r6.A03 = r0     // Catch:{ all -> 0x09a7 }
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r8)     // Catch:{ all -> 0x09a7 }
            java.util.Iterator r1 = r8.iterator()     // Catch:{ all -> 0x09a7 }
        L_0x0967:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x09a7 }
            if (r0 == 0) goto L_0x097b
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x09a7 }
            X.PwR r0 = (X.C74532PwR) r0     // Catch:{ all -> 0x09a7 }
            X.Dt4 r0 = (X.C47217Dt4) r0     // Catch:{ all -> 0x09a7 }
            java.util.List r0 = r0.A06     // Catch:{ all -> 0x09a7 }
            r2.add(r0)     // Catch:{ all -> 0x09a7 }
            goto L_0x0967
        L_0x097b:
            r6.A02 = r2     // Catch:{ all -> 0x09a7 }
            X.Twq r0 = r6.A00     // Catch:{ all -> 0x09a7 }
            if (r0 == 0) goto L_0x099b
            X.TqY r1 = r0.A00     // Catch:{ all -> 0x09a7 }
            X.Trf r0 = r1.A07     // Catch:{ all -> 0x09a7 }
            if (r0 != 0) goto L_0x0991
            java.lang.String r0 = "dataSource"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x09a7 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x09a7 }
            throw r0     // Catch:{ all -> 0x09a7 }
        L_0x0991:
            r0.A04()     // Catch:{ all -> 0x09a7 }
            X.TxA r0 = r1.A0F()     // Catch:{ all -> 0x09a7 }
            r0.A01()     // Catch:{ all -> 0x09a7 }
        L_0x099b:
            r0 = 1691636961(0x64d454e1, float:3.1334607E22)
            X.AnonymousClass0fD.A0A(r0, r3)     // Catch:{ all -> 0x09a7 }
            monitor-exit(r9)
            r0 = -2100464441(0xffffffff82cd74c7, float:-3.018907E-37)
            goto L_0x143f
        L_0x09a7:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x09aa:
            r0 = 1391719174(0x52f3f306, float:5.23877155E11)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.7ax r5 = (X.C334247ax) r5
            r0 = 506867470(0x1e362f0e, float:9.6447305E-21)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r2.A01
            X.E4s r0 = (X.C47488E4s) r0
            X.E9D r2 = r0.A03
            java.util.List r1 = r5.getItems()
            java.util.List r0 = r2.A05
            r0.clear()
            r0.addAll(r1)
            X.E9D.A00(r2)
            r0 = -992861251(0xffffffffc4d223bd, float:-1681.1168)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 567762961(0x21d76011, float:1.4594395E-18)
            goto L_0x143f
        L_0x09da:
            r0 = -1845058455(0xffffffff9206a469, float:-4.2485596E-28)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.CER r5 = (X.CER) r5
            r1 = 1962474503(0x74f8fc07, float:1.5781266E32)
            int r6 = X.AnonymousClass0fD.A03(r1)
            r4 = 0
            X.0qQ.A0B(r5, r4)
            java.lang.Object r9 = r2.A01
            X.E5e r9 = (X.C47499E5e) r9
            X.Dsj r1 = r5.A00
            if (r1 == 0) goto L_0x0ab2
            r9.A03 = r1
            X.0eM r7 = r9.A0A
            java.lang.Object r5 = r7.getValue()
            X.DmS r5 = (X.C46850DmS) r5
            X.G8X r1 = r9.A03
            java.lang.String r14 = "response"
            if (r1 == 0) goto L_0x114a
            X.Dsj r1 = (X.C47197Dsj) r1
            java.util.List r1 = r1.A00
            java.util.ArrayList r10 = X.AnonymousClass7TF.A0p(r1)
            java.util.Iterator r11 = r1.iterator()
        L_0x0a12:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x0a40
            java.lang.Object r1 = r11.next()
            X.G8Y r1 = (X.G8Y) r1
            X.Dsk r1 = (X.C47198Dsk) r1
            java.lang.String r8 = r1.A01
            if (r8 == 0) goto L_0x0a3e
            com.instagram.user.model.User r2 = r1.A00
            X.1Nr r3 = new X.1Nr
            r3.<init>(r2)
            X.0eM r1 = r9.A0D
            java.lang.String r1 = X.DbU.A0u(r1)
            boolean r2 = X.DbV.A1Z(r2, r1)
            com.instagram.model.reels.Reel r1 = new com.instagram.model.reels.Reel
            r1.<init>(r3, r8, r2)
        L_0x0a3a:
            r10.add(r1)
            goto L_0x0a12
        L_0x0a3e:
            r1 = 0
            goto L_0x0a3a
        L_0x0a40:
            java.util.List r2 = X.00k.A0X(r10)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.MutableList<com.instagram.model.reels.Reel>"
            X.0qQ.A0C(r2, r1)
            java.util.List r2 = X.0u4.A01(r2)
            r9.A08 = r2
            X.0eM r1 = r9.A0D
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            r5.Ei9(r2, r4, r1)
            java.lang.Object r10 = r7.getValue()
            X.DmS r10 = (X.C46850DmS) r10
            X.G8X r1 = r9.A03
            if (r1 == 0) goto L_0x114a
            X.Dsj r1 = (X.C47197Dsj) r1
            java.util.List r1 = r1.A00
            java.util.ArrayList r8 = X.AnonymousClass7TF.A0p(r1)
            java.util.Iterator r7 = r1.iterator()
            r5 = 0
        L_0x0a6f:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0a94
            java.lang.Object r1 = r7.next()
            int r4 = r4 + 1
            if (r5 >= 0) goto L_0x0a82
            X.0sr.A1T()
            goto L_0x1424
        L_0x0a82:
            X.G8Y r1 = (X.G8Y) r1
            X.Dsk r1 = (X.C47198Dsk) r1
            com.instagram.user.model.User r3 = r1.A00
            java.lang.String r2 = r1.A01
            X.Dtb r1 = new X.Dtb
            r1.<init>(r3, r2, r5)
            r8.add(r1)
            r5 = r4
            goto L_0x0a6f
        L_0x0a94:
            java.util.List r1 = r10.A00
            X.DbW.A0z(r10, r8, r1)
            android.view.View r4 = r9.mView
            if (r4 == 0) goto L_0x0aa7
            X.FrU r3 = new X.FrU
            r3.<init>(r9)
            r1 = 250(0xfa, double:1.235E-321)
            r4.postDelayed(r3, r1)
        L_0x0aa7:
            r1 = -1157583706(0xffffffffbb00aca6, float:-0.0019634156)
            X.AnonymousClass0fD.A0A(r1, r6)
            r1 = -164740167(0xfffffffff62e43b9, float:-8.836262E32)
            goto L_0x13e4
        L_0x0ab2:
            java.lang.String r14 = "response"
            goto L_0x114a
        L_0x0ab6:
            r0 = 827426559(0x315186ff, float:3.049024E-9)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r1 = 1846293150(0x6e0c329e, float:1.0847273E28)
            int r3 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r2 = r2.A01
            X.FAY r2 = (X.FAY) r2
            androidx.fragment.app.Fragment r1 = r2.A01
            boolean r1 = r1.isAdded()
            if (r1 != 0) goto L_0x0adb
            r1 = 2018206567(0x784b6367, float:1.6500818E34)
        L_0x0ad3:
            X.AnonymousClass0fD.A0A(r1, r3)
            r1 = 958853872(0x3926f2f0, float:1.5921495E-4)
            goto L_0x13e4
        L_0x0adb:
            androidx.fragment.app.FragmentActivity r2 = r2.A02
            r1 = 2131967911(0x7f133fa7, float:1.9572702E38)
            X.DbU.A0z(r2, r1)
            r1 = -1495749427(0xffffffffa6d8accd, float:-1.5034849E-15)
            goto L_0x0ad3
        L_0x0ae7:
            r0 = 1674305666(0x63cbe082, float:7.521733E21)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = -787179163(0xffffffffd1149965, float:-3.9889293E10)
            int r3 = X.AnonymousClass7TG.A0D(r5, r0)
            X.C47696EDf.super.onSuccess(r5)
            java.lang.Object r2 = r2.A01
            X.2YL r2 = (X.2YL) r2
            X.6oS r1 = X.C318116oQ.A00(r2)
            r0 = 20
            X.DbX.A1X(r2, r1, r0)
            r0 = 964432316(0x397c11bc, float:2.40392E-4)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 939207896(0x37fb2cd8, float:2.9942414E-5)
            goto L_0x143f
        L_0x0b10:
            r0 = 853442129(0x32de7e51, float:2.5901643E-8)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.371 r5 = (X.AnonymousClass371) r5
            r0 = -717082261(0xffffffffd542316b, float:-1.3344844E13)
            int r6 = X.AnonymousClass7TG.A0D(r5, r0)
            X.C47696EDf.super.onSuccess(r5)
            java.lang.Object r0 = r5.FH3()
            X.EtB r0 = (X.EtB) r0
            com.instagram.user.model.User r1 = r0.A00
            java.lang.Object r3 = r2.A01
            X.Fk2 r3 = (X.C50884Fk2) r3
            com.instagram.common.session.UserSession r0 = r3.A02
            X.DbT.A1S(r0, r1)
            r1.A0d(r0)
            X.4DH r0 = r3.A01
            android.content.Context r2 = r0.getContext()
            if (r2 == 0) goto L_0x0b61
            X.Dc2 r0 = r3.A00
            if (r0 == 0) goto L_0x0b49
            X.DbX.A1R(r0)
            r0 = 0
            r3.A00 = r0
        L_0x0b49:
            X.6ap r1 = X.DbS.A0a()
            X.6aq r0 = X.C310346aq.SUCCESS
            r1.A0C(r0)
            r0 = 2131970983(0x7f134ba7, float:1.9578932E38)
            X.DbS.A19(r2, r1, r0)
            X.Dc2 r0 = r1.A00()
            X.DbX.A1S(r0)
            r3.A00 = r0
        L_0x0b61:
            r0 = -1845901073(0xffffffff91f9c8ef, float:-3.9409108E-28)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = 2059324124(0x7abecadc, float:4.9532544E35)
            goto L_0x143f
        L_0x0b6c:
            r0 = 889689906(0x35079732, float:5.051144E-7)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = -1328284411(0xffffffffb0d3fd05, float:-1.5424183E-9)
            int r6 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r2.A01
            X.Fjy r1 = (X.C50880Fjy) r1
            r0 = 5
            X.FdH r5 = new X.FdH
            r5.<init>(r1, r0)
            X.6ap r3 = X.DbS.A0a()
            android.content.Context r2 = r1.A00
            r0 = 2131959911(0x7f132067, float:1.9556476E38)
            java.lang.String r1 = r2.getString(r0)
            r0 = 0
            android.text.Spanned r0 = android.text.Html.fromHtml(r1, r0)
            r3.A0D = r0
            r3.A06()
            r3.A04()
            r0 = 1
            r3.A0L = r0
            r0 = 2131959910(0x7f132066, float:1.9556474E38)
            X.DbW.A0q(r2, r3, r0)
            r3.A0A(r5)
            X.DbY.A1N(r3)
            r0 = -1384677123(0xffffffffad7780fd, float:-1.4068966E-11)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = -460575227(0xffffffffe48c2e05, float:-2.0686882E22)
            goto L_0x143f
        L_0x0bb8:
            r0 = -2044874425(0xffffffff861db147, float:-2.965866E-35)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.Dw4 r5 = (X.Dw4) r5
            r0 = -1095440981(0xffffffffbeb4e5ab, float:-0.35331473)
            int r3 = X.AnonymousClass7TG.A0D(r5, r0)
            java.lang.Object r0 = r2.A01
            X.Fjq r0 = (X.C50872Fjq) r0
            android.content.Context r0 = r0.A00
            X.8ab r1 = X.DbS.A0Y(r0)
            java.lang.String r0 = r5.A01
            r1.A05 = r0
            java.lang.String r0 = r5.A00
            r1.A0q(r0)
            X.Dba.A1L(r1)
            r0 = 549816341(0x20c58815, float:3.346315E-19)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = -1468630093(0xffffffffa8767bb3, float:-1.3682566E-14)
            goto L_0x143f
        L_0x0be9:
            r0 = 1681301500(0x64369ffc, float:1.3475342E22)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.1XT r5 = (X.AnonymousClass1XT) r5
            r1 = -975391901(0xffffffffc5dcb363, float:-7062.4233)
            int r3 = X.AnonymousClass7TG.A0D(r5, r1)
            java.lang.String r1 = r5.getFeedbackTitle()
            if (r1 == 0) goto L_0x0c05
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0c1c
        L_0x0c05:
            java.lang.String r1 = r5.getFeedbackMessage()
            if (r1 == 0) goto L_0x0c11
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0c1c
        L_0x0c11:
            r1 = -2066905440(0xffffffff84cd86a0, float:-4.8318902E-36)
            X.AnonymousClass0fD.A0A(r1, r3)
            r1 = 2133915146(0x7f30f60a, float:2.3522164E38)
            goto L_0x13e4
        L_0x0c1c:
            java.lang.Object r1 = r2.A01
            X.Fjp r1 = (X.C50871Fjp) r1
            android.content.Context r1 = r1.A00
            X.8ab r2 = X.DbS.A0Y(r1)
            r2.A06()
            java.lang.String r1 = r5.getFeedbackTitle()
            if (r1 == 0) goto L_0x0c3b
            int r1 = r1.length()
            if (r1 == 0) goto L_0x0c3b
            java.lang.String r1 = r5.getFeedbackTitle()
            r2.A05 = r1
        L_0x0c3b:
            java.lang.String r1 = r5.getFeedbackMessage()
            if (r1 == 0) goto L_0x0c4e
            int r1 = r1.length()
            if (r1 == 0) goto L_0x0c4e
            java.lang.String r1 = r5.getFeedbackMessage()
            r2.A0q(r1)
        L_0x0c4e:
            X.DbT.A1V(r2)
            goto L_0x0c11
        L_0x0c52:
            r0 = -693319461(0xffffffffd6acc8db, float:-9.4989334E13)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = 2038690216(0x7983f1a8, float:8.563653E34)
            int r6 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r2.A01
            X.Fk1 r0 = (X.C50883Fk1) r0
            android.content.Context r5 = r0.A00
            r3 = 2131959232(0x7f131dc0, float:1.9555099E38)
            r0 = 2131238106(0x7f081cda, float:1.8092481E38)
            android.graphics.drawable.Drawable r2 = r5.getDrawable(r0)
            X.6ap r1 = X.DbS.A0a()
            X.6ar r0 = X.C310356ar.CIRCULAR
            r1.A0B(r0)
            X.DbS.A19(r5, r1, r3)
            r1.A06()
            if (r2 == 0) goto L_0x0c8c
            int r0 = X.2Yu.A05(r5)
            int r0 = r5.getColor(r0)
            r1.A08(r2, r0)
        L_0x0c8c:
            X.Dbb.A1Q(r1)
            r0 = -1273557919(0xffffffffb4170c61, float:-1.4067474E-7)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = 1590186623(0x5ec8527f, float:7.2173697E18)
            goto L_0x143f
        L_0x0c9a:
            r0 = 1212699910(0x48485506, float:205140.1)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = 452557081(0x1af97919, float:1.0317963E-22)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.6ap r3 = X.DbS.A0a()
            X.6aq r0 = X.C310346aq.SUCCESS
            r3.A0C(r0)
            java.lang.Object r0 = r2.A01
            X.Fjg r0 = (X.C50862Fjg) r0
            android.content.Context r1 = r0.A00
            r0 = 2131953732(0x7f130844, float:1.9543943E38)
            X.DbS.A19(r1, r3, r0)
            X.Dbb.A1Q(r3)
            r0 = 1355926522(0x50d1cbfa, float:2.81584476E10)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -1933934223(0xffffffff8cba8171, float:-2.8735742E-31)
            goto L_0x143f
        L_0x0ccb:
            r0 = 347872337(0x14bc1c51, float:1.8994318E-26)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = -744611649(0xffffffffd39e20bf, float:-1.35830844E12)
            int r7 = X.AnonymousClass7TG.A0D(r5, r0)
            X.C47696EDf.super.onSuccess(r5)
            java.lang.Object r6 = r2.A01
            X.2YL r6 = (X.2YL) r6
            X.6oS r3 = X.C318116oQ.A00(r6)
            r2 = 0
            r1 = 39
            X.Fy7 r0 = new X.Fy7
            r0.<init>(r6, r5, r2, r1)
            X.AnonymousClass7TE.A1Z(r0, r3)
            r0 = -26855222(0xfffffffffe6638ca, float:-7.6504326E37)
            X.AnonymousClass0fD.A0A(r0, r7)
            r0 = -28947290(0xfffffffffe464ca6, float:-6.589628E37)
            goto L_0x143f
        L_0x0cfa:
            r0 = 1485860316(0x58906ddc, float:1.27041213E15)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = -239484041(0xfffffffff1b9c377, float:-1.839713E30)
            int r6 = X.AnonymousClass7TG.A0D(r5, r0)
            X.C47696EDf.super.onSuccess(r5)
            java.lang.Object r0 = r2.A01
            X.Eup r0 = (X.C49387Eup) r0
            com.instagram.profilecard.domain.ProfileCardViewModel r5 = r0.A00
            X.6oS r3 = X.C318116oQ.A00(r5)
            r2 = 0
            r1 = 1
            X.MFx r0 = new X.MFx
            r0.<init>(r5, r2, r1)
            X.AnonymousClass7TE.A1Z(r0, r3)
            r0 = -518783146(0xffffffffe113ff56, float:-1.706294E20)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = 253278619(0xf18b99b, float:7.529925E-30)
            goto L_0x143f
        L_0x0d2a:
            r0 = -421264249(0xffffffffe6e40487, float:-5.3839154E23)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = -285204100(0xffffffffef00217c, float:-3.965456E28)
            int r1 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r2.A01
            X.E3E r0 = (X.E3E) r0
            X.E3E.A00(r0)
            r0 = 2137674009(0x7f6a5119, float:3.1146043E38)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = -1019489094(0xffffffffc33bd4ba, float:-187.83096)
            goto L_0x143f
        L_0x0d4a:
            r0 = 402491559(0x17fd88a7, float:1.6384238E-24)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.DvS r5 = (X.DvS) r5
            r0 = 1676342729(0x63eaf5c9, float:8.6684976E21)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r7 = 0
            X.0qQ.A0B(r5, r7)
            java.lang.Object r6 = r2.A01
            X.E3E r6 = (X.E3E) r6
            r10 = 1
            android.view.View r1 = r6.A02
            java.lang.String r12 = "rootView"
            if (r1 == 0) goto L_0x1421
            r0 = 2131437607(0x7f0b2827, float:1.8497117E38)
            X.DbT.A1F(r1, r0, r7)
            android.view.View r1 = r6.A02
            if (r1 == 0) goto L_0x1421
            r0 = 2131435641(0x7f0b2079, float:1.849313E38)
            int r8 = X.Dbb.A03(r1, r0)
            X.F1D r0 = r5.A00
            if (r0 == 0) goto L_0x1108
            r6.A0E = r0
            com.instagram.igds.components.form.IgFormField r1 = r6.A0B
            java.lang.String r13 = "emailField"
            if (r1 == 0) goto L_0x0ed5
            r0 = 53
            X.FPC r0 = X.FPC.A00(r6, r0)
            r1.setInPickerMode(r0)
            com.instagram.igds.components.form.IgFormField r0 = r6.A0B
            if (r0 == 0) goto L_0x0ed5
            r0.A0E()
            com.instagram.igds.components.form.IgFormField r1 = r6.A0B
            if (r1 == 0) goto L_0x0ed5
            X.F1D r0 = r6.A0E
            java.lang.String r12 = "userForEditing"
            if (r0 == 0) goto L_0x1421
            java.lang.String r0 = r0.A0D
            if (r0 != 0) goto L_0x0da6
            java.lang.String r0 = ""
        L_0x0da6:
            r1.setText(r0)
            com.instagram.igds.components.form.IgFormField r0 = r6.A0B
            if (r0 == 0) goto L_0x0ed5
            r0.A0F()
            X.F1D r0 = r6.A0E
            if (r0 == 0) goto L_0x1421
            java.lang.Boolean r0 = r0.A07
            if (r0 == 0) goto L_0x0dbf
            boolean r0 = r0.booleanValue()
            r1 = 1
            if (r0 != 0) goto L_0x0dc0
        L_0x0dbf:
            r1 = 0
        L_0x0dc0:
            java.lang.String r13 = "confirmEmailButton"
            com.instagram.ui.widget.textview.ImageWithTitleTextView r0 = r6.A0H
            if (r1 == 0) goto L_0x0f56
            if (r0 == 0) goto L_0x0ed5
            r0.setVisibility(r7)
            com.instagram.ui.widget.textview.ImageWithTitleTextView r1 = r6.A0H
            if (r1 == 0) goto L_0x0ed5
            r0 = 54
            X.FPC.A01(r1, r0, r6)
        L_0x0dd4:
            com.instagram.igds.components.form.IgFormField r1 = r6.A0D
            java.lang.String r14 = "phoneField"
            if (r1 == 0) goto L_0x114a
            r0 = 56
            X.FPC r0 = X.FPC.A00(r6, r0)
            r1.setInPickerMode(r0)
            com.instagram.igds.components.form.IgFormField r0 = r6.A0D
            if (r0 == 0) goto L_0x114a
            r0.A0F()
            X.F1D r2 = r6.A0E
            if (r2 == 0) goto L_0x1421
            java.lang.String r0 = r2.A0M
            if (r0 == 0) goto L_0x0df9
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x0dfa
        L_0x0df9:
            r0 = 1
        L_0x0dfa:
            java.lang.String r13 = "confirmPhoneNumberButton"
            if (r0 != 0) goto L_0x0f4d
            boolean r0 = r2.A0Z
            if (r0 == 0) goto L_0x0f4d
            android.content.Context r1 = r6.requireContext()
            android.content.Context r0 = r6.getContext()
            int r0 = X.2Yu.A0A(r0)
            int r1 = r1.getColor(r0)
            com.instagram.ui.widget.textview.ImageWithTitleTextView r0 = r6.A0I
            if (r0 == 0) goto L_0x0ed5
            android.graphics.drawable.Drawable r0 = r0.A01
            if (r0 == 0) goto L_0x0e23
            android.graphics.drawable.Drawable r0 = r0.mutate()
            if (r0 == 0) goto L_0x0e23
            X.AnonymousClass7TE.A1R(r0, r1)
        L_0x0e23:
            com.instagram.ui.widget.textview.ImageWithTitleTextView r0 = r6.A0I
            if (r0 == 0) goto L_0x0ed5
            r0.setVisibility(r7)
            com.instagram.ui.widget.textview.ImageWithTitleTextView r1 = r6.A0I
            if (r1 == 0) goto L_0x0ed5
            r0 = 57
            X.FPC.A01(r1, r0, r6)
        L_0x0e33:
            com.instagram.igds.components.form.IgFormField r1 = r6.A0D
            if (r1 == 0) goto L_0x114a
            X.F1D r0 = r6.A0E
            if (r0 == 0) goto L_0x1421
            java.lang.String r0 = r0.A0M
            if (r0 != 0) goto L_0x0e41
            java.lang.String r0 = ""
        L_0x0e41:
            r1.setText(r0)
            com.instagram.igds.components.form.IgFormField r1 = r6.A0C
            java.lang.String r11 = "genderField"
            if (r1 == 0) goto L_0x0fe1
            r0 = 55
            X.FPC r0 = X.FPC.A00(r6, r0)
            r1.setInPickerMode(r0)
            com.instagram.igds.components.form.IgFormField r0 = r6.A0C
            if (r0 == 0) goto L_0x0fe1
            r0.A0F()
            X.F1D r2 = r6.A0E
            if (r2 == 0) goto L_0x1421
            int r1 = r2.A00
            if (r1 == r10) goto L_0x0f38
            r0 = 2
            if (r1 == r0) goto L_0x0f40
            r0 = 3
            if (r1 == r0) goto L_0x0f30
            r0 = 4
            if (r1 != r0) goto L_0x0f30
            java.lang.String r0 = r2.A0C
        L_0x0e6d:
            com.instagram.igds.components.form.IgFormField r1 = r6.A0C
            if (r1 == 0) goto L_0x0fe1
            if (r0 == 0) goto L_0x0fbc
            r1.setText(r0)
            X.F1D r0 = r6.A0E
            r13 = r12
            if (r0 == 0) goto L_0x0ed5
            java.util.Date r0 = r0.A0P
            X.0eM r5 = r6.A0L
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r5)
            if (r0 != 0) goto L_0x0f2c
            X.EZt r0 = X.C48151EZt.A02
        L_0x0e87:
            X.C48923EmN.A00(r0, r1)
            X.F1D r0 = r6.A0E
            if (r0 == 0) goto L_0x0ed5
            java.util.Date r2 = r0.A0P
            java.lang.String r11 = "birthdayField"
            if (r2 == 0) goto L_0x0ea7
            com.instagram.igds.components.form.IgFormField r1 = r6.A0A
            if (r1 == 0) goto L_0x0fe1
            r0 = 2
            java.text.DateFormat r0 = java.text.DateFormat.getDateInstance(r0)
            java.lang.String r0 = r0.format(r2)
            X.0qQ.A07(r0)
            r1.setText(r0)
        L_0x0ea7:
            com.instagram.igds.components.form.IgFormField r0 = r6.A0A
            if (r0 == 0) goto L_0x0fe1
            r0.A0F()
            boolean r0 = r6.A0K
            java.lang.String r9 = "updateBirthdayOnFacebook"
            if (r0 == 0) goto L_0x0eda
            android.widget.TextView r0 = r6.A04
            if (r0 == 0) goto L_0x0fb7
            r0.setVisibility(r7)
            r0 = 50
        L_0x0ebd:
            X.FPC r1 = X.FPC.A00(r6, r0)
            com.instagram.igds.components.form.IgFormField r0 = r6.A0A
            if (r0 == 0) goto L_0x0fe1
            r0.setInPickerMode(r1)
            com.instagram.igds.components.form.IgFormField r0 = r6.A0A
            if (r0 == 0) goto L_0x0fe1
            r0.A0F()
            android.view.ViewGroup r0 = r6.A03
            if (r0 != 0) goto L_0x0f5d
            java.lang.String r13 = "birthdayContainer"
        L_0x0ed5:
            X.0qQ.A0F(r13)
            goto L_0x1424
        L_0x0eda:
            X.0lg r2 = X.DbT.A0X(r5)
            X.F1D r0 = r6.A0E
            if (r0 == 0) goto L_0x0ed5
            boolean r0 = r0.A0a
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            X.0Aj r2 = X.Dbb.A0E(r2)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0f02
            boolean r0 = X.AnonymousClass7TF.A1Y(r1, r10)
            if (r0 == 0) goto L_0x0f29
            java.lang.String r1 = "show_birthday_not_confirmed_button"
        L_0x0efa:
            java.lang.String r0 = "event_name"
            r2.AAJ(r0, r1)
            r2.Cgf()
        L_0x0f02:
            X.F1D r0 = r6.A0E
            if (r0 == 0) goto L_0x0ed5
            boolean r0 = r0.A0a
            if (r0 == 0) goto L_0x0f26
            android.widget.TextView r0 = r6.A04
            if (r0 == 0) goto L_0x0fb7
            int r0 = r0.getVisibility()
            if (r0 != r8) goto L_0x0f26
            com.instagram.ui.widget.textview.ImageWithTitleTextView r0 = r6.A0G
            java.lang.String r13 = "ageNotVerifiedAlertButton"
            if (r0 == 0) goto L_0x0ed5
            r0.setVisibility(r7)
            com.instagram.ui.widget.textview.ImageWithTitleTextView r1 = r6.A0G
            if (r1 == 0) goto L_0x0ed5
            r0 = 51
            X.FPC.A01(r1, r0, r6)
        L_0x0f26:
            r0 = 52
            goto L_0x0ebd
        L_0x0f29:
            java.lang.String r1 = "not_show_birthday_not_confirmed_button"
            goto L_0x0efa
        L_0x0f2c:
            X.EZt r0 = X.C48151EZt.A04
            goto L_0x0e87
        L_0x0f30:
            android.content.Context r1 = r6.requireContext()
            r0 = 2131963027(0x7f132c93, float:1.9562796E38)
            goto L_0x0f47
        L_0x0f38:
            android.content.Context r1 = r6.requireContext()
            r0 = 2131963024(0x7f132c90, float:1.956279E38)
            goto L_0x0f47
        L_0x0f40:
            android.content.Context r1 = r6.requireContext()
            r0 = 2131963023(0x7f132c8f, float:1.9562788E38)
        L_0x0f47:
            java.lang.String r0 = r1.getString(r0)
            goto L_0x0e6d
        L_0x0f4d:
            com.instagram.ui.widget.textview.ImageWithTitleTextView r0 = r6.A0I
            if (r0 == 0) goto L_0x0ed5
            r0.setVisibility(r8)
            goto L_0x0e33
        L_0x0f56:
            if (r0 == 0) goto L_0x0ed5
            r0.setVisibility(r8)
            goto L_0x0dd4
        L_0x0f5d:
            X.AnonymousClass0fU.A00(r1, r0)
            X.F1D r0 = r6.A0E
            if (r0 == 0) goto L_0x1421
            java.util.Date r0 = r0.A0P
            if (r0 != 0) goto L_0x0f78
            java.lang.String r0 = ""
        L_0x0f6a:
            r6.A0J = r0
            X.0lg r0 = X.DbT.A0X(r5)
            java.lang.String r2 = r6.A0J
            if (r2 != 0) goto L_0x0f8c
            java.lang.String r12 = "originalBirthday"
            goto L_0x1421
        L_0x0f78:
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r0 = "yyyy-MM-dd"
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            r1.<init>(r0, r2)
            X.F1D r0 = r6.A0E
            if (r0 == 0) goto L_0x1421
            java.util.Date r0 = r0.A0P
            java.lang.String r0 = r1.format(r0)
            goto L_0x0f6a
        L_0x0f8c:
            X.0Aj r1 = X.Dbb.A0E(r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0f9b
            java.lang.String r0 = "personal_information_impression"
            X.Dbb.A1E(r1, r0, r2)
        L_0x0f9b:
            X.FBX r0 = r6.A0F
            if (r0 != 0) goto L_0x0fa3
            java.lang.String r12 = "qplHelper"
            goto L_0x1421
        L_0x0fa3:
            X.02m r2 = r0.A00
            r1 = 857808781(0x33211f8d, float:3.751443E-8)
            r0 = 2
            r2.markerEnd(r1, r0)
            r0 = 1333874195(0x4f814e13, float:4.3387551E9)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 945592611(0x385c9923, float:5.2594707E-5)
            goto L_0x143f
        L_0x0fb7:
            X.0qQ.A0F(r9)
            goto L_0x1424
        L_0x0fbc:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            throw r1
        L_0x0fc1:
            r0 = 1559301935(0x5cf10f2f, float:5.42817311E17)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.Dvy r5 = (X.C47364Dvy) r5
            r0 = -445157252(0xffffffffe577707c, float:-7.303122E22)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r13 = 0
            X.0qQ.A0B(r5, r13)
            java.lang.Object r2 = r2.A01
            X.E6h r2 = (X.C47521E6h) r2
            r2.A07 = r13
            X.E8x r1 = r2.A03
            if (r1 != 0) goto L_0x0fe6
            java.lang.String r11 = "socialContextFollowListAdapter"
        L_0x0fe1:
            X.0qQ.A0F(r11)
            goto L_0x1424
        L_0x0fe6:
            java.util.Set r0 = r1.A07
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0ffb
            java.util.Set r0 = r1.A08
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0ffb
            boolean r0 = r2.A07
            X.C46445Df7.A01(r2, r0)
        L_0x0ffb:
            X.0eM r6 = r2.A0C
            X.0lg r8 = X.DbT.A0X(r6)
            X.0Tu r7 = X.0Tu.A05
            r0 = 36325003733512746(0x810d660000322a, double:3.035416857898569E-306)
            boolean r0 = X.182.A06(r7, r8, r0)
            X.E8x r9 = r2.A03
            java.lang.String r11 = "socialContextFollowListAdapter"
            if (r9 == 0) goto L_0x0fe1
            r8 = 0
            if (r0 == 0) goto L_0x101a
            boolean r1 = r2.A06
            r0 = 0
            if (r1 == 0) goto L_0x101b
        L_0x101a:
            r0 = 1
        L_0x101b:
            r9.A00 = r0
            java.util.List r1 = r5.A00
            X.0qQ.A0B(r1, r13)
            java.util.List r0 = r9.A05
            r0.clear()
            java.util.Set r7 = r9.A07
            r7.clear()
            r0.addAll(r1)
            java.util.Iterator r1 = r1.iterator()
        L_0x1033:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x1045
            com.instagram.user.model.User r0 = X.DbT.A0k(r1)
            java.lang.String r0 = r0.getId()
            r7.add(r0)
            goto L_0x1033
        L_0x1045:
            boolean r0 = r9.A00
            if (r0 == 0) goto L_0x104c
            r9.A0C()
        L_0x104c:
            com.instagram.user.userlist.intf.SocialContextFollowListFragmentConfig r9 = r2.A04
            java.lang.String r12 = "config"
            if (r9 == 0) goto L_0x1421
            boolean r0 = r9.A02
            if (r0 == 0) goto L_0x1094
            X.E8x r7 = r2.A03
            if (r7 == 0) goto L_0x0fe1
            int r1 = r9.A00
            r0 = 6
            if (r1 <= r0) goto L_0x1064
            boolean r0 = r9.A05
            if (r0 != 0) goto L_0x1064
            r8 = 1
        L_0x1064:
            r7.A02 = r8
        L_0x1066:
            X.E8x r8 = r2.A03
            if (r8 == 0) goto L_0x0fe1
            java.util.List r1 = r5.A01
            X.0qQ.A0B(r1, r13)
            java.util.List r0 = r8.A06
            r0.clear()
            java.util.Set r7 = r8.A08
            r7.clear()
            r0.addAll(r1)
            java.util.Iterator r1 = r0.iterator()
        L_0x1080:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x10a4
            java.lang.Object r0 = r1.next()
            X.17B r0 = (X.AnonymousClass17B) r0
            java.lang.String r0 = r0.getId()
            r7.add(r0)
            goto L_0x1080
        L_0x1094:
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x1066
            X.E8x r1 = r2.A03
            if (r1 == 0) goto L_0x0fe1
            boolean r0 = r9.A05
            if (r0 != 0) goto L_0x10a1
            r8 = 1
        L_0x10a1:
            r1.A01 = r8
            goto L_0x1066
        L_0x10a4:
            boolean r0 = r8.A00
            if (r0 == 0) goto L_0x10ab
            r8.A0C()
        L_0x10ab:
            java.util.List r0 = r5.A01
            X.0qQ.A07(r0)
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x10fd
            java.util.List r0 = r5.A00
            X.0qQ.A07(r0)
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x10ea
            java.util.List r0 = r5.A00
            java.util.Iterator r7 = r0.iterator()
        L_0x10c7:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x10d7
            com.instagram.user.model.User r1 = X.DbT.A0k(r7)
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A05
            r1.A0n(r0)
            goto L_0x10c7
        L_0x10d7:
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r6)
            java.util.List r9 = r5.A00
            X.0qQ.A07(r9)
            r12 = 1
            r10 = 0
            X.1OC r0 = X.C320126ro.A04(r8, r9, r10, r12, r13)
            r2.schedule(r0)
        L_0x10ea:
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r6)
            java.util.List r9 = r5.A01
            X.0qQ.A07(r9)
            r12 = 1
            r10 = 0
            X.1OC r0 = X.C320126ro.A04(r8, r9, r10, r12, r13)
            r2.schedule(r0)
        L_0x10fd:
            r0 = 1606434944(0x5fc04080, float:2.7706426E19)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = -629088309(0xffffffffda80dfcb, float:-1.813743E16)
            goto L_0x143f
        L_0x1108:
            java.lang.IllegalArgumentException r1 = X.DbU.A0h()
            r0 = -1717862995(0xffffffff999b7dad, float:-1.6077384E-23)
            X.AnonymousClass0fD.A0A(r0, r3)
            throw r1
        L_0x1113:
            r0 = -1727279946(0xffffffff990bccb6, float:-7.227473E-24)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.371 r5 = (X.AnonymousClass371) r5
            r0 = 1876410881(0x6fd7c201, float:1.3354763E29)
            int r6 = X.AnonymousClass7TG.A0D(r5, r0)
            X.C47696EDf.super.onSuccess(r5)
            java.lang.Object r7 = r2.A01
            X.ESH r7 = (X.ESH) r7
            java.lang.Object r0 = r5.FH3()
            X.Dr3 r0 = (X.C47126Dr3) r0
            int r0 = r0.A00
            java.util.Map r1 = X.EWN.A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.get(r0)
            if (r0 != 0) goto L_0x1140
            X.EWN r0 = X.EWN.A07
        L_0x1140:
            java.lang.String r9 = r0.toString()
            r7.A02 = r9
            if (r9 != 0) goto L_0x114f
            java.lang.String r14 = "prevSelectedAudienceId"
        L_0x114a:
            X.0qQ.A0F(r14)
            goto L_0x1424
        L_0x114f:
            r7.A03 = r9
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            X.EWN r0 = X.EWN.A07
            java.lang.String r2 = r0.A01
            android.content.Context r1 = r7.requireContext()
            r0 = 2131953822(0x7f13089e, float:1.9544126E38)
            java.lang.String r0 = r1.getString(r0)
            X.DbV.A1V(r2, r0, r8)
            X.EWN r0 = X.EWN.CLOSE_FRIENDS
            java.lang.String r2 = r0.A01
            android.content.Context r1 = r7.requireContext()
            r0 = 2131953818(0x7f13089a, float:1.9544118E38)
            java.lang.String r0 = r1.getString(r0)
            X.DbV.A1V(r2, r0, r8)
            X.EWN r0 = X.EWN.RECIPROCAL_FOLLOWS
            java.lang.String r2 = r0.A01
            android.content.Context r1 = r7.requireContext()
            r0 = 2131953823(0x7f13089f, float:1.9544128E38)
            java.lang.String r0 = r1.getString(r0)
            X.DbV.A1V(r2, r0, r8)
            r0 = 2131953821(0x7f13089d, float:1.9544124E38)
            X.DfA r5 = X.C46448DfA.A00(r0)
            r1 = 2
            X.FQV r0 = new X.FQV
            r0.<init>(r1, r7, r8)
            X.OTj r3 = new X.OTj
            r3.<init>(r0, r9, r8)
            r0 = 2131953820(0x7f13089c, float:1.9544122E38)
            X.FGF r2 = new X.FGF
            r2.<init>((int) r0)
            r1 = 2131953819(0x7f13089b, float:1.954412E38)
            X.FGF r0 = new X.FGF
            r0.<init>((int) r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r5, r3, r2, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            r7.setItems(r0)
            X.Dc2 r0 = r7.A00
            if (r0 == 0) goto L_0x11c2
            X.DbX.A1R(r0)
            r0 = 0
            r7.A00 = r0
        L_0x11c2:
            r0 = -1620731382(0xffffffff9f659a0a, float:-4.8620054E-20)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = 1684259941(0x6463c465, float:1.680625E22)
            goto L_0x143f
        L_0x11cd:
            r0 = -569474007(0xffffffffde0e8429, float:-2.56734453E18)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.DvQ r5 = (X.DvQ) r5
            r0 = -1651241786(0xffffffff9d940cc6, float:-3.918848E-21)
            int r6 = X.AnonymousClass7TG.A0D(r5, r0)
            java.lang.Object r7 = r2.A01
            X.E31 r7 = (X.E31) r7
            androidx.fragment.app.FragmentActivity r3 = r7.getActivity()
            if (r3 == 0) goto L_0x11f8
            r0 = 2131970027(0x7f1347eb, float:1.9576993E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r3, r0)
            X.6aq r1 = X.C310346aq.DEFAULT
            java.lang.String r0 = ""
            X.E31.A00(r1, r2, r0)
            r3.onBackPressed()
        L_0x11f8:
            X.0eM r0 = r7.A08
            java.lang.Object r2 = r0.getValue()
            X.1Ng r2 = (X.1Ng) r2
            X.0eM r0 = r7.A09
            java.lang.String r1 = X.DbU.A0u(r0)
            com.instagram.user.model.User r0 = r5.A00
            X.C50278FWj.A00(r2, r0, r1)
            X.0eM r0 = r7.A07
            X.Dbb.A1W(r0)
            r0 = -1191318848(0xffffffffb8fdeac0, float:-1.2107706E-4)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = 197590696(0xbc6fea8, float:7.664999E-32)
            goto L_0x143f
        L_0x121b:
            r0 = -1889234088(0xffffffff8f649358, float:-1.1269645E-29)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.DvS r5 = (X.DvS) r5
            r0 = 1138455021(0x43db71ed, float:438.89005)
            int r3 = X.AnonymousClass7TG.A0D(r5, r0)
            java.lang.Object r1 = r2.A01
            X.0sP r1 = (X.0sP) r1
            X.F1D r0 = r5.A00
            r1.invoke(r0)
            r0 = 1405440573(0x53c5523d, float:1.69497657E12)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 1819960969(0x6c7a6689, float:1.21086265E27)
            goto L_0x143f
        L_0x123f:
            r0 = 562778438(0x218b5146, float:9.440519E-19)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = 699134775(0x29abf337, float:7.6361165E-14)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r2.A01
            android.content.Context r2 = X.DbT.A07(r0)
            r1 = 2131972137(0x7f135029, float:1.9581273E38)
            r0 = 0
            X.C59689JTv.A08(r2, r1, r0)
            r0 = 1114267514(0x426a5f7a, float:58.59324)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 806544328(0x3012e3c8, float:5.3438187E-10)
            goto L_0x143f
        L_0x1265:
            r0 = 799265261(0x2fa3d1ed, float:2.9798689E-10)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = -1495374321(0xffffffffa6de660f, float:-1.5432008E-15)
            int r3 = X.AnonymousClass7TG.A0D(r5, r0)
            X.C47696EDf.super.onSuccess(r5)
            java.lang.Object r0 = r2.A01
            X.FnK r0 = (X.C51028FnK) r0
            com.instagram.common.session.UserSession r0 = r0.A02
            X.F3s r2 = X.C49061Eof.A00(r0)
            X.EWT r1 = X.EWT.UNFOLLOW_USER_FLOW
            r0 = 0
            r2.A01(r1, r0)
            r0 = 384107536(0x16e50410, float:3.699951E-25)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 903501379(0x35da5643, float:1.6267371E-6)
            goto L_0x143f
        L_0x1291:
            r0 = -90340650(0xfffffffffa9d82d6, float:-4.0892214E35)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.DvR r5 = (X.DvR) r5
            r0 = 1756267450(0x68ae83ba, float:6.5929736E24)
            int r6 = X.AnonymousClass0fD.A03(r0)
            r3 = 0
            X.0qQ.A0B(r5, r3)
            java.lang.Object r2 = r2.A01
            X.E35 r2 = (X.E35) r2
            X.0eM r0 = r2.A0C
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.17i r1 = X.17h.A00(r0)
            com.instagram.user.model.User r0 = r5.A00
            if (r0 == 0) goto L_0x13ed
            r1.A03(r0)
            X.DbY.A18(r2, r3)
            X.DbT.A1J(r2)
            r0 = -1840837931(0xffffffff92470ad5, float:-6.280668E-28)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = -144274498(0xfffffffff7668bbe, float:-4.6760257E33)
            goto L_0x143f
        L_0x12cb:
            r0 = 892089098(0x352c330a, float:6.4149265E-7)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.DvC r5 = (X.DvC) r5
            r1 = -1966299477(0xffffffff8acca6ab, float:-1.9707179E-32)
            int r4 = X.AnonymousClass0fD.A03(r1)
            if (r5 == 0) goto L_0x1308
            java.lang.String r1 = r5.A00
        L_0x12df:
            android.net.Uri r3 = X.C318866pf.A00(r1)
            java.lang.Object r1 = r2.A01
            X.6pf r1 = (X.C318866pf) r1
            X.4DH r6 = r1.A02
            android.content.Context r5 = r6.getContext()
            com.instagram.common.session.UserSession r7 = r1.A05
            java.lang.String r9 = r3.toString()
            r10 = 0
            r1 = 897(0x381, float:1.257E-42)
            java.lang.String r8 = X.C273654mx.A00(r1)
            X.FFi.A01(r5, r6, r7, r8, r9, r10)
            r1 = -1770222528(0xffffffff967c8c40, float:-2.0400653E-25)
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = 1520556936(0x5aa1db88, float:2.27794242E16)
            goto L_0x13e4
        L_0x1308:
            r1 = 0
            goto L_0x12df
        L_0x130a:
            r0 = -1463386335(0xffffffffa8c67f21, float:-2.203755E-14)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.Dvz r5 = (X.C47365Dvz) r5
            r1 = -1540610263(0xffffffffa42c2729, float:-3.7329725E-17)
            int r7 = X.AnonymousClass0fD.A03(r1)
            r6 = 0
            X.0qQ.A0B(r5, r6)
            boolean r1 = r5.A02
            java.lang.Object r4 = r2.A01
            X.E33 r4 = (X.E33) r4
            if (r1 == 0) goto L_0x1334
            X.E33.A00(r4)
        L_0x1329:
            r1 = 1551548055(0x5c7abe97, float:2.823132E17)
            X.AnonymousClass0fD.A0A(r1, r7)
            r1 = -1137182643(0xffffffffbc37f84d, float:-0.011228633)
            goto L_0x13e4
        L_0x1334:
            X.2dZ r1 = r4.A01
            if (r1 == 0) goto L_0x133b
            r1.setIsLoading(r6)
        L_0x133b:
            java.lang.String r3 = r5.A01
            java.lang.String r2 = "edit_username_failed"
            if (r3 == 0) goto L_0x1329
            android.content.Context r1 = r4.requireContext()
            X.C59689JTv.A03(r1, r3, r2, r6)
            goto L_0x1329
        L_0x1349:
            r0 = -723002036(0xffffffffd4e7dd4c, float:-7.9668015E12)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.CFg r5 = (X.C43840CFg) r5
            r1 = 844179787(0x3251294b, float:1.217479E-8)
            int r4 = X.AnonymousClass0fD.A03(r1)
            r6 = 0
            X.0qQ.A0B(r5, r6)
            X.C47696EDf.super.onSuccess(r5)
            java.lang.Object r3 = r2.A01
            X.E33 r3 = (X.E33) r3
            X.6ve r7 = r3.A05
            if (r7 == 0) goto L_0x1372
            r2 = 1
            r1 = 3470(0xd8e, float:4.863E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            r7.A0A(r1, r2)
        L_0x1372:
            X.6ve r2 = r3.A05
            if (r2 == 0) goto L_0x137b
            java.lang.String r1 = "edit_user_name"
            r2.A04(r1)
        L_0x137b:
            com.instagram.user.model.User r7 = r3.A06
            if (r7 == 0) goto L_0x13db
            X.CtK r1 = r5.A00
            if (r1 == 0) goto L_0x13ed
            java.lang.String r5 = r1.A00
            if (r5 == 0) goto L_0x13e8
            X.4Cl r2 = r7.A03
            boolean r1 = r2 instanceof X.C262174Ck
            if (r1 == 0) goto L_0x139a
            r1 = 3672(0xe58, float:5.146E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.0qQ.A0C(r2, r1)
            X.4Ck r2 = (X.C262174Ck) r2
            r2.A7d = r5
        L_0x139a:
            X.4Cl r2 = r7.A03
            boolean r1 = r2 instanceof X.1cB
            if (r1 == 0) goto L_0x13aa
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.user.model.MutablePandoUserDict"
            X.0qQ.A0C(r2, r1)
            X.1cB r2 = (X.1cB) r2
            r2.Epr(r5)
        L_0x13aa:
            X.4Cl r2 = r7.A03
            boolean r1 = r2 instanceof X.C249963kf
            if (r1 == 0) goto L_0x13ba
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.user.model.LiveTreeUserDict"
            X.0qQ.A0C(r2, r1)
            X.3kf r2 = (X.C249963kf) r2
            r2.Epr(r5)
        L_0x13ba:
            X.FGv.A04(r5)
            X.0eM r2 = r3.A0D
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r2)
            X.DbT.A1S(r1, r7)
            X.0lg r1 = X.DbT.A0X(r2)
            X.6qt r1 = X.C319606qt.A01(r1)
            r1.A0F(r7)
            X.2dZ r1 = r3.A01
            if (r1 == 0) goto L_0x13d8
            r1.setIsLoading(r6)
        L_0x13d8:
            X.DbT.A1J(r3)
        L_0x13db:
            r1 = -653615058(0xffffffffd90aa02e, float:-2.43872914E15)
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = 1445812940(0x562d5acc, float:4.765137E13)
        L_0x13e4:
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        L_0x13e8:
            java.lang.String r12 = X.Dbm.A01()
            goto L_0x1421
        L_0x13ed:
            java.lang.String r12 = "user"
            goto L_0x1421
        L_0x13f0:
            r0 = 1354996561(0x50c39b51, float:2.62538875E10)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.CE0 r5 = (X.CE0) r5
            r0 = -869256591(0xffffffffcc303271, float:-4.6188996E7)
            int r7 = X.AnonymousClass0fD.A03(r0)
            r6 = 0
            X.0qQ.A0B(r5, r6)
            X.C47696EDf.super.onSuccess(r5)
            java.lang.Object r1 = r2.A01
            X.Dkh r1 = (X.C46754Dkh) r1
            X.BB3 r0 = r5.A00
            if (r0 == 0) goto L_0x1429
            java.util.List r0 = r0.A00
            r1.A00 = r0
            X.05G r3 = r1.A03
            java.lang.Object r0 = r3.getValue()
            X.EPH r0 = (X.EPH) r0
            java.util.List r2 = r1.A00
            if (r2 != 0) goto L_0x142c
            java.lang.String r12 = "recommendationsList"
        L_0x1421:
            X.0qQ.A0F(r12)
        L_0x1424:
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x1429:
            java.lang.String r12 = "response"
            goto L_0x1421
        L_0x142c:
            boolean r1 = r0.A01
            X.EPH r0 = new X.EPH
            r0.<init>(r2, r6, r1)
            r3.Epw(r0)
            r0 = 74233515(0x46cb6ab, float:2.7825544E-36)
            X.AnonymousClass0fD.A0A(r0, r7)
            r0 = 138118451(0x83b8533, float:5.642984E-34)
        L_0x143f:
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47696EDf.onSuccess(java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int i;
        int i2;
        switch (this.A00) {
            case 31:
                i = AnonymousClass0fD.A03(172420358);
                C47310Dud dud = (C47310Dud) obj;
                int A03 = AnonymousClass0fD.A03(-1829881045);
                0qQ.A0B(dud, 0);
                C47696EDf.super.onSuccessInBackground(dud);
                C49358EuM A002 = C49017Ent.A00((UserSession) this.A01);
                C47134DrB drB = dud.A00;
                if (drB != null) {
                    A002.A00 = Math.max(0, drB.A00);
                    AnonymousClass0fD.A0A(515535764, A03);
                    i2 = 2029538506;
                    break;
                } else {
                    C41845B3m.A0v();
                    throw AnonymousClass00P.createAndThrow();
                }
            case 54:
                i = AnonymousClass0fD.A03(1819793058);
                int A032 = AnonymousClass0fD.A03(-58100656);
                1Av A003 = 1Au.A00((UserSession) this.A01);
                long currentTimeMillis = System.currentTimeMillis();
                0xY A0p = AnonymousClass7TE.A0p(A003);
                A0p.E5c(AnonymousClass000.A00(1544), currentTimeMillis);
                A0p.apply();
                AnonymousClass0fD.A0A(1013077606, A032);
                i2 = -35391406;
                break;
            case 57:
                i = AnonymousClass0fD.A03(-1610701840);
                int A033 = AnonymousClass0fD.A03(-775955793);
                C47449E2v e2v = (C47449E2v) this.A01;
                AnonymousClass0eM r3 = e2v.A09;
                User A0Q = AnonymousClass7TF.A0Q(AnonymousClass7TE.A0l(r3));
                A0Q.A03.EZ8(Boolean.valueOf(e2v.A05));
                A0Q.A0d(DbT.A0X(r3));
                e2v.A03 = true;
                C47449E2v.A01(e2v);
                AnonymousClass0fD.A0A(1038189473, A033);
                i2 = 1502756683;
                break;
            case 58:
                i = AnonymousClass0fD.A03(-2115180556);
                int A034 = AnonymousClass0fD.A03(-811880820);
                C47449E2v e2v2 = (C47449E2v) this.A01;
                AnonymousClass0eM r32 = e2v2.A09;
                User A0Q2 = AnonymousClass7TF.A0Q(AnonymousClass7TE.A0l(r32));
                A0Q2.A03.Edr(Boolean.valueOf(e2v2.A04));
                A0Q2.A0d(DbT.A0X(r32));
                e2v2.A06 = true;
                C47449E2v.A01(e2v2);
                AnonymousClass0fD.A0A(1575881963, A034);
                i2 = -947536820;
                break;
            default:
                C47696EDf.super.onSuccessInBackground(obj);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }
}
