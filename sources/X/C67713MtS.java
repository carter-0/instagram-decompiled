package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.MtS  reason: case insensitive filesystem */
public final class C67713MtS extends C361478gI {
    public final 1a8 A00 = C66581MXm.A0P();
    public final UserSession A01;
    public final NUN A02;
    public final C72203OyT A03;
    public final Integer A04;
    public final List A05;
    public final C249513ju A06;
    public final AnonymousClass0r6 A07;
    public final 05G A08;
    public final AnonymousClass0Ud A09;
    public final 1aU A0A;
    public final C249513ju A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67713MtS(Application application, 1aU r5, UserSession userSession, NUN nun, C72203OyT oyT, Integer num) {
        super(application);
        0qQ.A0B(userSession, 1);
        C51974G9v.A1S(r5, application, oyT, nun, num);
        this.A01 = userSession;
        this.A0A = r5;
        this.A03 = oyT;
        this.A02 = nun;
        this.A04 = num;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = 1HR.A05;
        AnonymousClass3FN r0 = C249513ju.A00;
        int i = AnonymousClass3FN.A00;
        1HR A1G = JTO.A1G(i);
        this.A0B = A1G;
        this.A06 = JTO.A1G(i);
        02z A012 = 106.A01(NUE.A00);
        this.A08 = A012;
        this.A05 = AnonymousClass7TE.A1C();
        this.A07 = 0u9.A04(A1G);
        this.A09 = 10b.A03(A012);
        ((O68) O5J.A01.getValue()).A00 = nun;
    }

    public final void A0E(C74223PrB prB) {
        List list;
        String obj;
        int i;
        if (N4v.A00(0, prB)) {
            list = this.A05;
            RKT rkt = (RKT) ((N4v) prB).A01;
            obj = rkt.getMessage();
            if (obj == null) {
                i = rkt.A00.A00;
            }
            list.add(obj);
            NUN nun = this.A02;
            nun.A0B("GDRIVE_LOGIN_FAIL");
            nun.A0F("FAILURE_REASON", DbU.A1b(list, 0));
        }
        if (N4v.A00(1, prB)) {
            list = this.A05;
            Throwable th = (Throwable) ((N4v) prB).A01;
            obj = th.getMessage();
            if (obj == null) {
                obj = String.valueOf(th);
            }
        } else {
            boolean z = prB instanceof N4u;
            list = this.A05;
            if (z) {
                i = ((N4u) prB).A00;
            } else {
                obj = prB.toString();
            }
        }
        list.add(obj);
        NUN nun2 = this.A02;
        nun2.A0B("GDRIVE_LOGIN_FAIL");
        nun2.A0F("FAILURE_REASON", DbU.A1b(list, 0));
        obj = String.valueOf(i);
        list.add(obj);
        NUN nun22 = this.A02;
        nun22.A0B("GDRIVE_LOGIN_FAIL");
        nun22.A0F("FAILURE_REASON", DbU.A1b(list, 0));
    }

    public final void A0F(S5E s5e) {
        this.A08.FIA(KQa.A00);
        this.A02.A0B("GDRIVE_SETUP_GETTING_API");
        this.A00.A02(this.A0A.A0L(new C72027Ov1(0, s5e, this)), C73010PSt.A00);
    }

    public final void onCleared() {
        this.A00.A01();
        ((O68) O5J.A01.getValue()).A00 = null;
    }
}
