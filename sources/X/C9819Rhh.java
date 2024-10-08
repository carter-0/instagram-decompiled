package X;

import com.facebook.ffmpeg.FFMpegAVStream;
import com.facebook.ffmpeg.FFMpegBufferInfo;
import com.facebook.proxygen.LigerSamplePolicy;
import java.nio.ByteBuffer;

/* renamed from: X.Rhh  reason: case insensitive filesystem */
public abstract class C9819Rhh {
    public static void A00(FFMpegAVStream fFMpegAVStream, FFMpegBufferInfo fFMpegBufferInfo, ByteBuffer byteBuffer) {
        int i = 5;
        do {
            try {
                fFMpegAVStream.writeFrame(fFMpegBufferInfo, byteBuffer);
                return;
            } catch (IllegalArgumentException e) {
                long j = fFMpegBufferInfo.presentationTimeUs + LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
                fFMpegBufferInfo.presentationTimeUs = j;
                0KC.A0L("FFMpegUtil", "ffmpeg write error, retry with incremented pts %s", e, Pxf.A1W(j));
                i--;
                if (i <= 0) {
                    throw e;
                }
            }
        } while (i <= 0);
        throw e;
    }
}
