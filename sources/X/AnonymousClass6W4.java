package X;

import com.instagram.model.direct.DirectThreadKey;
import java.util.Collection;
import java.util.List;

/* renamed from: X.6W4  reason: invalid class name */
public abstract class AnonymousClass6W4 {
    public static final C254763t0 A00(C254773t1 r1) {
        if (r1 instanceof C254763t0) {
            return (C254763t0) r1;
        }
        return null;
    }

    public static final DirectThreadKey A01(C254773t1 r2) {
        if (r2 instanceof C254763t0) {
            return new DirectThreadKey(((C254763t0) r2).A00, (List) null);
        }
        if (r2 instanceof C291175gg) {
            return new DirectThreadKey((Collection) ((C291175gg) r2).A00);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected DirectThreadTarget: ");
        sb.append(r2);
        throw new IllegalStateException(sb.toString());
    }
}
