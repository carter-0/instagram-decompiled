package X;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.S0w  reason: case insensitive filesystem */
public final class C10919S0w {
    public final C13510Tbb A00;
    public final AtomicBoolean A01 = JTQ.A0k();

    public final C13809Thc A00(Object... objArr) {
        Constructor constructor;
        AtomicBoolean atomicBoolean = this.A01;
        synchronized (atomicBoolean) {
            if (!atomicBoolean.get()) {
                try {
                    constructor = this.A00.Aq7();
                } catch (ClassNotFoundException unused) {
                    atomicBoolean.set(true);
                } catch (Exception e) {
                    throw Pxe.A0u("Error instantiating extension", e);
                }
            }
            constructor = null;
        }
        if (constructor == null) {
            return null;
        }
        try {
            return (C13809Thc) constructor.newInstance(objArr);
        } catch (Exception e2) {
            throw Pxe.A0j("Unexpected error creating extractor", e2);
        }
    }

    public C10919S0w(C13510Tbb tbb) {
        this.A00 = tbb;
    }
}
