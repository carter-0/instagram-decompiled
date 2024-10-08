package X;

/* renamed from: X.TAx  reason: case insensitive filesystem */
public final /* synthetic */ class C12857TAx implements Runnable {
    public final /* synthetic */ Q6Y A00;

    public /* synthetic */ C12857TAx(Q6Y q6y) {
        this.A00 = q6y;
    }

    public final void run() {
        Q6Y q6y = this.A00;
        C7492QGj qGj = q6y.A0L;
        if (qGj != null) {
            try {
                q6y.A0f.acquire();
                qGj.A0A(q6y.A0c.A00());
            } catch (InterruptedException unused) {
            } catch (Throwable th) {
                q6y.A0f.release();
                throw th;
            }
            q6y.A0f.release();
        }
    }
}
