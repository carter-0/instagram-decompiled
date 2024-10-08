package X;

import android.util.JsonWriter;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.io.IOException;
import java.io.StringWriter;

public final class S9G {
    public static final String A00(ReadableMap readableMap) {
        if (readableMap.getType("extraData") != ReadableType.Null) {
            try {
                StringWriter stringWriter = new StringWriter();
                JsonWriter jsonWriter = new JsonWriter(stringWriter);
                C11407SSe.A02(jsonWriter, readableMap.getDynamic("extraData"));
                jsonWriter.close();
                stringWriter.close();
                return stringWriter.toString();
            } catch (IOException unused) {
            }
        }
        return null;
    }
}
