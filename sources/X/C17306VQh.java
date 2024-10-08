package X;

import com.facebook.react.bridge.ReadableMap;

/* renamed from: X.VQh  reason: case insensitive filesystem */
public final class C17306VQh {
    public final Integer A00;
    public final String A01;

    public C17306VQh(ReadableMap readableMap) {
        Integer num;
        this.A01 = readableMap.getString("label");
        if (!readableMap.hasKey("color") || readableMap.isNull("color")) {
            num = null;
        } else {
            num = Integer.valueOf(readableMap.getInt("color"));
        }
        this.A00 = num;
    }
}
