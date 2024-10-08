package X;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Qdw  reason: case insensitive filesystem */
public final class C7955Qdw extends C12327SrZ {
    public final /* synthetic */ AtomicReference A00;

    public final void D5E(List list) {
        0qQ.A0B(list, 0);
        if (list.size() != 1) {
            throw AnonymousClass7TE.A0z("we should have exactly one result");
        }
    }

    public final /* bridge */ /* synthetic */ void DDE(SJL sjl, Object obj) {
        0qQ.A0B(obj, 0);
        this.A00.set(obj);
    }

    public C7955Qdw(AtomicReference atomicReference) {
        this.A00 = atomicReference;
    }
}
