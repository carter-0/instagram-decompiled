package X;

import org.webrtc.CameraCapturer;

/* renamed from: X.Izw  reason: case insensitive filesystem */
public final class C58933Izw extends 0Yg implements 0sP {
    public static final C58933Izw A00 = new C58933Izw();

    public C58933Izw() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        GRN grn = (GRN) obj;
        0qQ.A0B(grn, 0);
        grn.A00 = CameraCapturer.OPEN_CAMERA_TIMEOUT;
        Float valueOf = Float.valueOf(0.1f);
        C52881GeH A002 = grn.A00(valueOf, CameraCapturer.OPEN_CAMERA_DELAY_MS);
        JNL jnl = C52518GVv.A01;
        A002.A00 = jnl;
        grn.A00(valueOf, 3000);
        Float valueOf2 = Float.valueOf(0.4f);
        grn.A00(valueOf2, 3500).A00 = jnl;
        grn.A00(valueOf2, 6000);
        Float valueOf3 = Float.valueOf(0.7f);
        grn.A00(valueOf3, 6500).A00 = jnl;
        grn.A00(valueOf3, 9000);
        Float A0h = C51967G9n.A0h();
        grn.A00(A0h, 9500).A00 = jnl;
        grn.A00(A0h, CameraCapturer.OPEN_CAMERA_TIMEOUT);
        return C60340gF.A00;
    }
}
