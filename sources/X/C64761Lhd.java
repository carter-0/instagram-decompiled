package X;

/* renamed from: X.Lhd  reason: case insensitive filesystem */
public final class C64761Lhd implements C232262tL {
    public final String A00;

    public C64761Lhd(String str) {
        0qQ.A0B(str, 1);
        this.A00 = str;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C64761Lhd lhd = (C64761Lhd) obj;
        0qQ.A0B(lhd, 0);
        return 0qQ.A0K(this.A00, lhd.A00);
    }
}
