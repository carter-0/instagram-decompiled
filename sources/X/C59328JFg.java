package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;

/* renamed from: X.JFg  reason: case insensitive filesystem */
public final class C59328JFg extends 0Yg implements 0sL {
    public static final C59328JFg A00 = new C59328JFg();

    public C59328JFg() {
        super(2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Uri uri;
        C336607et r15 = (C336607et) obj;
        C56108Hsv hsv = (C56108Hsv) obj2;
        boolean A1U = AnonymousClass7TF.A1U(0, r15, hsv);
        String str = hsv.A02;
        if (str == null || str.length() == 0) {
            uri = hsv.A00;
        } else {
            uri = 0cp.A03(str);
        }
        0qQ.A0A(uri);
        Context A002 = C243803a8.A00(r15);
        0qQ.A0B(uri, A1U ? 1 : 0);
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(ImageDecoder.createSource(A002.getContentResolver(), uri));
        0qQ.A0A(decodeBitmap);
        0qQ.A0B(decodeBitmap, 0);
        C226892i6 r9 = new C226892i6(decodeBitmap);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        AnonymousClass3XV r0 = 2WX.A02;
        return new C53958Gx2((Drawable) null, (Drawable) null, scaleType, (AnonymousClass579) null, (C226672hf) null, r9, (C268764dx) null, AnonymousClass9JR.A00(C51974G9v.A0M((2WX) null, AnonymousClass05K.A00, 0, Double.doubleToRawLongBits(50.0d)), AnonymousClass05K.A06, 0, C51970G9q.A0J()), "MEmuPickedImagesButtonBarComponent", 0);
    }
}
