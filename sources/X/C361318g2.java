package X;

import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.DownloadedTrack;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.io.File;

/* renamed from: X.8g2  reason: invalid class name and case insensitive filesystem */
public final class C361318g2 {
    public final PendingMediaStore A00;

    public C361318g2(PendingMediaStore pendingMediaStore) {
        0qQ.A0B(pendingMediaStore, 1);
        this.A00 = pendingMediaStore;
    }

    public static final Integer A00(AudioOverlayTrack audioOverlayTrack, boolean z) {
        DownloadedTrack downloadedTrack;
        if (audioOverlayTrack == null || (downloadedTrack = audioOverlayTrack.A06) == null) {
            return null;
        }
        File file = new File(downloadedTrack.A02);
        if (!file.exists()) {
            return AnonymousClass05K.A0C;
        }
        if (!z || file.length() > 21) {
            return null;
        }
        try {
            file.delete();
        } catch (Exception e) {
            0KC.A0F("ClipsDraftSharingValidator", "Failed to delete invalid audio file", e);
        }
        return AnonymousClass05K.A0N;
    }
}
