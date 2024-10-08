package X;

import android.content.res.Configuration;
import android.graphics.Path;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* renamed from: X.Gea  reason: case insensitive filesystem */
public final class C52900Gea extends C267794cD implements C267814cG, C268824e3 {
    public Integer A00;

    /* JADX INFO: finally extract failed */
    public final void AQM(AnonymousClass5Q4 r33) {
        long j;
        float f;
        float f2;
        AnonymousClass5Q4 r9 = r33;
        0qQ.A0B(r9, 0);
        if (this.A00 != AnonymousClass05K.A00) {
            if ((((Configuration) C288795cU.A00(AndroidCompositionLocals_androidKt.A00, this)).uiMode & 48) == 32) {
                j = 4281546296L;
            } else {
                j = 4293256677L;
            }
            long j2 = j << 32;
            long j3 = AnonymousClass5RW.A01;
            float F06 = r9.F06(60.0f);
            AnonymousClass5Q8 layoutDirection = r9.getLayoutDirection();
            AnonymousClass5Q8 r4 = AnonymousClass5Q8.Rtl;
            if (layoutDirection == r4) {
                f = 2.0f;
                f2 = C51969G9p.A00(r9) - (F06 / 2.0f);
            } else {
                f = 2.0f;
                f2 = F06 / 2.0f;
            }
            float F062 = r9.F06(f);
            int intValue = this.A00.intValue();
            if (intValue == 1) {
                float f3 = F062 / f;
                long A002 = C289325dP.A00(f2, f3);
                r9.AQj((C288195bW) null, (C13866Tin) null, F062, 1.0f, 0, 3, j2, A002, C289325dP.A00(f2, C51969G9p.A01(r9)));
                r9.AQV((C288195bW) null, C289635dw.A00, f3, 1.0f, 3, j2, A002);
            } else if (intValue == 2) {
                r9.AQj((C288195bW) null, (C13866Tin) null, F062, 1.0f, 0, 3, j2, C289325dP.A00(f2, 0.0f), C289325dP.A00(f2, C51969G9p.A01(r9)));
            } else if (intValue == 3) {
                float F063 = r9.F06(14.0f);
                int i = 1;
                if (r9.getLayoutDirection() == r4) {
                    i = -1;
                }
                float f4 = F063 * ((float) i);
                float A01 = (C51969G9p.A01(r9) - F063) / f;
                r9.AQj((C288195bW) null, (C13866Tin) null, F062, 1.0f, 0, 3, j2, C289325dP.A00(f2, 0.0f), C289325dP.A00(f2, A01));
                C3018160e A003 = C3026864w.A00();
                Path path = A003.A03;
                path.moveTo(f4, 0.0f);
                path.cubicTo(f4, F063, 0.0f, F063, 0.0f, F063 / f);
                path.cubicTo(0.0f, 0.0f, f4, 0.0f, f4, F063);
                float f5 = f2 - f4;
                AnonymousClass5QF r2 = ((AnonymousClass5QC) r9.Ayw()).A01;
                r2.FHv(f5, A01);
                try {
                    r9.AQn((C288195bW) null, A003, new C298575tg((C13866Tin) null, F062, 4.0f, 0, 0), 1.0f, 3, j2);
                    r2.FHv(-f5, -A01);
                    r9.AQj((C288195bW) null, (C13866Tin) null, F062, 1.0f, 0, 3, j2, C289325dP.A00(f2, A01 + F063), C289325dP.A00(f2, C51969G9p.A01(r9)));
                } catch (Throwable th) {
                    r2.FHv(-f5, -A01);
                    throw th;
                }
            } else if (intValue == 4) {
                long Bwg = r9.Bwg();
                float A02 = C288025bF.A02(Bwg);
                float A004 = C288025bF.A00(Bwg);
                AnonymousClass5QD Ayw = r9.Ayw();
                AnonymousClass5QC r6 = (AnonymousClass5QC) Ayw;
                AnonymousClass5QB r5 = r6.A02.A02;
                long A05 = C51967G9n.A05(r5);
                try {
                    r6.A01.AHx(1, 0.0f, 0.0f, A02, A004);
                    AnonymousClass5Q4 r18 = r9;
                    r18.AQV((C288195bW) null, C289635dw.A00, F062 / f, 1.0f, 3, j2, C289325dP.A00(f2, 0.0f));
                } finally {
                    C51968G9o.A1G(r5, Ayw, A05);
                }
            } else if (intValue != 0) {
                throw AnonymousClass7TE.A1K();
            }
            r9.AQW();
        }
    }

    public final /* synthetic */ void DPk() {
    }
}
