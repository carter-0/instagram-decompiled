package X;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;
import org.webrtc.HardwareVideoEncoder;

/* renamed from: X.Vsf  reason: case insensitive filesystem */
public final class C18484Vsf {
    public C16541Uwm A00;
    public C16547Uwu A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;

    public static final MediaCodec A00(C18484Vsf vsf, C16541Uwm uwm, C16547Uwu uwu, float f, int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2) {
        C16547Uwu uwu2;
        C18484Vsf vsf2;
        C16541Uwm uwm2;
        C16547Uwu uwu3 = uwu;
        float f2 = f;
        int i7 = i;
        int i8 = i2;
        int i9 = i3;
        int i10 = i4;
        int i11 = i5;
        int i12 = i6;
        try {
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", i7, i8);
            0qQ.A07(createVideoFormat);
            float f3 = (float) i10;
            createVideoFormat.setInteger("color-format", 2130708361);
            createVideoFormat.setInteger(TraceFieldType.Bitrate, i9);
            createVideoFormat.setInteger("frame-rate", i10);
            createVideoFormat.setFloat("i-frame-interval", f2);
            createVideoFormat.setInteger(Pxd.A00(78), 1);
            int ordinal = uwu3.ordinal();
            int i13 = 2;
            if (ordinal == 1 || ordinal == 2) {
                i13 = 8;
            } else if (ordinal != 3) {
                i13 = 1;
            }
            createVideoFormat.setInteger("profile", i13);
            int i14 = 256;
            if (ordinal == 2) {
                i14 = 512;
            }
            createVideoFormat.setInteger("level", i14);
            createVideoFormat.setFloat("max-fps-to-encoder", f3);
            if (z2) {
                createVideoFormat.setInteger("latency", i11);
                createVideoFormat.setInteger("priority", i12);
            }
            if (z) {
                createVideoFormat.setInteger(Pxd.A00(677), 3);
                createVideoFormat.setInteger(Pxd.A00(676), 1);
            }
            if (uwm != C16541Uwm.DEFAULT) {
                int ordinal2 = uwm.ordinal();
                int i15 = 2;
                if (ordinal2 != 1) {
                    i15 = 0;
                    if (ordinal2 != 2) {
                        i15 = -1;
                    }
                }
                createVideoFormat.setInteger(HardwareVideoEncoder.KEY_BITRATE_MODE, i15);
            }
            W3b.A05("mss:VideoEncoderSetup", "Trying to get video encoder for profile: %s, bitrate mode: %s, format: %s", uwu3.name(), uwm.name(), createVideoFormat.toString());
            String string = createVideoFormat.getString("mime");
            if (string != null) {
                MediaCodec A022 = 0fX.A02(string, 1554375336);
                0fX.A07(A022, (MediaCrypto) null, createVideoFormat, (Surface) null, 1, -383515467);
                return A022;
            }
            throw AnonymousClass7TE.A0y();
        } catch (IOException e) {
            throw new RuntimeException("MediaCodec creation failed", e);
        } catch (Exception e2) {
            if (uwu3 == C16547Uwu.HIGH31) {
                W3b.A02("mss:VideoEncoderSetup", "Error getting videoencoder for profile: %s, bitrate mode: %s. Trying default high profile mode", e2, "HIGH31", uwm.name());
                vsf.A04 = true;
                C16547Uwu uwu4 = C16547Uwu.HIGH;
                vsf.A01 = uwu4;
                return A00(vsf, uwm, uwu4, f2, i7, i8, i9, i10, i5, i6, z, z2);
            }
            C16541Uwm uwm3 = C16541Uwm.DEFAULT;
            if (uwm != uwm3) {
                W3b.A02("mss:VideoEncoderSetup", "Error getting videoencoder for profile: %s, bitrate mode: %s. Trying default mode", e2, uwu3.name(), uwm.name());
                vsf.A03 = true;
                vsf.A00 = uwm3;
                vsf2 = vsf;
                uwm2 = uwm3;
                uwu2 = uwu3;
            } else {
                uwu2 = C16547Uwu.BASELINE;
                if (uwu3 != uwu2) {
                    W3b.A02("mss:VideoEncoderSetup", "Error getting videoencoder for profile: %s, bitrate mode: %s. Trying baseline", e2, uwu3.name(), "DEFAULT");
                    vsf.A02 = true;
                    vsf.A01 = uwu2;
                    vsf2 = vsf;
                    uwm2 = uwm3;
                } else {
                    throw new RuntimeException("MediaCodec creation failed", e2);
                }
            }
            return A00(vsf2, uwm2, uwu2, f2, i7, i8, i9, i10, i11, i12, z, z2);
        }
    }
}
