package X;

import java.util.Map;

/* renamed from: X.857  reason: invalid class name */
public final class AnonymousClass857 implements AnonymousClass851 {
    public final C357638Yz A00;
    public final Map A01;

    public final C359248cL AND(AnonymousClass9J8 r4, AnonymousClass84D r5) {
        C359248cL AND;
        0qQ.A0B(r5, 0);
        0qQ.A0B(r4, 1);
        AnonymousClass851 r0 = (AnonymousClass851) this.A01.get(this.A00.A08.A00);
        if (r0 == null || (AND = r0.AND(r4, r5)) == null) {
            return new C378439Pu(C359208cH.A01(r4, r5), (String) null);
        }
        return AND;
    }

    public final boolean Aki() {
        AnonymousClass851 r0 = (AnonymousClass851) this.A01.get(this.A00.A08.A00);
        if (r0 != null) {
            return r0.Aki();
        }
        return false;
    }

    public final Integer B0K() {
        Integer B0K;
        AnonymousClass851 r0 = (AnonymousClass851) this.A01.get(this.A00.A08.A00);
        if (r0 == null || (B0K = r0.B0K()) == null) {
            return AnonymousClass05K.A01;
        }
        return B0K;
    }

    public final boolean BuC() {
        AnonymousClass851 r0 = (AnonymousClass851) this.A01.get(this.A00.A08.A00);
        if (r0 != null) {
            return r0.BuC();
        }
        return true;
    }

    public final boolean Buj() {
        AnonymousClass851 r0 = (AnonymousClass851) this.A01.get(this.A00.A08.A00);
        if (r0 != null) {
            return r0.Buj();
        }
        return true;
    }

    public final boolean But() {
        AnonymousClass851 r0 = (AnonymousClass851) this.A01.get(this.A00.A08.A00);
        if (r0 != null) {
            return r0.But();
        }
        return false;
    }

    public AnonymousClass857(C357638Yz r1, Map map) {
        this.A00 = r1;
        this.A01 = map;
    }

    public final boolean Bu9() {
        return !BuC();
    }
}
