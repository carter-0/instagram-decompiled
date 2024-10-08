package X;

import android.net.Uri;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.RemoteMedia;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.8gQ  reason: invalid class name and case insensitive filesystem */
public final class C361558gQ implements AnonymousClass0lh {
    public final Map A00 = new HashMap();
    public final Map A01 = new HashMap();

    public static final Medium A00(RemoteMedia remoteMedia, File file) {
        0qQ.A0B(remoteMedia, 0);
        0qQ.A0B(file, 1);
        long currentTimeMillis = System.currentTimeMillis();
        int hashCode = UUID.randomUUID().hashCode();
        int i = 1;
        if (remoteMedia.A09) {
            i = 3;
        }
        String canonicalPath = file.getCanonicalPath();
        0qQ.A07(canonicalPath);
        Medium medium = new Medium(Uri.fromFile(file), canonicalPath, hashCode, i, 0, remoteMedia.A01, currentTimeMillis / 1000, currentTimeMillis);
        medium.A0G.A00(remoteMedia.A02);
        medium.A0a = remoteMedia.A03.CCJ();
        medium.A0G.A0B = true;
        return medium;
    }

    public final synchronized Medium A01(RemoteMedia remoteMedia) {
        return (Medium) this.A01.get(remoteMedia);
    }

    public final synchronized void A02(Medium medium, RemoteMedia remoteMedia) {
        0qQ.A0B(remoteMedia, 0);
        0qQ.A0B(medium, 1);
        this.A01.put(remoteMedia, medium);
    }

    public final void onSessionWillEnd() {
        synchronized (this) {
            this.A01.clear();
            this.A00.clear();
        }
    }
}
