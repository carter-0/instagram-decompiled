package X;

import android.app.Activity;
import android.app.Dialog;
import com.instagram.business.fragment.CategorySearchFragment;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.user.model.User;
import java.util.LinkedHashSet;
import org.webrtc.EglBase14Impl;

/* renamed from: X.EDb  reason: case insensitive filesystem */
public final class C47692EDb extends 1P0 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C47692EDb(0lg r1, C51961G9h g9h, F3P f3p, int i) {
        this.A00 = i;
        this.A01 = f3p;
        if (13 - i != 0) {
            this.A02 = g9h;
            this.A03 = r1;
        } else {
            this.A03 = r1;
            this.A02 = g9h;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0372, code lost:
        X.AnonymousClass0fD.A0A(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0375, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0380, code lost:
        X.AnonymousClass0fD.A0A(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0383, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFail(X.C268654dm r12) {
        /*
            r11 = this;
            int r0 = r11.A00
            switch(r0) {
                case 0: goto L_0x035d;
                case 1: goto L_0x032a;
                case 2: goto L_0x0302;
                case 3: goto L_0x02e4;
                case 4: goto L_0x02cc;
                case 5: goto L_0x0293;
                case 6: goto L_0x025a;
                case 7: goto L_0x0224;
                case 8: goto L_0x0206;
                case 9: goto L_0x01e9;
                case 10: goto L_0x0005;
                case 11: goto L_0x01bf;
                case 12: goto L_0x0198;
                case 13: goto L_0x0376;
                case 14: goto L_0x0182;
                case 15: goto L_0x016a;
                case 16: goto L_0x0150;
                case 17: goto L_0x0139;
                case 18: goto L_0x0122;
                case 19: goto L_0x0102;
                case 20: goto L_0x00e3;
                case 21: goto L_0x00c8;
                case 22: goto L_0x00b1;
                case 23: goto L_0x009a;
                case 24: goto L_0x0055;
                case 25: goto L_0x0034;
                case 26: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.C47692EDb.super.onFail(r12)
            return
        L_0x0009:
            r0 = 882539054(0x349a7a2e, float:2.8773633E-7)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r11.A02
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            boolean r0 = r0.isAdded()
            if (r0 == 0) goto L_0x002f
            java.lang.Object r3 = r11.A01
            android.content.Context r3 = (android.content.Context) r3
            r0 = 2131975959(0x7f135f17, float:1.9589025E38)
            java.lang.String r2 = r3.getString(r0)
            r0 = 284(0x11c, float:3.98E-43)
            java.lang.String r1 = X.Pxd.A00(r0)
            r0 = 0
            X.C59689JTv.A03(r3, r2, r1, r0)
        L_0x002f:
            r0 = 170980769(0xa30f5a1, float:8.5202894E-33)
            goto L_0x0372
        L_0x0034:
            r0 = -1354440382(0xffffffffaf44e142, float:-1.7906124E-10)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r11.A01
            android.content.Context r3 = X.DbT.A07(r0)
            r2 = 2131957617(0x7f131771, float:1.9551823E38)
            r1 = 0
            java.lang.String r0 = "delete_videos_failed"
            android.widget.Toast r0 = X.C59689JTv.A01(r3, r0, r2, r1)
            if (r0 == 0) goto L_0x0050
            r0.show()
        L_0x0050:
            r0 = -908190078(0xffffffffc9de1e82, float:-1819600.2)
            goto L_0x0372
        L_0x0055:
            r0 = 1597417045(0x5f36a655, float:1.31613E19)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.6ap r7 = X.DbS.A0a()
            java.lang.Object r6 = r11.A03
            X.FnN r6 = (X.C51031FnN) r6
            androidx.fragment.app.Fragment r5 = r6.A02
            android.content.Context r3 = r5.requireContext()
            r1 = 2131974276(0x7f135884, float:1.9585611E38)
            r2 = 1
            java.lang.Object r0 = r11.A01
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r0 = X.DbY.A0b(r3, r0, r1)
            r7.A0D = r0
            r7.A0L = r2
            android.content.Context r1 = r5.requireContext()
            r0 = 2131975553(0x7f135d81, float:1.9588202E38)
            X.DbW.A0q(r1, r7, r0)
            r7.A06()
            java.lang.Object r1 = r11.A02
            r0 = 14
            X.FdJ.A00(r7, r1, r6, r0)
            r7.A0J = r2
            r7.A0R = r2
            X.DbY.A1N(r7)
            r0 = -1025452094(0xffffffffc2e0d7c2, float:-112.4214)
            goto L_0x0372
        L_0x009a:
            r0 = 219099512(0xd0f3178, float:4.4124823E-31)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r11.A02
            X.4uI r2 = (X.C277014uI) r2
            X.6Tm r1 = X.AnonymousClass6Tm.A01
            java.lang.Object r0 = r11.A01
            X.DbS.A1R(r1, r2, r0)
            r0 = 863267828(0x33746bf4, float:5.690886E-8)
            goto L_0x0372
        L_0x00b1:
            r0 = 547848454(0x20a78106, float:2.837628E-19)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r11.A02
            X.4uI r2 = (X.C277014uI) r2
            X.6Tm r1 = X.AnonymousClass6Tm.A01
            java.lang.Object r0 = r11.A01
            X.DbS.A1R(r1, r2, r0)
            r0 = -1364552521(0xffffffffaeaa94b7, float:-7.757122E-11)
            goto L_0x0372
        L_0x00c8:
            r0 = 199940589(0xbead9ed, float:9.046142E-32)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r11.A01
            X.OLx r0 = (X.C70802OLx) r0
            X.NJB r0 = r0.A06
            android.app.Activity r1 = r0.getRootActivity()
            java.lang.String r0 = "something_went_wrong"
            X.C59689JTv.A0B(r1, r0)
            r0 = -606483138(0xffffffffdbd9cd3e, float:-1.22611472E17)
            goto L_0x0372
        L_0x00e3:
            r0 = -744598206(0xffffffffd39e5542, float:-1.36007044E12)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r11.A02
            X.0hq r0 = (X.0hq) r0
            X.SQH.A01(r0)
            java.lang.Object r1 = r11.A01
            android.content.Context r1 = (android.content.Context) r1
            X.Fs9 r0 = new X.Fs9
            r0.<init>(r1)
            X.11Z.A02(r0)
            r0 = 712695108(0x2a7add44, float:2.2281227E-13)
            goto L_0x0372
        L_0x0102:
            r0 = -1551140058(0xffffffffa38b7b26, float:-1.5122566E-17)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r11.A03
            X.E22 r0 = (X.E22) r0
            X.G7p r0 = r0.A01
            if (r0 == 0) goto L_0x0114
            r0.DED()
        L_0x0114:
            java.lang.Object r0 = r11.A02
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = (com.instagram.igds.components.switchbutton.IgdsSwitch) r0
            if (r0 == 0) goto L_0x011d
            r0.A00()
        L_0x011d:
            r0 = 445629136(0x1a8fc2d0, float:5.945815E-23)
            goto L_0x0372
        L_0x0122:
            r0 = 1538056312(0x5bace078, float:9.7321004E16)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r11.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r11.A03
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            X.C49807F7u.A01(r1, r0)
            r0 = 713508080(0x2a8744f0, float:2.4028652E-13)
            goto L_0x0372
        L_0x0139:
            r0 = 159446180(0x980f4a4, float:3.1044938E-33)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r11.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r11.A03
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            X.C49807F7u.A01(r1, r0)
            r0 = -319363258(0xffffffffecf6e746, float:-2.3879033E27)
            goto L_0x0372
        L_0x0150:
            r0 = 1507559810(0x59db8982, float:7.7242764E15)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r11.A03
            X.Fk3 r0 = (X.C50885Fk3) r0
            android.app.Activity r0 = r0.A00
            X.C59689JTv.A04(r0)
            java.lang.Object r0 = r11.A01
            X.DbS.A1V(r0)
            r0 = 747668466(0x2c9083f2, float:4.107375E-12)
            goto L_0x0372
        L_0x016a:
            r0 = -491876750(0xffffffffe2ae8e72, float:-1.6099989E21)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r11.A02
            X.0sL r2 = (X.0sL) r2
            java.lang.Boolean r1 = X.AnonymousClass7TE.A0u()
            r0 = 0
            r2.invoke(r1, r0)
            r0 = 1442206537(0x55f65349, float:3.38546959E13)
            goto L_0x0372
        L_0x0182:
            r0 = 2047631485(0x7a0c607d, float:1.8221964E35)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r11.A01
            X.F3P r1 = (X.F3P) r1
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r1.A00 = r0
            r0 = 1576379460(0x5df5a444, float:2.2125434E18)
            goto L_0x0372
        L_0x0198:
            r0 = 1597106021(0x5f31e765, float:1.2819326E19)
            int r4 = X.AnonymousClass7TG.A0D(r12, r0)
            X.C47692EDb.super.onFail(r12)
            java.lang.Object r2 = r11.A02
            X.1Xj r2 = (X.1Xj) r2
            r0 = 1
            r2.A4J(r0)
            java.lang.Object r1 = r11.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r0 = "enable_commenting_network_error"
            X.C59689JTv.A0E(r1, r0)
            java.lang.Object r0 = r11.A03
            X.0lg r0 = (X.0lg) r0
            r2.AE7(r0)
            r0 = 459021093(0x1b5c1b25, float:1.8206744E-22)
            goto L_0x0372
        L_0x01bf:
            r0 = -967811409(0xffffffffc6505eaf, float:-13335.671)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = 0
            X.0qQ.A0B(r12, r0)
            X.C47692EDb.super.onFail(r12)
            java.lang.Object r2 = r11.A02
            X.1Xj r2 = (X.1Xj) r2
            r2.A4J(r0)
            java.lang.Object r1 = r11.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r0 = "disable_commenting_network_error"
            X.C59689JTv.A0E(r1, r0)
            java.lang.Object r0 = r11.A03
            X.0lg r0 = (X.0lg) r0
            r2.AE7(r0)
            r0 = 899548114(0x359e03d2, float:1.1773029E-6)
            goto L_0x0372
        L_0x01e9:
            r0 = -992862517(0xffffffffc4d21ecb, float:-1680.9623)
            int r4 = X.AnonymousClass7TG.A0D(r12, r0)
            java.lang.Object r0 = r11.A03
            X.2gj r0 = (X.C226392gj) r0
            com.instagram.common.session.UserSession r0 = r0.A01
            X.GWb r1 = X.C46550Dgs.A00(r0)
            java.lang.Object r0 = r11.A02
            X.90k r0 = (X.C3723390k) r0
            r1.A01(r12, r0)
            r0 = -603745098(0xffffffffdc0394b6, float:-1.48146925E17)
            goto L_0x0372
        L_0x0206:
            r0 = 1141841683(0x440f1f13, float:572.48553)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r11.A03
            X.Ebf r0 = (X.C48260Ebf) r0
            r0.A00()
            java.lang.Object r0 = r11.A01
            android.content.Context r1 = X.DbT.A08(r0)
            java.lang.String r0 = "onLocationDetailDirectMessage onFail"
            X.C59689JTv.A0A(r1, r0)
            r0 = 176865984(0xa8ac2c0, float:1.3362173E-32)
            goto L_0x0372
        L_0x0224:
            r0 = -1440011092(0xffffffffaa2b2cac, float:-1.520335E-13)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r4 = r11.A03
            X.E6o r4 = (X.C47528E6o) r4
            X.E9N r3 = r4.A03
            java.lang.String r0 = "userListAdapter"
            if (r3 != 0) goto L_0x023d
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x023d:
            r0 = 0
            r3.A0C = r0
            java.lang.Object r2 = r11.A01
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r1 = r11.A02
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            X.Fmb r0 = new X.Fmb
            r0.<init>(r4, r1, r2)
            r3.A04 = r0
            r0 = 1
            r3.A0A = r0
            r3.A03()
            r0 = -1169925256(0xffffffffba445b78, float:-7.4904365E-4)
            goto L_0x0380
        L_0x025a:
            r0 = 320050559(0x1313957f, float:1.8627716E-27)
            int r4 = X.AnonymousClass7TG.A0D(r12, r0)
            java.lang.Object r0 = r11.A03
            X.DgR r0 = (X.C46524DgR) r0
            com.instagram.common.session.UserSession r6 = r0.A03
            X.0iw r5 = r0.A02
            java.lang.Object r0 = r11.A02
            com.instagram.pendingmedia.model.recipients.PendingRecipient r0 = (com.instagram.pendingmedia.model.recipients.PendingRecipient) r0
            java.lang.String r8 = r0.getId()
            java.lang.Object r0 = r11.A01
            X.3gp r0 = (X.C247733gp) r0
            java.lang.String r9 = r0.A0G
            java.lang.String r1 = "Failed to load post link."
            X.1XT r0 = X.DbT.A0L(r12)
            if (r0 == 0) goto L_0x0291
            java.lang.String r0 = r0.getErrorMessage()
        L_0x0283:
            java.lang.String r10 = X.002.A0R(r1, r0)
            java.lang.String r7 = "open_thread_error"
            X.C3265677h.A0S(r5, r6, r7, r8, r9, r10)
            r0 = -1416806700(0xffffffffab8d3ed4, float:-1.0036091E-12)
            goto L_0x0372
        L_0x0291:
            r0 = 0
            goto L_0x0283
        L_0x0293:
            r0 = -1913677479(0xffffffff8def9959, float:-1.4766429E-30)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r5 = 0
            X.0qQ.A0B(r12, r5)
            X.C47692EDb.super.onFail(r12)
            java.lang.Object r3 = r11.A03
            X.Ne6 r3 = (X.C69067Ne6) r3
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.C69067Ne6.A00(r3, r0)
            java.lang.Object r0 = r11.A01
            X.F1i r0 = (X.C49676F1i) r0
            X.Ggv r0 = r0.A00
            android.content.Context r2 = r0.A01
            r0 = 2131960482(0x7f1322a2, float:1.9557634E38)
            java.lang.String r1 = r2.getString(r0)
            java.lang.String r0 = "ERROR"
            X.C59689JTv.A03(r2, r1, r0, r5)
            X.02m r2 = r3.A01
            r1 = 834875525(0x31c33085, float:5.680763E-9)
            r0 = 3
            r2.markerEnd(r1, r0)
            r0 = -7267713(0xffffffffff911a7f, float:NaN)
            goto L_0x0372
        L_0x02cc:
            r0 = -1017713577(0xffffffffc356ec57, float:-214.9232)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r11.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r1 = "view_on_facebook_failed"
            r0 = 2131976648(0x7f1361c8, float:1.9590422E38)
            X.C59689JTv.A0F(r2, r1, r0)
            r0 = -1372901010(0xffffffffae2b316e, float:-3.89248E-11)
            goto L_0x0372
        L_0x02e4:
            r0 = -266099969(0xfffffffff023a2ff, float:-2.0257243E29)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r11.A01
            X.F24 r0 = (X.F24) r0
            r0.A00()
            java.lang.Object r0 = r11.A03
            X.30l r0 = (X.C2355930l) r0
            android.app.Activity r1 = r0.A00
            r0 = 2131961740(0x7f13278c, float:1.9560185E38)
            X.C59689JTv.A07(r1, r0)
            r0 = -1613540527(0xffffffff9fd35351, float:-8.949981E-20)
            goto L_0x0372
        L_0x0302:
            r0 = -1095890925(0xffffffffbeae0813, float:-0.33990535)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Throwable r1 = r12.A01()
            if (r1 == 0) goto L_0x0314
            java.lang.String r0 = "Failed to get RN checkpoint"
            X.0wb.A07(r0, r1)
        L_0x0314:
            java.lang.Object r2 = r11.A01
            X.FZ1 r2 = (X.FZ1) r2
            r0 = 0
            r2.A02 = r0
            java.lang.Object r1 = r11.A03
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r11.A02
            X.F0A r0 = (X.F0A) r0
            X.FZ1.A00(r1, r2, r0)
            r0 = -1726561043(0xffffffff9916c4ed, float:-7.794587E-24)
            goto L_0x0372
        L_0x032a:
            r0 = -988280994(0xffffffffc518075e, float:-2432.4604)
            int r4 = X.AnonymousClass7TG.A0D(r12, r0)
            java.lang.Object r1 = r11.A01
            android.content.Context r1 = (android.content.Context) r1
            r0 = 2131974879(0x7f135adf, float:1.9586835E38)
            java.lang.String r0 = r1.getString(r0)
            java.lang.String r3 = X.C319126q5.A04(r12, r0)
            X.0qQ.A07(r3)
            java.lang.String r2 = X.C319126q5.A02(r12)
            X.0qQ.A07(r2)
            java.lang.String r1 = X.C319126q5.A01(r12)
            if (r1 != 0) goto L_0x0352
            java.lang.String r1 = "NO_INTERNET"
        L_0x0352:
            java.lang.Object r0 = r11.A02
            com.instagram.business.fragment.CategorySearchFragment r0 = (com.instagram.business.fragment.CategorySearchFragment) r0
            r0.DeL(r3, r2, r1)
            r0 = -471671885(0xffffffffe3e2dbb3, float:-8.3695903E21)
            goto L_0x0372
        L_0x035d:
            r0 = -580285828(0xffffffffdd698a7c, float:-1.05177496E18)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r11.A02
            X.G7u r1 = (X.C51926G7u) r1
            java.lang.Object r0 = r11.A03
            X.16V r0 = (X.16V) r0
            r1.Det(r0)
            r0 = 1435427067(0x558ee0fb, float:1.96371169E13)
        L_0x0372:
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        L_0x0376:
            r0 = 821533504(0x30f79b40, float:1.801574E-9)
            int r5 = X.AnonymousClass0fD.A03(r0)
            r0 = -1664182344(0xffffffff9cce97b8, float:-1.3671155E-21)
        L_0x0380:
            X.AnonymousClass0fD.A0A(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47692EDb.onFail(X.4dm):void");
    }

    public final void onFailInBackground(C268654dm r4) {
        int i;
        int i2;
        switch (this.A00) {
            case 17:
                i = AnonymousClass0fD.A03(2118169014);
                ((User) this.A03).A0i((0lg) this.A02);
                i2 = -182496113;
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                i = AnonymousClass0fD.A03(-1674821571);
                ((User) this.A03).A0j((0lg) this.A02);
                i2 = -756703087;
                break;
            default:
                C47692EDb.super.onFailInBackground(r4);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final void onFinish() {
        int i;
        int i2;
        switch (this.A00) {
            case 1:
                i = AnonymousClass0fD.A03(-960267287);
                ((CategorySearchFragment) this.A02).DeS();
                i2 = -1336131747;
                break;
            case 9:
                i = AnonymousClass0fD.A03(1913003783);
                C46550Dgs.A00(((C226392gj) this.A03).A01).A03((C3723390k) this.A02);
                i2 = -1895362343;
                break;
            case 10:
                i = AnonymousClass0fD.A03(-1328682753);
                C47692EDb.super.onFinish();
                ((GV5) this.A01).A05.removeAll((LinkedHashSet) this.A02);
                i2 = -1034440419;
                break;
            case 15:
                i = AnonymousClass0fD.A03(624592712);
                Dba.A0m((Activity) this.A01, 2dZ.A0t);
                i2 = -1338419643;
                break;
            case 21:
                i = AnonymousClass0fD.A03(645449418);
                C49960FGs.A02((Activity) this.A02);
                IgdsButton igdsButton = ((C70802OLx) this.A01).A06.A08;
                if (igdsButton != null) {
                    igdsButton.setLoading(false);
                }
                i2 = 1623676204;
                break;
            case 25:
                i = AnonymousClass0fD.A03(1107818257);
                ((F3H) this.A02).A00();
                i2 = -886211930;
                break;
            default:
                C47692EDb.super.onFinish();
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final void onStart() {
        int i;
        int i2;
        switch (this.A00) {
            case 1:
                i = AnonymousClass0fD.A03(406808165);
                ((CategorySearchFragment) this.A02).Dei();
                i2 = -1934511278;
                break;
            case 8:
                i = AnonymousClass0fD.A03(1795612933);
                ((C48260Ebf) this.A03).A01();
                i2 = -226099876;
                break;
            case 9:
                i = AnonymousClass0fD.A03(969700056);
                C46550Dgs.A00(((C226392gj) this.A03).A01).A04((C3723390k) this.A02, (Integer) null);
                i2 = 1934169792;
                break;
            case 15:
                i = AnonymousClass0fD.A03(-1473274373);
                Dba.A0n((Activity) this.A01, 2dZ.A0t);
                i2 = -1502608685;
                break;
            case 16:
                i = AnonymousClass0fD.A03(620419978);
                AnonymousClass0fN.A00((Dialog) this.A01);
                i2 = 473702218;
                break;
            case 25:
                i = AnonymousClass0fD.A03(-1277957557);
                ((F3H) this.A02).A01();
                i2 = -871187651;
                break;
            default:
                C47692EDb.super.onStart();
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    /* JADX WARNING: type inference failed for: r1v47, types: [X.1qK, java.lang.Object, X.6uh] */
    /* JADX WARNING: type inference failed for: r0v118, types: [X.1xE, java.lang.Object, X.FVf] */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x069c, code lost:
        if (X.182.A06(r6, X.DbT.A0X(r9), 36318685836614007L) != false) goto L_0x069e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0745, code lost:
        X.0qQ.A0F(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x074c, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x083d, code lost:
        X.AnonymousClass0fD.A0A(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0840, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x09b8, code lost:
        if ("true".equals(r1.get("big_blue_token")) == false) goto L_0x09ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0ac1, code lost:
        X.AnonymousClass0fD.A0A(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0ac4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x03d1, code lost:
        r4 = (X.C48242EbN) r11.next();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r27) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            int r2 = r0.A00
            switch(r2) {
                case 0: goto L_0x0a95;
                case 1: goto L_0x06c9;
                case 2: goto L_0x0943;
                case 3: goto L_0x0913;
                case 4: goto L_0x0891;
                case 5: goto L_0x0854;
                case 6: goto L_0x07a7;
                case 7: goto L_0x0652;
                case 8: goto L_0x0527;
                case 9: goto L_0x04e6;
                case 10: goto L_0x049c;
                case 11: goto L_0x0009;
                case 12: goto L_0x0009;
                case 13: goto L_0x0397;
                case 14: goto L_0x0348;
                case 15: goto L_0x0310;
                case 16: goto L_0x02b5;
                case 17: goto L_0x0285;
                case 18: goto L_0x0255;
                case 19: goto L_0x01e1;
                case 20: goto L_0x016f;
                case 21: goto L_0x0106;
                case 22: goto L_0x00e2;
                case 23: goto L_0x00be;
                case 24: goto L_0x0076;
                case 25: goto L_0x0043;
                case 26: goto L_0x000d;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.C47692EDb.super.onSuccess(r1)
            return
        L_0x000d:
            r1 = -1051838619(0xffffffffc14e3765, float:-12.888524)
            int r4 = X.AnonymousClass0fD.A03(r1)
            r1 = -533704597(0xffffffffe030506b, float:-5.081909E19)
            int r3 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r1 = r0.A02
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            boolean r1 = r1.isAdded()
            if (r1 == 0) goto L_0x0038
            java.lang.Object r2 = r0.A01
            android.content.Context r2 = (android.content.Context) r2
            r1 = 2131967911(0x7f133fa7, float:1.9572702E38)
            X.DbU.A0z(r2, r1)
            java.lang.Object r0 = r0.A03
            X.6Z5 r0 = (X.AnonymousClass6Z5) r0
            X.4mU r0 = r0.A17
            r0.EHd()
        L_0x0038:
            r0 = 1848128340(0x6e283354, float:1.3013883E28)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = -760521717(0xffffffffd2ab5c0b, float:-3.67991816E11)
            goto L_0x083d
        L_0x0043:
            r1 = -12000581(0xffffffffff48e2bb, float:-2.6702285E38)
            int r4 = X.AnonymousClass0fD.A03(r1)
            r1 = 1109218436(0x421d5484, float:39.332535)
            int r5 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r1 = r0.A03
            X.3uh r1 = (X.C255773uh) r1
            java.lang.Object r3 = r0.A01
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r3 = (instagram.features.stories.dashboard.fragment.ReelDashboardFragment) r3
            com.instagram.common.session.UserSession r0 = r3.A06
            java.util.List r2 = X.C64020LJh.A01(r0, r1)
            android.content.Context r1 = r3.getContext()
            com.instagram.common.session.UserSession r0 = r3.A06
            r2.getClass()
            X.C49102EpR.A00(r1, r0, r2)
            r0 = -307883181(0xffffffffeda61353, float:-6.424734E27)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -1503099066(0xffffffffa6688746, float:-8.06745E-16)
            goto L_0x083d
        L_0x0076:
            r1 = -2129042487(0xffffffff811963c9, float:-2.8173254E-38)
            int r4 = X.AnonymousClass0fD.A03(r1)
            r1 = -1286799929(0xffffffffb34cfdc7, float:-4.772826E-8)
            int r8 = X.AnonymousClass0fD.A03(r1)
            X.6ap r7 = X.DbS.A0a()
            java.lang.Object r6 = r0.A03
            X.FnN r6 = (X.C51031FnN) r6
            androidx.fragment.app.Fragment r1 = r6.A02
            android.content.Context r5 = r1.requireContext()
            r3 = 2131974280(0x7f135888, float:1.958562E38)
            r2 = 1
            java.lang.Object r1 = r0.A01
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            java.lang.String r1 = X.DbY.A0b(r5, r1, r3)
            r7.A0D = r1
            r7.A06()
            r7.A0J = r2
            r7.A0R = r2
            X.DbY.A1N(r7)
            X.G7s r1 = r6.A07
            java.lang.Object r0 = r0.A02
            X.Tzd r0 = (X.C14631Tzd) r0
            r1.FId(r0)
            r0 = 1553146636(0x5c93230c, float:3.31322848E17)
            X.AnonymousClass0fD.A0A(r0, r8)
            r0 = -264313053(0xfffffffff03ee723, float:-2.3632632E29)
            goto L_0x083d
        L_0x00be:
            r1 = -1648047587(0xffffffff9dc4ca1d, float:-5.208975E-21)
            int r4 = X.AnonymousClass0fD.A03(r1)
            r1 = 1318003737(0x4e8f2419, float:1.20075379E9)
            int r3 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r2 = r0.A03
            X.4uI r2 = (X.C277014uI) r2
            X.6Tm r1 = X.AnonymousClass6Tm.A01
            java.lang.Object r0 = r0.A01
            X.DbS.A1R(r1, r2, r0)
            r0 = 244204945(0xe8e4591, float:3.5072693E-30)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 1831065780(0x6d23d8b4, float:3.1692522E27)
            goto L_0x083d
        L_0x00e2:
            r1 = 1034344660(0x3da6d8d4, float:0.081468254)
            int r4 = X.AnonymousClass0fD.A03(r1)
            r1 = -1635811296(0xffffffff9e7f8020, float:-1.3526083E-20)
            int r3 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r2 = r0.A03
            X.4uI r2 = (X.C277014uI) r2
            X.6Tm r1 = X.AnonymousClass6Tm.A01
            java.lang.Object r0 = r0.A01
            X.DbS.A1R(r1, r2, r0)
            r0 = 1579726619(0x5e28b71b, float:3.03930385E18)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 175718711(0xa794137, float:1.20011795E-32)
            goto L_0x083d
        L_0x0106:
            r2 = 944492431(0x384bcf8f, float:4.8592276E-5)
            int r4 = X.AnonymousClass0fD.A03(r2)
            X.NHU r1 = (X.NHU) r1
            r2 = 1804129959(0x6b88d6a7, float:3.3085516E26)
            int r3 = X.AnonymousClass0fD.A03(r2)
            java.lang.Integer r5 = r1.A01()
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            if (r5 != r2) goto L_0x0164
            java.lang.Object r6 = r0.A01
            X.OLx r6 = (X.C70802OLx) r6
            X.Pvi r2 = r6.A07
            r10 = 0
            r2.DE3(r10)
            java.lang.Object r8 = r0.A03
            X.7Pu r8 = (X.C331157Pu) r8
            r8.A05()
            X.OM1 r0 = r1.A00()
            java.util.HashMap r0 = r0.A0B
            r2.FLN(r0)
            com.instagram.common.session.UserSession r2 = r6.A02
            X.7Pr r5 = X.DbS.A0W(r2)
            boolean r0 = r6.A0C
            X.DbS.A1S(r5, r0)
            float r0 = r6.A00
            r5.A03 = r0
            android.os.Bundle r7 = X.DbY.A09(r2)
            com.instagram.user.model.User r9 = r6.A04
            java.lang.String r2 = r6.A09
            java.lang.String r0 = "ReportingConstants.ARG_CONTENT_ID"
            r7.putString(r0, r2)
            boolean r2 = r6.A0B
            java.lang.String r0 = "ReportingConstants.ARG_IS_ENCRYPTED_THREAD"
            r7.putBoolean(r0, r2)
            r11 = r10
            r12 = r1
            X.NKY r0 = X.O3H.A00(r7, r8, r9, r10, r11, r12)
            r8.A0E(r0, r5)
        L_0x0164:
            r0 = 2003635816(0x776d0e68, float:4.8080725E33)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 16871543(0x1017077, float:2.3774248E-38)
            goto L_0x083d
        L_0x016f:
            r2 = 1340972467(0x4fed9db3, float:7.9730703E9)
            int r2 = X.AnonymousClass0fD.A03(r2)
            X.EM1 r1 = (X.EM1) r1
            r3 = 1664192276(0x63318f14, float:3.2753836E21)
            int r4 = X.AnonymousClass0fD.A03(r3)
            r15 = 0
            X.0qQ.A0B(r1, r15)
            java.lang.Object r3 = r0.A03
            X.0lg r3 = (X.0lg) r3
            X.FZ1 r7 = X.F5E.A00(r3)
            X.0qQ.A07(r7)
            r7.A01()
            java.lang.Integer r5 = r1.A00
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            if (r5 != r3) goto L_0x01be
            java.lang.Object r6 = r0.A01
            android.content.Context r6 = (android.content.Context) r6
            java.lang.String r5 = r1.A07
            java.util.HashMap r3 = r1.A09
            if (r3 != 0) goto L_0x01a5
            java.util.Map r3 = java.util.Collections.emptyMap()
        L_0x01a5:
            X.0qQ.A07(r3)
            r1 = 0
            r7.A04(r6, r5, r1, r3)
        L_0x01ac:
            java.lang.Object r0 = r0.A02
            X.0hq r0 = (X.0hq) r0
            X.SQH.A01(r0)
            r0 = -1897667862(0xffffffff8ee3e2ea, float:-5.617833E-30)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -861199066(0xffffffffccab2526, float:-8.9729328E7)
            goto L_0x0ac1
        L_0x01be:
            java.lang.Integer r3 = X.AnonymousClass05K.A0N
            if (r5 != r3) goto L_0x01ac
            java.lang.Object r8 = r0.A01
            android.content.Context r8 = (android.content.Context) r8
            r9 = 0
            java.lang.String r10 = r1.A03
            X.0qQ.A07(r10)
            java.lang.String r11 = r1.A08
            X.0qQ.A07(r11)
            java.lang.String r12 = r1.A06
            X.0qQ.A07(r12)
            java.lang.String r13 = r1.A04
            X.0qQ.A07(r13)
            java.lang.String r14 = r1.A05
            r7.A03(r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x01ac
        L_0x01e1:
            r2 = -265377205(0xfffffffff02eaa4b, float:-2.1622505E29)
            int r4 = X.AnonymousClass0fD.A03(r2)
            X.DwR r1 = (X.DwR) r1
            r2 = 641343764(0x263a2114, float:6.457654E-16)
            int r6 = X.AnonymousClass7TG.A0D(r1, r2)
            java.lang.Object r7 = r0.A03
            X.E22 r7 = (X.E22) r7
            X.G7p r2 = r7.A01
            if (r2 == 0) goto L_0x01fc
            r2.onSuccess()
        L_0x01fc:
            java.lang.Object r0 = r0.A01
            int r2 = X.AnonymousClass7TE.A0M(r0)
            r0 = 1
            if (r2 == r0) goto L_0x0244
            r0 = 2
            if (r2 != r0) goto L_0x0239
            X.6rp r0 = r1.A00()
            java.lang.Boolean r0 = r0.A06
            if (r0 == 0) goto L_0x0239
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0239
            java.lang.String r5 = "1498217197657639"
        L_0x0218:
            androidx.fragment.app.FragmentActivity r3 = r7.getActivity()
            if (r3 == 0) goto L_0x0239
            X.1Wj r0 = X.1Wj.A00
            if (r0 == 0) goto L_0x0239
            X.1Wj r2 = X.DcL.A00()
            X.0eM r0 = r7.A04
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r7.A05
            java.lang.String r0 = X.DbW.A0l(r0)
            java.util.HashMap r0 = X.C70342O2u.A00(r0)
            r2.A00(r3, r1, r5, r0)
        L_0x0239:
            r0 = -993820935(0xffffffffc4c37ef9, float:-1563.9679)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = 627079298(0x25607882, float:1.9469733E-16)
            goto L_0x083d
        L_0x0244:
            X.6rp r0 = r1.A00()
            java.lang.Boolean r0 = r0.A05
            if (r0 == 0) goto L_0x0239
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0239
            java.lang.String r5 = "328043986265412"
            goto L_0x0218
        L_0x0255:
            r1 = -1926755285(0xffffffff8d280c2b, float:-5.1783644E-31)
            int r2 = X.AnonymousClass0fD.A03(r1)
            r1 = 94720488(0x5a551e8, float:1.5546613E-35)
            int r4 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r3 = r0.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r0 = r0.A03
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            boolean r1 = r0.A25()
            r0 = 2131969652(0x7f134674, float:1.9576233E38)
            if (r1 == 0) goto L_0x0277
            r0 = 2131969653(0x7f134675, float:1.9576235E38)
        L_0x0277:
            X.C59689JTv.A07(r3, r0)
            r0 = -672666315(0xffffffffd7e7ed35, float:-5.10011965E14)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -1980525323(0xffffffff89f394f5, float:-5.86402E-33)
            goto L_0x0ac1
        L_0x0285:
            r1 = -144099830(0xfffffffff769360a, float:-4.730083E33)
            int r2 = X.AnonymousClass0fD.A03(r1)
            r1 = 1726462766(0x66e7bb2e, float:5.4715976E23)
            int r4 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r3 = r0.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r0 = r0.A03
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            boolean r1 = r0.A22()
            r0 = 2131955526(0x7f130f46, float:1.9547582E38)
            if (r1 == 0) goto L_0x02a7
            r0 = 2131955527(0x7f130f47, float:1.9547584E38)
        L_0x02a7:
            X.C59689JTv.A07(r3, r0)
            r0 = 1148057989(0x446df985, float:951.89874)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -1647765244(0xffffffff9dc91904, float:-5.3230123E-21)
            goto L_0x0ac1
        L_0x02b5:
            r2 = 1384207142(0x52815326, float:2.7772289E11)
            int r2 = X.AnonymousClass0fD.A03(r2)
            X.1XO r1 = (X.1XO) r1
            r3 = 96104961(0x5ba7201, float:1.7533234E-35)
            int r5 = X.AnonymousClass0fD.A03(r3)
            r4 = 0
            X.0qQ.A0B(r1, r4)
            java.util.List r3 = r1.A06
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0306
            java.util.List r1 = r1.A06
            X.1Xj r3 = X.DbZ.A0T(r1, r4)
            java.lang.Object r1 = r0.A02
            X.1E8 r1 = (X.1E8) r1
            X.0qQ.A0A(r3)
            r1.A03(r3)
            java.lang.Object r1 = r0.A03
            X.Fk3 r1 = (X.C50885Fk3) r1
            X.C50885Fk3.A00(r3, r1)
        L_0x02e8:
            android.os.Handler r4 = new android.os.Handler
            r4.<init>()
            java.lang.Object r0 = r0.A01
            X.6ST r0 = (X.AnonymousClass6ST) r0
            X.Wuf r3 = new X.Wuf
            r3.<init>(r0)
            r0 = 200(0xc8, double:9.9E-322)
            r4.postDelayed(r3, r0)
            r0 = -1896198092(0xffffffff8efa5034, float:-6.170699E-30)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 1138963397(0x43e333c5, float:454.40445)
            goto L_0x0ac1
        L_0x0306:
            java.lang.Object r1 = r0.A03
            X.Fk3 r1 = (X.C50885Fk3) r1
            android.app.Activity r1 = r1.A00
            X.C59689JTv.A04(r1)
            goto L_0x02e8
        L_0x0310:
            r2 = 770498264(0x2decded8, float:2.6929056E-11)
            int r4 = X.AnonymousClass0fD.A03(r2)
            X.DwB r1 = (X.DwB) r1
            r2 = 2094803027(0x7cdc2853, float:9.1449854E36)
            int r5 = X.AnonymousClass7TG.A0D(r1, r2)
            java.lang.Object r2 = r0.A03
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            X.17i r3 = X.17h.A00(r2)
            com.instagram.user.model.User r2 = r1.A00
            X.0qQ.A07(r2)
            r3.A03(r2)
            java.lang.Object r3 = r0.A02
            X.0sL r3 = (X.0sL) r3
            java.lang.Boolean r2 = X.AnonymousClass7TE.A0v()
            com.instagram.user.model.User r0 = r1.A00
            r3.invoke(r2, r0)
            r0 = 626046495(0x2550b61f, float:1.8102829E-16)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 546556680(0x2093cb08, float:2.5037123E-19)
            goto L_0x083d
        L_0x0348:
            r2 = -2138640032(0xffffffff8086f160, float:-1.2392546E-38)
            int r2 = X.AnonymousClass0fD.A03(r2)
            X.Dv8 r1 = (X.Dv8) r1
            r3 = -1085362952(0xffffffffbf4eacf8, float:-0.8073268)
            int r7 = X.AnonymousClass0fD.A03(r3)
            java.util.List r1 = r1.A00
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r5 = r1.iterator()
        L_0x0362:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x037b
            java.lang.Object r1 = r5.next()
            X.EwN r1 = (X.C49482EwN) r1
            X.F1D r4 = r1.A00
            java.lang.String r3 = r1.A01
            X.ENO r1 = new X.ENO
            r1.<init>(r4, r3)
            r6.add(r1)
            goto L_0x0362
        L_0x037b:
            java.lang.Object r3 = r0.A01
            X.F3P r3 = (X.F3P) r3
            r3.A00 = r6
            java.lang.Object r1 = r0.A02
            X.G9h r1 = (X.C51961G9h) r1
            java.lang.Object r0 = r0.A03
            X.0lg r0 = (X.0lg) r0
            r3.A01(r0, r1)
            r0 = -773839023(0xffffffffd1e02751, float:-1.20341537E11)
            X.AnonymousClass0fD.A0A(r0, r7)
            r0 = 1629635723(0x6122448b, float:1.8708197E20)
            goto L_0x0ac1
        L_0x0397:
            r2 = 1510524159(0x5a08c4ff, float:9.6242991E15)
            int r2 = X.AnonymousClass0fD.A03(r2)
            X.Dv6 r1 = (X.C47339Dv6) r1
            r3 = -892075303(0xffffffffcad402d9, float:-6947180.5)
            int r6 = X.AnonymousClass0fD.A03(r3)
            java.util.List r3 = r1.A00
            if (r3 == 0) goto L_0x0471
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            if (r3 == 0) goto L_0x0471
            java.util.List r3 = r1.A00
            if (r3 == 0) goto L_0x046e
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
        L_0x03b9:
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0471
            java.util.List r1 = r1.A00
            if (r1 == 0) goto L_0x046b
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
        L_0x03c7:
            java.util.Iterator r11 = r1.iterator()
        L_0x03cb:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x0475
            java.lang.Object r4 = r11.next()
            X.EbN r4 = (X.C48242EbN) r4
            java.util.List r1 = r4.A03
            if (r1 == 0) goto L_0x0475
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            if (r1 == 0) goto L_0x0475
            X.EbB r3 = r4.A01
            if (r3 == 0) goto L_0x0475
            java.util.List r1 = r4.A03
            if (r1 == 0) goto L_0x0469
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
        L_0x03ed:
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0475
            java.lang.String r7 = r3.A01
            if (r7 == 0) goto L_0x0475
            java.util.List r1 = r4.A03
            if (r1 == 0) goto L_0x0467
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
        L_0x03ff:
            java.util.Iterator r10 = r1.iterator()
        L_0x0403:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x03cb
            java.lang.Object r9 = r10.next()
            X.Exi r9 = (X.C49547Exi) r9
            X.F1D r1 = r9.A00
            if (r1 == 0) goto L_0x03cb
            java.lang.String r1 = r9.A02
            if (r1 == 0) goto L_0x03cb
            java.lang.Object r8 = r0.A01
            X.F3P r8 = (X.F3P) r8
            X.FV8 r5 = X.FV8.A00()
            java.lang.Object r4 = r0.A03
            X.0lg r4 = (X.0lg) r4
            java.lang.String r3 = "ig_android_growth_fx_access_fb_ig_autocomplete"
            java.lang.String r1 = "AutoCompleteAccountHelper"
            java.lang.String r3 = r5.A02(r4, r3, r1)
            X.F1D r1 = r9.A00
            X.ENP r5 = new X.ENP
            r5.<init>(r1, r3, r7)
            java.util.List r1 = r8.mFacebookAutoCompleteAccountList
            java.util.Iterator r9 = r1.iterator()
        L_0x0438:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x0461
            java.lang.Object r3 = r9.next()
            X.ENP r3 = (X.ENP) r3
            X.F1D r1 = r3.A00
            java.lang.String r4 = r1.A0O
            if (r4 == 0) goto L_0x0438
            java.lang.String r3 = r3.A02
            if (r3 == 0) goto L_0x0438
            X.F1D r1 = r5.A00
            java.lang.String r1 = r1.A0O
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x0438
            java.lang.String r1 = r5.A02
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0438
            goto L_0x0403
        L_0x0461:
            java.util.List r1 = r8.mFacebookAutoCompleteAccountList
            r1.add(r5)
            goto L_0x0403
        L_0x0467:
            r1 = 0
            goto L_0x03ff
        L_0x0469:
            r1 = 0
            goto L_0x03ed
        L_0x046b:
            r1 = 0
            goto L_0x03c7
        L_0x046e:
            r3 = 0
            goto L_0x03b9
        L_0x0471:
            r0 = 906280941(0x3604bfed, float:1.9781248E-6)
            goto L_0x0494
        L_0x0475:
            java.lang.Object r3 = r0.A01
            X.F3P r3 = (X.F3P) r3
            java.lang.Object r1 = r0.A02
            X.G9h r1 = (X.C51961G9h) r1
            java.lang.Object r0 = r0.A03
            X.0lg r0 = (X.0lg) r0
            r3.A01(r0, r1)
            X.1xC r3 = X.1xC.A01
            r1 = 0
            X.FVf r0 = new X.FVf
            r0.<init>()
            r0.A00 = r1
            r3.A00(r0)
            r0 = 1456122983(0x56caac67, float:1.11420906E14)
        L_0x0494:
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = 1765651637(0x693db4b5, float:1.4333772E25)
            goto L_0x0ac1
        L_0x049c:
            r2 = 1216309397(0x487f6895, float:261538.33)
            int r2 = X.AnonymousClass0fD.A03(r2)
            X.CFK r1 = (X.CFK) r1
            r3 = 286593236(0x111510d4, float:1.1759213E-28)
            int r7 = X.AnonymousClass0fD.A03(r3)
            java.lang.Object r3 = r0.A03
            java.util.AbstractCollection r3 = (java.util.AbstractCollection) r3
            java.util.Iterator r6 = r3.iterator()
        L_0x04b4:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x04db
            java.lang.Object r5 = r6.next()
            X.1Xj r5 = (X.1Xj) r5
            java.util.HashMap r4 = r1.A00
            java.lang.String r3 = r5.getId()
            java.lang.Object r3 = r4.get(r3)
            X.Cto r3 = (X.C45285Cto) r3
            if (r3 == 0) goto L_0x04d1
            r5.A42(r3)
        L_0x04d1:
            java.lang.Object r3 = r0.A01
            X.GV5 r3 = (X.GV5) r3
            X.2rM r3 = r3.A04
            r3.Cs9(r5)
            goto L_0x04b4
        L_0x04db:
            r0 = 1191289839(0x4701a3ef, float:33187.934)
            X.AnonymousClass0fD.A0A(r0, r7)
            r0 = 407337172(0x184778d4, float:2.578115E-24)
            goto L_0x0ac1
        L_0x04e6:
            r2 = -621597868(0xffffffffdaf32b54, float:-3.42230296E16)
            int r4 = X.AnonymousClass0fD.A03(r2)
            X.90q r1 = (X.C3723890q) r1
            r2 = 492337854(0x1d587abe, float:2.8650818E-21)
            int r6 = X.AnonymousClass0fD.A03(r2)
            r5 = 0
            X.0qQ.A0B(r1, r5)
            java.lang.Object r3 = r0.A01
            X.90g r3 = (X.C3722990g) r3
            java.util.List r2 = r1.A03
            if (r2 == 0) goto L_0x050b
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x050b
            r3.A02(r1)
        L_0x050b:
            java.lang.Object r2 = r0.A03
            X.2gj r2 = (X.C226392gj) r2
            com.instagram.common.session.UserSession r2 = r2.A01
            X.GWb r2 = X.C46550Dgs.A00(r2)
            java.lang.Object r0 = r0.A02
            X.90k r0 = (X.C3723390k) r0
            r2.A02(r1, r0, r5)
            r0 = -559820001(0xffffffffdea1d31f, float:-5.830349E18)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = 1545851074(0x5c23d0c2, float:1.84439811E17)
            goto L_0x083d
        L_0x0527:
            r2 = 1693699078(0x64f3cc06, float:3.5978082E22)
            int r4 = X.AnonymousClass0fD.A03(r2)
            X.DvI r1 = (X.DvI) r1
            r2 = -1223017602(0xffffffffb71a3b7e, float:-9.192967E-6)
            int r3 = X.AnonymousClass0fD.A03(r2)
            java.lang.Object r2 = r0.A03
            X.Ebf r2 = (X.C48260Ebf) r2
            r2.A00()
            java.lang.Object r5 = r0.A01
            com.instagram.discovery.mediamap.fragment.MediaMapFragment r5 = (com.instagram.discovery.mediamap.fragment.MediaMapFragment) r5
            X.WGR r2 = r5.A0D
            java.lang.String r8 = r1.A00
            android.view.View r1 = r5.requireView()
            int r11 = r1.getHeight()
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            int r1 = X.2db.A01(r1)
            int r11 = r11 - r1
            java.lang.Object r7 = r0.A02
            com.instagram.discovery.mediamap.model.MediaMapPin r7 = (com.instagram.discovery.mediamap.model.MediaMapPin) r7
            com.instagram.discovery.mediamap.fragment.MediaMapFragment r9 = r2.A02
            androidx.fragment.app.FragmentActivity r6 = r9.getActivity()
            if (r6 == 0) goto L_0x05d0
            X.37D r5 = X.DbT.A0i(r6)
            r5.getClass()
            r0 = 4
            X.FmI r1 = new X.FmI
            r1.<init>(r2, r0)
            r0 = r5
            X.37F r0 = (X.AnonymousClass37F) r0
            r0.A0H = r1
            r10 = 1
            X.Lz9 r0 = new X.Lz9
            r0.<init>(r10, r6, r2)
            r5.A0Q(r0)
            com.instagram.discovery.mediamap.model.LocationPageInformation r0 = r7.A06
            if (r0 == 0) goto L_0x05db
            com.instagram.user.model.User r0 = r0.A00()
            if (r0 == 0) goto L_0x05db
            java.lang.String r8 = r0.getId()
            com.instagram.common.session.UserSession r7 = r2.A00
            android.content.Context r2 = r9.requireContext()
            X.0gy r1 = X.AnonymousClass07i.A00(r9)
            r0 = 0
            X.0qQ.A0B(r7, r0)
            X.R8n r6 = new X.R8n
            r15 = r11
            r11 = r6
            r12 = r5
            r13 = r7
            r14 = r8
            r16 = r10
            r11.<init>(r12, r13, r14, r15, r16)
            r0 = 0
            X.2lw r5 = new X.2lw
            r5.<init>(r2, r1, r0)
            X.1NY r2 = X.AnonymousClass7TG.A0b(r7)
            X.DbS.A1P(r2, r8)
            java.lang.String r1 = "entry_point"
            r0 = 5013(0x1395, float:7.025E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A9m(r1, r0)
            java.lang.String r0 = "business/account/validate_share_business_profile_via_story/"
            r2.A0A(r0)
            java.lang.Class<X.CFa> r1 = X.C43834CFa.class
            java.lang.Class<X.D2K> r0 = X.D2K.class
            X.1OC r0 = X.DbU.A0S(r2, r1, r0)
            r0.A00 = r6
            r5.schedule(r0)
        L_0x05d0:
            r0 = 1089568127(0x40f17d7f, float:7.5465693)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 1039760046(0x3df97aae, float:0.121816024)
            goto L_0x083d
        L_0x05db:
            com.instagram.common.session.UserSession r6 = r2.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316143215972353(0x81055700001001, double:3.029813430927584E-306)
            boolean r2 = X.182.A06(r2, r6, r0)
            X.1as r0 = X.1as.A04
            X.1ap r1 = r0.A02
            if (r2 == 0) goto L_0x0648
            X.2FW r0 = X.2FW.A1u
            X.F3w r0 = r1.A07(r9, r6, r0)
            com.instagram.model.venue.LocationDict r1 = r7.A09
            com.instagram.model.venue.Venue r1 = X.C18231Vnv.A00(r1)
            java.lang.String r6 = r1.A05()
            r1 = 0
            X.0qQ.A0B(r6, r1)
            android.os.Bundle r2 = r0.A07
            java.lang.String r1 = "DirectShareSheetConstants.location_id"
            r2.putString(r1, r6)
            com.instagram.model.venue.LocationDict r1 = r7.A09
            com.instagram.model.venue.Venue r1 = X.C18231Vnv.A00(r1)
            java.lang.String r1 = r1.A05()
            r0.A06(r1)
        L_0x0616:
            r9 = 0
            r12 = 0
            com.instagram.direct.intf.DirectShareSheetAppearance r8 = new com.instagram.direct.intf.DirectShareSheetAppearance
            r10 = r9
            r13 = r12
            r14 = r12
            r15 = r12
            r16 = r12
            r17 = r12
            r18 = r12
            r19 = r12
            r20 = r12
            r21 = r12
            r22 = r12
            r23 = r12
            r24 = r12
            r25 = r12
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            android.os.Bundle r2 = r0.A07
            r1 = 42
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r2.putParcelable(r1, r8)
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment r0 = r0.A00()
            r5.A0I(r0)
            goto L_0x05d0
        L_0x0648:
            X.2FW r0 = X.2FW.A17
            X.F3w r0 = r1.A07(r9, r6, r0)
            r0.A07(r8)
            goto L_0x0616
        L_0x0652:
            r1 = 1052096439(0x3eb5b7b7, float:0.35491726)
            int r5 = X.AnonymousClass0fD.A03(r1)
            r1 = 975483113(0x3a24b0e9, float:6.282465E-4)
            int r4 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r7 = r0.A03
            X.E6o r7 = (X.C47528E6o) r7
            java.util.List r2 = r7.A0B
            r2.clear()
            X.E9N r1 = r7.A03
            java.lang.String r10 = "userListAdapter"
            if (r1 == 0) goto L_0x0745
            java.util.List r1 = r1.A0R
            X.0qQ.A07(r1)
            r2.addAll(r1)
            X.E9N r8 = r7.A03
            if (r8 == 0) goto L_0x0745
            X.0eM r9 = r7.A0C
            X.0lg r3 = X.DbT.A0X(r9)
            X.0Tu r6 = X.0Tu.A06
            r1 = 36318685836679544(0x8107a700011978, double:3.0314213945011236E-306)
            boolean r1 = X.182.A06(r6, r3, r1)
            if (r1 != 0) goto L_0x069e
            X.0lg r3 = X.DbT.A0X(r9)
            r1 = 36318685836614007(0x8107a700001977, double:3.031421394459678E-306)
            boolean r1 = X.182.A06(r6, r3, r1)
            r2 = 1
            if (r1 == 0) goto L_0x069f
        L_0x069e:
            r2 = 0
        L_0x069f:
            java.lang.Object r1 = r0.A02
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            r8.A0B = r2
            r8.A07 = r1
            X.E9N r2 = r7.A03
            if (r2 == 0) goto L_0x0745
            r1 = 0
            r2.A0C = r1
            X.C47528E6o.A00(r7)
            X.E9N r1 = r7.A03
            if (r1 == 0) goto L_0x0745
            java.lang.Object r0 = r0.A01
            java.util.Collection r0 = (java.util.Collection) r0
            r1.A05(r0)
            r0 = -1238830527(0xffffffffb628f241, float:-2.5174961E-6)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 1648919550(0x624883fe, float:9.2471496E20)
            X.AnonymousClass0fD.A0A(r0, r5)
            return
        L_0x06c9:
            r2 = -69831578(0xfffffffffbd67466, float:-2.2270247E36)
            int r4 = X.AnonymousClass0fD.A03(r2)
            X.371 r1 = (X.AnonymousClass371) r1
            r2 = -936424477(0xffffffffc82f4be3, float:-179503.55)
            int r3 = X.AnonymousClass0fD.A03(r2)
            r9 = 0
            X.0qQ.A0B(r1, r9)
            java.lang.Object r1 = r1.FH3()
            X.BAt r1 = (X.C42019BAt) r1
            com.instagram.user.model.User r8 = r1.A00
            java.lang.Object r7 = r0.A03
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7
            X.1Ng r6 = X.AnonymousClass1Nd.A00(r7)
            java.lang.String r5 = r8.getId()
            r2 = 1
            X.6uh r1 = new X.6uh
            r1.<init>()
            r1.A00 = r5
            r1.A04 = r2
            r1.A01 = r2
            r1.A03 = r9
            r1.A02 = r2
            r6.A00(r1)
            X.1Av r1 = X.1Au.A00(r7)
            r1.A1g(r2)
            X.0xY r5 = X.AnonymousClass7TF.A0N(r7)
            java.lang.String r1 = "show_business_onboarding_check_list_tooltip"
            r5.E5T(r1, r9)
            r5.apply()
            X.DbT.A1S(r7, r8)
            r8.A0d(r7)
            java.lang.Object r6 = r0.A02
            com.instagram.business.fragment.CategorySearchFragment r6 = (com.instagram.business.fragment.CategorySearchFragment) r6
            com.instagram.business.fragment.CategorySearchFragment.A05(r6)
            X.EEJ r0 = r6.A09
            if (r0 == 0) goto L_0x072b
            r0.A00()
        L_0x072b:
            r6.APF()
            X.0wW r7 = r6.A0A
            X.DbS.A1Z(r7)
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7
            boolean r0 = X.FRZ.A00(r7)
            if (r0 == 0) goto L_0x0786
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = r6.A0C
            if (r0 != 0) goto L_0x074d
            java.lang.String r10 = "entryPoint"
        L_0x0745:
            X.0qQ.A0F(r10)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x074d:
            X.DbS.A1B(r5, r0)
            r0 = 2091(0x82b, float:2.93E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r5.putBoolean(r0, r2)
            r0 = 865(0x361, float:1.212E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r5.putBoolean(r0, r2)
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r1 = 2131440609(0x7f0b33e1, float:1.8503206E38)
            X.FTj r0 = new X.FTj
            r0.<init>()
            r2.put(r1, r0)
            X.F3v r1 = X.DbU.A0R()
            X.6qr r0 = X.C319586qr.SHORTENED_CREATOR_CONVERSION_FLOW
            androidx.fragment.app.Fragment r2 = r1.A00(r5, r2, r0, r7)
            androidx.fragment.app.FragmentActivity r1 = r6.requireActivity()
            X.0wW r0 = r6.A0A
            X.DbY.A14(r2, r1, r0)
            goto L_0x079c
        L_0x0786:
            X.2ZQ r1 = X.C71172bH.A00()
            r0 = 49
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0qQ.A0C(r1, r0)
            X.2ZS r1 = (X.2ZS) r1
            X.C240073Jm.A00 = r2
            X.1QK r0 = X.1QK.A0E
            r1.Enh(r0)
        L_0x079c:
            r0 = -1523961679(0xffffffffa52a30b1, float:-1.4761647E-16)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = -372688477(0xffffffffe9c939a3, float:-3.0408284E25)
            goto L_0x083d
        L_0x07a7:
            r2 = -1655342215(0xffffffff9d557b79, float:-2.825415E-21)
            int r4 = X.AnonymousClass0fD.A03(r2)
            X.DvJ r1 = (X.DvJ) r1
            r2 = -1489392072(0xffffffffa739ae38, float:-2.5768352E-15)
            int r11 = X.AnonymousClass7TG.A0D(r1, r2)
            X.C47692EDb.super.onSuccess(r1)
            X.1as r2 = X.1as.A04
            X.1ap r5 = r2.A02
            java.lang.Object r10 = r0.A03
            X.DgR r10 = (X.C46524DgR) r10
            com.instagram.common.session.UserSession r9 = r10.A03
            X.0iw r3 = r10.A02
            java.lang.String r2 = "private_reply_message"
            X.OOA r8 = r5.A06(r3, r9, r2)
            r7 = 1
            android.os.Bundle r6 = r8.A01
            r2 = 91
            java.lang.String r2 = X.C66579MXk.A00(r2)
            r6.putBoolean(r2, r7)
            java.lang.Object r12 = r0.A01
            X.3gp r12 = (X.C247733gp) r12
            X.1Xj r3 = r12.A07
            java.lang.String r2 = "Required value was null."
            if (r3 == 0) goto L_0x0841
            java.lang.String r17 = r3.getId()
            if (r17 == 0) goto L_0x0849
            java.lang.String r14 = r12.A0G
            java.lang.String r13 = r12.A0F
            java.lang.String r5 = r12.A0d
            long r2 = r12.A03
            java.lang.Object r0 = r0.A02
            com.instagram.pendingmedia.model.recipients.PendingRecipient r0 = (com.instagram.pendingmedia.model.recipients.PendingRecipient) r0
            java.lang.String r21 = r0.getId()
            java.lang.String r12 = r0.A0C
            com.instagram.common.typedurl.ImageUrl r0 = r0.A03
            java.lang.String r1 = r1.A00
            com.instagram.direct.intf.DirectReplyModalPrivateReplyInfo r15 = new com.instagram.direct.intf.DirectReplyModalPrivateReplyInfo
            r23 = r1
            r24 = r2
            r20 = r5
            r22 = r12
            r18 = r14
            r19 = r13
            r16 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r0 = 527(0x20f, float:7.38E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r6.putParcelable(r0, r15)
            X.NK2 r2 = r8.A00()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.fragment.replymodal.DirectReplyModalFragment"
            X.0qQ.A0C(r2, r0)
            X.7Pr r0 = X.DbS.A0W(r9)
            r0.A0T = r2
            r0.A11 = r7
            X.7Pu r1 = r0.A00()
            android.app.Activity r0 = r10.A00
            r1.A02(r0, r2)
            r0 = 2050056021(0x7a315f55, float:2.3024253E35)
            X.AnonymousClass0fD.A0A(r0, r11)
            r0 = -39646393(0xfffffffffda30b47, float:-2.709034E37)
        L_0x083d:
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        L_0x0841:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r2)
            r0 = -1664291753(0xffffffff9cccec57, float:-1.356068E-21)
            goto L_0x0850
        L_0x0849:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r2)
            r0 = -2129482945(0xffffffff8112ab3f, float:-2.6938828E-38)
        L_0x0850:
            X.AnonymousClass0fD.A0A(r0, r11)
            throw r1
        L_0x0854:
            r2 = -637511764(0xffffffffda0057ac, float:-9.0312983E15)
            int r2 = X.AnonymousClass0fD.A03(r2)
            r3 = -778931566(0xffffffffd1927292, float:-7.8623425E10)
            int r4 = X.AnonymousClass7TG.A0D(r1, r3)
            X.C47692EDb.super.onSuccess(r1)
            java.lang.Object r3 = r0.A01
            X.F1i r3 = (X.C49676F1i) r3
            java.lang.Object r1 = r0.A02
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r3.A00(r1)
            java.lang.Object r1 = r0.A03
            X.Ne6 r1 = (X.C69067Ne6) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.C69067Ne6.A00(r1, r0)
            X.02m r3 = r1.A01
            r1 = 834875525(0x31c33085, float:5.680763E-9)
            r0 = 2
            r3.markerEnd(r1, r0)
            r0 = -1242729732(0xffffffffb5ed72fc, float:-1.7691341E-6)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 1804039694(0x6b87760e, float:3.2752497E26)
            goto L_0x0ac1
        L_0x0891:
            r2 = -1597633588(0xffffffffa0c60bcc, float:-3.355031E-19)
            int r2 = X.AnonymousClass0fD.A03(r2)
            X.371 r1 = (X.AnonymousClass371) r1
            r3 = -2066291888(0xffffffff84d6e350, float:-5.051991E-36)
            int r4 = X.AnonymousClass7TG.A0D(r1, r3)
            java.lang.String r5 = X.C10065Rm2.A01
            java.lang.String r3 = "fb_shorts/viewer?video_id=%s&source=instagram"
            java.lang.String r5 = X.002.A0R(r5, r3)
            java.lang.Object r3 = r1.FH3()
            X.Dr4 r3 = (X.C47127Dr4) r3
            java.lang.String r3 = r3.A00
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r10 = X.0mp.A06(r5, r3)
            android.content.Context r3 = X.C60960kU.A00
            android.content.SharedPreferences r6 = android.preference.PreferenceManager.getDefaultSharedPreferences(r3)
            java.lang.String r5 = "com.instagram.common.api.facebook.FacebookURLBuilder.KEY_FACEBOOK_ENDPOINT"
            java.lang.String r3 = "facebook.com"
            java.lang.String r3 = r6.getString(r5, r3)
            java.lang.Object[] r5 = new java.lang.Object[]{r3}
            java.lang.String r3 = "https://mtouch.%s"
            java.lang.String r3 = X.0mp.A06(r3, r5)
            android.net.Uri$Builder r5 = X.DbW.A07(r3)
            java.lang.String r3 = "login"
            android.net.Uri$Builder r5 = r5.path(r3)
            java.lang.Object r1 = r1.FH3()
            X.Dr4 r1 = (X.C47127Dr4) r1
            java.lang.String r1 = r1.A00
            java.lang.Object[] r3 = new java.lang.Object[]{r1}
            java.lang.String r1 = "/reel/%s/"
            java.lang.String r3 = X.0mp.A06(r1, r3)
            java.lang.String r1 = "next"
            android.net.Uri r1 = X.DbV.A08(r5, r1, r3)
            java.lang.Object r5 = r0.A01
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r7 = r0.A03
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7
            java.lang.Object r6 = r0.A02
            X.0iw r6 = (X.AnonymousClass0iw) r6
            java.lang.String r9 = r1.toString()
            java.lang.String r8 = "ig_clips_facebook_info_api"
            X.FFi.A01(r5, r6, r7, r8, r9, r10)
            r0 = -102715309(0xfffffffff9e0b053, float:-1.4583135E35)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 198060988(0xbce2bbc, float:7.941412E-32)
            goto L_0x0ac1
        L_0x0913:
            r1 = -1018594806(0xffffffffc3497a0a, float:-201.47672)
            int r2 = X.AnonymousClass0fD.A03(r1)
            r1 = 205175599(0xc3abb2f, float:1.4385247E-31)
            int r4 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r3 = r0.A02
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            r1 = 0
            r3.A1A(r1)
            X.0eE r1 = X.AnonymousClass0t1.A01
            java.lang.Object r0 = r0.A03
            X.30l r0 = (X.C2355930l) r0
            com.instagram.common.session.UserSession r0 = r0.A01
            com.instagram.user.model.User r0 = r1.A01(r0)
            r0.A0W()
            r0 = -1146024602(0xffffffffbbb10d66, float:-0.0054032085)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -2033155111(0xffffffff86d083d9, float:-7.8434637E-35)
            goto L_0x0ac1
        L_0x0943:
            r2 = 2092295604(0x7cb5e5b4, float:7.555717E36)
            int r2 = X.AnonymousClass0fD.A03(r2)
            X.EM1 r1 = (X.EM1) r1
            r3 = -345758912(0xffffffffeb642340, float:-2.7580155E26)
            int r4 = X.AnonymousClass0fD.A03(r3)
            java.lang.Object r9 = r0.A01
            X.FZ1 r9 = (X.FZ1) r9
            boolean r3 = r9.A04
            if (r3 != 0) goto L_0x0967
            java.lang.String r5 = r1.A02
            if (r5 == 0) goto L_0x0975
            java.lang.String r3 = "close"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0975
        L_0x0967:
            r0 = 0
            r9.A02 = r0
            r0 = -1919426367(0xffffffff8d97e0c1, float:-9.360201E-31)
        L_0x096d:
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -1198388860(0xffffffffb8920984, float:-6.963595E-5)
            goto L_0x0ac1
        L_0x0975:
            java.lang.String r6 = r1.A03
            X.05G r5 = X.C49304Esn.A01
            java.util.Set r3 = X.C49304Esn.A00
            boolean r3 = X.00k.A0u(r3, r6)
            X.AnonymousClass7TF.A1O(r5, r3)
            java.lang.String r13 = r1.A08
            X.C49317Et0.A01 = r13
            java.lang.String r14 = r1.A06
            X.C49317Et0.A00 = r14
            java.lang.String r3 = r1.A05
            X.C49317Et0.A02 = r3
            java.lang.Integer r6 = r1.A00
            java.lang.Integer r5 = X.AnonymousClass05K.A0N
            if (r6 != r5) goto L_0x09c8
            java.lang.Object r10 = r0.A03
            android.content.Context r10 = (android.content.Context) r10
            java.lang.Object r11 = r0.A02
            X.F0A r11 = (X.F0A) r11
            java.lang.String r12 = r1.A03
            java.lang.String r15 = r1.A04
            java.util.HashMap r1 = r1.A09
            if (r1 != 0) goto L_0x09aa
            java.util.Map r1 = java.util.Collections.emptyMap()
            if (r1 == 0) goto L_0x09ba
        L_0x09aa:
            java.lang.String r0 = "big_blue_token"
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r0 = "true"
            boolean r0 = r0.equals(r1)
            r17 = 1
            if (r0 != 0) goto L_0x09bc
        L_0x09ba:
            r17 = 0
        L_0x09bc:
            r16 = r3
            r9.A03(r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x09c1:
            r0 = 0
            r9.A02 = r0
            r0 = -1751974693(0xffffffff9792fcdb, float:-9.498859E-25)
            goto L_0x096d
        L_0x09c8:
            java.lang.Integer r3 = X.AnonymousClass05K.A0Y
            if (r6 != r3) goto L_0x0a04
            java.lang.Object r6 = r0.A03
            java.lang.Object r7 = r0.A02
            java.lang.String r5 = r1.A03
            java.lang.Long r1 = r1.A01
            r0 = 1
            r9.A02 = r0
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            if (r1 == 0) goto L_0x09e6
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "enrollment_id"
            r3.put(r0, r1)
        L_0x09e6:
            java.lang.String r1 = X.AnonymousClass7TF.A0b()
            java.lang.String r0 = X.C46476Dff.A00()
            r3.put(r0, r1)
            r0 = 2
            X.E85 r1 = new X.E85
            r1.<init>(r0, r9, r7, r6)
            X.0lg r0 = r9.A06
            X.8ey r0 = X.C359988do.A04(r0, r5, r3)
            r0.A00(r1)
            X.1ES.A03(r0)
            goto L_0x09c1
        L_0x0a04:
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            java.lang.Object r5 = r0.A03
            android.content.Context r5 = (android.content.Context) r5
            if (r6 != r3) goto L_0x0a1b
            java.lang.String r3 = r1.A07
            java.util.HashMap r1 = r1.A09
            if (r1 != 0) goto L_0x0a16
            java.util.Map r1 = java.util.Collections.emptyMap()
        L_0x0a16:
            r0 = 0
            r9.A04(r5, r3, r0, r1)
            goto L_0x09c1
        L_0x0a1b:
            X.0lg r6 = r9.A06
            java.lang.String r8 = r1.A07
            java.util.HashMap r0 = r1.A09
            if (r0 != 0) goto L_0x0a27
            java.util.Map r0 = java.util.Collections.emptyMap()
        L_0x0a27:
            monitor-enter(r9)
            android.os.Bundle r7 = X.AnonymousClass7TE.A0a()     // Catch:{ all -> 0x0a92 }
            java.util.Iterator r3 = X.AnonymousClass7TF.A0u(r0)     // Catch:{ all -> 0x0a92 }
        L_0x0a30:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0a92 }
            if (r0 == 0) goto L_0x0a46
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r3)     // Catch:{ all -> 0x0a92 }
            java.lang.String r1 = X.DbT.A13(r0)     // Catch:{ all -> 0x0a92 }
            java.lang.String r0 = X.DbS.A0s(r0)     // Catch:{ all -> 0x0a92 }
            r7.putString(r1, r0)     // Catch:{ all -> 0x0a92 }
            goto L_0x0a30
        L_0x0a46:
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()     // Catch:{ all -> 0x0a92 }
            java.lang.String r0 = "screenName"
            r3.putString(r0, r8)     // Catch:{ all -> 0x0a92 }
            java.lang.String r0 = "screenData"
            r3.putBundle(r0, r7)     // Catch:{ all -> 0x0a92 }
            java.lang.String r1 = "countryCode"
            java.util.Locale r0 = X.AnonymousClass1Q2.A02()     // Catch:{ all -> 0x0a92 }
            java.lang.String r0 = r0.getCountry()     // Catch:{ all -> 0x0a92 }
            r3.putString(r1, r0)     // Catch:{ all -> 0x0a92 }
            java.lang.String r0 = "userId"
            r3.putString(r0, r13)     // Catch:{ all -> 0x0a92 }
            boolean r0 = r9.A03     // Catch:{ all -> 0x0a92 }
            if (r0 == 0) goto L_0x0a8f
            X.1WM.getInstance()     // Catch:{ all -> 0x0a92 }
            java.lang.String r0 = "CheckpointApp"
            X.T8B r1 = new X.T8B     // Catch:{ all -> 0x0a92 }
            r1.<init>(r6, r0)     // Catch:{ all -> 0x0a92 }
            r0 = 335544320(0x14000000, float:6.4623485E-27)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0a92 }
            r1.A02 = r0     // Catch:{ all -> 0x0a92 }
            r1.A00(r3)     // Catch:{ all -> 0x0a92 }
            r3 = 1
            r1.A0A = r3     // Catch:{ all -> 0x0a92 }
            boolean r1 = r1.A02(r5)     // Catch:{ all -> 0x0a92 }
            boolean r0 = r9.A04     // Catch:{ all -> 0x0a92 }
            if (r0 != 0) goto L_0x0a8d
            if (r1 != 0) goto L_0x0a8d
            r3 = 0
        L_0x0a8d:
            r9.A04 = r3     // Catch:{ all -> 0x0a92 }
        L_0x0a8f:
            monitor-exit(r9)
            goto L_0x09c1
        L_0x0a92:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x0a95:
            r2 = 1470324819(0x57a36053, float:3.59268209E14)
            int r2 = X.AnonymousClass0fD.A03(r2)
            X.De9 r1 = (X.De9) r1
            r3 = -733050516(0xffffffffd44e896c, float:-3.54827528E12)
            int r4 = X.AnonymousClass7TG.A0D(r1, r3)
            java.lang.Object r3 = r0.A01
            X.FRU r3 = (X.FRU) r3
            if (r3 == 0) goto L_0x0aad
            r3.A00 = r1
        L_0x0aad:
            java.lang.Object r1 = r0.A02
            X.G7u r1 = (X.C51926G7u) r1
            java.lang.Object r0 = r0.A03
            X.16V r0 = (X.16V) r0
            r1.Det(r0)
            r0 = -1657620137(0xffffffff9d32b957, float:-2.3653922E-21)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -1379799390(0xffffffffadc1eea2, float:-2.2047534E-11)
        L_0x0ac1:
            X.AnonymousClass0fD.A0A(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47692EDb.onSuccess(java.lang.Object):void");
    }

    public C47692EDb(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj3;
        this.A03 = obj2;
        this.A02 = obj;
    }
}
