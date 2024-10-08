package X;

import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;

/* renamed from: X.NFs  reason: case insensitive filesystem */
public final class C68411NFs extends R4O implements C13662TeT {
    public C68411NFs() {
        super(TransportPayload.DEFAULT_INSTANCE);
    }

    public final void A06(NFJ nfj) {
        C66584MXp.A0J(this, nfj).transportPayloadCase_ = 2;
    }

    public final void A07(C68413NFu nFu) {
        C66584MXp.A0J(this, nFu).transportPayloadCase_ = 3;
    }

    public final void A08(boolean z) {
        TransportPayload transportPayload = (TransportPayload) C66580MXl.A0L(this);
        transportPayload.bitField0_ |= 16;
        transportPayload.openEb_ = z;
    }
}
