package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;

public final class LXS implements View.OnClickListener {
    public final /* synthetic */ C310306am A00;
    public final /* synthetic */ UpcomingEvent A01;
    public final /* synthetic */ C63820L8b A02;

    public LXS(C310306am r1, UpcomingEvent upcomingEvent, C63820L8b l8b) {
        this.A02 = l8b;
        this.A01 = upcomingEvent;
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1236278248);
        C63820L8b l8b = this.A02;
        AnonymousClass4DH r3 = l8b.A00;
        FragmentActivity requireActivity = r3.requireActivity();
        UserSession userSession = l8b.A01;
        UpcomingEvent upcomingEvent = this.A01;
        C18382Vqi.A00(requireActivity, r3, (28D) null, userSession, upcomingEvent);
        this.A00.A04(upcomingEvent, C18810W3l.A04(upcomingEvent), "share_as_story", C273654mx.A00(898));
        AnonymousClass0fD.A0C(100161250, A05);
    }
}
