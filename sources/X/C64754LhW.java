package X;

/* renamed from: X.LhW  reason: case insensitive filesystem */
public final class C64754LhW implements C232262tL {
    public final long A00;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return "singleton";
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C64754LhW lhW = (C64754LhW) obj;
        if (lhW == null || this.A00 != lhW.A00) {
            return false;
        }
        return true;
    }

    public C64754LhW(long j) {
        this.A00 = j;
    }
}
