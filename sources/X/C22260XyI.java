package X;

import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.SystemClock;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.RandomAccessFile;

/* renamed from: X.XyI  reason: case insensitive filesystem */
public final class C22260XyI implements C341827na {
    public MediaRecorder A00;
    public final C340737lk A01;
    public final MediaRecorder.OnErrorListener A02 = new C22038XuM(this);
    public final MediaRecorder.OnInfoListener A03 = new C22039XuN(this);
    public final boolean A04;

    public final C21986Xoh Exm(CamcorderProfile camcorderProfile, C342077o0 r12, FileDescriptor fileDescriptor, FileDescriptor fileDescriptor2, int i, int i2, boolean z, boolean z2) {
        int i3 = i2;
        A00(camcorderProfile, fileDescriptor, i3, z);
        Xnz xnz = new Xnz(fileDescriptor, (String) null, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, i3, i);
        xnz.A01(C21986Xoh.A0W, Long.valueOf(SystemClock.elapsedRealtime()));
        return new C21986Xoh(xnz);
    }

    public final C21986Xoh Exn(CamcorderProfile camcorderProfile, C342077o0 r10, String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3) {
        A00(camcorderProfile, new RandomAccessFile(str, "rws").getFD(), i2, z);
        return Xnz.A00(camcorderProfile, new Xnz((FileDescriptor) null, str, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, i2, i));
    }

    private void A00(CamcorderProfile camcorderProfile, FileDescriptor fileDescriptor, int i, boolean z) {
        MediaRecorder mediaRecorder = new MediaRecorder();
        this.A00 = mediaRecorder;
        C340737lk r3 = this.A01;
        r3.Djc(mediaRecorder);
        boolean z2 = this.A04;
        MediaRecorder mediaRecorder2 = this.A00;
        if (z2) {
            mediaRecorder2.setAudioSource(5);
            this.A00.setProfile(camcorderProfile);
        } else {
            mediaRecorder2.setOutputFormat(camcorderProfile.fileFormat);
            this.A00.setVideoFrameRate(camcorderProfile.videoFrameRate);
            this.A00.setVideoSize(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
            this.A00.setVideoEncodingBitRate(camcorderProfile.videoBitRate);
            this.A00.setVideoEncoder(camcorderProfile.videoCodec);
        }
        MediaRecorder mediaRecorder3 = this.A00;
        if (!z) {
            i = 0;
        }
        mediaRecorder3.setOrientationHint(i);
        this.A00.setOutputFile(fileDescriptor);
        this.A00.setOnInfoListener(this.A03);
        this.A00.setOnErrorListener(this.A02);
        this.A00.prepare();
        r3.DmV(this.A00);
        this.A00.start();
    }

    public final void EyQ() {
        MediaRecorder mediaRecorder = this.A00;
        if (mediaRecorder != null) {
            try {
                mediaRecorder.stop();
                this.A00.reset();
                this.A00.release();
                this.A00 = null;
            } catch (RuntimeException e) {
                Log.e("SimpleVideoCapture", "stopVideoRecording", e);
                throw new RuntimeException(e);
            } catch (Throwable th) {
                this.A00.reset();
                this.A00.release();
                this.A00 = null;
                throw th;
            }
        }
    }

    public C22260XyI(C340737lk r2, boolean z) {
        this.A04 = z;
        this.A01 = r2;
    }
}
