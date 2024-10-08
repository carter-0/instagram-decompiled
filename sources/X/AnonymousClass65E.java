package X;

import android.app.Activity;
import com.google.android.gms.common.GoogleApiAvailability;
import com.instagram.common.session.UserSession;

/* renamed from: X.65E  reason: invalid class name */
public final class AnonymousClass65E {
    public final UserSession A00;

    public AnonymousClass65E(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final boolean A02(Activity activity) {
        if (activity == null) {
            return false;
        }
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.A00;
        0qQ.A07(googleApiAvailability);
        return googleApiAvailability.A03(activity, 12451000) == 0 && AnonymousClass65A.A02(this.A00, 36315949942640339L);
    }

    public final boolean A00() {
        boolean z;
        boolean z2;
        UserSession userSession = this.A00;
        AnonymousClass65F r7 = new AnonymousClass65F(userSession);
        Boolean BB0 = AnonymousClass0t1.A01.A01(userSession).A03.BB0();
        if (BB0 != null) {
            z = BB0.booleanValue();
        } else {
            z = false;
        }
        AnonymousClass65G r5 = (AnonymousClass65G) r7.A02.getValue();
        if (!r5.A00) {
            r5.A01.markerStart(724764879);
        }
        UserSession userSession2 = r7.A00;
        boolean A02 = AnonymousClass65A.A02(userSession2, 36315949949914917L);
        0xa r1 = r7.A01;
        boolean contains = r1.contains("EB_ENABLED_PREF_KEY");
        boolean A022 = AnonymousClass65A.A02(userSession2, 36315949949980454L);
        if (contains) {
            z2 = true;
        } else {
            z2 = null;
        }
        if (!A02) {
            if (!contains) {
                if (z) {
                    0xY AR4 = r1.AR4();
                    AR4.E5T("EB_ENABLED_PREF_KEY", true);
                    AR4.apply();
                } else {
                    if (A022) {
                        0xY AR42 = r1.AR4();
                        AR42.E5T("EB_ENABLED_PREF_KEY", true);
                        AR42.apply();
                    }
                    z = false;
                }
            }
            AnonymousClass65F.A00(r7, z2, A022, z, A02, true);
            return true;
        } else if (contains) {
            0xY AR43 = r1.AR4();
            AR43.ED3("EB_ENABLED_PREF_KEY");
            AR43.apply();
        }
        AnonymousClass65F.A00(r7, z2, A022, z, A02, A022);
        return A022;
    }

    public final boolean A01() {
        return AnonymousClass65A.A02(this.A00, 36315949951094583L);
    }
}
