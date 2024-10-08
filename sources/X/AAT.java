package X;

import com.instagram.common.session.UserSession;
import java.util.Calendar;

public abstract class AAT {
    public static final void A01(C39754A7u a7u) {
        a7u.A02 = null;
        a7u.A00 = null;
        a7u.A01 = null;
        a7u.A06.A02();
        a7u.A03.setVisibility(8);
        a7u.A05.setVisibility(8);
        a7u.A04.setVisibility(8);
    }

    public static final void A00(JV7 jv7, UserSession userSession) {
        0xY AR4;
        C317876nz r6 = (C317876nz) jv7.A00;
        if (0qQ.A0K(r6, C317876nz.A1S) && AnonymousClass7TE.A0q(userSession).getLong("stories_template_new_sticker_time_stamp", 0) == 0) {
            1Av A00 = 1Au.A00(userSession);
            long currentTimeMillis = System.currentTimeMillis();
            AR4 = AnonymousClass7TE.A0p(A00);
            AR4.E5c("stories_template_new_sticker_time_stamp", currentTimeMillis);
        } else if (r6.A00() == C318046oG.CUT_OUT_STICKER) {
            if (AnonymousClass7TE.A0q(userSession).getLong("cutout_anything_banner_nux_time_stamp_ms", 0) == 0) {
                1Av A002 = 1Au.A00(userSession);
                long currentTimeMillis2 = System.currentTimeMillis();
                AR4 = AnonymousClass7TE.A0p(A002);
                AR4.E5c("cutout_anything_banner_nux_time_stamp_ms", currentTimeMillis2);
            } else if (1Av.A07(1Au.A00(userSession), "cutout_anything_banner_nux_time_stamp_ms", 4)) {
                AnonymousClass7TE.A1Z(new MG7(userSession, (AnonymousClass4D7) null, 43), 19E.A02(AnonymousClass12T.A00.AOJ(1596010039, 3)));
                return;
            } else {
                return;
            }
        } else if (r6.A00() == C318046oG.MUSIC_PICK_STICKER) {
            1Av A003 = 1Au.A00(userSession);
            0s0 r1 = A003.A6X;
            AnonymousClass0YZ[] r7 = 1Av.A8a;
            if (AnonymousClass7TE.A0R(r1.CDM(A003, r7[133])) == 0) {
                1Av A004 = 1Au.A00(userSession);
                long currentTimeMillis3 = System.currentTimeMillis();
                A004.A6X.Epx(A004, Long.valueOf(currentTimeMillis3), r7[133]);
                return;
            }
            return;
        } else if (r6.A00() == C318046oG.SUBSCRIPTIONS_STICKER) {
            0xa r62 = C314986jA.A00(userSession).A01;
            int i = r62.getInt("uprank_story_sticker_last_seen_month", 0);
            int i2 = Calendar.getInstance().get(2);
            if (i == i2) {
                AR4 = AnonymousClass7TG.A0g(r62, "uprank_story_sticker_impression_for_current_month");
            } else {
                AR4 = r62.AR4();
                AR4.E5Z("uprank_story_sticker_impression_for_current_month", 1);
                AR4.E5Z("uprank_story_sticker_last_seen_month", i2);
            }
        } else {
            return;
        }
        AR4.apply();
    }
}
