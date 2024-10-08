package X;

import android.view.View;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Ft6  reason: case insensitive filesystem */
public final class C51374Ft6 implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C2367234v A01;

    public C51374Ft6(View view, C2367234v r2) {
        this.A01 = r2;
        this.A00 = view;
    }

    public final void run() {
        boolean z;
        long j;
        long A002;
        boolean z2;
        long j2;
        C2367234v r13 = this.A01;
        View view = this.A00;
        if (r13.A08.A0B()) {
            UserSession userSession = r13.A06;
            List A02 = FFN.A02(userSession);
            if (A02.isEmpty() && AnonymousClass37B.A00(userSession) && !AnonymousClass7TE.A0q(userSession).getBoolean("has_seen_group_stories_peek_nux", false)) {
                int i = AnonymousClass7TE.A0q(userSession).getInt("group_stories_peek_nux_count", 0);
                0Tu r6 = 0Tu.A05;
                int A04 = DbS.A04(r6, userSession, 36601788607828308L);
                A002 = (long) 182.A00(r6, userSession, 37164738562031957L);
                if (A002 <= 0) {
                    return;
                }
                if (System.currentTimeMillis() - AnonymousClass7TE.A0q(userSession).getLong("group_stories_peek_nux_last_shown_time", 0) <= ((long) (DbS.A04(r6, userSession, 36601788608090454L) * 60 * IgNetworkConsentStorage.MAX_ENTRIES)) || i >= A04) {
                    int A042 = DbS.A04(r6, userSession, 36601788607893845L);
                    if (A042 > 0 && System.currentTimeMillis() - AnonymousClass7TE.A0q(userSession).getLong("group_stories_peek_nux_last_shown_time", 0) > ((long) (A042 * 24 * 60 * 60 * IgNetworkConsentStorage.MAX_ENTRIES))) {
                        AnonymousClass7TG.A1M(1Au.A00(userSession).A01, "group_stories_peek_nux_count", 1);
                        1Av A003 = 1Au.A00(userSession);
                        long currentTimeMillis = System.currentTimeMillis();
                        0xY A0p = AnonymousClass7TE.A0p(A003);
                        A0p.E5c("group_stories_peek_nux_last_shown_time", currentTimeMillis);
                        A0p.apply();
                        j2 = A002;
                        z2 = true;
                        z = true;
                        C2367234v.A00(view, r13, A02, j2, z2, z);
                    }
                    return;
                }
                AnonymousClass7TG.A1M(1Au.A00(userSession).A01, "group_stories_peek_nux_count", i + 1);
                1Av A004 = 1Au.A00(userSession);
                long currentTimeMillis2 = System.currentTimeMillis();
                0xY A0p2 = AnonymousClass7TE.A0p(A004);
                A0p2.E5c("group_stories_peek_nux_last_shown_time", currentTimeMillis2);
                A0p2.apply();
                z = !AnonymousClass7TE.A0q(userSession).getBoolean("has_seen_group_stories_peek_nux_tooltip", false);
                z2 = true;
            } else if (!A02.isEmpty()) {
                1Av A005 = 1Au.A00(userSession);
                0Tu r2 = 0Tu.A05;
                long A012 = 182.A01(r2, userSession, 36601788607369555L);
                if (A012 > 0 && TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - A005.A01.getLong(AnonymousClass000.A00(3205), 0)) > A012) {
                    z = !AnonymousClass7TE.A0q(userSession).getBoolean("has_seen_group_stories_peek_nux_tooltip", false);
                    if (z) {
                        j = 37164738562031957L;
                    } else {
                        j = 37164738560852305L;
                    }
                    A002 = (long) 182.A00(r2, userSession, j);
                    if (A002 > 0) {
                        z2 = false;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
            j2 = A002;
            C2367234v.A00(view, r13, A02, j2, z2, z);
        }
    }
}
