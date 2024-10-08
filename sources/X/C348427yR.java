package X;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7yR  reason: invalid class name and case insensitive filesystem */
public final class C348427yR extends JsonWriter {
    public static final JsonPrimitive A03 = new JsonPrimitive("closed");
    public static final Writer A04 = new RD8();
    public JsonElement A00 = R2D.A00;
    public String A01;
    public final List A02 = new ArrayList();

    public C348427yR() {
        super(A04);
    }

    public static void A00(JsonElement jsonElement, C348427yR r3) {
        if (r3.A01 != null) {
            if (!(jsonElement instanceof R2D) || r3.A05) {
                List list = r3.A02;
                ((JsonObject) ((JsonElement) list.get(list.size() - 1))).add(r3.A01, jsonElement);
            }
            r3.A01 = null;
            return;
        }
        List list2 = r3.A02;
        if (list2.isEmpty()) {
            r3.A00 = jsonElement;
            return;
        }
        JsonElement jsonElement2 = (JsonElement) list2.get(list2.size() - 1);
        if (jsonElement2 instanceof JsonArray) {
            ((JsonArray) jsonElement2).add(jsonElement);
            return;
        }
        throw new IllegalStateException();
    }
}
