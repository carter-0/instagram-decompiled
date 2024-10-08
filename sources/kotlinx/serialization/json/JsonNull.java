package kotlinx.serialization.json;

import X.0eO;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.C20404Wqo;
import kotlinx.serialization.Serializable;

@Serializable(with = JsonNullSerializer.class)
public final class JsonNull extends JsonPrimitive {
    public static final JsonNull A00 = new Object();
    public static final /* synthetic */ AnonymousClass0eM A01 = AnonymousClass0eN.A00(0eO.A03, new C20404Wqo(10));

    public final String A00() {
        return "null";
    }
}
