package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;

/* renamed from: X.6DH  reason: invalid class name */
public final class AnonymousClass6DH extends C287475aC implements C288835cZ {
    public final float A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6DH(0sP r3, float f) {
        super(r3);
        0qQ.A0B(r3, 2);
        this.A00 = f;
        if (f <= 0.0f) {
            throw new IllegalArgumentException(002.A0Z("targetAspectRatio ", " must be > 0", f));
        }
    }

    public final /* synthetic */ boolean AB4(0sP r2) {
        return C287455aA.A00(this, r2);
    }

    public final C289145d6 Cny(C268074ci r6, C268004cb r7, long j) {
        0qQ.A0B(r7, 0);
        0qQ.A0B(r6, 1);
        float f = this.A00;
        int A02 = AnonymousClass5SF.A02(j, AnonymousClass1GB.A01(((float) Constraints.A01(j)) / f));
        C267974cY Cnz = r6.Cnz(C288985co.A02(AnonymousClass5SF.A03(j, AnonymousClass1GB.A01(f * ((float) A02))), A02));
        int i = Cnz.A01;
        int i2 = Cnz.A00;
        return r7.Cfi(0Yt.A0E(), new C377189Kw(Cnz, 42), i, i2);
    }

    public final /* synthetic */ Modifier Ezh(Modifier modifier) {
        return C285235Qj.A00(this, modifier);
    }

    public final boolean equals(Object obj) {
        AnonymousClass6DH r4;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AnonymousClass6DH) {
            r4 = (AnonymousClass6DH) obj;
        } else {
            r4 = null;
        }
        return r4 != null && this.A00 == r4.A00;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        return 002.A0F("TargetAspectRatioModifier(targetAspectRatio=", ')', this.A00);
    }

    public final /* synthetic */ Object AW8(Object obj, 0sL r3) {
        return r3.invoke(obj, this);
    }

    public final /* synthetic */ int CmX(C268084cj r2, C268014cc r3, int i) {
        return C56609I4j.A00(r2, r3, this, i);
    }

    public final /* synthetic */ int Cma(C268084cj r2, C268014cc r3, int i) {
        return C56609I4j.A01(r2, r3, this, i);
    }

    public final /* synthetic */ int CoQ(C268084cj r2, C268014cc r3, int i) {
        return C56609I4j.A02(r2, r3, this, i);
    }

    public final /* synthetic */ int CoT(C268084cj r2, C268014cc r3, int i) {
        return C56609I4j.A03(r2, r3, this, i);
    }
}
