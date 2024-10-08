package X;

public final class M81 implements Runnable {
    public final /* synthetic */ C60250Ji7 A00;
    public final /* synthetic */ String A01;

    public M81(C60250Ji7 ji7, String str) {
        this.A00 = ji7;
        this.A01 = str;
    }

    public final void run() {
        C60250Ji7 ji7 = this.A00;
        AnonymousClass2Fj r1 = ji7.A0B;
        String str = this.A01;
        r1.A0B(str);
        C62122KaY kaY = new C62122KaY(str);
        05G r12 = ji7.A0H;
        ji7.A00 = (C62874Kno) r12.getValue();
        r12.Epw(kaY);
    }
}
