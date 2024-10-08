package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

/* renamed from: X.Eyw  reason: case insensitive filesystem */
public final class C49587Eyw {
    public final AnonymousClass0r6 A00;
    public final AnonymousClass0r6 A01;
    public final AnonymousClass0r6 A02;
    public final UserSession A03;

    public C49587Eyw(UserSession userSession, String str) {
        this.A03 = userSession;
        1NY A0b = AnonymousClass7TG.A0b(userSession);
        A0b.A0O((15p) null, C3727892k.class, C3727992l.class, false);
        A0b.A0A("users/{user_id}/info/");
        A0b.A0A = "users/{user_id}/info/";
        A0b.A03();
        this.A01 = JUM.A01(new C66181MGs(32, (AnonymousClass4D7) null), DbT.A0T(A0b, CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str).A03(965180918));
        this.A02 = JUM.A01(new C66181MGs(33, (AnonymousClass4D7) null), AnonymousClass94B.A02(userSession, new C46323Dbr(str), (String) null, false).A03(837018141));
        this.A00 = JUM.A01(new C66181MGs(31, (AnonymousClass4D7) null), C320126ro.A02(userSession, str, false).A03(1213818469));
    }
}
