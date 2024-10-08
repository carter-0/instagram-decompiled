package X;

import android.media.AudioManager;

/* renamed from: X.PZs  reason: case insensitive filesystem */
public final /* synthetic */ class C73274PZs implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AudioManager A01;

    public /* synthetic */ C73274PZs(AudioManager audioManager, int i) {
        this.A01 = audioManager;
        this.A00 = i;
    }

    public final void run() {
        try {
            this.A01.adjustStreamVolume(3, this.A00, 0);
        } catch (Exception e) {
            0wb.A06("REEL_VIDEO_PLAYER_FAILED_TO_ADJUST_VOLUME", "Failed to adjust volume", e);
        }
    }
}
