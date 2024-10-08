package X;

public final class Ou7 implements C232262tL {
    public final int A00;
    public final CharSequence A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final Integer A06;
    public final Integer A07;

    public Ou7(CharSequence charSequence, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i) {
        0qQ.A0B(charSequence, 1);
        this.A01 = charSequence;
        this.A00 = i;
        this.A07 = num;
        this.A02 = num2;
        this.A04 = num3;
        this.A03 = num4;
        this.A05 = num5;
        this.A06 = num6;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01.toString();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        Ou7 ou7 = (Ou7) obj;
        0qQ.A0B(ou7, 0);
        if (!0qQ.A0K(this.A01, ou7.A01) || this.A00 != ou7.A00 || !0qQ.A0K(this.A07, ou7.A07) || !0qQ.A0K(this.A02, ou7.A02) || !0qQ.A0K(this.A04, ou7.A04) || !0qQ.A0K(this.A03, ou7.A03)) {
            return false;
        }
        return true;
    }
}
