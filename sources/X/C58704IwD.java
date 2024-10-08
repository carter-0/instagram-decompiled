package X;

/* renamed from: X.IwD  reason: case insensitive filesystem */
public final class C58704IwD extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58704IwD(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static C58704IwD A00(C286575Wy r1, Object obj, int i) {
        C58704IwD iwD = new C58704IwD(obj, i);
        r1.FLL(iwD);
        return iwD;
    }

    public static C58704IwD A01(Object obj, int i) {
        return new C58704IwD(obj, i);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0429, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0372, code lost:
        r5.A01.addAll(r4);
        X.C53048Ghg.A02(new X.C57509Ibx(r5), r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x03c4, code lost:
        X.C58106ImS.A03(r2, r1, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r26 = this;
            r2 = r26
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x0420;
                case 1: goto L_0x0402;
                case 2: goto L_0x03f9;
                case 3: goto L_0x03ee;
                case 4: goto L_0x03df;
                case 5: goto L_0x03c8;
                case 6: goto L_0x03bb;
                case 7: goto L_0x03a6;
                case 8: goto L_0x039b;
                case 9: goto L_0x0392;
                case 10: goto L_0x038b;
                case 11: goto L_0x0381;
                case 12: goto L_0x0314;
                case 13: goto L_0x029d;
                case 14: goto L_0x01d6;
                case 15: goto L_0x038b;
                case 16: goto L_0x01c6;
                case 17: goto L_0x042a;
                case 18: goto L_0x01bf;
                case 19: goto L_0x0007;
                case 20: goto L_0x0055;
                case 21: goto L_0x0198;
                case 22: goto L_0x018f;
                case 23: goto L_0x042a;
                case 24: goto L_0x01bf;
                case 25: goto L_0x0007;
                case 26: goto L_0x0158;
                case 27: goto L_0x042a;
                case 28: goto L_0x01bf;
                case 29: goto L_0x0007;
                case 30: goto L_0x0038;
                case 31: goto L_0x0144;
                case 32: goto L_0x012e;
                case 33: goto L_0x042a;
                case 34: goto L_0x01bf;
                case 35: goto L_0x0007;
                case 36: goto L_0x011e;
                case 37: goto L_0x0025;
                case 38: goto L_0x010f;
                case 39: goto L_0x0055;
                case 40: goto L_0x00d9;
                case 41: goto L_0x00c5;
                case 42: goto L_0x0084;
                case 43: goto L_0x006e;
                case 44: goto L_0x0060;
                case 45: goto L_0x042a;
                case 46: goto L_0x01bf;
                case 47: goto L_0x0007;
                case 48: goto L_0x000e;
                case 49: goto L_0x0055;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r2.A01
            X.07f r5 = X.DbY.A0I(r0)
        L_0x000d:
            return r5
        L_0x000e:
            java.lang.Object r0 = r2.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            r0 = 2652(0xa5c, float:3.716E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.os.Parcelable r5 = r1.getParcelable(r0)
            if (r5 != 0) goto L_0x000d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0025:
            java.lang.Object r0 = r2.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "arg_track_to_edit"
            android.os.Parcelable r5 = r1.getParcelable(r0)
            if (r5 != 0) goto L_0x000d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0038:
            java.lang.Object r0 = r2.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "wall_media_picker_tab_type"
            int r4 = r1.getInt(r0)
            X.HMX[] r3 = X.HMX.values()
            int r2 = r3.length
            r1 = 0
        L_0x004a:
            if (r1 >= r2) goto L_0x042d
            r5 = r3[r1]
            int r0 = r5.A00
            if (r0 == r4) goto L_0x000d
            int r1 = r1 + 1
            goto L_0x004a
        L_0x0055:
            X.2dY r1 = X.2dZ.A0t
            java.lang.Object r0 = r2.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.2dZ r5 = r1.A04(r0)
            return r5
        L_0x0060:
            java.lang.Object r0 = r2.A01
            X.H0t r0 = (X.C54149H0t) r0
            X.GhK r1 = X.G9w.A0c(r0)
            r0 = 1
            r1.A02(r0)
            goto L_0x0427
        L_0x006e:
            java.lang.Object r0 = r2.A01
            X.H0t r0 = (X.C54149H0t) r0
            X.GhK r2 = X.G9w.A0c(r0)
            com.instagram.music.common.model.AudioOverlayTrack r1 = r2.A00
            if (r1 == 0) goto L_0x0427
            X.Ibq r0 = new X.Ibq
            r0.<init>(r1)
            X.C53029GhK.A00(r0, r2)
            goto L_0x0427
        L_0x0084:
            java.lang.Object r10 = r2.A01
            X.H0t r10 = (X.C54149H0t) r10
            X.0eM r0 = r10.A06
            com.instagram.common.session.UserSession r11 = X.AnonymousClass7TE.A0l(r0)
            X.89f r3 = r10.A01
            X.89h r15 = r10.A00
            r21 = 0
            r2 = 1
            X.DbZ.A0t(r2, r11, r3, r15)
            android.content.Context r6 = r10.requireContext()
            X.80X r19 = X.AnonymousClass80X.UNINITIALIZED
            com.instagram.music.common.constants.AudioTrackType r1 = com.instagram.music.common.constants.AudioTrackType.ORIGINAL
            com.instagram.music.common.constants.AudioTrackType r0 = com.instagram.music.common.constants.AudioTrackType.REACTIVE
            com.google.common.collect.ImmutableList r8 = com.google.common.collect.ImmutableList.of(r1, r0)
            X.0qQ.A07(r8)
            com.instagram.api.schemas.MusicProduct r9 = com.instagram.api.schemas.MusicProduct.UNSET
            r7 = 0
            X.89j r18 = X.C3515689j.UNKNOWN
            X.89k r5 = new X.89k
            r12 = r7
            r13 = r7
            r14 = r7
            r16 = r3
            r17 = r7
            r20 = r7
            r22 = r2
            r23 = r21
            r24 = r2
            r25 = r21
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return r5
        L_0x00c5:
            java.lang.Object r2 = r2.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            androidx.fragment.app.FragmentActivity r1 = r2.requireActivity()
            r0 = 26
            X.JFy r0 = X.C59346JFy.A00(r2, r0)
            X.P46 r5 = new X.P46
            r5.<init>(r1, r0)
            return r5
        L_0x00d9:
            java.lang.Object r5 = r2.A01
            X.H0t r5 = (X.C54149H0t) r5
            X.0eM r0 = r5.A06
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r5.A07
            java.lang.Object r3 = r0.getValue()
            com.instagram.wonderwall.model.WallInfo r3 = (com.instagram.wonderwall.model.WallInfo) r3
            android.os.Bundle r1 = r5.requireArguments()
            r0 = 2629(0xa45, float:3.684E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.os.Parcelable r2 = r1.getParcelable(r0)
            com.instagram.wonderwall.model.WallPostItem r2 = (com.instagram.wonderwall.model.WallPostItem) r2
            android.os.Bundle r1 = r5.requireArguments()
            r0 = 4215(0x1077, float:5.906E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r1.getString(r0)
            X.H6b r5 = new X.H6b
            r5.<init>(r4, r3, r2, r0)
            return r5
        L_0x010f:
            java.lang.Object r0 = r2.A01
            X.K7J r0 = (X.K7J) r0
            X.0eM r0 = r0.A02
            r0.getValue()
            X.Hdv r5 = new X.Hdv
            r5.<init>()
            return r5
        L_0x011e:
            java.lang.Object r0 = r2.A01
            X.H0W r0 = (X.H0W) r0
            X.0eM r0 = r0.A06
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.H5p r5 = new X.H5p
            r5.<init>(r0)
            return r5
        L_0x012e:
            java.lang.Object r0 = r2.A01
            androidx.fragment.app.FragmentActivity r1 = X.DbT.A0E(r0)
            r0 = 50
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            X.3jo r1 = (X.C249453jo) r1
            X.2dZ r5 = r1.AYJ()
            return r5
        L_0x0144:
            java.lang.Object r0 = r2.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.Fragment r1 = r0.mParentFragment
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.wonderwall.ui.fragment.WallMediaPickerTabFragment"
            X.0qQ.A0C(r1, r0)
            X.H0W r1 = (X.H0W) r1
            X.0eM r0 = r1.A07
            java.lang.Object r5 = r0.getValue()
            return r5
        L_0x0158:
            java.lang.Object r2 = r2.A01
            X.H08 r2 = (X.H08) r2
            X.0eM r0 = r2.A06
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r2.A04
            java.lang.Object r10 = r0.getValue()
            X.HMX r10 = (X.HMX) r10
            X.0eM r1 = r2.A05
            java.lang.Object r0 = r1.getValue()
            X.Gh5 r0 = (X.C53014Gh5) r0
            X.0pa r12 = r0.A04
            android.content.Context r6 = r2.requireContext()
            X.0gy r8 = X.AnonymousClass07i.A00(r2)
            X.0h9 r7 = r2.mLifecycleRegistry
            X.0qQ.A07(r7)
            java.lang.Object r0 = r1.getValue()
            X.Gh5 r0 = (X.C53014Gh5) r0
            X.Hmi r11 = r0.A01
            X.H6p r5 = new X.H6p
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            return r5
        L_0x018f:
            java.lang.Object r1 = r2.A01
            X.H0S r1 = (X.H0S) r1
            r0 = 0
            r1.A01 = r0
            goto L_0x0427
        L_0x0198:
            java.lang.Object r1 = r2.A01
            X.H0S r1 = (X.H0S) r1
            X.0eM r0 = r1.A04
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            android.os.Bundle r1 = r1.requireArguments()
            r0 = 1103(0x44f, float:1.546E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.os.Parcelable r0 = r1.getParcelable(r0)
            if (r0 == 0) goto L_0x01ba
            com.instagram.wonderwall.model.WallLaunchConfig r0 = (com.instagram.wonderwall.model.WallLaunchConfig) r0
            X.H6A r5 = new X.H6A
            r5.<init>(r2, r0)
            return r5
        L_0x01ba:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x01bf:
            java.lang.Object r0 = r2.A01
            java.lang.Object r5 = X.DbT.A0r(r0)
            return r5
        L_0x01c6:
            java.lang.Object r0 = r2.A01
            X.K4n r0 = (X.C61369K4n) r0
            X.0eM r0 = r0.A01
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.H5o r5 = new X.H5o
            r5.<init>(r0)
            return r5
        L_0x01d6:
            java.lang.Object r3 = r2.A01
            X.Ghg r3 = (X.C53048Ghg) r3
            r6 = 0
            r3.A04(r6)
            java.util.List r0 = r3.A06
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r4 = r0.iterator()
        L_0x01e8:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0208
            com.instagram.user.model.User r2 = X.DbT.A0k(r4)
            X.0eM r0 = r3.A07
            java.lang.Object r1 = r0.getValue()
            X.17i r1 = (X.17i) r1
            java.lang.String r0 = r2.getId()
            com.instagram.user.model.User r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x01e8
            r7.add(r0)
            goto L_0x01e8
        L_0x0208:
            X.0Ud r5 = r3.A0B
            java.lang.Object r0 = r5.getValue()
            X.GnH r0 = (X.C53385GnH) r0
            java.lang.Object r0 = r0.A05
            X.5Tl r0 = (X.C285975Tl) r0
            X.5Tq r0 = r0.A01
            java.lang.String r9 = r0.A00
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0296
            int r0 = r9.length()
            if (r0 == 0) goto L_0x0296
            java.util.ArrayList r4 = X.AnonymousClass7TG.A0r(r7)
            java.util.Iterator r2 = r7.iterator()
        L_0x022c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x023f
            com.instagram.user.model.User r1 = X.DbT.A0k(r2)
            com.instagram.pendingmedia.model.recipients.PendingRecipient r0 = new com.instagram.pendingmedia.model.recipients.PendingRecipient
            r0.<init>((com.instagram.user.model.User) r1)
            r4.add(r0)
            goto L_0x022c
        L_0x023f:
            X.5gg r1 = new X.5gg
            r1.<init>(r4)
            java.util.List r0 = r1.A00
            r10 = 0
            com.instagram.model.direct.DirectShareTarget r7 = new com.instagram.model.direct.DirectShareTarget
            r7.<init>(r1, r10, r0, r6)
            java.lang.Object r0 = r5.getValue()
            X.GnH r0 = (X.C53385GnH) r0
            java.lang.Object r0 = r0.A02
            com.instagram.wonderwall.model.WallPostItem r0 = (com.instagram.wonderwall.model.WallPostItem) r0
            com.instagram.common.session.UserSession r6 = r3.A01
            com.instagram.wonderwall.model.WallPostInfo r0 = r0.BeB()
            java.lang.String r8 = r0.A06
            boolean r4 = X.DbW.A1Z(r8)
            X.3t2 r0 = r7.A01()
            boolean r0 = r0 instanceof X.C254773t1
            if (r0 == 0) goto L_0x028c
            X.7VU r2 = X.AnonymousClass7VT.A00(r6)
            X.3t2 r1 = r7.A01()
            r0 = 30
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            X.3t1 r1 = (X.C254773t1) r1
            java.util.List r0 = r7.A0Q
            java.util.List r0 = X.C51966G9m.A1J(r0)
            r11 = 5
            X.J6b r5 = new X.J6b
            r5.<init>((com.instagram.common.session.UserSession) r6, (com.instagram.model.direct.DirectShareTarget) r7, (java.lang.String) r8, (java.lang.String) r9, (java.lang.String) r10, (int) r11)
            r2.A02(r1, r0, r5, r4)
        L_0x028c:
            r0 = 2131973117(0x7f1353fd, float:1.958326E38)
            com.instagram.wonderwall.model.WallText$Res r0 = X.G9w.A0b(r0)
            r3.EvQ(r0)
        L_0x0296:
            X.J4v r0 = X.C59062J4v.A00
            X.C53048Ghg.A03(r3, r0)
            goto L_0x0427
        L_0x029d:
            java.lang.Object r6 = r2.A01
            X.Ghg r6 = (X.C53048Ghg) r6
            r0 = 0
            r6.A04(r0)
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.List r8 = r6.A05
            int r0 = r8.size()
            r7 = 1
            if (r0 <= r7) goto L_0x02d9
            java.util.List r0 = r6.A06
            int r1 = r0.size()
            int r0 = r8.size()
            boolean r3 = X.AnonymousClass7TF.A1S(r1, r0)
            java.lang.Object r2 = X.00k.A0I(r8)
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            java.lang.Object r1 = r8.get(r7)
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            r0 = 15
            X.Ivv r0 = X.C58686Ivv.A00(r6, r0)
            X.Hny r0 = X.C53048Ghg.A00(r2, r1, r0, r3)
            r4.add(r0)
        L_0x02d9:
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r8)
            java.util.Iterator r8 = r8.iterator()
        L_0x02e1:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x035b
            java.lang.Object r3 = r8.next()
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            java.util.List r1 = r6.A06
            int r0 = r1.size()
            if (r0 != r7) goto L_0x0304
            java.lang.Object r0 = X.00k.A0I(r1)
            java.lang.String r0 = X.DbS.A0q(r0)
            boolean r0 = X.DbV.A1Z(r3, r0)
            r2 = 1
            if (r0 != 0) goto L_0x0305
        L_0x0304:
            r2 = 0
        L_0x0305:
            r1 = 0
            r0 = 8
            X.Ivw r0 = X.C58687Ivw.A00(r3, r6, r0)
            X.Hny r0 = X.C53048Ghg.A00(r3, r1, r0, r2)
            r5.add(r0)
            goto L_0x02e1
        L_0x0314:
            java.lang.Object r6 = r2.A01
            X.Ghg r6 = (X.C53048Ghg) r6
            com.instagram.wonderwall.model.WallMenuConfig r5 = new com.instagram.wonderwall.model.WallMenuConfig
            r5.<init>()
            r0 = 2131976775(0x7f136247, float:1.959068E38)
            r7 = 0
            com.instagram.wonderwall.model.WallText$Res r0 = X.G9w.A0b(r0)
            r5.A00 = r0
            X.05G r0 = r6.A0A
            java.lang.Object r0 = r0.getValue()
            X.GnH r0 = (X.C53385GnH) r0
            java.lang.Object r0 = r0.A02
            com.instagram.wonderwall.model.WallPostItem r0 = (com.instagram.wonderwall.model.WallPostItem) r0
            com.instagram.wonderwall.model.WallPostInfo r0 = r0.BeB()
            java.util.List r0 = r0.A08
            java.util.ArrayList r4 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x0341:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0372
            java.lang.Object r2 = r3.next()
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            r1 = 0
            r0 = 7
            X.Ivw r0 = X.C58687Ivw.A00(r2, r6, r0)
            X.Hny r0 = X.C53048Ghg.A00(r2, r1, r0, r7)
            r4.add(r0)
            goto L_0x0341
        L_0x035b:
            r4.addAll(r5)
            boolean r0 = X.DbT.A1b(r4)
            if (r0 == 0) goto L_0x0427
            com.instagram.wonderwall.model.WallMenuConfig r5 = new com.instagram.wonderwall.model.WallMenuConfig
            r5.<init>()
            r0 = 2131976772(0x7f136244, float:1.9590674E38)
            com.instagram.wonderwall.model.WallText$Res r0 = X.G9w.A0b(r0)
            r5.A00 = r0
        L_0x0372:
            java.util.List r0 = r5.A01
            r0.addAll(r4)
            X.Ibx r0 = new X.Ibx
            r0.<init>(r5)
            X.C53048Ghg.A02(r0, r6)
            goto L_0x0427
        L_0x0381:
            java.lang.Object r1 = r2.A01
            X.Ghg r1 = (X.C53048Ghg) r1
            r0 = 0
            r1.A04(r0)
            goto L_0x0427
        L_0x038b:
            java.lang.Object r0 = r2.A01
            X.DbS.A1U(r0)
            goto L_0x0427
        L_0x0392:
            java.lang.Object r0 = r2.A01
            X.GhK r0 = (X.C53029GhK) r0
            r0.A01()
            goto L_0x0427
        L_0x039b:
            java.lang.Object r2 = r2.A01
            X.2YL r2 = (X.2YL) r2
            X.6oS r1 = X.C318116oQ.A00(r2)
            r0 = 9
            goto L_0x03c4
        L_0x03a6:
            java.lang.Object r0 = r2.A01
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r0 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState) r0
            X.I48 r0 = r0.A0D
            X.5dh r0 = r0.A05
            int r0 = r0.BI6()
            boolean r0 = X.AnonymousClass7TF.A1R(r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L_0x03bb:
            java.lang.Object r2 = r2.A01
            X.2YL r2 = (X.2YL) r2
            X.6oS r1 = X.C318116oQ.A00(r2)
            r0 = 5
        L_0x03c4:
            X.C58106ImS.A03(r2, r1, r0)
            goto L_0x0427
        L_0x03c8:
            java.lang.Object r2 = r2.A01
            X.HqK r2 = (X.C55956HqK) r2
            X.Hoq r0 = r2.A01
            X.5Oz r0 = r0.A06
            java.lang.Object r1 = r0.getValue()
            java.lang.String r0 = r2.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L_0x03df:
            java.lang.Object r0 = r2.A01
            X.Hoq r0 = (X.C55869Hoq) r0
            X.5Oz r0 = r0.A05
            int r0 = X.C51971G9r.A0B(r0)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            return r5
        L_0x03ee:
            java.lang.Object r0 = r2.A01
            X.HqK r0 = (X.C55956HqK) r0
            X.4gU r0 = r0.A00
            java.lang.Object r5 = r0.getValue()
            return r5
        L_0x03f9:
            java.lang.Object r1 = r2.A01
            X.0sP r1 = (X.0sP) r1
            r0 = 0
            X.C51968G9o.A1O(r1, r0)
            goto L_0x0427
        L_0x0402:
            java.lang.Object r2 = r2.A01
            X.Hor r2 = (X.C55870Hor) r2
            X.5Oz r1 = r2.A00
            boolean r0 = X.C51971G9r.A1W(r1)
            r0 = r0 ^ 1
            X.C51967G9n.A16(r1, r0)
            X.Tol r2 = r2.A04
            boolean r0 = X.C51971G9r.A1W(r1)
            float r1 = X.C51970G9q.A01(r0)
            r0 = 0
            r2.A03(r1, r0)
            goto L_0x0427
        L_0x0420:
            java.lang.Object r0 = r2.A01
            X.HqK r0 = (X.C55956HqK) r0
            r0.A00()
        L_0x0427:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x042a:
            java.lang.Object r5 = r2.A01
            return r5
        L_0x042d:
            X.HMX r5 = X.HMX.USER_MEDIA
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58704IwD.invoke():java.lang.Object");
    }
}
