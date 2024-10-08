package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.facebook.ffmpeg.FFMpegAVStream;
import com.facebook.ffmpeg.FFMpegBadDataException;
import com.facebook.ffmpeg.FFMpegBufferInfo;
import com.facebook.ffmpeg.FFMpegMediaFormat;
import com.facebook.ffmpeg.FFMpegMediaMuxer;
import com.instagram.common.session.UserSession;
import java.nio.ByteBuffer;

public final class S70 {
    public FFMpegAVStream A00;
    public FFMpegAVStream A01;
    public FFMpegMediaMuxer A02;
    public boolean A03;
    public UserSession A04;
    public final int A05;
    public final FFMpegBufferInfo A06 = new FFMpegBufferInfo();

    public S70(UserSession userSession, int i) {
        this.A05 = i;
        this.A04 = userSession;
    }

    public final void A00(MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer) {
        this.A00.getClass();
        byteBuffer.getClass();
        FFMpegBufferInfo fFMpegBufferInfo = this.A06;
        fFMpegBufferInfo.offset = -1;
        fFMpegBufferInfo.size = -1;
        fFMpegBufferInfo.presentationTimeUs = -1;
        fFMpegBufferInfo.flags = -1;
        fFMpegBufferInfo.setFrom(bufferInfo);
        try {
            this.A00.writeFrame(fFMpegBufferInfo, byteBuffer);
        } catch (FFMpegBadDataException e) {
            throw new Exception(e);
        } catch (IllegalArgumentException unused) {
            try {
                fFMpegBufferInfo.presentationTimeUs += 500;
                FFMpegAVStream fFMpegAVStream = this.A00;
                fFMpegAVStream.getClass();
                fFMpegAVStream.writeFrame(fFMpegBufferInfo, byteBuffer);
            } catch (FFMpegBadDataException e2) {
                throw new Exception(e2);
            } catch (IllegalArgumentException e3) {
                0wb.A07("ffmpeg_muxer_pts_err_audio", e3);
                0KC.A0G("FFMpegBasedMuxer", "audio pts, dts error", e3);
            }
        }
    }

    public final void A01(MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer) {
        this.A01.getClass();
        FFMpegBufferInfo fFMpegBufferInfo = this.A06;
        fFMpegBufferInfo.offset = -1;
        fFMpegBufferInfo.size = -1;
        fFMpegBufferInfo.presentationTimeUs = -1;
        fFMpegBufferInfo.flags = -1;
        fFMpegBufferInfo.setFrom(bufferInfo);
        try {
            this.A01.writeFrame(fFMpegBufferInfo, byteBuffer);
        } catch (FFMpegBadDataException e) {
            throw new Exception(e);
        } catch (IllegalArgumentException unused) {
            try {
                fFMpegBufferInfo.presentationTimeUs += 500;
                FFMpegAVStream fFMpegAVStream = this.A01;
                fFMpegAVStream.getClass();
                fFMpegAVStream.writeFrame(fFMpegBufferInfo, byteBuffer);
            } catch (FFMpegBadDataException e2) {
                throw new Exception(e2);
            } catch (IllegalArgumentException e3) {
                0wb.A07("ffmpeg_muxer_pts_err_video", e3);
                0KC.A0G("FFMpegBasedMuxer", "video pts, dts error", e3);
            }
        }
    }

    public final void A02(MediaFormat mediaFormat) {
        FFMpegMediaFormat fFMpegMediaFormat = FFMpegMediaFormat.toFFMpegMediaFormat(mediaFormat);
        FFMpegMediaMuxer fFMpegMediaMuxer = this.A02;
        FFMpegAVStream nativeAddStream = fFMpegMediaMuxer.mNativeWrapper.nativeAddStream(fFMpegMediaFormat, -1, fFMpegMediaMuxer.A02);
        this.A00 = nativeAddStream;
        if (nativeAddStream == null) {
            throw DbW.A0c("Failed to add Audio Stream. Input Format:", fFMpegMediaFormat.toString());
        }
    }

    public final void A03(MediaFormat mediaFormat) {
        FFMpegMediaFormat fFMpegMediaFormat = FFMpegMediaFormat.toFFMpegMediaFormat(mediaFormat);
        FFMpegMediaMuxer fFMpegMediaMuxer = this.A02;
        FFMpegAVStream nativeAddStream = fFMpegMediaMuxer.mNativeWrapper.nativeAddStream(fFMpegMediaFormat, -1, fFMpegMediaMuxer.A02);
        this.A01 = nativeAddStream;
        if (nativeAddStream == null) {
            throw DbW.A0c("Failed to add Video Stream. Input Format:", fFMpegMediaFormat.toString());
        }
    }
}
