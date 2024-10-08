package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Parcelable;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.List;

/* renamed from: X.8Jj  reason: invalid class name and case insensitive filesystem */
public final class C353838Jj implements AnonymousClass81E {
    public final RectF A00 = new RectF();
    public final UserSession A01;
    public final AnonymousClass8BB A02;
    public final AnonymousClass81W A03;
    public final Context A04;
    public final List A05;

    public C353838Jj(Context context, UserSession userSession, AnonymousClass8BB r4, AnonymousClass81W r5, List list) {
        0qQ.A0B(userSession, 5);
        this.A04 = context;
        this.A02 = r4;
        this.A05 = list;
        this.A03 = r5;
        this.A01 = userSession;
    }

    public final Bitmap A02(boolean z) {
        return A01((Bitmap) null, (RectF) null, (B1K) null, 1.0f, 1.0f, -1, true, false, false, z);
    }

    public final /* synthetic */ void A7M(Parcelable parcelable) {
    }

    private final Bitmap A00() {
        RectF rectF = this.A00;
        AnonymousClass81W r4 = this.A03;
        rectF.set(0.0f, 0.0f, (float) r4.getWidth(), (float) r4.getHeight());
        int width = (int) rectF.width();
        rectF.set(0.0f, 0.0f, (float) r4.getWidth(), (float) r4.getHeight());
        try {
            return Bitmap.createBitmap(width, (int) rectF.height(), Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    public final Bitmap A01(Bitmap bitmap, RectF rectF, B1K b1k, float f, float f2, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        Bitmap Az8;
        String str;
        Bitmap bitmap2 = bitmap;
        AnonymousClass8BB r6 = this.A02;
        Canvas canvas = null;
        RectF rectF2 = rectF;
        if (r6.CJj()) {
            UserSession userSession = this.A01;
            29K r1 = 27p.A01(userSession).A04;
            0qQ.A07(r1);
            r1.A03.A0D("generate_doodle_bitmap_requested", r1.A01, (String) null, (String) null, (String) null, (String) null);
            int i2 = 1;
            if (182.A06(0Tu.A05, userSession, 36321146853008520L)) {
                i2 = 5;
            }
            int i3 = 0;
            while (true) {
                if (rectF != null) {
                    Az8 = r6.Az7((int) rectF2.width(), (int) rectF2.height());
                } else {
                    Az8 = r6.Az8((Bitmap) null);
                }
                if (i3 > 0) {
                    29K r12 = 27p.A01(userSession).A04;
                    0qQ.A07(r12);
                    r12.A03.A0C(002.A0O("retry_generate_doodle_bitmap: ", i3), r12.A01);
                }
                if (Az8 == null) {
                    i3++;
                    if (i3 >= i2) {
                        29K r13 = 27p.A01(userSession).A04;
                        0qQ.A07(r13);
                        r13.A03.A0C("generate_doodle_bitmap_failed", r13.A01);
                        break;
                    }
                } else {
                    29K r14 = 27p.A01(userSession).A04;
                    0qQ.A07(r14);
                    r14.A03.A0D("generate_doodle_bitmap_success", r14.A01, (String) null, (String) null, (String) null, (String) null);
                    break;
                }
            }
        } else {
            Az8 = null;
        }
        B1K b1k2 = b1k;
        if (bitmap != null) {
            canvas = new Canvas(bitmap2);
            if (Az8 != null) {
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setDither(true);
                paint.setFilterBitmap(true);
                canvas.drawBitmap(Az8, 0.0f, 0.0f, paint);
            }
        } else if (Az8 != null) {
            canvas = new Canvas(Az8);
            bitmap2 = Az8;
        } else if (b1k != null) {
            bitmap2 = A00();
            if (bitmap2 == null) {
                return null;
            }
            canvas = new Canvas(bitmap2);
        } else {
            bitmap2 = null;
        }
        int i4 = i;
        if (b1k != null) {
            if (canvas == null) {
                throw new IllegalStateException("Required value was null.");
            } else if (bitmap2 != null) {
                UserSession userSession2 = this.A01;
                29K r15 = 27p.A01(userSession2).A04;
                0qQ.A07(r15);
                r15.A03.A0C("render_video_sticker_requested", r15.A00);
                canvas.scale(f, f2);
                boolean ANf = b1k2.ANf(canvas, Integer.valueOf(bitmap2.getWidth()), Integer.valueOf(bitmap2.getHeight()), (long) i4);
                29K r16 = 27p.A01(userSession2).A04;
                0qQ.A07(r16);
                29E r10 = r16.A03;
                long j = r16.A00;
                if (!ANf) {
                    str = "render_video_sticker_failed";
                } else {
                    str = "render_video_sticker_success";
                }
                r10.A0C(str, j);
                canvas.scale(1.0f / f, 1.0f / f2);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        if (z4) {
            for (AnonymousClass88H r9 : this.A05) {
                if (r9.CKM() && r9.isVisible()) {
                    boolean z5 = z2;
                    boolean z6 = z3;
                    if (!r9.CKR(z5, z6)) {
                        continue;
                    } else {
                        if (bitmap2 == null) {
                            bitmap2 = A00();
                            if (bitmap2 != null) {
                                canvas = new Canvas(bitmap2);
                            }
                        } else if (canvas == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        canvas.save();
                        if (rectF != null) {
                            Matrix matrix = new Matrix();
                            RectF rectF3 = this.A00;
                            AnonymousClass81W r2 = this.A03;
                            rectF3.set(0.0f, 0.0f, (float) r2.getWidth(), (float) r2.getHeight());
                            matrix.setRectToRect(rectF3, rectF2, Matrix.ScaleToFit.FILL);
                            canvas.setMatrix(matrix);
                        }
                        r9.EF8(canvas, i4, z5, z6);
                        canvas.restore();
                        r9.EI6();
                    }
                }
            }
        }
        if (bitmap2 == null) {
            return null;
        }
        if (z) {
            return 1MF.A04(bitmap2);
        }
        return bitmap2;
    }

    public final boolean A03() {
        List<AnonymousClass88H> list = this.A05;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (AnonymousClass88H r1 : list) {
                if (r1.CKM() && r1.isVisible() && r1.CKR(false, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final /* synthetic */ Parcelable ANX() {
        return null;
    }
}
