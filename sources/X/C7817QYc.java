package X;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.Map;

/* renamed from: X.QYc  reason: case insensitive filesystem */
public final class C7817QYc extends SIU {
    public int A00 = -1;
    public X9N A01;
    public final C11404SSb A02;
    public final C12220SpN A03 = new C12220SpN();
    public final Map A04;

    public C7817QYc(C11404SSb sSb, ReadableMap readableMap) {
        ReadableMapKeySetIterator readableMapKeySetIterator;
        this.A02 = sSb;
        ReadableMap map = readableMap.getMap("props");
        if (map != null) {
            readableMapKeySetIterator = map.keySetIterator();
        } else {
            readableMapKeySetIterator = null;
        }
        this.A04 = AnonymousClass7TE.A1H();
        if (readableMapKeySetIterator != null) {
            while (readableMapKeySetIterator.CKI()) {
                String Crc = readableMapKeySetIterator.Crc();
                this.A04.put(Crc, Integer.valueOf(map.getInt(Crc)));
            }
        }
    }

    public final String A03() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        SIU.A02(this, "PropsAnimatedNode[", A1A);
        A1A.append("] connectedViewTag: ");
        A1A.append(this.A00);
        A1A.append(" propNodeMapping: ");
        A1A.append(this.A04);
        A1A.append(" propMap: ");
        return AnonymousClass7TF.A0i(this.A03, A1A);
    }
}
