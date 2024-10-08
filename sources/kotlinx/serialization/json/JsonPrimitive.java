package kotlinx.serialization.json;

import X.C255463uA;
import kotlinx.serialization.Serializable;

@Serializable(with = JsonPrimitiveSerializer.class)
public abstract class JsonPrimitive extends JsonElement {
    public static final Companion Companion = new Object();

    public final class Companion {
        public final C255463uA serializer() {
            return JsonPrimitiveSerializer.A01;
        }
    }

    public abstract String A00();

    public String toString() {
        return A00();
    }
}
