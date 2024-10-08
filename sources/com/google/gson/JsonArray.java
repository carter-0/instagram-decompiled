package com.google.gson;

import X.AnonymousClass7TE;
import X.DbS;
import X.DbW;
import X.R2D;
import X.TS0;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class JsonArray extends JsonElement implements Iterable {
    public final ArrayList elements;

    private JsonElement getAsSingleElement() {
        ArrayList arrayList = this.elements;
        int size = arrayList.size();
        if (size == 1) {
            return (JsonElement) AnonymousClass7TE.A12(arrayList);
        }
        throw DbW.A0b("Array must have size 1, but has size ", size);
    }

    public void add(Boolean bool) {
        Object jsonPrimitive;
        ArrayList arrayList = this.elements;
        if (bool == null) {
            jsonPrimitive = R2D.A00;
        } else {
            jsonPrimitive = new JsonPrimitive(bool);
        }
        arrayList.add(jsonPrimitive);
    }

    public void addAll(JsonArray jsonArray) {
        this.elements.addAll(jsonArray.elements);
    }

    public List asList() {
        return new TS0(this.elements);
    }

    public boolean contains(JsonElement jsonElement) {
        return this.elements.contains(jsonElement);
    }

    public JsonArray deepCopy() {
        ArrayList arrayList = this.elements;
        if (arrayList.isEmpty()) {
            return new JsonArray();
        }
        JsonArray jsonArray = new JsonArray(arrayList.size());
        Iterator it = this.elements.iterator();
        while (it.hasNext()) {
            jsonArray.add(((JsonElement) it.next()).deepCopy());
        }
        return jsonArray;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JsonArray) || !((JsonArray) obj).elements.equals(this.elements)) {
            return false;
        }
        return true;
    }

    public JsonElement get(int i) {
        return (JsonElement) this.elements.get(i);
    }

    public int hashCode() {
        return this.elements.hashCode();
    }

    public boolean isEmpty() {
        return this.elements.isEmpty();
    }

    public Iterator iterator() {
        return this.elements.iterator();
    }

    public JsonElement remove(int i) {
        return (JsonElement) this.elements.remove(i);
    }

    public JsonElement set(int i, JsonElement jsonElement) {
        ArrayList arrayList = this.elements;
        if (jsonElement == null) {
            jsonElement = R2D.A00;
        }
        return (JsonElement) arrayList.set(i, jsonElement);
    }

    public int size() {
        return this.elements.size();
    }

    public JsonArray(int i) {
        this.elements = DbS.A0v(i);
    }

    public BigDecimal getAsBigDecimal() {
        return getAsSingleElement().getAsBigDecimal();
    }

    public BigInteger getAsBigInteger() {
        return getAsSingleElement().getAsBigInteger();
    }

    public boolean getAsBoolean() {
        return getAsSingleElement().getAsBoolean();
    }

    public byte getAsByte() {
        return getAsSingleElement().getAsByte();
    }

    @Deprecated
    public char getAsCharacter() {
        return getAsSingleElement().getAsCharacter();
    }

    public double getAsDouble() {
        return getAsSingleElement().getAsDouble();
    }

    public float getAsFloat() {
        return getAsSingleElement().getAsFloat();
    }

    public int getAsInt() {
        return getAsSingleElement().getAsInt();
    }

    public long getAsLong() {
        return getAsSingleElement().getAsLong();
    }

    public Number getAsNumber() {
        return getAsSingleElement().getAsNumber();
    }

    public short getAsShort() {
        return getAsSingleElement().getAsShort();
    }

    public String getAsString() {
        return getAsSingleElement().getAsString();
    }

    public JsonArray() {
        this.elements = AnonymousClass7TE.A1C();
    }

    public void add(Character ch) {
        Object jsonPrimitive;
        ArrayList arrayList = this.elements;
        if (ch == null) {
            jsonPrimitive = R2D.A00;
        } else {
            jsonPrimitive = new JsonPrimitive(ch);
        }
        arrayList.add(jsonPrimitive);
    }

    public boolean remove(JsonElement jsonElement) {
        return this.elements.remove(jsonElement);
    }

    public void add(Number number) {
        Object jsonPrimitive;
        ArrayList arrayList = this.elements;
        if (number == null) {
            jsonPrimitive = R2D.A00;
        } else {
            jsonPrimitive = new JsonPrimitive(number);
        }
        arrayList.add(jsonPrimitive);
    }

    public void add(JsonElement jsonElement) {
        if (jsonElement == null) {
            jsonElement = R2D.A00;
        }
        this.elements.add(jsonElement);
    }

    public void add(String str) {
        Object jsonPrimitive;
        ArrayList arrayList = this.elements;
        if (str == null) {
            jsonPrimitive = R2D.A00;
        } else {
            jsonPrimitive = new JsonPrimitive(str);
        }
        arrayList.add(jsonPrimitive);
    }
}
