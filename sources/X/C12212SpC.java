package X;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

/* renamed from: X.SpC  reason: case insensitive filesystem */
public final class C12212SpC implements Dynamic {
    public static final ThreadLocal A02 = new TRH();
    public ReadableMap A00;
    public String A01;

    public final void recycle() {
        this.A00 = null;
        this.A01 = null;
        ((0vW) A02.get()).ECR(this);
    }

    public final ReadableArray asArray() {
        String str;
        ReadableMap readableMap = this.A00;
        if (readableMap != null && (str = this.A01) != null) {
            return readableMap.getArray(str);
        }
        throw Pxh.A0b();
    }

    public final boolean asBoolean() {
        String str;
        ReadableMap readableMap = this.A00;
        if (readableMap != null && (str = this.A01) != null) {
            return readableMap.getBoolean(str);
        }
        throw Pxh.A0b();
    }

    public final double asDouble() {
        String str;
        ReadableMap readableMap = this.A00;
        if (readableMap != null && (str = this.A01) != null) {
            return readableMap.getDouble(str);
        }
        throw Pxh.A0b();
    }

    public final int asInt() {
        String str;
        ReadableMap readableMap = this.A00;
        if (readableMap != null && (str = this.A01) != null) {
            return readableMap.getInt(str);
        }
        throw Pxh.A0b();
    }

    public final ReadableMap asMap() {
        String str;
        ReadableMap readableMap = this.A00;
        if (readableMap == null || (str = this.A01) == null) {
            throw Pxh.A0b();
        }
        ReadableMap map = readableMap.getMap(str);
        map.getClass();
        return map;
    }

    public final String asString() {
        String str;
        ReadableMap readableMap = this.A00;
        if (readableMap != null && (str = this.A01) != null) {
            return readableMap.getString(str);
        }
        throw Pxh.A0b();
    }

    public final ReadableType getType() {
        String str;
        ReadableMap readableMap = this.A00;
        if (readableMap != null && (str = this.A01) != null) {
            return readableMap.getType(str);
        }
        throw Pxh.A0b();
    }

    public final boolean isNull() {
        String str;
        ReadableMap readableMap = this.A00;
        if (readableMap != null && (str = this.A01) != null) {
            return readableMap.isNull(str);
        }
        throw Pxh.A0b();
    }
}
