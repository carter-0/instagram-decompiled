package X;

import java.nio.ByteBuffer;

/* renamed from: X.2CN  reason: invalid class name */
public abstract class AnonymousClass2CN {
    public int A00;
    public int A01;
    public int A02;
    public AnonymousClass2CP A03;
    public ByteBuffer A04;

    public final int A00(int i) {
        if (i < this.A01) {
            return this.A04.getShort(this.A02 + i);
        }
        return 0;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.2CP, java.lang.Object] */
    public AnonymousClass2CN() {
        AnonymousClass2CP r0 = AnonymousClass2CP.A00;
        AnonymousClass2CP r02 = r0;
        if (r0 == null) {
            ? obj = new Object();
            AnonymousClass2CP.A00 = obj;
            r02 = obj;
        }
        this.A03 = r02;
    }
}
