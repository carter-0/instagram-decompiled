package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.user.model.User;

public final class WBG implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public WBG(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public static void A01(View view, int i, Object obj, Object obj2) {
        AnonymousClass0fU.A00(new WBG(i, obj, obj2), view);
    }

    public static void A02(Fragment fragment, C46498Dg1 dg1, 0rm r4, int i, int i2) {
        dg1.A04(new WBG(i, fragment, r4), i2);
        C49945FFy fFy = new C49945FFy(dg1);
        r4.A00 = fFy;
        fFy.A03(fragment.requireActivity());
    }

    public static void A03(WBG wbg) {
        C49945FFy fFy = (C49945FFy) ((0rm) wbg.A01).A00;
        if (fFy != null) {
            fFy.A02();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x03fd, code lost:
        if (r3 == null) goto L_0x03ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x0cd7, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x0cde, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        X.AnonymousClass0fD.A0C(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r17) {
        /*
            r16 = this;
            r1 = r16
            int r0 = r1.A00
            r3 = r17
            switch(r0) {
                case 0: goto L_0x0f18;
                case 1: goto L_0x0ee2;
                case 2: goto L_0x0ec7;
                case 3: goto L_0x0eac;
                case 4: goto L_0x0dbd;
                case 5: goto L_0x0d85;
                case 6: goto L_0x0d5f;
                case 7: goto L_0x0d42;
                case 8: goto L_0x0d29;
                case 9: goto L_0x0c8d;
                case 10: goto L_0x0c76;
                case 11: goto L_0x0cab;
                case 12: goto L_0x0c5f;
                case 13: goto L_0x0c48;
                case 14: goto L_0x0bde;
                case 15: goto L_0x0bc7;
                case 16: goto L_0x0bb0;
                case 17: goto L_0x0ba4;
                case 18: goto L_0x0b98;
                case 19: goto L_0x0b8c;
                case 20: goto L_0x0b80;
                case 21: goto L_0x0ae9;
                case 22: goto L_0x0a75;
                case 23: goto L_0x0a5e;
                case 24: goto L_0x0a2c;
                case 25: goto L_0x09e7;
                case 26: goto L_0x09ac;
                case 27: goto L_0x0999;
                case 28: goto L_0x098d;
                case 29: goto L_0x096d;
                case 30: goto L_0x094d;
                case 31: goto L_0x0924;
                case 32: goto L_0x08e9;
                case 33: goto L_0x08bf;
                case 34: goto L_0x088e;
                case 35: goto L_0x0871;
                case 36: goto L_0x0836;
                case 37: goto L_0x07fc;
                case 38: goto L_0x07c9;
                case 39: goto L_0x07b0;
                case 40: goto L_0x0795;
                case 41: goto L_0x0773;
                case 42: goto L_0x0748;
                case 43: goto L_0x06a6;
                case 44: goto L_0x0678;
                case 45: goto L_0x0618;
                case 46: goto L_0x05ed;
                case 47: goto L_0x055b;
                case 48: goto L_0x052a;
                case 49: goto L_0x046f;
                case 50: goto L_0x0425;
                case 51: goto L_0x0368;
                case 52: goto L_0x0349;
                case 53: goto L_0x032a;
                case 54: goto L_0x02bc;
                case 55: goto L_0x0290;
                case 56: goto L_0x025e;
                case 57: goto L_0x020d;
                case 58: goto L_0x01e1;
                case 59: goto L_0x01b7;
                case 60: goto L_0x0186;
                case 61: goto L_0x00fd;
                case 62: goto L_0x0f61;
                case 63: goto L_0x00c0;
                case 64: goto L_0x008e;
                case 65: goto L_0x0074;
                case 66: goto L_0x005e;
                case 67: goto L_0x0048;
                case 68: goto L_0x0032;
                case 69: goto L_0x0020;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = -792291592(0xffffffffd0c696f8, float:-2.66542612E10)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A02
            android.content.Context r1 = (android.content.Context) r1
            android.app.Activity r1 = (android.app.Activity) r1
            r1.onBackPressed()
            r1 = 1417230763(0x547939ab, float:4.28165746E12)
        L_0x001c:
            X.AnonymousClass0fD.A0C(r1, r0)
            return
        L_0x0020:
            r0 = -109896863(0xfffffffff9731b61, float:-7.8892715E34)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A02
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r1.run()
            r1 = -928044795(0xffffffffc8af2905, float:-358728.16)
            goto L_0x001c
        L_0x0032:
            r0 = 1784351318(0x6a5b0a56, float:6.620089E25)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.2qI r2 = (X.C230802qI) r2
            java.lang.Object r1 = r1.A02
            X.4gd r1 = (X.C270374gd) r1
            r2.DR3(r1)
            r1 = -92083683(0xfffffffffa82ea1d, float:-3.398735E35)
            goto L_0x001c
        L_0x0048:
            r0 = 1845672889(0x6e02bbb9, float:1.0114999E28)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.2qI r2 = (X.C230802qI) r2
            java.lang.Object r1 = r1.A02
            X.4gd r1 = (X.C270374gd) r1
            r2.DR3(r1)
            r1 = 96666833(0x5c304d1, float:1.8339481E-35)
            goto L_0x001c
        L_0x005e:
            r0 = 762967955(0x2d79f793, float:1.4208984E-11)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.2qI r2 = (X.C230802qI) r2
            java.lang.Object r1 = r1.A02
            X.4gd r1 = (X.C270374gd) r1
            r2.DR2(r1)
            r1 = -1138351734(0xffffffffbc26218a, float:-0.010139832)
            goto L_0x001c
        L_0x0074:
            r0 = -142600295(0xfffffffff7801799, float:-5.196036E33)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.VvG r2 = (X.C18623VvG) r2
            boolean r2 = r2.A01
            if (r2 == 0) goto L_0x008a
            java.lang.Object r1 = r1.A02
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r1.onClick(r3)
        L_0x008a:
            r1 = 1934071395(0x73479663, float:1.5812947E31)
            goto L_0x001c
        L_0x008e:
            r0 = 615274412(0x24ac57ac, float:7.474163E-17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.VOP r3 = (X.VOP) r3
            if (r3 == 0) goto L_0x00bb
            java.lang.Object r2 = r1.A02
            com.instagram.model.venue.Venue r2 = (com.instagram.model.venue.Venue) r2
            X.Ub9 r6 = r3.A00
            android.content.Context r5 = r6.requireContext()
            java.lang.Double r1 = r2.A00()
            double r3 = r1.doubleValue()
            java.lang.Double r1 = r2.A01()
            double r1 = r1.doubleValue()
            X.FFS.A01(r5, r3, r1)
            X.C15357Ub9.A01(r6)
        L_0x00bb:
            r1 = 1444718156(0x561ca64c, float:4.3059513E13)
            goto L_0x001c
        L_0x00c0:
            r0 = -1778436335(0xffffffff95ff3711, float:-1.0308056E-25)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.ERr r4 = (X.C48028ERr) r4
            X.Eu7 r3 = r4.A00
            if (r3 == 0) goto L_0x00f5
            java.lang.Object r1 = r1.A02
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.Object r2 = r1.second
            X.0xF r6 = new X.0xF
            r6.<init>()
            java.lang.String r1 = "report"
            X.0xF.A00(r6, r2, r1)
            X.Ubm r1 = r3.A00
            X.W05 r5 = X.C15387Ubm.A01(r1)
            java.lang.String r11 = r1.A06
            java.lang.String r12 = r1.A05
            java.lang.String r8 = "information_page"
            java.lang.String r9 = "tap_component"
            java.lang.String r10 = "report_location"
            r7 = 0
            r13 = r7
            r14 = r7
            r5.A02(r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x00f5:
            X.DbT.A1J(r4)
            r1 = 1148467646(0x447439be, float:976.9022)
            goto L_0x001c
        L_0x00fd:
            r0 = 345957125(0x149ee305, float:1.6043466E-26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.UaD r2 = (X.C15306UaD) r2
            java.lang.Object r3 = r1.A01
            X.Uy3 r3 = (X.C16607Uy3) r3
            X.0eM r1 = r2.A07
            X.U8y r1 = X.C13990Tnq.A0T(r1)
            X.2Fk r1 = r1.A00
            java.lang.Object r1 = r1.A02()
            r11 = 1
            r5 = 0
            boolean r1 = X.AnonymousClass7TF.A1Y(r1, r11)
            if (r1 != 0) goto L_0x0181
            int r1 = r3.ordinal()
            if (r1 != r5) goto L_0x0181
            X.0eM r4 = r2.A08
            X.U8Z r3 = X.C13990Tnq.A0U(r4)
            X.Vfp r1 = r3.A03
            java.lang.String r6 = r3.A06
            X.0qQ.A0B(r6, r5)
            X.XB6 r5 = r1.A00
            java.lang.String r3 = "lead_gen_one_tap_setup"
            java.lang.String r1 = "standard_form_preview_button_click"
            X.XB6.A01(r5, r6, r3, r1)
            android.content.res.Resources r3 = X.JTR.A0R(r2)
            X.U8Z r1 = X.C13990Tnq.A0U(r4)
            com.instagram.leadgen.organic.model.LeadGenFormData r1 = r1.A05
            java.util.ArrayList r10 = X.W3L.A04(r3, r1)
            X.F3v r5 = X.DbU.A0R()
            X.U8Z r1 = X.C13990Tnq.A0U(r4)
            com.instagram.leadgen.organic.model.LeadGenFormData r1 = r1.A05
            java.lang.String r8 = r1.A05
            X.U8Z r1 = X.C13990Tnq.A0U(r4)
            com.instagram.leadgen.organic.model.LeadGenFormData r1 = r1.A05
            com.instagram.common.typedurl.ImageUrl r7 = r1.A00
            X.U8Z r1 = X.C13990Tnq.A0U(r4)
            com.instagram.leadgen.organic.model.LeadGenFormData r1 = r1.A05
            X.Uxw r1 = r1.A01
            java.lang.String r9 = X.C13989Tnp.A0s(r1)
            X.U8Z r1 = X.C13990Tnq.A0U(r4)
            com.instagram.common.session.UserSession r6 = r1.A02
            androidx.fragment.app.Fragment r3 = r5.A01(r6, r7, r8, r9, r10, r11)
            androidx.fragment.app.FragmentActivity r2 = r2.requireActivity()
            X.U8Z r1 = X.C13990Tnq.A0U(r4)
            com.instagram.common.session.UserSession r1 = r1.A02
            X.DbY.A14(r3, r2, r1)
        L_0x0181:
            r1 = -1280477793(0xffffffffb3ad759f, float:-8.0773354E-8)
            goto L_0x001c
        L_0x0186:
            r0 = 966689320(0x399e8228, float:3.0233082E-4)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.UaD r2 = (X.C15306UaD) r2
            X.0eM r2 = r2.A08
            X.U8Z r7 = X.C13990Tnq.A0U(r2)
            X.Vfp r2 = r7.A03
            java.lang.String r6 = r7.A06
            r5 = 0
            X.0qQ.A0B(r6, r5)
            X.XB6 r4 = r2.A00
            java.lang.String r3 = "lead_gen_one_tap_setup"
            java.lang.String r2 = "one_tap_bottom_banner_close"
            X.XB6.A01(r4, r6, r3, r2)
            X.05G r2 = r7.A08
            X.AnonymousClass7TF.A1O(r2, r5)
            java.lang.Object r1 = r1.A01
            X.C51969G9p.A1M(r1)
            r1 = -802334931(0xffffffffd02d572d, float:-1.16326861E10)
            goto L_0x001c
        L_0x01b7:
            r0 = 1348815567(0x50654acf, float:1.53875405E10)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.UaL r2 = (X.C15314UaL) r2
            X.0eM r2 = r2.A0G
            X.U8b r2 = X.C13990Tnq.A0S(r2)
            X.WYY r6 = r2.A0C
            java.lang.String r5 = r2.A00
            boolean r4 = r2.A03
            r2 = 0
            X.0qQ.A0B(r5, r2)
            java.lang.String r3 = "discard_confirmation_dialog_stay_button"
            java.lang.String r2 = "click"
            X.WYY.A01(r6, r3, r2, r5, r4)
            A03(r1)
            r1 = 507360655(0x1e3db58f, float:1.0043122E-20)
            goto L_0x001c
        L_0x01e1:
            r0 = 405359356(0x18294afc, float:2.1880595E-24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A02
            X.UnE r4 = (X.C16025UnE) r4
            boolean r3 = r4.A01
            java.lang.Object r2 = r1.A01
            X.Vl6 r2 = (X.C18077Vl6) r2
            if (r3 != 0) goto L_0x0208
            r2.A01()
            androidx.core.widget.NestedScrollView r2 = r4.A05
            if (r2 == 0) goto L_0x0203
            X.Wk2 r1 = new X.Wk2
            r1.<init>(r4)
            r2.post(r1)
        L_0x0203:
            r1 = 1547649545(0x5c3f4209, float:2.15337308E17)
            goto L_0x001c
        L_0x0208:
            r1 = 1
            r2.A06(r1)
            goto L_0x0203
        L_0x020d:
            r0 = -1552457190(0xffffffffa377621a, float:-1.3410671E-17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A02
            X.UnL r5 = (X.C16032UnL) r5
            java.lang.Object r4 = r1.A01
            X.Vl6 r4 = (X.C18077Vl6) r4
            int r1 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            com.instagram.leadgen.core.ui.LeadGenFormShortAnswerQuestionView r3 = r5.A03
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r2 = r3.A00
            r1 = 0
            if (r2 == 0) goto L_0x0236
            boolean r1 = r3.A0H(r2, r1)
            if (r1 != 0) goto L_0x0245
            java.lang.String r1 = r2.A00
            boolean r1 = X.00l.A0W(r1)
            if (r1 == 0) goto L_0x0241
            r4.A02(r2)
        L_0x0236:
            r4.A00()
            r3.A0E()
        L_0x023c:
            r1 = -787121393(0xffffffffd1157b0f, float:-4.0125919E10)
            goto L_0x001c
        L_0x0241:
            r4.A03(r2)
            goto L_0x0236
        L_0x0245:
            boolean r1 = r5.A01
            if (r1 != 0) goto L_0x0259
            r4.A01()
            androidx.core.widget.NestedScrollView r2 = r5.A05
            if (r2 == 0) goto L_0x023c
            X.Wk1 r1 = new X.Wk1
            r1.<init>(r5)
            r2.post(r1)
            goto L_0x023c
        L_0x0259:
            r1 = 1
            r4.A06(r1)
            goto L_0x023c
        L_0x025e:
            r0 = 498564820(0x1db77ed4, float:4.8570834E-21)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.Vl6 r2 = (X.C18077Vl6) r2
            java.lang.Object r1 = r1.A02
            com.instagram.leadgen.core.model.disqualifyingscreen.LeadGenDisqualifyingScreenData r1 = (com.instagram.leadgen.core.model.disqualifyingscreen.LeadGenDisqualifyingScreenData) r1
            java.lang.String r7 = r1.A03
            X.Umf r6 = r2.A00
            X.VsB r1 = X.C16039UnS.A00(r6)
            X.XB6 r5 = r1.A00
            java.lang.String r4 = r1.A01
            java.lang.String r2 = r1.A02
            java.lang.String r1 = "form_id"
            android.os.Bundle r3 = X.DbY.A0B(r1, r2)
            java.lang.String r2 = "lead_gen_conditional_question_disqualifying_screen"
            java.lang.String r1 = "disqualifying_screen_cta_click"
            X.XB6.A00(r3, r5, r4, r2, r1)
            r6.A09(r7)
            r1 = 1146893470(0x445c349e, float:880.82214)
            goto L_0x001c
        L_0x0290:
            r0 = -609022663(0xffffffffdbb30d39, float:-1.00797119E17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A02
            X.UnM r4 = (X.C16033UnM) r4
            boolean r3 = r4.A01
            java.lang.Object r2 = r1.A01
            X.Vl6 r2 = (X.C18077Vl6) r2
            if (r3 != 0) goto L_0x02b7
            r2.A01()
            androidx.core.widget.NestedScrollView r2 = r4.A05
            if (r2 == 0) goto L_0x02b2
            X.Wk0 r1 = new X.Wk0
            r1.<init>(r4)
            r2.post(r1)
        L_0x02b2:
            r1 = -2000579329(0xffffffff88c194ff, float:-1.1650794E-33)
            goto L_0x001c
        L_0x02b7:
            r1 = 1
            r2.A06(r1)
            goto L_0x02b2
        L_0x02bc:
            r0 = 814073409(0x3085c641, float:9.733371E-10)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A02
            X.UnK r6 = (X.C16031UnK) r6
            java.lang.Object r7 = r1.A01
            X.Vl6 r7 = (X.C18077Vl6) r7
            int r1 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            com.instagram.common.ui.base.IgLinearLayout r1 = r6.A00
            X.0kx r5 = new X.0kx
            r5.<init>(r1)
            r4 = 0
        L_0x02d5:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0307
            java.lang.Object r3 = r5.next()
            android.view.View r3 = (android.view.View) r3
            boolean r1 = r3 instanceof X.C14746U6n
            if (r1 == 0) goto L_0x02d5
            X.U6n r3 = (X.C14746U6n) r3
            if (r3 == 0) goto L_0x02d5
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r2 = r3.A00
            if (r2 == 0) goto L_0x02d5
            r1 = 0
            boolean r1 = r3.A0H(r2, r1)
            if (r1 != 0) goto L_0x02d5
            if (r4 != 0) goto L_0x02f7
            r4 = r3
        L_0x02f7:
            java.lang.String r1 = r2.A00
            boolean r1 = X.00l.A0W(r1)
            if (r1 == 0) goto L_0x0303
            r7.A02(r2)
            goto L_0x02d5
        L_0x0303:
            r7.A03(r2)
            goto L_0x02d5
        L_0x0307:
            if (r4 == 0) goto L_0x0311
            r4.A0E()
        L_0x030c:
            r1 = 105368490(0x647cbaa, float:3.757737E-35)
            goto L_0x001c
        L_0x0311:
            boolean r1 = r6.A01
            if (r1 != 0) goto L_0x0325
            r7.A01()
            androidx.core.widget.NestedScrollView r2 = r6.A05
            if (r2 == 0) goto L_0x030c
            X.Wjz r1 = new X.Wjz
            r1.<init>(r6)
            r2.post(r1)
            goto L_0x030c
        L_0x0325:
            r1 = 1
            r7.A06(r1)
            goto L_0x030c
        L_0x032a:
            r0 = 1208818529(0x480d1b61, float:144493.52)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.Vfq r2 = (X.C17779Vfq) r2
            java.lang.Object r1 = r1.A02
            X.Jvy r1 = (X.C61060Jvy) r1
            java.lang.Object r1 = r1.A01
            X.X4H r1 = (X.X4H) r1
            X.UwN r1 = r1.CAZ()
            r2.A00(r1)
            r1 = -1988018544(0xffffffff89813e90, float:-3.1114454E-33)
            goto L_0x001c
        L_0x0349:
            r0 = -1537362674(0xffffffffa45db50e, float:-4.8075095E-17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.Vfq r2 = (X.C17779Vfq) r2
            java.lang.Object r1 = r1.A02
            X.Jvy r1 = (X.C61060Jvy) r1
            java.lang.Object r1 = r1.A01
            X.X4H r1 = (X.X4H) r1
            X.UwN r1 = r1.CAZ()
            r2.A00(r1)
            r1 = 371877783(0x162a6797, float:1.3765178E-25)
            goto L_0x001c
        L_0x0368:
            r0 = 464660703(0x1bb228df, float:2.9474042E-22)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A02
            X.Umd r6 = (X.C15996Umd) r6
            X.U8P r1 = r6.A07()
            X.UnR r1 = (X.C16038UnR) r1
            X.VsC r2 = r1.A06
            X.U8P r1 = r6.A07()
            X.UnR r1 = (X.C16038UnR) r1
            boolean r1 = r1.A00
            X.XB6 r5 = r2.A00
            java.lang.String r4 = r2.A01
            if (r1 == 0) goto L_0x0421
            java.lang.String r3 = "lead_gen_thank_you_screen_with_call_button"
        L_0x038b:
            java.lang.String r1 = r2.A02
            android.os.Bundle r2 = X.C18463VsC.A00(r1)
            java.lang.String r1 = "consumer_thank_you_screen_cta_click"
            X.XB6.A00(r2, r5, r4, r3, r1)
            boolean r1 = r6 instanceof X.C16011Ums
            if (r1 == 0) goto L_0x03cf
            X.Ums r6 = (X.C16011Ums) r6
            android.os.Bundle r2 = r6.requireArguments()
            java.lang.String r1 = "mediaID"
            java.lang.String r10 = X.C320236s2.A01(r2, r1)
            X.0eM r2 = r6.A09
            java.lang.Object r1 = r2.getValue()
            X.UnR r1 = (X.C16038UnR) r1
            X.D9d r9 = X.C16038UnR.A00(r1)
            android.app.Activity r4 = r6.getRootActivity()
            if (r4 == 0) goto L_0x03ca
            X.Vze r3 = X.C18744Vze.A00
            java.lang.Object r1 = r2.getValue()
            X.UnR r1 = (X.C16038UnR) r1
            com.instagram.common.session.UserSession r7 = r1.A04
            android.os.Bundle r5 = r6.requireArguments()
            r8 = r6
            r3.A01(r4, r5, r6, r7, r8, r9, r10)
        L_0x03ca:
            r1 = 2091747001(0x7cad86b9, float:7.207999E36)
            goto L_0x001c
        L_0x03cf:
            X.Umr r6 = (X.C16010Umr) r6
            android.os.Bundle r2 = r6.requireArguments()
            java.lang.String r1 = "mediaID"
            java.lang.String r14 = X.C320236s2.A01(r2, r1)
            X.0eM r3 = r6.A00
            java.lang.Object r1 = r3.getValue()
            X.UnR r1 = (X.C16038UnR) r1
            X.D9d r13 = X.C16038UnR.A00(r1)
            android.os.Bundle r2 = r6.requireArguments()
            java.lang.String r1 = "is_form_extension"
            boolean r1 = r2.getBoolean(r1)
            if (r1 == 0) goto L_0x0409
            java.lang.String r3 = r13.A05
            java.lang.String r1 = r13.A00
            android.content.Context r2 = r6.requireContext()
            if (r1 != 0) goto L_0x0400
            if (r3 != 0) goto L_0x0401
            goto L_0x03ca
        L_0x0400:
            r3 = r1
        L_0x0401:
            android.net.Uri r1 = X.DbT.A09(r3)
            X.0kR.A0F(r2, r1)
            goto L_0x03ca
        L_0x0409:
            X.Vze r7 = X.C18744Vze.A00
            android.app.Activity r8 = X.DbT.A03(r6)
            java.lang.Object r1 = r3.getValue()
            X.UnR r1 = (X.C16038UnR) r1
            com.instagram.common.session.UserSession r11 = r1.A04
            android.os.Bundle r9 = r6.requireArguments()
            r10 = r6
            r12 = r6
            r7.A01(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x03ca
        L_0x0421:
            java.lang.String r3 = "lead_gen_thank_you_screen"
            goto L_0x038b
        L_0x0425:
            r0 = -456991402(0xffffffffe4c2dd56, float:-2.8756938E22)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.UZ6 r2 = (X.UZ6) r2
            X.0eM r2 = r2.A02
            java.lang.Object r3 = r2.getValue()
            X.U8k r3 = (X.C14774U8k) r3
            java.lang.Object r1 = r1.A01
            com.instagram.leadgen.core.model.LeadGenTrustSignal r1 = (com.instagram.leadgen.core.model.LeadGenTrustSignal) r1
            X.Uy7 r2 = r1.A01
            r1 = 0
            X.0qQ.A0B(r2, r1)
            X.VSo r1 = r3.A01
            if (r1 == 0) goto L_0x046a
            java.lang.String r6 = r3.A02
            X.XB6 r5 = r1.A00
            java.lang.String r4 = r1.A01
            java.lang.String r2 = r2.toString()
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            if (r6 == 0) goto L_0x045c
            java.lang.String r1 = "question_type"
            r3.putString(r1, r6)
        L_0x045c:
            if (r2 == 0) goto L_0x0463
            java.lang.String r1 = "pii_question_type"
            r3.putString(r1, r2)
        L_0x0463:
            java.lang.String r2 = "lead_gen_business_profile_content"
            java.lang.String r1 = "business_profile_bottom_sheet_item_click"
            X.XB6.A00(r3, r5, r4, r2, r1)
        L_0x046a:
            r1 = -1128446845(0xffffffffbcbd4483, float:-0.023103958)
            goto L_0x001c
        L_0x046f:
            r0 = -404603314(0xffffffffe7e23e4e, float:-2.1368083E24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A02
            X.UaG r4 = (X.C15309UaG) r4
            java.lang.Object r2 = r1.A01
            X.Uy3 r2 = (X.C16607Uy3) r2
            X.U8w r1 = r4.A01()
            X.2Fk r1 = r1.A00
            java.lang.Object r1 = r1.A02()
            X.Jvy r1 = (X.C61060Jvy) r1
            r12 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0497
            boolean r1 = r1.A03
            if (r1 != r12) goto L_0x0497
        L_0x0492:
            r1 = -956705732(0xffffffffc6f9d43c, float:-31978.117)
            goto L_0x001c
        L_0x0497:
            int r1 = r2.ordinal()
            if (r1 != r3) goto L_0x0492
            X.U8d r2 = r4.A02()
            X.Vfp r1 = r2.A02
            java.lang.String r5 = r2.A00()
            X.0qQ.A0B(r5, r3)
            X.XB6 r3 = r1.A00
            java.lang.String r2 = "lead_gen_one_tap_setup"
            java.lang.String r1 = "standard_form_preview_button_click"
            X.XB6.A01(r3, r5, r2, r1)
            boolean r1 = r4 instanceof X.C16009Umq
            if (r1 == 0) goto L_0x050d
            X.Umq r4 = (X.C16009Umq) r4
            android.content.res.Resources r2 = X.JTR.A0R(r4)
            X.0eM r5 = r4.A01
            java.lang.Object r1 = r5.getValue()
            X.Uno r1 = (X.C16061Uno) r1
            com.instagram.leadgen.organic.model.LeadGenFormData r1 = r1.A02
            java.util.ArrayList r11 = X.W3L.A04(r2, r1)
            X.F3v r6 = X.DbU.A0R()
            java.lang.Object r1 = r5.getValue()
            X.Uno r1 = (X.C16061Uno) r1
            com.instagram.leadgen.organic.model.LeadGenFormData r1 = r1.A02
            java.lang.String r9 = r1.A05
            java.lang.Object r1 = r5.getValue()
            X.Uno r1 = (X.C16061Uno) r1
            com.instagram.leadgen.organic.model.LeadGenFormData r1 = r1.A02
            com.instagram.common.typedurl.ImageUrl r8 = r1.A00
            java.lang.Object r1 = r5.getValue()
            X.Uno r1 = (X.C16061Uno) r1
            com.instagram.leadgen.organic.model.LeadGenFormData r1 = r1.A02
            X.Uxw r1 = r1.A01
            java.lang.String r10 = X.C13989Tnp.A0s(r1)
            java.lang.Object r1 = r5.getValue()
            X.Uno r1 = (X.C16061Uno) r1
            com.instagram.common.session.UserSession r7 = r1.A00
            androidx.fragment.app.Fragment r3 = r6.A01(r7, r8, r9, r10, r11, r12)
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            java.lang.Object r1 = r5.getValue()
            X.Uno r1 = (X.C16061Uno) r1
            com.instagram.common.session.UserSession r1 = r1.A00
            X.DbY.A14(r3, r2, r1)
            goto L_0x0492
        L_0x050d:
            X.Ump r4 = (X.C16008Ump) r4
            X.Vl8 r1 = X.C13990Tnq.A0N()
            X.Umm r3 = r1.A04(r12, r12)
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            X.0eM r1 = r4.A01
            java.lang.Object r1 = r1.getValue()
            X.Unp r1 = (X.C16062Unp) r1
            com.instagram.common.session.UserSession r1 = r1.A02
            X.DbY.A14(r3, r2, r1)
            goto L_0x0492
        L_0x052a:
            r0 = -486747030(0xffffffffe2fcd46a, float:-2.3319428E21)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.UaG r2 = (X.C15309UaG) r2
            X.U8d r7 = r2.A02()
            X.Vfp r2 = r7.A02
            java.lang.String r6 = r7.A00()
            r5 = 0
            X.0qQ.A0B(r6, r5)
            X.XB6 r4 = r2.A00
            java.lang.String r3 = "lead_gen_one_tap_setup"
            java.lang.String r2 = "one_tap_bottom_banner_close"
            X.XB6.A01(r4, r6, r3, r2)
            X.05G r2 = r7.A04
            X.AnonymousClass7TF.A1O(r2, r5)
            java.lang.Object r1 = r1.A01
            X.C51969G9p.A1M(r1)
            r1 = -1793118009(0xffffffff951f30c7, float:-3.2148273E-26)
            goto L_0x001c
        L_0x055b:
            r0 = -2007470103(0xffffffff88586fe9, float:-6.5131685E-34)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.UZ0 r4 = (X.UZ0) r4
            X.0eM r9 = r4.A06
            java.lang.Object r2 = r9.getValue()
            X.U8m r2 = (X.C14776U8m) r2
            X.05G r2 = r2.A07
            java.util.List r2 = X.JTO.A16(r2)
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x059f
            java.lang.Object r1 = r1.A02
            X.UYh r1 = (X.C15267UYh) r1
            X.VsB r1 = X.C16039UnS.A00(r1)
            X.XB6 r5 = r1.A00
            java.lang.String r7 = r1.A01
            java.lang.String r2 = r1.A02
            java.lang.String r1 = "form_id"
            android.os.Bundle r6 = X.DbY.A0B(r1, r2)
            java.lang.String r8 = "lead_gen_multi_step_consumer_questions"
            java.lang.String r9 = "privacy_policy_bottom_sheet_custom_disclaimer_required_error"
            java.lang.String r10 = "impression"
            r5.Cgq(r6, r7, r8, r9, r10)
            r4.A01()
        L_0x059a:
            r1 = -162241907(0xfffffffff654628d, float:-1.0769197E33)
            goto L_0x001c
        L_0x059f:
            java.lang.Object r2 = r9.getValue()
            X.U8m r2 = (X.C14776U8m) r2
            boolean r8 = r2.A00
            java.lang.Object r7 = r1.A02
            X.Umf r7 = (X.C15998Umf) r7
            X.VsB r1 = X.C16039UnS.A00(r7)
            X.XB6 r6 = r1.A00
            java.lang.String r5 = r1.A01
            java.lang.String r2 = r1.A02
            java.lang.String r1 = "form_id"
            android.os.Bundle r3 = X.DbY.A0B(r1, r2)
            java.lang.String r2 = "lead_gen_multi_step_consumer_questions"
            if (r8 != 0) goto L_0x05da
            java.lang.String r1 = "privacy_policy_bottom_sheet_scroll_to_bottom_for_privacy_view"
            X.XB6.A00(r3, r6, r5, r2, r1)
            androidx.core.widget.NestedScrollView r2 = r4.A01
            if (r2 == 0) goto L_0x05d0
            X.Wjy r1 = new X.Wjy
            r1.<init>(r4)
            r2.post(r1)
        L_0x05d0:
            java.lang.Object r2 = r9.getValue()
            X.U8m r2 = (X.C14776U8m) r2
            r1 = 1
            r2.A00 = r1
            goto L_0x059a
        L_0x05da:
            java.lang.String r1 = "privacy_policy_bottom_sheet_submit_click"
            X.XB6.A00(r3, r6, r5, r2, r1)
            java.util.List r1 = r4.A00()
            X.C15998Umf.A05(r7, r1)
            r1 = 1
            r7.A06 = r1
            X.DbZ.A17(r7)
            goto L_0x059a
        L_0x05ed:
            r0 = 386140314(0x1704089a, float:4.2662357E-25)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.Umf r2 = (X.C15998Umf) r2
            X.VsB r4 = X.C16039UnS.A00(r2)
            java.lang.String r3 = X.C15998Umf.A02(r2)
            X.XB6 r6 = r4.A00
            java.lang.String r5 = r4.A01
            r2 = 0
            android.os.Bundle r4 = X.C18462VsB.A00(r4, r3, r2)
            java.lang.String r3 = "lead_gen_multi_step_consumer_questions"
            java.lang.String r2 = "discard_confirmation_dialog_stay_button"
            X.XB6.A00(r4, r6, r5, r3, r2)
            A03(r1)
            r1 = 1166349770(0x458515ca, float:4258.7236)
            goto L_0x001c
        L_0x0618:
            r0 = 501702754(0x1de76062, float:6.124485E-21)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A02
            X.Umf r4 = (X.C15998Umf) r4
            X.VsB r3 = X.C16039UnS.A00(r4)
            java.lang.String r2 = X.C15998Umf.A02(r4)
            r5 = 0
            X.XB6 r7 = r3.A00
            java.lang.String r9 = r3.A01
            r6 = 0
            android.os.Bundle r8 = X.C18462VsB.A00(r3, r2, r6)
            java.lang.String r10 = "lead_gen_multi_step_consumer_questions"
            java.lang.String r11 = "discard_confirmation_dialog_leave_button"
            java.lang.String r12 = "click"
            r7.Cgq(r8, r9, r10, r11, r12)
            X.VsB r3 = X.C16039UnS.A00(r4)
            java.lang.String r2 = X.C15998Umf.A02(r4)
            X.XB6 r7 = r3.A00
            java.lang.String r9 = r3.A01
            android.os.Bundle r8 = X.C18462VsB.A00(r3, r2, r6)
            java.lang.String r11 = "form_close"
            r7.Cgq(r8, r9, r10, r11, r12)
            X.UnS r2 = X.C13990Tnq.A0R(r4)
            boolean r3 = r2.A0g
            com.instagram.common.session.UserSession r2 = r2.A0H
            boolean r2 = X.C18215Vnf.A01(r2, r3, r5)
            if (r2 == 0) goto L_0x066c
            X.UnS r3 = X.C13990Tnq.A0R(r4)
            java.lang.String r2 = X.C15998Umf.A02(r4)
            r3.A05(r2)
        L_0x066c:
            r2 = 1
            r4.A0A(r2)
            A03(r1)
            r1 = -552030789(0xffffffffdf18adbb, float:-1.1001655E19)
            goto L_0x001c
        L_0x0678:
            r0 = -1016079279(0xffffffffc36fdc51, float:-239.86061)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.UaK r2 = (X.C15313UaK) r2
            X.U8j r3 = r2.A04()
            boolean r2 = r3 instanceof X.C16058Unl
            if (r2 != 0) goto L_0x069e
            boolean r2 = r3 instanceof X.C16057Unk
            if (r2 == 0) goto L_0x069e
            X.Unk r3 = (X.C16057Unk) r3
            X.WYY r6 = r3.A04
            java.lang.String r5 = r3.A00
            boolean r4 = r3.A00
            java.lang.String r3 = "discard_confirmation_dialog_stay_button"
            java.lang.String r2 = "click"
            X.WYY.A01(r6, r3, r2, r5, r4)
        L_0x069e:
            A03(r1)
            r1 = 940818004(0x3813be54, float:3.5224788E-5)
            goto L_0x001c
        L_0x06a6:
            r0 = -350049721(0xffffffffeb22aa47, float:-1.966501E26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.UZ0 r5 = (X.UZ0) r5
            X.0eM r3 = r5.A06
            java.lang.Object r2 = r3.getValue()
            X.U8m r2 = (X.C14776U8m) r2
            X.05G r2 = r2.A07
            java.util.List r2 = X.JTO.A16(r2)
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x06d4
            java.lang.Object r1 = r1.A02
            X.UaK r1 = (X.C15313UaK) r1
            r1.A04()
            r5.A01()
        L_0x06cf:
            r1 = -1249730643(0xffffffffb5829fad, float:-9.732227E-7)
            goto L_0x001c
        L_0x06d4:
            java.lang.Object r2 = r3.getValue()
            X.U8m r2 = (X.C14776U8m) r2
            boolean r2 = r2.A00
            java.lang.Object r6 = r1.A02
            X.UaK r6 = (X.C15313UaK) r6
            if (r2 != 0) goto L_0x06fb
            r6.A04()
            androidx.core.widget.NestedScrollView r2 = r5.A01
            if (r2 == 0) goto L_0x06f1
            X.Wjy r1 = new X.Wjy
            r1.<init>(r5)
            r2.post(r1)
        L_0x06f1:
            java.lang.Object r2 = r3.getValue()
            X.U8m r2 = (X.C14776U8m) r2
            r1 = 1
            r2.A00 = r1
            goto L_0x06cf
        L_0x06fb:
            X.U8c r4 = r6.A03()
            if (r4 == 0) goto L_0x0726
            java.util.Map r1 = r6.A0F
            java.util.ArrayList r3 = X.JTQ.A0f(r1)
            java.util.Iterator r2 = X.AnonymousClass7TF.A0u(r1)
        L_0x070b:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0719
            java.lang.Object r1 = X.C13991Tnr.A0Y(r2)
            r3.add(r1)
            goto L_0x070b
        L_0x0719:
            X.U8j r1 = r6.A04()
            java.lang.String r2 = r1.A00
            java.util.List r1 = r5.A00()
            r4.A00(r3, r1, r2)
        L_0x0726:
            r1 = 1
            r6.A08 = r1
            X.U8j r2 = r6.A04()
            boolean r1 = r2 instanceof X.C16058Unl
            if (r1 != 0) goto L_0x0744
            boolean r1 = r2 instanceof X.C16057Unk
            if (r1 == 0) goto L_0x0744
            X.Unk r2 = (X.C16057Unk) r2
            X.WYY r5 = r2.A04
            java.lang.String r4 = r2.A00
            boolean r3 = r2.A00
            java.lang.String r2 = "privacy_policy_bottom_sheet_submit_click"
            java.lang.String r1 = "click"
            X.WYY.A01(r5, r2, r1, r4, r3)
        L_0x0744:
            X.DbZ.A17(r6)
            goto L_0x06cf
        L_0x0748:
            r0 = 1070536631(0x3fcf17b7, float:1.6179112)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.UZ2 r3 = (X.UZ2) r3
            X.Vjk r2 = r3.A07
            java.lang.String r1 = "try_sticker"
            r2.A00(r1)
            com.instagram.common.session.UserSession r4 = r3.A01
            androidx.fragment.app.FragmentActivity r3 = r3.requireActivity()
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            r1 = 27
            java.lang.String r1 = X.C273654mx.A00(r1)
            X.Dba.A0l(r3, r2, r4, r1)
            r1 = -1101917268(0xffffffffbe5213ac, float:-0.20515317)
            goto L_0x001c
        L_0x0773:
            r0 = -402488539(0xffffffffe8028325, float:-2.4653073E24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            if (r2 == 0) goto L_0x0783
            r2.onClick(r3)
        L_0x0783:
            java.lang.Object r2 = r1.A02
            android.view.View r2 = (android.view.View) r2
            boolean r1 = r2.isSelected()
            r1 = r1 ^ 1
            r2.setSelected(r1)
            r1 = -922613253(0xffffffffc90209fb, float:-532639.7)
            goto L_0x001c
        L_0x0795:
            r0 = 776704343(0x2e4b9157, float:4.6285944E-11)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.X4F r2 = (X.X4F) r2
            java.lang.Object r1 = r1.A02
            com.instagram.igds.components.form.IgFormField r1 = (com.instagram.igds.components.form.IgFormField) r1
            java.lang.String r1 = r1.getStateType$fbandroid_java_com_instagram_igds_components_form_form()
            r2.Dmt(r1)
            r1 = 292256224(0x116b79e0, float:1.8575787E-28)
            goto L_0x001c
        L_0x07b0:
            r0 = -616489836(0xffffffffdb411c94, float:-5.4356092E16)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.Ube r2 = (X.C15381Ube) r2
            java.lang.Object r1 = r1.A01
            X.Cux r1 = (X.C45355Cux) r1
            java.lang.String r1 = r1.A02
            X.C15381Ube.A07(r2, r1)
            r1 = -1881076112(0xffffffff8fe10e70, float:-2.2192274E-29)
            goto L_0x001c
        L_0x07c9:
            r0 = 1142399193(0x4417a0d9, float:606.51324)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A02
            X.Ube r4 = (X.C15381Ube) r4
            X.0eM r2 = r4.A0i
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r2)
            X.1se r2 = X.1sd.A00(r2)
            java.lang.Object r3 = r1.A01
            X.1Xj r3 = (X.1Xj) r3
            r1 = 0
            r2.A02(r3, r1)
            X.TpO r2 = r4.A07
            if (r2 != 0) goto L_0x07ee
            java.lang.String r0 = "grid"
            goto L_0x0cd7
        L_0x07ee:
            java.lang.String r1 = r3.getId()
            if (r1 == 0) goto L_0x100a
            r2.A08(r1)
            r1 = 1254010072(0x4abeacd8, float:6248044.0)
            goto L_0x001c
        L_0x07fc:
            r0 = -1446470814(0xffffffffa9c89b62, float:-8.908739E-14)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A02
            X.ToY r3 = (X.C14032ToY) r3
            int r5 = r3.getBindingAdapterPosition()
            r2 = -1
            if (r5 == r2) goto L_0x0827
            X.Tqi r2 = r3.A02
            java.lang.Object r4 = r1.A01
            com.instagram.user.model.User r4 = (com.instagram.user.model.User) r4
            X.ToX r3 = r2.A00
            java.lang.Object r2 = r3.A01(r5)
            boolean r1 = r2 instanceof X.AnonymousClass3UL
            if (r1 == 0) goto L_0x082c
            X.6s0 r1 = r3.A03
            if (r1 == 0) goto L_0x0827
            X.3UL r2 = (X.AnonymousClass3UL) r2
            r1.A0B(r2, r5)
        L_0x0827:
            r1 = 1709530993(0x65e55f71, float:1.3539781E23)
            goto L_0x001c
        L_0x082c:
            X.6s0 r2 = r3.A03
            if (r2 == 0) goto L_0x0827
            androidx.recyclerview.widget.RecyclerView r1 = r3.A00
            r2.A05(r1, r4, r5)
            goto L_0x0827
        L_0x0836:
            r0 = 777143924(0x2e524674, float:4.7811047E-11)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A02
            X.ToY r3 = (X.C14032ToY) r3
            int r5 = r3.getBindingAdapterPosition()
            r2 = -1
            if (r5 == r2) goto L_0x0864
            X.Tqi r2 = r3.A02
            java.lang.Object r4 = r1.A01
            com.instagram.user.model.User r4 = (com.instagram.user.model.User) r4
            X.ToX r3 = r2.A00
            java.lang.Object r2 = r3.A01(r5)
            X.C14031ToX.A00(r3, r5)
            boolean r1 = r2 instanceof X.AnonymousClass3UL
            if (r1 == 0) goto L_0x0869
            X.6s0 r1 = r3.A03
            if (r1 == 0) goto L_0x0864
            X.3UL r2 = (X.AnonymousClass3UL) r2
            r1.A0C(r2, r5)
        L_0x0864:
            r1 = -761911028(0xffffffffd296290c, float:-3.22466873E11)
            goto L_0x001c
        L_0x0869:
            X.6s0 r1 = r3.A03
            if (r1 == 0) goto L_0x0864
            r1.A08(r4, r5)
            goto L_0x0864
        L_0x0871:
            r0 = -268719662(0xffffffffeffba9d2, float:-1.55772075E29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.UD8 r2 = (X.UD8) r2
            int r1 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.VNN r1 = r2.A02
            X.ToX r1 = r1.A00
            X.6s0 r1 = r1.A03
            if (r1 == 0) goto L_0x0889
            r1.A04()
        L_0x0889:
            r1 = 603038615(0x23f1a397, float:2.6198555E-17)
            goto L_0x001c
        L_0x088e:
            r0 = 77730754(0x4a213c2, float:3.810416E-36)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A02
            X.UE7 r4 = (X.UE7) r4
            int r3 = r4.getBindingAdapterPosition()
            r2 = -1
            if (r3 == r2) goto L_0x08ba
            X.VNM r2 = r4.A05
            int r4 = r4.getBindingAdapterPosition()
            java.lang.Object r3 = r1.A01
            com.instagram.model.hashtag.Hashtag r3 = (com.instagram.model.hashtag.Hashtag) r3
            X.ToX r1 = r2.A00
            X.C14031ToX.A00(r1, r4)
            X.6s0 r1 = r1.A03
            if (r1 == 0) goto L_0x08ba
            X.6s1 r2 = r1.A00
            java.lang.String r1 = "similar_entity_dismiss_tapped"
            r2.A00(r3, r1, r4)
        L_0x08ba:
            r1 = 1120376741(0x42c797a5, float:99.79618)
            goto L_0x001c
        L_0x08bf:
            r0 = -1216185847(0xffffffffb7827a09, float:-1.5554035E-5)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A02
            X.UE7 r5 = (X.UE7) r5
            int r3 = r5.getBindingAdapterPosition()
            r2 = -1
            if (r3 == r2) goto L_0x08e4
            X.VNM r4 = r5.A05
            int r3 = r5.getBindingAdapterPosition()
            java.lang.Object r2 = r1.A01
            com.instagram.model.hashtag.Hashtag r2 = (com.instagram.model.hashtag.Hashtag) r2
            X.ToX r1 = r4.A00
            X.6s0 r1 = r1.A03
            if (r1 == 0) goto L_0x08e4
            r1.A07(r2, r3)
        L_0x08e4:
            r1 = 725512232(0x2b3e7028, float:6.765721E-13)
            goto L_0x001c
        L_0x08e9:
            r0 = 1876033557(0x6fd20015, float:1.299839E29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A02
            X.UEN r3 = (X.UEN) r3
            int r5 = r3.getBindingAdapterPosition()
            r2 = -1
            if (r5 == r2) goto L_0x091f
            X.VNK r4 = r3.A08
            java.lang.Object r1 = r1.A01
            if (r1 == 0) goto L_0x091a
            X.ToX r1 = r4.A00
            com.instagram.common.session.UserSession r1 = r1.A08
            X.1Av r1 = X.1Au.A00(r1)
            r3 = 1
            X.0xY r2 = X.AnonymousClass7TE.A0p(r1)
            r1 = 3217(0xc91, float:4.508E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r2.E5T(r1, r3)
            r2.apply()
        L_0x091a:
            X.ToX r1 = r4.A00
            X.C14031ToX.A00(r1, r5)
        L_0x091f:
            r1 = 196767353(0xbba6e79, float:7.1810815E-32)
            goto L_0x001c
        L_0x0924:
            r0 = -251173022(0xfffffffff1076762, float:-6.704873E29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A02
            X.UEN r3 = (X.UEN) r3
            int r2 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.VNK r3 = r3.A08
            java.lang.Object r1 = r1.A01
            X.0rm r1 = (X.0rm) r1
            java.lang.Object r2 = r1.A00
            X.EX9 r2 = (X.EX9) r2
            r1 = 0
            X.0qQ.A0B(r2, r1)
            X.ToX r1 = r3.A00
            X.6s0 r1 = r1.A03
            if (r1 == 0) goto L_0x0948
            r1.A06(r2)
        L_0x0948:
            r1 = 295724217(0x11a064b9, float:2.5305624E-28)
            goto L_0x001c
        L_0x094d:
            r0 = 22927848(0x15dd9e8, float:4.074763E-38)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A02
            X.ViI r3 = (X.C17927ViI) r3
            int r2 = r3.A01
            int r2 = r2 + -1
            r3.A00(r2)
            java.lang.Object r1 = r1.A01
            X.UEm r1 = (X.C14907UEm) r1
            android.view.View r1 = r1.A05
            X.0nA.A0N(r1)
            r1 = 943377971(0x383ace33, float:4.4537894E-5)
            goto L_0x001c
        L_0x096d:
            r0 = -1347114214(0xffffffffafb4ab1a, float:-3.2863384E-10)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A02
            X.ViI r3 = (X.C17927ViI) r3
            int r2 = r3.A01
            int r2 = r2 + 1
            r3.A00(r2)
            java.lang.Object r1 = r1.A01
            X.UEm r1 = (X.C14907UEm) r1
            android.view.View r1 = r1.A05
            X.0nA.A0N(r1)
            r1 = -1293702154(0xffffffffb2e3abf6, float:-2.6504477E-8)
            goto L_0x001c
        L_0x098d:
            r0 = 1053869259(0x3ed0c4cb, float:0.4077514)
            int r0 = X.AnonymousClass0fD.A05(r0)
            r1 = -1469767462(0xffffffffa86520da, float:-1.2719177E-14)
            goto L_0x001c
        L_0x0999:
            r0 = -1344099098(0xffffffffafe2ace6, float:-4.1232012E-10)
            int r0 = X.DbX.A03(r3, r0)
            java.lang.Object r1 = r1.A01
            X.3kE r1 = (X.C249703kE) r1
            r1.getBindingAdapterPosition()
            r1 = 2049103027(0x7a22d4b3, float:2.1136654E35)
            goto L_0x001c
        L_0x09ac:
            r0 = 2035370422(0x795149b6, float:6.7917817E34)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A02
            X.UlM r4 = (X.C15951UlM) r4
            X.Vgi r2 = r4.A03
            java.lang.Object r3 = r1.A01
            com.instagram.discovery.related.model.RelatedItem r3 = (com.instagram.discovery.related.model.RelatedItem) r3
            r2.A00(r3)
            java.lang.Integer r1 = r3.A00()
            int r2 = r1.intValue()
            r1 = 0
            if (r2 == r1) goto L_0x09e4
            r1 = 1
            if (r2 != r1) goto L_0x09df
            java.lang.Integer r8 = X.AnonymousClass05K.A0N
        L_0x09d0:
            X.0iw r5 = r4.A00
            com.instagram.common.session.UserSession r7 = r4.A02
            X.0xF r6 = r4.A01
            java.lang.String r9 = r3.A01()
            java.lang.String r10 = r3.A03
            X.C16936VBo.A00(r5, r6, r7, r8, r9, r10)
        L_0x09df:
            r1 = 258137343(0xf62dcff, float:1.11852226E-29)
            goto L_0x001c
        L_0x09e4:
            java.lang.Integer r8 = X.AnonymousClass05K.A01
            goto L_0x09d0
        L_0x09e7:
            r0 = -1268517058(0xffffffffb463f73e, float:-2.1230969E-7)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A02
            X.U9j r4 = (X.U9j) r4
            X.Vgi r2 = r4.A03
            java.lang.Object r3 = r1.A01
            com.instagram.discovery.related.model.RelatedItem r3 = (com.instagram.discovery.related.model.RelatedItem) r3
            r2.A00(r3)
            java.lang.Integer r1 = r3.A00()
            int r2 = r1.intValue()
            r1 = 0
            if (r2 == r1) goto L_0x0a29
            r1 = 1
            if (r2 != r1) goto L_0x0a21
            java.lang.Integer r8 = X.AnonymousClass05K.A0N
        L_0x0a0b:
            boolean r1 = r4 instanceof X.C15951UlM
            if (r1 == 0) goto L_0x0a26
            r1 = r4
            X.UlM r1 = (X.C15951UlM) r1
            X.0iw r5 = r1.A00
        L_0x0a14:
            com.instagram.common.session.UserSession r7 = r4.A02
            X.0xF r6 = r4.A01
            java.lang.String r9 = r3.A01()
            java.lang.String r10 = r3.A03
            X.C16936VBo.A00(r5, r6, r7, r8, r9, r10)
        L_0x0a21:
            r1 = 766669962(0x2db2748a, float:2.028801E-11)
            goto L_0x001c
        L_0x0a26:
            X.0iw r5 = r4.A00
            goto L_0x0a14
        L_0x0a29:
            java.lang.Integer r8 = X.AnonymousClass05K.A01
            goto L_0x0a0b
        L_0x0a2c:
            r0 = -441005825(0xffffffffe5b6c8ff, float:-1.078973E23)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.3kE r2 = (X.C249703kE) r2
            int r3 = r2.getBindingAdapterPosition()
            r2 = -1
            if (r3 == r2) goto L_0x0a59
            java.lang.Object r1 = r1.A02
            X.UA6 r1 = (X.UA6) r1
            X.X45 r2 = r1.A01
            X.JwG r1 = r1.A00
            if (r1 == 0) goto L_0x1015
            java.lang.Object r1 = r1.A00
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x1015
            java.lang.Object r1 = r1.get(r3)
            com.instagram.discovery.refinement.model.Refinement r1 = (com.instagram.discovery.refinement.model.Refinement) r1
            if (r1 == 0) goto L_0x1015
            r2.Dcn(r1, r3)
        L_0x0a59:
            r1 = 2122453319(0x7e821147, float:8.644467E37)
            goto L_0x001c
        L_0x0a5e:
            r0 = 148110160(0x8d3fb50, float:1.2758184E-33)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.X8R r2 = (X.X8R) r2
            java.lang.Object r1 = r1.A02
            X.1Xj r1 = (X.1Xj) r1
            r2.DJ3(r1)
            r1 = 732054894(0x2ba2456e, float:1.1530063E-12)
            goto L_0x001c
        L_0x0a75:
            r0 = -1343704682(0xffffffffafe8b196, float:-4.2326737E-10)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A02
            X.UEn r5 = (X.C14908UEn) r5
            int r2 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            com.instagram.discovery.mediamap.fragment.LocationListFragment r2 = r5.A0A
            if (r2 == 0) goto L_0x0ae4
            java.lang.Object r4 = r1.A01
            com.instagram.discovery.mediamap.model.MediaMapPinPreview r4 = (com.instagram.discovery.mediamap.model.MediaMapPinPreview) r4
            X.0qQ.A0A(r4)
            boolean r1 = r2.A07
            if (r1 != 0) goto L_0x0ae4
            com.instagram.discovery.mediamap.fragment.MediaMapFragment r3 = X.C13990Tnq.A0P(r2)
            java.lang.String r9 = "discovery_map_location_list"
            X.WRy r2 = r5.A01
            if (r2 == 0) goto L_0x0ae4
            X.Vko r1 = r5.A09
            java.lang.String r2 = r2.A01
            java.util.Map r1 = r1.A02
            java.lang.Object r7 = r1.get(r2)
            com.instagram.discovery.mediamap.model.MediaMapPin r7 = (com.instagram.discovery.mediamap.model.MediaMapPin) r7
            if (r7 == 0) goto L_0x0ae4
            X.W3Q r5 = r3.A0F
            java.lang.Integer r8 = X.AnonymousClass05K.A01
            com.instagram.discovery.mediamap.intf.MediaMapQuery r6 = r3.A0E
            X.VwC r1 = r3.A06
            int r1 = r1.A01(r6, r7)
            long r10 = (long) r1
            r5.A08(r6, r7, r8, r9, r10)
            com.instagram.discovery.mediamap.fragment.MediaMapFragment.A09(r3, r7)
            r3.A0I = r4
            X.Vvi r2 = r3.A0C
            java.lang.String r1 = X.C18231Vnv.A01(r7)
            r2.A03(r1)
            com.instagram.model.venue.LocationDict r2 = r7.A09
            if (r2 == 0) goto L_0x0ae4
            java.lang.Float r1 = r2.A02
            if (r1 == 0) goto L_0x0ae4
            java.lang.Float r1 = r2.A03
            if (r1 == 0) goto L_0x0ae4
            X.VwL r5 = r3.mMapViewController
            java.lang.Double r1 = r7.A0A
            double r3 = r1.doubleValue()
            java.lang.Double r1 = r7.A0B
            double r1 = r1.doubleValue()
            r5.A0A(r3, r1)
        L_0x0ae4:
            r1 = -881172740(0xffffffffcb7a5efc, float:-1.6408316E7)
            goto L_0x001c
        L_0x0ae9:
            r0 = 1761271785(0x68fadfe9, float:9.477776E24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            com.instagram.discovery.mediamap.fragment.LocationListFragment r2 = (com.instagram.discovery.mediamap.fragment.LocationListFragment) r2
            if (r2 == 0) goto L_0x0b5a
            java.lang.Object r4 = r1.A02
            X.UEn r4 = (X.C14908UEn) r4
            boolean r1 = r2.A07
            if (r1 != 0) goto L_0x0b5a
            com.instagram.discovery.mediamap.fragment.MediaMapFragment r3 = X.C13990Tnq.A0P(r2)
            java.lang.String r8 = "discovery_map_location_list"
            X.WRy r2 = r4.A01
            if (r2 == 0) goto L_0x0b5a
            X.Vko r1 = r4.A09
            java.lang.String r2 = r2.A01
            java.util.Map r1 = r1.A02
            java.lang.Object r6 = r1.get(r2)
            com.instagram.discovery.mediamap.model.MediaMapPin r6 = (com.instagram.discovery.mediamap.model.MediaMapPin) r6
            if (r6 == 0) goto L_0x0b5a
            X.W3Q r4 = r3.A0F
            java.lang.Integer r7 = X.AnonymousClass05K.A01
            com.instagram.discovery.mediamap.intf.MediaMapQuery r5 = r3.A0E
            X.VwC r1 = r3.A06
            int r1 = r1.A01(r5, r6)
            long r9 = (long) r1
            r4.A08(r5, r6, r7, r8, r9)
            com.instagram.discovery.mediamap.fragment.MediaMapFragment.A09(r3, r6)
            X.Vvi r2 = r3.A0C
            java.lang.String r1 = X.C18231Vnv.A01(r6)
            r2.A03(r1)
            X.VwL r2 = r3.mMapViewController
            java.util.Set r1 = java.util.Collections.singleton(r6)
            java.util.HashSet r4 = r2.A06(r1)
            int r2 = r4.size()
            r1 = 1
            if (r2 != r1) goto L_0x0b5f
            java.util.Iterator r1 = r4.iterator()
            java.lang.Object r1 = r1.next()
            X.Tzf r1 = (X.C14633Tzf) r1
            com.facebook.android.maps.model.LatLng r1 = r1.Bdm()
            X.VwL r5 = r3.mMapViewController
            double r3 = r1.A00
            double r1 = r1.A01
        L_0x0b57:
            r5.A0A(r3, r1)
        L_0x0b5a:
            r1 = -1216027354(0xffffffffb784e526, float:-1.5842332E-5)
            goto L_0x001c
        L_0x0b5f:
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L_0x0b5a
            com.instagram.model.venue.LocationDict r2 = r6.A09
            if (r2 == 0) goto L_0x0b5a
            java.lang.Float r1 = r2.A02
            if (r1 == 0) goto L_0x0b5a
            java.lang.Float r1 = r2.A03
            if (r1 == 0) goto L_0x0b5a
            X.VwL r5 = r3.mMapViewController
            java.lang.Double r1 = r6.A0A
            double r3 = r1.doubleValue()
            java.lang.Double r1 = r6.A0B
            double r1 = r1.doubleValue()
            goto L_0x0b57
        L_0x0b80:
            r0 = -2103071146(0xffffffff82a5ae56, float:-2.4344635E-37)
            int r0 = A00(r1, r0)
            r1 = -1759014372(0xffffffff9727921c, float:-5.4145026E-25)
            goto L_0x001c
        L_0x0b8c:
            r0 = -1572999330(0xffffffffa23def5e, float:-2.5740996E-18)
            int r0 = A00(r1, r0)
            r1 = -1483771466(0xffffffffa78f71b6, float:-3.981376E-15)
            goto L_0x001c
        L_0x0b98:
            r0 = -2044559638(0xffffffff86227eea, float:-3.0562055E-35)
            int r0 = A00(r1, r0)
            r1 = -319306574(0xffffffffecf7c4b2, float:-2.3962684E27)
            goto L_0x001c
        L_0x0ba4:
            r0 = -19608208(0xfffffffffed4cd70, float:-1.4143151E38)
            int r0 = A00(r1, r0)
            r1 = 682161364(0x28a8f4d4, float:1.8757924E-14)
            goto L_0x001c
        L_0x0bb0:
            r0 = -636593417(0xffffffffda0e5af7, float:-1.00173659E16)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.Vfj r2 = (X.C17772Vfj) r2
            java.lang.Object r1 = r1.A02
            com.instagram.discovery.mediamap.model.MediaMapPin r1 = (com.instagram.discovery.mediamap.model.MediaMapPin) r1
            r2.A00(r1)
            r1 = -1751681261(0xffffffff97977713, float:-9.788205E-25)
            goto L_0x001c
        L_0x0bc7:
            r0 = -1980364251(0xffffffff89f60a25, float:-5.9231886E-33)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.Vfj r2 = (X.C17772Vfj) r2
            java.lang.Object r1 = r1.A02
            com.instagram.discovery.mediamap.model.MediaMapPin r1 = (com.instagram.discovery.mediamap.model.MediaMapPin) r1
            r2.A00(r1)
            r1 = -383924787(0xffffffffe91dc5cd, float:-1.1920965E25)
            goto L_0x001c
        L_0x0bde:
            r0 = -66698931(0xfffffffffc06414d, float:-2.788369E36)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.Vfj r2 = (X.C17772Vfj) r2
            java.lang.Object r9 = r1.A02
            com.instagram.discovery.mediamap.model.MediaMapPin r9 = (com.instagram.discovery.mediamap.model.MediaMapPin) r9
            com.instagram.discovery.mediamap.fragment.LocationDetailFragment r4 = r2.A00
            X.W3Q r3 = X.Dba.A0F(r4)
            com.instagram.discovery.mediamap.intf.MediaMapQuery r2 = r4.A02
            java.lang.String r1 = "instagram_map_location_detail_tap_directions"
            X.DbZ.A1a(r2, r3, r9, r1)
            X.VVg r7 = r4.mDirectionsBottomSheetController
            androidx.fragment.app.FragmentActivity r6 = r4.requireActivity()
            r8 = 0
            com.instagram.discovery.mediamap.model.LocationPageInformation r5 = r9.A06
            if (r5 == 0) goto L_0x0c43
            X.Vzh r1 = r7.A00
            com.instagram.common.session.UserSession r1 = r1.A00
            X.Dg1 r4 = new X.Dg1
            r4.<init>(r6, r1)
            X.IVD r1 = new X.IVD
            r1.<init>(r8)
            r4.A03 = r1
            r3 = 2131969038(0x7f13440e, float:1.9574988E38)
            r2 = 21
            X.WB4 r1 = new X.WB4
            r1.<init>(r2, r6, r9, r7)
            r4.A04(r1, r3)
            java.lang.String r1 = r5.A05
            if (r1 == 0) goto L_0x0c40
            int r1 = r1.length()
            if (r1 == 0) goto L_0x0c40
            java.lang.String r1 = X.C18747Vzh.A00(r5, r8)
            r4.A09(r1)
            r3 = 2131956745(0x7f131409, float:1.9550054E38)
            r2 = 22
            X.WB4 r1 = new X.WB4
            r1.<init>(r2, r6, r5, r7)
            r4.A04(r1, r3)
        L_0x0c40:
            X.C51969G9p.A11(r6, r4)
        L_0x0c43:
            r1 = 1535428072(0x5b84c5e8, float:7.4744594E16)
            goto L_0x001c
        L_0x0c48:
            r0 = 1806458161(0x6bac5d31, float:4.1675065E26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.X6d r2 = (X.C20950X6d) r2
            java.lang.Object r1 = r1.A02
            X.N3M r1 = (X.N3M) r1
            r2.Di2(r1)
            r1 = 1203456026(0x47bb481a, float:95888.2)
            goto L_0x001c
        L_0x0c5f:
            r0 = 1644182674(0x62003c92, float:5.9138695E20)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.X8Q r2 = (X.X8Q) r2
            java.lang.Object r1 = r1.A02
            X.N3M r1 = (X.N3M) r1
            r2.DZR(r1)
            r1 = -890110232(0xffffffffcaf1fee8, float:-7929716.0)
            goto L_0x001c
        L_0x0c76:
            r0 = 1616260291(0x60562cc3, float:6.1731698E19)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.XBu r2 = (X.C21052XBu) r2
            java.lang.Object r1 = r1.A02
            X.N3M r1 = (X.N3M) r1
            r2.DKY(r1)
            r1 = 1991734150(0x76b77386, float:1.8604168E33)
            goto L_0x001c
        L_0x0c8d:
            r0 = -999285317(0xffffffffc4701dbb, float:-960.46454)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.X3p r2 = (X.C20898X3p) r2
            java.lang.Object r1 = r1.A02
            X.VsV r1 = (X.C18479VsV) r1
            X.Uz8 r1 = r1.A00
            if (r1 == 0) goto L_0x0ca8
            r2.DqC(r1)
            r1 = 5606167(0x558b17, float:7.855913E-39)
            goto L_0x001c
        L_0x0ca8:
            java.lang.String r0 = "type"
            goto L_0x0cd7
        L_0x0cab:
            r0 = -2080635412(0xffffffff83fc05ec, float:-1.4812588E-36)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.VO9 r4 = (X.VO9) r4
            java.lang.Object r3 = r1.A02
            X.N3M r3 = (X.N3M) r3
            java.lang.String r2 = r3.A02
            if (r2 == 0) goto L_0x0d11
            int r1 = r2.length()
            if (r1 == 0) goto L_0x0d11
            X.Ube r5 = r4.A00
            X.C15381Ube.A07(r5, r2)
            java.lang.String r2 = r3.A05
            if (r2 != 0) goto L_0x0cd1
            java.lang.String r1 = r3.A06
            if (r1 == 0) goto L_0x0d24
        L_0x0cd1:
            X.0wc r1 = r5.A04
            if (r1 != 0) goto L_0x0cdf
            java.lang.String r0 = "logger"
        L_0x0cd7:
            X.0qQ.A0F(r0)
            X.00P r2 = X.AnonymousClass00P.createAndThrow()
            throw r2
        L_0x0cdf:
            X.1Ln r4 = X.1Ln.A0G(r1)
            boolean r1 = X.DbT.A1Y(r4)
            if (r1 == 0) goto L_0x0d24
            X.C13989Tnp.A1J(r4, r3, r2)
            X.Vt4 r1 = X.C15381Ube.A01(r5)
            com.instagram.model.hashtag.Hashtag r3 = r1.A01
            java.lang.String r2 = r3.getId()
            if (r2 == 0) goto L_0x0d07
            int r1 = r2.length()
            if (r1 != 0) goto L_0x0d07
            java.lang.Long r2 = X.AnonymousClass7TE.A10(r2)
            java.lang.String r1 = "hashtag_id"
            r4.A0Q(r1, r2)
        L_0x0d07:
            X.C13990Tnq.A13(r4, r3)
            X.HAI r1 = r5.A08
            if (r1 != 0) goto L_0x0d21
            java.lang.String r0 = "dataSource"
            goto L_0x0cd7
        L_0x0d11:
            X.Ube r1 = r4.A00
            androidx.fragment.app.FragmentActivity r2 = r1.requireActivity()
            X.0eM r1 = r1.A0i
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            X.C13990Tnq.A0y(r2, r1)
            goto L_0x0d24
        L_0x0d21:
            X.C13992Tns.A0l(r4, r1, r3)
        L_0x0d24:
            r1 = -895577825(0xffffffffca9e911f, float:-5195919.5)
            goto L_0x001c
        L_0x0d29:
            r0 = -815149745(0xffffffffcf69cd4f, float:-3.92254643E9)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            android.content.Intent r2 = (android.content.Intent) r2
            java.lang.Object r1 = r1.A02
            android.content.Context r1 = X.DbT.A08(r1)
            X.0kR.A00(r1, r2)
            r1 = -1306136421(0xffffffffb225f09b, float:-9.658971E-9)
            goto L_0x001c
        L_0x0d42:
            r0 = 596876943(0x23939e8f, float:1.6004924E-17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            android.content.Context r5 = X.DbT.A08(r2)
            java.lang.Object r1 = r1.A01
            X.Vkf r1 = (X.C18057Vkf) r1
            double r3 = r1.A00
            double r1 = r1.A01
            X.FFS.A01(r5, r3, r1)
            r1 = -625345325(0xffffffffdab9fcd3, float:-2.61754269E16)
            goto L_0x001c
        L_0x0d5f:
            r0 = 56690635(0x36107cb, float:6.6130503E-37)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A02
            X.UZB r3 = (X.UZB) r3
            androidx.fragment.app.FragmentActivity r2 = r3.requireActivity()
            java.lang.String r7 = "DirectLiveLocationMapFragment"
            java.lang.Object r6 = r1.A01
            com.instagram.user.model.User r6 = (com.instagram.user.model.User) r6
            X.0eM r1 = r3.A04
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r1)
            r8 = 0
            r9 = 0
            r4 = r3
            X.F7B.A00(r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = -1739248790(0xffffffff98552b6a, float:-2.7551523E-24)
            goto L_0x001c
        L_0x0d85:
            r0 = 566606892(0x21c5bc2c, float:1.3399048E-18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.UiE r2 = (X.C15769UiE) r2
            X.Etl r2 = r2.A01
            if (r2 == 0) goto L_0x0db8
            java.lang.Object r1 = r1.A01
            X.WSa r1 = (X.C19267WSa) r1
            java.lang.String r5 = r1.A03
            java.lang.String r6 = r1.A01
            java.lang.String r7 = r1.A02
            com.instagram.common.typedurl.ImageUrl r4 = r1.A00
            boolean r8 = r1.A06
            boolean r9 = r1.A04
            com.instagram.direct.model.channels.BroadcastChannelXpostingChannelInfo r3 = new com.instagram.direct.model.channels.BroadcastChannelXpostingChannelInfo
            r3.<init>(r4, r5, r6, r7, r8, r9)
            X.E7L r1 = r2.A00
            X.0eM r1 = r1.A02
            java.lang.Object r1 = r1.getValue()
            X.Jh8 r1 = (X.C60189Jh8) r1
            X.05G r1 = r1.A04
            r1.Epw(r3)
        L_0x0db8:
            r1 = -966594197(0xffffffffc662f16b, float:-14524.3545)
            goto L_0x001c
        L_0x0dbd:
            r0 = -1826743769(0xffffffff931e1a27, float:-1.9955298E-27)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A02
            X.UEC r3 = (X.UEC) r3
            int r2 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.6gx r11 = r3.A05
            java.lang.Object r12 = r1.A01
            X.WSg r12 = (X.C19273WSg) r12
            java.lang.String r10 = r12.A07
            java.lang.String r9 = r12.A06
            java.lang.String r8 = r12.A08
            java.lang.String r7 = r12.A09
            int r6 = r12.A00
            X.0wc r1 = r11.A03
            X.1Ln r5 = X.1Ln.A0E(r1)
            boolean r1 = X.DbT.A1Y(r5)
            if (r1 == 0) goto L_0x0e42
            long r1 = r11.A02
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r5.A0h(r1)
            int r15 = r10.hashCode()
            java.lang.String r14 = "create_spotlight"
            r1 = 1536(0x600, float:2.152E-42)
            java.lang.String r13 = X.AnonymousClass000.A00(r1)
            r1 = 428(0x1ac, float:6.0E-43)
            java.lang.String r4 = X.C273654mx.A00(r1)
            r1 = 1236(0x4d4, float:1.732E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r1)
            r1 = 1808(0x710, float:2.534E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r1)
            switch(r15) {
                case -2001117250: goto L_0x0ea2;
                case -493687518: goto L_0x0e98;
                case 354039290: goto L_0x0e8e;
                case 996503074: goto L_0x0e85;
                case 1718164945: goto L_0x0e7c;
                default: goto L_0x0e10;
            }
        L_0x0e10:
            java.lang.String r1 = "render_keyboard"
        L_0x0e12:
            r5.A0l(r1)
            java.lang.String r1 = "tap"
            r5.A0k(r1)
            switch(r15) {
                case -2001117250: goto L_0x0e73;
                case -493687518: goto L_0x0e6a;
                case 354039290: goto L_0x0e61;
                case 996503074: goto L_0x0e58;
                case 1718164945: goto L_0x0e4f;
                default: goto L_0x0e1d;
            }
        L_0x0e1d:
            java.lang.String r1 = "send_message_education_button"
        L_0x0e1f:
            r5.A0p(r1)
            java.lang.String r1 = "best_practices_education"
            java.lang.Long r1 = X.DbZ.A0b(r5, r1, r8, r7, r6)
            r5.A0i(r1)
            java.lang.String r1 = r11.A01
            r5.A0v(r1)
            java.lang.String r1 = "thread_view"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x0e4c
            X.Nmb r2 = X.C69493Nmb.THREAD_VIEW
        L_0x0e3a:
            java.lang.String r1 = "entrypoint"
            r5.A0M(r2, r1)
            r5.Cgf()
        L_0x0e42:
            X.0sa r1 = r12.A0A
            r1.invoke()
            r1 = 609205380(0x244fbc84, float:4.504565E-17)
            goto L_0x001c
        L_0x0e4c:
            X.Nmb r2 = X.C69493Nmb.THREAD_DETAILS
            goto L_0x0e3a
        L_0x0e4f:
            boolean r1 = r10.equals(r14)
            if (r1 == 0) goto L_0x0e1d
            java.lang.String r1 = "create_spotlight_button"
            goto L_0x0e1f
        L_0x0e58:
            boolean r1 = r10.equals(r13)
            if (r1 == 0) goto L_0x0e1d
            java.lang.String r1 = "see_sharing_options_button"
            goto L_0x0e1f
        L_0x0e61:
            boolean r1 = r10.equals(r4)
            if (r1 == 0) goto L_0x0e1d
            java.lang.String r1 = "unique_content_education_button"
            goto L_0x0e1f
        L_0x0e6a:
            boolean r1 = r10.equals(r3)
            if (r1 == 0) goto L_0x0e1d
            java.lang.String r1 = "create_poll_button"
            goto L_0x0e1f
        L_0x0e73:
            boolean r1 = r10.equals(r2)
            if (r1 == 0) goto L_0x0e1d
            java.lang.String r1 = "share_last_message_button"
            goto L_0x0e1f
        L_0x0e7c:
            boolean r1 = r10.equals(r14)
            if (r1 == 0) goto L_0x0e10
            java.lang.String r1 = "render_spotlight_creation_sheet"
            goto L_0x0e12
        L_0x0e85:
            boolean r1 = r10.equals(r13)
            if (r1 == 0) goto L_0x0e10
            java.lang.String r1 = "render_share_options"
            goto L_0x0e12
        L_0x0e8e:
            boolean r1 = r10.equals(r4)
            if (r1 == 0) goto L_0x0e10
            java.lang.String r1 = "render_voice_message_recording"
            goto L_0x0e12
        L_0x0e98:
            boolean r1 = r10.equals(r3)
            if (r1 == 0) goto L_0x0e10
            java.lang.String r1 = "render_poll_creation_sheet"
            goto L_0x0e12
        L_0x0ea2:
            boolean r1 = r10.equals(r2)
            if (r1 == 0) goto L_0x0e10
            java.lang.String r1 = "render_share_last_message"
            goto L_0x0e12
        L_0x0eac:
            r0 = -504497301(0xffffffffe1edfb6b, float:-5.4874936E20)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.86E r2 = (X.AnonymousClass86E) r2
            java.lang.Object r1 = r1.A02
            X.3kE r1 = (X.C249703kE) r1
            int r1 = r1.getBindingAdapterPosition()
            r2.D9L(r1)
            r1 = 2118349750(0x7e4373b6, float:6.4950066E37)
            goto L_0x001c
        L_0x0ec7:
            r0 = 843097019(0x3240a3bb, float:1.1213099E-8)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.86E r2 = (X.AnonymousClass86E) r2
            java.lang.Object r1 = r1.A02
            X.3kE r1 = (X.C249703kE) r1
            int r1 = r1.getBindingAdapterPosition()
            r2.Dbh(r1)
            r1 = 64857533(0x3dda5bd, float:1.3027264E-36)
            goto L_0x001c
        L_0x0ee2:
            r0 = -1666923892(0xffffffff9ca4c28c, float:-1.0902899E-21)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoAttributionConfiguration r2 = (com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoAttributionConfiguration) r2
            com.instagram.model.effect.AREffect r2 = r2.A04
            java.lang.String r4 = r2.A02()
            if (r4 != 0) goto L_0x0f01
            java.lang.String r2 = "EffectInfoAttributionsItemViewBinder"
            java.lang.String r1 = "The attribution id is null"
            X.0kD.A01(r2, r1)
            r1 = -404783374(0xffffffffe7df7ef2, float:-2.1108589E24)
            goto L_0x001c
        L_0x0f01:
            java.lang.Object r1 = r1.A01
            X.Vsh r1 = (X.C18486Vsh) r1
            X.VMu r1 = r1.A02
            X.WPf r3 = r1.A00
            int r2 = r3.A04
            r1 = 2
            if (r2 == r1) goto L_0x0f13
            android.app.Activity r1 = r3.A05
            X.C19199WPf.A00(r1, r3, r4)
        L_0x0f13:
            r1 = 2077224020(0x7bcfec54, float:2.1591975E36)
            goto L_0x001c
        L_0x0f18:
            r0 = 2003256455(0x77674487, float:4.690666E33)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.ViS r5 = (X.C17937ViS) r5
            java.lang.Object r1 = r1.A02
            X.VaS r1 = (X.C17574VaS) r1
            int r4 = r1.A02
            X.2S0 r3 = X.AnonymousClass2S0.A01
            r1 = 5
            r3.A05(r1)
            int r1 = r5.A00
            X.VaS r1 = r5.A00(r1)
            if (r1 == 0) goto L_0x0f3e
            X.U4V r2 = r1.A04
            r1 = 0
            r2.setItemViewState(r1)
        L_0x0f3e:
            r5.A00 = r4
            X.VaS r1 = r5.A00(r4)
            if (r1 == 0) goto L_0x0f4c
            X.U4V r2 = r1.A04
            r1 = 1
            r2.setItemViewState(r1)
        L_0x0f4c:
            X.VMt r1 = r5.A07
            X.8aL r4 = r5.A06
            int r3 = r5.A00
            X.8EP r2 = r1.A00
            X.8EM r1 = r2.A08
            r1.Di7(r4, r3)
            r2.A00()
            r1 = 1028967797(0x3d54cd75, float:0.05195375)
            goto L_0x001c
        L_0x0f61:
            r0 = -898582481(0xffffffffca70b82f, float:-3943947.8)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.VOR r2 = (X.VOR) r2
            java.lang.Object r0 = r1.A01
            X.VYA r0 = (X.VYA) r0
            java.lang.Integer r0 = r0.A01
            int r1 = r0.intValue()
            r0 = 0
            if (r1 == r0) goto L_0x0fe4
            r0 = 5
            if (r1 == r0) goto L_0x0fb8
            r0 = 4
            if (r1 != r0) goto L_0x1003
            X.UdB r0 = r2.A00
            X.VOS r0 = r0.A02
            X.Ubm r6 = r0.A00     // Catch:{ MalformedURLException -> 0x1003 }
            X.UXv r0 = r6.A02     // Catch:{ MalformedURLException -> 0x1003 }
            java.lang.String r1 = r0.A0A     // Catch:{ MalformedURLException -> 0x1003 }
            java.net.URL r0 = new java.net.URL     // Catch:{ MalformedURLException -> 0x1003 }
            r0.<init>(r1)     // Catch:{ MalformedURLException -> 0x1003 }
            androidx.fragment.app.FragmentActivity r5 = r6.getActivity()     // Catch:{ MalformedURLException -> 0x1003 }
            com.instagram.common.session.UserSession r3 = r6.A00     // Catch:{ MalformedURLException -> 0x1003 }
            java.lang.String r2 = r0.toExternalForm()     // Catch:{ MalformedURLException -> 0x1003 }
            X.2EG r0 = X.2EG.A2M     // Catch:{ MalformedURLException -> 0x1003 }
            X.SUL r1 = new X.SUL     // Catch:{ MalformedURLException -> 0x1003 }
            r1.<init>(r5, r3, r0, r2)     // Catch:{ MalformedURLException -> 0x1003 }
            com.instagram.common.session.UserSession r0 = r6.A00     // Catch:{ MalformedURLException -> 0x1003 }
            java.lang.String r0 = r0.A06     // Catch:{ MalformedURLException -> 0x1003 }
            r1.A0E(r0)     // Catch:{ MalformedURLException -> 0x1003 }
            java.lang.String r0 = "location_page_info_page"
            r1.A0S = r0     // Catch:{ MalformedURLException -> 0x1003 }
            r1.A0A()     // Catch:{ MalformedURLException -> 0x1003 }
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y     // Catch:{ MalformedURLException -> 0x1003 }
            X.C15387Ubm.A04(r6, r0)     // Catch:{ MalformedURLException -> 0x1003 }
            java.lang.String r0 = "website"
            X.C15387Ubm.A05(r6, r0)     // Catch:{ MalformedURLException -> 0x1003 }
            goto L_0x1003
        L_0x0fb8:
            X.UdB r0 = r2.A00
            X.VOS r0 = r0.A02
            java.lang.String r1 = "tel:"
            X.Ubm r5 = r0.A00
            X.UXv r0 = r5.A02
            java.lang.String r0 = r0.A09
            java.lang.String r2 = X.002.A0R(r1, r0)
            r0 = 10
            java.lang.String r0 = X.C66579MXk.A00(r0)
            android.content.Intent r1 = X.DbY.A06(r0)
            android.net.Uri r0 = X.0cp.A03(r2)
            r1.setData(r0)
            X.0kR.A0H(r1, r5)
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            X.C15387Ubm.A04(r5, r0)
            java.lang.String r0 = "call"
            goto L_0x1000
        L_0x0fe4:
            X.UdB r0 = r2.A00
            X.VOS r0 = r0.A02
            X.Ubm r5 = r0.A00
            android.content.Context r3 = r5.getContext()
            X.UXv r0 = r5.A02
            java.lang.String r2 = r0.A05
            java.lang.String r1 = r0.A07
            java.lang.String r0 = r0.A0B
            X.FFS.A03(r3, r2, r1, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.C15387Ubm.A04(r5, r0)
            java.lang.String r0 = "address"
        L_0x1000:
            X.C15387Ubm.A05(r5, r0)
        L_0x1003:
            r0 = -1246505470(0xffffffffb5b3d602, float:-1.3398824E-6)
            X.AnonymousClass0fD.A0C(r0, r4)
            return
        L_0x100a:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0y()
            r1 = 1544131605(0x5c099415, float:1.54899559E17)
            X.AnonymousClass0fD.A0C(r1, r0)
            throw r2
        L_0x1015:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0y()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WBG.onClick(android.view.View):void");
    }

    public static int A00(WBG wbg, int i) {
        int A05 = AnonymousClass0fD.A05(i);
        C19354WVv.A00((C19354WVv) wbg.A01, (User) wbg.A02);
        return A05;
    }
}
