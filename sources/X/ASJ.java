package X;

import com.facebook.cameracore.util.Reference;
import java.util.concurrent.atomic.AtomicInteger;

public final class ASJ implements Reference {
    public C344997sl A00;
    public Object A01;
    public final AtomicInteger A02 = new AtomicInteger(1);

    public final ASI A00() {
        int i = 0;
        do {
            AtomicInteger atomicInteger = this.A02;
            int i2 = atomicInteger.get();
            if (i2 == 0) {
                throw AnonymousClass7TE.A0z("Trying to lock already released reference.");
            } else if (atomicInteger.compareAndSet(i2, i2 + 1)) {
                return new ASI(this);
            } else {
                i++;
            }
        } while (i < 10);
        throw AnonymousClass7TE.A15("WTF: Could not lock the reference after multiple tries.");
    }

    public final void release() {
        int i = 0;
        do {
            AtomicInteger atomicInteger = this.A02;
            int i2 = atomicInteger.get();
            if (i2 == 0) {
                throw AnonymousClass7TE.A0z("Too many calls to CountedReference#release");
            } else if (!atomicInteger.compareAndSet(i2, i2 - 1)) {
                i++;
            } else if (i2 == 1) {
                this.A00.Dd1(this, this.A01);
                return;
            } else {
                return;
            }
        } while (i < 10);
        throw AnonymousClass7TE.A15("WTF: Could not release the reference after multiple tries.");
    }

    public final void finalize() {
        if (this.A02.getAndSet(0) > 0) {
            this.A00.Dd1(this, this.A01);
        }
    }

    public final Object get() {
        if (this.A02.get() > 0) {
            return this.A01;
        }
        throw AnonymousClass7TE.A0z("Accessing released reference.");
    }

    public ASJ(C344997sl r3, Object obj) {
        this.A01 = obj;
        this.A00 = r3;
    }

    public ASJ(Reference reference) {
        this.A01 = reference.get();
        this.A00 = new ASN(reference, this);
    }
}
