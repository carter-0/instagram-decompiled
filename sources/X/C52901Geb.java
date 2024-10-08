package X;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* renamed from: X.Geb  reason: case insensitive filesystem */
public final class C52901Geb extends C267794cD implements C267814cG, C268824e3 {
    public float A00;

    /* JADX INFO: finally extract failed */
    public final void AQM(AnonymousClass5Q4 r34) {
        long j;
        AnonymousClass5Q4 r10 = r34;
        0qQ.A0B(r10, 0);
        long j2 = ((AnonymousClass5RW) C288795cU.A00(C52601GZa.A00, this)).A00;
        if ((((Configuration) C288795cU.A00(AndroidCompositionLocals_androidKt.A00, this)).uiMode & 48) == 32) {
            j = 4281546296L;
        } else {
            j = 4293256677L;
        }
        long j3 = j << 32;
        float F06 = r10.F06(2.0f);
        long Bwg = r10.Bwg();
        float A02 = (float) ((int) (C288025bF.A02(Bwg) / 2.0f));
        long A002 = C289325dP.A00(A02, C288025bF.A00(Bwg));
        long A003 = C289325dP.A00(A02, C51966G9m.A00(r10, this.A00, C288025bF.A00(Bwg)));
        r10.AQj((C288195bW) null, (C13866Tin) null, C51966G9m.A00(r10, 1.0f, F06), 1.0f, 0, 3, j2, A002, A003);
        long Bwg2 = r10.Bwg();
        float A022 = C288025bF.A02(Bwg2);
        float A004 = C51966G9m.A00(r10, this.A00, C288025bF.A00(Bwg2));
        AnonymousClass5QD Ayw = r10.Ayw();
        AnonymousClass5QC r4 = (AnonymousClass5QC) Ayw;
        AnonymousClass5QB r6 = r4.A02.A02;
        long A05 = C51967G9n.A05(r6);
        try {
            r4.A01.AHx(1, 0.0f, 0.0f, A022, A004);
            r10.AQV((C288195bW) null, C289635dw.A00, F06 / 2.0f, 1.0f, 3, j3, A003);
            C51968G9o.A1G(r6, Ayw, A05);
            r10.AQW();
        } catch (Throwable th) {
            C51968G9o.A1G(r6, Ayw, A05);
            throw th;
        }
    }

    public final /* synthetic */ void DPk() {
    }
}
