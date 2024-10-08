package X;

public final class K0S extends V4Y {
    public final C61044Jvi A00;
    public final boolean A01;

    public final K0R A00(boolean z) {
        return new K0R(new C61044Jvi(15, this.A00.A05), z);
    }

    public final V4Y A01(VR1 vr1, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        return new K0S(this.A00.A00(vr1, bool, bool2, bool3, bool4), this.A01);
    }

    public K0S(C61044Jvi jvi, boolean z) {
        this.A01 = z;
        this.A00 = jvi;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Connecting(isStreamingOverWifi=");
        A1A.append(this.A01);
        A1A.append(", statusIndicatorAttributes=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }

    public K0S() {
        this(new C61044Jvi(15, false), false);
    }
}
