package X;

public final class Sk3 implements C13768Tgg {
    public final /* synthetic */ AnonymousClass07V A00;
    public final /* synthetic */ C10368Rr5 A01;

    public final void onStart() {
    }

    public final void onStop() {
    }

    public Sk3(AnonymousClass07V r1, C10368Rr5 rr5) {
        this.A01 = rr5;
        this.A00 = r1;
    }

    public final void onDestroy() {
        this.A01.A00.remove(this.A00);
    }
}
