package X;

import com.google.gson.Gson;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3tg  reason: invalid class name and case insensitive filesystem */
public final class C255163tg extends TypeAdapter {
    public final TypeAdapter A00;
    public final TypeAdapter A01;
    public final AnonymousClass2OT A02;
    public final /* synthetic */ 2H7 A03;

    public C255163tg(Gson gson, TypeAdapter typeAdapter, TypeAdapter typeAdapter2, AnonymousClass2OT r5, 2H7 r6, Type type, Type type2) {
        this.A03 = r6;
        this.A00 = new 2Oe(gson, typeAdapter, type);
        this.A01 = new 2Oe(gson, typeAdapter2, type2);
        this.A02 = r5;
    }

    public final /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
        Map map = (Map) obj;
        if (map == null) {
            jsonWriter.A0A();
            return;
        }
        jsonWriter.A07();
        for (Map.Entry entry : map.entrySet()) {
            jsonWriter.A0G(String.valueOf(entry.getKey()));
            this.A01.write(jsonWriter, entry.getValue());
        }
        jsonWriter.A09();
    }

    public final /* bridge */ /* synthetic */ Object read(JsonReader jsonReader) {
        int i;
        Integer A0G = jsonReader.A0G();
        if (A0G == AnonymousClass05K.A1F) {
            jsonReader.A0Q();
            return null;
        }
        Map map = (Map) this.A02.AJM();
        if (A0G == AnonymousClass05K.A00) {
            jsonReader.A0M();
            while (jsonReader.A0S()) {
                jsonReader.A0M();
                Object read = this.A00.read(jsonReader);
                if (map.put(read, this.A01.read(jsonReader)) == null) {
                    jsonReader.A0O();
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("duplicate key: ");
                    sb.append(read);
                    throw new RuntimeException(sb.toString());
                }
            }
            jsonReader.A0O();
            return map;
        }
        jsonReader.A0N();
        while (jsonReader.A0S()) {
            if (jsonReader instanceof C2807954d) {
                C2807954d r4 = (C2807954d) jsonReader;
                C2807954d.A02(r4, AnonymousClass05K.A0Y);
                Map.Entry entry = (Map.Entry) ((Iterator) r4.A01[r4.A00 - 1]).next();
                C2807954d.A03(r4, entry.getValue());
                C2807954d.A03(r4, new JsonPrimitive((String) entry.getKey()));
            } else {
                int i2 = jsonReader.A03;
                if (i2 == 0) {
                    i2 = jsonReader.A0E();
                }
                if (i2 == 13) {
                    i = 9;
                } else if (i2 == 12) {
                    i = 8;
                } else if (i2 == 14) {
                    i = 10;
                } else {
                    throw new IllegalStateException(002.A0g(AnonymousClass000.A00(939), SA9.A00(jsonReader.A0G()), jsonReader.A0L()));
                }
                jsonReader.A03 = i;
            }
            Object read2 = this.A00.read(jsonReader);
            if (map.put(read2, this.A01.read(jsonReader)) != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("duplicate key: ");
                sb2.append(read2);
                throw new RuntimeException(sb2.toString());
            }
        }
        jsonReader.A0P();
        return map;
    }
}
