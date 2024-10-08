package X;

/* renamed from: X.QQs  reason: case insensitive filesystem */
public final class C7626QQs extends C7616QQg implements C13943Tlp {
    public final long A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C7626QQs) || !super.equals(obj)) {
                return false;
            }
            C7626QQs qQs = (C7626QQs) obj;
            if (!(this.A00 == qQs.A00 && this.A01 == qQs.A01)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7626QQs(C10739RxI rxI, C11000S4u s4u) {
        super(s4u);
        long j = rxI.A00;
        long j2 = rxI.A01;
        this.A00 = j;
        this.A01 = j2;
    }

    public final int hashCode() {
        return Pxf.A0B(Integer.valueOf(super.hashCode()), Long.valueOf(this.A00), Long.valueOf(this.A01));
    }
}
