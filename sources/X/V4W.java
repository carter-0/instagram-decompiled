package X;

public abstract class V4W {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;

    public final synchronized Long A01() {
        return this.A02;
    }

    public final synchronized Long A02() {
        return this.A03;
    }
}
