package X;

/* renamed from: X.AmX  reason: case insensitive filesystem */
public final class C40987AmX implements Runnable {
    public final /* synthetic */ C334997cD A00;
    public final /* synthetic */ C334027aY A01;

    public C40987AmX(C334997cD r1, C334027aY r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        try {
            this.A00.A02(AnonymousClass05K.A0N, ((C335537d7) this.A01).A01);
        } catch (IllegalArgumentException unused) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Error processing ui action ");
            0KC.A0C("CommentListComponent", AnonymousClass7TF.A0i(this.A01, A1A));
        }
    }
}
