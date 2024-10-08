package X;

import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.List;
import java.util.Set;

/* renamed from: X.3BT  reason: invalid class name */
public final class AnonymousClass3BT {
    public Bitmap A00;
    public C241473Pi A01;
    public boolean A02;
    public final Reel A03;
    public final AnonymousClass3BQ A04;
    public final AnonymousClass3BS A05;

    public AnonymousClass3BT(AnonymousClass3BS r2, Reel reel, AnonymousClass3BQ r4) {
        0qQ.A0B(reel, 1);
        0qQ.A0B(r4, 2);
        this.A03 = reel;
        this.A04 = r4;
        this.A05 = r2;
    }

    public final C255773uh A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return this.A03.A09(userSession);
    }

    public final boolean A04(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        Reel reel = this.A03;
        if (reel.A0Z()) {
            return false;
        }
        if (reel.A1R) {
            return reel.A16(userSession);
        }
        if (reel.A0i()) {
            return true;
        }
        if (reel.A1a) {
            List A0O = reel.A0O(userSession);
            0qQ.A07(A0O);
            if (A0O.isEmpty()) {
                return false;
            }
        }
        if (this.A04 == AnonymousClass3BQ.ADS_HISTORY) {
            return true;
        }
        if (reel.A15(userSession) && reel.A1X) {
            return true;
        }
        if ((!reel.A1P || !2O0.A00(userSession).A05(reel)) && !reel.A16(userSession) && !reel.A1Y) {
            return false;
        }
        return true;
    }

    public final boolean A06(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        List A0O = this.A03.A0O(userSession);
        0qQ.A07(A0O);
        return A0O.isEmpty();
    }

    public final Set A01() {
        Set A06;
        C270194gL r0 = this.A03.A0H;
        if (r0 == null || (A06 = r0.A06()) == null) {
            return 0sl.A00;
        }
        return A06;
    }

    public final boolean A02() {
        for (C270184gK r0 : this.A03.A13) {
            AnonymousClass3Q2 r1 = r0.A00;
            if (!r1.A0z() && !r1.A0n()) {
                return true;
            }
        }
        return false;
    }

    public final boolean A03() {
        if (!this.A03.A0d() || !(!A01().isEmpty())) {
            return false;
        }
        return true;
    }

    public final boolean A05(UserSession userSession) {
        Reel reel = this.A03;
        if (!reel.A1a) {
            return false;
        }
        if (!reel.A0z(userSession)) {
            return reel.A1H;
        }
        for (C255773uh A1H : reel.A0O(userSession)) {
            if (A1H.A1H()) {
                return true;
            }
        }
        return false;
    }
}
