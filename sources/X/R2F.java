package X;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

public final class R2F extends TypeAdapter {
    public final /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
        if (obj == null) {
            jsonWriter.A0A();
        } else {
            jsonWriter.A0H(obj.toString());
        }
    }

    public final /* bridge */ /* synthetic */ Object read(JsonReader jsonReader) {
        if (jsonReader.A0G() != AnonymousClass05K.A1F) {
            return Long.valueOf(jsonReader.A0F());
        }
        jsonReader.A0Q();
        return null;
    }
}
