package X;

import android.media.AudioTrack;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.mediastreaming.opt.audioenhancement.AndroidAudioEnhancementHybrid;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.VcB  reason: case insensitive filesystem */
public final class C17680VcB {
    public int A00;
    public int A01;
    public AudioTrack A02;
    public Thread A03;
    public ByteBuffer A04;
    public final AnonymousClass0JR A05;
    public final AndroidAudioEnhancementHybrid A06;
    public final C17174VLd A07;
    public final ByteBuffer A08 = ByteBuffer.allocateDirect(C249703kE.FLAG_MOVED);
    public final AtomicBoolean A09 = JTQ.A0k();

    public C17680VcB(AndroidAudioEnhancementHybrid androidAudioEnhancementHybrid, C17174VLd vLd) {
        this.A06 = androidAudioEnhancementHybrid;
        this.A07 = vLd;
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        0qQ.A07(awakeTimeSinceBootClock);
        this.A05 = awakeTimeSinceBootClock;
        this.A01 = 44100;
        this.A00 = 1;
    }
}
