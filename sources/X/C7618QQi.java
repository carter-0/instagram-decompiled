package X;

/* renamed from: X.QQi  reason: case insensitive filesystem */
public class C7618QQi extends C12172SoN implements C13941Tln {
    public final int A00;
    public final long A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C13941Tln) || !super.equals(obj)) {
                return false;
            }
            C7618QQi qQi = (C7618QQi) ((C13941Tln) obj);
            if (!(this.A01 == qQi.A01 && this.A00 == qQi.A00 && this.A02.equals(qQi.A02))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7618QQi(C10550Ru4 ru4, C11000S4u s4u) {
        super(s4u);
        int i = ru4.A00;
        String str = ru4.A02;
        long j = ru4.A01;
        this.A01 = j;
        this.A00 = i;
        this.A02 = str;
    }

    public int hashCode() {
        return Pxh.A0A(Integer.valueOf(super.hashCode()), Long.valueOf(this.A01), Integer.valueOf(this.A00), this.A02);
    }
}
