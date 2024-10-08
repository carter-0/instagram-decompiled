package X;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.facebook.mediastreaming.opt.encoder.audio.AudioEncoderConfig;
import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;

/* renamed from: X.V5z  reason: case insensitive filesystem */
public abstract class C16792V5z {
    public static final MediaCodec A00(AudioEncoderConfig audioEncoderConfig) {
        int i = 0;
        int i2 = 2;
        int i3 = audioEncoderConfig.sampleRate;
        int i4 = audioEncoderConfig.channels;
        int i5 = audioEncoderConfig.bitRate;
        if (audioEncoderConfig.profile == XR2.HE) {
            i2 = 5;
        }
        MediaFormat mediaFormat = new MediaFormat();
        String A00 = AnonymousClass000.A00(4498);
        mediaFormat.setString("mime", A00);
        mediaFormat.setInteger(Pxd.A00(183), i2);
        if (i2 == 5) {
            mediaFormat.setInteger("profile", i2);
        }
        mediaFormat.setInteger(Pxd.A00(264), i3);
        mediaFormat.setInteger(Pxd.A00(78), i4);
        mediaFormat.setInteger(TraceFieldType.Bitrate, i5);
        MediaCodec mediaCodec = null;
        RuntimeException e = null;
        while (i < 3) {
            try {
                mediaCodec = 0fX.A02(A00, 655056819);
                if (mediaCodec != null) {
                    0fX.A07(mediaCodec, (MediaCrypto) null, mediaFormat, (Surface) null, 1, -731834737);
                    break;
                }
                continue;
                i++;
            } catch (IOException e2) {
                throw new RuntimeException("MediaCodec creation failed", e2);
            } catch (IllegalStateException e3) {
                throw new RuntimeException("MediaCodec audio encoder configure failed", e3);
            } catch (RuntimeException e4) {
                e = e4;
                mediaCodec = null;
            }
        }
        if (mediaCodec != null) {
            return mediaCodec;
        }
        if (e == null) {
            e = new RuntimeException("Audio encoder failed to create");
        }
        throw e;
    }
}
