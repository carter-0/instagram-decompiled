package X;

/* renamed from: X.0ma  reason: invalid class name and case insensitive filesystem */
public final class C61320ma extends C63220zH {
    public C61390mw[] A00;
    public final /* synthetic */ C61310mY A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61320ma(C61310mY r5, int i, int i2) {
        super(r5, i, i2);
        this.A01 = r5;
        int i3 = 1 << (i + i2);
        C61390mw[] r2 = new C61390mw[i3];
        this.A00 = r2;
        for (int i4 = 0; i4 < i3; i4++) {
            r2[i4] = new C61390mw(this);
        }
    }
}
