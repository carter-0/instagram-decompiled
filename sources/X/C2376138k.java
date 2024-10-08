package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.release.lockout.DogfoodingEligibilityApi;

/* renamed from: X.38k  reason: invalid class name and case insensitive filesystem */
public final class C2376138k {
    public final Context A00;
    public final Handler A01;
    public final 1xC A02;
    public final UserSession A03;
    public final 0xa A04;
    public final DogfoodingEligibilityApi A05;
    public final AnonymousClass39A A06;
    public final int A07;
    public final 0la A08;
    public final C61410nE A09;
    public final boolean A0A;
    public final boolean A0B;

    public C2376138k(Context context, Handler handler, 1xC r4, 0la r5, UserSession userSession, C61410nE r7, 0xa r8, DogfoodingEligibilityApi dogfoodingEligibilityApi, AnonymousClass39A r10, int i, boolean z, boolean z2) {
        0qQ.A0B(context, 1);
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r4, 3);
        0qQ.A0B(r7, 5);
        0qQ.A0B(r5, 10);
        this.A00 = context;
        this.A03 = userSession;
        this.A02 = r4;
        this.A04 = r8;
        this.A09 = r7;
        this.A01 = handler;
        this.A06 = r10;
        this.A05 = dogfoodingEligibilityApi;
        this.A0A = z;
        this.A08 = r5;
        this.A0B = z2;
        this.A07 = i;
    }

    public final void A01(FragmentActivity fragmentActivity, C262224Cq r9) {
        C309516Yo r1;
        C54141H0l A002;
        if (this.A0A) {
            if (this.A08 == 0la.A0C) {
                UserSession userSession = this.A03;
                if (182.A06(0Tu.A05, userSession, 36318990779292457L)) {
                    0xa r4 = this.A04;
                    if (r4.getBoolean("lockout_active", false)) {
                        r1 = new C309516Yo(fragmentActivity, userSession);
                        A002 = C55101HcA.A00(userSession, true, false);
                    } else {
                        long j = r4.getLong("snooze_expiration_lockout_manager", 0);
                        if (j == 0 || System.currentTimeMillis() >= j) {
                            1Eo.A05(19B.A00, new C66166MGd(this, fragmentActivity, (AnonymousClass4D7) null, 45), r9);
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            } else {
                boolean z = this.A0B;
                int i = this.A07;
                if (z) {
                    if (i < 14) {
                        return;
                    }
                } else if (i < 7) {
                    return;
                }
                UserSession userSession2 = this.A03;
                r1 = new C309516Yo(fragmentActivity, userSession2);
                A002 = C55101HcA.A00(userSession2, true, true);
            }
            r1.A0B((Bundle) null, A002);
            r1.A04();
        }
    }

    public final void A00(long j) {
        0xY AR4 = this.A04.AR4();
        AR4.E5c("snooze_expiration_lockout_manager", System.currentTimeMillis() + j);
        AR4.apply();
    }

    public final void A02(boolean z) {
        0xY AR4 = this.A04.AR4();
        AR4.E5T("lockout_active", z);
        AR4.apply();
    }

    public final boolean A03() {
        if (!182.A06(0Tu.A05, this.A03, 36318990779423530L)) {
            return false;
        }
        long j = this.A04.getLong(AnonymousClass000.A00(1285), 0);
        if (j == 0 || System.currentTimeMillis() >= j) {
            return false;
        }
        return true;
    }
}
