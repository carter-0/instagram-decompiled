package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6GP  reason: invalid class name */
public abstract class AnonymousClass6GP extends C267964cX implements C268074ci {
    public long A00 = 0;
    public C289145d6 A01;
    public Map A02;
    public final C289435da A03 = new C289435da(this);
    public final C268054cg A04;
    public final Map A05 = new LinkedHashMap();

    public final boolean CWf() {
        return true;
    }

    public abstract int CmV(int i);

    public abstract int CmY(int i);

    public abstract int CoO(int i);

    public abstract int CoR(int i);

    public static final void A02(C289145d6 r2, AnonymousClass6GP r3) {
        long j;
        Map map;
        if (r2 != null) {
            j = C289155d7.A00(r2.getWidth(), r2.getHeight());
        } else {
            j = 0;
        }
        r3.A0E(j);
        if (!0qQ.A0K(r3.A01, r2) && r2 != null && (((map = r3.A02) != null && !map.isEmpty()) || (!r2.Aam().isEmpty()))) {
            Map Aam = r2.Aam();
            if (!0qQ.A0K(Aam, r3.A02)) {
                C290225ey r0 = r3.A04.A0H.A0U.A05;
                0qQ.A0A(r0);
                r0.A0I.A04();
                Map map2 = r3.A02;
                if (map2 == null) {
                    map2 = new LinkedHashMap();
                    r3.A02 = map2;
                }
                map2.clear();
                map2.putAll(Aam);
            }
        }
        r3.A01 = r2;
    }

    public static final void A03(AnonymousClass6GP r3, long j) {
        if (r3.A00 != j) {
            r3.A00 = j;
            C268054cg r1 = r3.A04;
            C290225ey r0 = r1.A0H.A0U.A05;
            if (r0 != null) {
                r0.A0L();
            }
            C267964cX.A01(r1);
        }
        if (!r3.A02) {
            C267964cX.A00(r3, new C289175d9(r3.A0N(), r3));
        }
    }

    public final long A0L() {
        return this.A00;
    }

    public final C268064ch A0M() {
        return this.A03;
    }

    public final C289145d6 A0N() {
        C289145d6 r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    public final C267964cX A0O() {
        C268054cg r0 = this.A04.A06;
        if (r0 != null) {
            return r0.A0Z();
        }
        return null;
    }

    public final C267964cX A0P() {
        C268054cg r0 = this.A04.A07;
        if (r0 != null) {
            return r0.A0Z();
        }
        return null;
    }

    public final void A0Q() {
        A0J((0sP) null, 0.0f, this.A00);
    }

    public final boolean A0R() {
        if (this.A01 != null) {
            return true;
        }
        return false;
    }

    public final long A0S(AnonymousClass6GP r6) {
        long j = 0;
        AnonymousClass6GP r4 = this;
        while (!0qQ.A0K(r4, r6)) {
            j = C289165d8.A01(j, r4.A00);
            C268054cg r0 = r4.A04.A07;
            0qQ.A0A(r0);
            r4 = r0.A0Z();
            0qQ.A0A(r4);
        }
        return j;
    }

    public final float AwL() {
        return this.A04.AwL();
    }

    public final float B77() {
        return this.A04.B77();
    }

    public final AnonymousClass5R6 BLv() {
        return this.A04.A0H;
    }

    public final Object BaX() {
        return this.A04.BaX();
    }

    public final AnonymousClass5Q8 getLayoutDirection() {
        return this.A04.A0H.A0D;
    }

    public AnonymousClass6GP(C268054cg r3) {
        this.A04 = r3;
    }

    public final void A0J(0sP r2, float f, long j) {
        A03(this, j);
        if (!this.A03) {
            A0T();
        }
    }

    public void A0T() {
        A0N().E2n();
    }
}
