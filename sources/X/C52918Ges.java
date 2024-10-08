package X;

import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import java.util.List;

/* renamed from: X.Ges  reason: case insensitive filesystem */
public final class C52918Ges extends C298605tj {
    public final int A00;
    public final Object A01;

    public C52918Ges(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final Shader A01(long j) {
        if (this.A00 == 0) {
            return (Shader) this.A01;
        }
        long j2 = AnonymousClass5RW.A09;
        List A1P = 0sr.A1P(new AnonymousClass5RW[]{C51965G9l.A0N(j2), C51965G9l.A0N(j2), C51965G9l.A0N(C285595Rx.A02(AnonymousClass5RX.A0K[(int) (j2 & 63)], AnonymousClass5RW.A03(j2), AnonymousClass5RW.A02(j2), AnonymousClass5RW.A01(j2), 0.5f)), C51965G9l.A0N(C285595Rx.A02(AnonymousClass5RX.A0K[(int) (j2 & 63)], AnonymousClass5RW.A03(j2), AnonymousClass5RW.A02(j2), AnonymousClass5RW.A01(j2), 0.08f))});
        C284945Oz r4 = (C284945Oz) this.A01;
        long A002 = C289325dP.A00(((PointF) ((GNY) r4.getValue()).A01).x * C288025bF.A02(j), ((PointF) ((GNY) r4.getValue()).A01).y * C288025bF.A00(j));
        C52416GRt.A01(A1P, (List) null);
        return new RadialGradient(C289295dM.A01(A002), C289295dM.A02(A002), ((GNY) r4.getValue()).A00 * C288025bF.A02(j), C52416GRt.A02(A1P), (float[]) null, C52417GRu.A00(0));
    }
}
