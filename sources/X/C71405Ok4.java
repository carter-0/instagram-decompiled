package X;

import android.view.View;

/* renamed from: X.Ok4  reason: case insensitive filesystem */
public final class C71405Ok4 implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C71405Ok4(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static void A01(View view, int i, Object obj, Object obj2) {
        AnonymousClass0fU.A00(new C71405Ok4(i, obj, obj2), view);
    }

    /* JADX WARNING: type inference failed for: r5v45, types: [android.widget.TextView, com.instagram.common.ui.text.ExpandableTextView] */
    /* JADX WARNING: type inference failed for: r4v35, types: [com.instagram.direct.appwidget.DirectRecipientSearchActivity, android.app.Activity] */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x1105, code lost:
        X.AnonymousClass0fD.A0C(r0, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x1108, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x1234, code lost:
        X.AnonymousClass0fD.A0C(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x1237, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x1238, code lost:
        r11 = "logger";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x123c, code lost:
        r11 = "directThreadKey";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0037, code lost:
        X.AnonymousClass0fD.A0C(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x12dc, code lost:
        X.AnonymousClass0fD.A0C(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x12df, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x1393, code lost:
        X.AnonymousClass0fD.A0C(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x1396, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x1397, code lost:
        r11 = "directPromptsPrivateAndSocialGroupsLogger";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:0x13c9, code lost:
        X.0qQ.A0F(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x13d0, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x13d1, code lost:
        r11 = "userFlowLoggerV2";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x003a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r26) {
        /*
            r25 = this;
            r0 = r25
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x09b2;
                case 1: goto L_0x099b;
                case 2: goto L_0x0984;
                case 3: goto L_0x0c86;
                case 4: goto L_0x0c5c;
                case 5: goto L_0x0959;
                case 6: goto L_0x139a;
                case 7: goto L_0x12a3;
                case 8: goto L_0x0940;
                case 9: goto L_0x091d;
                case 10: goto L_0x1240;
                case 11: goto L_0x0906;
                case 12: goto L_0x08d1;
                case 13: goto L_0x0bf2;
                case 14: goto L_0x11e3;
                case 15: goto L_0x11a2;
                case 16: goto L_0x114f;
                case 17: goto L_0x110d;
                case 18: goto L_0x08af;
                case 19: goto L_0x0895;
                case 20: goto L_0x087b;
                case 21: goto L_0x0858;
                case 22: goto L_0x084c;
                case 23: goto L_0x0840;
                case 24: goto L_0x0bb2;
                case 25: goto L_0x0802;
                case 26: goto L_0x12e8;
                case 27: goto L_0x0747;
                case 28: goto L_0x072c;
                case 29: goto L_0x0711;
                case 30: goto L_0x06ee;
                case 31: goto L_0x0696;
                case 32: goto L_0x066d;
                case 33: goto L_0x0656;
                case 34: goto L_0x05ed;
                case 35: goto L_0x057c;
                case 36: goto L_0x0532;
                case 37: goto L_0x0502;
                case 38: goto L_0x0491;
                case 39: goto L_0x0eaa;
                case 40: goto L_0x0478;
                case 41: goto L_0x0e07;
                case 42: goto L_0x043d;
                case 43: goto L_0x0ace;
                case 44: goto L_0x0424;
                case 45: goto L_0x040b;
                case 46: goto L_0x03f2;
                case 47: goto L_0x03d9;
                case 48: goto L_0x03c0;
                case 49: goto L_0x0d7c;
                case 50: goto L_0x038e;
                case 51: goto L_0x0cb0;
                case 52: goto L_0x0a84;
                case 53: goto L_0x036c;
                case 54: goto L_0x0a2a;
                case 55: goto L_0x029c;
                case 56: goto L_0x0285;
                case 57: goto L_0x026e;
                case 58: goto L_0x0257;
                case 59: goto L_0x0216;
                case 60: goto L_0x01d1;
                case 61: goto L_0x01aa;
                case 62: goto L_0x0192;
                case 63: goto L_0x0179;
                case 64: goto L_0x0127;
                case 65: goto L_0x00fe;
                case 66: goto L_0x00ac;
                case 67: goto L_0x0065;
                case 68: goto L_0x09c9;
                case 69: goto L_0x003b;
                default: goto L_0x0007;
            }
        L_0x0007:
            r1 = 1638504190(0x61a996fe, float:3.910475E20)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.NOq r2 = (X.C68594NOq) r2
            X.NKj r2 = r2.A02
            java.lang.Object r0 = r0.A01
            X.OF8 r0 = (X.OF8) r0
            com.instagram.direct.inbox.notes.models.NoteAudienceItem r3 = r0.A02
            r0 = 0
            X.0qQ.A0B(r3, r0)
            X.0eM r2 = r2.A04
            java.lang.Object r0 = r2.getValue()
            X.Mtr r0 = (X.C67738Mtr) r0
            X.05G r0 = r0.A02
            r0.Epw(r3)
            java.lang.Object r0 = r2.getValue()
            X.Mtr r0 = (X.C67738Mtr) r0
            r0.A00()
            r0 = -1915904590(0xffffffff8dcd9db2, float:-1.2672064E-30)
        L_0x0037:
            X.AnonymousClass0fD.A0C(r0, r1)
            return
        L_0x003b:
            r1 = 826062785(0x313cb7c1, float:2.7462053E-9)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A01
            X.NKj r4 = (X.C68490NKj) r4
            java.lang.Object r3 = r0.A02
            X.0eM r2 = r4.A04
            java.lang.Object r0 = r2.getValue()
            X.Mtr r0 = (X.C67738Mtr) r0
            X.05G r0 = r0.A02
            r0.Epw(r3)
            java.lang.Object r0 = r2.getValue()
            X.Mtr r0 = (X.C67738Mtr) r0
            r0.A00()
            X.DbT.A1J(r4)
            r0 = 1261395099(0x4b2f5c9b, float:1.1492507E7)
            goto L_0x0037
        L_0x0065:
            r1 = -1390621437(0xffffffffad1ccd03, float:-8.913095E-12)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r6 = r0.A02
            X.Mz8 r6 = (X.C68041Mz8) r6
            int r2 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.OSj r4 = r6.A09
            java.lang.Object r0 = r0.A01
            X.Ou6 r0 = (X.Ou6) r0
            java.lang.String r3 = r0.A05
            java.lang.String r0 = "thread_id"
            java.util.Map r2 = X.AnonymousClass7TF.A0w(r0, r3)
            java.lang.String r0 = "igd_campaign_message_item_click"
            X.C70936OSj.A00(r4, r0, r2)
            X.3t0 r5 = X.C66580MXl.A0g(r3)
            android.app.Activity r4 = r6.A00
            com.instagram.common.session.UserSession r2 = r6.A03
            X.4DH r3 = r6.A02
            java.lang.String r0 = "direct_ctd_campaign_messages"
            X.1pE r2 = X.1pE.A01(r4, r3, r2, r0)
            r2.A00 = r3
            r2.A0B = r5
            r0 = 1
            r2.A0v = r0
            r0 = 92887(0x16ad7, float:1.30162E-40)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0F = r0
            r2.A06()
            r0 = 2006957333(0x779fbd15, float:6.4797675E33)
            goto L_0x0037
        L_0x00ac:
            r1 = 17557289(0x10be729, float:2.5696117E-38)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r6 = r0.A02
            X.Mje r6 = (X.C67182Mje) r6
            X.MjM r2 = r6.A02
            java.lang.Object r5 = r0.A01
            X.MmA r5 = (X.C67334MmA) r5
            X.Ma2 r3 = r2.A00
            X.Mbh r2 = X.C66581MXm.A0U(r3)
            X.Miz r0 = r2.A0E
            java.util.List r0 = r0.A0M
            r0.remove(r5)
            X.C66736Mbh.A03(r2)
            com.instagram.common.session.UserSession r4 = r3.A0p()
            com.instagram.user.model.User r0 = r5.A01
            java.lang.String r3 = r0.getId()
            java.lang.String r2 = r5.A02
            r0 = 0
            X.1OC r0 = X.F88.A01(r4, r3, r2, r0)
            X.1ES.A03(r0)
            X.2om r3 = r6.A01()
            if (r3 == 0) goto L_0x00f9
            X.4DH r0 = r6.A00
            java.lang.String r0 = r0.getModuleName()
            X.6KM r2 = X.C67182Mje.A00(r5, r0)
            X.6KN r0 = new X.6KN
            r0.<init>(r2)
            r3.A07(r0)
        L_0x00f9:
            r0 = 1118715618(0x42ae3ee2, float:87.12282)
            goto L_0x0037
        L_0x00fe:
            r1 = 1048389003(0x3e7d258b, float:0.24721353)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.Mjc r3 = (X.C67180Mjc) r3
            java.lang.Object r0 = r0.A01
            X.Myy r0 = (X.C68032Myy) r0
            android.view.View r0 = r0.A00
            android.view.ViewPropertyAnimator r2 = r0.animate()
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            android.view.ViewPropertyAnimator r2 = r2.alpha(r0)
            X.PVa r0 = new X.PVa
            r0.<init>(r3)
            r2.withEndAction(r0)
            r0 = -331592908(0xffffffffec3c4b34, float:-9.105328E26)
            goto L_0x0037
        L_0x0127:
            r1 = 1650702589(0x6263b8fd, float:1.0501852E21)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A02
            X.NIk r5 = (X.C68447NIk) r5
            com.instagram.common.ui.base.IgEditText r2 = r5.A03
            if (r2 == 0) goto L_0x0174
            android.text.Editable r2 = r2.getText()
            if (r2 == 0) goto L_0x0142
            int r2 = r2.length()
            if (r2 != 0) goto L_0x0174
        L_0x0142:
            X.0eM r2 = r5.A0N
            java.lang.Object r2 = r2.getValue()
            X.Mtq r2 = (X.C67737Mtq) r2
            X.0Ud r2 = r2.A05
            java.lang.Object r2 = r2.getValue()
            X.JwG r2 = (X.C61078JwG) r2
            java.lang.Object r2 = r2.A00
            java.lang.Number r2 = (java.lang.Number) r2
            if (r2 == 0) goto L_0x0174
            java.lang.Object r4 = r0.A01
            android.graphics.drawable.Drawable r4 = (android.graphics.drawable.Drawable) r4
            int r3 = r2.intValue()
            com.instagram.common.ui.base.IgEditText r2 = r5.A03
            if (r2 == 0) goto L_0x016f
            android.content.Context r0 = r5.requireContext()
            android.text.SpannableStringBuilder r0 = X.DbW.A08(r0, r3)
            r2.setText(r0)
        L_0x016f:
            com.instagram.igds.components.mediabutton.IgdsMediaButton r0 = r5.A0D
            X.C68447NIk.A00(r4, r5, r0)
        L_0x0174:
            r0 = 702842560(0x29e486c0, float:1.01486094E-13)
            goto L_0x0037
        L_0x0179:
            r1 = 427434943(0x197a23bf, float:1.2931916E-23)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.Mz5 r3 = (X.C68038Mz5) r3
            int r2 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.0sP r2 = r3.A08
            java.lang.Object r0 = r0.A01
            r2.invoke(r0)
            r0 = 110415160(0x694cd38, float:5.5972954E-35)
            goto L_0x0037
        L_0x0192:
            r1 = 757731490(0x2d2a10a2, float:9.667074E-12)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r0.A02
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            r0 = 0
            X.OP2.A01(r2, r3, r0)
            r0 = -1510127824(0xffffffffa5fd4730, float:-4.3936742E-16)
            goto L_0x0037
        L_0x01aa:
            r1 = -1518676389(0xffffffffa57ad65b, float:-2.175667E-16)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A02
            X.NKQ r5 = (X.NKQ) r5
            android.content.Context r3 = r5.requireContext()
            X.0eM r2 = r5.A0L
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r2)
            androidx.fragment.app.FragmentActivity r4 = r5.requireActivity()
            java.lang.Object r7 = r0.A01
            X.Dri r7 = (X.C47167Dri) r7
            java.lang.Integer r8 = X.AnonymousClass05K.A0N
            X.FFK.A01(r3, r4, r5, r6, r7, r8)
            r0 = -309022789(0xffffffffed94afbb, float:-5.7520283E27)
            goto L_0x0037
        L_0x01d1:
            r1 = 1219656347(0x48b27a9b, float:365524.84)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.NJl r3 = (X.C68473NJl) r3
            X.0eM r2 = r3.A0I
            X.0lg r2 = X.DbT.A0X(r2)
            java.lang.Object r0 = r0.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            r7 = 0
            X.2nI r6 = X.C229382nI.A03(r0, r2, r7)
            java.util.HashMap r5 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()
            r2 = 0
            java.util.BitSet r0 = new java.util.BitSet
            r0.<init>(r2)
            androidx.fragment.app.FragmentActivity r3 = r3.getActivity()
            java.lang.String r0 = "com.bloks.www.igd.bc.fbm.bc.creation.upsell.async"
            X.FBO r2 = new X.FBO
            r2.<init>(r0)
            java.util.HashMap r0 = X.C359608dC.A01(r5)
            r2.A04 = r0
            r2.A03 = r4
            r2.A02 = r7
            r2.A01(r3, r6)
            r0 = 599575823(0x23bccd0f, float:2.0469847E-17)
            goto L_0x0037
        L_0x0216:
            r1 = -1006271537(0xffffffffc40583cf, float:-534.0595)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.N4P r2 = (X.N4P) r2
            X.3t3 r2 = r2.A0L
            java.lang.String r5 = X.C66580MXl.A0x(r2)
            r2 = 0
            X.0qQ.A0B(r5, r2)
            X.E7L r4 = new X.E7L
            r4.<init>()
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            java.lang.String r2 = "thread_id"
            r3.putString(r2, r5)
            r4.setArguments(r3)
            java.lang.Object r0 = r0.A02
            X.NJl r0 = (X.C68473NJl) r0
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            X.0eM r0 = r0.A0I
            X.6Yo r2 = X.DbX.A0N(r2, r0)
            r2.A0D(r4)
            java.lang.String r0 = "ThreadDetailsChannelControlsFragment"
            X.C66583MXo.A1G(r2, r0)
            r0 = -1468404379(0xffffffffa879ed65, float:-1.3873753E-14)
            goto L_0x0037
        L_0x0257:
            r1 = 1856734348(0x6eab848c, float:2.6541088E28)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.NJY r2 = (X.NJY) r2
            java.lang.Object r0 = r0.A01
            X.N9q r0 = (X.C68303N9q) r0
            X.NJY.A0H(r2, r0)
            r0 = 357088014(0x1548bb0e, float:4.053724E-26)
            goto L_0x0037
        L_0x026e:
            r1 = 1221343521(0x48cc3921, float:418249.03)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.NJY r2 = (X.NJY) r2
            java.lang.Object r0 = r0.A01
            X.N9q r0 = (X.C68303N9q) r0
            X.NJY.A0G(r2, r0)
            r0 = 1401424106(0x538808ea, float:1.16853021E12)
            goto L_0x0037
        L_0x0285:
            r1 = 585345850(0x22e3ab3a, float:6.1709766E-18)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.NJY r2 = (X.NJY) r2
            java.lang.Object r0 = r0.A01
            X.N9q r0 = (X.C68303N9q) r0
            X.NJY.A0I(r2, r0)
            r0 = 1084120135(0x409e5c47, float:4.9487643)
            goto L_0x0037
        L_0x029c:
            r1 = -101161426(0xfffffffff9f8662e, float:-1.6122026E35)
            int r1 = X.AnonymousClass0fD.A05(r1)
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            java.lang.Object r2 = r0.A01
            X.N4P r2 = (X.N4P) r2
            X.3t3 r2 = r2.A0L
            java.lang.Object r5 = r0.A02
            X.NJY r5 = (X.NJY) r5
            com.instagram.direct.capabilities.Capabilities r0 = r5.A03
            if (r0 != 0) goto L_0x02b9
            java.lang.String r11 = "threadCapabilities"
            goto L_0x13c9
        L_0x02b9:
            X.OXL.A01(r4, r0, r2)
            X.NKR r3 = new X.NKR
            r3.<init>()
            r3.setArguments(r4)
            androidx.fragment.app.FragmentActivity r2 = r5.requireActivity()
            X.0eM r0 = r5.A14
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.DbY.A14(r3, r2, r0)
            X.Nmj r9 = X.C69501Nmj.A07
            X.0eM r2 = r5.A15
            java.lang.Object r0 = r2.getValue()
            X.ODj r0 = (X.C70612ODj) r0
            java.util.Set r0 = r0.A02
            boolean r0 = X.C66580MXl.A1b(r0)
            if (r0 == 0) goto L_0x0350
            java.lang.Object r2 = r2.getValue()
            X.ODj r2 = (X.C70612ODj) r2
            X.3t3 r3 = r5.A0c
            if (r3 != 0) goto L_0x02f1
            java.lang.String r11 = "threadId"
            goto L_0x13c9
        L_0x02f1:
            boolean r6 = r5.A0k
            X.N4P r0 = r5.A0Z
            if (r0 == 0) goto L_0x036a
            boolean r8 = X.N4P.A05(r0)
        L_0x02fb:
            java.lang.Integer r7 = r5.A0e
            r0 = 3
            X.0qQ.A0B(r7, r0)
            X.0wc r2 = r2.A01
            java.lang.String r0 = "direct_thread_details_impression"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r2, r0)
            boolean r0 = r4.isSampled()
            if (r0 == 0) goto L_0x0350
            java.lang.String r2 = X.C300965yF.A07(r3)
            if (r2 == 0) goto L_0x0368
            X.N0Z r3 = new X.N0Z
            r3.<init>()
            java.lang.String r0 = "id"
            r3.A06(r0, r2)
            if (r6 == 0) goto L_0x0360
            if (r8 == 0) goto L_0x035d
            X.XSV r2 = X.XSV.A03
        L_0x0325:
            java.lang.String r0 = "type"
            r3.A01(r2, r0)
        L_0x032a:
            int r0 = r7.intValue()
            int r0 = 1 - r0
            if (r0 == 0) goto L_0x035a
            java.lang.String r0 = "swipe"
        L_0x0334:
            X.DbS.A1N(r4, r0)
            java.util.List r2 = X.AnonymousClass7TE.A1I(r9)
            java.lang.String r0 = "setting_type"
            r4.AAe(r0, r2)
            X.C66581MXm.A1H(r4, r6)
            java.lang.String r0 = "tap"
            X.DbS.A1J(r4, r0)
            java.lang.String r0 = "thread"
            r4.AAK(r3, r0)
            r4.Cgf()
        L_0x0350:
            X.NmZ r0 = X.C69491NmZ.NICKNAMES
            X.NJY.A05(r0, r5)
            r0 = -1787706002(0xffffffff9571c56e, float:-4.8825307E-26)
            goto L_0x0037
        L_0x035a:
            java.lang.String r0 = "tap"
            goto L_0x0334
        L_0x035d:
            X.XSV r2 = X.XSV.A04
            goto L_0x0325
        L_0x0360:
            if (r8 == 0) goto L_0x0365
            X.XSV r2 = X.XSV.A05
            goto L_0x0325
        L_0x0365:
            X.XSV r2 = X.XSV.A06
            goto L_0x0325
        L_0x0368:
            r3 = 0
            goto L_0x032a
        L_0x036a:
            r8 = 0
            goto L_0x02fb
        L_0x036c:
            r1 = 298464604(0x11ca355c, float:3.1902866E-28)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.NJY r3 = (X.NJY) r3
            X.NmZ r2 = X.C69491NmZ.AI_AUTO_REPLIES
            X.NJY.A05(r2, r3)
            java.lang.Object r0 = r0.A01
            X.Jvl r0 = (X.C61047Jvl) r0
            java.lang.Object r0 = r0.A01
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r2 = r26
            r0.onClick(r2)
            r0 = -2124724225(0xffffffff815b47ff, float:-4.0275602E-38)
            goto L_0x0037
        L_0x038e:
            r1 = -2132764369(0xffffffff80e0992f, float:-2.0626103E-38)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A02
            X.OHm r5 = (X.C70717OHm) r5
            android.app.Activity r4 = r5.A01
            com.instagram.common.session.UserSession r3 = r5.A05
            java.lang.Object r0 = r0.A01
            X.9JG r0 = (X.AnonymousClass9JG) r0
            java.lang.String r2 = r0.A01
            X.2EG r0 = X.2EG.A1V
            X.Dbb.A0k(r4, r3, r0, r2)
            X.O73 r0 = r5.A00
            if (r0 != 0) goto L_0x03b0
            java.lang.String r11 = "onUrlButtonItemClickListener"
            goto L_0x13c9
        L_0x03b0:
            X.NJx r0 = r0.A00
            X.OKK r2 = r0.A01
            if (r2 == 0) goto L_0x03bb
            java.lang.String r0 = "url"
            r2.A00(r0)
        L_0x03bb:
            r0 = 841348344(0x3225f4f8, float:9.6599635E-9)
            goto L_0x0037
        L_0x03c0:
            r1 = 1411996240(0x54295a50, float:2.90945866E12)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.NKB r3 = (X.NKB) r3
            java.lang.Object r2 = r0.A01
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            X.NKB.A00(r3, r2, r0)
            r0 = -1112746762(0xffffffffbdacd4f6, float:-0.084390566)
            goto L_0x0037
        L_0x03d9:
            r1 = -1391634694(0xffffffffad0d56fa, float:-8.034235E-12)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.NKB r3 = (X.NKB) r3
            java.lang.Object r2 = r0.A01
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.NKB.A00(r3, r2, r0)
            r0 = 1407241467(0x53e0ccfb, float:1.93102335E12)
            goto L_0x0037
        L_0x03f2:
            r1 = 36608270(0x22e990e, float:1.2827426E-37)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.NKB r3 = (X.NKB) r3
            java.lang.Object r2 = r0.A01
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            X.NKB.A00(r3, r2, r0)
            r0 = 1652254450(0x627b66f2, float:1.1593877E21)
            goto L_0x0037
        L_0x040b:
            r1 = 217583169(0xcf80e41, float:3.821903E-31)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.NKB r3 = (X.NKB) r3
            java.lang.Object r2 = r0.A01
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            X.NKB.A00(r3, r2, r0)
            r0 = 106453578(0x6585a4a, float:4.069142E-35)
            goto L_0x0037
        L_0x0424:
            r1 = -1153210889(0xffffffffbb4365f7, float:-0.0029815414)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.NKB r3 = (X.NKB) r3
            java.lang.Object r2 = r0.A01
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.NKB.A00(r3, r2, r0)
            r0 = -425213837(0xffffffffe6a7c073, float:-3.9609263E23)
            goto L_0x0037
        L_0x043d:
            r1 = 1987560164(0x7677c2e4, float:1.256299E33)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A02
            X.NKI r4 = (X.NKI) r4
            X.0eM r2 = r4.A0Q
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r2)
            androidx.fragment.app.FragmentActivity r3 = r4.getActivity()
            com.instagram.direct.messagethread.nullstate.threaddata.theme.ThemeViewModelDelegate r2 = r4.A07
            if (r2 != 0) goto L_0x045a
            java.lang.String r11 = "currentTheme"
            goto L_0x13c9
        L_0x045a:
            java.lang.String r8 = r2.A09
            X.TpH r6 = X.C14068TpH.IGD_THEME_PICKER
            X.UzD r7 = X.C16677UzD.THREAD_THEME
            X.OcF r4 = X.ORV.A01(r3, r4, r5, r6, r7, r8)
            X.Uz2 r3 = X.C16666Uz2.REPORT_BUTTON
            r2 = 0
            X.0qQ.A0B(r3, r2)
            r4.A02 = r3
            java.lang.Object r0 = r0.A01
            X.7Pu r0 = (X.C331157Pu) r0
            X.C71093OcF.A00(r0, r4)
            r0 = 1407292851(0x53e195b3, float:1.93775836E12)
            goto L_0x0037
        L_0x0478:
            r1 = 804301494(0x2ff0aab6, float:4.3777043E-10)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.MvA r2 = (X.C67806MvA) r2
            X.Pv2 r2 = r2.A02
            java.lang.Object r0 = r0.A02
            X.Mq3 r0 = (X.C67569Mq3) r0
            r2.DLw(r0)
            r0 = -1652586357(0xffffffff9d7f888b, float:-3.381956E-21)
            goto L_0x0037
        L_0x0491:
            r1 = -1075388889(0xffffffffbfe6de27, float:-1.8036546)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r7 = r0.A02
            X.OTl r7 = (X.C70964OTl) r7
            java.lang.Object r8 = r0.A01
            X.2Er r8 = (X.2Er) r8
            X.914 r9 = r8.Amp()
            if (r9 == 0) goto L_0x04ec
            com.instagram.common.session.UserSession r3 = r7.A05
            boolean r0 = X.AnonymousClass7K4.A02(r3)
            r2 = 2131958872(0x7f131c58, float:1.9554368E38)
            if (r0 == 0) goto L_0x04b4
            r2 = 2131958871(0x7f131c57, float:1.9554366E38)
        L_0x04b4:
            boolean r0 = X.AnonymousClass7K4.A02(r3)
            r6 = 2131958863(0x7f131c4f, float:1.955435E38)
            if (r0 == 0) goto L_0x04c0
            r6 = 2131958862(0x7f131c4e, float:1.9554348E38)
        L_0x04c0:
            android.app.Activity r0 = r7.A04
            X.8ab r5 = X.DbS.A0X(r0)
            X.DbT.A19(r0, r5, r2)
            r4 = 2131958864(0x7f131c50, float:1.9554352E38)
            X.8ae r2 = X.C358278ae.BLUE_BOLD
            r3 = 1
            X.Of3 r0 = new X.Of3
            r0.<init>(r3, r7, r8, r9)
            r5.A0R(r0, r2, r4)
            r2 = 2
            X.Of1 r0 = new X.Of1
            r0.<init>(r2, r8, r7)
            r5.A0G(r0, r6)
            r2 = 3
            X.Of1 r0 = new X.Of1
            r0.<init>(r2, r8, r7)
            r5.A0C(r0)
            X.AnonymousClass7TH.A0a(r5, r3)
        L_0x04ec:
            X.MfP r4 = r7.A07
            java.lang.String r3 = r8.C6C()
            java.lang.String r2 = r8.C6k()
            int r0 = r8.AdN()
            r4.A04(r3, r2, r0)
            r0 = -2089306083(0xffffffff8377b81d, float:-7.279813E-37)
            goto L_0x0037
        L_0x0502:
            r1 = 1851207692(0x6e57300c, float:1.664934E28)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.OTl r2 = (X.C70964OTl) r2
            X.MfP r3 = r2.A07
            java.lang.Object r0 = r0.A01
            X.2Er r0 = (X.2Er) r0
            java.lang.String r4 = r0.C6C()
            java.lang.String r5 = r0.C6k()
            int r10 = r0.AdN()
            java.lang.String r6 = "daily_prompt_null_creation_sheet_rendered"
            java.lang.String r7 = "tap"
            java.lang.String r8 = "daily_prompt_creation_pill"
            java.lang.String r9 = "thread_view"
            X.C66930MfP.A01(r3, r4, r5, r6, r7, r8, r9, r10)
            X.C70964OTl.A00(r2, r0)
            r0 = -360956467(0xffffffffea7c3dcd, float:-7.623529E25)
            goto L_0x0037
        L_0x0532:
            r1 = -317999620(0xffffffffed0bb5fc, float:-2.7024014E27)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.OTl r3 = (X.C70964OTl) r3
            X.MfP r4 = r3.A07
            java.lang.Object r0 = r0.A01
            X.2Er r0 = (X.2Er) r0
            java.lang.String r5 = r0.C6C()
            java.lang.String r6 = r0.C6k()
            int r11 = r0.AdN()
            java.lang.String r7 = "dismiss_daily_prompt_creation_pill"
            java.lang.String r8 = "tap"
            java.lang.String r9 = "daily_prompt_creation_pill"
            java.lang.String r10 = "thread_view"
            X.C66930MfP.A01(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.String r4 = r0.C6C()
            if (r4 == 0) goto L_0x0577
            X.3oV r2 = r3.A06
            r0 = 8
            r2.setVisibility(r0)
            com.instagram.common.session.UserSession r0 = r3.A05
            X.1Av r0 = X.1Au.A00(r0)
            r3 = 1
            X.0xY r2 = X.AnonymousClass7TE.A0p(r0)
            java.lang.String r0 = "broadcast_channel_daily_prompt_fab"
            X.DbX.A1T(r2, r0, r4, r3)
        L_0x0577:
            r0 = -974532359(0xffffffffc5e9d0f9, float:-7482.1216)
            goto L_0x0037
        L_0x057c:
            r1 = 2135737904(0x7f4cc630, float:2.7219156E38)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A02
            X.NVW r5 = (X.NVW) r5
            X.JwH r2 = X.C67750Mu3.A00(r5)
            java.lang.Object r7 = r2.A01
            X.NkD r7 = (X.C69373NkD) r7
            X.JwH r2 = X.C67750Mu3.A00(r5)
            java.lang.String r6 = r2.A02
            java.lang.Object r0 = r0.A01
            X.O6P r0 = (X.O6P) r0
            X.AnonymousClass7TG.A1T(r7, r0, r6)
            X.NIO r4 = new X.NIO
            r4.<init>()
            r4.A00 = r0
            r4.A01 = r7
            r4.A02 = r6
            com.instagram.common.session.UserSession r0 = r5.getSession()
            X.7Pr r3 = X.DbS.A0W(r0)
            r0 = 2131954912(0x7f130ce0, float:1.9546337E38)
            java.lang.String r0 = r5.getString(r0)
            r3.A0d = r0
            r2 = 1
            X.PQo r0 = new X.PQo
            r0.<init>(r7, r5, r6, r2)
            r3.A0U = r0
            X.DbY.A13(r5, r4, r3)
            X.0eM r0 = r5.A00
            X.OyR r4 = X.C66580MXl.A0T(r0)
            com.instagram.model.direct.DirectThreadKey r0 = r5.A06()
            java.lang.String r6 = r0.A00
            com.instagram.model.direct.DirectThreadKey r0 = r5.A06()
            java.lang.String r7 = r0.A01
            int r0 = r5.A00
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.String r8 = "prize_bottom_sheet_rendered"
            java.lang.String r9 = "tap"
            java.lang.String r10 = "prize_options_button"
            java.lang.String r11 = "challenge_null_creation_sheet"
            r3 = 0
            r12 = r3
            X.C72202OyR.A03(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = 384833219(0x16f016c3, float:3.8788456E-25)
            goto L_0x0037
        L_0x05ed:
            r1 = -264393778(0xfffffffff03dabce, float:-2.3480146E29)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A02
            X.NVW r5 = (X.NVW) r5
            X.JwH r2 = X.C67750Mu3.A00(r5)
            java.lang.Object r2 = r2.A00
            X.Nk9 r2 = (X.C69369Nk9) r2
            java.lang.Object r0 = r0.A01
            X.O6O r0 = (X.O6O) r0
            X.AnonymousClass7TG.A1N(r2, r0)
            X.NIN r4 = new X.NIN
            r4.<init>()
            r4.A00 = r0
            r4.A01 = r2
            com.instagram.common.session.UserSession r0 = r5.getSession()
            X.7Pr r3 = X.DbS.A0W(r0)
            r0 = 2131954908(0x7f130cdc, float:1.9546329E38)
            java.lang.String r0 = r5.getString(r0)
            r3.A0d = r0
            r2 = 5
            X.PQr r0 = new X.PQr
            r0.<init>(r5, r2)
            r3.A0U = r0
            X.DbY.A13(r5, r4, r3)
            X.0eM r0 = r5.A00
            X.OyR r4 = X.C66580MXl.A0T(r0)
            com.instagram.model.direct.DirectThreadKey r0 = r5.A06()
            java.lang.String r6 = r0.A00
            com.instagram.model.direct.DirectThreadKey r0 = r5.A06()
            java.lang.String r7 = r0.A01
            int r0 = r5.A00
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.String r8 = "duration_bottom_sheet_rendered"
            java.lang.String r9 = "tap"
            java.lang.String r10 = "duration_options_button"
            java.lang.String r11 = "challenge_null_creation_sheet"
            r3 = 0
            r12 = r3
            X.C72202OyR.A03(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = -618384584(0xffffffffdb243338, float:-4.6218212E16)
            goto L_0x0037
        L_0x0656:
            r1 = -1699391624(0xffffffff9ab55778, float:-7.500116E-23)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.NPp r2 = (X.C68619NPp) r2
            X.0sP r2 = r2.A01
            java.lang.Object r0 = r0.A01
            r2.invoke(r0)
            r0 = -1770202278(0xffffffff967cdb5a, float:-2.0425613E-25)
            goto L_0x0037
        L_0x066d:
            r1 = -1070040340(0xffffffffc0387aec, float:-2.8825026)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.OVT r2 = (X.OVT) r2
            com.instagram.direct.fragment.icebreaker.DirectIceBreakerSettingFragment r5 = r2.A05
            java.lang.Object r4 = r0.A01
            X.OMj r4 = (X.C70814OMj) r4
            X.OSf r2 = r5.A07
            java.lang.String r0 = "icebreaker_settings_question_item_click"
            r3 = 0
            X.C70932OSf.A00(r2, r0, r3, r3)
            r0 = 1
            com.instagram.direct.fragment.icebreaker.DirectIceBreakerSettingFragment.A07(r5, r0)
            X.OKh r2 = r5.A05
            java.lang.String r0 = r5.A09
            r2.A00(r5, r4, r0, r3)
            r0 = -668082550(0xffffffffd82dde8a, float:-7.6468524E14)
            goto L_0x0037
        L_0x0696:
            r1 = -2128441831(0xffffffff81228e19, float:-2.985665E-38)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.NPu r2 = (X.C68624NPu) r2
            X.O6K r5 = r2.A02
            java.lang.Object r0 = r0.A01
            X.N65 r0 = (X.N65) r0
            java.lang.String r7 = r0.A07
            java.lang.Integer r4 = r0.A03
            int r2 = r0.A01
            X.NkE r3 = r0.A02
            r12 = 0
            X.AnonymousClass7TF.A1C(r7, r12, r3)
            X.NVN r14 = r5.A00
            X.0eM r0 = r14.A05
            com.instagram.common.session.UserSession r15 = X.AnonymousClass7TE.A0l(r0)
            androidx.fragment.app.FragmentActivity r13 = r14.requireActivity()
            java.lang.String r17 = "inbox_directory"
            r10 = 0
            r16 = r7
            r18 = r10
            X.OP8.A00(r13, r14, r15, r16, r17, r18)
            X.0eM r0 = r14.A04
            java.lang.Object r5 = r0.getValue()
            X.Odl r5 = (X.C71140Odl) r5
            java.lang.String r8 = X.C71140Odl.A02(r4)
            java.lang.Long r6 = X.DbS.A0j(r2)
            java.lang.String r2 = "current_filter"
            java.util.HashMap r11 = X.AnonymousClass7TE.A1E()
            java.lang.String r0 = r3.A03
            r11.put(r2, r0)
            java.lang.String r9 = "inbox_directory_sheet"
            X.C71140Odl.A05(r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = -1480402944(0xffffffffa7c2d800, float:-5.4080004E-15)
            goto L_0x0037
        L_0x06ee:
            r1 = 2008470691(0x77b6d4a3, float:7.416491E33)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.NQ4 r2 = (X.NQ4) r2
            X.Pv1 r2 = r2.A03
            java.lang.Object r0 = r0.A01
            X.N64 r0 = (X.N64) r0
            java.lang.String r4 = r0.A07
            java.lang.Integer r3 = r0.A03
            int r7 = r0.A00
            java.lang.String r5 = r0.A05
            java.lang.String r6 = r0.A06
            r2.DgA(r3, r4, r5, r6, r7)
            r0 = -2064514201(0xffffffff84f20367, float:-5.689705E-36)
            goto L_0x0037
        L_0x0711:
            r1 = -522613865(0xffffffffe0d98b97, float:-1.2540631E20)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.NV2 r3 = (X.NV2) r3
            int r2 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.OLM r2 = r3.A01
            java.lang.Object r0 = r0.A01
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r2.A00(r0)
            r0 = -882836107(0xffffffffcb60fd75, float:-1.4744949E7)
            goto L_0x0037
        L_0x072c:
            r1 = 1007675494(0x3c0fe866, float:0.008783435)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.NV2 r3 = (X.NV2) r3
            int r2 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.OLM r2 = r3.A01
            java.lang.Object r0 = r0.A01
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r2.A00(r0)
            r0 = 2058520548(0x7ab287e4, float:4.634925E35)
            goto L_0x0037
        L_0x0747:
            r1 = 195969189(0xbae40a5, float:6.711963E-32)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.NVI r2 = (X.NVI) r2
            java.util.List r2 = r2.A06
            java.lang.Object r2 = X.00k.A0J(r2)
            X.GnV r2 = (X.C53398GnV) r2
            if (r2 == 0) goto L_0x07f3
            java.lang.Object r0 = r0.A02
            X.MzQ r0 = (X.C68059MzQ) r0
            java.lang.String r8 = r2.A04
            java.lang.String r6 = r2.A03
            if (r8 == 0) goto L_0x07f3
            if (r6 == 0) goto L_0x07f3
            X.O6H r4 = r0.A0D
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR
            java.lang.Object r3 = r2.A02
            X.3lr r3 = (X.C250663lr) r3
            r0 = 0
            if (r3 == 0) goto L_0x0800
            java.lang.String r0 = "igid"
            java.lang.String r2 = r3.A08(r0)
            java.lang.String r0 = X.C67009Mgh.A00()
            java.lang.String r0 = r3.A0A(r0)
        L_0x0781:
            com.instagram.user.model.User r9 = new com.instagram.user.model.User
            r9.<init>(r2, r0)
            r7 = 1
            X.NV4 r2 = r4.A00
            java.lang.String r12 = X.C66580MXl.A0w(r2)
            android.os.Bundle r0 = r2.mArguments
            if (r0 == 0) goto L_0x07fe
            java.lang.String r14 = X.C66580MXl.A0t(r0)
        L_0x0795:
            if (r12 == 0) goto L_0x07f3
            if (r14 == 0) goto L_0x07f3
            X.0eM r4 = r2.A0S
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r4)
            androidx.fragment.app.FragmentActivity r0 = r2.requireActivity()
            com.instagram.model.direct.DirectThreadKey r5 = r2.A0G()
            java.lang.String r13 = r5.A01
            java.lang.String r15 = r2.A0L
            java.lang.String r16 = X.NV4.A01(r2)
            com.instagram.common.typedurl.SimpleImageUrl r6 = X.DbS.A0V(r6)
            r5 = 0
            com.instagram.reels.channelchallenge.model.ChannelChallengeStickerWinnerModel r10 = new com.instagram.reels.channelchallenge.model.ChannelChallengeStickerWinnerModel
            r10.<init>(r6, r9, r5)
            android.os.Bundle r6 = r2.mArguments
            if (r6 == 0) goto L_0x07fb
            java.lang.String r5 = "message_id"
            java.lang.String r18 = r6.getString(r5)
        L_0x07c3:
            android.os.Bundle r6 = r2.mArguments
            if (r6 == 0) goto L_0x07f8
            java.lang.String r5 = "client_context"
            java.lang.String r19 = r6.getString(r5)
        L_0x07cd:
            java.lang.Integer r11 = X.C66583MXo.A0d(r2)
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r4)
            java.lang.String r6 = r4.A06
            X.3Te r5 = X.C66582MXn.A0Z(r2)
            r4 = 29
            java.lang.String r20 = X.C329997La.A00(r5, r6, r4)
            java.lang.String r21 = "winners_chosen"
            java.lang.String r22 = "challenge_winner"
            com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeOneWinnerShareInfo r9 = new com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeOneWinnerShareInfo
            r17 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.OX8.A01(r0, r2, r3, r9)
            r0 = 0
            X.NV4.A02(r2, r14, r0, r7)
        L_0x07f3:
            r0 = -1208837951(0xffffffffb7f298c1, float:-2.891978E-5)
            goto L_0x0037
        L_0x07f8:
            r19 = 0
            goto L_0x07cd
        L_0x07fb:
            r18 = 0
            goto L_0x07c3
        L_0x07fe:
            r14 = 0
            goto L_0x0795
        L_0x0800:
            r2 = r0
            goto L_0x0781
        L_0x0802:
            r1 = 2090699044(0x7c9d8924, float:6.543777E36)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.NKH r3 = (X.NKH) r3
            X.ONz r4 = r3.A06
            if (r4 == 0) goto L_0x1397
            X.Nmf r5 = X.C69497Nmf.CANCEL
            com.instagram.direct.prompts.DirectEditAddYoursParams r2 = r3.A08
            if (r2 != 0) goto L_0x0827
            X.Nmc r6 = X.C69494Nmc.PROMPT
        L_0x0819:
            java.lang.String r7 = X.NKH.A00(r3)
            java.lang.String r9 = r3.A0C
            com.instagram.model.direct.DirectThreadKey r2 = r3.A0A
            if (r2 != 0) goto L_0x082a
            java.lang.String r11 = "threadKey"
            goto L_0x13c9
        L_0x0827:
            X.Nmc r6 = X.C69494Nmc.EDIT_FLOW
            goto L_0x0819
        L_0x082a:
            java.lang.String r8 = r2.A00
            r4.A00(r5, r6, r7, r8, r9)
            java.lang.Object r2 = r0.A01
            android.app.Activity r2 = (android.app.Activity) r2
            X.0nA.A0J(r2)
            X.37E r0 = X.AnonymousClass37D.A00
            X.DbX.A10(r2, r0)
            r0 = 956753248(0x3906e560, float:1.2864685E-4)
            goto L_0x0037
        L_0x0840:
            r1 = 464719982(0x1bb3106e, float:2.9623683E-22)
            int r1 = A00(r0, r1)
            r0 = -1561798728(0xffffffffa2e8d7b8, float:-6.3112127E-18)
            goto L_0x0037
        L_0x084c:
            r1 = -461605802(0xffffffffe47c7456, float:-1.862785E22)
            int r1 = A00(r0, r1)
            r0 = -622059092(0xffffffffdaec21ac, float:-3.32325586E16)
            goto L_0x0037
        L_0x0858:
            r1 = 1388699428(0x52c5df24, float:4.24926118E11)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            java.lang.Object r0 = r0.A02
            X.0lg r0 = (X.0lg) r0
            X.6Yo r2 = X.DbS.A0M(r2, r0)
            X.NgT r0 = new X.NgT
            r0.<init>()
            r2.A0D(r0)
            r2.A04()
            r0 = -1812207329(0xffffffff93fbe91f, float:-6.3591183E-27)
            goto L_0x0037
        L_0x087b:
            r1 = -929183744(0xffffffffc89dc800, float:-323136.0)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.Npm r2 = (X.C69664Npm) r2
            r2.A00()
            java.lang.Object r0 = r0.A02
            X.Puz r0 = (X.C74444Puz) r0
            r0.DZK()
            r0 = 1690043322(0x64bc03ba, float:2.7746051E22)
            goto L_0x0037
        L_0x0895:
            r1 = 501954706(0x1deb3892, float:6.2262474E-21)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.Npm r2 = (X.C69664Npm) r2
            r2.A00()
            java.lang.Object r0 = r0.A02
            X.Puz r0 = (X.C74444Puz) r0
            r0.D9Q()
            r0 = -517562569(0xffffffffe1269f37, float:-1.9210201E20)
            goto L_0x0037
        L_0x08af:
            r1 = 787553885(0x2ef11e5d, float:1.0964805E-10)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.NQZ r2 = (X.NQZ) r2
            com.instagram.common.session.UserSession r2 = r2.A01
            X.1Ng r3 = X.AnonymousClass1Nd.A00(r2)
            java.lang.Object r2 = r0.A01
            X.NiD r2 = (X.C69251NiD) r2
            X.7O5 r0 = new X.7O5
            r0.<init>(r2)
            r3.A00(r0)
            r0 = 574893853(0x22442f1d, float:2.6587895E-18)
            goto L_0x0037
        L_0x08d1:
            r1 = 1661851410(0x630dd712, float:2.6164884E21)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.MsN r2 = (X.C67685MsN) r2
            X.PrP r4 = r2.A00
            java.lang.Object r2 = r0.A01
            com.instagram.direct.appwidget.DirectThreadWidgetItem r2 = (com.instagram.direct.appwidget.DirectThreadWidgetItem) r2
            com.instagram.direct.appwidget.DirectRecipientSearchActivity r4 = (com.instagram.direct.appwidget.DirectRecipientSearchActivity) r4
            android.content.Intent r3 = X.DbS.A09()
            java.lang.String r0 = "direct_widget_custom_chat_info"
            r3.putExtra(r0, r2)
            java.lang.String r2 = r4.A02
            if (r2 != 0) goto L_0x08f5
            java.lang.String r11 = "customChatRowId"
            goto L_0x13c9
        L_0x08f5:
            java.lang.String r0 = "custom_chat_view_tag"
            r3.putExtra(r0, r2)
            r0 = -1
            r4.setResult(r0, r3)
            r4.finish()
            r0 = -1542986206(0xffffffffa407e622, float:-2.946839E-17)
            goto L_0x0037
        L_0x0906:
            r1 = -575947404(0xffffffffddabbd74, float:-1.54689686E18)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            com.instagram.direct.appwidget.DirectWidgetConfig r2 = (com.instagram.direct.appwidget.DirectWidgetConfig) r2
            java.lang.Object r0 = r0.A01
            android.view.View r0 = (android.view.View) r0
            r2.launchCustomChatSearch(r0)
            r0 = -936607136(0xffffffffc82c8260, float:-176649.5)
            goto L_0x0037
        L_0x091d:
            r1 = 1913145934(0x72084a4e, float:2.6995066E30)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A01
            X.0sP r3 = (X.0sP) r3
            java.lang.Object r2 = r0.A02
            X.MwT r2 = (X.C67885MwT) r2
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            android.widget.TextView r0 = r2.A00
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            r3.invoke(r0)
            r0 = -1118636492(0xffffffffbd52f634, float:-0.05150433)
            goto L_0x0037
        L_0x0940:
            r1 = 1595529333(0x5f19d875, float:1.1085739E19)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.W1j r2 = (X.C18783W1j) r2
            java.lang.Object r0 = r0.A02
            X.Vj0 r0 = (X.C17966Vj0) r0
            com.instagram.user.model.User r0 = r0.A01
            r2.A06(r0)
            r0 = 897705363(0x3581e593, float:9.678064E-7)
            goto L_0x0037
        L_0x0959:
            r1 = -65159720(0xfffffffffc1dbdd8, float:-3.2761644E36)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.NJ2 r3 = (X.NJ2) r3
            java.lang.Object r2 = r0.A01
            X.OLY r2 = (X.OLY) r2
            r0 = 1
            r2.A03 = r0
            r2.A05 = r0
            com.instagram.bugreporter.BugReportComposerViewModel r0 = r2.A00()
            r3.A00 = r0
            X.Pwg r2 = r3.A02
            if (r2 == 0) goto L_0x13d1
            java.lang.String r0 = "gdpr_include_logs_continue"
            r2.AVy(r0)
            X.NJ2.A00(r3)
            r0 = 1007309876(0x3c0a5434, float:0.008442927)
            goto L_0x0037
        L_0x0984:
            r1 = 527471471(0x1f70936f, float:5.094393E-20)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.0Ya r2 = (X.C59520Ya) r2
            X.0sP r2 = (X.0sP) r2
            java.lang.Object r0 = r0.A02
            r2.invoke(r0)
            r0 = 2142397571(0x7fb26483, float:NaN)
            goto L_0x0037
        L_0x099b:
            r1 = -1321647509(0xffffffffb139426b, float:-2.6958797E-9)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.0Ya r2 = (X.C59520Ya) r2
            X.0sP r2 = (X.0sP) r2
            java.lang.Object r0 = r0.A02
            r2.invoke(r0)
            r0 = -308246160(0xffffffffeda08970, float:-6.210469E27)
            goto L_0x0037
        L_0x09b2:
            r1 = -576082517(0xffffffffdda9adab, float:-1.52832707E18)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.0Ya r2 = (X.C59520Ya) r2
            X.0sP r2 = (X.0sP) r2
            java.lang.Object r0 = r0.A02
            r2.invoke(r0)
            r0 = 656233228(0x271d530c, float:2.1833147E-15)
            goto L_0x0037
        L_0x09c9:
            r1 = 1266051869(0x4b766b1d, float:1.6149277E7)
            int r3 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r6 = r0.A02
            X.Mz9 r6 = (X.C68042Mz9) r6
            com.instagram.common.ui.text.ExpandableTextView r5 = r6.A08
            boolean r2 = r5.A03
            X.O7P r1 = r6.A09
            X.OsH r1 = r1.A00
            if (r2 == 0) goto L_0x0a00
            X.OyY r8 = r1.A0F
            int r1 = r1.A02()
            long r1 = (long) r1
            java.lang.Integer r7 = X.AnonymousClass05K.A0B
            r4 = 8
            r8.A0B(r7, r4, r1)
            r1 = 0
            r5.A03 = r1
            r1 = 1
            r6.A03 = r1
            java.lang.Object r0 = r0.A01
            X.NPE r0 = (X.NPE) r0
            java.lang.String r0 = r0.A02
        L_0x09f8:
            X.DbZ.A14(r5, r0)
            r0 = -1884114307(0xffffffff8fb2b27d, float:-1.7620906E-29)
            goto L_0x1393
        L_0x0a00:
            X.OyY r2 = r1.A0F
            r1 = 8
            r2.A05(r1)
            r1 = 0
            r6.A03 = r1
            android.view.View r1 = r6.itemView
            int r4 = r1.getWidth()
            java.lang.Object r0 = r0.A01
            X.NPE r0 = (X.NPE) r0
            java.lang.String r2 = r0.A02
            if (r2 != 0) goto L_0x0a1a
            java.lang.String r2 = ""
        L_0x0a1a:
            android.content.Context r1 = X.DbS.A07(r6)
            r0 = 2131966401(0x7f1339c1, float:1.956964E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r1, r0)
            android.text.SpannableStringBuilder r0 = r5.A00(r2, r0, r4)
            goto L_0x09f8
        L_0x0a2a:
            r1 = 1593118133(0x5ef50db5, float:8.8289844E18)
            int r3 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A01
            X.N4P r5 = (X.N4P) r5
            boolean r1 = r5.A0j
            if (r1 != 0) goto L_0x0a6a
            java.lang.Object r2 = r0.A02
            X.NJY r2 = (X.NJY) r2
            X.0eM r1 = r2.A14
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            boolean r1 = X.N4P.A04(r1, r5)
            if (r1 != 0) goto L_0x0a6a
            X.8ab r4 = X.Dba.A0I(r2)
            r0 = 2131963166(0x7f132d1e, float:1.9563078E38)
            r4.A09(r0)
            r0 = 2131963165(0x7f132d1d, float:1.9563076E38)
            r4.A08(r0)
            r2 = 2131968772(0x7f134304, float:1.9574448E38)
            X.8ae r1 = X.C358278ae.DEFAULT
            r0 = 0
            r4.A0R(r0, r1, r2)
            X.DbT.A1V(r4)
        L_0x0a65:
            r0 = 1216604628(0x4883e9d4, float:270158.62)
            goto L_0x1393
        L_0x0a6a:
            java.lang.Object r4 = r0.A02
            X.NJY r4 = (X.NJY) r4
            X.0eM r1 = r4.A14
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r1)
            X.Dri r2 = X.C71123OdH.A00(r0, r5)
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            androidx.fragment.app.FragmentActivity r0 = r4.requireActivity()
            X.OXA.A00(r0, r4, r1, r2)
            goto L_0x0a65
        L_0x0a84:
            r1 = -759444087(0xffffffffd2bbcd89, float:-4.03303596E11)
            int r3 = X.AnonymousClass0fD.A05(r1)
            X.NgR r7 = new X.NgR
            r7.<init>()
            java.lang.Object r6 = r0.A02
            X.NJY r6 = (X.NJY) r6
            X.N4P r1 = r6.A0Z
            r5 = 0
            if (r1 == 0) goto L_0x0acc
            X.3t3 r4 = r1.A0L
        L_0x0a9b:
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.Object r0 = r0.A01
            java.lang.String r1 = X.DbS.A0q(r0)
            java.lang.String r0 = "bot_id"
            r2.putString(r0, r1)
            if (r4 == 0) goto L_0x0ab1
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID"
            X.OXL.A02(r2, r4, r0)
        L_0x0ab1:
            r7.setArguments(r2)
            androidx.fragment.app.FragmentActivity r1 = r6.requireActivity()
            X.0eM r0 = r6.A14
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.6Yo r1 = X.DbU.A0P(r5, r7, r1, r0)
            java.lang.String r0 = "ThreadDetailHomePageFragment"
            X.C66583MXo.A1G(r1, r0)
            r0 = 1566362401(0x5d5ccb21, float:9.943654E17)
            goto L_0x1393
        L_0x0acc:
            r4 = r5
            goto L_0x0a9b
        L_0x0ace:
            r1 = 216438099(0xce69553, float:3.5526982E-31)
            int r8 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r1 = r0.A01
            X.1Av r1 = (X.1Av) r1
            X.0xY r2 = X.AnonymousClass7TE.A0p(r1)
            java.lang.String r1 = "bc_qr_code_sharing_has_seen_new_badge_in_thread_details"
            X.DbW.A1L(r2, r1)
            java.lang.Object r11 = r0.A02
            X.NJ7 r11 = (X.NJ7) r11
            java.lang.String r6 = r11.A00
            if (r6 == 0) goto L_0x0baa
            X.0eM r4 = r11.A0G
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            X.17i r3 = X.17h.A00(r0)
            X.Dde r2 = r11.A07
            X.0YZ[] r1 = X.NJ7.A0L
            r0 = 6
            java.lang.Object r0 = X.C66940MfZ.A01(r2, r11, r1, r0)
            java.lang.String r0 = (java.lang.String) r0
            com.instagram.user.model.User r3 = r3.A02(r0)
            if (r3 == 0) goto L_0x0baa
            java.lang.String r7 = r3.getUsername()
            android.text.SpannableStringBuilder r0 = X.DbS.A0C(r7)
            boolean r2 = r11.A02
            if (r2 == 0) goto L_0x0b32
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r4)
            X.6gx r12 = X.C313746gw.A00(r2)
            int r16 = X.C66583MXo.A03(r11)
            X.3t3 r2 = X.NJ7.A00(r11)
            java.lang.String r14 = X.C300965yF.A07(r2)
            java.lang.String r15 = X.NJ7.A02(r11)
            boolean r17 = X.NJ7.A08(r11)
            java.lang.Integer r13 = X.AnonymousClass05K.A0N
            r12.A0M(r13, r14, r15, r16, r17)
        L_0x0b32:
            boolean r2 = r3.isVerified()
            if (r2 == 0) goto L_0x0b49
            android.content.Context r5 = r11.requireContext()
            r2 = 0
            int r3 = X.00l.A08(r0, r7, r2, r2)
            int r2 = X.DbX.A05(r7)
            int r3 = r3 + r2
            X.C244273av.A04(r5, r0, r3)
        L_0x0b49:
            boolean r2 = X.NJ7.A08(r11)
            if (r2 == 0) goto L_0x0baf
            java.lang.String r5 = "cq"
        L_0x0b51:
            java.lang.String r3 = "s"
            android.util.Pair r2 = new android.util.Pair
            r2.<init>(r3, r5)
            java.util.List r2 = X.AnonymousClass7TE.A1I(r2)
            java.lang.String r18 = X.OXO.A01(r6, r2)
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r4)
            X.0Tu r5 = X.0Tu.A05
            r2 = 36319407397936501(0x81084f00681d75, double:3.031877712745517E-306)
            boolean r22 = X.182.A06(r5, r6, r2)
            androidx.fragment.app.FragmentActivity r10 = r11.requireActivity()
            com.instagram.common.session.UserSession r12 = X.AnonymousClass7TE.A0l(r4)
            X.Dde r3 = r11.A08
            r2 = 3
            java.lang.Object r13 = X.C66940MfZ.A01(r3, r11, r1, r2)
            com.instagram.common.typedurl.ImageUrl r13 = (com.instagram.common.typedurl.ImageUrl) r13
            r19 = 0
            r2 = 2131970993(0x7f134bb1, float:1.9578953E38)
            java.lang.String r20 = r11.getString(r2)
            X.Dde r3 = r11.A09
            r2 = 2
            java.lang.Object r1 = X.C66940MfZ.A01(r3, r11, r1, r2)
            java.lang.String r1 = (java.lang.String) r1
            r21 = 0
            X.PRM r15 = new X.PRM
            r15.<init>(r11)
            X.O6z r14 = new X.O6z
            r14.<init>(r11)
            X.LT3 r9 = new X.LT3
            r17 = r0
            r16 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r9.A04()
        L_0x0baa:
            r0 = -1645883987(0xffffffff9de5cdad, float:-6.082846E-21)
            goto L_0x1105
        L_0x0baf:
            java.lang.String r5 = "fq"
            goto L_0x0b51
        L_0x0bb2:
            r1 = 1882629607(0x7036a5e7, float:2.2610734E29)
            int r3 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r1 = r0.A01
            android.widget.EditText r1 = (android.widget.EditText) r1
            java.lang.String r1 = X.AnonymousClass7TF.A0f(r1)
            java.lang.Float r1 = X.012.A0q(r1)
            if (r1 == 0) goto L_0x0bf0
            float r4 = r1.floatValue()
        L_0x0bcb:
            java.lang.Object r2 = r0.A02
            X.MuD r2 = (X.C67758MuD) r2
            X.0eM r0 = r2.A0D
            java.lang.Object r0 = r0.getValue()
            X.3HH r0 = (X.AnonymousClass3HH) r0
            X.0xa r0 = r0.A00
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "CUSTOM_DISK_SPACE_THRESHOLD"
            r1.E5W(r0, r4)
            r1.apply()
            r0 = 2131966485(0x7f133a15, float:1.956981E38)
            X.C67758MuD.A03(r2, r0)
            r0 = 776177862(0x2e4388c6, float:4.4459346E-11)
            goto L_0x1393
        L_0x0bf0:
            r4 = 0
            goto L_0x0bcb
        L_0x0bf2:
            r1 = 753437780(0x2ce88c54, float:6.609416E-12)
            int r7 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A02
            X.NQE r5 = (X.NQE) r5
            X.7NH r1 = r5.A04
            java.lang.Object r4 = r0.A01
            X.Otx r4 = (X.C71972Otx) r4
            X.Jv7 r6 = r4.A00
            java.lang.Object r0 = r6.A04
            X.5FV r0 = (X.AnonymousClass5FV) r0
            r3 = 0
            X.0qQ.A0B(r0, r3)
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0c32
            X.0wc r1 = r1.A00
            java.lang.String r0 = "ig_click_send_avatar_power_up"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0c32
            java.lang.Long r1 = X.C51968G9o.A0u()
            java.lang.String r0 = "client_timestamp_ms"
            r2.A9F(r0, r1)
            java.lang.String r1 = "direct_composer"
            java.lang.String r0 = "send_source"
            r2.AAJ(r0, r1)
            r2.Cgf()
        L_0x0c32:
            X.MBb r1 = r5.A01
            X.79c r0 = r4.A01
            java.lang.CharSequence r0 = r0.A04
            java.lang.String r5 = r0.toString()
            X.0qQ.A0B(r5, r3)
            java.lang.Object r4 = r1.A01
            X.OVb r4 = (X.C70987OVb) r4
            X.7Sw r3 = r4.A0C
            java.lang.Object r0 = r6.A03
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0
            java.lang.String r2 = r0.getUrl()
            X.PHE r1 = new X.PHE
            r1.<init>(r6, r4, r5)
            X.7Sw r0 = X.C331897Sw.A0A
            r3.A05(r1, r2)
            r0 = 629247929(0x25818fb9, float:2.2475323E-16)
            goto L_0x12dc
        L_0x0c5c:
            r1 = 1526409044(0x5afb2754, float:3.53467304E16)
            int r3 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.F1n r2 = (X.C49680F1n) r2
            java.lang.String r1 = "dropout_severity"
            r2.A00(r1)
            X.37E r2 = X.AnonymousClass37D.A00
            java.lang.Object r1 = r0.A02
            com.instagram.bugreporter.BugReportSevereSwitchView r1 = (com.instagram.bugreporter.BugReportSevereSwitchView) r1
            android.app.Activity r0 = com.instagram.bugreporter.BugReportSevereSwitchView.A00(r1)
            X.DbX.A10(r0, r2)
            com.instagram.igds.components.switchbutton.IgdsSwitch r1 = r1.A05
            if (r1 == 0) goto L_0x0c81
            r0 = 0
            r1.setChecked(r0)
        L_0x0c81:
            r0 = -1174888920(0xffffffffb9f89e28, float:-4.7420082E-4)
            goto L_0x1393
        L_0x0c86:
            r1 = -1263699232(0xffffffffb4ad7ae0, float:-3.2313164E-7)
            int r3 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.F1n r2 = (X.C49680F1n) r2
            java.lang.String r1 = "confirm_severity"
            r2.A00(r1)
            X.37E r2 = X.AnonymousClass37D.A00
            java.lang.Object r1 = r0.A02
            com.instagram.bugreporter.BugReportSevereSwitchView r1 = (com.instagram.bugreporter.BugReportSevereSwitchView) r1
            android.app.Activity r0 = com.instagram.bugreporter.BugReportSevereSwitchView.A00(r1)
            X.DbX.A10(r0, r2)
            com.instagram.igds.components.switchbutton.IgdsSwitch r1 = r1.A05
            if (r1 == 0) goto L_0x0cab
            r0 = 1
            r1.setChecked(r0)
        L_0x0cab:
            r0 = 1290751788(0x4cef4f2c, float:1.25466976E8)
            goto L_0x1393
        L_0x0cb0:
            r1 = -216229554(0xfffffffff31c994e, float:-1.2407039E31)
            int r3 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r1 = r0.A02
            X.NO2 r1 = (X.NO2) r1
            X.OJe r1 = r1.A00
            java.lang.Object r6 = r0.A01
            com.instagram.direct.fragment.thread.poll.view.PollMessageOptionViewModel r6 = (com.instagram.direct.fragment.thread.poll.view.PollMessageOptionViewModel) r6
            r9 = 0
            X.Oam r7 = r1.A00
            X.O76 r0 = r7.A06
            X.3sy r5 = r7.A07
            X.0wc r1 = r0.A00
            java.lang.String r0 = "show_voters"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r1, r0)
            X.N0z r2 = new X.N0z
            r2.<init>()
            java.lang.String r1 = X.C66647MaG.A0B(r5)
            if (r1 == 0) goto L_0x0d77
            java.lang.String r0 = "thread_id"
            r2.A06(r0, r1)
            X.C66583MXo.A13(r4, r2)
            X.NJC r1 = r7.A02
            if (r1 == 0) goto L_0x0d72
            X.O75 r0 = r1.A03
            if (r0 == 0) goto L_0x0d72
            boolean r7 = r1.A09
            X.NJd r4 = r0.A00
            X.0eM r10 = r4.A06
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r10)
            X.2Dm r1 = X.1bJ.A00(r0)
            java.lang.String r0 = r4.A03
            java.lang.String r11 = "threadId"
            r5 = 0
            if (r0 == 0) goto L_0x13c9
            X.3U9 r0 = r1.C60(r0)
            if (r0 == 0) goto L_0x0d0a
            java.lang.String r5 = r0.C6k()
        L_0x0d0a:
            if (r7 == 0) goto L_0x0d37
            X.6gx r8 = X.C66583MXo.A0P(r10)
            java.lang.String r2 = r4.A03
            if (r2 == 0) goto L_0x13c9
            X.1Ln r1 = X.DbT.A0J(r8)
            boolean r0 = X.DbT.A1Y(r1)
            if (r0 == 0) goto L_0x0d37
            X.DbW.A17(r1, r8)
            java.lang.String r0 = "retrieve_polls_responses_details"
            X.Dba.A1D(r1, r0)
            java.lang.String r0 = "poll_responses"
            X.C66581MXm.A1J(r1, r0)
            java.lang.String r0 = "instagram"
            java.lang.Long r0 = X.C66583MXo.A0e(r1, r0, r2, r5)
            r1.A0i(r0)
            r1.Cgf()
        L_0x0d37:
            X.0lg r0 = X.DbT.A0X(r10)
            java.lang.String r2 = r4.A03
            if (r2 == 0) goto L_0x13c9
            X.0qQ.A0B(r0, r9)
            android.os.Bundle r1 = X.DbV.A0A(r0)
            java.lang.String r0 = "DirectPollMessageVotersFragment_ARGS_IS_BROADCAST_CHAT_THREAD"
            r1.putBoolean(r0, r7)
            java.lang.String r0 = "DirectPollMessageVotersFragment_OPTION_VIEW_MODEL"
            r1.putParcelable(r0, r6)
            java.lang.String r0 = "DirectPollMessageVotersFragment_ARGS_THREAD_ID"
            r1.putString(r0, r2)
            java.lang.String r0 = "DirectPollMessageVotersFragment_ARGS_THREAD_V2_ID"
            r1.putString(r0, r5)
            X.NJj r2 = new X.NJj
            r2.<init>()
            r2.setArguments(r1)
            X.0hq r1 = r4.A02
            if (r1 != 0) goto L_0x0d6a
            java.lang.String r11 = "childFragMan"
            goto L_0x13c9
        L_0x0d6a:
            X.0s1 r0 = new X.0s1
            r0.<init>(r1)
            X.C66584MXp.A0k(r2, r0)
        L_0x0d72:
            r0 = -1078960151(0xffffffffbfb05fe9, float:-1.377927)
            goto L_0x1393
        L_0x0d77:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0d7c:
            r1 = 141300369(0x86c1291, float:7.104049E-34)
            int r3 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r1 = r0.A02
            X.OGs r1 = (X.C70697OGs) r1
            X.O72 r1 = r1.A00
            if (r1 != 0) goto L_0x0d8f
            java.lang.String r11 = "onInstantReplyClickListener"
            goto L_0x13c9
        L_0x0d8f:
            java.lang.Object r0 = r0.A01
            X.4ou r0 = (X.C274694ou) r0
            java.lang.String r8 = r0.A05
            X.0qQ.A07(r8)
            java.lang.String r7 = r0.A03
            X.NJx r5 = r1.A00
            X.OKK r2 = r5.A01
            if (r2 == 0) goto L_0x0df9
            r22 = 0
            X.NJx r1 = r2.A01
            android.content.Context r9 = r1.getContext()
            java.lang.String r0 = "null cannot be cast to non-null type android.content.Context"
            X.0qQ.A0C(r9, r0)
            androidx.fragment.app.FragmentActivity r6 = r1.getActivity()
            r0 = 0
            java.lang.String r0 = X.Pxd.A00(r0)
            X.0qQ.A0C(r6, r0)
            X.OI2 r4 = r2.A00
            com.instagram.common.session.UserSession r2 = r4.A04
            X.0iw r1 = r4.A03
            int r0 = r4.A01
            r10 = 0
            r11 = r6
            r12 = r9
            r13 = r1
            r14 = r2
            r15 = r10
            r16 = r0
            r17 = r22
            boolean r0 = X.C71118OdC.A03(r11, r12, r13, r14, r15, r16, r17)
            if (r0 != 0) goto L_0x0dee
            X.7L7 r9 = r4.A06
            java.lang.String r20 = "business_persistent_menu"
            r11 = r10
            r12 = r10
            r13 = r10
            r14 = r10
            r16 = r10
            r19 = r10
            r21 = r10
            r18 = r7
            r17 = r8
            X.1aU r2 = r9.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.1a8 r1 = r9.A00
            r0 = 26
            X.PU8.A00(r2, r1, r9, r0)
        L_0x0dee:
            X.7Pu r0 = r4.A00
            if (r0 != 0) goto L_0x0df6
            java.lang.String r11 = "bottomSheet"
            goto L_0x13c9
        L_0x0df6:
            r0.A07()
        L_0x0df9:
            X.OKK r1 = r5.A01
            if (r1 == 0) goto L_0x0e02
            java.lang.String r0 = "postback"
            r1.A00(r0)
        L_0x0e02:
            r0 = -1837305410(0xffffffff927cf1be, float:-7.981515E-28)
            goto L_0x1393
        L_0x0e07:
            r1 = 626883748(0x255d7ca4, float:1.9210924E-16)
            int r3 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A02
            X.P3E r4 = (X.P3E) r4
            com.instagram.common.session.UserSession r8 = r4.A0G
            java.lang.String r1 = "ig_direct_expression_tray"
            X.0wc r6 = X.DbW.A0J(r8, r1)
            com.instagram.model.direct.DirectThreadKey r5 = r4.A0S
            java.lang.String r1 = r4.A0U
            java.lang.Object r2 = r0.A01
            X.JwA r2 = (X.C61072JwA) r2
            java.lang.Object r0 = r2.A02
            X.LC3 r0 = (X.LC3) r0
            X.GSY r0 = r0.A00()
            X.Nt1.A00(r0, r6, r8, r5, r1)
            X.37D r1 = r4.A0T
            if (r1 == 0) goto L_0x0e36
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.A0F(r0)
        L_0x0e36:
            X.0eM r7 = r4.A0V
            java.lang.Object r1 = r7.getValue()
            X.52T r1 = (X.AnonymousClass52T) r1
            int r0 = r2.A01
            r1.A00 = r0
            X.0Tu r6 = X.0Tu.A05
            r0 = 36329706723557650(0x8111ad000d4112, double:3.0383910477403873E-306)
            boolean r0 = X.182.A06(r6, r8, r0)
            if (r0 == 0) goto L_0x0e9e
            androidx.recyclerview.widget.GridLayoutManager r5 = r4.A0E
            int r2 = r5.A1a()
            java.lang.Object r0 = r7.getValue()
            X.52T r0 = (X.AnonymousClass52T) r0
            int r0 = r0.A00
            int r2 = r2 - r0
            r0 = 36611181700389077(0x8211ad000f18d5, double:3.2163969564973395E-306)
            int r1 = X.DbS.A04(r6, r8, r0)
            java.lang.String r11 = "recyclerView"
            if (r2 <= r1) goto L_0x0e89
            java.lang.Object r0 = r7.getValue()
            X.52T r0 = (X.AnonymousClass52T) r0
            int r0 = r0.A00
            int r0 = r0 + r1
            r5.A1O(r0)
            androidx.recyclerview.widget.RecyclerView r2 = r4.A06
            if (r2 == 0) goto L_0x13c9
            r1 = 0
        L_0x0e7c:
            X.OkC r0 = new X.OkC
            r0.<init>(r4, r1)
            r2.addOnLayoutChangeListener(r0)
        L_0x0e84:
            r0 = -376514056(0xffffffffe98ed9f8, float:-2.15871E25)
            goto L_0x1393
        L_0x0e89:
            int r0 = -r1
            if (r2 >= r0) goto L_0x0e9e
            java.lang.Object r0 = r7.getValue()
            X.52T r0 = (X.AnonymousClass52T) r0
            int r0 = r0.A00
            int r0 = r0 - r1
            r5.A1O(r0)
            androidx.recyclerview.widget.RecyclerView r2 = r4.A06
            if (r2 == 0) goto L_0x13c9
            r1 = 1
            goto L_0x0e7c
        L_0x0e9e:
            androidx.recyclerview.widget.GridLayoutManager r1 = r4.A0E
            java.lang.Object r0 = r7.getValue()
            X.52T r0 = (X.AnonymousClass52T) r0
            r1.A0t(r0)
            goto L_0x0e84
        L_0x0eaa:
            r1 = 1773737689(0x69b916d9, float:2.7969896E25)
            int r8 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A02
            X.NKF r4 = (X.NKF) r4
            boolean r1 = r4 instanceof X.NVV
            if (r1 == 0) goto L_0x0f3d
            X.7Zi r9 = r4.A09
            if (r9 == 0) goto L_0x1109
            com.instagram.model.direct.DirectThreadKey r11 = r4.A06()
            X.Nk5 r1 = r4.A05()
            int r3 = r1.A01
            com.instagram.common.ui.base.IgEditText r1 = r4.A03()
            java.lang.String r13 = X.AnonymousClass7TF.A0f(r1)
            android.content.Context r2 = r4.A01()
            X.Nk5 r1 = r4.A05()
            int r1 = r1.A00
            java.lang.String r14 = X.AnonymousClass7TE.A16(r2, r1)
            X.NjA r1 = r4.A05
            if (r1 == 0) goto L_0x0f3b
            java.lang.String r15 = r1.name()
        L_0x0ee5:
            r20 = 0
            r10 = 0
            r12 = r10
            r16 = r10
            r17 = r10
            r18 = r10
            r19 = r3
            r9.A0E(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
        L_0x0ef4:
            X.NKF.A00(r4)
            java.lang.Object r0 = r0.A01
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            X.0hq r2 = r0.getSupportFragmentManager()
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "DirectPromptsFragment.CONVERSATION_STARTERS_QUESTIONS_PROMPT_REQUEST_KEY"
            r2.A0z(r0, r1)
            X.7Zi r0 = r4.A09
            if (r0 == 0) goto L_0x1109
            java.lang.Integer r2 = r0.CHQ()
            r1 = 0
            X.0qQ.A0B(r2, r1)
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r2 != r0) goto L_0x0f1f
            android.content.Context r0 = r4.A01()
            X.O02.A00(r0, r1, r1)
        L_0x0f1f:
            X.7IQ r9 = r4.A06
            if (r9 == 0) goto L_0x1238
            com.instagram.model.direct.DirectThreadKey r0 = r4.A06()
            java.lang.String r11 = r0.A00
            com.instagram.model.direct.DirectThreadKey r0 = r4.A06()
            java.lang.String r12 = r0.A01
            int r13 = r4.A01
            int r14 = r4.A00
            java.lang.String r0 = r4.A0B
            if (r0 != 0) goto L_0x10f9
            java.lang.String r11 = "currentTabAsString"
            goto L_0x13c9
        L_0x0f3b:
            r15 = 0
            goto L_0x0ee5
        L_0x0f3d:
            boolean r1 = r4 instanceof X.NVX
            if (r1 == 0) goto L_0x1001
            r3 = r4
            X.NVX r3 = (X.NVX) r3
            com.instagram.common.ui.base.IgEditText r1 = r3.A03()
            java.lang.String r2 = X.AnonymousClass7TF.A0f(r1)
            com.instagram.common.session.UserSession r1 = r3.getSession()
            boolean r1 = X.AnonymousClass7K4.A02(r1)
            r7 = 2131958859(0x7f131c4b, float:1.9554342E38)
            if (r1 == 0) goto L_0x0f5c
            r7 = 2131958858(0x7f131c4a, float:1.955434E38)
        L_0x0f5c:
            X.7Zi r13 = r3.A09
            if (r13 == 0) goto L_0x1109
            com.instagram.model.direct.DirectThreadKey r15 = r3.A06()
            X.Nk5 r1 = r3.A05()
            int r1 = r1.A01
            android.content.Context r6 = r3.A01()
            X.Nk5 r5 = r3.A05()
            int r5 = r5.A00
            java.lang.String r18 = X.AnonymousClass7TE.A16(r6, r5)
            X.NjA r5 = r3.A05
            r14 = 0
            if (r5 == 0) goto L_0x0fbb
            java.lang.String r19 = r5.name()
        L_0x0f81:
            r6 = 0
            android.content.Context r5 = r3.A01()
            java.lang.String r20 = r5.getString(r7)
            long r11 = java.lang.System.currentTimeMillis()
            r9 = 86400000(0x5265c00, double:4.2687272E-316)
            long r11 = r11 + r9
            java.lang.Long r16 = java.lang.Long.valueOf(r11)
            r21 = r14
            r22 = r14
            r23 = r1
            r24 = r6
            r17 = r2
            r13.A0E(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            com.instagram.common.session.UserSession r1 = r3.getSession()
            X.1Ng r5 = X.AnonymousClass1Nd.A00(r1)
            X.Osi r1 = new X.Osi
            r1.<init>(r6)
            r5.A00(r1)
            X.Mts r1 = r3.A03
            if (r1 != 0) goto L_0x0fbe
            java.lang.String r11 = "promptNamingSuggestionsViewModel"
            goto L_0x13c9
        L_0x0fbb:
            r19 = r14
            goto L_0x0f81
        L_0x0fbe:
            X.0qQ.A0B(r2, r6)
            X.0Ud r1 = r1.A09
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            boolean r6 = r1.contains(r2)
            X.MfP r9 = r3.A02
            if (r9 == 0) goto L_0x1238
            com.instagram.model.direct.DirectThreadKey r1 = r3.A06()
            java.lang.String r10 = r1.A00
            com.instagram.model.direct.DirectThreadKey r1 = r3.A06()
            java.lang.String r11 = r1.A01
            int r5 = r3.A00
            java.lang.String r1 = "daily_prompt_text"
            X.0eP r3 = X.AnonymousClass7TE.A1L(r1, r2)
            if (r6 == 0) goto L_0x0ffe
            java.lang.String r2 = "YES"
        L_0x0fe9:
            java.lang.String r1 = "has_selected_prompt_suggestion"
            java.util.LinkedHashMap r16 = X.DbY.A0p(r1, r2, r3)
            java.lang.String r12 = "daily_prompt_start"
            java.lang.String r13 = "tap"
            java.lang.String r14 = "send_button"
            java.lang.String r15 = "daily_prompt_null_creation_sheet"
            r17 = r5
            X.C66930MfP.A02(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0ef4
        L_0x0ffe:
            java.lang.String r2 = "NO"
            goto L_0x0fe9
        L_0x1001:
            r3 = r4
            X.NVW r3 = (X.NVW) r3
            X.JwH r5 = X.C67750Mu3.A00(r3)
            java.lang.Object r2 = r5.A00
            X.Nk9 r2 = (X.C69369Nk9) r2
            int r9 = r2.A01
            java.lang.Object r1 = r5.A01
            X.NkD r1 = (X.C69373NkD) r1
            int r7 = r1.A02
            java.lang.String r6 = r5.A02
            X.NkD r5 = X.C69373NkD.CUSTOM
            r14 = 0
            if (r1 == r5) goto L_0x10f5
            int r5 = r1.A01
            java.lang.String r17 = r3.getString(r5)
        L_0x1021:
            r5 = 2131954912(0x7f130ce0, float:1.9546337E38)
            java.lang.String r18 = r3.getString(r5)
            r5 = 2131954937(0x7f130cf9, float:1.9546387E38)
            java.lang.String r19 = r3.getString(r5)
            r5 = 1
            X.ULw r12 = new X.ULw
            r15 = r12
            r20 = r9
            r21 = r7
            r22 = r5
            r16 = r6
            r15.<init>((java.lang.String) r16, (java.lang.String) r17, (java.lang.String) r18, (java.lang.String) r19, (int) r20, (int) r21, (int) r22)
            X.7Zi r11 = r3.A09
            if (r11 == 0) goto L_0x1109
            com.instagram.model.direct.DirectThreadKey r13 = r3.A06()
            X.Nk5 r7 = r3.A05()
            int r7 = r7.A01
            com.instagram.common.ui.base.IgEditText r9 = r3.A03()
            java.lang.String r15 = X.AnonymousClass7TF.A0f(r9)
            android.content.Context r10 = r3.A01()
            X.Nk5 r9 = r3.A05()
            int r9 = r9.A00
            java.lang.String r16 = X.AnonymousClass7TE.A16(r10, r9)
            X.NjA r9 = r3.A05
            if (r9 == 0) goto L_0x10f1
            java.lang.String r17 = r9.name()
        L_0x106a:
            r22 = 0
            r18 = r14
            r19 = r14
            r20 = r14
            r21 = r7
            r11.A0E(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            com.instagram.common.session.UserSession r7 = r3.getSession()
            X.0xY r9 = X.AnonymousClass7TF.A0N(r7)
            java.lang.String r7 = "broadcast_channel_challenges_nux"
            r9.E5T(r7, r5)
            r9.apply()
            X.0eM r5 = r3.A00
            X.OyR r15 = X.C66580MXl.A0T(r5)
            com.instagram.model.direct.DirectThreadKey r5 = r3.A06()
            java.lang.String r7 = r5.A00
            com.instagram.model.direct.DirectThreadKey r5 = r3.A06()
            java.lang.String r5 = r5.A01
            int r12 = r3.A00
            com.instagram.common.ui.base.IgEditText r3 = r3.A03()
            java.lang.String r9 = X.AnonymousClass7TF.A0f(r3)
            java.lang.String r11 = r1.A03
            if (r11 != 0) goto L_0x10a8
            r11 = r6
        L_0x10a8:
            int r1 = r6.length()
            boolean r3 = X.AnonymousClass7TF.A1R(r1)
            int r10 = r2.A00
            X.C51972G9s.A1D(r9, r11)
            java.lang.Integer r16 = java.lang.Integer.valueOf(r12)
            java.lang.String r1 = "challenge_prompt"
            X.0eP r9 = X.AnonymousClass7TE.A1L(r1, r9)
            java.lang.String r1 = "selected_prize"
            X.0eP r6 = X.AnonymousClass7TE.A1L(r1, r11)
            if (r3 == 0) goto L_0x10ee
            java.lang.String r2 = "True"
        L_0x10c9:
            java.lang.String r1 = "custom_prize"
            X.0eP r3 = X.AnonymousClass7TE.A1L(r1, r2)
            java.lang.String r2 = java.lang.String.valueOf(r10)
            java.lang.String r1 = "selected_duration_days"
            X.0eP[] r1 = X.AnonymousClass7TH.A0h(r1, r2, r9, r6, r3)
            java.util.LinkedHashMap r23 = X.0Yt.A06(r1)
            java.lang.String r19 = "challenge_start"
            java.lang.String r20 = "tap"
            java.lang.String r21 = "start_button"
            java.lang.String r22 = "challenge_null_creation_sheet"
            r17 = r7
            r18 = r5
            X.C72202OyR.A03(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x0ef4
        L_0x10ee:
            java.lang.String r2 = "False"
            goto L_0x10c9
        L_0x10f1:
            r17 = r14
            goto L_0x106a
        L_0x10f5:
            r17 = r14
            goto L_0x1021
        L_0x10f9:
            com.instagram.direct.prompts.DirectPromptTypes r10 = X.AnonymousClass79B.A01(r0)
            boolean r15 = r4.A0C
            r9.A09(r10, r11, r12, r13, r14, r15)
            r0 = -1860027168(0xffffffff91223ce0, float:-1.2798305E-28)
        L_0x1105:
            X.AnonymousClass0fD.A0C(r0, r8)
            return
        L_0x1109:
            java.lang.String r11 = "sendManager"
            goto L_0x13c9
        L_0x110d:
            r1 = -166646889(0xfffffffff6112b97, float:-7.361007E32)
            int r6 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A02
            X.NJI r5 = (X.NJI) r5
            X.0eM r1 = r5.A06
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r1)
            com.instagram.model.direct.DirectThreadKey r2 = r5.A03
            if (r2 == 0) goto L_0x123c
            r1 = 1
            X.C371178xk.A00(r3, r2, r1)
            X.6gx r4 = r5.A01
            r3 = 0
            if (r4 == 0) goto L_0x1238
            java.lang.Object r1 = r0.A01
            X.2Ep r1 = (X.AnonymousClass2Ep) r1
            X.3Te r0 = X.C66580MXl.A0b(r1)
            if (r0 == 0) goto L_0x113b
            int r0 = r0.A00
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L_0x113b:
            java.lang.String r2 = r1.C6C()
            java.lang.String r1 = r1.C6k()
            r0 = 0
            r4.A0P(r3, r2, r1, r0)
            X.DbZ.A17(r5)
            r0 = -1629033080(0xffffffff9ee6ed88, float:-2.4450438E-20)
            goto L_0x1234
        L_0x114f:
            r1 = -1057065081(0xffffffffc0fe7787, float:-7.9520907)
            int r6 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r7 = r0.A02
            X.NJI r7 = (X.NJI) r7
            X.0eM r8 = r7.A06
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r8)
            com.instagram.model.direct.DirectThreadKey r1 = r7.A03
            if (r1 == 0) goto L_0x123c
            r5 = 1
            X.C371178xk.A00(r2, r1, r5)
            X.6gx r4 = r7.A01
            r3 = 0
            if (r4 == 0) goto L_0x1238
            java.lang.Object r2 = r0.A01
            X.2Ep r2 = (X.AnonymousClass2Ep) r2
            X.3Te r0 = X.C66580MXl.A0b(r2)
            if (r0 == 0) goto L_0x117d
            int r0 = r0.A00
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L_0x117d:
            java.lang.String r1 = r2.C6C()
            java.lang.String r0 = r2.C6k()
            r4.A0P(r3, r1, r0, r5)
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r8)
            com.instagram.model.direct.DirectThreadKey r0 = r7.A03
            if (r0 == 0) goto L_0x123c
            X.C66671Mae.A0F(r1, r0, r5)
            X.Psm r0 = r7.A02
            if (r0 == 0) goto L_0x119a
            r0.Euf()
        L_0x119a:
            X.DbZ.A17(r7)
            r0 = 1307393770(0x4ded3eea, float:4.97540416E8)
            goto L_0x1234
        L_0x11a2:
            r1 = -665249536(0xffffffffd8591900, float:-9.5480559E14)
            int r6 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A02
            X.NJK r5 = (X.NJK) r5
            X.0eM r1 = r5.A06
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r1)
            com.instagram.model.direct.DirectThreadKey r2 = r5.A03
            if (r2 == 0) goto L_0x123c
            r1 = 1
            X.C371178xk.A00(r3, r2, r1)
            X.6gx r4 = r5.A01
            r3 = 0
            if (r4 == 0) goto L_0x1238
            java.lang.Object r1 = r0.A01
            X.2Ep r1 = (X.AnonymousClass2Ep) r1
            X.3Te r0 = X.C66580MXl.A0b(r1)
            if (r0 == 0) goto L_0x11d0
            int r0 = r0.A00
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L_0x11d0:
            java.lang.String r2 = r1.C6C()
            java.lang.String r1 = r1.C6k()
            r0 = 0
            r4.A0P(r3, r2, r1, r0)
            X.DbZ.A17(r5)
            r0 = -611126958(0xffffffffdb92f152, float:-8.2721362E16)
            goto L_0x1234
        L_0x11e3:
            r1 = -1453524897(0xffffffffa95cf85f, float:-4.906524E-14)
            int r6 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r7 = r0.A02
            X.NJK r7 = (X.NJK) r7
            X.0eM r8 = r7.A06
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r8)
            com.instagram.model.direct.DirectThreadKey r1 = r7.A03
            if (r1 == 0) goto L_0x123c
            r5 = 1
            X.C371178xk.A00(r2, r1, r5)
            X.6gx r4 = r7.A01
            r3 = 0
            if (r4 == 0) goto L_0x1238
            java.lang.Object r2 = r0.A01
            X.2Ep r2 = (X.AnonymousClass2Ep) r2
            X.3Te r0 = X.C66580MXl.A0b(r2)
            if (r0 == 0) goto L_0x1211
            int r0 = r0.A00
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L_0x1211:
            java.lang.String r1 = r2.C6C()
            java.lang.String r0 = r2.C6k()
            r4.A0P(r3, r1, r0, r5)
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r8)
            com.instagram.model.direct.DirectThreadKey r0 = r7.A03
            if (r0 == 0) goto L_0x123c
            X.C66671Mae.A0F(r1, r0, r5)
            X.Psm r0 = r7.A02
            if (r0 == 0) goto L_0x122e
            r0.Euf()
        L_0x122e:
            X.DbZ.A17(r7)
            r0 = 143687953(0x8908111, float:8.697028E-34)
        L_0x1234:
            X.AnonymousClass0fD.A0C(r0, r6)
            return
        L_0x1238:
            java.lang.String r11 = "logger"
            goto L_0x13c9
        L_0x123c:
            java.lang.String r11 = "directThreadKey"
            goto L_0x13c9
        L_0x1240:
            r1 = -1556058779(0xffffffffa3406d65, float:-1.0431506E-17)
            int r7 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r1 = r0.A01
            X.JwC r1 = (X.C61074JwC) r1
            java.lang.Object r2 = r1.A00
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            if (r2 != r1) goto L_0x1293
            android.net.Uri$Builder r2 = new android.net.Uri$Builder
            r2.<init>()
            java.lang.String r1 = "instagram"
            android.net.Uri$Builder r2 = r2.scheme(r1)
            java.lang.String r1 = "creator_agent_suggested_replies"
            android.net.Uri$Builder r3 = r2.authority(r1)
            java.lang.String r2 = "entrypoint"
            java.lang.String r1 = "collapsed_sr"
            android.net.Uri r2 = X.DbV.A08(r3, r2, r1)
            X.14C r1 = X.AnonymousClass14B.A03
            X.14B r1 = r1.A00()
            java.lang.Object r3 = r0.A02
            X.7Rx r3 = (X.C331677Rx) r3
            android.view.View r0 = r3.A00
            if (r0 != 0) goto L_0x127c
            java.lang.String r11 = "header"
            goto L_0x13c9
        L_0x127c:
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r0)
            X.0qQ.A0A(r2)
            android.content.Intent r2 = r1.A04(r0, r2)
            r1 = 108(0x6c, float:1.51E-43)
            X.4DH r0 = r3.A0B
            androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
            X.0kR.A07(r0, r2, r1)
            goto L_0x129f
        L_0x1293:
            java.lang.Object r0 = r0.A02
            X.7Rx r0 = (X.C331677Rx) r0
            com.instagram.creator.agent.suggestedreplies.viewmodel.CreatorAgentSuggestedRepliesViewModel r1 = X.C331677Rx.A00(r0)
            r0 = 0
            r1.onContainerExpanded(r0)
        L_0x129f:
            r0 = 1939128263(0x7394bfc7, float:2.357024E31)
            goto L_0x12dc
        L_0x12a3:
            r1 = 2103907888(0x7d671630, float:1.919793E37)
            int r7 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r6 = r0.A02
            X.UaB r6 = (X.C15304UaB) r6
            X.VwK r5 = r6.A01
            if (r5 != 0) goto L_0x12b6
            java.lang.String r11 = "adsManagerLogger"
            goto L_0x13c9
        L_0x12b6:
            X.UzE r1 = X.C16678UzE.PROMOTION_INFORMATION
            java.lang.String r4 = r1.toString()
            java.lang.String r3 = r6.A04
            if (r3 != 0) goto L_0x12c4
            java.lang.String r11 = "mediaId"
            goto L_0x13c9
        L_0x12c4:
            r2 = 0
            java.lang.String r1 = "primary_action_button"
            r5.A0A(r4, r1, r3, r2)
            java.lang.Object r0 = r0.A01
            com.instagram.business.promote.model.PromoteButtonAction r0 = (com.instagram.business.promote.model.PromoteButtonAction) r0
            com.instagram.business.promote.model.PromoteButtonActionType r1 = r0.A00
            if (r1 == 0) goto L_0x12e4
            java.lang.String r0 = r0.A02
            if (r0 == 0) goto L_0x12e0
            X.C15304UaB.A00(r6, r1, r0)
            r0 = -960462606(0xffffffffc6c080f2, float:-24640.473)
        L_0x12dc:
            X.AnonymousClass0fD.A0C(r0, r7)
            return
        L_0x12e0:
            java.lang.String r11 = "link"
            goto L_0x13c9
        L_0x12e4:
            java.lang.String r11 = "type"
            goto L_0x13c9
        L_0x12e8:
            r1 = 1757190572(0x68bc99ac, float:7.125117E24)
            int r3 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.NKH r2 = (X.NKH) r2
            com.instagram.direct.prompts.DirectEditAddYoursParams r1 = r2.A08
            if (r1 == 0) goto L_0x1411
            X.ONz r4 = r2.A06
            if (r4 == 0) goto L_0x1397
            X.Nmf r5 = X.C69497Nmf.SAVE
            X.Nmc r6 = X.C69494Nmc.EDIT_FLOW
            java.lang.String r7 = X.NKH.A00(r2)
            java.lang.String r9 = r2.A0C
            com.instagram.model.direct.DirectThreadKey r1 = r2.A0A
            java.lang.String r11 = "threadKey"
            if (r1 == 0) goto L_0x13c9
            java.lang.String r8 = r1.A00
            r4.A00(r5, r6, r7, r8, r9)
            java.lang.String r10 = r2.A0C
            if (r10 == 0) goto L_0x1377
            X.0eM r9 = r2.A0G
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r9)
            X.7Zi r5 = X.C333527Zh.A00(r1)
            com.instagram.model.direct.DirectThreadKey r4 = r2.A0A
            if (r4 == 0) goto L_0x13c9
            com.instagram.common.ui.base.IgEditText r1 = r2.A03
            java.lang.String r11 = "textField"
            if (r1 == 0) goto L_0x13c9
            java.lang.String r8 = X.AnonymousClass7TF.A0f(r1)
            r15 = 0
            java.lang.String r7 = X.NKH.A00(r2)
            boolean r6 = X.C51970G9q.A1Y(r8)
            com.instagram.common.session.UserSession r12 = r5.A03
            java.lang.Class<X.1kJ> r14 = X.C66161kJ.class
            boolean r1 = r5.A00
            X.ODs r13 = X.OQO.A00(r12, r4)
            r16 = r6
            r17 = r1
            X.MaY r1 = X.C66669Mac.A06(r12, r13, r14, r15, r16, r17)
            java.lang.String r5 = r4.A00
            if (r5 == 0) goto L_0x1416
            X.1mv r4 = new X.1mv
            r4.<init>(r1)
            r1 = 154(0x9a, float:2.16E-43)
            r4.A00 = r1
            r4.A03 = r5
            r4.A02 = r10
            r4.A01 = r8
            r4.A04 = r7
            X.C66580MXl.A1P(r12, r4)
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r9)
            com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository r4 = X.C69911NuD.A00(r1)
            com.instagram.common.ui.base.IgEditText r1 = r2.A03
            if (r1 == 0) goto L_0x13c9
            java.lang.String r2 = X.AnonymousClass7TF.A0f(r1)
            X.0qQ.A0B(r2, r6)
            X.05G r1 = r4.A03
            r1.Epw(r2)
        L_0x1377:
            java.lang.Object r1 = r0.A01
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            X.0nA.A0J(r1)
            X.37E r0 = X.AnonymousClass37D.A00
            X.DbX.A10(r1, r0)
            X.0hq r2 = r1.getSupportFragmentManager()
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "DirectPromptsFragment.CONVERSATION_STARTERS_QUESTIONS_PROMPT_REQUEST_KEY"
            r2.A0z(r0, r1)
            r0 = -143771518(0xfffffffff76e3882, float:-4.8316905E33)
        L_0x1393:
            X.AnonymousClass0fD.A0C(r0, r3)
            return
        L_0x1397:
            java.lang.String r11 = "directPromptsPrivateAndSocialGroupsLogger"
            goto L_0x13c9
        L_0x139a:
            r1 = 494429386(0x1d7864ca, float:3.2874633E-21)
            int r3 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A02
            X.NJ2 r4 = (X.NJ2) r4
            java.lang.Object r1 = r0.A01
            X.OLY r1 = (X.OLY) r1
            r5 = 0
            r1.A03 = r5
            r0 = 1
            r1.A05 = r0
            com.instagram.bugreporter.BugReportComposerViewModel r0 = r1.A00()
            r4.A00 = r0
            X.Pwg r1 = r4.A02
            if (r1 == 0) goto L_0x13d1
            java.lang.String r0 = "gdpr_exclude_logs_continue"
            r1.AVy(r0)
            X.OWB r2 = new X.OWB
            r2.<init>()
            com.instagram.bugreporter.model.BugReport r1 = r4.A03
            if (r1 != 0) goto L_0x13d4
            java.lang.String r11 = "bugReport"
        L_0x13c9:
            X.0qQ.A0F(r11)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x13d1:
            java.lang.String r11 = "userFlowLoggerV2"
            goto L_0x13c9
        L_0x13d4:
            java.lang.String r0 = r1.A0A
            r2.A0A = r0
            java.lang.String r0 = r1.A07
            r2.A07 = r0
            java.util.List r0 = r1.A0K
            r2.A0K = r0
            java.util.List r0 = r1.A0L
            r2.A0L = r0
            java.util.List r0 = r1.A0J
            r2.A0J = r0
            java.util.List r0 = r1.A0M
            r2.A0M = r0
            java.lang.String r0 = r1.A08
            r2.A08 = r0
            r0 = 0
            r2.A09 = r0
            r2.A0I = r0
            r2.A06 = r0
            com.instagram.bugreporter.source.BugReportSource r0 = r1.A00
            r2.A00 = r0
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            r2.A0N = r0
            X.OWB.A00(r2, r1, r5)
            com.instagram.bugreporter.model.BugReport r0 = r2.A01()
            r4.A03 = r0
            X.NJ2.A00(r4)
            r0 = -1636003113(0xffffffff9e7c92d7, float:-1.3371135E-20)
            goto L_0x1393
        L_0x1411:
            X.NKH.A01(r2)
            goto L_0x1377
        L_0x1416:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71405Ok4.onClick(android.view.View):void");
    }

    public static int A00(C71405Ok4 ok4, int i) {
        int A05 = AnonymousClass0fD.A05(i);
        C69184Nga nga = (C69184Nga) ok4.A02;
        NUQ nuq = C69184Nga.A07(nga).A07;
        nuq.A0B("TURN_ON_SECURE_STORAGE");
        nuq.A08();
        C69184Nga.A07(nga).A04(nga.requireActivity(), (C69296Niw) ok4.A01);
        return A05;
    }
}
