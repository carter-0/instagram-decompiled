package X;

import android.app.Activity;
import android.app.Dialog;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import com.facebook.browser.lite.ipc.AutofillOptOutCallback;
import com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher;
import com.instagram.inappbrowser.service.BrowserLiteCallbackService;
import java.util.List;
import java.util.Map;

public final class EDL extends 1P0 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public EDL(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A03 = str;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x016d, code lost:
        if (r4 != 61) goto L_0x016f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFail(X.C268654dm r14) {
        /*
            r13 = this;
            int r0 = r13.A00
            switch(r0) {
                case 0: goto L_0x01d0;
                case 1: goto L_0x01ad;
                case 2: goto L_0x0005;
                case 3: goto L_0x0005;
                case 4: goto L_0x0005;
                case 5: goto L_0x0100;
                case 6: goto L_0x00dd;
                case 7: goto L_0x0005;
                case 8: goto L_0x00a3;
                case 9: goto L_0x0005;
                case 10: goto L_0x006f;
                case 11: goto L_0x004f;
                case 12: goto L_0x002f;
                case 13: goto L_0x0005;
                case 14: goto L_0x001c;
                case 15: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.EDL.super.onFail(r14)
            return
        L_0x0009:
            r0 = 153889851(0x92c2c3b, float:2.0724544E-33)
            int r0 = X.AnonymousClass7TG.A0D(r14, r0)
            java.lang.Object r1 = r13.A01
            X.1P0 r1 = (X.1P0) r1
            r1.onFail(r14)
            r1 = -1957482435(0xffffffff8b53303d, float:-4.0673412E-32)
            goto L_0x01e5
        L_0x001c:
            r0 = -1359239814(0xffffffffaefba57a, float:-1.1443553E-10)
            int r0 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r13.A01
            X.1P0 r1 = (X.1P0) r1
            r1.onFail(r14)
            r1 = 1084910353(0x40aa6b11, float:5.3255696)
            goto L_0x01e5
        L_0x002f:
            r0 = -510810621(0xffffffffe18da603, float:-3.2661916E20)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.EDL.super.onFail(r14)
            java.lang.Object r1 = r13.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            java.lang.String r4 = "create_featured_account_fail"
            android.content.Context r3 = r1.requireContext()
            r2 = 2131962217(0x7f132969, float:1.9561153E38)
            r1 = 1
            X.C59689JTv.A01(r3, r4, r2, r1)
            r1 = 1818032274(0x6c5cf892, float:1.0685501E27)
            goto L_0x01e5
        L_0x004f:
            r0 = -1126185179(0xffffffffbcdfc725, float:-0.02731664)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.EDL.super.onFail(r14)
            java.lang.Object r1 = r13.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            java.lang.String r4 = "remove_featured_account_fail"
            android.content.Context r3 = r1.requireContext()
            r2 = 2131962217(0x7f132969, float:1.9561153E38)
            r1 = 1
            X.C59689JTv.A01(r3, r4, r2, r1)
            r1 = 421681367(0x192258d7, float:8.393145E-24)
            goto L_0x01e5
        L_0x006f:
            r0 = 1509176408(0x59f43458, float:8.5921809E15)
            int r0 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r13.A02
            X.DbS.A1V(r1)
            X.DbT.A15()
            java.lang.String r3 = r13.A03
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = "com.instagram.android.login.fragment.ARGUMENT_OMNISTRING"
            r2.putString(r1, r3)
            X.E54 r3 = new X.E54
            r3.<init>()
            r3.setArguments(r2)
            java.lang.Object r1 = r13.A01
            com.instagram.nux.fragment.OneTapLoginLandingFragment r1 = (com.instagram.nux.fragment.OneTapLoginLandingFragment) r1
            androidx.fragment.app.FragmentActivity r2 = r1.requireActivity()
            X.0aP r1 = r1.A00
            X.Dbb.A14(r3, r2, r1)
            r1 = 471496921(0x1c1a78d9, float:5.111052E-22)
            goto L_0x01e5
        L_0x00a3:
            r0 = 1144852403(0x443d0fb3, float:756.2453)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.EDL.super.onFail(r14)
            java.lang.Object r2 = r14.A00()
            if (r2 == 0) goto L_0x00d1
            X.1XT r2 = (X.AnonymousClass1XT) r2
            java.lang.String r1 = r2.getErrorMessage()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00d1
            java.lang.Object r3 = r13.A01
            X.E3Y r3 = (X.E3Y) r3
            java.lang.String r2 = r2.getErrorMessage()
        L_0x00c7:
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            r3.EuV(r2, r1)
            r1 = 1438949795(0x55c4a1a3, float:2.70248129E13)
            goto L_0x01e5
        L_0x00d1:
            java.lang.Object r3 = r13.A01
            X.E3Y r3 = (X.E3Y) r3
            r1 = 2131968258(0x7f134102, float:1.9573406E38)
            java.lang.String r2 = r3.getString(r1)
            goto L_0x00c7
        L_0x00dd:
            r0 = 134676829(0x807015d, float:4.0626687E-34)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r1 = 241(0xf1, float:3.38E-43)
            java.lang.String r2 = X.C66579MXk.A00(r1)
            r1 = 564(0x234, float:7.9E-43)
            java.lang.String r1 = X.C66579MXk.A00(r1)
            X.0KC.A0C(r2, r1)
            java.lang.Object r2 = r13.A01
            X.1K2 r2 = (X.1K2) r2
            r1 = 0
            r2.set(r1)
            r1 = 2084453721(0x7c3e3d59, float:3.9511227E36)
            goto L_0x01e5
        L_0x0100:
            r0 = 1863616322(0x6f148742, float:4.59673E28)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r8 = 0
            X.0qQ.A0B(r14, r8)
            X.EDL.super.onFail(r14)
            java.lang.Object r3 = r13.A02
            X.Pwk r3 = (X.C74551Pwk) r3
            X.0xF r2 = r3.B3j()
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.C3265677h.A0Z(r2, r1)
            X.4gN r2 = X.C71115Od8.A00(r14)
            r1 = 0
            r3.DTM(r2, r1)
            java.lang.Object r2 = r13.A01
            X.EwE r2 = (X.C49473EwE) r2
            if (r2 == 0) goto L_0x016f
            java.lang.String r7 = r13.A03
            X.1kV r5 = r2.A00
            com.instagram.common.session.UserSession r1 = r5.A00
            X.1Ng r4 = X.AnonymousClass1Nd.A00(r1)
            X.1kT r6 = r2.A01
            com.instagram.model.direct.DirectThreadKey r1 = r6.A07()
            java.lang.String r3 = r1.A00
            int r2 = r6.A00
            X.7P2 r1 = new X.7P2
            r1.<init>(r3, r7, r2, r8)
            r4.A00(r1)
            X.0eM r1 = r5.A03
            java.lang.Object r5 = r1.getValue()
            X.7IQ r5 = (X.AnonymousClass7IQ) r5
            com.instagram.model.direct.DirectThreadKey r1 = r6.A07()
            java.lang.String r7 = r1.A00
            com.instagram.model.direct.DirectThreadKey r1 = r6.A07()
            java.lang.String r8 = r1.A01
            int r4 = r6.A01
            int r3 = r6.A00
            int r1 = r6.A00
            com.instagram.direct.prompts.DirectPromptTypes r2 = X.AnonymousClass79B.A00(r1)
            r1 = 28
            if (r4 == r1) goto L_0x0191
            r1 = 29
            if (r4 == r1) goto L_0x0173
            r1 = 61
            if (r4 == r1) goto L_0x0191
        L_0x016f:
            r1 = -631124125(0xffffffffda61cf63, float:-1.58899735E16)
            goto L_0x01e5
        L_0x0173:
            X.0eM r1 = r5.A02
            java.lang.Object r5 = r1.getValue()
            X.OyG r5 = (X.C72195OyG) r5
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            java.lang.String r2 = r2.A01
            java.lang.String r1 = "prompt_type"
            java.util.Map r12 = X.AnonymousClass7TF.A0w(r1, r2)
            java.lang.String r9 = "direct_response_tab_send_error"
            java.lang.String r10 = "impression"
            java.lang.String r11 = "response"
            X.C72195OyG.A00(r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x016f
        L_0x0191:
            X.0eM r1 = r5.A04
            java.lang.Object r5 = r1.getValue()
            X.OyH r5 = (X.C72196OyH) r5
            X.EZp r3 = X.C48147EZp.RESPONSE
            X.EZo r4 = X.C48146EZo.THREAD_VIEW
            java.lang.String r2 = r2.A01
            java.lang.String r1 = "prompt_type"
            java.util.Map r8 = X.AnonymousClass7TF.A0w(r1, r2)
            java.lang.String r6 = "direct_response_tab_send_error"
            java.lang.String r7 = "impression"
            X.C72196OyH.A00(r3, r4, r5, r6, r7, r8)
            goto L_0x016f
        L_0x01ad:
            r0 = -305185457(0xffffffffedcf3d4f, float:-8.0171893E27)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.6Tl r2 = X.DbS.A0P()
            java.lang.String r1 = "failure"
            r2.A01(r1)
            java.lang.String r1 = ""
            X.6Tm r3 = X.DbT.A0V(r2, r1)
            java.lang.Object r2 = r13.A01
            X.4uI r2 = (X.C277014uI) r2
            java.lang.Object r1 = r13.A02
            X.DbS.A1R(r3, r2, r1)
            r1 = 1073188577(0x3ff78ee1, float:1.9340478)
            goto L_0x01e5
        L_0x01d0:
            r0 = -841005384(0xffffffffcddf46b8, float:-4.68244224E8)
            int r0 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r13.A01
            com.instagram.arlink.fragment.NametagController r2 = (com.instagram.arlink.fragment.NametagController) r2
            java.lang.Object r1 = r13.A02
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            com.instagram.arlink.fragment.NametagController.A01(r1, r2)
            r1 = 933154302(0x379ecdfe, float:1.893099E-5)
        L_0x01e5:
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EDL.onFail(X.4dm):void");
    }

    public final void onFailInBackground(C268654dm r7) {
        int i;
        int i2;
        switch (this.A00) {
            case 2:
                i = AnonymousClass0fD.A03(-412831301);
                Activity activity = (Activity) this.A01;
                if (activity != null) {
                    AnonymousClass7TF.A0D().post(new C51192Fq2(activity));
                }
                DbT.A1Q(0wj.A01, "Agent thread creation failed.", 20134884);
                AnonymousClass0eM r4 = ((AiAgentThreadLauncher) this.A02).A02;
                AnonymousClass7I6 r3 = (AnonymousClass7I6) r4.getValue();
                String str = this.A03;
                if (str != null && str.equals(r3.A01)) {
                    r3.A06.markerPoint(AnonymousClass7I6.A00(r3), "create_server_thread_failure");
                }
                ((AnonymousClass7I6) r4.getValue()).A01(AnonymousClass05K.A01);
                i2 = 1127269922;
                break;
            case 7:
                i = AnonymousClass0fD.A03(-314522001);
                ((BrowserLiteCallbackService.BrowserLiteCallbackImpl) this.A01).A00 = false;
                Log.e("BrowserLiteCallbackService", "autofill domain opt out check failed");
                i2 = 891372117;
                break;
            case 14:
                i = AnonymousClass0fD.A03(-200261044);
                ((1P0) this.A01).onFailInBackground(r7);
                i2 = 186661691;
                break;
            default:
                EDL.super.onFailInBackground(r7);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final void onFinish() {
        int i;
        int i2;
        switch (this.A00) {
            case 3:
                i = AnonymousClass0fD.A03(-1750495375);
                OMU omu = (OMU) this.A01;
                if (omu != null) {
                    omu.A00();
                }
                i2 = 1042377865;
                break;
            case 8:
                i = AnonymousClass0fD.A03(779439949);
                EDL.super.onFinish();
                ((E3Y) this.A01).A0L.A00();
                i2 = 424023459;
                break;
            case 9:
                i = AnonymousClass0fD.A03(-1188791789);
                EEC eec = (EEC) this.A01;
                Map map = eec.A06;
                String str = this.A03;
                if (map.get(str) != null) {
                    ((List) map.get(str)).remove(this.A02);
                    if (((List) map.get(str)).isEmpty()) {
                        E6T e6t = eec.A01;
                        if (str.equals(e6t.A08)) {
                            C46710Djg djg = e6t.A06;
                            if (djg.A01.isEmpty()) {
                                djg.A03 = true;
                                0fE.A00(djg, -900434024);
                            }
                            View view = e6t.A01;
                            if (view != null) {
                                view.setVisibility(8);
                            }
                        }
                        map.remove(str);
                        eec.A05.remove(str);
                    }
                }
                i2 = -682563131;
                break;
            case 10:
                i = AnonymousClass0fD.A03(-83155688);
                DbS.A1V(this.A02);
                i2 = -826006329;
                break;
            case 13:
                i = AnonymousClass0fD.A03(-8530946);
                ((C70706OHb) this.A02).A04.remove(this.A03);
                i2 = -1116429415;
                break;
            case 14:
                i = AnonymousClass0fD.A03(1112102599);
                ((1P0) this.A01).onFinish();
                i2 = 1711592586;
                break;
            default:
                EDL.super.onFinish();
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final void onStart() {
        int i;
        int i2;
        switch (this.A00) {
            case 3:
                i = AnonymousClass0fD.A03(-26648777);
                OMU omu = (OMU) this.A01;
                if (omu != null) {
                    omu.A01();
                }
                i2 = 82123009;
                break;
            case 10:
                i = AnonymousClass0fD.A03(1767970801);
                AnonymousClass0fN.A00((Dialog) this.A02);
                i2 = 87127952;
                break;
            case 14:
                i = AnonymousClass0fD.A03(-1339322285);
                ((1P0) this.A01).onStart();
                i2 = -1420721789;
                break;
            default:
                EDL.super.onStart();
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:123:0x04d5, code lost:
        if (r9 != 61) goto L_0x04d7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r58) {
        /*
            r57 = this;
            r0 = r57
            r7 = r58
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x05e1;
                case 1: goto L_0x05b1;
                case 2: goto L_0x0009;
                case 3: goto L_0x0567;
                case 4: goto L_0x052d;
                case 5: goto L_0x0460;
                case 6: goto L_0x02aa;
                case 7: goto L_0x0009;
                case 8: goto L_0x01ba;
                case 9: goto L_0x0154;
                case 10: goto L_0x011f;
                case 11: goto L_0x00ee;
                case 12: goto L_0x00bd;
                case 13: goto L_0x006b;
                case 14: goto L_0x003e;
                case 15: goto L_0x000d;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.EDL.super.onSuccess(r7)
            return
        L_0x000d:
            r1 = 208698241(0xc707b81, float:1.8526093E-31)
            int r2 = X.AnonymousClass0fD.A03(r1)
            r1 = 982997117(0x3a97587d, float:0.0011546757)
            int r4 = X.AnonymousClass7TG.A0D(r7, r1)
            java.lang.Object r1 = r0.A02
            X.EyS r1 = (X.EyS) r1
            X.T7N r1 = r1.A01
            java.lang.String r3 = r0.A03
            X.8rr r1 = r1.A00
            X.8rq r1 = (X.C367958rq) r1
            X.8rQ r1 = r1.A00
            r1.put(r3, r7)
            java.lang.Object r0 = r0.A01
            X.1P0 r0 = (X.1P0) r0
            r0.onSuccess(r7)
            r0 = -1992398051(0xffffffff893e6b1d, float:-2.2920783E-33)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -662351542(0xffffffffd885514a, float:-1.17267344E15)
            goto L_0x0614
        L_0x003e:
            r1 = -1454613389(0xffffffffa94c5c73, float:-4.5377286E-14)
            int r2 = X.AnonymousClass0fD.A03(r1)
            r1 = 1225800809(0x49103c69, float:590790.56)
            int r3 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r1 = r0.A01
            X.1P0 r1 = (X.1P0) r1
            r1.onSuccess(r7)
            java.lang.Object r1 = r0.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.IOk r1 = X.C55124HcX.A00(r1)
            java.lang.String r0 = r0.A03
            r1.A05(r0)
            r0 = 1345734493(0x5036475d, float:1.22325207E10)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 1995255018(0x76ed2cea, float:2.4052448E33)
            goto L_0x0614
        L_0x006b:
            r1 = 1197696804(0x47636724, float:58215.14)
            int r2 = X.AnonymousClass0fD.A03(r1)
            X.DvP r7 = (X.DvP) r7
            r1 = 2140059912(0x7f8eb908, float:NaN)
            int r6 = X.AnonymousClass7TG.A0D(r7, r1)
            com.instagram.user.model.User r1 = r7.A00
            if (r1 == 0) goto L_0x00a1
            X.JvY r7 = X.C70903OQv.A00(r1)
            java.lang.Object r1 = r0.A02
            X.OHb r1 = (X.C70706OHb) r1
            X.Oxw r1 = r1.A02
            android.util.LruCache r5 = r1.A00
            java.lang.String r1 = r7.A05
            r5.put(r1, r7)
            java.lang.Object r1 = r7.A02
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto L_0x00a1
            long r3 = r1.longValue()
            java.lang.String r1 = java.lang.String.valueOf(r3)
            r5.put(r1, r7)
        L_0x00a1:
            java.lang.Object r1 = r0.A02
            X.OHb r1 = (X.C70706OHb) r1
            X.0V2 r3 = r1.A05
            java.lang.Object r1 = r0.A01
            X.4Cq r1 = (X.C262224Cq) r1
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0v()
            X.O28.A00(r0, r1, r3)
            r0 = -1278464820(0xffffffffb3cc2ccc, float:-9.507639E-8)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = 1890935599(0x70b5632f, float:4.4909354E29)
            goto L_0x0614
        L_0x00bd:
            r1 = -1893334584(0xffffffff8f2601c8, float:-8.184775E-30)
            int r2 = X.AnonymousClass0fD.A03(r1)
            r1 = 112578120(0x6b5ce48, float:6.8387736E-35)
            int r5 = X.AnonymousClass0fD.A03(r1)
            X.EDL.super.onSuccess(r7)
            java.lang.Object r4 = r0.A01
            X.Dib r4 = (X.C46656Dib) r4
            java.util.List r3 = r4.A0u
            if (r3 == 0) goto L_0x00db
            java.lang.Object r1 = r0.A02
            r3.add(r1)
        L_0x00db:
            X.E8u r3 = r4.A0i
            java.lang.String r1 = r0.A03
            r0 = 1
            r3.A0C(r1, r0)
            r0 = 893987153(0x35492951, float:7.493846E-7)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 790872673(0x2f23c261, float:1.4893821E-10)
            goto L_0x0614
        L_0x00ee:
            r1 = -184385681(0xfffffffff5027f6f, float:-1.654256E32)
            int r2 = X.AnonymousClass0fD.A03(r1)
            r1 = -237669602(0xfffffffff1d5731e, float:-2.1139032E30)
            int r5 = X.AnonymousClass0fD.A03(r1)
            X.EDL.super.onSuccess(r7)
            java.lang.Object r4 = r0.A01
            X.Dib r4 = (X.C46656Dib) r4
            java.util.List r3 = r4.A0u
            if (r3 == 0) goto L_0x010c
            java.lang.Object r1 = r0.A02
            r3.remove(r1)
        L_0x010c:
            X.E8u r3 = r4.A0i
            java.lang.String r1 = r0.A03
            r0 = 0
            r3.A0C(r1, r0)
            r0 = 929285705(0x3763c649, float:1.3576421E-5)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 94425664(0x5a0d240, float:1.5123561E-35)
            goto L_0x0614
        L_0x011f:
            r1 = 159050577(0x97aeb51, float:3.02033E-33)
            int r2 = X.AnonymousClass0fD.A03(r1)
            X.EM5 r7 = (X.EM5) r7
            r1 = 1968356620(0x7552bd0c, float:2.6714274E32)
            int r4 = X.AnonymousClass0fD.A03(r1)
            com.instagram.user.model.User r8 = r7.A05
            java.lang.Object r3 = r0.A01
            com.instagram.nux.fragment.OneTapLoginLandingFragment r3 = (com.instagram.nux.fragment.OneTapLoginLandingFragment) r3
            X.0aP r7 = r3.A00
            android.content.Context r5 = r3.requireContext()
            r10 = 0
            r6 = 0
            r9 = r6
            com.instagram.common.session.UserSession r1 = X.C46413Dea.A02(r5, r6, r7, r8, r9, r10)
            androidx.fragment.app.FragmentActivity r0 = r3.requireActivity()
            X.C46413Dea.A06(r0, r6, r3, r1)
            r0 = 2079743511(0x7bf65e17, float:2.5584268E36)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 290304193(0x114db0c1, float:1.6226115E-28)
            goto L_0x0614
        L_0x0154:
            r1 = -1872218911(0xffffffff906834e1, float:-4.579467E-29)
            int r2 = X.AnonymousClass0fD.A03(r1)
            X.7ax r7 = (X.C334247ax) r7
            r1 = 1574122075(0x5dd3325b, float:1.90229077E18)
            int r4 = X.AnonymousClass0fD.A03(r1)
            X.EDL.super.onSuccess(r7)
            r7.getItems()
            java.util.List r1 = r7.getItems()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x01af
            java.lang.Object r1 = r0.A01
            X.EEC r1 = (X.EEC) r1
            X.E6T r5 = r1.A01
            java.lang.String r3 = r0.A03
            java.util.List r1 = r7.getItems()
            java.lang.String r0 = r5.A08
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01af
            java.util.Set r0 = r5.A0B
            r0.addAll(r1)
            java.util.Set r0 = r5.A0B
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1D(r0)
            r1 = 8
            android.view.View r0 = r5.A01
            if (r0 == 0) goto L_0x019c
            r0.setVisibility(r1)
        L_0x019c:
            X.Djg r1 = r5.A06
            X.E6T.A04(r5, r3)
            r0 = 1
            r1.A02 = r0
            r1.A01 = r3
            r0 = 0
            r1.A03 = r0
            r0 = -1551055127(0xffffffffa38cc6e9, float:-1.5263072E-17)
            X.0fE.A00(r1, r0)
        L_0x01af:
            r0 = -428265902(0xffffffffe6792e52, float:-2.9418093E23)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -1565119186(0xffffffffa2b62d2e, float:-4.9379035E-18)
            goto L_0x0614
        L_0x01ba:
            r1 = 857561095(0x331d5807, float:3.663447E-8)
            int r2 = X.AnonymousClass0fD.A03(r1)
            X.Dv9 r7 = (X.Dv9) r7
            r1 = -669271735(0xffffffffd81bb949, float:-6.8488038E14)
            int r3 = X.AnonymousClass0fD.A03(r1)
            X.EDL.super.onSuccess(r7)
            java.lang.Object r10 = r0.A02
            com.instagram.registration.model.RegFlowExtras r10 = (com.instagram.registration.model.RegFlowExtras) r10
            java.lang.String r4 = r7.A00
            r10.A0B = r4
            java.lang.String r1 = r0.A03
            r10.A08 = r1
            java.lang.Object r5 = r0.A01
            X.E3Y r5 = (X.E3Y) r5
            com.instagram.registration.model.RegFlowExtras r0 = r5.A0J
            java.lang.String r0 = r0.A04
            r10.A04 = r0
            boolean r0 = r5.A0T
            if (r0 == 0) goto L_0x02a6
            X.EXD r0 = X.EXD.SAC
        L_0x01e9:
            r10.A03(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            java.lang.String r0 = X.C49109EpY.A00(r0)
            r10.A0V = r0
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x028c
            boolean r0 = r5.A0T
            if (r0 == 0) goto L_0x026d
            boolean r0 = r10.A0t
            if (r0 == 0) goto L_0x0232
            r0 = 0
            r10.A0u = r0
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            X.0aP r0 = r5.A05
            X.6Yo r1 = X.DbS.A0M(r1, r0)
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "RegFlowExtras.EXTRA_KEY"
            r5.putParcelable(r0, r10)
            X.E5j r4 = new X.E5j
            r4.<init>()
        L_0x021d:
            r4.setArguments(r5)
            r0 = 0
            r1.A0B(r0, r4)
        L_0x0224:
            r1.A04()
        L_0x0227:
            r0 = 524765430(0x1f4748f6, float:4.220024E-20)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = -996747411(0xffffffffc496d76d, float:-1206.732)
            goto L_0x0614
        L_0x0232:
            r15 = 0
            boolean r0 = r10.A0u
            if (r0 == 0) goto L_0x0254
            r10.A0u = r15
            r5.A0K = r10
            r0 = 1
            r5.A0W = r0
            X.0aP r7 = r5.A05
            java.lang.String r13 = r10.A0Z
            android.os.Handler r4 = X.AnonymousClass7TF.A0D()
            X.EEK r11 = r5.A0L
            r8 = 0
            X.DiE r12 = r5.BzS()
            r6 = r5
            r9 = r5
            r14 = r8
            X.C50144FRb.A02(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0227
        L_0x0254:
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            X.0aP r0 = r5.A05
            X.6Yo r1 = X.DbS.A0M(r1, r0)
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "RegFlowExtras.EXTRA_KEY"
            r5.putParcelable(r0, r10)
            X.DuG r4 = new X.DuG
            r4.<init>()
            goto L_0x021d
        L_0x026d:
            X.DbT.A15()
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "RegFlowExtras.EXTRA_KEY"
            r1.putParcelable(r0, r10)
            X.DbU.A1C(r1)
            X.E3V r4 = new X.E3V
            r4.<init>()
            androidx.fragment.app.FragmentActivity r1 = X.DbU.A0I(r1, r4, r5)
            X.0aP r0 = r5.A05
            X.6Yo r1 = X.DbV.A0N(r4, r1, r0)
            goto L_0x0224
        L_0x028c:
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            X.0aP r0 = r5.A05
            X.6Yo r1 = X.DbY.A0J(r1, r0)
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "RegFlowExtras.EXTRA_KEY"
            r5.putParcelable(r0, r10)
            X.EMQ r4 = new X.EMQ
            r4.<init>()
            goto L_0x021d
        L_0x02a6:
            X.EXD r0 = X.EXD.A03
            goto L_0x01e9
        L_0x02aa:
            r1 = 285217180(0x1100119c, float:1.0102846E-28)
            int r2 = X.AnonymousClass0fD.A03(r1)
            X.5gL r7 = (X.C290995gL) r7
            r1 = 356370964(0x153dca14, float:3.8327658E-26)
            int r6 = X.AnonymousClass0fD.A03(r1)
            r5 = 0
            X.0qQ.A0B(r7, r5)
            java.util.List r1 = r7.A03
            java.util.Iterator r10 = r1.iterator()
            r9 = 0
            r4 = r9
        L_0x02c6:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x02e3
            java.lang.Object r8 = r10.next()
            X.5gF r8 = (X.C290935gF) r8
            java.lang.String r3 = r8.A03
            r1 = 1145(0x479, float:1.604E-42)
            java.lang.String r1 = X.C66579MXk.A00(r1)
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02c6
            java.util.HashMap r4 = r8.A04
            goto L_0x02c6
        L_0x02e3:
            if (r4 != 0) goto L_0x02f7
            java.lang.Object r0 = r0.A01
            X.1K2 r0 = (X.1K2) r0
            r0.set(r9)
            r0 = -296977185(0xffffffffee4c7cdf, float:-1.5821475E28)
        L_0x02ef:
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = -719058485(0xffffffffd52409cb, float:-1.1272623E13)
            goto L_0x0614
        L_0x02f7:
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            X.5l3 r7 = r7.A00
            if (r7 == 0) goto L_0x042b
            java.util.List r8 = r7.A00
            java.util.Iterator r10 = X.DbY.A0o(r8)
        L_0x030a:
            boolean r8 = r10.hasNext()
            java.lang.String r19 = ""
            r53 = r19
            if (r8 == 0) goto L_0x03dd
            java.lang.Object r9 = r10.next()
            X.5gD r9 = (X.C290915gD) r9
            java.lang.Object r8 = r0.A02
            com.instagram.common.session.UserSession r8 = (com.instagram.common.session.UserSession) r8
            r14 = 0
            r11 = r14
            r12 = r9
            r13 = r8
            r15 = r14
            r16 = r14
            com.instagram.model.direct.DirectShareTarget r9 = X.C291165gf.A00(r11, r12, r13, r14, r15, r16)
            java.lang.String r8 = r0.A03
            boolean r8 = r9.A0Y(r8)
            if (r8 != 0) goto L_0x030a
            boolean r55 = r9.A0M()
            boolean r8 = r9.A0M()
            if (r8 == 0) goto L_0x0368
            java.lang.String r8 = r9.A08()
            if (r8 == 0) goto L_0x0343
            r19 = r8
        L_0x0343:
            java.lang.String r9 = r9.A0I
            if (r9 != 0) goto L_0x0349
            r9 = r53
        L_0x0349:
            int r8 = r9.length()
            if (r8 <= 0) goto L_0x030a
            int r8 = r19.length()
            if (r8 <= 0) goto L_0x030a
            X.OLb r8 = new X.OLb
            r50 = r8
            r51 = r19
            r52 = r9
            r54 = r53
            r56 = r5
            r50.<init>(r51, r52, r53, r54, r55, r56)
            r1.add(r8)
            goto L_0x030a
        L_0x0368:
            java.util.List r8 = X.DbW.A0m(r9)
            java.lang.Object r8 = X.00k.A0O(r8, r5)
            if (r8 == 0) goto L_0x03d9
            java.util.List r9 = X.DbW.A0m(r9)
            int r8 = r9.size()
            if (r8 <= 0) goto L_0x0389
            java.lang.Object r11 = r9.get(r5)
        L_0x0380:
            com.instagram.pendingmedia.model.recipients.PendingRecipient r11 = (com.instagram.pendingmedia.model.recipients.PendingRecipient) r11
            java.lang.String r19 = r11.getId()
            java.lang.String r9 = r11.A0A
            goto L_0x0349
        L_0x0389:
            com.instagram.common.typedurl.ImageUrl r12 = com.instagram.pendingmedia.model.recipients.PendingRecipient.A0g
            r28 = 1
            com.instagram.user.model.FollowStatus r13 = com.instagram.user.model.FollowStatus.A08
            r24 = -1
            com.instagram.pendingmedia.model.recipients.PendingRecipient r11 = new com.instagram.pendingmedia.model.recipients.PendingRecipient
            r17 = r14
            r18 = r14
            r20 = r19
            r21 = r14
            r22 = r5
            r23 = r5
            r25 = r5
            r26 = r5
            r27 = r5
            r29 = r5
            r30 = r5
            r31 = r5
            r32 = r5
            r33 = r5
            r34 = r5
            r35 = r28
            r36 = r5
            r37 = r5
            r38 = r5
            r39 = r5
            r40 = r5
            r41 = r5
            r42 = r5
            r43 = r5
            r44 = r5
            r45 = r5
            r46 = r5
            r47 = r5
            r48 = r5
            r49 = r5
            r50 = r5
            r51 = r5
            r52 = r5
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52)
            goto L_0x0380
        L_0x03d9:
            r9 = r19
            goto L_0x0349
        L_0x03dd:
            java.util.List r7 = r7.A01
            java.util.Iterator r9 = X.DbY.A0o(r7)
        L_0x03e3:
            boolean r7 = r9.hasNext()
            if (r7 == 0) goto L_0x042b
            com.instagram.user.model.User r8 = X.DbT.A0k(r9)
            java.lang.String r7 = r8.getFullName()
            if (r7 == 0) goto L_0x03e3
            int r7 = r7.length()
            if (r7 == 0) goto L_0x03e3
            int r7 = r8.BIW()
            if (r7 != 0) goto L_0x03e3
            java.lang.String r7 = r8.getId()
            boolean r7 = r4.containsKey(r7)
            if (r7 == 0) goto L_0x03e3
            java.lang.Object r7 = X.DbV.A0r(r8, r4)
            if (r7 == 0) goto L_0x03e3
            java.lang.String r11 = r8.getId()
            java.lang.String r12 = r8.getFullName()
            if (r12 != 0) goto L_0x041b
            r12 = r19
        L_0x041b:
            X.OLb r7 = new X.OLb
            r13 = r19
            r14 = r13
            r16 = r5
            r10 = r7
            r15 = r5
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r1.add(r7)
            goto L_0x03e3
        L_0x042b:
            java.util.Iterator r7 = r1.iterator()
        L_0x042f:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0454
            java.lang.Object r1 = r7.next()
            X.OLb r1 = (X.C70781OLb) r1
            org.json.JSONObject r1 = r1.A00()     // Catch:{ JSONException -> 0x0443 }
            r3.put(r1)     // Catch:{ JSONException -> 0x0443 }
            goto L_0x042f
        L_0x0443:
            r5 = move-exception
            r1 = 241(0xf1, float:3.38E-43)
            java.lang.String r4 = X.C66579MXk.A00(r1)
            r1 = 615(0x267, float:8.62E-43)
            java.lang.String r1 = X.C66579MXk.A00(r1)
            X.0KC.A0F(r4, r1, r5)
            goto L_0x042f
        L_0x0454:
            java.lang.Object r0 = r0.A01
            X.1K2 r0 = (X.1K2) r0
            r0.set(r3)
            r0 = -844004671(0xffffffffcdb182c1, float:-3.7226704E8)
            goto L_0x02ef
        L_0x0460:
            r1 = -844691532(0xffffffffcda707b4, float:-3.50287488E8)
            int r2 = X.AnonymousClass0fD.A03(r1)
            X.Dv4 r7 = (X.C47337Dv4) r7
            r1 = -1123183292(0xffffffffbd0d9544, float:-0.03456618)
            int r5 = X.AnonymousClass7TG.A0D(r7, r1)
            X.EDL.super.onSuccess(r7)
            java.lang.Object r4 = r0.A02
            X.Pwk r4 = (X.C74551Pwk) r4
            X.0xF r3 = r4.BsS()
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.C3265677h.A0a(r3, r1)
            r1 = 0
            r4.DTM(r1, r1)
            java.lang.Object r6 = r0.A01
            X.EwE r6 = (X.C49473EwE) r6
            if (r6 == 0) goto L_0x04e8
            java.lang.String r4 = r0.A03
            X.Etu r0 = r7.A00
            if (r0 == 0) goto L_0x0492
            java.lang.String r1 = r0.A00
        L_0x0492:
            X.1kV r3 = r6.A00
            com.instagram.common.session.UserSession r0 = r3.A00
            X.1Ng r10 = X.AnonymousClass1Nd.A00(r0)
            X.1kT r0 = r6.A01
            com.instagram.model.direct.DirectThreadKey r6 = r0.A07()
            java.lang.String r9 = r6.A00
            int r8 = r0.A00
            r7 = 1
            X.7P2 r6 = new X.7P2
            r6.<init>(r9, r4, r8, r7)
            r10.A00(r6)
            X.0eM r6 = r3.A03
            java.lang.Object r10 = r6.getValue()
            X.7IQ r10 = (X.AnonymousClass7IQ) r10
            com.instagram.model.direct.DirectThreadKey r6 = r0.A07()
            java.lang.String r11 = r6.A00
            com.instagram.model.direct.DirectThreadKey r6 = r0.A07()
            java.lang.String r12 = r6.A01
            int r9 = r0.A01
            int r8 = r0.A00
            int r6 = r0.A00
            com.instagram.direct.prompts.DirectPromptTypes r7 = X.AnonymousClass79B.A00(r6)
            r6 = 28
            if (r9 == r6) goto L_0x0511
            r6 = 29
            if (r9 == r6) goto L_0x04f3
            r6 = 61
            if (r9 == r6) goto L_0x0511
        L_0x04d7:
            if (r1 == 0) goto L_0x04e8
            X.0sa r3 = r3.A04
            java.lang.Object r3 = r3.invoke()
            X.LP4 r3 = (X.LP4) r3
            if (r3 == 0) goto L_0x04e8
            java.lang.String r0 = r0.A05
            r3.A04(r4, r0, r1)
        L_0x04e8:
            r0 = 278316386(0x1096c562, float:5.9468684E-29)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -156441842(0xfffffffff6ace30e, float:-1.7532818E33)
            goto L_0x0614
        L_0x04f3:
            X.0eM r6 = r10.A02
            java.lang.Object r9 = r6.getValue()
            X.OyG r9 = (X.C72195OyG) r9
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            java.lang.String r7 = r7.A01
            java.lang.String r6 = "prompt_type"
            java.util.Map r16 = X.AnonymousClass7TF.A0w(r6, r7)
            java.lang.String r13 = "direct_response_tab_send_success"
            java.lang.String r14 = "impression"
            java.lang.String r15 = "response"
            X.C72195OyG.A00(r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x04d7
        L_0x0511:
            X.0eM r6 = r10.A04
            java.lang.Object r10 = r6.getValue()
            X.OyH r10 = (X.C72196OyH) r10
            X.EZp r8 = X.C48147EZp.RESPONSE
            X.EZo r9 = X.C48146EZo.THREAD_VIEW
            java.lang.String r7 = r7.A01
            java.lang.String r6 = "prompt_type"
            java.util.Map r13 = X.AnonymousClass7TF.A0w(r6, r7)
            java.lang.String r11 = "direct_response_tab_send_success"
            java.lang.String r12 = "impression"
            X.C72196OyH.A00(r8, r9, r10, r11, r12, r13)
            goto L_0x04d7
        L_0x052d:
            r1 = -301309194(0xffffffffee0a62f6, float:-1.0707142E28)
            int r2 = X.AnonymousClass0fD.A03(r1)
            r1 = 1213691164(0x4857751c, float:220628.44)
            int r6 = X.AnonymousClass0fD.A03(r1)
            X.HMw r5 = X.C54665HMw.PRODUCT_AUTO_COLLECTION
            java.lang.String r4 = r5.A01
            java.lang.String r1 = r0.A03
            com.instagram.save.model.SavedCollection r3 = new com.instagram.save.model.SavedCollection
            r3.<init>(r5, r4, r1)
            java.lang.Object r1 = r0.A02
            X.H1P r1 = (X.H1P) r1
            com.instagram.common.session.UserSession r1 = r1.A0A()
            X.IOk r1 = X.C55124HcX.A00(r1)
            r1.A04(r3)
            java.lang.Object r0 = r0.A01
            X.0sP r0 = (X.0sP) r0
            r0.invoke(r3)
            r0 = -1710626243(0xffffffff9a09ea3d, float:-2.8520152E-23)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = -1559352649(0xffffffffa30e2ab7, float:-7.706881E-18)
            goto L_0x0614
        L_0x0567:
            r1 = 135218005(0x80f4355, float:4.3111646E-34)
            int r2 = X.AnonymousClass0fD.A03(r1)
            r1 = -1487914901(0xffffffffa750386b, float:-2.8896383E-15)
            int r4 = X.AnonymousClass0fD.A03(r1)
            r12 = 0
            X.0qQ.A0B(r7, r12)
            X.EDL.super.onSuccess(r7)
            java.lang.Object r3 = r0.A02
            X.Fb8 r3 = (X.C50400Fb8) r3
            com.instagram.common.session.UserSession r6 = r3.A01
            com.instagram.reels.store.ReelStore r1 = X.1OP.A05(r6)
            java.lang.String r0 = r0.A03
            com.instagram.model.reels.Reel r7 = r1.A0M(r0)
            if (r7 != 0) goto L_0x05a1
            X.0wb r3 = X.0wb.A01
            java.lang.String r1 = "DirectThreadFragment_navigateToLiveViewerFromLiveViewerInvite"
            java.lang.String r0 = "Broadcast item wasn't found in the map"
            r3.Ew0(r1, r0)
        L_0x0597:
            r0 = 637962144(0x260687a0, float:4.6674395E-16)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -358570240(0xffffffffeaa0a700, float:-9.710838E25)
            goto L_0x0614
        L_0x05a1:
            android.app.Activity r5 = r3.A00
            java.util.List r11 = X.AnonymousClass7TE.A1I(r7)
            X.3BQ r8 = r3.A02
            r9 = 0
            r13 = 1
            r10 = r9
            r14 = r12
            X.F8Q.A01(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0597
        L_0x05b1:
            r1 = 1706209908(0x65b2b274, float:1.0548414E23)
            int r2 = X.AnonymousClass0fD.A03(r1)
            r1 = -1567901590(0xffffffffa28bb86a, float:-3.787128E-18)
            int r4 = X.AnonymousClass0fD.A03(r1)
            X.6Tl r3 = X.DbS.A0P()
            java.lang.String r1 = "success"
            r3.A01(r1)
            java.lang.String r1 = r0.A03
            X.6Tm r3 = X.DbT.A0V(r3, r1)
            java.lang.Object r1 = r0.A01
            X.4uI r1 = (X.C277014uI) r1
            java.lang.Object r0 = r0.A02
            X.DbS.A1R(r3, r1, r0)
            r0 = 136475833(0x82274b9, float:4.888731E-34)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 97285506(0x5cc7582, float:1.9227233E-35)
            goto L_0x0614
        L_0x05e1:
            r1 = 1997230085(0x770b5005, float:2.8255947E33)
            int r2 = X.AnonymousClass0fD.A03(r1)
            X.DvK r7 = (X.DvK) r7
            r1 = 1800170704(0x6b4c6cd0, float:2.4713472E26)
            int r5 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r4 = r0.A01
            com.instagram.arlink.fragment.NametagController r4 = (com.instagram.arlink.fragment.NametagController) r4
            java.lang.String r1 = r7.A00
            r4.A02 = r1
            java.lang.String r1 = r0.A03
            java.lang.String r3 = com.instagram.arlink.fragment.NametagController.A00(r4, r1)
            com.instagram.ui.widget.nametag.NametagCardView r1 = r4.mCardView
            r1.setUrl(r3)
            java.lang.Object r0 = r0.A02
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            com.instagram.arlink.fragment.NametagController.A01(r0, r4)
            r0 = 1542932816(0x5bf74950, float:1.39209854E17)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 1406058295(0x53cebf37, float:1.77594263E12)
        L_0x0614:
            X.AnonymousClass0fD.A0A(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EDL.onSuccess(java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int i;
        int i2;
        switch (this.A00) {
            case 2:
                i = AnonymousClass0fD.A03(1493347887);
                C370538wd r8 = (C370538wd) obj;
                int A0D = AnonymousClass7TG.A0D(r8, 1378305148);
                EDL.super.onSuccessInBackground(r8);
                AiAgentThreadLauncher aiAgentThreadLauncher = (AiAgentThreadLauncher) this.A02;
                AnonymousClass7I6 r3 = (AnonymousClass7I6) aiAgentThreadLauncher.A02.getValue();
                String str = this.A03;
                if (str != null && str.equals(r3.A01)) {
                    r3.A06.markerPoint(AnonymousClass7I6.A00(r3), "create_server_thread_success");
                }
                ((2Dm) aiAgentThreadLauncher.A03.getValue()).FKy(r8, r8.A0o, r8, true);
                AnonymousClass0fD.A0A(7504445, A0D);
                i2 = -163959500;
                break;
            case 7:
                int A032 = AnonymousClass0fD.A03(1064036444);
                AnonymousClass3JC r82 = (AnonymousClass3JC) obj;
                int A033 = AnonymousClass0fD.A03(507437588);
                boolean z = false;
                ((BrowserLiteCallbackService.BrowserLiteCallbackImpl) this.A01).A00 = false;
                try {
                    Object obj2 = r82.A01;
                    if (obj2 != null) {
                        AnonymousClass3FZ r32 = (AnonymousClass3FZ) obj2;
                        Class<C47115Dqr> cls = C47115Dqr.class;
                        if (r32.A00(cls, "ig_iab_autofil_optout_domains_root") != null && r32.A00(cls, "ig_iab_autofil_optout_domains_root").A06("is_opt_out")) {
                            z = true;
                        }
                    }
                    ((AutofillOptOutCallback) this.A02).Czt(this.A03, z);
                } catch (RemoteException unused) {
                }
                AnonymousClass0fD.A0A(1989073468, A033);
                AnonymousClass0fD.A0A(1438315858, A032);
                return;
            case 14:
                i = AnonymousClass0fD.A03(1060393946);
                int A034 = AnonymousClass0fD.A03(-2021470591);
                ((1P0) this.A01).onSuccessInBackground(obj);
                AnonymousClass0fD.A0A(-612222866, A034);
                i2 = 1176212447;
                break;
            default:
                EDL.super.onSuccessInBackground(obj);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }
}
