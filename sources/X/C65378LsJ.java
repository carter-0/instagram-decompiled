package X;

import com.instagram.common.session.UserSession;
import com.instagram.igsignals.core.IgSignalsExampleData;

/* renamed from: X.LsJ  reason: case insensitive filesystem */
public final class C65378LsJ implements B2C {
    public IgSignalsExampleData A00;
    public boolean A01 = true;
    public final UserSession A02;
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(new C20609Wvq(this, 24));

    public C65378LsJ(UserSession userSession) {
        this.A02 = userSession;
    }

    public final IgSignalsExampleData EIq(String str) {
        IgSignalsExampleData igSignalsExampleData = this.A00;
        this.A00 = null;
        if (igSignalsExampleData == null && this.A01) {
            String string = ((0xa) this.A03.getValue()).getString("casper_example", (String) null);
            if (string == null) {
                string = "";
            }
            if (string.length() != 0) {
                C255463uA[] r0 = IgSignalsExampleData.A06;
                igSignalsExampleData = IgSignalsExampleData.Companion.A00(string);
            }
        }
        if (this.A01) {
            0xY A0s = JTR.A0s(this.A03);
            A0s.ED3("casper_example");
            A0s.apply();
            this.A01 = false;
        }
        return igSignalsExampleData;
    }

    public final void EyY(IgSignalsExampleData igSignalsExampleData) {
        this.A00 = igSignalsExampleData;
        this.A01 = true;
        0xY A0s = JTR.A0s(this.A03);
        A0s.E5g("casper_example", AnonymousClass9FA.A00(MOJ.A00, C250863mB.A03).A02(igSignalsExampleData, C20507Wsn.A00));
        A0s.apply();
    }
}
