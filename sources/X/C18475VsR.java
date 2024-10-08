package X;

import com.facebook.zero.sdk.staticdeps.json.JsonProvider;

/* renamed from: X.VsR  reason: case insensitive filesystem */
public final class C18475VsR {
    public final long A00;
    public final C17188VLs A01;
    public final boolean A02;
    public final boolean A03;

    public C18475VsR(C17188VLs vLs, long j, boolean z, boolean z2) {
        this.A01 = vLs;
        this.A00 = j;
        this.A02 = z;
        this.A03 = z2;
    }

    public static final void A00() {
        JsonProvider.get();
        throw new NullPointerException("getBuilder");
    }
}
