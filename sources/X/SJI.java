package X;

import android.media.AudioManager;
import android.media.AudioTrack;
import com.facebook.audiofiltercore.interfaces.AudioInput;
import java.util.HashMap;

public final class SJI {
    public AudioTrack A00;
    public AudioInput A01;
    public C39897ADz A02;
    public C10212RoT A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final AudioManager.OnAudioFocusChangeListener A07 = new C71255OgM(this, 0);
    public final AudioManager A08;
    public final int A09;
    public final C10772Rxq A0A;
    public final C8859RDa A0B;

    private void A00() {
        AudioTrack audioTrack = this.A00;
        if (audioTrack != null) {
            audioTrack.release();
        }
        int i = 0;
        if (this.A0B == C8859RDa.MUSIC) {
            i = 3;
        }
        this.A00 = new AudioTrack(i, 44100, 4, 2, this.A09, 1, 0);
    }

    public final void A01() {
        C10212RoT roT;
        C39897ADz aDz = this.A02;
        if (aDz != null) {
            aDz.A01 = (long) this.A00.getUnderrunCount();
        }
        this.A05 = false;
        try {
            this.A00.pause();
            this.A00.flush();
        } catch (IllegalStateException e) {
            0KC.A0G("AudioPlayer", "Failed to pause AudioPlayer", e);
        }
        C10772Rxq rxq = this.A0A;
        TR2 tr2 = rxq.A01;
        if (tr2 != null && tr2.isAlive()) {
            TR2 tr22 = rxq.A01;
            tr22.A00.A05 = false;
            boolean z = false;
            while (true) {
                try {
                    tr22.join();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Pxe.A1F();
                    }
                    throw th;
                }
            }
            if (z) {
                Pxe.A1F();
            }
            rxq.A01 = null;
        }
        if (aDz != null) {
            float A012 = aDz.A01();
            float f = ((float) aDz.A0C) / 1000000.0f;
            long j = aDz.A0B;
            long j2 = aDz.A06;
            HashMap hashMap = new HashMap(6);
            if (j2 > 30 && (roT = this.A03) != null) {
                hashMap.put("render_audio_avg_processing_time_ms", String.valueOf(A012));
                long j3 = aDz.A01;
                if (j3 > -1) {
                    hashMap.put("render_audio_num_deadline_missed", String.valueOf(j3));
                }
                Pxk.A0Y(aDz, hashMap, f, j);
                roT.A00.ChD((long) hashCode(), "audio_pipeline_effect_removed", "AudioPlayer", hashMap);
            }
            this.A02 = null;
        }
    }

    public final void A02() {
        if (this.A05) {
            A01();
        }
        if (this.A04) {
            this.A08.abandonAudioFocus(this.A07);
        }
        if (this.A01 != null) {
            this.A01 = null;
        }
        try {
            this.A00.setPlaybackRate(44100);
        } catch (IllegalStateException e) {
            0KC.A0G("AudioPlayer", "Failed to set playback rate for AudioPlayer", e);
        }
    }

    public final void A03(boolean z, boolean z2) {
        if (this.A01 != null) {
            AudioManager audioManager = this.A08;
            int i = 3;
            if (audioManager.getStreamVolume(3) <= 0 && z) {
                audioManager.setStreamVolume(3, (int) (((double) audioManager.getStreamMaxVolume(3)) * 0.5d), 4);
            }
            this.A06 = z2;
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.A07;
            if (!z2) {
                i = 2;
            }
            boolean A1V = C66581MXm.A1V(audioManager.requestAudioFocus(onAudioFocusChangeListener, 3, i));
            this.A04 = A1V;
            if (!A1V) {
                A01();
                if (this.A04) {
                    audioManager.abandonAudioFocus(onAudioFocusChangeListener);
                    return;
                }
                return;
            }
            try {
                this.A00.play();
            } catch (IllegalStateException unused) {
                A00();
                this.A00.play();
            }
            int i2 = this.A09;
            C39897ADz aDz = new C39897ADz(C39902AIk.A01(2, 1, (long) i2, 44100) * 1000, (long) (i2 / 2));
            this.A02 = aDz;
            C10772Rxq rxq = this.A0A;
            AudioInput audioInput = this.A01;
            AudioTrack audioTrack = this.A00;
            rxq.A02 = audioInput;
            rxq.A00 = audioTrack;
            rxq.A04 = new short[((i2 + 1) / 2)];
            rxq.A03 = aDz;
            if (rxq.A01 == null) {
                rxq.A05 = true;
                C39897ADz aDz2 = rxq.A03;
                aDz2.A02();
                aDz2.A09 = true;
                TR2 tr2 = new TR2(rxq);
                rxq.A01 = tr2;
                tr2.start();
            }
            this.A05 = true;
        }
    }

    public SJI(AudioManager audioManager, C8859RDa rDa, C10212RoT roT) {
        audioManager.getClass();
        this.A08 = audioManager;
        this.A03 = roT;
        int minBufferSize = AudioTrack.getMinBufferSize(44100, 4, 2);
        this.A09 = minBufferSize <= 0 ? 4096 : minBufferSize;
        this.A0B = rDa;
        this.A0A = new C10772Rxq();
        A00();
    }
}
