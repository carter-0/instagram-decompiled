package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.android.R;
import org.webrtc.CameraCapturer;

/* renamed from: X.Ma6  reason: case insensitive filesystem */
public abstract class C66637Ma6 {
    public static final String A00(Context context, Integer num) {
        int intValue;
        0qQ.A0B(context, 0);
        String A0p = C51967G9n.A0p(context, 2131958716);
        if (num == null || (intValue = num.intValue()) <= 0) {
            return A0p;
        }
        return context.getResources().getQuantityString(R.plurals.channels_context_line, intValue, new Object[]{A0p, C253673rC.A04(AnonymousClass7TF.A0A(context), Integer.valueOf(intValue), CameraCapturer.OPEN_CAMERA_TIMEOUT, true, true)});
    }

    public static final String A01(Resources resources, Integer num, boolean z) {
        int intValue;
        if (num == null || (intValue = num.intValue()) <= 0) {
            return null;
        }
        Integer valueOf = Integer.valueOf(intValue);
        int i = CameraCapturer.OPEN_CAMERA_TIMEOUT;
        if (z) {
            i = IgNetworkConsentStorage.MAX_ENTRIES;
        }
        return DbV.A0v(resources, C253673rC.A04(resources, valueOf, i, true, true), R.plurals.channels_context_line_without_type, intValue);
    }
}
