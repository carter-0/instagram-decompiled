package X;

public final class AD8 {
    public final Boolean A00;
    public final Float A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;

    public AD8(Boolean bool, Float f, Integer num, Integer num2, Integer num3, Integer num4) {
        this.A05 = num;
        this.A04 = num2;
        this.A01 = f;
        this.A00 = bool;
        this.A03 = num3;
        this.A02 = num4;
    }

    public AD8() {
        this((Boolean) null, (Float) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null);
    }
}
