package X;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.media.MediaPlayer;

public final class UKD extends C71572e9 {
    public MediaPlayer A00;

    public final void A0A(Canvas canvas) {
    }

    public final void A0E(RectF rectF) {
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public final void A09(float f) {
        float f2;
        AnonymousClass6B4 r2;
        MediaPlayer mediaPlayer = this.A00;
        if (mediaPlayer != null) {
            2dy r6 = this.A04;
            float[] fArr = r6.A0w;
            if (fArr != null || r6.A0y != null) {
                float f3 = 0.0f;
                if (fArr == null) {
                    f2 = 0.0f;
                } else {
                    f2 = fArr[0];
                }
                AnonymousClass6B4[] r8 = r6.A0y;
                AnonymousClass6B4 r3 = null;
                if (r8 == null) {
                    r2 = null;
                } else {
                    r2 = r8[0];
                }
                AnonymousClass2e5 r5 = this.A0B;
                float f4 = r5.A0E.A00;
                float A002 = AnonymousClass3JU.A00(r2, f2, f, f4);
                if (fArr != null) {
                    f3 = fArr[1];
                }
                if (r8 != null) {
                    r3 = r8[1];
                }
                mediaPlayer.setVolume((float) Math.pow(10.0d, (double) (A002 / 20.0f)), (float) Math.pow(10.0d, (double) (AnonymousClass3JU.A00(r3, f3, f, f4) / 20.0f)));
                if (!this.A00.isPlaying()) {
                    MediaPlayer mediaPlayer2 = this.A00;
                    if (mediaPlayer2 != null) {
                        float f5 = r6.A04;
                        float duration = ((f - f5) / (r6.A0E - f5)) * ((float) mediaPlayer2.getDuration());
                        if (AnonymousClass7TE.A00((float) this.A00.getCurrentPosition(), duration) > 0.1f) {
                            this.A00.seekTo((int) duration);
                        }
                    }
                    if (r5.A01 == 1) {
                        this.A00.start();
                    }
                }
            }
        }
    }
}
