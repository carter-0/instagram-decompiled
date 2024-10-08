package X;

import com.facebook.cameracore.util.Reference;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ASI implements Reference {
    public final ASJ A00;
    public final AtomicBoolean A01 = new AtomicBoolean(false);

    public final void finalize() {
        if (!this.A01.getAndSet(true)) {
            this.A00.release();
        }
    }

    public final Object get() {
        if (!this.A01.get()) {
            return this.A00.get();
        }
        throw AnonymousClass7TE.A0z("Accessing released reference.");
    }

    public final void release() {
        if (!this.A01.getAndSet(true)) {
            this.A00.release();
            return;
        }
        throw AnonymousClass7TE.A0z("Reference was already released.");
    }

    public ASI(ASJ asj) {
        this.A00 = asj;
    }
}
