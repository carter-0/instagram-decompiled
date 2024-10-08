package X;

public final class K0R extends V4Y {
    public final C61044Jvi A00;
    public final boolean A01;

    public final K0R A00(boolean z) {
        C61044Jvi jvi = this.A00;
        0qQ.A0B(jvi, 1);
        return new K0R(jvi, z);
    }

    public final V4Y A01(VR1 vr1, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        return new K0R(this.A00.A00(vr1, bool, bool2, bool3, bool4), this.A01);
    }

    public final VR1 A02() {
        return (VR1) this.A00.A01;
    }

    public K0R(C61044Jvi jvi, boolean z) {
        this.A01 = z;
        this.A00 = jvi;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Connected(isSelected=");
        A1A.append(this.A01);
        A1A.append(", statusIndicatorAttributes=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
