package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3gC  reason: invalid class name and case insensitive filesystem */
public final class C247353gC {
    public Integer A00 = AnonymousClass05K.A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final UserSession A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;

    public final boolean A00() {
        AnonymousClass0eM r2 = this.A07;
        if (((1Av) r2.getValue()).A01.getBoolean("content_note_rec_nux_shown", false)) {
            this.A06.getValue();
            TimeUnit timeUnit = TimeUnit.MINUTES;
            UserSession userSession = this.A05;
            0qQ.A0B(userSession, 0);
            if (System.currentTimeMillis() - ((1Av) r2.getValue()).A01.getLong("content_note_rec_nux_last_shown_timestamp", 0) <= timeUnit.toMillis(182.A01(0Tu.A05, userSession, 36602127914177100L))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C247353gC(UserSession userSession) {
        this.A05 = userSession;
        0eO r2 = 0eO.A04;
        this.A07 = AnonymousClass0eN.A00(r2, new AnonymousClass9LM(this, 35));
        this.A06 = AnonymousClass0eN.A00(r2, C247363gD.A00);
    }
}
