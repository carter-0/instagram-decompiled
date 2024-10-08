package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

/* renamed from: X.Vb6  reason: case insensitive filesystem */
public final class C17614Vb6 {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public final Integer A04;
    public final float[] A05;
    public final int[] A06;

    public C17614Vb6(Context context, ReadableMap readableMap) {
        int i;
        String string = readableMap.getString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        if (0qQ.A0K(string, "linearGradient")) {
            this.A04 = AnonymousClass05K.A00;
            ReadableMap map = readableMap.getMap("start");
            if (map != null) {
                this.A02 = (float) map.getDouble("x");
                this.A03 = (float) map.getDouble("y");
            }
            ReadableMap map2 = readableMap.getMap("end");
            if (map2 != null) {
                this.A00 = (float) map2.getDouble("x");
                this.A01 = (float) map2.getDouble("y");
            }
            ReadableArray array = readableMap.getArray("colorStops");
            if (array != null) {
                int size = array.size();
                this.A06 = new int[size];
                this.A05 = new float[size];
                for (int i2 = 0; i2 < size; i2++) {
                    ReadableMap map3 = array.getMap(i2);
                    ReadableType type = map3.getType("color");
                    ReadableType readableType = ReadableType.Map;
                    int[] iArr = this.A06;
                    if (type == readableType) {
                        Integer A002 = SPt.A00(context, map3.getMap("color"));
                        0qQ.A07(A002);
                        i = A002.intValue();
                    } else {
                        i = map3.getInt("color");
                    }
                    iArr[i2] = i;
                    this.A05[i2] = (float) map3.getDouble("position");
                }
                return;
            }
            throw new IllegalArgumentException("Invalid colorStops array");
        }
        throw AnonymousClass7TF.A0W("Unsupported gradient type: ", string);
    }
}
