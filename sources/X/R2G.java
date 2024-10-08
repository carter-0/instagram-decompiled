package X;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

public final class R2G extends TypeAdapter {
    public final /* synthetic */ 2Gc A00;
    public final /* synthetic */ Class A01;

    public R2G(2Gc r1, Class cls) {
        this.A00 = r1;
        this.A01 = cls;
    }

    public final Object read(JsonReader jsonReader) {
        Object read = this.A00.A00.read(jsonReader);
        if (read != null) {
            Class cls = this.A01;
            if (!cls.isInstance(read)) {
                throw new RuntimeException(002.A13("Expected a ", cls.getName(), C273654mx.A00(431), C66581MXm.A0y(read), "; at path ", jsonReader.A0I()));
            }
        }
        return read;
    }

    public final void write(JsonWriter jsonWriter, Object obj) {
        this.A00.A00.write(jsonWriter, obj);
    }
}
