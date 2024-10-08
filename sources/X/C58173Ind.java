package X;

import androidx.fragment.app.Fragment;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.compose.ui.gradientspinner.BezierControlPoints;
import com.instagram.compose.ui.gradientspinner.Segment;
import java.util.ArrayList;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.Ind  reason: case insensitive filesystem */
public final class C58173Ind extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58173Ind(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.A00 != 0) {
            Object value = AnonymousClass0eN.A00(0eO.A02, new C51689Fyp((Fragment) this.A01)).getValue();
            if (value != null) {
                return value;
            }
            throw DbW.A0c(AnonymousClass000.A00(2103), AnonymousClass000.A00(2096));
        }
        ArrayList A0v = DbS.A0v(30);
        int i = 0;
        do {
            A0v.add(new Segment(i, 0.0f, 0.0f, 0));
            i++;
        } while (i < 30);
        return new C52412GRo((BezierControlPoints) this.A01, A0v, 1.0f, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD, CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD, IgNetworkConsentStorage.MAX_ENTRIES);
    }
}
