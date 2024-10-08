package X;

import android.widget.AdapterView;

public final class LZH implements AdapterView.OnItemClickListener {
    public final int A00;
    public final Object A01;

    public LZH(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bf A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0214  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onItemClick(android.widget.AdapterView r20, android.view.View r21, int r22, long r23) {
        /*
            r19 = this;
            r1 = r19
            int r0 = r1.A00
            r12 = r22
            switch(r0) {
                case 0: goto L_0x01cd;
                case 1: goto L_0x000a;
                case 2: goto L_0x01c4;
                default: goto L_0x0009;
            }
        L_0x0009:
            return
        L_0x000a:
            java.lang.Object r2 = r1.A01
            X.Lh0 r2 = (X.C64723Lh0) r2
            X.9iX r0 = r2.A0B
            java.lang.Object r1 = r0.getItem(r12)
            X.0qQ.A07(r1)
            boolean r5 = r1 instanceof com.instagram.model.hashtag.Hashtag
            if (r5 == 0) goto L_0x01aa
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            r0 = 35
            r3.append(r0)
            r0 = r1
            com.instagram.model.hashtag.Hashtag r0 = (com.instagram.model.hashtag.Hashtag) r0
            java.lang.String r0 = r0.getName()
        L_0x002b:
            java.lang.String r6 = X.AnonymousClass7TF.A0l(r0, r3)
        L_0x002f:
            int r3 = r6.length()
            r0 = 0
            if (r3 <= 0) goto L_0x0044
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r4 = r2.A07
            if (r4 != 0) goto L_0x0046
            java.lang.String r11 = "editText"
        L_0x003c:
            X.0qQ.A0F(r11)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0044:
            r10 = 0
            goto L_0x004c
        L_0x0046:
            X.5mQ r3 = X.C64723Lh0.A0C
            java.lang.CharSequence r10 = X.C294435mR.A00(r4, r3, r6, r0)
        L_0x004c:
            X.L0i r4 = r2.A05
            if (r4 == 0) goto L_0x00bb
            boolean r3 = r1 instanceof com.instagram.user.model.User
            if (r3 == 0) goto L_0x00bb
            r7 = r1
            com.instagram.user.model.User r7 = (com.instagram.user.model.User) r7
            boolean r3 = r7.A1V()
            if (r3 == 0) goto L_0x00bb
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r6 = r4.A00
            X.0eM r3 = r6.A0f
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r3)
            X.82q r8 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A00(r6)
            X.3Q2 r4 = X.LRK.A01(r6)
            X.KNl r3 = r6.A0C
            java.lang.String r11 = "dependencyProvider"
            if (r3 == 0) goto L_0x003c
            X.LP7 r3 = r3.A08()
            boolean r3 = X.LRu.A02(r9, r8, r4, r3)
            if (r3 == 0) goto L_0x00bb
            X.KNl r3 = r6.A0C
            if (r3 == 0) goto L_0x003c
            X.KNr r3 = X.LP2.A00(r3)
            X.KOb r3 = r3.A08
            java.util.List r3 = r3.A04
            boolean r3 = r3.contains(r7)
            if (r3 != 0) goto L_0x00bb
            X.KNl r3 = r6.A0C
            if (r3 == 0) goto L_0x003c
            X.KNr r3 = X.LP2.A00(r3)
            X.KOb r3 = r3.A08
            java.util.List r3 = r3.A04
            r3.add(r7)
            X.KNl r3 = r6.A0C
            if (r3 == 0) goto L_0x003c
            X.KNr r3 = X.LP2.A00(r3)
            X.KOb r3 = r3.A08
            java.util.ArrayList r4 = r3.A00
            java.lang.String r3 = r7.getId()
            boolean r3 = r4.contains(r3)
            if (r3 != 0) goto L_0x00bb
            X.3Q2 r3 = X.LRK.A00(r6)
            com.instagram.creation.fragment.followersshare.FollowersShareFragment.A0I(r6, r3)
        L_0x00bb:
            X.8av r6 = r2.A06
            if (r6 == 0) goto L_0x0214
            if (r10 == 0) goto L_0x00c7
            java.lang.String r10 = r10.toString()
            if (r10 != 0) goto L_0x00c9
        L_0x00c7:
            java.lang.String r10 = ""
        L_0x00c9:
            boolean r3 = r1 instanceof com.instagram.user.model.User
            if (r3 == 0) goto L_0x0193
            java.lang.Integer r8 = X.AnonymousClass05K.A0N
            java.lang.String r15 = X.DbS.A0q(r1)
        L_0x00d3:
            r13 = 0
            if (r15 != 0) goto L_0x00d8
            java.lang.String r15 = ""
        L_0x00d8:
            java.lang.String r18 = "server"
            java.lang.String r16 = X.C67419Mna.A00(r8)
            r4 = 165(0xa5, float:2.31E-43)
            java.lang.String r14 = X.C66579MXk.A00(r4)
            r17 = r13
            X.Tx8 r7 = X.OVV.A00(r13, r14, r15, r16, r17, r18)
            java.lang.Integer r9 = X.AnonymousClass05K.A0C
            java.lang.String r11 = ""
            r6.CkL(r7, r8, r9, r10, r11, r12)
            if (r3 == 0) goto L_0x0009
            X.L46 r3 = r2.A04
            if (r3 == 0) goto L_0x0009
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            X.0qQ.A0B(r1, r0)
            X.3Q2 r2 = r3.A01
            if (r2 == 0) goto L_0x0009
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r4 = r3.A00
            X.KNr r2 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A03(r4)
            boolean r2 = r2.A0G()
            if (r2 != 0) goto L_0x0009
            X.KNr r2 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A03(r4)
            X.KOe r2 = r2.A07
            X.0Ud r2 = r2.A04
            java.lang.Object r2 = r2.getValue()
            X.JvS r2 = (X.C61028JvS) r2
            boolean r2 = r2.A04
            if (r2 != 0) goto L_0x0009
            X.KNr r2 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A03(r4)
            X.KO8 r2 = r2.A09
            X.JwD r2 = r2.A06()
            boolean r2 = r2.A0j
            if (r2 != 0) goto L_0x0009
            X.KNr r2 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A03(r4)
            X.KOX r2 = r2.A05
            X.0Ud r2 = r2.A02
            java.lang.Object r2 = r2.getValue()
            X.JwK r2 = (X.C61082JwK) r2
            java.lang.Object r3 = r2.A00
            X.3QO r2 = X.AnonymousClass3QO.FAN_CLUB
            if (r3 == r2) goto L_0x0009
            boolean r2 = X.JTP.A1Z(r4)
            if (r2 == 0) goto L_0x015b
            X.0eM r2 = r4.A0f
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r2)
            X.0Tu r0 = X.DbS.A0J(r5, r0)
            r2 = 36323401711103114(0x810bf100062c8a, double:3.0344037324758914E-306)
            boolean r0 = X.182.A06(r0, r5, r2)
            if (r0 == 0) goto L_0x0009
        L_0x015b:
            X.Lgz r6 = r4.A0E
            if (r6 == 0) goto L_0x0009
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            boolean r0 = X.JTP.A1Z(r4)
            if (r0 == 0) goto L_0x01f6
            X.82q r0 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A00(r4)
            java.util.Iterator r5 = X.JTP.A0w(r0)
        L_0x0171:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x01ff
            com.instagram.creation.base.MediaSession r0 = X.JTO.A0Z(r5)
            java.lang.String r2 = r0.BbR()
            if (r2 == 0) goto L_0x0171
            X.KO3 r0 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A02(r4)
            X.4cI r0 = r0.A03
            X.3Q2 r0 = r0.BbQ(r2)
            if (r0 == 0) goto L_0x0171
            java.util.ArrayList r0 = r0.A40
            r3.addAll(r0)
            goto L_0x0171
        L_0x0193:
            if (r5 == 0) goto L_0x0009
            java.lang.Integer r8 = X.AnonymousClass05K.A0C
            r5 = r1
            com.instagram.model.hashtag.Hashtag r5 = (com.instagram.model.hashtag.Hashtag) r5
            java.lang.String r4 = r5.getId()
            if (r4 == 0) goto L_0x01a6
            java.lang.String r15 = r5.getId()
            goto L_0x00d3
        L_0x01a6:
            java.lang.String r15 = ""
            goto L_0x00d3
        L_0x01aa:
            boolean r0 = r1 instanceof com.instagram.user.model.User
            if (r0 == 0) goto L_0x01c0
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            r0 = 64
            r3.append(r0)
            r0 = r1
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r0 = r0.getUsername()
            goto L_0x002b
        L_0x01c0:
            java.lang.String r6 = ""
            goto L_0x002f
        L_0x01c4:
            java.lang.Object r1 = r1.A01
            com.instagram.igtv.widget.TitleDescriptionEditor r1 = (com.instagram.igtv.widget.TitleDescriptionEditor) r1
            r0 = 0
            com.instagram.igtv.widget.TitleDescriptionEditor.A00(r1, r0)
            return
        L_0x01cd:
            java.lang.Object r3 = r1.A01
            X.LON r3 = (X.LON) r3
            X.K97 r0 = r3.A03
            java.lang.Object r2 = r0.getItem(r12)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.creation.mentionconversion.MentionConversionPopUpAdapter.Model"
            X.0qQ.A0C(r2, r0)
            X.L95 r2 = (X.L95) r2
            int r0 = r2.A01
            if (r0 == 0) goto L_0x01ef
            r1 = 1
            com.instagram.user.model.User r0 = r2.A02
            X.LON.A00(r3, r0, r1)
        L_0x01e8:
            r0 = 0
            r3.A05 = r0
            r3.A01()
            return
        L_0x01ef:
            com.instagram.user.model.User r1 = r2.A02
            r0 = 0
            X.LON.A00(r3, r1, r0)
            goto L_0x01e8
        L_0x01f6:
            X.3Q2 r0 = X.LRK.A00(r4)
            java.util.ArrayList r0 = r0.A40
            r3.addAll(r0)
        L_0x01ff:
            X.3Q2 r0 = X.LRK.A00(r4)
            java.util.List r2 = r0.A4L
            X.3Q2 r0 = X.LRK.A00(r4)
            java.lang.String r0 = r0.A2d
            r7 = r1
            r8 = r0
            r9 = r13
            r10 = r3
            r11 = r2
            r6.A01(r7, r8, r9, r10, r11)
            return
        L_0x0214:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LZH.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
    }
}
