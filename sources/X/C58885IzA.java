package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import org.webrtc.CameraCapturer;

/* renamed from: X.IzA  reason: case insensitive filesystem */
public final class C58885IzA extends 0Yg implements 0sP {
    public static final C58885IzA A00 = new C58885IzA();

    public C58885IzA() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        GRN grn = (GRN) obj;
        grn.A00 = IgNetworkConsentStorage.MAX_ENTRIES;
        Float A0h = C51967G9n.A0h();
        grn.A00(A0h, 0);
        grn.A00(A0h, 499);
        Float A0g = C51967G9n.A0g();
        grn.A00(A0g, CameraCapturer.OPEN_CAMERA_DELAY_MS);
        grn.A00(A0g, 999);
        return C60340gF.A00;
    }
}
