package X;

/* renamed from: X.9Ve  reason: invalid class name and case insensitive filesystem */
public final class C379759Ve implements Runnable {
    public final /* synthetic */ C379749Vd A00;
    public final /* synthetic */ C379739Vc A01;

    public C379759Ve(C379749Vd r1, C379739Vc r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        try {
            C379739Vc r2 = this.A01;
            r2.A00.A00(r2.A01(this.A00));
        } catch (C3727292d e) {
            this.A01.A00.A02(new C268674do(new AnonymousClass9JA((Integer) null, e.getMessage(), "ParsingException", false)));
        }
    }
}
