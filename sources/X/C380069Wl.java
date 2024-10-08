package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import com.instagram.android.R;

/* renamed from: X.9Wl  reason: invalid class name and case insensitive filesystem */
public final class C380069Wl extends Drawable {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public Bitmap A09;
    public Bitmap A0A;
    public Canvas A0B;
    public LinearGradient A0C;
    public C358868bb A0D;
    public String A0E;
    public String A0F;
    public boolean A0G;
    public float A0H;
    public final int A0I;
    public final int A0J;
    public final Context A0K;
    public final Resources A0L;
    public final Paint A0M;
    public final PorterDuffXfermode A0N = new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP);
    public final RectF A0O;
    public final String A0P;
    public final int A0Q;
    public final int A0R;
    public final int A0S;
    public final Bitmap A0T;
    public final LinearGradient A0U;
    public final Rect A0V;
    public final boolean A0W;

    public C380069Wl(Context context, String str, int i, int i2, boolean z) {
        float f;
        float f2;
        0qQ.A0B(str, 4);
        this.A0K = context;
        Resources A0A2 = AnonymousClass7TF.A0A(context);
        this.A0L = A0A2;
        Paint A0V2 = AnonymousClass7TE.A0V(1);
        this.A0M = A0V2;
        this.A0V = AnonymousClass7TE.A0W();
        this.A0O = AnonymousClass7TE.A0Y();
        this.A08 = -1;
        this.A04 = -1;
        this.A01 = 255;
        this.A02 = -1;
        this.A0G = true;
        this.A0P = str;
        float f3 = (float) i2;
        this.A00 = f3;
        A0V2.setTextSize(f3);
        C358868bb A012 = C358878bc.A01("modern", false, false, false, false);
        this.A0D = A012;
        A0V2.setTypeface(AnonymousClass91U.A01(AnonymousClass0qo.A00(context), A012.A05));
        this.A0S = context.getColor(R.color.sticker_subtle_light_background);
        this.A0R = i;
        this.A0I = AnonymousClass7TE.A0F(A0A2);
        this.A0Q = AnonymousClass7TE.A0D(A0A2);
        this.A0J = AnonymousClass7TE.A0C(A0A2);
        this.A0T = AnonymousClass6MX.A00(A0A2, R.drawable.instagram_shopping_bag_pano_filled_24);
        this.A0W = z;
        A03(1.0f);
        Bitmap bitmap = this.A09;
        if (bitmap != null) {
            f = (float) bitmap.getWidth();
        } else {
            f = 0.0f;
        }
        Bitmap bitmap2 = this.A09;
        if (bitmap2 != null) {
            f2 = (float) bitmap2.getHeight();
        } else {
            f2 = 0.0f;
        }
        this.A0U = new LinearGradient(0.0f, 0.0f, f, f2, ABP.A01(context), ABP.A00(), Shader.TileMode.REPEAT);
        A01();
    }

    public final void draw(Canvas canvas) {
        C358928bh r1;
        int i;
        0qQ.A0B(canvas, 0);
        A01();
        Paint paint = this.A0M;
        paint.setColor(this.A03);
        RectF rectF = this.A0O;
        rectF.set((float) AnonymousClass7TF.A04(this), (float) AnonymousClass7TF.A05(this), (float) AnonymousClass7TF.A04(this), (float) AnonymousClass7TF.A05(this));
        rectF.inset((float) ((-this.A08) / 2), (float) ((-this.A04) / 2));
        float f = (float) this.A0J;
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setColor(this.A07);
        paint.setAlpha(this.A01);
        C358868bb r0 = this.A0D;
        if (r0 != null) {
            r1 = r0.A05;
        } else {
            r1 = null;
        }
        paint.setTypeface(AnonymousClass91U.A01(AnonymousClass0qo.A00(this.A0K), r1));
        String str = this.A0F;
        if (str != null) {
            int A0J2 = AnonymousClass7TE.A0J(this);
            Bitmap bitmap = this.A09;
            if (bitmap != null) {
                i = bitmap.getWidth();
            } else {
                i = 0;
            }
            canvas.drawText(str, (float) (A0J2 + i + this.A0I + this.A05), (float) (AnonymousClass7TF.A05(this) + (this.A06 / 2)), paint);
        }
        Bitmap bitmap2 = this.A0A;
        if (!(bitmap2 == null || this.A0B == null)) {
            bitmap2.eraseColor(0);
            Canvas canvas2 = this.A0B;
            if (canvas2 != null) {
                Bitmap bitmap3 = this.A09;
                if (bitmap3 != null) {
                    canvas2.drawBitmap(bitmap3, 0.0f, 0.0f, (Paint) null);
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
        }
        paint.setXfermode(this.A0N);
        Canvas canvas3 = this.A0B;
        if (canvas3 != null) {
            canvas3.save();
            float f2 = rectF.left + ((float) this.A0I);
            if (this.A0C != null) {
                paint.setColor(-1);
                paint.setShader(this.A0C);
            } else {
                Canvas canvas4 = this.A0B;
                if (canvas4 != null) {
                    canvas4.translate(-f2, 0.0f);
                }
            }
            Canvas canvas5 = this.A0B;
            if (canvas5 != null) {
                canvas5.drawPaint(paint);
            }
            Canvas canvas6 = this.A0B;
            if (canvas6 != null) {
                canvas6.restore();
            }
            paint.setXfermode((Xfermode) null);
            paint.setAlpha(this.A01);
            Bitmap bitmap4 = this.A0A;
            if (bitmap4 != null) {
                int A052 = AnonymousClass7TF.A05(this);
                Bitmap bitmap5 = this.A09;
                if (bitmap5 != null) {
                    canvas.drawBitmap(bitmap4, f2, (float) (A052 - (bitmap5.getHeight() / 2)), paint);
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
            paint.setShader((Shader) null);
            return;
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    private final int A00(float f) {
        int i = this.A0I * 2;
        Bitmap bitmap = this.A09;
        if (bitmap != null) {
            return i + ((int) (((float) (bitmap.getWidth() + this.A0Q)) * (f / this.A00)));
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        if (r4.equals(r0) == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        r5.A03 = -1;
        r5.A07 = -16777216;
        r2 = r5.A0U;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0053, code lost:
        if (r4.equals(r0) == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0055, code lost:
        r5.A03 = -1;
        r5.A07 = r5.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0062, code lost:
        if (r4.equals(r0) == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0064, code lost:
        r5.A03 = r5.A0S;
        r5.A07 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        r5.A0C = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A01() {
        /*
            r5 = this;
            java.lang.String r4 = r5.A0P
            int r0 = r4.hashCode()
            r3 = -16738826(0xffffffffff0095f6, float:-1.7091983E38)
            r2 = 0
            r1 = -1
            switch(r0) {
                case -1247020320: goto L_0x0024;
                case -704237492: goto L_0x002a;
                case -469877654: goto L_0x002d;
                case -221789064: goto L_0x0033;
                case 177933206: goto L_0x0036;
                case 584812081: goto L_0x0039;
                case 729142062: goto L_0x004a;
                case 761099283: goto L_0x004d;
                case 1384334763: goto L_0x005c;
                case 1652005773: goto L_0x0030;
                case 2091518821: goto L_0x0021;
                case 2099890091: goto L_0x0027;
                default: goto L_0x000e;
            }
        L_0x000e:
            r5.A03 = r1
            int r0 = r5.A02
            if (r0 == r1) goto L_0x0015
            r3 = r0
        L_0x0015:
            r5.A07 = r3
            android.graphics.Paint r1 = r5.A0M
            int r0 = r5.A01
            r1.setAlpha(r0)
        L_0x001e:
            r5.A0C = r2
            return
        L_0x0021:
            java.lang.String r0 = "product_item_text_sticker_subtle"
            goto L_0x005e
        L_0x0024:
            java.lang.String r0 = "seller_collection_text_sticker_subtle"
            goto L_0x005e
        L_0x0027:
            java.lang.String r0 = "multi_product_item_text_sticker_black_white"
            goto L_0x003b
        L_0x002a:
            java.lang.String r0 = "storefront_text_sticker_black_white"
            goto L_0x003b
        L_0x002d:
            java.lang.String r0 = "storefront_text_sticker_subtle"
            goto L_0x005e
        L_0x0030:
            java.lang.String r0 = "multi_product_item_text_sticker_media_primary_color"
            goto L_0x004f
        L_0x0033:
            java.lang.String r0 = "seller_collection_text_sticker_media_primary_color"
            goto L_0x004f
        L_0x0036:
            java.lang.String r0 = "seller_collection_text_sticker_black_white"
            goto L_0x003b
        L_0x0039:
            java.lang.String r0 = "product_item_text_sticker_black_white"
        L_0x003b:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000e
            r5.A03 = r1
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r5.A07 = r0
            android.graphics.LinearGradient r2 = r5.A0U
            goto L_0x001e
        L_0x004a:
            java.lang.String r0 = "storefront_text_sticker_media_primary_color"
            goto L_0x004f
        L_0x004d:
            java.lang.String r0 = "product_item_text_sticker_media_primary_color"
        L_0x004f:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000e
            r5.A03 = r1
            int r0 = r5.A02
            r5.A07 = r0
            goto L_0x001e
        L_0x005c:
            java.lang.String r0 = "multi_product_item_text_sticker_subtle"
        L_0x005e:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000e
            int r0 = r5.A0S
            r5.A03 = r0
            r5.A07 = r1
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C380069Wl.A01():void");
    }

    private final void A02() {
        Rect rect;
        int length;
        this.A0F = this.A0E;
        Paint paint = this.A0M;
        paint.setTextSize(this.A00);
        String str = this.A0F;
        if (str == null || (length = str.length()) == 0) {
            rect = this.A0V;
            paint.getTextBounds("A", 0, 1, rect);
        } else {
            rect = this.A0V;
            paint.getTextBounds(str, 0, length, rect);
        }
        int width = rect.width() + A00(this.A00);
        int i = this.A0R;
        if (width > i) {
            if (this.A0G && this.A0F != null) {
                float f = this.A00;
                float f2 = f * 0.9f;
                while (true) {
                    if (Float.compare(f2, f * 0.5f) < 0) {
                        break;
                    }
                    paint.setTextSize(f2);
                    String str2 = this.A0F;
                    if (str2 != null) {
                        paint.getTextBounds(str2, 0, str2.length(), rect);
                    }
                    if (rect.width() + A00(f2) <= i) {
                        break;
                    }
                    f = this.A00;
                    f2 -= 0.1f * f;
                }
            }
            TextPaint textPaint = new TextPaint(paint);
            textPaint.density = this.A0L.getDisplayMetrics().density;
            String str3 = this.A0E;
            if (str3 == null) {
                str3 = "";
            }
            String obj = TextUtils.ellipsize(str3, textPaint, (float) (i - A00(textPaint.getTextSize())), TextUtils.TruncateAt.END).toString();
            this.A0F = obj;
            if (obj != null) {
                paint.getTextBounds(obj, 0, obj.length(), rect);
            }
        }
        int width2 = rect.width() + A00(paint.getTextSize());
        if (i > width2) {
            i = width2;
        }
        this.A08 = i;
        int abs = Math.abs(rect.top);
        int abs2 = (int) Math.abs(paint.getFontMetrics().ascent);
        if (abs > abs2) {
            abs = abs2;
        }
        this.A06 = abs;
        this.A04 = rect.height() + (this.A0I * 2);
        A03(paint.getTextSize() / this.A00);
    }

    private final void A03(float f) {
        Bitmap bitmap;
        if (this.A09 == null || Float.compare(f, this.A0H) != 0) {
            this.A0H = f;
            if (this.A0W) {
                f *= 0.8f;
            }
            int compare = Float.compare(f, 1.0f);
            Bitmap bitmap2 = this.A0T;
            if (compare != 0) {
                bitmap2 = 0fO.A00(bitmap2, (int) (((float) bitmap2.getWidth()) * f), (int) (((float) bitmap2.getHeight()) * f), false);
            }
            this.A09 = bitmap2;
            Canvas canvas = null;
            if (bitmap2 != null) {
                bitmap = Bitmap.createBitmap(bitmap2.getWidth(), bitmap2.getHeight(), Bitmap.Config.ARGB_8888);
            } else {
                bitmap = null;
            }
            this.A0A = bitmap;
            if (bitmap != null) {
                canvas = new Canvas(bitmap);
            }
            this.A0B = canvas;
            this.A05 = (int) (((float) this.A0Q) * f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003d, code lost:
        if (r1.equals(r0) == false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003f, code lost:
        r1 = r3.A0L;
        r0 = com.instagram.android.R.dimen.product_sticker_text_size_larger;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
        if (r1.equals(r0) == false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004d, code lost:
        r1 = r3.A0L;
        r0 = com.instagram.android.R.dimen.group_mention_sticker_title_text_size;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0021, code lost:
        r3.A00 = X.AnonymousClass7TE.A01(r1, r0);
        A02();
        invalidateSelf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x002d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(X.C358868bb r4) {
        /*
            r3 = this;
            r3.A0D = r4
            android.graphics.Paint r2 = r3.A0M
            X.8bh r1 = r4.A05
            android.content.Context r0 = r3.A0K
            X.0qq r0 = X.AnonymousClass0qo.A00(r0)
            android.graphics.Typeface r0 = X.AnonymousClass91U.A01(r0, r1)
            r2.setTypeface(r0)
            java.lang.String r1 = r4.A09
            int r0 = r1.hashCode()
            switch(r0) {
                case -1631834134: goto L_0x002e;
                case -409434162: goto L_0x0031;
                case -17506012: goto L_0x0034;
                case 3347760: goto L_0x0037;
                case 1544803905: goto L_0x0045;
                default: goto L_0x001c;
            }
        L_0x001c:
            android.content.res.Resources r1 = r3.A0L
            r0 = 2131165697(0x7f070201, float:1.7945618E38)
        L_0x0021:
            float r0 = X.AnonymousClass7TE.A01(r1, r0)
            r3.A00 = r0
            r3.A02()
            r3.invalidateSelf()
            return
        L_0x002e:
            java.lang.String r0 = "directional"
            goto L_0x0047
        L_0x0031:
            java.lang.String r0 = "typewriter_v2"
            goto L_0x0039
        L_0x0034:
            java.lang.String r0 = "strong_v2"
            goto L_0x0047
        L_0x0037:
            java.lang.String r0 = "meme"
        L_0x0039:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
            android.content.res.Resources r1 = r3.A0L
            r0 = 2131165698(0x7f070202, float:1.794562E38)
            goto L_0x0021
        L_0x0045:
            java.lang.String r0 = "default"
        L_0x0047:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
            android.content.res.Resources r1 = r3.A0L
            r0 = 2131165584(0x7f070190, float:1.794539E38)
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C380069Wl.A04(X.8bb):void");
    }

    public final void A05(String str, int i) {
        this.A0E = str;
        String str2 = this.A0P;
        if (!0qQ.A0K(str2, "product_item_text_sticker_media_primary_color") && !0qQ.A0K(str2, "multi_product_item_text_sticker_media_primary_color") && !0qQ.A0K(str2, "seller_collection_text_sticker_media_primary_color") && !0qQ.A0K(str2, "storefront_text_sticker_media_primary_color")) {
            this.A02 = i;
        }
        A02();
        invalidateSelf();
    }

    public final int getAlpha() {
        return this.A01;
    }

    public final int getIntrinsicHeight() {
        return this.A04;
    }

    public final int getIntrinsicWidth() {
        return this.A08;
    }

    public final void setAlpha(int i) {
        this.A01 = i;
        invalidateSelf();
    }
}
