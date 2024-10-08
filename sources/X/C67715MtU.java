package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.MtU  reason: case insensitive filesystem */
public final class C67715MtU extends C361478gI {
    public final 1a8 A00 = C66581MXm.A0P();
    public final UserSession A01;
    public final NUG A02;
    public final C68714NUa A03;
    public final C72203OyT A04;
    public final Integer A05;
    public final C249513ju A06;
    public final C249513ju A07;
    public final AnonymousClass0r6 A08;
    public final AnonymousClass0r6 A09;
    public final AnonymousClass0r6 A0A;
    public final 05G A0B;
    public final AnonymousClass0Ud A0C;
    public final List A0D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67715MtU(Application application, UserSession userSession, C68714NUa nUa, C72203OyT oyT, Integer num, AnonymousClass0r6 r8) {
        super(application);
        0qQ.A0B(userSession, 1);
        C51974G9v.A1S(application, num, r8, oyT, nUa);
        this.A01 = userSession;
        this.A05 = num;
        this.A08 = r8;
        this.A04 = oyT;
        this.A03 = nUa;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = 1HR.A05;
        AnonymousClass3FN r0 = C249513ju.A00;
        int i = AnonymousClass3FN.A00;
        1HR A1G = JTO.A1G(i);
        this.A06 = A1G;
        this.A0A = 0u9.A04(A1G);
        1HR A1G2 = JTO.A1G(i);
        this.A07 = A1G2;
        02z A012 = 106.A01(NUD.A00);
        this.A0B = A012;
        this.A0C = 10b.A03(A012);
        this.A09 = 0u9.A04(A1G2);
        this.A02 = C69896Nty.A00(userSession);
        this.A0D = AnonymousClass7TE.A1C();
        ((O68) O5J.A01.getValue()).A00 = nUa;
    }

    public final void A0G(C74223PrB prB) {
        List list;
        String obj;
        int i;
        if (N4v.A00(0, prB)) {
            list = this.A0D;
            RKT rkt = (RKT) ((N4v) prB).A01;
            obj = rkt.getMessage();
            if (obj == null) {
                i = rkt.A00.A00;
            }
            list.add(obj);
            C68714NUa nUa = this.A03;
            nUa.A0B("GDRIVE_RESTORE_FAIL");
            nUa.A0F("GDRIVE_FAILURE_REASON", DbU.A1b(list, 0));
        }
        if (N4v.A00(1, prB)) {
            list = this.A0D;
            Throwable th = (Throwable) ((N4v) prB).A01;
            obj = th.getMessage();
            if (obj == null) {
                obj = String.valueOf(th);
            }
        } else {
            boolean z = prB instanceof N4u;
            list = this.A0D;
            if (z) {
                i = ((N4u) prB).A00;
            } else {
                obj = prB.toString();
            }
        }
        list.add(obj);
        C68714NUa nUa2 = this.A03;
        nUa2.A0B("GDRIVE_RESTORE_FAIL");
        nUa2.A0F("GDRIVE_FAILURE_REASON", DbU.A1b(list, 0));
        obj = String.valueOf(i);
        list.add(obj);
        C68714NUa nUa22 = this.A03;
        nUa22.A0B("GDRIVE_RESTORE_FAIL");
        nUa22.A0F("GDRIVE_FAILURE_REASON", DbU.A1b(list, 0));
    }

    public static final void A00(C67715MtU mtU, Exception exc) {
        String str;
        List list = mtU.A0D;
        if (exc == null || (str = exc.toString()) == null) {
            str = AnonymousClass000.A00(1049);
        }
        list.add(str);
        C68714NUa nUa = mtU.A03;
        nUa.A0B("GDRIVE_RESTORE_FAIL");
        nUa.A0F("GDRIVE_FAILURE_REASON", DbU.A1b(list, 0));
    }

    public final void A0E() {
        C68714NUa nUa = this.A03;
        if (nUa.A0G()) {
            nUa.A0B("RESTORE_LANDING_NUX_DISMISSED");
            nUa.A0D("END_REASON", "RESTORE_LANDING_NUX_CLOSED");
            nUa.A07();
        }
    }

    public final void A0F() {
        C68714NUa nUa = this.A03;
        nUa.A0B("RESTORE_LANDING_NUX_NEED_HELP_TAP");
        nUa.A0D("END_REASON", "NEED_HELP_BUTTON_TAPPED");
        nUa.A07();
    }

    public final void A0H(S5E s5e) {
        this.A0B.FIA(KQX.A00);
        AnonymousClass7TE.A1Z(new C66929MfO(this, s5e, (AnonymousClass4D7) null, 10), C318116oQ.A00(this));
    }

    public final void A0I(Integer num, boolean z) {
        String str;
        C68714NUa nUa = this.A03;
        if (z) {
            str = "DB_DROP";
        } else {
            str = "NORMAL_RESTORE";
        }
        C68714NUa.A05(nUa, str);
        nUa.A0B("RESTORE_LANDING_NUX_IMPRESSION");
        nUa.A0C("INTERVAL", AnonymousClass7TG.A0A(num));
    }

    public final void onCleared() {
        this.A00.A01();
        ((O68) O5J.A01.getValue()).A00 = null;
    }
}
