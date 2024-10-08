package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;
import java.io.File;

public final class WUT implements MTX {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ 28D A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ UpcomingEvent A04;

    public WUT(Activity activity, Fragment fragment, 28D r3, UserSession userSession, UpcomingEvent upcomingEvent) {
        this.A02 = r3;
        this.A04 = upcomingEvent;
        this.A03 = userSession;
        this.A00 = activity;
        this.A01 = fragment;
    }

    public final void Dob(File file) {
        28D r3 = this.A02;
        UpcomingEvent upcomingEvent = this.A04;
        11Z.A02(new C20347Wpm(this.A00, this.A01, r3, this.A03, upcomingEvent, file));
    }

    public final void onFailure(Exception exc) {
        11Z.A02(new C20064WkO(this.A00));
    }
}
