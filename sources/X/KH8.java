package X;

import android.location.Location;
import android.net.Uri;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.creation.activity.MediaCaptureActivity;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.photo.util.ExifImageData;
import java.util.HashMap;

public final class KH8 extends 2Cl {
    public final /* synthetic */ Location A00;
    public final /* synthetic */ Medium A01;
    public final /* synthetic */ MediaCaptureActivity A02;

    public final int getRunnableId() {
        return 295;
    }

    public KH8(Location location, Medium medium, MediaCaptureActivity mediaCaptureActivity) {
        this.A02 = mediaCaptureActivity;
        this.A01 = medium;
        this.A00 = location;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.content.Context, com.instagram.creation.activity.MediaCaptureActivity] */
    public final /* bridge */ /* synthetic */ Object call() {
        ? r1 = this.A02;
        return new C59855JaW(r1, this.A01.A02(), (Uri) null, r1.A04, true).call();
    }

    public final void onFail(Exception exc) {
        0kD.A0H("NewGalleryPhotoImportFailed", exc);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C59861Jad jad = (C59861Jad) obj;
        C364808m2 r1 = jad.A02;
        if (r1 == null || r1.AvM() == null) {
            0kD.A0H("NewGalleryPhotoImportFailed", AnonymousClass7TE.A0w("Null image data path in result"));
            return;
        }
        MediaCaptureActivity mediaCaptureActivity = this.A02;
        String AvM = r1.AvM();
        Location location = this.A00;
        ExifImageData exifImageData = jad.A01;
        exifImageData.getClass();
        int i = exifImageData.A00;
        HashMap hashMap = exifImageData.A03;
        hashMap.getClass();
        Medium medium = this.A01;
        String str = medium.A0Y;
        MediaUploadMetadata mediaUploadMetadata = medium.A0G;
        String str2 = medium.A0N;
        String str3 = medium.A0X;
        String str4 = medium.A0W;
        if (str4 != null) {
            MediaCaptureActivity.A02(location, DbT.A09(str4), mediaUploadMetadata, mediaCaptureActivity, (CropInfo) null, AvM, str, str2, str3, medium.A0M, medium.A0P, medium.A0Q, medium.A0S, (String) null, hashMap, i, 0);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
