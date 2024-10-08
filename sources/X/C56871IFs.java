package X;

import androidx.compose.ui.Alignment;

/* renamed from: X.IFs  reason: case insensitive filesystem */
public final class C56871IFs implements Alignment {
    public final float A00;
    public final float A01 = -1.0f;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C56871IFs) && Float.compare(this.A00, ((C56871IFs) obj).A00) == 0 && Float.compare(-1.0f, -1.0f) == 0);
    }

    public final String toString() {
        return 002.A0U("BiasAbsoluteAlignment(horizontalBias=", C273654mx.A00(1166), ')', this.A00, -1.0f);
    }

    public C56871IFs(float f) {
        this.A00 = f;
    }

    public final long AB3(AnonymousClass5Q8 r8, long j, long j2) {
        long A002 = C289155d7.A00(((int) (j2 >> 32)) - ((int) (j >> 32)), C289005cr.A00(j2) - C289005cr.A00(j));
        return AnonymousClass5TW.A00(Math.round((((float) ((int) (A002 >> 32))) / 2.0f) * (this.A00 + 1.0f)), Math.round((((float) C289005cr.A00(A002)) / 2.0f) * (1.0f - 4.0f)));
    }

    public final int hashCode() {
        return C51966G9m.A02(G9w.A00(this.A00), -1.0f);
    }
}
