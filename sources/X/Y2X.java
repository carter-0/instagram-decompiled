package X;

public final class Y2X implements Runnable {
    public final /* synthetic */ Y7C A00;
    public final /* synthetic */ String A01;

    public Y2X(Y7C y7c, String str) {
        this.A00 = y7c;
        this.A01 = str;
    }

    public final void run() {
        this.A00.A01.didReceiveMessage(this.A01);
    }
}
