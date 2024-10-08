package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.IaG  reason: case insensitive filesystem */
public final class C57410IaG implements AnonymousClass3TK {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C57410IaG(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = obj3;
        this.A04 = obj4;
    }

    public final /* synthetic */ void CvC() {
    }

    public final void CvR(boolean z, float f) {
        C52976GgT ggT;
        if (this.A00 != 0) {
            Float valueOf = Float.valueOf((((C52159GHb) this.A04).A00 + 1.0f) * f);
            ((2V5) this.A02).A00(valueOf);
            ((2V5) this.A03).A00(valueOf);
            2V5 r0 = (2V5) this.A01;
            if (!z) {
                f = 1.0f;
            }
            C51967G9n.A19(r0, f);
            return;
        }
        Float valueOf2 = Float.valueOf(f);
        ((2V5) this.A02).A00(valueOf2);
        ((2V5) this.A03).A00(valueOf2);
        2V5 r1 = (2V5) this.A01;
        float f2 = 1.0f;
        if (z) {
            f2 = f;
        }
        C51967G9n.A19(r1, f2);
        if (!z) {
            C53764Gtt gtt = (C53764Gtt) this.A04;
            gtt.A03.invoke(valueOf2);
            C51968G9o.A1O(gtt.A02, AnonymousClass7TF.A1R((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1))));
            if (f <= 0.0f && (ggT = gtt.A00) != null) {
                String str = gtt.A01;
                0qQ.A0B(str, 0);
                05G r2 = ggT.A00;
                LinkedHashMap A032 = 0Yt.A03((Map) r2.getValue());
                A032.put(str, true);
                r2.Epw(A032);
            }
        }
    }
}
