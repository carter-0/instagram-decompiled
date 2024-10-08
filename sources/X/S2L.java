package X;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

public abstract class S2L {
    public int A00;
    public QYz A01;
    public Callback A02;
    public boolean A03;

    public final void A01(ReadableMap readableMap) {
        int i;
        int i2;
        double d;
        int i3;
        int size;
        if (this instanceof C7822QYh) {
            C7822QYh qYh = (C7822QYh) this;
            0qQ.A0B(readableMap, 0);
            ReadableArray array = readableMap.getArray("frames");
            boolean z = false;
            if (!(array == null || qYh.A06.length == (size = array.size()))) {
                double[] dArr = new double[size];
                for (int i4 = 0; i4 < size; i4++) {
                    dArr[i4] = array.getDouble(i4);
                }
                qYh.A06 = dArr;
            }
            if (!readableMap.hasKey("toValue") || readableMap.getType("toValue") != ReadableType.Number) {
                d = 0.0d;
            } else {
                d = readableMap.getDouble("toValue");
            }
            qYh.A01 = d;
            if (!readableMap.hasKey("iterations") || readableMap.getType("iterations") != ReadableType.Number) {
                i3 = 1;
            } else {
                i3 = readableMap.getInt("iterations");
            }
            qYh.A03 = i3;
            qYh.A02 = 1;
            if (i3 == 0) {
                z = true;
            }
            qYh.A03 = z;
            qYh.A05 = -1;
        } else if (this instanceof C7823QYi) {
            C7823QYi qYi = (C7823QYi) this;
            0qQ.A0B(readableMap, 0);
            qYi.A07 = readableMap.getDouble("stiffness");
            qYi.A05 = readableMap.getDouble("damping");
            qYi.A06 = readableMap.getDouble("mass");
            qYi.A02 = qYi.A0F.A01;
            qYi.A01 = readableMap.getDouble("toValue");
            qYi.A04 = readableMap.getDouble("restSpeedThreshold");
            qYi.A00 = readableMap.getDouble("restDisplacementThreshold");
            qYi.A0D = readableMap.getBoolean("overshootClamping");
            boolean z2 = true;
            if (readableMap.hasKey("iterations")) {
                i2 = readableMap.getInt("iterations");
            } else {
                i2 = 1;
            }
            qYi.A0B = i2;
            if (i2 != 0) {
                z2 = false;
            }
            qYi.A03 = z2;
            qYi.A0A = 0;
            qYi.A09 = 0.0d;
            qYi.A0E = false;
        } else {
            C7821QYg qYg = (C7821QYg) this;
            0qQ.A0B(readableMap, 0);
            qYg.A03 = readableMap.getDouble("velocity");
            qYg.A00 = readableMap.getDouble("deceleration");
            qYg.A06 = -1;
            qYg.A01 = 0.0d;
            qYg.A02 = 0.0d;
            boolean z3 = true;
            if (readableMap.hasKey("iterations")) {
                i = readableMap.getInt("iterations");
            } else {
                i = 1;
            }
            qYg.A05 = i;
            qYg.A04 = 1;
            if (i != 0) {
                z3 = false;
            }
            qYg.A03 = z3;
        }
    }
}
