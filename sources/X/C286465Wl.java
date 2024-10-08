package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5Wl  reason: invalid class name and case insensitive filesystem */
public abstract class C286465Wl implements C286475Wm {
    public Object A00;
    public final Object A01;
    public final List A02 = new ArrayList();

    public final void FJL() {
        List list = this.A02;
        if (!(!list.isEmpty())) {
            C18086VlG.A01("empty stack");
            throw AnonymousClass00P.createAndThrow();
        } else {
            this.A00 = list.remove(list.size() - 1);
        }
    }

    public C286465Wl(Object obj) {
        this.A01 = obj;
        this.A00 = obj;
    }
}
