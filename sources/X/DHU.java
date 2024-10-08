package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.api.schemas.ProfileBannerType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class DHU implements AnonymousClass73N {
    public long A00;
    public String A01 = ProfileBannerType.FUNDRAISER.A00;
    public String A02;
    public String A03;
    public String A04;
    public final Context A05;
    public final C46322DUz A06;
    public final UserSession A07;
    public final C3249570m A08;
    public final User A09;

    public DHU(Context context, C46322DUz dUz, UserSession userSession, C3249570m r6, User user) {
        0qQ.A0B(dUz, 4);
        this.A05 = context;
        this.A07 = userSession;
        this.A09 = user;
        this.A06 = dUz;
        this.A08 = r6;
        this.A02 = dUz.getFundraiserId();
        this.A04 = dUz.getFundraiserTitle();
        String formattedFundraiserProgressInfoText = dUz.getFormattedFundraiserProgressInfoText();
        0qQ.A0B(formattedFundraiserProgressInfoText, 0);
        this.A03 = formattedFundraiserProgressInfoText;
        this.A00 = dUz.getEndTime();
    }

    public final void DJi() {
    }

    public final /* synthetic */ void DdK() {
    }

    public final String AZm() {
        return this.A01;
    }

    public final long B2g() {
        return this.A00;
    }

    public final boolean BDG() {
        return false;
    }

    public final Drawable BEC() {
        return null;
    }

    public final String BGa() {
        return "impression_fundraiser_banner";
    }

    public final boolean Bvq() {
        return false;
    }

    public final boolean CCY() {
        return false;
    }

    public final void D25(boolean z) {
        C3249570m r4 = this.A08;
        C46322DUz dUz = this.A06;
        r4.DHI(dUz.getFundraiserId(), dUz.getOwnerUsername(), dUz.getCanViewerDonate(), C273654mx.A00(114));
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

    public final int BEF() {
        return R.drawable.instagram_donations_outline_16;
    }
}
