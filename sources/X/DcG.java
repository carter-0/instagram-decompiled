package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.api.schemas.ProfileBannerType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class DcG implements AnonymousClass73N {
    public String A00 = ProfileBannerType.CHANNEL.A00;
    public String A01;
    public String A02;
    public String A03;
    public final Context A04;
    public final C2609247o A05;
    public final AnonymousClass0iw A06;
    public final UserSession A07;
    public final C3249370k A08;
    public final User A09;

    public DcG(Context context, C2609247o r5, AnonymousClass0iw r6, UserSession userSession, C3249370k r8, User user) {
        0qQ.A0B(r5, 4);
        this.A04 = context;
        this.A07 = userSession;
        this.A09 = user;
        this.A05 = r5;
        this.A08 = r8;
        this.A06 = r6;
        this.A01 = r5.C6E();
        this.A03 = r5.getTitle();
        this.A02 = C66637Ma6.A01(AnonymousClass7TF.A0A(context), r5.BXU(), false);
    }

    public final void DJi() {
    }

    public final /* synthetic */ void DdK() {
    }

    public final String AZm() {
        return this.A00;
    }

    public final long B2g() {
        return 0;
    }

    public final boolean BDG() {
        return false;
    }

    public final Drawable BEC() {
        return null;
    }

    public final String BGa() {
        return "impression_channel_banner";
    }

    public final boolean Bvq() {
        return false;
    }

    public final boolean CCY() {
        return false;
    }

    public final void D25(boolean z) {
        this.A08.D1Q(this.A05, this.A06, "user_profile_header");
    }

    public final String getId() {
        return this.A01;
    }

    public final String getSubtitle() {
        return this.A02;
    }

    public final String getTitle() {
        return this.A03;
    }

    public final int BEF() {
        return R.drawable.instagram_channels_pano_outline_24;
    }
}
