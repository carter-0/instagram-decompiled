package X;

import com.google.common.collect.ImmutableList;

public final class SHL {
    public final int A00;
    public final ImmutableList A01;
    public final String A02;
    public final Throwable A03;

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Throwable, X.TRO] */
    public final Throwable A01() {
        ? th = new Throwable((String) null);
        th.A00 = this;
        Throwable th2 = this.A03;
        if (th2 != null) {
            A00(th2, th);
            return th2;
        }
        String str = this.A02;
        if (str != null) {
            TRQ trq = new TRQ(this, str);
            A00(trq, th);
            return trq;
        }
        TRQ trq2 = new TRQ(this, 002.A0O("Remote error code ", this.A00));
        A00(trq2, th);
        return trq2;
    }

    public SHL(ImmutableList immutableList, String str, Throwable th, int i) {
        this.A00 = i;
        this.A03 = th;
        this.A02 = str;
        this.A01 = immutableList;
    }

    public static final void A00(Throwable th, Throwable th2) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        if (th.getClass() != th2.getClass()) {
            try {
                th.initCause(th2);
            } catch (IllegalStateException e) {
                C9153RRe.A00(e, th2);
            }
        }
    }
}
