package X;

import android.content.DialogInterface;

public final class LV2 implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;

    public LV2(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static LV2 A00(Object obj, int i) {
        return new LV2(obj, i);
    }

    public static void A01(C358248ab r1, Object obj, int i, int i2) {
        r1.A0H(new LV2(obj, i), i2);
    }

    /* JADX WARNING: type inference failed for: r3v21, types: [X.07Z, java.lang.Object, X.K6D] */
    /* JADX WARNING: type inference failed for: r0v153, types: [X.07Z, X.4DH] */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x03dc, code lost:
        com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController.A03(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x03df, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x041b, code lost:
        X.C70888OQg.A00(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00a2, code lost:
        r4 = new X.C66184MGv((java.lang.Object) r2, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x041e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0444, code lost:
        r1.setChecked(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0447, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0448, code lost:
        r0 = "shareToFbContainer";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0455, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x045c, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0175, code lost:
        X.AnonymousClass7TE.A1Z(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0178, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0213, code lost:
        X.C64372Lao.A00(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0216, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x024f, code lost:
        X.DbT.A1J(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0252, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x030c, code lost:
        r1.A04(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x030f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0078, code lost:
        r4 = new X.MGU(r2, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x037d, code lost:
        r0.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0380, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r13, int r14) {
        /*
            r12 = this;
            int r0 = r12.A00
            switch(r0) {
                case 0: goto L_0x03ff;
                case 1: goto L_0x044b;
                case 2: goto L_0x043b;
                case 3: goto L_0x0431;
                case 4: goto L_0x03f6;
                case 5: goto L_0x03e8;
                case 6: goto L_0x03e0;
                case 7: goto L_0x03d8;
                case 8: goto L_0x03a0;
                case 9: goto L_0x0005;
                case 10: goto L_0x0396;
                case 11: goto L_0x038c;
                case 12: goto L_0x041f;
                case 13: goto L_0x00cd;
                case 14: goto L_0x0417;
                case 15: goto L_0x0412;
                case 16: goto L_0x0381;
                case 17: goto L_0x0156;
                case 18: goto L_0x0379;
                case 19: goto L_0x0379;
                case 20: goto L_0x036d;
                case 21: goto L_0x0366;
                case 22: goto L_0x0338;
                case 23: goto L_0x031d;
                case 24: goto L_0x00a9;
                case 25: goto L_0x0310;
                case 26: goto L_0x000a;
                case 27: goto L_0x02ab;
                case 28: goto L_0x029c;
                case 29: goto L_0x027d;
                case 30: goto L_0x0253;
                case 31: goto L_0x0149;
                case 32: goto L_0x0240;
                case 33: goto L_0x0236;
                case 34: goto L_0x0005;
                case 35: goto L_0x0005;
                case 36: goto L_0x0217;
                case 37: goto L_0x013f;
                case 38: goto L_0x0208;
                case 39: goto L_0x01f8;
                case 40: goto L_0x01ea;
                case 41: goto L_0x01ea;
                case 42: goto L_0x000a;
                case 43: goto L_0x01e2;
                case 44: goto L_0x01da;
                case 45: goto L_0x0120;
                case 46: goto L_0x0005;
                case 47: goto L_0x01c9;
                case 48: goto L_0x0091;
                case 49: goto L_0x007f;
                case 50: goto L_0x005f;
                case 51: goto L_0x0005;
                case 52: goto L_0x004d;
                case 53: goto L_0x003b;
                case 54: goto L_0x0023;
                case 55: goto L_0x000b;
                case 56: goto L_0x0113;
                case 57: goto L_0x01bf;
                case 58: goto L_0x01af;
                case 59: goto L_0x0198;
                case 60: goto L_0x0181;
                case 61: goto L_0x0179;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r12.A01
            X.DbS.A1U(r0)
        L_0x000a:
            return
        L_0x000b:
            java.lang.Object r0 = r12.A01
            X.Lm3 r0 = (X.C65025Lm3) r0
            X.0eM r0 = r0.A0F
            X.2YL r2 = X.DbS.A0H(r0)
            X.6oS r5 = X.C318116oQ.A00(r2)
            r1 = 0
            r0 = 12
            X.MG2 r4 = new X.MG2
            r4.<init>(r2, r1, r0)
            goto L_0x0175
        L_0x0023:
            java.lang.Object r0 = r12.A01
            X.K6B r0 = (X.K6B) r0
            X.0eM r0 = r0.A02
            X.2YL r2 = X.DbS.A0H(r0)
            X.6oS r5 = X.C318116oQ.A00(r2)
            r1 = 0
            r0 = 34
            X.MGg r4 = new X.MGg
            r4.<init>(r2, r1, r0)
            goto L_0x0175
        L_0x003b:
            java.lang.Object r0 = r12.A01
            X.K6B r0 = (X.K6B) r0
            X.0eM r0 = r0.A02
            X.2YL r2 = X.DbS.A0H(r0)
            X.6oS r5 = X.C318116oQ.A00(r2)
            r1 = 0
            r0 = 45
            goto L_0x0078
        L_0x004d:
            java.lang.Object r0 = r12.A01
            X.Lgj r0 = (X.C64710Lgj) r0
            X.0eM r0 = r0.A0V
            X.2YL r2 = X.DbS.A0H(r0)
            X.6oS r5 = X.C318116oQ.A00(r2)
            r1 = 0
            r0 = 34
            goto L_0x0078
        L_0x005f:
            java.lang.Object r0 = r12.A01
            X.Kcu r0 = (X.C62260Kcu) r0
            X.0eM r0 = r0.A0E
            java.lang.Object r2 = r0.getValue()
            X.Jhd r2 = (X.C60220Jhd) r2
            X.M0X r1 = r2.A02
            r0 = 0
            r1.A0L(r0, r0)
            X.6oS r5 = X.C318116oQ.A00(r2)
            r1 = 0
            r0 = 17
        L_0x0078:
            X.MGU r4 = new X.MGU
            r4.<init>(r2, r1, r0)
            goto L_0x0175
        L_0x007f:
            java.lang.Object r0 = r12.A01
            X.L7O r0 = (X.L7O) r0
            X.0eM r0 = r0.A02
            X.2YL r2 = X.DbS.A0H(r0)
            X.6oS r5 = X.C318116oQ.A00(r2)
            r1 = 0
            r0 = 44
            goto L_0x00a2
        L_0x0091:
            java.lang.Object r0 = r12.A01
            X.L7O r0 = (X.L7O) r0
            X.0eM r0 = r0.A02
            X.2YL r2 = X.DbS.A0H(r0)
            X.6oS r5 = X.C318116oQ.A00(r2)
            r1 = 0
            r0 = 45
        L_0x00a2:
            X.MGv r4 = new X.MGv
            r4.<init>((java.lang.Object) r2, (X.AnonymousClass4D7) r1, (int) r0)
            goto L_0x0175
        L_0x00a9:
            java.lang.Object r0 = r12.A01
            X.K6o r0 = (X.C61417K6o) r0
            X.0eM r0 = r0.A09
            java.lang.Object r3 = r0.getValue()
            X.Jib r3 = (X.C60280Jib) r3
            X.K1d r0 = r3.A07
            java.lang.String r0 = r0.A03
            java.lang.String r2 = X.LQM.A02(r0)
            X.0qQ.A07(r2)
            X.6oS r5 = X.C318116oQ.A00(r3)
            r1 = 0
            r0 = 0
            X.MFV r4 = new X.MFV
            r4.<init>(r3, r2, r1, r0)
            goto L_0x0175
        L_0x00cd:
            java.lang.Object r3 = r12.A01
            X.LBR r3 = (X.LBR) r3
            X.LSl r0 = r3.A09
            r2 = 1
            r0.A00 = r2
            X.0eM r1 = r3.A0G
            java.lang.Object r0 = r1.getValue()
            X.1Av r0 = (X.1Av) r0
            r0.A1M(r2)
            java.lang.Object r0 = r1.getValue()
            X.1Av r0 = (X.1Av) r0
            r0.A1Z(r2)
            java.lang.Object r0 = r1.getValue()
            X.1Av r0 = (X.1Av) r0
            r0.A1Q(r2)
            java.lang.Object r0 = r1.getValue()
            X.1Av r0 = (X.1Av) r0
            r0.A1O(r2)
            java.lang.Object r0 = r1.getValue()
            X.1Av r0 = (X.1Av) r0
            r0.A1T(r2)
            X.4DH r0 = r3.A07
            X.0xx r5 = X.AnonymousClass07a.A00(r0)
            r1 = 0
            r0 = 3
            X.MGs r4 = new X.MGs
            r4.<init>(r3, r1, r0)
            goto L_0x0175
        L_0x0113:
            java.lang.Object r0 = r12.A01
            X.LOO r0 = (X.LOO) r0
            X.M0Y r1 = r0.A06
            if (r1 == 0) goto L_0x000a
            r0 = 0
            r1.A03(r0, r0)
            return
        L_0x0120:
            java.lang.Object r0 = r12.A01
            X.LO9 r0 = (X.LO9) r0
            X.K6D r3 = r0.A02
            X.JuA r0 = r3.A03
            if (r0 != 0) goto L_0x012e
            java.lang.String r0 = "viewState"
            goto L_0x0455
        L_0x012e:
            com.instagram.user.model.UpcomingEvent r2 = r0.A01
            if (r2 == 0) goto L_0x000a
            X.0xx r5 = X.DbW.A0E(r3)
            r1 = 0
            r0 = 9
            X.MGD r4 = new X.MGD
            r4.<init>(r2, r3, r1, r0)
            goto L_0x0175
        L_0x013f:
            java.lang.Object r0 = r12.A01
            android.content.DialogInterface$OnDismissListener r0 = (android.content.DialogInterface.OnDismissListener) r0
            if (r0 == 0) goto L_0x000a
            r0.onDismiss(r13)
            return
        L_0x0149:
            r13.dismiss()
            java.lang.Object r0 = r12.A01
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x000a
            r0.invoke()
            return
        L_0x0156:
            java.lang.Object r0 = r12.A01
            X.Ubn r0 = (X.C15388Ubn) r0
            X.0eM r0 = r0.A0B
            java.lang.Object r3 = r0.getValue()
            X.Jfh r3 = (X.C60101Jfh) r3
            X.05G r0 = r3.A08
            java.lang.Object r2 = r0.getValue()
            if (r2 == 0) goto L_0x000a
            X.6oS r5 = X.C318116oQ.A00(r3)
            r1 = 0
            r0 = 0
            X.MH0 r4 = new X.MH0
            r4.<init>((java.lang.Object) r2, (java.lang.Object) r3, (X.AnonymousClass4D7) r1, (int) r0)
        L_0x0175:
            X.AnonymousClass7TE.A1Z(r4, r5)
            return
        L_0x0179:
            java.lang.Object r1 = r12.A01
            X.0r1 r1 = (X.0r1) r1
            r0 = 1
            r1.A00 = r0
            return
        L_0x0181:
            java.lang.Object r3 = r12.A01
            X.LlP r3 = (X.C64986LlP) r3
            com.instagram.common.session.UserSession r0 = r3.A0C
            X.1Av r2 = X.1Au.A00(r0)
            java.lang.String r1 = "reel"
            r0 = 0
            r2.A14(r1, r0)
            X.C64986LlP.A04(r3)
            r13.dismiss()
            return
        L_0x0198:
            java.lang.Object r0 = r12.A01
            X.LY3 r0 = (X.LY3) r0
            java.lang.Object r1 = r0.A01
            instagram.features.stories.fragment.ReelMoreOptionsFragment r1 = (instagram.features.stories.fragment.ReelMoreOptionsFragment) r1
            X.1OC r0 = r1.A01
            if (r0 == 0) goto L_0x01a7
            r0.cancel()
        L_0x01a7:
            r0 = 0
            r1.A0M = r0
            r0 = 0
            r1.mSaveButton = r0
            goto L_0x024f
        L_0x01af:
            java.lang.Object r1 = r12.A01
            instagram.features.clips.edit.ClipsEditMetadataController r1 = (instagram.features.clips.edit.ClipsEditMetadataController) r1
            android.view.ViewGroup r0 = r1.optionsContainer
            X.AnonymousClass7TH.A0R(r0)
            r0 = 1
            r1.A0W = r0
            instagram.features.clips.edit.ClipsEditMetadataController.A0C(r1)
            return
        L_0x01bf:
            java.lang.Object r0 = r12.A01
            X.LRa r0 = (X.C64159LRa) r0
            X.KOf r0 = r0.A0C
            r0.A0A()
            return
        L_0x01c9:
            java.lang.Object r0 = r12.A01
            X.L7M r0 = (X.L7M) r0
            X.0eM r0 = r0.A02
            java.lang.Object r1 = r0.getValue()
            X.JiD r1 = (X.C60256JiD) r1
            r0 = 1
            r1.A00(r0)
            return
        L_0x01da:
            java.lang.Object r0 = r12.A01
            X.LT3 r0 = (X.LT3) r0
            X.LT3.A03(r0)
            return
        L_0x01e2:
            java.lang.Object r0 = r12.A01
            X.LT3 r0 = (X.LT3) r0
            X.LT3.A02(r0)
            return
        L_0x01ea:
            java.lang.Object r0 = r12.A01
            X.Lao r0 = (X.C64372Lao) r0
            X.6cU r2 = r0.A09
            X.3uh r1 = r0.A08
            X.818 r0 = r0.A03
            r2.D7w(r0, r1)
            return
        L_0x01f8:
            java.lang.Object r3 = r12.A01
            X.Lao r3 = (X.C64372Lao) r3
            X.6cU r2 = r3.A09
            X.3uh r1 = r3.A08
            X.818 r0 = r3.A03
            r2.Dku(r0, r1)
            X.JZY r0 = X.JZY.ONE_TIME_ON
            goto L_0x0213
        L_0x0208:
            java.lang.Object r3 = r12.A01
            X.Lao r3 = (X.C64372Lao) r3
            X.6cU r0 = r3.A09
            r0.DnS()
            X.JZY r0 = X.JZY.ONE_TIME_OFF
        L_0x0213:
            X.C64372Lao.A00(r0, r3)
            return
        L_0x0217:
            java.lang.Object r1 = r12.A01
            X.LEM r1 = (X.LEM) r1
            X.3uh r0 = r1.A0C
            X.1Xj r4 = r0.A0b
            r4.getClass()
            com.instagram.common.session.UserSession r3 = r1.A0B
            androidx.fragment.app.FragmentActivity r2 = r1.A07
            X.0iw r0 = r1.A09
            java.lang.String r7 = r0.getModuleName()
            java.lang.Class<X.LEM> r6 = X.LEM.class
            com.instagram.user.model.User r5 = X.DbT.A0j(r3)
            X.C347037wA.A03(r2, r3, r4, r5, r6, r7)
            return
        L_0x0236:
            java.lang.Object r0 = r12.A01
            X.Lua r0 = (X.C65512Lua) r0
            X.MU1 r0 = r0.A03
            r0.Dw2()
            return
        L_0x0240:
            java.lang.Object r1 = r12.A01
            X.K52 r1 = (X.K52) r1
            X.0eM r0 = r1.A09
            java.lang.Object r0 = r0.getValue()
            X.6vZ r0 = (X.C322296vZ) r0
            r0.A00()
        L_0x024f:
            X.DbT.A1J(r1)
            return
        L_0x0253:
            X.FEe r5 = com.instagram.simplewebview.SimpleWebViewActivity.A02
            java.lang.Object r1 = r12.A01
            X.KSr r1 = (X.C61942KSr) r1
            android.content.Context r4 = r1.requireContext()
            X.0eM r0 = r1.A0W
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            r0 = 16
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.SFz r2 = new X.SFz
            r2.<init>((java.lang.String) r0)
            android.content.res.Resources r1 = X.DbV.A05(r1)
            r0 = 2131964884(0x7f1333d4, float:1.9566562E38)
            java.lang.String r0 = r1.getString(r0)
            X.C49906FEe.A01(r4, r3, r5, r2, r0)
            return
        L_0x027d:
            java.lang.Object r2 = r12.A01
            X.KSr r2 = (X.C61942KSr) r2
            X.0eM r0 = r2.A0Y
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r0 = X.JTO.A0k(r0)
            r1 = 0
            X.Lsu r0 = r0.A0M
            r0.A0E = r1
            X.Lsu r0 = X.JTT.A0Y(r2)
            r0.A0G = r1
            X.Lsu r0 = X.JTT.A0Y(r2)
            r0.A0L = r1
            X.C61942KSr.A0A(r2)
            return
        L_0x029c:
            java.lang.Object r0 = r12.A01
            X.Lgy r0 = (X.C64721Lgy) r0
            X.K6s r2 = r0.A01
            X.0eM r0 = r2.A0D
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r1 = X.JTO.A0k(r0)
            X.KSx r0 = X.C61948KSx.A00
            goto L_0x030c
        L_0x02ab:
            java.lang.Object r0 = r12.A01
            X.Lgy r0 = (X.C64721Lgy) r0
            X.K6s r2 = r0.A01
            X.0eM r0 = r2.A0B
            X.LMg r0 = X.JTT.A0W(r0)
            java.lang.String r4 = r0.A02
            java.io.File r5 = X.AnonymousClass457.A04
            if (r5 != 0) goto L_0x02cb
            X.1BJ r3 = X.AnonymousClass1F2.A00()
            r1 = 1511144637(0x5a123cbd, float:1.02905323E16)
            r0 = 0
            java.io.File r5 = r3.CGg(r0, r1)
            X.AnonymousClass457.A04 = r5
        L_0x02cb:
            X.0eM r1 = r2.A0D
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r7 = X.JTO.A0k(r1)
            X.Lsu r0 = r7.A0M
            java.lang.String r0 = r0.A0J
            if (r0 == 0) goto L_0x02dd
            int r0 = r0.length()
            if (r0 != 0) goto L_0x02e8
        L_0x02dd:
            X.KTX r0 = r7.A02()
            X.3Q2 r0 = r0.A02
            java.lang.String r0 = r0.A33
            r7.ET0(r0)
        L_0x02e8:
            int r0 = r4.length()
            if (r0 > 0) goto L_0x02ef
            r4 = 0
        L_0x02ef:
            X.Juf r6 = r7.A01(r4)
            X.6oS r0 = X.C318116oQ.A00(r7)
            r8 = 0
            r9 = 0
            X.MGh r4 = new X.MGh
            r4.<init>(r5, r6, r7, r8, r9)
            X.AnonymousClass7TE.A1Z(r4, r0)
            X.0eM r0 = r7.A0E
            r0.getValue()
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r1 = X.JTO.A0k(r1)
            X.KT1 r0 = X.KT1.A00
        L_0x030c:
            r1.A04(r2, r0)
            return
        L_0x0310:
            java.lang.Object r1 = r12.A01
            X.Lgx r1 = (X.C64720Lgx) r1
            r0 = 1
            r1.A00 = r0
            X.MUv r0 = r1.A01
            r0.D92()
            return
        L_0x031d:
            r0 = 0
            X.0qQ.A0B(r13, r0)
            r13.dismiss()
            java.lang.Object r3 = r12.A01
            X.Ls8 r3 = (X.C65367Ls8) r3
            X.1ud r1 = X.1ua.A0G
            android.content.Context r2 = r3.A00
            com.instagram.common.session.UserSession r0 = r3.A01
            X.1ua r1 = r1.A01(r2, r0)
            X.3Q2 r0 = r3.A02
            X.JTU.A0g(r2, r0, r1)
            return
        L_0x0338:
            java.lang.Object r2 = r12.A01
            X.Ls8 r2 = (X.C65367Ls8) r2
            X.1ud r0 = X.1ua.A0G
            android.content.Context r1 = r2.A00
            com.instagram.common.session.UserSession r4 = r2.A01
            X.1ua r3 = r0.A01(r1, r4)
            X.3Q2 r0 = r2.A02
            java.lang.String r2 = r0.A35
            X.0iw r1 = X.AnonymousClass6WL.A02(r1)
            r0 = 0
            r3.A07(r1, r2, r0)
            X.C231822sS.A00()
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            X.0xI r2 = X.C59882Jb5.A00(r0)
            java.lang.String r1 = "reason"
            java.lang.String r0 = "pending_media_cancel_tap"
            r2.A0C(r1, r0)
            X.DbU.A1R(r2, r4)
            return
        L_0x0366:
            java.lang.Object r0 = r12.A01
            X.LMq r0 = (X.C64096LMq) r0
            X.Luw r0 = r0.A01
            goto L_0x037d
        L_0x036d:
            r13.dismiss()
            java.lang.Object r1 = r12.A01
            X.Luw r1 = (X.C65533Luw) r1
            r0 = 0
            r1.A02(r0)
            return
        L_0x0379:
            java.lang.Object r0 = r12.A01
            X.Luw r0 = (X.C65533Luw) r0
        L_0x037d:
            r0.A01()
            return
        L_0x0381:
            java.lang.Object r1 = r12.A01
            X.K6a r1 = (X.C61404K6a) r1
            r0 = 1
            r1.A06 = r0
            X.DbX.A1J(r1)
            return
        L_0x038c:
            java.lang.Object r0 = r12.A01
            X.LD7 r0 = (X.LD7) r0
            X.MTo r0 = r0.A02
            r0.Drr()
            return
        L_0x0396:
            java.lang.Object r0 = r12.A01
            X.LD7 r0 = (X.LD7) r0
            X.MTo r0 = r0.A02
            r0.Drq()
            return
        L_0x03a0:
            java.lang.Object r3 = r12.A01
            com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController r3 = (com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController) r3
            X.K9I r0 = r3.A0H
            boolean r4 = r0.A06
            X.LRm r2 = r3.A0F
            com.instagram.model.direct.DirectShareTarget r1 = r3.A0L
            X.Juy r0 = X.C61002Juy.A02
            X.Juy r1 = X.C64010LIx.A00(r1)
            X.4DH r6 = r3.A0w
            android.content.Context r5 = r6.getContext()
            com.instagram.common.session.UserSession r7 = r3.A0B
            com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim r8 = r3.A0D
            r8.getClass()
            com.instagram.model.direct.DirectShareTarget r10 = r3.A0L
            X.Lqc r9 = new X.Lqc
            r9.<init>(r12)
            X.9cJ r0 = r3.A0N
            X.9cJ r11 = X.C39562A0e.A00(r0, r4)
            X.Lqk r4 = new X.Lqk
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r2.A06(r4, r1)
            r0 = 1
            r3.A0f = r0
            goto L_0x03dc
        L_0x03d8:
            java.lang.Object r3 = r12.A01
            com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController r3 = (com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController) r3
        L_0x03dc:
            com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController.A03(r3)
            return
        L_0x03e0:
            java.lang.Object r0 = r12.A01
            X.K5C r0 = (X.K5C) r0
            X.K5C.A00(r0)
            return
        L_0x03e8:
            java.lang.Object r0 = r12.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.27r r1 = X.27p.A01(r0)
            java.lang.String r0 = "RESUME_DRAFT_EXIT_DIALOG_CANCEL"
            r1.A1l(r0)
            return
        L_0x03f6:
            java.lang.Object r1 = r12.A01
            X.LpR r1 = (X.C65221LpR) r1
            r0 = 1
            X.C65221LpR.A00(r1, r0)
            return
        L_0x03ff:
            java.lang.Object r0 = r12.A01
            X.Lp2 r0 = (X.C65198Lp2) r0
            r6 = 1
            X.8qV r1 = X.C367288qV.A01
            com.instagram.common.session.UserSession r3 = r0.A02
            X.4DH r2 = r0.A01
            r5 = 0
            java.lang.String r4 = "REELS_ROW_SHARE"
            r7 = r6
            r1.A0B(r2, r3, r4, r5, r6, r7)
            return
        L_0x0412:
            java.lang.String r2 = "ACCEPTANCE_NUX"
            r0 = 4
            goto L_0x041b
        L_0x0417:
            java.lang.String r2 = "ACCEPTANCE_NUX"
            r0 = 2
        L_0x041b:
            X.C70888OQg.A00(r0, r2)
            return
        L_0x041f:
            r13.dismiss()
            java.lang.Object r0 = r12.A01
            X.NIn r0 = (X.C68449NIn) r0
            com.instagram.common.ui.base.IgEditText r0 = r0.A0H
            if (r0 != 0) goto L_0x042d
            java.lang.String r0 = "noteEditText"
            goto L_0x0455
        L_0x042d:
            X.C69979NvJ.A00(r0)
            return
        L_0x0431:
            java.lang.Object r0 = r12.A01
            X.Lp3 r0 = (X.C65199Lp3) r0
            X.KHX r1 = r0.A00
            if (r1 == 0) goto L_0x0448
            r0 = 0
            goto L_0x0444
        L_0x043b:
            java.lang.Object r0 = r12.A01
            X.Lp3 r0 = (X.C65199Lp3) r0
            X.KHX r1 = r0.A00
            if (r1 == 0) goto L_0x0448
            r0 = 1
        L_0x0444:
            r1.setChecked(r0)
            return
        L_0x0448:
            java.lang.String r0 = "shareToFbContainer"
            goto L_0x0455
        L_0x044b:
            java.lang.Object r0 = r12.A01
            X.Lp2 r0 = (X.C65198Lp2) r0
            X.KHY r1 = r0.A00
            if (r1 != 0) goto L_0x045d
            java.lang.String r0 = "recommendOnFbContainer"
        L_0x0455:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x045d:
            r0 = 0
            r1.setChecked(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LV2.onClick(android.content.DialogInterface, int):void");
    }
}
