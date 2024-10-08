package com.google.gson;

import X.2Gu;
import X.AnonymousClass7TE;
import X.Pxe;
import X.Pxg;
import java.math.BigDecimal;
import java.math.BigInteger;

public final class JsonPrimitive extends JsonElement {
    public final Object value;

    public JsonPrimitive deepCopy() {
        return this;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            JsonPrimitive jsonPrimitive = (JsonPrimitive) obj;
            Object obj2 = this.value;
            if (obj2 == null) {
                return jsonPrimitive.value == null;
            }
            if (isIntegral(this) && isIntegral(jsonPrimitive)) {
                return getAsNumber().longValue() == jsonPrimitive.getAsNumber().longValue();
            }
            if (!(obj2 instanceof Number) || !(jsonPrimitive.value instanceof Number)) {
                return obj2.equals(jsonPrimitive.value);
            }
            double doubleValue = getAsNumber().doubleValue();
            double doubleValue2 = jsonPrimitive.getAsNumber().doubleValue();
            if (doubleValue != doubleValue2) {
                return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
            }
        }
    }

    public static boolean isIntegral(JsonPrimitive jsonPrimitive) {
        Object obj = jsonPrimitive.value;
        if (!(obj instanceof Number)) {
            return false;
        }
        if ((obj instanceof BigInteger) || (obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
            return true;
        }
        return false;
    }

    public BigDecimal getAsBigDecimal() {
        Object obj = this.value;
        if (obj instanceof BigDecimal) {
            return (BigDecimal) obj;
        }
        return new BigDecimal(getAsString());
    }

    public BigInteger getAsBigInteger() {
        Object obj = this.value;
        if (obj instanceof BigInteger) {
            return (BigInteger) obj;
        }
        return new BigInteger(getAsString());
    }

    public boolean getAsBoolean() {
        Object obj = this.value;
        if (obj instanceof Boolean) {
            return AnonymousClass7TE.A1a(obj);
        }
        return Boolean.parseBoolean(getAsString());
    }

    public byte getAsByte() {
        if (this.value instanceof Number) {
            return getAsNumber().byteValue();
        }
        return Byte.parseByte(getAsString());
    }

    public double getAsDouble() {
        if (this.value instanceof Number) {
            return getAsNumber().doubleValue();
        }
        return Double.parseDouble(getAsString());
    }

    public float getAsFloat() {
        if (this.value instanceof Number) {
            return getAsNumber().floatValue();
        }
        return Float.parseFloat(getAsString());
    }

    public int getAsInt() {
        if (this.value instanceof Number) {
            return getAsNumber().intValue();
        }
        return Integer.parseInt(getAsString());
    }

    public long getAsLong() {
        if (this.value instanceof Number) {
            return getAsNumber().longValue();
        }
        return Long.parseLong(getAsString());
    }

    public Number getAsNumber() {
        Object obj = this.value;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new 2Gu((String) obj);
        }
        throw AnonymousClass7TE.A1B("Primitive is neither a number nor a string");
    }

    public short getAsShort() {
        if (this.value instanceof Number) {
            return getAsNumber().shortValue();
        }
        return Short.parseShort(getAsString());
    }

    public String getAsString() {
        Object obj = this.value;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Number) {
            obj = getAsNumber();
        } else if (!(obj instanceof Boolean)) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            Pxg.A1R(A1A, "Unexpected value type: ", obj);
            throw Pxe.A0e(A1A.toString());
        }
        return obj.toString();
    }

    public int hashCode() {
        long doubleToLongBits;
        Object obj = this.value;
        if (obj == null) {
            return 31;
        }
        if (isIntegral(this)) {
            doubleToLongBits = getAsNumber().longValue();
        } else if (!(obj instanceof Number)) {
            return obj.hashCode();
        } else {
            doubleToLongBits = Double.doubleToLongBits(getAsNumber().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    public boolean isBoolean() {
        return this.value instanceof Boolean;
    }

    public boolean isNumber() {
        return this.value instanceof Number;
    }

    public boolean isString() {
        return this.value instanceof String;
    }

    public JsonPrimitive(Character ch) {
        ch.getClass();
        this.value = ch.toString();
    }

    @Deprecated
    public char getAsCharacter() {
        String asString = getAsString();
        if (!asString.isEmpty()) {
            return Pxe.A00(asString);
        }
        throw AnonymousClass7TE.A1B("String value is empty");
    }

    public JsonPrimitive(Boolean bool) {
        bool.getClass();
        this.value = bool;
    }

    public JsonPrimitive(Number number) {
        number.getClass();
        this.value = number;
    }

    public JsonPrimitive(String str) {
        str.getClass();
        this.value = str;
    }
}
