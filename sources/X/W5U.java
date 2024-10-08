package X;

import android.app.Activity;
import android.content.DialogInterface;

public final class W5U implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;

    public W5U(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static C358248ab A00(Activity activity, CharSequence charSequence, Object obj, String str, String str2) {
        C358248ab r2 = new C358248ab(activity);
        r2.A05 = str;
        r2.A0q(charSequence);
        r2.A0g(new C18844W5n(obj, 5));
        r2.A0b(new W5U(obj, 27), str2);
        return r2;
    }

    public static void A01(C358248ab r1, Object obj, int i, int i2) {
        r1.A0G(new W5U(obj, i), i2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v32, resolved type: com.instagram.api.schemas.StoryPromptType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: com.instagram.api.schemas.StoryPromptType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v57, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v113, resolved type: X.5B2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: com.instagram.api.schemas.StoryPromptType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v36, resolved type: com.instagram.api.schemas.StoryPromptType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v37, resolved type: com.instagram.api.schemas.StoryPromptType} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0258, code lost:
        r2 = r0.Bhw();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x025e, code lost:
        if (r2 != com.instagram.api.schemas.StoryPromptType.A0G) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0260, code lost:
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0261, code lost:
        r2 = (X.AnonymousClass5B2) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0263, code lost:
        if (r2 == null) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0265, code lost:
        r0 = r2.Bhq();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0269, code lost:
        if (r0 == null) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x026b, code lost:
        r1 = r0.getId();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x026f, code lost:
        if (r1 == null) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0271, code lost:
        r4.A03((android.content.DialogInterface.OnDismissListener) null, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0275, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0276, code lost:
        r1 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0421, code lost:
        r13.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0424, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0440, code lost:
        r0.EHd();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0443, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x045f, code lost:
        r1.A0A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0462, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x04b5, code lost:
        r2.A0F(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x04b8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x04e1, code lost:
        X.AnonymousClass9F0.A03(r3, r4, r2, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x04e4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0514, code lost:
        r2.A0F(r1, r0);
        X.C15273UZb.A01(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x051a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x051b, code lost:
        r0 = "promoteLogger";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x055f, code lost:
        X.DbZ.A1R(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0562, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0563, code lost:
        r0 = "adsManagerLogger";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0565, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x056c, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0052, code lost:
        r0 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01f9, code lost:
        r0.onBackPressed();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01fc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0054, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0228, code lost:
        r4 = new X.W01(r3, r1, r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0231, code lost:
        if (r2.A0e != X.C250963mL.MEDIA) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0233, code lost:
        r0 = r2.A0b;
        r0.getClass();
        r0 = r0.A0C.C0x();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x023e, code lost:
        if (r0 == null) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0240, code lost:
        r3 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0244, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0249, code lost:
        if (r3.hasNext() == false) goto L_0x0261;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x024b, code lost:
        r1 = r3.next();
        r0 = r1.Bhq();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0256, code lost:
        if (r0 == null) goto L_0x025c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0056, code lost:
        r0 = r0.A04;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r13, int r14) {
        /*
            r12 = this;
            int r0 = r12.A00
            switch(r0) {
                case 0: goto L_0x0417;
                case 1: goto L_0x040b;
                case 2: goto L_0x03fc;
                case 3: goto L_0x052b;
                case 4: goto L_0x051e;
                case 5: goto L_0x03cf;
                case 6: goto L_0x0368;
                case 7: goto L_0x034b;
                case 8: goto L_0x033f;
                case 9: goto L_0x0508;
                case 10: goto L_0x04ed;
                case 11: goto L_0x04c6;
                case 12: goto L_0x04ed;
                case 13: goto L_0x04b9;
                case 14: goto L_0x04a1;
                case 15: goto L_0x047d;
                case 16: goto L_0x0468;
                case 17: goto L_0x0337;
                case 18: goto L_0x032f;
                case 19: goto L_0x0444;
                case 20: goto L_0x0327;
                case 21: goto L_0x017d;
                case 22: goto L_0x031e;
                case 23: goto L_0x0155;
                case 24: goto L_0x02fc;
                case 25: goto L_0x02f4;
                case 26: goto L_0x02af;
                case 27: goto L_0x02a7;
                case 28: goto L_0x0421;
                case 29: goto L_0x0112;
                case 30: goto L_0x0108;
                case 31: goto L_0x0288;
                case 32: goto L_0x0279;
                case 33: goto L_0x0082;
                case 34: goto L_0x005a;
                case 35: goto L_0x0005;
                case 36: goto L_0x0005;
                case 37: goto L_0x021c;
                case 38: goto L_0x021c;
                case 39: goto L_0x0005;
                case 40: goto L_0x0005;
                case 41: goto L_0x020f;
                case 42: goto L_0x0205;
                case 43: goto L_0x01fd;
                case 44: goto L_0x01f5;
                case 45: goto L_0x01ee;
                case 46: goto L_0x01b1;
                case 47: goto L_0x01a1;
                case 48: goto L_0x0438;
                case 49: goto L_0x0197;
                case 50: goto L_0x031e;
                case 51: goto L_0x000c;
                case 52: goto L_0x004c;
                case 53: goto L_0x000d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r12.A01
            X.6ZD r0 = (X.AnonymousClass6ZD) r0
            r0.A00()
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r0 = r12.A01
            X.W9t r0 = (X.W9t) r0
            androidx.fragment.app.FragmentActivity r5 = r0.A00
            X.6kI r4 = r0.A02
            com.instagram.common.session.UserSession r2 = r4.A01
            X.1Xj r1 = r0.A01
            r0 = 23
            X.Ufo r3 = new X.Ufo
            r3.<init>(r12, r0)
            r0 = 1
            X.0qQ.A0B(r2, r0)
            X.1NY r2 = X.DbU.A0M(r2)
            java.lang.String r0 = r1.A30()
            if (r0 == 0) goto L_0x0425
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "commerce/story/%s/remove_multi_product_sticker/"
            X.DbU.A1P(r2, r0, r1)
            r2.A04()
            java.lang.Class<X.K1b> r1 = X.C61290K1b.class
            java.lang.Class<X.LJl> r0 = X.C64024LJl.class
            X.1OC r1 = X.DbU.A0S(r2, r1, r0)
            r1.A00 = r3
            X.0gy r0 = X.AnonymousClass07i.A00(r5)
            X.1ES.A00(r5, r0, r1)
            goto L_0x0052
        L_0x004c:
            java.lang.Object r0 = r12.A01
            X.W9t r0 = (X.W9t) r0
            X.6kI r4 = r0.A02
        L_0x0052:
            X.6ac r0 = r4.A00
            if (r0 == 0) goto L_0x000c
            X.4mU r0 = r0.A04
            goto L_0x0440
        L_0x005a:
            r0 = -1
            if (r14 != r0) goto L_0x000c
            java.lang.Object r1 = r12.A01
            X.TrG r1 = (X.C14177TrG) r1
            X.VgE r0 = r1.A01
            if (r0 == 0) goto L_0x042a
            com.instagram.reels.question.model.QuestionResponseModel r0 = r0.A00
            com.instagram.user.model.User r6 = r0.A04
            if (r6 == 0) goto L_0x042a
            X.1Z4 r2 = X.1Z4.A00
            android.app.Activity r3 = r1.A06
            com.instagram.common.session.UserSession r5 = r1.A0A
            X.0iw r0 = r1.A08
            java.lang.String r8 = r0.getModuleName()
            java.lang.String r10 = r6.getUsername()
            r4 = 0
            r7 = r4
            r9 = r4
            r2.A00(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x0082:
            r0 = -1
            if (r14 != r0) goto L_0x000c
            java.lang.Object r6 = r12.A01
            X.TrG r6 = (X.C14177TrG) r6
            android.app.Activity r7 = r6.A06
            X.07i r3 = r6.A07
            X.VgE r0 = r6.A01
            if (r0 == 0) goto L_0x042f
            com.instagram.common.session.UserSession r2 = r6.A0A
            X.1OC r1 = X.C18238Vo5.A01(r2, r0)
            r0 = 38
            X.C15621Ufn.A00(r1, r6, r0)
            X.1ES.A00(r7, r3, r1)
            r0 = 34
            X.W5U r1 = new X.W5U
            r1.<init>(r6, r0)
            X.VgE r0 = r6.A01
            r5 = 0
            if (r0 == 0) goto L_0x0106
            com.instagram.reels.question.model.QuestionResponseModel r0 = r0.A00
            com.instagram.user.model.User r0 = r0.A04
            if (r0 == 0) goto L_0x0106
            java.lang.String r0 = r0.getId()
        L_0x00b5:
            boolean r0 = X.2R8.A05(r2, r0)
            if (r0 != 0) goto L_0x000c
            android.content.res.Resources r4 = r7.getResources()
            X.8ab r3 = new X.8ab
            r3.<init>((android.app.Activity) r7)
            r0 = 2131971048(0x7f134be8, float:1.9579064E38)
            r3.A0I(r1, r0)
            r3.A0C(r1)
            r1 = 2131971050(0x7f134bea, float:1.9579068E38)
            r2 = 1
            X.VgE r0 = r6.A01
            if (r0 == 0) goto L_0x0104
            com.instagram.reels.question.model.QuestionResponseModel r0 = r0.A00
            com.instagram.user.model.User r0 = r0.A04
            if (r0 == 0) goto L_0x0104
            java.lang.String r0 = r0.getUsername()
        L_0x00df:
            java.lang.String r0 = X.AnonymousClass7TF.A0e(r4, r0, r1)
            r3.A05 = r0
            r1 = 2131971049(0x7f134be9, float:1.9579066E38)
            X.VgE r0 = r6.A01
            if (r0 == 0) goto L_0x00f6
            com.instagram.reels.question.model.QuestionResponseModel r0 = r0.A00
            com.instagram.user.model.User r0 = r0.A04
            if (r0 == 0) goto L_0x00f6
            java.lang.String r5 = r0.getUsername()
        L_0x00f6:
            java.lang.String r0 = X.AnonymousClass7TF.A0e(r4, r5, r1)
            r3.A0q(r0)
            r3.A0s(r2)
            X.DbT.A1V(r3)
            return
        L_0x0104:
            r0 = r5
            goto L_0x00df
        L_0x0106:
            r0 = r5
            goto L_0x00b5
        L_0x0108:
            java.lang.Object r0 = r12.A01
            X.X8Y r0 = (X.X8Y) r0
            if (r0 == 0) goto L_0x000c
            r0.onCancel()
            return
        L_0x0112:
            java.lang.Object r5 = r12.A01
            X.WWr r5 = (X.C19376WWr) r5
            X.1Xj r0 = r5.A01
            r4 = 0
            if (r0 == 0) goto L_0x012d
            com.instagram.user.model.User r0 = r0.A29()
            if (r0 == 0) goto L_0x012d
            X.VYF r0 = r5.A04
            if (r0 == 0) goto L_0x012d
            java.lang.String r4 = r0.A01
            if (r4 != 0) goto L_0x0137
            java.lang.String r0 = "pageUrl"
            goto L_0x0565
        L_0x012d:
            X.1Xj r0 = r5.A01
            if (r0 == 0) goto L_0x0137
            X.1Xy r0 = r0.A0C
            java.lang.String r4 = r0.B4S()
        L_0x0137:
            X.SUL r1 = r5.A03
            if (r1 != 0) goto L_0x045f
            if (r4 == 0) goto L_0x000c
            X.32G r3 = r5.A07
            androidx.fragment.app.FragmentActivity r2 = r3.requireActivity()
            com.instagram.common.session.UserSession r1 = r5.A08
            X.2EG r0 = X.2EG.A2m
            X.SUL r1 = X.Dba.A0J(r2, r1, r0, r4)
            java.lang.String r0 = r3.getModuleName()
            r1.A0S = r0
            r5.A03 = r1
            goto L_0x045f
        L_0x0155:
            java.lang.Object r5 = r12.A01
            X.Umf r5 = (X.C15998Umf) r5
            X.VsB r2 = X.C16039UnS.A00(r5)
            java.lang.String r1 = X.C15998Umf.A02(r5)
            X.XB6 r4 = r2.A00
            java.lang.String r3 = r2.A01
            r0 = 0
            android.os.Bundle r2 = X.C18462VsB.A00(r2, r1, r0)
            java.lang.String r1 = "lead_gen_multi_step_consumer_questions"
            java.lang.String r0 = "discard_confirmation_pop_up_dialog_leave_button"
            X.XB6.A00(r2, r4, r3, r1, r0)
            X.UYd r0 = r5.A03
            if (r0 == 0) goto L_0x000c
            X.QAL r0 = r0.A00
            if (r0 != 0) goto L_0x0434
            java.lang.String r0 = "dialog"
            goto L_0x0565
        L_0x017d:
            java.lang.Object r3 = r12.A01
            X.WAD r3 = (X.WAD) r3
            java.lang.CharSequence[] r0 = r3.A06
            r1 = r0[r14]
            java.lang.String r0 = r3.A05
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000c
            X.X99 r2 = r3.A02
            X.Vc5 r1 = r3.A04
            int r0 = r3.A00
            r2.D9R(r1, r0)
            return
        L_0x0197:
            java.lang.Object r0 = r12.A01
            X.Vhf r0 = (X.C17888Vhf) r0
            X.0sa r0 = r0.A02
            r0.invoke()
            return
        L_0x01a1:
            java.lang.Object r0 = r12.A01
            android.content.Context r1 = X.DbT.A08(r0)
            java.lang.String r0 = "https://www.facebook.com/help/instagram/518659859068596"
            android.net.Uri r0 = X.0cp.A03(r0)
            X.0kR.A0F(r1, r0)
            return
        L_0x01b1:
            java.lang.Object r1 = r12.A01
            X.VbY r1 = (X.C17642VbY) r1
            com.instagram.user.model.Product r0 = r1.A03
            r0.getClass()
            com.instagram.user.model.User r0 = r0.A0B
            androidx.fragment.app.FragmentActivity r3 = r1.A00
            r3.onBackPressed()
            X.3kF r2 = X.C249713kF.A00
            com.instagram.common.session.UserSession r5 = r1.A01
            X.4DU r6 = r1.A02
            java.lang.String r7 = r1.A06
            java.lang.String r8 = r1.A05
            java.lang.String r10 = X.AnonymousClass3ZA.A00(r0)
            r10.getClass()
            r11 = 0
            if (r0 == 0) goto L_0x01ec
            java.lang.String r11 = X.C13988Tno.A0b(r0)
            X.4Cl r0 = r0.A03
            com.instagram.api.schemas.SellerShoppableFeedType r4 = r0.BsB()
        L_0x01df:
            java.lang.String r9 = "unavailable_product_dialog_shop_button"
            X.W2P r1 = r2.A0N(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = 1
            r1.A0L = r0
            r1.A05()
            return
        L_0x01ec:
            r4 = r11
            goto L_0x01df
        L_0x01ee:
            java.lang.Object r0 = r12.A01
            X.VbY r0 = (X.C17642VbY) r0
            androidx.fragment.app.FragmentActivity r0 = r0.A00
            goto L_0x01f9
        L_0x01f5:
            java.lang.Object r0 = r12.A01
            androidx.activity.ComponentActivity r0 = (androidx.activity.ComponentActivity) r0
        L_0x01f9:
            r0.onBackPressed()
            return
        L_0x01fd:
            java.lang.Object r1 = r12.A01
            X.K4f r1 = (X.C61363K4f) r1
            r0 = 1
            r1.A0S = r0
            return
        L_0x0205:
            r0 = 0
            X.C18539Vtr.A00 = r0
            java.lang.Object r0 = r12.A01
            X.DbS.A1U(r0)
            goto L_0x0421
        L_0x020f:
            java.lang.Object r0 = r12.A01
            X.WPg r0 = (X.C19200WPg) r0
            android.app.Activity r3 = r0.A01
            X.0hq r1 = r0.A04
            X.3uh r2 = r0.A0A
            com.instagram.common.session.UserSession r0 = r0.A07
            goto L_0x0228
        L_0x021c:
            java.lang.Object r0 = r12.A01
            X.WPh r0 = (X.C19201WPh) r0
            android.app.Activity r3 = r0.A04
            X.0hq r1 = r0.A07
            X.3uh r2 = r0.A0F
            com.instagram.common.session.UserSession r0 = r0.A0B
        L_0x0228:
            X.W01 r4 = new X.W01
            r4.<init>(r3, r1, r0, r2)
            X.3mL r1 = r2.A0e
            X.3mL r0 = X.C250963mL.MEDIA
            if (r1 != r0) goto L_0x0276
            X.1Xj r0 = r2.A0b
            r0.getClass()
            X.1Xy r0 = r0.A0C
            java.util.List r0 = r0.C0x()
            if (r0 == 0) goto L_0x0276
            java.util.Iterator r3 = r0.iterator()
        L_0x0244:
            boolean r0 = r3.hasNext()
            r2 = 0
            if (r0 == 0) goto L_0x0261
            java.lang.Object r1 = r3.next()
            r0 = r1
            X.5B2 r0 = (X.AnonymousClass5B2) r0
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r0.Bhq()
            if (r0 == 0) goto L_0x025c
            com.instagram.api.schemas.StoryPromptType r2 = r0.Bhw()
        L_0x025c:
            com.instagram.api.schemas.StoryPromptType r0 = com.instagram.api.schemas.StoryPromptType.STORY_TEMPLATE
            if (r2 != r0) goto L_0x0244
            r2 = r1
        L_0x0261:
            X.5B2 r2 = (X.AnonymousClass5B2) r2
            if (r2 == 0) goto L_0x0276
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r2.Bhq()
            if (r0 == 0) goto L_0x0276
            java.lang.String r1 = r0.getId()
            if (r1 == 0) goto L_0x0276
        L_0x0271:
            r0 = 0
            r4.A03(r0, r1)
            return
        L_0x0276:
            java.lang.String r1 = ""
            goto L_0x0271
        L_0x0279:
            java.lang.Object r1 = r12.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            r0 = 0
            java.lang.String r3 = "av_enrollment"
            java.lang.String r4 = "av_upsell"
            r2 = r0
            r5 = r0
            X.STD.A04(r0, r1, r2, r3, r4, r5)
            return
        L_0x0288:
            java.lang.Object r4 = r12.A01
            X.Uc0 r4 = (X.C15397Uc0) r4
            X.1a8 r3 = r4.A02
            X.OVP r0 = r4.A07
            X.VT5 r1 = X.OVP.A00(r0)
            X.MgO r0 = new X.MgO
            r0.<init>(r1)
            X.1aS r2 = X.1aF.A01(r0)
            r1 = 3
            X.Wgk r0 = new X.Wgk
            r0.<init>(r4, r1)
            r3.A02(r2, r0)
            return
        L_0x02a7:
            java.lang.Object r0 = r12.A01
            X.X8T r0 = (X.X8T) r0
            r0.DTg()
            return
        L_0x02af:
            java.lang.Object r1 = r12.A01
            X.X8T r1 = (X.X8T) r1
            X.WYa r1 = (X.C19407WYa) r1
            int r0 = r1.A00
            java.lang.Object r1 = r1.A01
            if (r0 == 0) goto L_0x02d7
            X.UaL r1 = (X.C15314UaL) r1
            X.0eM r0 = r1.A0F
            java.lang.Object r3 = r0.getValue()
            X.U8h r3 = (X.C14771U8h) r3
            X.0eM r1 = r1.A0G
            X.U8b r0 = X.C13990Tnq.A0S(r1)
            java.lang.String r2 = r0.A00
            X.U8b r0 = X.C13990Tnq.A0S(r1)
            boolean r0 = r0.A03
        L_0x02d3:
            r3.A01(r2, r0)
            return
        L_0x02d7:
            X.Umo r1 = (X.C16007Umo) r1
            X.0eM r0 = r1.A03
            java.lang.Object r3 = r0.getValue()
            X.U8h r3 = (X.C14771U8h) r3
            X.0eM r1 = r1.A04
            java.lang.Object r0 = r1.getValue()
            X.U8j r0 = (X.C14773U8j) r0
            java.lang.String r2 = r0.A00
            java.lang.Object r0 = r1.getValue()
            X.Unk r0 = (X.C16057Unk) r0
            boolean r0 = r0.A00
            goto L_0x02d3
        L_0x02f4:
            java.lang.Object r0 = r12.A01
            X.X8T r0 = (X.X8T) r0
            r0.DZL()
            return
        L_0x02fc:
            r0 = 0
            X.0qQ.A0B(r13, r0)
            java.lang.Object r0 = r12.A01
            X.Umf r0 = (X.C15998Umf) r0
            X.VsB r2 = X.C16039UnS.A00(r0)
            java.lang.String r1 = X.C15998Umf.A02(r0)
            X.XB6 r4 = r2.A00
            java.lang.String r3 = r2.A01
            r0 = 0
            android.os.Bundle r2 = X.C18462VsB.A00(r2, r1, r0)
            java.lang.String r1 = "lead_gen_multi_step_consumer_questions"
            java.lang.String r0 = "discard_confirmation_pop_up_dialog_stay_button"
            X.XB6.A00(r2, r4, r3, r1, r0)
            goto L_0x0421
        L_0x031e:
            java.lang.Object r1 = r12.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 1
            r1.setEnabled(r0)
            return
        L_0x0327:
            java.lang.Object r0 = r12.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.DbT.A1I(r0)
            return
        L_0x032f:
            java.lang.Object r0 = r12.A01
            X.X6V r0 = (X.X6V) r0
            r0.Dqv()
            return
        L_0x0337:
            java.lang.Object r0 = r12.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.DbX.A1I(r0)
            return
        L_0x033f:
            java.lang.Object r1 = r12.A01
            X.0sL r1 = (X.0sL) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            r1.invoke(r13, r0)
            return
        L_0x034b:
            java.lang.Object r4 = r12.A01
            X.UaR r4 = (X.C15319UaR) r4
            X.0eM r0 = r4.A05
            X.WGU r3 = X.C13990Tnq.A0M(r0)
            X.UzE r0 = X.C16678UzE.NON_DISCRIMINATION
            java.lang.String r2 = r0.toString()
            java.lang.String r1 = "DECLINED_NON_DISCRIMINATION"
            r0 = 0
            r3.A0Y(r2, r1, r0)
            r0 = 0
            r4.A02 = r0
            X.DbT.A1J(r4)
            return
        L_0x0368:
            java.lang.Object r5 = r12.A01
            X.UZh r5 = (X.C15279UZh) r5
            X.0eM r0 = r5.A0E
            java.lang.Object r4 = r0.getValue()
            X.VwK r4 = (X.C18662VwK) r4
            com.instagram.business.promote.model.PromoteData r0 = X.C15279UZh.A00(r5)
            java.lang.String r3 = r0.A1S
            java.lang.String r2 = "campaign_controls_budget_duration"
            java.lang.String r1 = "update_budget_duration_button"
            r0 = 0
            r4.A0A(r2, r1, r3, r0)
            X.0eM r0 = r5.A0I
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r0)
            androidx.fragment.app.FragmentActivity r4 = r5.requireActivity()
            com.instagram.business.promote.model.PromoteData r0 = X.C15279UZh.A00(r5)
            java.lang.String r8 = r0.A1S
            if (r8 == 0) goto L_0x03c7
            java.lang.String r9 = r5.A07
            com.instagram.business.promote.model.PromoteData r0 = X.C15279UZh.A00(r5)
            int r10 = r0.A0A
            com.instagram.business.promote.model.PromoteData r0 = X.C15279UZh.A00(r5)
            int r11 = r0.A07
            com.instagram.business.promote.model.PromoteData r0 = X.C15279UZh.A00(r5)
            java.lang.String r1 = r0.A1K
            if (r1 == 0) goto L_0x03bf
            X.WOj r6 = new X.WOj
            r6.<init>(r5)
            r0 = 0
            X.0qQ.A0B(r7, r0)
            r6.onStart()
            X.WOA r3 = new X.WOA
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            X.C18676VwZ.A01(r4, r3, r7, r1)
            return
        L_0x03bf:
            java.lang.String r1 = "entryPoint parameter cannot be null"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x03c7:
            java.lang.String r1 = "mediaId parameter cannot be null"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x03cf:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r1 = "entry_point"
            java.lang.String r0 = "direct_inbox_setting_entrypoint"
            r2.put(r1, r0)
            r0 = 558(0x22e, float:7.82E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.DiU r3 = X.C46649DiU.A04(r0, r2)
            java.lang.Object r0 = r12.A01
            X.Uac r0 = (X.C15328Uac) r0
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            X.0eM r0 = r0.A0f
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = new com.instagram.bloks.hosting.IgBloksScreenConfig
            r0.<init>((X.0lg) r1)
            r3.A0D(r2, r0)
            return
        L_0x03fc:
            java.lang.Object r0 = r12.A01
            com.instagram.archive.fragment.ArchiveReelFragment r0 = (com.instagram.archive.fragment.ArchiveReelFragment) r0
            X.UdK r2 = r0.A00
            X.VM4 r1 = r2.A04
            r0 = 1
            r1.A00 = r0
            r2.A0C()
            return
        L_0x040b:
            java.lang.Object r0 = r12.A01
            X.U7x r0 = (X.U7x) r0
            X.00Y r1 = r0.A07
            java.lang.String r0 = "android.permission.CAMERA"
            r1.A02(r0)
            return
        L_0x0417:
            java.lang.Object r1 = r12.A01
            X.U9F r1 = (X.U9F) r1
            r1.A00 = r14
            r0 = -1
            r1.onClick(r13, r0)
        L_0x0421:
            r13.dismiss()
            return
        L_0x0425:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x042a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x042f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0434:
            r0.dismiss()
            return
        L_0x0438:
            java.lang.Object r0 = r12.A01
            X.VQC r0 = (X.VQC) r0
            X.6iY r0 = r0.A00
            X.4mU r0 = r0.A02
        L_0x0440:
            r0.EHd()
            return
        L_0x0444:
            java.lang.Object r4 = r12.A01
            X.VhY r4 = (X.C17881VhY) r4
            android.app.Activity r3 = r4.A01
            if (r3 == 0) goto L_0x0463
            com.instagram.common.session.UserSession r2 = r4.A02
            X.2EG r1 = X.2EG.A1a
            java.lang.String r0 = "https://www.facebook.com/legal/camera_effects_platform_terms"
            X.SUL r1 = X.Dba.A0J(r3, r2, r1, r0)
            java.lang.String r0 = r2.A06
            r1.A0E(r0)
            java.lang.String r0 = r4.A03
            r1.A0S = r0
        L_0x045f:
            r1.A0A()
            return
        L_0x0463:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0468:
            java.lang.Object r2 = r12.A01
            X.UZb r2 = (X.C15273UZb) r2
            X.Vw9 r1 = r2.A02
            if (r1 == 0) goto L_0x0474
            r0 = 0
            r1.A05(r0)
        L_0x0474:
            X.WGU r2 = r2.A01
            if (r2 == 0) goto L_0x051b
            X.UzE r1 = X.C16678UzE.DESTINATION_WEBSITE
            java.lang.String r0 = "reduce_hacky_way_promote_igwa_linking_dialog_cancel_button"
            goto L_0x04b5
        L_0x047d:
            java.lang.Object r4 = r12.A01
            X.UZb r4 = (X.C15273UZb) r4
            X.WGU r2 = r4.A01
            if (r2 == 0) goto L_0x051b
            X.UzE r1 = X.C16678UzE.DESTINATION_WEBSITE
            java.lang.String r0 = "reduce_hacky_way_promote_igwa_linking_dialog_add_whatsapp_button"
            r2.A0F(r1, r0)
            androidx.fragment.app.FragmentActivity r3 = r4.requireActivity()
            com.instagram.common.session.UserSession r2 = r4.A05
            if (r2 == 0) goto L_0x0499
            java.lang.String r1 = "PromoteWebsite"
            java.lang.String r0 = "linking_entry_point_unconventional_wa_ads"
            goto L_0x04e1
        L_0x0499:
            X.DbS.A14()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x04a1:
            java.lang.Object r2 = r12.A01
            X.UZb r2 = (X.C15273UZb) r2
            X.Vw9 r1 = r2.A02
            if (r1 == 0) goto L_0x04ad
            r0 = 0
            r1.A05(r0)
        L_0x04ad:
            X.WGU r2 = r2.A01
            if (r2 == 0) goto L_0x051b
            X.UzE r1 = X.C16678UzE.DESTINATION_WEBSITE
            java.lang.String r0 = "reduce_hacky_way_promote_ctwa_dialog_cancel_button"
        L_0x04b5:
            r2.A0F(r1, r0)
            return
        L_0x04b9:
            java.lang.Object r3 = r12.A01
            X.UZb r3 = (X.C15273UZb) r3
            X.WGU r2 = r3.A01
            if (r2 == 0) goto L_0x051b
            X.UzE r1 = X.C16678UzE.DESTINATION_WEBSITE
            java.lang.String r0 = "reduce_hacky_way_promote_ctwa_dialog_change_ad_goal_button"
            goto L_0x0514
        L_0x04c6:
            java.lang.Object r4 = r12.A01
            X.UZb r4 = (X.C15273UZb) r4
            X.WGU r2 = r4.A01
            if (r2 == 0) goto L_0x051b
            X.UzE r1 = X.C16678UzE.DESTINATION_WEBSITE
            java.lang.String r0 = "soft_upsell_for_wa_hacky_link_whatsapp_button"
            r2.A0F(r1, r0)
            androidx.fragment.app.FragmentActivity r3 = r4.requireActivity()
            com.instagram.common.session.UserSession r2 = r4.A05
            if (r2 == 0) goto L_0x04e5
            java.lang.String r1 = "PromoteWebsite"
            java.lang.String r0 = "linking_entry_point_soft_upsell_hacky_wa_ads"
        L_0x04e1:
            X.AnonymousClass9F0.A03(r3, r4, r2, r1, r0)
            return
        L_0x04e5:
            X.DbS.A14()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x04ed:
            java.lang.Object r3 = r12.A01
            X.UZb r3 = (X.C15273UZb) r3
            X.Vw9 r1 = r3.A02
            if (r1 == 0) goto L_0x04f9
            r0 = 0
            r1.A05(r0)
        L_0x04f9:
            X.WGU r2 = r3.A01
            if (r2 == 0) goto L_0x051b
            X.UzE r1 = X.C16678UzE.DESTINATION_WEBSITE
            java.lang.String r0 = "soft_upsell_for_wa_hacky_link_cancel_button"
            r2.A0F(r1, r0)
            X.C15273UZb.A03(r3)
            return
        L_0x0508:
            java.lang.Object r3 = r12.A01
            X.UZb r3 = (X.C15273UZb) r3
            X.WGU r2 = r3.A01
            if (r2 == 0) goto L_0x051b
            X.UzE r1 = X.C16678UzE.DESTINATION_WEBSITE
            java.lang.String r0 = "soft_upsell_for_wa_hacky_link_change_ad_goal_button"
        L_0x0514:
            r2.A0F(r1, r0)
            X.C15273UZb.A01(r3)
            return
        L_0x051b:
            java.lang.String r0 = "promoteLogger"
            goto L_0x0565
        L_0x051e:
            java.lang.Object r0 = r12.A01
            X.Uac r0 = (X.C15328Uac) r0
            X.VwK r0 = r0.A07
            if (r0 == 0) goto L_0x0563
            X.0wc r1 = r0.A00
            java.lang.String r0 = "igd_inbox_ad_creation_education_dialog_get_started_click"
            goto L_0x055f
        L_0x052b:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r1 = "entry_point"
            java.lang.String r0 = "direct_inbox_setting_entrypoint"
            r2.put(r1, r0)
            r0 = 558(0x22e, float:7.82E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.DiU r4 = X.C46649DiU.A04(r0, r2)
            java.lang.Object r3 = r12.A01
            X.Uac r3 = (X.C15328Uac) r3
            androidx.fragment.app.FragmentActivity r2 = r3.requireActivity()
            X.0eM r0 = r3.A0f
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = new com.instagram.bloks.hosting.IgBloksScreenConfig
            r0.<init>((X.0lg) r1)
            r4.A0D(r2, r0)
            X.VwK r0 = r3.A07
            if (r0 == 0) goto L_0x0563
            X.0wc r1 = r0.A00
            java.lang.String r0 = "igd_inbox_ad_creation_education_dialog_learn_more_click"
        L_0x055f:
            X.DbZ.A1R(r1, r0)
            return
        L_0x0563:
            java.lang.String r0 = "adsManagerLogger"
        L_0x0565:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W5U.onClick(android.content.DialogInterface, int):void");
    }
}
