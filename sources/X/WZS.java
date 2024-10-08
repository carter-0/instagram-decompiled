package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.api.schemas.ProfileBannerType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;

public final class WZS implements AnonymousClass73N {
    public long A00;
    public String A01 = ProfileBannerType.UPCOMING_EVENTS.A00;
    public String A02;
    public String A03;
    public String A04;
    public final Context A05;
    public final UserSession A06;
    public final C3249870p A07;
    public final UpcomingEvent A08;
    public final User A09;

    public WZS(Context context, UserSession userSession, C3249870p r5, UpcomingEvent upcomingEvent, User user) {
        long startTime;
        0qQ.A0B(upcomingEvent, 4);
        this.A05 = context;
        this.A06 = userSession;
        this.A09 = user;
        this.A08 = upcomingEvent;
        this.A07 = r5;
        this.A02 = upcomingEvent.getId();
        this.A04 = upcomingEvent.getTitle();
        this.A03 = C17116VIm.A00(userSession, C61410nE.A00, upcomingEvent).A00(context, Uy1.A0C);
        Long B1d = upcomingEvent.B1d();
        if (B1d != null) {
            startTime = B1d.longValue();
        } else {
            startTime = upcomingEvent.getStartTime();
        }
        this.A00 = startTime;
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
        return "impression_upcoming_event_banner";
    }

    public final boolean Bvq() {
        return false;
    }

    public final boolean CCY() {
        return false;
    }

    public final void D25(boolean z) {
        this.A07.DvH(this.A08, this.A09);
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
        return R.drawable.instagram_calendar_pano_outline_16;
    }
}
