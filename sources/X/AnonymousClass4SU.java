package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import java.io.IOException;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.4SU  reason: invalid class name */
public final class AnonymousClass4SU {
    public final /* synthetic */ AnonymousClass4OI A00;
    public final /* synthetic */ AnonymousClass4OS A01;

    public AnonymousClass4SU(AnonymousClass4OI r1, AnonymousClass4OS r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void A00(Exception exc) {
        C2612448v r4;
        AnonymousClass4OS r2 = this.A01;
        AnonymousClass4OS.A0E(r2, "prepareMediaSource onError: %s", exc.getMessage());
        if (exc instanceof C2612348u) {
            r4 = (C2612448v) exc;
        } else if (exc instanceof IOException) {
            r4 = C2612348u.A00((IOException) exc, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS);
        } else if (exc instanceof RuntimeException) {
            r4 = C2612348u.A01((RuntimeException) exc, IgNetworkConsentStorage.MAX_ENTRIES);
        } else {
            r4 = null;
        }
        r2.A0P(AnonymousClass5OZ.RENDERER, r4);
    }
}
