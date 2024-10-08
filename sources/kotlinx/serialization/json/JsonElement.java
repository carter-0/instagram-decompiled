package kotlinx.serialization.json;

import X.C255463uA;
import kotlinx.serialization.Serializable;

@Serializable(with = JsonElementSerializer.class)
public abstract class JsonElement {
    public static final Companion Companion = new Object();

    public final class Companion {
        public final C255463uA serializer() {
            return JsonElementSerializer.A00;
        }
    }
}
