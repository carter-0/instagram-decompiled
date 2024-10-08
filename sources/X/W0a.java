package X;

import com.facebook.react.bridge.ReadableArray;

public final class W0a {
    public static void A00(ReadableArray readableArray, X7Y x7y, Object obj) {
        x7y.scrollTo(obj, new C17413VUs(Math.round(W2U.A01((float) readableArray.getDouble(0))), Math.round(W2U.A01((float) readableArray.getDouble(1))), readableArray.getBoolean(2)));
    }

    public static void A01(ReadableArray readableArray, X7Y x7y, Object obj, int i) {
        0Sd.A00(obj);
        if (i == 1) {
            0Sd.A00(readableArray);
            A00(readableArray, x7y, obj);
        } else if (i == 2) {
            0Sd.A00(readableArray);
            x7y.scrollToEnd(obj, new C17180VLk(readableArray.getBoolean(0)));
        } else if (i == 3) {
            x7y.flashScrollIndicators(obj);
        } else {
            throw Pxf.A0X("Unsupported command %d received by %s.", new Object[]{Integer.valueOf(i), C51968G9o.A16(x7y)});
        }
    }

    public static void A02(ReadableArray readableArray, X7Y x7y, Object obj, String str) {
        0Sd.A00(obj);
        switch (str.hashCode()) {
            case -402165208:
                if (str.equals("scrollTo")) {
                    0Sd.A00(readableArray);
                    A00(readableArray, x7y, obj);
                    return;
                }
                break;
            case 28425985:
                if (str.equals("flashScrollIndicators")) {
                    x7y.flashScrollIndicators(obj);
                    return;
                }
                break;
            case 2055114131:
                if (str.equals("scrollToEnd")) {
                    0Sd.A00(readableArray);
                    x7y.scrollToEnd(obj, new C17180VLk(readableArray.getBoolean(0)));
                    return;
                }
                break;
        }
        throw Pxf.A0X("Unsupported command %s received by %s.", new Object[]{str, C51968G9o.A16(x7y)});
    }
}
