package X;

/* renamed from: X.Inj  reason: case insensitive filesystem */
public final class C58179Inj extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58179Inj(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x013a, code lost:
        r3 = r0.A00;
        X.C71144Ody.A04((X.C71144Ody) r3.A02.getValue(), r8, "AUDIENCE_MEMBER_LIST");
        r5 = r3.requireActivity();
        r9 = X.AnonymousClass7TE.A0l(r3.A03);
        r2 = new X.MPB(1, (java.lang.Object) r8, (java.lang.Object) r3);
        X.0qQ.A0B(r9, 1);
        r4 = X.AnonymousClass4A5.ALLOWLIST;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x015f, code lost:
        if (r8 == r4) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        r0 = (X.C62320sa) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0163, code lost:
        if (r8 != X.AnonymousClass4A5.BLOCKLIST) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0165, code lost:
        r1 = new com.instagram.friendmap.view.fragment.FriendMapAudienceListFragment$CustomAudienceLaunchConfig();
        r1.A00 = r8;
        r1.A01 = r2;
        r3 = new X.NIW();
        r0 = X.DbY.A0B("friend_map_custom_audience_launch_config", r1);
        X.C227642jf.A04(r0, r9);
        r2 = X.DbV.A0V(r0, r3, r9);
        r2.A03 = 0.95f;
        r2.A19 = true;
        r2.A0y = false;
        r2.A1R = true;
        r2.A11 = true;
        r2.A1I = true;
        r2.A1G = true;
        r2.A0e = java.lang.Float.valueOf(0.95f);
        r0 = 2131962771;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x019a, code lost:
        if (r8 != r4) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x019c, code lost:
        r0 = 2131962774;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x019f, code lost:
        r2.A0d = r5.getString(r0);
        r2.A0D = com.instagram.android.R.style.igds_emphasized_body_2;
        r2.A0C = 1;
        r0 = X.C48943Emh.A00(X.DbT.A0i(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01b4, code lost:
        if (r0 == null) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01b6, code lost:
        r0.A0F(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01bb, code lost:
        X.DbU.A0y(r5, r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        r0.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01f6, code lost:
        X.AnonymousClass7TE.A1Z(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x025a, code lost:
        X.C319756rA.A03(r3, (android.view.View) null, r3.getTextView().getLineCount(), false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0310, code lost:
        return java.lang.Integer.valueOf(r1.getDimensionPixelSize(r0));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x000f;
                case 1: goto L_0x0286;
                case 2: goto L_0x0027;
                case 3: goto L_0x002f;
                case 4: goto L_0x027d;
                case 5: goto L_0x003b;
                case 6: goto L_0x0298;
                case 7: goto L_0x02a6;
                case 8: goto L_0x0042;
                case 9: goto L_0x004b;
                case 10: goto L_0x0055;
                case 11: goto L_0x02b2;
                case 12: goto L_0x0067;
                case 13: goto L_0x0072;
                case 14: goto L_0x02c3;
                case 15: goto L_0x02d1;
                case 16: goto L_0x02dd;
                case 17: goto L_0x02ec;
                case 18: goto L_0x02fb;
                case 19: goto L_0x02fb;
                case 20: goto L_0x0311;
                case 21: goto L_0x031a;
                case 22: goto L_0x0325;
                case 23: goto L_0x0005;
                case 24: goto L_0x0335;
                case 25: goto L_0x007d;
                case 26: goto L_0x0005;
                case 27: goto L_0x0087;
                case 28: goto L_0x00d5;
                case 29: goto L_0x0099;
                case 30: goto L_0x00a3;
                case 31: goto L_0x0005;
                case 32: goto L_0x00ae;
                case 33: goto L_0x00d5;
                case 34: goto L_0x00df;
                case 35: goto L_0x0106;
                case 36: goto L_0x012d;
                case 37: goto L_0x0134;
                case 38: goto L_0x01c0;
                case 39: goto L_0x00ae;
                case 40: goto L_0x01fb;
                case 41: goto L_0x021a;
                case 42: goto L_0x0223;
                case 43: goto L_0x0223;
                case 44: goto L_0x022c;
                case 45: goto L_0x0237;
                case 46: goto L_0x0242;
                case 47: goto L_0x024d;
                case 48: goto L_0x0256;
                case 49: goto L_0x0269;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r10.A01
        L_0x0007:
            X.0sa r0 = (X.C62320sa) r0
        L_0x0009:
            r0.invoke()
        L_0x000c:
            X.0gF r2 = X.C60340gF.A00
        L_0x000e:
            return r2
        L_0x000f:
            java.lang.Object r2 = r10.A01
            X.3gU r2 = (X.C247533gU) r2
            if (r2 == 0) goto L_0x000c
            X.3gv r1 = r2.A01
            X.HBC r0 = X.HBC.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x000c
            X.2iF r0 = r2.A00
            if (r0 == 0) goto L_0x000c
            r0.cancel()
            goto L_0x000c
        L_0x0027:
            java.lang.Object r0 = r10.A01
            X.3v7 r0 = (X.C256033v7) r0
            X.C256013v5.A03(r0)
            goto L_0x000c
        L_0x002f:
            java.lang.Object r0 = r10.A01
            X.3fQ r0 = (X.C246903fQ) r0
            X.3ey r0 = r0.A02
            r1 = 0
            X.3VF r0 = r0.A0A
            r0.A01 = r1
            goto L_0x000c
        L_0x003b:
            java.lang.Object r0 = r10.A01
            X.GxO r0 = (X.C53980GxO) r0
            X.0sa r0 = r0.A04
            goto L_0x0009
        L_0x0042:
            java.lang.Object r1 = r10.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 0
            r1.setContentDescription(r0)
            goto L_0x000c
        L_0x004b:
            java.lang.Object r0 = r10.A01
            X.3vA r0 = (X.C256063vA) r0
            X.3v4 r0 = r0.A01
            X.C263164Jj.A00(r0)
            goto L_0x000c
        L_0x0055:
            java.lang.Object r0 = r10.A01
            X.3ey r0 = (X.C246663ey) r0
            X.3V4 r0 = r0.A03
            if (r0 == 0) goto L_0x0340
            X.2eb r1 = r0.A01
            android.view.View r0 = r1.A00
            if (r0 == 0) goto L_0x000c
            r1.A02()
            goto L_0x000c
        L_0x0067:
            java.lang.Object r0 = r10.A01
            X.9IZ r0 = (X.AnonymousClass9IZ) r0
            java.lang.Object r0 = r0.A00
            X.9IV r0 = (X.AnonymousClass9IV) r0
            java.lang.Object r0 = r0.A00
            goto L_0x0007
        L_0x0072:
            java.lang.Object r0 = r10.A01
            X.9IZ r0 = (X.AnonymousClass9IZ) r0
            java.lang.Object r0 = r0.A00
            X.9IV r0 = (X.AnonymousClass9IV) r0
            java.lang.Object r0 = r0.A01
            goto L_0x0007
        L_0x007d:
            java.lang.Object r1 = r10.A01
            X.HBO r1 = (X.HBO) r1
            java.lang.String r0 = ""
            r1.A0S(r0)
            goto L_0x000c
        L_0x0087:
            java.lang.Object r2 = r10.A01
            X.2YL r2 = (X.2YL) r2
            X.6oS r4 = X.C318116oQ.A00(r2)
            r1 = 0
            r0 = 23
            X.MG8 r3 = new X.MG8
            r3.<init>(r2, r1, r0)
            goto L_0x01f6
        L_0x0099:
            java.lang.Object r1 = r10.A01
            X.HBP r1 = (X.HBP) r1
            r0 = 0
            r1.A0S(r0)
            goto L_0x000c
        L_0x00a3:
            X.HNM r1 = X.HNM.NOTES_NUX
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            r1.A00(r0)
            goto L_0x000c
        L_0x00ae:
            java.lang.Object r0 = r10.A01
            X.Hiq r0 = (X.C55508Hiq) r0
            X.Gzz r2 = r0.A00
            X.0eM r0 = r2.A02
            java.lang.Object r1 = r0.getValue()
            X.Ody r1 = (X.C71144Ody) r1
            X.HOc r0 = X.C54671HOc.NUX_AUDIENCE_SELECT
            r1.A0A(r0)
            X.0eM r0 = r2.A04
            X.2YL r2 = X.DbS.A0H(r0)
            X.6oS r4 = X.C318116oQ.A00(r2)
            r1 = 0
            r0 = 40
            X.MGs r3 = new X.MGs
            r3.<init>(r2, r1, r0)
            goto L_0x01f6
        L_0x00d5:
            java.lang.Object r1 = r10.A01
            X.5Oz r1 = (X.C284945Oz) r1
            r0 = 0
            X.C51967G9n.A16(r1, r0)
            goto L_0x000c
        L_0x00df:
            java.lang.Object r0 = r10.A01
            X.Hiq r0 = (X.C55508Hiq) r0
            X.Gzz r0 = r0.A00
            X.0eM r0 = r0.A04
            java.lang.Object r3 = r0.getValue()
            X.MYL r3 = (X.MYL) r3
            X.JM9 r0 = r3.A0O()
            X.GqH r0 = (X.C53546GqH) r0
            X.4A5 r0 = r0.A03
            X.4A5 r2 = X.AnonymousClass4A5.PRIVATE
            if (r0 != r2) goto L_0x00fb
            X.4A5 r2 = X.AnonymousClass4A5.A01
        L_0x00fb:
            r1 = 4
            X.MPB r0 = new X.MPB
            r0.<init>((int) r1, (java.lang.Object) r2, (java.lang.Object) r3)
            r3.A0R(r0)
            goto L_0x000c
        L_0x0106:
            java.lang.Object r0 = r10.A01
            X.Hiq r0 = (X.C55508Hiq) r0
            X.Gzz r4 = r0.A00
            X.0eM r0 = r4.A02
            java.lang.Object r2 = r0.getValue()
            X.Ody r2 = (X.C71144Ody) r2
            X.4A5 r1 = X.AnonymousClass4A5.CLOSE_FRIENDS
            java.lang.String r0 = "AUDIENCE_MEMBER_LIST"
            X.C71144Ody.A04(r2, r1, r0)
            X.0eM r0 = r4.A01
            java.lang.Object r3 = r0.getValue()
            X.30l r3 = (X.C2355930l) r3
            X.Ki7 r2 = X.C62574Ki7.FRIEND_MAP_LAST_ACTIVE_LOCATION
            r1 = 1993(0x7c9, float:2.793E-42)
            r0 = 0
            r3.A00(r4, r2, r1, r0)
            goto L_0x000c
        L_0x012d:
            java.lang.Object r0 = r10.A01
            X.Hiq r0 = (X.C55508Hiq) r0
            X.4A5 r8 = X.AnonymousClass4A5.ALLOWLIST
            goto L_0x013a
        L_0x0134:
            java.lang.Object r0 = r10.A01
            X.Hiq r0 = (X.C55508Hiq) r0
            X.4A5 r8 = X.AnonymousClass4A5.BLOCKLIST
        L_0x013a:
            X.Gzz r3 = r0.A00
            X.0eM r0 = r3.A02
            java.lang.Object r1 = r0.getValue()
            X.Ody r1 = (X.C71144Ody) r1
            java.lang.String r0 = "AUDIENCE_MEMBER_LIST"
            X.C71144Ody.A04(r1, r8, r0)
            androidx.fragment.app.FragmentActivity r5 = r3.requireActivity()
            X.0eM r0 = r3.A03
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r0)
            r7 = 1
            X.MPB r2 = new X.MPB
            r2.<init>((int) r7, (java.lang.Object) r8, (java.lang.Object) r3)
            r6 = 0
            X.0qQ.A0B(r9, r7)
            X.4A5 r4 = X.AnonymousClass4A5.ALLOWLIST
            if (r8 == r4) goto L_0x0165
            X.4A5 r0 = X.AnonymousClass4A5.BLOCKLIST
            if (r8 != r0) goto L_0x000c
        L_0x0165:
            com.instagram.friendmap.view.fragment.FriendMapAudienceListFragment$CustomAudienceLaunchConfig r1 = new com.instagram.friendmap.view.fragment.FriendMapAudienceListFragment$CustomAudienceLaunchConfig
            r1.<init>()
            r1.A00 = r8
            r1.A01 = r2
            X.NIW r3 = new X.NIW
            r3.<init>()
            java.lang.String r0 = "friend_map_custom_audience_launch_config"
            android.os.Bundle r0 = X.DbY.A0B(r0, r1)
            X.C227642jf.A04(r0, r9)
            X.7Pr r2 = X.DbV.A0V(r0, r3, r9)
            r0 = 1064514355(0x3f733333, float:0.95)
            r2.A03 = r0
            r2.A19 = r7
            r2.A0y = r6
            r2.A1R = r7
            r2.A11 = r7
            r2.A1I = r7
            r2.A1G = r7
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2.A0e = r0
            r0 = 2131962771(0x7f132b93, float:1.9562277E38)
            if (r8 != r4) goto L_0x019f
            r0 = 2131962774(0x7f132b96, float:1.9562283E38)
        L_0x019f:
            java.lang.String r1 = r5.getString(r0)
            r0 = 2132018632(0x7f1405c8, float:1.9675576E38)
            r2.A0d = r1
            r2.A0D = r0
            r2.A0C = r7
            X.37D r0 = X.DbT.A0i(r5)
            X.7Pu r0 = X.C48943Emh.A00(r0)
            if (r0 == 0) goto L_0x01bb
            r0.A0F(r3, r2)
            goto L_0x000c
        L_0x01bb:
            X.DbU.A0y(r5, r3, r2)
            goto L_0x000c
        L_0x01c0:
            java.lang.Object r0 = r10.A01
            X.Hiq r0 = (X.C55508Hiq) r0
            X.Gzz r0 = r0.A00
            X.0eM r0 = r0.A04
            java.lang.Object r1 = r0.getValue()
            X.HBN r1 = (X.HBN) r1
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x01ec
            X.Ody r3 = r1.A02
            X.JM9 r0 = r1.A0O()
            X.GqH r0 = (X.C53546GqH) r0
            X.4A5 r4 = r0.A03
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.HOc r2 = X.C54671HOc.NUX_AUDIENCE_SELECT
            java.lang.String r7 = "NUX_AUDIENCE_SELECT"
            java.lang.String r8 = "TAP"
            r5 = 0
            r6 = r5
            r9 = r5
            X.C71144Ody.A01(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x01ec:
            X.6oS r4 = X.C318116oQ.A00(r1)
            r0 = 0
            X.MGb r3 = new X.MGb
            r3.<init>(r1, r0)
        L_0x01f6:
            X.AnonymousClass7TE.A1Z(r3, r4)
            goto L_0x000c
        L_0x01fb:
            java.lang.Object r1 = r10.A01
            X.MzK r1 = (X.C68053MzK) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            com.instagram.common.ui.base.IgSimpleImageView r3 = r1.A06
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            if (r2 == 0) goto L_0x034b
            X.MqP r1 = r1.A00
            if (r1 == 0) goto L_0x0215
            int r0 = r1.A02
            r2.width = r0
            int r0 = r1.A01
            r2.height = r0
        L_0x0215:
            r3.setLayoutParams(r2)
            goto L_0x000c
        L_0x021a:
            java.lang.Object r1 = r10.A01
            X.MzK r1 = (X.C68053MzK) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            com.instagram.direct.inbox.notes.ui.NoteBubbleView r3 = r1.A07
            goto L_0x025a
        L_0x0223:
            java.lang.Object r0 = r10.A01
            X.Tzf r0 = (X.C14633Tzf) r0
            r0.A05()
            goto L_0x000c
        L_0x022c:
            java.lang.Object r0 = r10.A01
            X.MqK r0 = (X.C67586MqK) r0
            r0.invalidateSelf()
            X.0sa r0 = r0.A0G
            goto L_0x0009
        L_0x0237:
            java.lang.Object r0 = r10.A01
            X.NQn r0 = (X.C68634NQn) r0
            r0.invalidateSelf()
            X.0sa r0 = r0.A0C
            goto L_0x0009
        L_0x0242:
            java.lang.Object r0 = r10.A01
            X.NQm r0 = (X.C68633NQm) r0
            r0.invalidateSelf()
            X.0sa r0 = r0.A04
            goto L_0x0009
        L_0x024d:
            java.lang.Object r0 = r10.A01
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r0.invalidateSelf()
            goto L_0x000c
        L_0x0256:
            java.lang.Object r3 = r10.A01
            com.instagram.direct.inbox.notes.ui.NoteBubbleView r3 = (com.instagram.direct.inbox.notes.ui.NoteBubbleView) r3
        L_0x025a:
            com.instagram.common.ui.base.IgTextView r0 = r3.getTextView()
            int r2 = r0.getLineCount()
            r1 = 0
            r0 = 0
            X.C319756rA.A03(r3, r1, r2, r0)
            goto L_0x000c
        L_0x0269:
            java.lang.Object r0 = r10.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "friend_map_custom_audience_launch_config"
            android.os.Parcelable r2 = r1.getParcelable(r0)
            if (r2 != 0) goto L_0x000e
            com.instagram.friendmap.view.fragment.FriendMapAudienceListFragment$CustomAudienceLaunchConfig r2 = new com.instagram.friendmap.view.fragment.FriendMapAudienceListFragment$CustomAudienceLaunchConfig
            r2.<init>()
            return r2
        L_0x027d:
            java.lang.Object r0 = r10.A01
            X.0Ud r0 = (X.AnonymousClass0Ud) r0
            java.lang.Object r2 = r0.getValue()
            return r2
        L_0x0286:
            java.lang.Object r0 = r10.A01
            X.Gtz r0 = (X.C53770Gtz) r0
            X.2uK r0 = r0.A00
            boolean r0 = r0.A0X()
            if (r0 == 0) goto L_0x0295
            X.4Lc r2 = X.AnonymousClass4Lc.SOUND_ON
            return r2
        L_0x0295:
            X.4Lc r2 = X.AnonymousClass4Lc.SOUND_OFF
            return r2
        L_0x0298:
            java.lang.Object r0 = r10.A01
            X.GxZ r0 = (X.C53991GxZ) r0
            com.instagram.common.session.UserSession r1 = r0.A01
            X.4DU r0 = r0.A02
            X.4Js r2 = new X.4Js
            r2.<init>(r0, r1)
            return r2
        L_0x02a6:
            java.lang.Object r0 = r10.A01
            X.GxZ r0 = (X.C53991GxZ) r0
            com.instagram.common.session.UserSession r0 = r0.A01
            X.4Jr r2 = new X.4Jr
            r2.<init>(r0)
            return r2
        L_0x02b2:
            java.lang.Object r0 = r10.A01
            X.1Xj r0 = (X.1Xj) r0
            if (r0 == 0) goto L_0x02c1
            java.util.List r0 = r0.A0S
            if (r0 == 0) goto L_0x02c1
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            return r2
        L_0x02c1:
            r2 = 0
            return r2
        L_0x02c3:
            java.lang.Object r0 = r10.A01
            X.Gu0 r0 = (X.C53771Gu0) r0
            com.instagram.common.session.UserSession r1 = r0.A01
            X.0iw r0 = r0.A00
            X.4Js r2 = new X.4Js
            r2.<init>(r0, r1)
            return r2
        L_0x02d1:
            java.lang.Object r0 = r10.A01
            X.Gu0 r0 = (X.C53771Gu0) r0
            com.instagram.common.session.UserSession r0 = r0.A01
            X.4Jr r2 = new X.4Jr
            r2.<init>(r0)
            return r2
        L_0x02dd:
            java.lang.Object r0 = r10.A01
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            X.3WB r0 = r0.A0l
            boolean r0 = r0.A00()
            java.lang.Boolean r2 = X.DbT.A0l(r0)
            return r2
        L_0x02ec:
            java.lang.Object r0 = r10.A01
            X.3Y5 r0 = (X.AnonymousClass3Y5) r0
            X.2V1 r0 = r0.A05
            android.content.Context r0 = r0.A0C
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
            goto L_0x0308
        L_0x02fb:
            java.lang.Object r0 = r10.A01
            X.GMF r0 = (X.GMF) r0
            android.content.Context r0 = r0.A0C
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165207(0x7f070017, float:1.7944625E38)
        L_0x0308:
            int r0 = r1.getDimensionPixelSize(r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            return r2
        L_0x0311:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.4nx r2 = X.AnonymousClass50b.A00(r0)
            return r2
        L_0x031a:
            java.lang.Object r1 = r10.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            r0 = 0
            X.Ody r2 = new X.Ody
            r2.<init>(r0, r1)
            return r2
        L_0x0325:
            java.lang.Object r0 = r10.A01
            X.KWm r0 = (X.C62034KWm) r0
            com.instagram.common.session.UserSession r1 = r0.A00
            X.1vn r0 = X.1vm.A01(r1)
            com.instagram.direct.inbox.notes.NotesApi r2 = new com.instagram.direct.inbox.notes.NotesApi
            r2.<init>(r1, r0)
            return r2
        L_0x0335:
            java.lang.Object r0 = r10.A01
            X.OZw r0 = (X.C71035OZw) r0
            com.instagram.common.session.UserSession r0 = r0.A01
            X.1Av r2 = X.1Au.A00(r0)
            return r2
        L_0x0340:
            r0 = 4187(0x105b, float:5.867E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x034b:
            r0 = 3
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58179Inj.invoke():java.lang.Object");
    }
}
