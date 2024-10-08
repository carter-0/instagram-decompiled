package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* renamed from: X.4hu  reason: invalid class name and case insensitive filesystem */
public final class C271104hu {
    public final Map A00 = new LinkedHashMap();

    public final void A01(String str, JsonElement jsonElement) {
        0qQ.A0B(str, 0);
        0qQ.A0B(jsonElement, 1);
        this.A00.put(str, jsonElement);
    }

    public final JsonObject A00() {
        return new JsonObject(this.A00);
    }
}
