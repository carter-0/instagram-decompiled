package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.api.schemas.ProfileBannerType;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.user.model.User;

public final class LvQ implements AnonymousClass73N {
    public Drawable A00;
    public String A01 = ProfileBannerType.MUSIC.A00;
    public String A02;
    public String A03;
    public String A04;
    public final Context A05;
    public final AnonymousClass0iw A06;
    public final UserSession A07;
    public final JVM A08;
    public final AnonymousClass8ZI A09;
    public final C3248870f A0A;
    public final User A0B;

    public final void D25(boolean z) {
    }

    public final void DJi() {
    }

    public final /* synthetic */ void DdK() {
    }

    public final String AZm() {
        return this.A01;
    }

    public final long B2g() {
        return 0;
    }

    public final boolean BDG() {
        return false;
    }

    public final Drawable BEC() {
        return this.A00;
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

    public final String getId() {
        return this.A02;
    }

    public final String getSubtitle() {
        return this.A03;
    }

    public final String getTitle() {
        return this.A04;
    }

    public LvQ(Context context, AnonymousClass0iw r6, UserSession userSession, JVM jvm, C3248870f r9, User user) {
        this.A05 = context;
        this.A07 = userSession;
        this.A06 = r6;
        this.A0B = user;
        this.A08 = jvm;
        this.A0A = r9;
        int color = context.getColor(2Yu.A0B(context));
        AnonymousClass8ZG r2 = new AnonymousClass8ZG(context);
        r2.A04 = JTP.A0k(context.getResources(), R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        r2.A09 = JTP.A0k(context.getResources(), R.dimen.account_group_management_clickable_width);
        r2.A0B = Integer.valueOf(AnonymousClass7TG.A03(context));
        r2.A0A = C51967G9n.A0k();
        r2.A08 = Integer.valueOf(color);
        r2.A02(context.getResources().getDimensionPixelSize(R.dimen.achievements_only_you_top_margin));
        r2.A01(color);
        AnonymousClass8ZI A002 = r2.A00();
        this.A09 = A002;
        MusicAssetModel musicAssetModel = jvm.A02;
        String str = musicAssetModel.A0E;
        0qQ.A07(str);
        this.A02 = str;
        this.A00 = A002;
        String str2 = musicAssetModel.A0I;
        0qQ.A07(str2);
        this.A04 = str2;
        this.A03 = musicAssetModel.A0D;
    }

    public final int BEF() {
        return R.drawable.instagram_music_pano_outline_24;
    }
}
