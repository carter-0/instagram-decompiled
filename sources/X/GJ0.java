package X;

import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.Map;

public final class GJ0 implements AnonymousClass0lh {
    public Map A00;
    public Map A01 = AnonymousClass7TE.A1E();
    public Map A02;
    public Map A03 = AnonymousClass7TE.A1E();
    public final UserSession A04;
    public final 0xa A05;

    public GJ0(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A04 = userSession;
        this.A05 = 1Al.A01(userSession).A03(1An.A0h);
        Map synchronizedMap = Collections.synchronizedMap(AnonymousClass7TE.A1E());
        0qQ.A07(synchronizedMap);
        this.A02 = synchronizedMap;
        Map synchronizedMap2 = Collections.synchronizedMap(AnonymousClass7TE.A1E());
        0qQ.A07(synchronizedMap2);
        this.A00 = synchronizedMap2;
        this.A01.put("like_reels", 30);
        this.A01.put("save_reels", 50);
        this.A01.put("open_profile_page", 30);
        this.A01.put("open_share_sheet", 30);
        this.A01.put("loop_playback_25_percent", 4);
        this.A01.put("on_touch_down", 1073741823);
    }

    public final void onSessionWillEnd() {
        this.A03.clear();
        this.A02.clear();
        this.A00.clear();
        0xY AR4 = this.A05.AR4();
        AR4.AHM();
        AR4.apply();
    }

    public final void A00(UserSession userSession, String str, String str2, String str3) {
        AnonymousClass7TG.A1U(str2, userSession, str3);
        0nY.A00().ATE(new H8J(this, userSession, str, str2, str3));
    }
}
