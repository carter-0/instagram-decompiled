package X;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* renamed from: X.Sic  reason: case insensitive filesystem */
public final class C11903Sic implements C13531Tc3 {
    public static final String[] A01 = {"_data"};
    public final ContentResolver A00;

    public C11903Sic(ContentResolver contentResolver) {
        this.A00 = contentResolver;
    }

    public final Cursor E5i(Uri uri) {
        return 0fM.A01(this.A00, MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, "kind = 1 AND video_id = ?", (String) null, A01, new String[]{uri.getLastPathSegment()}, -662005423);
    }
}
