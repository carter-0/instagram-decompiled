package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import org.webrtc.CameraCapturer;

public final class J4R extends 0Yg implements 0sP {
    public static final J4R A00 = new J4R();

    public J4R() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        GRN grn = (GRN) obj;
        0qQ.A0B(grn, 0);
        grn.A00 = IgNetworkConsentStorage.MAX_ENTRIES;
        grn.A00(Float.valueOf(1.0f), 0).A00 = C52518GVv.A00;
        grn.A00(Float.valueOf(1.03f), CameraCapturer.OPEN_CAMERA_DELAY_MS).A00 = new C7227Pzw(0.0f, 0.0f, 1.0f, 0.25f);
        grn.A00(Float.valueOf(1.3f), IgNetworkConsentStorage.MAX_ENTRIES);
        return C60340gF.A00;
    }
}
