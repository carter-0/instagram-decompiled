package X;

import android.view.View;

/* renamed from: X.9kT  reason: invalid class name and case insensitive filesystem */
public final class C386359kT extends AnonymousClass3NK {
    public final int A00;
    public final Object A01;

    public C386359kT(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass3NM A00(AnonymousClass3NG r1, Object obj, int i) {
        r1.A04 = new C386359kT(obj, i);
        return r1.A00();
    }

    public static void A01(AnonymousClass3NG r1, Object obj, int i) {
        r1.A04 = new C386359kT(obj, i);
        r1.A00();
    }

    public final void DP5(View view) {
        AnonymousClass8MJ r2;
        C317876nz r1;
        C249703kE r0;
        A74 a74;
        switch (this.A00) {
            case 0:
                return;
            case 1:
                A73 a73 = ((C380509Yl) this.A01).A00;
                if (a73 != null) {
                    r2 = a73.A02;
                    r1 = a73.A03;
                    r0 = a73.A01;
                    break;
                } else {
                    return;
                }
            case 2:
                a74 = ((C380519Ym) this.A01).A00;
                break;
            case 4:
                a74 = ((C39754A7u) this.A01).A00;
                break;
            default:
                super.DP5(view);
                return;
        }
        if (a74 != null) {
            r2 = a74.A01;
            r1 = a74.A03;
            r0 = a74.A02;
            View view2 = r0.itemView;
            0qQ.A06(view2);
            r2.Dn0(view2, r1);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v43, resolved type: X.9mm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v47, resolved type: X.9ml} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v54, resolved type: X.9mm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v55, resolved type: X.9mm} */
    /* JADX WARNING: type inference failed for: r0v11, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v22, types: [android.view.View, com.instagram.common.ui.widget.imageview.ConstrainedImageView] */
    /* JADX WARNING: type inference failed for: r3v1, types: [android.widget.ImageView, android.view.View, com.instagram.common.ui.widget.imageview.ConstrainedImageView] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x03da, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x03dc, code lost:
        r7 = r0.A00;
        r1 = r0.A02;
        r5 = r0.A03;
        r4 = r0.A04;
        r6 = r0.A01;
        r0 = X.AIM.A01;
        r2 = r1.A03.getContext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x03ee, code lost:
        X.0qQ.A0A(r2);
        r0 = X.AJA.A00(r2, r7, r6, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x03f5, code lost:
        r6.Dn1(r0, r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f9, code lost:
        r0.invoke(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0117, code lost:
        r0.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x018e, code lost:
        if (r1 == r2) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01bf, code lost:
        X.0qQ.A0F(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01c6, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Dqe(android.view.View r24) {
        /*
            r23 = this;
            r1 = r23
            int r0 = r1.A00
            r9 = r24
            switch(r0) {
                case 0: goto L_0x03fa;
                case 1: goto L_0x0386;
                case 2: goto L_0x03d4;
                case 3: goto L_0x033d;
                case 4: goto L_0x0335;
                case 5: goto L_0x02e6;
                case 6: goto L_0x0293;
                case 7: goto L_0x0220;
                case 8: goto L_0x0170;
                case 9: goto L_0x014e;
                case 10: goto L_0x0137;
                case 11: goto L_0x011c;
                case 12: goto L_0x010f;
                case 13: goto L_0x00fe;
                case 14: goto L_0x00f1;
                case 15: goto L_0x00e8;
                case 16: goto L_0x0196;
                case 17: goto L_0x0009;
                case 18: goto L_0x00c7;
                case 19: goto L_0x0009;
                case 20: goto L_0x00be;
                case 21: goto L_0x0009;
                case 22: goto L_0x00b5;
                case 23: goto L_0x0009;
                case 24: goto L_0x00be;
                case 25: goto L_0x00b0;
                case 26: goto L_0x007f;
                case 27: goto L_0x0047;
                case 28: goto L_0x0028;
                case 29: goto L_0x0012;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r1.A01
            X.8Be r0 = (X.C351978Be) r0
            r0.A04()
        L_0x0010:
            r2 = 1
        L_0x0011:
            return r2
        L_0x0012:
            r0 = 0
            X.0qQ.A0B(r9, r0)
            boolean r0 = r9.isEnabled()
            if (r0 == 0) goto L_0x0473
            r0 = 3
            r9.performHapticFeedback(r0)
            java.lang.Object r0 = r1.A01
            X.8hD r0 = (X.C362028hD) r0
            X.0sa r0 = r0.A0J
            goto L_0x0117
        L_0x0028:
            java.lang.Object r3 = r1.A01
            X.A9W r3 = (X.A9W) r3
            java.lang.Integer r0 = r3.A01
            int r2 = r0.intValue()
            r1 = 1
            r0 = 0
            if (r2 == r0) goto L_0x0044
            if (r2 == r1) goto L_0x0041
            r0 = 2
            if (r2 != r0) goto L_0x0010
            java.lang.Integer r0 = X.AnonymousClass05K.A00
        L_0x003d:
            r3.A00(r0, r1)
            goto L_0x0010
        L_0x0041:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x003d
        L_0x0044:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x003d
        L_0x0047:
            r0 = 0
            X.0qQ.A0B(r9, r0)
            boolean r0 = r9.isEnabled()
            if (r0 == 0) goto L_0x0473
            r0 = 3
            r9.performHapticFeedback(r0)
            java.lang.Object r0 = r1.A01
            X.Agh r0 = (X.C40667Agh) r0
            X.0eM r0 = r0.A08
            java.lang.Object r2 = r0.getValue()
            X.9YC r2 = (X.AnonymousClass9YC) r2
            X.8C5 r0 = r2.A01
            X.8C4 r1 = r0.A02
            java.util.Set r0 = r0.A00
            r1.A00 = r0
            X.80W r1 = r2.A02
            X.8T3 r0 = X.AnonymousClass8T3.A00
            r1.A04(r0)
            X.05G r2 = r2.A03
        L_0x0072:
            java.lang.Object r1 = r2.getValue()
            X.KLk r0 = X.C61771KLk.A00
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x0072
            goto L_0x0010
        L_0x007f:
            r2 = 0
            X.0qQ.A0B(r9, r2)
            boolean r0 = r9.isEnabled()
            if (r0 == 0) goto L_0x0011
            r0 = 3
            r9.performHapticFeedback(r0)
            java.lang.Object r0 = r1.A01
            X.Agh r0 = (X.C40667Agh) r0
            X.0eM r0 = r0.A08
            java.lang.Object r2 = r0.getValue()
            X.9YC r2 = (X.AnonymousClass9YC) r2
            X.80W r1 = r2.A02
            X.8Uf r0 = X.C356528Uf.A00
            r1.A04(r0)
            X.05G r2 = r2.A03
        L_0x00a2:
            java.lang.Object r1 = r2.getValue()
            X.KLk r0 = X.C61771KLk.A00
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x00a2
            goto L_0x0010
        L_0x00b0:
            java.lang.Object r0 = r1.A01
            android.app.Activity r0 = (android.app.Activity) r0
            goto L_0x00e3
        L_0x00b5:
            java.lang.Object r0 = r1.A01
            X.8Be r0 = (X.C351978Be) r0
            r0.A03()
            goto L_0x0010
        L_0x00be:
            java.lang.Object r0 = r1.A01
            X.8Be r0 = (X.C351978Be) r0
            r0.A09()
            goto L_0x0010
        L_0x00c7:
            java.lang.Object r0 = r1.A01
            X.8Be r0 = (X.C351978Be) r0
            X.8BA r3 = r0.A00
            X.80U r2 = r3.A1M
            boolean r0 = r2.CZU()
            if (r0 == 0) goto L_0x0010
            X.8VO r1 = new X.8VO
            r1.<init>()
            X.80T r2 = (X.AnonymousClass80T) r2
            X.80W r0 = r2.A02
            r0.A04(r1)
            android.app.Activity r0 = r3.A0n
        L_0x00e3:
            r0.finish()
            goto L_0x0010
        L_0x00e8:
            java.lang.Object r1 = r1.A01
            X.9ml r1 = (X.C387779ml) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.0sP r0 = r1.A04
            goto L_0x00f9
        L_0x00f1:
            java.lang.Object r1 = r1.A01
            X.9mm r1 = (X.C387789mm) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.0sP r0 = r1.A05
        L_0x00f9:
            r0.invoke(r1)
            goto L_0x0010
        L_0x00fe:
            java.lang.Object r2 = r1.A01
            X.9mk r2 = (X.C387769mk) r2
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.0sP r1 = r2.A04
            X.9m3 r0 = r2.A01
            if (r0 == 0) goto L_0x046e
            r1.invoke(r0)
            goto L_0x0010
        L_0x010f:
            java.lang.Object r1 = r1.A01
            X.9mj r1 = (X.C387759mj) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.0sa r0 = r1.A03
        L_0x0117:
            r0.invoke()
            goto L_0x0010
        L_0x011c:
            r0 = 0
            X.0qQ.A0B(r9, r0)
            boolean r0 = r9.isEnabled()
            if (r0 == 0) goto L_0x0473
            r0 = 3
            r9.performHapticFeedback(r0)
            java.lang.Object r0 = r1.A01
            X.AYK r0 = (X.AYK) r0
            X.80W r1 = r0.A08
            X.8T3 r0 = X.AnonymousClass8T3.A00
            r1.A04(r0)
            goto L_0x0010
        L_0x0137:
            r0 = 0
            X.0qQ.A0B(r9, r0)
            boolean r0 = r9.isEnabled()
            if (r0 == 0) goto L_0x0473
            r0 = 3
            r9.performHapticFeedback(r0)
            java.lang.Object r0 = r1.A01
            X.AYK r0 = (X.AYK) r0
            X.AYK.A00(r0)
            goto L_0x0010
        L_0x014e:
            java.lang.Object r4 = r1.A01
            X.AZV r4 = (X.AZV) r4
            X.0eM r3 = r4.A0E
            android.view.View r0 = X.AnonymousClass7TE.A0c(r3)
            boolean r2 = r0.hasFocus()
            r1 = 1
            android.view.View r0 = X.AnonymousClass7TE.A0c(r3)
            if (r2 == 0) goto L_0x016b
            r0.clearFocus()
            X.AZV.A05(r4, r1)
            goto L_0x0010
        L_0x016b:
            r0.requestFocus()
            goto L_0x0010
        L_0x0170:
            java.lang.Object r3 = r1.A01
            X.AZV r3 = (X.AZV) r3
            X.9m3 r2 = r3.A00
            java.lang.String r4 = "model"
            if (r2 == 0) goto L_0x01bf
            java.lang.Integer r1 = r2.A01
            java.lang.Integer r0 = X.ABA.A01(r1)
            r2.A02(r0)
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            if (r1 == r2) goto L_0x0190
            X.9m3 r0 = r3.A00
            if (r0 == 0) goto L_0x01bf
            java.lang.Integer r1 = r0.A01
            r0 = 0
            if (r1 != r2) goto L_0x0191
        L_0x0190:
            r0 = 1
        L_0x0191:
            X.AZV.A03(r3, r0)
            goto L_0x0010
        L_0x0196:
            r4 = 0
            X.0qQ.A0B(r9, r4)
            java.lang.Object r8 = r1.A01
            X.AOc r8 = (X.C40020AOc) r8
            int r3 = r8.A00
            java.util.ArrayList r1 = r8.A0A
            int r0 = r1.size()
            r2 = 1
            int r0 = r0 - r2
            if (r3 != r0) goto L_0x01c7
            r0 = 0
            r8.A00 = r4
        L_0x01ad:
            java.lang.Object r0 = r1.get(r0)
            X.0qQ.A07(r0)
            int r7 = X.AnonymousClass7TE.A0M(r0)
            X.Aeh r1 = r8.A05
            r0 = 0
            if (r1 != 0) goto L_0x01cc
            java.lang.String r4 = "model"
        L_0x01bf:
            X.0qQ.A0F(r4)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01c7:
            int r0 = r3 + 1
            r8.A00 = r0
            goto L_0x01ad
        L_0x01cc:
            X.WaP r6 = r1.A00
            X.UNR r11 = r6.A00
            X.0qQ.A0B(r11, r2)
            java.lang.Boolean r13 = r11.A01
            java.lang.String r10 = r11.A05
            java.lang.String r5 = r11.A06
            java.lang.String r4 = r11.A07
            java.lang.String r3 = r11.A08
            java.lang.Long r15 = r11.A03
            com.instagram.reels.question.constants.QuestionStickerType r12 = r11.A00
            java.util.List r2 = r11.A0A
            java.lang.String r1 = r11.A09
            java.lang.Boolean r14 = r11.A02
            java.lang.String r16 = X.0nH.A0F(r7)
            X.UNR r11 = new X.UNR
            r22 = r2
            r21 = r1
            r20 = r3
            r19 = r4
            r18 = r5
            r17 = r10
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r6.A00 = r11
            android.widget.EditText r1 = r8.A04
            if (r1 == 0) goto L_0x0206
            android.graphics.drawable.Drawable r0 = r1.getBackground()
        L_0x0206:
            boolean r1 = r0 instanceof android.graphics.drawable.GradientDrawable
            if (r1 == 0) goto L_0x0211
            android.graphics.drawable.GradientDrawable r0 = (android.graphics.drawable.GradientDrawable) r0
            if (r0 == 0) goto L_0x0211
            r0.setColor(r7)
        L_0x0211:
            java.util.ArrayList r1 = r8.A09
            int r0 = r8.A00
            java.lang.Object r0 = r1.get(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.announceForAccessibility(r0)
            goto L_0x0010
        L_0x0220:
            r2 = 0
            X.0qQ.A0B(r9, r2)
            boolean r0 = r9.isEnabled()
            if (r0 == 0) goto L_0x0011
            r0 = 3
            r9.performHapticFeedback(r0)
            java.lang.Object r0 = r1.A01
            X.LN1 r0 = (X.LN1) r0
            X.0eM r0 = r0.A06
            java.lang.Object r6 = r0.getValue()
            X.8Mv r6 = (X.C354648Mv) r6
            X.80W r1 = r6.A01
            X.8T3 r0 = X.AnonymousClass8T3.A00
            r1.A04(r0)
            X.8Mw r5 = r6.A00
            java.util.List r0 = r5.A04
            java.util.Iterator r4 = r0.iterator()
        L_0x0249:
            boolean r0 = r4.hasNext()
            r3 = 0
            if (r0 == 0) goto L_0x0291
            java.lang.Object r2 = r4.next()
            r0 = r2
            X.Jvl r0 = (X.C61047Jvl) r0
            int r1 = r0.A00
            int r0 = r5.A00
            if (r1 != r0) goto L_0x0249
        L_0x025d:
            X.Jvl r2 = (X.C61047Jvl) r2
            if (r2 == 0) goto L_0x0265
            java.lang.Object r3 = r2.A01
            X.8Mx r3 = (X.C354668Mx) r3
        L_0x0265:
            int r2 = r5.A00
            java.util.LinkedHashMap r0 = r5.A03
            java.lang.Object r1 = r0.get(r3)
            android.graphics.Path r1 = (android.graphics.Path) r1
            X.KKw r0 = new X.KKw
            r0.<init>(r1, r3, r2)
            X.C354648Mv.A00(r0, r6)
            int r1 = r5.A00
            X.9md r0 = new X.9md
            r0.<init>(r1)
            X.C354648Mv.A00(r0, r6)
            X.05G r2 = r6.A03
        L_0x0283:
            java.lang.Object r1 = r2.getValue()
            X.8My r0 = X.C354678My.A00
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x0283
            goto L_0x0010
        L_0x0291:
            r2 = r3
            goto L_0x025d
        L_0x0293:
            r0 = 0
            X.0qQ.A0B(r9, r0)
            boolean r0 = r9.isEnabled()
            if (r0 == 0) goto L_0x0473
            r0 = 3
            r9.performHapticFeedback(r0)
            java.lang.Object r0 = r1.A01
            X.LN1 r0 = (X.LN1) r0
            X.0eM r0 = r0.A06
            java.lang.Object r5 = r0.getValue()
            X.8Mv r5 = (X.C354648Mv) r5
            X.8Mw r4 = r5.A00
            int r0 = r4.A00
            X.Jvl r1 = r5.A02(r0)
            if (r1 == 0) goto L_0x02bb
            X.8Mx r0 = r4.A01
            r1.A01 = r0
        L_0x02bb:
            int r3 = r4.A00
            X.8Mx r2 = r4.A01
            java.util.LinkedHashMap r0 = r4.A03
            java.lang.Object r1 = r0.get(r2)
            android.graphics.Path r1 = (android.graphics.Path) r1
            X.KKw r0 = new X.KKw
            r0.<init>(r1, r2, r3)
            X.C354648Mv.A00(r0, r5)
            X.80W r1 = r5.A01
            X.8Uf r0 = X.C356528Uf.A00
            r1.A04(r0)
            X.05G r2 = r5.A03
        L_0x02d8:
            java.lang.Object r1 = r2.getValue()
            X.8My r0 = X.C354678My.A00
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x02d8
            goto L_0x0010
        L_0x02e6:
            java.lang.Object r5 = r1.A01
            X.8O4 r5 = (X.AnonymousClass8O4) r5
            X.8Ov r0 = r5.A05
            r0.getClass()
            android.view.View r0 = r0.getContentView()
            if (r0 == 0) goto L_0x0010
            android.content.Context r2 = r5.A0C
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131165214(0x7f07001e, float:1.7944639E38)
            int r4 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r0 = r2.getResources()
            int r3 = X.AnonymousClass7TE.A0D(r0)
            X.8Ov r0 = r5.A05
            r0.getClass()
            android.view.View r1 = r0.getContentView()
            r0 = 0
            r1.measure(r0, r0)
            X.8Ov r2 = r5.A05
            r2.getClass()
            android.view.View r1 = r5.A04
            r1.getClass()
            X.8Ov r0 = r5.A05
            r0.getClass()
            android.view.View r0 = r0.getContentView()
            int r0 = r0.getMeasuredWidth()
            int r0 = -r0
            int r0 = r0 + r4
            r2.showAsDropDown(r1, r0, r3)
            goto L_0x0010
        L_0x0335:
            java.lang.Object r0 = r1.A01
            X.A7u r0 = (X.C39754A7u) r0
            X.A74 r0 = r0.A00
            goto L_0x03da
        L_0x033d:
            java.lang.Object r0 = r1.A01
            X.9Yp r0 = (X.C380549Yp) r0
            X.A75 r2 = r0.A00
            if (r2 == 0) goto L_0x0473
            com.instagram.common.session.UserSession r1 = r2.A00
            X.9Yp r0 = r2.A02
            X.6nz r9 = r2.A03
            java.lang.Long r8 = r2.A04
            X.8MJ r7 = r2.A01
            android.view.View r0 = r0.A01
            android.content.Context r0 = r0.getContext()
            X.0qQ.A0A(r0)
            android.graphics.drawable.Drawable r6 = X.AJA.A00(r0, r1, r7, r9)
            boolean r5 = X.AAS.A01(r1, r7, r9)
            if (r5 == 0) goto L_0x0381
            X.1Av r0 = X.1Au.A00(r1)
            java.lang.String r4 = r9.A0Z
            X.0xa r3 = r0.A01
            java.lang.String r2 = "preference_sticker_drops_new_badge_interacted_with_sticker_ids"
            java.util.Set r0 = r3.C1t(r2)
            java.util.Set r1 = X.00k.A0j(r0)
            r1.add(r4)
            X.0xY r0 = r3.AR4()
            r0.E5h(r2, r1)
            r0.apply()
        L_0x0381:
            r7.Dn2(r6, r9, r8, r5)
            goto L_0x0010
        L_0x0386:
            java.lang.Object r0 = r1.A01
            X.9Yl r0 = (X.C380509Yl) r0
            X.A73 r0 = r0.A00
            if (r0 == 0) goto L_0x0473
            com.instagram.common.session.UserSession r7 = r0.A00
            X.9Yl r1 = r0.A01
            X.6nz r5 = r0.A03
            java.lang.Long r4 = r0.A04
            X.8MJ r6 = r0.A02
            android.graphics.RectF r0 = X.C39859ACf.A01
            com.instagram.common.ui.widget.imageview.ConstrainedImageView r3 = r1.A03
            android.content.Context r2 = r3.getContext()
            X.6oG r1 = r5.A00()
            X.6oG r0 = X.C318046oG.CUTOUT_VIDEO
            if (r1 != r0) goto L_0x03ee
            android.graphics.drawable.Drawable r2 = r3.getDrawable()
            boolean r0 = r2 instanceof X.C347017w8
            r1 = 0
            if (r0 == 0) goto L_0x03bf
            X.7w8 r2 = (X.C347017w8) r2
            if (r2 == 0) goto L_0x03bf
            java.lang.Iterable r0 = r2.A05()
            java.lang.Object r1 = X.00k.A0A(r0)
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
        L_0x03bf:
            boolean r0 = r1 instanceof X.AnonymousClass8N6
            if (r0 == 0) goto L_0x0010
            X.6tR r1 = (X.C321016tR) r1
            if (r1 == 0) goto L_0x0010
            java.lang.String r0 = r1.A0D
            if (r0 != 0) goto L_0x03cf
            java.lang.String r0 = r1.A0F
            if (r0 == 0) goto L_0x0010
        L_0x03cf:
            android.graphics.drawable.Drawable r0 = r3.getDrawable()
            goto L_0x03f5
        L_0x03d4:
            java.lang.Object r0 = r1.A01
            X.9Ym r0 = (X.C380519Ym) r0
            X.A74 r0 = r0.A00
        L_0x03da:
            if (r0 == 0) goto L_0x0473
            com.instagram.common.session.UserSession r7 = r0.A00
            X.9Ym r1 = r0.A02
            X.6nz r5 = r0.A03
            java.lang.Long r4 = r0.A04
            X.8MJ r6 = r0.A01
            android.graphics.RectF r0 = X.AIM.A01
            com.instagram.common.ui.widget.imageview.ConstrainedImageView r0 = r1.A03
            android.content.Context r2 = r0.getContext()
        L_0x03ee:
            X.0qQ.A0A(r2)
            android.graphics.drawable.Drawable r0 = X.AJA.A00(r2, r7, r6, r5)
        L_0x03f5:
            r6.Dn1(r0, r5, r4)
            goto L_0x0010
        L_0x03fa:
            java.lang.Object r6 = r1.A01
            X.UEo r6 = (X.C14909UEo) r6
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.WRs r1 = r6.A00
            if (r1 == 0) goto L_0x0473
            com.instagram.archive.fragment.ArchiveReelPeopleFragment r5 = r6.A03
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x0010
            r0 = 1
            r5.A02 = r0
            com.instagram.user.model.User r0 = r1.A00
            java.lang.String r1 = r0.getId()
            java.lang.String r0 = "friend_archive_"
            java.lang.String r4 = X.002.A0R(r0, r1)
            com.instagram.common.session.UserSession r0 = r5.getSession()
            com.instagram.reels.store.ReelStore r0 = com.instagram.reels.store.ReelStore.A03(r0)
            com.instagram.model.reels.Reel r0 = r0.A0M(r4)
            if (r0 == 0) goto L_0x042f
            com.instagram.archive.fragment.ArchiveReelPeopleFragment.A01(r5, r6, r0)
            r0 = 0
            r5.A02 = r0
            goto L_0x0010
        L_0x042f:
            X.7i4 r0 = r6.A02
            r0.start()
            android.widget.ImageView r0 = r6.A01
            r3 = 0
            r0.setVisibility(r3)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r6.A05
            r0.setVisibility(r3)
            com.instagram.common.session.UserSession r0 = r5.getSession()
            X.0qQ.A0B(r0, r3)
            X.1NY r2 = X.AnonymousClass7TG.A0b(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r0 = "archive/reel/friend_archive_media/%s/"
            java.lang.String r0 = X.0mp.A06(r0, r1)
            r2.A0A(r0)
            java.lang.Class<X.CF3> r1 = X.CF3.class
            java.lang.Class<X.D0N> r0 = X.D0N.class
            r2.A0Q(r1, r0)
            X.1OC r1 = r2.A0M()
            X.Ufm r0 = new X.Ufm
            r0.<init>(r5, r6, r4, r3)
            r1.A00 = r0
            r5.schedule(r1)
            goto L_0x0010
        L_0x046e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0473:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C386359kT.Dqe(android.view.View):boolean");
    }
}
