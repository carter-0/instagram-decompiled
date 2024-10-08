package X;

import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.view.Surface;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: X.XyH  reason: case insensitive filesystem */
public final class C22259XyH implements C341827na {
    public MediaRecorder A00;
    public Surface A01;
    public C346027uT A02;
    public RandomAccessFile A03;
    public final /* synthetic */ C345617to A04;

    public final C21986Xoh Exm(CamcorderProfile camcorderProfile, C342077o0 r9, FileDescriptor fileDescriptor, FileDescriptor fileDescriptor2, int i, int i2, boolean z, boolean z2) {
        return A00(camcorderProfile, fileDescriptor, (String) null, i, i2, z2);
    }

    public final C21986Xoh Exn(CamcorderProfile camcorderProfile, C342077o0 r9, String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3) {
        return A00(camcorderProfile, (FileDescriptor) null, str, i, i2, z2);
    }

    public final void EyQ() {
        try {
            MediaRecorder mediaRecorder = this.A00;
            if (mediaRecorder != null) {
                mediaRecorder.stop();
            }
            MediaRecorder mediaRecorder2 = this.A00;
            if (mediaRecorder2 != null) {
                mediaRecorder2.reset();
                this.A00.release();
                this.A00 = null;
            }
            C346027uT r1 = this.A02;
            if (r1 != null) {
                this.A04.A04.EEN(r1);
                this.A02 = null;
            }
            Surface surface = this.A01;
            if (surface != null) {
                surface.release();
                this.A01 = null;
            }
            RandomAccessFile randomAccessFile = this.A03;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException unused) {
                }
                this.A03 = null;
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        } catch (Throwable th) {
            MediaRecorder mediaRecorder3 = this.A00;
            if (mediaRecorder3 != null) {
                mediaRecorder3.reset();
                this.A00.release();
                this.A00 = null;
            }
            C346027uT r12 = this.A02;
            if (r12 != null) {
                this.A04.A04.EEN(r12);
                this.A02 = null;
            }
            Surface surface2 = this.A01;
            if (surface2 != null) {
                surface2.release();
                this.A01 = null;
            }
            RandomAccessFile randomAccessFile2 = this.A03;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (IOException unused2) {
                }
                this.A03 = null;
            }
            throw th;
        }
    }

    public C22259XyH(C345617to r1) {
        this.A04 = r1;
    }

    private C21986Xoh A00(CamcorderProfile camcorderProfile, FileDescriptor fileDescriptor, String str, int i, int i2, boolean z) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i2;
        if (i7 == 90 || i7 == 270) {
            i3 = camcorderProfile.videoFrameHeight;
            i4 = camcorderProfile.videoFrameWidth;
        } else {
            i3 = camcorderProfile.videoFrameWidth;
            i4 = camcorderProfile.videoFrameHeight;
        }
        C345617to r4 = this.A04;
        int i8 = r4.A02 + r4.A00;
        if (i8 % 180 != 0) {
            i5 = r4.A01;
            i6 = r4.A03;
        } else {
            i5 = r4.A03;
            i6 = r4.A01;
        }
        float f = (float) i3;
        float f2 = (float) i4;
        float f3 = ((float) i5) / ((float) i6);
        if (f / f2 > f3) {
            i3 = (int) (f2 * f3);
        } else {
            i4 = (int) (f / f3);
        }
        int i9 = i3 - (i3 % 16);
        int i10 = i4 - (i4 % 16);
        int i11 = i8 % 360;
        boolean z2 = false;
        int i12 = i9;
        if (i11 % 180 != 0) {
            z2 = true;
            i12 = i10;
        }
        camcorderProfile.videoFrameWidth = i12;
        if (!z2) {
            i9 = i10;
        }
        camcorderProfile.videoFrameHeight = i9;
        MediaRecorder mediaRecorder = new MediaRecorder();
        this.A00 = mediaRecorder;
        mediaRecorder.setVideoSource(2);
        MediaRecorder mediaRecorder2 = this.A00;
        if (z) {
            mediaRecorder2.setAudioSource(5);
            this.A00.setProfile(camcorderProfile);
        } else {
            mediaRecorder2.setOutputFormat(camcorderProfile.fileFormat);
            this.A00.setVideoFrameRate(camcorderProfile.videoFrameRate);
            this.A00.setVideoSize(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
            this.A00.setVideoEncodingBitRate(camcorderProfile.videoBitRate);
            this.A00.setVideoEncoder(camcorderProfile.videoCodec);
        }
        this.A00.setOrientationHint(i11);
        FileDescriptor fileDescriptor2 = fileDescriptor;
        String str2 = str;
        if (str != null) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(str2, "rws");
            this.A03 = randomAccessFile;
            this.A00.setOutputFile(randomAccessFile.getFD());
        } else if (fileDescriptor != null) {
            this.A00.setOutputFile(fileDescriptor);
        } else {
            throw new RuntimeException("MediaRecorder cannot be prepared without an output destination.");
        }
        this.A00.prepare();
        Surface surface = this.A00.getSurface();
        this.A01 = surface;
        C346027uT r0 = new C346027uT(surface, false);
        this.A02 = r0;
        r0.A09 = 1;
        this.A02.A07 = 1;
        r4.A04.A9j(this.A02);
        this.A00.start();
        return Xnz.A00(camcorderProfile, new Xnz(fileDescriptor2, str2, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, i11, i));
    }
}
