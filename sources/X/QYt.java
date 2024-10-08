package X;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

public final class QYt extends QYz {
    public final C11404SSb A00;
    public final int[] A01;

    public QYt(C11404SSb sSb, ReadableMap readableMap) {
        super((ReadableMap) null);
        int[] iArr;
        this.A00 = sSb;
        ReadableArray array = readableMap.getArray("input");
        if (array == null) {
            iArr = new int[0];
        } else {
            int size = array.size();
            iArr = new int[size];
            for (int i = 0; i < size; i++) {
                iArr[i] = array.getInt(i);
            }
        }
        this.A01 = iArr;
    }

    public final String A03() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        SIU.A02(this, "DivisionAnimatedNode[", A1A);
        A1A.append("]: input nodes: ");
        A1A.append(this.A01);
        A1A.append(" - super: ");
        return AnonymousClass7TF.A0l(super.A03(), A1A);
    }
}
