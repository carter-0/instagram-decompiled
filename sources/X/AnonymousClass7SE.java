package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7SE  reason: invalid class name */
public final class AnonymousClass7SE implements AnonymousClass7SF {
    public AnonymousClass4DH A00;
    public AnonymousClass0iw A01;
    public AnonymousClass4UC A02;
    public C231002qi A03;
    public C231002qi A04;
    public AnonymousClass0eK A05;
    public boolean A06;
    public final UserSession A07;

    public final void A01(AnonymousClass4UC r4) {
        0qQ.A0B(r4, 0);
        this.A02 = r4;
        AnonymousClass0eK r0 = this.A05;
        if (r0 != null) {
            if (((C333517Zg) r0.get()).C6l().CdE() && this.A02 != null) {
                AnonymousClass0eK r02 = this.A05;
                if (r02 != null) {
                    ((C333517Zg) r02.get()).AvL().EIQ(false);
                    return;
                }
            } else {
                return;
            }
        }
        0qQ.A0F("clientInfraProvider");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A00() {
        if (this.A02 != null) {
            this.A02 = null;
            AnonymousClass0eK r0 = this.A05;
            if (r0 != null) {
                if (((C333517Zg) r0.get()).C6l().CdE()) {
                    AnonymousClass0eK r02 = this.A05;
                    if (r02 != null) {
                        ((C333517Zg) r02.get()).AvL().EIQ(false);
                        return;
                    }
                } else {
                    return;
                }
            }
            0qQ.A0F("clientInfraProvider");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public AnonymousClass7SE(UserSession userSession) {
        this.A07 = userSession;
    }
}
