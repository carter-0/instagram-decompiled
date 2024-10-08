package X;

public final class Li7 implements C232262tL {
    public CharSequence A00 = "";
    public final int A01;
    public final Integer A02;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return Integer.valueOf(this.A01);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        Li7 li7 = (Li7) obj;
        0qQ.A0B(li7, 0);
        if (this.A01 != li7.A01 || !0qQ.A0K(this.A00, li7.A00) || !0qQ.A0K(this.A02, li7.A02)) {
            return false;
        }
        return true;
    }

    public Li7(int i, Integer num) {
        this.A01 = i;
        this.A02 = num;
    }
}
