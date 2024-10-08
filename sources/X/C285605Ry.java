package X;

/* renamed from: X.5Ry  reason: invalid class name and case insensitive filesystem */
public final class C285605Ry {
    public static final long A01 = C285615Rz.A00(0.5f, 0.5f);
    public final long A00;

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof C285605Ry) || j != ((C285605Ry) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return 002.A0K("TransformOrigin(packedValue=", ')', this.A00);
    }

    public /* synthetic */ C285605Ry(long j) {
        this.A00 = j;
    }
}
