package X;

import com.fasterxml.jackson.databind.JsonSerializer;
import java.io.Serializable;

/* renamed from: X.Qko  reason: case insensitive filesystem */
public final class C8241Qko extends C8244Qkx implements Serializable {
    public final C8244Qkx A00;
    public final Class A01;

    public C8241Qko(C8244Qkx qkx, Class cls) {
        super(qkx.A04, qkx);
        this.A00 = qkx;
        this.A01 = cls;
    }

    public final void A02(17Z r3, C269504fE r4, Object obj) {
        Class cls = r4.A07;
        if (cls == null || this.A01.isAssignableFrom(cls)) {
            this.A00.A02(r3, r4, obj);
        } else {
            16H r0 = 17Z.A01;
        }
    }

    public final void A04(JsonSerializer jsonSerializer) {
        this.A00.A04(jsonSerializer);
    }
}
