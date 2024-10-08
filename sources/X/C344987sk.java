package X;

import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.7sk  reason: invalid class name and case insensitive filesystem */
public final class C344987sk implements C344997sl {
    public final C344977sj A00;
    public final ConcurrentLinkedQueue A01 = new ConcurrentLinkedQueue();

    public final ASJ A00() {
        ASJ asj = (ASJ) this.A01.poll();
        if (asj == null) {
            return new ASJ(this, this.A00.AKx());
        }
        if (asj.A02.compareAndSet(0, 1)) {
            return asj;
        }
        throw new IllegalStateException("Can only reset a previously released reference.");
    }

    public final void Dd1(ASJ asj, Object obj) {
        this.A00.Dd7(obj);
        this.A01.offer(asj);
    }

    public C344987sk(C344977sj r2) {
        this.A00 = r2;
    }
}
