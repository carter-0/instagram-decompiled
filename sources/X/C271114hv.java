package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* renamed from: X.4hv  reason: invalid class name and case insensitive filesystem */
public abstract class C271114hv {
    public static final SerialDescriptor A00 = C276374t8.A00("kotlinx.serialization.json.JsonUnquotedLiteral", C255453u9.A01);

    public static final int A00(JsonPrimitive jsonPrimitive) {
        0qQ.A0B(jsonPrimitive, 0);
        try {
            String A002 = jsonPrimitive.A00();
            long A07 = new AnonymousClass40V(A002).A07();
            if (-2147483648L <= A07 && A07 <= 2147483647L) {
                return (int) A07;
            }
            throw new NumberFormatException(002.A0R(A002, " is not an Int"));
        } catch (C276354t6 e) {
            throw new NumberFormatException(e.getMessage());
        }
    }

    public static final Boolean A01(JsonPrimitive jsonPrimitive) {
        0qQ.A0B(jsonPrimitive, 0);
        String A002 = jsonPrimitive.A00();
        0qQ.A0B(A002, 0);
        if (A002.equalsIgnoreCase("true")) {
            return true;
        }
        if (A002.equalsIgnoreCase("false")) {
            return false;
        }
        return null;
    }

    public static final JsonArray A02(JsonElement jsonElement) {
        JsonArray jsonArray;
        0qQ.A0B(jsonElement, 0);
        if ((jsonElement instanceof JsonArray) && (jsonArray = (JsonArray) jsonElement) != null) {
            return jsonArray;
        }
        A07("JsonArray", jsonElement);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final JsonObject A03(JsonElement jsonElement) {
        JsonObject jsonObject;
        0qQ.A0B(jsonElement, 0);
        if ((jsonElement instanceof JsonObject) && (jsonObject = (JsonObject) jsonElement) != null) {
            return jsonObject;
        }
        A07("JsonObject", jsonElement);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final JsonPrimitive A06(JsonElement jsonElement) {
        JsonPrimitive jsonPrimitive;
        0qQ.A0B(jsonElement, 0);
        if ((jsonElement instanceof JsonPrimitive) && (jsonPrimitive = (JsonPrimitive) jsonElement) != null) {
            return jsonPrimitive;
        }
        A07("JsonPrimitive", jsonElement);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final JsonPrimitive A04(Boolean bool) {
        if (bool == null) {
            return JsonNull.A00;
        }
        return new JsonLiteral(bool, false);
    }

    public static final JsonPrimitive A05(String str) {
        if (str == null) {
            return JsonNull.A00;
        }
        return new JsonLiteral(str, true);
    }

    public static final void A07(String str, JsonElement jsonElement) {
        StringBuilder sb = new StringBuilder();
        sb.append("Element ");
        sb.append(new 0Yh(jsonElement.getClass()));
        sb.append(" is not a ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    public static final boolean A08(JsonPrimitive jsonPrimitive) {
        Boolean bool;
        String A002 = jsonPrimitive.A00();
        0qQ.A0B(A002, 0);
        if (A002.equalsIgnoreCase("true")) {
            bool = true;
        } else if (A002.equalsIgnoreCase("false")) {
            bool = false;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(jsonPrimitive);
            sb.append(" does not represent a Boolean");
            throw new IllegalStateException(sb.toString());
        }
        return bool.booleanValue();
    }
}
