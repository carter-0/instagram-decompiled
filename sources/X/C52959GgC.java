package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.GgC  reason: case insensitive filesystem */
public final class C52959GgC extends C361478gI {
    public final C284945Oz A00;
    public final List A01 = 0sr.A1P(new String[]{"I’d rather be", "My happy place", "My job in another life", "Manifesting for 2024", "Where you want to go this summer", "Mentally I'm here", "Vibes this week ", "Mood today", "You in your worst nightmare", "A photo of you in a place you love", "You in one photo"});
    public final AnonymousClass0eM A02;
    public final 05G A03;
    public final AnonymousClass0Ud A04;
    public final UserSession A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52959GgC(Application application, UserSession userSession, C351838Ap r16, String str) {
        super(application);
        AnonymousClass7TG.A1O(application, userSession);
        this.A05 = userSession;
        C351838Ap r2 = r16;
        this.A02 = C58717IwQ.A00(r2, new AnonymousClass8ZA(r2.A00), 13);
        02z A10 = DbS.A10(new C61080JwI((Object) null, 36));
        this.A03 = A10;
        this.A04 = A10;
        this.A00 = C51970G9q.A0S(HY8.A00(C51967G9n.A0L(str == null ? "" : str)));
        C51971G9r.A1Q(this, C318116oQ.A00(this), 26);
    }
}
