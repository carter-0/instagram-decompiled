package X;

import java.util.List;

public final class IIY implements C59606JQa {
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
            C59606JQa jQa = this.A03[this.A00];
            if (jQa.isActive()) {
                jQa.cancel();
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
            this.A01 = true;
            jQaArr[this.A00].start();
            return;
        }
        throw AnonymousClass7TE.A0z("start() called more than once");
    }

    public IIY(C59606JQa[] jQaArr) {
        this.A03 = jQaArr;
        int i = 0;
        do {
            jQaArr[i].A8x(new IIZ(this, 1));
            i++;
        } while (i < 2);
    }
}
