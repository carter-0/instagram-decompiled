package X;

import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.4fH  reason: invalid class name and case insensitive filesystem */
public final class C269534fH {
    public final HashMap A00 = new HashMap(64);
    public final AtomicReference A01 = new AtomicReference();

    public final JsonSerializer A00(C268894eF r3) {
        JsonSerializer jsonSerializer;
        synchronized (this) {
            jsonSerializer = (JsonSerializer) this.A00.get(new AnonymousClass5EE(r3));
        }
        return jsonSerializer;
    }

    public final JsonSerializer A01(Class cls) {
        JsonSerializer jsonSerializer;
        synchronized (this) {
            jsonSerializer = (JsonSerializer) this.A00.get(new AnonymousClass5EE(cls, false));
        }
        return jsonSerializer;
    }
}
