package X;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;

/* renamed from: X.Vg3  reason: case insensitive filesystem */
public final class C17791Vg3 {
    public float A00;
    public Integer A01;

    public final void A00(Dynamic dynamic) {
        Integer num;
        float f = Float.NaN;
        if (!dynamic.isNull()) {
            if (dynamic.getType() == ReadableType.String) {
                String asString = dynamic.asString();
                if (asString.equals("auto")) {
                    num = AnonymousClass05K.A0N;
                    this.A01 = num;
                    this.A00 = f;
                } else if (asString.endsWith("%")) {
                    this.A01 = AnonymousClass05K.A0C;
                    f = Float.parseFloat(asString.substring(0, asString.length() - 1));
                    this.A00 = f;
                } else {
                    C13989Tnp.A1T(Pxd.A00(603), asString);
                }
            } else if (dynamic.getType() == ReadableType.Number) {
                this.A01 = AnonymousClass05K.A01;
                f = W2U.A01((float) dynamic.asDouble());
                this.A00 = f;
            }
        }
        num = AnonymousClass05K.A00;
        this.A01 = num;
        this.A00 = f;
    }
}
