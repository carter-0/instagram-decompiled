package X;

import android.media.AudioTrack;
import com.google.android.exoplayer2.audio.DefaultAudioSink;

/* renamed from: X.Q6c  reason: case insensitive filesystem */
public final class C7350Q6c extends AudioTrack.StreamEventCallback {
    public final /* synthetic */ S4Z A00;
    public final /* synthetic */ DefaultAudioSink A01;

    public C7350Q6c(S4Z s4z, DefaultAudioSink defaultAudioSink) {
        this.A00 = s4z;
        this.A01 = defaultAudioSink;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        AnonymousClass4QH r1;
        DefaultAudioSink defaultAudioSink = this.A00.A02;
        if (audioTrack.equals(defaultAudioSink.A0B) && (r1 = defaultAudioSink.A0E) != null && defaultAudioSink.A0Q) {
            r1.DUw();
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        AnonymousClass4QH r1;
        DefaultAudioSink defaultAudioSink = this.A00.A02;
        if (audioTrack.equals(defaultAudioSink.A0B) && (r1 = defaultAudioSink.A0E) != null && defaultAudioSink.A0Q) {
            r1.DUw();
        }
    }
}
