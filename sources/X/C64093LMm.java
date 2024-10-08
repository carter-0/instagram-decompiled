package X;

import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import java.util.List;

/* renamed from: X.LMm  reason: case insensitive filesystem */
public final class C64093LMm {
    public final Uri A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final boolean A04;

    public C64093LMm(int i, List list) {
        Uri uri;
        Uri uri2;
        String str = "image/*";
        if (i != 2) {
            str = Pxd.A00(105);
            if (i != 3) {
                this.A02 = Environment.DIRECTORY_DOWNLOADS;
                if (Build.VERSION.SDK_INT >= 29) {
                    uri2 = MediaStore.Downloads.getContentUri("external_primary");
                } else {
                    uri2 = Uri.EMPTY;
                }
                this.A00 = uri2;
            } else {
                this.A02 = Environment.DIRECTORY_MOVIES;
                uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                this.A00 = uri;
                this.A01 = str;
                this.A04 = true;
            }
        } else {
            this.A02 = Environment.DIRECTORY_PICTURES;
            uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            this.A00 = uri;
            this.A01 = str;
            this.A04 = true;
        }
        this.A03 = list;
    }

    public static C64093LMm A00(int i) {
        return new C64093LMm(i, AnonymousClass7TE.A1C());
    }
}
