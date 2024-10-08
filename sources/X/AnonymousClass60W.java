package X;

import android.media.AudioTrack;
import android.os.Handler;
import com.google.android.exoplayer2.audio.DefaultAudioSink;

/* renamed from: X.60W  reason: invalid class name */
public final /* synthetic */ class AnonymousClass60W implements Runnable {
    public final /* synthetic */ AudioTrack A00;
    public final /* synthetic */ Handler A01;
    public final /* synthetic */ AnonymousClass60U A02;
    public final /* synthetic */ AnonymousClass4QH A03;
    public final /* synthetic */ DefaultAudioSink A04;
    public final /* synthetic */ AnonymousClass4Q3 A05;

    public /* synthetic */ AnonymousClass60W(AudioTrack audioTrack, Handler handler, AnonymousClass60U r3, AnonymousClass4QH r4, DefaultAudioSink defaultAudioSink, AnonymousClass4Q3 r6) {
        this.A04 = defaultAudioSink;
        this.A00 = audioTrack;
        this.A03 = r4;
        this.A01 = handler;
        this.A02 = r3;
        this.A05 = r6;
    }

    public final void run() {
        DefaultAudioSink defaultAudioSink = this.A04;
        AudioTrack audioTrack = this.A00;
        AnonymousClass4QH r5 = this.A03;
        Handler handler = this.A01;
        AnonymousClass60U r3 = this.A02;
        AnonymousClass4Q3 r1 = this.A05;
        try {
            audioTrack.flush();
            audioTrack.release();
            if (defaultAudioSink.A0g && r5 != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new C20175WmZ(r3, r5));
            }
            r1.A02();
            synchronized (DefaultAudioSink.A0q) {
                int i = DefaultAudioSink.A0n - 1;
                DefaultAudioSink.A0n = i;
                if (i == 0) {
                    DefaultAudioSink.A0o.shutdown();
                    DefaultAudioSink.A0o = null;
                }
            }
            return;
        } catch (Throwable th) {
            th = th;
        }
        throw th;
    }
}
