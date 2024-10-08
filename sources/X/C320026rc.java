package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* renamed from: X.6rc  reason: invalid class name and case insensitive filesystem */
public final class C320026rc {
    public Set A00 = new HashSet();
    public final FragmentActivity A01;
    public final UserSession A02;
    public final AnonymousClass4DU A03;
    public final UserDetailFragment A04;
    public final Dc6 A05;
    public final String A06;
    public final C323246xB A07;
    public final C320016rb A08;

    public C320026rc(FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass4DU r4, UserDetailFragment userDetailFragment, C323246xB r6, Dc6 dc6, C320016rb r8, String str) {
        0qQ.A0B(r8, 5);
        0qQ.A0B(r6, 6);
        this.A02 = userSession;
        this.A04 = userDetailFragment;
        this.A01 = fragmentActivity;
        this.A05 = dc6;
        this.A08 = r8;
        this.A07 = r6;
        this.A03 = r4;
        this.A06 = str;
    }

    public final void A00(UpcomingEvent upcomingEvent, User user) {
        String str;
        UserSession userSession = this.A02;
        UserDetailFragment userDetailFragment = this.A04;
        String moduleName = userDetailFragment.getModuleName();
        AnonymousClass4DU r6 = this.A03;
        C310306am r4 = new C310306am(r6, userSession, moduleName);
        UpcomingEvent upcomingEvent2 = upcomingEvent;
        if (!userDetailFragment.A15() || !C18810W3l.A0B(upcomingEvent)) {
            C320016rb r2 = this.A08;
            1ZC A002 = C63468KxX.A00();
            AnonymousClass4DH r1 = r2.A01;
            Context requireContext = r1.requireContext();
            UserSession userSession2 = r2.A02;
            UpcomingEventMedia BPg = upcomingEvent.BPg();
            String str2 = null;
            if (BPg != null) {
                str = BPg.getId();
            } else {
                str = null;
            }
            A002.A01(requireContext, userSession2, r6, (XCE) null, upcomingEvent2, str, r1.getModuleName(), "profile_featured_events_header", false, false);
            C310306am r22 = (C310306am) r2.A04.getValue();
            UpcomingEventMedia BPg2 = upcomingEvent.BPg();
            if (BPg2 != null) {
                str2 = BPg2.getId();
            }
            r22.A04(upcomingEvent, str2, "open_upcoming_event_bottom_sheet", "user_profile");
            return;
        }
        String obj = UUID.randomUUID().toString();
        0qQ.A07(obj);
        C63820L8b l8b = new C63820L8b(userDetailFragment, userSession, obj);
        String title = upcomingEvent.getTitle();
        AnonymousClass4DH r5 = l8b.A00;
        C46498Dg1 dg1 = new C46498Dg1(r5.requireContext(), l8b.A01);
        if (title != null) {
            dg1.A08(title);
        }
        dg1.A04(new LXG(upcomingEvent, l8b), 2131961425);
        Context requireContext2 = r5.requireContext();
        dg1.A04(new LXH(upcomingEvent, l8b), 2131965352);
        dg1.A04(new LXS(r4, upcomingEvent, l8b), 2131965360);
        dg1.A04(new C64248LXa(requireContext2, r4, upcomingEvent, user), 2131965349);
        new C49945FFy(dg1).A03(r5.requireActivity());
    }
}
