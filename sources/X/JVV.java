package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.api.schemas.ProfileBannerType;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.user.model.User;

public final class JVV implements AnonymousClass73N {
    public int A00;
    public int A01;
    public Drawable A02;
    public String A03 = ProfileBannerType.MUSIC.A00;
    public String A04;
    public String A05;
    public String A06;
    public final Context A07;
    public final AnonymousClass8ZI A08;
    public final User A09;
    public final AnonymousClass0iw A0A;
    public final UserSession A0B;
    public final JVM A0C;
    public final C234502xy A0D;
    public final C3248870f A0E;

    public final /* synthetic */ void DdK() {
    }

    public final String AZm() {
        return this.A03;
    }

    public final long B2g() {
        return 0;
    }

    public final boolean BDG() {
        return false;
    }

    public final Drawable BEC() {
        return this.A02;
    }

    public final String BGa() {
        return "impression_music_banner";
    }

    public final boolean Bvq() {
        return false;
    }

    public final boolean CCY() {
        return false;
    }

    public final void D25(boolean z) {
        this.A0E.DSi(this.A0C.A02);
    }

    public final void DJi() {
        long parseLong;
        C54689HOu hOu;
        Long A0h;
        0wc A012;
        int i;
        UserSession userSession = this.A0B;
        AnonymousClass0iw r7 = this.A0A;
        C234502xy r3 = this.A0D;
        JVX A013 = JVW.A01(this.A0C.A02);
        if (r3.isPlaying()) {
            if (r3.isPlaying()) {
                r3.pause();
            }
            parseLong = Long.parseLong(A013.getAudioClusterId());
            hOu = C54689HOu.A0s;
            A0h = C51972G9s.A0h(this.A09);
            A012 = AnonymousClass0kN.A01(r7, userSession);
            i = 3374;
        } else {
            r3.seekTo(this.A01);
            r3.E2p();
            parseLong = Long.parseLong(A013.getAudioClusterId());
            hOu = C54689HOu.A0s;
            A0h = C51972G9s.A0h(this.A09);
            A012 = AnonymousClass0kN.A01(r7, userSession);
            i = 3375;
        }
        0Aj A0e = AnonymousClass7TE.A0e(A012, AnonymousClass000.A00(i));
        if (A0e.isSampled()) {
            DbW.A16(A0e, r7);
            A0e.A9F("container_id", Long.valueOf(parseLong));
            G9t.A1G(A0e);
            A0e.A8M(hOu, "action_source");
            A0e.A9F("profile_user_ig_id", A0h);
            A0e.Cgf();
        }
    }

    public final String getId() {
        return this.A04;
    }

    public final String getSubtitle() {
        return this.A05;
    }

    public final String getTitle() {
        return this.A06;
    }

    public JVV(Context context, AnonymousClass0iw r16, UserSession userSession, JVM jvm, C234502xy r19, C3248870f r20, User user) {
        this.A07 = context;
        this.A0B = userSession;
        this.A0A = r16;
        this.A09 = user;
        C234502xy r5 = r19;
        this.A0D = r5;
        JVM jvm2 = jvm;
        this.A0C = jvm2;
        this.A0E = r20;
        int color = context.getColor(2Yu.A0B(context));
        AnonymousClass8ZG r2 = new AnonymousClass8ZG(context);
        r2.A04 = JTP.A0k(context.getResources(), R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        r2.A06 = DbV.A0n(context, 2Yu.A0B(context));
        r2.A0C = DbV.A0n(context, 2Yu.A04(context));
        r2.A08 = Integer.valueOf(color);
        r2.A09 = JTP.A0k(context.getResources(), R.dimen.account_group_management_clickable_width);
        r2.A0B = Integer.valueOf(AnonymousClass7TG.A03(context));
        r2.A0A = 0;
        r2.A02(context.getResources().getDimensionPixelSize(R.dimen.achievements_only_you_top_margin));
        r2.A01(color);
        AnonymousClass8ZI A002 = r2.A00();
        this.A08 = A002;
        MusicAssetModel musicAssetModel = jvm2.A02;
        String str = musicAssetModel.A0E;
        0qQ.A07(str);
        this.A04 = str;
        this.A02 = A002;
        String str2 = musicAssetModel.A0I;
        0qQ.A07(str2);
        this.A06 = str2;
        this.A05 = musicAssetModel.A0D;
        this.A01 = jvm2.A01;
        int i = jvm2.A00;
        int i2 = musicAssetModel.A00;
        this.A00 = i > i2 ? i2 : i;
        r5.ETw(JVW.A01(musicAssetModel).BUq(), new C61988KUl(r5, this), jvm2.A03, 0, -1, -1, false, false);
        if (r5.isPlaying()) {
            A002.A01(AnonymousClass8ZH.STOP);
            A002.A00(((float) (r5.getCurrentPositionMs() - this.A01)) / ((float) this.A00));
        }
    }

    public final int BEF() {
        return R.drawable.instagram_music_pano_outline_24;
    }
}
