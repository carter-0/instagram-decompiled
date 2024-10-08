package X;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.3te  reason: invalid class name and case insensitive filesystem */
public final class C255143te extends TypeAdapter {
    public final Map A00 = new HashMap();
    public final Map A01 = new HashMap();
    public final Map A02 = new HashMap();

    public final /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
        String str;
        if (obj == null) {
            str = null;
        } else {
            str = (String) this.A00.get(obj);
        }
        jsonWriter.A0H(str);
    }

    public C255143te(Class cls) {
        try {
            for (Field field : (Field[]) AccessController.doPrivileged(new C255153tf(this, cls))) {
                Enum enumR = (Enum) field.get((Object) null);
                String name = enumR.name();
                String obj = enumR.toString();
                SerializedName annotation = field.getAnnotation(SerializedName.class);
                if (annotation != null) {
                    name = annotation.value();
                    for (String put : annotation.alternate()) {
                        this.A01.put(put, enumR);
                    }
                }
                this.A01.put(name, enumR);
                this.A02.put(obj, enumR);
                this.A00.put(enumR, name);
            }
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    public final /* bridge */ /* synthetic */ Object read(JsonReader jsonReader) {
        if (jsonReader.A0G() == AnonymousClass05K.A1F) {
            jsonReader.A0Q();
            return null;
        }
        String A0K = jsonReader.A0K();
        Object obj = this.A01.get(A0K);
        if (obj == null) {
            return this.A02.get(A0K);
        }
        return obj;
    }
}
