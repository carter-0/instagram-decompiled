package X;

import android.util.JsonWriter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.SSe  reason: case insensitive filesystem */
public final class C11407SSe {
    public static void A02(JsonWriter jsonWriter, Object obj) {
        ReadableMap asMap;
        ReadableArray asArray;
        if (obj instanceof Map) {
            A04(jsonWriter, (Map) obj);
        } else if (obj instanceof List) {
            jsonWriter.beginArray();
            for (Object A03 : (List) obj) {
                A03(jsonWriter, A03);
            }
            jsonWriter.endArray();
        } else {
            if (obj instanceof ReadableMap) {
                asMap = (ReadableMap) obj;
            } else {
                if (obj instanceof ReadableArray) {
                    asArray = (ReadableArray) obj;
                } else if (obj instanceof Dynamic) {
                    Dynamic dynamic = (Dynamic) obj;
                    switch (dynamic.getType().ordinal()) {
                        case 0:
                            jsonWriter.nullValue();
                            return;
                        case 1:
                            jsonWriter.value(dynamic.asBoolean());
                            return;
                        case 2:
                            jsonWriter.value(dynamic.asDouble());
                            return;
                        case 3:
                            jsonWriter.value(dynamic.asString());
                            return;
                        case 4:
                            asMap = dynamic.asMap();
                            break;
                        case 5:
                            asArray = dynamic.asArray();
                            break;
                        default:
                            StringBuilder A1A = AnonymousClass7TE.A1A();
                            A1A.append("Unknown data type: ");
                            throw C66582MXn.A0j(dynamic.getType(), A1A);
                    }
                } else {
                    A03(jsonWriter, obj);
                    return;
                }
                A00(jsonWriter, asArray);
                return;
            }
            A01(jsonWriter, asMap);
        }
    }

    public static void A03(JsonWriter jsonWriter, Object obj) {
        if (obj == null) {
            jsonWriter.nullValue();
        } else if (obj instanceof String) {
            jsonWriter.value((String) obj);
        } else if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
        } else if (obj instanceof Boolean) {
            jsonWriter.value(AnonymousClass7TE.A1a(obj));
        } else {
            throw C51973G9u.A0g(obj, "Unknown value: ", AnonymousClass7TE.A1A());
        }
    }

    public static void A00(JsonWriter jsonWriter, ReadableArray readableArray) {
        jsonWriter.beginArray();
        int i = 0;
        while (i < readableArray.size()) {
            try {
                switch (readableArray.getType(i).ordinal()) {
                    case 0:
                        jsonWriter.nullValue();
                        break;
                    case 1:
                        jsonWriter.value(readableArray.getBoolean(i));
                        break;
                    case 2:
                        jsonWriter.value(readableArray.getDouble(i));
                        break;
                    case 3:
                        jsonWriter.value(readableArray.getString(i));
                        break;
                    case 4:
                        A01(jsonWriter, readableArray.getMap(i));
                        break;
                    case 5:
                        A00(jsonWriter, readableArray.getArray(i));
                        break;
                    default:
                        StringBuilder A1A = AnonymousClass7TE.A1A();
                        A1A.append("Unknown data type: ");
                        throw C66582MXn.A0j(readableArray.getType(i), A1A);
                }
                i++;
            } finally {
                jsonWriter.endArray();
            }
        }
    }

    public static void A01(JsonWriter jsonWriter, ReadableMap readableMap) {
        jsonWriter.beginObject();
        try {
            ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
            while (keySetIterator.CKI()) {
                String Crc = keySetIterator.Crc();
                jsonWriter.name(Crc);
                switch (readableMap.getType(Crc).ordinal()) {
                    case 0:
                        jsonWriter.nullValue();
                        break;
                    case 1:
                        jsonWriter.value(readableMap.getBoolean(Crc));
                        break;
                    case 2:
                        jsonWriter.value(readableMap.getDouble(Crc));
                        break;
                    case 3:
                        jsonWriter.value(readableMap.getString(Crc));
                        break;
                    case 4:
                        A01(jsonWriter, readableMap.getMap(Crc));
                        break;
                    case 5:
                        A00(jsonWriter, readableMap.getArray(Crc));
                        break;
                    default:
                        StringBuilder A1A = AnonymousClass7TE.A1A();
                        A1A.append("Unknown data type: ");
                        throw C66582MXn.A0j(readableMap.getType(Crc), A1A);
                }
            }
        } finally {
            jsonWriter.endObject();
        }
    }

    public static void A04(JsonWriter jsonWriter, Map map) {
        jsonWriter.beginObject();
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            jsonWriter.name(A1J.getKey().toString());
            A02(jsonWriter, A1J.getValue());
        }
        jsonWriter.endObject();
    }
}
