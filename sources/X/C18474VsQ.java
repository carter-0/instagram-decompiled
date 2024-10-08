package X;

import com.facebook.zero.sdk.staticdeps.json.JsonProvider;

/* renamed from: X.VsQ  reason: case insensitive filesystem */
public final class C18474VsQ {
    public final C17187VLr A00;
    public final C18026Vk4 A01;
    public final boolean A02;
    public final boolean A03;

    public C18474VsQ(C17187VLr vLr, C18026Vk4 vk4, boolean z, boolean z2) {
        this.A00 = vLr;
        this.A01 = vk4;
        this.A02 = z;
        this.A03 = z2;
    }

    public static final void A00() {
        JsonProvider.get();
        throw new NullPointerException("getBuilder");
    }
}
