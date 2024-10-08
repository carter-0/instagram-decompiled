package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

public final class GNM {
    public final 0xa A00;
    public final int A01;
    public final int A02;

    public final boolean A00() {
        0xa r8 = this.A00;
        if (r8.getBoolean("key_clips_fast_play_ui_shown_by_first_time_long_press", false)) {
            return false;
        }
        long millis = TimeUnit.DAYS.toMillis((long) this.A01);
        long currentTimeMillis = System.currentTimeMillis();
        boolean A1T = AnonymousClass7TF.A1T(r8.getInt("key_clips_fast_play_ui_shown_count", 0), this.A02);
        boolean A1R = AnonymousClass7TF.A1R(((currentTimeMillis - r8.getLong("key_clips_fast_play_ui_last_shown_timestamp_ms", 0)) > millis ? 1 : ((currentTimeMillis - r8.getLong("key_clips_fast_play_ui_last_shown_timestamp_ms", 0)) == millis ? 0 : -1)));
        if (!A1T || !A1R) {
            return false;
        }
        return true;
    }

    public GNM(UserSession userSession, int i, int i2) {
        this.A01 = i;
        this.A02 = i2;
        this.A00 = C51969G9p.A0n(1Al.A01(userSession), 1An.A0i, this);
    }
}
