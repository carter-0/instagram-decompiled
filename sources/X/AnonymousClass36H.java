package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.36H  reason: invalid class name */
public final class AnonymousClass36H {
    public final UserSession A00;
    public final 05G A01;
    public final AnonymousClass0Ud A02;

    public static final void A00(AnonymousClass36H r5) {
        UserSession userSession = r5.A00;
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36321632184182382L) || 182.A06(r2, userSession, 36322040206206875L)) {
            0Ak r22 = (0Ak) AnonymousClass42E.A00.invoke(AnonymousClass0kN.A02(userSession));
            if (r22.A00.isSampled()) {
                r22.A0Q("promotion_id", Long.valueOf(Long.parseLong("649845863914013")));
                r22.A0Q(AnonymousClass000.A00(2934), Long.valueOf(Long.parseLong("11483")));
                r22.A0R(AnonymousClass000.A00(3385), "nonQpNotifPrompt");
                r22.A00.A9H(AnonymousClass000.A00(1332), (Map) null);
                r22.Cgf();
            }
        }
    }

    public static final void A01(AnonymousClass36H r11) {
        0xa r7 = AnonymousClass0xl.A00(C61170le.A00).A00;
        if (r7.getInt("preference_push_permission_impression_count", 0) > 0 && r7.getInt("priming_screen_shown_count", 0) == 0) {
            long j = r7.getLong("preference_push_permission_dialog_impression_timestamp", 0);
            UserSession userSession = r11.A00;
            if (TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - j) >= 182.A01(0Tu.A05, userSession, 36601148655865971L)) {
                int i = r7.getInt("priming_screen_shown_count", 0) + 1;
                0xY AR4 = r7.AR4();
                AR4.E5Z("priming_screen_shown_count", i);
                AR4.apply();
                0wc A022 = AnonymousClass0kN.A02(userSession);
                0Aj A002 = A022.A00(A022.A00, Pxd.A00(780));
                if (A002.isSampled()) {
                    A002.AAJ(Pxd.A00(717), Pxd.A00(773));
                    A002.AAJ(TraceFieldType.AdhocEventName, "priming_screen_impression");
                    A002.Cgf();
                }
                r11.A01.Epw(AnonymousClass3EH.A00);
            }
        }
    }

    public AnonymousClass36H(UserSession userSession) {
        this.A00 = userSession;
        02z A012 = 106.A01(AnonymousClass36I.A00);
        this.A01 = A012;
        this.A02 = 10b.A03(A012);
    }
}
