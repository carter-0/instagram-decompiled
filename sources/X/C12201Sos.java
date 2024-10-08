package X;

import com.facebook.proxygen.RootCACallbacks;

/* renamed from: X.Sos  reason: case insensitive filesystem */
public final class C12201Sos implements RootCACallbacks {
    public final /* synthetic */ SRB A00;

    public C12201Sos(SRB srb) {
        this.A00 = srb;
    }

    public final byte[][] getSystemRootCAs() {
        return new C11342SNz().A02();
    }
}
