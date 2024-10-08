package X;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

public final class R2H extends TypeAdapter {
    public final /* synthetic */ Gson A00;
    public final /* synthetic */ 2G5 A01;
    public final /* synthetic */ TypeToken A02;

    public R2H(Gson gson, 2G5 r2, TypeToken typeToken) {
        this.A01 = r2;
        this.A00 = gson;
        this.A02 = typeToken;
    }

    public final Object read(JsonReader jsonReader) {
        jsonReader.A0R();
        return null;
    }

    public final void write(JsonWriter jsonWriter, Object obj) {
        jsonWriter.A0A();
    }
}
