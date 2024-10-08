package X;

import java.util.List;

/* renamed from: X.J6k  reason: case insensitive filesystem */
public final class C59102J6k extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59102J6k(int i, List list, 0sP r4) {
        super(1);
        this.A00 = i;
        switch (i) {
            case 0:
            case 3:
            case 8:
            case 14:
            case 35:
            case 37:
            case 39:
            case 44:
            case 46:
            case 48:
                this.A01 = r4;
                this.A02 = list;
                break;
            default:
                this.A02 = r4;
                this.A01 = list;
                break;
        }
    }

    public static C59102J6k A00(C286575Wy r1, Object obj, Object obj2, int i) {
        C59102J6k j6k = new C59102J6k(i, obj, obj2);
        r1.FLL(j6k);
        return j6k;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: X.JwJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: X.JwJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: X.JwJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: X.JwJ} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x04b7, code lost:
        if (X.AnonymousClass7TF.A1Y(((X.C61068Jw6) r5.A07.getValue()).A03, true) != false) goto L_0x04b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x04d8, code lost:
        X.0qQ.A0F(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x04df, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0522, code lost:
        r0 = (X.I12) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0524, code lost:
        if (r0 == null) goto L_0x06f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0526, code lost:
        r1 = r0.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0528, code lost:
        if (r1 == null) goto L_0x06f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x052a, code lost:
        r0 = r13.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x054d, code lost:
        ((X.0sL) r0).invoke(r1, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0562, code lost:
        r1.invoke(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x059c, code lost:
        X.0kR.A0F(r2, X.0cp.A03(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x05ab, code lost:
        if (r3.equals("learn_more_link") == false) goto L_0x06f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x05d3, code lost:
        if (X.0qQ.A0K(r1, "learn_more_link") != false) goto L_0x05d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x05d5, code lost:
        r0 = X.AnonymousClass000.A00(635);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x05e2, code lost:
        if (r3.equals("ai_terms_link") == false) goto L_0x06f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x05e6, code lost:
        r0 = X.C66579MXk.A00(15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0608, code lost:
        r4.Epw(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x06b1, code lost:
        X.DbS.A1U(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x06f5, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0017, code lost:
        return r1.invoke(X.C51966G9m.A19(r0, r2));
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.A00
            switch(r0) {
                case 1: goto L_0x06b5;
                case 2: goto L_0x069c;
                case 3: goto L_0x0005;
                case 4: goto L_0x0675;
                case 5: goto L_0x0658;
                case 6: goto L_0x060d;
                case 7: goto L_0x0018;
                case 8: goto L_0x0005;
                case 9: goto L_0x05ed;
                case 10: goto L_0x05af;
                case 11: goto L_0x0567;
                case 12: goto L_0x0554;
                case 13: goto L_0x0018;
                case 14: goto L_0x0005;
                case 15: goto L_0x053f;
                case 16: goto L_0x052d;
                case 17: goto L_0x0514;
                case 18: goto L_0x0502;
                case 19: goto L_0x04f3;
                case 20: goto L_0x04e0;
                case 21: goto L_0x0475;
                case 22: goto L_0x0410;
                case 23: goto L_0x032c;
                case 24: goto L_0x030f;
                case 25: goto L_0x02ec;
                case 26: goto L_0x02bf;
                case 27: goto L_0x0237;
                case 28: goto L_0x0224;
                case 29: goto L_0x0146;
                case 30: goto L_0x010e;
                case 31: goto L_0x00bc;
                case 32: goto L_0x006c;
                case 33: goto L_0x0064;
                case 34: goto L_0x0018;
                case 35: goto L_0x0005;
                case 36: goto L_0x0018;
                case 37: goto L_0x0005;
                case 38: goto L_0x0018;
                case 39: goto L_0x0005;
                case 40: goto L_0x0047;
                case 41: goto L_0x0035;
                case 42: goto L_0x0023;
                case 43: goto L_0x0018;
                case 44: goto L_0x0005;
                case 45: goto L_0x0018;
                case 46: goto L_0x0005;
                case 47: goto L_0x0018;
                case 48: goto L_0x0005;
                case 49: goto L_0x0018;
                default: goto L_0x0005;
            }
        L_0x0005:
            int r2 = X.AnonymousClass7TE.A0M(r14)
            java.lang.Object r1 = r13.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r13.A02
        L_0x000f:
            java.lang.Object r0 = X.C51966G9m.A19(r0, r2)
            java.lang.Object r3 = r1.invoke(r0)
            return r3
        L_0x0018:
            int r2 = X.AnonymousClass7TE.A0M(r14)
            java.lang.Object r1 = r13.A02
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r13.A01
            goto L_0x000f
        L_0x0023:
            r0 = 0
            X.0qQ.A0B(r14, r0)
            java.lang.Object r0 = r13.A01
            X.C51965G9l.A1W(r0, r14)
            java.lang.Object r0 = r13.A02
            X.5Oz r0 = (X.C284945Oz) r0
            r0.Epw(r14)
            goto L_0x06f3
        L_0x0035:
            X.C51965G9l.A1U(r14)
            java.lang.Object r2 = r13.A01
            X.GPq r2 = (X.C52369GPq) r2
            X.HOt r1 = X.C54688HOt.A0L
            java.lang.String r0 = r2.A00
            X.C52369GPq.A02(r1, r2, r0)
            java.lang.Object r0 = r13.A02
            goto L_0x06b1
        L_0x0047:
            X.C51965G9l.A1U(r14)
            java.lang.Object r2 = r13.A02
            X.GPq r2 = (X.C52369GPq) r2
            X.HOt r1 = X.C54688HOt.A0X
            java.lang.String r0 = r2.A00
            X.C52369GPq.A02(r1, r2, r0)
            java.lang.String r0 = "https://help.instagram.com/827587459183807"
            android.net.Uri r1 = X.0cp.A03(r0)
            java.lang.Object r0 = r13.A01
            android.content.Context r0 = (android.content.Context) r0
            X.0kR.A0F(r0, r1)
            goto L_0x06f3
        L_0x0064:
            java.lang.Object r1 = r13.A02
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r13.A01
            goto L_0x0562
        L_0x006c:
            X.JV7 r14 = (X.JV7) r14
            r4 = 0
            X.0qQ.A0B(r14, r4)
            java.lang.Object r3 = r13.A02
            X.H0J r3 = (X.H0J) r3
            X.0eM r0 = r3.A00
            java.lang.Object r5 = r0.getValue()
            X.GhM r5 = (X.C53031GhM) r5
            java.lang.Object r2 = r13.A01
            X.GmD r2 = (X.C53327GmD) r2
            android.os.Bundle r1 = r3.mArguments
            if (r1 == 0) goto L_0x00b9
            java.lang.String r0 = "earned_achievements"
            java.util.ArrayList r11 = r1.getParcelableArrayList(r0)
            if (r11 == 0) goto L_0x00b9
        L_0x008e:
            android.os.Bundle r1 = r3.mArguments
            if (r1 == 0) goto L_0x00b7
            java.lang.String r0 = "unearned_achievements"
            java.util.ArrayList r12 = r1.getParcelableArrayList(r0)
        L_0x0098:
            X.0qQ.A0B(r2, r4)
            X.Gn5 r1 = r2.A03
            java.lang.String r0 = "primary_button"
            r5.A01(r14, r2, r0)
            java.lang.String r6 = r14.A02
            java.lang.String r7 = r2.A09
            r10 = 0
            if (r1 == 0) goto L_0x00b4
            java.lang.String r8 = r1.A05
            java.lang.String r9 = r1.A06
            java.lang.String r10 = r1.A04
        L_0x00af:
            X.C53031GhM.A00(r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x06f3
        L_0x00b4:
            r8 = r10
            r9 = r10
            goto L_0x00af
        L_0x00b7:
            r12 = 0
            goto L_0x0098
        L_0x00b9:
            X.0sn r11 = X.0sn.A00
            goto L_0x008e
        L_0x00bc:
            com.instagram.api.schemas.AchievementButtonInfo r14 = (com.instagram.api.schemas.AchievementButtonInfo) r14
            r4 = 0
            X.0qQ.A0B(r14, r4)
            java.lang.Object r3 = r13.A02
            X.H0J r3 = (X.H0J) r3
            X.0eM r0 = r3.A00
            java.lang.Object r5 = r0.getValue()
            X.GhM r5 = (X.C53031GhM) r5
            java.lang.Object r2 = r13.A01
            com.instagram.api.schemas.AchievementIntf r2 = (com.instagram.api.schemas.AchievementIntf) r2
            android.os.Bundle r1 = r3.mArguments
            if (r1 == 0) goto L_0x010b
            java.lang.String r0 = "earned_achievements"
            java.util.ArrayList r11 = r1.getParcelableArrayList(r0)
            if (r11 == 0) goto L_0x010b
        L_0x00de:
            android.os.Bundle r1 = r3.mArguments
            if (r1 == 0) goto L_0x0109
            java.lang.String r0 = "unearned_achievements"
            java.util.ArrayList r12 = r1.getParcelableArrayList(r0)
        L_0x00e8:
            X.0qQ.A0B(r2, r4)
            java.lang.String r0 = "primary_button"
            r5.A02(r14, r2, r0)
            java.lang.String r6 = r14.Avk()
            java.lang.String r7 = r2.BGL()
            java.lang.String r8 = r2.Azq()
            java.lang.String r9 = r2.Azs()
            java.lang.String r10 = r2.Azo()
            X.C53031GhM.A00(r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x06f3
        L_0x0109:
            r12 = 0
            goto L_0x00e8
        L_0x010b:
            X.0sn r11 = X.0sn.A00
            goto L_0x00de
        L_0x010e:
            X.JV7 r14 = (X.JV7) r14
            r1 = 0
            X.0qQ.A0B(r14, r1)
            java.lang.Object r0 = r13.A02
            X.H0J r0 = (X.H0J) r0
            X.0eM r0 = r0.A00
            java.lang.Object r3 = r0.getValue()
            X.GhM r3 = (X.C53031GhM) r3
            java.lang.Object r2 = r13.A01
            X.GmD r2 = (X.C53327GmD) r2
            X.0qQ.A0B(r2, r1)
            X.Gn5 r1 = r2.A03
            java.lang.String r0 = "secondary_button"
            r3.A01(r14, r2, r0)
            java.lang.String r4 = r14.A02
            java.lang.String r5 = r2.A09
            r8 = 0
            if (r1 == 0) goto L_0x0143
            java.lang.String r6 = r1.A05
            java.lang.String r7 = r1.A06
            java.lang.String r8 = r1.A04
        L_0x013b:
            r10 = 0
            X.0sn r9 = X.0sn.A00
            X.C53031GhM.A00(r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x06f3
        L_0x0143:
            r6 = r8
            r7 = r8
            goto L_0x013b
        L_0x0146:
            X.MS9 r14 = (X.MS9) r14
            r2 = 0
            X.0qQ.A0B(r14, r2)
            java.lang.Object r4 = r13.A02
            X.Los r4 = (X.C65189Los) r4
            java.lang.Object r0 = r13.A01
            X.Jvg r0 = (X.C61042Jvg) r0
            boolean r3 = r0.A01
            com.instagram.common.ui.base.IgLinearLayout r5 = r4.A00
            if (r5 != 0) goto L_0x015e
            java.lang.String r5 = "contentView"
            goto L_0x04d8
        L_0x015e:
            r1 = 48
            X.LYG r0 = new X.LYG
            r0.<init>(r1, r4, r14)
            X.AnonymousClass0fU.A00(r0, r5)
            boolean r0 = r14 instanceof X.C61196Jyp
            if (r0 == 0) goto L_0x01b1
            X.Hot r0 = r4.A01
            java.lang.String r5 = "viewHolder"
            if (r0 == 0) goto L_0x04d8
            com.instagram.common.ui.base.IgTextView r0 = r0.A08
            r0.setVisibility(r2)
            X.Hot r0 = r4.A01
            if (r0 == 0) goto L_0x04d8
            android.view.ViewGroup r0 = r0.A03
            r1 = 8
            r0.setVisibility(r1)
            X.Hot r0 = r4.A01
            if (r0 == 0) goto L_0x04d8
            com.instagram.common.ui.base.IgSimpleImageView r0 = r0.A05
            r0.setVisibility(r2)
            X.Hot r0 = r4.A01
            if (r3 == 0) goto L_0x01a6
            if (r0 == 0) goto L_0x04d8
            android.view.View r1 = r0.A00
            if (r1 != 0) goto L_0x019b
            android.view.ViewStub r0 = r0.A04
            android.view.View r1 = r0.inflate()
        L_0x019b:
            X.Hot r0 = r4.A01
            if (r0 == 0) goto L_0x04d8
            r0.A00 = r1
            r1.setVisibility(r2)
            goto L_0x06f3
        L_0x01a6:
            if (r0 == 0) goto L_0x04d8
            android.view.View r0 = r0.A00
            if (r0 == 0) goto L_0x06f3
            r0.setVisibility(r1)
            goto L_0x06f3
        L_0x01b1:
            r0 = 1
            boolean r0 = X.C53520Gpq.A00(r0, r14)
            if (r0 == 0) goto L_0x0219
            X.Gpq r14 = (X.C53520Gpq) r14
            X.Hot r0 = r4.A01
            java.lang.String r5 = "viewHolder"
            if (r0 == 0) goto L_0x04d8
            com.instagram.common.ui.base.IgTextView r0 = r0.A08
            r1 = 8
            r0.setVisibility(r1)
            X.Hot r0 = r4.A01
            if (r0 == 0) goto L_0x04d8
            android.view.View r0 = r0.A00
            if (r0 == 0) goto L_0x01d2
            r0.setVisibility(r1)
        L_0x01d2:
            X.Hot r0 = r4.A01
            if (r0 == 0) goto L_0x04d8
            com.instagram.common.ui.base.IgSimpleImageView r0 = r0.A05
            r0.setVisibility(r1)
            X.Hot r0 = r4.A01
            if (r0 == 0) goto L_0x04d8
            android.view.ViewGroup r0 = r0.A03
            r0.setVisibility(r2)
            X.Hot r0 = r4.A01
            if (r0 == 0) goto L_0x04d8
            com.instagram.common.ui.base.IgTextView r1 = r0.A07
            java.lang.Object r3 = r14.A02
            com.instagram.creation.channels.model.AddChannelsRowChannelInfo r3 = (com.instagram.creation.channels.model.AddChannelsRowChannelInfo) r3
            java.lang.String r0 = r3.A02
            r1.setText(r0)
            X.Hot r0 = r4.A01
            if (r0 == 0) goto L_0x04d8
            com.instagram.common.ui.base.IgTextView r2 = r0.A06
            android.view.View r0 = r0.A02
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r0)
            int r0 = r3.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = X.C66637Ma6.A00(r1, r0)
            r2.setText(r0)
            X.Hot r0 = r4.A01
            if (r0 == 0) goto L_0x04d8
            android.view.View r1 = r0.A01
            r0 = 29
            X.C56800ICx.A00(r1, r0, r14)
            goto L_0x06f3
        L_0x0219:
            boolean r0 = X.C53520Gpq.A00(r2, r14)
            if (r0 != 0) goto L_0x06f3
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0224:
            X.Gms r14 = (X.C53368Gms) r14
            r0 = 0
            X.0qQ.A0B(r14, r0)
            java.lang.Object r1 = r13.A02
            X.GhN r1 = (X.C53032GhN) r1
            java.lang.Object r0 = r13.A01
            android.view.View r0 = (android.view.View) r0
            r1.A03(r0, r14)
            goto L_0x06f3
        L_0x0237:
            X.Gln r14 = (X.C53301Gln) r14
            r5 = 0
            X.0qQ.A0B(r14, r5)
            java.lang.Object r0 = r13.A02
            X.5Oz r0 = (X.C284945Oz) r0
            X.C51967G9n.A16(r0, r5)
            int r1 = r14.A00
            if (r1 == 0) goto L_0x026f
            r0 = 1
            if (r1 != r0) goto L_0x06f3
            java.lang.Object r0 = r13.A01
            X.HiH r0 = (X.C55473HiH) r0
            X.H13 r4 = r0.A00
            java.lang.String r3 = X.H13.A00(r4)
            if (r3 == 0) goto L_0x06f3
            java.lang.String r2 = X.H13.A01(r4)
            if (r2 == 0) goto L_0x06f3
            X.0eM r0 = r4.A07
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            android.content.Context r0 = r4.requireContext()
            X.0qQ.A0B(r1, r5)
            X.HYW.A00(r0, r1, r3, r2, r5)
            goto L_0x06f3
        L_0x026f:
            java.lang.Object r0 = r13.A01
            X.HiH r0 = (X.C55473HiH) r0
            X.H13 r5 = r0.A00
            java.lang.String r8 = X.H13.A00(r5)
            if (r8 == 0) goto L_0x06f3
            java.lang.String r9 = X.H13.A01(r5)
            if (r9 == 0) goto L_0x06f3
            X.0eM r0 = r5.A07
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r0)
            android.content.Context r4 = r5.requireContext()
            r0 = 1
            X.0qQ.A0B(r7, r0)
            r0 = 613(0x265, float:8.59E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0eP r3 = X.AnonymousClass7TE.A1L(r0, r8)
            r0 = 152(0x98, float:2.13E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0eP r2 = X.AnonymousClass7TE.A1L(r0, r9)
            java.lang.String r1 = "feedback_surface"
            java.lang.String r0 = "messenger_ai_creation_thread_theme"
            java.util.LinkedHashMap r1 = X.DbY.A0q(r1, r0, r3, r2)
            java.lang.String r0 = "com.bloks.www.messenger.aicreation.good_feedback_submit_controller"
            X.8ey r0 = X.C359988do.A05(r7, r0, r1)
            X.E7z r3 = new X.E7z
            r6 = r5
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r0.A00(r3)
            r5.schedule(r0)
            goto L_0x06f3
        L_0x02bf:
            X.4ch r2 = X.C51968G9o.A0U(r14)
            java.lang.Object r0 = r13.A02
            X.GnN r0 = (X.C53390GnN) r0
            float r1 = r0.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x06f3
            long r2 = r2.Bwh()
            int r1 = X.C51965G9l.A04(r2)
            if (r1 <= 0) goto L_0x06f3
            int r0 = X.C289005cr.A00(r2)
            if (r0 <= 0) goto L_0x06f3
            java.lang.Object r4 = r13.A01
            X.5Oz r4 = (X.C284945Oz) r4
            double r2 = (double) r1
            double r0 = (double) r0
            double r2 = r2 / r0
            float r0 = (float) r2
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            goto L_0x0608
        L_0x02ec:
            int r2 = X.AnonymousClass7TE.A0M(r14)
            java.lang.Object r1 = r13.A01
            X.5Tq r1 = (X.C286025Tq) r1
            java.lang.String r0 = "link"
            X.62b r0 = X.C51975G9x.A0N(r1, r0, r2)
            if (r0 == 0) goto L_0x06f3
            java.lang.Object r2 = r13.A02
            X.0sa r2 = (X.C62320sa) r2
            java.lang.Object r1 = r0.A02
            java.lang.String r0 = "ai_terms_link"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x06f3
            r2.invoke()
            goto L_0x06f3
        L_0x030f:
            java.lang.Object r2 = r13.A02
            X.GgE r2 = (X.C52961GgE) r2
            X.5Oz r0 = r2.A01
            java.lang.String r0 = X.C51971G9r.A0q(r0)
            boolean r0 = X.C51966G9m.A1X(r0)
            if (r0 == 0) goto L_0x06f3
            java.lang.Object r1 = r13.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.String r0 = r2.A0E()
            r1.invoke(r0)
            goto L_0x06f3
        L_0x032c:
            X.6Gb r14 = (X.C305006Gb) r14
            r7 = 0
            X.0qQ.A0B(r14, r7)
            X.0sK r0 = X.C55418HhO.A00
            r2 = 0
            r4 = 1
            r14.Cf4(r2, r0)
            java.lang.Object r5 = r13.A01
            X.Jw6 r5 = (X.C61068Jw6) r5
            java.lang.Object r3 = r13.A02
            X.H0e r3 = (X.C54135H0e) r3
            r0 = 32
            X.JJU r1 = new X.JJU
            r1.<init>(r0, r5, r3)
            r0 = -2071670537(0xffffffff8484d0f7, float:-3.1224955E-36)
            X.C51967G9n.A10(r14, r1, r0)
            r0 = 49
            X.JJQ r1 = X.JJQ.A00(r3, r0)
            r0 = 67169336(0x400ec38, float:1.5154794E-36)
            X.C51967G9n.A10(r14, r1, r0)
            boolean r0 = r5.A01
            if (r0 == 0) goto L_0x06f3
            X.0eM r9 = r3.A08
            X.0lg r6 = X.AnonymousClass7TF.A0L(r9, r7)
            X.0Tu r8 = X.0Tu.A05
            r0 = 36328349513235725(0x81107100033d0d, double:3.0375327424677546E-306)
            boolean r0 = X.182.A06(r8, r6, r0)
            if (r0 != 0) goto L_0x037c
            r0 = 36328349513956630(0x811071000e3d16, double:3.037532742923658E-306)
            boolean r0 = X.182.A06(r8, r6, r0)
            if (r0 == 0) goto L_0x03df
        L_0x037c:
            X.0lg r6 = X.AnonymousClass7TF.A0L(r9, r7)
            r0 = 36328349513497872(0x81107100073d10, double:3.0375327426335375E-306)
            boolean r6 = X.182.A06(r8, r6, r0)
            if (r6 == 0) goto L_0x0395
            X.0sK r6 = X.C55418HhO.A01
            r14.Cf4(r2, r6)
            X.0sK r6 = X.C55418HhO.A02
            r14.Cf4(r2, r6)
        L_0x0395:
            r11 = 697642422(0x29952db6, float:6.624859E-14)
            r10 = 33
            X.JJU r6 = new X.JJU
            r6.<init>(r10, r5, r3)
            X.C51967G9n.A10(r14, r6, r11)
            java.lang.Object r6 = r5.A03
            boolean r6 = X.AnonymousClass7TF.A1Y(r6, r4)
            if (r6 == 0) goto L_0x03cb
            X.0lg r6 = X.AnonymousClass7TF.A0L(r9, r7)
            boolean r6 = X.182.A06(r8, r6, r0)
            if (r6 == 0) goto L_0x03cb
            java.util.List r6 = X.C54135H0e.A0A
            int r12 = r6.size()
            r11 = 1761801203(0x6902f3f3, float:9.894523E24)
            r10 = 9
            X.GaB r6 = new X.GaB
            r6.<init>((int) r10, (java.lang.Object) r5, (java.lang.Object) r3)
            X.5PJ r6 = X.AnonymousClass5PI.A04(r6, r11, r4)
            r14.CfB(r2, r6, r12)
        L_0x03cb:
            X.0lg r6 = X.AnonymousClass7TF.A0L(r9, r7)
            boolean r0 = X.182.A06(r8, r6, r0)
            if (r0 == 0) goto L_0x040a
            r1 = -428733623(0xffffffffe6720b49, float:-2.8575522E23)
            X.JJR r0 = X.JJR.A00(r3, r7)
            X.C51967G9n.A10(r14, r0, r1)
        L_0x03df:
            X.0sK r0 = X.C55418HhO.A04
            r14.Cf4(r2, r0)
            X.0sK r0 = X.C55418HhO.A05
            r14.Cf4(r2, r0)
            r2 = -1804011373(0xffffffff9478f893, float:-1.2569823E-26)
            r1 = 34
            X.JJU r0 = new X.JJU
            r0.<init>(r1, r5, r3)
            X.C51967G9n.A10(r14, r0, r2)
            X.0eM r0 = r3.A06
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x06f3
            r1 = -548270995(0xffffffffdf520c6d, float:-1.5135592E19)
            X.JJR r0 = X.JJR.A00(r3, r4)
            X.C51967G9n.A10(r14, r0, r1)
            goto L_0x06f3
        L_0x040a:
            X.0sK r0 = X.C55418HhO.A03
            r14.Cf4(r2, r0)
            goto L_0x03df
        L_0x0410:
            java.lang.Object r0 = r13.A02
            X.H0e r0 = (X.C54135H0e) r0
            X.0eM r0 = r0.A09
            X.GhH r6 = X.C51966G9m.A0p(r0)
            java.lang.Object r0 = r13.A01
            X.Jw6 r0 = (X.C61068Jw6) r0
            java.lang.Object r0 = r0.A03
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0431
            X.05G r1 = r6.A06
            X.IQS r0 = X.IQS.A00
            r1.FIA(r0)
            goto L_0x06f3
        L_0x0431:
            X.0eM r0 = r6.A04
            java.lang.Object r0 = r0.getValue()
            X.Hpa r0 = (X.C55913Hpa) r0
            java.lang.Long r7 = r6.A01
            X.0eM r0 = r0.A00
            java.lang.Object r1 = r0.getValue()
            X.0wc r1 = (X.0wc) r1
            java.lang.String r0 = "ig_ai_memu_in_feed_setting_enable"
            X.0Aj r5 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r5.isSampled()
            if (r0 == 0) goto L_0x0469
            java.lang.String r0 = "feed_timeline"
            X.DbS.A1O(r5, r0)
            r3 = -1
            if (r7 == 0) goto L_0x0461
            long r1 = r7.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0461
            r7 = 0
        L_0x0461:
            java.lang.String r0 = "content_id"
            r5.A9F(r0, r7)
            r5.Cgf()
        L_0x0469:
            r2 = 1
            X.6oS r1 = X.C318116oQ.A00(r6)
            r0 = 18
            X.Dba.A1S(r6, r1, r0, r2)
            goto L_0x06f3
        L_0x0475:
            java.lang.Object r0 = r13.A02
            X.H0e r0 = (X.C54135H0e) r0
            X.0eM r0 = r0.A09
            X.GhH r5 = X.C51966G9m.A0p(r0)
            java.lang.Object r0 = r13.A01
            X.Jw6 r0 = (X.C61068Jw6) r0
            boolean r0 = r0.A01
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x04c6
            X.05G r3 = r5.A06
            com.instagram.common.session.UserSession r4 = r5.A02
            X.0Tu r2 = X.AnonymousClass7TF.A0H(r4)
            r0 = 36328349513235725(0x81107100033d0d, double:3.0375327424677546E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 != 0) goto L_0x04a7
            r0 = 36328349513956630(0x811071000e3d16, double:3.037532742923658E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x04c4
        L_0x04a7:
            r1 = 1
            r2 = 1
            X.05G r0 = r5.A07
            java.lang.Object r0 = r0.getValue()
            X.Jw6 r0 = (X.C61068Jw6) r0
            java.lang.Object r0 = r0.A03
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r1)
            if (r0 == 0) goto L_0x04c4
        L_0x04b9:
            r1 = 1
            X.Gpz r0 = new X.Gpz
            r0.<init>(r2, r1)
        L_0x04bf:
            r3.FIA(r0)
            goto L_0x06f3
        L_0x04c4:
            r2 = 0
            goto L_0x04b9
        L_0x04c6:
            X.Hzj r2 = r5.A00
            if (r2 == 0) goto L_0x04d6
            java.lang.String r1 = r5.A03
            X.HOs r0 = X.C54687HOs.A07
            X.C56512Hzj.A00(r0, r2, r1)
            X.05G r3 = r5.A06
            X.IQR r0 = X.IQR.A00
            goto L_0x04bf
        L_0x04d6:
            java.lang.String r5 = "memuLogger"
        L_0x04d8:
            X.0qQ.A0F(r5)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x04e0:
            int r0 = X.AnonymousClass7TE.A0M(r14)
            java.lang.Object r2 = r13.A01
            X.0sL r2 = (X.0sL) r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r13.A02
            r2.invoke(r1, r0)
            goto L_0x06f3
        L_0x04f3:
            r0 = 0
            X.0qQ.A0B(r14, r0)
            java.lang.Object r0 = r13.A02
            java.lang.Object r0 = X.C51966G9m.A18(r0)
            X.GnW r0 = (X.C53399GnW) r0
            java.lang.Object r0 = r0.A02
            goto L_0x0522
        L_0x0502:
            java.lang.Object r1 = r13.A01
            X.I4e r1 = (X.C56605I4e) r1
            java.lang.String r0 = "AI_EXPANDER_RETRY"
            X.C56605I4e.A01(r1, r0)
            java.lang.Object r0 = r13.A02
            X.GgJ r0 = (X.C52966GgJ) r0
            X.C52966GgJ.A01(r0)
            goto L_0x06f3
        L_0x0514:
            r0 = 0
            X.0qQ.A0B(r14, r0)
            java.lang.Object r0 = r13.A02
            java.lang.Object r0 = X.C51966G9m.A18(r0)
            X.Gn8 r0 = (X.C53378Gn8) r0
            java.lang.Object r0 = r0.A02
        L_0x0522:
            X.I12 r0 = (X.I12) r0
            if (r0 == 0) goto L_0x06f3
            X.HmF r1 = r0.A03
            if (r1 == 0) goto L_0x06f3
            java.lang.Object r0 = r13.A01
            goto L_0x054d
        L_0x052d:
            java.lang.Object r0 = r13.A02
            X.GgQ r0 = (X.C52973GgQ) r0
            r0.A0E()
            java.lang.Object r1 = r13.A01
            X.0sL r1 = (X.0sL) r1
            X.8hK r0 = X.C56446Hye.A00
            r1.invoke(r14, r0)
            goto L_0x06f3
        L_0x053f:
            r0 = 0
            X.0qQ.A0B(r14, r0)
            java.lang.Object r0 = r13.A01
            X.I12 r0 = (X.I12) r0
            X.HmF r1 = r0.A03
            if (r1 == 0) goto L_0x06f3
            java.lang.Object r0 = r13.A02
        L_0x054d:
            X.0sL r0 = (X.0sL) r0
            r0.invoke(r1, r14)
            goto L_0x06f3
        L_0x0554:
            java.lang.Object r1 = r13.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r13.A02
            X.GgC r0 = (X.C52959GgC) r0
            X.5Oz r0 = r0.A00
            java.lang.String r0 = X.C51971G9r.A0q(r0)
        L_0x0562:
            r1.invoke(r0)
            goto L_0x06f3
        L_0x0567:
            int r2 = X.AnonymousClass7TE.A0M(r14)
            java.lang.Object r1 = r13.A01
            X.5Tq r1 = (X.C286025Tq) r1
            java.lang.String r0 = "link"
            X.62b r0 = X.C51975G9x.A0N(r1, r0, r2)
            if (r0 == 0) goto L_0x06f3
            java.lang.Object r2 = r13.A02
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r3 = r0.A02
            java.lang.String r3 = (java.lang.String) r3
            int r1 = r3.hashCode()
            r0 = -1969251287(0xffffffff8a9f9c29, float:-1.5369884E-32)
            if (r1 == r0) goto L_0x05dc
            r0 = -546619799(0xffffffffdf6b3e69, float:-1.6951101E19)
            if (r1 == r0) goto L_0x05a5
            r0 = 481005681(0x1cab9071, float:1.1353168E-21)
            if (r1 != r0) goto L_0x06f3
            java.lang.String r0 = "ai_editing_disclosures_link"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x06f3
            java.lang.String r0 = "https://help.instagram.com/724269355950958?ref=learn_more"
        L_0x059c:
            android.net.Uri r0 = X.0cp.A03(r0)
            X.0kR.A0F(r2, r0)
            goto L_0x06f3
        L_0x05a5:
            java.lang.String r0 = "learn_more_link"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x05d5
            goto L_0x06f3
        L_0x05af:
            int r2 = X.AnonymousClass7TE.A0M(r14)
            java.lang.Object r1 = r13.A01
            X.5Tq r1 = (X.C286025Tq) r1
            java.lang.String r0 = "link"
            X.62b r0 = X.C51975G9x.A0N(r1, r0, r2)
            if (r0 == 0) goto L_0x06f3
            java.lang.Object r2 = r13.A02
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r0.A02
            java.lang.String r0 = "ai_terms_link"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x05e6
            java.lang.String r0 = "learn_more_link"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x06f3
        L_0x05d5:
            r0 = 635(0x27b, float:8.9E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x059c
        L_0x05dc:
            java.lang.String r0 = "ai_terms_link"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x05e6
            goto L_0x06f3
        L_0x05e6:
            r0 = 15
            java.lang.String r0 = X.C66579MXk.A00(r0)
            goto L_0x059c
        L_0x05ed:
            X.Gln r14 = (X.C53301Gln) r14
            r2 = 0
            X.0qQ.A0B(r14, r2)
            X.HKv[] r1 = X.C54612HKv.values()
            int r0 = r14.A00
            r1 = r1[r0]
            java.lang.Object r0 = r13.A01
            X.C51965G9l.A1W(r0, r1)
            java.lang.Object r4 = r13.A02
            X.5Oz r4 = (X.C284945Oz) r4
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
        L_0x0608:
            r4.Epw(r0)
            goto L_0x06f3
        L_0x060d:
            X.Htj r14 = (X.C56156Htj) r14
            r7 = 0
            X.0qQ.A0B(r14, r7)
            java.lang.Object r1 = r13.A02
            X.Hog r1 = (X.C55859Hog) r1
            X.HsN r6 = r1.A03
            X.HsN r5 = r1.A02
            java.lang.Object r0 = r13.A01
            X.Hog r0 = (X.C55859Hog) r0
            X.HsM r4 = r0.A01
            X.HsM r2 = r1.A00
            r1 = 0
            r3 = 1056964608(0x3f000000, float:0.5)
            X.0qQ.A0B(r6, r7)
            X.AnonymousClass7TG.A1U(r4, r5, r2)
            r14.A01(r6, r5)
            X.JNc r0 = r14.A05
            r0.Cfx(r4, r1, r1)
            X.JNc r0 = r14.A04
            r0.Cfx(r2, r1, r1)
            java.util.List r2 = r14.A09
            r1 = 2
            X.Iwg r0 = new X.Iwg
            r0.<init>(r14, r3, r1)
            r2.add(r0)
            X.Izk r1 = X.C58921Izk.A00
            X.IHA r0 = new X.IHA
            r0.<init>(r1)
            r14.A02(r0)
            X.IHA r0 = new X.IHA
            r0.<init>(r1)
            r14.A03(r0)
            goto L_0x06f3
        L_0x0658:
            java.lang.Object r1 = r13.A01
            r0 = 46
            X.J6u r2 = new X.J6u
            r2.<init>(r1, r0)
            java.lang.Object r1 = r13.A02
            X.3E6 r1 = (X.AnonymousClass3E6) r1
            X.IkE r0 = new X.IkE
            r0.<init>(r2)
            r1.A9Y(r0)
            r0 = 16
            X.GOz r3 = new X.GOz
            r3.<init>((int) r0, (java.lang.Object) r2, (java.lang.Object) r1)
            return r3
        L_0x0675:
            X.5RU r2 = X.C51968G9o.A0S(r14)
            java.lang.Object r1 = r13.A01
            X.4gU r1 = (X.C270284gU) r1
            float r0 = X.C51971G9r.A03(r1)
            r2.EjG(r0)
            float r0 = X.C51971G9r.A03(r1)
            r2.EjH(r0)
            long r0 = X.C285605Ry.A01
            r2.EpB(r0)
            java.lang.Object r0 = r13.A02
            X.5b4 r0 = (X.AnonymousClass5b4) r0
            float r0 = X.C51975G9x.A00(r0)
            r2.Ej5(r0)
            goto L_0x06f3
        L_0x069c:
            X.Gln r14 = (X.C53301Gln) r14
            r0 = 0
            X.0qQ.A0B(r14, r0)
            X.HKv[] r1 = X.C54612HKv.values()
            int r0 = r14.A00
            r1 = r1[r0]
            java.lang.Object r0 = r13.A02
            X.C51965G9l.A1W(r0, r1)
            java.lang.Object r0 = r13.A01
        L_0x06b1:
            X.DbS.A1U(r0)
            goto L_0x06f3
        L_0x06b5:
            int r2 = X.AnonymousClass7TE.A0M(r14)
            java.lang.Object r1 = r13.A01
            X.5Tq r1 = (X.C286025Tq) r1
            java.lang.String r0 = "Link"
            X.62b r0 = X.C51975G9x.A0N(r1, r0, r2)
            r4 = 0
            if (r0 == 0) goto L_0x06f3
            java.lang.Object r3 = r0.A02
            if (r3 == 0) goto L_0x06f3
            java.lang.Object r0 = r13.A02
            java.util.Iterator r2 = X.C51966G9m.A1H(r0)
        L_0x06d0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x06e6
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.JwJ r0 = (X.C61081JwJ) r0
            java.lang.String r0 = r0.A01
            boolean r0 = X.0qQ.A0K(r0, r3)
            if (r0 == 0) goto L_0x06d0
            r4 = r1
        L_0x06e6:
            X.JwJ r4 = (X.C61081JwJ) r4
            if (r4 == 0) goto L_0x06f3
            java.lang.Object r0 = r4.A00
            X.0sP r0 = (X.0sP) r0
            if (r0 == 0) goto L_0x06f3
            r0.invoke(r3)
        L_0x06f3:
            X.0gF r3 = X.C60340gF.A00
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59102J6k.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59102J6k(int i, Object obj, Object obj2) {
        super(1);
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }
}
