package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.upcomingevents.common.repository.UpcomingEventReminderRepository;
import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.ViN  reason: case insensitive filesystem */
public final class C17932ViN {
    public final FragmentActivity A00;
    public final AnonymousClass0xx A01;
    public final UserSession A02;
    public final C310306am A03;
    public final UpcomingEventReminderRepository A04;
    public final C310296al A05;
    public final AnonymousClass0eM A06 = AnonymousClass1YB.A00(new C20698WxU((Object) this, 32));
    public final AnonymousClass4DU A07;
    public final String A08;

    public C17932ViN(FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass4DU r6, String str) {
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A07 = r6;
        this.A08 = str;
        this.A01 = AnonymousClass07a.A00(fragmentActivity);
        this.A04 = new UpcomingEventReminderRepository(userSession, r6, (String) null);
        this.A03 = new C310306am(r6, userSession, (String) null);
        this.A05 = new C310296al(userSession);
    }

    public final void A00(UpcomingEvent upcomingEvent, String str) {
        C63468KxX.A00();
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A02;
        AnonymousClass4DU r4 = this.A07;
        String str2 = this.A08;
        AnonymousClass7TG.A1O(userSession, r4);
        new C18003Vjf(fragmentActivity, userSession, r4, (String) null, str2).A01(upcomingEvent.getId()).A00();
        this.A03.A04(upcomingEvent, str, "upcoming_event_view_in_upcoming_events_tap", "clips_reminder_ad_cta_bar_view_in_upcoming_events");
    }
}
