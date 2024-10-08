package X;

/* renamed from: X.LiH  reason: case insensitive filesystem */
public final class C64797LiH implements C232262tL {
    public final int A00;
    public final C358618bC A01;
    public final boolean A02;
    public final boolean A03;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return Integer.valueOf(this.A00);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C64797LiH liH = (C64797LiH) obj;
        0qQ.A0B(liH, 0);
        if (this.A00 != liH.A00 || !2PP.A00(Boolean.valueOf(this.A03), Boolean.valueOf(liH.A03))) {
            return false;
        }
        return true;
    }

    public C64797LiH(C358618bC r1, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = r1;
        this.A02 = z;
        this.A03 = z2;
    }
}
