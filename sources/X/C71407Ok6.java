package X;

import android.os.Bundle;
import android.view.View;

/* renamed from: X.Ok6  reason: case insensitive filesystem */
public final class C71407Ok6 implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public C71407Ok6(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, int i, Object obj) {
        AnonymousClass0fU.A00(new C71407Ok6(obj, i), view);
    }

    public static void A02(C3021461u r1, Object obj, int i) {
        r1.setPrimaryActionOnClickListener(new C71407Ok6(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v257, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v258, resolved type: X.OMj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v313, resolved type: X.OMj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v314, resolved type: X.OMj} */
    /* JADX WARNING: type inference failed for: r0v261, types: [X.OMj, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0b73, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0b7a, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0c35, code lost:
        X.AnonymousClass0fD.A0C(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0c38, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0c80, code lost:
        X.AnonymousClass0fD.A0C(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0c83, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0d55, code lost:
        X.AnonymousClass0fD.A0C(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0d58, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0134, code lost:
        if (r1.size() != 4) goto L_0x0136;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r15) {
        /*
            r14 = this;
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x0d3c;
                case 1: goto L_0x0d26;
                case 2: goto L_0x0cf5;
                case 3: goto L_0x0cd7;
                case 4: goto L_0x0ca6;
                case 5: goto L_0x0c87;
                case 6: goto L_0x0c5a;
                case 7: goto L_0x0c39;
                case 8: goto L_0x0c1c;
                case 9: goto L_0x0c05;
                case 10: goto L_0x0bee;
                case 11: goto L_0x0bd7;
                case 12: goto L_0x0bc0;
                case 13: goto L_0x0b5a;
                case 14: goto L_0x0b26;
                case 15: goto L_0x0af8;
                case 16: goto L_0x0ac4;
                case 17: goto L_0x0a96;
                case 18: goto L_0x0a67;
                case 19: goto L_0x0a46;
                case 20: goto L_0x09fb;
                case 21: goto L_0x09cd;
                case 22: goto L_0x0979;
                case 23: goto L_0x0958;
                case 24: goto L_0x0937;
                case 25: goto L_0x08fb;
                case 26: goto L_0x08d6;
                case 27: goto L_0x08b7;
                case 28: goto L_0x0892;
                case 29: goto L_0x0873;
                case 30: goto L_0x084e;
                case 31: goto L_0x082f;
                case 32: goto L_0x081c;
                case 33: goto L_0x07ed;
                case 34: goto L_0x07bb;
                case 35: goto L_0x0796;
                case 36: goto L_0x0777;
                case 37: goto L_0x0764;
                case 38: goto L_0x0738;
                case 39: goto L_0x06c1;
                case 40: goto L_0x0675;
                case 41: goto L_0x065e;
                case 42: goto L_0x0619;
                case 43: goto L_0x05c1;
                case 44: goto L_0x0559;
                case 45: goto L_0x04e1;
                case 46: goto L_0x049a;
                case 47: goto L_0x0466;
                case 48: goto L_0x0427;
                case 49: goto L_0x040b;
                case 50: goto L_0x03f5;
                case 51: goto L_0x03dc;
                case 52: goto L_0x03a0;
                case 53: goto L_0x038a;
                case 54: goto L_0x0379;
                case 55: goto L_0x0351;
                case 56: goto L_0x0316;
                case 57: goto L_0x02ff;
                case 58: goto L_0x02e8;
                case 59: goto L_0x02d1;
                case 60: goto L_0x029e;
                case 61: goto L_0x0231;
                case 62: goto L_0x01e6;
                case 63: goto L_0x0198;
                case 64: goto L_0x011a;
                case 65: goto L_0x00f2;
                case 66: goto L_0x00df;
                case 67: goto L_0x009c;
                case 68: goto L_0x005c;
                case 69: goto L_0x0019;
                case 70: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            r0 = -1291576152(0xffffffffb3041ca8, float:-3.0759708E-8)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r14.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            X.DbX.A1I(r1)
            r1 = -753673491(0xffffffffd313daed, float:-6.3503316E11)
            goto L_0x0d55
        L_0x0019:
            r0 = 832398022(0x319d62c6, float:4.5805306E-9)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r14.A01
            X.NLb r1 = (X.NLb) r1
            X.OJU r2 = r1.A00
            X.6ap r5 = X.DbV.A0X()
            java.lang.String r1 = "direct_faq_import_max_limit_reached"
            r5.A0H = r1
            com.instagram.direct.fragment.icebreaker.ImportMsgrIceBreakersFragment r4 = r2.A00
            android.content.Context r1 = r4.A00
            android.content.res.Resources r3 = r1.getResources()
            r2 = 2131820655(0x7f11006f, float:1.9274031E38)
            r1 = 4
            java.lang.String r1 = X.DbY.A0d(r3, r1, r2)
            r5.A0D = r1
            X.DbY.A1N(r5)
            X.OSf r4 = r4.A03
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            java.lang.String r2 = "SELECT_MSGR_QUESTIONS_MAX_LIMIT_REACHED_FAILURE"
            java.lang.String r1 = "error_code"
            r3.put(r1, r2)
            java.lang.String r2 = "User was unable to select more msgr questions because import max limit is reached"
            java.lang.String r1 = "icebreaker_settings_error_screen_impression"
            X.C70932OSf.A00(r4, r1, r2, r3)
            r1 = -1493812939(0xffffffffa6f63935, float:-1.7085185E-15)
            goto L_0x0d55
        L_0x005c:
            r0 = -405353994(0xffffffffe7d6c9f6, float:-2.0286239E24)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r14.A01
            com.instagram.direct.fragment.icebreaker.ImportMsgrIceBreakersFragment r4 = (com.instagram.direct.fragment.icebreaker.ImportMsgrIceBreakersFragment) r4
            X.OyN r0 = r4.A04
            int r0 = r0.A03()
            if (r0 == 0) goto L_0x0095
            android.content.Context r0 = r4.A00
            X.8ab r3 = X.DbS.A0Y(r0)
            r0 = 2131959266(0x7f131de2, float:1.9555168E38)
            r3.A09(r0)
            r0 = 2131959264(0x7f131de0, float:1.9555164E38)
            r3.A08(r0)
            r3.A05()
            r1 = 2131959265(0x7f131de1, float:1.9555166E38)
            r0 = 37
            X.OgE r0 = X.C71249OgE.A00(r4, r0)
            X.Dba.A0t(r0, r3, r1)
        L_0x0090:
            r0 = 1532587847(0x5b596f47, float:6.1202421E16)
            goto L_0x0c35
        L_0x0095:
            com.instagram.direct.fragment.icebreaker.ImportMsgrIceBreakersFragment.A00(r4)
            r4.A02()
            goto L_0x0090
        L_0x009c:
            r0 = -1434586987(0xffffffffaa7df095, float:-2.2554383E-13)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r14.A01
            com.instagram.direct.fragment.icebreaker.ImportMsgrIceBreakersFragment r4 = (com.instagram.direct.fragment.icebreaker.ImportMsgrIceBreakersFragment) r4
            java.util.Set r0 = r4.A09
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00d9
            android.content.Context r0 = r4.A00
            X.8ab r3 = X.DbS.A0Y(r0)
            r0 = 2131959186(0x7f131d92, float:1.9555005E38)
            r3.A09(r0)
            r0 = 2131959184(0x7f131d90, float:1.9555001E38)
            r3.A08(r0)
            r1 = 2131959262(0x7f131dde, float:1.955516E38)
            r0 = 0
            r3.A0H(r0, r1)
            r1 = 2131960790(0x7f1323d6, float:1.9558259E38)
            r0 = 36
            X.OgE r0 = X.C71249OgE.A00(r4, r0)
            X.Dba.A0t(r0, r3, r1)
        L_0x00d4:
            r0 = 932275167(0x379163df, float:1.7331853E-5)
            goto L_0x0c35
        L_0x00d9:
            androidx.fragment.app.FragmentActivity r0 = r4.A01
            r0.onBackPressed()
            goto L_0x00d4
        L_0x00df:
            r0 = 832458639(0x319e4f8f, float:4.60745E-9)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r14.A01
            com.instagram.direct.fragment.icebreaker.DirectIceBreakerSettingFragment r1 = (com.instagram.direct.fragment.icebreaker.DirectIceBreakerSettingFragment) r1
            com.instagram.direct.fragment.icebreaker.DirectIceBreakerSettingFragment.A06(r1)
            r1 = -769754770(0xffffffffd21e796e, float:-1.70160521E11)
            goto L_0x0d55
        L_0x00f2:
            r0 = -585454583(0xffffffffdd1aac09, float:-6.9658082E17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r14.A01
            X.OVT r1 = (X.OVT) r1
            com.instagram.direct.fragment.icebreaker.DirectIceBreakerSettingFragment r4 = r1.A05
            X.OSf r3 = r4.A07
            java.lang.String r2 = "icebreaker_settings_question_list_screen_import_option_click"
            r1 = 0
            X.C70932OSf.A00(r3, r2, r1, r1)
            X.OKh r1 = r4.A05
            com.instagram.direct.fragment.icebreaker.ImportMsgrIceBreakersFragment r3 = new com.instagram.direct.fragment.icebreaker.ImportMsgrIceBreakersFragment
            r3.<init>()
            androidx.fragment.app.FragmentActivity r2 = r1.A01
            com.instagram.common.session.UserSession r1 = r1.A02
            X.Dbb.A11(r3, r2, r1)
            r1 = 1412019176(0x5429b3e8, float:2.9154712E12)
            goto L_0x0d55
        L_0x011a:
            r0 = 24391085(0x1742dad, float:4.4848493E-38)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r14.A01
            X.OVT r1 = (X.OVT) r1
            com.instagram.direct.fragment.icebreaker.DirectIceBreakerSettingFragment r4 = r1.A05
            X.OyN r3 = r4.A08
            monitor-enter(r3)
            java.util.Map r1 = r3.A05     // Catch:{ all -> 0x0195 }
            if (r1 == 0) goto L_0x0136
            int r2 = r1.size()     // Catch:{ all -> 0x0195 }
            r1 = 4
            r7 = 1
            if (r2 == r1) goto L_0x0137
        L_0x0136:
            r7 = 0
        L_0x0137:
            monitor-exit(r3)
            X.OSf r6 = r4.A07
            java.util.HashMap r5 = X.AnonymousClass7TE.A1E()
            if (r7 == 0) goto L_0x0192
            java.lang.String r2 = "1"
        L_0x0142:
            java.lang.String r1 = "is_max_limit_reached"
            r5.put(r1, r2)
            r3 = 0
            java.lang.String r1 = "icebreaker_settings_add_question_button_click"
            X.C70932OSf.A00(r6, r1, r3, r5)
            if (r7 == 0) goto L_0x0186
            X.6ap r3 = X.DbV.A0X()
            java.lang.String r1 = "direct_frequently_asked_questions_max_limit_reached_error"
            r3.A0H = r1
            android.content.Context r2 = r4.A00
            r1 = 2131959384(0x7f131e58, float:1.9555407E38)
            X.DbS.A19(r2, r3, r1)
            android.content.Context r2 = r4.A00
            r1 = 2131959383(0x7f131e57, float:1.9555405E38)
            java.lang.String r1 = r2.getString(r1)
            r3.A0I = r1
            X.DbY.A1N(r3)
            X.OSf r4 = r4.A07
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            java.lang.String r2 = "ADD_QUESTION_MAX_LIMIT_REACHED_FAILURE"
            java.lang.String r1 = "error_code"
            r3.put(r1, r2)
            java.lang.String r2 = "User was unable to add more questions because icebreaker max limit is reached"
            java.lang.String r1 = "icebreaker_settings_error_screen_impression"
            X.C70932OSf.A00(r4, r1, r2, r3)
        L_0x0181:
            r1 = -1815797370(0xffffffff93c52186, float:-4.976285E-27)
            goto L_0x0d55
        L_0x0186:
            r1 = 1
            com.instagram.direct.fragment.icebreaker.DirectIceBreakerSettingFragment.A07(r4, r1)
            X.OKh r2 = r4.A05
            java.lang.String r1 = r4.A09
            r2.A00(r4, r3, r1, r3)
            goto L_0x0181
        L_0x0192:
            java.lang.String r2 = "0"
            goto L_0x0142
        L_0x0195:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0198:
            r0 = 1090702996(0x4102ce94, float:8.175434)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r14.A01
            X.NKb r5 = (X.C68484NKb) r5
            X.OSf r3 = r5.A02
            X.NiJ r1 = r5.A01
            X.NiJ r0 = X.C69257NiJ.IMPORT_FROM_PAGE
            boolean r0 = X.AnonymousClass7TF.A1W(r1, r0)
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()
            if (r0 == 0) goto L_0x01e3
            java.lang.String r1 = "1"
        L_0x01b5:
            java.lang.String r0 = "is_import_option_selected"
            r2.put(r0, r1)
            java.lang.String r0 = "icebreaker_settings_set_up_question_button_click"
            r2 = 0
            X.C70932OSf.A00(r3, r0, r2, r2)
            X.NiJ r1 = r5.A01
            if (r1 == 0) goto L_0x01db
            X.NiJ r0 = X.C69257NiJ.CREATE_NEW
            if (r1 == r0) goto L_0x01db
            X.OKh r0 = r5.A00
            com.instagram.direct.fragment.icebreaker.ImportMsgrIceBreakersFragment r2 = new com.instagram.direct.fragment.icebreaker.ImportMsgrIceBreakersFragment
            r2.<init>()
            androidx.fragment.app.FragmentActivity r1 = r0.A01
            com.instagram.common.session.UserSession r0 = r0.A02
            X.Dbb.A11(r2, r1, r0)
        L_0x01d6:
            r0 = 1181989763(0x4673bb83, float:15598.878)
            goto L_0x0c80
        L_0x01db:
            X.OKh r1 = r5.A00
            java.lang.String r0 = r5.A03
            r1.A00(r2, r2, r0, r2)
            goto L_0x01d6
        L_0x01e3:
            java.lang.String r1 = "0"
            goto L_0x01b5
        L_0x01e6:
            r0 = 969631543(0x39cb6737, float:3.8796078E-4)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r14.A01
            X.NJ5 r4 = (X.NJ5) r4
            boolean r0 = X.NJ5.A01(r4)
            if (r0 == 0) goto L_0x021f
            X.8ab r3 = X.DbW.A0U(r4)
            r0 = 2131959186(0x7f131d92, float:1.9555005E38)
            r3.A09(r0)
            r0 = 2131959184(0x7f131d90, float:1.9555001E38)
            r3.A08(r0)
            r1 = 2131959185(0x7f131d91, float:1.9555003E38)
            r0 = 0
            r3.A0H(r0, r1)
            r1 = 2131960790(0x7f1323d6, float:1.9558259E38)
            r0 = 34
            X.OgE r0 = X.C71249OgE.A00(r4, r0)
            X.Dba.A0t(r0, r3, r1)
        L_0x021a:
            r0 = 1009788537(0x3c302679, float:0.01075136)
            goto L_0x0c35
        L_0x021f:
            androidx.fragment.app.FragmentActivity r1 = r4.getActivity()
            if (r1 == 0) goto L_0x021a
            r0 = 0
            r1.setResult(r0)
            androidx.fragment.app.FragmentActivity r0 = r4.getActivity()
            r0.finish()
            goto L_0x021a
        L_0x0231:
            r0 = -727911060(0xffffffffd49cf56c, float:-5.3930592E12)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r14.A01
            X.NJ5 r7 = (X.NJ5) r7
            X.OSf r3 = r7.A07
            boolean r0 = X.NJ5.A02(r7)
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()
            if (r0 == 0) goto L_0x029b
            java.lang.String r1 = "1"
        L_0x024a:
            java.lang.String r0 = "added_response"
            r2.put(r0, r1)
            r1 = 0
            java.lang.String r0 = "icebreaker_settings_save_button_click"
            X.C70932OSf.A00(r3, r0, r1, r2)
            android.widget.EditText r0 = r7.A03
            java.lang.String r0 = X.AnonymousClass7TF.A0f(r0)
            java.lang.String r6 = r0.trim()
            android.widget.EditText r0 = r7.A04
            if (r0 != 0) goto L_0x0292
            r5 = 0
        L_0x0264:
            X.OMj r0 = r7.A08
            X.OyN r3 = r7.A09
            if (r0 == 0) goto L_0x028a
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            java.lang.String r1 = r0.A01
            X.OMj r0 = new X.OMj
            r0.<init>()
            r0.A01 = r1
        L_0x0275:
            r0.A02 = r6
            r0.A03 = r5
            r3.A08(r0, r2)
            android.content.Intent r2 = r7.A00
            java.lang.String r1 = "should_seen_messaging_hub_afterparty_dialog"
            r0 = 504(0x1f8, float:7.06E-43)
            r2.putExtra(r1, r0)
            r0 = 1825085941(0x6cc899f5, float:1.9400976E27)
            goto L_0x0c80
        L_0x028a:
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            X.OMj r0 = new X.OMj
            r0.<init>()
            goto L_0x0275
        L_0x0292:
            java.lang.String r0 = X.AnonymousClass7TF.A0f(r0)
            java.lang.String r5 = r0.trim()
            goto L_0x0264
        L_0x029b:
            java.lang.String r1 = "0"
            goto L_0x024a
        L_0x029e:
            r0 = 2013995017(0x780b2009, float:1.1287172E34)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r14.A01
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            X.8ab r3 = X.DbW.A0U(r4)
            r1 = 2131959183(0x7f131d8f, float:1.9555E38)
            r3.A09(r1)
            r1 = 2131959182(0x7f131d8e, float:1.9554997E38)
            r3.A08(r1)
            r2 = 2131964550(0x7f133286, float:1.9565885E38)
            r1 = 0
            r3.A0H(r1, r2)
            r2 = 2131957531(0x7f13171b, float:1.9551649E38)
            r1 = 33
            X.OgE r1 = X.C71249OgE.A00(r4, r1)
            X.Dba.A0t(r1, r3, r2)
            r1 = 1933440714(0x733df6ca, float:1.50505E31)
            goto L_0x0d55
        L_0x02d1:
            r0 = -143827229(0xfffffffff76d5ee3, float:-4.8144488E33)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r14.A01
            X.NPo r1 = (X.C68618NPo) r1
            X.OJT r2 = r1.A01
            X.NkE r1 = X.C69374NkE.A09
            r2.A00(r1)
            r1 = -1134998067(0xffffffffbc594dcd, float:-0.013263178)
            goto L_0x0d55
        L_0x02e8:
            r0 = 303146385(0x1211a591, float:4.595801E-28)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r14.A01
            X.NPo r1 = (X.C68618NPo) r1
            X.OJT r2 = r1.A01
            X.NkE r1 = X.C69374NkE.A06
            r2.A00(r1)
            r1 = 658520729(0x27403a99, float:2.6677118E-15)
            goto L_0x0d55
        L_0x02ff:
            r0 = -1907237843(0xffffffff8e51dc2d, float:-2.586725E-30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r14.A01
            X.NPo r1 = (X.C68618NPo) r1
            X.OJT r2 = r1.A01
            X.NkE r1 = X.C69374NkE.A0A
            r2.A00(r1)
            r1 = 971702563(0x39eb0123, float:4.482354E-4)
            goto L_0x0d55
        L_0x0316:
            r0 = 1294683416(0x4d2b4d18, float:1.79622272E8)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r14.A01
            X.NNu r1 = (X.C68573NNu) r1
            X.O6I r1 = r1.A00
            X.NKl r1 = r1.A00
            androidx.fragment.app.FragmentActivity r2 = r1.requireActivity()
            X.0eM r1 = r1.A03
            X.6Yo r4 = X.DbX.A0N(r2, r1)
            r4.A08()
            r3 = 1
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = "BroadcastChannelActivityFeedV2Fragment.ARGUMENT_FETCH_MODE"
            r2.putInt(r1, r3)
            X.NKl r1 = new X.NKl
            r1.<init>()
            r1.setArguments(r2)
            r4.A0D(r1)
            r4.A0G = r3
            r4.A04()
            r1 = 790958346(0x2f25110a, float:1.5012716E-10)
            goto L_0x0d55
        L_0x0351:
            r0 = 2065387651(0x7b1b5083, float:8.06439E35)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r14.A01
            X.NNu r1 = (X.C68573NNu) r1
            X.O6I r1 = r1.A00
            X.NKl r5 = r1.A00
            X.0eM r4 = r5.A03
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r4)
            r3 = 1
            X.NIS r2 = X.C69913NuF.A00(r1, r3)
            X.7Pr r1 = X.DbX.A0f(r4)
            r1.A17 = r3
            X.DbY.A13(r5, r2, r1)
            r1 = 1012330224(0x3c56eef0, float:0.013118491)
            goto L_0x0d55
        L_0x0379:
            r0 = -1145596804(0xffffffffbbb7947c, float:-0.0056024175)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r14.A01
            X.DbS.A1U(r1)
            r1 = -961323664(0xffffffffc6b35d70, float:-22958.719)
            goto L_0x0d55
        L_0x038a:
            r0 = 2023375(0x1edfcf, float:2.835352E-39)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r14.A01
            X.0sP r1 = (X.0sP) r1
            X.0qQ.A0A(r15)
            r1.invoke(r15)
            r1 = 1603763377(0x5f977cb1, float:2.1831588E19)
            goto L_0x0d55
        L_0x03a0:
            r0 = -1196642879(0xffffffffb8acadc1, float:-8.233963E-5)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r14.A01
            X.NV6 r6 = (X.NV6) r6
            X.OMC r1 = r6.A00
            if (r1 != 0) goto L_0x03b3
            java.lang.String r0 = "sharedStacksLogger"
            goto L_0x0b73
        L_0x03b3:
            java.lang.String r3 = "stack_grid_view"
            X.0wc r2 = r1.A00
            java.lang.String r1 = "direct_shared_album_create_album"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r2, r1)
            java.lang.String r1 = "module"
            X.C66582MXn.A1A(r2, r1, r3)
            X.F1M r5 = X.ENY.A02
            X.0eM r1 = r6.A0S
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r1)
            android.content.Context r3 = r6.requireContext()
            r2 = 0
            X.PIS r1 = new X.PIS
            r1.<init>(r6)
            r5.A00(r3, r4, r1, r2)
            r1 = -1615223772(0xffffffff9fb9a424, float:-7.8622096E-20)
            goto L_0x0d55
        L_0x03dc:
            r0 = -93230005(0xfffffffffa716c4b, float:-3.13385E35)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r14.A01
            X.NKo r0 = (X.C68495NKo) r0
            X.ODX r0 = r0.A05
            if (r0 == 0) goto L_0x03f0
            X.0sa r0 = r0.A01
            r0.invoke()
        L_0x03f0:
            r0 = -1977791211(0xffffffff8a1d4d15, float:-7.5737726E-33)
            goto L_0x0c35
        L_0x03f5:
            r0 = -447918084(0xffffffffe54d4ffc, float:-6.0597536E22)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r14.A01
            X.NKo r1 = (X.C68495NKo) r1
            X.0qQ.A0A(r15)
            r1.A0K(r15)
            r1 = -974569519(0xffffffffc5e93fd1, float:-7463.977)
            goto L_0x0d55
        L_0x040b:
            r0 = 1587787924(0x5ea3b894, float:5.898671E18)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r14.A01
            X.NKH r0 = (X.NKH) r0
            X.NKH.A01(r0)
            X.37E r1 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
            X.DbX.A10(r0, r1)
            r0 = 2042513349(0x79be47c5, float:1.2349901E35)
            goto L_0x0c35
        L_0x0427:
            r0 = -1646322461(0xffffffff9ddf1ce3, float:-5.9057477E-21)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r14.A01
            X.NUt r3 = (X.C68733NUt) r3
            X.0eM r0 = r3.A03
            java.lang.Object r0 = r0.getValue()
            X.MtO r0 = (X.C67709MtO) r0
            X.NUN r1 = r0.A01
            java.lang.String r0 = "INTRODUCE_NUX_CONTINUE_TAP"
            r1.A0B(r0)
            X.0eM r1 = r3.A02
            boolean r0 = X.C66582MXn.A1X(r1)
            if (r0 == 0) goto L_0x0463
            java.lang.Object r1 = r1.getValue()
            X.65E r1 = (X.AnonymousClass65E) r1
            androidx.fragment.app.FragmentActivity r0 = r3.getActivity()
            boolean r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x0463
            X.Njy r0 = X.C69358Njy.GDRIVE_OPTIN_SOFT_BLOCK
        L_0x045b:
            X.C66582MXn.A1H(r0, r3)
            r0 = 4618087(0x467767, float:6.471318E-39)
            goto L_0x0c35
        L_0x0463:
            X.Njy r0 = X.C69358Njy.CREATE_PIN_NUX_V2
            goto L_0x045b
        L_0x0466:
            r0 = -1342212614(0xffffffffafff75fa, float:-4.6468057E-10)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r14.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            r1 = 2131966506(0x7f133a2a, float:1.9569852E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r1 = 2131975588(0x7f135da4, float:1.9588273E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r1 = 31
            X.Pm6 r10 = new X.Pm6
            r10.<init>(r2, r1)
            r6 = 0
            r11 = 2131966507(0x7f133a2b, float:1.9569854E38)
            r12 = 2131963104(0x7f132ce0, float:1.9562952E38)
            X.8ae r3 = X.C358278ae.BLUE_BOLD
            r7 = r6
            r8 = r6
            r9 = r6
            X.C71145Oe2.A06(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = 257879291(0xf5eecfb, float:1.0991086E-29)
            goto L_0x0d55
        L_0x049a:
            r0 = 1089411724(0x40ef1a8c, float:7.4719906)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r14.A01
            X.Nga r0 = (X.C69184Nga) r0
            X.MuD r4 = X.C69184Nga.A07(r0)
            X.0eM r0 = r4.A0A
            java.lang.Object r1 = r0.getValue()
            X.MoD r1 = (X.C67458MoD) r1
            r3 = 1
            boolean r0 = X.C67458MoD.A04(r1)
            if (r0 == 0) goto L_0x04c6
            X.0xa r0 = r1.A00
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "EB_FORCE_SHOW_RESTORE_TOAST"
            r1.E5T(r0, r3)
            r1.apply()
        L_0x04c6:
            X.0eM r0 = r4.A0D
            java.lang.Object r0 = r0.getValue()
            X.3HH r0 = (X.AnonymousClass3HH) r0
            X.0xa r0 = r0.A00
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "EB_FORCE_RESTORE"
            r1.E5T(r0, r3)
            r1.apply()
            r0 = -1462497571(0xffffffffa8d40edd, float:-2.3543174E-14)
            goto L_0x0c35
        L_0x04e1:
            r0 = -1412930357(0xffffffffabc864cb, float:-1.423883E-12)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r14.A01
            X.Nga r0 = (X.C69184Nga) r0
            X.MuD r5 = X.C69184Nga.A07(r0)
            X.2Fk r0 = r5.A00
            java.lang.Object r0 = r0.A02()
            X.N2f r0 = (X.C68139N2f) r0
            if (r0 == 0) goto L_0x0557
            X.Niw r1 = r0.A01
        L_0x04fc:
            X.Niw r0 = X.C69296Niw.DEVICE_ON_BOARDED
            if (r1 != r0) goto L_0x0516
            X.05G r1 = r5.A0M
            X.NiO r0 = X.C69262NiO.ON
            r1.FIA(r0)
            X.1aU r1 = r5.A01
            r0 = 19
            X.1aU r2 = X.C72120Owf.A00(r1, r5, r0)
            X.1a8 r1 = r5.A02
            X.PT8 r0 = X.PT8.A00
            r1.A02(r2, r0)
        L_0x0516:
            X.0eM r0 = r5.A0D
            java.lang.Object r0 = r0.getValue()
            X.3HH r0 = (X.AnonymousClass3HH) r0
            r2 = 1
            X.0xa r0 = r0.A00
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "EB_FORCE_RESTORE"
            r1.E5T(r0, r2)
            r1.apply()
            X.0eM r0 = r5.A0A
            java.lang.Object r0 = r0.getValue()
            X.MoD r0 = (X.C67458MoD) r0
            r2 = 0
            X.0xa r0 = r0.A00
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "EB_FIRST_RESTORE_ATTEMPT_TIMESTAMP_MS"
            r1.E5c(r0, r2)
            r1.apply()
            com.instagram.common.session.UserSession r0 = r5.A03
            X.1Av r1 = X.1Au.A00(r0)
            r0 = 0
            r1.A0V(r0)
            X.C67758MuD.A01(r5)
            r0 = 3995562(0x3cf7aa, float:5.598975E-39)
            goto L_0x0c80
        L_0x0557:
            r1 = 0
            goto L_0x04fc
        L_0x0559:
            r0 = -1405563791(0xffffffffac38cc71, float:-2.626146E-12)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r14.A01
            X.Nga r1 = (X.C69184Nga) r1
            X.MuD r4 = X.C69184Nga.A07(r1)
            X.0eM r1 = r4.A0A
            java.lang.Object r1 = r1.getValue()
            X.MoD r1 = (X.C67458MoD) r1
            X.0xa r1 = r1.A00
            X.0xY r2 = r1.AR4()
            java.lang.String r1 = "EB_CUTOVER_TIMESTAMP_MS"
            r2.ED3(r1)
            java.lang.String r1 = "EB_FIRST_RESTORE_ATTEMPT_TIMESTAMP_MS"
            r2.ED3(r1)
            java.lang.String r1 = "EB_INTRODUCE_BANNER_INTERVAL_IMPRESSIONS"
            r2.ED3(r1)
            java.lang.String r1 = "EB_SELL_BANNER_INTERVAL_IMPRESSIONS"
            r2.ED3(r1)
            java.lang.String r1 = "EB_WARN_SOFT_BLOCK_INTERVALS_EXHAUSTED"
            r2.ED3(r1)
            java.lang.String r1 = "EB_WARN_BANNER_INTERVAL_IMPRESSIONS"
            r2.ED3(r1)
            java.lang.String r1 = "EB_RESTORE_INTERVALS_EXHAUSTED"
            r2.ED3(r1)
            java.lang.String r1 = "EB_BLOCKSTORE_SETUP_FAILED"
            r2.ED3(r1)
            java.lang.String r1 = "EB_BLOCK_RELEASE_IMPRESSION"
            r2.ED3(r1)
            java.lang.String r1 = "MEX_EB_LOW_DISK_SPACE_BANNER_INTERVAL_IMPRESSION"
            r2.ED3(r1)
            java.lang.String r1 = "MEX_EBUPSELL_BANNER_INTERVAL_IMPRESSIONS"
            r2.ED3(r1)
            r2.apply()
            X.1a8 r3 = r4.A02
            X.1aU r2 = r4.A01
            X.PT7 r1 = X.PT7.A00
            r3.A02(r2, r1)
            X.C67758MuD.A01(r4)
            r1 = 1933251132(0x733b123c, float:1.482131E31)
            goto L_0x0d55
        L_0x05c1:
            r0 = -1389125163(0xffffffffad33a1d5, float:-1.0210906E-11)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r14.A01
            X.Nga r3 = (X.C69184Nga) r3
            X.NUQ r2 = X.C67758MuD.A00(r3)
            java.lang.String r1 = "TURN_OFF_SECURE_STORAGE"
            r2.A0B(r1)
            r1 = 2131973387(0x7f13550b, float:1.9583808E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r1 = 2131973383(0x7f135507, float:1.95838E38)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            r1 = 34
            X.Pm6 r9 = new X.Pm6
            r9.<init>(r3, r1)
            r1 = 35
            X.Pm6 r10 = new X.Pm6
            r10.<init>(r3, r1)
            r1 = 36
            X.Pm6 r11 = new X.Pm6
            r11.<init>(r3, r1)
            r12 = 2131973386(0x7f13550a, float:1.9583806E38)
            r1 = 2131973384(0x7f135508, float:1.9583802E38)
            r13 = 2131973385(0x7f135509, float:1.9583804E38)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            X.8ae r4 = X.C358278ae.RED_BOLD
            r8 = 0
            X.C71145Oe2.A06(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.NUQ r2 = X.C67758MuD.A00(r3)
            java.lang.String r1 = "TURN_OFF_EB_DIALOG_IMPRESSION"
            r2.A0B(r1)
            r1 = 1099174430(0x4184121e, float:16.508846)
            goto L_0x0d55
        L_0x0619:
            r0 = -13853438(0xffffffffff2c9d02, float:-2.2944245E38)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r14.A01
            X.Nga r3 = (X.C69184Nga) r3
            X.NUQ r1 = X.C67758MuD.A00(r3)
            java.lang.String r0 = "GENERATE_OTC_CLICK"
            r1.A0B(r0)
            java.lang.Integer r9 = X.AnonymousClass05K.A00
            r1.A0A(r9)
            X.MuD r1 = X.C69184Nga.A07(r3)
            androidx.fragment.app.FragmentActivity r4 = r3.requireActivity()
            X.0eM r0 = r1.A0C
            boolean r0 = X.C66582MXn.A1Y(r0)
            X.OW5 r3 = r1.A08
            if (r0 == 0) goto L_0x0657
            X.Njy r6 = X.C69358Njy.OTC_DISPLAY_CODE_V2
            java.lang.Integer r8 = X.AnonymousClass05K.A0C
            X.NiX r7 = X.C69271NiX.DIALOG
        L_0x064a:
            r10 = 0
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()
            r3.A01(r4, r5, r6, r7, r8, r9, r10)
            r0 = 1093185625(0x4128b059, float:10.543054)
            goto L_0x0c35
        L_0x0657:
            X.Njy r6 = X.C69358Njy.OTC_DISPLAY_CODE
            java.lang.Integer r8 = X.AnonymousClass05K.A0C
            X.NiX r7 = X.C69271NiX.BOTTOM_SHEET
            goto L_0x064a
        L_0x065e:
            r0 = -163229081(0xfffffffff6455267, float:-1.0005408E33)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r14.A01
            X.Nga r1 = (X.C69184Nga) r1
            X.MuD r1 = X.C69184Nga.A07(r1)
            X.C67758MuD.A01(r1)
            r1 = 943807994(0x38415dfa, float:4.610231E-5)
            goto L_0x0d55
        L_0x0675:
            r0 = 974576631(0x3a16dbf7, float:5.754823E-4)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r14.A01
            X.Nga r3 = (X.C69184Nga) r3
            X.NUQ r2 = X.C67758MuD.A00(r3)
            java.lang.String r1 = "DELETE_SECURE_STORAGE"
            r2.A0B(r1)
            X.NUQ r2 = X.C67758MuD.A00(r3)
            java.lang.String r1 = "DELETE_EB_DIALOG_IMPRESSION"
            r2.A0B(r1)
            r1 = 2131973382(0x7f135506, float:1.9583798E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r1 = 38
            X.Pm6 r9 = new X.Pm6
            r9.<init>(r3, r1)
            r1 = 39
            X.Pm6 r11 = new X.Pm6
            r11.<init>(r3, r1)
            r7 = 0
            r12 = 2131973381(0x7f135505, float:1.9583796E38)
            r1 = 2131973380(0x7f135504, float:1.9583794E38)
            r13 = 2131973379(0x7f135503, float:1.9583792E38)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            X.8ae r4 = X.C358278ae.RED_BOLD
            r8 = r7
            r10 = r7
            X.C71145Oe2.A06(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r1 = -1477167925(0xffffffffa7f434cb, float:-6.7780843E-15)
            goto L_0x0d55
        L_0x06c1:
            r0 = -1746251107(0xffffffff97ea529d, float:-1.514275E-24)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r14.A01
            X.Nga r0 = (X.C69184Nga) r0
            X.MuD r7 = X.C69184Nga.A07(r0)
            android.content.Context r6 = r0.requireContext()
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r5.<init>(r6)
            r0 = 1
            r5.setOrientation(r0)
            r0 = 20
            r5.setPadding(r0, r0, r0, r0)
            android.widget.EditText r4 = new android.widget.EditText
            r4.<init>(r6)
            r0 = 2131966501(0x7f133a25, float:1.9569842E38)
            java.lang.String r0 = r6.getString(r0)
            r4.setHint(r0)
            r0 = 8194(0x2002, float:1.1482E-41)
            r4.setInputType(r0)
            X.0eM r0 = r7.A0D
            java.lang.Object r0 = r0.getValue()
            X.3HH r0 = (X.AnonymousClass3HH) r0
            X.0xa r3 = r0.A00
            java.lang.String r1 = "CUSTOM_DISK_SPACE_THRESHOLD"
            r0 = 0
            float r1 = r3.getFloat(r1, r0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0712
            java.lang.String r0 = java.lang.String.valueOf(r1)
            r4.setText(r0)
        L_0x0712:
            r5.addView(r4)
            android.widget.Button r1 = new android.widget.Button
            r1.<init>(r6)
            r0 = 2131966505(0x7f133a29, float:1.956985E38)
            X.DbT.A18(r6, r1, r0)
            r0 = 24
            X.C71405Ok4.A01(r1, r0, r4, r7)
            r5.addView(r1)
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r6)
            r0.setView(r5)
            r0.show()
            r0 = 2017871982(0x7846486e, float:1.6086622E34)
            goto L_0x0c35
        L_0x0738:
            r0 = -1498032011(0xffffffffa6b5d875, float:-1.2618069E-15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r14.A01
            X.NJT r3 = (X.NJT) r3
            r3.requireActivity()
            X.0eM r1 = r3.A00
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r1)
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            X.6Yo r2 = X.DbS.A0M(r1, r2)
            X.Nga r1 = new X.Nga
            r1.<init>()
            r2.A0D(r1)
            r2.A04()
            r1 = -1689280060(0xffffffff9b4fa1c4, float:-1.7174908E-22)
            goto L_0x0d55
        L_0x0764:
            r0 = -768881391(0xffffffffd22bcd11, float:-1.84469963E11)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r14.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r1.onBackPressed()
            r1 = -1943761700(0xffffffff8c248cdc, float:-1.2676489E-31)
            goto L_0x0d55
        L_0x0777:
            r0 = -1020425227(0xffffffffc32d8bf5, float:-173.5467)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r14.A01
            X.NUr r3 = (X.C68731NUr) r3
            X.0eM r1 = r3.A01
            java.lang.Object r1 = r1.getValue()
            X.MtY r1 = (X.C67719MtY) r1
            X.NUN r2 = r1.A00
            java.lang.String r1 = "SOFT_BLOCK_PIN_LEADING_SCREEN_MORE_OPTIONS_TAP"
            A01(r2, r3, r1)
            r1 = 1901994952(0x715e23c8, float:1.0999829E30)
            goto L_0x0d55
        L_0x0796:
            r0 = -855994348(0xffffffffccfa9014, float:-1.31367072E8)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r14.A01
            X.NUr r3 = (X.C68731NUr) r3
            X.0eM r1 = r3.A01
            java.lang.Object r1 = r1.getValue()
            X.MtY r1 = (X.C67719MtY) r1
            X.NUN r2 = r1.A00
            java.lang.String r1 = "SOFT_BLOCK_PIN_LEADING_SCREEN_CREATE_PIN_TAP"
            X.2DR r2 = X.C66913Mex.A01(r2, r3, r1)
            X.Njy r1 = X.C69358Njy.CREATE_PIN
            X.C66581MXm.A1D(r3, r1, r2)
            r1 = 793725832(0x2f4f4b88, float:1.8853374E-10)
            goto L_0x0d55
        L_0x07bb:
            r0 = -1475541409(0xffffffffa80d065f, float:-7.828454E-15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r14.A01
            X.NV0 r3 = (X.NV0) r3
            X.0eM r1 = r3.A0C
            java.lang.Object r1 = r1.getValue()
            X.MtT r1 = (X.C67714MtT) r1
            X.NUa r2 = r1.A08
            java.lang.String r1 = "PIN_RESTORE_NEED_HELP_TAP"
            r2.A0B(r1)
            androidx.fragment.app.FragmentActivity r5 = r3.requireActivity()
            X.0eM r1 = r3.A00
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r1)
            X.2EG r3 = X.2EG.A1f
            java.lang.String r2 = "EncryptedBackupsPinRestoreFragment"
            java.lang.String r1 = "https://help.instagram.com/1992818607740142"
            X.FH7.A08(r5, r4, r3, r1, r2)
            r1 = 1158581794(0x450e8e22, float:2280.8833)
            goto L_0x0d55
        L_0x07ed:
            r0 = -1171600842(0xffffffffba2aca36, float:-6.515117E-4)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r14.A01
            X.NV0 r3 = (X.NV0) r3
            X.0eM r0 = r3.A0C
            java.lang.Object r0 = r0.getValue()
            X.MtT r0 = (X.C67714MtT) r0
            X.NUa r1 = r0.A08
            java.lang.String r0 = "PIN_RESTORE_USE_OTC_TAP"
            r1.A0B(r0)
            X.0eM r0 = r3.A0B
            boolean r0 = X.C66582MXn.A1Y(r0)
            if (r0 == 0) goto L_0x0819
            X.Njy r0 = X.C69358Njy.OTC_WAIT
        L_0x0811:
            X.C66582MXn.A1H(r0, r3)
            r0 = 695530861(0x2974f56d, float:5.4391757E-14)
            goto L_0x0c35
        L_0x0819:
            X.Njy r0 = X.C69358Njy.OTC_ENTER_CODE
            goto L_0x0811
        L_0x081c:
            r0 = -1133345557(0xffffffffbc7284eb, float:-0.014802198)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r14.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r1.onBackPressed()
            r1 = 975331765(0x3a2261b5, float:6.194369E-4)
            goto L_0x0d55
        L_0x082f:
            r0 = 1294664198(0x4d2b0206, float:1.79314784E8)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r14.A01
            X.NUl r3 = (X.C68725NUl) r3
            X.0eM r1 = r3.A00
            java.lang.Object r1 = r1.getValue()
            X.MtX r1 = (X.C67718MtX) r1
            X.NUN r2 = r1.A00
            java.lang.String r1 = "SOFT_BLOCK_PIN_LEADING_SCREEN_MORE_OPTIONS_TAP"
            A01(r2, r3, r1)
            r1 = 1492506230(0x58f5d676, float:2.16241161E15)
            goto L_0x0d55
        L_0x084e:
            r0 = 1649604228(0x6252f684, float:9.728949E20)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r14.A01
            X.NUl r3 = (X.C68725NUl) r3
            X.0eM r1 = r3.A00
            java.lang.Object r1 = r1.getValue()
            X.MtX r1 = (X.C67718MtX) r1
            X.NUN r2 = r1.A00
            java.lang.String r1 = "SOFT_BLOCK_PIN_LEADING_SCREEN_CREATE_PIN_TAP"
            X.2DR r2 = X.C66913Mex.A01(r2, r3, r1)
            X.Njy r1 = X.C69358Njy.CREATE_PIN
            X.C66581MXm.A1D(r3, r1, r2)
            r1 = -1889807429(0xffffffff8f5bd3bb, float:-1.08383114E-29)
            goto L_0x0d55
        L_0x0873:
            r0 = 1791589582(0x6ac97cce, float:1.2179173E26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r14.A01
            X.NUu r3 = (X.C68734NUu) r3
            X.0eM r1 = r3.A03
            java.lang.Object r1 = r1.getValue()
            X.Mtn r1 = (X.C67734Mtn) r1
            X.NUN r2 = r1.A03
            java.lang.String r1 = "HARD_BLOCK_PIN_LEADING_SCREEN_MORE_OPTIONS_TAP"
            A01(r2, r3, r1)
            r1 = 120903598(0x734d7ae, float:1.3605077E-34)
            goto L_0x0d55
        L_0x0892:
            r0 = -1900633773(0xffffffff8eb6a153, float:-4.5021814E-30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r14.A01
            X.NUu r3 = (X.C68734NUu) r3
            X.0eM r1 = r3.A03
            java.lang.Object r1 = r1.getValue()
            X.Mtn r1 = (X.C67734Mtn) r1
            X.NUN r2 = r1.A03
            java.lang.String r1 = "HARD_BLOCK_PIN_LEADING_SCREEN_CREATE_PIN_TAP"
            X.2DR r2 = X.C66913Mex.A01(r2, r3, r1)
            X.Njy r1 = X.C69358Njy.CREATE_PIN
            X.C66581MXm.A1D(r3, r1, r2)
            r1 = -1702663028(0xffffffff9a836c8c, float:-5.43557E-23)
            goto L_0x0d55
        L_0x08b7:
            r0 = -591025181(0xffffffffdcc5abe3, float:-4.45116495E17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r14.A01
            X.NJT r3 = (X.NJT) r3
            X.0eM r1 = r3.A00
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            X.2DR r2 = X.OYI.A00(r1)
            X.Njy r1 = X.C69358Njy.CREATE_PIN
            X.C66581MXm.A1D(r3, r1, r2)
            r1 = 700750508(0x29c49aac, float:8.73098E-14)
            goto L_0x0d55
        L_0x08d6:
            r0 = -95678670(0xfffffffffa4c0f32, float:-2.6488419E35)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r14.A01
            X.NUy r3 = (X.C68738NUy) r3
            X.0eM r1 = r3.A07
            java.lang.Object r1 = r1.getValue()
            X.MtQ r1 = (X.C67711MtQ) r1
            X.NUa r2 = r1.A07
            java.lang.String r1 = "OTC_RESTORE_WAIT_VIEW_YOUR_DEVICES_TAP"
            X.2DR r2 = X.C66913Mex.A01(r2, r3, r1)
            X.Njy r1 = X.C69358Njy.OTC_DEVICES_V2
            X.C66581MXm.A1D(r3, r1, r2)
            r1 = 1656069777(0x62b59e91, float:1.6751433E21)
            goto L_0x0d55
        L_0x08fb:
            r0 = 850221751(0x32ad5ab7, float:2.0181103E-8)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r14.A01
            X.NUy r4 = (X.C68738NUy) r4
            X.0eM r3 = r4.A07
            java.lang.Object r0 = r3.getValue()
            X.MtQ r0 = (X.C67711MtQ) r0
            X.NUa r1 = r0.A07
            java.lang.String r0 = "OTC_RESTORE_WAIT_RESEND_TAP"
            r1.A0B(r0)
            java.lang.Object r1 = r3.getValue()
            X.MtQ r1 = (X.C67711MtQ) r1
            r0 = 1
            r1.A0E(r0)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = r4.A01
            if (r1 == 0) goto L_0x0927
            r0 = 0
            r1.setPrimaryButtonEnabled(r0)
        L_0x0927:
            android.os.CountDownTimer r0 = r4.A00
            if (r0 != 0) goto L_0x092f
            java.lang.String r0 = "countDownTimer"
            goto L_0x0b73
        L_0x092f:
            r0.start()
            r0 = 1030393728(0x3d6a8f80, float:0.05726576)
            goto L_0x0c35
        L_0x0937:
            r0 = -523696721(0xffffffffe0c905af, float:-1.1588141E20)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r14.A01
            X.NUs r3 = (X.C68732NUs) r3
            X.0eM r1 = r3.A02
            X.Mex r2 = X.C66580MXl.A0U(r1)
            java.lang.String r1 = "OTC_LANDING_NUX_SEND_CODE_TAP"
            X.2DR r2 = X.C66913Mex.A01(r2, r3, r1)
            X.Njy r1 = X.C69358Njy.OTC_WAIT
            X.C66581MXm.A1D(r3, r1, r2)
            r1 = -839030206(0xffffffffcdfd6a42, float:-5.3144992E8)
            goto L_0x0d55
        L_0x0958:
            r0 = -940309410(0xffffffffc7f4045e, float:-124936.734)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r14.A01
            X.NUq r3 = (X.C68730NUq) r3
            X.0eM r1 = r3.A01
            X.Mex r2 = X.C66580MXl.A0U(r1)
            java.lang.String r1 = "OTC_LANDING_NUX_SEND_CODE_TAP"
            X.2DR r2 = X.C66913Mex.A01(r2, r3, r1)
            X.Njy r1 = X.C69358Njy.OTC_ENTER_CODE
            X.C66581MXm.A1D(r3, r1, r2)
            r1 = 2089826704(0x7c903990, float:5.990866E36)
            goto L_0x0d55
        L_0x0979:
            r0 = 1372161649(0x51c98671, float:1.08192997E11)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r14.A01
            X.NUz r6 = (X.C68739NUz) r6
            X.0eM r3 = r6.A08
            java.lang.Object r0 = r3.getValue()
            X.MtR r0 = (X.C67712MtR) r0
            X.NUa r1 = r0.A06
            java.lang.String r0 = "OTC_ENTER_PIN_VIEW_YOUR_DEVICES_TAP"
            r1.A0B(r0)
            X.0eM r0 = r6.A07
            boolean r0 = X.C66582MXn.A1Y(r0)
            if (r0 == 0) goto L_0x09ca
            X.Njy r5 = X.C69358Njy.OTC_DEVICES_V2
        L_0x099d:
            X.0eM r0 = r6.A00
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.2DR r4 = X.OYI.A00(r0)
            java.lang.Object r0 = r3.getValue()
            X.MtR r0 = (X.C67712MtR) r0
            X.05G r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            android.os.Bundle r3 = X.DbY.A0A(r0)
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1D(r0)
            java.lang.String r0 = "deviceListKey"
            r3.putParcelableArrayList(r0, r1)
            r4.CqZ(r3, r6, r5)
            r0 = -696503562(0xffffffffd67c32f6, float:-6.9323951E13)
            goto L_0x0c35
        L_0x09ca:
            X.Njy r5 = X.C69358Njy.OTC_DEVICES
            goto L_0x099d
        L_0x09cd:
            r0 = -264942515(0xfffffffff0354c4d, float:-2.2443612E29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r14.A01
            X.NUm r3 = (X.C68726NUm) r3
            X.0eM r1 = r3.A00
            X.Mex r2 = X.C66580MXl.A0U(r1)
            java.lang.String r1 = "OTC_DISPLAY_CODE_CONFIRM_LEARN_MORE_TAP"
            r2.A0B(r1)
            androidx.fragment.app.FragmentActivity r5 = r3.requireActivity()
            X.0eM r1 = r3.A00
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r1)
            X.2EG r3 = X.2EG.A1e
            java.lang.String r2 = "EncryptedBackupsOneTimeCodeDisplayCodeIntroFragment"
            java.lang.String r1 = "https://help.instagram.com/219914557612468"
            X.FH7.A08(r5, r4, r3, r1, r2)
            r1 = -1943580395(0xffffffff8c275115, float:-1.2889612E-31)
            goto L_0x0d55
        L_0x09fb:
            r0 = 145451152(0x8ab6890, float:1.0316271E-33)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r14.A01
            X.NUm r6 = (X.C68726NUm) r6
            X.0eM r1 = r6.A00
            X.Mex r2 = X.C66580MXl.A0U(r1)
            java.lang.String r1 = "OTC_DISPLAY_CODE_CONFIRM_THIS_WASNT_ME_TAP"
            r2.A0B(r1)
            androidx.fragment.app.FragmentActivity r2 = r6.requireActivity()
            X.0eM r5 = r6.A00
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r5)
            X.6Yo r4 = X.DbU.A0Q(r2, r1)
            X.1WU r1 = X.AnonymousClass35B.A00()
            X.F3j r3 = r1.A01()
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r5)
            r2 = 0
            X.E75 r1 = r3.A00(r1, r2)
            r4.A0B(r2, r1)
            r4.A04()
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r5)
            X.2DR r1 = X.OYI.A00(r1)
            r1.APX(r6)
            r1 = -1360502206(0xffffffffaee86242, float:-1.05675926E-10)
            goto L_0x0d55
        L_0x0a46:
            r0 = -503186910(0xffffffffe201fa22, float:-5.994135E20)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r14.A01
            X.NUm r3 = (X.C68726NUm) r3
            X.0eM r1 = r3.A00
            X.Mex r2 = X.C66580MXl.A0U(r1)
            java.lang.String r1 = "OTC_DISPLAY_CODE_CONFIRM_THIS_WAS_ME_TAP"
            X.2DR r2 = X.C66913Mex.A01(r2, r3, r1)
            X.Njy r1 = X.C69358Njy.OTC_DISPLAY_CODE
            X.C66581MXm.A1D(r3, r1, r2)
            r1 = 1182259437(0x4677d8ed, float:15862.231)
            goto L_0x0d55
        L_0x0a67:
            r0 = -289538002(0xffffffffeebe002e, float:-2.9401185E28)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r14.A01
            X.NUn r3 = (X.C68727NUn) r3
            X.0eM r1 = r3.A04
            java.lang.Object r1 = r1.getValue()
            X.Mtv r1 = (X.C67742Mtv) r1
            X.NUH r2 = r1.A03
            java.lang.String r1 = "OTC_DISPLAY_CODE_DONE_TAP"
            r2.A0B(r1)
            r2.A08()
            X.0eM r1 = r3.A00
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            X.2DR r1 = X.OYI.A00(r1)
            r1.APX(r3)
            r1 = 756854255(0x2d1cadef, float:8.906194E-12)
            goto L_0x0d55
        L_0x0a96:
            r0 = -1633188609(0xffffffff9ea784ff, float:-1.7736819E-20)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r14.A01
            X.NUw r3 = (X.C68736NUw) r3
            X.0eM r1 = r3.A05
            X.NUa r2 = X.C67753Mu7.A00(r1)
            java.lang.String r1 = "OTC_DEVICE_LIST_NEED_HELP_TAP"
            r2.A0B(r1)
            androidx.fragment.app.FragmentActivity r5 = r3.requireActivity()
            X.0eM r1 = r3.A00
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r1)
            X.2EG r3 = X.2EG.A1f
            java.lang.String r2 = "EncryptedBackupsOneTimeCodeDevicesV2Fragment"
            java.lang.String r1 = "https://help.instagram.com/219914557612468"
            X.FH7.A08(r5, r4, r3, r1, r2)
            r1 = -1218896715(0xffffffffb7591cb5, float:-1.2940892E-5)
            goto L_0x0d55
        L_0x0ac4:
            r0 = -2021388124(0xffffffff878410a4, float:-1.9870933E-34)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r14.A01
            X.NUw r4 = (X.C68736NUw) r4
            r3 = 1
            r4.A00 = r3
            X.0eM r1 = r4.A05
            X.NUa r2 = X.C67753Mu7.A00(r1)
            java.lang.String r1 = "OTC_DEVICE_LIST_RESEND_CODE_TAP"
            r2.A0B(r1)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            java.lang.String r1 = "shouldResendKey"
            android.os.Bundle r3 = X.DbY.A0B(r1, r2)
            java.lang.String r2 = "resendRequestKey"
            X.0hq r1 = r4.getParentFragmentManager()
            r1.A0z(r2, r3)
            X.DbT.A1J(r4)
            r1 = 779112809(0x2e705169, float:5.464199E-11)
            goto L_0x0d55
        L_0x0af8:
            r0 = 1705930394(0x65ae6e9a, float:1.029665E23)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r14.A01
            X.NUv r3 = (X.C68735NUv) r3
            X.0eM r1 = r3.A05
            X.NUa r2 = X.C67753Mu7.A00(r1)
            java.lang.String r1 = "OTC_DEVICE_LIST_NEED_HELP_TAP"
            r2.A0B(r1)
            androidx.fragment.app.FragmentActivity r5 = r3.requireActivity()
            X.0eM r1 = r3.A00
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r1)
            X.2EG r3 = X.2EG.A1f
            java.lang.String r2 = "EncryptedBackupsOneTimeCodeDevicesFragment"
            java.lang.String r1 = "https://help.instagram.com/219914557612468"
            X.FH7.A08(r5, r4, r3, r1, r2)
            r1 = 702994075(0x29e6d69b, float:1.025128E-13)
            goto L_0x0d55
        L_0x0b26:
            r0 = 1942956003(0x73cf27e3, float:3.2825148E31)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r14.A01
            X.NUv r4 = (X.C68735NUv) r4
            r3 = 1
            r4.A01 = r3
            X.0eM r1 = r4.A05
            X.NUa r2 = X.C67753Mu7.A00(r1)
            java.lang.String r1 = "OTC_DEVICE_LIST_RESEND_CODE_TAP"
            r2.A0B(r1)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            java.lang.String r1 = "shouldResendKey"
            android.os.Bundle r3 = X.DbY.A0B(r1, r2)
            java.lang.String r2 = "resendRequestKey"
            X.0hq r1 = r4.getParentFragmentManager()
            r1.A0z(r2, r3)
            X.DbT.A1J(r4)
            r1 = 1312766094(0x4e3f388e, float:8.0203866E8)
            goto L_0x0d55
        L_0x0b5a:
            r0 = -1031695640(0xffffffffc28192e8, float:-64.78693)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r14.A01
            X.NUx r4 = (X.C68737NUx) r4
            X.0eM r0 = r4.A0B
            java.lang.Object r6 = r0.getValue()
            X.Mtd r6 = (X.C67724Mtd) r6
            java.lang.Integer r5 = r4.A03
            if (r5 != 0) goto L_0x0b7b
            java.lang.String r0 = "selectStatus"
        L_0x0b73:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0b7b:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            java.lang.String r3 = "GDRIVE"
            if (r5 != r0) goto L_0x0b88
            X.NUN r1 = r6.A00
            java.lang.String r0 = "SETUP_TYPE"
            r1.A0D(r0, r3)
        L_0x0b88:
            int r1 = r5.intValue()
            r0 = 0
            if (r1 == r0) goto L_0x0b94
            r0 = 1
            if (r1 != r0) goto L_0x0bbb
            java.lang.String r3 = "PIN_CODE"
        L_0x0b94:
            X.NUN r1 = r6.A00
            java.lang.String r0 = "MORE_OPTIONS_SELECTION"
            r1.A0D(r0, r3)
            java.lang.String r0 = "MORE_OPTIONS_CONTINUE_TAP"
            r1.A0B(r0)
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            r1 = 1
            java.lang.String r0 = "BUNDLE_HIDE_MORE_OPTIONS"
            r3.putBoolean(r0, r1)
            X.0eM r0 = r4.A0A
            java.lang.Object r1 = r0.getValue()
            X.2DR r1 = (X.2DR) r1
            X.Njy r0 = r4.A00
            r1.CqZ(r3, r4, r0)
            r0 = 622152202(0x25154a0a, float:1.2948775E-16)
            goto L_0x0c35
        L_0x0bbb:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0bc0:
            r0 = -378504940(0xffffffffe9707914, float:-1.8169623E25)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r14.A01
            X.NUx r2 = (X.C68737NUx) r2
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            r2.A03 = r1
            X.C68737NUx.A0B(r2)
            r1 = -1846115013(0xffffffff91f6853b, float:-3.8894066E-28)
            goto L_0x0d55
        L_0x0bd7:
            r0 = 784419674(0x2ec14b5a, float:8.790009E-11)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r14.A01
            X.NUx r2 = (X.C68737NUx) r2
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            r2.A03 = r1
            X.C68737NUx.A0B(r2)
            r1 = 147726798(0x8ce21ce, float:1.24061215E-33)
            goto L_0x0d55
        L_0x0bee:
            r0 = 536621731(0x1ffc32a3, float:1.0680992E-19)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r14.A01
            X.NUx r2 = (X.C68737NUx) r2
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            r2.A03 = r1
            X.C68737NUx.A0B(r2)
            r1 = 405481376(0x182b27a0, float:2.2121238E-24)
            goto L_0x0d55
        L_0x0c05:
            r0 = 670772603(0x27fb2d7b, float:6.9715805E-15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r14.A01
            X.NUx r2 = (X.C68737NUx) r2
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            r2.A03 = r1
            X.C68737NUx.A0B(r2)
            r1 = 1226126774(0x491535b6, float:611163.4)
            goto L_0x0d55
        L_0x0c1c:
            r0 = -2068858275(0xffffffff84afba5d, float:-4.131345E-36)
            int r2 = X.AnonymousClass0fD.A05(r0)
            X.37E r1 = X.AnonymousClass37D.A00
            java.lang.Object r0 = r14.A01
            android.app.Activity r0 = (android.app.Activity) r0
            X.37D r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x0c32
            r0.A0X()
        L_0x0c32:
            r0 = -160367788(0xfffffffff670fb54, float:-1.22192264E33)
        L_0x0c35:
            X.AnonymousClass0fD.A0C(r0, r2)
            return
        L_0x0c39:
            r0 = 14366447(0xdb36ef, float:2.013168E-38)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r14.A01
            X.KQW r3 = (X.KQW) r3
            X.MtU r1 = X.JTT.A0U(r3)
            X.NUa r2 = r1.A03
            java.lang.String r1 = "RESTORE_LANDING_NUX_USE_OTC_TAP"
            X.2DR r2 = X.C66913Mex.A01(r2, r3, r1)
            X.Njy r1 = X.C69358Njy.OTC_WAIT
            X.C66581MXm.A1D(r3, r1, r2)
            r1 = -124379367(0xfffffffff8961f19, float:-2.4358602E34)
            goto L_0x0d55
        L_0x0c5a:
            r0 = -1878977945(0xffffffff90011267, float:-2.545494E-29)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r14.A01
            X.KQV r2 = (X.KQV) r2
            X.MtU r0 = X.JTT.A0T(r2)
            X.NUa r1 = r0.A03
            java.lang.String r0 = "RESTORE_LANDING_NUX_USE_OTC_TAP"
            r1.A0B(r0)
            X.0eM r0 = r2.A04
            boolean r0 = X.C66582MXn.A1Y(r0)
            if (r0 == 0) goto L_0x0c84
            X.Njy r0 = X.C69358Njy.OTC_WAIT
        L_0x0c7a:
            X.C66582MXn.A1H(r0, r2)
            r0 = 608468429(0x24447dcd, float:4.2607283E-17)
        L_0x0c80:
            X.AnonymousClass0fD.A0C(r0, r4)
            return
        L_0x0c84:
            X.Njy r0 = X.C69358Njy.OTC_ENTER_CODE
            goto L_0x0c7a
        L_0x0c87:
            r0 = 2135999595(0x7f50c46b, float:2.7749928E38)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r14.A01
            X.NUB r3 = (X.NUB) r3
            X.0eM r1 = r3.A04
            java.lang.Object r1 = r1.getValue()
            X.MtZ r1 = (X.C67720MtZ) r1
            X.NUN r2 = r1.A01
            java.lang.String r1 = "SOFT_BLOCK_3P_LEADING_SCREEN_MORE_OPTIONS_TAP"
            A01(r2, r3, r1)
            r1 = 229679188(0xdb0a054, float:1.0885435E-30)
            goto L_0x0d55
        L_0x0ca6:
            r0 = 703826939(0x29f38bfb, float:1.08156505E-13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r14.A01
            X.NUB r5 = (X.NUB) r5
            r4 = 1
            r5.A0L(r4)
            X.0eM r1 = r5.A04
            java.lang.Object r1 = r1.getValue()
            X.MtZ r1 = (X.C67720MtZ) r1
            X.NUN r3 = r1.A01
            java.lang.String r2 = "SETUP_TYPE"
            java.lang.String r1 = "GDRIVE"
            r3.A0D(r2, r1)
            java.lang.String r1 = "SOFT_BLOCK_3P_LEADING_SCREEN_CONTINUE_WITH_GOOGLE_TAP"
            r3.A0B(r1)
            java.lang.String r1 = "GDRIVE_LAUNCH_AUTH"
            r3.A0B(r1)
            r5.A0M(r4)
            r1 = -2027636069(0xffffffff8724ba9b, float:-1.2392827E-34)
            goto L_0x0d55
        L_0x0cd7:
            r0 = 809196731(0x303b5cbb, float:6.816198E-10)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r14.A01
            X.NUA r3 = (X.NUA) r3
            X.0eM r1 = r3.A03
            java.lang.Object r1 = r1.getValue()
            X.Mtc r1 = (X.C67723Mtc) r1
            X.NUN r2 = r1.A01
            java.lang.String r1 = "HARD_BLOCK_3P_LEADING_SCREEN_MORE_OPTIONS_TAP"
            A01(r2, r3, r1)
            r1 = 162788804(0x9b3f5c4, float:4.33238E-33)
            goto L_0x0d55
        L_0x0cf5:
            r0 = 353846689(0x151745a1, float:3.0549135E-26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r14.A01
            X.NUA r5 = (X.NUA) r5
            r4 = 1
            r5.A0L(r4)
            X.0eM r1 = r5.A03
            java.lang.Object r1 = r1.getValue()
            X.Mtc r1 = (X.C67723Mtc) r1
            X.NUN r3 = r1.A01
            java.lang.String r2 = "SETUP_TYPE"
            java.lang.String r1 = "GDRIVE"
            r3.A0D(r2, r1)
            java.lang.String r1 = "HARD_BLOCK_3P_LEADING_SCREEN_CONTINUE_WITH_GOOGLE_TAP"
            r3.A0B(r1)
            java.lang.String r1 = "GDRIVE_LAUNCH_AUTH"
            r3.A0B(r1)
            r5.A0M(r4)
            r1 = 1908723757(0x71c4d02d, float:1.9491434E30)
            goto L_0x0d55
        L_0x0d26:
            r0 = -976228318(0xffffffffc5cff022, float:-6654.0166)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r14.A01
            X.N5Y r1 = (X.N5Y) r1
            X.0sP r2 = r1.A01
            X.Njy r1 = r1.A00
            r2.invoke(r1)
            r1 = -1898395759(0xffffffff8ed8c791, float:-5.3440287E-30)
            goto L_0x0d55
        L_0x0d3c:
            r0 = 1360092168(0x51115c08, float:3.9019643E10)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r14.A01
            X.NgT r1 = (X.C69180NgT) r1
            X.Mu9 r1 = X.C66583MXo.A0S(r1)
            X.OyT r2 = r1.A07
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y
            r2.A05(r1)
            r1 = -178136812(0xfffffffff561d914, float:-2.862963E32)
        L_0x0d55:
            X.AnonymousClass0fD.A0C(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71407Ok6.onClick(android.view.View):void");
    }

    public static void A01(C66913Mex mex, NJT njt, String str) {
        mex.A0B(str);
        OYI.A00(njt.A0D()).CqZ(new Bundle(), njt, C69358Njy.OPTIONS);
    }
}
