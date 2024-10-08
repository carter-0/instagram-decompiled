package X;

import com.instagram.api.schemas.IGRevShareProductType;
import com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting;
import com.instagram.api.schemas.MonetizationEligibilityDecision;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;
import com.instagram.monetization.repository.MonetizationRepository;

/* renamed from: X.Dl2  reason: case insensitive filesystem */
public final class C46775Dl2 extends 2YL {
    public final IGRevShareProductType A00;
    public final UserMonetizationProductType A01;
    public final UserSession A02;
    public final MonetizationRepository A03;
    public final 2AY A04;
    public final FAE A05;
    public final C249513ju A06;
    public final AnonymousClass0r6 A07;
    public final 05G A08;
    public final AnonymousClass0Ud A09;

    public C46775Dl2(IGRevShareProductType iGRevShareProductType, UserMonetizationProductType userMonetizationProductType, UserSession userSession, MonetizationRepository monetizationRepository, 2AY r10, FAE fae) {
        0qQ.A0B(monetizationRepository, 4);
        this.A02 = userSession;
        this.A00 = iGRevShareProductType;
        this.A01 = userMonetizationProductType;
        this.A03 = monetizationRepository;
        this.A05 = fae;
        this.A04 = r10;
        1HR r0 = new 1HR(0);
        this.A06 = r0;
        this.A07 = 0u9.A04(r0);
        02z A10 = DbS.A10(new C47180Drv("not_eligible", IGTVAccountLevelMonetizationToggleSetting.UNRECOGNIZED.A00, true, false));
        this.A08 = A10;
        this.A09 = 10b.A03(A10);
    }

    public final void A00(C48187EaT eaT) {
        C318136oS A002;
        int i;
        boolean z;
        0sL jTe;
        if (eaT.equals(EOW.A00)) {
            A002 = C318116oQ.A00(this);
            i = 17;
        } else if (eaT.equals(EOX.A00)) {
            A002 = C318116oQ.A00(this);
            i = 18;
        } else if (eaT.equals(EOU.A00)) {
            A002 = C318116oQ.A00(this);
            i = 19;
        } else if (eaT instanceof EOT) {
            int ordinal = this.A01.ordinal();
            if (ordinal == 10) {
                EOT eot = (EOT) eaT;
                z = eot.A01;
                boolean z2 = eot.A00;
                if (!z && z2) {
                    A002 = C318116oQ.A00(this);
                    i = 22;
                }
            } else if (ordinal == 13) {
                EOT eot2 = (EOT) eaT;
                z = eot2.A01;
                boolean z3 = eot2.A00;
                if (!z && z3) {
                    A002 = C318116oQ.A00(this);
                    i = 21;
                }
            } else {
                return;
            }
            IGRevShareProductType iGRevShareProductType = this.A00;
            A002 = C318116oQ.A00(this);
            jTe = new C59673JTe(iGRevShareProductType, this, (AnonymousClass4D7) null, 25, z);
            AnonymousClass7TE.A1Z(jTe, A002);
        } else if (eaT.equals(EOV.A00)) {
            A002 = C318116oQ.A00(this);
            i = 20;
        } else if (eaT.equals(EOZ.A00)) {
            int ordinal2 = this.A01.ordinal();
            if (ordinal2 == 10) {
                A002 = C318116oQ.A00(this);
                i = 27;
            } else if (ordinal2 == 13) {
                A002 = C318116oQ.A00(this);
                i = 28;
            } else {
                return;
            }
        } else if (eaT.equals(EOY.A00)) {
            String str = ((C47180Drv) this.A08.getValue()).A01;
            int ordinal3 = this.A00.ordinal();
            if (ordinal3 == 2) {
                String str2 = MonetizationEligibilityDecision.ELIGIBLE.A00;
                if (!0qQ.A0K(str, str2) && !0qQ.A0K(str, MonetizationEligibilityDecision.AT_RISK_OF_BECOMING_INELIGIBLE.A00)) {
                    A002 = C318116oQ.A00(this);
                    i = 25;
                } else if (0qQ.A0K(str, str2)) {
                    A002 = C318116oQ.A00(this);
                    i = 26;
                } else {
                    return;
                }
            } else if (ordinal3 == 1) {
                String str3 = MonetizationEligibilityDecision.ELIGIBLE.A00;
                if (!0qQ.A0K(str, str3) && !0qQ.A0K(str, MonetizationEligibilityDecision.AT_RISK_OF_BECOMING_INELIGIBLE.A00)) {
                    A002 = C318116oQ.A00(this);
                    i = 23;
                } else if (0qQ.A0K(str, str3)) {
                    A002 = C318116oQ.A00(this);
                    i = 24;
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            throw AnonymousClass7TE.A1K();
        }
        jTe = new C51647Fy6((Object) this, (AnonymousClass4D7) null, i);
        AnonymousClass7TE.A1Z(jTe, A002);
    }
}
