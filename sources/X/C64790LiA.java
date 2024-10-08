package X;

/* renamed from: X.LiA  reason: case insensitive filesystem */
public final class C64790LiA implements C232262tL {
    public final int A00;
    public final MXT A01;
    public final CGB A02;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01.getId();
    }

    public C64790LiA(MXT mxt, CGB cgb, int i) {
        this.A01 = mxt;
        this.A02 = cgb;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return false;
    }
}
