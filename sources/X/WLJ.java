package X;

import java.util.concurrent.atomic.AtomicReference;

public final class WLJ implements C21046XBn {
    public boolean A00;
    public final X2v A01;
    public final C17793Vg5 A02;
    public final AtomicReference A03;

    /* JADX INFO: finally extract failed */
    public final void APd(Object obj) {
        if (!this.A00) {
            try {
                this.A00 = true;
                AtomicReference atomicReference = this.A03;
                atomicReference.set(this.A01.EB6(atomicReference.get(), obj));
                this.A00 = false;
                this.A02.A00();
            } catch (Throwable th) {
                this.A00 = false;
                throw th;
            }
        } else {
            throw new RuntimeException("Cannot dispatch in a reducer");
        }
    }

    public final Object getState() {
        return this.A03.get();
    }

    public WLJ(X2v x2v, C17793Vg5 vg5, Object obj) {
        this.A03 = new AtomicReference(obj);
        this.A02 = vg5;
        this.A01 = x2v;
    }
}
