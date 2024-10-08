package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.venue.Venue;
import java.util.List;

/* renamed from: X.Iad  reason: case insensitive filesystem */
public final class C57433Iad implements JRM {
    public final /* synthetic */ C55897HpI A00;
    public final /* synthetic */ C55958HqP A01;

    public final void D3w(1Xj r1, AnonymousClass3W1 r2) {
    }

    public final /* synthetic */ void D44(1Xj r1) {
    }

    public final /* synthetic */ void D7C(1Xj r1) {
    }

    public final /* synthetic */ void DDk(1Xj r1) {
    }

    public final /* synthetic */ void DMo() {
    }

    public final /* synthetic */ void DS3(1Xj r1) {
    }

    public final /* synthetic */ void DiJ(1Xj r1) {
    }

    public final void Duh(1Xj r2, AnonymousClass3W1 r3, Integer num, boolean z) {
        0qQ.A0B(num, 2);
        this.A01.A00(r2, r3, num);
    }

    public final /* synthetic */ void Dui(1Xj r1) {
    }

    public final /* synthetic */ void Duj(1Xj r1) {
    }

    public final /* synthetic */ void Dum() {
    }

    public final /* synthetic */ void Dun(1Xj r1) {
    }

    public final /* synthetic */ void Duo(List list, String str) {
    }

    public final /* synthetic */ void Dup(1Xj r1) {
    }

    public final /* synthetic */ void Duq(1Xj r1) {
    }

    public final /* synthetic */ void Dur(1Xj r1) {
    }

    public final void Duu(1Xj r2, AnonymousClass3W1 r3, boolean z, boolean z2) {
        0qQ.A0B(r2, 0);
        C51967G9n.A1N(r2, r3, this.A00.A0G, z);
    }

    public final /* synthetic */ void Duw(1Xj r1, AnonymousClass3W1 r2) {
    }

    public final /* synthetic */ void Duy(1Xj r1) {
    }

    public C57433Iad(C55897HpI hpI, C55958HqP hqP) {
        this.A00 = hpI;
        this.A01 = hqP;
    }

    public final void DHc(1Xj r2) {
        this.A00.A03.invoke(r2);
    }

    public final void DVb(1Xj r2, AnonymousClass3W1 r3) {
        this.A00.A09.invoke(r2, r3);
    }

    public final void Dus(1Xj r2, AnonymousClass3W1 r3) {
        this.A00.A08.invoke(r2, r3);
    }

    public final void Dut(1Xj r4, AnonymousClass3W1 r5) {
        C55958HqP hqP = this.A01;
        Venue A23 = r4.A23();
        if (A23 != null) {
            C52273GLp.A05(hqP.A00, hqP.A01, A23);
        }
    }

    public final void Dux(1Xj r4) {
        C279484yi Ad4;
        C55958HqP hqP = this.A01;
        UserSession userSession = hqP.A01;
        C270564gw A1P = r4.A1P();
        if (A1P != null && (Ad4 = A1P.Ad4()) != null) {
            C52273GLp.A06(hqP.A00, userSession, Ad4.getTemplateMediaId());
        }
    }
}
