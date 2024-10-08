package X;

import android.os.Handler;
import android.text.NoCopySpan;
import android.text.TextWatcher;
import android.widget.TextView;
import com.instagram.creation.fragment.followersshare.FollowersShareFragment;

public final class LWP implements NoCopySpan, TextWatcher {
    public final int A00;
    public final Object A01;

    public LWP(FollowersShareFragment followersShareFragment, int i) {
        this.A00 = i;
        switch (i) {
            case 8:
            case 9:
                this.A01 = followersShareFragment;
                return;
            default:
                this.A01 = new 0mM(new Handler(), new C64889Ljp(followersShareFragment, 7), 1000);
                return;
        }
    }

    public static void A00(TextView textView, Object obj, int i) {
        textView.addTextChangedListener(new LWP(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004f, code lost:
        r0 = X.AnonymousClass7TE.A1I(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0057, code lost:
        r3.A07(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0198, code lost:
        X.0qQ.A0F(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x019f, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004d, code lost:
        if (r3 == null) goto L_?;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void afterTextChanged(android.text.Editable r30) {
        /*
            r29 = this;
            r2 = r29
            int r0 = r2.A00
            r1 = r30
            switch(r0) {
                case 2: goto L_0x02e3;
                case 3: goto L_0x0009;
                case 4: goto L_0x02eb;
                case 5: goto L_0x0009;
                case 6: goto L_0x0017;
                case 7: goto L_0x0043;
                case 8: goto L_0x017c;
                case 9: goto L_0x000a;
                case 10: goto L_0x02f3;
                case 11: goto L_0x005b;
                case 12: goto L_0x0009;
                case 13: goto L_0x0303;
                case 14: goto L_0x0009;
                case 15: goto L_0x0315;
                case 16: goto L_0x0009;
                case 17: goto L_0x0009;
                case 18: goto L_0x0009;
                case 19: goto L_0x0009;
                case 20: goto L_0x00d8;
                case 21: goto L_0x0332;
                case 22: goto L_0x0009;
                case 23: goto L_0x0150;
                default: goto L_0x0009;
            }
        L_0x0009:
            return
        L_0x000a:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Object r2 = r2.A01
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r2 = (com.instagram.creation.fragment.followersshare.FollowersShareFragment) r2
            com.facebook.common.callercontext.CallerContext r0 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A10
            X.8Wq r3 = r2.A0K
            goto L_0x004d
        L_0x0017:
            java.lang.Object r2 = r2.A01
            com.instagram.creation.fragment.EditMediaInfoFragment r2 = (com.instagram.creation.fragment.EditMediaInfoFragment) r2
            r2.A03 = r1
            com.instagram.creation.fragment.EditMediaInfoFragment.A07(r2)
            X.8Wq r0 = r2.A0Q
            if (r0 == 0) goto L_0x0009
            X.1Yl r0 = X.C357108Wn.A00()
            X.8Wp r1 = r0.A01()
            com.instagram.common.session.UserSession r0 = r2.getSession()
            boolean r0 = r1.Esl(r0)
            if (r0 == 0) goto L_0x0009
            X.8Wq r3 = r2.A0Q
            android.text.Editable r0 = r2.A03
            java.lang.String r0 = r0.toString()
            java.util.List r0 = java.util.Collections.singletonList(r0)
            goto L_0x0057
        L_0x0043:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Object r0 = r2.A01
            com.instagram.creation.fragment.ShareLaterFragment r0 = (com.instagram.creation.fragment.ShareLaterFragment) r0
            X.8Wq r3 = r0.A06
        L_0x004d:
            if (r3 == 0) goto L_0x0009
            java.lang.String r0 = r1.toString()
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
        L_0x0057:
            r3.A07(r0)
            return
        L_0x005b:
            r5 = 0
            X.0qQ.A0B(r1, r5)
            java.lang.Object r4 = r2.A01
            X.K66 r4 = (X.K66) r4
            com.instagram.common.session.UserSession r6 = X.JTP.A0S(r4, r5)
            X.0Tu r0 = X.0Tu.A05
            r2 = 36604992651924644(0x820c0c000614a4, double:3.212482977327134E-306)
            int r6 = X.DbS.A04(r0, r6, r2)
            if (r6 <= 0) goto L_0x0009
            java.lang.String r3 = r1.toString()
            if (r3 != 0) goto L_0x00ca
            r0 = 0
        L_0x007b:
            r2 = 1
            java.lang.String r9 = "viewHolder"
            if (r0 != r6) goto L_0x00bf
            char r1 = X.00R.A00(r3)
            r0 = 35
            if (r1 != r0) goto L_0x00b2
            X.LBG r0 = r4.A06
            if (r0 == 0) goto L_0x0198
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r1 = r0.A0A
            int r0 = r3.length()
            int r0 = r0 - r2
            java.lang.CharSequence r0 = r3.subSequence(r5, r0)
        L_0x0097:
            r1.setTextKeepState(r0)
            android.content.Context r3 = r4.requireContext()
            android.content.Context r2 = r4.requireContext()
            r1 = 2131975475(0x7f135d33, float:1.9588043E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            java.lang.String r1 = X.DbW.A0h(r2, r0, r1)
            java.lang.String r0 = "reels_too_many_hashtags_error"
            X.C59689JTv.A03(r3, r1, r0, r5)
        L_0x00b2:
            X.LBG r0 = r4.A06
            if (r0 == 0) goto L_0x0198
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r0 = r0.A0A
            java.lang.String r0 = X.AnonymousClass7TF.A0f(r0)
            r4.A0B = r0
            return
        L_0x00bf:
            if (r0 <= r6) goto L_0x00b2
            X.LBG r0 = r4.A06
            if (r0 == 0) goto L_0x0198
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r1 = r0.A0A
            java.lang.String r0 = r4.A0B
            goto L_0x0097
        L_0x00ca:
            java.util.ArrayList r1 = X.C253063q9.A00(r3)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r1)
            int r0 = r0.size()
            goto L_0x007b
        L_0x00d8:
            java.lang.Object r0 = r2.A01
            X.6iR r0 = (X.C314546iR) r0
            X.6iS r2 = X.C314546iR.A00(r0)
            X.05G r4 = r2.A0D
            java.lang.Object r0 = r4.getValue()
            X.6n9 r0 = (X.C317366n9) r0
            java.lang.CharSequence r0 = r0.A08
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 != 0) goto L_0x0009
            r23 = 0
            if (r30 == 0) goto L_0x014e
            int r13 = r1.length()
        L_0x00f8:
            X.6nl r0 = r2.A07
            com.instagram.common.session.UserSession r5 = r0.A00
            X.0Tu r0 = X.0Tu.A05
            r2 = 36599722727444080(0x820741000c0e70, double:3.209150255865343E-306)
            int r0 = X.DbS.A04(r0, r5, r2)
            boolean r22 = X.C51970G9q.A1W(r13, r0)
            java.lang.Object r9 = r4.getValue()
            X.6n9 r9 = (X.C317366n9) r9
            if (r30 == 0) goto L_0x0119
            java.lang.String r10 = r1.toString()
            if (r10 != 0) goto L_0x011b
        L_0x0119:
            java.lang.String r10 = ""
        L_0x011b:
            if (r22 != 0) goto L_0x0127
            if (r30 == 0) goto L_0x0127
            boolean r0 = X.C51966G9m.A1X(r1)
            if (r0 == 0) goto L_0x0127
            r23 = 1
        L_0x0127:
            r14 = 0
            r5 = 0
            r16 = 536843775(0x1fff95ff, float:1.0824485E-19)
            r6 = r5
            r7 = r5
            r8 = r5
            r11 = r5
            r12 = r5
            r15 = r14
            r17 = r14
            r18 = r14
            r19 = r14
            r20 = r14
            r21 = r14
            r24 = r14
            r25 = r14
            r26 = r14
            r27 = r14
            r28 = r14
            X.6n9 r0 = X.C317366n9.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r4.Epw(r0)
            return
        L_0x014e:
            r13 = 0
            goto L_0x00f8
        L_0x0150:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0009
            java.lang.Object r1 = r2.A01
            X.K4Z r1 = (X.K4Z) r1
            com.instagram.igds.components.form.IgFormField r0 = r1.A01
            java.lang.String r9 = "nameFormField"
            if (r0 == 0) goto L_0x0198
            android.widget.TextView r0 = r0.getBottomSubtitleErrorView()
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0009
            com.instagram.igds.components.form.IgFormField r0 = r1.A01
            if (r0 == 0) goto L_0x0198
            android.widget.TextView r1 = r0.getBottomSubtitleErrorView()
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x017c:
            r4 = 0
            X.0qQ.A0B(r1, r4)
            java.lang.Object r3 = r2.A01
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r3 = (com.instagram.creation.fragment.followersshare.FollowersShareFragment) r3
            X.0eM r2 = r3.A0f
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r2)
            X.82q r6 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A00(r3)
            X.3Q2 r5 = X.LRK.A01(r3)
            X.KNl r0 = r3.A0C
            if (r0 != 0) goto L_0x01a0
            java.lang.String r9 = "dependencyProvider"
        L_0x0198:
            X.0qQ.A0F(r9)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01a0:
            X.LP7 r0 = r0.A08()
            boolean r0 = X.LRu.A02(r7, r6, r5, r0)
            if (r0 == 0) goto L_0x024d
            java.lang.String r5 = r1.toString()
            X.KNl r0 = r3.A0C
            java.lang.String r9 = "dependencyProvider"
            if (r0 == 0) goto L_0x0198
            X.KNr r0 = X.LP2.A00(r0)
            X.KOb r0 = r0.A08
            java.util.List r0 = r0.A04
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x024d
            java.util.regex.Matcher r7 = X.0mp.A09(r5)
            java.util.HashSet r8 = X.AnonymousClass7TE.A1F()
        L_0x01ca:
            boolean r5 = r7.find()
            r0 = 1
            if (r5 == 0) goto L_0x01e3
            java.lang.String r6 = r7.group(r0)
            if (r6 == 0) goto L_0x01ca
            java.lang.String r5 = "@"
            java.lang.String r0 = ""
            java.lang.String r0 = X.00p.A0g(r6, r5, r0, r4)
            r8.add(r0)
            goto L_0x01ca
        L_0x01e3:
            X.KNl r0 = r3.A0C
            if (r0 == 0) goto L_0x0198
            X.KNr r0 = X.LP2.A00(r0)
            X.KOb r0 = r0.A08
            java.util.List r0 = r0.A04
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r7 = r0.iterator()
        L_0x01f7:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0212
            java.lang.Object r6 = r7.next()
            r0 = r6
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r0 = r0.getUsername()
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto L_0x01f7
            r5.add(r6)
            goto L_0x01f7
        L_0x0212:
            int r6 = r5.size()
            X.KNl r0 = r3.A0C
            if (r0 == 0) goto L_0x0198
            X.KNr r0 = X.LP2.A00(r0)
            X.KOb r0 = r0.A08
            java.util.List r0 = r0.A04
            int r0 = r0.size()
            if (r6 == r0) goto L_0x024d
            X.KNl r0 = r3.A0C
            if (r0 == 0) goto L_0x0198
            X.KNr r0 = X.LP2.A00(r0)
            X.KOb r0 = r0.A08
            java.util.List r0 = r0.A04
            r0.clear()
            X.KNl r0 = r3.A0C
            if (r0 == 0) goto L_0x0198
            X.KNr r0 = X.LP2.A00(r0)
            X.KOb r0 = r0.A08
            java.util.List r0 = r0.A04
            r0.addAll(r5)
            X.3Q2 r0 = X.LRK.A00(r3)
            com.instagram.creation.fragment.followersshare.FollowersShareFragment.A0I(r3, r0)
        L_0x024d:
            boolean r0 = X.LTP.A0A(r3)
            if (r0 != 0) goto L_0x02cc
            X.LE1 r5 = r3.A0D
            if (r5 == 0) goto L_0x0260
            java.lang.String r0 = r1.toString()
            X.0qQ.A0B(r0, r4)
            r5.A02 = r0
        L_0x0260:
            X.LFW r0 = r3.shareToBarcelonaViewBinder
            if (r0 == 0) goto L_0x0267
            r0.A00()
        L_0x0267:
            java.lang.String r0 = r1.toString()
            if (r0 != 0) goto L_0x02be
            r8 = 0
        L_0x026e:
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            r5 = r4
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r2)
            X.0Tu r0 = X.0Tu.A05
            r6 = 36323418890579094(0x810bf500002c96, double:3.0344145968456774E-306)
            boolean r2 = X.182.A06(r0, r2, r6)
            r0 = 30
            if (r2 == 0) goto L_0x0285
            r0 = 5
        L_0x0285:
            if (r8 <= r0) goto L_0x0289
            java.lang.Integer r4 = X.AnonymousClass05K.A01
        L_0x0289:
            X.Lh0 r2 = r3.A0G
            if (r2 == 0) goto L_0x0299
            java.lang.String r0 = r1.toString()
            java.util.ArrayList r1 = X.C253063q9.A00(r0)
            X.9iX r0 = r2.A0B
            r0.A01 = r1
        L_0x0299:
            java.lang.Integer r0 = r3.A0L
            if (r0 == r4) goto L_0x0009
            if (r0 == r5) goto L_0x02ad
            X.1xC r2 = X.1xC.A01
            X.Dc2 r1 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A04(r3, r0)
            X.3GR r0 = new X.3GR
            r0.<init>(r1)
            r2.A00(r0)
        L_0x02ad:
            if (r4 == r5) goto L_0x02b8
            X.1xC r1 = X.1xC.A01
            X.Dc2 r0 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A04(r3, r4)
            X.JTQ.A1F(r1, r0)
        L_0x02b8:
            r3.A0L = r4
            com.instagram.creation.fragment.followersshare.FollowersShareFragment.A0H(r3)
            return
        L_0x02be:
            java.util.ArrayList r4 = X.C253063q9.A00(r0)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r4)
            int r8 = r0.size()
            goto L_0x026e
        L_0x02cc:
            X.KNr r0 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A03(r3)
            X.KOP r0 = r0.A0D
            X.JjG r6 = r0.A02
            java.lang.String r5 = r1.toString()
            X.0qQ.A0B(r5, r4)
            X.LE1 r0 = r6.A02
            r0.A02 = r5
            r6.A04()
            goto L_0x0267
        L_0x02e3:
            java.lang.Object r0 = r2.A01
            X.Ll2 r0 = (X.C64963Ll2) r0
            X.C64963Ll2.A01(r0)
            return
        L_0x02eb:
            java.lang.Object r0 = r2.A01
            X.K7u r0 = (X.C61443K7u) r0
            X.C61443K7u.A03(r0)
            return
        L_0x02f3:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Object r2 = r2.A01
            X.0mM r2 = (X.0mM) r2
            java.lang.String r0 = r1.toString()
            r2.A01(r0)
            return
        L_0x0303:
            java.lang.Object r3 = r2.A01
            android.view.View r3 = (android.view.View) r3
            r2 = 1
            if (r30 == 0) goto L_0x0310
            int r0 = r1.length()
            if (r0 != 0) goto L_0x0311
        L_0x0310:
            r2 = 0
        L_0x0311:
            r3.setEnabled(r2)
            return
        L_0x0315:
            java.lang.Object r3 = r2.A01
            com.instagram.igtv.widget.TitleDescriptionEditor r3 = (com.instagram.igtv.widget.TitleDescriptionEditor) r3
            r0 = 0
            com.instagram.igtv.widget.TitleDescriptionEditor.A00(r3, r0)
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r1 = r3.A0J
            int r0 = r3.A02
            r1.setDropDownVerticalOffset(r0)
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r2 = r3.A0J
            int r1 = r3.A01
            int r0 = r3.A00
            int r0 = java.lang.Math.max(r1, r0)
            r2.setDropDownHeight(r0)
            return
        L_0x0332:
            java.lang.Object r0 = r2.A01
            X.Lgj r0 = (X.C64710Lgj) r0
            X.JjF r0 = X.C64710Lgj.A00(r0)
            java.lang.String r2 = X.DbX.A0t(r1)
            X.LEQ r1 = r0.A00
            if (r2 == 0) goto L_0x0349
            int r0 = r2.length()
            if (r0 != 0) goto L_0x0349
            r2 = 0
        L_0x0349:
            X.05G r0 = r1.A09
            r0.Epw(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LWP.afterTextChanged(android.text.Editable):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0306, code lost:
        if (X.AnonymousClass7TE.A1b(r0.A04) == false) goto L_0x0308;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0318, code lost:
        if (X.AnonymousClass7TE.A1b(r0.A03) == false) goto L_0x031a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onTextChanged(java.lang.CharSequence r31, int r32, int r33, int r34) {
        /*
            r30 = this;
            r1 = r30
            int r0 = r1.A00
            r3 = r31
            switch(r0) {
                case 0: goto L_0x0121;
                case 1: goto L_0x014e;
                case 2: goto L_0x0009;
                case 3: goto L_0x000a;
                case 4: goto L_0x006a;
                case 5: goto L_0x0161;
                case 6: goto L_0x0009;
                case 7: goto L_0x0009;
                case 8: goto L_0x0009;
                case 9: goto L_0x0009;
                case 10: goto L_0x0009;
                case 11: goto L_0x0009;
                case 12: goto L_0x00a9;
                case 13: goto L_0x0009;
                case 14: goto L_0x00d2;
                case 15: goto L_0x00cd;
                case 16: goto L_0x0184;
                case 17: goto L_0x01a2;
                case 18: goto L_0x01a2;
                case 19: goto L_0x01a2;
                case 20: goto L_0x0009;
                case 21: goto L_0x0009;
                case 22: goto L_0x01ae;
                case 23: goto L_0x0009;
                case 24: goto L_0x01cb;
                default: goto L_0x0009;
            }
        L_0x0009:
            return
        L_0x000a:
            if (r31 == 0) goto L_0x0009
            java.lang.Object r0 = r1.A01
            X.Ljc r0 = (X.C64876Ljc) r0
            X.JjN r2 = X.C64876Ljc.A00(r0)
            com.instagram.common.ui.base.IgEditText r0 = r0.A05
            android.text.Editable r16 = r0.getText()
            X.0qQ.A07(r16)
            int r6 = r0.getSelectionEnd()
            android.text.SpannableStringBuilder r5 = X.DbS.A0C(r16)
            java.lang.String r1 = X.DbT.A10(r5)
            int r0 = r6 + -1
            java.lang.CharSequence r15 = X.AnonymousClass91M.A05(r0, r1)
            java.lang.String r1 = X.DbT.A10(r5)
            r4 = 0
            int r0 = r1.length()
            int r0 = r0 + -1
            java.lang.String r14 = X.C39805AAc.A01(r1, r0, r4)
            X.05G r7 = r2.A07
            java.lang.Object r0 = r7.getValue()
            X.Jvp r0 = (X.C61051Jvp) r0
            boolean r0 = r0.A09
            r3 = r32
            if (r0 == 0) goto L_0x01e2
            if (r15 != 0) goto L_0x01e2
            boolean r0 = X.C60319JjN.A05(r2)
            if (r0 == 0) goto L_0x01e2
            r0 = 64
            java.lang.String r1 = X.C60319JjN.A00(r5, r0, r3)
            if (r1 == 0) goto L_0x01e2
            java.util.HashMap r0 = r2.A04
            java.lang.Object r0 = r0.get(r1)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            if (r0 == 0) goto L_0x01e2
            X.C60319JjN.A01(r5, r2, r0, r6)
            return
        L_0x006a:
            java.lang.Object r3 = r1.A01
            X.K7u r3 = (X.C61443K7u) r3
            android.widget.EditText r0 = r3.A00
            java.lang.String r2 = "editText"
            if (r0 == 0) goto L_0x0399
            java.lang.String r5 = X.AnonymousClass7TF.A0f(r0)
            int r4 = r5.length()
            r0 = 0
            r1 = 1
            if (r4 <= 0) goto L_0x0009
            char r0 = r5.charAt(r0)
            boolean r0 = java.lang.Character.isWhitespace(r0)
            if (r0 == 0) goto L_0x0009
            android.widget.EditText r3 = r3.A00
            if (r3 == 0) goto L_0x0399
            int r4 = r4 - r1
            r2 = 0
            r1 = 0
        L_0x0091:
            if (r2 > r4) goto L_0x0391
            r0 = r4
            if (r1 != 0) goto L_0x0097
            r0 = r2
        L_0x0097:
            boolean r0 = X.Dbc.A13(r5, r0)
            if (r1 != 0) goto L_0x00a4
            if (r0 != 0) goto L_0x00a1
            r1 = 1
            goto L_0x0091
        L_0x00a1:
            int r2 = r2 + 1
            goto L_0x0091
        L_0x00a4:
            if (r0 == 0) goto L_0x0391
            int r4 = r4 + -1
            goto L_0x0091
        L_0x00a9:
            java.lang.Object r0 = r1.A01
            X.K66 r0 = (X.K66) r0
            X.KNs r0 = X.K66.A06(r0)
            X.KOa r1 = r0.A0I
            java.lang.String r2 = java.lang.String.valueOf(r3)
            r0 = 0
            X.0qQ.A0B(r2, r0)
            X.LRK r0 = r1.A02
            X.KO2 r0 = (X.KO2) r0
            r0.A00 = r2
            X.8Wq r1 = r1.A01
            if (r1 == 0) goto L_0x0009
            java.util.List r0 = X.AnonymousClass7TE.A1I(r2)
            r1.A07(r0)
            return
        L_0x00cd:
            java.lang.Object r2 = r1.A01
            com.instagram.igtv.widget.TitleDescriptionEditor r2 = (com.instagram.igtv.widget.TitleDescriptionEditor) r2
            goto L_0x00ef
        L_0x00d2:
            java.lang.Object r2 = r1.A01
            com.instagram.igtv.widget.TitleDescriptionEditor r2 = (com.instagram.igtv.widget.TitleDescriptionEditor) r2
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x00ef
            int r0 = android.text.TextUtils.getTrimmedLength(r3)
            if (r0 == 0) goto L_0x00ef
            android.view.View r1 = r2.A0C
            r0 = 8
            r1.setVisibility(r0)
            android.view.View r1 = r2.A0B
            r0 = 4
            r1.setVisibility(r0)
        L_0x00ef:
            X.MQi r2 = r2.A0I
            if (r2 == 0) goto L_0x0009
            X.K6u r2 = (X.K6u) r2
            boolean r0 = r2 instanceof X.KTU
            if (r0 == 0) goto L_0x0116
            java.lang.String r0 = r2.A01()
            int r0 = r0.length()
            r1 = 1
            if (r0 <= 0) goto L_0x0114
            boolean r0 = r2.A02()
            if (r0 == 0) goto L_0x0114
        L_0x010a:
            r2.A04 = r1
            android.widget.ImageView r0 = r2.A01
            if (r0 == 0) goto L_0x0009
            X.LJB.A00(r0, r1)
            return
        L_0x0114:
            r1 = 0
            goto L_0x010a
        L_0x0116:
            java.lang.String r0 = r2.A01()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = r0 ^ 1
            goto L_0x010a
        L_0x0121:
            if (r31 == 0) goto L_0x013a
            boolean r0 = X.00l.A0W(r3)
            if (r0 != 0) goto L_0x013a
            java.lang.Object r0 = r1.A01
            X.K61 r0 = (X.K61) r0
            X.K61.A02(r0, r3)
            X.0mM r1 = r0.A0A
            java.lang.String r0 = r3.toString()
            r1.A01(r0)
            return
        L_0x013a:
            java.lang.Object r2 = r1.A01
            X.K61 r2 = (X.K61) r2
            r1 = 0
            X.2dY r0 = X.2dZ.A0t
            X.2dZ r0 = X.DbU.A0L(r2, r0)
            r0.Ets(r1)
            X.0mM r0 = r2.A0A
            r0.A00()
            return
        L_0x014e:
            java.lang.Object r2 = r1.A01
            android.view.View r2 = (android.view.View) r2
            r1 = 0
            if (r31 == 0) goto L_0x015d
            boolean r0 = X.00l.A0W(r3)
            if (r0 != 0) goto L_0x015d
            r1 = 8
        L_0x015d:
            r2.setVisibility(r1)
            return
        L_0x0161:
            r0 = 0
            X.0qQ.A0B(r3, r0)
            java.lang.Object r0 = r1.A01
            X.KFW r0 = (X.KFW) r0
            X.L1f r2 = r0.A01
            int r1 = r3.length()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            X.K8A r1 = r2.A00
            java.lang.String r0 = r0.toString()
            r1.A0F(r0)
            r1.A0E()
            return
        L_0x0184:
            java.lang.Object r0 = r1.A01
            X.K6i r0 = (X.C61411K6i) r0
            X.0eM r0 = r0.A0E
            X.JjW r1 = X.JTT.A0a(r0)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0 = 0
            X.0qQ.A0B(r3, r0)
            com.instagram.mediakit.repository.MediaKitRepository r2 = r1.A07
            X.LFM r1 = r2.A02
            r0 = 0
            r1.A01(r0, r3, r0, r0)
            r0 = 1
            r2.A00 = r0
            return
        L_0x01a2:
            java.lang.Object r1 = r1.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.String r0 = java.lang.String.valueOf(r3)
            r1.invoke(r0)
            return
        L_0x01ae:
            r2 = 0
            X.0qQ.A0B(r3, r2)
            java.lang.Object r0 = r1.A01
            X.K6B r0 = (X.K6B) r0
            X.0eM r0 = r0.A02
            java.lang.Object r0 = r0.getValue()
            X.Jic r0 = (X.C60281Jic) r0
            java.lang.String r1 = r3.toString()
            X.0qQ.A0B(r1, r2)
            X.05G r0 = r0.A0E
            r0.Epw(r1)
            return
        L_0x01cb:
            java.lang.Object r2 = r1.A01
            instagram.features.clips.edit.ClipsEditMetadataController r2 = (instagram.features.clips.edit.ClipsEditMetadataController) r2
            X.8Wq r1 = r2.A0K
            if (r1 == 0) goto L_0x01de
            java.lang.String r0 = instagram.features.clips.edit.ClipsEditMetadataController.A00(r2)
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            r1.A07(r0)
        L_0x01de:
            instagram.features.clips.edit.ClipsEditMetadataController.A0C(r2)
            return
        L_0x01e2:
            java.lang.Object r0 = r7.getValue()
            X.Jvp r0 = (X.C61051Jvp) r0
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x0204
            if (r14 != 0) goto L_0x0204
            r0 = 35
            java.lang.String r1 = X.C60319JjN.A00(r5, r0, r3)
            if (r1 == 0) goto L_0x0204
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0204
            com.instagram.model.hashtag.HashtagImpl r0 = X.C281965Ag.A00(r1)
            r2.A09(r5, r0, r6)
            return
        L_0x0204:
            java.lang.Class<X.Ukf> r0 = X.C15915Ukf.class
            java.lang.Object[] r11 = X.C263324Kh.A06(r5, r0)
            X.Ukf[] r11 = (X.C15915Ukf[]) r11
            int r10 = r11.length
            r9 = 0
            r13 = 0
        L_0x020f:
            if (r9 >= r10) goto L_0x0253
            r12 = r11[r9]
            int r8 = r5.getSpanStart(r12)
            int r3 = r5.getSpanEnd(r12)
            int r0 = r8 + 1
            java.lang.CharSequence r1 = r5.subSequence(r0, r3)
            r0 = 17
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0qQ.A0C(r1, r0)
            android.text.Spanned r1 = (android.text.Spanned) r1
            com.instagram.model.hashtag.Hashtag r0 = r12.A00
            java.lang.String r0 = r0.getName()
            if (r0 == 0) goto L_0x0250
            boolean r0 = X.A1O.A00(r1, r0)
            if (r0 != 0) goto L_0x0250
            r5.removeSpan(r12)
            java.lang.String r0 = r1.toString()
            com.instagram.model.hashtag.HashtagImpl r0 = X.C281965Ag.A00(r0)
            X.Ukf r1 = new X.Ukf
            r1.<init>((com.instagram.model.hashtag.Hashtag) r0, (int) r4)
            r0 = 33
            r5.setSpan(r1, r8, r3, r0)
            r13 = 1
        L_0x0250:
            int r9 = r9 + 1
            goto L_0x020f
        L_0x0253:
            if (r13 != 0) goto L_0x0379
            java.util.LinkedHashSet r8 = X.DbS.A0y()
            java.lang.Class<X.91O> r0 = X.AnonymousClass91O.class
            java.lang.Object[] r10 = X.C263324Kh.A06(r5, r0)
            X.91O[] r10 = (X.AnonymousClass91O[]) r10
            int r9 = r10.length
            r12 = 0
        L_0x0263:
            if (r4 >= r9) goto L_0x029b
            r11 = r10[r4]
            int r0 = r5.getSpanStart(r11)
            int r1 = r5.getSpanEnd(r11)
            int r0 = r0 + 1
            java.lang.CharSequence r3 = r5.subSequence(r0, r1)
            r0 = 17
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0qQ.A0C(r3, r0)
            android.text.Spanned r3 = (android.text.Spanned) r3
            com.instagram.user.model.User r1 = r11.A00
            java.lang.String r0 = r1.getUsername()
            boolean r0 = X.A1O.A00(r3, r0)
            if (r0 != 0) goto L_0x0293
            r5.removeSpan(r11)
            r12 = 1
        L_0x0290:
            int r4 = r4 + 1
            goto L_0x0263
        L_0x0293:
            java.lang.String r0 = r1.getId()
            r8.add(r0)
            goto L_0x0290
        L_0x029b:
            if (r12 != 0) goto L_0x0365
            r3 = 1
            if (r15 == 0) goto L_0x0355
            boolean r0 = X.C60319JjN.A05(r2)
            if (r0 == 0) goto L_0x0355
            r26 = 1
            X.L9b r4 = r2.A02
            X.0eM r0 = r4.A05
            java.lang.Object r1 = r0.getValue()
            X.7fy r1 = (X.C337257fy) r1
            java.lang.String r0 = r15.toString()
        L_0x02b6:
            r1.EhX(r0)
            X.0eM r0 = r4.A02
            java.lang.Object r1 = r0.getValue()
            X.Ts1 r1 = (X.C14221Ts1) r1
            if (r14 == 0) goto L_0x0350
            java.lang.String r0 = r14.toString()
            r1.A06(r0)
        L_0x02ca:
            int r1 = r16.length()
            r0 = 240(0xf0, float:3.36E-43)
            r25 = 0
            if (r1 <= r0) goto L_0x02e1
            r25 = 1
            boolean r0 = r2.A00
            if (r0 != 0) goto L_0x02e1
            X.KKm r0 = X.C61747KKm.A00
            X.C60319JjN.A02(r0, r2)
            r2.A00 = r3
        L_0x02e1:
            java.lang.Object r6 = r7.getValue()
            r0 = r6
            X.Jvp r0 = (X.C61051Jvp) r0
            int r2 = r16.length()
            r1 = 235(0xeb, float:3.3E-43)
            if (r2 < r1) goto L_0x034b
            r24 = 1
            int r2 = r16.length()
            java.lang.String r1 = " / 240"
            java.lang.String r5 = X.002.A03(r2, r1)
        L_0x02fc:
            if (r26 == 0) goto L_0x0308
            java.util.List r1 = r0.A04
            boolean r1 = X.AnonymousClass7TE.A1b(r1)
            r27 = 1
            if (r1 != 0) goto L_0x030a
        L_0x0308:
            r27 = 0
        L_0x030a:
            r28 = 0
            if (r14 == 0) goto L_0x031a
            r28 = 1
            java.util.List r1 = r0.A03
            boolean r1 = X.AnonymousClass7TE.A1b(r1)
            r29 = 1
            if (r1 != 0) goto L_0x031c
        L_0x031a:
            r29 = 0
        L_0x031c:
            boolean r9 = r0.A0A
            boolean r4 = r0.A0B
            int r3 = r0.A00
            java.util.List r2 = r0.A04
            java.util.List r1 = r0.A03
            java.util.Set r0 = r0.A05
            r8 = 3
            X.AnonymousClass7TF.A1G(r5, r8, r2)
            r8 = 12
            X.C51969G9p.A1O(r1, r8, r0)
            X.Jvp r15 = new X.Jvp
            r17 = r5
            r18 = r2
            r19 = r1
            r20 = r0
            r21 = r3
            r22 = r9
            r23 = r4
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            boolean r0 = r7.AIY(r6, r15)
            if (r0 == 0) goto L_0x02e1
            return
        L_0x034b:
            r24 = 0
            java.lang.String r5 = ""
            goto L_0x02fc
        L_0x0350:
            r1.A02()
            goto L_0x02ca
        L_0x0355:
            r26 = 0
            X.L9b r4 = r2.A02
            X.0eM r0 = r4.A05
            java.lang.Object r1 = r0.getValue()
            X.7fy r1 = (X.C337257fy) r1
            java.lang.String r0 = ""
            goto L_0x02b6
        L_0x0365:
            java.lang.Object r4 = r7.getValue()
            r3 = r4
            X.Jvp r3 = (X.C61051Jvp) r3
            r1 = 0
            r0 = 8191(0x1fff, float:1.1478E-41)
            X.Jvp r0 = X.C61051Jvp.A01(r1, r3, (java.util.List) null, (java.util.List) null, r8, 0, r0, false, false, false, false)
            boolean r0 = r7.AIY(r4, r0)
            if (r0 == 0) goto L_0x0365
        L_0x0379:
            X.C18190Vn4.A01(r5)
        L_0x037c:
            java.lang.Object r1 = r7.getValue()
            r0 = r1
            X.Jvp r0 = (X.C61051Jvp) r0
            X.Jvp r0 = X.C61051Jvp.A01(r5, r0, (java.util.List) null, (java.util.List) null, (java.util.Set) null, 0, 16319, false, false, false, false)
            boolean r0 = r7.AIY(r1, r0)
            if (r0 == 0) goto L_0x037c
            X.C60319JjN.A03(r2, r6)
            return
        L_0x0391:
            java.lang.String r0 = X.Dba.A0c(r5, r4, r2)
            r3.setText(r0)
            return
        L_0x0399:
            X.0qQ.A0F(r2)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LWP.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public LWP(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
