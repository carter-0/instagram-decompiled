package X;

/* renamed from: X.Dh7  reason: case insensitive filesystem */
public final class C46565Dh7 implements C232262tL {
    public final C46568DhA A00;
    public final Object A01 = new Object();

    public C46565Dh7(C46568DhA dhA) {
        0qQ.A0B(dhA, 1);
        this.A00 = dhA;
        if (dhA != C46568DhA.FULL_WIDTH_WITH_BOTTOM_MARGIN && dhA != C46568DhA.FULL_WIDTH_WITH_SMALL_TOP_AND_BOTTOM_MARGIN) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final Object getKey() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return false;
    }
}
