package X;

import com.instagram.android.R;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;

/* renamed from: X.57X  reason: invalid class name */
public final class AnonymousClass57X extends 2YL {
    public C262204Co A00;
    public boolean A01;
    public boolean A02;
    public final long A03;
    public final 2Fk A04;
    public final 2Fk A05;
    public final 2Fk A06;
    public final C63880LAj A07;
    public final Map A08;
    public final 05G A09;
    public final AnonymousClass0r6 A0A;
    public final 05G A0B;

    public AnonymousClass57X(C63880LAj lAj, C63655L1r l1r) {
        0qQ.A0B(lAj, 1);
        0qQ.A0B(l1r, 2);
        this.A07 = lAj;
        this.A03 = TimeUnit.SECONDS.toMillis((long) ((int) 182.A01(0Tu.A05, l1r.A00, 36592769175782065L)));
        C62503Kgt kgt = C62503Kgt.ACTIVITY_IN_HOME_HEADER;
        0eP r6 = new 0eP(kgt, new C61065Jw3(kgt, (int) R.drawable.ig_illustrations_qp_activity_refresh, 2131975427));
        C62503Kgt kgt2 = C62503Kgt.ACTIVITY_IN_PROFILE;
        0eP r5 = new 0eP(kgt2, new C61065Jw3(kgt2, (int) R.drawable.ig_illustrations_qp_activity_refresh, 2131975428));
        C62503Kgt kgt3 = C62503Kgt.SEARCH_IN_HOME_HEADER;
        0eP r4 = new 0eP(kgt3, new C61065Jw3(kgt3, (int) R.drawable.ig_illustrations_qp_search_refresh, 2131975430));
        C62503Kgt kgt4 = C62503Kgt.CREATION_IN_HOME_HEADER;
        this.A08 = 0Yt.A06(new 0eP[]{r6, r5, r4, new 0eP(kgt4, new C61065Jw3(kgt4, (int) R.drawable.ig_illustrations_qp_new_post_refresh, 2131975429))});
        02z r2 = new 02z(new Object());
        this.A0B = r2;
        02z r62 = new 02z(new Object());
        this.A09 = r62;
        05G r7 = lAj.A06;
        this.A0A = r7;
        C66114MBx mBx = new C66114MBx(this, r7);
        19B r42 = 19B.A00;
        this.A06 = C226292g8.A00(r42, mBx);
        this.A05 = C226292g8.A00(r42, new C66107MBq(new C61860pz(new C20592WvV(this, (AnonymousClass4D7) null, 39), AnonymousClass10H.A03(new C66193MHj((Object) this, (AnonymousClass4D7) null, 31, 42), r7, r2))));
        this.A04 = C226292g8.A00(r42, new C61860pz(new C66161MFy(this, (AnonymousClass4D7) null, 35), AnonymousClass10H.A03(new C66193MHj((Object) this, (AnonymousClass4D7) null, 30, 42), r7, r62)));
    }

    public final void A00() {
        this.A01 = true;
        this.A0B.Epw(new Object());
        C262204Co r1 = this.A00;
        if (r1 != null) {
            r1.AG7((CancellationException) null);
        }
    }
}
