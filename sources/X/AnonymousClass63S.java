package X;

import android.content.Context;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

@Deprecated
/* renamed from: X.63S  reason: invalid class name */
public abstract class AnonymousClass63S {
    public static final Set A00 = Collections.newSetFromMap(new WeakHashMap());

    public Context A03() {
        return ((AnonymousClass63R) this).A00.A01;
    }

    public Looper A04() {
        return ((AnonymousClass63R) this).A00.A02;
    }

    public C8412Qts A06(C8412Qts qts) {
        AnonymousClass63E.A01(((AnonymousClass63R) this).A00, qts, 0);
        return qts;
    }

    public C8412Qts A07(C8412Qts qts) {
        AnonymousClass63E.A01(((AnonymousClass63R) this).A00, qts, 1);
        return qts;
    }

    public AnonymousClass647 A05(AnonymousClass63G r2) {
        throw new UnsupportedOperationException();
    }

    public void A08() {
        throw new UnsupportedOperationException("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
    }

    public void A09() {
        throw new UnsupportedOperationException("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
    }

    public void A0A() {
        throw new UnsupportedOperationException();
    }

    public void A0B(AnonymousClass63y r3) {
        throw new UnsupportedOperationException("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
    }

    public void A0C(AnonymousClass63y r3) {
        throw new UnsupportedOperationException("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
    }

    public void A0D(AnonymousClass640 r3) {
        throw new UnsupportedOperationException("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
    }

    public boolean A0F() {
        throw new UnsupportedOperationException("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
    }

    public boolean A0G(C13469Taw taw) {
        throw new UnsupportedOperationException();
    }

    public void A0E(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        throw AnonymousClass00P.createAndThrow();
    }
}
