package X;

/* renamed from: X.Gpu  reason: case insensitive filesystem */
public final class C53524Gpu extends AnonymousClass0T0 implements C59496JLu {
    public final C266444Yx A00;
    public final C266444Yx A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53524Gpu) {
                C53524Gpu gpu = (C53524Gpu) obj;
                if (!0qQ.A0K(this.A01, gpu.A01) || !0qQ.A0K(this.A00, gpu.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A01) + AnonymousClass7TG.A0C(this.A00);
    }

    public C53524Gpu(C266444Yx r1, C266444Yx r2) {
        this.A01 = r1;
        this.A00 = r2;
    }
}
