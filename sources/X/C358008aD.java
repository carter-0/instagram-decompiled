package X;

import com.facebook.cameracore.musiceffect.AudioServiceConfigurationAnnouncer;
import com.instagram.music.common.model.AudioOverlayTrack;

/* renamed from: X.8aD  reason: invalid class name and case insensitive filesystem */
public final class C358008aD implements Runnable {
    public final /* synthetic */ C357738Zk A00;

    public C358008aD(C357738Zk r1) {
        this.A00 = r1;
    }

    public final void run() {
        float f;
        C357738Zk r3 = this.A00;
        AudioOverlayTrack audioOverlayTrack = r3.A02;
        if (audioOverlayTrack != null && audioOverlayTrack.A06 != null) {
            r3.A07.postDelayed(this, 16);
            AnonymousClass8E0 r2 = r3.A0E;
            AudioServiceConfigurationAnnouncer audioServiceConfigurationAnnouncer = r3.A0G.A00;
            if (audioServiceConfigurationAnnouncer != null) {
                f = audioServiceConfigurationAnnouncer.audioClipProgress();
            } else {
                f = 0.0f;
            }
            r2.A01.A00(f);
        }
    }
}
