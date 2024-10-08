package X;

/* renamed from: X.PYo  reason: case insensitive filesystem */
public final class C73210PYo implements Runnable {
    public final /* synthetic */ AnonymousClass4AE A00;
    public final /* synthetic */ Integer A01;

    public C73210PYo(AnonymousClass4AE r1, Integer num) {
        this.A01 = num;
        this.A00 = r1;
    }

    public final void run() {
        switch (this.A01.intValue()) {
            case 1:
            case 2:
            case 3:
            case 7:
            case 8:
            case 9:
            case 10:
                return;
            default:
                AnonymousClass4AE r0 = this.A00;
                if (r0 != null) {
                    r0.A00();
                    return;
                }
                return;
        }
    }
}
