package X;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Build;
import android.util.Range;
import com.instagram.common.session.UserSession;

/* renamed from: X.QeF  reason: case insensitive filesystem */
public final class C7967QeF extends C7334Q4k {
    public final UserSession A00;
    public final AnonymousClass3Q2 A01;

    public static final Range A01(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        MediaCodecInfo.EncoderCapabilities encoderCapabilities;
        String string = mediaFormat.getString("mime");
        if (!(string == null || (capabilitiesForType = mediaCodec.getCodecInfo().getCapabilitiesForType(string)) == null || (encoderCapabilities = capabilitiesForType.getEncoderCapabilities()) == null)) {
            Range<Integer> complexityRange = encoderCapabilities.getComplexityRange();
            0qQ.A07(complexityRange);
            if (complexityRange.getLower() == null || complexityRange.getUpper() == null || 0qQ.A0K(complexityRange.getLower(), complexityRange.getUpper())) {
                return null;
            }
            return complexityRange;
        }
        return null;
    }

    public final double A0I() {
        if (Build.VERSION.SDK_INT < 31) {
            return -1.0d;
        }
        double A002 = 182.A00(0Tu.A05, this.A00, 37165120811827586L);
        0qQ.A0A(Double.valueOf(A002));
        return A002;
    }

    public final C11328SNg A0J() {
        if (Build.VERSION.SDK_INT < 31) {
            return C11328SNg.A06;
        }
        UserSession userSession = this.A00;
        0Tu r2 = 0Tu.A05;
        return new C11328SNg(DbS.A04(r2, userSession, 36602170858017359L), DbS.A04(r2, userSession, 36602170858082896L), DbS.A04(r2, userSession, 36602170858148433L), DbS.A04(r2, userSession, 36602170858213970L), DbS.A04(r2, userSession, 36602170858279507L), DbS.A04(r2, userSession, 36602170858345044L));
    }

    public C7967QeF(UserSession userSession, AnonymousClass3Q2 r2) {
        this.A00 = userSession;
        this.A01 = r2;
    }
}
