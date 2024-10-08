package X;

/* renamed from: X.Mlt  reason: case insensitive filesystem */
public final class C67319Mlt implements Runnable {
    public final /* synthetic */ AnonymousClass50C A00;

    public C67319Mlt(AnonymousClass50C r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass50C r1 = this.A00;
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        r1.A0B.getNoteBubbleView().getTextView().invalidate();
        r1.A02.postDelayed(this, 16);
    }
}
