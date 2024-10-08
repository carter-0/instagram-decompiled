package X;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/* renamed from: X.4iA  reason: invalid class name */
public final class AnonymousClass4iA extends C269044eU {
    public final C269134ed A02(C269454f9 r3, C268894eF r4, C269124ec r5) {
        C269134ed A00 = C269044eU.A00(r4, (C269144ee) null);
        if (A00 != null) {
            return A00;
        }
        JsonDeserialize jsonDeserialize = (JsonDeserialize) r4.A00.getAnnotation(JsonDeserialize.class);
        if (jsonDeserialize == null || jsonDeserialize.using() == null) {
            return super.A02(r3, r4, r5);
        }
        return A05(r4, r3, r5);
    }

    public final C269134ed A03(C268894eF r3, C269294et r4, C269124ec r5) {
        C269134ed A00 = C269044eU.A00(r3, (C269144ee) null);
        if (A00 != null) {
            return A00;
        }
        JsonSerialize jsonSerialize = (JsonSerialize) r3.A00.getAnnotation(JsonSerialize.class);
        if (jsonSerialize == null || jsonSerialize.using() == null) {
            return super.A03(r3, r4, r5);
        }
        return A05(r3, r4, r5);
    }
}
