package X;

import android.media.MediaFormat;
import com.facebook.ffmpeg.FFMpegMediaDemuxer;
import com.facebook.ffmpeg.FFMpegMediaFormat;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* renamed from: X.Srn  reason: case insensitive filesystem */
public final class C12341Srn implements C13853TiW {
    public int A00;
    public C7235Q0h A01;
    public FFMpegMediaDemuxer A02;

    public final int E6j(ByteBuffer byteBuffer, int i) {
        return this.A02.readSampleData(byteBuffer, 0);
    }

    public final boolean AAt() {
        return this.A02.advance();
    }

    public final int BpB() {
        return this.A02.getSampleFlags();
    }

    public final long BpD() {
        return this.A02.getSampleTime();
    }

    public final int BpE() {
        return this.A02.getSampleTrackIndex();
    }

    public final int C93() {
        return this.A02.getTrackCount();
    }

    public final MediaFormat C97(int i) {
        float f;
        FFMpegMediaFormat trackFormat = this.A02.getTrackFormat(i);
        if (trackFormat == null) {
            return null;
        }
        if ("audio/mp4a".equals(DbT.A11("mime", trackFormat.mMap))) {
            trackFormat.setString("mime", "audio/mp4a-latm");
        }
        MediaFormat mediaFormat = new MediaFormat();
        Iterator A16 = DbV.A16(trackFormat.mMap);
        while (A16.hasNext()) {
            String A18 = AnonymousClass7TE.A18(A16);
            Object obj = FFMpegMediaFormat.ALL_KEYS.get(A18);
            if (obj == String.class) {
                mediaFormat.setString(A18, DbT.A11(A18, trackFormat.mMap));
            } else if (obj == Integer.class) {
                mediaFormat.setInteger(A18, AnonymousClass7TG.A0A(C51966G9m.A14(A18, trackFormat.mMap)));
            } else if (obj == Long.class) {
                mediaFormat.setLong(A18, DbY.A04(C51966G9m.A14(A18, trackFormat.mMap)));
            } else if (obj == Float.class) {
                Number A14 = C51966G9m.A14(A18, trackFormat.mMap);
                if (A14 != null) {
                    f = A14.floatValue();
                } else {
                    f = 0.0f;
                }
                mediaFormat.setFloat(A18, f);
            } else if (obj == ByteBuffer.class) {
                mediaFormat.setByteBuffer(A18, (ByteBuffer) trackFormat.mMap.get(A18));
            }
        }
        return mediaFormat;
    }

    public final void EL0(long j, int i) {
        this.A02.seekTo(this.A00, j, i);
    }

    public final void ELD(int i) {
        this.A02.selectTrack(i);
        this.A00 = i;
    }

    public final void ETt(String str) {
        try {
            FFMpegMediaDemuxer fFMpegMediaDemuxer = new FFMpegMediaDemuxer(this.A01, str, new FFMpegMediaDemuxer.Options());
            this.A02 = fFMpegMediaDemuxer;
            fFMpegMediaDemuxer.initialize();
        } catch (Exception e) {
            throw Pxe.A0c("create ffmpeg concat file failed", e);
        }
    }

    public final void release() {
        this.A02.release();
    }
}
