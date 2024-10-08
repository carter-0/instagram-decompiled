package X;

import android.app.Dialog;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.LinkedHashSet;

public final class EDV extends 1P0 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public EDV(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public static void A00(1OC r1, Object obj, Object obj2, int i) {
        r1.A00 = new EDV(i, obj, obj2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:169:0x05a3, code lost:
        X.0qQ.A0F(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x05aa, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0750, code lost:
        X.AnonymousClass0fD.A0A(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0753, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0781, code lost:
        X.AnonymousClass0fD.A0A(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0784, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x07a5, code lost:
        X.AnonymousClass0fD.A0A(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x07a8, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFail(X.C268654dm r14) {
        /*
            r13 = this;
            int r0 = r13.A00
            switch(r0) {
                case 0: goto L_0x0759;
                case 1: goto L_0x06f2;
                case 2: goto L_0x0005;
                case 3: goto L_0x06e3;
                case 4: goto L_0x0682;
                case 5: goto L_0x0622;
                case 6: goto L_0x05d9;
                case 7: goto L_0x056f;
                case 8: goto L_0x052c;
                case 9: goto L_0x04e7;
                case 10: goto L_0x0445;
                case 11: goto L_0x079b;
                case 12: goto L_0x0418;
                case 13: goto L_0x03f4;
                case 14: goto L_0x0005;
                case 15: goto L_0x03d3;
                case 16: goto L_0x03c4;
                case 17: goto L_0x03ad;
                case 18: goto L_0x036f;
                case 19: goto L_0x0790;
                case 20: goto L_0x0321;
                case 21: goto L_0x0005;
                case 22: goto L_0x030e;
                case 23: goto L_0x02fb;
                case 24: goto L_0x02e6;
                case 25: goto L_0x02ca;
                case 26: goto L_0x028a;
                case 27: goto L_0x0256;
                case 28: goto L_0x0005;
                case 29: goto L_0x0005;
                case 30: goto L_0x0242;
                case 31: goto L_0x0215;
                case 32: goto L_0x01fd;
                case 33: goto L_0x0005;
                case 34: goto L_0x0005;
                case 35: goto L_0x01d3;
                case 36: goto L_0x0174;
                case 37: goto L_0x0152;
                case 38: goto L_0x0130;
                case 39: goto L_0x0785;
                case 40: goto L_0x0105;
                case 41: goto L_0x00e3;
                case 42: goto L_0x009f;
                case 43: goto L_0x0005;
                case 44: goto L_0x0088;
                case 45: goto L_0x0062;
                case 46: goto L_0x0031;
                case 47: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.EDV.super.onFail(r14)
            return
        L_0x0009:
            r0 = -1659293195(0xffffffff9d1931f5, float:-2.0275209E-21)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.6ap r3 = X.DbV.A0X()
            java.lang.String r1 = "mark_not_spam_error"
            r3.A0H = r1
            java.lang.Object r1 = r13.A02
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            android.content.res.Resources r2 = X.DbV.A05(r1)
            r1 = 2131965867(0x7f1337ab, float:1.9568556E38)
            X.DbT.A1D(r2, r3, r1)
            r3.A06()
            X.DbY.A1N(r3)
            r1 = 761546052(0x2d644544, float:1.29756796E-11)
            goto L_0x0781
        L_0x0031:
            r0 = -604512284(0xffffffffdbf7dfe4, float:-1.39540979E17)
            int r0 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r13.A01
            int r4 = X.DbS.A05(r1)
            X.6ap r3 = X.DbV.A0X()
            java.lang.String r1 = "batch_follow_many_request_failed"
            r3.A0H = r1
            java.lang.Object r1 = r13.A02
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            android.content.res.Resources r2 = X.DbV.A05(r1)
            r1 = 2131820577(0x7f110021, float:1.9273873E38)
            java.lang.String r1 = r2.getQuantityString(r1, r4)
            r3.A0D = r1
            r3.A06()
            X.DbY.A1N(r3)
            r1 = 1213915920(0x485ae310, float:224140.25)
            goto L_0x0781
        L_0x0062:
            r0 = 78072170(0x4a7496a, float:3.932893E-36)
            int r0 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r3 = r13.A02
            X.5le r3 = (X.C293975le) r3
            com.instagram.user.model.User r2 = r3.A00
            java.lang.Object r1 = r13.A01
            if (r2 != r1) goto L_0x0080
            boolean r1 = r2.A1z()
            if (r1 == 0) goto L_0x0085
            java.lang.Integer r1 = X.AnonymousClass05K.A00
        L_0x007b:
            r3.A01 = r1
            X.C293975le.A01(r3)
        L_0x0080:
            r1 = -931028532(0xffffffffc881a1cc, float:-265486.38)
            goto L_0x0781
        L_0x0085:
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            goto L_0x007b
        L_0x0088:
            r0 = -1621173548(0xffffffff9f5edad4, float:-4.719134E-20)
            int r0 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r13.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r13.A02
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            X.C49807F7u.A01(r2, r1)
            r1 = 1924229824(0x72b16ac0, float:7.028211E30)
            goto L_0x0781
        L_0x009f:
            r0 = 1085579333(0x40b4a045, float:5.644564)
            int r1 = X.AnonymousClass7TG.A0D(r14, r0)
            java.lang.Throwable r0 = r14.A01()
            if (r0 == 0) goto L_0x00c9
            java.lang.Object r5 = r13.A01
            X.1P0 r5 = (X.1P0) r5
            java.lang.String r4 = java.lang.String.valueOf(r0)
            r3 = 0
            r0 = 20
            X.Jvb r2 = new X.Jvb
            r2.<init>(r3, r4, r3, r0)
        L_0x00bc:
            X.4do r0 = new X.4do
            r0.<init>(r2)
        L_0x00c1:
            r5.onFail(r0)
            r0 = 810308638(0x304c541e, float:7.4334305E-10)
            goto L_0x0750
        L_0x00c9:
            java.lang.Object r0 = r14.A00()
            X.3JC r0 = (X.AnonymousClass3JC) r0
            java.lang.Object r5 = r13.A01
            X.1P0 r5 = (X.1P0) r5
            if (r0 == 0) goto L_0x00de
            java.lang.Object r0 = r0.A01
            X.C5S r0 = (X.C5S) r0
            X.Jvb r2 = X.C45883D9c.A00(r0)
            goto L_0x00bc
        L_0x00de:
            X.4dn r0 = X.AnonymousClass7BQ.A00()
            goto L_0x00c1
        L_0x00e3:
            r0 = 1038201912(0x3de1b438, float:0.11020702)
            int r0 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r13.A01
            X.Ewx r2 = (X.C49518Ewx) r2
            r1 = 0
            X.C49518Ewx.A00(r2, r1)
            java.lang.Object r3 = r13.A02
            X.Ddd r3 = (X.C46361Ddd) r3
            X.EyJ r2 = r3.A07
            r1 = 1
            r2.A02 = r1
            r2.A01 = r1
            X.C46361Ddd.A01(r3)
            r1 = -132870323(0xfffffffff8148f4d, float:-1.20526E34)
            goto L_0x0781
        L_0x0105:
            r0 = 1021390866(0x3ce13012, float:0.027488742)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.02m r3 = X.02m.A0p
            r2 = 39059457(0x2540001, float:1.5575301E-37)
            r1 = 3
            r3.markerEnd(r2, r1)
            java.lang.Object r2 = r13.A01
            X.Eww r2 = (X.C49517Eww) r2
            r1 = 0
            X.C49517Eww.A00(r2, r1)
            java.lang.Object r3 = r13.A02
            X.Ddd r3 = (X.C46361Ddd) r3
            X.EyJ r2 = r3.A06
            r1 = 1
            r2.A02 = r1
            r2.A01 = r1
            X.C46361Ddd.A01(r3)
            r1 = 516542737(0x1ec9d111, float:2.136817E-20)
            goto L_0x0781
        L_0x0130:
            r0 = 1921863556(0x728d4f84, float:5.59789E30)
            int r0 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r13.A01
            X.Ddg r2 = (X.C46364Ddg) r2
            r1 = 0
            X.C46364Ddg.A00(r2, r1)
            java.lang.Object r3 = r13.A02
            X.Ddd r3 = (X.C46361Ddd) r3
            X.EyJ r2 = r3.A05
            r1 = 1
            r2.A02 = r1
            r2.A01 = r1
            X.C46361Ddd.A01(r3)
            r1 = 99410254(0x5ece14e, float:2.2276097E-35)
            goto L_0x0781
        L_0x0152:
            r0 = -1343175998(0xffffffffaff0c2c2, float:-4.379413E-10)
            int r0 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r13.A01
            X.Ddh r2 = (X.C46365Ddh) r2
            r1 = 0
            X.C46365Ddh.A00(r2, r1)
            java.lang.Object r3 = r13.A02
            X.Ddd r3 = (X.C46361Ddd) r3
            X.EyJ r2 = r3.A04
            r1 = 1
            r2.A02 = r1
            r2.A01 = r1
            X.C46361Ddd.A01(r3)
            r1 = -537616887(0xffffffffdff49e09, float:-3.5253072E19)
            goto L_0x0781
        L_0x0174:
            r0 = 632259656(0x25af8448, float:3.0447298E-16)
            int r1 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r13.A02
            X.FBX r0 = (X.FBX) r0
            X.FBX.A00(r0)
            java.lang.Object r5 = r13.A01
            X.EQr r5 = (X.C48008EQr) r5
            r0 = 2131975944(0x7f135f08, float:1.9588995E38)
            java.lang.String r4 = r5.getString(r0)
            java.lang.Object r3 = r14.A00()
            r2 = 0
            if (r3 == 0) goto L_0x01a5
            r0 = r3
            X.DvM r0 = (X.DvM) r0
            java.lang.Integer r2 = r0.A00
            X.1XP r3 = (X.1XP) r3
            java.lang.String r0 = r3.getErrorMessage()
            if (r0 == 0) goto L_0x01a5
            java.lang.String r4 = r3.getErrorMessage()
        L_0x01a5:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r2 != r0) goto L_0x01cd
            r0 = 2131971299(0x7f134ce3, float:1.9579573E38)
            java.lang.String r0 = r5.getString(r0)
            X.8ab r3 = X.DbW.A0V(r5)
            r3.A05 = r0
            r3.A0q(r4)
            r2 = 2131968772(0x7f134304, float:1.9574448E38)
            r0 = 36
            X.FJg r0 = X.C50021FJg.A00(r5, r0)
            r3.A0H(r0, r2)
            X.DbT.A1V(r3)
        L_0x01c8:
            r0 = 1629655429(0x61229185, float:1.8742865E20)
            goto L_0x0750
        L_0x01cd:
            com.instagram.ui.widget.inlineerror.InlineErrorMessageView r0 = r5.A05
            r0.A04(r4)
            goto L_0x01c8
        L_0x01d3:
            r0 = -35083089(0xfffffffffde8acaf, float:-3.865969E37)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r3 = 0
            X.0qQ.A0B(r14, r3)
            X.EDV.super.onFail(r14)
            java.lang.Object r2 = r13.A02
            X.E1x r2 = (X.C47428E1x) r2
            android.view.View r1 = r2.A00
            X.AnonymousClass7TH.A0R(r1)
            com.instagram.igds.components.textcell.IgdsListCell r1 = r2.A02
            if (r1 == 0) goto L_0x01f1
            r1.setVisibility(r3)
        L_0x01f1:
            com.instagram.igds.components.textcell.IgdsListCell r1 = r2.A03
            if (r1 == 0) goto L_0x01f8
            r1.setVisibility(r3)
        L_0x01f8:
            r1 = 513293896(0x1e983e48, float:1.6119385E-20)
            goto L_0x0781
        L_0x01fd:
            r0 = -1798285580(0xffffffff94d056f4, float:-2.103693E-26)
            int r0 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r4 = r13.A01
            android.content.Context r4 = (android.content.Context) r4
            java.lang.String r3 = "Error loading a QP"
            java.lang.String r2 = "qp_debug"
            r1 = 0
            X.C59689JTv.A03(r4, r3, r2, r1)
            r1 = 471439804(0x1c1999bc, float:5.082215E-22)
            goto L_0x0781
        L_0x0215:
            r0 = 1848800517(0x6e327505, float:1.380745E28)
            int r0 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r4 = r13.A02
            X.E6N r4 = (X.E6N) r4
            android.content.Context r2 = r4.getContext()
            java.lang.String r1 = "Error loading QPs"
            X.C59689JTv.A09(r2, r1)
            java.util.Set r3 = r4.A05
            java.lang.Object r1 = r13.A01
            r3.remove(r1)
            com.instagram.ui.widget.refresh.RefreshableListView r2 = r4.A04
            if (r2 == 0) goto L_0x023d
            boolean r1 = r3.isEmpty()
            r1 = r1 ^ 1
            r2.setIsLoading(r1)
        L_0x023d:
            r1 = -780707291(0xffffffffd1775a25, float:-6.6398081E10)
            goto L_0x0781
        L_0x0242:
            r0 = 491563972(0x1d4cabc4, float:2.7087976E-21)
            int r0 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r13.A01
            X.0sP r2 = (X.0sP) r2
            r1 = 0
            r2.invoke(r1)
            r1 = 1591113492(0x5ed67714, float:7.7269213E18)
            goto L_0x0781
        L_0x0256:
            r0 = -1691334035(0xffffffff9b304a6d, float:-1.4582427E-22)
            int r0 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r14.A00()
            if (r1 == 0) goto L_0x027a
            X.1XT r1 = (X.AnonymousClass1XT) r1
            java.lang.String r4 = r1.getErrorMessage()
        L_0x0269:
            java.lang.Object r1 = r13.A01
            android.content.Context r3 = X.DbT.A07(r1)
            java.lang.String r2 = "save_birthday_failed"
            r1 = 1
            X.C59689JTv.A03(r3, r4, r2, r1)
            r1 = 990735686(0x3b0d6d46, float:0.0021580025)
            goto L_0x0781
        L_0x027a:
            java.lang.Object r1 = r13.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            android.content.res.Resources r2 = X.DbV.A05(r1)
            r1 = 2131972232(0x7f135088, float:1.9581466E38)
            java.lang.String r4 = r2.getString(r1)
            goto L_0x0269
        L_0x028a:
            r0 = 1572685862(0x5dbd4826, float:1.70489916E18)
            int r1 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r3 = r13.A01
            com.instagram.profile.edit.fragment.CompleteYourProfileFragment r3 = (com.instagram.profile.edit.fragment.CompleteYourProfileFragment) r3
            android.content.Context r2 = r3.getContext()
            if (r2 == 0) goto L_0x02a4
            r0 = 3518(0xdbe, float:4.93E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.C59689JTv.A0B(r2, r0)
        L_0x02a4:
            java.lang.Throwable r0 = r14.A01()
            if (r0 != 0) goto L_0x02c5
            r7 = 0
        L_0x02ab:
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r3.A01
            if (r0 == 0) goto L_0x02c0
            java.lang.String r4 = "profile_completion"
            r6 = 0
            java.lang.String r5 = r3.A06
            X.Xtl r3 = new X.Xtl
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r0.Ci6(r3)
        L_0x02c0:
            r0 = 33686361(0x2020359, float:9.551852E-38)
            goto L_0x0750
        L_0x02c5:
            java.lang.String r7 = r0.getMessage()
            goto L_0x02ab
        L_0x02ca:
            r0 = -316502390(0xffffffffed228e8a, float:-3.1443057E27)
            int r0 = X.AnonymousClass7TG.A0D(r14, r0)
            X.EDV.super.onFail(r14)
            java.lang.Object r1 = r13.A01
            X.0rm r1 = (X.0rm) r1
            java.lang.Object r2 = r1.A00
            X.05G r2 = (X.05G) r2
            X.0sn r1 = X.0sn.A00
            r2.Epw(r1)
            r1 = -1533616021(0xffffffffa496e06b, float:-6.543231E-17)
            goto L_0x0781
        L_0x02e6:
            r0 = -1299644588(0xffffffffb288ff54, float:-1.5948594E-8)
            int r0 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r13.A02
            android.content.Context r1 = X.DbT.A07(r1)
            X.C59689JTv.A04(r1)
            r1 = -980720080(0xffffffffc58b6630, float:-4460.7734)
            goto L_0x0781
        L_0x02fb:
            r0 = -129314315(0xfffffffff84ad1f5, float:-1.6454725E34)
            int r0 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r13.A01
            X.1P0 r1 = (X.1P0) r1
            r1.onFail(r14)
            r1 = -259020103(0xfffffffff08faab9, float:-3.5570198E29)
            goto L_0x0781
        L_0x030e:
            r0 = 1847424193(0x6e1d74c1, float:1.2182573E28)
            int r0 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r13.A01
            X.FFu r1 = (X.C49941FFu) r1
            X.C49941FFu.A01(r1)
            r1 = 896822708(0x35746db4, float:9.105672E-7)
            goto L_0x0781
        L_0x0321:
            r0 = -840192071(0xffffffffcdebafb9, float:-4.9427024E8)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.EDV.super.onFail(r14)
            X.1Q0 r2 = X.1Q0.A12
            java.lang.Object r4 = r13.A01
            X.E57 r4 = (X.E57) r4
            com.instagram.common.session.UserSession r1 = r4.A01
            X.FGI r3 = r2.A02(r1)
            X.DiE r2 = X.C46634DiE.A16
            r1 = 0
            X.0xI r2 = r3.A05(r1, r2)
            com.instagram.common.session.UserSession r1 = r4.A01
            X.DbU.A1R(r2, r1)
            boolean r1 = r14 instanceof X.C268674do
            if (r1 == 0) goto L_0x0368
            X.1XT r1 = X.DbT.A0L(r14)
            if (r1 == 0) goto L_0x036d
            java.util.List r2 = r1.getErrorStrings()
            if (r2 == 0) goto L_0x036d
            java.lang.String r1 = "\n"
            java.lang.String r2 = X.0mp.A05(r1, r2)
        L_0x0359:
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 == 0) goto L_0x0363
            java.lang.String r2 = X.DbZ.A0j(r4)
        L_0x0363:
            com.instagram.registration.ui.NotificationBar r1 = r4.A02
            X.C49958FGq.A08(r1, r2)
        L_0x0368:
            r1 = 240132229(0xe502085, float:2.5653637E-30)
            goto L_0x0781
        L_0x036d:
            r2 = 0
            goto L_0x0359
        L_0x036f:
            r0 = 1390356015(0x52df262f, float:4.79209161E11)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r13.A02
            X.EvL r0 = (X.C49419EvL) r0
            X.E6R r4 = r0.A00
            X.E6R.A02(r4)
            X.E8v r2 = r4.A02
            if (r2 != 0) goto L_0x0387
            java.lang.String r6 = "adapter"
            goto L_0x05a3
        L_0x0387:
            r0 = 0
            java.util.ArrayList r1 = X.DbS.A0v(r0)
            r2.A07 = r0
            r0 = 1
            r2.A06 = r0
            java.util.List r0 = r2.A03
            r0.clear()
            java.util.List r0 = r2.A03
            r0.addAll(r1)
            X.C47583E8v.A00(r2)
            android.content.Context r1 = r4.requireContext()
            r0 = 2131962391(0x7f132a17, float:1.9561506E38)
            X.DbU.A0z(r1, r0)
            r0 = 558677449(0x214cbdc9, float:6.9369067E-19)
            goto L_0x07a5
        L_0x03ad:
            r0 = -1128957177(0xffffffffbcb57b07, float:-0.02215339)
            int r0 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r13.A02
            android.content.Context r2 = X.DbT.A08(r1)
            java.lang.String r1 = "follow_user_failed"
            X.C59689JTv.A0B(r2, r1)
            r1 = 1019364618(0x3cc2450a, float:0.023714561)
            goto L_0x0781
        L_0x03c4:
            r0 = -1713073020(0xffffffff99e49484, float:-2.3634632E-23)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.EDV.super.onFail(r14)
            r1 = -289690595(0xffffffffeebbac1d, float:-2.9040885E28)
            goto L_0x0781
        L_0x03d3:
            r0 = 776565619(0x2e497373, float:4.580465E-11)
            int r0 = X.AnonymousClass7TG.A0D(r14, r0)
            java.lang.Object r2 = r13.A01
            X.G73 r2 = (X.G73) r2
            java.lang.Object r1 = r14.A00()
            X.1XP r1 = (X.1XP) r1
            if (r1 == 0) goto L_0x03f2
            java.lang.String r1 = r1.getErrorMessage()
        L_0x03ea:
            r2.onFail(r1)
            r1 = 60884404(0x3a105b4, float:9.464039E-37)
            goto L_0x0781
        L_0x03f2:
            r1 = 0
            goto L_0x03ea
        L_0x03f4:
            r0 = 1717407239(0x665d8e07, float:2.6156573E23)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r2 = 0
            X.0qQ.A0B(r14, r2)
            X.EDV.super.onFail(r14)
            java.lang.Object r0 = r13.A02
            X.E6o r0 = (X.C47528E6o) r0
            X.E9N r1 = r0.A03
            java.lang.String r6 = "userListAdapter"
            r0 = 0
            if (r1 == 0) goto L_0x05a3
            r1.A0C = r2
            r1.A04 = r0
            r1.A0A = r2
            r0 = 1598996000(0x5f4ebe20, float:1.489738E19)
            goto L_0x07a5
        L_0x0418:
            r0 = 363045292(0x15a3a1ac, float:6.609025E-26)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r4 = r13.A02
            X.E6o r4 = (X.C47528E6o) r4
            X.E9N r3 = r4.A03
            java.lang.String r6 = "userListAdapter"
            r2 = 0
            if (r3 == 0) goto L_0x05a3
            r0 = 0
            r3.A0C = r0
            java.lang.Object r1 = r13.A01
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            X.Fmb r0 = new X.Fmb
            r0.<init>(r4, r1, r2)
            r3.A04 = r0
            r0 = 1
            r3.A0A = r0
            r3.A03()
            r0 = 175955244(0xa7cdd2c, float:1.21749565E-32)
            X.AnonymousClass0fD.A0A(r0, r5)
            return
        L_0x0445:
            r0 = -704499195(0xffffffffd6023205, float:-3.5787836E13)
            int r1 = X.AnonymousClass0fD.A03(r0)
            r2 = 0
            X.0qQ.A0B(r14, r2)
            X.EDV.super.onFail(r14)
            boolean r0 = r14 instanceof X.C268674do
            if (r0 == 0) goto L_0x04c8
            X.4do r14 = (X.C268674do) r14
            java.lang.Object r3 = r14.A00
            X.1XP r3 = (X.1XP) r3
            if (r3 == 0) goto L_0x04c8
            java.lang.String r0 = r3.getErrorMessage()
            if (r0 == 0) goto L_0x04c8
            int r0 = r0.length()
            if (r0 == 0) goto L_0x04c8
            java.lang.String r8 = r3.getErrorMessage()
            if (r8 != 0) goto L_0x0473
            java.lang.String r8 = ""
        L_0x0473:
            java.lang.Object r3 = r13.A02
            X.E4w r3 = (X.C47492E4w) r3
            com.instagram.business.ui.BusinessInfoSectionView r0 = r3.A03
            java.lang.String r0 = r0.getNationalNumber()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x04d4
            X.EEJ r0 = r3.A04
            if (r0 == 0) goto L_0x048a
            r0.A00()
        L_0x048a:
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r3.A01
            if (r0 == 0) goto L_0x04be
            java.util.HashMap r11 = X.AnonymousClass7TE.A1E()
            com.instagram.business.ui.BusinessInfoSectionView r0 = r3.A03
            com.instagram.model.business.PublicPhoneContact r0 = r0.getSubmitPublicPhoneContact()
            if (r0 == 0) goto L_0x04ab
            java.lang.String r6 = r0.A03
            if (r6 == 0) goto L_0x04ab
            r5 = 9
            r4 = 12
            r0 = 49
            java.lang.String r0 = X.C46476Dff.A02(r5, r4, r0)
            r11.put(r0, r6)
        L_0x04ab:
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r3.A01
            java.lang.String r5 = "edit_contact_info"
            r9 = 0
            java.lang.String r6 = r3.A08
            java.lang.String r7 = "phone_validation"
            X.Xtl r4 = new X.Xtl
            r10 = r9
            r12 = r9
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r0.Ci6(r4)
        L_0x04be:
            com.instagram.business.ui.BusinessInfoSectionView r0 = r3.A03
            android.widget.TextView r0 = r0.A04
            if (r0 != 0) goto L_0x04df
            java.lang.String r6 = "phoneInlineErrorMessage"
            goto L_0x05a3
        L_0x04c8:
            java.lang.Object r3 = r13.A01
            android.content.Context r3 = (android.content.Context) r3
            r0 = 2131961757(0x7f13279d, float:1.956022E38)
            java.lang.String r8 = X.AnonymousClass7TE.A16(r3, r0)
            goto L_0x0473
        L_0x04d4:
            android.os.Handler r2 = r3.A0E
            X.Fpm r0 = new X.Fpm
            r0.<init>(r3)
            r2.post(r0)
            goto L_0x04e2
        L_0x04df:
            r0.setVisibility(r2)
        L_0x04e2:
            r0 = -1488571852(0xffffffffa7463234, float:-2.7505235E-15)
            goto L_0x0750
        L_0x04e7:
            r0 = -1763852204(0xffffffff96ddc054, float:-3.5825852E-25)
            int r0 = X.AnonymousClass7TG.A0D(r14, r0)
            java.lang.Object r2 = r13.A02
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r2 = (com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger) r2
            if (r2 == 0) goto L_0x051c
            java.lang.String r4 = "opt_in_promotional_email"
            r5 = 0
            r8 = 0
            r7 = 0
            java.lang.String r6 = "promotional_email_setting"
            boolean r1 = r14 instanceof X.C268674do
            if (r1 == 0) goto L_0x0511
            X.4do r14 = (X.C268674do) r14
            java.lang.Object r1 = r14.A00
            X.1XT r1 = (X.AnonymousClass1XT) r1
            if (r1 == 0) goto L_0x050b
            java.lang.String r7 = r1.getErrorMessage()
        L_0x050b:
            if (r1 == 0) goto L_0x0511
            java.lang.String r8 = r1.getErrorType()
        L_0x0511:
            X.Xtl r3 = new X.Xtl
            r9 = r5
            r10 = r5
            r11 = r5
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r2.Ci6(r3)
        L_0x051c:
            java.lang.Object r1 = r13.A01
            X.Eyq r1 = (X.C49581Eyq) r1
            com.instagram.business.fragment.AccountTypeSelectionV2Fragment r2 = r1.A03
            X.6qr r1 = r1.A01
            com.instagram.business.fragment.AccountTypeSelectionV2Fragment.A00(r1, r2)
            r1 = -573904649(0xffffffffddcae8f7, float:-1.82765097E18)
            goto L_0x0781
        L_0x052c:
            r0 = 662320593(0x277a35d1, float:3.4723643E-15)
            int r0 = X.AnonymousClass7TG.A0D(r14, r0)
            java.lang.Object r2 = r13.A02
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r2 = (com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger) r2
            if (r2 == 0) goto L_0x055f
            java.lang.String r4 = "opt_in_promotional_email"
            r5 = 0
            r8 = 0
            r7 = 0
            java.lang.String r6 = "user_email"
            boolean r1 = r14 instanceof X.C268674do
            if (r1 == 0) goto L_0x0554
            X.4do r14 = (X.C268674do) r14
            java.lang.Object r1 = r14.A00
            X.1XP r1 = (X.1XP) r1
            if (r1 == 0) goto L_0x0550
            java.lang.String r7 = r1.getErrorMessage()
        L_0x0550:
            if (r1 == 0) goto L_0x0554
            java.lang.String r8 = r1.mErrorType
        L_0x0554:
            X.Xtl r3 = new X.Xtl
            r9 = r5
            r10 = r5
            r11 = r5
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r2.Ci6(r3)
        L_0x055f:
            java.lang.Object r1 = r13.A01
            X.Evv r1 = (X.C49454Evv) r1
            com.instagram.business.fragment.AccountTypeSelectionV2Fragment r2 = r1.A01
            X.6qr r1 = r1.A00
            com.instagram.business.fragment.AccountTypeSelectionV2Fragment.A00(r1, r2)
            r1 = -2044009265(0xffffffff862ae4cf, float:-3.2141548E-35)
            goto L_0x0781
        L_0x056f:
            r0 = 22114152(0x1516f68, float:3.8467167E-38)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r3 = 0
            X.0qQ.A0B(r14, r3)
            boolean r1 = r14 instanceof X.C268674do
            if (r1 == 0) goto L_0x0597
            X.4do r14 = (X.C268674do) r14
            java.lang.Object r2 = r14.A00
            if (r2 == 0) goto L_0x0597
            X.1XP r2 = (X.1XP) r2
            if (r2 == 0) goto L_0x0597
            java.lang.String r1 = r2.getErrorMessage()
            if (r1 == 0) goto L_0x0597
            int r1 = r1.length()
            if (r1 == 0) goto L_0x0597
            r2.getErrorMessage()
        L_0x0597:
            java.lang.Object r4 = r13.A01
            X.ExO r4 = (X.ExO) r4
            com.instagram.business.fragment.ProfileDisplayOptionsFragment r2 = r4.A00
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r2.A02
            if (r1 != 0) goto L_0x05ab
            java.lang.String r6 = "logger"
        L_0x05a3:
            X.0qQ.A0F(r6)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x05ab:
            java.lang.String r5 = "profile_display_options"
            r8 = 0
            java.lang.String r6 = r2.A07
            if (r6 != 0) goto L_0x05b5
            java.lang.String r6 = "entryPoint"
            goto L_0x05a3
        L_0x05b5:
            java.lang.String r7 = "save_info"
            java.util.Map r10 = r4.A01
            java.util.Map r11 = r4.A02
            X.Xtl r4 = new X.Xtl
            r9 = r8
            r12 = r8
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r1.Ckh(r4)
            X.2dY r1 = X.2dZ.A0t
            X.DbY.A17(r2, r1, r3)
            android.content.Context r2 = r2.getContext()
            r1 = 2131961756(0x7f13279c, float:1.9560218E38)
            X.C59689JTv.A01(r2, r8, r1, r3)
            r1 = -635829112(0xffffffffda1a0488, float:-1.08380321E16)
            goto L_0x0781
        L_0x05d9:
            r0 = -62517488(0xfffffffffc460f10, float:-4.113521E36)
            int r0 = X.AnonymousClass7TG.A0D(r14, r0)
            java.lang.Object r2 = r13.A01
            android.content.Context r2 = (android.content.Context) r2
            r1 = 2131972232(0x7f135088, float:1.9581466E38)
            java.lang.String r1 = r2.getString(r1)
            java.lang.String r4 = X.C319126q5.A03(r14, r1)
            X.0qQ.A07(r4)
            java.lang.Object r2 = r13.A02
            X.FA3 r2 = (X.FA3) r2
            android.util.LruCache r1 = X.FA3.A01
            com.instagram.business.fragment.CategorySearchFragment r3 = r2.A00
            r1 = 1
            r3.A0E = r1
            android.view.View r2 = r3.A01
            X.0qQ.A0A(r2)
            r1 = 8
            r2.setVisibility(r1)
            boolean r1 = r3.A0g()
            if (r1 == 0) goto L_0x0614
            android.content.Context r1 = r3.getContext()
            X.C59689JTv.A09(r1, r4)
        L_0x0614:
            com.instagram.business.fragment.CategorySearchFragment.A07(r3)
            r2 = 0
            java.lang.String r1 = "suggested_category"
            com.instagram.business.fragment.CategorySearchFragment.A0A(r3, r1, r4, r2, r2)
            r1 = -61297497(0xfffffffffc58aca7, float:-4.5001517E36)
            goto L_0x0781
        L_0x0622:
            r0 = 728471744(0x2b6b98c0, float:8.3700755E-13)
            int r1 = X.AnonymousClass0fD.A03(r0)
            X.EDV.super.onFail(r14)
            java.lang.String r11 = X.Dbb.A0b(r14)
            java.lang.Object r10 = r13.A01
            com.instagram.business.fragment.SupportProfileDisplayOptionsFragment r10 = (com.instagram.business.fragment.SupportProfileDisplayOptionsFragment) r10
            X.4os r2 = r10.A01
            java.lang.String r0 = "Initial Partner should not be null if remove button is shown"
            X.17k.A07(r2, r0)
            X.FFo r9 = r10.A03
            java.lang.String r8 = r2.AmM()
            java.lang.String r7 = r2.Ac5()
            java.lang.String r6 = r2.Bao()
            java.lang.String r5 = r2.getUrl()
            java.lang.String r4 = r2.Ain()
            r3 = 1
            X.AnonymousClass7TG.A1U(r7, r6, r5)
            X.0Aj r2 = X.C49935FFo.A00(r9)
            java.lang.String r0 = "remove_action_button"
            X.DbS.A1H(r2, r0)
            java.lang.String r0 = "error"
            X.DbS.A1J(r2, r0)
            X.C49935FFo.A01(r2, r9, r8, r7, r3)
            X.Dba.A1A(r2, r6, r5)
            java.lang.String r0 = "error_message"
            r2.AAJ(r0, r11)
            java.lang.String r0 = "button_label"
            r2.AAJ(r0, r4)
            r2.Cgf()
            android.content.Context r0 = r10.requireContext()
            X.C59689JTv.A05(r0)
            r0 = 667628569(0x27cb3419, float:5.6400303E-15)
            goto L_0x0750
        L_0x0682:
            r0 = -471534680(0xffffffffe3e4f3a8, float:-8.44683E21)
            int r1 = X.AnonymousClass0fD.A03(r0)
            X.EDV.super.onFail(r14)
            java.lang.String r11 = X.Dbb.A0b(r14)
            java.lang.Object r10 = r13.A01
            com.instagram.business.fragment.SupportProfileDisplayOptionsFragment r10 = (com.instagram.business.fragment.SupportProfileDisplayOptionsFragment) r10
            X.E9E r0 = r10.A02
            X.4os r2 = r0.A00
            java.lang.String r0 = "Selected Partner should not be null if save enabled"
            X.17k.A07(r2, r0)
            X.FFo r9 = r10.A03
            java.lang.String r8 = r2.AmM()
            java.lang.String r7 = r2.Ac5()
            java.lang.String r6 = r2.Bao()
            java.lang.String r5 = r2.getUrl()
            java.lang.String r4 = r2.Ain()
            r3 = 1
            X.DbZ.A0t(r3, r7, r6, r5)
            X.0Aj r2 = X.C49935FFo.A00(r9)
            java.lang.String r0 = "update_action_button"
            X.DbS.A1H(r2, r0)
            java.lang.String r0 = "error"
            X.DbS.A1J(r2, r0)
            X.C49935FFo.A01(r2, r9, r8, r7, r3)
            X.Dba.A1A(r2, r6, r5)
            java.lang.String r0 = "error_message"
            r2.AAJ(r0, r11)
            java.lang.String r0 = "button_label"
            r2.AAJ(r0, r4)
            r2.Cgf()
            android.content.Context r0 = r10.requireContext()
            X.C59689JTv.A05(r0)
            r0 = 2102991504(0x7d591a90, float:1.8036275E37)
            goto L_0x0750
        L_0x06e3:
            r0 = -2042666660(0xffffffff863f615c, float:-3.5994636E-35)
            int r0 = X.AnonymousClass7TG.A0D(r14, r0)
            X.EDV.super.onFail(r14)
            r1 = 1672949321(0x63b72e49, float:6.758179E21)
            goto L_0x0781
        L_0x06f2:
            r0 = 899152166(0x3597f926, float:1.1322888E-6)
            int r1 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r5 = r13.A01
            X.E4j r5 = (X.E4j) r5
            android.content.Context r4 = r5.requireContext()
            java.lang.Object r2 = r14.A00()
            if (r2 == 0) goto L_0x0754
            X.1XT r2 = (X.AnonymousClass1XT) r2
            java.lang.String r0 = r2.getErrorMessage()
            if (r0 == 0) goto L_0x0754
            java.lang.String r3 = r2.getErrorMessage()
            java.lang.String r0 = r2.getErrorTitle()
            X.8ab r2 = X.DbS.A0Y(r4)
            if (r0 == 0) goto L_0x071f
            r2.A05 = r0
        L_0x071f:
            r2.A0q(r3)
            r2.A06()
            r0 = 1
            X.AnonymousClass7TH.A0a(r2, r0)
        L_0x0729:
            X.E8o r4 = r5.A00
            java.lang.Object r3 = r13.A02
            X.Evm r3 = (X.C49445Evm) r3
            com.instagram.user.model.User r0 = r3.A01
            java.lang.String r2 = r0.getId()
            boolean r0 = r3.A00
            r0 = r0 ^ 1
            r4.A0C(r2, r0)
            java.lang.String r0 = "ig_manage_main_account_failure"
            X.0xI r2 = X.0xI.A00(r5, r0)
            X.E4j.A02(r5, r2)
            X.E4j.A03(r5, r2)
            com.instagram.common.session.UserSession r0 = r5.A04
            X.C48310EcT.A00(r2, r0)
            r0 = -1255942072(0xffffffffb523d848, float:-6.103696E-7)
        L_0x0750:
            X.AnonymousClass0fD.A0A(r0, r1)
            return
        L_0x0754:
            r0 = 0
            X.F44.A00(r4, r0)
            goto L_0x0729
        L_0x0759:
            r0 = 1593894211(0x5f00e543, float:9.287903E18)
            int r0 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r13.A01
            X.4mT r2 = (X.C273374mT) r2
            r2.getSession()
            java.lang.Object r1 = r13.A02
            java.lang.String r1 = X.DbS.A0q(r1)
            java.lang.Long.parseLong(r1)
            android.content.Context r1 = r2.getContext()
            if (r1 == 0) goto L_0x077e
            android.content.Context r2 = r2.getContext()
            r1 = 0
            X.F44.A00(r2, r1)
        L_0x077e:
            r1 = -104939136(0xfffffffff9bec180, float:-1.2380763E35)
        L_0x0781:
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        L_0x0785:
            r0 = -1328099569(0xffffffffb0d6cf0f, float:-1.5629399E-9)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = -203053261(0xfffffffff3e5a733, float:-3.638999E31)
            goto L_0x07a5
        L_0x0790:
            r0 = -1509006011(0xffffffffa60e6545, float:-4.940339E-16)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = 626820802(0x255c86c2, float:1.9127616E-16)
            goto L_0x07a5
        L_0x079b:
            r0 = -2073110069(0xffffffff846ed9cb, float:-2.8076771E-36)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = 1094855352(0x41422ab8, float:12.135429)
        L_0x07a5:
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EDV.onFail(X.4dm):void");
    }

    public final void onFinish() {
        int i;
        int i2;
        switch (this.A00) {
            case 1:
                i = AnonymousClass0fD.A03(1105283699);
                E4j e4j = (E4j) this.A01;
                e4j.A06 = false;
                Dbb.A17(e4j, false);
                2da r1 = e4j.A02;
                if (r1 != null) {
                    r1.EVS(true);
                }
                i2 = 1651426000;
                break;
            case 4:
                i = AnonymousClass0fD.A03(117712200);
                DbS.A1V(this.A02);
                i2 = -919935599;
                break;
            case 5:
                i = AnonymousClass0fD.A03(1908241678);
                DbS.A1V(this.A02);
                i2 = 501963670;
                break;
            case 7:
                i = AnonymousClass0fD.A03(164106423);
                i2 = -1005608004;
                break;
            case 10:
                i = AnonymousClass0fD.A03(133033684);
                EDV.super.onFinish();
                i2 = -183389944;
                break;
            case 11:
                i = AnonymousClass0fD.A03(-845146393);
                i2 = 622523551;
                break;
            case 14:
                i = AnonymousClass0fD.A03(81149194);
                EDV.super.onFinish();
                ((GV5) this.A01).A06.removeAll((LinkedHashSet) this.A02);
                i2 = 1898822116;
                break;
            case 20:
                i = AnonymousClass0fD.A03(-1184075735);
                EDV.super.onFinish();
                ((E57) this.A01).A03.A00();
                i2 = 766049046;
                break;
            case 23:
                i = AnonymousClass0fD.A03(-1383872657);
                ((1P0) this.A01).onFinish();
                i2 = 278165428;
                break;
            case 26:
                i = AnonymousClass0fD.A03(-1399173952);
                DbS.A1V(this.A02);
                i2 = -1453414987;
                break;
            case 27:
                i = AnonymousClass0fD.A03(1116759005);
                ((2da) this.A02).EVS(true);
                Dbb.A0x((Fragment) this.A01);
                i2 = 913631927;
                break;
            case Seq.RefTracker.REF_OFFSET:
                i = AnonymousClass0fD.A03(932486096);
                ((1P0) this.A01).onFinish();
                i2 = 1403887905;
                break;
            default:
                EDV.super.onFinish();
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final void onStart() {
        int i;
        int i2;
        switch (this.A00) {
            case 4:
                i = AnonymousClass0fD.A03(-1233137395);
                AnonymousClass0fN.A00((Dialog) this.A02);
                i2 = -1168860435;
                break;
            case 5:
                i = AnonymousClass0fD.A03(1324329315);
                AnonymousClass0fN.A00((Dialog) this.A02);
                i2 = -1476344982;
                break;
            case 7:
                i = AnonymousClass0fD.A03(118895285);
                FragmentActivity activity = ((ExO) this.A01).A00.getActivity();
                if (activity != null) {
                    Dba.A0n(activity, 2dZ.A0t);
                }
                i2 = -1947437854;
                break;
            case 10:
                i = AnonymousClass0fD.A03(-502792791);
                EDV.super.onStart();
                EEJ eej = ((C47492E4w) this.A02).A04;
                if (eej != null) {
                    eej.A01();
                }
                i2 = 1539232073;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                i = AnonymousClass0fD.A03(341093668);
                E9N e9n = ((C47528E6o) this.A02).A03;
                if (e9n != null) {
                    e9n.A0C = true;
                    e9n.A03();
                    i2 = -1392189273;
                    break;
                } else {
                    0qQ.A0F("userListAdapter");
                    throw AnonymousClass00P.createAndThrow();
                }
            case 20:
                i = AnonymousClass0fD.A03(-343369802);
                EDV.super.onStart();
                ((E57) this.A01).A03.A01();
                i2 = -1213781165;
                break;
            case 23:
                i = AnonymousClass0fD.A03(-298189317);
                ((1P0) this.A01).onStart();
                i2 = -821933443;
                break;
            case 26:
                i = AnonymousClass0fD.A03(1001602252);
                AnonymousClass0fN.A00((Dialog) this.A02);
                i2 = 764052155;
                break;
            case 27:
                i = AnonymousClass0fD.A03(-144558941);
                ((2da) this.A02).EVS(false);
                Dbb.A0y((Fragment) this.A01);
                i2 = -423586167;
                break;
            case Seq.RefTracker.REF_OFFSET:
                i = AnonymousClass0fD.A03(-1858269585);
                ((1P0) this.A01).onStart();
                i2 = 2081121777;
                break;
            default:
                EDV.super.onStart();
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    /* JADX WARNING: type inference failed for: r0v262, types: [X.1xE, java.lang.Object, X.FVf] */
    /* JADX WARNING: type inference failed for: r3v123, types: [X.6Ye, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x05a7, code lost:
        if (r1.getConstructor(new java.lang.Class[]{r11}).newInstance(new java.lang.Object[]{r2}) != null) goto L_0x05a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0076, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x05fb, code lost:
        if (((X.AnonymousClass3FZ) r11).A06(X.AnonymousClass000.A00(3111)) == false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0630, code lost:
        if (r11.A00(r10, r9).A00(r5, r2).A06("is_connected") != false) goto L_0x0632;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007d, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0733, code lost:
        if (r12.A00(r11, "me").A00(r2, r1).A06("payments_disabled") != false) goto L_0x0735;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x08d2, code lost:
        X.AnonymousClass0fD.A0A(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x08d5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0149, code lost:
        r0 = "followListAdapter";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x0d1c, code lost:
        X.AnonymousClass0fD.A0A(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x0d1f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x0e32, code lost:
        X.AnonymousClass0fD.A0A(r0, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x0e35, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x0f4a, code lost:
        if (r4.A00(r3, "gen_ig_user_risk_appeal_case").A05("job_id") != null) goto L_0x0f4c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01e0, code lost:
        r0 = "adapter";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:622:0x168c, code lost:
        X.AnonymousClass0fD.A0A(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:623:0x168f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x035e, code lost:
        X.0qQ.A0F(r12);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r42) {
        /*
            r41 = this;
            r1 = r41
            r0 = r42
            int r2 = r1.A00
            switch(r2) {
                case 0: goto L_0x15f6;
                case 1: goto L_0x15bf;
                case 2: goto L_0x159d;
                case 3: goto L_0x1553;
                case 4: goto L_0x01fc;
                case 5: goto L_0x14d6;
                case 6: goto L_0x0d78;
                case 7: goto L_0x02d8;
                case 8: goto L_0x0d26;
                case 9: goto L_0x0c78;
                case 10: goto L_0x1480;
                case 11: goto L_0x01e4;
                case 12: goto L_0x0288;
                case 13: goto L_0x021d;
                case 14: goto L_0x1446;
                case 15: goto L_0x13fc;
                case 16: goto L_0x139a;
                case 17: goto L_0x135c;
                case 18: goto L_0x0195;
                case 19: goto L_0x014d;
                case 20: goto L_0x12f1;
                case 21: goto L_0x12c8;
                case 22: goto L_0x0bde;
                case 23: goto L_0x1252;
                case 24: goto L_0x0b7c;
                case 25: goto L_0x11fd;
                case 26: goto L_0x11c1;
                case 27: goto L_0x11a1;
                case 28: goto L_0x112e;
                case 29: goto L_0x10f7;
                case 30: goto L_0x10c3;
                case 31: goto L_0x08d9;
                case 32: goto L_0x0fb3;
                case 33: goto L_0x0859;
                case 34: goto L_0x07ed;
                case 35: goto L_0x0785;
                case 36: goto L_0x0f62;
                case 37: goto L_0x06e2;
                case 38: goto L_0x068e;
                case 39: goto L_0x05d8;
                case 40: goto L_0x04d8;
                case 41: goto L_0x0f0f;
                case 42: goto L_0x0ecb;
                case 43: goto L_0x0400;
                case 44: goto L_0x039e;
                case 45: goto L_0x0363;
                case 46: goto L_0x00d1;
                case 47: goto L_0x007e;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = 1220856031(0x48c4c8df, float:403014.97)
            int r2 = X.AnonymousClass0fD.A03(r0)
            r0 = -1169868188(0xffffffffba453a64, float:-7.5236545E-4)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r7 = r1.A02
            X.Der r7 = (X.C46430Der) r7
            android.content.Context r3 = r7.getContext()
            r0 = 2131972137(0x7f135029, float:1.9581273E38)
            X.C59689JTv.A07(r3, r0)
            X.Dex r0 = r7.A0E
            if (r0 == 0) goto L_0x0149
            java.lang.Object r1 = r1.A01
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            r0.A0D(r1)
            androidx.fragment.app.FragmentActivity r6 = r7.getActivity()
            if (r6 == 0) goto L_0x004f
            X.1Wj r0 = X.1Wj.A00
            if (r0 == 0) goto L_0x004f
            X.1Wj r4 = X.DcL.A00()
            com.instagram.common.session.UserSession r3 = X.C46430Der.A03(r7)
            java.lang.String r0 = r1.getId()
            java.util.HashMap r1 = X.C70342O2u.A00(r0)
            java.lang.String r0 = "613991770939959"
            r4.A00(r6, r3, r0, r1)
        L_0x004f:
            java.lang.String r1 = r7.A0M
            java.lang.String r0 = "potential_spam"
            boolean r0 = X.0qQ.A0K(r1, r0)
            r6 = 1
            if (r0 == 0) goto L_0x006c
            int r0 = r7.A00
            int r0 = r0 + -1
            r7.A00 = r0
            X.Dex r1 = r7.A0E
            if (r1 == 0) goto L_0x0149
            r1.A00 = r0
            r0 = 0
            r1.A0G(r0, r0)
            r7.A0d = r6
        L_0x006c:
            com.instagram.common.session.UserSession r1 = X.C46430Der.A03(r7)
            com.instagram.user.recommended.FollowListData r0 = r7.A0D
            if (r0 != 0) goto L_0x1658
            java.lang.String r0 = "followListData"
        L_0x0076:
            X.0qQ.A0F(r0)
        L_0x0079:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x007e:
            r0 = 27981655(0x1aaf757, float:6.280305E-38)
            int r2 = X.AnonymousClass0fD.A03(r0)
            r0 = -1572578409(0xffffffffa2445b97, float:-2.661144E-18)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r4 = r1.A02
            X.Der r4 = (X.C46430Der) r4
            int r0 = r4.A00
            int r0 = r0 + -1
            r4.A00 = r0
            X.Dex r3 = r4.A0E
            if (r3 == 0) goto L_0x0149
            r3.A00 = r0
            r0 = 0
            r3.A0G(r0, r0)
            X.Dex r3 = r4.A0E
            if (r3 == 0) goto L_0x0149
            java.lang.Object r0 = r1.A01
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r3.A0D(r0)
            X.6ap r3 = X.DbV.A0W()
            java.lang.String r0 = "mark_not_spam_success"
            r3.A0H = r0
            android.content.res.Resources r1 = X.DbV.A05(r4)
            r0 = 2131965868(0x7f1337ac, float:1.9568558E38)
            X.DbT.A1D(r1, r3, r0)
            r3.A06()
            X.DbY.A1N(r3)
            r0 = 1
            r4.A0d = r0
            r0 = 1080877830(0x406ce306, float:3.7013564)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 205759808(0xc43a540, float:1.5071982E-31)
            goto L_0x168c
        L_0x00d1:
            r0 = -816132728(0xffffffffcf5acd88, float:-3.67090278E9)
            int r2 = X.AnonymousClass0fD.A03(r0)
            r0 = 1475644453(0x57f48c25, float:5.37765507E14)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r1.A01
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r8 = r0.iterator()
        L_0x00e7:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0132
            java.lang.String r5 = X.AnonymousClass7TE.A18(r8)
            java.lang.Object r3 = r1.A02
            X.Der r3 = (X.C46430Der) r3
            X.0eM r0 = r3.A0u
            java.lang.Object r0 = r0.getValue()
            X.17i r0 = (X.17i) r0
            com.instagram.user.model.User r7 = r0.A02(r5)
            if (r7 == 0) goto L_0x00e7
            com.instagram.common.session.UserSession r0 = X.C46430Der.A03(r3)
            X.5mt r6 = X.C294695ms.A00(r0)
            r5 = 0
            com.instagram.common.session.UserSession r0 = r6.A02
            com.instagram.user.model.FollowStatus r0 = X.DbV.A0i(r0, r7)
            int r3 = r0.ordinal()
            r0 = 3
            if (r3 != r0) goto L_0x00e7
            java.lang.Integer r3 = r7.A0N()
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r3 == r0) goto L_0x012f
            java.lang.Integer r3 = r7.A0N()
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r3 == r0) goto L_0x012f
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A05
        L_0x012b:
            r6.A0D(r0, r7, r5)
            goto L_0x00e7
        L_0x012f:
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A07
            goto L_0x012b
        L_0x0132:
            java.lang.Object r0 = r1.A02
            X.Der r0 = (X.C46430Der) r0
            X.Dex r1 = r0.A0E
            if (r1 == 0) goto L_0x0149
            r0 = 0
            r1.A0G(r0, r0)
            r0 = -2021597689(0xffffffff8780de07, float:-1.9389795E-34)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 1969800160(0x7568c3e0, float:2.9506487E32)
            goto L_0x168c
        L_0x0149:
            java.lang.String r0 = "followListAdapter"
            goto L_0x0076
        L_0x014d:
            r2 = -1631122158(0xffffffff9ec70d12, float:-2.107535E-20)
            int r2 = X.AnonymousClass0fD.A03(r2)
            com.instagram.model.hashtag.response.HashtagCollection r0 = (com.instagram.model.hashtag.response.HashtagCollection) r0
            r3 = 1989962985(0x769c6ce9, float:1.5863423E33)
            int r5 = X.AnonymousClass0fD.A03(r3)
            java.lang.Object r3 = r1.A02
            X.EvN r3 = (X.C49421EvN) r3
            r4 = 0
            X.0qQ.A0B(r0, r4)
            java.util.List r0 = r0.A00
            if (r0 != 0) goto L_0x0190
            java.util.ArrayList r1 = X.DbS.A0v(r4)
        L_0x016d:
            X.E6R r0 = r3.A00
            X.E8v r3 = r0.A02
            if (r3 == 0) goto L_0x01e0
            r3.A07 = r4
            r0 = 1
            r3.A06 = r0
            java.util.List r0 = r3.A04
            r0.clear()
            java.util.List r0 = r3.A04
            r0.addAll(r1)
            X.C47583E8v.A00(r3)
            r0 = 1880965835(0x701d42cb, float:1.9467958E29)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -1136560516(0xffffffffbc41767c, float:-0.011808034)
            goto L_0x168c
        L_0x0190:
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1D(r0)
            goto L_0x016d
        L_0x0195:
            r2 = -2061316521(0xffffffff8522ce57, float:-7.655102E-36)
            int r2 = X.AnonymousClass0fD.A03(r2)
            com.instagram.model.hashtag.response.HashtagCollection r0 = (com.instagram.model.hashtag.response.HashtagCollection) r0
            r3 = -268074344(0xfffffffff0058298, float:-1.6527754E29)
            int r5 = X.AnonymousClass0fD.A03(r3)
            java.lang.Object r1 = r1.A02
            X.EvL r1 = (X.C49419EvL) r1
            r4 = 0
            X.0qQ.A0B(r0, r4)
            X.E6R r3 = r1.A00
            X.E6R.A02(r3)
            java.util.List r0 = r0.A00
            if (r0 != 0) goto L_0x01db
            java.util.ArrayList r1 = X.DbS.A0v(r4)
        L_0x01ba:
            X.E8v r3 = r3.A02
            if (r3 == 0) goto L_0x01e0
            r3.A07 = r4
            r0 = 1
            r3.A06 = r0
            java.util.List r0 = r3.A03
            r0.clear()
            java.util.List r0 = r3.A03
            r0.addAll(r1)
            X.C47583E8v.A00(r3)
            r0 = 954728666(0x38e800da, float:1.1062781E-4)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 144177516(0x897f96c, float:9.146621E-34)
            goto L_0x168c
        L_0x01db:
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1D(r0)
            goto L_0x01ba
        L_0x01e0:
            java.lang.String r0 = "adapter"
            goto L_0x0076
        L_0x01e4:
            r2 = -1161000976(0xffffffffbacc87f0, float:-0.0015604477)
            int r7 = X.AnonymousClass0fD.A03(r2)
            X.DuM r0 = (X.C47293DuM) r0
            r2 = -659813085(0xffffffffd8ac0d23, float:-1.51337937E15)
            int r6 = X.AnonymousClass0fD.A03(r2)
            X.Dr2 r0 = r0.A00
            if (r0 != 0) goto L_0x0e36
            java.lang.String r0 = "response"
            goto L_0x0076
        L_0x01fc:
            r2 = -2006053465(0xffffffff886e0da7, float:-7.163657E-34)
            X.AnonymousClass0fD.A03(r2)
            X.DwN r0 = (X.DwN) r0
            r2 = -854787040(0xffffffffcd0cfc20, float:-1.47833344E8)
            X.AnonymousClass0fD.A03(r2)
            X.EDV.super.onSuccess(r0)
            java.lang.Object r1 = r1.A01
            com.instagram.business.fragment.SupportProfileDisplayOptionsFragment r1 = (com.instagram.business.fragment.SupportProfileDisplayOptionsFragment) r1
            com.instagram.common.session.UserSession r2 = r1.A04
            X.0eE r1 = X.AnonymousClass0t1.A01
            r1.A01(r2)
            r0.A00()
            goto L_0x0079
        L_0x021d:
            r2 = -563905587(0xffffffffde637bcd, float:-4.09798017E18)
            int r2 = X.AnonymousClass0fD.A03(r2)
            r3 = -1660613815(0xffffffff9d050b49, float:-1.7608238E-21)
            int r7 = X.AnonymousClass0fD.A03(r3)
            r3 = 0
            X.0qQ.A0B(r0, r3)
            X.EDV.super.onSuccess(r0)
            java.lang.Object r10 = r1.A02
            X.E6o r10 = (X.C47528E6o) r10
            X.E9N r0 = r10.A03
            java.lang.String r12 = "userListAdapter"
            if (r0 == 0) goto L_0x035e
            r0.A0C = r3
            java.lang.Object r9 = r1.A01
            java.util.List r9 = (java.util.List) r9
            java.util.Iterator r11 = r9.iterator()
        L_0x0246:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0276
            com.instagram.user.model.User r8 = X.DbT.A0k(r11)
            X.4Cl r0 = r8.A03
            java.lang.Integer r6 = r0.B6v()
            if (r6 == 0) goto L_0x0246
            int r5 = r6.intValue()
            android.content.res.Resources r4 = X.DbV.A05(r10)
            r3 = 2131820722(0x7f1100b2, float:1.9274167E38)
            r1 = 1
            android.content.res.Resources r0 = X.DbV.A05(r10)
            java.lang.String r0 = X.C14066TpE.A01(r0, r6, r1)
            java.lang.String r1 = X.DbV.A0v(r4, r0, r3, r5)
            X.4Cl r0 = r8.A03
            r0.Ela(r1)
            goto L_0x0246
        L_0x0276:
            X.E9N r0 = r10.A03
            if (r0 == 0) goto L_0x035e
            r0.A05(r9)
            r0 = 755732619(0x2d0b908b, float:7.93333E-12)
            X.AnonymousClass0fD.A0A(r0, r7)
            r0 = 384980124(0x16f2549c, float:3.9150605E-25)
            goto L_0x168c
        L_0x0288:
            r2 = -740938601(0xffffffffd3d62c97, float:-1.83974219E12)
            int r2 = X.AnonymousClass0fD.A03(r2)
            X.7ax r0 = (X.C334247ax) r0
            r3 = 1804509472(0x6b8ea120, float:3.448567E26)
            int r7 = X.AnonymousClass0fD.A03(r3)
            r3 = 0
            X.0qQ.A0B(r0, r3)
            java.util.List r6 = r0.getItems()
            boolean r0 = X.AnonymousClass7TE.A1b(r6)
            java.lang.Object r5 = r1.A02
            X.E6o r5 = (X.C47528E6o) r5
            if (r0 == 0) goto L_0x02cc
            java.lang.Object r4 = r1.A01
            X.0eM r0 = r5.A0C
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.1OC r3 = X.C320126ro.A03(r0, r6)
            r1 = 7
            X.EDb r0 = new X.EDb
            r0.<init>((int) r1, (java.lang.Object) r4, (java.lang.Object) r5, (java.lang.Object) r6)
            r3.A00 = r0
            r5.schedule(r3)
        L_0x02c1:
            r0 = -358441023(0xffffffffeaa29fc1, float:-9.83002E25)
            X.AnonymousClass0fD.A0A(r0, r7)
            r0 = 862509058(0x3368d802, float:5.4213167E-8)
            goto L_0x168c
        L_0x02cc:
            X.E9N r0 = r5.A03
            java.lang.String r12 = "userListAdapter"
            if (r0 == 0) goto L_0x035e
            r0.A0C = r3
            r0.A03()
            goto L_0x02c1
        L_0x02d8:
            r2 = 1347852248(0x505697d8, float:1.44011018E10)
            int r3 = X.AnonymousClass0fD.A03(r2)
            X.370 r0 = (X.AnonymousClass370) r0
            r2 = 609823505(0x24592b11, float:4.7090853E-17)
            int r4 = X.AnonymousClass7TG.A0D(r0, r2)
            com.instagram.user.model.User r2 = X.C324696zk.A00(r0)
            if (r2 == 0) goto L_0x0353
            java.lang.Object r0 = r1.A02
            X.0lg r0 = (X.0lg) r0
            r2.A0d(r0)
            java.lang.Object r0 = r1.A01
            X.ExO r0 = (X.ExO) r0
            com.instagram.business.fragment.ProfileDisplayOptionsFragment r5 = r0.A00
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r2 = r5.A02
            java.lang.String r12 = "logger"
            if (r2 == 0) goto L_0x035e
            java.lang.String r14 = "profile_display_options"
            r17 = 0
            java.lang.String r15 = r5.A07
            if (r15 == 0) goto L_0x035c
            java.lang.String r16 = "save_info"
            java.util.Map r1 = r0.A01
            java.util.Map r0 = r0.A02
            X.Xtl r13 = new X.Xtl
            r18 = r17
            r19 = r1
            r20 = r0
            r21 = r17
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            r2.Ckg(r13)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r2 = r5.A02
            if (r2 == 0) goto L_0x035e
            java.lang.String r1 = r5.A07
            if (r1 == 0) goto L_0x035c
            X.Xtl r0 = new X.Xtl
            r6 = r0
            r7 = r14
            r8 = r1
            r9 = r17
            r10 = r9
            r11 = r9
            r12 = r9
            r13 = r9
            r14 = r9
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r2.Ci7(r0)
            android.os.Handler r1 = new android.os.Handler
            r1.<init>()
            X.Fpn r0 = new X.Fpn
            r0.<init>(r5)
            r1.post(r0)
        L_0x0346:
            r0 = 362876004(0x15a10c64, float:6.504693E-26)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -39341162(0xfffffffffda7b396, float:-2.7864192E37)
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        L_0x0353:
            X.4do r2 = new X.4do
            r2.<init>(r0)
            r1.onFail(r2)
            goto L_0x0346
        L_0x035c:
            java.lang.String r12 = "entryPoint"
        L_0x035e:
            X.0qQ.A0F(r12)
            goto L_0x0079
        L_0x0363:
            r0 = 1778106984(0x69fbc268, float:3.8044805E25)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = -418265127(0xffffffffe711c7d9, float:-6.884297E23)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r3 = r1.A01
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            r0 = 0
            r3.A1A(r0)
            X.0eE r2 = X.AnonymousClass0t1.A01
            java.lang.Object r1 = r1.A02
            X.5le r1 = (X.C293975le) r1
            com.instagram.common.session.UserSession r0 = r1.A04
            com.instagram.user.model.User r0 = r2.A01(r0)
            r0.A0W()
            com.instagram.user.model.User r0 = r1.A00
            if (r0 != r3) goto L_0x0393
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r1.A01 = r0
            X.C293975le.A01(r1)
        L_0x0393:
            r0 = 703974270(0x29f5cb7e, float:1.0915486E-13)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -1634820070(0xffffffff9e8ea01a, float:-1.5101051E-20)
            goto L_0x08d2
        L_0x039e:
            r2 = -145572159(0xfffffffff752bec1, float:-4.274419E33)
            int r10 = X.AnonymousClass0fD.A03(r2)
            X.Duf r0 = (X.C47312Duf) r0
            java.lang.String r4 = "status"
            r2 = 869781683(0x33d7d0b3, float:1.004968E-7)
            int r3 = X.AnonymousClass7TG.A0D(r0, r2)
            X.G8l r0 = r0.A00     // Catch:{ Exception -> 0x03ef }
            if (r0 != 0) goto L_0x03bc
            X.C41845B3m.A0v()     // Catch:{ Exception -> 0x03ef }
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            goto L_0x03ee
        L_0x03bc:
            X.Dt9 r0 = (X.C47222Dt9) r0     // Catch:{ Exception -> 0x03ef }
            java.lang.String r0 = r0.A00     // Catch:{ Exception -> 0x03ef }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x03ef }
            r2.<init>(r0)     // Catch:{ Exception -> 0x03ef }
            boolean r0 = r2.has(r4)     // Catch:{ Exception -> 0x03ef }
            if (r0 == 0) goto L_0x03d8
            java.lang.String r2 = r2.getString(r4)     // Catch:{ Exception -> 0x03ef }
            java.lang.String r0 = "ok"
            boolean r0 = X.0qQ.A0K(r2, r0)     // Catch:{ Exception -> 0x03ef }
            if (r0 == 0) goto L_0x03d8
            goto L_0x03f5
        L_0x03d8:
            java.lang.Object r2 = r1.A01     // Catch:{ Exception -> 0x03ef }
            android.content.Context r2 = (android.content.Context) r2     // Catch:{ Exception -> 0x03ef }
            java.lang.Object r0 = r1.A02     // Catch:{ Exception -> 0x03ef }
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0     // Catch:{ Exception -> 0x03ef }
            X.C49807F7u.A01(r2, r0)     // Catch:{ Exception -> 0x03ef }
            java.lang.Exception r1 = new java.lang.Exception     // Catch:{ Exception -> 0x03ef }
            r1.<init>()     // Catch:{ Exception -> 0x03ef }
            r0 = -1466019740(0xffffffffa89e5064, float:-1.7576388E-14)
            X.AnonymousClass0fD.A0A(r0, r3)     // Catch:{ Exception -> 0x03ef }
        L_0x03ee:
            throw r1     // Catch:{ Exception -> 0x03ef }
        L_0x03ef:
            r1 = move-exception
            java.lang.String r0 = "Broadcast chat notification setting update failed"
            X.0wb.A07(r0, r1)
        L_0x03f5:
            r0 = -888053857(0xffffffffcb115f9f, float:-9527199.0)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = -2028215405(0xffffffff871be393, float:-1.1727782E-34)
            goto L_0x0e32
        L_0x0400:
            r2 = -2132018888(0xffffffff80ebf938, float:-2.1670744E-38)
            int r6 = X.AnonymousClass0fD.A03(r2)
            X.1XO r0 = (X.1XO) r0
            r2 = 491496205(0x1d4ba30d, float:2.6951122E-21)
            int r5 = X.AnonymousClass0fD.A03(r2)
            java.util.List r0 = r0.A06
            java.lang.Object r4 = X.AnonymousClass7TE.A13(r0)
            X.1Xj r4 = (X.1Xj) r4
            boolean r0 = r4.A5t()
            boolean r3 = r4.A4Z()
            if (r0 == 0) goto L_0x04ca
            r4.A2q()
        L_0x0425:
            java.util.HashMap r8 = X.AnonymousClass7TE.A1E()
            java.lang.String r2 = r4.A2n()
            java.lang.String r0 = "target_id"
            r8.put(r0, r2)
            if (r3 != 0) goto L_0x0491
            boolean r0 = r4.A5Y()
            if (r0 == 0) goto L_0x046f
            r2 = 2131976490(0x7f13612a, float:1.9590102E38)
            r0 = 1197(0x4ad, float:1.677E-42)
        L_0x043f:
            java.lang.String r7 = X.AnonymousClass000.A00(r0)
        L_0x0443:
            X.DiU r7 = X.C46649DiU.A04(r7, r8)
            java.lang.Object r4 = r1.A02
            X.0lg r4 = (X.0lg) r4
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = X.DbS.A0N(r4)
            java.lang.Object r3 = r1.A01
            android.app.Activity r3 = (android.app.Activity) r3
            X.DbS.A18(r3, r0, r2)
            java.lang.Class<com.instagram.modal.ModalActivity> r2 = com.instagram.modal.ModalActivity.class
            android.os.Bundle r1 = X.C49891FBs.A00(r0, r7)
            java.lang.String r0 = "bloks"
            X.DbU.A0w(r3, r1, r4, r2, r0)
            r3.finish()
            r0 = -197197574(0xfffffffff43f00fa, float:-6.0531525E31)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -1552749299(0xffffffffa372ed0d, float:-1.3169044E-17)
            goto L_0x0d1c
        L_0x046f:
            boolean r0 = r4.A5G()
            if (r0 == 0) goto L_0x047b
            r2 = 2131955490(0x7f130f22, float:1.9547509E38)
            java.lang.String r7 = "com.instagram.insights.media_refresh.clips.core"
            goto L_0x0443
        L_0x047b:
            boolean r0 = r4.A67()
            if (r0 == 0) goto L_0x048b
            r2 = 2131974440(0x7f135928, float:1.9585944E38)
            r0 = 72
            java.lang.String r7 = X.C273654mx.A00(r0)
            goto L_0x0443
        L_0x048b:
            r2 = 2131969625(0x7f134659, float:1.9576178E38)
            r0 = 1194(0x4aa, float:1.673E-42)
            goto L_0x043f
        L_0x0491:
            boolean r0 = r4.A67()
            if (r0 == 0) goto L_0x04b5
            r0 = 1196(0x4ac, float:1.676E-42)
        L_0x0499:
            java.lang.String r7 = X.AnonymousClass000.A00(r0)
            java.lang.Object r4 = r1.A02
            X.0lg r4 = (X.0lg) r4
            X.0Tu r0 = X.0Tu.A06
            r2 = 36330058910089648(0x8111ff000141b0, double:3.038613771921364E-306)
            boolean r0 = X.182.A06(r0, r4, r2)
            r2 = 2131952241(0x7f130271, float:1.954092E38)
            if (r0 == 0) goto L_0x0443
            r2 = 2131957496(0x7f1316f8, float:1.9551578E38)
            goto L_0x0443
        L_0x04b5:
            boolean r0 = r4.A5Y()
            if (r0 == 0) goto L_0x04be
            r0 = 1198(0x4ae, float:1.679E-42)
            goto L_0x0499
        L_0x04be:
            boolean r0 = r4.A5G()
            if (r0 == 0) goto L_0x04c7
            r0 = 2880(0xb40, float:4.036E-42)
            goto L_0x0499
        L_0x04c7:
            r0 = 1195(0x4ab, float:1.675E-42)
            goto L_0x0499
        L_0x04ca:
            java.lang.String r2 = r4.getId()
            r2.getClass()
            java.lang.String r0 = "_"
            r2.split(r0)
            goto L_0x0425
        L_0x04d8:
            r2 = 1256002870(0x4add1536, float:7244443.0)
            int r5 = X.AnonymousClass0fD.A03(r2)
            X.3JC r0 = (X.AnonymousClass3JC) r0
            r2 = -776739624(0xffffffffd1b3e4d8, float:-9.6579813E10)
            int r4 = X.AnonymousClass0fD.A03(r2)
            X.02m r6 = X.02m.A0p
            r3 = 39059457(0x2540001, float:1.5575301E-37)
            r2 = 2
            r6.markerEnd(r3, r2)
            java.lang.Object r3 = r1.A01
            X.Eww r3 = (X.C49517Eww) r3
            r2 = 0
            X.C49517Eww.A00(r3, r2)
            java.lang.Object r6 = r1.A02
            X.Ddd r6 = (X.C46361Ddd) r6
            X.EyJ r3 = r6.A06
            r1 = 1
            r3.A02 = r1
            if (r0 == 0) goto L_0x05c8
            java.lang.Object r8 = r0.A01
            if (r8 == 0) goto L_0x05c8
            X.3FZ r8 = (X.AnonymousClass3FZ) r8
            java.lang.Class<X.Dqs> r7 = X.C47116Dqs.class
            java.lang.String r2 = "me"
            X.3FZ r0 = r8.A00(r7, r2)
            if (r0 == 0) goto L_0x05c8
            X.3FZ r0 = r8.A00(r7, r2)
            org.json.JSONObject r9 = r0.A00
            java.lang.Class<X.Dqv> r1 = X.C47119Dqv.class
            r0 = 735(0x2df, float:1.03E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            org.json.JSONObject r9 = r9.optJSONObject(r0)
            r10 = 0
            if (r9 == 0) goto L_0x053e
            java.lang.Class<org.json.JSONObject> r0 = org.json.JSONObject.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x053e }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r0)     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x053e }
            java.lang.Object[] r0 = new java.lang.Object[]{r9}     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x053e }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x053e }
            X.3FZ r0 = (X.AnonymousClass3FZ) r0     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x053e }
            r10 = r0
        L_0x053e:
            r12 = 0
            if (r10 == 0) goto L_0x05aa
            X.3FZ r0 = r8.A00(r7, r2)
            org.json.JSONObject r9 = r0.A00
            java.lang.Class<X.Dqy> r1 = X.C47122Dqy.class
            java.lang.String r0 = "mailing_addresses"
            org.json.JSONObject r9 = r9.optJSONObject(r0)
            if (r9 == 0) goto L_0x05c8
            java.lang.Class<org.json.JSONObject> r11 = org.json.JSONObject.class
            java.lang.Class[] r0 = new java.lang.Class[]{r11}     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x05c8 }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r0)     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x05c8 }
            java.lang.Object[] r0 = new java.lang.Object[]{r9}     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x05c8 }
            java.lang.Object r9 = r1.newInstance(r0)     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x05c8 }
            X.3FZ r9 = (X.AnonymousClass3FZ) r9     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x05c8 }
            if (r9 == 0) goto L_0x05c8
            java.lang.Class<X.Dqu> r1 = X.C47118Dqu.class
            java.lang.String r0 = "payment_credentials"
            com.google.common.collect.ImmutableList r0 = r10.A02(r0, r1)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x05a9
            java.lang.Class<X.Dqx> r1 = X.C47121Dqx.class
            java.lang.String r0 = "edges"
            com.google.common.collect.ImmutableList r0 = r9.A02(r0, r1)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x05a9
            X.3FZ r0 = r8.A00(r7, r2)
            org.json.JSONObject r2 = r0.A00
            java.lang.Class<X.Dqw> r1 = X.C47120Dqw.class
            r0 = 3724(0xe8c, float:5.218E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            org.json.JSONObject r2 = r2.optJSONObject(r0)
            if (r2 == 0) goto L_0x05aa
            java.lang.Class[] r0 = new java.lang.Class[]{r11}     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x05aa }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r0)     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x05aa }
            java.lang.Object[] r0 = new java.lang.Object[]{r2}     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x05aa }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x05aa }
            if (r0 == 0) goto L_0x05aa
        L_0x05a9:
            r12 = 1
        L_0x05aa:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r12)
            if (r1 == 0) goto L_0x05c8
            r3.A00 = r1
            com.instagram.common.session.UserSession r0 = r6.A00
            X.1Av r0 = X.1Au.A00(r0)
            boolean r2 = r1.booleanValue()
            X.0xY r1 = X.AnonymousClass7TE.A0p(r0)
            java.lang.String r0 = "has_stored_payment_info"
            r1.E5T(r0, r2)
            r1.apply()
        L_0x05c8:
            X.C46361Ddd.A01(r6)
            r0 = 172097668(0xa420084, float:9.340857E-33)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 821492003(0x30f6f923, float:1.7969665E-9)
            X.AnonymousClass0fD.A0A(r0, r5)
            return
        L_0x05d8:
            r2 = -1443749439(0xffffffffa9f221c1, float:-1.0752814E-13)
            int r6 = X.AnonymousClass0fD.A03(r2)
            X.3JC r0 = (X.AnonymousClass3JC) r0
            r2 = 1946161605(0x740011c5, float:4.0586817E31)
            int r3 = X.AnonymousClass0fD.A03(r2)
            java.lang.Object r11 = r0.A01
            r7 = 1
            if (r11 == 0) goto L_0x05fd
            r2 = r11
            X.3FZ r2 = (X.AnonymousClass3FZ) r2
            r0 = 3111(0xc27, float:4.36E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.A06(r0)
            r4 = 1
            if (r0 != 0) goto L_0x05fe
        L_0x05fd:
            r4 = 0
        L_0x05fe:
            if (r11 == 0) goto L_0x0681
            X.3FZ r11 = (X.AnonymousClass3FZ) r11
            java.lang.Class<X.6qc> r10 = X.C319456qc.class
            r0 = 733(0x2dd, float:1.027E-42)
            java.lang.String r9 = X.Pxd.A00(r0)
            X.3FZ r0 = r11.A00(r10, r9)
            if (r0 == 0) goto L_0x0681
            X.3FZ r8 = r11.A00(r10, r9)
            java.lang.Class<X.6qd> r5 = X.C319466qd.class
            r0 = 4768(0x12a0, float:6.681E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            X.3FZ r0 = r8.A00(r5, r2)
            if (r0 == 0) goto L_0x0681
            X.3FZ r0 = r11.A00(r10, r9)
            X.3FZ r2 = r0.A00(r5, r2)
            java.lang.String r0 = "is_connected"
            boolean r0 = r2.A06(r0)
            if (r0 == 0) goto L_0x0681
        L_0x0632:
            java.lang.Object r0 = r1.A02
            X.Ev4 r0 = (X.C49402Ev4) r0
            X.Ddd r5 = r0.A00
            boolean r0 = r5.A0F
            if (r4 != r0) goto L_0x0640
            boolean r0 = r5.A0E
            if (r7 == r0) goto L_0x0683
        L_0x0640:
            r5.A0F = r4
            r5.A0E = r7
            com.instagram.common.session.UserSession r0 = r5.A00
            X.1Am r1 = X.1Al.A01(r0)
            X.1An r0 = X.1An.A1O
            X.0xa r4 = r1.A03(r0)
            X.0xY r2 = r4.AR4()
            boolean r1 = r5.A0F
            java.lang.String r0 = "fbpay_enabled"
            r2.E5T(r0, r1)
            X.0xY r2 = X.DbU.A0e(r2, r4)
            boolean r1 = r5.A0E
            java.lang.String r0 = "fbpay_connected"
            r2.E5T(r0, r1)
            r2.apply()
            java.util.List r0 = r5.A0B
            java.util.Iterator r1 = r0.iterator()
        L_0x066f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0683
            java.lang.Object r0 = r1.next()
            X.Euj r0 = (X.C49381Euj) r0
            X.DcA r0 = r0.A00
            X.DcA.A00(r0)
            goto L_0x066f
        L_0x0681:
            r7 = 0
            goto L_0x0632
        L_0x0683:
            r0 = 1330253540(0x4f4a0ee4, float:3.3899735E9)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 1309686803(0x4e103c13, float:6.0496403E8)
            goto L_0x0d1c
        L_0x068e:
            r2 = -1720619243(0xffffffff99716f15, float:-1.2481841E-23)
            int r4 = X.AnonymousClass0fD.A03(r2)
            X.3JC r0 = (X.AnonymousClass3JC) r0
            r2 = -352113427(0xffffffffeb032ced, float:-1.5858144E26)
            int r8 = X.AnonymousClass0fD.A03(r2)
            java.lang.Object r2 = r1.A01
            X.Ddg r2 = (X.C46364Ddg) r2
            r10 = 0
            X.C46364Ddg.A00(r2, r10)
            java.lang.Object r9 = r1.A02
            X.Ddd r9 = (X.C46361Ddd) r9
            X.EyJ r7 = r9.A05
            r6 = 1
            r7.A02 = r6
            if (r0 == 0) goto L_0x06d4
            java.lang.Object r5 = r0.A01
            if (r5 == 0) goto L_0x06d4
            X.3lr r5 = (X.C250663lr) r5
            java.lang.Class<X.6qZ> r3 = X.C319426qZ.class
            java.lang.String r2 = "me"
            r1 = -514222691(0xffffffffe159959d, float:-2.5085776E20)
            X.3lr r0 = r5.getOptionalTreeField(r10, r2, r3, r1)
            if (r0 == 0) goto L_0x06d4
            X.3lr r1 = r5.getOptionalTreeField(r10, r2, r3, r1)
            r0 = 4568(0x11d8, float:6.401E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.Boolean r0 = X.C41846B3n.A0d(r1, r0, r6)
            r7.A00 = r0
        L_0x06d4:
            X.C46361Ddd.A01(r9)
            r0 = 1922491874(0x7296e5e2, float:5.977685E30)
            X.AnonymousClass0fD.A0A(r0, r8)
            r0 = -133758524(0xfffffffff80701c4, float:-1.0953061E34)
            goto L_0x08d2
        L_0x06e2:
            r2 = 923286831(0x37083d2f, float:8.120477E-6)
            int r5 = X.AnonymousClass0fD.A03(r2)
            X.3JC r0 = (X.AnonymousClass3JC) r0
            r2 = 546322486(0x20903836, float:2.4431746E-19)
            int r6 = X.AnonymousClass0fD.A03(r2)
            java.lang.Object r2 = r1.A01
            X.Ddh r2 = (X.C46365Ddh) r2
            r7 = 0
            X.C46365Ddh.A00(r2, r7)
            java.lang.Object r8 = r1.A02
            X.Ddd r8 = (X.C46361Ddd) r8
            X.EyJ r4 = r8.A04
            r9 = 1
            r4.A02 = r9
            java.lang.Object r12 = r0.A01
            if (r12 == 0) goto L_0x0745
            X.3FZ r12 = (X.AnonymousClass3FZ) r12
            java.lang.Class<X.6qa> r11 = X.C319436qa.class
            java.lang.String r10 = "me"
            X.3FZ r0 = r12.A00(r11, r10)
            if (r0 == 0) goto L_0x0745
            X.3FZ r3 = r12.A00(r11, r10)
            java.lang.Class<X.6qb> r2 = X.C319446qb.class
            r0 = 735(0x2df, float:1.03E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            X.3FZ r0 = r3.A00(r2, r1)
            if (r0 == 0) goto L_0x0745
            X.3FZ r0 = r12.A00(r11, r10)
            X.3FZ r1 = r0.A00(r2, r1)
            java.lang.String r0 = "payments_disabled"
            boolean r0 = r1.A06(r0)
            if (r0 == 0) goto L_0x0745
        L_0x0735:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            r4.A00 = r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0773
            X.Ewx r4 = r8.A09
            monitor-enter(r4)
            goto L_0x0747
        L_0x0745:
            r9 = 0
            goto L_0x0735
        L_0x0747:
            boolean r0 = r4.A01     // Catch:{ all -> 0x076e }
            if (r0 != 0) goto L_0x0777
            r0 = 1
            X.C49518Ewx.A00(r4, r0)     // Catch:{ all -> 0x0770 }
            X.2IS r3 = X.C41845B3m.A04()     // Catch:{ all -> 0x0770 }
            java.lang.Class<X.Dqo> r2 = X.C47112Dqo.class
            java.lang.String r0 = "IGRiskAppealCase"
            X.3Fa r1 = new X.3Fa     // Catch:{ all -> 0x0770 }
            r1.<init>(r3, r2, r0, r7)     // Catch:{ all -> 0x0770 }
            com.instagram.common.session.UserSession r0 = r4.A00     // Catch:{ all -> 0x0770 }
            X.1OC r2 = X.C46479Dfi.A00(r1, r0)     // Catch:{ all -> 0x0770 }
            r0 = 41
            A00(r2, r4, r8, r0)     // Catch:{ all -> 0x0770 }
            r1 = 219(0xdb, float:3.07E-43)
            r0 = 3
            X.1ES.A05(r2, r1, r0, r7, r7)     // Catch:{ all -> 0x0770 }
            goto L_0x0777
        L_0x076e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0770 }
        L_0x0770:
            r2 = move-exception
            monitor-exit(r4)
            throw r2
        L_0x0773:
            X.C46361Ddd.A01(r8)
            goto L_0x0778
        L_0x0777:
            monitor-exit(r4)
        L_0x0778:
            r0 = 751374243(0x2cc90fa3, float:5.7144996E-12)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = -1080897905(0xffffffffbf92ce8f, float:-1.1469287)
            X.AnonymousClass0fD.A0A(r0, r5)
            return
        L_0x0785:
            r2 = 176296021(0xa821055, float:1.2524688E-32)
            int r4 = X.AnonymousClass0fD.A03(r2)
            X.371 r0 = (X.AnonymousClass371) r0
            r2 = -2137407791(0xffffffff8099bed1, float:-1.4119283E-38)
            int r3 = X.AnonymousClass0fD.A03(r2)
            r5 = 0
            X.0qQ.A0B(r0, r5)
            X.EDV.super.onSuccess(r0)
            java.lang.Object r6 = r1.A02
            X.E1x r6 = (X.C47428E1x) r6
            android.view.View r2 = r6.A00
            X.AnonymousClass7TH.A0R(r2)
            com.instagram.igds.components.textcell.IgdsListCell r2 = r6.A02
            if (r2 == 0) goto L_0x07ac
            r2.setVisibility(r5)
        L_0x07ac:
            com.instagram.igds.components.textcell.IgdsListCell r2 = r6.A03
            if (r2 == 0) goto L_0x07b3
            r2.setVisibility(r5)
        L_0x07b3:
            java.lang.Object r1 = r1.A01
            java.lang.String r2 = X.DbS.A0q(r1)
            X.0eM r1 = r6.A08
            java.lang.String r1 = X.DbU.A0u(r1)
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x07e2
            java.lang.Object r0 = r0.FH3()
            X.BAo r0 = (X.C42014BAo) r0
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x07e2
            int r1 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x07e2
            if (r1 <= 0) goto L_0x07e2
            com.instagram.igds.components.textcell.IgdsListCell r0 = r6.A01
            if (r0 == 0) goto L_0x07e2
            r0.setVisibility(r5)
        L_0x07e2:
            r0 = 1890569899(0x70afceab, float:4.352778E29)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 918518195(0x36bf79b3, float:5.7064112E-6)
            goto L_0x08d2
        L_0x07ed:
            r2 = 1992493227(0x76c308ab, float:1.9778783E33)
            int r4 = X.AnonymousClass0fD.A03(r2)
            X.DvS r0 = (X.DvS) r0
            r2 = -570736305(0xffffffffddfb414f, float:-2.26310485E18)
            int r5 = X.AnonymousClass0fD.A03(r2)
            X.EDV.super.onSuccess(r0)
            X.F1D r2 = r0.A00
            if (r2 == 0) goto L_0x084f
            java.lang.Object r7 = r1.A01
            X.E59 r7 = (X.E59) r7
            java.util.Date r2 = r2.A0P
            r7.A0C = r2
            r6 = 0
            java.lang.Object r1 = r1.A02     // Catch:{ 2sh -> 0x0841 }
            android.view.View r1 = (android.view.View) r1     // Catch:{ 2sh -> 0x0841 }
            android.content.Context r1 = r1.getContext()     // Catch:{ 2sh -> 0x0841 }
            com.facebook.phonenumbers.PhoneNumberUtil r9 = com.facebook.phonenumbers.PhoneNumberUtil.A01(r1)     // Catch:{ 2sh -> 0x0841 }
            X.F1D r1 = r0.A00     // Catch:{ 2sh -> 0x0841 }
            java.lang.String r1 = r1.A0M     // Catch:{ 2sh -> 0x0841 }
            X.74u r3 = r9.A0F(r1, r6)     // Catch:{ 2sh -> 0x0841 }
            com.instagram.registration.model.RegFlowExtras r8 = r7.A05     // Catch:{ 2sh -> 0x0841 }
            X.F1D r1 = r0.A00     // Catch:{ 2sh -> 0x0841 }
            java.lang.String r1 = r1.A0M     // Catch:{ 2sh -> 0x0841 }
            r8.A0K = r1     // Catch:{ 2sh -> 0x0841 }
            long r1 = r3.A02     // Catch:{ 2sh -> 0x0841 }
            java.lang.String r1 = java.lang.Long.toString(r1)     // Catch:{ 2sh -> 0x0841 }
            r8.A0L = r1     // Catch:{ 2sh -> 0x0841 }
            int r3 = r3.A00     // Catch:{ 2sh -> 0x0841 }
            X.79y r1 = r9.A00     // Catch:{ 2sh -> 0x0841 }
            java.lang.String r2 = r1.A01(r3)     // Catch:{ 2sh -> 0x0841 }
            com.instagram.phonenumber.model.CountryCodeData r1 = new com.instagram.phonenumber.model.CountryCodeData     // Catch:{ 2sh -> 0x0841 }
            r1.<init>(r3, r2)     // Catch:{ 2sh -> 0x0841 }
            r8.A01 = r1     // Catch:{ 2sh -> 0x0841 }
            goto L_0x0847
        L_0x0841:
            com.instagram.registration.model.RegFlowExtras r1 = r7.A05
            r1.A0L = r6
            r1.A0K = r6
        L_0x0847:
            com.instagram.registration.model.RegFlowExtras r1 = r7.A05
            X.F1D r0 = r0.A00
            java.lang.String r0 = r0.A0D
            r1.A0I = r0
        L_0x084f:
            r0 = -1109908750(0xffffffffbdd822f2, float:-0.1055354)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 1646659517(0x622607bd, float:7.656793E20)
            goto L_0x08d2
        L_0x0859:
            r2 = -256049578(0xfffffffff0bcfe56, float:-4.6792524E29)
            int r4 = X.AnonymousClass0fD.A03(r2)
            X.7ax r0 = (X.C334247ax) r0
            r8 = r1
            monitor-enter(r8)
            r2 = 34760936(0x21268e8, float:1.0756493E-37)
            int r3 = X.AnonymousClass7TG.A0D(r0, r2)     // Catch:{ all -> 0x08d6 }
            java.lang.Object r5 = r1.A02     // Catch:{ all -> 0x08d6 }
            X.Tww r5 = (X.C14474Tww) r5     // Catch:{ all -> 0x08d6 }
            java.lang.Object r6 = r1.A01     // Catch:{ all -> 0x08d6 }
            com.instagram.user.model.User r6 = (com.instagram.user.model.User) r6     // Catch:{ all -> 0x08d6 }
            java.util.List r1 = r0.getItems()     // Catch:{ all -> 0x08d6 }
            java.util.ArrayList r7 = X.AnonymousClass7TG.A0r(r1)     // Catch:{ all -> 0x08d6 }
            java.util.Iterator r2 = r1.iterator()     // Catch:{ all -> 0x08d6 }
        L_0x087f:
            boolean r1 = r2.hasNext()     // Catch:{ all -> 0x08d6 }
            if (r1 == 0) goto L_0x0890
            com.instagram.user.model.User r1 = X.DbT.A0k(r2)     // Catch:{ all -> 0x08d6 }
            X.DbY.A1O(r1)     // Catch:{ all -> 0x08d6 }
            r7.add(r1)     // Catch:{ all -> 0x08d6 }
            goto L_0x087f
        L_0x0890:
            java.util.ArrayList r2 = X.00k.A0U(r7)     // Catch:{ all -> 0x08d6 }
            X.Ewv r1 = new X.Ewv     // Catch:{ all -> 0x08d6 }
            r1.<init>(r6, r2)     // Catch:{ all -> 0x08d6 }
            r5.A02 = r1     // Catch:{ all -> 0x08d6 }
            X.3HQ r2 = r0.A00     // Catch:{ all -> 0x08d6 }
            java.lang.Object r0 = r2.FH3()     // Catch:{ all -> 0x08d6 }
            X.7dC r0 = (X.C335587dC) r0     // Catch:{ all -> 0x08d6 }
            java.lang.Integer r1 = r0.C4L()     // Catch:{ all -> 0x08d6 }
            X.4Cl r0 = r6.A03     // Catch:{ all -> 0x08d6 }
            r0.EX6(r1)     // Catch:{ all -> 0x08d6 }
            java.lang.Object r0 = r2.FH3()     // Catch:{ all -> 0x08d6 }
            X.7dC r0 = (X.C335587dC) r0     // Catch:{ all -> 0x08d6 }
            java.lang.Integer r1 = r0.C4K()     // Catch:{ all -> 0x08d6 }
            X.4Cl r0 = r6.A03     // Catch:{ all -> 0x08d6 }
            r0.EX5(r1)     // Catch:{ all -> 0x08d6 }
            X.Twp r0 = r5.A03     // Catch:{ all -> 0x08d6 }
            if (r0 == 0) goto L_0x08c2
            r0.A00()     // Catch:{ all -> 0x08d6 }
        L_0x08c2:
            int r0 = r5.A00     // Catch:{ all -> 0x08d6 }
            int r0 = r0 + 1
            r5.A00 = r0     // Catch:{ all -> 0x08d6 }
            r0 = -541351712(0xffffffffdfbba0e0, float:-2.7040105E19)
            X.AnonymousClass0fD.A0A(r0, r3)     // Catch:{ all -> 0x08d6 }
            monitor-exit(r8)
            r0 = -1551853842(0xffffffffa38096ee, float:-1.3941709E-17)
        L_0x08d2:
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        L_0x08d6:
            r2 = move-exception
            monitor-exit(r8)
            throw r2
        L_0x08d9:
            r2 = -2073503886(0xffffffff8468d772, float:-2.7370397E-36)
            int r10 = X.AnonymousClass0fD.A03(r2)
            X.4W5 r0 = (X.AnonymousClass4W5) r0
            r2 = 1928457401(0x72f1ecb9, float:9.5836246E30)
            int r20 = X.AnonymousClass0fD.A03(r2)
            r15 = 0
            X.0qQ.A0B(r0, r15)
            java.lang.Object r3 = r1.A02
            X.E6N r3 = (X.E6N) r3
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.Object r5 = r1.A01
            com.instagram.quickpromotion.intf.QuickPromotionSlot r5 = (com.instagram.quickpromotion.intf.QuickPromotionSlot) r5
            java.util.HashMap r19 = X.AnonymousClass7TE.A1E()
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r30 = r14.toSeconds(r6)
            long r1 = java.lang.System.currentTimeMillis()
            long r28 = r14.toSeconds(r1)
            java.util.List r1 = X.AnonymousClass2kY.A01(r5)
            java.util.Iterator r18 = r1.iterator()
        L_0x0913:
            boolean r1 = r18.hasNext()
            if (r1 == 0) goto L_0x0abe
            java.lang.Object r4 = r18.next()
            X.2ka r4 = (X.C227972ka) r4
            com.instagram.quickpromotion.intf.QuickPromotionSurface r1 = r4.A00
            r32 = r1
            java.util.List r1 = r0.A00(r1)
            if (r1 == 0) goto L_0x0913
            r1 = r32
            java.util.List r2 = r0.A00(r1)
            if (r2 == 0) goto L_0x0913
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x0913
            java.util.Iterator r16 = r2.iterator()
        L_0x093b:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x0913
            java.lang.Object r6 = r16.next()
            X.5Ji r6 = (X.C283795Ji) r6
            X.Euq r1 = r3.A02
            if (r1 != 0) goto L_0x0955
            java.lang.String r17 = "qpEdgeValidator"
        L_0x094d:
            X.0qQ.A0F(r17)
            X.00P r2 = X.AnonymousClass00P.createAndThrow()
            throw r2
        L_0x0955:
            com.instagram.common.session.UserSession r8 = r3.A00
            java.lang.String r17 = "userSession"
            if (r8 == 0) goto L_0x094d
            java.util.EnumSet r2 = r4.A01
            r26 = r2
            java.lang.Class<X.2bg> r2 = X.2bg.class
            java.util.EnumSet r27 = java.util.EnumSet.allOf(r2)
            android.content.Context r22 = r3.getContext()
            X.AnonymousClass2bO.A00()
            X.DcY.A00(r8)
            X.5Jm r2 = r6.A02
            java.lang.String r7 = r2.A05
            X.G6G[] r13 = r1.A00
            r12 = 5
            r2 = 0
        L_0x0977:
            r21 = r13[r2]
            r1 = 1
            X.0qQ.A0B(r7, r1)
            r23 = r8
            r24 = r32
            r25 = r6
            X.FEW r9 = r21.FMu(r22, r23, r24, r25, r26, r27, r28, r30)
            boolean r11 = r9.A02
            if (r11 == 0) goto L_0x0a44
            boolean r11 = r9.A01
            if (r11 != 0) goto L_0x0a44
            int r2 = r2 + 1
            if (r2 < r12) goto L_0x0977
            r2 = 0
            X.FEW r9 = new X.FEW
            r9.<init>(r1, r15, r2)
        L_0x0999:
            X.5Jm r8 = r6.A02
            X.0qQ.A07(r8)
            java.lang.String r7 = r8.A05
            boolean r1 = r9.A02
            if (r1 == 0) goto L_0x0ab7
            boolean r1 = r9.A01
            if (r1 != 0) goto L_0x0ab7
            java.lang.Long r1 = r6.A03
            long r11 = X.DbY.A04(r1)
            X.5Jk r1 = r6.A01
            if (r1 == 0) goto L_0x0a39
            java.lang.Long r1 = r1.A00
            if (r1 == 0) goto L_0x0a39
            long r1 = r1.longValue()
        L_0x09ba:
            X.5Jy r11 = X.C283935Jx.A03
            com.instagram.common.session.UserSession r9 = r3.A00
            if (r9 == 0) goto L_0x094d
            X.5Jx r11 = r11.A00()
            com.instagram.common.session.UserSession r9 = r3.A00
            if (r9 == 0) goto L_0x094d
            java.lang.String r9 = r9.A06
            X.4VB r9 = r11.A00(r9, r7)
            if (r9 != 0) goto L_0x09dd
            com.instagram.common.session.UserSession r9 = r3.A00
            if (r9 == 0) goto L_0x094d
            java.lang.String r11 = r9.A06
            java.lang.String r8 = r8.A05
            X.4VB r9 = new X.4VB
            r9.<init>(r11, r8, r1)
        L_0x09dd:
            X.5Jm r11 = r6.A02
            X.0qQ.A07(r11)
            com.instagram.common.session.UserSession r8 = r3.A00
            if (r8 == 0) goto L_0x094d
            java.lang.String r13 = r8.A06
            java.util.List r8 = r11.A06
            if (r8 == 0) goto L_0x0b32
            java.lang.Object r8 = r8.get(r15)
            X.4V7 r8 = (X.AnonymousClass4V7) r8
            int r12 = r6.A00
            boolean r6 = r6.A04
            r33 = r8
            r34 = r11
            r35 = r9
            r36 = r13
            r37 = r12
            r38 = r1
            r40 = r6
            X.4UC r1 = X.AnonymousClass5K3.A01(r32, r33, r34, r35, r36, r37, r38, r40)
            X.0eM r2 = X.2c5.A03
            java.lang.Object r2 = r2.getValue()
            X.2c5 r2 = (X.2c5) r2
            java.util.Set r26 = r1.CA0()
            com.instagram.quickpromotion.intf.QuickPromotionSurface r6 = r1.A06
            int r6 = r6.A00
            java.lang.String r25 = java.lang.String.valueOf(r6)
            android.content.Context r22 = r3.getContext()
            r22.getClass()
            com.instagram.common.session.UserSession r6 = r3.A00
            if (r6 == 0) goto L_0x094d
            r24 = 0
            r21 = r2
            r23 = r6
            X.426 r9 = r21.A00(r22, r23, r24, r25, r26)
            X.2sk r2 = r3.A03
            if (r2 != 0) goto L_0x0a5c
            java.lang.String r17 = "qpPromotionQualifier"
            goto L_0x094d
        L_0x0a39:
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r14.toSeconds(r1)
            long r1 = r1 + r11
            goto L_0x09ba
        L_0x0a44:
            java.lang.String r11 = r9.A00
            boolean r1 = android.text.TextUtils.isEmpty(r11)
            if (r1 == 0) goto L_0x0a4e
            java.lang.String r11 = "unknown"
        L_0x0a4e:
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            java.lang.String r1 = "; promotion id: "
            java.lang.String r7 = X.002.A0g(r11, r1, r7)
            r1 = 0
            X.C46436Dey.A00(r8, r2, r7, r1)
            goto L_0x0999
        L_0x0a5c:
            com.instagram.common.session.UserSession r6 = r3.A00
            if (r6 == 0) goto L_0x094d
            X.AnonymousClass2bO.A00()
            X.DcZ r8 = X.DcY.A00(r6)
            X.2t4 r6 = r2.A00
            X.4VQ r2 = new X.4VQ
            r2.<init>(r1)
            X.5IN r2 = r6.A00(r2, r9)
            X.FEW r9 = X.FEW.A00(r2)
            boolean r2 = r9.A02
            if (r2 != 0) goto L_0x0a84
            java.lang.String r6 = r9.A00
            java.lang.String r2 = "In holdout"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x0ab7
        L_0x0a84:
            com.instagram.quickpromotion.intf.QuickPromotionSurface r6 = r1.A06
            java.lang.String r2 = r1.A0D
            java.lang.String r11 = r1.A0B
            java.lang.String r1 = "qp_exposure"
            X.0xI r1 = X.0xI.A00(r8, r1)
            com.instagram.common.session.UserSession r12 = r8.A00
            X.0qQ.A0A(r1)
            int r6 = r6.A00
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            java.lang.String r6 = "nux_id"
            r1.A08(r8, r6)
            java.lang.String r6 = "promotion_id"
            r1.A0C(r6, r2)
            if (r11 == 0) goto L_0x0ab0
            r2 = 3385(0xd39, float:4.743E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r1.A0C(r2, r11)
        L_0x0ab0:
            X.0xN r2 = X.C60510iO.A00(r12)
            r2.EHF(r1)
        L_0x0ab7:
            r1 = r19
            r1.put(r7, r9)
            goto L_0x093b
        L_0x0abe:
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            android.content.Context r1 = r3.requireContext()
            java.io.File r1 = r1.getCacheDir()
            r2.append(r1)
            r1 = 47
            r2.append(r1)
            java.lang.String r1 = r5.name()
            r2.append(r1)
            java.lang.String r1 = ".json"
            java.lang.String r1 = X.AnonymousClass7TF.A0l(r1, r2)
            java.io.File r7 = new java.io.File
            r7.<init>(r1)
            java.io.FileWriter r4 = new java.io.FileWriter     // Catch:{ IOException -> 0x0b6d }
            r4.<init>(r7)     // Catch:{ IOException -> 0x0b6d }
            java.io.StringWriter r2 = new java.io.StringWriter     // Catch:{ IOException -> 0x0b6d }
            r2.<init>()     // Catch:{ IOException -> 0x0b6d }
            X.15p r1 = X.AnonymousClass15o.A00     // Catch:{ IOException -> 0x0b6d }
            X.17W r1 = r1.A0A(r2)     // Catch:{ IOException -> 0x0b6d }
            X.C283605Im.A00(r1, r0)     // Catch:{ IOException -> 0x0b6d }
            r1.close()     // Catch:{ IOException -> 0x0b6d }
            java.lang.String r1 = r2.toString()     // Catch:{ IOException -> 0x0b6d }
            r4.write(r1)     // Catch:{ IOException -> 0x0b6d }
            r4.close()     // Catch:{ IOException -> 0x0b6d }
            java.util.HashMap r6 = X.AnonymousClass7TE.A1E()
            java.util.List r1 = X.AnonymousClass2kY.A01(r5)
            java.util.Iterator r4 = r1.iterator()
        L_0x0b10:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0b2a
            java.lang.Object r2 = r4.next()
            X.2ka r2 = (X.C227972ka) r2
            com.instagram.quickpromotion.intf.QuickPromotionSurface r1 = r2.A00
            java.util.List r1 = r0.A00(r1)
            if (r1 != 0) goto L_0x0b26
            X.0sn r1 = X.0sn.A00
        L_0x0b26:
            r6.put(r2, r1)
            goto L_0x0b10
        L_0x0b2a:
            X.FQS r4 = r3.A01
            if (r4 != 0) goto L_0x0b37
            java.lang.String r17 = "adapter"
            goto L_0x094d
        L_0x0b32:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0y()
            throw r2
        L_0x0b37:
            X.F3N r2 = new X.F3N
            r0 = r19
            r2.<init>(r5, r7, r0, r6)
            java.util.List r1 = r4.A02
            r1.remove(r2)
            r1.add(r2)
            java.util.Comparator r0 = r4.A01
            X.01V.A1D(r1, r0)
            X.FQS.A00(r4)
            java.util.Set r0 = r3.A05
            r0.remove(r5)
            com.instagram.ui.widget.refresh.RefreshableListView r1 = r3.A04
            if (r1 == 0) goto L_0x0b60
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            r1.setIsLoading(r0)
        L_0x0b60:
            r1 = 1037766712(0x3ddb1038, float:0.10696453)
            r0 = r20
            X.AnonymousClass0fD.A0A(r1, r0)
            r0 = 1372640370(0x51d0d472, float:1.1211468E11)
            goto L_0x0e32
        L_0x0b6d:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0)
            r1 = 1700108748(0x655599cc, float:6.304382E22)
            r0 = r20
            X.AnonymousClass0fD.A0A(r1, r0)
            throw r2
        L_0x0b7c:
            r0 = -406447332(0xffffffffe7c61b1c, float:-1.8710573E24)
            int r6 = X.AnonymousClass0fD.A03(r0)
            r0 = 1873615083(0x6fad18eb, float:1.0714206E29)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r1.A02
            android.content.Context r4 = X.DbT.A08(r0)
            java.lang.Object r3 = r1.A01
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            com.instagram.user.model.FollowStatus r0 = r3.B6o()
            int r1 = r0.ordinal()
            r0 = 4
            if (r1 == r0) goto L_0x0bc6
            r0 = 3
            if (r1 == r0) goto L_0x0bbe
            r0 = 5
            if (r1 == r0) goto L_0x0bce
            java.lang.String r1 = ""
        L_0x0ba7:
            X.0qQ.A0A(r1)
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0bb3
            X.C59689JTv.A09(r4, r1)
        L_0x0bb3:
            r0 = -1037823491(0xffffffffc22411fd, float:-41.017567)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -683212614(0xffffffffd74700ba, float:-2.18805934E14)
            goto L_0x0d1c
        L_0x0bbe:
            android.content.res.Resources r2 = r4.getResources()
            r1 = 2131975870(0x7f135ebe, float:1.9588844E38)
            goto L_0x0bd5
        L_0x0bc6:
            android.content.res.Resources r2 = r4.getResources()
            r1 = 2131962591(0x7f132adf, float:1.9561911E38)
            goto L_0x0bd5
        L_0x0bce:
            android.content.res.Resources r2 = r4.getResources()
            r1 = 2131962626(0x7f132b02, float:1.9561982E38)
        L_0x0bd5:
            java.lang.String r0 = r3.getUsername()
            java.lang.String r1 = X.AnonymousClass7TF.A0e(r2, r0, r1)
            goto L_0x0ba7
        L_0x0bde:
            r2 = 1260897593(0x4b27c539, float:1.0995001E7)
            int r6 = X.AnonymousClass0fD.A03(r2)
            X.Dv7 r0 = (X.Dv7) r0
            r2 = 984577888(0x3aaf7760, float:0.0013387017)
            int r4 = X.AnonymousClass0fD.A03(r2)
            X.FV8 r2 = X.FV8.A00()
            java.lang.Object r10 = r1.A02
            X.0lg r10 = (X.0lg) r10
            java.lang.String r9 = "ig_android_growth_fx_access_fb_ig_autocomplete"
            java.lang.String r3 = "AutoCompleteAccountHelperV2"
            java.lang.String r8 = r2.A02(r10, r9, r3)
            X.FV8 r2 = X.FV8.A00()
            java.lang.String r7 = r2.A01(r10, r9, r3)
            X.F1D r2 = r0.A00
            if (r2 == 0) goto L_0x0c41
            if (r8 == 0) goto L_0x0c41
            if (r7 == 0) goto L_0x0c41
            java.lang.Object r5 = r1.A01
            X.FFu r5 = (X.C49941FFu) r5
            X.ENP r2 = r5.A00
            if (r2 == 0) goto L_0x0c38
            X.FV8 r2 = X.FV8.A00()
            java.lang.String r3 = r2.A01(r10, r9, r3)
            X.ENP r2 = r5.A00
            java.lang.String r2 = r2.A02
            boolean r2 = android.text.TextUtils.equals(r3, r2)
            if (r2 != 0) goto L_0x0c38
            X.ENP r2 = r5.A00
            X.F1D r2 = r2.A00
            java.lang.String r3 = r2.A0O
            X.F1D r2 = r0.A00
            java.lang.String r2 = r2.A0O
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0c41
        L_0x0c38:
            X.F1D r3 = r0.A00
            X.ENP r2 = new X.ENP
            r2.<init>(r3, r8, r7)
            r5.A00 = r2
        L_0x0c41:
            r2 = 1
            java.util.ArrayList r3 = X.DbS.A0v(r2)
            java.lang.Object r2 = r1.A01
            X.FFu r2 = (X.C49941FFu) r2
            X.ENP r1 = r2.A00
            if (r1 == 0) goto L_0x0c51
            r3.add(r1)
        L_0x0c51:
            java.util.concurrent.CopyOnWriteArrayList r1 = r2.A03
            r1.getClass()
            r2.A03(r3, r1)
            X.1xC r2 = X.1xC.A01
            X.F1D r0 = r0.A00
            if (r0 == 0) goto L_0x0c76
            java.lang.String r1 = r0.A0O
        L_0x0c61:
            X.FVf r0 = new X.FVf
            r0.<init>()
            r0.A00 = r1
            r2.A00(r0)
            r0 = -1084810636(0xffffffffbf571a74, float:-0.8402474)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 1237996560(0x49ca5410, float:1657474.0)
            goto L_0x0d1c
        L_0x0c76:
            r1 = 0
            goto L_0x0c61
        L_0x0c78:
            r2 = -714775565(0xffffffffd56563f3, float:-1.57635901E13)
            int r6 = X.AnonymousClass0fD.A03(r2)
            X.DwO r0 = (X.DwO) r0
            r2 = -198937062(0xfffffffff424761a, float:-5.2119877E31)
            int r5 = X.AnonymousClass0fD.A03(r2)
            r2 = 0
            X.0qQ.A0B(r0, r2)
            java.lang.Object r2 = r1.A02
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r2 = (com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger) r2
            java.lang.String r10 = "promotional_email_setting"
            if (r2 == 0) goto L_0x0ca4
            java.lang.String r8 = "opt_in_promotional_email"
            r9 = 0
            X.Xtl r7 = new X.Xtl
            r11 = r9
            r12 = r9
            r13 = r9
            r14 = r9
            r15 = r9
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r2.Ci5(r7)
        L_0x0ca4:
            java.lang.Object r7 = r1.A01
            X.Eyq r7 = (X.C49581Eyq) r7
            java.util.List r0 = r0.A01
            java.util.Iterator r9 = r0.iterator()
            r8 = 0
        L_0x0caf:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0cee
            java.lang.Object r0 = r9.next()
            X.DrY r0 = (X.C47157DrY) r0
            java.util.List r0 = r0.A06
            java.util.Iterator r4 = r0.iterator()
        L_0x0cc1:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0caf
            java.lang.Object r0 = r4.next()
            X.9JM r0 = (X.AnonymousClass9JM) r0
            java.lang.Object r3 = r0.A00
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            java.lang.String r2 = r0.A01
            java.lang.String r1 = r0.A03
            java.lang.String r0 = "marketing_email"
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x0cc1
            if (r1 == 0) goto L_0x0cc1
            java.lang.String r0 = "on"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0cc1
            if (r3 == 0) goto L_0x0cc1
            boolean r8 = r3.booleanValue()
            goto L_0x0cc1
        L_0x0cee:
            com.instagram.business.fragment.AccountTypeSelectionV2Fragment r1 = r7.A03
            X.G8D r0 = r1.mController
            if (r0 == 0) goto L_0x0cf8
            com.instagram.business.activity.BusinessConversionActivity r0 = (com.instagram.business.activity.BusinessConversionActivity) r0
            r0.A07 = r8
        L_0x0cf8:
            if (r8 != 0) goto L_0x0d20
            com.instagram.common.session.UserSession r4 = r1.A02
            X.Evv r3 = r7.A02
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r2 = r7.A00
            X.AnonymousClass7TF.A1H(r4, r3)
            r0 = 8
            X.EDV r1 = new X.EDV
            r1.<init>(r0, r3, r2)
            X.1OC r0 = X.C318486p2.A06(r4)
            r0.A00 = r1
            X.1ES.A03(r0)
        L_0x0d13:
            r0 = -2021162278(0xffffffff878782da, float:-2.038945E-34)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -1404050427(0xffffffffac4fe405, float:-2.9543046E-12)
        L_0x0d1c:
            X.AnonymousClass0fD.A0A(r0, r6)
            return
        L_0x0d20:
            X.6qr r0 = r7.A01
            com.instagram.business.fragment.AccountTypeSelectionV2Fragment.A00(r0, r1)
            goto L_0x0d13
        L_0x0d26:
            r2 = 135769368(0x817ad18, float:4.564338E-34)
            int r10 = X.AnonymousClass0fD.A03(r2)
            X.DvS r0 = (X.DvS) r0
            r2 = 1965246637(0x752348ad, float:2.0698692E32)
            int r4 = X.AnonymousClass7TG.A0D(r0, r2)
            java.lang.Object r2 = r1.A02
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r2 = (com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger) r2
            java.lang.String r14 = "user_email"
            if (r2 == 0) goto L_0x0d52
            java.lang.String r12 = "opt_in_promotional_email"
            r13 = 0
            X.Xtl r11 = new X.Xtl
            r15 = r13
            r16 = r13
            r17 = r13
            r18 = r13
            r19 = r13
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            r2.Ci5(r11)
        L_0x0d52:
            X.F1D r0 = r0.A00
            if (r0 == 0) goto L_0x0d6d
            java.lang.String r3 = r0.A0D
            if (r3 == 0) goto L_0x0d6d
            java.lang.Object r2 = r1.A01
            X.Evv r2 = (X.C49454Evv) r2
            com.instagram.business.fragment.AccountTypeSelectionV2Fragment r1 = r2.A01
            X.G8D r0 = r1.mController
            if (r0 == 0) goto L_0x0d68
            com.instagram.business.activity.BusinessConversionActivity r0 = (com.instagram.business.activity.BusinessConversionActivity) r0
            r0.A04 = r3
        L_0x0d68:
            X.6qr r0 = r2.A00
            com.instagram.business.fragment.AccountTypeSelectionV2Fragment.A00(r0, r1)
        L_0x0d6d:
            r0 = 1458572296(0x56f00c08, float:1.31967232E14)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 151592886(0x9091fb6, float:1.6505686E-33)
            goto L_0x0e32
        L_0x0d78:
            r2 = 941250406(0x381a5766, float:3.6797857E-5)
            int r10 = X.AnonymousClass0fD.A03(r2)
            X.3JC r0 = (X.AnonymousClass3JC) r0
            r2 = 128395352(0x7a72858, float:2.515108E-34)
            int r5 = X.AnonymousClass7TG.A0D(r0, r2)
            java.lang.Object r2 = r1.A02
            X.FA3 r2 = (X.FA3) r2
            android.util.LruCache r1 = X.FA3.A01
            com.instagram.business.fragment.CategorySearchFragment r6 = r2.A00
            com.google.common.collect.ImmutableList$Builder r4 = new com.google.common.collect.ImmutableList$Builder
            r4.<init>()
            java.lang.Object r2 = r0.A01
            X.3FZ r2 = (X.AnonymousClass3FZ) r2
            if (r2 == 0) goto L_0x0df7
            java.lang.Class<X.DqG> r1 = X.C47079DqG.class
            java.lang.String r0 = "ig_business_top_categories"
            X.3FZ r2 = r2.A00(r1, r0)
            if (r2 == 0) goto L_0x0df7
            java.lang.Class<X.DqF> r1 = X.C47078DqF.class
            java.lang.String r0 = "items"
            com.google.common.collect.ImmutableList r1 = r2.A02(r0, r1)
            if (r1 == 0) goto L_0x0df7
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0df7
            X.3kO r7 = r1.iterator()
            X.0qQ.A07(r7)
        L_0x0dbc:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0df7
            java.lang.Object r1 = r7.next()
            X.3FZ r1 = (X.AnonymousClass3FZ) r1
            java.lang.String r0 = "id"
            java.lang.String r3 = r1.A05(r0)
            java.lang.String r0 = "name"
            java.lang.String r2 = r1.A05(r0)
            java.lang.String r0 = "account_type"
            java.lang.String r1 = r1.A05(r0)
            if (r3 == 0) goto L_0x0dbc
            int r0 = r3.length()
            if (r0 == 0) goto L_0x0dbc
            if (r2 == 0) goto L_0x0dbc
            int r0 = r2.length()
            if (r0 == 0) goto L_0x0dbc
            X.16V r1 = X.16U.A01(r1)
            X.FYO r0 = new X.FYO
            r0.<init>(r1, r3, r2)
            r4.add(r0)
            goto L_0x0dbc
        L_0x0df7:
            com.google.common.collect.ImmutableList r2 = X.DbZ.A0K(r4)
            r6.A03 = r2
            r0 = 1
            r6.A0E = r0
            android.view.View r1 = r6.A01
            X.0qQ.A0A(r1)
            r0 = 8
            r1.setVisibility(r0)
            com.instagram.business.fragment.CategorySearchFragment.A07(r6)
            java.lang.Integer r0 = com.instagram.business.fragment.CategorySearchFragment.A01(r6)
            if (r0 == 0) goto L_0x0e1f
            android.widget.ListView r1 = r6.categoriesListView
            X.0qQ.A0A(r1)
            int r0 = r0.intValue()
            r1.setSelection(r0)
        L_0x0e1f:
            int r2 = r2.size()
            r1 = 0
            java.lang.String r0 = "suggested_category"
            com.instagram.business.fragment.CategorySearchFragment.A09(r6, r0, r1, r1, r2)
            r0 = 1241672394(0x4a026aca, float:2136754.5)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 2069076387(0x7b5399a3, float:1.09869076E36)
        L_0x0e32:
            X.AnonymousClass0fD.A0A(r0, r10)
            return
        L_0x0e36:
            X.3HX r5 = r0.A00
            if (r5 != 0) goto L_0x0e5e
            java.lang.String r2 = "CanvasBirthdayHighlightsApiUtil#navigateToBirthdayHighlight"
            java.lang.String r0 = "mediaItems is null"
            X.0kD.A01(r2, r0)
            java.lang.Object r2 = r1.A01
            android.content.Context r2 = (android.content.Context) r2
            r1 = 2131974495(0x7f13595f, float:1.9586056E38)
            r0 = 973(0x3cd, float:1.363E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.C59689JTv.A0F(r2, r0, r1)
            r0 = -1750862073(0xffffffff97a3f707, float:-1.0595987E-24)
        L_0x0e54:
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = 133989217(0x7fc8361, float:3.7993963E-34)
            X.AnonymousClass0fD.A0A(r0, r7)
            return
        L_0x0e5e:
            java.lang.Object r8 = r1.A02
            com.instagram.common.session.UserSession r8 = (com.instagram.common.session.UserSession) r8
            java.lang.Class<X.AYh> r3 = X.C40268AYh.class
            r2 = 0
            X.AtL r0 = new X.AtL
            r0.<init>(r8, r2)
            java.lang.Object r4 = r8.A01(r3, r0)
            X.AYh r4 = (X.C40268AYh) r4
            X.1OP r0 = X.1OP.$redex_init_class
            com.instagram.reels.store.ReelStore r3 = com.instagram.reels.store.ReelStore.A03(r8)
            X.0qQ.A07(r3)
            X.1E5 r0 = X.1E4.A00(r8)
            X.3HX r2 = r5.FEr(r0)
            r0 = 1
            com.instagram.model.reels.Reel r5 = r3.A0I(r2, r0)
            java.lang.String r0 = r5.getId()
            r4.A00 = r0
            com.instagram.model.reels.ReelType r0 = com.instagram.model.reels.ReelType.A0D
            r5.A0P = r0
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.lang.String r0 = r5.getId()
            r4.add(r0)
            X.6Ye r3 = new X.6Ye
            r3.<init>()
            java.util.List r2 = java.util.Collections.singletonList(r5)
            java.lang.String r0 = r5.getId()
            r3.A02(r8, r0, r2)
            r3.A0Q = r4
            X.3BQ r0 = X.AnonymousClass3BQ.PUSH_NOTIFICATION
            r3.A03(r0)
            X.DbY.A1R(r3)
            r3.A01(r8)
            android.os.Bundle r0 = r3.A00()
            java.lang.Object r1 = r1.A01
            android.app.Activity r1 = (android.app.Activity) r1
            X.6W8 r0 = X.AnonymousClass6W8.A01(r1, r0, r8)
            r0.A0C(r1)
            r0 = -385165784(0xffffffffe90ad628, float:-1.0490193E25)
            goto L_0x0e54
        L_0x0ecb:
            r2 = 2115758756(0x7e1beaa4, float:5.1812166E37)
            int r2 = X.AnonymousClass0fD.A03(r2)
            X.3JC r0 = (X.AnonymousClass3JC) r0
            r3 = 2130757415(0x7f00c727, float:1.7117524E38)
            int r4 = X.AnonymousClass7TG.A0D(r0, r3)
            java.lang.Object r0 = r0.A01
            X.C5S r0 = (X.C5S) r0
            X.Jvb r3 = X.C45883D9c.A00(r0)
            java.lang.String r0 = r3.A01
            if (r0 == 0) goto L_0x0ef9
            java.lang.Object r0 = r1.A01
            X.1P0 r0 = (X.1P0) r0
            r0.onSuccess(r3)
        L_0x0eee:
            r0 = -1249788783(0xffffffffb581bc91, float:-9.666129E-7)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -1307333610(0xffffffffb213ac16, float:-8.595654E-9)
            goto L_0x168c
        L_0x0ef9:
            java.lang.String r0 = r3.A00
            java.lang.Object r1 = r1.A01
            X.1P0 r1 = (X.1P0) r1
            if (r0 == 0) goto L_0x0f0a
            X.4do r0 = new X.4do
            r0.<init>(r3)
        L_0x0f06:
            r1.onFail(r0)
            goto L_0x0eee
        L_0x0f0a:
            X.4dn r0 = X.AnonymousClass7BQ.A00()
            goto L_0x0f06
        L_0x0f0f:
            r2 = -1654948728(0xffffffff9d5b7c88, float:-2.904879E-21)
            int r2 = X.AnonymousClass0fD.A03(r2)
            X.3JC r0 = (X.AnonymousClass3JC) r0
            r3 = 2111125690(0x7dd538ba, float:3.5427513E37)
            int r8 = X.AnonymousClass0fD.A03(r3)
            java.lang.Object r4 = r1.A01
            X.Ewx r4 = (X.C49518Ewx) r4
            r3 = 0
            X.C49518Ewx.A00(r4, r3)
            java.lang.Object r7 = r1.A02
            X.Ddd r7 = (X.C46361Ddd) r7
            X.EyJ r6 = r7.A07
            r5 = 1
            r6.A02 = r5
            java.lang.Object r4 = r0.A01
            if (r4 == 0) goto L_0x0f60
            X.3FZ r4 = (X.AnonymousClass3FZ) r4
            java.lang.Class<X.Dqn> r3 = X.C47111Dqn.class
            java.lang.String r1 = "gen_ig_user_risk_appeal_case"
            X.3FZ r0 = r4.A00(r3, r1)
            if (r0 == 0) goto L_0x0f60
            X.3FZ r1 = r4.A00(r3, r1)
            java.lang.String r0 = "job_id"
            java.lang.String r0 = r1.A05(r0)
            if (r0 == 0) goto L_0x0f60
        L_0x0f4c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r6.A00 = r0
            X.C46361Ddd.A01(r7)
            r0 = -1695283871(0xffffffff9af40561, float:-1.00924725E-22)
            X.AnonymousClass0fD.A0A(r0, r8)
            r0 = -649851563(0xffffffffd9440d55, float:-3.44898463E15)
            goto L_0x168c
        L_0x0f60:
            r5 = 0
            goto L_0x0f4c
        L_0x0f62:
            r0 = -1500593868(0xffffffffa68ec134, float:-9.905597E-16)
            int r2 = X.AnonymousClass0fD.A03(r0)
            r0 = -1171813291(0xffffffffba278c55, float:-6.3914555E-4)
            int r6 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r1.A02
            X.FBX r0 = (X.FBX) r0
            X.02m r4 = r0.A00
            r3 = 857809457(0x33212231, float:3.751683E-8)
            r0 = 2
            r4.markerEnd(r3, r0)
            java.lang.Object r3 = r1.A01
            X.EQr r3 = (X.C48008EQr) r3
            com.instagram.ui.widget.inlineerror.InlineErrorMessageView r0 = r3.A05
            r0.A03()
            android.widget.EditText r0 = r3.A02
            X.0nA.A0N(r0)
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            com.instagram.common.session.UserSession r0 = r3.A04
            X.6Yo r5 = X.DbS.A0M(r1, r0)
            java.lang.String r4 = r3.A06
            X.EQq r3 = new X.EQq
            r3.<init>()
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "email"
            r1.putString(r0, r4)
            X.DbX.A18(r1, r3, r5)
            r0 = -64494585(0xfffffffffc27e407, float:-3.486954E36)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = 850267702(0x32ae0e36, float:2.0262728E-8)
            goto L_0x168c
        L_0x0fb3:
            r2 = -586494694(0xffffffffdd0acd1a, float:-6.2510493E17)
            int r2 = X.AnonymousClass0fD.A03(r2)
            X.4W5 r0 = (X.AnonymousClass4W5) r0
            r3 = -575156415(0xffffffffddb7cf41, float:-1.65560956E18)
            int r5 = X.AnonymousClass0fD.A03(r3)
            r7 = 0
            X.0qQ.A0B(r0, r7)
            X.2ka r3 = X.C227972ka.A1O
            com.instagram.quickpromotion.intf.QuickPromotionSurface r8 = r3.A00
            java.util.List r3 = r0.A00(r8)
            if (r3 == 0) goto L_0x10b4
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x10b4
            java.lang.Object r6 = r3.get(r7)
            X.5Ji r6 = (X.C283795Ji) r6
            java.lang.Long r0 = r6.A03
            long r14 = X.DbY.A04(r0)
            X.5Jk r0 = r6.A01
            if (r0 == 0) goto L_0x10a7
            java.lang.Long r0 = r0.A00
            if (r0 == 0) goto L_0x10a7
            long r14 = r0.longValue()
        L_0x0fef:
            X.5Jm r10 = r6.A02
            X.0qQ.A07(r10)
            X.5Jy r3 = X.C283935Jx.A03
            java.lang.Object r0 = r1.A02
            X.E6y r0 = (X.C47535E6y) r0
            r0.getSession()
            X.5Jx r4 = r3.A00()
            com.instagram.common.session.UserSession r1 = r0.getSession()
            java.lang.String r3 = r1.A06
            java.lang.String r1 = r10.A05
            X.4VB r11 = r4.A00(r3, r1)
            if (r11 != 0) goto L_0x101c
            com.instagram.common.session.UserSession r1 = r0.getSession()
            java.lang.String r3 = r1.A06
            java.lang.String r1 = r10.A05
            X.4VB r11 = new X.4VB
            r11.<init>(r3, r1, r14)
        L_0x101c:
            com.instagram.common.session.UserSession r1 = r0.getSession()
            java.lang.String r12 = r1.A06
            java.util.List r1 = r10.A06
            if (r1 == 0) goto L_0x10b8
            java.lang.Object r9 = r1.get(r7)
            X.4V7 r9 = (X.AnonymousClass4V7) r9
            int r13 = r6.A00
            boolean r1 = r6.A04
            r16 = r1
            X.4UC r10 = X.AnonymousClass5K3.A01(r8, r9, r10, r11, r12, r13, r14, r16)
            android.content.Context r1 = r0.getContext()
            if (r1 == 0) goto L_0x108d
            android.view.View r3 = r0.mView
            boolean r1 = r3 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x108d
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            if (r3 == 0) goto L_0x108d
            X.1YN r8 = X.AnonymousClass2bO.A00()
            com.instagram.common.session.UserSession r7 = r0.getSession()
            com.instagram.common.session.UserSession r6 = r0.getSession()
            com.instagram.quickpromotion.intf.QuickPromotionSlot r4 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0o
            X.EPj r1 = new X.EPj
            r1.<init>(r3, r6, r0, r4)
            X.2sj r6 = r8.A03(r0, r7, r1)
            r1 = 3668(0xe54, float:5.14E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.0qQ.A0C(r10, r1)
            X.4VA r1 = r10.A09
            java.lang.String r4 = r1.A00
            X.4V7 r1 = r10.A08
            X.3ew r1 = r1.A00()
            if (r1 == 0) goto L_0x1098
            r7 = 3
        L_0x1073:
            r8 = 0
            android.view.View r9 = r0.mView
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            r11 = r8
            android.view.View r1 = r6.getView(r7, r8, r9, r10, r11)
            r0.A00 = r1
            r1 = 2131438905(0x7f0b2d39, float:1.849975E38)
            android.view.ViewGroup r1 = X.DbS.A0E(r3, r1)
            if (r1 == 0) goto L_0x108d
            android.view.View r0 = r0.A00
            r1.addView(r0)
        L_0x108d:
            r0 = -1219940182(0xffffffffb74930aa, float:-1.1991864E-5)
        L_0x1090:
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 847241894(0x327fe2a6, float:1.4894487E-8)
            goto L_0x168c
        L_0x1098:
            r1 = 114(0x72, float:1.6E-43)
            java.lang.String r1 = X.C66579MXk.A00(r1)
            boolean r1 = r1.equals(r4)
            boolean r7 = X.AnonymousClass7TF.A1P(r1)
            goto L_0x1073
        L_0x10a7:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r0.toSeconds(r3)
            long r14 = r14 + r3
            goto L_0x0fef
        L_0x10b4:
            r0 = 328324824(0x1391d6d8, float:3.6815E-27)
            goto L_0x1090
        L_0x10b8:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = -373419641(0xffffffffe9be1187, float:-2.8722335E25)
            X.AnonymousClass0fD.A0A(r0, r5)
            throw r1
        L_0x10c3:
            r2 = -1084866977(0xffffffffbf563e5f, float:-0.8368892)
            int r2 = X.AnonymousClass0fD.A03(r2)
            X.DvQ r0 = (X.DvQ) r0
            r3 = 254281438(0xf2806de, float:8.284362E-30)
            int r5 = X.AnonymousClass7TG.A0D(r0, r3)
            java.lang.Object r3 = r1.A02
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            X.17i r4 = X.17h.A00(r3)
            com.instagram.user.model.User r3 = r0.A00
            X.0qQ.A07(r3)
            r4.A03(r3)
            java.lang.Object r1 = r1.A01
            X.0sP r1 = (X.0sP) r1
            com.instagram.user.model.User r0 = r0.A00
            r1.invoke(r0)
            r0 = 1954428891(0x747e37db, float:8.056496E31)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -1364399542(0xffffffffaeacea4a, float:-7.8632725E-11)
            goto L_0x168c
        L_0x10f7:
            r0 = -360412815(0xffffffffea848971, float:-8.011363E25)
            int r2 = X.AnonymousClass0fD.A03(r0)
            r0 = 720553586(0x2af2c672, float:4.3125535E-13)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r1.A01
            com.instagram.profile.fragment.UserDetailFragment r0 = (com.instagram.profile.fragment.UserDetailFragment) r0
            com.instagram.common.session.UserSession r0 = r0.A0I
            X.1Ng r4 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Object r0 = r1.A02
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r3 = r0.getId()
            com.instagram.user.model.FollowStatus r1 = r0.B6o()
            X.3KA r0 = new X.3KA
            r0.<init>(r1, r3)
            r4.A00(r0)
            r0 = 1607170963(0x5fcb7b93, float:2.932495E19)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 1011269830(0x3c46c0c6, float:0.012130922)
            goto L_0x168c
        L_0x112e:
            r0 = 180190955(0xabd7eeb, float:1.8247779E-32)
            int r2 = X.AnonymousClass0fD.A03(r0)
            r0 = 696003802(0x297c2cda, float:5.5994143E-14)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r8 = r1.A01
            com.instagram.profile.fragment.UserDetailFragment r8 = (com.instagram.profile.fragment.UserDetailFragment) r8
            com.instagram.common.session.UserSession r0 = r8.A0I
            X.1Ng r4 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Object r0 = r1.A02
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r3 = r0.getId()
            com.instagram.user.model.FollowStatus r1 = r0.B6o()
            X.3KA r0 = new X.3KA
            r0.<init>(r1, r3)
            r4.A00(r0)
            com.instagram.common.session.UserSession r0 = r8.A0I
            com.instagram.user.model.User r7 = X.DbT.A0j(r0)
            X.6ap r6 = X.DbS.A0a()
            android.content.res.Resources r4 = X.DbV.A05(r8)
            r3 = 2131969893(0x7f134765, float:1.9576722E38)
            r1 = 1
            java.lang.String r0 = r7.getUsername()
            android.text.Spanned r0 = X.DbU.A07(r4, r0, r3)
            r6.A0D = r0
            com.instagram.common.typedurl.ImageUrl r0 = r7.Bh3()
            r6.A09 = r0
            X.6ar r0 = X.C310356ar.AVATAR
            r6.A0B(r0)
            r6.A0O = r1
            r6.A06()
            X.Dc2 r0 = r6.A00()
            android.os.Handler r4 = r8.A2c
            X.FrI r3 = new X.FrI
            r3.<init>(r0)
            r0 = 300(0x12c, double:1.48E-321)
            r4.postDelayed(r3, r0)
            r0 = 176252105(0xa8164c9, float:1.246016E-32)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 975532362(0x3a25714a, float:6.311132E-4)
            goto L_0x168c
        L_0x11a1:
            r0 = -1464998369(0xffffffffa8ade61f, float:-1.9306657E-14)
            int r2 = X.AnonymousClass0fD.A03(r0)
            r0 = -154788485(0xfffffffff6c61d7b, float:-2.0091264E33)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.DbT.A1I(r0)
            r0 = -1801633766(0xffffffff949d401a, float:-1.5878232E-26)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = -1326582346(0xffffffffb0edf5b6, float:-1.7313855E-9)
            goto L_0x168c
        L_0x11c1:
            r2 = 2111132820(0x7dd55494, float:3.544559E37)
            int r2 = X.AnonymousClass0fD.A03(r2)
            X.DvS r0 = (X.DvS) r0
            r3 = -1088299999(0xffffffffbf21dc21, float:-0.63226515)
            int r3 = X.AnonymousClass0fD.A03(r3)
            java.lang.Object r1 = r1.A01
            com.instagram.profile.edit.fragment.CompleteYourProfileFragment r1 = (com.instagram.profile.edit.fragment.CompleteYourProfileFragment) r1
            X.F1D r0 = r0.A00
            r1.A03 = r0
            com.instagram.profile.edit.fragment.CompleteYourProfileFragment.A00(r1)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r1.A01
            if (r0 == 0) goto L_0x11f2
            java.lang.String r5 = "profile_completion"
            r7 = 0
            java.lang.String r6 = r1.A06
            X.Xtl r4 = new X.Xtl
            r8 = r7
            r9 = r7
            r10 = r7
            r11 = r7
            r12 = r7
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r0.Ci5(r4)
        L_0x11f2:
            r0 = -136005650(0xfffffffff7e4b7ee, float:-9.2779236E33)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = -1070933650(0xffffffffc02ad96e, float:-2.6695209)
            goto L_0x168c
        L_0x11fd:
            r2 = 153489936(0x9261210, float:1.9990016E-33)
            int r2 = X.AnonymousClass0fD.A03(r2)
            X.CEn r0 = (X.C43821CEn) r0
            r3 = 1709736975(0x65e8840f, float:1.3725313E23)
            int r6 = X.AnonymousClass0fD.A03(r3)
            r5 = 0
            X.0qQ.A0B(r0, r5)
            java.lang.Object r3 = r1.A01
            X.0rm r3 = (X.0rm) r3
            java.lang.Object r4 = r3.A00
            X.05G r4 = (X.05G) r4
            X.DrL r3 = r0.FH3()
            java.lang.Object r0 = r1.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.1E4.A00(r0)
            java.util.List r0 = r3.A00
            if (r0 == 0) goto L_0x1250
            java.lang.Object r0 = r0.get(r5)
            X.Dse r0 = (X.C47192Dse) r0
            if (r0 == 0) goto L_0x1250
            X.Dre r0 = r0.A00
            if (r0 == 0) goto L_0x1250
            java.util.List r0 = r0.A01
            if (r0 == 0) goto L_0x1250
            java.lang.Object r0 = r0.get(r5)
            X.N5K r0 = (X.N5K) r0
            if (r0 == 0) goto L_0x1250
            java.util.List r0 = r0.A00
        L_0x1242:
            r4.Epw(r0)
            r0 = 2141831318(0x7fa9c096, float:NaN)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = 2098306675(0x7d119e73, float:1.2097548E37)
            goto L_0x168c
        L_0x1250:
            r0 = 0
            goto L_0x1242
        L_0x1252:
            r2 = 905710110(0x35fc0a1e, float:1.8778408E-6)
            int r2 = X.AnonymousClass0fD.A03(r2)
            X.Dus r0 = (X.C47325Dus) r0
            r3 = 612110592(0x247c1100, float:5.465819E-17)
            int r4 = X.AnonymousClass0fD.A03(r3)
            java.lang.String r3 = r0.A01
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x129a
            com.instagram.common.typedurl.ImageUrl r3 = r0.A00
            boolean r3 = X.C253833rU.A02(r3)
            if (r3 != 0) goto L_0x129a
            java.lang.String r3 = r0.A02
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x129a
            java.lang.String r3 = r0.A03
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x129a
            java.lang.Object r6 = r1.A02
            X.E3Y r6 = (X.E3Y) r6
            com.instagram.registration.model.RegFlowExtras r5 = r6.A0J
            boolean r3 = r5.A0t
            if (r3 == 0) goto L_0x12ac
            java.lang.String r5 = r5.A0K
            X.F2u r3 = r6.A0E
            java.lang.String r3 = r3.A00()
            boolean r3 = X.2PP.A00(r5, r3)
            if (r3 == 0) goto L_0x12ac
        L_0x129a:
            java.lang.Object r1 = r1.A01
            X.1P0 r1 = (X.1P0) r1
            r1.onSuccess(r0)
        L_0x12a1:
            r0 = -1937812637(0xffffffff8c7f5363, float:-1.9669579E-31)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -18331013(0xfffffffffee84a7b, float:-1.5438381E38)
            goto L_0x168c
        L_0x12ac:
            X.0aP r7 = r6.A05
            java.lang.String r10 = r0.A02
            java.lang.String r11 = r0.A03
            java.lang.String r12 = r0.A01
            com.instagram.common.typedurl.ImageUrl r8 = r0.A00
            X.DiE r9 = r6.BzS()
            r3 = 40
            X.FJk r5 = X.C50025FJk.A00(r1, r0, r3)
            com.instagram.registration.model.RegFlowExtras r0 = r6.A0J
            java.lang.String r13 = r0.A0A
            X.C49839F9e.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x12a1
        L_0x12c8:
            r2 = 592317184(0x234e0b00, float:1.1169612E-17)
            int r2 = X.AnonymousClass0fD.A03(r2)
            X.1XO r0 = (X.1XO) r0
            r3 = 1743056419(0x67e4ee23, float:2.1621848E24)
            int r3 = X.AnonymousClass0fD.A03(r3)
            java.lang.Object r1 = r1.A02
            X.5Gi r1 = (X.C283155Gi) r1
            java.util.List r0 = r0.A06
            java.lang.Object r0 = X.AnonymousClass7TE.A13(r0)
            X.1Xj r0 = (X.1Xj) r0
            r1.A02 = r0
            r0 = 619422897(0x24eba4b1, float:1.02194E-16)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = -1150031065(0xffffffffbb73eb27, float:-0.003721902)
            goto L_0x168c
        L_0x12f1:
            r2 = 1367924822(0x5188e056, float:7.3484911E10)
            int r2 = X.AnonymousClass0fD.A03(r2)
            r3 = -459175669(0xffffffffe4a1890b, float:-2.3838406E22)
            int r3 = X.AnonymousClass0fD.A03(r3)
            X.EDV.super.onSuccess(r0)
            java.lang.Object r5 = r1.A01
            X.E57 r5 = (X.E57) r5
            android.content.Context r0 = r5.getContext()
            if (r0 == 0) goto L_0x1316
            android.content.Context r4 = r5.getContext()
            r0 = 2131969196(0x7f1344ac, float:1.9575308E38)
            X.C59689JTv.A07(r4, r0)
        L_0x1316:
            X.1Q0 r4 = X.1Q0.A13
            com.instagram.common.session.UserSession r0 = r5.A01
            X.FGI r4 = r4.A02(r0)
            X.DiE r9 = X.C46634DiE.A16
            r0 = 0
            X.0xI r4 = r4.A05(r0, r9)
            com.instagram.common.session.UserSession r0 = r5.A01
            X.DbU.A1R(r4, r0)
            java.lang.Object r4 = r1.A02
            X.0iw r4 = (X.AnonymousClass0iw) r4
            com.instagram.common.session.UserSession r0 = r5.A01
            X.0eE r1 = X.AnonymousClass0t1.A01
            java.lang.String r10 = X.DbU.A0n(r0, r1)
            android.widget.EditText r0 = r5.A00
            java.lang.String r11 = X.AnonymousClass7TF.A0f(r0)
            com.instagram.common.session.UserSession r0 = r5.A01
            com.instagram.user.model.User r0 = r1.A01(r0)
            com.instagram.common.typedurl.ImageUrl r7 = r0.Bh3()
            com.instagram.common.session.UserSession r6 = r5.A01
            X.Fdt r8 = new X.Fdt
            r8.<init>(r4, r5)
            r12 = 0
            X.C46632DiC.A02(r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = -260721280(0xfffffffff075b580, float:-3.0417299E29)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 358499644(0x155e453c, float:4.488716E-26)
            goto L_0x168c
        L_0x135c:
            r0 = -1667267486(0xffffffff9c9f8462, float:-1.0555958E-21)
            int r2 = X.AnonymousClass0fD.A03(r0)
            r0 = -896143835(0xffffffffca95ee25, float:-4912914.5)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r1.A01
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            com.instagram.user.model.FollowStatus r0 = r0.B6o()
            int r4 = r0.ordinal()
            r0 = 5
            if (r4 == r0) goto L_0x1396
            r0 = 4
            r3 = 2131962616(0x7f132af8, float:1.9561962E38)
            if (r4 == r0) goto L_0x1382
            r3 = 2131962612(0x7f132af4, float:1.9561954E38)
        L_0x1382:
            java.lang.Object r0 = r1.A02
            android.content.Context r0 = X.DbT.A07(r0)
            X.C59689JTv.A07(r0, r3)
            r0 = -1089975363(0xffffffffbf084bbd, float:-0.5324057)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 1419911953(0x54a22311, float:5.5709841E12)
            goto L_0x168c
        L_0x1396:
            r3 = 2131962625(0x7f132b01, float:1.956198E38)
            goto L_0x1382
        L_0x139a:
            r2 = -952653145(0xffffffffc737aaa7, float:-47018.652)
            int r2 = X.AnonymousClass0fD.A03(r2)
            X.EM5 r0 = (X.EM5) r0
            r3 = -443940975(0xffffffffe589ff91, float:-8.145982E22)
            int r3 = X.AnonymousClass0fD.A03(r3)
            X.EDV.super.onSuccess(r0)
            com.instagram.user.model.User r6 = r0.A05
            java.lang.Object r4 = r1.A01
            X.FQv r4 = (X.C50138FQv) r4
            X.0aP r0 = r4.A02
            androidx.fragment.app.FragmentActivity r5 = r4.A00
            r18 = 0
            r12 = 0
            r8 = r5
            r9 = r12
            r10 = r0
            r11 = r6
            r13 = r18
            com.instagram.common.session.UserSession r6 = X.C46413Dea.A02(r8, r9, r10, r11, r12, r13)
            X.0iw r0 = r4.A01
            X.C46413Dea.A06(r5, r12, r0, r6)
            java.lang.Double r0 = r4.A04
            double r16 = r0.doubleValue()
            java.lang.String r10 = r4.A06
            java.lang.Object r0 = r1.A02
            X.Jtv r0 = (X.C60937Jtv) r0
            java.lang.Object r0 = r0.A02
            X.QP8 r0 = (X.QP8) r0
            java.lang.String r0 = r0.A04
            java.lang.Long r7 = X.DbV.A0q(r0)
            java.lang.Long r8 = X.DbV.A0q(r0)
            java.lang.String r11 = r4.A05
            java.lang.String r9 = "intra_app"
            r19 = 1
            r13 = r12
            r14 = r12
            r15 = r12
            r20 = r19
            X.C46400DeN.A03(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20)
            r0 = 2101014246(0x7d3aeee6, float:1.5529802E37)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 1600713654(0x5f68f3b6, float:1.678596E19)
            goto L_0x168c
        L_0x13fc:
            r2 = -1660017011(0xffffffff9d0e268d, float:-1.8813474E-21)
            int r2 = X.AnonymousClass0fD.A03(r2)
            X.1XO r0 = (X.1XO) r0
            r3 = 1812471816(0x6c082008, float:6.582607E26)
            int r5 = X.AnonymousClass0fD.A03(r3)
            r4 = 0
            X.0qQ.A0B(r0, r4)
            java.util.List r3 = r0.A06
            X.0qQ.A07(r3)
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x142f
            java.lang.Object r1 = r1.A01
            X.G73 r1 = (X.G73) r1
            java.lang.String r0 = "Fetched MediaFeedResponse is empty"
            r1.onFail(r0)
        L_0x1424:
            r0 = -162038503(0xfffffffff6577d19, float:-1.0926573E33)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -889553263(0xffffffffcafa7e91, float:-8208200.5)
            goto L_0x168c
        L_0x142f:
            X.1Xj r3 = X.DbZ.A0T(r3, r4)
            java.lang.Object r0 = r1.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.1E8 r0 = X.1E7.A00(r0)
            r0.A03(r3)
            java.lang.Object r0 = r1.A01
            X.G73 r0 = (X.G73) r0
            r0.DoN(r3)
            goto L_0x1424
        L_0x1446:
            r2 = -809169272(0xffffffffcfc50e88, float:-6.6121277E9)
            int r2 = X.AnonymousClass0fD.A03(r2)
            X.1XO r0 = (X.1XO) r0
            r3 = -46300842(0xfffffffffd3d8156, float:-1.5743478E37)
            int r5 = X.AnonymousClass0fD.A03(r3)
            X.EDV.super.onSuccess(r0)
            java.util.List r0 = r0.A06
            java.util.Iterator r4 = r0.iterator()
        L_0x145f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x1475
            java.lang.Object r3 = r4.next()
            X.1Xj r3 = (X.1Xj) r3
            java.lang.Object r0 = r1.A01
            X.GV5 r0 = (X.GV5) r0
            X.2rM r0 = r0.A04
            r0.Cs9(r3)
            goto L_0x145f
        L_0x1475:
            r0 = -544009710(0xffffffffdf931212, float:-2.1195105E19)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -817416012(0xffffffffcf4738b4, float:-3.34238208E9)
            goto L_0x168c
        L_0x1480:
            r2 = 2021682863(0x78806eaf, float:2.0839341E34)
            int r2 = X.AnonymousClass0fD.A03(r2)
            X.Duy r0 = (X.C47331Duy) r0
            r3 = -1811532957(0xffffffff94063363, float:-6.775405E-27)
            int r3 = X.AnonymousClass7TG.A0D(r0, r3)
            X.EDV.super.onSuccess(r0)
            java.lang.Object r4 = r1.A02
            X.E4w r4 = (X.C47492E4w) r4
            java.lang.String r1 = r0.A00
            if (r1 == 0) goto L_0x14d1
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r4.A01
            if (r0 == 0) goto L_0x14bc
            java.util.HashMap r12 = X.AnonymousClass7TE.A1E()
            java.lang.String r0 = "phone"
            r12.put(r0, r1)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r4.A01
            java.lang.String r6 = "edit_contact_info"
            r9 = 0
            java.lang.String r7 = r4.A08
            java.lang.String r8 = "phone_validation"
            X.Xtl r5 = new X.Xtl
            r10 = r9
            r11 = r9
            r13 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r0.Ci5(r5)
        L_0x14bc:
            android.os.Handler r1 = r4.A0E
            X.Fpm r0 = new X.Fpm
            r0.<init>(r4)
            r1.post(r0)
            r0 = -1652714768(0xffffffff9d7d92f0, float:-3.3560236E-21)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 491223610(0x1d477a3a, float:2.640062E-21)
            goto L_0x168c
        L_0x14d1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x14d6:
            r2 = 712472976(0x2a777990, float:2.1980182E-13)
            int r2 = X.AnonymousClass0fD.A03(r2)
            r3 = -2006080655(0xffffffff886da371, float:-7.1511718E-34)
            int r9 = X.AnonymousClass0fD.A03(r3)
            X.EDV.super.onSuccess(r0)
            java.lang.Object r12 = r1.A01
            com.instagram.business.fragment.SupportProfileDisplayOptionsFragment r12 = (com.instagram.business.fragment.SupportProfileDisplayOptionsFragment) r12
            com.instagram.common.session.UserSession r0 = r12.A04
            com.instagram.user.model.User r4 = X.DbT.A0j(r0)
            r3 = 0
            X.4Cl r0 = r4.A03
            r0.EUQ(r3)
            X.4Cl r0 = r4.A03
            r0.EUR(r3)
            com.instagram.common.session.UserSession r0 = r12.A04
            X.DbT.A1S(r0, r4)
            X.4os r3 = r12.A01
            java.lang.String r0 = "Initial Partner should not be null if remove button is shown"
            X.17k.A07(r3, r0)
            X.FFo r11 = r12.A03
            java.lang.String r10 = r3.AmM()
            java.lang.String r8 = r3.Ac5()
            java.lang.String r7 = r3.Bao()
            java.lang.String r6 = r3.getUrl()
            java.lang.String r5 = r3.Ain()
            r4 = 1
            X.AnonymousClass7TG.A1U(r8, r7, r6)
            X.0Aj r3 = X.C49935FFo.A00(r11)
            java.lang.String r0 = "remove_action_button"
            X.DbS.A1H(r3, r0)
            java.lang.String r0 = "success"
            X.DbS.A1J(r3, r0)
            X.C49935FFo.A01(r3, r11, r10, r8, r4)
            X.Dba.A1A(r3, r7, r6)
            java.lang.String r0 = "button_label"
            r3.AAJ(r0, r5)
            r3.Cgf()
            android.os.Handler r3 = r12.A06
            X.Fpp r0 = new X.Fpp
            r0.<init>(r1)
            r3.post(r0)
            r0 = 635638651(0x25e3137b, float:3.9391423E-16)
            X.AnonymousClass0fD.A0A(r0, r9)
            r0 = 1596726757(0x5f2c1de5, float:1.2402321E19)
            goto L_0x168c
        L_0x1553:
            r2 = -1721781538(0xffffffff995fb2de, float:-1.1564952E-23)
            int r2 = X.AnonymousClass0fD.A03(r2)
            X.371 r0 = (X.AnonymousClass371) r0
            r3 = -628263133(0xffffffffda8d7723, float:-1.9909482E16)
            int r5 = X.AnonymousClass7TG.A0D(r0, r3)
            X.EDV.super.onSuccess(r0)
            java.lang.Object r4 = r1.A01
            com.instagram.igds.components.textcell.IgdsListCell r4 = (com.instagram.igds.components.textcell.IgdsListCell) r4
            java.lang.Object r3 = r0.FH3()
            X.Dr5 r3 = (X.C47128Dr5) r3
            boolean r3 = r3.A00
            r4.setChecked(r3)
            java.lang.Object r1 = r1.A02
            X.E45 r1 = (X.E45) r1
            X.0eM r4 = r1.A01
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r4)
            com.instagram.user.model.User r3 = X.AnonymousClass7TF.A0Q(r1)
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r4)
            java.lang.Object r0 = r0.FH3()
            X.Dr5 r0 = (X.C47128Dr5) r0
            boolean r0 = r0.A00
            X.C308436Ug.A00(r1, r3, r0)
            r0 = -1118039971(0xffffffffbd5c105d, float:-0.053726543)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -434626524(0xffffffffe6182024, float:-1.7959815E23)
            goto L_0x168c
        L_0x159d:
            r0 = -6452612(0xffffffffff9d8a7c, float:NaN)
            int r2 = X.AnonymousClass0fD.A03(r0)
            r0 = 1488038450(0x58b1aa32, float:1.56275633E15)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r3 = r1.A01
            X.6Rx r3 = (X.C307896Rx) r3
            java.lang.Object r0 = r1.A02
            X.DbZ.A1V(r3, r0)
            r0 = -1272232425(0xffffffffb42b4617, float:-1.5951115E-7)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -77760458(0xfffffffffb5d7836, float:-1.1499358E36)
            goto L_0x168c
        L_0x15bf:
            r0 = 2097586527(0x7d06a15f, float:1.1184652E37)
            int r2 = X.AnonymousClass0fD.A03(r0)
            r0 = 1864905073(0x6f283171, float:5.2053253E28)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r3 = r1.A01
            X.E4j r3 = (X.E4j) r3
            com.instagram.common.session.UserSession r0 = r3.A04
            X.9BF r0 = X.AnonymousClass9BE.A00(r0)
            r0.A01()
            java.lang.String r0 = "ig_manage_main_account_success"
            X.0xI r1 = X.0xI.A00(r3, r0)
            X.E4j.A03(r3, r1)
            X.E4j.A02(r3, r1)
            com.instagram.common.session.UserSession r0 = r3.A04
            X.C48310EcT.A00(r1, r0)
            r0 = -159518914(0xfffffffff67def3e, float:-1.2876011E33)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 615652391(0x24b21c27, float:7.7242887E-17)
            goto L_0x168c
        L_0x15f6:
            r0 = 1319921352(0x4eac66c8, float:1.44620851E9)
            int r2 = X.AnonymousClass0fD.A03(r0)
            r0 = -2108083537(0xffffffff825932af, float:-1.5957188E-37)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r6 = r1.A01
            X.E7A r6 = (X.E7A) r6
            X.E8s r3 = r6.A00
            java.lang.Object r1 = r1.A02
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            java.util.ArrayList r0 = r3.A00
            r0.remove(r1)
            X.C47580E8s.A00(r3)
            r6.getSession()
            java.lang.String r0 = r1.getId()
            java.lang.Long.parseLong(r0)
            X.FEd r1 = X.FA1.A01
            com.instagram.common.session.UserSession r0 = r6.getSession()
            r1.A02(r0)
            android.content.Context r0 = r6.getContext()
            if (r0 == 0) goto L_0x164e
            android.view.View r0 = r6.mView
            if (r0 == 0) goto L_0x164e
            android.content.Context r4 = r6.getContext()
            r0 = 2131952077(0x7f1301cd, float:1.9540587E38)
            java.lang.String r3 = r6.getString(r0)
            r1 = 1
            r0 = 0
            X.C59689JTv.A03(r4, r3, r0, r1)
            X.E8s r0 = r6.A00
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x164e
            X.DbT.A1I(r6)
        L_0x164e:
            r0 = 750552894(0x2cbc873e, float:5.3582963E-12)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -745766542(0xffffffffd38c8172, float:-1.20693431E12)
            goto L_0x168c
        L_0x1658:
            java.lang.String r0 = r0.A02
            boolean r0 = X.2R8.A05(r1, r0)
            if (r0 == 0) goto L_0x1683
            com.instagram.common.session.UserSession r0 = X.C46430Der.A03(r7)
            X.1Ng r4 = X.AnonymousClass1Nd.A00(r0)
            X.Df5 r3 = X.C46443Df5.FOLLOWERS
            com.instagram.user.model.User r0 = r7.A0C
            if (r0 == 0) goto L_0x1690
            X.4Cl r0 = r0.A03
            java.lang.Integer r0 = r0.B6v()
            if (r0 == 0) goto L_0x1690
            int r1 = r0.intValue()
            int r1 = r1 - r6
        L_0x167b:
            X.FWc r0 = new X.FWc
            r0.<init>(r3, r1)
            r4.A00(r0)
        L_0x1683:
            r0 = -818647368(0xffffffffcf346eb8, float:-3.02715494E9)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -790457935(0xffffffffd0e291b1, float:-3.04095908E10)
        L_0x168c:
            X.AnonymousClass0fD.A0A(r0, r2)
            return
        L_0x1690:
            r1 = -1
            goto L_0x167b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EDV.onSuccess(java.lang.Object):void");
    }
}
