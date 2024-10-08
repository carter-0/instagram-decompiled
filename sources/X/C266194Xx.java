package X;

/* renamed from: X.4Xx  reason: invalid class name and case insensitive filesystem */
public abstract class C266194Xx implements C266204Xy {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03 = AnonymousClass4Y0.A03.getAndIncrement();
    public final long A04;
    public final C256683wB A05;
    public final C257263x7 A06;
    public final C266214Xz A07;
    public final Object A08;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", Bytes Loaded: ");
        sb.append(this.A07.A00);
        sb.append(", Chunk Type: ");
        sb.append(this.A01);
        sb.append(", ");
        sb.append(this.A06.toString());
        return sb.toString();
    }

    public C266194Xx(C256683wB r3, C257113ws r4, C257263x7 r5, Object obj, int i, int i2, long j, long j2) {
        this.A07 = new C266214Xz(r4);
        this.A06 = r5;
        this.A01 = i;
        this.A05 = r3;
        this.A00 = i2;
        this.A08 = obj;
        this.A04 = j;
        this.A02 = j2;
    }
}
