package X;

import androidx.biometric.BiometricFragment;

public final class TAY implements Runnable {
    public final /* synthetic */ BiometricFragment A00;

    public TAY(BiometricFragment biometricFragment) {
        this.A00 = biometricFragment;
    }

    public final void run() {
        QDG qdg = this.A00.A01;
        RLE rle = qdg.A04;
        if (rle == null) {
            rle = new QAT(qdg, 0);
            qdg.A04 = rle;
        }
        if (rle instanceof QAU) {
            QAU qau = (QAU) rle;
            qau.A00.onFailure();
            qau.A01.A00 = null;
        } else if (rle instanceof QAV) {
            QAV qav = (QAV) rle;
            qav.A01.Cwz(new C13223TQo("A biometric is valid but not recognized.", 104));
            AnonymousClass2E0.A03().A01.Cgl("verify_biometric_fail", S9s.A01(qav.A02.A01));
        } else {
            QAT qat = (QAT) rle;
            if (1 - qat.A00 == 0) {
                ((S2E) qat.A01).A00.FIG(C11273SIm.A00);
            }
        }
    }
}
