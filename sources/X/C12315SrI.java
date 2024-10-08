package X;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.SrI  reason: case insensitive filesystem */
public final class C12315SrI implements C13827Thy {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final AudioTrack A04;
    public final SEW A05;
    public final AtomicLong A06 = Pxe.A1D(0);

    public final C12315SrI Ble() {
        return this;
    }

    public final boolean Eve() {
        return true;
    }

    public final void FNG() {
    }

    private AudioTrack A00() {
        int i = this.A03;
        int i2 = this.A00;
        return new AudioTrack.Builder().setAudioFormat(new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(this.A02).build()).setTransferMode(1).setBufferSizeInBytes(this.A01).build();
    }

    public final void flush() {
        AudioTrack audioTrack = this.A04;
        if (audioTrack.getState() == 1) {
            audioTrack.stop();
            audioTrack.flush();
            this.A06.set(0);
        }
    }

    public final void release() {
        this.A04.release();
    }

    public C12315SrI(int i, int i2) {
        int i3;
        AudioTrack audioTrack;
        this.A03 = i;
        if (i2 == 1) {
            i3 = 4;
        } else if (i2 == 2) {
            i3 = 12;
        } else if (i2 == 6) {
            i3 = 252;
        } else {
            throw Pxe.A0i();
        }
        this.A00 = i3;
        this.A02 = 2;
        this.A01 = AudioTrack.getMinBufferSize(i, i3, 2);
        if (C266784aL.A00 >= 29) {
            audioTrack = A00();
        } else {
            AudioAttributes build = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1).build();
            int i4 = this.A03;
            int i5 = this.A00;
            audioTrack = new AudioTrack(build, new AudioFormat.Builder().setSampleRate(i4).setChannelMask(i5).setEncoding(this.A02).build(), this.A01, 1, 0);
        }
        int state = audioTrack.getState();
        if (state == 1) {
            this.A04 = audioTrack;
            this.A05 = new SEW(audioTrack);
            return;
        }
        audioTrack.release();
        throw DbW.A0b("build audio track failed. State: ", state);
    }

    public final void E4W(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            this.A06.compareAndSet(0, System.nanoTime());
            AudioTrack audioTrack = this.A04;
            if (audioTrack.getPlayState() != 3) {
                try {
                    audioTrack.play();
                } catch (IllegalStateException e) {
                    throw Pxe.A0j(002.A0o(e.getMessage(), " PlayerState: ", " AudioTrack state:", audioTrack.getPlayState(), audioTrack.getState()), e);
                }
            }
            audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        }
    }
}
