package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.UpcomingEventLiveMetadata;

/* renamed from: X.Vjf  reason: case insensitive filesystem */
public final class C18003Vjf {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;
    public final String A03;
    public final String A04;

    /* JADX WARNING: type inference failed for: r0v1, types: [X.VYr, X.UtJ] */
    public final C16347UtM A01(String str) {
        0qQ.A0B(str, 0);
        return new C16347UtM(new C16348UtN(new C17513VYr(this.A00, this.A01, this.A02, this.A03)));
    }

    public final C16346UtL A00(UpcomingEvent upcomingEvent) {
        C16345UtK utK = new C16345UtK(this.A00, this.A01, this.A02, upcomingEvent, this.A03);
        UpcomingEventLiveMetadata BNJ = upcomingEvent.BNJ();
        if (BNJ != null) {
            return new C16346UtL(new C16349UtO(utK, BNJ));
        }
        return null;
    }

    public C18003Vjf(FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass4DU r3, String str, String str2) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A02 = r3;
        this.A03 = str;
        this.A04 = str2;
    }
}
