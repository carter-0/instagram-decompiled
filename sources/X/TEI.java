package X;

import android.os.Bundle;
import androidx.biometric.BiometricFragment;
import java.security.GeneralSecurityException;
import java.security.Signature;

public final class TEI implements Runnable {
    public final /* synthetic */ BiometricFragment A00;
    public final /* synthetic */ C10336RqZ A01;

    public TEI(BiometricFragment biometricFragment, C10336RqZ rqZ) {
        this.A00 = biometricFragment;
        this.A01 = rqZ;
    }

    public final void run() {
        Signature signature;
        QDG qdg = this.A00.A01;
        RLE rle = qdg.A04;
        if (rle == null) {
            rle = new QAT(qdg, 0);
            qdg.A04 = rle;
        }
        C10336RqZ rqZ = this.A01;
        if (rle instanceof QAU) {
            QAU qau = (QAU) rle;
            qau.A00.onSuccess();
            qau.A01.A00 = null;
        } else if (rle instanceof QAV) {
            QAV qav = (QAV) rle;
            AnonymousClass2E0.A03().A01.Cgl("verify_biometric", S9s.A01(qav.A02.A01));
            SR5 sr5 = rqZ.A01;
            if (sr5 == null || (signature = sr5.A00) == null) {
                try {
                    signature = QDE.A00(qav.A00, qav.A03);
                } catch (GeneralSecurityException unused) {
                    signature = null;
                }
            }
            qav.A01.Cx0(new C10586Rug(Bundle.EMPTY, qav.A03, signature));
        } else {
            QAT qat = (QAT) rle;
            if (1 - qat.A00 == 0) {
                S2E s2e = (S2E) qat.A01;
                s2e.A00.FIG(C11274SIo.A00);
                s2e.A00.AI3((Throwable) null);
                s2e.A02.Epw(true);
            }
        }
    }
}
