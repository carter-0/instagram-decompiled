package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;

/* renamed from: X.Sr4  reason: case insensitive filesystem */
public final class C12301Sr4 implements C13724Tfu {
    public static final 1T3 A00 = new C12064SmH(1);

    public final C249903kY CgE(Context context, Uri uri) {
        Bitmap createBitmap = Bitmap.createBitmap(4, 4, Bitmap.Config.ARGB_8888);
        return C249903kY.A00(C249903kY.A05, A00, createBitmap);
    }

    public final C249903kY CgF(Context context, Uri uri, CallerContext callerContext) {
        return CgE(context, uri);
    }
}
