package X;

/* renamed from: X.Wm6  reason: case insensitive filesystem */
public final class C20146Wm6 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ U7x A01;

    public C20146Wm6(U7x u7x, int i) {
        this.A01 = u7x;
        this.A00 = i;
    }

    public final void run() {
        C380369Xs r1 = this.A01.A02;
        if (r1 == null) {
            0qQ.A0F("cameraPreview");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r1.setVisibility(this.A00);
        }
    }
}
