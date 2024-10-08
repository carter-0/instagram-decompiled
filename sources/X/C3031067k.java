package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.67k  reason: invalid class name and case insensitive filesystem */
public final class C3031067k extends AtomicReference implements C65051aA {
    public final void dispose() {
        C3030967j r0;
        if (get() != null && (r0 = (C3030967j) getAndSet((Object) null)) != null) {
            try {
                r0.A00.cancel();
            } catch (Exception e) {
                C9877Riq.A00(e);
                C318176oW.A01(e);
            }
        }
    }
}
