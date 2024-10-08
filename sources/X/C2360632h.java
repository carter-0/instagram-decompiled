package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.32h  reason: invalid class name and case insensitive filesystem */
public final class C2360632h implements C2360732i {
    public final Fragment A00;
    public final 1Ng A01;
    public final UserSession A02;
    public final AnonymousClass311 A03;
    public final AnonymousClass4DU A04;
    public final C231332rR A05;
    public final AnonymousClass2xS A06;
    public final AnonymousClass4DV A07;

    public C2360632h(Fragment fragment, 1Ng r3, UserSession userSession, AnonymousClass311 r5, AnonymousClass4DU r6, C231332rR r7, AnonymousClass2xS r8, AnonymousClass4DV r9) {
        0qQ.A0B(r3, 4);
        0qQ.A0B(r9, 7);
        this.A02 = userSession;
        this.A06 = r8;
        this.A00 = fragment;
        this.A01 = r3;
        this.A05 = r7;
        this.A04 = r6;
        this.A07 = r9;
        this.A03 = r5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DJB(com.instagram.api.schemas.MediaControlEventSourceEnum r25, X.1Xj r26, X.AnonymousClass3WA r27, X.AnonymousClass3W1 r28) {
        /*
            r24 = this;
            r10 = 0
            r0 = r26
            X.0qQ.A0B(r0, r10)
            r7 = 1
            r2 = r28
            X.0qQ.A0B(r2, r7)
            boolean r3 = r0.CeS()
            r1 = r24
            if (r3 != 0) goto L_0x0028
            int r3 = r2.A03
            X.1Xj r4 = r0.A1c(r3)
            if (r4 == 0) goto L_0x002f
            boolean r3 = r0.A5D()
            if (r3 == 0) goto L_0x002f
            boolean r3 = r4.CeS()
            if (r3 == 0) goto L_0x002f
        L_0x0028:
            X.2xS r4 = r1.A06
            java.lang.String r3 = "hide"
            r4.A0C(r3)
        L_0x002f:
            X.3WA r3 = X.AnonymousClass3WA.MAIN_FEED_UNFOLLOW_USER
            java.lang.String r6 = "Required value was null."
            r8 = r27
            if (r8 != r3) goto L_0x009d
            com.instagram.common.session.UserSession r2 = r1.A02
            com.instagram.user.model.User r5 = r0.A2A(r2)
            if (r5 == 0) goto L_0x02fc
            androidx.fragment.app.Fragment r2 = r1.A00
            androidx.fragment.app.FragmentActivity r4 = r2.getActivity()
            if (r4 == 0) goto L_0x0063
            r3 = 2131965811(0x7f133773, float:1.9568442E38)
            java.lang.String r2 = r5.getUsername()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r2 = r4.getString(r3, r2)
            X.C59689JTv.A09(r4, r2)
            X.1Ng r3 = r1.A01
            X.36g r2 = new X.36g
            r2.<init>(r5)
        L_0x0060:
            r3.A00(r2)
        L_0x0063:
            X.1Ng r3 = r1.A01
            X.INg r2 = new X.INg
            r2.<init>(r0)
            r3.A00(r2)
            int r2 = r8.ordinal()
            switch(r2) {
                case 1: goto L_0x0078;
                case 2: goto L_0x0078;
                case 3: goto L_0x0075;
                case 4: goto L_0x0074;
                case 5: goto L_0x0075;
                case 6: goto L_0x0074;
                case 7: goto L_0x0078;
                case 8: goto L_0x0074;
                case 9: goto L_0x0074;
                case 10: goto L_0x0074;
                case 11: goto L_0x0078;
                case 12: goto L_0x0074;
                case 13: goto L_0x0074;
                case 14: goto L_0x0074;
                case 15: goto L_0x007b;
                default: goto L_0x0074;
            }
        L_0x0074:
            return
        L_0x0075:
            java.lang.String r4 = "589217466592101"
            goto L_0x007d
        L_0x0078:
            java.lang.String r4 = "535996195372324"
            goto L_0x007d
        L_0x007b:
            java.lang.String r4 = "1585384365321505"
        L_0x007d:
            androidx.fragment.app.Fragment r2 = r1.A00
            androidx.fragment.app.FragmentActivity r3 = r2.getActivity()
            if (r3 == 0) goto L_0x0074
            X.1Wj r2 = X.1Wj.A00
            if (r2 == 0) goto L_0x0074
            X.1Wj r2 = X.DcL.A00()
            com.instagram.common.session.UserSession r1 = r1.A02
            java.lang.String r0 = r0.A30()
            if (r0 == 0) goto L_0x02f6
            java.util.HashMap r0 = X.C70342O2u.A00(r0)
            r2.A00(r3, r1, r4, r0)
            return
        L_0x009d:
            X.3WA r3 = X.AnonymousClass3WA.MAIN_FEED_UNFOLLOW_HASHTAG
            if (r8 != r3) goto L_0x00cb
            X.1Xy r2 = r0.A0C
            com.instagram.model.hashtag.Hashtag r5 = r2.B6n()
            if (r5 == 0) goto L_0x0302
            androidx.fragment.app.Fragment r2 = r1.A00
            androidx.fragment.app.FragmentActivity r4 = r2.getActivity()
            if (r4 == 0) goto L_0x0063
            r3 = 2131975872(0x7f135ec0, float:1.9588849E38)
            java.lang.String r2 = r5.getName()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r2 = r4.getString(r3, r2)
            X.C59689JTv.A09(r4, r2)
            X.1Ng r3 = r1.A01
            X.36c r2 = new X.36c
            r2.<init>(r5, r7)
            goto L_0x0060
        L_0x00cb:
            com.instagram.common.session.UserSession r5 = r1.A02
            X.1se r4 = X.1sd.A00(r5)
            int r3 = r8.A00
            r4.A01(r0, r3)
            r2.A0m = r8
            boolean r3 = X.I71.A05(r0, r8, r2)
            if (r3 == 0) goto L_0x02d7
            androidx.fragment.app.Fragment r3 = r1.A00
            androidx.fragment.app.FragmentActivity r15 = r3.getActivity()
            if (r15 == 0) goto L_0x0074
            X.311 r3 = r1.A03
            X.30y r3 = (X.C2357230y) r3
            X.0eM r3 = r3.A1V
            java.lang.Object r9 = r3.getValue()
            X.IUa r9 = (X.C57239IUa) r9
            X.4DU r11 = r1.A04
            com.instagram.api.schemas.MediaControlEventSourceEnum r17 = com.instagram.api.schemas.MediaControlEventSourceEnum.ON_IMPRESSION
            r13 = 15
            r12 = 3
            r4 = 16
            r3 = 5
            X.0qQ.A0B(r9, r3)
            int r3 = r8.ordinal()
            if (r3 == r13) goto L_0x021d
            if (r3 == r12) goto L_0x01b3
            if (r3 != r4) goto L_0x01a9
            X.1eD r7 = X.I71.A00(r0, r2)
            if (r7 == 0) goto L_0x01a9
            X.CwZ r10 = r7.AKC()
            java.util.List r3 = r7.B73()
            if (r3 != 0) goto L_0x0191
            r3 = 2131968510(0x7f1341fe, float:1.9573917E38)
            java.lang.String r4 = r15.getString(r3)
            X.0qQ.A07(r4)
            X.HMy r3 = X.C54667HMy.A0C
            X.3eA r18 = X.I71.A01(r3, r4)
            r3 = 2131968506(0x7f1341fa, float:1.9573909E38)
            java.lang.String r4 = r15.getString(r3)
            X.0qQ.A07(r4)
            X.HMy r3 = X.C54667HMy.A0A
            X.3eA r19 = X.I71.A01(r3, r4)
            r4 = 2131968507(0x7f1341fb, float:1.957391E38)
            X.1Xy r3 = r0.A0C
            com.instagram.user.model.User r3 = r3.CCd()
            if (r3 == 0) goto L_0x01b0
            java.lang.String r3 = r3.getUsername()
        L_0x0148:
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = r15.getString(r4, r3)
            X.0qQ.A07(r4)
            X.HMy r3 = X.C54667HMy.A0B
            X.3eA r20 = X.I71.A01(r3, r4)
            r3 = 2131968511(0x7f1341ff, float:1.9573919E38)
            java.lang.String r4 = r15.getString(r3)
            X.0qQ.A07(r4)
            X.HMy r3 = X.C54667HMy.A0D
            X.3eA r21 = X.I71.A01(r3, r4)
            r3 = 2131968509(0x7f1341fd, float:1.9573915E38)
            java.lang.String r4 = r15.getString(r3)
            X.0qQ.A07(r4)
            X.HMy r3 = X.C54667HMy.A0E
            X.3eA r22 = X.I71.A01(r3, r4)
            r3 = 2131968508(0x7f1341fc, float:1.9573913E38)
            java.lang.String r4 = r15.getString(r3)
            X.0qQ.A07(r4)
            X.HMy r3 = X.C54667HMy.A0H
            X.3eA r23 = X.I71.A01(r3, r4)
            X.3eA[] r3 = new X.C246183eA[]{r18, r19, r20, r21, r22, r23}
            java.util.List r3 = X.0sr.A1P(r3)
        L_0x0191:
            r10.A04 = r3
            X.1eB r3 = r10.A00()
            X.I71.A03(r3, r0, r2)
        L_0x019a:
            r21 = r9
            r22 = r2
            r19 = r5
            r20 = r0
            r18 = r11
            r16 = r7
        L_0x01a6:
            X.I71.A02(r15, r16, r17, r18, r19, r20, r21, r22)
        L_0x01a9:
            X.2rR r2 = r1.A05
            r2.AV9()
            goto L_0x0063
        L_0x01b0:
            java.lang.String r3 = ""
            goto L_0x0148
        L_0x01b3:
            X.1eD r7 = X.I71.A00(r0, r2)
            if (r7 == 0) goto L_0x01a9
            X.0Tu r12 = X.0Tu.A05
            r3 = 36317100993680154(0x8106360000131a, double:3.030419133406659E-306)
            X.182.A06(r12, r5, r3)
            X.3eD r3 = r7.B74()
            if (r3 == 0) goto L_0x019a
            X.1Xy r3 = r0.A0C
            java.util.List r3 = r3.C8a()
            r12 = 0
            if (r3 == 0) goto L_0x021b
            java.lang.Object r3 = X.00k.A0O(r3, r10)
            com.instagram.api.schemas.TopicIntf r3 = (com.instagram.api.schemas.TopicIntf) r3
            if (r3 == 0) goto L_0x021b
            java.lang.String r4 = r3.getStatus()
        L_0x01de:
            X.HMe r3 = X.C54647HMe.A05
            java.lang.String r3 = r3.A00
            boolean r3 = X.0qQ.A0K(r4, r3)
            if (r3 == 0) goto L_0x020c
            X.3eD r3 = r7.B74()
            if (r3 == 0) goto L_0x020c
            java.util.List r3 = r3.BIO()
            if (r3 == 0) goto L_0x020c
            X.CwZ r4 = r7.AKC()
            X.3eD r3 = r7.B74()
            if (r3 == 0) goto L_0x0202
            java.util.List r12 = r3.BIO()
        L_0x0202:
            r4.A04 = r12
            X.1eB r7 = r4.A00()
            X.I71.A03(r7, r0, r2)
            goto L_0x019a
        L_0x020c:
            X.CwZ r4 = r7.AKC()
            X.3eD r3 = r7.B74()
            if (r3 == 0) goto L_0x0202
            java.util.List r12 = r3.BWW()
            goto L_0x0202
        L_0x021b:
            r4 = r12
            goto L_0x01de
        L_0x021d:
            X.1Xy r3 = r0.A0C
            X.1eD r4 = r3.B5C()
            if (r4 == 0) goto L_0x01a9
            java.util.List r3 = r4.B73()
            if (r3 != 0) goto L_0x02c7
            X.CwZ r10 = r4.AKC()
            X.0Tu r12 = X.0Tu.A05
            r3 = 36311951328609098(0x810187000b034a, double:3.027162464479686E-306)
            boolean r14 = X.182.A06(r12, r5, r3)
            r3 = 36311951328674635(0x810187000c034b, double:3.027162464521132E-306)
            boolean r13 = X.182.A06(r12, r5, r3)
            com.google.common.collect.ImmutableList$Builder r3 = com.google.common.collect.ImmutableList.builder()
            java.lang.String r19 = "report"
            r4 = 2131972205(0x7f13506d, float:1.958141E38)
            java.lang.String r21 = r15.getString(r4)
            X.0qQ.A07(r21)
            r17 = 0
            X.3eA r4 = new X.3eA
            r18 = r17
            r20 = r17
            r22 = r7
            r16 = r4
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r3.add(r4)
            if (r14 == 0) goto L_0x028b
            java.lang.String r19 = "mute"
            r12 = 2131967927(0x7f133fb7, float:1.9572734E38)
            com.instagram.user.model.User r4 = r0.A2A(r5)
            if (r4 == 0) goto L_0x030e
            java.lang.String r4 = r4.getUsername()
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r21 = r15.getString(r12, r4)
            X.0qQ.A07(r21)
            X.3eA r4 = new X.3eA
            r16 = r4
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r3.add(r4)
        L_0x028b:
            if (r13 == 0) goto L_0x02b5
            r4 = 1004(0x3ec, float:1.407E-42)
            java.lang.String r19 = X.C273654mx.A00(r4)
            r12 = 2131975869(0x7f135ebd, float:1.9588842E38)
            com.instagram.user.model.User r4 = r0.A2A(r5)
            if (r4 == 0) goto L_0x0308
            java.lang.String r4 = r4.getUsername()
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r21 = r15.getString(r12, r4)
            X.0qQ.A07(r21)
            X.3eA r4 = new X.3eA
            r16 = r4
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r3.add(r4)
        L_0x02b5:
            com.google.common.collect.ImmutableList r3 = r3.build()
            X.0qQ.A07(r3)
            r10.A04 = r3
            X.1eB r4 = r10.A00()
            X.1Xy r3 = r0.A0C
            r3.EWY(r4)
        L_0x02c7:
            com.instagram.api.schemas.MediaControlEventSourceEnum r17 = com.instagram.api.schemas.MediaControlEventSourceEnum.THREE_DOT_MENU
            r21 = r9
            r22 = r2
            r19 = r5
            r20 = r0
            r18 = r11
            r16 = r4
            goto L_0x01a6
        L_0x02d7:
            X.ITb r4 = new X.ITb     // Catch:{ IllegalStateException -> 0x02ed }
            r4.<init>(r0, r2)     // Catch:{ IllegalStateException -> 0x02ed }
            X.4DV r2 = r1.A07     // Catch:{ IllegalStateException -> 0x02ed }
            X.3Ar r3 = r2.getScrollingViewProxy()     // Catch:{ IllegalStateException -> 0x02ed }
            X.311 r2 = r1.A03     // Catch:{ IllegalStateException -> 0x02ed }
            X.32m r2 = r2.C86()     // Catch:{ IllegalStateException -> 0x02ed }
            r4.A00(r2, r3)     // Catch:{ IllegalStateException -> 0x02ed }
            goto L_0x0063
        L_0x02ed:
            java.lang.String r3 = "DefaultFeedListAdapterDelegate"
            java.lang.String r2 = "onHideMedia called after fragment is destroyed"
            X.0wb.A03(r3, r2)
            goto L_0x0063
        L_0x02f6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        L_0x02fc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        L_0x0302:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        L_0x0308:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        L_0x030e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2360632h.DJB(com.instagram.api.schemas.MediaControlEventSourceEnum, X.1Xj, X.3WA, X.3W1):void");
    }
}
