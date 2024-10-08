package X;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

public final class SxZ implements C13840TiF {
    public final C12554Sxf A00;

    public SxZ(C12554Sxf sxf) {
        this.A00 = sxf;
    }

    public final void FOR() {
    }

    public final void FOX(Bundle bundle) {
    }

    public final void FOY(ConnectionResult connectionResult, AnonymousClass63K r2, boolean z) {
    }

    public final C8412Qts FON(C8412Qts qts) {
        try {
            C12554Sxf sxf = this.A00;
            QpU qpU = sxf.A05;
            SEZ sez = qpU.A09;
            sez.A01.add(qts);
            qts.A0B.set(sez.A00);
            AnonymousClass63G r2 = qts.A00;
            AnonymousClass647 r1 = (AnonymousClass647) qpU.A0D.get(r2);
            AnonymousClass3Qk.A03(r1, "Appropriate Api was not requested.");
            if (r1.isConnected() || !sxf.A0A.containsKey(r2)) {
                qts.A09(r1);
                return qts;
            }
            qts.A0A(new Status(17, (String) null));
            return qts;
        } catch (DeadObjectException unused) {
            C12554Sxf sxf2 = this.A00;
            AnonymousClass7TE.A1S(sxf2.A06, new C8374Qpf(this, this), 1);
            return qts;
        }
    }

    public final void FOU() {
    }

    public final void FOZ(int i) {
        C12554Sxf sxf = this.A00;
        sxf.A00((ConnectionResult) null);
        sxf.A07.FOQ(i, false);
    }

    public final boolean FOa() {
        this.A00.A00((ConnectionResult) null);
        return true;
    }

    public final C8412Qts FOK(C8412Qts qts) {
        FON(qts);
        return qts;
    }
}
