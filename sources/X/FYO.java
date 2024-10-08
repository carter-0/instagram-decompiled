package X;

public final class FYO implements C232262tL {
    public final 16V A00;
    public final String A01;
    public final String A02;

    /* renamed from: A00 */
    public final boolean isContentSame(FYO fyo) {
        String str;
        String str2 = this.A01;
        if (fyo != null) {
            str = fyo.A01;
        } else {
            str = null;
        }
        if (!0qQ.A0K(str2, str) || !0qQ.A0K(this.A02, fyo.A02)) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public FYO(16V r1, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = r1;
    }
}
