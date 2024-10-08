package X;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaActionSound;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.8kK  reason: invalid class name and case insensitive filesystem */
public final class C363778kK extends 0ng {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass8GJ A01;

    public final void run() {
        Object systemService = this.A00.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        0qQ.A0C(systemService, AnonymousClass000.A00(4));
        int i = 1w8.A00().A01;
        int streamVolume = ((AudioManager) systemService).getStreamVolume(1);
        if (i > 0 && streamVolume > 0) {
            AnonymousClass8GJ r0 = this.A01;
            MediaActionSound mediaActionSound = r0.A01;
            if (mediaActionSound == null) {
                mediaActionSound = new MediaActionSound();
                r0.A01 = mediaActionSound;
            }
            mediaActionSound.play(0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C363778kK(Context context, AnonymousClass8GJ r5) {
        super(1253171308, 3, false, false);
        this.A00 = context;
        this.A01 = r5;
    }
}
