package X;

import java.io.Serializable;
import java.util.Iterator;

/* renamed from: X.SuW  reason: case insensitive filesystem */
public final class C12440SuW implements C269764fe, Serializable {
    public final C268894eF A00;
    public final C269434f7 A01;

    public final Object BWm(C269674fV r4) {
        C269434f7 r2 = this.A01;
        String str = "<UNKNOWN>";
        Iterator it = C269574fL.A00;
        if (r2 != null) {
            str = String.format("\"%s\"", new Object[]{r2});
        }
        throw new C8195Qk2(r4, r2, String.format("Invalid `null` value encountered for property %s", new Object[]{str}));
    }

    public C12440SuW(C268894eF r1, C269434f7 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* synthetic */ Object AXg(C269674fV r2) {
        BWm(r2);
        throw AnonymousClass00P.createAndThrow();
    }
}
