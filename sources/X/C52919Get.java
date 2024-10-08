package X;

import android.graphics.Shader;
import java.util.List;

/* renamed from: X.Get  reason: case insensitive filesystem */
public final class C52919Get extends C298605tj {
    public final /* synthetic */ C270284gU A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ boolean A03;

    public C52919Get(C270284gU r1, List list, List list2, boolean z) {
        this.A03 = z;
        this.A01 = list;
        this.A02 = list2;
        this.A00 = r1;
    }

    public final Shader A01(long j) {
        float A022 = C288025bF.A02(j) * C51971G9r.A03(this.A00);
        0eP A1L = AnonymousClass7TE.A1L(Float.valueOf(A022), Float.valueOf(A022 + C288025bF.A02(j)));
        if (this.A03) {
            A1L = AnonymousClass7TE.A1L(A1L.A01, A1L.A00);
        }
        return C52416GRt.A00(this.A01, this.A02, 3, C289325dP.A00(AnonymousClass7TE.A04(A1L.A00), 0.0f), C289325dP.A00(AnonymousClass7TE.A04(A1L.A01), 0.0f));
    }
}
