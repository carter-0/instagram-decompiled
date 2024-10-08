package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.6FN  reason: invalid class name */
public final class AnonymousClass6FN implements YCO {
    public final AtomicReference A00 = new AtomicReference();
    public final AtomicReference A01 = new AtomicReference();

    public final boolean isEmpty() {
        if (this.A00.get() == this.A01.get()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.6FO, java.lang.Object, java.util.concurrent.atomic.AtomicReference] */
    public final boolean offer(Object obj) {
        if (obj != null) {
            ? atomicReference = new AtomicReference();
            atomicReference.A00 = obj;
            ((AtomicReference) this.A01.getAndSet(atomicReference)).lazySet(atomicReference);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public final Object poll() {
        AtomicReference atomicReference = this.A00;
        AtomicReference atomicReference2 = (AtomicReference) atomicReference.get();
        AnonymousClass6FO r2 = (AnonymousClass6FO) atomicReference2.get();
        if (r2 != null) {
            Object obj = r2.A00;
            r2.A00 = null;
            atomicReference.lazySet(r2);
        } else if (atomicReference2 == this.A01.get()) {
            return null;
        } else {
            do {
                r2 = (AnonymousClass6FO) atomicReference2.get();
            } while (r2 == null);
        }
        Object obj2 = r2.A00;
        r2.A00 = null;
        atomicReference.lazySet(r2);
        return obj2;
    }

    public AnonymousClass6FN() {
        AtomicReference atomicReference = new AtomicReference();
        this.A00.lazySet(atomicReference);
        this.A01.getAndSet(atomicReference);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000a, LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void clear() {
        /*
            r1 = this;
        L_0x0000:
            java.lang.Object r0 = r1.poll()
            if (r0 == 0) goto L_0x000d
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x000d
            goto L_0x0000
        L_0x000d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6FN.clear():void");
    }
}
