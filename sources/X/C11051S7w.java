package X;

import android.media.MediaFormat;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableList;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.nio.ByteBuffer;

/* renamed from: X.S7w  reason: case insensitive filesystem */
public abstract class C11051S7w {
    public static int A00(MediaFormat mediaFormat, String str) {
        if (mediaFormat.containsKey(str)) {
            return mediaFormat.getInteger(str);
        }
        return -1;
    }

    public static SJM A01(MediaFormat mediaFormat) {
        byte[] bArr;
        SOW A00 = SOW.A00();
        A00.A01(mediaFormat.getString("mime"));
        A00.A0V = mediaFormat.getString("language");
        A00.A0D = A00(mediaFormat, "max-bitrate");
        A00.A03 = A00(mediaFormat, TraceFieldType.Bitrate);
        A00.A0R = mediaFormat.getString("codecs-string");
        float f = -1.0f;
        if (mediaFormat.containsKey("frame-rate")) {
            try {
                f = mediaFormat.getFloat("frame-rate");
            } catch (ClassCastException unused) {
                f = (float) mediaFormat.getInteger("frame-rate");
            }
        }
        A00.A00 = f;
        A00.A0L = A00(mediaFormat, IgReactMediaPickerNativeModule.WIDTH);
        A00.A09 = A00(mediaFormat, IgReactMediaPickerNativeModule.HEIGHT);
        float f2 = 1.0f;
        if (mediaFormat.containsKey("sar-width") && mediaFormat.containsKey("sar-height")) {
            f2 = ((float) mediaFormat.getInteger("sar-width")) / ((float) mediaFormat.getInteger("sar-height"));
        }
        A00.A01 = f2;
        A00.A0A = A00(mediaFormat, "max-input-size");
        int i = 0;
        int i2 = 0;
        if (mediaFormat.containsKey("rotation-degrees")) {
            i2 = mediaFormat.getInteger("rotation-degrees");
        }
        A00.A0F = i2;
        SRQ srq = null;
        int A002 = A00(mediaFormat, "color-standard");
        int A003 = A00(mediaFormat, "color-range");
        int A004 = A00(mediaFormat, "color-transfer");
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
        if (byteBuffer != null) {
            bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
        } else {
            bArr = null;
        }
        if (!(A002 == -1 && A003 == -1 && A004 == -1 && bArr == null)) {
            srq = new SRQ(bArr, A002, A003, A004, -1, -1);
        }
        A00.A0N = srq;
        A00.A0G = A00(mediaFormat, "sample-rate");
        A00.A04 = A00(mediaFormat, "channel-count");
        A00.A0C = A00(mediaFormat, "pcm-encoding");
        ImmutableList.Builder A0Y = Pxe.A0Y();
        while (true) {
            ByteBuffer byteBuffer2 = mediaFormat.getByteBuffer(002.A0O("csd-", i));
            if (byteBuffer2 == null) {
                A00.A0X = A0Y.build();
                return Pxe.A0O(A00);
            }
            byte[] bArr2 = new byte[byteBuffer2.remaining()];
            byteBuffer2.get(bArr2);
            byteBuffer2.rewind();
            A0Y.add(bArr2);
            i++;
        }
    }
}
