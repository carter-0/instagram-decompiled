package X;

/* renamed from: X.6F5  reason: invalid class name */
public final class AnonymousClass6F5 extends AnonymousClass6F6 {
    public final C3032668b A00;

    public final void DUK(Object obj) {
        if (this.A03) {
            return;
        }
        if (this.A00 != 0) {
            this.A04.DUK((Object) null);
            return;
        }
        try {
            Object apply = this.A00.apply(obj);
            1aP.A01(apply, "The mapper function returned a null value.");
            this.A04.DUK(apply);
        } catch (Throwable th) {
            A00(th);
        }
    }

    public final int EHR(int i) {
        AnonymousClass66o r1 = this.A01;
        if (r1 == null || (i & 4) != 0) {
            return 0;
        }
        int EHR = r1.EHR(i);
        if (EHR != 0) {
            this.A00 = EHR;
        }
        return EHR;
    }

    public final Object poll() {
        Object poll = this.A01.poll();
        if (poll == null) {
            return null;
        }
        Object apply = this.A00.apply(poll);
        1aP.A01(apply, "The mapper function returned a null value.");
        return apply;
    }

    public AnonymousClass6F5(1aL r1, C3032668b r2) {
        super(r1);
        this.A00 = r2;
    }
}
