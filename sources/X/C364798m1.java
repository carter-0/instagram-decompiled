package X;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: X.8m1  reason: invalid class name and case insensitive filesystem */
public final class C364798m1 implements C364808m2 {
    public int A00;
    public int A01;
    public String A02;
    public Boolean A03;
    public final Uri A04;
    public final Uri A05;
    public final ContentResolver A06;

    public C364798m1(ContentResolver contentResolver, Uri uri, Uri uri2) {
        0qQ.A0B(contentResolver, 1);
        0qQ.A0B(uri, 2);
        this.A06 = contentResolver;
        this.A05 = uri;
        this.A04 = uri2;
    }

    public final Bitmap E1R(int i, boolean z) {
        try {
            Uri uri = this.A04;
            if (uri != null) {
                return C379849Vo.A01(this.A06, uri, i);
            }
        } catch (Exception e) {
            0KC.A0F("UriImage", "got exception decoding bitmap ", e);
        }
        return null;
    }

    private final ParcelFileDescriptor A00() {
        try {
            Uri uri = this.A05;
            if (!"file".equals(uri.getScheme())) {
                return this.A06.openFileDescriptor(uri, "r");
            }
            String path = uri.getPath();
            if (path != null) {
                return ParcelFileDescriptor.open(new File(path), 268435456);
            }
            throw new IllegalStateException("Required value was null.");
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    public static final void A01(C364798m1 r5) {
        if (r5.A02 == null) {
            ParcelFileDescriptor A002 = r5.A00();
            String str = "";
            if (A002 == null) {
                r5.A02 = str;
                return;
            }
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFileDescriptor(A002.getFileDescriptor(), (Rect) null, options);
                String str2 = options.outMimeType;
                if (str2 != null) {
                    str = str2;
                }
                r5.A02 = str;
                r5.A01 = options.outWidth;
                r5.A00 = options.outHeight;
                try {
                    A002.close();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            } catch (Throwable unused2) {
            }
        } else {
            return;
        }
        throw th;
    }

    public final String AvM() {
        return this.A05.getPath();
    }

    public final int Aw4() {
        return 0;
    }

    public final byte[] BG2() {
        return null;
    }

    public final Uri BZF() {
        return this.A04;
    }

    public final boolean Cdi() {
        Boolean bool = this.A03;
        if (bool != null) {
            return bool.booleanValue();
        }
        AGx aGx = AGx.A00;
        String path = this.A05.getPath();
        if (path != null) {
            boolean A012 = aGx.A01(path);
            this.A03 = Boolean.valueOf(A012);
            return A012;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final String getTitle() {
        String obj = this.A05.toString();
        0qQ.A07(obj);
        return obj;
    }

    public final Uri getUri() {
        return this.A05;
    }

    public final Bitmap AWY(int i, int i2, boolean z) {
        try {
            ParcelFileDescriptor A002 = A00();
            if (A002 != null) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPurgeable = true;
                options.inInputShareable = true;
                if (z) {
                    options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                }
                return C379849Vo.A00((ContentResolver) null, options, (Uri) null, A002, i);
            }
            throw new IllegalStateException("Required value was null.");
        } catch (Exception e) {
            0KC.A0F("UriImage", "got exception decoding bitmap ", e);
            return null;
        }
    }

    public final boolean CW0() {
        A01(this);
        return "image/jpeg".equals(this.A02);
    }

    public final int getHeight() {
        A01(this);
        return this.A00;
    }

    public final int getWidth() {
        A01(this);
        return this.A01;
    }
}
