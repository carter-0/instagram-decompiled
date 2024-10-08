package X;

import android.view.View;
import com.instagram.common.session.UserSession;

public final class OL6 {
    public boolean A00;
    public final AnonymousClass4DH A01;
    public final UserSession A02;
    public final AnonymousClass0eM A03 = C73928Pm8.A01(this, 46);

    public final void A00(View view, C226262fy r11, Integer num, String str) {
        C62320sa plr;
        if (num == AnonymousClass05K.A0Y) {
            1Av A002 = 1Au.A00(this.A02);
            if (1Av.A07(A002, "notes_music_reshare_creation_tooltip_last_impression_timestamp_ms", 1) && A002.A01.getInt("notes_music_reshare_creation_tooltip_seen_count", 0) < 3) {
                plr = new C73928Pm8(A002, 45);
            } else {
                return;
            }
        } else if (!((0xa) this.A03.getValue()).getBoolean(C69977NvH.A00(num), false)) {
            plr = new C73916Plr(17, num, this);
        } else {
            return;
        }
        C62320sa r8 = plr;
        if (this.A00) {
            this.A00 = !view.postDelayed(new C73383Pbg(view, this, r11, str, r8), 1000);
        }
    }

    public OL6(AnonymousClass4DH r2, UserSession userSession) {
        boolean A1Y = DbW.A1Y(userSession);
        this.A01 = r2;
        this.A02 = userSession;
        this.A00 = A1Y;
    }
}
