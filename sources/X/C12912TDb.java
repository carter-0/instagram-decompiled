package X;

/* renamed from: X.TDb  reason: case insensitive filesystem */
public final class C12912TDb implements Runnable {
    public final /* synthetic */ SSF A00;

    public C12912TDb(SSF ssf) {
        this.A00 = ssf;
    }

    public final void run() {
        Q7p q7p;
        SSF ssf = this.A00;
        if (ssf.A0D.get() != 0) {
            C345937uK r0 = ssf.A01;
            if (r0 != null) {
                r0.A02();
            }
            ssf.A01 = null;
            SSN ssn = ssf.A03;
            if (!(ssn == null || (q7p = ssn.A05) == null)) {
                q7p.sendEmptyMessage(4);
            }
            ssf.A03 = null;
        }
    }
}
