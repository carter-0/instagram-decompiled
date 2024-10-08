package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.3Ky  reason: invalid class name and case insensitive filesystem */
public final class C240453Ky implements C240463Kz {
    public C55697Hlu A00;
    public C296505qA A01;
    public String A02;
    public final AnonymousClass0JR A03;
    public final 0wc A04;
    public final 0lg A05;
    public final AnonymousClass3L3 A06;
    public final AnonymousClass3L8 A07;

    public final String C9x(Integer num) {
        int i;
        0qQ.A0B(num, 0);
        float now = ((float) this.A03.now()) / 1000.0f;
        switch (num.intValue()) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            default:
                i = 5;
                break;
        }
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%d_%.3f", new Object[]{Integer.valueOf(i), Float.valueOf(now)});
        0qQ.A07(formatStrLocaleSafe);
        return formatStrLocaleSafe;
    }

    public final void Chg(String str) {
        HashMap hashMap;
        List list;
        String str2;
        UserSession userSession = this.A05;
        String str3 = null;
        if (userSession instanceof UserSession) {
            hashMap = C254453sV.A00(userSession);
        } else {
            hashMap = null;
        }
        0wc r3 = this.A04;
        0Aj A002 = r3.A00(r3.A00, "instagram_two_measurement_debugging_signal");
        if (A002.isSampled()) {
            A002.AAJ("trigger_id", str);
            A002.AAJ("correlation_id", this.A06.Ara());
            if (hashMap == null || (str2 = (String) hashMap.get("last_actions")) == null) {
                list = 0sn.A00;
            } else {
                list = 00l.A0R(str2, new String[]{","}, 0);
            }
            A002.AAe("previous_actions", list);
            if (hashMap != null) {
                str3 = (String) hashMap.get("scroll_velocity");
            }
            A002.AAJ("scroll_velocity", str3);
            A002.Cgf();
        }
    }

    public final C55697Hlu Ae6() {
        return this.A00;
    }

    public final AnonymousClass3L8 AzE() {
        return this.A07;
    }

    public final String BKq() {
        return this.A02;
    }

    public C240453Ky(0lg r3) {
        this.A05 = r3;
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        0qQ.A07(awakeTimeSinceBootClock);
        this.A03 = awakeTimeSinceBootClock;
        this.A04 = AnonymousClass0kN.A02(r3);
        this.A06 = AnonymousClass3L0.A00(r3);
        List singletonList = Collections.singletonList(AnonymousClass34J.A00(r3));
        0qQ.A07(singletonList);
        this.A07 = new AnonymousClass3L8(singletonList);
    }

    public final void EPN(C55697Hlu hlu) {
        this.A00 = hlu;
    }

    public final void EXY(C296505qA r1) {
        this.A01 = r1;
    }

    public final void Eaj(String str) {
        this.A02 = str;
    }
}
