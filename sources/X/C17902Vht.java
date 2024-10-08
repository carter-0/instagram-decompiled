package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.upcomingevents.common.repository.UpcomingEventReminderRepository;
import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.Vht  reason: case insensitive filesystem */
public final class C17902Vht {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;
    public final String A03;
    public final C262224Cq A04;
    public final Context A05;

    public final void A00(1Xj r18, X79 x79, UpcomingEventReminderRepository upcomingEventReminderRepository, UpcomingEvent upcomingEvent) {
        C69634NpG npG;
        GKO gko;
        0sP ixb;
        UpcomingEventReminderRepository upcomingEventReminderRepository2 = upcomingEventReminderRepository;
        0qQ.A0B(upcomingEventReminderRepository2, 3);
        String str = this.A03;
        1Xj r9 = r18;
        UpcomingEvent upcomingEvent2 = upcomingEvent;
        if (0qQ.A0K(str, C273654mx.A00(975)) && upcomingEvent2.getReminderEnabled()) {
            gko = new GKO(new Object[0], 2131952148);
            C63468KxX.A00();
            FragmentActivity fragmentActivity = this.A00;
            UserSession userSession = this.A01;
            AnonymousClass4DU r14 = this.A02;
            AnonymousClass7TG.A1O(userSession, r14);
            ixb = new MP8(new C18003Vjf(fragmentActivity, userSession, r14, str, (String) null).A01(upcomingEvent2.getId()), 27);
        } else if (upcomingEvent2.getReminderEnabled()) {
            gko = new GKO(new Object[0], 2131952147);
            ixb = new C58790Ixb(22, upcomingEvent2, x79, upcomingEventReminderRepository2, r9, this);
        } else {
            npG = C69206Nh6.A00;
            new C310326ao(this.A05, (C249463jp) null).A00(r9, npG, upcomingEvent2, (Integer) null).A01(upcomingEvent2.getReminderEnabled());
        }
        npG = new C69205Nh5(gko, ixb);
        new C310326ao(this.A05, (C249463jp) null).A00(r9, npG, upcomingEvent2, (Integer) null).A01(upcomingEvent2.getReminderEnabled());
    }

    public C17902Vht(Context context, FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass4DU r4, String str, C262224Cq r6) {
        C51972G9s.A1D(userSession, r4);
        this.A05 = context;
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A02 = r4;
        this.A03 = str;
        this.A04 = r6;
    }
}
