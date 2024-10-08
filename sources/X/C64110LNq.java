package X;

import java.util.List;

/* renamed from: X.LNq  reason: case insensitive filesystem */
public final class C64110LNq {
    public final /* synthetic */ 1IX A00;
    public final /* synthetic */ boolean A01;

    public C64110LNq(1IX r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public final void A00(Object obj, List list) {
        1IX r1 = this.A00;
        Object obj2 = null;
        Object obj3 = obj;
        if (this.A01) {
            obj3 = null;
            obj2 = obj;
        }
        r1.resumeWith(new C63922LDd(obj3, obj2, list, AnonymousClass972.MUTABLE_FLAG_MASK, AnonymousClass972.MUTABLE_FLAG_MASK));
    }

    public C64110LNq() {
    }
}
