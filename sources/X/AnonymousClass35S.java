package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.35S  reason: invalid class name */
public final class AnonymousClass35S implements C61110lV, C252243on {
    public final UserSession A00;
    public final C2365134a A01;
    public final C227802jw A02;

    public final /* synthetic */ void ADC(View view) {
    }

    public final void D6z(View view) {
        0qQ.A0B(view, 0);
        14i.A03(15Y.A02, this);
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public AnonymousClass35S(UserSession userSession, C2365134a r2, C227802jw r3) {
        this.A02 = r3;
        this.A00 = userSession;
        this.A01 = r2;
    }

    public final void onAppBackgrounded() {
        int A03 = AnonymousClass0fD.A03(-812433429);
        0fh.A01("MainFeedFragment.onAppBackgrounded", 949931882);
        try {
            C238213Az r4 = this.A02.A0B;
            if (r4 != null) {
                boolean A0B = r4.A0B();
                int ordinal = r4.A02.ordinal();
                if (ordinal != 2) {
                    if (ordinal == 1 && A0B) {
                        C238213Az.A01(r4, AnonymousClass05K.A0Y);
                    }
                } else if ((!r4.A08.A0i.A04.isEmpty()) && A0B) {
                    C238213Az.A00(r4, AnonymousClass05K.A0Y);
                }
            }
            UserSession userSession = this.A00;
            C2372236u.A00(userSession).A06(AnonymousClass05K.A01);
            1OI A002 = 1OH.A00(userSession);
            1OI.A05(A002, "APP_BACKGROUNDED");
            1OI.A04(A002, "APP_BACKGROUNDED");
            AnonymousClass3G7 A003 = AnonymousClass3G6.A00(userSession);
            AnonymousClass3G7.A02(A003, "APP_BACKGROUNDED");
            AnonymousClass3G7.A01(A003, "APP_BACKGROUNDED");
            C228492ll.A03(C228482lk.A00(userSession), "APP_BACKGROUNDED");
        } finally {
            0fh.A00(1429747445);
            AnonymousClass0fD.A0A(1992106197, A03);
        }
    }

    public final void onAppForegrounded() {
        int A03 = AnonymousClass0fD.A03(1522369095);
        0fh.A01("MainFeedFragment.onAppForegrounded", -457246737);
        try {
            C227802jw r7 = this.A02;
            C238213Az r2 = r7.A0B;
            if (r2 != null && r2.A02.ordinal() == 1 && r2.A0B()) {
                C238213Az.A01(r2, AnonymousClass05K.A0j);
            }
            UserSession userSession = this.A00;
            1OI A002 = 1OH.A00(userSession);
            1OI.A05(A002, "APP_FOREGROUNDED");
            A002.A01 = 182.A06(0Tu.A05, 1NM.A00(A002.A06).A00, 36323839797636671L);
            AnonymousClass3G7.A02(AnonymousClass3G6.A00(userSession), "APP_FOREGROUNDED");
            C228492ll.A03(C228482lk.A00(userSession), "APP_FOREGROUNDED");
            if (!this.A01.A09) {
                r7.A0C();
            }
        } finally {
            0fh.A00(167241429);
            AnonymousClass0fD.A0A(-581598530, A03);
        }
    }

    public final void onDestroyView() {
        14i.A06(this);
    }
}
