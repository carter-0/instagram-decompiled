package X;

public final class GTZ implements C284855On {
    public static final GTZ A00 = new Object();

    public final C62320sa CNb(AnonymousClass54O r6) {
        if (r6.isAttachedToWindow()) {
            AnonymousClass07Z A002 = C71362ch.A00(r6);
            if (A002 != null) {
                return C52449GTb.A00(r6, A002.getLifecycle());
            }
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("View tree for ");
            A1A.append(r6);
            I2E.A02(AnonymousClass7TF.A0l(" has no ViewTreeLifecycleOwner", A1A));
            throw AnonymousClass00P.createAndThrow();
        }
        0rm A11 = C51965G9l.A11();
        GW4 gw4 = new GW4(0, A11, r6);
        r6.addOnAttachStateChangeListener(gw4);
        A11.A00 = new C58718IwR(20, (Object) gw4, (Object) r6);
        return new C13347TVu((Object) A11, 0);
    }
}
