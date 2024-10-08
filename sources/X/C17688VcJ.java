package X;

import android.media.AudioRecord;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.mediastreaming.opt.audioenhancement.AndroidAudioEnhancementHybrid;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.VcJ  reason: case insensitive filesystem */
public final class C17688VcJ {
    public double A00 = 7.0d;
    public int A01 = C249703kE.FLAG_MOVED;
    public int A02 = 16;
    public int A03 = 44100;
    public AudioRecord A04;
    public OutputStream A05;
    public Thread A06;
    public final AnonymousClass0JR A07;
    public final AndroidAudioEnhancementHybrid A08;
    public final C17174VLd A09;
    public final AtomicBoolean A0A = JTQ.A0k();

    public C17688VcJ(AndroidAudioEnhancementHybrid androidAudioEnhancementHybrid, C17174VLd vLd) {
        this.A08 = androidAudioEnhancementHybrid;
        this.A09 = vLd;
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        0qQ.A07(awakeTimeSinceBootClock);
        this.A07 = awakeTimeSinceBootClock;
    }
}
