package X;

import android.graphics.Bitmap;
import android.net.Uri;
import com.instagram.avatar.AddAvatarHelper$LoadedImage$LoadedImageMetadata;

/* renamed from: X.Evq  reason: case insensitive filesystem */
public final class C49449Evq {
    public final Bitmap A00;
    public final AddAvatarHelper$LoadedImage$LoadedImageMetadata A01;

    public C49449Evq(Bitmap bitmap, Uri uri, int i) {
        this.A01 = new AddAvatarHelper$LoadedImage$LoadedImageMetadata(uri, i);
        this.A00 = bitmap;
    }
}
