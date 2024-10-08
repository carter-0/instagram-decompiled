package X;

import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Handler;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import java.util.concurrent.Callable;

/* renamed from: X.90u  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C3724290u implements Callable {
    public final /* synthetic */ Rect A00;
    public final /* synthetic */ C340597lW A01;

    public /* synthetic */ C3724290u(Rect rect, C340597lW r2) {
        this.A01 = r2;
        this.A00 = rect;
    }

    public final Object call() {
        C342627ou r0;
        C342687p0 r1;
        C340597lW r4 = this.A01;
        Rect rect = this.A00;
        if (r4.isConnected()) {
            C340837lu r3 = r4.A0R;
            C340807lr r6 = r3.A0J;
            r6.A01("Can only check if the prepared on the Optic thread");
            if (r6.A00 && (r0 = r4.A07) != null) {
                MeteringRectangle[] meteringRectangleArr = {new MeteringRectangle(r0.A08(rect), IgNetworkConsentStorage.MAX_ENTRIES)};
                r6.A01("Can only perform spot metering on the Optic thread");
                r6.A01("Can only check if the prepared on the Optic thread");
                if (r6.A00 && r3.A0S && r3.A02 != null && r3.A09 != null && (r1 = r3.A0F) != null && ((Boolean) r1.A01(C342687p0.A0W)).booleanValue()) {
                    C341897nh r02 = r3.A0E;
                    r02.getClass();
                    if (!r02.isCameraSessionActivated() || !r3.A0E.isARCoreEnabled()) {
                        r3.A02.set(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr);
                        r3.A09.Eia(r3.A02.build(), (Handler) null, (C343197pp) null);
                        return null;
                    }
                }
            }
        }
        return null;
    }
}
