package X;

import com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController;

/* renamed from: X.Aq7  reason: case insensitive filesystem */
public final /* synthetic */ class C41209Aq7 implements Runnable {
    public final /* synthetic */ SOH A00;
    public final /* synthetic */ RAT A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ C41209Aq7(SOH soh, RAT rat, String str, boolean z) {
        this.A01 = rat;
        this.A02 = str;
        this.A03 = z;
        this.A00 = soh;
    }

    public final void run() {
        RAT rat = this.A01;
        String str = this.A02;
        boolean z = this.A03;
        SOH soh = this.A00;
        C387389m8 r2 = rat.A02;
        str.getClass();
        if (!C387389m8.A02(r2, str)) {
            return;
        }
        if (z) {
            r2.A07 = soh;
            C340297l2 r0 = r2.A04;
            r0.getClass();
            if (r0.CVP()) {
                String str2 = r2.A0G;
                SOH soh2 = r2.A07;
                soh2.getClass();
                C40168AUi aUi = new C40168AUi(new C21451Xb3(r2.A03, soh2, str2, r2.A00, r2.A02, r2.A01, r2.A09), r2);
                r2.A05 = aUi;
                C340547lR r02 = ((BasicCameraOutputController) C340297l2.A02(r2.A04)).A04;
                if (r02 != null) {
                    r02.A0N.A9a(aUi);
                    return;
                }
                return;
            }
            return;
        }
        0kD.A03("BoomerangCaptureController", "encoder.configure failed in startRecordingInternal()");
        r2.A08(false);
    }
}
