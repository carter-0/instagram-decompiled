package X;

import android.view.View;

/* renamed from: X.Ojx  reason: case insensitive filesystem */
public final class C71398Ojx implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;

    public C71398Ojx(int i, Object obj, Object obj2, boolean z) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
        this.A03 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x015c, code lost:
        if (X.182.A05(r10, r4) == false) goto L_0x015e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01d9, code lost:
        r0 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0335  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0451  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x04a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r48) {
        /*
            r47 = this;
            r7 = r47
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x02ea;
                case 1: goto L_0x02b4;
                case 2: goto L_0x027e;
                case 3: goto L_0x023a;
                case 4: goto L_0x00b1;
                case 5: goto L_0x007e;
                case 6: goto L_0x004b;
                default: goto L_0x0007;
            }
        L_0x0007:
            r0 = 66247737(0x3f2dc39, float:1.4274042E-36)
            int r1 = X.AnonymousClass0fD.A05(r0)
            X.37E r3 = X.AnonymousClass37D.A00
            java.lang.Object r2 = r7.A02
            X.OKp r2 = (X.C70769OKp) r2
            android.app.Activity r0 = r2.A00
            X.DbX.A10(r0, r3)
            boolean r0 = r7.A03
            if (r0 == 0) goto L_0x0044
            com.instagram.common.session.UserSession r4 = r2.A01
            java.lang.Object r3 = r7.A01
            com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams r3 = (com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams) r3
            X.0Aj r2 = X.C66584MXp.A0C(r4)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0044
            X.C71137Odf.A01(r2, r4)
            java.lang.String r0 = "fwd_dont_share_click"
            X.C66584MXp.A0v(r2, r0)
            java.lang.Long r0 = X.C66583MXo.A0f(r3)
            X.76k r0 = X.C66583MXo.A0I(r2, r3, r0)
            java.lang.Long r0 = X.C66584MXp.A0R(r0, r2, r3)
            X.C66583MXo.A17(r2, r0)
        L_0x0044:
            r0 = -1658912007(0xffffffff9d1f02f9, float:-2.1045012E-21)
        L_0x0047:
            X.AnonymousClass0fD.A0C(r0, r1)
            return
        L_0x004b:
            r0 = -985869311(0xffffffffc53cd401, float:-3021.2502)
            int r1 = X.AnonymousClass0fD.A05(r0)
            boolean r0 = r7.A03
            if (r0 == 0) goto L_0x0073
            java.lang.Object r0 = r7.A02
            X.PA4 r0 = (X.PA4) r0
            com.instagram.common.session.UserSession r0 = r0.A02
            X.6gx r4 = X.C313746gw.A00(r0)
            java.lang.Object r0 = r7.A01
            X.7S7 r0 = (X.AnonymousClass7S7) r0
            int r3 = r0.AdN()
            java.lang.String r2 = r0.C6C()
            java.lang.String r0 = r0.C6k()
            r4.A09(r3, r2, r0)
        L_0x0073:
            java.lang.Object r0 = r7.A02
            X.PA4 r0 = (X.PA4) r0
            X.PA4.A00(r0)
            r0 = 9205246(0x8c75fe, float:1.2899297E-38)
            goto L_0x0047
        L_0x007e:
            r0 = -1107772191(0xffffffffbdf8bce1, float:-0.12145401)
            int r1 = X.AnonymousClass0fD.A05(r0)
            boolean r0 = r7.A03
            if (r0 == 0) goto L_0x00a6
            java.lang.Object r0 = r7.A02
            X.PA4 r0 = (X.PA4) r0
            com.instagram.common.session.UserSession r0 = r0.A02
            X.6gx r4 = X.C313746gw.A00(r0)
            java.lang.Object r0 = r7.A01
            X.7S7 r0 = (X.AnonymousClass7S7) r0
            int r3 = r0.AdN()
            java.lang.String r2 = r0.C6C()
            java.lang.String r0 = r0.C6k()
            r4.A08(r3, r2, r0)
        L_0x00a6:
            java.lang.Object r0 = r7.A02
            X.PA4 r0 = (X.PA4) r0
            X.PA4.A01(r0)
            r0 = -2117538043(0xffffffff81c8ef05, float:-7.3811373E-38)
            goto L_0x0047
        L_0x00b1:
            r0 = 1922923109(0x729d7a65, float:6.2383504E30)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r7.A01
            X.7S7 r6 = (X.AnonymousClass7S7) r6
            int r2 = X.C66580MXl.A05(r6)
            r0 = 29
            r5 = 0
            if (r2 != r0) goto L_0x00fc
            r5 = 1
            java.lang.Object r0 = r7.A02
            X.PA4 r0 = (X.PA4) r0
            com.instagram.common.session.UserSession r0 = r0.A02
            X.6gx r9 = X.C313746gw.A00(r0)
            int r8 = r6.AdN()
            java.lang.String r4 = r6.C6C()
            java.lang.String r3 = r6.C6k()
            X.1Ln r2 = X.DbT.A0J(r9)
            boolean r0 = X.DbT.A1Y(r2)
            if (r0 == 0) goto L_0x00fc
            X.DbW.A17(r2, r9)
            java.lang.String r0 = "change_name_photo_sheet_rendered"
            X.DbV.A1M(r2, r0)
            java.lang.String r0 = "change_name_photo_text"
            r2.A0p(r0)
            java.lang.String r0 = "thread_view"
            java.lang.Long r0 = X.DbZ.A0b(r2, r0, r4, r3, r8)
            X.C66582MXn.A1C(r2, r9, r0)
        L_0x00fc:
            java.lang.Object r8 = r7.A02
            X.PA4 r8 = (X.PA4) r8
            com.instagram.common.session.UserSession r4 = r8.A02
            X.0Tu r10 = X.0Tu.A05
            r2 = 36324449682731102(0x810ce50000305e, double:3.035066473953274E-306)
            boolean r0 = X.182.A06(r10, r4, r2)
            if (r0 == 0) goto L_0x0142
            java.lang.ref.WeakReference r0 = r8.A03
            java.lang.Object r7 = r0.get()
            androidx.fragment.app.FragmentActivity r7 = (androidx.fragment.app.FragmentActivity) r7
            if (r7 == 0) goto L_0x0227
            X.3t3 r10 = r6.B6E()
            if (r10 == 0) goto L_0x0227
            com.instagram.user.model.User r3 = X.DbT.A0j(r4)
            java.util.List r2 = r6.BRZ()
            boolean r0 = r6.CUO()
            r0 = r0 ^ 1
            java.util.ArrayList r11 = X.AnonymousClass3UE.A05(r3, r2, r0)
            java.lang.String r0 = r6.C6f()
            if (r0 == 0) goto L_0x01ab
            java.lang.String r13 = r6.C6f()
            if (r13 != 0) goto L_0x01ad
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0142:
            boolean r11 = r7.A03
            java.lang.ref.WeakReference r0 = r8.A03
            java.lang.Object r9 = r0.get()
            android.app.Activity r9 = (android.app.Activity) r9
            if (r9 == 0) goto L_0x0183
            X.Dg1 r7 = new X.Dg1
            r7.<init>(r9, r4)
            if (r11 != 0) goto L_0x015e
            boolean r0 = X.182.A05(r10, r4)
            r3 = 2131968692(0x7f1342b4, float:1.9574286E38)
            if (r0 != 0) goto L_0x0161
        L_0x015e:
            r3 = 2131968694(0x7f1342b6, float:1.957429E38)
        L_0x0161:
            r2 = 5
            X.Ojx r0 = new X.Ojx
            r0.<init>((X.PA4) r8, (X.AnonymousClass7S7) r6, (int) r2, (boolean) r5)
            r7.A04(r0, r3)
            if (r11 == 0) goto L_0x019e
            r3 = 2131968695(0x7f1342b7, float:1.9574292E38)
        L_0x016f:
            r2 = 6
            X.Ojx r0 = new X.Ojx
            r0.<init>((X.PA4) r8, (X.AnonymousClass7S7) r6, (int) r2, (boolean) r5)
            r7.A04(r0, r3)
            r2 = 2131954722(0x7f130c22, float:1.9545951E38)
            X.Ojt r0 = X.C71394Ojt.A00
            r7.A04(r0, r2)
            X.C51969G9p.A11(r9, r7)
        L_0x0183:
            X.0eK r0 = r8.A05
            X.7S7 r0 = X.C66582MXn.A0d(r0)
            X.3t3 r0 = r0.CBU()
            if (r0 == 0) goto L_0x0510
            java.lang.String r3 = X.C300965yF.A07(r0)
            if (r3 == 0) goto L_0x0510
            X.NmP r2 = X.C69481NmP.CHANGE_THREAD_NAME_AND_IMAGE
            X.NmL r0 = X.C69477NmL.START
            X.C70035NwD.A00(r2, r0, r4, r3)
            goto L_0x0227
        L_0x019e:
            boolean r0 = X.182.A05(r10, r4)
            r3 = 2131958715(0x7f131bbb, float:1.955405E38)
            if (r0 == 0) goto L_0x016f
            r3 = 2131958714(0x7f131bba, float:1.9554048E38)
            goto L_0x016f
        L_0x01ab:
            java.lang.String r13 = ""
        L_0x01ad:
            X.7SD r0 = r6.C6Q()
            r5 = 0
            if (r0 == 0) goto L_0x0237
            com.instagram.common.typedurl.ImageUrl r9 = r0.A0F
        L_0x01b6:
            java.util.Iterator r3 = r11.iterator()
        L_0x01ba:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x022e
            java.lang.Object r0 = r3.next()
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0
            r2 = 0
            if (r0 == 0) goto L_0x022c
            java.lang.String r0 = r0.getUrl()
        L_0x01cd:
            if (r9 == 0) goto L_0x01d3
            java.lang.String r2 = r9.getUrl()
        L_0x01d3:
            boolean r0 = X.0qQ.A0K(r0, r2)
            if (r0 == 0) goto L_0x01ba
        L_0x01d9:
            r0 = r5
        L_0x01da:
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1D(r11)
            int r11 = X.C66580MXl.A05(r6)
            java.lang.String r9 = "thread_null_state"
            X.NIZ r6 = new X.NIZ
            r6.<init>()
            android.os.Bundle r3 = X.C66581MXm.A09(r4)
            java.lang.String r2 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID"
            X.OXL.A02(r3, r10, r2)
            java.lang.String r2 = "thread_title"
            r3.putString(r2, r13)
            java.lang.String r2 = "thread_picture_image_url"
            r3.putParcelable(r2, r0)
            java.lang.String r0 = "members_picture_image_url"
            r3.putParcelableArrayList(r0, r12)
            java.lang.String r0 = "analytics_entrypoint"
            r3.putString(r0, r9)
            java.lang.String r0 = "DirectThreadDetailFragment.THREAD_SUBTYPE"
            r3.putInt(r0, r11)
            r6.setArguments(r3)
            X.0iw r3 = r8.A01
            java.lang.String r0 = X.C300965yF.A07(r10)
            X.HqG r2 = new X.HqG
            r2.<init>(r3, r4, r9, r0)
            X.HOn r0 = X.C54682HOn.TAP_CHANGE_NAME_IMAGE
            r2.A00(r0, r5)
            X.6Yo r2 = X.DbU.A0P(r5, r6, r7, r4)
            java.lang.String r0 = "IgDirectUpdateGroupNameAndPhoto"
            X.C66583MXo.A1G(r2, r0)
        L_0x0227:
            r0 = 717992470(0x2acbb216, float:3.6183616E-13)
            goto L_0x0047
        L_0x022c:
            r0 = r5
            goto L_0x01cd
        L_0x022e:
            X.7SD r0 = r6.C6Q()
            if (r0 == 0) goto L_0x01d9
            com.instagram.common.typedurl.ImageUrl r0 = r0.A0F
            goto L_0x01da
        L_0x0237:
            r9 = r5
            goto L_0x01b6
        L_0x023a:
            r0 = 1550917779(0x5c712093, float:2.7148514E17)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r7.A02
            X.NIn r4 = (X.C68449NIn) r4
            X.DbT.A1J(r4)
            boolean r0 = r7.A03
            if (r0 != 0) goto L_0x0276
            com.google.common.collect.ImmutableList r0 = X.C71024OZb.A01
            X.0eM r3 = r4.A1T
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r3)
            X.OZb r0 = new X.OZb
            r0.<init>(r2)
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r3)
            X.C71024OZb.A00(r2, r0)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r3)
            X.60k r2 = X.C3018660j.A01(r0)
            X.Nmo r0 = X.C69506Nmo.A0E
            r2.A0B(r0)
        L_0x0271:
            r0 = 1805842688(0x6ba2f900, float:3.940437E26)
            goto L_0x0047
        L_0x0276:
            java.lang.Object r2 = r7.A01
            X.0r1 r2 = (X.0r1) r2
            r0 = 1
            r2.A00 = r0
            goto L_0x0271
        L_0x027e:
            r0 = 326378921(0x137425a9, float:3.0815698E-27)
            int r1 = X.AnonymousClass0fD.A05(r0)
            boolean r0 = r7.A03
            if (r0 == 0) goto L_0x02a8
            java.lang.Object r0 = r7.A02
            X.NJY r0 = (X.NJY) r0
            X.0eM r0 = r0.A14
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.6gx r4 = X.C313746gw.A00(r0)
            java.lang.Object r0 = r7.A01
            X.N4P r0 = (X.N4P) r0
            int r3 = r0.A06()
            java.lang.String r2 = X.N4P.A03(r0)
            java.lang.String r0 = r0.A0Q
            r4.A09(r3, r2, r0)
        L_0x02a8:
            java.lang.Object r0 = r7.A02
            X.NJY r0 = (X.NJY) r0
            X.NJY.A0A(r0)
            r0 = -1499320875(0xffffffffa6a22dd5, float:-1.1253431E-15)
            goto L_0x0047
        L_0x02b4:
            r0 = 1653350112(0x628c1ee0, float:1.2923845E21)
            int r1 = X.AnonymousClass0fD.A05(r0)
            boolean r0 = r7.A03
            if (r0 == 0) goto L_0x02de
            java.lang.Object r0 = r7.A02
            X.NJY r0 = (X.NJY) r0
            X.0eM r0 = r0.A14
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.6gx r4 = X.C313746gw.A00(r0)
            java.lang.Object r0 = r7.A01
            X.N4P r0 = (X.N4P) r0
            int r3 = r0.A06()
            java.lang.String r2 = X.N4P.A03(r0)
            java.lang.String r0 = r0.A0Q
            r4.A08(r3, r2, r0)
        L_0x02de:
            java.lang.Object r0 = r7.A02
            X.NJY r0 = (X.NJY) r0
            X.NJY.A09(r0)
            r0 = -1551780546(0xffffffffa381b53e, float:-1.4062967E-17)
            goto L_0x0047
        L_0x02ea:
            r0 = 212254237(0xca6be1d, float:2.569077E-31)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r7.A01
            X.NVI r6 = (X.NVI) r6
            java.lang.String r2 = r6.A04
            java.lang.String r0 = "STORY_SHOUT_OUT"
            boolean r3 = X.0qQ.A0K(r2, r0)
            java.lang.String r0 = ""
            r13 = r0
            r12 = 0
            java.lang.Object r2 = r7.A02
            X.MzQ r2 = (X.C68059MzQ) r2
            X.O6H r2 = r2.A0D
            if (r3 == 0) goto L_0x0371
            java.lang.String r3 = r6.A03
            if (r3 != 0) goto L_0x030e
            r3 = r0
        L_0x030e:
            X.Bmm r5 = r6.A01
            if (r5 == 0) goto L_0x031c
            java.lang.String r4 = X.C67009Mgh.A00()
            java.lang.String r20 = r5.A09(r4)
            if (r20 != 0) goto L_0x036a
        L_0x031c:
            r20 = r0
            if (r5 != 0) goto L_0x036a
            r0 = r12
        L_0x0321:
            com.instagram.common.typedurl.SimpleImageUrl r14 = X.DbS.A0V(r0)
            java.util.List r0 = r6.A06
            java.util.ArrayList r10 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r9 = r0.iterator()
        L_0x032f:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0430
            java.lang.Object r8 = r9.next()
            X.GnV r8 = (X.C53398GnV) r8
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR
            java.lang.Object r5 = r8.A02
            X.3lr r5 = (X.C250663lr) r5
            if (r5 == 0) goto L_0x0367
            java.lang.String r0 = "igid"
            java.lang.String r4 = r5.A08(r0)
            java.lang.String r0 = X.C67009Mgh.A00()
            java.lang.String r0 = r5.A0A(r0)
        L_0x0351:
            com.instagram.user.model.User r6 = new com.instagram.user.model.User
            r6.<init>(r4, r0)
            java.lang.String r0 = r8.A03
            com.instagram.common.typedurl.SimpleImageUrl r5 = X.DbS.A0V(r0)
            java.lang.String r4 = r8.A04
            com.instagram.reels.channelchallenge.model.ChannelChallengeStickerWinnerModel r0 = new com.instagram.reels.channelchallenge.model.ChannelChallengeStickerWinnerModel
            r0.<init>(r5, r6, r4)
            r10.add(r0)
            goto L_0x032f
        L_0x0367:
            r4 = r12
            r0 = r12
            goto L_0x0351
        L_0x036a:
            java.lang.String r0 = "profile_image_uri(size:256)"
            java.lang.String r0 = r5.A0A(r0)
            goto L_0x0321
        L_0x0371:
            java.util.List r4 = r6.A06
            java.lang.Object r3 = X.00k.A0I(r4)
            X.GnV r3 = (X.C53398GnV) r3
            java.lang.String r3 = r3.A04
            if (r3 == 0) goto L_0x037e
            r0 = r3
        L_0x037e:
            android.os.Parcelable$Creator r3 = com.instagram.pendingmedia.model.recipients.PendingRecipient.CREATOR
            X.3lr r4 = X.C66583MXo.A0K(r4)
            if (r4 == 0) goto L_0x038c
            java.lang.String r3 = "igid"
            java.lang.String r12 = r4.A08(r3)
        L_0x038c:
            r8 = 0
            com.instagram.common.typedurl.ImageUrl r6 = com.instagram.pendingmedia.model.recipients.PendingRecipient.A0g
            r16 = 0
            r22 = 1
            com.instagram.user.model.FollowStatus r7 = com.instagram.user.model.FollowStatus.A08
            r18 = -1
            com.instagram.pendingmedia.model.recipients.PendingRecipient r5 = new com.instagram.pendingmedia.model.recipients.PendingRecipient
            r9 = r8
            r10 = r8
            r11 = r8
            r14 = r13
            r15 = r8
            r17 = r16
            r19 = r16
            r20 = r16
            r21 = r16
            r23 = r16
            r24 = r16
            r25 = r16
            r26 = r16
            r27 = r16
            r28 = r16
            r29 = r22
            r30 = r16
            r31 = r16
            r32 = r16
            r33 = r16
            r34 = r16
            r35 = r16
            r36 = r16
            r37 = r16
            r38 = r16
            r39 = r16
            r40 = r16
            r41 = r16
            r42 = r16
            r43 = r16
            r44 = r16
            r45 = r16
            r46 = r16
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            java.util.List r7 = X.AnonymousClass7TE.A1I(r5)
            X.NV4 r6 = r2.A00
            androidx.fragment.app.FragmentActivity r4 = r6.requireActivity()
            X.0eM r2 = r6.A0S
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r2)
            java.lang.String r2 = "challenge_winner"
            X.1pE r5 = X.1pE.A01(r4, r6, r3, r2)
            r5.A0N = r0
            androidx.fragment.app.FragmentActivity r4 = r6.requireActivity()
            X.5gg r3 = new X.5gg
            r3.<init>(r7)
            r2 = 1061997773(0x3f4ccccd, float:0.8)
            r5.A08(r4, r3, r2)
            X.0eM r2 = r6.A06
            X.OyR r9 = X.C66580MXl.A0T(r2)
            java.lang.String r11 = X.C66580MXl.A0w(r6)
            com.instagram.model.direct.DirectThreadKey r2 = r6.A0G()
            java.lang.String r12 = r2.A01
            X.3U9 r2 = X.C66584MXp.A0N(r6)
            if (r2 == 0) goto L_0x041e
            int r2 = r2.AdN()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
        L_0x041e:
            java.lang.String r2 = "submission_id"
            java.util.Map r17 = X.AnonymousClass7TF.A0w(r2, r0)
            java.lang.String r13 = "challenge_winner_direct_message_rendered"
            java.lang.String r14 = "tap"
            java.lang.String r15 = "message_winner_button"
            java.lang.String r16 = "challenge_winners_chosen_sheet"
            X.C72202OyR.A03(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x049d
        L_0x0430:
            boolean r0 = r7.A03
            r4 = r0 ^ 1
            r30 = 1
            r8 = 0
            X.NV4 r0 = r2.A00
            android.os.Bundle r2 = r0.mArguments
            if (r2 == 0) goto L_0x049d
            java.lang.String r7 = X.C66580MXl.A0t(r2)
            if (r7 == 0) goto L_0x049d
            java.lang.String r16 = X.C66580MXl.A0w(r0)
            if (r16 == 0) goto L_0x049d
            r2 = 29
            java.lang.String r5 = "client_context"
            java.lang.String r6 = "message_id"
            if (r4 == 0) goto L_0x04a8
            int r9 = r0.A02
            int r11 = r10.size()
            android.os.Bundle r4 = r0.mArguments
            if (r4 == 0) goto L_0x04a5
            java.lang.String r22 = r4.getString(r6)
        L_0x045f:
            android.os.Bundle r4 = r0.mArguments
            if (r4 == 0) goto L_0x04a2
            java.lang.String r23 = r4.getString(r5)
        L_0x0467:
            X.0eM r6 = r0.A0S
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r6)
            java.lang.String r5 = r4.A06
            X.3Te r4 = X.C66582MXn.A0Z(r0)
            java.lang.String r25 = X.C329997La.A00(r4, r5, r2)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r11)
            java.lang.String r24 = "challenge_winner_cta"
            com.instagram.direct.sharetostory.data.ChannelChallengeStickerData r13 = new com.instagram.direct.sharetostory.data.ChannelChallengeStickerData
            r17 = r12
            r18 = r7
            r19 = r3
            r21 = r12
            r26 = r10
            r27 = r12
            r28 = r9
            r29 = r8
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r6)
            androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
            X.C49094EpJ.A00(r0, r2, r13)
        L_0x049d:
            r0 = 1269270657(0x4ba78881, float:2.1958914E7)
            goto L_0x0047
        L_0x04a2:
            r23 = 0
            goto L_0x0467
        L_0x04a5:
            r22 = 0
            goto L_0x045f
        L_0x04a8:
            X.0eM r9 = r0.A0S
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r9)
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            com.instagram.model.direct.DirectThreadKey r11 = r0.A0G()
            java.lang.String r13 = r11.A01
            java.lang.String r12 = r0.A0L
            java.lang.String r20 = X.NV4.A01(r0)
            X.0sn r27 = X.0sn.A00
            int r28 = r10.size()
            android.os.Bundle r11 = r0.mArguments
            if (r11 == 0) goto L_0x050d
            java.lang.String r21 = r11.getString(r6)
        L_0x04cc:
            android.os.Bundle r6 = r0.mArguments
            if (r6 == 0) goto L_0x050a
            java.lang.String r22 = r6.getString(r5)
        L_0x04d4:
            X.3U9 r5 = X.C66584MXp.A0N(r0)
            if (r5 == 0) goto L_0x0508
            int r5 = r5.AdN()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r5)
        L_0x04e2:
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r9)
            java.lang.String r6 = r5.A06
            X.3Te r5 = X.C66582MXn.A0Z(r0)
            java.lang.String r23 = X.C329997La.A00(r5, r6, r2)
            java.lang.String r24 = "winners_chosen"
            java.lang.String r25 = "challenge_winner"
            com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeAllWinnersShareInfo r14 = new com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeAllWinnersShareInfo
            r17 = r13
            r18 = r7
            r19 = r12
            r26 = r10
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            X.OX8.A01(r3, r0, r4, r14)
            X.NV4.A02(r0, r7, r8, r8)
            goto L_0x049d
        L_0x0508:
            r15 = 0
            goto L_0x04e2
        L_0x050a:
            r22 = 0
            goto L_0x04d4
        L_0x050d:
            r21 = 0
            goto L_0x04cc
        L_0x0510:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71398Ojx.onClick(android.view.View):void");
    }

    public C71398Ojx(PA4 pa4, AnonymousClass7S7 r2, int i, boolean z) {
        this.A00 = i;
        if (4 - i != 0) {
            this.A03 = z;
            this.A02 = pa4;
            this.A01 = r2;
        } else {
            this.A01 = r2;
            this.A02 = pa4;
            this.A03 = z;
        }
    }
}
