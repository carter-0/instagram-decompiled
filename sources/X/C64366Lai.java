package X;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.provider.MediaStore;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import com.instagram.util.gallery.ImageManager$ImageListParam;
import fxcache.model.FxCalAccount;

/* renamed from: X.Lai  reason: case insensitive filesystem */
public final class C64366Lai implements CallerContextable {
    public static final String __redex_internal_original_name = "AvatarBitmapUtil";

    /* JADX WARNING: type inference failed for: r0v14, types: [java.lang.Object, com.instagram.util.gallery.ImageManager$ImageListParam] */
    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, com.instagram.util.gallery.ImageManager$ImageListParam] */
    /* JADX WARNING: type inference failed for: r6v3, types: [java.lang.Object, com.instagram.util.gallery.ImageManager$ImageListParam] */
    public static Bitmap A00(Context context, Uri uri, UserSession userSession, int i) {
        UnsupportedOperationException th;
        Integer num;
        int i2;
        C41797B1c A03;
        ImageManager$ImageListParam imageManager$ImageListParam;
        String str;
        if (i == 0) {
            FxCalAccount A01 = 2Lv.A00(userSession).A01(CallerContext.A00(C64366Lai.class), "ig_android_growth_fx_access_fb_ig_avatar");
            if (A01 == null || (str = A01.A08) == null) {
                return null;
            }
            1Pq A0I = JTS.A0I(userSession);
            A0I.A02 = str;
            1QS A00 = A0I.A00();
            AnonymousClass1QT r1 = new AnonymousClass1QT();
            r1.A04 = 1CE.A06;
            r1.A03 = 1Fe.A03;
            r1.A0A = "Avatar";
            1Qb A002 = AnonymousClass1C7.A00().A01(new AnonymousClass1QX(A00, r1.A00())).A00();
            try {
                A002.getClass();
                Bitmap decodeStream = BitmapFactory.decodeStream(A002.AjD());
                A002.close();
                return decodeStream;
            } catch (Throwable th2) {
                C9153RRe.A00(th, th2);
                throw th;
            }
        } else if (i == 1) {
            ContentResolver contentResolver = context.getContentResolver();
            uri.getClass();
            Uri uri2 = C364678lo.A00;
            0qQ.A0B(contentResolver, 0);
            String obj = uri.toString();
            if (obj == null) {
                obj = "";
            }
            String str2 = null;
            if (00p.A0k(obj, "content://drm", false)) {
                Integer num2 = AnonymousClass05K.A0N;
                ? obj2 = new Object();
                obj2.A03 = num2;
                obj2.A00 = 2;
                obj2.A01 = 1;
                obj2.A04 = null;
                imageManager$ImageListParam = obj2;
            } else {
                if (00p.A0k(obj, "content://media/external/video", false)) {
                    num = AnonymousClass05K.A0C;
                    i2 = 4;
                } else if (obj.startsWith(DbT.A10(MediaStore.Images.Media.EXTERNAL_CONTENT_URI)) || obj.startsWith(DbT.A10(MediaStore.Images.Media.INTERNAL_CONTENT_URI))) {
                    str2 = uri.getQueryParameter("bucketId");
                    num = AnonymousClass05K.A0N;
                    i2 = 1;
                } else {
                    ? obj3 = new Object();
                    obj3.A02 = uri;
                    A03 = C364678lo.A03(contentResolver, obj3);
                    C364808m2 BG5 = A03.BG5(uri);
                    System.gc();
                    BG5.getClass();
                    Bitmap AWY = BG5.AWY(((int) (((double) Runtime.getRuntime().maxMemory()) * 0.37d)) / 4, BG5.Aw4(), false);
                    AWY.getClass();
                    AWY.getWidth();
                    AWY.getHeight();
                    int min = Math.min(AWY.getWidth(), AWY.getHeight());
                    Matrix A0U = AnonymousClass7TE.A0U();
                    AWY.getWidth();
                    Rect rect = new Rect(0, 0, min, min);
                    int max = Math.max(0, rect.width());
                    float f = (float) max;
                    RectF rectF = new RectF(0.0f, 0.0f, f, f);
                    A0U.mapRect(rectF);
                    rectF.width();
                    rectF.height();
                    System.gc();
                    Bitmap createBitmap = Bitmap.createBitmap(max, max, Bitmap.Config.ARGB_8888);
                    JTO.A0B(createBitmap).drawBitmap(AWY, rect, new Rect(0, 0, max, max), (Paint) null);
                    AWY.recycle();
                    return createBitmap;
                }
                ? obj4 = new Object();
                obj4.A03 = num;
                obj4.A00 = i2;
                obj4.A01 = 1;
                obj4.A04 = str2;
                imageManager$ImageListParam = obj4;
            }
            A03 = C364678lo.A03(contentResolver, imageManager$ImageListParam);
            C364808m2 BG52 = A03.BG5(uri);
            System.gc();
            BG52.getClass();
            Bitmap AWY2 = BG52.AWY(((int) (((double) Runtime.getRuntime().maxMemory()) * 0.37d)) / 4, BG52.Aw4(), false);
            AWY2.getClass();
            AWY2.getWidth();
            AWY2.getHeight();
            int min2 = Math.min(AWY2.getWidth(), AWY2.getHeight());
            Matrix A0U2 = AnonymousClass7TE.A0U();
            AWY2.getWidth();
            Rect rect2 = new Rect(0, 0, min2, min2);
            int max2 = Math.max(0, rect2.width());
            float f2 = (float) max2;
            RectF rectF2 = new RectF(0.0f, 0.0f, f2, f2);
            A0U2.mapRect(rectF2);
            rectF2.width();
            rectF2.height();
            System.gc();
            Bitmap createBitmap2 = Bitmap.createBitmap(max2, max2, Bitmap.Config.ARGB_8888);
            JTO.A0B(createBitmap2).drawBitmap(AWY2, rect2, new Rect(0, 0, max2, max2), (Paint) null);
            AWY2.recycle();
            return createBitmap2;
        } else {
            th = AnonymousClass7TE.A1B("Avatar source type not found");
            throw th;
        }
    }
}
