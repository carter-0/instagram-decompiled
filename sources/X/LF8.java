package X;

import com.instagram.common.session.UserSession;

public final class LF8 {
    public long A00;
    public long A01;
    public long A02;
    public final 29E A03;

    public LF8(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A03 = new 29E(userSession);
    }

    public final void A00(int i, int i2) {
        29E r4 = this.A03;
        r4.A0A(this.A02, "camera_roll_acrs_count", String.valueOf(i));
        r4.A0A(this.A02, "filtered_camera_roll_acrs_count", String.valueOf(i2));
        this.A02 = r4.A02(246627450, this.A02);
    }

    public final void A01(boolean z) {
        long j = this.A00;
        if (j != 0) {
            29E r7 = this.A03;
            r7.A0A(j, "is_empty_state", String.valueOf(z));
            this.A00 = r7.A02(246622982, this.A00);
        }
        this.A00 = 0;
    }
}
