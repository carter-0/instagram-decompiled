package X;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import java.nio.ByteBuffer;

public class Q0Z implements C13853TiW {
    public MediaExtractor A00;

    public final int E6j(ByteBuffer byteBuffer, int i) {
        return this.A00.readSampleData(byteBuffer, 0);
    }

    public final boolean AAt() {
        return this.A00.advance();
    }

    public final int BpB() {
        return this.A00.getSampleFlags();
    }

    public final long BpD() {
        return this.A00.getSampleTime();
    }

    public final int BpE() {
        return this.A00.getSampleTrackIndex();
    }

    public final int C93() {
        return this.A00.getTrackCount();
    }

    public final MediaFormat C97(int i) {
        return this.A00.getTrackFormat(i);
    }

    public final void EL0(long j, int i) {
        this.A00.seekTo(j, i);
    }

    public final void ELD(int i) {
        this.A00.selectTrack(i);
    }

    public void ETt(String str) {
        this.A00.setDataSource(str);
    }

    public void release() {
        this.A00.release();
    }
}
