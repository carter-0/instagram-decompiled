package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Mbw  reason: case insensitive filesystem */
public final class C66751Mbw implements C74510Pw5 {
    public final UserSession A00;
    public final C66752Mbx A01;
    public final 1aU A02;
    public final 1a8 A03 = C66581MXm.A0P();
    public final C66741Mbm A04;

    public final boolean CKO() {
        return C51970G9q.A1U(this.A04.CKO() ? 1 : 0);
    }

    public final boolean CT5() {
        return C51970G9q.A1U(this.A04.CT5() ? 1 : 0);
    }

    public final boolean Cmi() {
        return C51970G9q.A1U(this.A04.Cmi() ? 1 : 0);
    }

    public final void EIx() {
        this.A01.EIx();
    }

    public final void Eji(2EM r2) {
        this.A01.Eji(r2);
    }

    public final boolean EsC() {
        return C51970G9q.A1U(this.A04.EsC() ? 1 : 0);
    }

    public final boolean isLoading() {
        if (this.A04.CKO() || this.A01.isLoading()) {
            return true;
        }
        return false;
    }

    public final void pause() {
        this.A01.A02 = false;
    }

    public final void start() {
        this.A01.start();
        boolean A07 = 2HM.A00(this.A00).A07();
        1aU r0 = this.A02;
        if (!A07) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            1aJ r3 = r0.A00;
            C318206oZ r2 = C318156oU.A00;
            1aP.A01(r2, "scheduler is null");
            r0 = new 1aU(new C21108XEy(r3, r2, timeUnit));
        }
        PU8.A00(r0, this.A03, this, 47);
    }

    public final void stop() {
        this.A01.stop();
        this.A03.A01();
    }

    public C66751Mbw(1aU r2, UserSession userSession, C66741Mbm mbm, C66752Mbx mbx) {
        AnonymousClass7TG.A1Q(mbm, mbx);
        this.A00 = userSession;
        this.A04 = mbm;
        this.A01 = mbx;
        this.A02 = r2;
    }

    public final boolean AFZ(2EM r3, C2611948q r4) {
        AnonymousClass7TG.A1N(r3, r4);
        if (this.A04.AFZ(r3, r4) || this.A01.AFZ(r3, r4)) {
            return true;
        }
        return false;
    }

    public final void AUu(2EM r2, C2611948q r3, String str) {
        AnonymousClass7TG.A1O(r2, r3);
        this.A04.AUu(r2, r3, str);
    }

    public final void CgP(2EM r3, C2611948q r4) {
        AnonymousClass7TG.A1N(r3, r4);
        C66741Mbm mbm = this.A04;
        if (mbm.AFZ(r3, r4)) {
            mbm.CgP(r3, r4);
        } else {
            this.A01.CgP(r3, r4);
        }
    }
}
