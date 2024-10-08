package X;

import com.instagram.avatars.graphql.AvatarStickerGraphQLRepository;
import com.instagram.avatars.store.AvatarStore;
import com.instagram.common.session.UserSession;

/* renamed from: X.6i2  reason: invalid class name and case insensitive filesystem */
public final class C314336i2 extends 2YL {
    public final C317946o6 A00;
    public final C317936o5 A01;
    public final C314856ix A02;
    public final AvatarStickerGraphQLRepository A03;
    public final AvatarStore A04;
    public final UserSession A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;
    public final 05G A0A = 106.A01((Object) null);

    public final void A01() {
        C317936o5 r1 = this.A01;
        if (C314866iy.A00(r1.A02) && C317936o5.A01(r1.A01) && !r1.A00.A00.A00.getBoolean("key_has_interacted_with_style_2", false)) {
            C318136oS A002 = C318116oQ.A00(this);
            1Eo.A05(19B.A00, new JV6((Object) this, (AnonymousClass4D7) null, 9, false), A002);
        }
    }

    public final void A03(EWK ewk, String str) {
        Integer num;
        0qQ.A0B(str, 1);
        if (ewk == EWK.AUTO_MIGRATION) {
            0xY AR4 = this.A00.A00.A00.AR4();
            AR4.E5T("key_has_seen_any_avatar_convergence_auto_migration_upsell", true);
            AR4.apply();
        } else if (ewk == EWK.LAUNCH) {
            0xY AR42 = this.A00.A00.A00.AR4();
            AR42.E5T("key_has_seen_avatar_convergence_banner", true);
            AR42.apply();
            A00();
        }
        A01();
        C314856ix r2 = this.A02;
        if (ewk == EWK.LAUNCH) {
            num = AnonymousClass05K.A00;
        } else {
            num = AnonymousClass05K.A01;
        }
        r2.A01(num, str, "mux_banner", true);
    }

    public final void A04(String str) {
        Integer num;
        String str2 = str;
        0qQ.A0B(str, 0);
        C314856ix r2 = this.A02;
        if (this.A07.getValue() == EV5.LAUNCH) {
            num = AnonymousClass05K.A00;
        } else {
            num = AnonymousClass05K.A01;
        }
        r2.A00(num, AnonymousClass05K.A00, str2, "mux_banner", true);
    }

    public final void A05(String str) {
        Integer num;
        String str2 = str;
        0qQ.A0B(str, 0);
        C314856ix r2 = this.A02;
        if (this.A07.getValue() == EV5.LAUNCH) {
            num = AnonymousClass05K.A00;
        } else {
            num = AnonymousClass05K.A01;
        }
        r2.A00(num, AnonymousClass05K.A01, str2, "mux_banner", true);
    }

    public /* synthetic */ C314336i2(UserSession userSession) {
        C317936o5 r5 = new C317936o5(userSession);
        AvatarStickerGraphQLRepository avatarStickerGraphQLRepository = new AvatarStickerGraphQLRepository(userSession);
        C317946o6 r3 = new C317946o6(26G.A00(userSession));
        AvatarStore A002 = 25x.A00(userSession);
        C314856ix r1 = new C314856ix(userSession);
        0qQ.A0B(userSession, 1);
        0qQ.A0B(A002, 5);
        this.A05 = userSession;
        this.A01 = r5;
        this.A03 = avatarStickerGraphQLRepository;
        this.A00 = r3;
        this.A04 = A002;
        this.A02 = r1;
        0eO r2 = 0eO.A02;
        this.A08 = AnonymousClass0eN.A00(r2, new C377199Kx(this, 35));
        this.A09 = AnonymousClass0eN.A00(r2, new C377199Kx(this, 36));
        this.A06 = AnonymousClass0eN.A00(r2, new C377199Kx(this, 33));
        this.A07 = AnonymousClass0eN.A00(r2, new C377199Kx(this, 34));
    }

    public final void A00() {
        0xa r6 = this.A00.A00.A00;
        0xY AR4 = r6.AR4();
        AR4.E5Z("key_avatar_convergence_launch_upsells_view_count", r6.getInt("key_avatar_convergence_launch_upsells_view_count", 0) + 1);
        AR4.apply();
        if (r6.getInt("key_avatar_convergence_launch_upsells_view_count", 0) == 2) {
            long currentTimeMillis = System.currentTimeMillis();
            0xY AR42 = r6.AR4();
            AR42.E5c("key_last_avatar_convergence_launch_upsells_limit_reached_timestamp", currentTimeMillis);
            AR42.apply();
            0xY AR43 = r6.AR4();
            AR43.E5Z("key_avatar_convergence_launch_upsells_view_count", 0);
            AR43.apply();
        }
    }

    public final void A02(C317846nw r5) {
        this.A0A.Epw(DxP.A00);
        C318136oS A002 = C318116oQ.A00(this);
        1Eo.A05(19B.A00, new MHD((Object) r5, (Object) this, (AnonymousClass4D7) null, 48), A002);
    }

    public final boolean A06() {
        return 0qQ.A0K(this.A04.A01.A00, C299715vi.A00);
    }

    public final boolean A07() {
        C317936o5 r2 = this.A01;
        AvatarStore avatarStore = r2.A01;
        if (!C317936o5.A02(avatarStore) || !C317936o5.A01(avatarStore) || !C314866iy.A00(r2.A02)) {
            return false;
        }
        return true;
    }

    public final boolean A08() {
        C317936o5 r4 = this.A01;
        if (!C317936o5.A02(r4.A01)) {
            UserSession userSession = r4.A02;
            if (!C314866iy.A00(userSession) && !r4.A00.A00.A00.getBoolean("key_has_seen_avatar_convergence_snack_bar_in_aqr", false) && !C317936o5.A00(r4)) {
                0qQ.A0B(userSession, 0);
                if (!182.A06(0Tu.A05, userSession, 36325351626519450L)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
