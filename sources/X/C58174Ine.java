package X;

/* renamed from: X.Ine  reason: case insensitive filesystem */
public final class C58174Ine extends 0Yg implements C62320sa {
    public final int A00;
    public final long A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58174Ine(long j, int i) {
        super(0);
        this.A00 = i;
        this.A01 = j;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.A00 != 0) {
            return C51965G9l.A0e(this.A01);
        }
        return Long.valueOf(Math.max(0, this.A01 - AnonymousClass7TG.A0I()));
    }
}
