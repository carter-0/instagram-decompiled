package X;

import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.fragment.AccountTypeSelectionV2Fragment;
import com.instagram.business.fragment.InviteFollowersV2Fragment;
import com.instagram.business.fragment.OnboardingCheckListFragment;
import com.instagram.business.fragment.SuggestBusinessFragment;
import com.instagram.business.fragment.SupportLinksFragment;
import com.instagram.business.fragment.SupportProfileDisplayOptionsFragment;
import com.instagram.business.fragment.SupportServiceEditUrlFragment;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.util.HashMap;
import java.util.Map;
import org.webrtc.EglBase14Impl;

/* renamed from: X.EDg  reason: case insensitive filesystem */
public final class C47697EDg extends 1P0 {
    public final int A00;
    public final Object A01;

    public C47697EDg(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static C47697EDg A00(Object obj, int i) {
        return new C47697EDg(obj, i);
    }

    public static void A01(AnonymousClass4DH r1, 1OC r2, int i) {
        r2.A00 = new C47697EDg(r1, i);
        r1.schedule(r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x05fd, code lost:
        X.AnonymousClass0fD.A0A(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0600, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0612, code lost:
        X.0qQ.A0F(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0619, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0652, code lost:
        X.AnonymousClass0fD.A0A(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0655, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0731, code lost:
        X.AnonymousClass0fD.A0A(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0734, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFail(X.C268654dm r14) {
        /*
            r13 = this;
            int r0 = r13.A00
            switch(r0) {
                case 0: goto L_0x06b0;
                case 1: goto L_0x0684;
                case 2: goto L_0x066c;
                case 3: goto L_0x0005;
                case 4: goto L_0x0656;
                case 5: goto L_0x05ca;
                case 6: goto L_0x0005;
                case 7: goto L_0x05a8;
                case 8: goto L_0x0005;
                case 9: goto L_0x0561;
                case 10: goto L_0x054c;
                case 11: goto L_0x0537;
                case 12: goto L_0x0522;
                case 13: goto L_0x050d;
                case 14: goto L_0x04ef;
                case 15: goto L_0x04c0;
                case 16: goto L_0x0480;
                case 17: goto L_0x044d;
                case 18: goto L_0x040c;
                case 19: goto L_0x03cd;
                case 20: goto L_0x0005;
                case 21: goto L_0x0005;
                case 22: goto L_0x03b1;
                case 23: goto L_0x0601;
                case 24: goto L_0x0005;
                case 25: goto L_0x0005;
                case 26: goto L_0x0005;
                case 27: goto L_0x0370;
                case 28: goto L_0x033e;
                case 29: goto L_0x0319;
                case 30: goto L_0x02c8;
                case 31: goto L_0x027a;
                case 32: goto L_0x0232;
                case 33: goto L_0x01f3;
                case 34: goto L_0x01b4;
                case 35: goto L_0x01a1;
                case 36: goto L_0x018b;
                case 37: goto L_0x016e;
                case 38: goto L_0x0158;
                case 39: goto L_0x0130;
                case 40: goto L_0x010c;
                case 41: goto L_0x00f2;
                case 42: goto L_0x0005;
                case 43: goto L_0x0064;
                case 44: goto L_0x002d;
                case 45: goto L_0x0005;
                case 46: goto L_0x0718;
                case 47: goto L_0x06fe;
                case 48: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.C47697EDg.super.onFail(r14)
            return
        L_0x0009:
            r0 = -1380455493(0xffffffffadb7ebbb, float:-2.0909377E-11)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r3 = 0
            X.0qQ.A0B(r14, r3)
            X.C47697EDg.super.onFail(r14)
            java.lang.Object r0 = r13.A01
            X.E6o r0 = (X.C47528E6o) r0
            X.E9N r1 = r0.A03
            java.lang.String r2 = "userListAdapter"
            r0 = 0
            if (r1 == 0) goto L_0x0612
            r1.A0C = r3
            r1.A04 = r0
            r1.A0A = r3
            r0 = 237303583(0xe24f71f, float:2.0333545E-30)
            goto L_0x05fd
        L_0x002d:
            r0 = 542921520(0x205c5330, float:1.8662249E-19)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r3 = r13.A01
            X.FYk r3 = (X.C50330FYk) r3
            X.0nO r1 = X.0nY.A00()
            X.EHn r0 = new X.EHn
            r0.<init>(r3)
            r1.ATE(r0)
            X.E3B r0 = r3.A02
            if (r0 == 0) goto L_0x0058
            X.E3B.A02(r0)
            X.E3B.A03(r0)
            android.content.Context r1 = r0.A04()
            r0 = 2131974093(0x7f1357cd, float:1.958524E38)
            X.C69863NtR.A00(r1, r0)
        L_0x0058:
            java.lang.String r1 = "DirectWelcomeMessageSettingManager"
            java.lang.String r0 = "Failed to get the welcome message from the server"
            X.0wb.A03(r1, r0)
            r0 = 749446791(0x2caba687, float:4.8786006E-12)
            goto L_0x0652
        L_0x0064:
            r0 = 633609456(0x25c41cf0, float:3.402019E-16)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r13.A01
            X.FYk r0 = (X.C50330FYk) r0
            X.F9x r3 = r0.A09
            java.lang.String r10 = "There was a HTTP request failure to modify welcome message"
            java.lang.String r8 = "welcome_message_settings_saved_error"
            r4 = 0
            r5 = r4
            r6 = r4
            r7 = r4
            r9 = r4
            X.C49857F9x.A00(r3, r4, r5, r6, r7, r8, r9, r10)
            X.E3B r6 = r0.A02
            if (r6 == 0) goto L_0x00d9
            X.E3B.A02(r6)
            java.lang.String r1 = r6.A0B
            java.lang.String r0 = "business_setting"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00e5
            android.content.Context r1 = r6.A04()
            r0 = 2131238261(0x7f081d75, float:1.8092796E38)
            android.graphics.drawable.Drawable r5 = r1.getDrawable(r0)
            X.6ap r4 = X.DbS.A0a()
            if (r5 == 0) goto L_0x00b8
            r4.A02()
            android.content.Context r3 = r6.A04()
            android.content.Context r1 = r6.A04()
            r0 = 2130970182(0x7f040646, float:1.7549067E38)
            int r0 = X.2Yu.A0H(r1, r0)
            int r0 = r3.getColor(r0)
            r4.A08(r5, r0)
        L_0x00b8:
            android.content.Context r1 = r6.A04()
            r0 = 2131960746(0x7f1323aa, float:1.955817E38)
            X.DbS.A19(r1, r4, r0)
            android.content.Context r1 = r6.A04()
            r0 = 2131960745(0x7f1323a9, float:1.9558167E38)
            X.DbW.A0q(r1, r4, r0)
            r0 = 2
            X.FdH.A00(r4, r6, r0)
            r0 = 1
            r4.A0L = r0
            r4.A00()
            X.Dbb.A1Q(r4)
        L_0x00d9:
            java.lang.String r1 = "DirectWelcomeMessageSettingManager"
            java.lang.String r0 = "Failed to update the welcome message from the server"
            X.0wb.A03(r1, r0)
            r0 = 1175927368(0x46173a48, float:9678.57)
            goto L_0x0652
        L_0x00e5:
            android.app.Activity r1 = r6.A00
            if (r1 == 0) goto L_0x00ee
            r0 = 3
            r1.setResult(r0)
            goto L_0x00d9
        L_0x00ee:
            java.lang.String r2 = "activity"
            goto L_0x0612
        L_0x00f2:
            r0 = -97751637(0xfffffffffa2c6dab, float:-2.2382485E35)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r13.A01
            android.content.Context r3 = X.DbT.A07(r0)
            java.lang.String r1 = "iglive_subscriptions_reminder_failure"
            r0 = 2131963970(0x7f133042, float:1.9564708E38)
            X.C59689JTv.A0F(r3, r1, r0)
            r0 = -1870212779(0xffffffff9086d155, float:-5.317621E-29)
            goto L_0x0652
        L_0x010c:
            r0 = 400579689(0x17e05c69, float:1.4498988E-24)
            int r2 = X.AnonymousClass7TG.A0D(r14, r0)
            X.C47697EDg.super.onFail(r14)
            java.lang.Object r3 = r13.A01
            X.FGL r3 = (X.FGL) r3
            androidx.fragment.app.Fragment r0 = r3.A00
            android.content.Context r1 = r0.getContext()
            r0 = 2131960836(0x7f132404, float:1.9558352E38)
            X.C59689JTv.A07(r1, r0)
            com.instagram.common.session.UserSession r0 = r3.A02
            X.C50277FWi.A00(r0)
            r0 = 1631657638(0x61411ea6, float:2.2265188E20)
            goto L_0x0652
        L_0x0130:
            r0 = -13295726(0xffffffffff351f92, float:-2.4075419E38)
            int r2 = X.AnonymousClass0fD.A03(r0)
            r4 = 0
            X.0qQ.A0B(r14, r4)
            X.C47697EDg.super.onFail(r14)
            java.lang.Object r3 = r13.A01
            X.E7U r3 = (X.E7U) r3
            android.content.Context r1 = r3.getContext()
            r0 = 2131975944(0x7f135f08, float:1.9588995E38)
            X.C59689JTv.A07(r1, r0)
            X.G8t r0 = r3.A04
            if (r0 == 0) goto L_0x0153
            r0.Cm0(r4)
        L_0x0153:
            r0 = -1972254862(0xffffffff8a71c772, float:-1.16412394E-32)
            goto L_0x0652
        L_0x0158:
            r0 = -1328582728(0xffffffffb0cf6fb8, float:-1.5092985E-9)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.C47697EDg.super.onFail(r14)
            java.lang.String r1 = "Challenge"
            java.lang.String r0 = "rewind challenge failed"
            X.0wb.A03(r1, r0)
            r0 = 887322317(0x34e376cd, float:4.2368484E-7)
            goto L_0x0652
        L_0x016e:
            r0 = -181660926(0xfffffffff52c1302, float:-2.1813003E32)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.C47697EDg.super.onFail(r14)
            java.lang.String r1 = "Challenge"
            java.lang.String r0 = "unknown challenge type found"
            X.0wb.A03(r1, r0)
            java.lang.Object r0 = r13.A01
            com.instagram.challenge.activity.ChallengeActivity r0 = (com.instagram.challenge.activity.ChallengeActivity) r0
            r0.finish()
            r0 = -1311862498(0xffffffffb1ce911e, float:-6.011887E-9)
            goto L_0x0652
        L_0x018b:
            r0 = -86886978(0xfffffffffad235be, float:-5.457362E35)
            int r2 = X.AnonymousClass7TG.A0D(r14, r0)
            X.C47697EDg.super.onFail(r14)
            java.lang.Object r0 = r13.A01
            X.G6k r0 = (X.C51894G6k) r0
            r0.Dp2()
            r0 = -15101090(0xffffffffff19935e, float:-2.0413706E38)
            goto L_0x0652
        L_0x01a1:
            r0 = 1397682146(0x534eefe2, float:8.8878783E11)
            int r2 = X.AnonymousClass7TG.A0D(r14, r0)
            java.lang.Object r0 = r13.A01
            X.G7X r0 = (X.G7X) r0
            r0.DFG(r14)
            r0 = 465887572(0x1bc4e154, float:3.2571095E-22)
            goto L_0x0652
        L_0x01b4:
            r0 = 572650737(0x2221f4f1, float:2.194924E-18)
            int r0 = X.AnonymousClass7TG.A0D(r14, r0)
            java.lang.Object r3 = r13.A01
            X.F3i r3 = (X.F3i) r3
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r2 = r3.A04
            if (r2 == 0) goto L_0x01e3
            java.lang.String r5 = "onboarding_checklist"
            r7 = 0
            r9 = 0
            r8 = 0
            java.lang.String r6 = r3.A08
            java.lang.Object r1 = r14.A00()
            X.1XP r1 = (X.1XP) r1
            if (r1 == 0) goto L_0x01d8
            java.lang.String r8 = r1.getErrorMessage()
            java.lang.String r9 = r1.mErrorType
        L_0x01d8:
            X.Xtl r4 = new X.Xtl
            r10 = r7
            r11 = r7
            r12 = r7
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r2.Ci6(r4)
        L_0x01e3:
            com.instagram.business.fragment.OnboardingCheckListFragment r1 = r3.A05
            android.content.Context r1 = r1.getContext()
            if (r1 == 0) goto L_0x01ee
            X.C59689JTv.A05(r1)
        L_0x01ee:
            r1 = -1729677251(0xffffffff98e7383d, float:-5.9768887E-24)
            goto L_0x0731
        L_0x01f3:
            r0 = -1167917565(0xffffffffba62fe03, float:-8.6590665E-4)
            int r2 = X.AnonymousClass0fD.A03(r0)
            r5 = 0
            X.0qQ.A0B(r14, r5)
            java.lang.Object r4 = r13.A01
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            r0 = 2131972232(0x7f135088, float:1.9581466E38)
            java.lang.String r3 = X.DbU.A0m(r4, r0)
            boolean r0 = r14 instanceof X.C268674do
            if (r0 == 0) goto L_0x0224
            X.4do r14 = (X.C268674do) r14
            java.lang.Object r0 = r14.A00
            X.1XP r0 = (X.1XP) r0
            if (r0 == 0) goto L_0x0224
            java.lang.String r1 = r0.getErrorMessage()
            if (r1 == 0) goto L_0x0224
            boolean r0 = X.00l.A0W(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0224
            r3 = r1
        L_0x0224:
            androidx.fragment.app.FragmentActivity r1 = r4.getActivity()
            java.lang.String r0 = "insights_welcome_fragment"
            X.C59689JTv.A03(r1, r3, r0, r5)
            r0 = -785325913(0xffffffffd130e0a7, float:-4.7480205E10)
            goto L_0x0652
        L_0x0232:
            r0 = -1861839801(0xffffffff91069447, float:-1.0616428E-28)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.C47697EDg.super.onFail(r14)
            java.lang.Object r2 = r13.A01
            com.instagram.business.fragment.SupportServicePartnerSelectionFragment r2 = (com.instagram.business.fragment.SupportServicePartnerSelectionFragment) r2
            android.content.Context r1 = r2.getContext()
            X.C59689JTv.A05(r1)
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r2.mLoadingSpinner
            X.AnonymousClass7TH.A0R(r1)
            java.lang.String r6 = X.Dbb.A0b(r14)
            X.FFo r5 = r2.A03
            com.instagram.api.schemas.SMBPartnerType r1 = r2.A01
            java.lang.String r4 = r1.toString()
            boolean r3 = r2.A08
            X.0Aj r2 = X.C49935FFo.A00(r5)
            java.lang.String r1 = "fetch_partners"
            X.DbS.A1H(r2, r1)
            java.lang.String r1 = "error"
            X.C49935FFo.A02(r2, r5, r1, r3)
            java.lang.String r1 = "service_type"
            r2.AAJ(r1, r4)
            java.lang.String r1 = "error_message"
            r2.AAJ(r1, r6)
            r2.Cgf()
            r1 = 1070202125(0x3fc9fd0d, float:1.578035)
            goto L_0x0731
        L_0x027a:
            r0 = -2007626219(0xffffffff88560e15, float:-6.4414836E-34)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.C47697EDg.super.onFail(r14)
            java.lang.Object r2 = r13.A01
            com.instagram.business.fragment.SupportServiceEditUrlFragment r2 = (com.instagram.business.fragment.SupportServiceEditUrlFragment) r2
            android.content.Context r1 = r2.getContext()
            X.C59689JTv.A05(r1)
            java.lang.String r10 = X.Dbb.A0b(r14)
            X.FFo r9 = r2.A02
            java.lang.String r8 = r2.A07
            java.lang.String r7 = r2.A05
            java.lang.String r6 = r2.A0B
            java.lang.String r5 = r2.A06
            r4 = 0
            r3 = 0
            X.AnonymousClass7TG.A1U(r7, r6, r5)
            X.0Aj r2 = X.C49935FFo.A00(r9)
            java.lang.String r1 = "remove_action_button"
            X.DbS.A1H(r2, r1)
            java.lang.String r1 = "error"
            X.DbS.A1J(r2, r1)
            X.C49935FFo.A01(r2, r9, r8, r7, r3)
            X.Dba.A1A(r2, r6, r5)
            java.lang.String r1 = "error_message"
            r2.AAJ(r1, r10)
            java.lang.String r1 = "button_label"
            r2.AAJ(r1, r4)
            r2.Cgf()
            r1 = -241093963(0xfffffffff1a132b5, float:-1.5964284E30)
            goto L_0x0731
        L_0x02c8:
            r0 = -1979780033(0xffffffff89fef43f, float:-6.1377964E-33)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.C47697EDg.super.onFail(r14)
            java.lang.Object r2 = r13.A01
            com.instagram.business.fragment.SupportServiceEditUrlFragment r2 = (com.instagram.business.fragment.SupportServiceEditUrlFragment) r2
            X.6ST r1 = r2.A04
            r1.dismiss()
            android.content.Context r1 = r2.getContext()
            X.C59689JTv.A05(r1)
            java.lang.String r9 = X.Dbb.A0b(r14)
            X.FFo r8 = r2.A02
            java.lang.String r7 = r2.A07
            java.lang.String r6 = r2.A05
            java.lang.String r5 = r2.A0B
            java.lang.String r4 = r2.A06
            r1 = 0
            X.0qQ.A0B(r7, r1)
            r3 = 1
            X.DbZ.A0t(r3, r6, r5, r4)
            X.0Aj r2 = X.C49935FFo.A00(r8)
            java.lang.String r1 = "remove_link"
            X.DbS.A1H(r2, r1)
            java.lang.String r1 = "error"
            X.DbS.A1J(r2, r1)
            X.C49935FFo.A01(r2, r8, r7, r6, r3)
            X.Dba.A1A(r2, r5, r4)
            java.lang.String r1 = "error_message"
            r2.AAJ(r1, r9)
            r2.Cgf()
            r1 = 1633671910(0x615fdae6, float:2.5808733E20)
            goto L_0x0731
        L_0x0319:
            r0 = -292582411(0xffffffffee8f8bf5, float:-2.2212777E28)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r13.A01
            com.instagram.business.fragment.SupportProfileDisplayOptionsFragment r1 = (com.instagram.business.fragment.SupportProfileDisplayOptionsFragment) r1
            android.content.Context r0 = r1.requireContext()
            X.C59689JTv.A05(r0)
            X.E9E r3 = r1.A02
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            r0 = 0
            r3.A01 = r1
            r3.A00 = r0
            X.E9E.A00(r3)
            r0 = -260534023(0xfffffffff07890f9, float:-3.0771017E29)
            goto L_0x0652
        L_0x033e:
            r0 = -1646309723(0xffffffff9ddf4ea5, float:-5.9108925E-21)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r13.A01
            com.instagram.business.fragment.SupportLinksFragment r1 = (com.instagram.business.fragment.SupportLinksFragment) r1
            android.content.Context r0 = r1.getContext()
            X.C59689JTv.A05(r0)
            r0 = 0
            r1.A05 = r0
            com.instagram.business.fragment.SupportLinksFragment.A00(r1)
            X.FFo r4 = r1.A01
            boolean r3 = r1.A05
            X.0Aj r1 = X.C49935FFo.A00(r4)
            java.lang.String r0 = "home_page"
            X.DbS.A1H(r1, r0)
            java.lang.String r0 = "view"
            X.C49935FFo.A02(r1, r4, r0, r3)
            r1.Cgf()
            r0 = 995573869(0x3b57406d, float:0.0032844797)
            goto L_0x0652
        L_0x0370:
            r0 = -1686233433(0xffffffff9b7e1ea7, float:-2.1020292E-22)
            int r0 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r13.A01
            com.instagram.business.fragment.SuggestBusinessFragment r2 = (com.instagram.business.fragment.SuggestBusinessFragment) r2
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r2.A01
            if (r1 == 0) goto L_0x03a3
            java.lang.String r4 = "pro_account_suggestions"
            r6 = 0
            r8 = 0
            r7 = 0
            java.lang.String r5 = r2.A05
            java.lang.Object r1 = r14.A00()
            if (r1 == 0) goto L_0x0396
            X.1XT r1 = (X.AnonymousClass1XT) r1
            java.lang.String r7 = r1.getErrorMessage()
            java.lang.String r8 = r1.getErrorType()
        L_0x0396:
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r2.A01
            X.Xtl r3 = new X.Xtl
            r9 = r6
            r10 = r6
            r11 = r6
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r1.Ckh(r3)
        L_0x03a3:
            android.content.Context r1 = r2.getContext()
            if (r1 == 0) goto L_0x03ac
            X.C59689JTv.A05(r1)
        L_0x03ac:
            r1 = 195048397(0xba033cd, float:6.17077E-32)
            goto L_0x0731
        L_0x03b1:
            r0 = 1708809363(0x65da5c93, float:1.2889795E23)
            int r0 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r13.A01
            com.instagram.business.fragment.ProfileDisplayOptionsFragment r2 = (com.instagram.business.fragment.ProfileDisplayOptionsFragment) r2
            android.view.View r1 = r2.A01
            X.AnonymousClass7TH.A0R(r1)
            androidx.fragment.app.FragmentActivity r1 = r2.getActivity()
            X.C59689JTv.A04(r1)
            r1 = -1894847577(0xffffffff8f0eeba7, float:-7.0465255E-30)
            goto L_0x0731
        L_0x03cd:
            r0 = 1024134871(0x3d0b0ed7, float:0.0339497)
            int r0 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r13.A01
            X.E4X r2 = (X.E4X) r2
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r2.A03
            if (r1 == 0) goto L_0x0400
            java.lang.String r4 = "learn_professional_tools"
            r6 = 0
            r8 = 0
            r7 = 0
            java.lang.String r5 = r2.A06
            java.lang.Object r1 = r14.A00()
            if (r1 == 0) goto L_0x03f3
            X.1XT r1 = (X.AnonymousClass1XT) r1
            java.lang.String r7 = r1.getErrorMessage()
            java.lang.String r8 = r1.getErrorType()
        L_0x03f3:
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r2.A03
            X.Xtl r3 = new X.Xtl
            r9 = r6
            r10 = r6
            r11 = r6
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r1.Ckh(r3)
        L_0x0400:
            android.content.Context r1 = r2.requireContext()
            X.C59689JTv.A05(r1)
            r1 = 1519968191(0x5a98dfbf, float:2.15151039E16)
            goto L_0x0731
        L_0x040c:
            r0 = -773586935(0xffffffffd1e40009, float:-1.22406642E11)
            int r0 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r13.A01
            com.instagram.business.fragment.InviteFollowersV2Fragment r2 = (com.instagram.business.fragment.InviteFollowersV2Fragment) r2
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r2.A02
            if (r1 == 0) goto L_0x043f
            java.lang.String r4 = "invite_followers"
            r6 = 0
            r8 = 0
            r7 = 0
            java.lang.String r5 = r2.A05
            java.lang.Object r1 = r14.A00()
            if (r1 == 0) goto L_0x0432
            X.1XT r1 = (X.AnonymousClass1XT) r1
            java.lang.String r7 = r1.getErrorMessage()
            java.lang.String r8 = r1.getErrorType()
        L_0x0432:
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r2.A02
            X.Xtl r3 = new X.Xtl
            r9 = r6
            r10 = r6
            r11 = r6
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r1.Ckh(r3)
        L_0x043f:
            android.content.Context r1 = r2.getContext()
            if (r1 == 0) goto L_0x0448
            X.C59689JTv.A05(r1)
        L_0x0448:
            r1 = 254853857(0xf30c2e1, float:8.715002E-30)
            goto L_0x0731
        L_0x044d:
            r0 = 96154055(0x5bb31c7, float:1.7603681E-35)
            int r0 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r13.A01
            com.instagram.business.fragment.InviteFollowersV2Fragment r2 = (com.instagram.business.fragment.InviteFollowersV2Fragment) r2
            java.lang.String r7 = X.C319126q5.A02(r14)
            java.lang.String r8 = X.C319126q5.A01(r14)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r2.A02
            if (r1 == 0) goto L_0x0474
            java.lang.String r4 = "invite_followers"
            r9 = 0
            java.lang.String r5 = r2.A05
            X.Xtl r3 = new X.Xtl
            r6 = r4
            r10 = r9
            r11 = r9
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r1.Ci6(r3)
        L_0x0474:
            android.content.Context r1 = r2.requireContext()
            X.C59689JTv.A05(r1)
            r1 = 530837001(0x1fa3ee09, float:6.942698E-20)
            goto L_0x0731
        L_0x0480:
            r0 = -1845730746(0xffffffff91fc6246, float:-3.9819155E-28)
            int r0 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r13.A01
            X.Fpm r1 = (X.C51176Fpm) r1
            X.E4w r3 = r1.A00
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r3.A01
            if (r1 == 0) goto L_0x04b1
            java.lang.String r8 = X.C319126q5.A02(r14)
            java.lang.String r9 = X.C319126q5.A01(r14)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r2 = r3.A01
            java.lang.String r5 = "edit_contact_info"
            r10 = 0
            java.lang.String r6 = r3.A08
            java.lang.String r7 = "save_info"
            com.instagram.model.business.BusinessInfo r1 = r3.A06
            java.util.HashMap r11 = X.C48728EjD.A00(r1)
            X.Xtl r4 = new X.Xtl
            r12 = r10
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r2.Ckh(r4)
        L_0x04b1:
            android.content.Context r2 = r3.requireContext()
            r1 = 2131972232(0x7f135088, float:1.9581466E38)
            X.DbZ.A0w(r2, r3, r1)
            r1 = -1809073218(0xffffffff942bbbbe, float:-8.670319E-27)
            goto L_0x0731
        L_0x04c0:
            r0 = 1814756245(0x6c2afb95, float:8.268218E26)
            int r0 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r13.A01
            X.E4w r2 = (X.C47492E4w) r2
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r2.A01
            if (r1 == 0) goto L_0x04ea
            java.lang.String r6 = X.C319126q5.A02(r14)
            java.lang.String r7 = X.C319126q5.A01(r14)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r2.A01
            java.lang.String r3 = "edit_contact_info"
            r8 = 0
            java.lang.String r4 = r2.A08
            java.lang.String r5 = "personal_contact_info"
            X.Xtl r2 = new X.Xtl
            r9 = r8
            r10 = r8
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r1.Ci6(r2)
        L_0x04ea:
            r1 = 387819658(0x171da88a, float:5.094216E-25)
            goto L_0x0731
        L_0x04ef:
            r0 = -424930811(0xffffffffe6ac1205, float:-4.0628972E23)
            int r0 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r3 = r13.A01
            X.E7B r3 = (X.E7B) r3
            android.view.View r2 = r3.A01
            r1 = 8
            r2.setVisibility(r1)
            androidx.fragment.app.FragmentActivity r1 = r3.getActivity()
            X.C59689JTv.A05(r1)
            r1 = 322036974(0x1331e4ee, float:2.2453412E-27)
            goto L_0x0731
        L_0x050d:
            r0 = -552251087(0xffffffffdf155131, float:-1.0759435E19)
            int r0 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r13.A01
            android.content.Context r1 = X.DbT.A08(r1)
            X.C59689JTv.A04(r1)
            r1 = 326341109(0x137391f5, float:3.0742874E-27)
            goto L_0x0731
        L_0x0522:
            r0 = -1804491120(0xffffffff9471a690, float:-1.2200239E-26)
            int r0 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r13.A01
            android.content.Context r1 = X.DbT.A08(r1)
            X.C59689JTv.A04(r1)
            r1 = 1380252744(0x5244fc48, float:2.11511542E11)
            goto L_0x0731
        L_0x0537:
            r0 = 1050893973(0x3ea35e95, float:0.31908098)
            int r0 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r13.A01
            android.content.Context r1 = X.DbT.A08(r1)
            X.C59689JTv.A04(r1)
            r1 = -641637335(0xffffffffd9c16429, float:-6.8043497E15)
            goto L_0x0731
        L_0x054c:
            r0 = 2098425432(0x7d136e58, float:1.2248091E37)
            int r0 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r13.A01
            android.content.Context r1 = X.DbT.A08(r1)
            X.C59689JTv.A04(r1)
            r1 = 832934491(0x31a5925b, float:4.8187707E-9)
            goto L_0x0731
        L_0x0561:
            r0 = -1985128716(0xffffffff89ad56f4, float:-4.1730005E-33)
            int r0 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r3 = r13.A01
            com.instagram.business.fragment.AccountTypeSelectionV2Fragment r3 = (com.instagram.business.fragment.AccountTypeSelectionV2Fragment) r3
            java.lang.String r8 = X.C319126q5.A02(r14)
            java.lang.String r9 = X.C319126q5.A01(r14)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r3.A00
            if (r1 == 0) goto L_0x0589
            java.lang.String r5 = "account_type_selection"
            r10 = 0
            java.lang.String r6 = r3.A05
            java.lang.String r7 = "professional_conversion_nux_config"
            X.Xtl r4 = new X.Xtl
            r11 = r10
            r12 = r10
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r1.Ci6(r4)
        L_0x0589:
            X.G8D r1 = r3.mController
            r1.getClass()
            X.FRU r2 = X.Dba.A0C(r1)
            X.Dv0 r1 = new X.Dv0
            r1.<init>()
            r2.A01 = r1
            android.os.Handler r2 = r3.A08
            X.Fpg r1 = new X.Fpg
            r1.<init>(r3)
            r2.post(r1)
            r1 = 76886382(0x495316e, float:3.5075126E-36)
            goto L_0x0731
        L_0x05a8:
            r0 = -710306864(0xffffffffd5a993d0, float:-2.33065394E13)
            int r0 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r13.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            android.content.Context r3 = r1.getContext()
            android.content.res.Resources r2 = X.DbV.A05(r1)
            r1 = 2131961756(0x7f13279c, float:1.9560218E38)
            java.lang.String r1 = r2.getString(r1)
            X.C59689JTv.A09(r3, r1)
            r1 = -592793873(0xffffffffdcaaaeef, float:-3.843447E17)
            goto L_0x0731
        L_0x05ca:
            r0 = 107281304(0x664fb98, float:4.3066876E-35)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r3 = r13.A01
            X.E4r r3 = (X.C47487E4r) r3
            android.content.Context r2 = r3.getContext()
            android.content.res.Resources r1 = X.DbV.A05(r3)
            r0 = 2131961756(0x7f13279c, float:1.9560218E38)
            java.lang.String r0 = r1.getString(r0)
            X.C59689JTv.A09(r2, r0)
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r3.A03
            java.lang.String r2 = "spinner"
            if (r1 == 0) goto L_0x0612
            X.3uy r0 = X.C255943uy.FAILED
            r1.setLoadingStatus(r0)
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r3.A03
            if (r1 == 0) goto L_0x0612
            r0 = 6
            X.FPB.A01(r1, r0, r3)
            r0 = 1049327277(0x3e8b76ad, float:0.2723898)
        L_0x05fd:
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        L_0x0601:
            r0 = 1049638802(0x3e903792, float:0.28167397)
            int r2 = X.AnonymousClass7TG.A0D(r14, r0)
            java.lang.Object r3 = r13.A01
            X.E4x r3 = (X.C47493E4x) r3
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r3.A00
            if (r0 != 0) goto L_0x061a
            java.lang.String r2 = "logger"
        L_0x0612:
            X.0qQ.A0F(r2)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x061a:
            java.lang.String r5 = "renew"
            r10 = 0
            java.lang.String r6 = r3.A03
            java.lang.String r7 = "professional_conversion_nux_config"
            java.lang.String r8 = X.C319126q5.A02(r14)
            java.lang.String r9 = X.C319126q5.A01(r14)
            X.Xtl r4 = new X.Xtl
            r11 = r10
            r12 = r10
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r0.Ci6(r4)
            X.G8D r0 = r3.A01
            if (r0 != 0) goto L_0x063a
            java.lang.String r2 = "controller"
            goto L_0x0612
        L_0x063a:
            X.FRU r1 = X.Dba.A0C(r0)
            X.Dv0 r0 = new X.Dv0
            r0.<init>()
            r1.A01 = r0
            android.os.Handler r1 = r3.A0D
            X.Fpo r0 = new X.Fpo
            r0.<init>(r3)
            r1.post(r0)
            r0 = -1923291152(0xffffffff8d5ce7f0, float:-6.807192E-31)
        L_0x0652:
            X.AnonymousClass0fD.A0A(r0, r2)
            return
        L_0x0656:
            r0 = 368648292(0x15f92064, float:1.006214E-25)
            int r0 = X.AnonymousClass7TG.A0D(r14, r0)
            X.C47697EDg.super.onFail(r14)
            java.lang.Object r1 = r13.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            X.DbX.A1H(r1)
            r1 = -1397663098(0xffffffffacb15a86, float:-5.0406927E-12)
            goto L_0x0731
        L_0x066c:
            r0 = -1266662088(0xffffffffb4804538, float:-2.389222E-7)
            int r0 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r3 = r13.A01
            android.content.Context r3 = (android.content.Context) r3
            r2 = 2131956761(0x7f131419, float:1.9550087E38)
            java.lang.String r1 = "could_not_update_profile_picture"
            X.C59689JTv.A0F(r3, r1, r2)
            r1 = -1127551060(0xffffffffbccaefac, float:-0.024772488)
            goto L_0x0731
        L_0x0684:
            r0 = 1143618575(0x442a3c0f, float:680.9384)
            int r0 = X.AnonymousClass7TG.A0D(r14, r0)
            X.1XT r1 = X.DbT.A0L(r14)
            if (r1 == 0) goto L_0x0697
            java.lang.String r3 = r1.getErrorMessage()
            if (r3 != 0) goto L_0x06a2
        L_0x0697:
            java.lang.Object r2 = r13.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            r1 = 2131968258(0x7f134102, float:1.9573406E38)
            java.lang.String r3 = X.DbU.A0m(r2, r1)
        L_0x06a2:
            java.lang.Object r2 = r13.A01
            X.E58 r2 = (X.E58) r2
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            r2.EuV(r3, r1)
            r1 = -433177476(0xffffffffe62e3c7c, float:-2.0570188E23)
            goto L_0x0731
        L_0x06b0:
            r0 = -1336585159(0xffffffffb0555439, float:-7.7608636E-10)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.C47697EDg.super.onFail(r14)
            java.lang.Object r4 = r13.A01
            X.E4W r4 = (X.E4W) r4
            boolean r1 = r4.A02
            com.instagram.common.session.UserSession r3 = r4.A00
            if (r1 == 0) goto L_0x06ef
            X.EZs r1 = X.C48150EZs.A02
            java.lang.String r2 = r1.toString()
            X.AnonymousClass7TG.A1N(r3, r2)
            java.lang.String r1 = "create_password_fail"
            X.FG9.A00(r3, r1, r2)
            X.DbT.A1I(r4)
            X.DbT.A1I(r4)
        L_0x06d8:
            r1 = 0
            r4.A07 = r1
            X.E4W.A01(r4)
            X.8ab r2 = X.DbW.A0U(r4)
            r1 = 2131968258(0x7f134102, float:1.9573406E38)
            r2.A08(r1)
            X.Dba.A1L(r2)
            r1 = -776413351(0xffffffffd1b8df59, float:-9.9252642E10)
            goto L_0x0731
        L_0x06ef:
            X.EZs r1 = X.C48150EZs.A03
            java.lang.String r2 = r1.toString()
            X.AnonymousClass7TG.A1N(r3, r2)
            java.lang.String r1 = "create_password_fail"
            X.FG9.A00(r3, r1, r2)
            goto L_0x06d8
        L_0x06fe:
            r0 = -563102470(0xffffffffde6fbcfa, float:-4.31873929E18)
            int r0 = X.AnonymousClass7TG.A0D(r14, r0)
            java.lang.Throwable r1 = r14.A01()
            if (r1 == 0) goto L_0x0714
            java.lang.String r2 = r1.getMessage()
            java.lang.String r1 = "DirectSearchMetaAiTypeaheadApi"
            X.0KC.A0C(r1, r2)
        L_0x0714:
            r1 = 719001141(0x2adb1635, float:3.8917624E-13)
            goto L_0x0731
        L_0x0718:
            r0 = -1106751099(0xffffffffbe085185, float:-0.13312347)
            int r0 = X.AnonymousClass7TG.A0D(r14, r0)
            java.lang.Throwable r1 = r14.A01()
            if (r1 == 0) goto L_0x072e
            java.lang.String r2 = r1.getMessage()
            java.lang.String r1 = "DirectSearchMetaAIKeyboardReturnKeyApi"
            X.0KC.A0C(r1, r2)
        L_0x072e:
            r1 = 227829534(0xd94671e, float:9.146029E-31)
        L_0x0731:
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47697EDg.onFail(X.4dm):void");
    }

    public final void onFailInBackground(C268654dm r14) {
        int i;
        int i2;
        String str;
        switch (this.A00) {
            case 21:
                i = AnonymousClass7TG.A0D(r14, -1363868617);
                C47494E4z e4z = (C47494E4z) this.A01;
                AnonymousClass1XT A0L = DbT.A0L(r14);
                String str2 = null;
                String str3 = null;
                String str4 = e4z.A01;
                if (e4z.A03) {
                    str = "on";
                } else {
                    str = "off";
                }
                HashMap A0m = DbY.A0m("opt_in_promotional_email_setting", str);
                if (A0L != null) {
                    str3 = A0L.getErrorMessage();
                    str2 = A0L.getErrorType();
                }
                BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = e4z.A00;
                if (businessFlowAnalyticsLogger != null) {
                    businessFlowAnalyticsLogger.Ckh(new C22030Xtl("opt_in_promotional_email", str4, "opt_in_promotional_email_setting", str3, str2, (Map) null, A0m, (Map) null));
                    AnonymousClass7TF.A0D().post(new C51339FsX(e4z, this));
                    i2 = -1187073120;
                    break;
                } else {
                    DbS.A12();
                    throw AnonymousClass00P.createAndThrow();
                }
            case 24:
                i = AnonymousClass7TG.A0D(r14, 773600179);
                Handler A0D = AnonymousClass7TF.A0D();
                E3R e3r = (E3R) this.A01;
                A0D.post(new C51340FsY(e3r, this));
                E3R.A00(DbT.A0L(r14), e3r, "hide_more_comments_setting");
                i2 = 1752980585;
                break;
            case 25:
                i = AnonymousClass7TG.A0D(r14, 1478279044);
                Handler A0D2 = AnonymousClass7TF.A0D();
                E3R e3r2 = (E3R) this.A01;
                A0D2.post(new C51341FsZ(e3r2, this));
                E3R.A00(DbT.A0L(r14), e3r2, "hide_message_requests_setting");
                i2 = 227024432;
                break;
            default:
                C47697EDg.super.onFailInBackground(r14);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final void onFinish() {
        int i;
        int i2;
        switch (this.A00) {
            case 1:
                i = AnonymousClass0fD.A03(656693617);
                ProgressButton progressButton = ((E58) this.A01).A02;
                if (progressButton != null) {
                    progressButton.setShowProgressBar(false);
                }
                i2 = -1211832815;
                break;
            case 6:
                i = AnonymousClass0fD.A03(-449584608);
                ((C47487E4r) this.A01).onBackPressed();
                i2 = -1430907375;
                break;
            case 7:
                i = AnonymousClass0fD.A03(-479443522);
                C47487E4r e4r = (C47487E4r) this.A01;
                new Handler(e4r.requireContext().getMainLooper()).post(new C51168Fpe(e4r));
                i2 = -1462041621;
                break;
            case 15:
                i = AnonymousClass0fD.A03(749671810);
                C47492E4w e4w = (C47492E4w) this.A01;
                EEJ eej = e4w.A04;
                eej.getClass();
                eej.A00();
                e4w.A09 = true;
                i2 = -1275170180;
                break;
            case 16:
                i = AnonymousClass0fD.A03(2130195805);
                EEJ eej2 = ((C51176Fpm) this.A01).A00.A04;
                if (eej2 != null) {
                    eej2.A00();
                }
                i2 = -1939082132;
                break;
            case 17:
                i = AnonymousClass0fD.A03(41863173);
                ((InviteFollowersV2Fragment) this.A01).mLoadingIndicator.setVisibility(8);
                i2 = 1789478108;
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                i = AnonymousClass0fD.A03(-950377233);
                2dZ r1 = ((InviteFollowersV2Fragment) this.A01).A00;
                if (r1 != null) {
                    r1.setIsLoading(false);
                }
                i2 = -2118338799;
                break;
            case 19:
                i = AnonymousClass0fD.A03(-1286261565);
                ((E4X) this.A01).A01.setIsLoading(false);
                i2 = -21332171;
                break;
            case 26:
                i = AnonymousClass0fD.A03(-1443413586);
                C47697EDg.super.onFinish();
                i2 = -130475833;
                break;
            case 27:
                i = AnonymousClass0fD.A03(1877662180);
                2dZ r12 = ((SuggestBusinessFragment) this.A01).mActionBarService;
                if (r12 != null) {
                    r12.setIsLoading(false);
                }
                i2 = -1698924631;
                break;
            case 28:
                i = AnonymousClass0fD.A03(553070340);
                SupportLinksFragment supportLinksFragment = (SupportLinksFragment) this.A01;
                supportLinksFragment.mLoadingIndicator.setVisibility(8);
                supportLinksFragment.mPartnerTypeRowsContainer.setVisibility(0);
                i2 = -756355587;
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                i = AnonymousClass0fD.A03(-417586283);
                ((SupportProfileDisplayOptionsFragment) this.A01).mLoadingIndicator.setVisibility(8);
                i2 = -609692414;
                break;
            case 31:
                i = AnonymousClass0fD.A03(1905322300);
                ((SupportServiceEditUrlFragment) this.A01).A04.dismiss();
                i2 = 410125530;
                break;
            case 33:
                i = AnonymousClass0fD.A03(-773205334);
                C47697EDg.super.onFinish();
                2dY r4 = 2dZ.A0t;
                Fragment fragment = (Fragment) this.A01;
                r4.A03(fragment.getActivity()).Ett((View.OnClickListener) null, false);
                DbY.A17(fragment, r4, false);
                i2 = -408753661;
                break;
            case 34:
                i = AnonymousClass0fD.A03(-865146852);
                OnboardingCheckListFragment onboardingCheckListFragment = ((F3i) this.A01).A05;
                ProgressBar progressBar = onboardingCheckListFragment.mProgressBar;
                if (!(progressBar == null || onboardingCheckListFragment.mLayoutContent == null)) {
                    progressBar.setVisibility(8);
                    onboardingCheckListFragment.mLayoutContent.setVisibility(0);
                }
                i2 = -1689372273;
                break;
            case 35:
                i = AnonymousClass0fD.A03(-1413167523);
                ((G7X) this.A01).DFH();
                i2 = -1185160361;
                break;
            default:
                C47697EDg.super.onFinish();
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final void onStart() {
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A03(2017952855);
                C47697EDg.super.onStart();
                E4W e4w = (E4W) this.A01;
                e4w.A07 = true;
                E4W.A01(e4w);
                i2 = -1951182927;
                break;
            case 1:
                i = AnonymousClass0fD.A03(1114992225);
                ProgressButton progressButton = ((E58) this.A01).A02;
                if (progressButton != null) {
                    progressButton.setShowProgressBar(true);
                }
                i2 = 1956553337;
                break;
            case 9:
                i = AnonymousClass0fD.A03(-337316715);
                ((AccountTypeSelectionV2Fragment) this.A01).A01.A01();
                i2 = -1871069792;
                break;
            case 15:
                i = AnonymousClass0fD.A03(-1869600207);
                EEJ eej = ((C47492E4w) this.A01).A04;
                eej.getClass();
                eej.A01();
                i2 = 1688530715;
                break;
            case 16:
                i = AnonymousClass0fD.A03(-2124985037);
                EEJ eej2 = ((C51176Fpm) this.A01).A00.A04;
                if (eej2 != null) {
                    eej2.A01();
                }
                i2 = -592057902;
                break;
            case 17:
                i = AnonymousClass0fD.A03(499054868);
                ((InviteFollowersV2Fragment) this.A01).mLoadingIndicator.setVisibility(0);
                i2 = -717777183;
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                i = AnonymousClass0fD.A03(-686341773);
                ((InviteFollowersV2Fragment) this.A01).A00.setIsLoading(true);
                i2 = -2108205505;
                break;
            case 19:
                i = AnonymousClass0fD.A03(1943129115);
                ((E4X) this.A01).A01.setIsLoading(true);
                i2 = -512637634;
                break;
            case 26:
                i = AnonymousClass0fD.A03(-1677098475);
                C47697EDg.super.onStart();
                i2 = -1623264170;
                break;
            case 27:
                i = AnonymousClass0fD.A03(1386446675);
                ((SuggestBusinessFragment) this.A01).mActionBarService.setIsLoading(true);
                i2 = -604878986;
                break;
            case 28:
                i = AnonymousClass0fD.A03(2091804319);
                SupportLinksFragment supportLinksFragment = (SupportLinksFragment) this.A01;
                supportLinksFragment.mPartnerTypeRowsContainer.setVisibility(8);
                supportLinksFragment.mLoadingIndicator.setVisibility(0);
                i2 = -773764952;
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                i = AnonymousClass0fD.A03(-1177372014);
                ((SupportProfileDisplayOptionsFragment) this.A01).mLoadingIndicator.setVisibility(0);
                i2 = 1820422460;
                break;
            case 30:
                i = AnonymousClass0fD.A03(879838075);
                AnonymousClass0fN.A00(((SupportServiceEditUrlFragment) this.A01).A04);
                i2 = -202002914;
                break;
            case 33:
                i = AnonymousClass0fD.A03(246103306);
                C47697EDg.super.onStart();
                2dY r5 = 2dZ.A0t;
                Fragment fragment = (Fragment) this.A01;
                r5.A03(fragment.getActivity()).Ett((View.OnClickListener) null, true);
                DbY.A17(fragment, r5, true);
                i2 = 527408629;
                break;
            case 34:
                i = AnonymousClass0fD.A03(1535959536);
                OnboardingCheckListFragment onboardingCheckListFragment = ((F3i) this.A01).A05;
                ProgressBar progressBar = onboardingCheckListFragment.mProgressBar;
                if (!(progressBar == null || onboardingCheckListFragment.mLayoutContent == null)) {
                    progressBar.setVisibility(0);
                    onboardingCheckListFragment.mLayoutContent.setVisibility(8);
                }
                i2 = 728830997;
                break;
            case 39:
                i = AnonymousClass0fD.A03(1841795331);
                C47697EDg.super.onStart();
                AnonymousClass7TF.A16(((E7U) this.A01).A08);
                i2 = 1726565181;
                break;
            case 48:
                int A03 = AnonymousClass0fD.A03(1469308850);
                C47697EDg.super.onStart();
                E9N e9n = ((C47528E6o) this.A01).A03;
                if (e9n == null) {
                    0qQ.A0F("userListAdapter");
                    throw AnonymousClass00P.createAndThrow();
                }
                e9n.A0C = true;
                e9n.A03();
                AnonymousClass0fD.A0A(-1233998, A03);
                return;
            default:
                C47697EDg.super.onStart();
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    /* JADX WARNING: type inference failed for: r0v95, types: [X.EbA, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v11, types: [com.instagram.model.business.PublicPhoneContact, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v41, types: [android.content.Context, com.instagram.challenge.activity.ChallengeActivity] */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0be0, code lost:
        r6 = "boostGuidanceAdapter";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0ca6, code lost:
        X.AnonymousClass0fD.A0A(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0ca9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0f89, code lost:
        X.0qQ.A0F(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0f90, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x0fa7, code lost:
        X.AnonymousClass0fD.A0A(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x0faa, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x1001, code lost:
        X.AnonymousClass0fD.A0A(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x1004, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x017d, code lost:
        r6 = androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r22) {
        /*
            r21 = this;
            r6 = r21
            r0 = r22
            int r1 = r6.A00
            switch(r1) {
                case 0: goto L_0x0fab;
                case 1: goto L_0x0f40;
                case 2: goto L_0x0009;
                case 3: goto L_0x0f16;
                case 4: goto L_0x0e4a;
                case 5: goto L_0x0dec;
                case 6: goto L_0x0009;
                case 7: goto L_0x0da6;
                case 8: goto L_0x0d83;
                case 9: goto L_0x0d28;
                case 10: goto L_0x0caa;
                case 11: goto L_0x0be4;
                case 12: goto L_0x0bb6;
                case 13: goto L_0x0b8c;
                case 14: goto L_0x0b4d;
                case 15: goto L_0x0ac6;
                case 16: goto L_0x0a7b;
                case 17: goto L_0x097b;
                case 18: goto L_0x092e;
                case 19: goto L_0x08e1;
                case 20: goto L_0x08b0;
                case 21: goto L_0x0009;
                case 22: goto L_0x0837;
                case 23: goto L_0x07d7;
                case 24: goto L_0x0009;
                case 25: goto L_0x0009;
                case 26: goto L_0x07b0;
                case 27: goto L_0x0763;
                case 28: goto L_0x062d;
                case 29: goto L_0x05d5;
                case 30: goto L_0x0545;
                case 31: goto L_0x04db;
                case 32: goto L_0x046e;
                case 33: goto L_0x0445;
                case 34: goto L_0x0394;
                case 35: goto L_0x034c;
                case 36: goto L_0x032a;
                case 37: goto L_0x02ce;
                case 38: goto L_0x02b2;
                case 39: goto L_0x0249;
                case 40: goto L_0x0202;
                case 41: goto L_0x01af;
                case 42: goto L_0x0181;
                case 43: goto L_0x010b;
                case 44: goto L_0x00bb;
                case 45: goto L_0x0099;
                case 46: goto L_0x0078;
                case 47: goto L_0x0057;
                case 48: goto L_0x000d;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.C47697EDg.super.onSuccess(r0)
            return
        L_0x000d:
            r1 = -2047041994(0xffffffff85fc9e36, float:-2.3756084E-35)
            int r3 = X.AnonymousClass0fD.A03(r1)
            X.CDG r0 = (X.CDG) r0
            r1 = -111463767(0xfffffffff95b32a9, float:-7.1133783E34)
            int r5 = X.AnonymousClass0fD.A03(r1)
            r2 = 0
            X.0qQ.A0B(r0, r2)
            X.C47697EDg.super.onSuccess(r0)
            java.lang.Object r4 = r6.A01
            X.E6o r4 = (X.C47528E6o) r4
            X.E9N r1 = r4.A03
            if (r1 != 0) goto L_0x0030
            java.lang.String r6 = "userListAdapter"
            goto L_0x0f89
        L_0x0030:
            r1.A0C = r2
            X.BAj r0 = r0.A00
            if (r0 == 0) goto L_0x017d
            java.util.List r2 = r0.A00
            if (r2 == 0) goto L_0x004c
            X.0eM r0 = r4.A0C
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.1OC r1 = X.C320126ro.A03(r0, r2)
            r0 = 13
            X.EDV.A00(r1, r2, r4, r0)
            r4.schedule(r1)
        L_0x004c:
            r0 = 195068498(0xba08252, float:6.182584E-32)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -515664332(0xffffffffe1439634, float:-2.2549615E20)
            goto L_0x0fa7
        L_0x0057:
            r1 = -390003753(0xffffffffe8c103d7, float:-7.2919005E24)
            int r3 = X.AnonymousClass0fD.A03(r1)
            r1 = 1584130588(0x5e6bea1c, float:4.24985763E18)
            int r4 = X.AnonymousClass7TG.A0D(r0, r1)
            java.lang.Object r2 = r6.A01
            X.1IX r2 = (X.1IX) r2
            r1 = 0
            r2.EJ1(r1, r0)
            r0 = 2009944281(0x77cd50d9, float:8.328599E33)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 129750384(0x7bbd570, float:2.826208E-34)
            goto L_0x0fa7
        L_0x0078:
            r1 = -1636859725(0xffffffff9e6f80b3, float:-1.2679169E-20)
            int r3 = X.AnonymousClass0fD.A03(r1)
            r1 = -2002372041(0xffffffff88a63a37, float:-1.0004448E-33)
            int r4 = X.AnonymousClass7TG.A0D(r0, r1)
            java.lang.Object r2 = r6.A01
            X.1IX r2 = (X.1IX) r2
            r1 = 0
            r2.EJ1(r1, r0)
            r0 = -1901608034(0xffffffff8ea7c39e, float:-4.135705E-30)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 31865264(0x1e639b0, float:8.4571434E-38)
            goto L_0x0fa7
        L_0x0099:
            r0 = -1705121835(0xffffffff9a5de7d5, float:-4.5889E-23)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = -330733186(0xffffffffec49697e, float:-9.7396905E26)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r6.A01
            X.4AD r1 = (X.AnonymousClass4AD) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r1.EBA(r0)
            r0 = -1806489903(0xffffffff945326d1, float:-1.0660433E-26)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = -1989759738(0xffffffff8966ad06, float:-2.7766598E-33)
            goto L_0x0fa7
        L_0x00bb:
            r1 = -1835356932(0xffffffff929aacfc, float:-9.76141E-28)
            int r1 = X.AnonymousClass0fD.A03(r1)
            X.CED r0 = (X.CED) r0
            r2 = -1268711638(0xffffffffb460ff2a, float:-2.0954454E-7)
            int r7 = X.AnonymousClass7TG.A0D(r0, r2)
            X.C47697EDg.super.onSuccess(r0)
            X.DrP r0 = r0.A00
            if (r0 == 0) goto L_0x017d
            java.lang.Object r5 = r6.A01
            X.FYk r5 = (X.C50330FYk) r5
            java.lang.String r4 = r0.A02
            java.lang.Boolean r3 = r0.A00
            java.lang.String r2 = r0.A01
            java.lang.String r0 = ""
            if (r4 != 0) goto L_0x00e1
            r4 = r0
        L_0x00e1:
            r5.A05 = r4
            r5.A03 = r3
            if (r2 != 0) goto L_0x00e8
            r2 = r0
        L_0x00e8:
            r5.A04 = r2
            X.E3B r0 = r5.A02
            if (r0 == 0) goto L_0x00f4
            X.E3B.A02(r0)
            X.E3B.A03(r0)
        L_0x00f4:
            X.0nO r2 = X.0nY.A00()
            X.EHo r0 = new X.EHo
            r0.<init>(r5)
            r2.ATE(r0)
            r0 = 860047946(0x33434a4a, float:4.546954E-8)
            X.AnonymousClass0fD.A0A(r0, r7)
            r0 = -2111790708(0xffffffff8220a18c, float:-1.1801305E-37)
            goto L_0x1001
        L_0x010b:
            r1 = -1390488898(0xffffffffad1ed2be, float:-9.028054E-12)
            int r1 = X.AnonymousClass0fD.A03(r1)
            X.CED r0 = (X.CED) r0
            r2 = 229663940(0xdb064c4, float:1.0871096E-30)
            int r4 = X.AnonymousClass7TG.A0D(r0, r2)
            X.C47697EDg.super.onSuccess(r0)
            X.DrP r0 = r0.A00
            if (r0 == 0) goto L_0x017d
            java.lang.Object r5 = r6.A01
            X.FYk r5 = (X.C50330FYk) r5
            java.lang.String r6 = r0.A02
            java.lang.Boolean r3 = r0.A00
            java.lang.String r2 = r0.A01
            java.lang.String r0 = ""
            if (r6 != 0) goto L_0x0131
            r6 = r0
        L_0x0131:
            r5.A05 = r6
            r5.A03 = r3
            if (r2 != 0) goto L_0x0138
            r2 = r0
        L_0x0138:
            r5.A04 = r2
            X.E3B r3 = r5.A02
            if (r3 == 0) goto L_0x0157
            X.E3B.A02(r3)
            java.lang.String r2 = r3.A0B
            java.lang.String r0 = "inbox_qp"
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x016e
            android.app.Activity r2 = r3.A00
            if (r2 == 0) goto L_0x0179
            r0 = 2
            r2.setResult(r0)
            java.lang.String r0 = "business_setting"
            r3.A0B = r0
        L_0x0157:
            X.0nO r2 = X.0nY.A00()
            X.EHo r0 = new X.EHo
            r0.<init>(r5)
            r2.ATE(r0)
            r0 = 1317258355(0x4e83c473, float:1.1053449E9)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -1442059971(0xffffffffaa0be93d, float:-1.2426601E-13)
            goto L_0x1001
        L_0x016e:
            android.content.Context r2 = r3.A04()
            r0 = 2131960755(0x7f1323b3, float:1.9558188E38)
            X.C59689JTv.A07(r2, r0)
            goto L_0x0157
        L_0x0179:
            java.lang.String r6 = "activity"
            goto L_0x0f89
        L_0x017d:
            java.lang.String r6 = "response"
            goto L_0x0f89
        L_0x0181:
            r1 = 1539520030(0x5bc3361e, float:1.09894246E17)
            int r3 = X.AnonymousClass0fD.A03(r1)
            r1 = 1279793831(0x4c481aa7, float:5.2456092E7)
            int r4 = X.AnonymousClass7TG.A0D(r0, r1)
            X.C47697EDg.super.onSuccess(r0)
            java.lang.Object r2 = r6.A01
            android.content.Context r2 = (android.content.Context) r2
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131973638(0x7f135606, float:1.9584317E38)
            java.lang.String r0 = r1.getString(r0)
            X.C59689JTv.A09(r2, r0)
            r0 = 1033330733(0x3d97602d, float:0.07391391)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -1047144311(0xffffffffc195d889, float:-18.73073)
            goto L_0x0fa7
        L_0x01af:
            r0 = -1120168589(0xffffffffbd3b9573, float:-0.045796823)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = -1147279062(0xffffffffbb9de92a, float:-0.004819055)
            int r7 = X.AnonymousClass0fD.A03(r0)
            X.6ap r4 = X.DbV.A0W()
            java.lang.Object r2 = r6.A01
            X.K4c r2 = (X.C61360K4c) r2
            android.content.res.Resources r1 = X.DbV.A05(r2)
            r0 = 2131963971(0x7f133043, float:1.956471E38)
            X.DbT.A1D(r1, r4, r0)
            r4.A06()
            X.Dbb.A1Q(r4)
            X.4lm r1 = r2.A0B
            if (r1 != 0) goto L_0x01dd
            java.lang.String r6 = "fanClubLogger"
            goto L_0x0f89
        L_0x01dd:
            X.0eM r0 = r2.A0H
            long r4 = X.Dbb.A08(r0)
            X.0wc r1 = r1.A00
            java.lang.String r0 = "ig_fan_club_live_audience_onboarding_reminder_click"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            r0 = 3508(0xdb4, float:4.916E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.Dbb.A1D(r1, r0, r4)
            r1.Cgf()
            r0 = -716652124(0xffffffffd548c1a4, float:-1.37958754E13)
            X.AnonymousClass0fD.A0A(r0, r7)
            r0 = 1560985254(0x5d0abea6, float:6.2485067E17)
            goto L_0x0fa7
        L_0x0202:
            r1 = -1807413557(0xffffffff94450ecb, float:-9.948876E-27)
            int r3 = X.AnonymousClass0fD.A03(r1)
            r1 = -322086578(0xffffffffeccd594e, float:-1.9860122E27)
            int r7 = X.AnonymousClass0fD.A03(r1)
            r1 = 0
            X.0qQ.A0B(r0, r1)
            X.C47697EDg.super.onSuccess(r0)
            java.lang.Object r5 = r6.A01
            X.FGL r5 = (X.FGL) r5
            X.FGL.A02(r5, r1)
            X.6cm r0 = r5.A03
            java.lang.String r4 = "contacts_import_settings"
            X.0wc r1 = r0.A02
            java.lang.String r0 = "disconnect_contacts_import"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            X.DbS.A1N(r2, r4)
            java.lang.Boolean r1 = X.AnonymousClass7TE.A0v()
            java.lang.String r0 = "is_user_initiated"
            r2.A7p(r0, r1)
            r2.Cgf()
            com.instagram.common.session.UserSession r0 = r5.A02
            X.C50277FWi.A00(r0)
            r0 = 1989574086(0x76967dc6, float:1.5261631E33)
            X.AnonymousClass0fD.A0A(r0, r7)
            r0 = -1594029616(0xffffffffa0fd09d0, float:-4.286636E-19)
            goto L_0x0fa7
        L_0x0249:
            r1 = 598558179(0x23ad45e3, float:1.8786296E-17)
            int r3 = X.AnonymousClass0fD.A03(r1)
            r1 = -1134169417(0xffffffffbc65f2b7, float:-0.0140349185)
            int r7 = X.AnonymousClass0fD.A03(r1)
            r5 = 0
            X.0qQ.A0B(r0, r5)
            X.C47697EDg.super.onSuccess(r0)
            java.lang.Object r8 = r6.A01
            X.E7U r8 = (X.E7U) r8
            X.Dkv r4 = r8.A03
            if (r4 != 0) goto L_0x026a
            java.lang.String r6 = "suggestionsViewModel"
            goto L_0x0f89
        L_0x026a:
            X.0eM r2 = r8.A0E
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r2)
            java.lang.String r0 = "partial_ci"
            r4.A00(r1, r0)
            com.instagram.common.session.UserSession r0 = X.DbW.A0S(r2, r5)
            X.1Av r0 = X.1Au.A00(r0)
            r6 = 1
            X.0xa r2 = r0.A01
            X.0xY r1 = r2.AR4()
            java.lang.String r0 = "has_partially_imported_contacts"
            r1.E5T(r0, r6)
            r1.apply()
            long r4 = java.lang.System.currentTimeMillis()
            X.0xY r1 = r2.AR4()
            r0 = 3490(0xda2, float:4.89E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.E5c(r0, r4)
            r1.apply()
            X.G8t r0 = r8.A04
            if (r0 == 0) goto L_0x02a7
            r0.Cm0(r6)
        L_0x02a7:
            r0 = -924275427(0xffffffffc8e8ad1d, float:-476520.9)
            X.AnonymousClass0fD.A0A(r0, r7)
            r0 = -589900816(0xffffffffdcd6d3f0, float:-4.83749382E17)
            goto L_0x0fa7
        L_0x02b2:
            r1 = 2140797339(0x7f99f99b, float:NaN)
            int r3 = X.AnonymousClass0fD.A03(r1)
            r1 = -907617020(0xffffffffc9e6dd04, float:-1891232.5)
            int r1 = X.AnonymousClass0fD.A03(r1)
            X.C47697EDg.super.onSuccess(r0)
            r0 = -971971446(0xffffffffc610e48a, float:-9273.135)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = 1837610332(0x6d87b55c, float:5.249966E27)
            goto L_0x0fa7
        L_0x02ce:
            r1 = 154072992(0x92ef7a0, float:2.106092E-33)
            int r1 = X.AnonymousClass0fD.A03(r1)
            X.EM1 r0 = (X.EM1) r0
            r2 = 1634916767(0x6172d99f, float:2.7998708E20)
            int r3 = X.AnonymousClass0fD.A03(r2)
            java.lang.Object r5 = r6.A01
            com.instagram.challenge.activity.ChallengeActivity r5 = (com.instagram.challenge.activity.ChallengeActivity) r5
            X.0wW r2 = r5.A02
            X.FZ1 r6 = X.F5E.A00(r2)
            java.lang.Integer r4 = r0.A00
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            if (r4 != r2) goto L_0x030b
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r4 = r0.A07
            java.util.HashMap r2 = r0.A09
            if (r2 != 0) goto L_0x02fc
            java.util.Map r2 = java.util.Collections.emptyMap()
        L_0x02fc:
            r0 = 0
            r6.A04(r5, r4, r0, r2)
        L_0x0300:
            r0 = 1537892058(0x5baa5eda, float:9.5910073E16)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = -216569663(0xfffffffff31768c1, float:-1.1995872E31)
            goto L_0x1001
        L_0x030b:
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            if (r4 != r2) goto L_0x0326
            r6.A01()
            android.content.Context r7 = r5.getApplicationContext()
            r8 = 0
            java.lang.String r9 = r0.A03
            java.lang.String r10 = r0.A08
            java.lang.String r11 = r0.A06
            java.lang.String r12 = r0.A04
            java.lang.String r13 = r0.A05
            r14 = 0
            r6.A03(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0300
        L_0x0326:
            r5.finish()
            goto L_0x0300
        L_0x032a:
            r1 = 698909704(0x29a88408, float:7.4836025E-14)
            int r3 = X.AnonymousClass0fD.A03(r1)
            X.Dva r0 = (X.C47340Dva) r0
            r1 = -1167495006(0xffffffffba6970a2, float:-8.905028E-4)
            int r2 = X.AnonymousClass7TG.A0D(r0, r1)
            java.lang.Object r1 = r6.A01
            X.G6k r1 = (X.C51894G6k) r1
            r1.Dp3(r0)
            r0 = 761709881(0x2d66c539, float:1.31177786E-11)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = -23864606(0xfffffffffe93dae2, float:-9.826651E37)
            goto L_0x0fa7
        L_0x034c:
            r1 = 1753891813(0x688a43e5, float:5.223512E24)
            int r1 = X.AnonymousClass0fD.A03(r1)
            X.DvE r0 = (X.DvE) r0
            r2 = -1485254454(0xffffffffa778d0ca, float:-3.4530099E-15)
            int r5 = X.AnonymousClass0fD.A03(r2)
            r4 = 0
            X.0qQ.A0B(r0, r4)
            java.util.List r0 = r0.A00
            com.google.common.collect.ImmutableList r3 = X.DbU.A0K(r0)
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x038e
            java.lang.Object r0 = r3.get(r4)
            X.F16 r0 = (X.F16) r0
            boolean r0 = r0.A0D
            if (r0 == 0) goto L_0x038e
            java.lang.Object r2 = r6.A01
            X.G7X r2 = (X.G7X) r2
            java.lang.Object r0 = r3.get(r4)
            X.F16 r0 = (X.F16) r0
        L_0x0380:
            r2.DFI(r0)
            r0 = 1951820982(0x74566cb6, float:6.7953885E31)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -1997820506(0xffffffff88ebada6, float:-1.4184373E-33)
            goto L_0x1001
        L_0x038e:
            java.lang.Object r2 = r6.A01
            X.G7X r2 = (X.G7X) r2
            r0 = 0
            goto L_0x0380
        L_0x0394:
            r1 = -789272814(0xffffffffd0f4a712, float:-3.28367186E10)
            int r1 = X.AnonymousClass0fD.A03(r1)
            X.De9 r0 = (X.De9) r0
            r2 = 283395573(0x10e445f5, float:9.003793E-29)
            int r5 = X.AnonymousClass7TG.A0D(r0, r2)
            java.lang.Object r6 = r6.A01
            X.F3i r6 = (X.F3i) r6
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r2 = r6.A04
            if (r2 == 0) goto L_0x03be
            java.lang.String r8 = "onboarding_checklist"
            r10 = 0
            java.lang.String r9 = r6.A08
            X.Xtl r7 = new X.Xtl
            r11 = r10
            r12 = r10
            r13 = r10
            r14 = r10
            r15 = r10
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r2.Ci5(r7)
        L_0x03be:
            java.util.List r4 = r0.A03
            X.0eE r3 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r2 = r6.A07
            com.instagram.user.model.User r2 = r3.A01(r2)
            boolean r2 = r2.A2L()
            if (r2 == 0) goto L_0x03da
            boolean r2 = r0.A04
            if (r2 == 0) goto L_0x03da
            if (r4 == 0) goto L_0x03df
            boolean r2 = r4.isEmpty()
            if (r2 == 0) goto L_0x03df
        L_0x03da:
            com.instagram.business.fragment.OnboardingCheckListFragment r2 = r6.A05
            r2.A00()
        L_0x03df:
            X.DeA r2 = r0.A00
            r6.A00 = r2
            java.lang.String r2 = r0.A02
            if (r2 == 0) goto L_0x03e9
            r6.A02 = r2
        L_0x03e9:
            java.lang.String r2 = r0.A01
            if (r2 == 0) goto L_0x03ef
            r6.A01 = r2
        L_0x03ef:
            java.util.List r2 = r0.A03
            if (r2 == 0) goto L_0x03f6
            r6.A02(r2)
        L_0x03f6:
            boolean r2 = X.F3i.A09
            if (r2 != 0) goto L_0x0419
            X.DeA r3 = r6.A00
            X.DeA r2 = X.C46388DeA.RESURRECTED
            if (r3 != r2) goto L_0x0419
            X.De2 r4 = r6.A06
            com.instagram.common.session.UserSession r2 = r4.A00
            X.1NY r3 = X.AnonymousClass7TG.A0a(r2)
            java.lang.String r2 = "business/account/set_onboarding_checklist_has_opened_status/"
            X.Dba.A1H(r3, r2)
            X.1OC r3 = r3.A0M()
            X.4D6 r2 = r4.A01
            r2.schedule(r3)
            r2 = 1
            X.F3i.A09 = r2
        L_0x0419:
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x043a
            X.De2 r0 = r6.A06
            X.4D6 r4 = r0.A01
            com.instagram.common.session.UserSession r0 = r0.A00
            X.1NY r3 = X.AnonymousClass7TG.A0a(r0)
            java.lang.String r0 = "business/account/set_onboarding_checklist_should_show_reminder/"
            r3.A0A(r0)
            java.lang.String r2 = "value"
            java.lang.String r0 = "0"
            X.DbX.A1M(r3, r2, r0)
            X.1OC r0 = r3.A0M()
            r4.schedule(r0)
        L_0x043a:
            r0 = -2050429035(0xffffffff85c8ef95, float:-1.8895918E-35)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 1095128627(0x41465633, float:12.396045)
            goto L_0x1001
        L_0x0445:
            r0 = 1687748899(0x64990123, float:2.257947E22)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = 332656804(0x13d3f0a4, float:5.350118E-27)
            int r4 = X.AnonymousClass0fD.A03(r0)
            android.os.Handler r2 = X.AnonymousClass7TF.A0D()
            java.lang.Object r1 = r6.A01
            X.E6u r1 = (X.C47533E6u) r1
            X.Fpw r0 = new X.Fpw
            r0.<init>(r1)
            r2.post(r0)
            r0 = 1432286561(0x555ef561, float:1.53215922E13)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 561151584(0x21727e60, float:8.2160045E-19)
            goto L_0x0fa7
        L_0x046e:
            r1 = -128272203(0xfffffffff85ab8b5, float:-1.7744797E34)
            int r1 = X.AnonymousClass0fD.A03(r1)
            X.Dv1 r0 = (X.C47334Dv1) r0
            r2 = 717348190(0x2ac1dd5e, float:3.443729E-13)
            int r7 = X.AnonymousClass0fD.A03(r2)
            X.C47697EDg.super.onSuccess(r0)
            java.lang.Object r6 = r6.A01
            com.instagram.business.fragment.SupportServicePartnerSelectionFragment r6 = (com.instagram.business.fragment.SupportServicePartnerSelectionFragment) r6
            java.util.List r0 = r0.A00
            r6.A07 = r0
            X.E9A r4 = r6.A02
            r4.A00 = r0
            r4.clear()
            java.util.List r0 = r4.A00
            if (r0 == 0) goto L_0x04a8
            java.util.Iterator r3 = r0.iterator()
        L_0x0498:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x04a8
            java.lang.Object r2 = r3.next()
            X.E9Z r0 = r4.A01
            r4.addModel(r2, r0)
            goto L_0x0498
        L_0x04a8:
            r4.notifyDataSetChanged()
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r6.mLoadingSpinner
            X.AnonymousClass7TH.A0R(r0)
            X.FFo r5 = r6.A03
            com.instagram.api.schemas.SMBPartnerType r0 = r6.A01
            java.lang.String r4 = r0.toString()
            boolean r3 = r6.A08
            X.0Aj r2 = X.C49935FFo.A00(r5)
            java.lang.String r0 = "fetch_partners"
            X.DbS.A1H(r2, r0)
            java.lang.String r0 = "success"
            X.C49935FFo.A02(r2, r5, r0, r3)
            java.lang.String r0 = "service_type"
            r2.AAJ(r0, r4)
            r2.Cgf()
            r0 = -765781998(0xffffffffd25b1812, float:-2.35250418E11)
            X.AnonymousClass0fD.A0A(r0, r7)
            r0 = -1255433838(0xffffffffb52b9992, float:-6.392594E-7)
            goto L_0x1001
        L_0x04db:
            r1 = -376933576(0xffffffffe9887338, float:-2.0619752E25)
            int r3 = X.AnonymousClass0fD.A03(r1)
            r1 = 1545245869(0x5c1a94ad, float:1.74042469E17)
            int r9 = X.AnonymousClass0fD.A03(r1)
            X.C47697EDg.super.onSuccess(r0)
            java.lang.Object r2 = r6.A01
            com.instagram.business.fragment.SupportServiceEditUrlFragment r2 = (com.instagram.business.fragment.SupportServiceEditUrlFragment) r2
            com.instagram.common.session.UserSession r0 = r2.A03
            com.instagram.user.model.User r1 = X.DbT.A0j(r0)
            r10 = 0
            X.4Cl r0 = r1.A03
            r0.EUR(r10)
            X.4Cl r0 = r1.A03
            r0.EUQ(r10)
            com.instagram.common.session.UserSession r0 = r2.A03
            X.DbT.A1S(r0, r1)
            android.os.Handler r1 = r2.A0G
            X.Fps r0 = new X.Fps
            r0.<init>(r6)
            r1.post(r0)
            X.FFo r8 = r2.A02
            java.lang.String r7 = r2.A07
            java.lang.String r6 = r2.A05
            java.lang.String r5 = r2.A0B
            java.lang.String r4 = r2.A06
            r2 = 0
            X.AnonymousClass7TG.A1U(r6, r5, r4)
            X.0Aj r1 = X.C49935FFo.A00(r8)
            java.lang.String r0 = "remove_action_button"
            X.DbS.A1H(r1, r0)
            java.lang.String r0 = "success"
            X.DbS.A1J(r1, r0)
            X.C49935FFo.A01(r1, r8, r7, r6, r2)
            X.Dba.A1A(r1, r5, r4)
            java.lang.String r0 = "button_label"
            r1.AAJ(r0, r10)
            r1.Cgf()
            r0 = -1289067143(0xffffffffb32a6579, float:-3.96735E-8)
            X.AnonymousClass0fD.A0A(r0, r9)
            r0 = 943689919(0x383f90bf, float:4.5672754E-5)
            goto L_0x0fa7
        L_0x0545:
            r1 = 789719433(0x2f122989, float:1.3293379E-10)
            int r1 = X.AnonymousClass0fD.A03(r1)
            r2 = 306316548(0x12420504, float:6.122179E-28)
            int r8 = X.AnonymousClass0fD.A03(r2)
            X.C47697EDg.super.onSuccess(r0)
            java.lang.Object r10 = r6.A01
            com.instagram.business.fragment.SupportServiceEditUrlFragment r10 = (com.instagram.business.fragment.SupportServiceEditUrlFragment) r10
            r2 = 0
            com.instagram.business.fragment.SupportServiceEditUrlFragment.A00(r2, r10)
            boolean r0 = r10.A0D
            if (r0 == 0) goto L_0x0569
            java.lang.String r0 = r10.A08     // Catch:{ IllegalArgumentException -> 0x056f }
            com.instagram.api.schemas.SMBPartnerType r2 = X.C253543qx.A00(r0)     // Catch:{ IllegalArgumentException -> 0x056f }
            goto L_0x056f
        L_0x0569:
            java.lang.String r0 = r10.A08
            com.instagram.api.schemas.SMBPartnerType r2 = X.C253543qx.A00(r0)
        L_0x056f:
            com.instagram.api.schemas.SMBPartnerType r0 = r10.A01
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x05c5
            com.instagram.common.session.UserSession r2 = r10.A03
            r0 = 31
            X.EDg r4 = A00(r10, r0)
            X.1NY r3 = X.DbZ.A0L(r2)
            java.lang.String r0 = "accounts/remove_profile_action_button/"
            r3.A0A(r0)
            java.lang.Class<X.DwL> r2 = X.DwL.class
            java.lang.Class<X.F56> r0 = X.F56.class
            X.DbV.A1N(r3, r2, r0)
            X.DbW.A1E(r3, r4, r10)
        L_0x0592:
            X.FFo r9 = r10.A02
            java.lang.String r7 = r10.A07
            java.lang.String r6 = r10.A05
            java.lang.String r5 = r10.A0B
            java.lang.String r4 = r10.A06
            r3 = 0
            X.0qQ.A0B(r7, r3)
            X.AnonymousClass7TG.A1U(r6, r5, r4)
            X.0Aj r2 = X.C49935FFo.A00(r9)
            java.lang.String r0 = "remove_link"
            X.DbS.A1H(r2, r0)
            java.lang.String r0 = "success"
            X.DbS.A1J(r2, r0)
            X.C49935FFo.A01(r2, r9, r7, r6, r3)
            X.Dba.A1A(r2, r5, r4)
            r2.Cgf()
            r0 = -348365956(0xffffffffeb3c5b7c, float:-2.2771008E26)
            X.AnonymousClass0fD.A0A(r0, r8)
            r0 = 1149597689(0x448577f9, float:1067.7491)
            goto L_0x1001
        L_0x05c5:
            X.6ST r0 = r10.A04
            r0.dismiss()
            android.os.Handler r2 = r10.A0G
            X.Fpr r0 = new X.Fpr
            r0.<init>(r6)
            r2.post(r0)
            goto L_0x0592
        L_0x05d5:
            r1 = -829254534(0xffffffffce92947a, float:-1.22960205E9)
            int r1 = X.AnonymousClass0fD.A03(r1)
            X.DvZ r0 = (X.DvZ) r0
            r2 = 616253035(0x24bb466b, float:8.1217615E-17)
            int r7 = X.AnonymousClass0fD.A03(r2)
            java.lang.Object r2 = r6.A01
            com.instagram.business.fragment.SupportProfileDisplayOptionsFragment r2 = (com.instagram.business.fragment.SupportProfileDisplayOptionsFragment) r2
            X.E9E r6 = r2.A02
            java.util.List r0 = r0.A01
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            X.4os r5 = r2.A01
            if (r0 == 0) goto L_0x05f7
            r6.A01 = r0
        L_0x05f7:
            r0 = 0
            r6.A00 = r0
            if (r5 == 0) goto L_0x061f
            java.util.List r0 = r6.A01
            java.util.Iterator r4 = r0.iterator()
        L_0x0602:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x061f
            java.lang.Object r3 = r4.next()
            X.Dvt r3 = (X.C47359Dvt) r3
            java.lang.String r2 = r3.A01
            java.lang.String r0 = r5.AmM()
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x0602
            X.4or r0 = r3.A00
            r6.A00 = r0
            goto L_0x0602
        L_0x061f:
            X.E9E.A00(r6)
            r0 = 1221791353(0x48d30e79, float:432243.78)
            X.AnonymousClass0fD.A0A(r0, r7)
            r0 = -1166416025(0xffffffffba79e767, float:-9.533078E-4)
            goto L_0x1001
        L_0x062d:
            r1 = 911215868(0x36500cfc, float:3.1001973E-6)
            int r1 = X.AnonymousClass0fD.A03(r1)
            X.DvZ r0 = (X.DvZ) r0
            r2 = 2105067287(0x7d78c717, float:2.0667642E37)
            int r19 = X.AnonymousClass0fD.A03(r2)
            java.lang.Object r14 = r6.A01
            com.instagram.business.fragment.SupportLinksFragment r14 = (com.instagram.business.fragment.SupportLinksFragment) r14
            android.view.ViewGroup r2 = r14.mPartnerTypeRowsContainer
            r2.removeAllViews()
            r13 = 0
            r14.A05 = r13
            java.util.List r2 = r0.A01
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r2)
            X.3kO r18 = r2.iterator()
            r3 = 0
            r12 = r3
        L_0x0655:
            boolean r2 = r18.hasNext()
            if (r2 == 0) goto L_0x0718
            java.lang.Object r11 = r18.next()
            X.Dvt r11 = (X.C47359Dvt) r11
            java.lang.String r5 = r11.A02
            X.4or r15 = r11.A00
            if (r15 != 0) goto L_0x0714
            r4 = 0
        L_0x0668:
            java.lang.String r2 = r11.A01
            r20 = r2
            android.view.LayoutInflater r7 = r14.A00
            r6 = 2131629353(0x7f0e1529, float:1.8886025E38)
            android.view.ViewGroup r2 = r14.mPartnerTypeRowsContainer
            android.view.View r10 = r7.inflate(r6, r2, r13)
            r2 = 2131440286(0x7f0b329e, float:1.8502551E38)
            android.view.View r9 = X.DbU.A0B(r10, r2)
            r2 = 2131440547(0x7f0b33a3, float:1.850308E38)
            android.widget.TextView r17 = X.Dba.A07(r9, r2)
            r2 = 2131440491(0x7f0b336b, float:1.8502967E38)
            android.widget.TextView r8 = X.Dba.A07(r9, r2)
            r2 = 2131440487(0x7f0b3367, float:1.8502959E38)
            android.widget.TextView r7 = X.Dba.A07(r10, r2)
            boolean r16 = android.text.TextUtils.isEmpty(r4)
            r6 = 8
            r2 = r20
            boolean r2 = com.instagram.business.fragment.SupportLinksFragment.A01(r15, r2)
            if (r2 == 0) goto L_0x06a9
            if (r15 == 0) goto L_0x070c
            java.lang.String r5 = r15.Ay3()
            if (r5 == 0) goto L_0x070c
        L_0x06a9:
            if (r16 != 0) goto L_0x0702
            r2 = r17
            r2.setText(r5)
            r8.setText(r4)
            r9.setVisibility(r13)
            r7.setVisibility(r6)
        L_0x06b9:
            X.2eS.A01(r10)
            android.view.ViewGroup r2 = r14.mPartnerTypeRowsContainer
            r2.addView(r10)
            X.4or r5 = r11.A00
            java.lang.String r4 = r11.A01
            r7 = 1
            X.FNn r2 = new X.FNn
            r2.<init>(r14, r5, r4, r7)
            X.AnonymousClass0fU.A00(r2, r10)
            r2 = 2131427588(0x7f0b0104, float:1.8476796E38)
            android.view.View r6 = X.DbU.A0B(r10, r2)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            java.lang.String r5 = r11.A01
            java.util.Map r4 = X.EWP.A02
            boolean r2 = r4.containsKey(r5)
            if (r2 == 0) goto L_0x06ff
            java.lang.Object r2 = r4.get(r5)
            X.EWP r2 = (X.EWP) r2
        L_0x06e7:
            int r2 = r2.A00
            r6.setImageResource(r2)
            X.4or r5 = r11.A00
            if (r5 == 0) goto L_0x0655
            r14.A05 = r7
            java.lang.String r4 = r5.A04
            java.lang.String r2 = r0.A00
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0655
            r12 = r5
            goto L_0x0655
        L_0x06ff:
            X.EWP r2 = X.EWP.A05
            goto L_0x06e7
        L_0x0702:
            r7.setText(r5)
            r9.setVisibility(r6)
            r7.setVisibility(r13)
            goto L_0x06b9
        L_0x070c:
            r2 = 2131964709(0x7f133325, float:1.9566207E38)
            java.lang.String r5 = r14.getString(r2)
            goto L_0x06a9
        L_0x0714:
            java.lang.String r4 = r15.A06
            goto L_0x0668
        L_0x0718:
            com.instagram.common.session.UserSession r0 = r14.A02
            com.instagram.user.model.User r4 = X.DbT.A0j(r0)
            X.4Cl r0 = r4.A03
            r0.EUQ(r12)
            if (r12 == 0) goto L_0x0734
            X.4Cl r2 = r4.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)
            r2.EQH(r0)
            java.lang.String r0 = r12.A04
            com.instagram.api.schemas.SMBPartnerType r3 = X.C253543qx.A00(r0)
        L_0x0734:
            X.4Cl r0 = r4.A03
            r0.EUR(r3)
            com.instagram.common.session.UserSession r0 = r14.A02
            X.DbT.A1S(r0, r4)
            com.instagram.business.fragment.SupportLinksFragment.A00(r14)
            X.FFo r4 = r14.A01
            boolean r3 = r14.A05
            X.0Aj r2 = X.C49935FFo.A00(r4)
            java.lang.String r0 = "home_page"
            X.DbS.A1H(r2, r0)
            java.lang.String r0 = "view"
            X.C49935FFo.A02(r2, r4, r0, r3)
            r2.Cgf()
            r2 = 1422217074(0x54c54f72, float:6.7795314E12)
            r0 = r19
            X.AnonymousClass0fD.A0A(r2, r0)
            r0 = -927035984(0xffffffffc8be8db0, float:-390253.5)
            goto L_0x1001
        L_0x0763:
            r0 = 769122044(0x2dd7defc, float:2.4541695E-11)
            int r1 = X.AnonymousClass0fD.A03(r0)
            r0 = 1635683229(0x617e8b9d, float:2.9347082E20)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r4 = r6.A01
            com.instagram.business.fragment.SuggestBusinessFragment r4 = (com.instagram.business.fragment.SuggestBusinessFragment) r4
            r0 = 0
            r4.A09 = r0
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r4.A01
            if (r0 == 0) goto L_0x078e
            java.lang.String r7 = "pro_account_suggestions"
            r9 = 0
            java.lang.String r8 = r4.A05
            X.Xtl r6 = new X.Xtl
            r10 = r9
            r11 = r9
            r12 = r9
            r13 = r9
            r14 = r9
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r0.Ckg(r6)
        L_0x078e:
            boolean r0 = r4.A08
            if (r0 != 0) goto L_0x07a2
            com.instagram.common.session.UserSession r0 = r4.A04
            X.1Ng r3 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            X.6ur r0 = new X.6ur
            r0.<init>(r2)
            r3.A00(r0)
        L_0x07a2:
            X.DbX.A1J(r4)
            r0 = 1177708206(0x463266ae, float:11417.67)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 918654383(0x36c18daf, float:5.7683424E-6)
            goto L_0x1001
        L_0x07b0:
            r1 = -1696531143(0xffffffff9ae0fd39, float:-9.305333E-23)
            int r3 = X.AnonymousClass0fD.A03(r1)
            r1 = 128725220(0x7ac30e4, float:2.590842E-34)
            int r1 = X.AnonymousClass0fD.A03(r1)
            X.C47697EDg.super.onSuccess(r0)
            java.lang.Object r0 = r6.A01
            com.instagram.business.fragment.SuggestBusinessFragment r0 = (com.instagram.business.fragment.SuggestBusinessFragment) r0
            X.UdP r0 = com.instagram.business.fragment.SuggestBusinessFragment.A00(r0)
            r0.A00()
            r0 = -1472719543(0xffffffffa8381549, float:-1.0218667E-14)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = 1899905701(0x713e42a5, float:9.421235E29)
            goto L_0x0fa7
        L_0x07d7:
            r1 = -1449082542(0xffffffffa9a0c152, float:-7.138963E-14)
            int r3 = X.AnonymousClass0fD.A03(r1)
            X.Dv0 r0 = (X.C47333Dv0) r0
            r1 = 2001559732(0x774d60b4, float:4.1655556E33)
            int r2 = X.AnonymousClass7TG.A0D(r0, r1)
            java.lang.Object r4 = r6.A01
            X.E4x r4 = (X.C47493E4x) r4
            java.util.HashMap r13 = X.AnonymousClass7TE.A1E()
            boolean r1 = r0.A00
            java.lang.String r5 = java.lang.String.valueOf(r1)
            java.lang.String r1 = "should_show_edit_contact_info_step"
            r13.put(r1, r5)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r4.A00
            if (r1 != 0) goto L_0x0802
            java.lang.String r6 = "logger"
            goto L_0x0f89
        L_0x0802:
            java.lang.String r6 = "renew"
            r9 = 0
            java.lang.String r7 = r4.A03
            java.lang.String r8 = "professional_conversion_nux_config"
            X.Xtl r5 = new X.Xtl
            r10 = r9
            r11 = r9
            r12 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r1.Ci5(r5)
            X.G8D r1 = r4.A01
            if (r1 != 0) goto L_0x081c
            java.lang.String r6 = "controller"
            goto L_0x0f89
        L_0x081c:
            X.FRU r1 = X.Dba.A0C(r1)
            r1.A01 = r0
            android.os.Handler r1 = r4.A0D
            X.Fpo r0 = new X.Fpo
            r0.<init>(r4)
            r1.post(r0)
            r0 = -307939070(0xffffffffeda53902, float:-6.391743E27)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = 168101108(0xa0504f4, float:6.404649E-33)
            goto L_0x0fa7
        L_0x0837:
            r1 = 169363319(0xa184777, float:7.331975E-33)
            int r1 = X.AnonymousClass0fD.A03(r1)
            X.Dv0 r0 = (X.C47333Dv0) r0
            r2 = -987602219(0xffffffffc52262d5, float:-2598.177)
            int r4 = X.AnonymousClass0fD.A03(r2)
            r5 = 0
            X.0qQ.A0B(r0, r5)
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x088c
            java.lang.Object r0 = r6.A01
            com.instagram.business.fragment.ProfileDisplayOptionsFragment r0 = (com.instagram.business.fragment.ProfileDisplayOptionsFragment) r0
            android.view.View r2 = r0.rootView
            X.0qQ.A0A(r2)
            r0 = 2131440130(0x7f0b3202, float:1.8502235E38)
            android.view.View r2 = X.AnonymousClass7TF.A0G(r2, r0)
            r0 = 2131428591(0x7f0b04ef, float:1.847883E38)
            X.DbT.A1F(r2, r0, r5)
            r0 = 2131428605(0x7f0b04fd, float:1.847886E38)
            android.widget.TextView r7 = X.AnonymousClass7TG.A0R(r2, r0)
            r0 = 2131428606(0x7f0b04fe, float:1.8478861E38)
            android.widget.TextView r3 = X.AnonymousClass7TG.A0R(r2, r0)
            r0 = 2131428607(0x7f0b04ff, float:1.8478863E38)
            android.widget.TextView r2 = X.AnonymousClass7TG.A0R(r2, r0)
            r0 = 2131970957(0x7f134b8d, float:1.957888E38)
            r7.setText(r0)
            r0 = 2131970958(0x7f134b8e, float:1.9578882E38)
            r3.setText(r0)
            r0 = 2131970959(0x7f134b8f, float:1.9578884E38)
            r2.setText(r0)
        L_0x088c:
            java.lang.Object r3 = r6.A01
            com.instagram.business.fragment.ProfileDisplayOptionsFragment r3 = (com.instagram.business.fragment.ProfileDisplayOptionsFragment) r3
            android.view.View r2 = r3.A01
            if (r2 == 0) goto L_0x08a5
            android.view.View r0 = r3.A00
            if (r0 == 0) goto L_0x08a5
            r0 = 8
            r2.setVisibility(r0)
            android.view.View r0 = r3.A00
            X.0qQ.A0A(r0)
            r0.setVisibility(r5)
        L_0x08a5:
            r0 = 951146675(0x38b158b3, float:8.456539E-5)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -391490633(0xffffffffe8aa53b7, float:-6.4347725E24)
            goto L_0x1001
        L_0x08b0:
            r0 = -1339758947(0xffffffffb024e69d, float:-5.9990574E-10)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = -1821688239(0xffffffff936b3e51, float:-2.9691894E-27)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r6.A01
            X.FVR r0 = (X.FVR) r0
            java.lang.Object r0 = r0.A01
            com.instagram.business.fragment.OnboardingCheckListFragment r0 = (com.instagram.business.fragment.OnboardingCheckListFragment) r0
            com.instagram.common.session.UserSession r0 = r0.A07
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A04
            X.6ur r0 = new X.6ur
            r0.<init>(r1)
            r2.A00(r0)
            r0 = -525771292(0xffffffffe0a95de4, float:-9.763329E19)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 94013556(0x59a8874, float:1.4532215E-35)
            goto L_0x0ca6
        L_0x08e1:
            r0 = -999312748(0xffffffffc46fb294, float:-958.7903)
            int r1 = X.AnonymousClass0fD.A03(r0)
            r0 = -359161606(0xffffffffea97a0fa, float:-9.165399E25)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r4 = r6.A01
            X.E4X r4 = (X.E4X) r4
            r0 = 0
            r4.A08 = r0
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r4.A03
            if (r0 == 0) goto L_0x090c
            java.lang.String r7 = "learn_professional_tools"
            r9 = 0
            java.lang.String r8 = r4.A06
            X.Xtl r6 = new X.Xtl
            r10 = r9
            r11 = r9
            r12 = r9
            r13 = r9
            r14 = r9
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r0.Ckg(r6)
        L_0x090c:
            boolean r0 = r4.A07
            if (r0 != 0) goto L_0x0920
            com.instagram.common.session.UserSession r0 = r4.A05
            X.1Ng r3 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Integer r2 = X.AnonymousClass05K.A15
            X.6ur r0 = new X.6ur
            r0.<init>(r2)
            r3.A00(r0)
        L_0x0920:
            X.DbT.A1J(r4)
            r0 = -1684641726(0xffffffff9b966842, float:-2.4882793E-22)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 295200577(0x11986741, float:2.4045007E-28)
            goto L_0x1001
        L_0x092e:
            r0 = -382974915(0xffffffffe92c443d, float:-1.3016093E25)
            int r1 = X.AnonymousClass0fD.A03(r0)
            r0 = 2137346099(0x7f655033, float:3.0480963E38)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r4 = r6.A01
            com.instagram.business.fragment.InviteFollowersV2Fragment r4 = (com.instagram.business.fragment.InviteFollowersV2Fragment) r4
            r0 = 0
            r4.A08 = r0
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r4.A02
            if (r0 == 0) goto L_0x0959
            java.lang.String r7 = "invite_followers"
            r9 = 0
            java.lang.String r8 = r4.A05
            X.Xtl r6 = new X.Xtl
            r10 = r9
            r11 = r9
            r12 = r9
            r13 = r9
            r14 = r9
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r0.Ckg(r6)
        L_0x0959:
            boolean r0 = r4.A07
            if (r0 != 0) goto L_0x096d
            com.instagram.common.session.UserSession r0 = r4.A04
            X.1Ng r3 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Integer r2 = X.AnonymousClass05K.A0Y
            X.6ur r0 = new X.6ur
            r0.<init>(r2)
            r3.A00(r0)
        L_0x096d:
            X.DbX.A1J(r4)
            r0 = 1374797914(0x51f1c05a, float:1.2978928E11)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 926833506(0x373e5b62, float:1.1346159E-5)
            goto L_0x1001
        L_0x097b:
            r1 = 602749269(0x23ed3955, float:2.5719873E-17)
            int r1 = X.AnonymousClass0fD.A03(r1)
            X.Duz r0 = (X.C47332Duz) r0
            r2 = -61270556(0xfffffffffc5915e4, float:-4.5086897E36)
            int r5 = X.AnonymousClass0fD.A03(r2)
            java.lang.Object r6 = r6.A01
            com.instagram.business.fragment.InviteFollowersV2Fragment r6 = (com.instagram.business.fragment.InviteFollowersV2Fragment) r6
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r2 = r6.A02
            if (r2 == 0) goto L_0x09a5
            java.lang.String r8 = "invite_followers"
            r11 = 0
            java.lang.String r9 = r6.A05
            X.Xtl r7 = new X.Xtl
            r10 = r8
            r12 = r11
            r13 = r11
            r14 = r11
            r15 = r11
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r2.Ci5(r7)
        L_0x09a5:
            java.util.List r2 = r0.A00
            if (r2 == 0) goto L_0x0a62
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0a62
            r9 = 1
            com.instagram.common.session.UserSession r0 = r6.A04
            X.FF7 r8 = new X.FF7
            r8.<init>(r6, r6, r0, r6)
            r8.A00 = r6
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r13 = r2.iterator()
        L_0x09c1:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0a6d
            java.lang.Object r10 = r13.next()
            X.F3Q r10 = (X.F3Q) r10
            java.lang.String r12 = r10.A05
            X.EW9[] r11 = X.EW9.values()
            int r4 = r11.length
            r3 = 0
        L_0x09d5:
            if (r3 >= r4) goto L_0x09e4
            r2 = r11[r3]
            java.lang.String r0 = r2.A00
            boolean r0 = X.0qQ.A0K(r0, r12)
            if (r0 != 0) goto L_0x09e5
            int r3 = r3 + 1
            goto L_0x09d5
        L_0x09e4:
            r2 = 0
        L_0x09e5:
            int r0 = r2.ordinal()
            switch(r0) {
                case 0: goto L_0x09ed;
                case 1: goto L_0x09f3;
                case 2: goto L_0x0a0e;
                case 3: goto L_0x09ec;
                case 4: goto L_0x0a14;
                case 5: goto L_0x0a1a;
                case 6: goto L_0x0a35;
                case 7: goto L_0x0a3b;
                case 8: goto L_0x0a41;
                default: goto L_0x09ec;
            }
        L_0x09ec:
            goto L_0x09c1
        L_0x09ed:
            java.lang.String r0 = r10.A02
            r8.A03(r7, r0)
            goto L_0x09c1
        L_0x09f3:
            java.lang.String r4 = r10.A02
            X.0qQ.A0B(r4, r9)
            androidx.fragment.app.Fragment r0 = r8.A02
            android.content.Context r3 = r0.requireContext()
            r2 = 12
            X.FP9 r0 = new X.FP9
            r0.<init>((java.lang.Object) r8, (int) r2)
            X.Fmc r2 = new X.Fmc
            r2.<init>((android.content.Context) r3, (android.view.View.OnClickListener) r0, (java.lang.CharSequence) r4)
            r0 = 2131238210(0x7f081d42, float:1.8092692E38)
            goto L_0x0a5b
        L_0x0a0e:
            java.lang.String r0 = r10.A02
            r8.A02(r7, r0)
            goto L_0x09c1
        L_0x0a14:
            java.lang.String r0 = r10.A02
            r8.A05(r7, r0)
            goto L_0x09c1
        L_0x0a1a:
            java.lang.String r4 = r10.A02
            X.0qQ.A0B(r4, r9)
            androidx.fragment.app.Fragment r0 = r8.A02
            android.content.Context r3 = r0.requireContext()
            r2 = 13
            X.FP9 r0 = new X.FP9
            r0.<init>((java.lang.Object) r8, (int) r2)
            X.Fmc r2 = new X.Fmc
            r2.<init>((android.content.Context) r3, (android.view.View.OnClickListener) r0, (java.lang.CharSequence) r4)
            r0 = 2131238965(0x7f082035, float:1.8094224E38)
            goto L_0x0a5b
        L_0x0a35:
            java.lang.String r0 = r10.A02
            r8.A04(r7, r0)
            goto L_0x09c1
        L_0x0a3b:
            java.lang.String r0 = r10.A02
            r8.A06(r7, r0)
            goto L_0x09c1
        L_0x0a41:
            java.lang.String r4 = r10.A02
            X.0qQ.A0B(r4, r9)
            androidx.fragment.app.Fragment r0 = r8.A02
            android.content.Context r3 = r0.requireContext()
            r2 = 60
            X.FPG r0 = new X.FPG
            r0.<init>((int) r2, (java.lang.Object) r10, (java.lang.Object) r8)
            X.Fmc r2 = new X.Fmc
            r2.<init>((android.content.Context) r3, (android.view.View.OnClickListener) r0, (java.lang.CharSequence) r4)
            r0 = 2131238861(0x7f081fcd, float:1.8094013E38)
        L_0x0a5b:
            r2.A03 = r0
            r7.add(r2)
            goto L_0x09c1
        L_0x0a62:
            android.content.Context r0 = r6.requireContext()
            X.C59689JTv.A05(r0)
            r0 = 2096059913(0x7cef5609, float:9.9416316E36)
            goto L_0x0a73
        L_0x0a6d:
            r6.setItems(r7)
            r0 = 1610493240(0x5ffe2d38, float:3.6630714E19)
        L_0x0a73:
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -1419884306(0xffffffffab5e48ee, float:-7.8971454E-13)
            goto L_0x1001
        L_0x0a7b:
            r0 = -287291036(0xffffffffeee04964, float:-3.4706683E28)
            int r1 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r6.A01
            X.Fpm r0 = (X.C51176Fpm) r0
            X.E4w r3 = r0.A00
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r2 = r3.A01
            if (r2 == 0) goto L_0x0aa4
            java.lang.String r5 = "edit_contact_info"
            r8 = 0
            java.lang.String r6 = r3.A08
            java.lang.String r7 = "save_info"
            com.instagram.model.business.BusinessInfo r0 = r3.A06
            java.util.HashMap r11 = X.C48728EjD.A00(r0)
            X.Xtl r4 = new X.Xtl
            r9 = r8
            r10 = r8
            r12 = r8
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r2.Ckg(r4)
        L_0x0aa4:
            X.G8D r0 = r3.A02
            com.instagram.business.activity.BusinessConversionActivity r0 = (com.instagram.business.activity.BusinessConversionActivity) r0
            r6 = 0
            r0.Clz(r6)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r3.A01
            if (r0 == 0) goto L_0x0ac1
            java.lang.String r4 = "edit_contact_info"
            java.lang.String r5 = r3.A08
            X.Xtl r3 = new X.Xtl
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r0.Ci7(r3)
        L_0x0ac1:
            r0 = 2001110379(0x7746856b, float:4.0264876E33)
            goto L_0x1001
        L_0x0ac6:
            r1 = 41948937(0x2801709, float:1.8821131E-37)
            int r1 = X.AnonymousClass0fD.A03(r1)
            X.DvS r0 = (X.DvS) r0
            r2 = 565742616(0x21b88c18, float:1.2505407E-18)
            int r4 = X.AnonymousClass0fD.A03(r2)
            X.F1D r7 = r0.A00
            if (r7 != 0) goto L_0x0ae5
            r0 = -832803693(0xffffffffce5c6c93, float:-9.2452576E8)
        L_0x0add:
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 650400(0x9eca0, float:9.11405E-40)
            goto L_0x1001
        L_0x0ae5:
            r8 = 0
            java.lang.String r0 = r7.A0M
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0b03
            java.lang.String r5 = r7.A0B
            java.lang.String r3 = r7.A0H
            java.lang.String r2 = r7.A0M
            java.lang.String r0 = "CALL"
            com.instagram.model.business.PublicPhoneContact r8 = new com.instagram.model.business.PublicPhoneContact
            r8.<init>()
            r8.A01 = r5
            r8.A02 = r3
            r8.A03 = r2
            r8.A00 = r0
        L_0x0b03:
            java.lang.Object r5 = r6.A01
            X.E4w r5 = (X.C47492E4w) r5
            com.instagram.model.business.BusinessInfo r0 = r5.A06
            X.FEa r2 = new X.FEa
            r2.<init>(r0)
            java.lang.String r0 = r7.A0D
            r2.A0B = r0
            r2.A01 = r8
            com.instagram.model.business.BusinessInfo r0 = new com.instagram.model.business.BusinessInfo
            r0.<init>(r2)
            r5.A06 = r0
            r0 = 1
            X.C47492E4w.A00(r5, r0)
            java.lang.String r3 = r7.A0D
            java.lang.String r2 = r7.A0M
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r5.A01
            if (r0 == 0) goto L_0x0b49
            java.util.HashMap r13 = X.AnonymousClass7TE.A1E()
            java.lang.String r0 = "email"
            r13.put(r0, r3)
            java.lang.String r0 = "phone"
            r13.put(r0, r2)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r5.A01
            java.lang.String r6 = "edit_contact_info"
            r9 = 0
            java.lang.String r7 = r5.A08
            java.lang.String r8 = "personal_contact_info"
            X.Xtl r5 = new X.Xtl
            r10 = r9
            r11 = r9
            r12 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r0.Ci5(r5)
        L_0x0b49:
            r0 = 24244892(0x171f29c, float:4.4438773E-38)
            goto L_0x0add
        L_0x0b4d:
            r1 = -884296229(0xffffffffcb4ab5db, float:-1.3284827E7)
            int r1 = X.AnonymousClass0fD.A03(r1)
            X.Dv0 r0 = (X.C47333Dv0) r0
            r2 = -1082639337(0xffffffffbf783c17, float:-0.9696669)
            int r7 = X.AnonymousClass0fD.A03(r2)
            java.lang.Object r5 = r6.A01
            X.E7B r5 = (X.E7B) r5
            android.view.View r4 = r5.A01
            if (r4 == 0) goto L_0x0b74
            android.view.View r2 = r5.A00
            if (r2 == 0) goto L_0x0b74
            r3 = 0
            r2 = 8
            r4.setVisibility(r2)
            android.view.View r2 = r5.A00
            r2.setVisibility(r3)
        L_0x0b74:
            boolean r0 = r0.A00
            r0 = r0 ^ 1
            r5.A0C = r0
            if (r0 == 0) goto L_0x0b81
            com.instagram.business.ui.BusinessInfoSectionView r0 = r5.A04
            r0.A01()
        L_0x0b81:
            r0 = -292476649(0xffffffffee912917, float:-2.24625E28)
            X.AnonymousClass0fD.A0A(r0, r7)
            r0 = -1585027883(0xffffffffa18664d5, float:-9.106883E-19)
            goto L_0x1001
        L_0x0b8c:
            r1 = 944163693(0x3846cb6d, float:4.7396334E-5)
            int r3 = X.AnonymousClass0fD.A03(r1)
            X.Dux r0 = (X.C47330Dux) r0
            r1 = -1725516086(0xffffffff9926b6ca, float:-8.618913E-24)
            int r2 = X.AnonymousClass7TG.A0D(r0, r1)
            java.lang.Object r1 = r6.A01
            X.E4D r1 = (X.E4D) r1
            X.Dm9 r1 = r1.A00
            if (r1 == 0) goto L_0x0be0
            java.util.List r0 = r0.A00
            r1.A00 = r0
            r1.notifyDataSetChanged()
            r0 = 904689621(0x35ec77d5, float:1.7618246E-6)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = -979214027(0xffffffffc5a26135, float:-5196.151)
            goto L_0x0fa7
        L_0x0bb6:
            r1 = -1447341511(0xffffffffa9bb5239, float:-8.3187316E-14)
            int r3 = X.AnonymousClass0fD.A03(r1)
            X.Dux r0 = (X.C47330Dux) r0
            r1 = 1464469441(0x574a07c1, float:2.22134652E14)
            int r2 = X.AnonymousClass7TG.A0D(r0, r1)
            java.lang.Object r1 = r6.A01
            X.E1i r1 = (X.C47414E1i) r1
            X.Dm9 r1 = r1.A00
            if (r1 == 0) goto L_0x0be0
            java.util.List r0 = r0.A00
            r1.A00 = r0
            r1.notifyDataSetChanged()
            r0 = -277410719(0xffffffffef770c61, float:-7.6457763E28)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = 337408911(0x141c738f, float:7.898777E-27)
            goto L_0x0fa7
        L_0x0be0:
            java.lang.String r6 = "boostGuidanceAdapter"
            goto L_0x0f89
        L_0x0be4:
            r1 = -1403498453(0xffffffffac58502b, float:-3.0739948E-12)
            int r4 = X.AnonymousClass0fD.A03(r1)
            X.DvY r0 = (X.DvY) r0
            r1 = 2063518167(0x7afec9d7, float:6.614686E35)
            int r3 = X.AnonymousClass7TG.A0D(r0, r1)
            java.lang.Object r6 = r6.A01
            X.E4H r6 = (X.E4H) r6
            java.util.List r1 = r0.A01
            r6.A06 = r1
            X.0eM r1 = r6.A0B
            java.lang.Object r2 = r1.getValue()
            X.Dkd r2 = (X.C46750Dkd) r2
            java.util.List r1 = r0.A00
            X.2Fj r0 = r2.A00
            r0.A0B(r1)
            java.util.List r9 = r6.A06
            if (r9 != 0) goto L_0x0c13
            java.lang.String r6 = "objectives"
            goto L_0x0f89
        L_0x0c13:
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Set r5 = r6.A0A
            boolean r0 = r5.isEmpty()
            r8 = 1
            if (r0 == 0) goto L_0x0c40
            java.util.Iterator r2 = r9.iterator()
        L_0x0c24:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0c40
            java.lang.Object r1 = r2.next()
            X.Dvs r1 = (X.C47358Dvs) r1
            java.lang.Boolean r0 = r1.A00
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r8)
            if (r0 == 0) goto L_0x0c24
            java.lang.Integer r0 = r1.A01
            if (r0 == 0) goto L_0x0c24
            r5.add(r0)
            goto L_0x0c24
        L_0x0c40:
            java.util.Iterator r8 = r9.iterator()
        L_0x0c44:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0c7a
            java.lang.Object r2 = r8.next()
            X.Dvs r2 = (X.C47358Dvs) r2
            int r1 = r5.size()
            r0 = 2
            if (r1 < r0) goto L_0x0c60
            java.lang.Integer r0 = r2.A01
            boolean r0 = X.00k.A0u(r5, r0)
            r1 = 0
            if (r0 == 0) goto L_0x0c61
        L_0x0c60:
            r1 = 1
        L_0x0c61:
            java.lang.Integer r0 = r2.A01
            boolean r0 = X.00k.A0u(r5, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A00 = r0
            X.EbA r0 = new X.EbA
            r0.<init>()
            r0.A00 = r2
            r0.A01 = r1
            r7.add(r0)
            goto L_0x0c44
        L_0x0c7a:
            r6.A07 = r7
            X.Dlr r2 = r6.A01
            if (r2 != 0) goto L_0x0c84
            java.lang.String r6 = "adapter"
            goto L_0x0f89
        L_0x0c84:
            java.util.List r1 = X.00k.A0a(r7)
            java.util.List r0 = r2.A01
            X.DbW.A0z(r2, r1, r0)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r2 = r6.A04
            if (r2 == 0) goto L_0x0c9d
            int r1 = r5.size()
            r0 = 2
            boolean r0 = X.AnonymousClass7TF.A1S(r1, r0)
            r2.setPrimaryButtonEnabled(r0)
        L_0x0c9d:
            r0 = -993788536(0xffffffffc4c3fd88, float:-1567.9229)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = -1867839036(0xffffffff90ab09c4, float:-6.7462654E-29)
        L_0x0ca6:
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        L_0x0caa:
            r0 = 1850384920(0x6e4aa218, float:1.5677983E28)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = 137362577(0x82ffc91, float:5.2959037E-34)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r5 = r6.A01
            X.E4G r5 = (X.E4G) r5
            java.util.List r1 = r5.A06
            if (r1 != 0) goto L_0x0cc4
            java.lang.String r6 = "selectedObjectiveIds"
            goto L_0x0f89
        L_0x0cc4:
            java.util.Set r7 = r5.A09
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r5.A02
            if (r0 == 0) goto L_0x0cf9
            java.util.HashMap r13 = X.AnonymousClass7TE.A1E()
            r9 = 0
            java.lang.String r6 = ", "
            java.lang.String r2 = ""
            java.lang.String r1 = X.00k.A0P(r6, r2, r2, r1, r9)
            java.lang.String r0 = "objectives"
            r13.put(r0, r1)
            java.lang.String r1 = X.00k.A0P(r6, r2, r2, r7, r9)
            java.lang.String r0 = "connection_methods"
            r13.put(r0, r1)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r5.A02
            if (r0 == 0) goto L_0x0cf9
            java.lang.String r7 = "business_objectives"
            java.lang.String r8 = r5.A05
            X.Xtl r6 = new X.Xtl
            r10 = r9
            r11 = r9
            r12 = r9
            r14 = r9
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r0.Ckg(r6)
        L_0x0cf9:
            X.0eM r0 = r5.A0B
            X.1Ng r2 = X.DbX.A0R(r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A02
            X.6ur r0 = new X.6ur
            r0.<init>(r1)
            r2.A00(r0)
            X.0hq r2 = r5.getParentFragmentManager()
            r1 = 1
            java.lang.String r0 = "BusinessObjectives"
            r2.A0y(r0, r1)
            android.content.Context r1 = r5.requireContext()
            r0 = 2131952322(0x7f1302c2, float:1.9541083E38)
            X.C59689JTv.A07(r1, r0)
            r0 = 1090659135(0x4102233f, float:8.133605)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -49118971(0xfffffffffd128105, float:-1.2171075E37)
            goto L_0x0fa7
        L_0x0d28:
            r1 = 1990166975(0x769f89bf, float:1.6179082E33)
            int r1 = X.AnonymousClass0fD.A03(r1)
            X.Dv0 r0 = (X.C47333Dv0) r0
            r2 = -290082505(0xffffffffeeb5b137, float:-2.8115513E28)
            int r3 = X.AnonymousClass0fD.A03(r2)
            java.lang.Object r4 = r6.A01
            com.instagram.business.fragment.AccountTypeSelectionV2Fragment r4 = (com.instagram.business.fragment.AccountTypeSelectionV2Fragment) r4
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r2 = r4.A00
            if (r2 == 0) goto L_0x0d63
            java.util.HashMap r13 = X.AnonymousClass7TE.A1E()
            boolean r2 = r0.A00
            java.lang.String r5 = java.lang.String.valueOf(r2)
            java.lang.String r2 = "should_show_edit_contact_info_step"
            r13.put(r2, r5)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r2 = r4.A00
            java.lang.String r6 = "account_type_selection"
            r9 = 0
            java.lang.String r7 = r4.A05
            java.lang.String r8 = "professional_conversion_nux_config"
            X.Xtl r5 = new X.Xtl
            r10 = r9
            r11 = r9
            r12 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r2.Ci5(r5)
        L_0x0d63:
            X.G8D r2 = r4.mController
            r2.getClass()
            X.FRU r2 = X.Dba.A0C(r2)
            r2.A01 = r0
            android.os.Handler r2 = r4.A08
            X.Fpg r0 = new X.Fpg
            r0.<init>(r4)
            r2.post(r0)
            r0 = 229164098(0xda8c442, float:1.0401047E-30)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = -1066559884(0xffffffffc06d9674, float:-3.712308)
            goto L_0x1001
        L_0x0d83:
            r1 = -1758659420(0xffffffff972cfca4, float:-5.5895075E-25)
            int r1 = X.AnonymousClass0fD.A03(r1)
            X.De9 r0 = (X.De9) r0
            r2 = 24948962(0x17cb0e2, float:4.6411997E-38)
            int r3 = X.AnonymousClass7TG.A0D(r0, r2)
            java.lang.Object r2 = r6.A01
            X.FRU r2 = X.Dba.A0C(r2)
            r2.A00 = r0
            r0 = -303295641(0xffffffffedec1367, float:-9.13274E27)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 180964301(0xac94bcd, float:1.9384109E-32)
            goto L_0x1001
        L_0x0da6:
            r1 = -1644843346(0xffffffff9df5aeae, float:-6.5031575E-21)
            int r1 = X.AnonymousClass0fD.A03(r1)
            X.Dvq r0 = (X.C47356Dvq) r0
            r2 = 742703644(0x2c44c21c, float:2.7961028E-12)
            int r5 = X.AnonymousClass7TG.A0D(r0, r2)
            java.lang.String r2 = r0.A01
            if (r2 == 0) goto L_0x0dd5
            java.lang.Object r4 = r6.A01
            X.E4r r4 = (X.C47487E4r) r4
            android.view.View r3 = r4.mView
            if (r3 == 0) goto L_0x0dca
            X.FsS r2 = new X.FsS
            r2.<init>(r4, r0)
            r3.post(r2)
        L_0x0dca:
            r0 = 1020271828(0x3cd01cd4, float:0.025404371)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 764227324(0x2d8d2efc, float:1.605071E-11)
            goto L_0x1001
        L_0x0dd5:
            java.lang.Object r0 = r6.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.content.Context r3 = r0.getContext()
            android.content.res.Resources r2 = X.DbV.A05(r0)
            r0 = 2131961756(0x7f13279c, float:1.9560218E38)
            java.lang.String r0 = r2.getString(r0)
            X.C59689JTv.A09(r3, r0)
            goto L_0x0dca
        L_0x0dec:
            r1 = -768021937(0xffffffffd238ea4f, float:-1.98551257E11)
            int r1 = X.AnonymousClass0fD.A03(r1)
            X.Dw6 r0 = (X.Dw6) r0
            r2 = 2106567118(0x7d8fa9ce, float:2.387016E37)
            int r4 = X.AnonymousClass7TG.A0D(r0, r2)
            java.lang.Object r5 = r6.A01
            X.E4r r5 = (X.C47487E4r) r5
            r5.A01 = r0
            com.instagram.ui.widget.spinner.SpinnerImageView r2 = r5.A03
            r12 = 0
            if (r2 != 0) goto L_0x0e0b
            java.lang.String r6 = "spinner"
            goto L_0x0f89
        L_0x0e0b:
            X.3uy r0 = X.C255943uy.SUCCESS
            r2.setLoadingStatus(r0)
            X.C47487E4r.A00(r5)
            X.0eM r0 = r5.A0B
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r0)
            java.lang.Integer r7 = X.AnonymousClass05K.A0l
            java.lang.String r2 = "notif_source"
            java.lang.String r0 = r5.A05
            if (r0 != 0) goto L_0x0e25
            java.lang.String r6 = "notifSource"
            goto L_0x0f89
        L_0x0e25:
            X.0eP r3 = X.AnonymousClass7TE.A1L(r2, r0)
            java.lang.String r2 = "media_type"
            java.lang.String r0 = r5.A04
            java.util.LinkedHashMap r14 = X.DbY.A0p(r2, r0, r3)
            r8 = 0
            X.Dw6 r0 = r5.A01
            if (r0 == 0) goto L_0x0e38
            java.lang.String r12 = r0.A04
        L_0x0e38:
            r9 = r8
            r10 = r8
            r11 = r8
            r13 = r8
            X.JVF.A03(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = 1242457710(0x4a0e666e, float:2333083.5)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 705723513(0x2a107c79, float:1.2832954E-13)
            goto L_0x1001
        L_0x0e4a:
            r1 = 635230855(0x25dcda87, float:3.8311996E-16)
            int r2 = X.AnonymousClass0fD.A03(r1)
            X.1XO r0 = (X.1XO) r0
            r1 = 1485228617(0x5886ca49, float:1.18562693E15)
            int r3 = X.AnonymousClass0fD.A03(r1)
            r14 = 0
            X.0qQ.A0B(r0, r14)
            java.util.List r1 = r0.A06
            X.0qQ.A07(r1)
            boolean r1 = X.AnonymousClass7TE.A1b(r1)
            if (r1 == 0) goto L_0x0ed2
            java.util.List r0 = r0.A06
            X.1Xj r7 = X.DbZ.A0T(r0, r14)
            com.instagram.model.mediatype.ProductType r1 = r7.A1v()
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.STORY
            java.lang.Object r8 = r6.A01
            X.E4q r8 = (X.C47486E4q) r8
            if (r1 != r0) goto L_0x0edf
            X.0eM r5 = r8.A07
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r5)
            com.instagram.reels.store.ReelStore r6 = X.1OP.A05(r0)
            java.lang.String r4 = r8.A06
            r1 = 0
            if (r4 == 0) goto L_0x0f13
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r5)
            com.instagram.user.model.User r0 = r7.A2A(r0)
            if (r0 == 0) goto L_0x0e99
            X.1Nr r1 = new X.1Nr
            r1.<init>(r0)
        L_0x0e99:
            java.util.List r0 = java.util.Collections.singletonList(r7)
            com.instagram.model.reels.Reel r12 = r6.A0J(r1, r4, r0, r14)
            android.view.ViewGroup r4 = r8.A01
            java.lang.String r6 = "rootView"
            if (r4 == 0) goto L_0x0f89
            android.view.LayoutInflater r1 = X.DbV.A0D(r4)
            r0 = 2131628864(0x7f0e1340, float:1.8885033E38)
            android.view.View r1 = X.DbU.A0A(r1, r4, r0, r14)
            X.Fkg r0 = new X.Fkg
            r0.<init>(r1)
            r1.setTag(r0)
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r5)
            X.Fkg r11 = new X.Fkg
            r11.<init>(r1)
            java.util.List r13 = X.AnonymousClass7TE.A1I(r12)
            r10 = r8
            X.C48937Emb.A00(r8, r9, r10, r11, r12, r13, r14)
            android.view.ViewGroup r0 = r8.A01
            if (r0 == 0) goto L_0x0f89
            r0.addView(r1)
        L_0x0ed2:
            r0 = -2088348330(0xffffffff83865556, float:-7.895404E-37)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = -1899940947(0xffffffff8ec133ad, float:-4.7627935E-30)
            X.AnonymousClass0fD.A0A(r0, r2)
            return
        L_0x0edf:
            java.lang.String r5 = r8.A06
            if (r5 == 0) goto L_0x0f13
            X.H1t r4 = new X.H1t
            r4.<init>()
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            r0 = 139(0x8b, float:1.95E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.putString(r0, r5)
            r4.setArguments(r1)
            android.os.Bundle r1 = r4.mArguments
            if (r1 == 0) goto L_0x0f05
            X.0eM r0 = r8.A07
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.DbU.A1D(r1, r0)
        L_0x0f05:
            X.0s1 r1 = X.DbW.A0C(r8)
            r0 = 2131429059(0x7f0b06c3, float:1.847978E38)
            r1.A0A(r4, r0)
            r1.A00()
            goto L_0x0ed2
        L_0x0f13:
            java.lang.String r6 = "mediaId"
            goto L_0x0f89
        L_0x0f16:
            r1 = 1648311360(0x623f3c40, float:8.819174E20)
            int r3 = X.AnonymousClass0fD.A03(r1)
            X.371 r0 = (X.AnonymousClass371) r0
            r1 = 1079055429(0x40511445, float:3.2668622)
            int r2 = X.AnonymousClass7TG.A0D(r0, r1)
            java.lang.Object r1 = r6.A01
            com.instagram.banyan.BanyanCoordinator r1 = (com.instagram.banyan.BanyanCoordinator) r1
            java.lang.Object r0 = r0.FH3()
            X.0qQ.A07(r0)
            X.PwO r0 = (X.C74529PwO) r0
            com.instagram.banyan.BanyanCoordinator.A03(r0, r1)
            r0 = 26395993(0x192c559, float:5.391511E-38)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = -1922385603(0xffffffff8d6ab93d, float:-7.232979E-31)
            goto L_0x0fa7
        L_0x0f40:
            r0 = 621180139(0x250674eb, float:1.166226E-16)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = 1233808154(0x498a6b1a, float:1133923.2)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r7 = r6.A01
            X.DuE r7 = (X.C47285DuE) r7
            X.DbS.A1D(r7)
            boolean r0 = r7.A04
            if (r0 == 0) goto L_0x0f75
            com.instagram.common.session.UserSession r0 = r7.A00
            java.lang.String r6 = "currentUserSession"
            if (r0 == 0) goto L_0x0f89
            X.6qt r5 = X.C319606qt.A01(r0)
            java.lang.String r10 = r7.A03
            if (r10 == 0) goto L_0x0f91
            r11 = 1
            java.lang.Integer r9 = X.AnonymousClass05K.A03
            com.instagram.common.session.UserSession r8 = r7.A00
            if (r8 == 0) goto L_0x0f89
            android.content.Context r6 = r7.getContext()
            r5.A09(r6, r7, r8, r9, r10, r11)
        L_0x0f75:
            androidx.fragment.app.Fragment r2 = r7.getTargetFragment()
            boolean r0 = r2 instanceof X.G5O
            if (r0 == 0) goto L_0x0f97
            X.G5O r2 = (X.G5O) r2
            java.lang.String r1 = r7.A03
            if (r1 == 0) goto L_0x0f91
            java.lang.String r0 = r7.A02
            if (r0 != 0) goto L_0x0f94
            java.lang.String r6 = "mainUserId"
        L_0x0f89:
            X.0qQ.A0F(r6)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0f91:
            java.lang.String r6 = "targetUserId"
            goto L_0x0f89
        L_0x0f94:
            r2.DWL(r1, r0)
        L_0x0f97:
            X.0hq r0 = r7.mFragmentManager
            if (r0 == 0) goto L_0x0f9e
            r0.A0c()
        L_0x0f9e:
            r0 = -2053079842(0xffffffff85a07cde, float:-1.5092197E-35)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -773069475(0xffffffffd1ebe55d, float:-1.26645674E11)
        L_0x0fa7:
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        L_0x0fab:
            r1 = -662699184(0xffffffffd8800350, float:-1.12601372E15)
            int r1 = X.AnonymousClass0fD.A03(r1)
            r2 = -1087031784(0xffffffffbf353618, float:-0.70785666)
            int r5 = X.AnonymousClass0fD.A03(r2)
            X.C47697EDg.super.onSuccess(r0)
            java.lang.Object r7 = r6.A01
            X.E4W r7 = (X.E4W) r7
            boolean r0 = r7.A02
            com.instagram.common.session.UserSession r6 = r7.A00
            if (r0 == 0) goto L_0x1008
            X.EZs r0 = X.C48150EZs.A02
            java.lang.String r2 = r0.toString()
            r4 = 0
            boolean r3 = X.AnonymousClass7TF.A1U(r4, r6, r2)
            java.lang.String r0 = "create_password_success"
            X.FG9.A00(r6, r0, r2)
            X.DbT.A1I(r7)
            X.DbT.A1I(r7)
        L_0x0fdc:
            r7.A07 = r4
            X.E4W.A01(r7)
            android.content.Context r2 = r7.getContext()
            r0 = 2131969197(0x7f1344ad, float:1.957531E38)
            X.C59689JTv.A08(r2, r0, r3)
            boolean r0 = r7.A03
            X.0hq r2 = r7.getParentFragmentManager()
            if (r0 == 0) goto L_0x1005
            java.lang.String r0 = "AccountLinkingMainGroupManagementFragment.BACK_STACK_STATE_NAME"
        L_0x0ff5:
            r2.A0y(r0, r4)
            r0 = -303459960(0xffffffffede99188, float:-9.035743E27)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -1035725643(0xffffffffc24414b5, float:-49.02022)
        L_0x1001:
            X.AnonymousClass0fD.A0A(r0, r1)
            return
        L_0x1005:
            java.lang.String r0 = "AccountLinkingChildGroupManagementFragment.BACK_STACK_STATE_NAME"
            goto L_0x0ff5
        L_0x1008:
            X.EZs r0 = X.C48150EZs.A03
            java.lang.String r2 = r0.toString()
            r4 = 0
            boolean r3 = X.AnonymousClass7TF.A1U(r4, r6, r2)
            java.lang.String r0 = "create_password_success"
            X.FG9.A00(r6, r0, r2)
            goto L_0x0fdc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47697EDg.onSuccess(java.lang.Object):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00e9, code lost:
        X.AnonymousClass0fD.A0A(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00ec, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00f0, code lost:
        X.DbS.A12();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00f7, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(java.lang.Object r16) {
        /*
            r15 = this;
            int r0 = r15.A00
            switch(r0) {
                case 21: goto L_0x00aa;
                case 22: goto L_0x0005;
                case 23: goto L_0x0005;
                case 24: goto L_0x005b;
                case 25: goto L_0x000b;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = r16
            X.C47697EDg.super.onSuccessInBackground(r0)
            return
        L_0x000b:
            r0 = -1842130334(0xffffffff92335262, float:-5.6583985E-28)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r1 = 1699675456(0x654efd40, float:6.1092446E22)
            int r4 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r6 = r15.A01
            X.E3R r6 = (X.E3R) r6
            X.0eM r5 = r6.A0E
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r5)
            com.instagram.user.model.User r3 = X.AnonymousClass7TF.A0Q(r1)
            boolean r1 = r6.A04
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            X.4Cl r1 = r3.A03
            r1.Edr(r2)
            X.0lg r1 = X.DbT.A0X(r5)
            r3.A0d(r1)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r6.A00
            if (r1 == 0) goto L_0x00f0
            java.lang.String r7 = "safety"
            r10 = 0
            java.lang.String r8 = r6.A03
            java.lang.String r9 = "hide_message_requests_setting"
            X.Xtl r6 = new X.Xtl
            r11 = r10
            r12 = r10
            r13 = r10
            r14 = r10
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r1.Ckg(r6)
            r1 = -158284599(0xfffffffff690c4c9, float:-1.468129E33)
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = 1108714663(0x4215a4a7, float:37.410793)
            goto L_0x00e9
        L_0x005b:
            r0 = -503397201(0xffffffffe1fec4af, float:-5.874557E20)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r1 = 1350307188(0x507c0d74, float:1.69149604E10)
            int r4 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r6 = r15.A01
            X.E3R r6 = (X.E3R) r6
            X.0eM r5 = r6.A0E
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r5)
            com.instagram.user.model.User r3 = X.AnonymousClass7TF.A0Q(r1)
            boolean r1 = r6.A05
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            X.4Cl r1 = r3.A03
            r1.EZ8(r2)
            X.0lg r1 = X.DbT.A0X(r5)
            r3.A0d(r1)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r6.A00
            if (r1 == 0) goto L_0x00f0
            java.lang.String r7 = "safety"
            r10 = 0
            java.lang.String r8 = r6.A03
            java.lang.String r9 = "hide_more_comments_setting"
            X.Xtl r6 = new X.Xtl
            r11 = r10
            r12 = r10
            r13 = r10
            r14 = r10
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r1.Ckg(r6)
            r1 = -1143746542(0xffffffffbbd3d012, float:-0.006464013)
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = -968983563(0xffffffffc63e7bf5, float:-12190.989)
            goto L_0x00e9
        L_0x00aa:
            r0 = -268689504(0xffffffffeffc1fa0, float:-1.5605691E29)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r1 = 968621732(0x39bbfea4, float:3.5857141E-4)
            int r4 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r3 = r15.A01
            X.E4z r3 = (X.C47494E4z) r3
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r2 = r3.A00
            if (r2 == 0) goto L_0x00f0
            java.lang.String r6 = "opt_in_promotional_email"
            r9 = 0
            java.lang.String r7 = r3.A01
            java.lang.String r8 = "opt_in_promotional_email_setting"
            boolean r1 = r3.A03
            if (r1 == 0) goto L_0x00ed
            java.lang.String r1 = "on"
        L_0x00cd:
            java.util.HashMap r12 = X.DbY.A0m(r8, r1)
            X.Xtl r5 = new X.Xtl
            r10 = r9
            r11 = r9
            r13 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r2.Ckg(r5)
            boolean r1 = r3.A03
            r3.A02 = r1
            r1 = 319393298(0x13098e12, float:1.7361877E-27)
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = 176181156(0xa804fa4, float:1.2355909E-32)
        L_0x00e9:
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        L_0x00ed:
            java.lang.String r1 = "off"
            goto L_0x00cd
        L_0x00f0:
            X.DbS.A12()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47697EDg.onSuccessInBackground(java.lang.Object):void");
    }
}
