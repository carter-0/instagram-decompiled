package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GIH extends Drawable {
    public Bitmap A00;
    public Bitmap A01;
    public List A02;
    public Bitmap A03;
    public Paint A04;
    public Picture A05;
    public RectF A06;
    public Drawable A07;
    public final int A08;
    public final Context A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;
    public final float A0D;
    public final float A0E;
    public final float A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final Paint A0L;
    public final Paint A0M;
    public final Paint A0N;
    public final RectF A0O;
    public final RectF A0P;
    public final AnonymousClass1MK A0Q = new INJ(this, 1);
    public final AnonymousClass1MK A0R = new INJ(this, 2);
    public final GJO A0S;
    public final boolean A0T;

    public GIH(Context context, GJO gjo, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        Paint paint;
        Drawable drawable;
        Drawable mutate;
        Drawable A012;
        Drawable mutate2;
        Bitmap createBitmap;
        Context context2 = context;
        0qQ.A0B(context2, 1);
        this.A09 = context2;
        int i7 = i2;
        this.A0J = i7;
        int i8 = i3;
        this.A0H = i8;
        int i9 = i5;
        this.A0K = i9;
        GJO gjo2 = gjo;
        this.A0S = gjo2;
        this.A0T = z;
        Paint A0V = AnonymousClass7TE.A0V(1);
        this.A0N = A0V;
        this.A0L = AnonymousClass7TE.A0V(1);
        this.A0O = AnonymousClass7TE.A0Y();
        this.A0P = AnonymousClass7TE.A0Y();
        float f = (float) i8;
        float f2 = f / 2.0f;
        this.A0F = f2;
        float f3 = (float) i9;
        float f4 = f3 + f2;
        this.A0E = f4;
        int i10 = i - i3;
        this.A0G = i10;
        float f5 = (float) (i2 - i3);
        this.A0D = f5;
        this.A0B = AnonymousClass0eN.A01(new MMS(this, 15));
        this.A08 = (i3 * 2) + i10 + (i5 * 2);
        this.A0A = AnonymousClass0eN.A01(new MMS(this, 14));
        Paint A0V2 = AnonymousClass7TE.A0V(1);
        this.A0M = A0V2;
        0t0 A013 = AnonymousClass0eN.A01(new MMS(this, 16));
        this.A0C = A013;
        int A0M2 = (i10 - AnonymousClass7TE.A0M(A013.getValue())) / 2;
        this.A0I = A0M2;
        int i11 = i4;
        if (i5 > 0) {
            this.A06 = AnonymousClass7TE.A0Y();
            paint = AnonymousClass7TE.A0V(1);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(f);
            paint.setColor(i11);
        } else {
            paint = null;
            this.A06 = null;
        }
        this.A04 = paint;
        if (gjo != null) {
            int ordinal = gjo2.ordinal();
            if (ordinal == 0) {
                float f6 = ((float) i10) / 2.0f;
                int i12 = (int) f4;
                Map map = GJN.A02;
                if (map.get(gjo2) == null) {
                    Picture picture = new Picture();
                    float f7 = f6 + f;
                    int i13 = (int) f7;
                    Canvas beginRecording = picture.beginRecording(i13, i13);
                    0qQ.A07(beginRecording);
                    beginRecording.drawCircle(f6, f6, f6, GJN.A01);
                    if (paint != null) {
                        float f8 = 2.0f * f6;
                        Paint paint2 = paint;
                        Canvas canvas = beginRecording;
                        canvas.drawArc(new RectF(f2, f2, f8, f8), 180.0f, 90.0f, false, paint2);
                        float f9 = (-2.0f * f) + f2;
                        canvas.drawArc(new RectF(f6 - f, f9, f7, f2), 0.0f, 90.0f, false, paint2);
                        canvas.drawArc(new RectF(f9, f7 - (2.0f * f), f2, f7), 0.0f, 90.0f, false, paint2);
                    }
                    int i14 = i12 + ((int) f2);
                    int A014 = AnonymousClass7TH.A01(context2);
                    Drawable drawable2 = context2.getDrawable(R.drawable.instagram_music_pano_filled_24);
                    if (!(drawable2 == null || (mutate = drawable2.mutate()) == null)) {
                        int i15 = A014 + i14;
                        mutate.setBounds(i14, i14, i15, i15);
                        mutate.setColorFilter(i11, PorterDuff.Mode.SRC_OVER);
                        mutate.draw(beginRecording);
                    }
                    picture.endRecording();
                    map.put(gjo2, picture);
                }
                this.A05 = (Picture) map.get(gjo2);
            } else if (ordinal == 1 || ordinal == 2) {
                AnonymousClass7TE.A1Q(A0V2);
                AnonymousClass7TE.A1N(context2, A0V2, R.color.black_40_transparent);
                Map map2 = GJN.A02;
                int A072 = DbX.A07(this.A0C);
                float f10 = (float) A0M2;
                boolean A1W = AnonymousClass7TF.A1W(gjo2, GJO.MUSIC_ICON_V3);
                if (!(GJN.A00 != null || (A012 = AnonymousClass4Ed.A01(context2, R.drawable.instagram_music_pano_filled_24, R.color.canvas_bottom_sheet_description_text_color)) == null || (mutate2 = A012.mutate()) == null)) {
                    mutate2.setBounds(0, 0, A072, A072);
                    Bitmap.Config config = Bitmap.Config.ARGB_8888;
                    if (A1W) {
                        createBitmap = Bitmap.createBitmap(i10, i10, config);
                        Canvas canvas2 = new Canvas(createBitmap);
                        float f11 = (float) i10;
                        canvas2.drawRoundRect(new RectF(0.0f, 0.0f, f11, f11), f5, f5, A0V2);
                        canvas2.save();
                        canvas2.translate(f10, f10);
                        mutate2.draw(canvas2);
                        canvas2.restore();
                    } else {
                        createBitmap = Bitmap.createBitmap(A072, A072, config);
                        mutate2.draw(new Canvas(createBitmap));
                    }
                    GJN.A00 = createBitmap;
                }
                this.A03 = GJN.A00;
            }
        }
        AnonymousClass7TE.A1N(context2, A0V, R.color.cds_white_a20);
        if (i5 <= 0 || i6 == -1) {
            drawable = null;
        } else if (i6 != 0) {
            drawable = GVQ.A00(context2, f3, (float) i7);
        } else {
            int alpha = Color.alpha(637534208);
            drawable = new GVE(C51973G9u.A01(637534208, Math.min(alpha, AnonymousClass7TE.A05(f3 / 0nA.A04(context2, 10), (float) alpha))), f3, (float) i7);
        }
        this.A07 = drawable;
        A01();
    }

    public static final void A02(Bitmap bitmap, GIH gih) {
        gih.A01 = null;
        gih.A00 = bitmap;
        gih.A01();
        gih.invalidateSelf();
    }

    public final void A04(ImageUrl imageUrl) {
        this.A02 = null;
        this.A00 = null;
        this.A01 = null;
        if (C253833rU.A02(imageUrl)) {
            A02((Bitmap) AnonymousClass7TE.A14(this.A0B), this);
        } else {
            A02((Bitmap) null, this);
            if (imageUrl != null) {
                1OO A0J2 = 1NK.A00().A0J(imageUrl, "AlbumArtDrawable");
                A0J2.A02(this.A0Q);
                A0J2.A01();
            }
        }
        invalidateSelf();
    }

    public final void A05(List list) {
        this.A02 = null;
        this.A00 = null;
        this.A01 = null;
        if (C253833rU.A04(list)) {
            A02((Bitmap) AnonymousClass7TE.A14(this.A0B), this);
            invalidateSelf();
            return;
        }
        int i = 0;
        if (list.size() == 1) {
            A04((ImageUrl) list.get(0));
            return;
        }
        List subList = list.subList(0, Math.min(list.size(), 4));
        ArrayList A0m = C51970G9q.A0m(subList);
        Iterator it = subList.iterator();
        while (it.hasNext()) {
            it.next();
            A0m.add((Object) null);
        }
        this.A02 = A0m;
        for (Object next : subList) {
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            ImageUrl imageUrl = (ImageUrl) next;
            if (imageUrl != null) {
                1OO A0J2 = 1NK.A00().A0J(imageUrl, "AlbumArtDrawable");
                A0J2.A08 = Integer.valueOf(i);
                A0J2.A02(this.A0R);
                A0J2.A01();
            }
            i = i2;
        }
    }

    public void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        if (this.A0S == GJO.MUSIC_ICON) {
            Bitmap bitmap = this.A01;
            if (bitmap == null) {
                int i = this.A08;
                bitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
                A03(new Canvas(bitmap));
                this.A01 = bitmap;
            }
            0qQ.A0A(bitmap);
            int i2 = this.A08;
            canvas.drawBitmap(bitmap, new Rect(0, 0, i2, i2), getBounds(), this.A0L);
            return;
        }
        A03(canvas);
    }

    public int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        Drawable drawable = this.A07;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        if (this.A0T) {
            RectF rectF = this.A0P;
            AnonymousClass0eM r5 = this.A0A;
            int i = this.A0G;
            rectF.set((float) DbX.A07(r5), (float) DbX.A07(r5), (float) (i - DbX.A07(r5)), (float) (i - DbX.A07(r5)));
        }
        RectF rectF2 = this.A0O;
        float f = (float) this.A0G;
        rectF2.set(0.0f, 0.0f, f, f);
        RectF rectF3 = this.A06;
        if (rectF3 != null) {
            rectF3.set(rect);
            float f2 = this.A0E;
            rectF3.inset(f2, f2);
        }
        invalidateSelf();
    }

    private final void A01() {
        Bitmap bitmap = this.A00;
        if (bitmap != null) {
            Matrix matrix = new Matrix();
            float width = (float) bitmap.getWidth();
            float height = (float) bitmap.getHeight();
            float f = (float) this.A0G;
            matrix.setScale(f / width, f / height);
            matrix.mapRect(new RectF(0.0f, 0.0f, width, height));
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            bitmapShader.setLocalMatrix(matrix);
            this.A0L.setShader(bitmapShader);
        }
    }

    private final void A03(Canvas canvas) {
        RectF rectF;
        RectF rectF2;
        float f;
        float f2;
        float f3;
        Paint paint;
        Paint paint2;
        Bitmap bitmap;
        C14123TqI tqI;
        int i;
        C14122TqH tqH;
        GJO gjo = this.A0S;
        GJO gjo2 = GJO.MUSIC_ICON;
        Canvas canvas2 = canvas;
        if (gjo == gjo2) {
            canvas2.saveLayer((RectF) null, (Paint) null);
        }
        Drawable drawable = this.A07;
        if (drawable != null) {
            drawable.draw(canvas2);
        }
        List list = this.A02;
        if (list != null && list.size() > 1) {
            int width = getBounds().width();
            int height = getBounds().height();
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            0qQ.A07(createBitmap);
            Canvas canvas3 = new Canvas(createBitmap);
            int size = list.size();
            if (size == 2) {
                Bitmap bitmap2 = (Bitmap) list.get(0);
                Bitmap bitmap3 = (Bitmap) list.get(1);
                if (!(bitmap2 == null || bitmap3 == null)) {
                    int i2 = width / 2;
                    canvas3.drawBitmap(A00(bitmap2), (Rect) null, new Rect(0, 0, i2, height), (Paint) null);
                    canvas3.drawBitmap(A00(bitmap3), (Rect) null, new Rect(i2, 0, width, height), (Paint) null);
                }
                A02((Bitmap) null, this);
            } else if (size == 3) {
                Bitmap bitmap4 = (Bitmap) list.get(0);
                Bitmap bitmap5 = (Bitmap) list.get(1);
                Bitmap bitmap6 = (Bitmap) list.get(2);
                if (!(bitmap4 == null || bitmap5 == null || bitmap6 == null)) {
                    int i3 = width / 2;
                    canvas3.drawBitmap(A00(bitmap4), (Rect) null, new Rect(0, 0, i3, height), (Paint) null);
                    int i4 = height / 2;
                    canvas3.drawBitmap(bitmap5, (Rect) null, new Rect(i3, 0, width, i4), (Paint) null);
                    canvas3.drawBitmap(bitmap6, (Rect) null, new Rect(i3, i4, width, height), (Paint) null);
                }
                A02((Bitmap) null, this);
            } else if (size == 4) {
                Bitmap bitmap7 = (Bitmap) list.get(0);
                Bitmap bitmap8 = (Bitmap) list.get(1);
                Bitmap bitmap9 = (Bitmap) list.get(2);
                Bitmap bitmap10 = (Bitmap) list.get(3);
                if (!(bitmap7 == null || bitmap8 == null || bitmap9 == null || bitmap10 == null)) {
                    int i5 = width / 2;
                    int i6 = height / 2;
                    canvas3.drawBitmap(bitmap7, (Rect) null, new Rect(0, 0, i5, i6), (Paint) null);
                    canvas3.drawBitmap(bitmap8, (Rect) null, new Rect(i5, 0, width, i6), (Paint) null);
                    canvas3.drawBitmap(bitmap9, (Rect) null, new Rect(0, i6, i5, height), (Paint) null);
                    canvas3.drawBitmap(bitmap10, (Rect) null, new Rect(i5, i6, width, height), (Paint) null);
                }
                A02((Bitmap) null, this);
            }
            A02(createBitmap, this);
        }
        int i7 = getBounds().left;
        int i8 = this.A0K;
        int i9 = this.A0H;
        canvas2.save();
        canvas2.translate((float) (i7 + i8 + i9), (float) (getBounds().top + i8 + i9));
        if (this.A0T) {
            Paint paint3 = new Paint(1);
            Bitmap bitmap11 = this.A00;
            if (bitmap11 != null) {
                tqI = new C14120TqF(bitmap11).A00();
            } else {
                tqI = null;
            }
            int color = this.A09.getColor(R.color.black_50_transparent);
            if (tqI != null) {
                i = tqI.A00(color);
            } else {
                i = color;
            }
            if (i == color) {
                i = color;
                if (!(tqI == null || (tqH = tqI.A01) == null)) {
                    i = tqH.A05;
                }
            }
            paint3.setColor(i);
            paint3.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.DARKEN));
            rectF2 = this.A0O;
            f2 = this.A0D;
            canvas2.drawRoundRect(rectF2, f2, f2, paint3);
            rectF = this.A0P;
            f = (float) getBounds().width();
            f3 = (float) getBounds().height();
        } else {
            rectF = this.A0O;
            rectF2 = rectF;
            f = this.A0D;
            f2 = f;
            f3 = f;
        }
        if (this.A00 == null || (paint = this.A0L) == null) {
            paint = this.A0N;
        }
        canvas2.drawRoundRect(rectF, f, f3, paint);
        if (gjo != null) {
            int ordinal = gjo.ordinal();
            if (ordinal == 1) {
                canvas2.drawRoundRect(rectF2, f2, f2, this.A0M);
                Bitmap bitmap12 = this.A03;
                if (bitmap12 != null) {
                    float f4 = (float) this.A0I;
                    AnonymousClass0eM r1 = this.A0C;
                    canvas2.drawBitmap(bitmap12, (Rect) null, new RectF(f4, f4, f4 + ((float) ((Number) r1.getValue()).intValue()), ((float) ((Number) r1.getValue()).intValue()) + f4), this.A04);
                }
            } else if (ordinal == 2 && (bitmap = this.A03) != null) {
                canvas2.drawBitmap(bitmap, (Rect) null, rectF2, this.A04);
            }
        }
        canvas2.restore();
        RectF rectF3 = this.A06;
        if (!(rectF3 == null || (paint2 = this.A04) == null)) {
            float f5 = (float) this.A0J;
            0qQ.A0A(paint2);
            canvas2.drawRoundRect(rectF3, f5, f5, paint2);
        }
        if (gjo == gjo2) {
            Picture picture = this.A05;
            if (picture != null) {
                float f6 = (((float) this.A0G) / 2.0f) + ((float) i9) + this.A0F;
                canvas2.translate(f6, f6);
                canvas2.drawPicture(picture);
            }
            canvas2.restore();
        }
    }

    public final int getIntrinsicHeight() {
        return this.A08;
    }

    public final int getIntrinsicWidth() {
        return this.A08;
    }

    public final void setAlpha(int i) {
        Drawable drawable = this.A07;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        this.A0M.setAlpha(i);
        this.A0L.setAlpha(i);
        Paint paint = this.A04;
        if (paint != null) {
            paint.setAlpha(i);
        }
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.A07;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        this.A0M.setColorFilter(colorFilter);
        this.A0L.setColorFilter(colorFilter);
        Paint paint = this.A04;
        if (paint != null) {
            paint.setColorFilter(colorFilter);
        }
        invalidateSelf();
    }

    public static final Bitmap A00(Bitmap bitmap) {
        int height = bitmap.getHeight();
        0fO.A03(bitmap);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, bitmap.getWidth() / 4, 0, bitmap.getWidth() / 2, height);
        0qQ.A07(createBitmap);
        return createBitmap;
    }
}
