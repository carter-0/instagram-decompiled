package X;

import android.graphics.Matrix;
import android.graphics.Shader;
import java.util.List;

/* renamed from: X.Ged  reason: case insensitive filesystem */
public final class C52903Ged extends C267794cD implements C267814cG, AnonymousClass5VH {
    public float A00;
    public AnonymousClass5ZQ A01;
    public C288025bF A02;
    public C289315dO A03;
    public AnonymousClass5S2 A04;
    public AnonymousClass5Q8 A05;
    public C55475HiJ A06;
    public C52921Gev A07;
    public List A08;

    public final void AQM(AnonymousClass5Q4 r19) {
        C289315dO r4;
        AnonymousClass5Q4 r6 = r19;
        0qQ.A0B(r6, 0);
        AnonymousClass5ZQ r2 = this.A01;
        AnonymousClass5ZP r1 = r2.A03;
        if (!0qQ.A0K(r1, r2.A02) || !0qQ.A0K(r1, r2.A01) || !0qQ.A0K(r1, r2.A00)) {
            long Bwg = r6.Bwg();
            C288025bF r0 = this.A02;
            if (r0 == null || Bwg != r0.A00 || r6.getLayoutDirection() != this.A05 || !0qQ.A0K(this.A04, this.A01)) {
                r4 = this.A01.AMX(r6, r6.getLayoutDirection(), r6.Bwg());
            } else {
                r4 = this.A03;
                if (r4 == null) {
                    throw AnonymousClass7TE.A0y();
                }
            }
            HRL.A00(this.A07, r4, r6, C289635dw.A00, 1.0f);
            this.A03 = r4;
            this.A02 = new C288025bF(r6.Bwg());
            this.A05 = r6.getLayoutDirection();
            this.A04 = this.A01;
        } else {
            C52921Gev gev = this.A07;
            AnonymousClass5ZP r22 = this.A01.A03;
            long Bwg2 = r6.Bwg();
            float F07 = r22.F07(r6, Bwg2);
            long A002 = AnonymousClass6GR.A00(F07, F07);
            r6.AQu(gev, (C288195bW) null, C289635dw.A00, 1.0f, 3, 0, C298565tf.A00(Bwg2, 0), A002);
        }
        r6.AQW();
    }

    public final void DIA(C268064ch r6) {
        float A022;
        0qQ.A0B(r6, 0);
        C55475HiJ hiJ = this.A06;
        if (hiJ != null) {
            HAG hag = hiJ.A00;
            int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            A022 = (float) hag.A00.getTop();
        } else {
            C268064ch Bab = r6.Bab();
            long j = 0;
            if (Bab != null) {
                j = Bab.CgW(r6, 0);
            }
            A022 = C289295dM.A02(j);
        }
        C52921Gev gev = this.A07;
        if (A022 != gev.A00) {
            gev.A00 = A022;
            Matrix matrix = gev.A02;
            matrix.setTranslate(0.0f, -A022);
            Shader shader = gev.A01;
            if (shader != null) {
                shader.setLocalMatrix(matrix);
            }
            C288785cT.A00(this);
        }
    }

    public final /* synthetic */ void DPk() {
    }
}
