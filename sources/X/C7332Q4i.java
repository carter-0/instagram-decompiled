package X;

import android.media.MediaFormat;
import com.facebook.ffmpeg.FFMpegAVStream;
import com.facebook.ffmpeg.FFMpegBadDataException;
import com.facebook.ffmpeg.FFMpegBufferInfo;
import com.facebook.ffmpeg.FFMpegMediaFormat;
import com.facebook.ffmpeg.FFMpegMediaMuxer;
import java.util.Map;

/* renamed from: X.Q4i  reason: case insensitive filesystem */
public final class C7332Q4i implements C13850TiT {
    public int A00 = -1;
    public int A01 = -1;
    public FFMpegAVStream A02;
    public FFMpegAVStream A03;
    public FFMpegBufferInfo A04;
    public C7235Q0h A05;
    public FFMpegMediaMuxer A06;
    public String A07 = null;
    public String A08 = null;
    public Map A09;
    public boolean A0A = false;
    public boolean A0B;
    public boolean A0C;

    public final String BVE() {
        return "FFMpeg";
    }

    public C7332Q4i(C7235Q0h q0h, String str, boolean z, String str2, int i, boolean z2, Map map) {
        this.A05 = q0h;
        this.A04 = new FFMpegBufferInfo();
        this.A01 = i;
        this.A00 = 20;
        this.A0A = z;
        this.A07 = str;
        this.A0B = z2;
        this.A09 = map;
        this.A08 = str2;
    }

    public final void AJ0(String str) {
        FFMpegMediaMuxer fFMpegMediaMuxer = new FFMpegMediaMuxer(this.A05, str, this.A0A, this.A07, this.A01, this.A0B, this.A09, this.A08);
        fFMpegMediaMuxer.initialize();
        this.A06 = fFMpegMediaMuxer;
    }

    public final void EPD(MediaFormat mediaFormat) {
        FFMpegMediaMuxer fFMpegMediaMuxer = this.A06;
        this.A02 = fFMpegMediaMuxer.mNativeWrapper.nativeAddStream(FFMpegMediaFormat.toFFMpegMediaFormat(mediaFormat), -1, fFMpegMediaMuxer.A02);
    }

    public final void Eev(int i) {
        this.A03.setOrientationHint(i);
    }

    public final void EqH(MediaFormat mediaFormat) {
        FFMpegMediaMuxer fFMpegMediaMuxer = this.A06;
        this.A03 = fFMpegMediaMuxer.mNativeWrapper.nativeAddStream(FFMpegMediaFormat.toFFMpegMediaFormat(mediaFormat), this.A00, fFMpegMediaMuxer.A02);
    }

    public final void FNk(C13779Tgu tgu) {
        try {
            FFMpegBufferInfo fFMpegBufferInfo = this.A04;
            fFMpegBufferInfo.setFrom(tgu.AiO());
            this.A02.writeFrame(fFMpegBufferInfo, tgu.AjB());
        } catch (FFMpegBadDataException e) {
            throw new Exception(e);
        }
    }

    public final void FOI(C13779Tgu tgu) {
        try {
            FFMpegBufferInfo fFMpegBufferInfo = this.A04;
            fFMpegBufferInfo.setFrom(tgu.AiO());
            this.A03.writeFrame(fFMpegBufferInfo, tgu.AjB());
        } catch (FFMpegBadDataException e) {
            throw new Exception(e);
        }
    }

    public final boolean isStarted() {
        return this.A0C;
    }

    public final void start() {
        this.A06.A00();
        this.A0C = true;
    }

    public final void stop() {
        this.A06.A01();
        this.A0C = false;
    }
}
