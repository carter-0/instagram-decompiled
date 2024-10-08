package X;

import android.graphics.Canvas;
import java.util.List;

/* renamed from: X.Gnz  reason: case insensitive filesystem */
public final class C53407Gnz extends AnonymousClass0T0 implements C59538JNk {
    public final float A00;
    public final int A01;
    public final long A02;
    public final C53418GoA A03;
    public final List A04;
    public final C53426GoI A05;

    public final void AQK(Canvas canvas, I13 i13) {
        0qQ.A0B(i13, 1);
        i13.A01(this.A05, new C58751Iwy(29, canvas, this, i13));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53407Gnz) {
                C53407Gnz gnz = (C53407Gnz) obj;
                if (!0qQ.A0K(this.A05, gnz.A05) || this.A02 != gnz.A02 || !0qQ.A0K(this.A03, gnz.A03) || Float.compare(this.A00, gnz.A00) != 0 || this.A01 != gnz.A01 || !0qQ.A0K(this.A04, gnz.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0K = AnonymousClass7TE.A0K(this.A05);
        return AnonymousClass7TE.A0N(this.A04, (AnonymousClass7TF.A00((C51972G9s.A07(this.A02, A0K) + AnonymousClass7TG.A0C(this.A03)) * 31, this.A00) + this.A01) * 31);
    }

    public C53407Gnz(C53418GoA goA, C53426GoI goI, List list, float f, int i, long j) {
        this.A05 = goI;
        this.A02 = j;
        this.A03 = goA;
        this.A00 = f;
        this.A01 = i;
        this.A04 = list;
    }
}
