package X;

import androidx.biometric.BiometricFragment;

/* renamed from: X.THz  reason: case insensitive filesystem */
public final class C13017THz implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ BiometricFragment A01;
    public final /* synthetic */ CharSequence A02;

    public C13017THz(BiometricFragment biometricFragment, CharSequence charSequence, int i) {
        this.A01 = biometricFragment;
        this.A00 = i;
        this.A02 = charSequence;
    }

    public final void run() {
        QDG qdg = this.A01.A01;
        RLE rle = qdg.A04;
        if (rle == null) {
            rle = new QAT(qdg, 0);
            qdg.A04 = rle;
        }
        int i = this.A00;
        CharSequence charSequence = this.A02;
        if (rle instanceof QAU) {
            0qQ.A0B(charSequence, 1);
            ((QAU) rle).A01.A00 = null;
        } else if (rle instanceof QAV) {
            QAV qav = (QAV) rle;
            qav.A01.Cwz(new C13223TQo(charSequence.toString(), i));
            AnonymousClass2E0.A03().A01.Cgl("verify_biometric_fail", S9s.A01(qav.A02.A01));
        } else {
            QAT qat = (QAT) rle;
            if (1 - qat.A00 == 0) {
                0qQ.A0B(charSequence, 1);
                S2E s2e = (S2E) qat.A01;
                s2e.A00.FIG(new S5M(charSequence.toString()));
                s2e.A00.AI3((Throwable) null);
                s2e.A02.Epw(AnonymousClass7TE.A0u());
            }
        }
    }
}
