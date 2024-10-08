package X;

import com.encryptedbackups.statemanager.model.WrongRecoveryCodeException;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;

/* renamed from: X.OmI  reason: case insensitive filesystem */
public final class C71521OmI implements C74290PsI {
    public final /* synthetic */ OWR A00;
    public final /* synthetic */ C70527OAa A01;
    public final /* synthetic */ C71087ObS A02;
    public final /* synthetic */ String A03;

    public C71521OmI(OWR owr, C70527OAa oAa, C71087ObS obS, String str) {
        this.A00 = owr;
        this.A01 = oAa;
        this.A02 = obS;
        this.A03 = str;
    }

    public final /* bridge */ /* synthetic */ void run(Object obj) {
        C70527OAa oAa;
        C69363Nk3 nk3;
        C69552Nnw nnw = (C69552Nnw) obj;
        Boolean A0u = AnonymousClass7TE.A0u();
        if (nnw == null) {
            OWR owr = this.A00;
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = owr.A01;
            int i = owr.A00;
            lightweightQuickPerformanceLogger.markerPoint(1021649468, i, "add_device_failure");
            C66583MXo.A1C(lightweightQuickPerformanceLogger, "add_device_error", "Missing addDevice result", 1021649468, i);
            oAa = this.A01;
            oAa.A01 = A0u;
            nk3 = C69363Nk3.A07;
        } else if (nnw instanceof N0J) {
            Exception exc = ((N0J) nnw).A00;
            0KC.A0F("VestaLoginClient", 002.A0g("Failed to add device ", this.A03, " to backup"), exc);
            OWR owr2 = this.A00;
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger2 = owr2.A01;
            int i2 = owr2.A00;
            lightweightQuickPerformanceLogger2.markerPoint(1021649468, i2, "add_device_failure");
            C66583MXo.A1C(lightweightQuickPerformanceLogger2, "add_device_error", "Add device failure", 1021649468, i2);
            if (exc instanceof WrongRecoveryCodeException) {
                lightweightQuickPerformanceLogger2.markerPoint(1021649468, i2, "recovery_code_invalid");
                C66583MXo.A1C(lightweightQuickPerformanceLogger2, "add_device_error", "recovery_code_invalid", 1021649468, i2);
            }
            oAa = this.A01;
            oAa.A01 = A0u;
            nk3 = C69363Nk3.A0D;
        } else if (nnw instanceof N0I) {
            OWR owr3 = this.A00;
            owr3.A01.markerPoint(1021649468, owr3.A00, "add_device_success");
            oAa = this.A01;
            oAa.A01 = AnonymousClass7TE.A0v();
            nk3 = C69363Nk3.A0A;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        oAa.A00 = nk3;
        this.A02.A05(new OW0(oAa));
    }
}
