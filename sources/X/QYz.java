package X;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.intent.IntentModule;

public class QYz extends SIU {
    public double A00;
    public double A01;
    public C13565Tck A02;

    public static void A00(S2L s2l, WritableNativeMap writableNativeMap, boolean z) {
        writableNativeMap.putBoolean("finished", z);
        writableNativeMap.putDouble(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, s2l.A01.A00);
    }

    public final double A05() {
        if (Double.isNaN(this.A01 + this.A00)) {
            A04();
        }
        return this.A01 + this.A00;
    }

    public QYz(ReadableMap readableMap) {
        double d;
        double d2;
        if (readableMap != null) {
            d = readableMap.getDouble(IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
        } else {
            d = Double.NaN;
        }
        this.A00 = d;
        if (readableMap != null) {
            d2 = readableMap.getDouble("offset");
        } else {
            d2 = 0.0d;
        }
        this.A01 = d2;
    }

    public String A03() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        SIU.A02(this, "ValueAnimatedNode[", A1A);
        A1A.append("]: value: ");
        A1A.append(this.A00);
        A1A.append(" offset: ");
        A1A.append(this.A01);
        return A1A.toString();
    }

    public QYz() {
        this((ReadableMap) null);
    }
}
