package X;

public final class AD7 {
    public Float A00;
    public Float A01;
    public Integer A02;
    public String A03;
    public String A04;

    public AD7(Float f, Float f2, Integer num, String str) {
        this.A01 = f;
        this.A00 = f2;
        this.A03 = str;
        this.A02 = num;
        this.A04 = null;
    }

    public AD7() {
        this((Float) null, (Float) null, (Integer) null, (String) null);
    }
}
