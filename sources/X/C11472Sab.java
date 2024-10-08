package X;

import android.media.MediaPlayer;
import android.view.SurfaceHolder;
import android.widget.VideoView;
import java.lang.reflect.Field;

/* renamed from: X.Sab  reason: case insensitive filesystem */
public final class C11472Sab implements SurfaceHolder.Callback {
    public final /* synthetic */ SurfaceHolder.Callback A00;
    public final /* synthetic */ VideoView A01;
    public final /* synthetic */ AnonymousClass4AL A02;
    public final /* synthetic */ Field A03;

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        0qQ.A0B(surfaceHolder, 0);
        this.A00.surfaceChanged(surfaceHolder, i, i2, i3);
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        0qQ.A0B(surfaceHolder, 0);
        if (182.A06(0Tu.A05, this.A02.A02, 36326025935795671L)) {
            0nY.A00().ATE(new RAA(this.A00, surfaceHolder));
        } else {
            this.A00.surfaceCreated(surfaceHolder);
        }
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        MediaPlayer mediaPlayer;
        0qQ.A0B(surfaceHolder, 0);
        Field field = this.A03;
        VideoView videoView = this.A01;
        Object obj = field.get(videoView);
        if ((obj instanceof MediaPlayer) && (mediaPlayer = (MediaPlayer) obj) != null) {
            field.set(videoView, new C7354Q6i(mediaPlayer));
        }
        this.A00.surfaceDestroyed(surfaceHolder);
    }

    public C11472Sab(SurfaceHolder.Callback callback, VideoView videoView, AnonymousClass4AL r3, Field field) {
        this.A00 = callback;
        this.A02 = r3;
        this.A03 = field;
        this.A01 = videoView;
    }
}
