package X;

public final class HFC extends C308786Vp {
    public final C249863kU A00;

    public HFC(C233372vc r2, C249863kU r3, C233522vr r4) {
        super(r2, r4, true);
        this.A00 = r3;
    }

    public final int A01(int i, int i2) {
        return i + i2;
    }

    public final int A03(C233472vm r8, int i, int i2, int i3) {
        0qQ.A0B(r8, 0);
        int A03 = r8.A03();
        int i4 = i3;
        if (i3 >= A03) {
            A03 += i3;
        }
        return A02(i, i2, i4, A03, r8.A01(), r8.A02());
    }

    public final /* bridge */ /* synthetic */ boolean A0I(C252093oY r3, C233472vm r4, Object obj, int i, int i2, int i3, int i4, int i5) {
        0qQ.A0B(r4, 5);
        if (this.A00.A02.isEmpty() || i4 < r4.A01() || i5 < r4.A02()) {
            return false;
        }
        return true;
    }

    public final boolean A0K(C233472vm r2) {
        return false;
    }

    public final /* bridge */ /* synthetic */ int A04(Object obj) {
        throw AnonymousClass7TE.A11("discoveryChainPosition");
    }

    public final /* bridge */ /* synthetic */ Object A0A(Object obj) {
        throw AnonymousClass7TE.A11("discoveryChainingViewModel");
    }

    public final /* bridge */ /* synthetic */ C233472vm A09(Object obj) {
        return GV8.A00(obj);
    }

    public final boolean A0H(C252093oY r4, 1PW r5, C233472vm r6, int i, int i2, int i3) {
        C51972G9s.A1D(r6, r5);
        if (this.A00.A02.isEmpty() || this.A0D.size() < r6.A01() || this.A0E.size() < r6.A02()) {
            return false;
        }
        r5.A01("consumed_media_gap_did_meet");
        return true;
    }
}
