package X;

import com.facebook.react.bridge.ReadableArray;

/* renamed from: X.V5b  reason: case insensitive filesystem */
public abstract class C16768V5b {
    public static float[] A00(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        int size = readableArray.size();
        float[] fArr = new float[size];
        if (readableArray.size() <= size) {
            size = readableArray.size();
        }
        for (int i = 0; i < size; i++) {
            fArr[i] = (float) readableArray.getDouble(i);
        }
        readableArray.size();
        return fArr;
    }
}
