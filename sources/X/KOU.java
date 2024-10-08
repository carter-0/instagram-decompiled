package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class KOU extends LSR {
    public AnonymousClass3Q2 A00;
    public final LRK A01;
    public final AnonymousClass0r6 A02;
    public final 05G A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KOU(LRK lrk) {
        super(lrk);
        0qQ.A0B(lrk, 1);
        this.A01 = lrk;
        02z A10 = DbS.A10(new C61080JwI((C59721JVf) null, (DefaultConstructorMarker) null, 1, 43));
        this.A03 = A10;
        this.A02 = A10;
    }

    public final AnonymousClass3Q2 A0A() {
        AnonymousClass3Q2 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("pendingMedia");
        throw AnonymousClass00P.createAndThrow();
    }
}
