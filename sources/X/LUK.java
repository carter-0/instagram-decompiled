package X;

import android.content.DialogInterface;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

public final class LUK implements DialogInterface.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;

    public LUK(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Integer num;
        Integer num2;
        AnonymousClass8RH A0J;
        C351888Av r0;
        switch (this.A00) {
            case 0:
                C60108Jfo jfo = ((KMS) this.A02).A0K;
                int i2 = this.A01;
                ClipsCreationViewModel clipsCreationViewModel = jfo.A0E;
                AnonymousClass2gB r1 = clipsCreationViewModel.A0G;
                AnonymousClass831 A0h = JTO.A0h(r1);
                if (A0h != null) {
                    num = Integer.valueOf(A0h.A01(i2));
                } else {
                    num = null;
                }
                AnonymousClass831 A0h2 = JTO.A0h(r1);
                if (A0h2 != null) {
                    num2 = Integer.valueOf(A0h2.A00(i2));
                } else {
                    num2 = null;
                }
                C318136oS A002 = C318116oQ.A00(jfo);
                JUE jue = new JUE(jfo, num, num2, (AnonymousClass4D7) null, i2, 5);
                19B r2 = 19B.A00;
                1Eo.A05(r2, jue, A002);
                AnonymousClass831 A0h3 = JTO.A0h(r1);
                if (A0h3 != null) {
                    boolean A1S = AnonymousClass7TF.A1S(JTO.A08(A0h3), 1);
                    AnonymousClass8RF r12 = jfo.A0F;
                    if (r12.A0E() instanceof AnonymousClass8RU) {
                        A0J = new AnonymousClass8RU(false);
                    } else {
                        A0J = JTQ.A0J();
                    }
                    r12.A0G(A0J);
                    clipsCreationViewModel.A0U(i2, true);
                    if (A1S && (r0 = clipsCreationViewModel.A02) != null) {
                        r0.A00.A0H.A05.A00();
                    }
                }
                29R A0b = JTO.A0b(jfo.A0C);
                1Ln A08 = 1Ln.A08(A0b.A02);
                if (DbT.A1Y(A08)) {
                    A08.A0t(AnonymousClass000.A00(2300));
                    JTS.A1F(A08, A0b, AnonymousClass000.A00(2127));
                    A08.A0Q("capture_format_index", C51971G9r.A0m());
                    JTQ.A1B(A08, A0b.A04);
                    JTU.A14(A08, i2);
                    JTQ.A18(A08, A0b);
                    JTS.A1E(A08);
                }
                1Eo.A05(r2, new JUE(jfo, num, num2, (AnonymousClass4D7) null, i2, 6), C318116oQ.A00(jfo));
                return;
            case 1:
                KMS kms = (KMS) this.A02;
                if (!kms.A0M()) {
                    JTP.A1N(kms.A0J, this.A01);
                    return;
                }
                return;
            default:
                C64704Lga lga = (C64704Lga) this.A02;
                C60107Jfn jfn = lga.A03;
                MJ3 mj3 = new MJ3(this.A01, 21, lga);
                C63573KzM kzM = jfn.A00;
                if (kzM != null) {
                    C66497MUa mUa = (C66497MUa) jfn.A02.A02.get(kzM);
                    if (mUa != null) {
                        mUa.cancelDetection();
                        return;
                    }
                    return;
                }
                mj3.invoke();
                return;
        }
    }
}
