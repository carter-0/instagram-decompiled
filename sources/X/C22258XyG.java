package X;

import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.view.Surface;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: X.XyG  reason: case insensitive filesystem */
public final class C22258XyG implements C341827na {
    public int A00;
    public int A01;
    public Surface A02;
    public C343217pr A03;
    public MediaRecorder A04;
    public RandomAccessFile A05;

    public final void EyQ() {
        try {
            MediaRecorder mediaRecorder = this.A04;
            if (mediaRecorder != null) {
                mediaRecorder.stop();
            }
            MediaRecorder mediaRecorder2 = this.A04;
            if (mediaRecorder2 != null) {
                mediaRecorder2.reset();
                this.A04.release();
                this.A04 = null;
            }
            C343217pr r0 = this.A03;
            if (r0 != null) {
                r0.A00((Surface) null);
            }
            Surface surface = this.A02;
            if (surface != null) {
                surface.release();
                this.A02 = null;
            }
            RandomAccessFile randomAccessFile = this.A05;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException unused) {
                }
                this.A05 = null;
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        } catch (Throwable th) {
            MediaRecorder mediaRecorder3 = this.A04;
            if (mediaRecorder3 != null) {
                mediaRecorder3.reset();
                this.A04.release();
                this.A04 = null;
            }
            C343217pr r02 = this.A03;
            if (r02 != null) {
                r02.A00((Surface) null);
            }
            Surface surface2 = this.A02;
            if (surface2 != null) {
                surface2.release();
                this.A02 = null;
            }
            RandomAccessFile randomAccessFile2 = this.A05;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (IOException unused2) {
                }
                this.A05 = null;
            }
            throw th;
        }
    }

    public final /* synthetic */ C21986Xoh Exm(CamcorderProfile camcorderProfile, C342077o0 r4, FileDescriptor fileDescriptor, FileDescriptor fileDescriptor2, int i, int i2, boolean z, boolean z2) {
        throw new UnsupportedOperationException(AnonymousClass000.A00(1010));
    }

    public final C21986Xoh Exn(CamcorderProfile camcorderProfile, C342077o0 r15, String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3) {
        int i3;
        int i4;
        int i5 = i2;
        if (i5 == 90 || i5 == 270) {
            i3 = camcorderProfile.videoFrameHeight;
            i4 = camcorderProfile.videoFrameWidth;
        } else {
            i3 = camcorderProfile.videoFrameWidth;
            i4 = camcorderProfile.videoFrameHeight;
        }
        float f = (float) i3;
        float f2 = (float) i4;
        float f3 = ((float) this.A01) / ((float) this.A00);
        if (f / f2 > f3) {
            i3 = (int) (f2 * f3);
        } else {
            i4 = (int) (f / f3);
        }
        camcorderProfile.videoFrameWidth = i3 - (i3 % 16);
        camcorderProfile.videoFrameHeight = i4 - (i4 % 16);
        String str3 = str;
        this.A05 = new RandomAccessFile(str3, "rws");
        MediaRecorder mediaRecorder = new MediaRecorder();
        this.A04 = mediaRecorder;
        mediaRecorder.setVideoSource(2);
        MediaRecorder mediaRecorder2 = this.A04;
        if (z2) {
            mediaRecorder2.setAudioSource(5);
            this.A04.setProfile(camcorderProfile);
        } else {
            mediaRecorder2.setOutputFormat(camcorderProfile.fileFormat);
            this.A04.setVideoFrameRate(camcorderProfile.videoFrameRate);
            this.A04.setVideoSize(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
            this.A04.setVideoEncodingBitRate(camcorderProfile.videoBitRate);
            this.A04.setVideoEncoder(camcorderProfile.videoCodec);
        }
        this.A04.setOrientationHint(0);
        this.A04.setOutputFile(this.A05.getFD());
        this.A04.prepare();
        this.A02 = this.A04.getSurface();
        C343217pr r1 = this.A03;
        r1.getClass();
        r1.A00(this.A02);
        this.A04.start();
        return Xnz.A00(camcorderProfile, new Xnz((FileDescriptor) null, str3, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, 0, i));
    }
}
