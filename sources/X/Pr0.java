package X;

import com.facebook.rsys.audio.gen.AudioModel;

public final /* synthetic */ class Pr0 extends 01B {
    public static final Pr0 A00 = new Pr0();

    public Pr0() {
        super(AudioModel.class, "audioBufferingStarted", "getAudioBufferingStarted()Z", 0);
    }

    public final Object get(Object obj) {
        return Boolean.valueOf(((AudioModel) obj).audioBufferingStarted);
    }
}
