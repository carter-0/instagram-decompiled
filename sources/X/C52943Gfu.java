package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;

/* renamed from: X.Gfu  reason: case insensitive filesystem */
public final class C52943Gfu extends C287475aC implements C288835cZ {
    public final C304836Fk A00;
    public final float A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52943Gfu(C304836Fk r3, 0sP r4, float f) {
        super(r4);
        0qQ.A0B(r4, 3);
        this.A01 = f;
        this.A00 = r3;
        if (f <= 0.0f) {
            throw AnonymousClass7TE.A0w(002.A0Z("aspectRatio ", " must be > 0", f));
        }
    }

    public final /* synthetic */ boolean AB4(0sP r2) {
        return C287455aA.A00(this, r2);
    }

    public final /* synthetic */ Modifier Ezh(Modifier modifier) {
        return C285235Qj.A00(this, modifier);
    }

    public final boolean equals(Object obj) {
        C52943Gfu gfu;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C52943Gfu) {
            gfu = (C52943Gfu) obj;
        } else {
            gfu = null;
        }
        return gfu != null && this.A01 == gfu.A01 && 0qQ.A0K(this.A00, ((C52943Gfu) obj).A00);
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, G9w.A00(this.A01));
    }

    public final String toString() {
        return 002.A0F("ContentAspectRatioModifier(aspectRatio=", ')', this.A01);
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

    public final C289145d6 Cny(C268074ci r6, C268004cb r7, long j) {
        AnonymousClass7TG.A1N(r7, r6);
        C304826Fj r3 = (C304826Fj) this.A00;
        long A002 = C289155d7.A00(r7.EJS(r3.A02 + r3.A01), r7.EJS(r3.A03 + r3.A00));
        int A003 = C289005cr.A00(A002);
        long A06 = AnonymousClass5SF.A06(j, -C51965G9l.A04(A002), -A003);
        float A012 = (float) Constraints.A01(A06);
        int A004 = Constraints.A00(A06);
        float f = this.A01;
        if (f > A012 / ((float) A004)) {
            A004 = AnonymousClass1GB.A01(A012 / f);
        }
        int i = A004 + A003;
        C267974cY Cnz = r6.Cnz(Constraints.A04(Constraints.A03(j), Constraints.A01(j), i, i));
        return C51969G9p.A0a(r7, new C59099J6h(Cnz, 41), Cnz.A01, Cnz.A00);
    }

    public final /* synthetic */ int CoQ(C268084cj r2, C268014cc r3, int i) {
        return C56609I4j.A02(r2, r3, this, i);
    }

    public final /* synthetic */ int CoT(C268084cj r2, C268014cc r3, int i) {
        return C56609I4j.A03(r2, r3, this, i);
    }
}
