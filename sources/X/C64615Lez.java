package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import com.instagram.ui.widget.mediapicker.MediaPickerItemView;

/* renamed from: X.Lez  reason: case insensitive filesystem */
public final class C64615Lez implements AnonymousClass1MK {
    public final int A00;
    public final Object A01;

    public C64615Lez(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void CyF(C226952iF r13, AnonymousClass3LX r14) {
        InteractiveDrawableContainer interactiveDrawableContainer;
        AnonymousClass88O r1;
        Bitmap bitmap;
        Drawable drawable;
        MediaPickerItemView mediaPickerItemView;
        switch (this.A00) {
            case 0:
                0qQ.A0B(r14, 1);
                Bitmap bitmap2 = r14.A01;
                if (bitmap2 != null) {
                    C59921Jbk jbk = (C59921Jbk) this.A01;
                    int i = jbk.A05;
                    int i2 = 0;
                    Bitmap A09 = 1MF.A09(bitmap2, i, i, 0, false);
                    0qQ.A07(A09);
                    int i3 = jbk.A04;
                    int i4 = jbk.A03;
                    int i5 = i3 + i4;
                    int i6 = (i - i5) / 2;
                    if (jbk.A0E) {
                        i2 = ((i - i3) / 2) - i4;
                    }
                    0fO.A03(A09);
                    Bitmap createBitmap = Bitmap.createBitmap(A09, i6, i2, i5, i5);
                    0qQ.A07(createBitmap);
                    float f = ((float) i3) / 2.0f;
                    jbk.A07.addCircle(f + ((float) (i4 / 2)), f + ((float) i4), jbk.A02, Path.Direction.CCW);
                    Paint paint = jbk.A06;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                    jbk.A01 = true;
                    jbk.invalidateDrawable(jbk);
                    return;
                }
                return;
            case 1:
                LRZ lrz = (LRZ) this.A01;
                if (lrz.A04 == this) {
                    Bitmap bitmap3 = r14.A01;
                    bitmap3.getClass();
                    LRZ.A00(bitmap3, lrz);
                    return;
                }
                return;
            case 2:
                Bitmap A07 = JTQ.A07(r14);
                if (A07 != null) {
                    ((C63874LAd) this.A01).A07.invoke((Object) null, (Object) null, (Object) null, A07);
                    return;
                }
                return;
            case 3:
                0qQ.A0B(r14, 1);
                C63874LAd lAd = (C63874LAd) this.A01;
                C3499282m r10 = lAd.A03;
                if (r10 != null && (interactiveDrawableContainer = lAd.A04) != null && (r1 = lAd.A02) != null && (bitmap = r14.A01) != null) {
                    C317876nz r5 = C317876nz.A1H;
                    C39890ADo aDo = new C39890ADo();
                    aDo.A0A = AnonymousClass05K.A01;
                    aDo.A00 = 1.5f;
                    aDo.A01 = 0.3f;
                    aDo.A0Q = false;
                    aDo.A0F = false;
                    C59993Jd2 jd2 = new C59993Jd2(lAd.A00, bitmap, lAd.A01, r10, interactiveDrawableContainer);
                    lAd.A07.invoke(aDo, jd2, r5, bitmap);
                    r1.A01(new C40328AaN(1, (Object) jd2, (Object) lAd));
                    return;
                }
                return;
            case 4:
                C17925ViG viG = (C17925ViG) this.A01;
                viG.A07.remove(this);
                viG.A00();
                return;
            case 5:
                Bitmap A072 = JTQ.A07(r14);
                if (A072 != null) {
                    S71 s71 = (S71) this.A01;
                    Resources A0A = AnonymousClass7TF.A0A(s71.A01);
                    if (s71.A06 || s71.A00 != 0.0f) {
                        AnonymousClass8DV r12 = new AnonymousClass8DV(A0A, A072);
                        if (s71.A06) {
                            r12.A00();
                            drawable = r12;
                        } else {
                            r12.A02(s71.A00);
                            drawable = r12;
                        }
                    } else {
                        drawable = new BitmapDrawable(A0A, A072);
                    }
                    s71.A01(drawable);
                    return;
                }
                return;
            case 6:
                0qQ.A0B(r14, 1);
                ((C241063Ns) this.A01).A0T(new C61925KRv(r14));
                return;
            case 7:
                Bitmap A073 = JTQ.A07(r14);
                if (A073 != null) {
                    C61362K4e k4e = (C61362K4e) this.A01;
                    Bitmap A05 = 1MF.A05(A073);
                    if (A05 != null) {
                        ImageView imageView = k4e.A00;
                        if (imageView != null) {
                            imageView.setImageDrawable(new BitmapDrawable(DbV.A05(k4e), A05));
                            ImageView imageView2 = k4e.A00;
                            if (imageView2 != null) {
                                DbU.A14(k4e.requireContext(), imageView2, R.color.fds_transparent);
                                return;
                            }
                        }
                        0qQ.A0F("profilePhoto");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    return;
                }
                return;
            case 8:
                AnonymousClass7TF.A1H(r13, r14);
                Object C3s = r13.C3s();
                if (C3s != null) {
                    int i7 = MediaPickerItemView.A0X;
                    if (!C3s.equals(((MediaPickerItemView) this.A01).A09)) {
                        return;
                    }
                }
                mediaPickerItemView = (MediaPickerItemView) this.A01;
                mediaPickerItemView.A00 = r14.A01;
                mediaPickerItemView.A0A = false;
                break;
            default:
                0qQ.A0B(r14, 1);
                mediaPickerItemView = (MediaPickerItemView) this.A01;
                mediaPickerItemView.A00 = r14.A01;
                break;
        }
        mediaPickerItemView.invalidate();
    }

    public final void DJx(C226952iF r3, C254673sr r4) {
        switch (this.A00) {
            case 4:
                C17925ViG viG = (C17925ViG) this.A01;
                viG.A07.remove(this);
                viG.A00();
                return;
            case 6:
                ((C241063Ns) this.A01).A0T(new C61924KRu(r4));
                return;
            case 8:
                0qQ.A0B(r3, 0);
                MediaPickerItemView mediaPickerItemView = (MediaPickerItemView) this.A01;
                mediaPickerItemView.A0A = false;
                if (mediaPickerItemView.A05 != null) {
                    r3.BZG();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void DK4(C226952iF r1, int i) {
    }
}
