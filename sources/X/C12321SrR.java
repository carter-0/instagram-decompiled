package X;

import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.net.Uri;
import com.facebook.videolite.transcoder.base.SphericalMetadata;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;

/* renamed from: X.SrR  reason: case insensitive filesystem */
public final class C12321SrR implements C13725Tfv {
    public final C7232Q0d AU8(URL url) {
        C266784aL.A06(false, "do not call extractMediaMetadata on url for image");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C7232Q0d AU7(Uri uri) {
        int i;
        String str;
        String str2;
        C349257zq.A03("ImageMetadataExtractor.extract");
        if (uri.getPath() != null) {
            File A0Y = Pxg.A0Y(uri);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(A0Y.getPath(), options);
            int i2 = options.outHeight;
            int i3 = options.outWidth;
            try {
                i = 0;
                int attributeInt = new ExifInterface(A0Y.getPath()).getAttributeInt("Orientation", 0);
                if (attributeInt == 3) {
                    i = 180;
                } else if (attributeInt == 6) {
                    i = 90;
                } else if (attributeInt == 8) {
                    i = 270;
                }
            } catch (IOException | RuntimeException unused) {
                i = 0;
            }
            try {
                str = new ExifInterface(A0Y.getPath()).getAttribute("Copyright");
            } catch (IOException e) {
                0KC.A0F("ImageMetadataExtractor", AnonymousClass7TF.A0m("Failed to fetch ExifInterface.TAG_COPYRIGHT: ", e), e);
                str = null;
            }
            try {
                str2 = new ExifInterface(A0Y.getPath()).getAttribute("Model");
            } catch (IOException e2) {
                0KC.A0O("ImageMetadataExtractor", "Failed to fetch ExifInterface.TAG_MODEL: %s", new Object[]{e2.getMessage(), e2});
                str2 = null;
            }
            int i4 = i2;
            int i5 = i3;
            C7232Q0d q0d = new C7232Q0d((SphericalMetadata) null, str, str2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, "PHOTO", (HashMap) null, i5, i4, i, 0, 0, -1, -1, -1, A0Y.length(), false);
            C349257zq.A01();
            return q0d;
        }
        C349257zq.A01();
        throw JTO.A0u("uri.getPath() is null");
    }
}
