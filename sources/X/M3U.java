package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.creation.photo.crop.CropImageView;
import com.instagram.creation.photo.util.ExifImageData;

public final class M3U implements Runnable {
    public final /* synthetic */ K6Y A00;

    public M3U(K6Y k6y) {
        this.A00 = k6y;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.creation.photo.crop.CropImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r1v11, types: [X.JbJ, java.lang.Object] */
    public final void run() {
        ExifImageData exifImageData;
        String str;
        CropImageView cropImageView;
        C364808m2 r14;
        Bitmap bitmap;
        ExifImageData exifImageData2;
        CropImageView cropImageView2;
        Number number;
        Matrix matrix;
        K6Y k6y = this.A00;
        AnonymousClass0vF r0 = K6Y.A0O;
        AnonymousClass6ST r02 = k6y.A09;
        if (r02 != null) {
            r02.dismiss();
        }
        C3499582p r7 = null;
        k6y.A09 = null;
        Bitmap bitmap2 = k6y.A01;
        int i = 0;
        if (bitmap2 == null) {
            C59689JTv.A01(k6y.getActivity(), "unable_to_load_image", 2131975828, 0);
            C273564mn r03 = k6y.A05;
            if (r03 != null) {
                r03.D0W();
            }
        } else {
            FragmentActivity activity = k6y.getActivity();
            boolean z = true;
            if (!(activity == null || activity.isFinishing() || (exifImageData = k6y.A07) == null)) {
                CropImageView cropImageView3 = k6y.A06;
                if (cropImageView3 != null) {
                    int i2 = exifImageData.A00;
                    ? obj = new Object();
                    obj.A01 = bitmap2;
                    obj.A00 = i2 % 360;
                    cropImageView3.setImageRotateBitmapResetBase(obj, k6y.A0D, (ViewGroup.LayoutParams) null);
                }
                ? r1 = k6y.A06;
                if (!((r1 != 0 && r1.A04 != null) || (r14 = k6y.A0A) == null || (bitmap = k6y.A01) == null || (exifImageData2 = k6y.A07) == null || r1 == 0)) {
                    AnonymousClass81H r12 = new AnonymousClass81H(r1, (Integer) null, (Integer) null);
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    int min = Math.min(width, height);
                    int i3 = (width - min) / 2;
                    int i4 = (height - min) / 2;
                    RectF rectF = new RectF((float) i3, (float) i4, (float) (i3 + min), (float) (i4 + min));
                    k6y.A02 = rectF;
                    RectF A0Y = AnonymousClass7TE.A0Y();
                    CropImageView cropImageView4 = k6y.A06;
                    if (!(cropImageView4 == null || (matrix = cropImageView4.A07) == null)) {
                        matrix.mapRect(A0Y, rectF);
                    }
                    boolean z2 = true;
                    r12.A01(A0Y, k6y.A0B, true);
                    CropImageView cropImageView5 = k6y.A06;
                    if (cropImageView5 != null) {
                        cropImageView5.setHighlightView(r12);
                    }
                    CropImageView cropImageView6 = k6y.A06;
                    if (cropImageView6 != null) {
                        cropImageView6.A00 = new RectF(0.0f, 0.0f, (float) width, (float) height);
                    }
                    AnonymousClass34S A01 = C59892JbH.A01(bitmap, (float) Math.min(r14.getWidth(), r14.getHeight()), exifImageData2.A00);
                    CropImageView cropImageView7 = k6y.A06;
                    if (cropImageView7 != null) {
                        if (k6y.A0B) {
                            number = C51967G9n.A0h();
                        } else {
                            number = (Number) A01.A00;
                        }
                        0qQ.A0A(number);
                        float floatValue = number.floatValue();
                        Object obj2 = A01.A01;
                        0qQ.A06(obj2);
                        cropImageView7.A0K(rectF, floatValue, AnonymousClass7TE.A04(obj2));
                    }
                    C267844cJ r04 = (C267844cJ) k6y.getContextAs(C267844cJ.class);
                    if (!(r04 == null || (cropImageView2 = k6y.A06) == null)) {
                        AnonymousClass514 r13 = JWE.A01(r04.Ajn()).A06;
                        r13.getClass();
                        if (r13 != AnonymousClass514.FOUR_BY_FIVE) {
                            z2 = false;
                        }
                        cropImageView2.A0M(z2);
                    }
                }
                if (!k6y.A0B && (cropImageView = k6y.A06) != null) {
                    cropImageView.A03 = k6y;
                }
                CropImageView cropImageView8 = k6y.A06;
                if (cropImageView8 != null) {
                    cropImageView8.A0N();
                }
                Context context = k6y.getContext();
                if (context instanceof C267844cJ) {
                    C267844cJ r15 = (C267844cJ) context;
                    if (r15 != null) {
                        r7 = r15.Ajn();
                    }
                    C59953JcJ.A00(AnonymousClass7TE.A0l(k6y.A0N)).A08(r7);
                }
                C364808m2 r05 = k6y.A0A;
                if (r05 != null) {
                    str = r05.AvM();
                } else {
                    str = null;
                }
                K6Y.A0O.ATE(new C386719l3(k6y, str));
                if (bitmap2.getWidth() != bitmap2.getHeight()) {
                    z = false;
                }
                k6y.A0C = z;
                if (k6y.A0B || z) {
                    i = 8;
                }
                ImageView imageView = k6y.A04;
                if (imageView != null) {
                    imageView.setVisibility(i);
                }
            }
        }
        C267844cJ r16 = (C267844cJ) k6y.getContextAs(C267844cJ.class);
        if (r16 != null && r16.Ajn() != null && r16.Ajn().A01 == 28D.A2d) {
            if (182.A06(0Tu.A05, DbY.A0R(k6y.A0N), 36323912812277348L)) {
                K6Y.A01(k6y);
            }
        }
    }
}
