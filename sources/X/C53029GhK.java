package X;

import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.user.model.User;
import com.instagram.wonderwall.model.WallInfo;
import com.instagram.wonderwall.repository.WallPostComposerRepository;

/* renamed from: X.GhK  reason: case insensitive filesystem */
public final class C53029GhK extends 2YL {
    public AudioOverlayTrack A00;
    public final UserSession A01;
    public final WallInfo A02;
    public final WallPostComposerRepository A03;
    public final C249513ju A04;
    public final AnonymousClass0r6 A05;
    public final 05G A06;
    public final AnonymousClass0Ud A07;
    public final boolean A08;

    public static final void A00(JMM jmm, C53029GhK ghK) {
        ghK.A02(false);
        C51975G9x.A1E(jmm, ghK, C318116oQ.A00(ghK), 24);
    }

    public C53029GhK(UserSession userSession, WallInfo wallInfo, WallPostComposerRepository wallPostComposerRepository, boolean z) {
        Object value;
        AnonymousClass62P A002;
        boolean z2;
        User user;
        C285975Tl r12;
        YBO ybo;
        boolean z3;
        String str;
        boolean z4;
        String str2;
        boolean z5;
        C55817Hnx hnx;
        boolean z6;
        this.A02 = wallInfo;
        UserSession userSession2 = userSession;
        this.A01 = userSession2;
        this.A08 = z;
        this.A03 = wallPostComposerRepository;
        02z A10 = DbS.A10(new C53321Gm7(C51967G9n.A0L(""), AnonymousClass7TF.A0Q(userSession2), (C55817Hnx) null, (YBO) null, "0/60", (String) null, AnonymousClass62M.A01, false, false, false, true, true));
        this.A06 = A10;
        this.A07 = A10;
        1HR A0w = G9w.A0w();
        this.A04 = A0w;
        this.A05 = 0u9.A04(A0w);
        05G r10 = this.A06;
        do {
            value = r10.getValue();
            C53321Gm7 gm7 = (C53321Gm7) value;
            C61065Jw3 jw3 = new C61065Jw3((Object) C58686Ivv.A00(this, 10), 2131969399, (int) R.drawable.instagram_photo_pano_outline_24, 15);
            UserSession userSession3 = this.A01;
            0Tu r3 = 0Tu.A05;
            if (!182.A06(r3, userSession3, 36322353738754135L) && !182.A06(r3, userSession3, 36322353738819672L)) {
                jw3 = null;
            }
            A002 = AnonymousClass62Q.A00(C51967G9n.A0s(new C61065Jw3[]{jw3, !182.A06(r3, userSession3, 36322353738885209L) ? null : new C61065Jw3((Object) C58686Ivv.A00(this, 11), 2131953269, (int) R.drawable.instagram_music_add_pano_outline_24, 15), !182.A06(r3, userSession3, 36322353738950746L) ? null : new C61065Jw3((Object) C58686Ivv.A00(this, 12), 2131953269, (int) R.drawable.instagram_gif_pano_outline_24, 15)}));
            z2 = !this.A08;
            user = gm7.A01;
            r12 = gm7.A00;
            ybo = gm7.A03;
            z3 = gm7.A07;
            str = gm7.A04;
            z4 = gm7.A0B;
            str2 = gm7.A05;
            z5 = gm7.A0A;
            hnx = gm7.A02;
            z6 = gm7.A08;
            0qQ.A0B(user, 0);
            0qQ.A0B(r12, 1);
            DbW.A1N(A002, 3, str);
        } while (!r10.AIY(value, new C53321Gm7(r12, user, hnx, ybo, str, str2, A002, z3, z4, z5, z2, z6)));
        WallPostComposerRepository wallPostComposerRepository2 = this.A03;
        DbY.A19(this, C58103ImP.A01(this, (AnonymousClass4D7) null, 14), AnonymousClass10H.A03(new C52574GXz(this, 2), wallPostComposerRepository2.A09, wallPostComposerRepository2.A08));
        C58106ImS.A03(this, C318116oQ.A00(this), 14);
    }

    public final void A01() {
        Object value;
        User user;
        C285975Tl r3;
        YBO ybo;
        AnonymousClass62P r9;
        boolean z;
        String str;
        boolean z2;
        String str2;
        boolean z3;
        C55817Hnx hnx;
        boolean z4;
        05G r1 = this.A06;
        do {
            value = r1.getValue();
            C53321Gm7 gm7 = (C53321Gm7) value;
            user = gm7.A01;
            r3 = gm7.A00;
            ybo = gm7.A03;
            r9 = gm7.A06;
            z = gm7.A07;
            str = gm7.A04;
            z2 = gm7.A0B;
            str2 = gm7.A05;
            z3 = gm7.A09;
            hnx = gm7.A02;
            z4 = gm7.A08;
            0qQ.A0B(user, 0);
            AnonymousClass7TG.A1P(r3, r9);
            0qQ.A0B(str, 5);
        } while (!r1.AIY(value, new C53321Gm7(r3, user, hnx, ybo, str, str2, r9, z, z2, false, z3, z4)));
    }

    public final void A02(boolean z) {
        Object value;
        User user;
        C285975Tl r4;
        YBO ybo;
        AnonymousClass62P r10;
        boolean z2;
        String str;
        boolean z3;
        String str2;
        boolean z4;
        C55817Hnx hnx;
        boolean z5;
        05G r1 = this.A06;
        do {
            value = r1.getValue();
            C53321Gm7 gm7 = (C53321Gm7) value;
            user = gm7.A01;
            r4 = gm7.A00;
            ybo = gm7.A03;
            r10 = gm7.A06;
            z2 = gm7.A07;
            str = gm7.A04;
            z3 = gm7.A0B;
            str2 = gm7.A05;
            z4 = gm7.A0A;
            hnx = gm7.A02;
            z5 = gm7.A08;
            C51974G9v.A1K(user, r4, r10);
            0qQ.A0B(str, 5);
        } while (!r1.AIY(value, new C53321Gm7(r4, user, hnx, ybo, str, str2, r10, z2, z3, z4, z, z5)));
    }
}
