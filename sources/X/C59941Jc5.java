package X;

import android.media.AudioManager;
import java.util.Enumeration;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Jc5  reason: case insensitive filesystem */
public final class C59941Jc5 {
    public final AudioManager A00;
    public final ConcurrentHashMap A01 = new ConcurrentHashMap();

    public static final void A00(C59941Jc5 jc5) {
        Enumeration keys = jc5.A01.keys();
        0qQ.A07(keys);
        while (keys.hasMoreElements()) {
            AnonymousClass4MN r1 = (AnonymousClass4MN) keys.nextElement();
            r1.pause();
            if (r1.getCurrentPosition() != 0) {
                r1.seekTo(0);
            }
        }
    }

    public C59941Jc5(AudioManager audioManager) {
        this.A00 = audioManager;
    }
}
