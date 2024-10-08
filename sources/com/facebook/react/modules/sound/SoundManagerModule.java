package com.facebook.react.modules.sound;

import X.0qQ;
import X.AnonymousClass000;
import X.Pxe;
import X.QZK;
import android.media.AudioManager;
import com.facebook.fbreact.specs.NativeSoundManagerSpec;
import com.facebook.react.module.annotations.ReactModule;
import org.webrtc.MediaStreamTrack;

@ReactModule(name = "SoundManager")
public final class SoundManagerModule extends NativeSoundManagerSpec {
    public void playTouchSound() {
        Object systemService = Pxe.A0T(this).getBaseContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        0qQ.A0C(systemService, AnonymousClass000.A00(4));
        ((AudioManager) systemService).playSoundEffect(0);
    }

    public SoundManagerModule(QZK qzk) {
        super(qzk);
    }
}
