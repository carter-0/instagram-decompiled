package X;

/* renamed from: X.Aob  reason: case insensitive filesystem */
public final class C41115Aob implements Runnable {
    public final /* synthetic */ C382309dU A00;
    public final /* synthetic */ C39676A4s A01;
    public final /* synthetic */ C341667nK A02;

    public C41115Aob(C382309dU r1, C39676A4s a4s, C341667nK r3) {
        this.A02 = r3;
        this.A01 = a4s;
        this.A00 = r1;
    }

    public final void run() {
        C349257zq.A03("onFirstDataWrittenToFileError");
        C39676A4s a4s = this.A01;
        C382309dU r0 = this.A00;
        C341627nG r1 = a4s.A01;
        r1.A04(r0);
        r1.A06(a4s.A00);
    }
}
