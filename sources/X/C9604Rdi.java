package X;

import android.media.MediaFormat;
import android.os.Build;
import com.facebook.proxygen.TraceFieldType;
import org.webrtc.HardwareVideoEncoder;

/* renamed from: X.Rdi  reason: case insensitive filesystem */
public abstract class C9604Rdi {
    public static MediaFormat A00(C8907RFa rFa, RQc rQc, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, boolean z2) {
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(rFa.A00, i9, i3);
        createVideoFormat.setInteger("color-format", 2130708361);
        if (i7 > 0) {
            createVideoFormat.setInteger(TraceFieldType.Bitrate, i7);
        }
        if (i8 > 0) {
            createVideoFormat.setInteger("frame-rate", i8);
        }
        if (i4 > -1) {
            createVideoFormat.setInteger("i-frame-interval", i4);
        }
        if (z2) {
            createVideoFormat.setInteger("profile", i6);
            createVideoFormat.setInteger("level", i5);
            if (Build.VERSION.SDK_INT >= 29) {
                if (z) {
                    createVideoFormat.setInteger("max-bframes", i);
                    if ("qualcomm".equals(new C59110Jg().A01)) {
                        createVideoFormat.setString("ts-schema", "android.generic.1+2");
                    }
                }
            } else if (z) {
                createVideoFormat.setInteger(AnonymousClass000.A00(3496), 2);
            }
        }
        if (rQc != null) {
            createVideoFormat.setInteger("color-transfer", rQc.A02);
            createVideoFormat.setInteger("color-standard", rQc.A01);
            createVideoFormat.setInteger("color-range", rQc.A00);
            if (Build.VERSION.SDK_INT >= 33) {
                createVideoFormat.setFeatureEnabled("hdr-editing", true);
            }
        }
        if (i2 != -1) {
            createVideoFormat.setInteger(HardwareVideoEncoder.KEY_BITRATE_MODE, i2);
        }
        return createVideoFormat;
    }
}
