package X;

import com.instagram.direct.capabilities.Capabilities;

/* renamed from: X.7Ub  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C332207Ub extends 016 {
    public C332207Ub(Object obj) {
        super(AnonymousClass7TI.class, obj, "_capabilities", "get_capabilities()Lcom/instagram/direct/capabilities/Capabilities;");
    }

    public final Object get() {
        Capabilities capabilities = ((AnonymousClass7TI) this.receiver).A06;
        if (capabilities != null) {
            return capabilities;
        }
        0qQ.A0F("_capabilities");
        throw AnonymousClass00P.createAndThrow();
    }
}
