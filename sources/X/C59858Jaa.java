package X;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.creation.photo.crop.CropImageView;
import com.instagram.creation.photo.util.ExifImageData;

/* renamed from: X.Jaa  reason: case insensitive filesystem */
public final class C59858Jaa implements Runnable {
    public final /* synthetic */ C59761JWz A00;

    public C59858Jaa(C59761JWz jWz) {
        this.A00 = jWz;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.JbJ, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v0, types: [X.JVz, com.instagram.creation.photo.crop.CropImageView, android.view.View] */
    public final void run() {
        C273544ml r2;
        FragmentActivity fragmentActivity;
        JX0 jx0;
        CropImageView cropImageView;
        ExifImageData exifImageData;
        JX0 jx02;
        ? r4;
        C364808m2 r10;
        ExifImageData exifImageData2;
        Number number;
        FragmentActivity fragmentActivity2;
        C273544ml r0;
        C59761JWz jWz = this.A00;
        Bitmap bitmap = jWz.A00;
        JX0 jx03 = jWz.A03;
        if (bitmap == null) {
            if (jx03 != null) {
                fragmentActivity2 = jx03.A03;
            } else {
                fragmentActivity2 = null;
            }
            C59689JTv.A0F(fragmentActivity2, "unable_to_load_image", 2131975828);
            JX0 jx04 = jWz.A03;
            if (jx04 != null && (r0 = jx04.A04) != null) {
                r0.D0W();
                return;
            }
            return;
        }
        if (!(jx03 == null || (fragmentActivity = jx03.A03) == null || !(!fragmentActivity.isFinishing()) || (jx0 = jWz.A03) == null || (cropImageView = jx0.A05) == null || (exifImageData = jWz.A04) == null)) {
            int i = exifImageData.A00;
            ? obj = new Object();
            obj.A01 = bitmap;
            obj.A00 = i % 360;
            Integer num = null;
            cropImageView.setImageRotateBitmapResetBase(obj, jx0.A0A, (ViewGroup.LayoutParams) null);
            Bitmap bitmap2 = jWz.A00;
            if (!(bitmap2 == null || (jx02 = jWz.A03) == null || (r4 = jx02.A05) == 0 || (r10 = jWz.A05) == null || (exifImageData2 = jWz.A04) == null)) {
                int width = bitmap2.getWidth();
                int height = bitmap2.getHeight();
                int min = Math.min(width, height);
                int i2 = (width - min) / 2;
                int i3 = (height - min) / 2;
                jWz.A01 = new RectF((float) i2, (float) i3, (float) (i2 + min), (float) (i3 + min));
                JX0 jx05 = jWz.A03;
                Integer num2 = null;
                if (jx05 != null) {
                    num = jx05.A07;
                    num2 = jx05.A06;
                }
                AnonymousClass81H r3 = new AnonymousClass81H(r4, num, num2);
                RectF A0Y = AnonymousClass7TE.A0Y();
                r4.A07.mapRect(A0Y, jWz.A01);
                r3.A01(A0Y, jWz.A08, false);
                r4.setHighlightView(r3);
                r4.A00 = new RectF(0.0f, 0.0f, (float) width, (float) height);
                AnonymousClass34S A01 = C59892JbH.A01(bitmap2, (float) Math.min(r10.getWidth(), r10.getHeight()), exifImageData2.A00);
                RectF rectF = jWz.A01;
                if (rectF != null) {
                    if (jWz.A08) {
                        number = C51967G9n.A0h();
                    } else {
                        number = (Number) A01.A00;
                    }
                    0qQ.A0A(number);
                    float floatValue = number.floatValue();
                    Object obj2 = A01.A01;
                    0qQ.A06(obj2);
                    r4.A0K(rectF, floatValue, AnonymousClass7TE.A04(obj2));
                }
            }
            cropImageView.A0N();
        }
        JX0 jx06 = jWz.A03;
        if (jx06 != null && (r2 = jx06.A04) != null) {
            r2.D7H(bitmap.getWidth(), bitmap.getHeight());
        }
    }
}
