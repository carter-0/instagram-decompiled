package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import java.util.Map;

public final class NXV extends C331017Pd implements C3266277n, C328277Ee {
    public final UserSession A00;
    public final C72469P7e A01;
    public final AnonymousClass9HC A02;
    public final AnonymousClass7L2 A03;
    public final 17i A04;
    public final C3266277n A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NXV(LayoutInflater layoutInflater, ViewGroup viewGroup, UserSession userSession, C332807Wl r5, AnonymousClass9HC r6, NYC nyc, AnonymousClass7L2 r8, Map map) {
        super(nyc.createViewHolder(layoutInflater, viewGroup), nyc, r5);
        AnonymousClass7TF.A1F(nyc, 3, map);
        this.A00 = userSession;
        this.A03 = r8;
        this.A02 = r6;
        this.A04 = 17h.A00(userSession);
        this.A01 = new C72469P7e(map);
        this.A05 = nyc;
    }

    public final /* bridge */ /* synthetic */ C232262tL A05(AnonymousClass7LQ r9) {
        0qQ.A0B(r9, 0);
        C72469P7e p7e = this.A01;
        Context A06 = JTQ.A06(this);
        UserSession userSession = this.A00;
        17i r6 = this.A04;
        AnonymousClass7L2 r5 = this.A03;
        return p7e.AWb(A06, userSession, this.A02, r9, r5, r6, false);
    }

    public final /* synthetic */ void AHu() {
        C66677Mak.A04(this);
    }

    public final /* synthetic */ C242553Us BKr() {
        return C66677Mak.A00(this);
    }

    public final /* synthetic */ C242553Us BzG() {
        return C66677Mak.A01(this);
    }

    public final /* synthetic */ void CsL(float f) {
        C66677Mak.A06(this, f);
    }

    public final /* synthetic */ void EI5() {
        C66677Mak.A05(this);
    }

    public final /* synthetic */ void Ehf(C242553Us r1) {
        C66677Mak.A02(r1, this);
    }

    public final /* synthetic */ void FM4(C242553Us r1, float f) {
        C66677Mak.A03(r1, this, f);
    }

    public final C331277Qg BLj() {
        AnonymousClass77D r2;
        C226642hc r22 = ((PBV) ((AnonymousClass7EZ) this.A00).A0M).A08.getIgImageView().A0I;
        if (!(r22 instanceof AnonymousClass77D) || (r2 = (AnonymousClass77D) r22) == null) {
            return null;
        }
        return r2.A04;
    }

    public final AnonymousClass758 CEa(DirectMessageIdentifier directMessageIdentifier) {
        return this.A05.CEa(directMessageIdentifier);
    }
}
