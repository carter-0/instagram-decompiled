package X;

import com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder;

/* renamed from: X.FEy  reason: case insensitive filesystem */
public final class C49923FEy {
    public final /* synthetic */ HandlerExecutorAndBuilder A00;

    public C49923FEy(HandlerExecutorAndBuilder handlerExecutorAndBuilder) {
        this.A00 = handlerExecutorAndBuilder;
    }

    public static C49662F0t A00(C49923FEy fEy) {
        return (C49662F0t) fEy.A03(new 0Yh(C49662F0t.class));
    }

    public static Object A01(C49923FEy fEy, Class cls) {
        return fEy.A03(new 0Yh(cls));
    }

    public final Object A02() {
        C49718F3e f3e = this.A00.A00;
        if (f3e != null) {
            if (f3e.A01) {
                Object obj = f3e.A00;
                if (obj != null) {
                    return obj;
                }
            } else {
                throw AnonymousClass7TE.A0z("DeferredActionValue not resolved. Have you called it outside of an action execution block?");
            }
        }
        throw AnonymousClass7TE.A0z("No action results have been labeled as return type. Have you used construct HandlerConfig.returns{ ... }");
    }

    public final Object A03(C62230ry r3) {
        Object obj = this.A00.A06.get(r3);
        0qQ.A0C(obj, "null cannot be cast to non-null type T of com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder.InnerHandlerContext.get");
        return obj;
    }
}
