package X;

/* renamed from: X.Ixb  reason: case insensitive filesystem */
public final class C58790Ixb extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58790Ixb(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        super(1);
        this.A00 = i;
        this.A04 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A01 = obj4;
        this.A05 = obj5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: X.OHi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: X.OO6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v46, resolved type: X.OHi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v47, resolved type: X.OHi} */
    /* JADX WARNING: type inference failed for: r8v14, types: [android.widget.TextView, com.instagram.common.ui.text.ExpandableTextView, android.view.View] */
    /* JADX WARNING: type inference failed for: r12v17, types: [java.lang.Object, X.0rk] */
    /* JADX WARNING: type inference failed for: r10v11, types: [java.lang.Object, X.0rk] */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0159, code lost:
        X.C51967G9n.A1H(r4, r5.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x05c7, code lost:
        r3.A02(r4, new X.PUC(r1, (java.lang.Object) r6, r2, (java.lang.Object) r5));
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0815 A[Catch:{ all -> 0x08c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0819 A[Catch:{ all -> 0x08c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x081c A[Catch:{ all -> 0x08c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0820 A[Catch:{ all -> 0x08c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0833 A[Catch:{ all -> 0x08c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0837 A[Catch:{ all -> 0x08c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0866  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0869 A[SYNTHETIC, Splitter:B:166:0x0869] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0889  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r25) {
        /*
            r24 = this;
            r0 = r24
            r12 = r25
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x0979;
                case 1: goto L_0x0917;
                case 2: goto L_0x08d0;
                case 3: goto L_0x07ed;
                case 4: goto L_0x0774;
                case 5: goto L_0x0734;
                case 6: goto L_0x0a0c;
                case 7: goto L_0x06a5;
                case 8: goto L_0x0638;
                case 9: goto L_0x05d1;
                case 10: goto L_0x0598;
                case 11: goto L_0x0569;
                case 12: goto L_0x052e;
                case 13: goto L_0x04fd;
                case 14: goto L_0x04cc;
                case 15: goto L_0x0403;
                case 16: goto L_0x02fa;
                case 17: goto L_0x02ae;
                case 18: goto L_0x028f;
                case 19: goto L_0x023b;
                case 20: goto L_0x0214;
                case 21: goto L_0x01d6;
                case 22: goto L_0x01a3;
                case 23: goto L_0x0160;
                case 24: goto L_0x09ec;
                case 25: goto L_0x0137;
                case 26: goto L_0x00f5;
                case 27: goto L_0x00bc;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.2Uw r12 = (X.AnonymousClass2Uw) r12
            r6 = 0
            X.0qQ.A0B(r12, r6)
            float r1 = r12.A00
            r3 = 1120403456(0x42c80000, float:100.0)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x004e
            java.lang.Object r2 = r0.A03
            X.3Zt r2 = (X.C243673Zt) r2
            float r1 = X.C51972G9s.A03(r2)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x004e
            java.lang.Float r1 = java.lang.Float.valueOf(r3)
            r2.A00(r1)
            java.lang.Object r5 = r0.A02
            android.os.Handler r5 = (android.os.Handler) r5
            java.lang.Object r4 = r0.A04
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r5.removeCallbacks(r4)
            java.lang.Object r0 = r0.A05
            X.GFJ r0 = (X.GFJ) r0
            com.instagram.common.session.UserSession r3 = r0.A0A
            X.0Tu r2 = X.C51965G9l.A0Z(r3, r6)
            r0 = 36607170200409625(0x820e0700071619, double:3.21386006775732E-306)
            long r0 = X.182.A01(r2, r3, r0)
            r5.postDelayed(r4, r0)
        L_0x004b:
            X.0gF r8 = X.C60340gF.A00
            return r8
        L_0x004e:
            float r1 = r12.A00
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x004b
            java.lang.Object r2 = r0.A03
            X.3Zt r2 = (X.C243673Zt) r2
            float r1 = X.C51972G9s.A03(r2)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x004b
            float r1 = r12.A00
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2.A00(r1)
            java.lang.Object r2 = r0.A02
            android.os.Handler r2 = (android.os.Handler) r2
            java.lang.Object r1 = r0.A04
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r2.removeCallbacks(r1)
            X.HpX r2 = X.C52222GJn.A0G
            java.lang.Object r1 = r0.A01
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r0 = r0.A05
            X.GFJ r0 = (X.GFJ) r0
            X.4bN r0 = r0.A06
            com.instagram.ui.mediaactions.ScrubberWithKeyFrames r3 = r2.A00(r1, r0)
            if (r3 == 0) goto L_0x004b
            X.0qQ.A0B(r1, r6)
            java.util.List r2 = r3.A02
            boolean r0 = X.AnonymousClass7TE.A1b(r2)
            if (r0 == 0) goto L_0x004b
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r1.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto L_0x004b
            android.view.View r1 = r0.getChildAt(r6)
            if (r1 == 0) goto L_0x004b
            r0 = 2131430133(0x7f0b0af5, float:1.8481958E38)
            android.view.View r0 = r1.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto L_0x00b0
            r0.removeAllViews()
        L_0x00b0:
            android.graphics.Path r0 = r3.A01
            r0.reset()
            r2.clear()
            r3.invalidate()
            goto L_0x004b
        L_0x00bc:
            X.2WA r3 = X.G9w.A0R(r12)
            java.lang.Object r2 = r0.A05
            X.GFJ r2 = (X.GFJ) r2
            java.lang.Object r1 = r0.A03
            X.2Wc r1 = (X.C70832Wc) r1
            android.content.Context r4 = X.C243803a8.A00(r1)
            X.GDe r5 = r2.A08
            java.lang.Object r7 = r0.A02
            X.1Xj r7 = (X.1Xj) r7
            java.lang.Object r6 = r0.A04
            com.instagram.common.session.UserSession r6 = (com.instagram.common.session.UserSession) r6
            android.view.View r1 = r3.A00
            X.0qQ.A06(r1)
            java.lang.Object r8 = r0.A01
            X.S6e r8 = (X.S6e) r8
            X.3W1 r0 = r5.A0E
            r9 = 1
            if (r0 == 0) goto L_0x00ee
            boolean r0 = r0.A1q
            if (r0 != r9) goto L_0x00ee
            X.Dba.A0j(r9, r6, r7)
            X.C51974G9v.A1G(r6, r7)
        L_0x00ee:
            X.GED r3 = X.GED.A00
            r3.A05(r4, r5, r6, r7, r8, r9)
            goto L_0x004b
        L_0x00f5:
            java.lang.Object r6 = r0.A04
            X.3Zt r6 = (X.C243673Zt) r6
            X.C51973G9u.A18(r6)
            float[] r1 = X.C51965G9l.A1b()
            r1 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r3 = android.animation.ValueAnimator.ofFloat(r1)
            java.lang.Object r5 = r0.A05
            X.GuV r5 = (X.C53802GuV) r5
            java.lang.Object r4 = r0.A01
            X.2Wa r4 = (X.2Wa) r4
            long r1 = r5.A02
            r3.setDuration(r1)
            r2 = 13
            X.I83 r1 = new X.I83
            r1.<init>((int) r2, (java.lang.Object) r4, (java.lang.Object) r5)
            r3.addUpdateListener(r1)
            r6.A00(r3)
            java.lang.Object r1 = r0.A02
            java.lang.Object r3 = X.C51968G9o.A0y(r1)
            android.os.Handler r3 = (android.os.Handler) r3
            java.lang.Object r0 = r0.A03
            java.lang.Object r2 = X.C51968G9o.A0y(r0)
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            long r0 = r5.A03
            r3.postDelayed(r2, r0)
            goto L_0x0159
        L_0x0137:
            java.lang.Object r1 = r0.A02
            java.lang.Object r2 = X.C51968G9o.A0y(r1)
            android.os.Handler r2 = (android.os.Handler) r2
            java.lang.Object r1 = r0.A03
            java.lang.Object r1 = X.C51968G9o.A0y(r1)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r2.removeCallbacks(r1)
            java.lang.Object r1 = r0.A04
            X.3Zt r1 = (X.C243673Zt) r1
            X.C51973G9u.A18(r1)
            java.lang.Object r4 = r0.A01
            X.2Wa r4 = (X.2Wa) r4
            java.lang.Object r5 = r0.A05
            X.GuV r5 = (X.C53802GuV) r5
        L_0x0159:
            int r0 = r5.A00
            X.C51967G9n.A1H(r4, r0)
            goto L_0x004b
        L_0x0160:
            X.Hme r12 = (X.C55743Hme) r12
            java.lang.Object r2 = r0.A03
            X.61u r2 = (X.C3021461u) r2
            boolean r1 = r12.A02
            r2.setPrimaryActionIsLoading(r1)
            java.lang.Object r2 = r0.A02
            android.widget.CompoundButton r2 = (android.widget.CompoundButton) r2
            java.lang.Object r4 = r12.A01
            X.Uz1 r1 = X.C16665Uz1.EVERYONE
            r3 = 1
            boolean r1 = X.AnonymousClass7TF.A1W(r4, r1)
            r2.setChecked(r1)
            java.lang.Object r2 = r0.A05
            com.instagram.igds.components.textcell.IgdsListCell r2 = (com.instagram.igds.components.textcell.IgdsListCell) r2
            X.Uz1 r1 = X.C16665Uz1.FOLLOWERS
            boolean r1 = X.AnonymousClass7TF.A1W(r4, r1)
            r2.setChecked(r1)
            java.lang.Object r2 = r0.A01
            com.instagram.igds.components.textcell.IgdsListCell r2 = (com.instagram.igds.components.textcell.IgdsListCell) r2
            X.Uz1 r1 = X.C16665Uz1.CLOSE_FRIENDS
            boolean r1 = X.AnonymousClass7TF.A1W(r4, r1)
            r2.setChecked(r1)
            java.lang.Object r1 = r0.A04
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            X.Uz1 r0 = X.C16665Uz1.NOBODY
            if (r4 == r0) goto L_0x019e
            r3 = 0
        L_0x019e:
            r1.setChecked(r3)
            goto L_0x004b
        L_0x01a3:
            java.lang.Object r7 = r0.A03
            com.instagram.upcomingevents.common.repository.UpcomingEventReminderRepository r7 = (com.instagram.upcomingevents.common.repository.UpcomingEventReminderRepository) r7
            java.lang.Object r6 = r0.A04
            com.instagram.user.model.UpcomingEvent r6 = (com.instagram.user.model.UpcomingEvent) r6
            r1 = 0
            X.0qQ.A0B(r6, r1)
            X.6al r1 = r7.A06
            boolean r1 = r1.A01(r6)
            if (r1 == 0) goto L_0x01d3
            com.instagram.upcomingevents.common.model.UpcomingEventReminderAction r5 = com.instagram.upcomingevents.common.model.UpcomingEventReminderAction.UNSET_REMINDER
        L_0x01b9:
            java.lang.Object r4 = r0.A05
            X.Vht r4 = (X.C17902Vht) r4
            java.lang.String r3 = r4.A03
            java.lang.Object r1 = r0.A01
            X.1Xj r1 = (X.1Xj) r1
            X.L8U r2 = new X.L8U
            r2.<init>(r1, r5, r6, r3)
            java.lang.Object r1 = r0.A02
            X.X79 r1 = (X.X79) r1
            X.4Cq r0 = r4.A04
            r7.A03(r1, r2, r0)
            goto L_0x004b
        L_0x01d3:
            com.instagram.upcomingevents.common.model.UpcomingEventReminderAction r5 = com.instagram.upcomingevents.common.model.UpcomingEventReminderAction.SET_REMINDER
            goto L_0x01b9
        L_0x01d6:
            android.graphics.Point r12 = (android.graphics.Point) r12
            r1 = 0
            X.0qQ.A0B(r12, r1)
            X.3ui r4 = new X.3ui
            r4.<init>()
            X.3WT r1 = X.AnonymousClass3WT.CTA
            r4.A11 = r1
            java.lang.Object r3 = r0.A03
            X.3uh r3 = (X.C255773uh) r3
            java.lang.Object r2 = r0.A01
            android.content.Context r2 = (android.content.Context) r2
            X.0qQ.A0A(r2)
            java.lang.Object r1 = r0.A05
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.String r1 = X.C309506Yn.A03(r2, r1, r3)
            r4.A1N = r1
            int r1 = r12.x
            float r1 = (float) r1
            r4.A03 = r1
            int r1 = r12.y
            float r1 = (float) r1
            r4.A04 = r1
            r1 = 1
            r4.A1p = r1
            java.lang.Object r1 = r0.A02
            X.6Zx r1 = (X.C309866Zx) r1
            java.lang.Object r0 = r0.A04
            X.3mM r0 = (X.C250973mM) r0
            r1.DSY(r3, r0, r4)
            goto L_0x004b
        L_0x0214:
            X.6Gb r3 = X.C51968G9o.A0L(r12)
            java.lang.Object r6 = r0.A01
            java.util.List r6 = (java.util.List) r6
            int r2 = r6.size()
            java.lang.Object r7 = r0.A04
            java.lang.Object r8 = r0.A05
            java.lang.Object r9 = r0.A03
            java.lang.Object r10 = r0.A02
            r5 = 4
            X.JJi r4 = new X.JJi
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0 = -1163986397(0xffffffffba9efa23, float:-0.001212899)
            X.5PJ r1 = X.AnonymousClass5PI.A03(r4, r0)
            r0 = 0
            r3.CfB(r0, r1, r2)
            goto L_0x004b
        L_0x023b:
            java.lang.Object r1 = r0.A01
            java.lang.Object r6 = X.C51966G9m.A18(r1)
            X.Hns r6 = (X.C55812Hns) r6
            java.lang.Object r5 = r0.A05
            java.lang.Object r4 = r0.A04
            X.0sa r4 = (X.C62320sa) r4
            java.lang.Object r3 = r0.A02
            X.0sP r3 = (X.0sP) r3
            java.lang.Object r2 = r0.A03
            X.0sP r2 = (X.0sP) r2
            r1 = 1137180672(0x43c80000, float:400.0)
            r0 = 0
            X.0qQ.A0B(r6, r0)
            X.C51974G9v.A1M(r5, r4, r3)
            r0 = 5
            X.0qQ.A0B(r2, r0)
            X.HN4 r0 = X.HN4.Interested
            if (r5 != r0) goto L_0x027f
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 + r0
            X.5Oz r0 = r6.A00
            X.C51967G9n.A14(r0, r1)
            X.4bN r0 = r6.A01
            r2.invoke(r0)
        L_0x026f:
            android.os.Handler r3 = X.AnonymousClass7TF.A0D()
            X.Ifg r2 = new X.Ifg
            r2.<init>(r4)
            r0 = 100
            r3.postDelayed(r2, r0)
            goto L_0x004b
        L_0x027f:
            r1 = -1010302976(0xffffffffc3c80000, float:-400.0)
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 - r0
            X.5Oz r0 = r6.A00
            X.C51967G9n.A14(r0, r1)
            X.4bN r0 = r6.A01
            r3.invoke(r0)
            goto L_0x026f
        L_0x028f:
            java.lang.Object r1 = r0.A04
            X.3V9 r1 = (X.AnonymousClass3V9) r1
            android.view.View r4 = r1.A09()
            if (r4 == 0) goto L_0x004b
            java.lang.Object r3 = r0.A01
            X.4Gh r3 = (X.C262864Gh) r3
            java.lang.Object r2 = r0.A02
            X.1Xj r2 = (X.1Xj) r2
            java.lang.Object r1 = r0.A03
            X.3W1 r1 = (X.AnonymousClass3W1) r1
            java.lang.Object r0 = r0.A05
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r3.DJK(r4, r2, r1, r0)
            goto L_0x004b
        L_0x02ae:
            r3 = 0
            X.0qQ.A0B(r12, r3)
            java.lang.Object r2 = r0.A05
            X.4Gz r2 = (X.C263044Gz) r2
            com.instagram.common.session.UserSession r6 = r2.A00
            X.0q2 r1 = X.0q2.A00(r6)
            java.lang.Object r9 = r0.A04
            X.1Xj r9 = (X.1Xj) r9
            boolean r1 = r1.A0N(r9)
            if (r1 == 0) goto L_0x02f7
            X.3Yl r8 = X.C243363Yl.NOT_LIKED
        L_0x02c8:
            java.lang.Object r4 = r0.A01
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Integer r11 = r2.A02()
            java.lang.Object r5 = r0.A03
            X.0iw r5 = (X.AnonymousClass0iw) r5
            r10 = 0
            java.lang.Integer r13 = X.C51967G9n.A0j()
            java.lang.Object r0 = r0.A02
            X.3V9 r0 = (X.AnonymousClass3V9) r0
            X.ISo r7 = new X.ISo
            r7.<init>(r4, r2, r9, r0)
            r12 = r10
            r14 = r13
            r15 = r10
            r16 = r10
            r17 = r10
            r18 = r10
            r19 = r3
            r20 = r3
            X.C56622I4z.A03(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            X.C263044Gz.A00(r4, r2, r9, r0)
            goto L_0x004b
        L_0x02f7:
            X.3Yl r8 = X.C243363Yl.LIKED
            goto L_0x02c8
        L_0x02fa:
            java.lang.Object r5 = r0.A01
            X.Vit r5 = (X.C17960Vit) r5
            java.lang.Object r1 = r0.A03
            X.N3A r1 = (X.N3A) r1
            X.QP5 r1 = r1.A02
            java.lang.String r6 = r1.A01
            java.lang.Object r4 = r0.A05
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            java.lang.Object r3 = r0.A04
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            java.lang.Object r0 = r0.A02
            X.MzF r0 = (X.C68048MzF) r0
            android.view.View r8 = r0.A01
            r2 = 0
            X.AnonymousClass7TF.A1H(r6, r4)
            r7 = 2
            X.0qQ.A0B(r3, r7)
            X.UZq r9 = r5.A00
            X.Hop r5 = r9.A0C
            if (r5 != 0) goto L_0x032c
            java.lang.String r0 = "serpMetaAiHcmLogger"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x032c:
            X.0wc r1 = r5.A01
            java.lang.String r0 = "ig_search_meta_ai_hcm_thumbs_down_tap"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0349
            X.0iw r0 = r5.A00
            X.C51969G9p.A1A(r1, r0)
            java.lang.String r0 = X.DbY.A0a()
            X.C51976G9y.A0Y(r1, r5, r0)
            r1.Cgf()
        L_0x0349:
            java.lang.String r0 = "bot_response_id"
            X.0eP r5 = X.AnonymousClass7TE.A1L(r0, r6)
            java.lang.String r1 = "entry_point"
            java.lang.String r0 = "4"
            java.util.HashMap r6 = X.Dbb.A0e(r1, r0, r5)
            X.Wxc r0 = new X.Wxc
            r0.<init>(r9, r7)
            X.Q3B r1 = new X.Q3B
            r1.<init>(r0)
            java.lang.String r0 = "on_complete"
            java.util.HashMap r5 = X.DbY.A0m(r0, r1)
            X.FFt r1 = new X.FFt
            r1.<init>()
            X.Di6 r0 = X.C46626Di6.HALF_SHEET
            r1.A03 = r0
            X.Di7 r0 = X.C46627Di7.DISABLED
            r1.A02 = r0
            X.DfZ r7 = r1.A03()
            r0 = 721(0x2d1, float:1.01E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.DiU r6 = X.C46649DiU.A06(r0, r6, r5)
            android.content.Context r5 = r9.requireContext()
            com.instagram.common.session.UserSession r1 = r9.A04()
            X.F1e r0 = new X.F1e
            r0.<init>(r1)
            r0.A00(r7)
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r0.A00
            r6.A0F(r5, r0)
            android.content.Context r1 = r9.requireContext()
            r0 = 2131238916(0x7f082004, float:1.8094124E38)
            X.DbU.A13(r1, r4, r0)
            android.content.Context r1 = r9.requireContext()
            r0 = 2131238910(0x7f081ffe, float:1.8094112E38)
            X.DbU.A13(r1, r3, r0)
            android.content.Context r1 = r9.requireContext()
            android.content.Context r0 = r9.requireContext()
            int r0 = X.2Yu.A0B(r0)
            int r0 = r1.getColor(r0)
            r4.setColorFilter(r0)
            android.content.Context r1 = r9.requireContext()
            android.content.Context r0 = r9.requireContext()
            int r0 = X.2Yu.A0B(r0)
            int r0 = r1.getColor(r0)
            r3.setColorFilter(r0)
            X.0rk r10 = new X.0rk
            r10.<init>()
            int r0 = r8.getMeasuredHeight()
            r10.A00 = r0
            int[] r0 = new int[]{r0, r2}
            android.animation.ValueAnimator r7 = android.animation.ValueAnimator.ofInt(r0)
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            r7.setInterpolator(r0)
            r0 = 250(0xfa, double:1.235E-321)
            r7.setDuration(r0)
            r0 = 7
            X.C56678I7i.A00(r7, r9, r0)
            r6 = 3
            X.Oeg r5 = new X.Oeg
            r5.<init>(r6, r7, r8, r9, r10)
            r7.addUpdateListener(r5)
            r7.start()
            goto L_0x004b
        L_0x0403:
            java.lang.Object r8 = r0.A01
            com.instagram.common.ui.text.ExpandableTextView r8 = (com.instagram.common.ui.text.ExpandableTextView) r8
            boolean r1 = r8.A02
            if (r1 != 0) goto L_0x004b
            java.lang.Object r11 = r0.A02
            X.Vit r11 = (X.C17960Vit) r11
            X.UZq r3 = r11.A00
            boolean r1 = r3.A0M
            if (r1 != 0) goto L_0x004b
            java.lang.Object r9 = r0.A05
            X.N3A r9 = (X.N3A) r9
            boolean r1 = r9.A06
            if (r1 != 0) goto L_0x0423
            boolean r1 = r3.A0O
            if (r1 == 0) goto L_0x0423
            goto L_0x004b
        L_0x0423:
            r1 = 1
            r8.A02 = r1
            java.lang.Object r10 = r0.A03
            X.MzF r10 = (X.C68048MzF) r10
            java.lang.CharSequence r1 = r9.A03
            r8.setText(r1)
            X.0rk r12 = new X.0rk
            r12.<init>()
            android.view.View r1 = r10.A01
            int r1 = r1.getMeasuredHeight()
            r12.A00 = r1
            boolean r1 = r3.A0O
            r7 = r1 ^ 1
            int r1 = r8.getMeasuredWidth()
            r6 = 1073741824(0x40000000, float:2.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r6)
            r4 = 0
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r4)
            r8.measure(r2, r1)
            int r5 = r8.getMeasuredHeight()
            if (r7 == 0) goto L_0x04c9
            r8.A03 = r4
            int r1 = r8.A01
        L_0x045c:
            r8.setMaxLines(r1)
            int r1 = r8.getMeasuredWidth()
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r6)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r4)
            r8.measure(r2, r1)
            if (r7 == 0) goto L_0x04be
            int r4 = r8.getMeasuredHeight()
        L_0x0474:
            int r4 = r4 - r5
            boolean r1 = r3.A0O
            r1 = r1 ^ 1
            r3.A0O = r1
            int r2 = r12.A00
            int r1 = r2 + r4
            int[] r1 = new int[]{r2, r1}
            android.animation.ValueAnimator r7 = android.animation.ValueAnimator.ofInt(r1)
            android.view.animation.DecelerateInterpolator r1 = new android.view.animation.DecelerateInterpolator
            r1.<init>()
            r7.setInterpolator(r1)
            r1 = 250(0xfa, double:1.235E-321)
            r7.setDuration(r1)
            r14 = 3
            X.TtS r13 = new X.TtS
            r15 = r8
            r16 = r11
            r17 = r10
            r18 = r9
            r13.<init>((int) r14, (java.lang.Object) r15, (java.lang.Object) r16, (java.lang.Object) r17, (java.lang.Object) r18)
            r7.addListener(r13)
            X.Oeh r6 = new X.Oeh
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r7.addUpdateListener(r6)
            r7.start()
            java.lang.Object r1 = r0.A04
            X.HrV r1 = (X.C56023HrV) r1
            boolean r0 = r3.A0O
            java.lang.Integer r0 = X.C51967G9n.A0l(r0)
            r1.A00(r0)
            goto L_0x004b
        L_0x04be:
            android.text.Layout r2 = r8.getLayout()
            int r1 = r8.A00
            int r4 = r2.getLineTop(r1)
            goto L_0x0474
        L_0x04c9:
            int r1 = r8.A00
            goto L_0x045c
        L_0x04cc:
            X.3sy r12 = (X.C254743sy) r12
            r1 = 0
            X.0qQ.A0B(r12, r1)
            java.lang.Object r2 = r0.A05
            X.7L9 r2 = (X.AnonymousClass7L9) r2
            X.7Zg r1 = r2.A02
            X.7Zj r7 = r1.BsD()
            java.lang.Object r8 = r0.A01
            android.content.Context r8 = (android.content.Context) r8
            java.lang.Object r9 = r0.A04
            com.instagram.common.session.UserSession r9 = (com.instagram.common.session.UserSession) r9
            java.lang.Object r10 = r0.A03
            X.6o8 r10 = (X.C317966o8) r10
            X.0sa r1 = r2.A07
            boolean r14 = X.C51971G9r.A1b(r1)
            X.7L5 r1 = r2.A03
            java.lang.String r13 = r1.A00()
            java.lang.Object r11 = r0.A02
            X.3tI r11 = (X.C254933tI) r11
            r7.ELa(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x004b
        L_0x04fd:
            X.3sy r12 = (X.C254743sy) r12
            r1 = 0
            X.0qQ.A0B(r12, r1)
            java.lang.Object r2 = r0.A05
            X.7L9 r2 = (X.AnonymousClass7L9) r2
            X.7Zg r1 = r2.A02
            X.7Zj r7 = r1.BsD()
            java.lang.Object r8 = r0.A01
            android.content.Context r8 = (android.content.Context) r8
            java.lang.Object r9 = r0.A04
            com.instagram.common.session.UserSession r9 = (com.instagram.common.session.UserSession) r9
            java.lang.Object r10 = r0.A03
            X.6o8 r10 = (X.C317966o8) r10
            X.0sa r1 = r2.A07
            boolean r14 = X.C51971G9r.A1b(r1)
            X.7L5 r1 = r2.A03
            java.lang.String r13 = r1.A00()
            java.lang.Object r11 = r0.A02
            X.3tI r11 = (X.C254933tI) r11
            r7.ELJ(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x004b
        L_0x052e:
            X.3sy r12 = (X.C254743sy) r12
            r1 = 0
            X.0qQ.A0B(r12, r1)
            java.lang.Object r2 = r0.A05
            X.7L9 r2 = (X.AnonymousClass7L9) r2
            X.7Zg r1 = r2.A02
            X.7Zj r7 = r1.BsD()
            java.lang.Object r8 = r0.A01
            android.content.Context r8 = (android.content.Context) r8
            java.lang.Object r9 = r0.A04
            com.instagram.common.session.UserSession r9 = (com.instagram.common.session.UserSession) r9
            X.7L7 r1 = r2.A05
            X.0sa r1 = r1.A05
            java.lang.Object r14 = r1.invoke()
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r10 = r0.A03
            X.6o8 r10 = (X.C317966o8) r10
            X.0sa r1 = r2.A07
            boolean r15 = X.C51971G9r.A1b(r1)
            X.7L5 r1 = r2.A03
            java.lang.String r13 = r1.A00()
            java.lang.Object r11 = r0.A02
            X.3tI r11 = (X.C254933tI) r11
            r7.ELQ(r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x004b
        L_0x0569:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r5 = r0.A05
            X.OO6 r5 = (X.OO6) r5
            X.0eM r1 = r5.A08
            java.lang.Object r1 = r1.getValue()
            X.OyT r1 = (X.C72203OyT) r1
            r4 = 1
            r1.A04 = r4
            java.lang.Object r6 = r0.A01
            X.67Z r6 = (X.AnonymousClass67Z) r6
            X.NTz r1 = X.C68713NTz.A00
            r6.A02(r1)
            X.1aU r3 = r5.A03
            java.lang.Object r2 = r0.A02
            X.Ov3 r1 = new X.Ov3
            r1.<init>(r12, r2, r4)
            X.1aU r4 = r3.A0L(r1)
            java.lang.Object r3 = r0.A03
            X.1a8 r3 = (X.1a8) r3
            java.lang.Object r2 = r0.A04
            r1 = 7
            goto L_0x05c7
        L_0x0598:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r5 = r0.A05
            X.OHi r5 = (X.C70713OHi) r5
            X.0eM r1 = r5.A07
            java.lang.Object r2 = r1.getValue()
            X.OyT r2 = (X.C72203OyT) r2
            r1 = 1
            r2.A04 = r1
            java.lang.Object r6 = r0.A01
            X.67Z r6 = (X.AnonymousClass67Z) r6
            X.NTg r1 = X.C68694NTg.A00
            r6.A02(r1)
            X.1aU r4 = r5.A01
            java.lang.Object r3 = r0.A02
            r2 = 0
            X.Ov3 r1 = new X.Ov3
            r1.<init>(r12, r3, r2)
            X.1aU r4 = r4.A0L(r1)
            java.lang.Object r3 = r0.A03
            X.1a8 r3 = (X.1a8) r3
            java.lang.Object r2 = r0.A04
            r1 = 3
        L_0x05c7:
            X.PUC r0 = new X.PUC
            r0.<init>((int) r1, (java.lang.Object) r6, (java.lang.Object) r2, (java.lang.Object) r5)
            r3.A02(r4, r0)
            goto L_0x004b
        L_0x05d1:
            java.lang.String r12 = (java.lang.String) r12
            r10 = 0
            X.0qQ.A0B(r12, r10)
            java.lang.Object r7 = r0.A05
            X.7Zl r7 = (X.C333567Zl) r7
            java.lang.Object r6 = r0.A04
            com.instagram.model.direct.DirectThreadKey r6 = (com.instagram.model.direct.DirectThreadKey) r6
            com.instagram.common.session.UserSession r5 = r7.A01
            java.lang.Object r9 = r0.A03
            X.6o8 r9 = (X.C317966o8) r9
            java.lang.Object r8 = r0.A01
            X.797 r8 = (X.AnonymousClass797) r8
            float r1 = r9.A01
            int r11 = (int) r1
            float r1 = r9.A00
            int r4 = (int) r1
            long r1 = java.lang.System.nanoTime()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            X.3Q2 r3 = new X.3Q2
            r3.<init>(r1)
            X.1iA r1 = X.1iA.A08
            r3.A0V(r1)
            com.instagram.pendingmedia.model.constants.ShareType r1 = com.instagram.pendingmedia.model.constants.ShareType.DIRECT_SHARE
            r3.A0e(r1)
            r3.A33 = r12
            r3.A0H = r11
            r3.A0G = r4
            r3.A0S = r11
            r3.A0R = r4
            r2 = 1
            r3.A6C = r2
            r3.A4x = r10
            java.lang.String r1 = r9.A0a
            r3.A34 = r1
            java.util.List r1 = r6.A02
            r3.A4q = r1
            r3.A53 = r2
            boolean r1 = r8.A00()
            r3.A5D = r1
            X.1ua r1 = r7.A03
            r1.A0C(r3)
            X.C64008LIv.A00(r5, r6, r3, r1)
            X.5yB r1 = X.C63326Kv9.A00(r3)
            java.lang.Object r0 = r0.A02
            X.C51965G9l.A1W(r0, r1)
            goto L_0x004b
        L_0x0638:
            X.5cr r12 = (X.C289005cr) r12
            long r3 = r12.A00
            java.lang.Object r2 = r0.A04
            X.4cd r2 = (X.C268024cd) r2
            int r1 = X.C51965G9l.A04(r3)
            float r5 = r2.Ezw(r1)
            int r1 = X.C289005cr.A00(r3)
            float r9 = r2.Ezw(r1)
            java.lang.Object r8 = r0.A01
            X.5Oz r8 = (X.C284945Oz) r8
            java.lang.Object r7 = r0.A02
            X.0sP r7 = (X.0sP) r7
            r1 = 0
            java.lang.Object r2 = X.C51968G9o.A0w(r1, r7)
            X.Gmb r2 = (X.C53351Gmb) r2
            r6 = 1
            if (r2 == 0) goto L_0x0a54
            int r1 = r2.A01
            if (r1 != r6) goto L_0x0a54
            float r1 = r2.A00
            r4 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r4
            float r1 = r1 * r9
            float r1 = r1 / r4
            float r1 = r5 - r1
            r3 = 0
            float r1 = java.lang.Math.max(r1, r3)
            X.5d0 r1 = X.C51965G9l.A0T(r1)
            r8.Epw(r1)
            java.lang.Object r2 = r0.A03
            X.5Oz r2 = (X.C284945Oz) r2
            java.lang.Object r0 = r0.A05
            java.util.List r0 = (java.util.List) r0
            int r0 = X.C51970G9q.A0A(r0)
            java.lang.Object r1 = X.C51968G9o.A0w(r0, r7)
            X.Gmb r1 = (X.C53351Gmb) r1
            if (r1 == 0) goto L_0x0a4f
            int r0 = r1.A01
            if (r0 != r6) goto L_0x0a4f
            float r0 = r1.A00
            float r9 = r9 * r0
            float r9 = r9 / r4
            float r5 = r5 - r9
            float r0 = java.lang.Math.max(r5, r3)
            X.5d0 r0 = X.C51965G9l.A0T(r0)
            r2.Epw(r0)
            goto L_0x004b
        L_0x06a5:
            X.HPK r12 = (X.HPK) r12
            r4 = 0
            X.0qQ.A0B(r12, r4)
            java.lang.Object r5 = r0.A05
            X.8ME r5 = (X.AnonymousClass8ME) r5
            X.4DH r2 = r5.A0l
            android.content.Context r1 = r2.getContext()
            if (r1 == 0) goto L_0x004b
            boolean r1 = r2.mDetached
            if (r1 != 0) goto L_0x004b
            boolean r1 = r2.mRemoving
            if (r1 != 0) goto L_0x004b
            boolean r1 = r12 instanceof X.H91
            if (r1 == 0) goto L_0x070a
            r1 = r12
            X.H91 r1 = (X.H91) r1
            java.lang.String r6 = r1.A00
            java.lang.Object r3 = r0.A01
            X.6tR r3 = (X.C321016tR) r3
            r3.A0E = r6
            X.IOq r1 = new X.IOq
            r1.<init>(r12)
            r3.A9D(r1)
            java.lang.Object r2 = r0.A04
            X.6o8 r2 = (X.C317966o8) r2
            com.instagram.common.typedurl.SimpleImageUrl r1 = X.DbS.A0V(r6)
            r2.A0H = r1
            com.instagram.common.session.UserSession r1 = r5.A0r
            X.6tY r1 = X.C353578Ie.A00(r1)
            java.lang.Object r0 = r0.A03
            X.6nz r0 = (X.C317876nz) r0
            r1.A02(r0)
            X.0eK r0 = r5.A1t
            java.lang.Object r1 = r0.get()
            X.8cb r1 = (X.C359318cb) r1
            if (r1 == 0) goto L_0x06fb
            r0 = 1
            r1.DBP(r0)
        L_0x06fb:
            r3.A0C(r6)
            X.8Nu r0 = r5.A0v
            r0.A00()
            X.8BA r0 = r5.A0y
            X.AnonymousClass8BA.A0G(r0, r4, r4)
            goto L_0x004b
        L_0x070a:
            android.content.Context r3 = r5.A0f
            java.lang.ref.WeakReference r2 = X.C51965G9l.A0v(r3)
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r1 = r5.A10
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r1 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r1
            int r1 = r1.A0G
            boolean r1 = X.LSX.A04(r12, r2, r1)
            if (r1 != 0) goto L_0x004b
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r1 = r5.A1m
            java.lang.Object r0 = r0.A02
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r1.A0S(r0)
            X.8BA r0 = r5.A0y
            X.AnonymousClass8BA.A0G(r0, r4, r4)
            X.8Nu r0 = r5.A0v
            r0.A00()
            X.LPO.A02(r3)
            goto L_0x004b
        L_0x0734:
            X.2WE r4 = X.C51968G9o.A0f(r12)
            java.lang.Object r5 = r0.A03
            X.JK9 r1 = X.JK9.A00
            r4.A01(r5, r1)
            java.lang.Object r2 = r0.A01
            X.JKA r1 = X.JKA.A00
            r4.A01(r2, r1)
            X.JKB r1 = X.JKB.A00
            r4.A01(r2, r1)
            java.lang.Object r2 = r0.A02
            X.JKC r1 = X.JKC.A00
            r4.A01(r2, r1)
            java.lang.Object r2 = r0.A05
            X.JKD r1 = X.JKD.A00
            r4.A01(r2, r1)
            java.lang.Object r3 = r0.A04
            java.lang.Object[] r2 = new java.lang.Object[]{r3, r5}
            r1 = 9
            X.JJU r0 = new X.JJU
            r0.<init>(r1, r5, r3)
            r4.A03(r0, r2)
            java.lang.Object[] r1 = X.C51966G9m.A1b()
            X.JEQ r0 = X.JEQ.A00
            r4.A02(r0, r1)
            goto L_0x004b
        L_0x0774:
            X.SGo r12 = (X.C11230SGo) r12
            r1 = 0
            X.0qQ.A0B(r12, r1)
            int r2 = r12.A00
            java.lang.Object r1 = r0.A05
            com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro r1 = (com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro) r1
            if (r2 != 0) goto L_0x07c7
            X.SPQ r6 = r1.A06
            java.lang.Object r5 = r0.A02
            X.JwB r5 = (X.C61073JwB) r5
            java.lang.String r3 = r5.A01
            java.lang.Object r1 = r0.A04
            com.android.billingclient.api.Purchase r1 = (com.android.billingclient.api.Purchase) r1
            java.lang.String r2 = r1.A01()
            java.lang.Object r1 = r0.A03
            java.util.Map r1 = (java.util.Map) r1
            if (r1 != 0) goto L_0x079c
            X.0sm r1 = X.0Yt.A0E()
        L_0x079c:
            java.util.LinkedHashMap r4 = X.0Yt.A03(r1)
            X.RH0 r1 = X.RH0.A0Q
            java.lang.String r1 = r1.A00
            r4.put(r1, r3)
            if (r2 == 0) goto L_0x07b0
            X.RH0 r1 = X.RH0.A0V
            java.lang.String r1 = r1.A00
            r4.put(r1, r2)
        L_0x07b0:
            X.TjB r3 = r6.A00
            r2 = 0
            r1 = 667(0x29b, float:9.35E-43)
            java.lang.String r1 = X.Pxd.A00(r1)
            r3.Cgp(r4, r2, r1)
            java.lang.Object r0 = r0.A01
            X.S1E r0 = (X.S1E) r0
            if (r0 == 0) goto L_0x004b
            r0.A00(r5)
            goto L_0x004b
        L_0x07c7:
            X.SPQ r4 = r1.A06
            java.lang.Object r1 = r0.A02
            X.JwB r1 = (X.C61073JwB) r1
            java.lang.String r3 = r1.A01
            java.lang.Object r1 = r0.A04
            com.android.billingclient.api.Purchase r1 = (com.android.billingclient.api.Purchase) r1
            java.lang.String r2 = r1.A01()
            java.lang.Object r1 = r0.A03
            java.util.Map r1 = (java.util.Map) r1
            r4.A03(r12, r3, r2, r1)
            java.lang.Object r0 = r0.A01
            X.S1E r0 = (X.S1E) r0
            if (r0 == 0) goto L_0x004b
            com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro r1 = r0.A00
            X.RFl r0 = X.C8918RFl.CONSUME_FAILURE
            com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro.A0E(r1, r0)
            goto L_0x004b
        L_0x07ed:
            X.TaB r12 = (X.C13425TaB) r12
            boolean r1 = r12 instanceof X.C13944Tlq     // Catch:{ all -> 0x08c4 }
            if (r1 == 0) goto L_0x004b
            X.Tlq r12 = (X.C13944Tlq) r12     // Catch:{ all -> 0x08c4 }
            r1 = 1
            X.0qQ.A0B(r12, r1)     // Catch:{ all -> 0x08c4 }
            boolean r8 = r12 instanceof X.C7626QQs     // Catch:{ all -> 0x08c4 }
            if (r8 == 0) goto L_0x0810
            r9 = r12
            X.QQs r9 = (X.C7626QQs) r9     // Catch:{ all -> 0x08c4 }
            if (r9 == 0) goto L_0x0811
            long r2 = r9.A01     // Catch:{ all -> 0x08c4 }
            r4 = 0
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x0811
            long r6 = r9.A00     // Catch:{ all -> 0x08c4 }
            float r5 = (float) r6     // Catch:{ all -> 0x08c4 }
            float r1 = (float) r2     // Catch:{ all -> 0x08c4 }
            float r5 = r5 / r1
            goto L_0x0812
        L_0x0810:
            r9 = 0
        L_0x0811:
            r5 = 0
        L_0x0812:
            r6 = 0
            if (r9 == 0) goto L_0x0819
            long r1 = r9.A00     // Catch:{ all -> 0x08c4 }
            int r4 = (int) r1     // Catch:{ all -> 0x08c4 }
            goto L_0x081a
        L_0x0819:
            r4 = 0
        L_0x081a:
            if (r9 == 0) goto L_0x0820
            long r1 = r9.A01     // Catch:{ all -> 0x08c4 }
            int r3 = (int) r1     // Catch:{ all -> 0x08c4 }
            goto L_0x0821
        L_0x0820:
            r3 = 0
        L_0x0821:
            double r1 = (double) r5
            r9 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r7 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            boolean r2 = X.C51970G9q.A1T(r7)
            boolean r7 = r12 instanceof X.C13943Tlp     // Catch:{ all -> 0x08c4 }
            boolean r1 = r12 instanceof X.C7625QQr     // Catch:{ all -> 0x08c4 }
            if (r1 == 0) goto L_0x0837
            r6 = 2131952987(0x7f13055b, float:1.9542432E38)
            goto L_0x084c
        L_0x0837:
            if (r8 == 0) goto L_0x083d
            r6 = 2131952985(0x7f130559, float:1.9542428E38)
            goto L_0x084c
        L_0x083d:
            boolean r1 = r12 instanceof X.C13942Tlo     // Catch:{ all -> 0x08c4 }
            if (r1 == 0) goto L_0x0845
            r6 = 2131952988(0x7f13055c, float:1.9542434E38)
            goto L_0x084c
        L_0x0845:
            boolean r1 = r12 instanceof X.C7619QQj     // Catch:{ all -> 0x08c4 }
            if (r1 == 0) goto L_0x084c
            r6 = 2131952986(0x7f13055a, float:1.954243E38)
        L_0x084c:
            java.lang.Object r1 = r0.A04     // Catch:{ all -> 0x08c4 }
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch:{ all -> 0x08c4 }
            r1.setText(r6)     // Catch:{ all -> 0x08c4 }
            java.lang.Object r1 = r0.A02     // Catch:{ all -> 0x08c4 }
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1     // Catch:{ all -> 0x08c4 }
            r1.setMax(r3)     // Catch:{ all -> 0x08c4 }
            r1.setProgress(r4)     // Catch:{ all -> 0x08c4 }
            r1.setIndeterminate(r2)     // Catch:{ all -> 0x08c4 }
            java.lang.Object r4 = r0.A03     // Catch:{ all -> 0x08c4 }
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r2 == 0) goto L_0x0869
            java.lang.String r1 = ""
            goto L_0x087f
        L_0x0869:
            java.text.NumberFormat r3 = java.text.NumberFormat.getPercentInstance()     // Catch:{ all -> 0x08c4 }
            r1 = 0
            r3.setMaximumFractionDigits(r1)     // Catch:{ all -> 0x08c4 }
            r2 = 32
            java.lang.Float r1 = java.lang.Float.valueOf(r5)     // Catch:{ all -> 0x08c4 }
            java.lang.String r1 = r3.format(r1)     // Catch:{ all -> 0x08c4 }
            java.lang.String r1 = X.002.A0D(r1, r2)     // Catch:{ all -> 0x08c4 }
        L_0x087f:
            r4.setText(r1)     // Catch:{ all -> 0x08c4 }
            java.lang.Object r2 = r0.A01     // Catch:{ all -> 0x08c4 }
            android.view.View r2 = (android.view.View) r2
            r1 = 4
            if (r7 == 0) goto L_0x088a
            r1 = 0
        L_0x088a:
            r2.setVisibility(r1)     // Catch:{ all -> 0x08c4 }
            java.lang.Object r6 = r0.A05     // Catch:{ all -> 0x08c4 }
            X.QBz r6 = (X.C7415QBz) r6     // Catch:{ all -> 0x08c4 }
            java.lang.Integer r5 = X.AnonymousClass05K.A03     // Catch:{ all -> 0x08c4 }
            java.lang.Integer r4 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x08c4 }
            r1 = 628(0x274, float:8.8E-43)
            java.lang.String r1 = X.Pxd.A00(r1)     // Catch:{ all -> 0x08c4 }
            X.0eM r2 = r6.A01     // Catch:{ all -> 0x08c4 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x08c4 }
            X.Jfk r2 = (X.C60104Jfk) r2     // Catch:{ all -> 0x08c4 }
            java.lang.Boolean r2 = r2.A01     // Catch:{ all -> 0x08c4 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x08c4 }
            X.0eP r3 = X.AnonymousClass7TE.A1L(r1, r2)     // Catch:{ all -> 0x08c4 }
            r1 = 786(0x312, float:1.101E-42)
            java.lang.String r1 = X.Pxd.A00(r1)     // Catch:{ all -> 0x08c4 }
            java.lang.String r2 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x08c4 }
            X.0eP r1 = X.AnonymousClass7TE.A1L(r1, r2)     // Catch:{ all -> 0x08c4 }
            X.0eP[] r1 = new X.0eP[]{r3, r1}     // Catch:{ all -> 0x08c4 }
            X.C7415QBz.A00(r6, r5, r4, r1)     // Catch:{ all -> 0x08c4 }
            goto L_0x004b
        L_0x08c4:
            r2 = move-exception
            java.lang.Object r1 = r0.A05
            X.QBz r1 = (X.C7415QBz) r1
            X.0eM r0 = r1.A01
            X.C51976G9y.A0T(r1, r2, r0)
            goto L_0x004b
        L_0x08d0:
            X.IGf r12 = (X.C56884IGf) r12
            java.lang.Object r4 = r0.A04
            X.5Tl r4 = (X.C285975Tl) r4
            java.lang.Object r1 = r0.A05
            X.Gb9 r1 = (X.C52697Gb9) r1
            X.JLL r3 = r1.A00
            java.lang.Object r2 = r0.A01
            X.5Uc r2 = (X.C286145Uc) r2
            java.lang.Object r1 = r0.A02
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r0.A03
            X.0sP r0 = (X.0sP) r0
            r12.A05 = r4
            r12.A04 = r2
            r12.A07 = r1
            r12.A08 = r0
            r0 = 0
            if (r3 == 0) goto L_0x0915
            r1 = r3
            X.GbA r1 = (X.C52698GbA) r1
            X.Gc7 r1 = r1.A00
        L_0x08f8:
            r12.A01 = r1
            if (r3 == 0) goto L_0x0913
            r1 = r3
            X.GbA r1 = (X.C52698GbA) r1
            X.Gb5 r1 = r1.A02
        L_0x0901:
            r12.A02 = r1
            if (r3 == 0) goto L_0x090f
            X.GbA r3 = (X.C52698GbA) r3
            X.4bM r0 = X.AnonymousClass5YA.A0D
            java.lang.Object r0 = X.C288795cU.A00(r0, r3)
            X.5RG r0 = (X.AnonymousClass5RG) r0
        L_0x090f:
            r12.A03 = r0
            goto L_0x004b
        L_0x0913:
            r1 = r0
            goto L_0x0901
        L_0x0915:
            r1 = r0
            goto L_0x08f8
        L_0x0917:
            X.HhX r12 = (X.C55427HhX) r12
            java.lang.Object r6 = r0.A04
            X.62b r6 = (X.C3022062b) r6
            java.lang.Object r1 = r6.A02
            X.6Gc r1 = (X.C305016Gc) r1
            X.I0z r5 = r1.A00()
            r3 = 0
            if (r5 == 0) goto L_0x0977
            X.5ZB r4 = r5.A03
        L_0x092a:
            java.lang.Object r1 = r0.A01
            X.4gU r1 = (X.C270284gU) r1
            boolean r1 = X.C51971G9r.A1X(r1)
            if (r1 == 0) goto L_0x0975
            if (r5 == 0) goto L_0x0975
            X.5ZB r2 = r5.A00
        L_0x0938:
            if (r4 == 0) goto L_0x093e
            X.5ZB r2 = r4.A00(r2)
        L_0x093e:
            java.lang.Object r1 = r0.A02
            X.4gU r1 = (X.C270284gU) r1
            boolean r1 = X.C51971G9r.A1X(r1)
            if (r1 == 0) goto L_0x0973
            if (r5 == 0) goto L_0x0973
            X.5ZB r1 = r5.A01
        L_0x094c:
            if (r2 == 0) goto L_0x0952
            X.5ZB r1 = r2.A00(r1)
        L_0x0952:
            java.lang.Object r0 = r0.A03
            X.4gU r0 = (X.C270284gU) r0
            boolean r0 = X.C51971G9r.A1X(r0)
            if (r0 == 0) goto L_0x0960
            if (r5 == 0) goto L_0x0960
            X.5ZB r3 = r5.A02
        L_0x0960:
            if (r1 == 0) goto L_0x0966
            X.5ZB r3 = r1.A00(r3)
        L_0x0966:
            if (r3 == 0) goto L_0x004b
            int r2 = r6.A01
            int r1 = r6.A00
            X.6Bd r0 = r12.A00
            r0.A06(r3, r2, r1)
            goto L_0x004b
        L_0x0973:
            r1 = r3
            goto L_0x094c
        L_0x0975:
            r2 = r3
            goto L_0x0938
        L_0x0977:
            r4 = r3
            goto L_0x092a
        L_0x0979:
            X.5Q4 r12 = (X.AnonymousClass5Q4) r12
            r12.AQW()
            java.lang.Object r1 = r0.A01
            X.Hk1 r1 = (X.C55581Hk1) r1
            X.5PZ r1 = r1.A01
            float r17 = r1.B6X()
            r4 = 0
            int r1 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x004b
            java.lang.Object r3 = r0.A03
            X.JS3 r3 = (X.JS3) r3
            java.lang.Object r1 = r0.A05
            X.5Tl r1 = (X.C285975Tl) r1
            long r1 = r1.A00
            int r1 = X.C51965G9l.A04(r1)
            int r2 = r3.E1S(r1)
            java.lang.Object r1 = r0.A04
            X.Gc7 r1 = (X.C52754Gc7) r1
            X.I1h r1 = X.C52754Gc7.A00(r1)
            if (r1 == 0) goto L_0x09e6
            X.62f r1 = r1.A02
            X.5VN r5 = r1.A06(r2)
        L_0x09af:
            X.5b9 r1 = X.C55294HfN.A00
            r1 = 1073741824(0x40000000, float:2.0)
            float r16 = r12.F06(r1)
            float r4 = r5.A01
            float r3 = r16 / r1
            float r4 = r4 + r3
            float r2 = X.C51969G9p.A00(r12)
            float r2 = r2 - r3
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x09c6
            r4 = r2
        L_0x09c6:
            int r1 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x09cb
            r4 = r3
        L_0x09cb:
            float r1 = r5.A03
            long r20 = X.C289325dP.A00(r4, r1)
            float r1 = r5.A00
            long r22 = X.C289325dP.A00(r4, r1)
            java.lang.Object r13 = r0.A02
            X.6Ff r13 = (X.C304786Ff) r13
            r14 = 0
            r18 = 0
            r19 = 3
            r15 = r14
            r12.AQi(r13, r14, r15, r16, r17, r18, r19, r20, r22)
            goto L_0x004b
        L_0x09e6:
            X.5VN r5 = new X.5VN
            r5.<init>(r4, r4, r4, r4)
            goto L_0x09af
        L_0x09ec:
            X.HLh r12 = (X.C54624HLh) r12
            r1 = 0
            X.0qQ.A0B(r12, r1)
            java.lang.Object r11 = r0.A04
            X.4cd r11 = (X.C268024cd) r11
            java.lang.Object r10 = r0.A02
            X.4gU r10 = (X.C270284gU) r10
            java.lang.Object r14 = r0.A03
            X.0sP r14 = (X.0sP) r14
            java.lang.Object r9 = r0.A01
            X.5b9 r9 = (X.AnonymousClass5b9) r9
            java.lang.Object r13 = r0.A05
            java.lang.Float r13 = (java.lang.Float) r13
            X.Hri r8 = new X.Hri
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r8
        L_0x0a0c:
            X.1Ln r12 = (X.1Ln) r12
            r8 = r12
            X.GkK r3 = new X.GkK
            r3.<init>()
            java.lang.Object r2 = r0.A05
            com.facebookpay.logging.LoggingContext r2 = (com.facebookpay.logging.LoggingContext) r2
            X.C51971G9r.A1B(r3, r2)
            java.lang.Object r1 = r0.A03
            X.C51975G9x.A19(r3, r1)
            X.GkD r2 = X.SQ1.A00(r2)
            java.lang.String r1 = "logging_policy"
            r3.A02(r2, r1)
            java.lang.String r2 = "checkout"
            java.lang.String r1 = "target_name"
            r3.A06(r1, r2)
            java.lang.Object r2 = r0.A01
            java.util.List r2 = (java.util.List) r2
            java.lang.String r1 = "applied_discounts"
            r3.A07(r1, r2)
            java.lang.Object r2 = r0.A02
            java.lang.Long r2 = (java.lang.Long) r2
            if (r2 == 0) goto L_0x0a44
            java.lang.String r1 = "credential_id"
            r3.A05(r1, r2)
        L_0x0a44:
            java.lang.String r1 = "event_payload"
            r12.A0N(r3, r1)
            java.lang.Object r0 = r0.A04
            X.C51969G9p.A1G(r12, r0)
            return r8
        L_0x0a4f:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0a54:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58790Ixb.invoke(java.lang.Object):java.lang.Object");
    }
}
