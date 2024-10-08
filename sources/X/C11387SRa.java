package X;

import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.SRa  reason: case insensitive filesystem */
public final class C11387SRa {
    public boolean A00;
    public final UserSession A01;
    public final ShareType A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public C11387SRa(UserSession userSession, ShareType shareType, boolean z, boolean z2, boolean z3, boolean z4) {
        0qQ.A0B(shareType, 2);
        this.A01 = userSession;
        this.A02 = shareType;
        this.A06 = z;
        this.A05 = z2;
        this.A04 = z3;
        this.A03 = z4;
    }

    public static final boolean A02(C11387SRa sRa, ShareType shareType, int i) {
        UserSession userSession;
        0Tu r2;
        long j;
        if (i <= 0) {
            return false;
        }
        if (shareType == ShareType.CLIPS) {
            if (i < 480) {
                userSession = sRa.A01;
                r2 = 0Tu.A05;
                j = 36328705995718186L;
            } else if (i < 720) {
                userSession = sRa.A01;
                r2 = 0Tu.A05;
                j = 36328705995783723L;
            } else if (i >= 1080) {
                return false;
            } else {
                userSession = sRa.A01;
                r2 = 0Tu.A05;
                j = 36328705995587112L;
            }
        } else if (shareType != ShareType.REEL_SHARE && (shareType != ShareType.REEL_SHARE_AND_DIRECT_STORY_SHARE || !sRa.A03)) {
            return false;
        } else {
            if (i < 480) {
                userSession = sRa.A01;
                r2 = 0Tu.A05;
                j = 36328705995521575L;
            } else if (i < 720) {
                userSession = sRa.A01;
                r2 = 0Tu.A05;
                j = 36328705995652649L;
            } else if (i >= 1080) {
                return false;
            } else {
                userSession = sRa.A01;
                r2 = 0Tu.A05;
                j = 36328705995849260L;
            }
        }
        return 182.A06(r2, userSession, j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r2 == 4) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.SJC r5) {
        /*
            r4 = this;
            r0 = 0
            X.0qQ.A0B(r5, r0)
            r4.A00()
            boolean r0 = r4.A00()
            if (r0 == 0) goto L_0x0036
            X.SOn r3 = r5.A02
            if (r3 == 0) goto L_0x0031
            boolean r0 = r4.A01()
            if (r0 == 0) goto L_0x0031
            com.instagram.pendingmedia.model.constants.ShareType r1 = r4.A02
            X.Kpm r0 = X.C62996Kpm.$redex_init_class
            int r2 = r1.ordinal()
            r0 = 9
            if (r2 == r0) goto L_0x0032
            r0 = 2
            if (r2 == r0) goto L_0x002a
            r1 = 4
            r0 = -1
            if (r2 != r1) goto L_0x002d
        L_0x002a:
            r0 = 5000000(0x4c4b40, float:7.006492E-39)
        L_0x002d:
            r3.A01 = r0
            r3.A04 = r0
        L_0x0031:
            return
        L_0x0032:
            r0 = 6000000(0x5b8d80, float:8.407791E-39)
            goto L_0x002d
        L_0x0036:
            boolean r0 = r4.A04()
            if (r0 == 0) goto L_0x0031
            com.instagram.pendingmedia.model.constants.ShareType r1 = r4.A02
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.REEL_SHARE_AND_DIRECT_STORY_SHARE
            if (r1 == r0) goto L_0x0031
            X.SOn r3 = r5.A02
            if (r3 == 0) goto L_0x004a
            r0 = 9000000(0x895440, float:1.2611686E-38)
            goto L_0x002d
        L_0x004a:
            java.lang.String r1 = "ig_media_transcode_param"
            java.lang.String r0 = "null transcode param"
            X.0wb.A03(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11387SRa.A03(X.SJC):void");
    }

    public final boolean A09(AnonymousClass3Q2 r5) {
        UserSession userSession = this.A01;
        String A032 = C59906JbV.A03(userSession, r5, (ShareType) null, true);
        if (0qQ.A0K(A032, "direct_permanent") || 0qQ.A0K(A032, "direct_ephemeral")) {
            return 182.A06(0Tu.A05, userSession, 36320558442488436L);
        }
        return false;
    }

    public final boolean A04() {
        boolean z = this.A06;
        if (z) {
            UserSession userSession = this.A01;
            if (182.A06(0Tu.A05, userSession, 36320274974515348L)) {
                return 1Au.A00(userSession).A1z();
            }
        }
        UserSession userSession2 = this.A01;
        if (z) {
            0xY A0N = AnonymousClass7TF.A0N(userSession2);
            A0N.E5Z(AnonymousClass000.A00(296), 0);
            A0N.apply();
            return false;
        } else if (!1Au.A00(userSession2).A1z()) {
            return false;
        } else {
            ShareType shareType = this.A02;
            C62996Kpm kpm = C62996Kpm.$redex_init_class;
            switch (shareType.ordinal()) {
                case 0:
                case 2:
                case 7:
                case 9:
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    return true;
                case 4:
                    if (!this.A03 || !182.A06(0Tu.A05, userSession2, 36316108856627151L)) {
                        return false;
                    }
                    return true;
                default:
                    return false;
            }
        }
    }

    public final boolean A06() {
        0tS A002 = 0tS.A4E.A00();
        if (!AnonymousClass7TG.A1a(A002, A002.A0v, 0tS.A4G, 180) && (!A04() || this.A02 == ShareType.REEL_SHARE_AND_DIRECT_STORY_SHARE)) {
            if (!A00() || !A01()) {
                return false;
            }
            ShareType shareType = this.A02;
            C62996Kpm kpm = C62996Kpm.$redex_init_class;
            if (shareType.ordinal() != 9) {
                return false;
            }
        }
        return true;
    }

    public final boolean A07() {
        UserSession userSession;
        0Tu r2;
        long j;
        ShareType shareType = this.A02;
        C62996Kpm kpm = C62996Kpm.$redex_init_class;
        int ordinal = shareType.ordinal();
        if (ordinal == 1 || ordinal == 3) {
            userSession = this.A01;
            r2 = 0Tu.A05;
            j = 36320558442422899L;
        } else {
            userSession = this.A01;
            r2 = 0Tu.A05;
            j = 36320558442357362L;
        }
        return 182.A06(r2, userSession, j);
    }

    private final boolean A00() {
        if (!A04() && !A08()) {
            int A012 = (int) 1Bh.A00().A01();
            if (A012 < 0) {
                0wb.A03("download_bw_reading_err", 002.A0O("value ", A012));
            } else {
                ShareType shareType = this.A02;
                C62996Kpm kpm = C62996Kpm.$redex_init_class;
                if (shareType.ordinal() == 9) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        if (r2 == 4) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A01() {
        /*
            r4 = this;
            X.1Bh r0 = X.1Bh.A00()
            double r0 = r0.A01()
            int r3 = (int) r0
            com.instagram.pendingmedia.model.constants.ShareType r1 = r4.A02
            X.Kpm r0 = X.C62996Kpm.$redex_init_class
            int r2 = r1.ordinal()
            r0 = 9
            if (r2 == r0) goto L_0x001e
            r0 = 2
            if (r2 == r0) goto L_0x001e
            r1 = 4
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r1) goto L_0x0020
        L_0x001e:
            r0 = 1250(0x4e2, float:1.752E-42)
        L_0x0020:
            boolean r0 = X.JTQ.A1P(r3, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11387SRa.A01():boolean");
    }

    public final boolean A05() {
        UserSession userSession;
        0Tu r2;
        long j;
        if (!A04()) {
            return false;
        }
        ShareType shareType = this.A02;
        C62996Kpm kpm = C62996Kpm.$redex_init_class;
        int ordinal = shareType.ordinal();
        if (ordinal == 9) {
            if (this.A00) {
                if (shareType != ShareType.CLIPS || !A04()) {
                    return false;
                }
                if (!182.A06(0Tu.A05, this.A01, 36328705995324964L)) {
                    return false;
                }
            }
            userSession = this.A01;
            r2 = 0Tu.A05;
            j = 36316108856561614L;
        } else if (ordinal != 4) {
            return false;
        } else {
            userSession = this.A01;
            r2 = 0Tu.A05;
            j = 36316108856627151L;
        }
        if (182.A06(r2, userSession, j)) {
            return true;
        }
        return false;
    }

    public final boolean A08() {
        if (A04() && !A05()) {
            A05();
        } else if (!this.A05) {
            if (!this.A06) {
                ShareType shareType = this.A02;
                C62996Kpm kpm = C62996Kpm.$redex_init_class;
                int ordinal = shareType.ordinal();
                if (ordinal == 9 || ordinal == 2 || ordinal == 4 || ordinal == 1 || ordinal == 3 || this.A04) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }
}
