package X;

public final class Q1O {
    public final Long A00;
    public final Long A01;
    public final Long A02;
    public final String A03;

    public Q1O(C13819Thn thn, String str) {
        this.A03 = str;
        long[] itemInformation = thn.getItemInformation(str);
        this.A02 = Long.valueOf(itemInformation[0]);
        this.A01 = Long.valueOf(itemInformation[1]);
        this.A00 = Long.valueOf(itemInformation[2]);
    }
}
