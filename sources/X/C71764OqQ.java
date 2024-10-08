package X;

import android.content.Context;
import android.content.res.Resources;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: X.OqQ  reason: case insensitive filesystem */
public final class C71764OqQ implements C74509Pw4 {
    public MediaPlayer A00;
    public final Xb7 A01;
    public final C262224Cq A02;
    public final Context A03;
    public final AudioManager A04;
    public final OUV A05;

    public final void Ech(boolean z) {
        MediaPlayer mediaPlayer = this.A00;
        if (mediaPlayer != null) {
            mediaPlayer.setLooping(true);
        }
    }

    public final void EeL(C62320sa r4) {
        0qQ.A0B(r4, 0);
        MediaPlayer mediaPlayer = this.A00;
        if (mediaPlayer != null) {
            mediaPlayer.setOnCompletionListener(new LVC(r4, 0));
        }
    }

    public final void EeN(0sL r3) {
        0qQ.A0B(r3, 0);
        MediaPlayer mediaPlayer = this.A00;
        if (mediaPlayer != null) {
            mediaPlayer.setOnErrorListener(new C71258OgP(r3));
        }
    }

    public final void EwM(C70828ONa oNa) {
        MediaPlayer mediaPlayer = this.A00;
        if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
            this.A05.A00("MediaPlayer starting", new Object[0]);
            Context context = this.A03;
            if (oNa.A00.toString() == null) {
                try {
                    context.getResources().getResourceName(0);
                } catch (Resources.NotFoundException unused) {
                }
            }
            MediaPlayer mediaPlayer2 = this.A00;
            if (mediaPlayer2 != null) {
                mediaPlayer2.start();
            }
        }
    }

    public final void ASd() {
        if (this.A00 == null) {
            throw AnonymousClass7TE.A0y();
        }
    }

    public final void CNA() {
        if (this.A00 == null) {
            this.A00 = new MediaPlayer();
        }
    }

    public final void Eld(C70828ONa oNa, C62320sa r7, C62320sa r8) {
        int A1X = DbW.A1X(r7);
        Uri uri = oNa.A00;
        MediaPlayer mediaPlayer = this.A00;
        if (mediaPlayer != null) {
            mediaPlayer.setDataSource(this.A03, uri);
        }
        MediaPlayer mediaPlayer2 = this.A00;
        if (mediaPlayer2 != null) {
            mediaPlayer2.setOnPreparedListener(new LVJ(r7, A1X));
        }
        try {
            this.A05.A00("Preparing MediaPlayer", new Object[A1X]);
            MediaPlayer mediaPlayer3 = this.A00;
            if (mediaPlayer3 != null) {
                mediaPlayer3.prepareAsync();
            }
        } catch (IOException e) {
            0KC.A0L("RingtoneMediaPlayer", "Error finishing media player setup", e, Arrays.copyOf(new Object[A1X], A1X));
            r8.invoke();
        }
    }

    public final void EnH() {
        MediaPlayer mediaPlayer = this.A00;
        if (mediaPlayer != null) {
            mediaPlayer.setAudioStreamType(0);
        }
    }

    public final void Eqq(float f) {
        MediaPlayer mediaPlayer = this.A00;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(f, f);
        }
    }

    public final void EyJ() {
    }

    public final void pause() {
        MediaPlayer mediaPlayer = this.A00;
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            this.A05.A00("MediaPlayer paused", new Object[0]);
            MediaPlayer mediaPlayer2 = this.A00;
            if (mediaPlayer2 != null) {
                mediaPlayer2.pause();
            }
        }
    }

    public final void release() {
        MediaPlayer mediaPlayer = this.A00;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        this.A00 = null;
    }

    public final void reset() {
        MediaPlayer mediaPlayer = this.A00;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
        }
    }

    public C71764OqQ(Context context, AudioManager audioManager, OUV ouv, C262224Cq r5) {
        C51972G9s.A1D(ouv, r5);
        this.A03 = context;
        this.A04 = audioManager;
        this.A05 = ouv;
        this.A02 = r5;
        this.A01 = new Xb7(context, audioManager, ouv);
    }
}
