package X;

public final class TIS implements Runnable {
    public final /* synthetic */ S6T A00;
    public final /* synthetic */ QLA A01;
    public final /* synthetic */ String A02;

    public TIS(S6T s6t, QLA qla, String str) {
        this.A01 = qla;
        this.A02 = str;
        this.A00 = s6t;
    }

    public final void run() {
        this.A01.A0E(this.A00.A03, this.A02, false);
    }
}
