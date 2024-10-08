package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.6ga  reason: invalid class name and case insensitive filesystem */
public final class C313526ga implements C313506gY {
    public C255773uh A00;
    public C54506HGs A01;
    public C57464Ib8 A02;
    public final Context A03;
    public final AnonymousClass0iw A04;
    public final UserSession A05;
    public boolean isMediaPrepared;

    public C313526ga(Context context, AnonymousClass0iw r3, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A03 = context;
        this.A05 = userSession;
        this.A04 = r3;
    }

    public static final void A00(C313526ga r2) {
        C57464Ib8 ib8;
        if (r2.isMediaPrepared) {
            C57464Ib8 ib82 = r2.A02;
            if (ib82 != null) {
                ib82.A01(false);
                return;
            }
            return;
        }
        C54506HGs hGs = r2.A01;
        if (hGs != null && (ib8 = r2.A02) != null) {
            ib8.A00(hGs);
        }
    }

    public final void A01() {
        C14044Tol tol;
        C57464Ib8 ib8 = this.A02;
        if (!(ib8 == null || (tol = ib8.A00) == null)) {
            tol.A0A("paused_for_replay");
        }
        C57464Ib8 ib82 = this.A02;
        if (ib82 != null) {
            C14044Tol tol2 = ib82.A00;
            if (tol2 != null) {
                tol2.A0B("out_of_playback_range");
            }
            ib82.A00 = null;
        }
        this.A02 = null;
        this.isMediaPrepared = false;
    }

    public final void Dxv(1Xj r2) {
        if (r2 != null) {
            this.isMediaPrepared = true;
            A00(this);
        }
    }

    public final void onProgressUpdate(int i, int i2, boolean z) {
        A00(this);
    }
}
