package X;

import java.util.List;

/* renamed from: X.Fkz  reason: case insensitive filesystem */
public final class C50920Fkz implements C337237fw {
    public final /* synthetic */ EEP A00;
    public final /* synthetic */ C49607EzQ A01;

    public C50920Fkz(EEP eep, C49607EzQ ezQ) {
        this.A00 = eep;
        this.A01 = ezQ;
    }

    public final void Dam(C337257fy r6) {
        EEP eep = this.A00;
        EEP.A0D(eep, r6.B3J(), r6.BBY());
        C49607EzQ ezQ = this.A01;
        String BiY = r6.BiY();
        if (BiY == null || BiY.isEmpty()) {
            ezQ.A03 = false;
            ezQ.A00 = null;
            ezQ.A02 = false;
            ezQ.A00 = null;
            EEP.A0C(eep, EEP.A03(eep, r6), eep.A0M(), EEP.A05(eep, (List) r6.Bo1()), false);
        } else {
            ezQ.A02 = false;
            ezQ.A00 = null;
        }
        eep.A0I = r6.BnF();
    }
}
