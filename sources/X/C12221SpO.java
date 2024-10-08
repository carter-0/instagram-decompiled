package X;

import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.Iterator;

/* renamed from: X.SpO  reason: case insensitive filesystem */
public final class C12221SpO implements ReadableMapKeySetIterator {
    public Iterator A00;
    public final /* synthetic */ C12220SpN A01;

    public C12221SpO(C12220SpN spN) {
        this.A01 = spN;
        this.A00 = AnonymousClass7TF.A0u(spN.A00);
    }

    public final boolean CKI() {
        return this.A00.hasNext();
    }

    public final String Crc() {
        return DbT.A13(AnonymousClass7TE.A1J(this.A00));
    }
}
