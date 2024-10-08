package X;

import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;

/* renamed from: X.4c7  reason: invalid class name and case insensitive filesystem */
public final class C267734c7 extends ContentObserver {
    public final AudioManager A00;

    public C267734c7(AudioManager audioManager, Handler handler) {
        super(handler);
        this.A00 = audioManager;
    }

    public final void onChange(boolean z, Uri uri) {
        super.onChange(z, uri);
        String path = uri.getPath();
        if (path != null && path.contains("/volume_music_")) {
            AudioManager audioManager = this.A00;
            audioManager.getStreamVolume(3);
            audioManager.getStreamMaxVolume(3);
        }
    }
}
