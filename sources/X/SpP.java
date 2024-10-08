package X;

import com.facebook.react.bridge.ReadableMapKeySetIterator;

public final class SpP implements ReadableMapKeySetIterator {
    public int A00;
    public final /* synthetic */ String[] A01;

    public SpP(String[] strArr) {
        this.A01 = strArr;
    }

    public final boolean CKI() {
        return AnonymousClass7TF.A1T(this.A00, this.A01.length);
    }

    public final String Crc() {
        String[] strArr = this.A01;
        int i = this.A00;
        this.A00 = i + 1;
        return strArr[i];
    }
}
