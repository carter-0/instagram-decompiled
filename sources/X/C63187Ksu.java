package X;

import android.util.JsonWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ksu  reason: case insensitive filesystem */
public abstract class C63187Ksu {
    public static final void A00(JsonWriter jsonWriter, List list) {
        try {
            jsonWriter.beginArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String A18 = AnonymousClass7TE.A18(it);
                jsonWriter.beginObject();
                JTP.A12(jsonWriter, AnonymousClass000.A00(1887), A18);
                jsonWriter.endObject();
            }
            jsonWriter.endArray();
        } catch (IOException unused) {
        }
    }
}
