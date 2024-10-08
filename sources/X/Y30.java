package X;

public final class Y30 implements Runnable {
    public final Y1V A00;
    public final /* synthetic */ XQJ A01;

    public Y30(Y1V y1v, XQJ xqj) {
        this.A01 = xqj;
        this.A00 = y1v;
    }

    public final void run() {
        Y1V y1v = this.A00;
        y1v.A03 = true;
        this.A01.A00.remove(y1v);
    }
}
