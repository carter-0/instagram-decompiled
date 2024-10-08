package X;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.audio.DefaultAudioSink;

public final class S4Z {
    public final AudioTrack.StreamEventCallback A00;
    public final Handler A01 = new Handler(Looper.myLooper());
    public final /* synthetic */ DefaultAudioSink A02;

    public S4Z(DefaultAudioSink defaultAudioSink) {
        this.A02 = defaultAudioSink;
        this.A00 = new C7350Q6c(this, defaultAudioSink);
    }

    public final void A00(AudioTrack audioTrack) {
        Handler handler = this.A01;
        handler.getClass();
        audioTrack.registerStreamEventCallback(new TO4(handler, 0), this.A00);
    }

    public final void A01(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.A00);
        this.A01.removeCallbacksAndMessages((Object) null);
    }
}
