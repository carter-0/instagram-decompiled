package X;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import org.webrtc.MediaStreamTrack;

public final class OVK {
    public 0sP A00;
    public boolean A01;
    public final Handler A02 = AnonymousClass7TF.A0D();
    public final AnonymousClass0eM A03;
    public final AudioManager A04;

    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.OVK r5) {
        /*
            android.media.AudioManager r0 = r5.A04
            java.util.List r1 = r0.getActiveRecordingConfigurations()
            X.0qQ.A07(r1)
            boolean r0 = r1 instanceof java.util.Collection
            r4 = 1
            if (r0 == 0) goto L_0x0028
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0028
        L_0x0014:
            r4 = 0
        L_0x0015:
            boolean r0 = r5.A01
            r5.A01 = r4
            if (r0 == r4) goto L_0x0027
            android.os.Handler r3 = r5.A02
            X.PWt r2 = new X.PWt
            r2.<init>(r5)
            r0 = 500(0x1f4, double:2.47E-321)
            r3.postDelayed(r2, r0)
        L_0x0027:
            return
        L_0x0028:
            java.util.Iterator r3 = r1.iterator()
        L_0x002c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r2 = r3.next()
            android.media.AudioRecordingConfiguration r2 = (android.media.AudioRecordingConfiguration) r2
            boolean r0 = r2.isClientSilenced()
            if (r0 == 0) goto L_0x002c
            int r1 = r2.getClientAudioSource()
            r0 = 7
            if (r1 == r0) goto L_0x0015
            int r1 = r2.getClientAudioSource()
            r0 = 6
            if (r1 != r0) goto L_0x002c
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OVK.A00(X.OVK):void");
    }

    public final void A01(0sP r5) {
        AudioManager audioManager = this.A04;
        AnonymousClass0eM r2 = this.A03;
        AudioManager.AudioRecordingCallback audioRecordingCallback = (AudioManager.AudioRecordingCallback) r2.getValue();
        if (r5 != null) {
            audioManager.registerAudioRecordingCallback(audioRecordingCallback, this.A02);
            ((AudioManager.AudioRecordingCallback) r2.getValue()).onRecordingConfigChanged(audioManager.getActiveRecordingConfigurations());
        } else {
            audioManager.unregisterAudioRecordingCallback(audioRecordingCallback);
        }
        this.A00 = r5;
        if (r5 != null) {
            C51968G9o.A1O(r5, this.A01);
        }
    }

    public OVK(Context context) {
        Object systemService = context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        0qQ.A0C(systemService, AnonymousClass000.A00(4));
        this.A04 = (AudioManager) systemService;
        this.A03 = C73925Pm5.A00(this, 12);
    }
}
