package com.google.gson;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C2807854a;
import X.DbT;
import X.R2D;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class JsonObject extends JsonElement {
    public final C2807854a members = new C2807854a(false);

    public void add(String str, JsonElement jsonElement) {
        C2807854a r0 = this.members;
        if (jsonElement == null) {
            jsonElement = R2D.A00;
        }
        r0.put(str, jsonElement);
    }

    public void addProperty(String str, Boolean bool) {
        JsonElement jsonPrimitive;
        if (bool == null) {
            jsonPrimitive = R2D.A00;
        } else {
            jsonPrimitive = new JsonPrimitive(bool);
        }
        add(str, jsonPrimitive);
    }

    public Map asMap() {
        return this.members;
    }

    public JsonObject deepCopy() {
        JsonObject jsonObject = new JsonObject();
        Iterator A0s = AnonymousClass7TF.A0s(this.members);
        while (A0s.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
            jsonObject.add(DbT.A13(A1J), ((JsonElement) A1J.getValue()).deepCopy());
        }
        return jsonObject;
    }

    public Set entrySet() {
        return this.members.entrySet();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JsonObject) || !((JsonObject) obj).members.equals(this.members)) {
            return false;
        }
        return true;
    }

    public JsonElement get(String str) {
        return (JsonElement) this.members.get(str);
    }

    public JsonArray getAsJsonArray(String str) {
        return (JsonArray) this.members.get(str);
    }

    public JsonObject getAsJsonObject(String str) {
        return (JsonObject) this.members.get(str);
    }

    public JsonPrimitive getAsJsonPrimitive(String str) {
        return (JsonPrimitive) this.members.get(str);
    }

    public boolean has(String str) {
        return this.members.containsKey(str);
    }

    public int hashCode() {
        return this.members.hashCode();
    }

    public boolean isEmpty() {
        return AnonymousClass7TF.A1Q(this.members.size());
    }

    public Set keySet() {
        return this.members.keySet();
    }

    public JsonElement remove(String str) {
        return (JsonElement) this.members.remove(str);
    }

    public int size() {
        return this.members.size();
    }

    public void addProperty(String str, Character ch) {
        JsonElement jsonPrimitive;
        if (ch == null) {
            jsonPrimitive = R2D.A00;
        } else {
            jsonPrimitive = new JsonPrimitive(ch);
        }
        add(str, jsonPrimitive);
    }

    public void addProperty(String str, Number number) {
        JsonElement jsonPrimitive;
        if (number == null) {
            jsonPrimitive = R2D.A00;
        } else {
            jsonPrimitive = new JsonPrimitive(number);
        }
        add(str, jsonPrimitive);
    }

    public void addProperty(String str, String str2) {
        JsonElement jsonPrimitive;
        if (str2 == null) {
            jsonPrimitive = R2D.A00;
        } else {
            jsonPrimitive = new JsonPrimitive(str2);
        }
        add(str, jsonPrimitive);
    }
}
