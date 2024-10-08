package X;

public final class JK4 extends 0Yg implements 0sI {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JK4(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        super(5);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A04 = obj3;
        this.A05 = obj4;
        this.A03 = obj5;
    }

    /* JADX WARNING: type inference failed for: r5v9, types: [androidx.compose.ui.Modifier] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r24, java.lang.Object r25, java.lang.Object r26, java.lang.Object r27, java.lang.Object r28) {
        /*
            r23 = this;
            r8 = r23
            r14 = r26
            r12 = r28
            r13 = r27
            r3 = r25
            r2 = r24
            int r0 = r8.A00
            if (r0 == 0) goto L_0x0177
            X.3a0 r2 = (X.C243733a0) r2
            X.3Za r3 = (X.C243503Za) r3
            int r1 = X.AnonymousClass7TE.A0M(r14)
            X.3Wa r13 = (X.C242813Wa) r13
            X.3Zu r12 = (X.C243683Zu) r12
            r4 = 1
            X.AnonymousClass7TG.A0w(r4, r3, r13, r12)
            java.lang.Object r11 = r8.A03
            X.1Xj r11 = (X.1Xj) r11
            boolean r0 = r11.A5m()
            if (r0 != 0) goto L_0x00a4
            java.lang.Object r7 = r8.A01
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L_0x0036
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0040
        L_0x0036:
            java.lang.Object r0 = r8.A05
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            boolean r0 = r11.A6V(r0)
            if (r0 == 0) goto L_0x00a4
        L_0x0040:
            java.lang.Object r5 = r8.A05
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.Object r2 = r8.A04
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            if (r7 != 0) goto L_0x004c
            X.0sn r7 = X.0sn.A00
        L_0x004c:
            java.lang.Object r9 = r8.A02
            android.content.Context r9 = (android.content.Context) r9
            boolean r0 = X.C56645I6a.A03(r5)
            if (r0 == 0) goto L_0x010a
            X.3ZH r0 = r3.A09
            X.3ZG r0 = r0.A00
            java.util.List r0 = r0.getCarouselMediaImmutable()
            r10 = 0
            if (r0 == 0) goto L_0x0097
            java.lang.Object r0 = X.00k.A0O(r0, r1)
            X.3ZG r0 = (X.AnonymousClass3ZG) r0
            if (r0 == 0) goto L_0x0097
            java.lang.String r5 = r0.getId()
            if (r5 == 0) goto L_0x0097
            java.util.List r0 = X.C51966G9m.A1I(r11)
            if (r0 == 0) goto L_0x0097
            java.util.Iterator r4 = r0.iterator()
        L_0x0079:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00a2
            java.lang.Object r1 = r4.next()
            java.lang.String r0 = X.C51966G9m.A1E(r1)
            boolean r0 = X.0qQ.A0K(r0, r5)
            if (r0 == 0) goto L_0x0079
        L_0x008d:
            X.1Xj r1 = (X.1Xj) r1
            if (r1 == 0) goto L_0x0097
            X.1Xy r0 = r1.A0C
            com.instagram.user.model.User r10 = r0.BfH()
        L_0x0097:
            r4 = r9
            r5 = r11
            r6 = r12
            r7 = r13
            r8 = r3
            r9 = r2
            android.text.SpannableStringBuilder r10 = X.C56623I5b.A00(r4, r5, r6, r7, r8, r9, r10)
        L_0x00a1:
            return r10
        L_0x00a2:
            r1 = r10
            goto L_0x008d
        L_0x00a4:
            boolean r0 = r11.A5m()
            if (r0 == 0) goto L_0x0172
            java.lang.Object r0 = r8.A04
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r1 = r0.getUsername()
            java.lang.Object r6 = r8.A02
            android.content.Context r6 = (android.content.Context) r6
            java.lang.String r0 = r11.A34(r6)
            java.lang.String r7 = java.lang.String.valueOf(r0)
            if (r2 == 0) goto L_0x0108
            boolean r0 = r2.A01
            if (r0 == r4) goto L_0x00c8
            boolean r0 = r2.A02
            if (r0 != r4) goto L_0x0108
        L_0x00c8:
            r5 = 0
            java.lang.String r7 = ""
        L_0x00cb:
            r0 = 2131968993(0x7f1343e1, float:1.9574896E38)
            r3 = 0
            java.lang.String r2 = X.DbV.A0u(r6, r1, r7, r0)
            X.0qQ.A07(r2)
            android.text.SpannableStringBuilder r0 = X.C51965G9l.A0E()
            android.text.SpannableStringBuilder r10 = r0.append(r2)
            int r1 = X.DbX.A05(r1)
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r4)
            r4 = 18
            r10.setSpan(r0, r3, r1, r4)
            if (r5 == 0) goto L_0x00a1
            int r3 = r2.length()
            int r2 = X.DbX.A05(r7)
            r0 = 2130970310(0x7f0406c6, float:1.7549327E38)
            int r0 = X.AnonymousClass7TF.A03(r6, r0)
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            r1.<init>(r0)
            int r0 = r3 - r2
            r10.setSpan(r1, r0, r3, r4)
            return r10
        L_0x0108:
            r5 = 1
            goto L_0x00cb
        L_0x010a:
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0125
            java.lang.String r0 = r2.getUsername()
            android.text.SpannableStringBuilder r10 = X.DbS.A0C(r0)
        L_0x0118:
            X.0qQ.A0A(r10)
            r16 = 0
            X.3W1 r0 = r3.A0D
            r14 = r0
            r15 = r2
            X.C56623I5b.A01(r9, r10, r11, r12, r13, r14, r15, r16)
            return r10
        L_0x0125:
            int r0 = r7.size()
            if (r0 != r4) goto L_0x014a
            X.0Tu r4 = X.AnonymousClass7TF.A0H(r5)
            r0 = 36320279273677000(0x81091a004020c8, double:3.0324290904745706E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x014a
            java.lang.Object r0 = X.00k.A0I(r7)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r10 = r9
            r14 = r3
            r15 = r2
            r16 = r0
            android.text.SpannableStringBuilder r10 = X.C56623I5b.A00(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0118
        L_0x014a:
            android.text.SpannableStringBuilder r8 = X.C51965G9l.A0E()
            android.content.res.Resources r6 = r9.getResources()
            r5 = 2131820877(0x7f11014d, float:1.9274481E38)
            int r4 = r7.size()
            java.lang.String r1 = r2.getUsername()
            int r0 = r7.size()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
            android.text.Spanned r0 = X.0bC.A02(r6, r0, r5, r4)
            android.text.SpannableStringBuilder r10 = r8.append(r0)
            goto L_0x0118
        L_0x0172:
            android.text.SpannableStringBuilder r10 = X.C51965G9l.A0E()
            return r10
        L_0x0177:
            int r7 = X.AnonymousClass7TE.A0M(r3)
            X.7aD r14 = (X.C333827aD) r14
            X.5Wy r13 = (X.C286575Wy) r13
            int r1 = X.AnonymousClass7TE.A0M(r12)
            r3 = 0
            int r6 = X.DbW.A02(r3, r2, r14)
            r0 = r1 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x049a
            int r5 = X.G9t.A06(r13, r7)
            r5 = r5 | r1
        L_0x0191:
            r0 = r1 & 896(0x380, float:1.256E-42)
            r4 = 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L_0x019c
            int r0 = X.G9t.A0Q(r13, r14)
            r5 = r5 | r0
        L_0x019c:
            r1 = r5 & 5841(0x16d1, float:8.185E-42)
            r0 = 1168(0x490, float:1.637E-42)
            if (r1 != r0) goto L_0x01ae
            boolean r0 = r13.Bwn()
            if (r0 == 0) goto L_0x01ae
            r13.Evl()
        L_0x01ab:
            X.0gF r10 = X.C60340gF.A00
            return r10
        L_0x01ae:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x01bc
            r1 = 1679608393(0x641cca49, float:1.1569073E22)
            java.lang.String r0 = "com.instagram.comments.mvvm.view.compose.CommentListContent.<anonymous>.<anonymous> (CommentList.kt:166)"
            X.0fL.A01(r1, r0)
        L_0x01bc:
            r0 = 1158437697(0x450c5b41, float:2245.7034)
            r13.ExS(r0)
            java.lang.Object r2 = r8.A01
            android.content.Context r2 = (android.content.Context) r2
            boolean r1 = r13.AGu(r2)
            r0 = r5 & 896(0x380, float:1.256E-42)
            boolean r0 = X.AnonymousClass7TF.A1S(r0, r4)
            r1 = r1 | r0
            java.lang.Object r5 = r8.A05
            X.GgO r5 = (X.C52971GgO) r5
            java.lang.Object r4 = r13.ECw()
            if (r1 != 0) goto L_0x01df
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r4 != r0) goto L_0x01eb
        L_0x01df:
            android.content.res.Resources r0 = X.AnonymousClass7TF.A0A(r2)
            X.Hrc r4 = new X.Hrc
            r4.<init>(r0, r14, r5)
            r13.FLL(r4)
        L_0x01eb:
            X.Hrc r4 = (X.C56030Hrc) r4
            X.5Wx r2 = X.C51965G9l.A0H(r13, r3)
            boolean r0 = r14 instanceof X.C335907dj
            r1 = 0
            if (r0 == 0) goto L_0x0240
            r0 = 1158448006(0x450c8386, float:2248.2202)
            r13.ExS(r0)
            r9 = r14
            X.7dj r9 = (X.C335907dj) r9
            java.lang.Object r6 = r8.A02
            X.7a7 r6 = (X.C333777a7) r6
            X.5Qk r5 = androidx.compose.ui.Modifier.A00
            java.lang.Object r11 = r8.A04
            X.0lg r11 = (X.0lg) r11
            X.0Tu r10 = X.0Tu.A05
            r0 = 36318771737467334(0x8107bb001719c6, double:3.031475718505217E-306)
            boolean r0 = X.182.A06(r10, r11, r0)
            java.lang.Object r1 = r8.A03
            java.util.List r1 = (java.util.List) r1
            if (r0 == 0) goto L_0x0226
            X.AnonymousClass7TF.A1C(r5, r3, r1)
            com.instagram.comments.mvvm.view.viewpoint.CommentRowMerlinModifierElement r0 = new com.instagram.comments.mvvm.view.viewpoint.CommentRowMerlinModifierElement
            r0.<init>(r14, r6, r1, r7)
            androidx.compose.ui.Modifier r5 = r5.Ezh(r0)
        L_0x0226:
            androidx.compose.ui.Modifier r8 = X.C51966G9m.A0V(r5)
            r7 = r13
            r10 = r6
            r11 = r4
            r12 = r3
            r13 = r3
            X.C56256HvQ.A00(r7, r8, r9, r10, r11, r12, r13)
        L_0x0232:
            boolean r0 = X.C51967G9n.A1b(r2, r3)
            if (r0 == 0) goto L_0x01ab
            r0 = -1880086307(0xffffffff8ff028dd, float:-2.3681567E-29)
            X.0fL.A00(r0)
            goto L_0x01ab
        L_0x0240:
            boolean r0 = r14 instanceof X.C333817aC
            if (r0 == 0) goto L_0x0252
            r0 = 1158472437(0x450ce2f5, float:2254.1848)
            r13.ExS(r0)
            X.7aC r14 = (X.C333817aC) r14
            boolean r0 = r14.A03
            X.I6M.A04(r13, r1, r3, r6, r0)
            goto L_0x0232
        L_0x0252:
            boolean r0 = r14 instanceof X.C333847aF
            if (r0 == 0) goto L_0x0264
            r0 = 1158476501(0x450cf2d5, float:2255.177)
            r13.ExS(r0)
            X.7aF r14 = (X.C333847aF) r14
            boolean r0 = r14.A03
            X.I6M.A05(r0, r13, r3)
            goto L_0x0232
        L_0x0264:
            boolean r0 = r14 instanceof X.C336617eu
            if (r0 == 0) goto L_0x0274
            r0 = 1158480627(0x450d02f3, float:2256.1843)
            r13.ExS(r0)
            X.7eu r14 = (X.C336617eu) r14
            X.C54872HWf.A00(r13, r14, r4, r3)
            goto L_0x0232
        L_0x0274:
            boolean r0 = r14 instanceof X.C336627ev
            if (r0 == 0) goto L_0x0284
            r0 = 1158484711(0x450d12e7, float:2257.1814)
            r13.ExS(r0)
            X.7ev r14 = (X.C336627ev) r14
            X.C54884HWr.A00(r13, r14, r3)
            goto L_0x0232
        L_0x0284:
            boolean r0 = r14 instanceof X.C336637ew
            if (r0 == 0) goto L_0x02d3
            r0 = 1158488804(0x450d22e4, float:2258.1807)
            r13.ExS(r0)
            r0 = 1158490049(0x450d27c1, float:2258.4846)
            boolean r0 = X.C51967G9n.A1Y(r13, r4, r0)
            java.lang.Object r1 = r13.ECw()
            if (r0 != 0) goto L_0x029f
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x02a5
        L_0x029f:
            r0 = 17
            X.In8 r1 = X.C51970G9q.A0s(r13, r4, r0)
        L_0x02a5:
            X.0sP r7 = X.C51968G9o.A1A(r2, r1)
            r0 = 1158492642(0x450d31e2, float:2259.1177)
            boolean r0 = X.C51967G9n.A1Y(r13, r4, r0)
            java.lang.Object r1 = r13.ECw()
            if (r0 != 0) goto L_0x02ba
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x02c0
        L_0x02ba:
            r0 = 15
            X.Imy r1 = X.C51970G9q.A0r(r13, r4, r0)
        L_0x02c0:
            X.0sa r6 = X.C51968G9o.A19(r2, r1)
            X.7ew r14 = (X.C336637ew) r14
            boolean r1 = r14.A01
            X.7aI r0 = r14.A00
            r4 = r13
            r5 = r0
            r8 = r3
            r9 = r1
            X.C56255HvP.A01(r4, r5, r6, r7, r8, r9)
            goto L_0x0232
        L_0x02d3:
            boolean r0 = r14 instanceof X.C385159iU
            if (r0 == 0) goto L_0x02ea
            r0 = 1158500278(0x450d4fb6, float:2260.982)
            r13.ExS(r0)
            X.9iU r14 = (X.C385159iU) r14
            boolean r4 = r14.A02
            java.lang.String r1 = r14.A01
            X.3QO r0 = r14.A00
            X.C54869HWc.A00(r13, r0, r1, r3, r4)
            goto L_0x0232
        L_0x02ea:
            boolean r0 = r14 instanceof X.C54214H3j
            if (r0 == 0) goto L_0x02fd
            r0 = 1158505127(0x450d62a7, float:2262.1658)
            r13.ExS(r0)
            X.H3j r14 = (X.C54214H3j) r14
            X.HN2 r0 = r14.A00
            X.C54881HWo.A00(r13, r0, r4, r3)
            goto L_0x0232
        L_0x02fd:
            boolean r0 = r14 instanceof X.C385149iT
            if (r0 == 0) goto L_0x0378
            r0 = 1158510024(0x450d75c8, float:2263.3613)
            r13.ExS(r0)
            r10 = r14
            X.9iT r10 = (X.C385149iT) r10
            java.lang.Object r9 = r8.A02
            X.7a7 r9 = (X.C333777a7) r9
            r0 = 1158513202(0x450d8232, float:2264.1372)
            boolean r0 = X.C51967G9n.A1Y(r13, r5, r0)
            java.lang.Object r1 = r13.ECw()
            if (r0 != 0) goto L_0x031f
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x0324
        L_0x031f:
            r0 = 4
            X.InR r1 = X.C51970G9q.A0q(r13, r5, r0)
        L_0x0324:
            X.0Ya r6 = X.C51965G9l.A12(r2, r1)
            X.0sL r6 = (X.0sL) r6
            r0 = 1158515306(0x450d8a6a, float:2264.651)
            boolean r0 = X.C51967G9n.A1Y(r13, r5, r0)
            java.lang.Object r1 = r13.ECw()
            if (r0 != 0) goto L_0x033b
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x0341
        L_0x033b:
            r0 = 18
            X.In8 r1 = X.C51970G9q.A0s(r13, r5, r0)
        L_0x0341:
            X.0sP r16 = X.C51968G9o.A1A(r2, r1)
            X.5Qk r5 = androidx.compose.ui.Modifier.A00
            java.lang.Object r12 = r8.A04
            X.0lg r12 = (X.0lg) r12
            X.0Tu r11 = X.0Tu.A05
            r0 = 36318771737467334(0x8107bb001719c6, double:3.031475718505217E-306)
            boolean r0 = X.182.A06(r11, r12, r0)
            java.lang.Object r1 = r8.A03
            java.util.List r1 = (java.util.List) r1
            if (r0 == 0) goto L_0x0368
            X.AnonymousClass7TF.A1C(r5, r3, r1)
            com.instagram.comments.mvvm.view.viewpoint.CommentRowMerlinModifierElement r0 = new com.instagram.comments.mvvm.view.viewpoint.CommentRowMerlinModifierElement
            r0.<init>(r14, r9, r1, r7)
            androidx.compose.ui.Modifier r5 = r5.Ezh(r0)
        L_0x0368:
            r11 = r13
            r12 = r5
            r13 = r10
            r14 = r9
            r15 = r4
            r17 = r6
            r18 = r3
            r19 = r3
            X.C56253HvN.A00(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0232
        L_0x0378:
            boolean r0 = r14 instanceof X.C54213H3i
            if (r0 == 0) goto L_0x03a6
            r0 = 1158535601(0x450dd9b1, float:2269.6057)
            r13.ExS(r0)
            X.H3i r14 = (X.C54213H3i) r14
            r0 = 1158537801(0x450de249, float:2270.1428)
            boolean r0 = X.C51967G9n.A1Y(r13, r4, r0)
            java.lang.Object r1 = r13.ECw()
            if (r0 != 0) goto L_0x0395
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x039b
        L_0x0395:
            r0 = 16
            X.Imy r1 = X.C51970G9q.A0r(r13, r4, r0)
        L_0x039b:
            X.0Ya r0 = X.C51965G9l.A12(r2, r1)
            X.0sa r0 = (X.C62320sa) r0
            X.C54880HWn.A00(r13, r14, r0, r3)
            goto L_0x0232
        L_0x03a6:
            boolean r0 = r14 instanceof X.C333857aG
            if (r0 == 0) goto L_0x03b5
            r0 = 1158540947(0x450dee93, float:2270.911)
            r13.ExS(r0)
            X.I6M.A02(r13, r3)
            goto L_0x0232
        L_0x03b5:
            boolean r0 = r14 instanceof X.C54216H3l
            if (r0 == 0) goto L_0x0492
            r0 = 1555131803(0x5cb16d9b, float:3.99532667E17)
            r13.ExS(r0)
            X.H3l r14 = (X.C54216H3l) r14
            r0 = 1158547152(0x450e06d0, float:2272.4258)
            boolean r1 = X.C51967G9n.A1Y(r13, r4, r0)
            java.lang.Object r0 = r13.ECw()
            if (r1 != 0) goto L_0x03d2
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r0 != r1) goto L_0x03db
        L_0x03d2:
            r1 = 1
            X.InX r0 = new X.InX
            r0.<init>(r4, r1)
            r13.FLL(r0)
        L_0x03db:
            X.0Ya r10 = X.C51965G9l.A12(r2, r0)
            r0 = 1158550066(0x450e1232, float:2273.1372)
            boolean r1 = X.C51967G9n.A1Y(r13, r4, r0)
            java.lang.Object r0 = r13.ECw()
            if (r1 != 0) goto L_0x03f0
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r0 != r1) goto L_0x03f8
        L_0x03f0:
            X.InW r0 = new X.InW
            r0.<init>(r4, r6)
            r13.FLL(r0)
        L_0x03f8:
            X.0Ya r9 = X.C51965G9l.A12(r2, r0)
            r0 = 1158553913(0x450e2139, float:2274.0764)
            boolean r1 = X.C51967G9n.A1Y(r13, r4, r0)
            java.lang.Object r0 = r13.ECw()
            if (r1 != 0) goto L_0x040d
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r0 != r1) goto L_0x0415
        L_0x040d:
            X.InT r0 = new X.InT
            r0.<init>(r4, r6)
            r13.FLL(r0)
        L_0x0415:
            X.0Ya r7 = X.C51965G9l.A12(r2, r0)
            r0 = 1158556878(0x450e2cce, float:2274.8003)
            boolean r0 = X.C51967G9n.A1Y(r13, r4, r0)
            java.lang.Object r1 = r13.ECw()
            if (r0 != 0) goto L_0x042a
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x0430
        L_0x042a:
            r0 = 16
            X.In8 r1 = X.C51970G9q.A0s(r13, r4, r0)
        L_0x0430:
            X.0Ya r6 = X.C51965G9l.A12(r2, r1)
            r0 = 1158565233(0x450e4d71, float:2276.84)
            boolean r1 = X.C51967G9n.A1Y(r13, r5, r0)
            java.lang.Object r0 = r13.ECw()
            if (r1 != 0) goto L_0x0445
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r0 != r1) goto L_0x044e
        L_0x0445:
            r1 = 1
            X.InW r0 = new X.InW
            r0.<init>(r5, r1)
            r13.FLL(r0)
        L_0x044e:
            X.0Ya r5 = X.C51965G9l.A12(r2, r0)
            java.lang.Object r15 = r8.A02
            X.7a7 r15 = (X.C333777a7) r15
            X.0sJ r5 = (X.0sJ) r5
            r0 = 1158559650(0x450e37a2, float:2275.477)
            boolean r1 = X.C51967G9n.A1Y(r13, r4, r0)
            java.lang.Object r0 = r13.ECw()
            if (r1 != 0) goto L_0x0469
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r0 != r1) goto L_0x0472
        L_0x0469:
            r0 = 37
            X.JJQ r0 = X.JJQ.A00(r4, r0)
            r13.FLL(r0)
        L_0x0472:
            X.0sK r0 = (X.0sK) r0
            X.C286565Wx.A0L(r2, r3)
            X.0sP r6 = (X.0sP) r6
            X.0sI r10 = (X.0sI) r10
            X.0sK r7 = (X.0sK) r7
            X.0sJ r9 = (X.0sJ) r9
            r22 = r3
            r16 = r6
            r17 = r0
            r18 = r7
            r19 = r5
            r20 = r9
            r21 = r10
            X.C54878HWl.A00(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0232
        L_0x0492:
            r0 = 1158567718(0x450e5726, float:2277.4468)
            r13.ExS(r0)
            goto L_0x0232
        L_0x049a:
            r5 = r1
            goto L_0x0191
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JK4.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
