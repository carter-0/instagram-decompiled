package X;

import com.facebook.quicklog.reliability.CancelReason;
import com.instagram.common.session.UserSession;

/* renamed from: X.2xw  reason: invalid class name and case insensitive filesystem */
public final class C234482xw {
    public long A00 = 17630575;
    public final 29E A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public final void A00() {
        long j = this.A00;
        if (j != 17630575) {
            this.A00 = this.A01.A06(CancelReason.USER_CANCELLED, "Playback paused", 17630575, j);
        }
    }

    public final void A01() {
        this.A01.A0D("play_finished", this.A00, (String) null, (String) null, (String) null, (String) null);
    }

    public final void A02() {
        this.A00 = this.A01.A02(17630575, this.A00);
    }

    public final void A03() {
        long j = this.A00;
        if (j != 17630575) {
            this.A01.A0D("track_prepared", j, (String) null, (String) null, (String) null, (String) null);
        }
    }

    public final void A04(Exception exc) {
        0KC.A0F("MusicPlayerLoggerImpl", "setDataSourceFailed", exc);
        long j = this.A00;
        if (j != 17630575) {
            29E r0 = this.A01;
            String message = exc.getMessage();
            if (message == null) {
                message = "Setting Data Source Failed";
            }
            this.A00 = r0.A07(message, "", 17630575, j);
        }
    }

    public final void A05(String str) {
        long j = this.A00;
        if (j != 17630575) {
            this.A00 = this.A01.A07(str, "", 17630575, j);
        }
    }

    public final void A06(boolean z) {
        String str;
        String str2 = this.A05;
        if (!z) {
            if (this.A06) {
                str = toString();
            } else {
                str = "";
            }
            Integer valueOf = Integer.valueOf(002.A0R("play", str).hashCode());
            29E r2 = this.A01;
            long A042 = r2.A04(valueOf, (String) null, 17630575, 3000);
            this.A00 = A042;
            r2.A0B(A042, "operation", "play", false);
            r2.A0B(this.A00, "player_name", this.A04, false);
            r2.A0B(this.A00, "use_case", str2, false);
            AnonymousClass0iw r1 = this.A02;
            if (r1 != null) {
                r2.A0B(this.A00, "module", r1.getModuleName(), false);
            }
            r2.A0B(this.A00, "camera_destination", String.valueOf(27p.A01(this.A03).A0J()), false);
        }
    }

    public C234482xw(AnonymousClass0iw r3, UserSession userSession, String str, String str2, boolean z) {
        this.A03 = userSession;
        this.A04 = str;
        this.A05 = str2;
        this.A06 = z;
        this.A02 = r3;
        this.A01 = new 29E(userSession);
    }
}
