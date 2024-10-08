package X;

import android.graphics.Canvas;
import java.util.List;

/* renamed from: X.Gny  reason: case insensitive filesystem */
public final class C53406Gny extends AnonymousClass0T0 implements C59538JNk {
    public final long A00;
    public final C53418GoA A01;
    public final List A02;
    public final boolean A03;
    public final C53426GoI A04;

    public final void AQK(Canvas canvas, I13 i13) {
        0qQ.A0B(i13, 1);
        i13.A01(this.A04, new C58751Iwy(28, canvas, this, i13));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53406Gny) {
                C53406Gny gny = (C53406Gny) obj;
                if (!0qQ.A0K(this.A04, gny.A04) || this.A00 != gny.A00 || !0qQ.A0K(this.A01, gny.A01) || this.A03 != gny.A03 || !0qQ.A0K(this.A02, gny.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0K = AnonymousClass7TE.A0K(this.A04);
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A09(this.A03, (C51972G9s.A07(this.A00, A0K) + AnonymousClass7TG.A0C(this.A01)) * 31));
    }

    public C53406Gny(C53418GoA goA, C53426GoI goI, List list, long j, boolean z) {
        this.A04 = goI;
        this.A00 = j;
        this.A01 = goA;
        this.A03 = z;
        this.A02 = list;
    }
}
