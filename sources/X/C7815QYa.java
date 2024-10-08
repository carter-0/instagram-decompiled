package X;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.Map;

/* renamed from: X.QYa  reason: case insensitive filesystem */
public final class C7815QYa extends SIU {
    public final C11404SSb A00;
    public final Map A01;

    public C7815QYa(C11404SSb sSb, ReadableMap readableMap) {
        ReadableMapKeySetIterator readableMapKeySetIterator;
        this.A00 = sSb;
        ReadableMap map = readableMap.getMap("style");
        if (map != null) {
            readableMapKeySetIterator = map.keySetIterator();
        } else {
            readableMapKeySetIterator = null;
        }
        0Ym r2 = new 0Ym();
        if (readableMapKeySetIterator != null) {
            while (readableMapKeySetIterator.CKI()) {
                String Crc = readableMapKeySetIterator.Crc();
                r2.put(Crc, Integer.valueOf(map.getInt(Crc)));
            }
        }
        this.A01 = 0se.A0N(r2);
    }

    public final String A03() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        SIU.A02(this, "StyleAnimatedNode[", A1A);
        A1A.append("] mPropMapping: ");
        return AnonymousClass7TF.A0i(this.A01, A1A);
    }
}
