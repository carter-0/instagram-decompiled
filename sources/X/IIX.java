package X;

import java.util.List;

public final class IIX implements C59606JQa {
    public int A00;
    public boolean A01;
    public final List A02 = AnonymousClass7TE.A1C();
    public final C59606JQa[] A03;

    public final void A8x(C59536JNi jNi) {
        List list = this.A02;
        if (!list.contains(jNi)) {
            list.add(jNi);
        }
    }

    public final void cancel() {
        if (this.A01) {
            this.A01 = false;
            for (C59606JQa jQa : this.A03) {
                if (jQa.isActive()) {
                    jQa.cancel();
                }
            }
            for (C59536JNi DFc : this.A02) {
                DFc.DFc(true);
            }
            this.A01 = false;
            this.A00 = 0;
        }
    }

    public final boolean isActive() {
        return this.A01;
    }

    public final void start() {
        if (!this.A01) {
            C59606JQa[] jQaArr = this.A03;
            int length = jQaArr.length;
            if (length == 0) {
                throw AnonymousClass7TE.A0w("Empty animators collection");
            }
            this.A01 = true;
            int i = 0;
            do {
                jQaArr[i].start();
                i++;
            } while (i < length);
            return;
        }
        throw AnonymousClass7TE.A0z("start() called more than once");
    }

    public IIX(C59606JQa[] jQaArr) {
        this.A03 = jQaArr;
        for (C59606JQa A8x : jQaArr) {
            A8x.A8x(new IIZ(this, 0));
        }
    }
}
