package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.facebook.mediastreaming.opt.encoder.audio.AndroidPlatformAudioEncoderHybrid;
import com.facebook.mediastreaming.opt.encoder.audio.AudioEncoderConfig;
import java.nio.ByteBuffer;
import java.util.NoSuchElementException;

/* renamed from: X.Vzu  reason: case insensitive filesystem */
public final class C18759Vzu {
    public int A00;
    public int A01;
    public int A02;
    public MediaCodec.BufferInfo A03;
    public MediaCodec A04;
    public MediaFormat A05;
    public AudioEncoderConfig A06;
    public C18078Vl7 A07;
    public C20971X7b A08;
    public boolean A09;
    public boolean A0A = true;
    public final AndroidPlatformAudioEncoderHybrid A0B;
    public final AnonymousClass0eM A0C = AnonymousClass0eN.A01(new TTN(this, 35));

    public C18759Vzu(AndroidPlatformAudioEncoderHybrid androidPlatformAudioEncoderHybrid) {
        this.A0B = androidPlatformAudioEncoderHybrid;
    }

    public static final ByteBuffer A00(MediaFormat mediaFormat, C18759Vzu vzu) {
        ByteBuffer byteBuffer;
        byte[] bArr = null;
        int i = 0;
        boolean z = false;
        if (mediaFormat == null || (byteBuffer = mediaFormat.getByteBuffer("csd-0")) == null) {
            return null;
        }
        if (vzu.A0A) {
            byte[] array = byteBuffer.array();
            if (array != null) {
                bArr = array;
                z = true;
            }
            String str = "";
            if (z) {
                while (true) {
                    int i2 = i;
                    if (!AnonymousClass7TF.A1T(i, bArr.length)) {
                        break;
                    }
                    i++;
                    try {
                        String format = String.format("%02X ", C66581MXm.A1b(Byte.valueOf(Byte.valueOf(bArr[i2]).byteValue()), 1));
                        0qQ.A07(format);
                        str = 002.A0R(str, format);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        throw new NoSuchElementException(e.getMessage());
                    }
                }
            }
            W3b.A05("mss:AndroidPlatformAudioEncoderImpl", 002.A0R("AudioEncoderConfig: ASC Hex value:", str), new Object[0]);
            vzu.A0A = false;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteBuffer.remaining());
        allocateDirect.put(byteBuffer);
        return allocateDirect;
    }

    public final void A02() {
        W3b.A03("mss:AndroidPlatformAudioEncoderImpl", "AndroidPlatformAudioEncoderImpl.stop", new Object[0]);
        MediaCodec mediaCodec = this.A04;
        if (mediaCodec != null) {
            try {
                0fX.A06(mediaCodec, 89656251);
                0fX.A03(mediaCodec, -149246662);
            } catch (Exception unused) {
            }
        }
        this.A04 = null;
        this.A00 = 0;
        this.A02 = 0;
        this.A01 = 0;
    }

    public static final void A01(C18759Vzu vzu, ByteBuffer byteBuffer, int i, long j) {
        ByteBuffer byteBuffer2;
        AudioEncoderConfig audioEncoderConfig = vzu.A06;
        if (audioEncoderConfig == null || !audioEncoderConfig.useAudioASC) {
            byteBuffer2 = null;
        } else {
            byteBuffer2 = A00(vzu.A05, vzu);
        }
        MediaCodec mediaCodec = vzu.A04;
        if (mediaCodec != null) {
            long j2 = j;
            long j3 = j;
            vzu.A0B.onEncoded(byteBuffer, byteBuffer.position(), byteBuffer.remaining(), j2, j3, i, mediaCodec.getOutputFormat(), byteBuffer2);
        }
    }
}
