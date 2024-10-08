package X;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.PromiseImpl;
import com.facebook.react.bridge.ReadableArray;

/* renamed from: X.Rzd  reason: case insensitive filesystem */
public abstract class C10877Rzd {
    public final Object A00(C13568Tco tco, ReadableArray readableArray, int i) {
        switch (((QZD) this).A00) {
            case 0:
                C10877Rzd rzd = SQp.A0B;
                return new PromiseImpl((Callback) rzd.A00(tco, readableArray, i), (Callback) rzd.A00(tco, readableArray, i + 1));
            case 1:
                return Boolean.valueOf(readableArray.getBoolean(i));
            case 2:
                return Double.valueOf(readableArray.getDouble(i));
            case 3:
                return Float.valueOf((float) readableArray.getDouble(i));
            case 4:
                return Integer.valueOf((int) readableArray.getDouble(i));
            case 5:
                return readableArray.getString(i);
            case 6:
                return readableArray.getArray(i);
            case 7:
                C12211SpB spB = (C12211SpB) C12211SpB.A02.A7A();
                if (spB == null) {
                    spB = new C12211SpB();
                }
                spB.A01 = readableArray;
                spB.A00 = i;
                return spB;
            case 8:
                return readableArray.getMap(i);
            default:
                if (readableArray.isNull(i)) {
                    return null;
                }
                return new C12208Sp7(tco, (int) readableArray.getDouble(i));
        }
    }
}
