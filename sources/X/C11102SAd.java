package X;

import android.util.JsonReader;
import android.util.JsonToken;

/* renamed from: X.SAd  reason: case insensitive filesystem */
public final class C11102SAd {
    public static final void A00(JsonReader jsonReader, 0xF r4, C11102SAd sAd) {
        Object obj;
        if (jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                JsonToken peek = jsonReader.peek();
                if (peek != null) {
                    int A08 = Pxe.A08(peek, A2Z.A00);
                    if (A08 == 1) {
                        obj = Double.valueOf(jsonReader.nextDouble());
                    } else if (A08 == 2) {
                        obj = jsonReader.nextString();
                    } else if (A08 == 3) {
                        obj = Boolean.valueOf(jsonReader.nextBoolean());
                    } else if (A08 == 4) {
                        0xF r0 = new 0xF();
                        A00(jsonReader, r0, sAd);
                        0xF.A00(r4, r0, nextName);
                    }
                    0xF.A00(r4, obj, nextName);
                }
                jsonReader.skipValue();
            }
            jsonReader.endObject();
        }
    }
}
