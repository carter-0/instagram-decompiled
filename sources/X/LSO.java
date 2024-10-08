package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import java.util.Iterator;

public final class LSO {
    public int A00;
    public int A01;
    public final UserSession A02;
    public final C64166LRi A03;
    public final LGg A04;
    public final ClipsCreationViewModel A05;
    public final AnonymousClass8RF A06;
    public final C60108Jfo A07;
    public final AnonymousClass861 A08;
    public final 0sP A09;
    public final Context A0A;
    public final AnonymousClass07Z A0B;
    public final KMS A0C;
    public final ClipsStackedTimelineViewController A0D;

    public LSO(Context context, AnonymousClass07Z r5, UserSession userSession, C64166LRi lRi, LGg lGg, KMS kms, ClipsStackedTimelineViewController clipsStackedTimelineViewController, ClipsCreationViewModel clipsCreationViewModel, AnonymousClass8RF r12, C60108Jfo jfo, AnonymousClass861 r14, 0sP r15) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A0A = context;
        this.A0B = r5;
        this.A0D = clipsStackedTimelineViewController;
        this.A05 = clipsCreationViewModel;
        this.A06 = r12;
        this.A08 = r14;
        this.A03 = lRi;
        this.A0C = kms;
        this.A04 = lGg;
        this.A07 = jfo;
        this.A09 = r15;
        JTS.A11(r5, MGV.A01(this, (AnonymousClass4D7) null, 33), jfo.A0Q);
        ClipsTimelineActionBarViewController.A01(LY4.A00(this, 57), C62636KjH.A0X, clipsStackedTimelineViewController.A0C);
    }

    public static final AnonymousClass51M A00(LSO lso, int i) {
        AnonymousClass831 A0K = JTQ.A0K(lso.A05);
        if (A0K != null) {
            return JTO.A0f(A0K, i);
        }
        return null;
    }

    public static final void A01(LSO lso) {
        AnonymousClass8RV r1;
        AnonymousClass8RF r3 = lso.A06;
        AnonymousClass8RH A0E = r3.A0E();
        if (!(A0E instanceof AnonymousClass8RV) || (r1 = (AnonymousClass8RV) A0E) == null) {
            0kD.A07("ClipsTimelineSlipController", "Attempted to exit slip state when not in Slip state", (Throwable) null);
            return;
        }
        int i = r1.A00;
        AnonymousClass51M A002 = A00(lso, i);
        if (!(A002 == null || A002.A09 == lso.A01 || A002.A08 == lso.A00)) {
            A002.A0P = true;
        }
        lso.A01 = 0;
        lso.A00 = 0;
        C64166LRi lRi = lso.A03;
        Iterator A012 = C64166LRi.A01(lRi);
        while (A012.hasNext()) {
            JTT.A13(JTO.A0d(A012).A08);
        }
        Iterator A003 = C64166LRi.A00(lRi);
        while (A003.hasNext()) {
            JTT.A13(JTO.A0d(A003).A08);
        }
        lso.A04.A02(1.0f);
        AnonymousClass861 r12 = lso.A08;
        r12.A01();
        C51967G9n.A0w(i, lso.A09);
        JTP.A1N(r3, i);
        r12.A04();
    }

    public static final void A02(LSO lso) {
        AnonymousClass8RV r2;
        AnonymousClass831 A0K;
        int i;
        AnonymousClass8RH A0E = lso.A06.A0E();
        if ((A0E instanceof AnonymousClass8RV) && (r2 = (AnonymousClass8RV) A0E) != null && (A0K = JTQ.A0K(lso.A05)) != null) {
            int i2 = r2.A00;
            int A012 = A0K.A01(i2);
            AnonymousClass51M A002 = A00(lso, i2);
            if (A002 != null) {
                i = JTP.A08(A002);
            } else {
                i = 0;
            }
            AnonymousClass861 r0 = lso.A08;
            r0.A08(A012, i + A012);
            JTP.A1B(r0.A08, true);
        }
    }

    public final void A03() {
        AnonymousClass8RV r1;
        AnonymousClass8RH A0E = this.A06.A0E();
        if ((A0E instanceof AnonymousClass8RV) && (r1 = (AnonymousClass8RV) A0E) != null) {
            ClipsCreationViewModel.A05(this.A05, r1.A00, this.A01, this.A00);
        }
        A01(this);
        29R A0b = JTO.A0b(this.A02);
        1Ln A082 = 1Ln.A08(A0b.A02);
        C279294yP A0J = A0b.A0J();
        if (DbT.A1Y(A082) && A0J != null) {
            JTO.A1V(A082);
            A082.A0r("TIMELINE_SLIP_CANCEL_TAP");
            29R.A00(A082, A0b);
            JTT.A1D(A082, A0J, A0b);
            A082.Cgf();
        }
    }

    public final boolean A04() {
        C355868Rr r1;
        AnonymousClass8RF r3 = this.A06;
        AnonymousClass8RH A0E = r3.A0E();
        if (!(A0E instanceof C355868Rr) || (r1 = (C355868Rr) A0E) == null) {
            return false;
        }
        int i = r1.A00;
        AnonymousClass51M A002 = A00(this, i);
        if (A002 != null) {
            this.A01 = A002.A09;
            this.A00 = A002.A08;
        }
        this.A08.A01();
        r3.A0G(new AnonymousClass8RV(i));
        return true;
    }
}
