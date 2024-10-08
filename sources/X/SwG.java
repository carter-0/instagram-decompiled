package X;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import org.webrtc.MediaStreamTrack;

public final class SwG implements AnonymousClass5NL {
    public int A00 = 3;
    public int A01;
    public Q60 A02;
    public boolean A03;
    public final Handler A04;
    public final Context A05;
    public final AudioManager A06;
    public final C284545Mz A07;

    public static void A00(SwG swG) {
        int i;
        AudioManager audioManager = swG.A06;
        int i2 = swG.A00;
        try {
            i = audioManager.getStreamVolume(i2);
        } catch (RuntimeException e) {
            2AG.A06("StreamVolumeManager", 002.A0O("Could not retrieve stream volume for stream type ", i2), e);
            i = audioManager.getStreamMaxVolume(i2);
        }
        boolean isStreamMute = audioManager.isStreamMute(swG.A00);
        if (swG.A01 != i || swG.A03 != isStreamMute) {
            swG.A01 = i;
            swG.A03 = isStreamMute;
            C284515Mu r1 = ((C284525Mv) swG.A07).A00;
            C284515Mu r0 = C284515Mu.$redex_init_class;
            AnonymousClass5N4 r2 = r1.A0h;
            r2.A02(new C12541Swr(), 30);
            r2.A01();
        }
    }

    public final int BPS() {
        return this.A06.getStreamMaxVolume(this.A00);
    }

    public final int BTH() {
        return this.A06.getStreamMinVolume(this.A00);
    }

    public final void EnI(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            A00(this);
            C284515Mu r2 = ((C284525Mv) this.A07).A00;
            AnonymousClass5NL r0 = r2.A0d;
            AnonymousClass5NP r3 = new AnonymousClass5NP(r0.BTH(), r0.BPS());
            if (!r3.equals(r2.A09)) {
                r2.A09 = r3;
                AnonymousClass5N4 r22 = r2.A0h;
                r22.A02(new C12542Sws(r3), 29);
                r22.A01();
            }
        }
    }

    public final void release() {
        Q60 q60 = this.A02;
        if (q60 != null) {
            try {
                this.A05.unregisterReceiver(q60);
            } catch (RuntimeException e) {
                2AG.A06("StreamVolumeManager", "Error unregistering stream volume receiver", e);
            }
            this.A02 = null;
        }
    }

    public SwG(Context context, Handler handler, C284545Mz r9) {
        int i;
        Context applicationContext = context.getApplicationContext();
        this.A05 = applicationContext;
        this.A04 = handler;
        this.A07 = r9;
        Object systemService = applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        C256703wD.A01(systemService);
        AudioManager audioManager = (AudioManager) systemService;
        this.A06 = audioManager;
        try {
            i = audioManager.getStreamVolume(3);
        } catch (RuntimeException e) {
            2AG.A06("StreamVolumeManager", 002.A0O("Could not retrieve stream volume for stream type ", 3), e);
            i = audioManager.getStreamMaxVolume(3);
        }
        this.A01 = i;
        this.A03 = audioManager.isStreamMute(3);
        Q60 q60 = new Q60(this);
        try {
            applicationContext.registerReceiver(q60, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.A02 = q60;
        } catch (RuntimeException e2) {
            2AG.A06("StreamVolumeManager", "Error registering stream volume receiver", e2);
        }
    }
}
