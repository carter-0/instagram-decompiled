package X;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.util.Pair;
import android.view.Surface;
import com.facebook.cameracore.audio.fbaaudiopostprocessing.AudioPostProcessor;
import com.facebook.jni.HybridData;
import com.facebook.proxygen.TraceFieldType;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;

public final class T8S implements C13808ThX, C13706TfQ {
    public long A00;
    public long A01;
    public MediaCodec A02;
    public Exception A03;
    public MediaFormat A04;
    public boolean A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final C10730Rx9 A09;
    public final S70 A0A;
    public final CountDownLatch A0B = new CountDownLatch(1);
    public final Handler A0C;

    public final void cancel() {
        this.A05 = true;
    }

    public final void Cp8(long j, long j2) {
        HybridData hybridData;
        this.A00 = 0;
        this.A01 = j2;
        C10730Rx9 rx9 = this.A09;
        if (rx9.A04) {
            rx9.A03.processNext();
        }
        try {
            this.A0B.await();
            rx9.A04 = false;
            AudioPostProcessor audioPostProcessor = rx9.A03;
            if (audioPostProcessor.mDestructed.compareAndSet(false, true) && (hybridData = audioPostProcessor.mHybridData) != null) {
                hybridData.resetNative();
                audioPostProcessor.mHybridData = null;
            }
            rx9.A00 = null;
            0fX.A03(this.A02, -315954667);
            this.A0C.getLooper().quitSafely();
            Exception exc = this.A03;
            if (exc != null) {
                throw C41845B3m.A0j(exc);
            }
        } catch (InterruptedException e) {
            throw C41845B3m.A0j(e);
        }
    }

    public final void DVg(ByteBuffer byteBuffer, int i, long j) {
        if (!this.A05) {
            this.A0C.post(new TJK(this, i, j));
        }
    }

    public final void E40() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", "audio/mp4a-latm");
        mediaFormat.setInteger("aac-profile", 2);
        mediaFormat.setInteger("sample-rate", this.A08);
        mediaFormat.setInteger("channel-count", this.A07);
        mediaFormat.setInteger(TraceFieldType.Bitrate, 64000);
        this.A04 = mediaFormat;
        MediaCodec A022 = 0fX.A02("audio/mp4a-latm", 107985677);
        this.A02 = A022;
        0fX.A07(A022, (MediaCrypto) null, this.A04, (Surface) null, 1, 1682380050);
        0fX.A05(this.A02, 2110769142);
    }

    public final Pair EHX() {
        ByteBuffer byteBuffer;
        int dequeueInputBuffer = this.A02.dequeueInputBuffer(10000);
        if (dequeueInputBuffer >= 0) {
            byteBuffer = this.A02.getInputBuffer(dequeueInputBuffer);
        } else {
            this.A03 = AnonymousClass7TE.A15("dequeueInputBuffer timeout");
            this.A0B.countDown();
            byteBuffer = null;
            dequeueInputBuffer = -1;
        }
        return Pxf.A0K(byteBuffer, dequeueInputBuffer);
    }

    public final void ExD() {
        this.A0A.A02(this.A04);
    }

    public T8S(S70 s70, float[] fArr, int[] iArr, String[] strArr, int i, int i2) {
        this.A0A = s70;
        int i3 = i * C249703kE.FLAG_MOVED;
        this.A06 = i3;
        this.A07 = i;
        int i4 = i2;
        this.A08 = i4;
        C10730Rx9 rx9 = new C10730Rx9((float) i4, 1, i3, i);
        this.A09 = rx9;
        rx9.A00 = this;
        String[] strArr2 = strArr;
        int createGraph2 = rx9.A03.createGraph2(1, strArr2, fArr, iArr, new C12058Sll(rx9));
        if (createGraph2 == 0 || createGraph2 == 4) {
            rx9.A04 = true;
        } else {
            rx9.A04 = false;
        }
        this.A0C = Pxg.A0N(Pxf.A0I("video_resize_audio_encoder_thread"));
    }
}
