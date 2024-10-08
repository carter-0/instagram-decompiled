package X;

import android.media.MediaRecorder;
import android.os.CountDownTimer;
import com.facebook.common.dextricks.Constants;
import com.facebook.ffmpeg.FFMpegAVStream;
import com.facebook.ffmpeg.FFMpegBufferInfo;
import com.facebook.ffmpeg.FFMpegMediaDemuxer;
import com.facebook.ffmpeg.FFMpegMediaFormat;
import com.facebook.ffmpeg.FFMpegMediaMuxer;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Map;

public final class Q2G implements C74493Pvn {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public MediaRecorder A07;
    public CountDownTimer A08;
    public C63822L8d A09;
    public boolean A0A = true;
    public boolean A0B;
    public final int A0C;
    public final AnonymousClass7JJ A0D;
    public final MTE A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final C11169SDk A0I;
    public final boolean A0J;

    public Q2G(C11169SDk sDk, AnonymousClass7JJ r4, MTE mte, int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, boolean z4) {
        0qQ.A0B(r4, 1);
        DbW.A1O(mte, 4, sDk);
        this.A0D = r4;
        this.A05 = i;
        this.A0E = mte;
        this.A0F = z;
        this.A0I = sDk;
        this.A0G = z2;
        this.A0H = z3;
        this.A0C = i2;
        this.A0J = z4;
        this.A02 = i5;
        this.A03 = i6;
        this.A04 = i3;
        this.A06 = i4;
    }

    public final void AHp() {
        this.A09 = null;
    }

    public static final void A00(Q2G q2g, Exception exc) {
        String str;
        C11169SDk sDk = q2g.A0I;
        float f = q2g.A00;
        int i = q2g.A01;
        if (exc instanceof IllegalStateException) {
            str = "vrc_startRecordingInternal_state_error";
        } else if (exc instanceof IOException) {
            str = "vrc_startRecordingInternal_io_error";
        } else {
            str = "vrc_startRecordingInternal_runtime_error";
        }
        C331327Ql r1 = sDk.A00;
        r1.A01("start_error");
        r1.A01(str);
        r1.A02(str, exc.getMessage());
        C11169SDk.A00(sDk, f, i);
        CountDownTimer countDownTimer = q2g.A08;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        q2g.A09 = null;
        q2g.A02(exc, "Voice recording failed to start.");
        q2g.release();
    }

