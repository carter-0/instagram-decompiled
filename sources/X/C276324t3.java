package X;

import android.app.Application;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.4t3  reason: invalid class name and case insensitive filesystem */
public final class C276324t3 implements C61110lV, AnonymousClass0lh {
    public long A00;
    public long A01;
    public Context A02;
    public boolean A03;
    public boolean A04;
    public final UserSession A05;
    public final AnonymousClass37Y A06;

    public C276324t3(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A05 = userSession;
        this.A06 = AnonymousClass37X.A00(userSession);
    }

    public final void A00(Context context) {
        if (context != null && !(context instanceof Application)) {
            if (182.A06(0Tu.A05, this.A05, 36330836299498276L)) {
                context = context.getApplicationContext();
            }
        }
        this.A02 = context;
        14i.A03(15Y.A03, this);
    }

    public final boolean A01() {
        if (this.A00 > 0) {
            UserSession userSession = this.A05;
            0Tu r2 = 0Tu.A05;
            if (!182.A06(r2, userSession, 36328250730364047L) || this.A01 - this.A00 < 182.A01(r2, userSession, 36609725706999720L) * 1000 || this.A04 || this.A03 || !AnonymousClass93Q.A00.A09(userSession)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0fD.A03(-313728066);
        this.A00 = System.currentTimeMillis();
        this.A03 = false;
        this.A04 = false;
        AnonymousClass0fD.A0A(-1995458576, A032);
    }

    public final void onAppForegrounded() {
        int i;
        int A032 = AnonymousClass0fD.A03(1843107709);
        this.A01 = System.currentTimeMillis();
        this.A04 = 0qQ.A0K(C71342cb.A00(this.A05).A05, 1QK.A09.toString());
        if (this.A06.A05) {
            i = 816329187;
        } else if (this.A00 == 0) {
            i = -867475658;
        } else {
            11Z.A04(new C52772GcP(this), 200);
            i = 684703940;
        }
        AnonymousClass0fD.A0A(i, A032);
    }

    public final void onSessionWillEnd() {
        14i.A06(this);
    }
}
