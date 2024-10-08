package X;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

/* renamed from: X.SpB  reason: case insensitive filesystem */
public final class C12211SpB implements Dynamic {
    public static final 0vW A02 = new 0vW(10);
    public int A00 = -1;
    public ReadableArray A01;

    public final void recycle() {
        this.A01 = null;
        this.A00 = -1;
        A02.ECR(this);
    }

    public final ReadableArray asArray() {
        ReadableArray readableArray = this.A01;
        if (readableArray != null) {
            return readableArray.getArray(this.A00);
        }
        throw Pxh.A0b();
    }

    public final boolean asBoolean() {
        ReadableArray readableArray = this.A01;
        if (readableArray != null) {
            return readableArray.getBoolean(this.A00);
        }
        throw Pxh.A0b();
    }

    public final double asDouble() {
        ReadableArray readableArray = this.A01;
        if (readableArray != null) {
            return readableArray.getDouble(this.A00);
        }
        throw Pxh.A0b();
    }

    public final int asInt() {
        ReadableArray readableArray = this.A01;
        if (readableArray != null) {
            return readableArray.getInt(this.A00);
        }
        throw Pxh.A0b();
    }

    public final ReadableMap asMap() {
        ReadableArray readableArray = this.A01;
        if (readableArray != null) {
            return readableArray.getMap(this.A00);
        }
        throw Pxh.A0b();
    }

    public final String asString() {
        ReadableArray readableArray = this.A01;
        if (readableArray != null) {
            return readableArray.getString(this.A00);
        }
        throw Pxh.A0b();
    }

    public final ReadableType getType() {
        ReadableArray readableArray = this.A01;
        if (readableArray != null) {
            return readableArray.getType(this.A00);
        }
        throw Pxh.A0b();
    }

    public final boolean isNull() {
        ReadableArray readableArray = this.A01;
        if (readableArray != null) {
            return readableArray.isNull(this.A00);
        }
        throw Pxh.A0b();
    }
}