    public static final void A01(Q2G q2g, Integer num, boolean z) {
        C63822L8d l8d;
        FFMpegMediaMuxer fFMpegMediaMuxer;
        Q2G q2g2 = q2g;
        C11169SDk sDk = q2g2.A0I;
        C11169SDk sDk2 = sDk;
        C331327Ql r10 = sDk.A00;
        r10.A01("stop_recording");
        try {
            CountDownTimer countDownTimer = q2g2.A08;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            MediaRecorder mediaRecorder = q2g2.A07;
            if (mediaRecorder != null) {
                mediaRecorder.stop();
            }
            if (q2g2.A0J && (l8d = q2g2.A09) != null) {
                try {
                    File A0t = AnonymousClass7TE.A0t(l8d.A02.AWk("_voice_message"));
                    File A0t2 = AnonymousClass7TE.A0t(l8d.A01);
                    FFMpegMediaDemuxer.Options options = new FFMpegMediaDemuxer.Options();
                    A0t.getCanonicalPath();
                    C7235Q0h q0h = Q12.A00;
                    FFMpegMediaDemuxer fFMpegMediaDemuxer = new FFMpegMediaDemuxer(q0h, A0t2.getAbsolutePath(), options);
                    fFMpegMediaDemuxer.initialize();
                    try {
                        fFMpegMediaMuxer = new FFMpegMediaMuxer(q0h, A0t.getCanonicalPath(), false, (String) null, -1, false, (Map) null, "faststart");
                        fFMpegMediaMuxer.initialize();
                        int trackCount = fFMpegMediaDemuxer.getTrackCount();
                        FFMpegMediaFormat[] fFMpegMediaFormatArr = new FFMpegMediaFormat[trackCount];
                        int trackCount2 = fFMpegMediaDemuxer.getTrackCount();
                        FFMpegAVStream[] fFMpegAVStreamArr = new FFMpegAVStream[trackCount2];
                        long[] jArr = new long[fFMpegMediaDemuxer.getTrackCount()];
                        for (int i = 0; i < trackCount2; i++) {
                            FFMpegMediaFormat trackFormat = fFMpegMediaDemuxer.getTrackFormat(i);
                            fFMpegMediaFormatArr[i] = trackFormat;
                            fFMpegAVStreamArr[i] = fFMpegMediaMuxer.mNativeWrapper.nativeAddStream(trackFormat, -1, -1);
                            jArr[i] = Long.MIN_VALUE;
                            fFMpegMediaDemuxer.selectTrack(i);
                        }
                        fFMpegMediaMuxer.A00();
                        for (int i2 = 0; i2 < trackCount; i2++) {
                            ByteBuffer byteBuffer = fFMpegMediaFormatArr[i2].getByteBuffer("csd-0");
                            if (byteBuffer != null) {
                                FFMpegBufferInfo fFMpegBufferInfo = new FFMpegBufferInfo();
                                int capacity = byteBuffer.capacity();
                                fFMpegBufferInfo.offset = 0;
                                fFMpegBufferInfo.size = capacity;
                                fFMpegBufferInfo.presentationTimeUs = 0;
                                fFMpegBufferInfo.flags = 2;
                                C9819Rhh.A00(fFMpegAVStreamArr[i2], fFMpegBufferInfo, byteBuffer);
                            }
                        }
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(Constants.LOAD_RESULT_NEED_REOPTIMIZATION);
                        while (true) {
                            int readSampleData = fFMpegMediaDemuxer.readSampleData(allocateDirect, 0);
                            if (readSampleData != -1) {
                                int sampleTrackIndex = fFMpegMediaDemuxer.getSampleTrackIndex();
                                int sampleFlags = fFMpegMediaDemuxer.getSampleFlags();
                                long sampleTime = fFMpegMediaDemuxer.getSampleTime();
                                fFMpegMediaDemuxer.getSampleDuration();
                                if (sampleTime == jArr[sampleTrackIndex]) {
                                    StringBuilder A1A = AnonymousClass7TE.A1A();
                                    A1A.append("Number of tracks: ");
                                    A1A.append(trackCount);
                                    A1A.append(", Track index: ");
                                    A1A.append(sampleTrackIndex);
                                    A1A.append(", Track media format: ");
                                    Pxf.A1O(A1A, fFMpegMediaFormatArr[sampleTrackIndex]);
                                    0wb.A03("ffmpeg_muxer_invalid_sample_time", Pxg.A0u(", Sample time: ", A1A, sampleTime));
                                } else {
                                    jArr[sampleTrackIndex] = sampleTime;
                                    FFMpegBufferInfo fFMpegBufferInfo2 = new FFMpegBufferInfo();
                                    fFMpegBufferInfo2.offset = 0;
                                    fFMpegBufferInfo2.size = readSampleData;
                                    fFMpegBufferInfo2.presentationTimeUs = sampleTime;
                                    fFMpegBufferInfo2.flags = sampleFlags;
                                    C9819Rhh.A00(fFMpegAVStreamArr[sampleTrackIndex], fFMpegBufferInfo2, allocateDirect);
                                }
                                if (!fFMpegMediaDemuxer.advance()) {
                                    break;
                                }
                            }
                        }
                        fFMpegMediaMuxer.A01();
                        fFMpegMediaDemuxer.release();
                        String path = A0t.getPath();
                        0qQ.A0B(path, 0);
                        l8d.A01 = path;
                        break;
                    } catch (Throwable th) {
                        fFMpegMediaDemuxer.release();
                        throw th;
                    }
                } catch (Exception unused) {
                }
            }
            if (z) {
                q2g2.A09 = null;
            }
            if (num == AnonymousClass05K.A00) {
                q2g2.A0D.Dc3();
            }
            float f = q2g2.A00;
            int i3 = q2g2.A01;
            r10.A01("stop_recording_ok");
            r10.A02("max_ampitude", String.valueOf((int) (f * 100.0f)));
            r10.A02("vmrecording_duration", Long.toString(((long) ((int) AnonymousClass7TE.A0P(((long) i3) & 4294967295L))) & 4294967295L, 10));
            r10.A01("vmrecording_success");
            ((C13842TiH) r10.A00.getValue()).A6p();
        } catch (RuntimeException e) {
            float f2 = q2g2.A00;
            int i4 = q2g2.A01;
            r10.A02("vrc_stopRecordingInternal_runtime_error", e.getMessage());
            r10.A01("stop_recording_error");
            C11169SDk.A00(sDk2, f2, i4);
            q2g2.A09 = null;
            q2g2.A0B = false;
            if (0qQ.A0K(e.getMessage(), "stop failed.")) {
                q2g2.A0D.Dc3();
                0KC.A0P("VoiceRecordController", 002.A0R("Voice recording failed to stop.", " %s"), new Object[]{e.getMessage()});
            } else {
                q2g2.A02(e, "Voice recording failed to stop.");
            }
        } catch (Throwable th2) {
            q2g2.A0B = false;
            q2g2.release();
            throw th2;
        }
        q2g2.A0B = false;
        q2g2.release();
    }

