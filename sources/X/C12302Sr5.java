package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;

/* renamed from: X.Sr5  reason: case insensitive filesystem */
public final class C12302Sr5 implements C13724Tfu {
    public static final 1T3 A02 = new C12064SmH(0);
    public int A00;
    public boolean A01;

    public final C249903kY CgE(Context context, Uri uri) {
        int i;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.A01 && (i = this.A00) > 0) {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(uri.getPath(), options);
            int i2 = options.outHeight;
            int i3 = options.outWidth;
            int i4 = 1;
            if (i2 > i || i3 > i) {
                int i5 = i2 / 2;
                int i6 = i3 / 2;
                while (i5 / i4 >= i && i6 / i4 >= i) {
                    i4 *= 2;
                }
            }
            options.inSampleSize = i4;
            options.inJustDecodeBounds = false;
        }
        Bitmap decodeFile = BitmapFactory.decodeFile(uri.getPath(), options);
        return C249903kY.A00(C249903kY.A05, A02, decodeFile);
    }

    public C12302Sr5(boolean z, int i) {
        this.A01 = z;
        this.A00 = i;
    }

    public final C249903kY CgF(Context context, Uri uri, CallerContext callerContext) {
        return CgE(context, uri);
    }

    public C12302Sr5() {
    }
}
