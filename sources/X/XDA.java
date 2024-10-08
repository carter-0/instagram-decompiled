package X;

public final class XDA extends AnonymousClass6F6 {
    public Object A00;
    public boolean A01;
    public final 1aR A02;
    public final C3032668b A03;

    public final void DUK(Object obj) {
        if (!this.A03) {
            if (this.A00 == 0) {
                try {
                    Object apply = this.A03.apply(obj);
                    if (this.A01) {
                        boolean Ezf = this.A02.Ezf(this.A00, apply);
                        this.A00 = apply;
                        if (Ezf) {
                            return;
                        }
                    } else {
                        this.A01 = true;
                        this.A00 = apply;
                    }
                } catch (Throwable th) {
                    A00(th);
                    return;
                }
            }
            this.A04.DUK(obj);
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
        Object poll;
        Object apply;
        while (true) {
            poll = this.A01.poll();
            if (poll != null) {
                apply = this.A03.apply(poll);
                if (this.A01) {
                    if (!this.A02.Ezf(this.A00, apply)) {
                        break;
                    }
                    this.A00 = apply;
                } else {
                    this.A01 = true;
                    break;
                }
            } else {
                return null;
            }
        }
        this.A00 = apply;
        return poll;
    }

    public XDA(1aL r1, 1aR r2, C3032668b r3) {
        super(r1);
        this.A03 = r3;
        this.A02 = r2;
    }
}