    private final void A02(Exception exc, String str) {
        Exception A0u;
        String A0g = 002.A0g(str, " Exception raised with message: ", exc.getMessage());
        if (exc instanceof IllegalStateException) {
            A0u = Pxe.A0j(A0g, exc);
        } else if (exc instanceof IOException) {
            A0u = Pxe.A0c(A0g, exc);
        } else {
            A0u = Pxe.A0u(A0g, exc);
        }
        0KC.A0F("VoiceRecordController", A0g, exc);
        this.A0D.DCn(A0u);
    }

    public final C63822L8d AuR() {
        return this.A09;
    }

    public final void Cng() {
        C11451SVo sVo;
        if (!this.A0B) {
            this.A00 = 0.0f;
            boolean z = false;
            this.A01 = 0;
            C331327Ql r5 = this.A0I.A00;
            ((C13842TiH) r5.A00.getValue()).A6r("vrc_maybeStartRecording");
            r5.A01("vmrecording_start");
            try {
                C63822L8d l8d = new C63822L8d(this.A0E);
                this.A09 = l8d;
                if (this.A0H) {
                    sVo = new C11451SVo(this);
                } else {
                    sVo = null;
                }
                MediaRecorder A002 = XXt.A00(sVo, l8d.A01, this.A02, this.A06, this.A04, this.A03, this.A0C, this.A0F);
                this.A07 = A002;
                A002.prepare();
                MediaRecorder mediaRecorder = this.A07;
                if (mediaRecorder != null) {
                    mediaRecorder.start();
                }
                this.A0B = true;
                CountDownTimer countDownTimer = this.A08;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                }
                MPC mpc = new MPC(this, 30);
                C52809Gd1 gd1 = new C52809Gd1((C62320sa) new MMF(this, 40), (0sP) mpc, (long) this.A05);
                this.A08 = gd1;
                gd1.start();
                r5.A01("vrc_startRecordingInternal_ok");
                z = true;
            } catch (IOException | IllegalStateException | RuntimeException e) {
                A00(this, e);
            }
            this.A0D.Dc1(z);
        }
    }

    public final void EyI(boolean z) {
        if (this.A0B) {
            A01(this, AnonymousClass05K.A00, z);
        }
    }

    public final boolean isRecording() {
        return this.A0B;
    }

    public final void release() {
        MediaRecorder mediaRecorder = this.A07;
        if (mediaRecorder != null) {
            mediaRecorder.reset();
        }
        MediaRecorder mediaRecorder2 = this.A07;
        if (mediaRecorder2 != null) {
            mediaRecorder2.release();
        }
        this.A07 = null;
        this.A0B = false;
        this.A00 = 0.0f;
        this.A01 = 0;
    }
}
