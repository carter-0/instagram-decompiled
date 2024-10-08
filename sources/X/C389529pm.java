package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import com.instagram.android.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.9pm  reason: invalid class name and case insensitive filesystem */
public final class C389529pm extends C299875vz implements C252203oj, C268714ds, C300645xY, C41795B1a {
    public static final C71392co A1B = C71392co.A03(5.0d, 10.0d);
    public float A00 = 1.0f;
    public float A01 = 1.0f;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public Shader A0A;
    public Shader A0B;
    public C306386Ly A0C;
    public C306386Ly A0D;
    public Integer A0E;
    public Runnable A0F;
    public float A0G;
    public float A0H;
    public float A0I;
    public float A0J;
    public float A0K = 1.0f;
    public float A0L = 1.0f;
    public float A0M;
    public float A0N;
    public float A0O;
    public float A0P;
    public float A0Q;
    public float A0R;
    public float A0S = 1.0f;
    public float A0T = 1.0f;
    public float A0U;
    public float A0V;
    public Bitmap A0W;
    public Canvas A0X;
    public int[] A0Y;
    public final int A0Z;
    public final int A0a;
    public final int A0b;
    public final int A0c;
    public final int A0d;
    public final int A0e;
    public final int A0f;
    public final int A0g;
    public final Context A0h;
    public final 2cs A0i;
    public final C39711A6c A0j;
    public final C306386Ly A0k;
    public final C306386Ly A0l;
    public final String A0m;
    public final boolean A0n;
    public final boolean A0o;
    public final int[] A0p;
    public final int[] A0q;
    public final float A0r;
    public final int A0s;
    public final int A0t;
    public final int A0u;
    public final int A0v;
    public final int A0w;
    public final int A0x;
    public final int A0y;
    public final int A0z;
    public final int A10;
    public final Paint A11;
    public final PorterDuffXfermode A12 = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
    public final RectF A13;
    public final RectF A14;
    public final Typeface A15;
    public final Drawable.Callback A16;
    public final Drawable A17;
    public final C306386Ly A18;
    public final int[] A19;
    public final int[] A1A;

    public final String C4F() {
        return "polling_sticker_vibrant";
    }

    public final void DmB(2cs r1) {
    }

    public final void DmD(2cs r1) {
    }

    private float A00(String str, int i) {
        boolean A062;
        Context context = this.A0h;
        C306386Ly A0P2 = AnonymousClass7TF.A0P(context, this.A0c, this.A0f);
        int dimension = (int) context.getResources().getDimension(R.dimen.audition_flow_picker_subtitle_margin_bottom);
        int i2 = dimension / 2;
        for (int i3 = 1; i3 <= i; i3++) {
            int i4 = ((dimension - i2) / 2) + i2;
            int i5 = dimension;
            int i6 = i2;
            while (true) {
                A062 = A06(A0P2, str, i4, i3);
                if (i6 >= i4) {
                    break;
                }
                if (A062) {
                    i6 = i4;
                } else {
                    i5 = i4;
                }
                i4 = ((i5 - i6) / 2) + i6;
            }
            if (A062) {
                return (float) i4;
            }
        }
        return (float) i2;
    }

    public static SpannableString A01(String str, int[] iArr) {
        C380229Xd r4 = new C380229Xd(str, AnonymousClass6LW.A00, iArr);
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(r4, 0, spannableString.length(), 33);
        return spannableString;
    }

    private C306386Ly A02(int i) {
        Context context = this.A0h;
        Resources resources = context.getResources();
        float A012 = AnonymousClass7TE.A01(resources, R.dimen.direct_composer_redesign_background_height);
        C306386Ly A0P2 = AnonymousClass7TF.A0P(context, this.A0c, this.A0f);
        A0P2.A0I(this.A15);
        AJB.A0B(A0P2, A012, 0.0f, 0.0f);
        A0P2.A0F(this.A0x);
        A0P2.A0M(resources.getString(2131969568, AnonymousClass7TF.A1b(i)));
        return A0P2;
    }

    private Integer A03() {
        if (this.A0o) {
            int[] iArr = this.A0Y;
            iArr.getClass();
            int i = iArr[0];
            int[] iArr2 = this.A0Y;
            int i2 = iArr2[1];
            if (i <= i2) {
                if (iArr2[0] < i2) {
                    return AnonymousClass05K.A0Y;
                }
                if (!Arrays.equals(this.A0p, this.A0q)) {
                    return AnonymousClass05K.A0j;
                }
            }
            return AnonymousClass05K.A0N;
        }
        Integer num = this.A0E;
        if (num == null) {
            return AnonymousClass05K.A00;
        }
        if (num.intValue() == 0) {
            return AnonymousClass05K.A01;
        }
        return AnonymousClass05K.A0C;
    }

    private void A04(int i, int i2) {
        this.A0k.A0F(i);
        C306386Ly r0 = this.A0C;
        if (r0 != null) {
            r0.A0F(i);
        }
        this.A0l.A0F(i2);
        C306386Ly r02 = this.A0D;
        if (r02 != null) {
            r02.A0F(i2);
        }
    }

    private boolean A06(C306386Ly r4, String str, int i, int i2) {
        StaticLayout staticLayout;
        r4.A0I(this.A15);
        AJB.A0B(r4, (float) i, 0.0f, 0.0f);
        CharSequence charSequence = str;
        if (!this.A0o) {
            charSequence = A01(str, AnonymousClass6LW.A05);
        }
        r4.A0M(charSequence);
        if (r4.A06 > this.A0b || (staticLayout = r4.A0G) == null || staticLayout.getLineCount() > i2) {
            return false;
        }
        return true;
    }

    public final Integer A08() {
        return AnonymousClass05K.A0C;
    }

    public final boolean A0A() {
        return !this.A0o;
    }

    public final void A0B(String str) {
        C39711A6c a6c = this.A0j;
        if (a6c != null) {
            if (str == null || !a6c.A03.isEmpty()) {
                Context context = this.A0h;
                C306386Ly r2 = this.A18;
                r2.getClass();
                AJB.A07(context, r2, a6c.A00, 0.0f);
                r2.A0M(a6c.A03);
            } else {
                C306386Ly r22 = this.A18;
                r22.getClass();
                AnonymousClass7TE.A1O(this.A0h, r22, R.color.fds_white_alpha60);
                r22.A0K = null;
                r22.A0b.clearShadowLayer();
                r22.A0R();
                r22.A0M(str);
            }
            invalidateSelf();
        }
    }

    public final void A0C(int[] iArr) {
        int i;
        C306386Ly r8;
        Context context;
        this.A0Y = iArr;
        C306386Ly A022 = A02(iArr[0]);
        this.A0C = A022;
        Drawable.Callback callback = this.A16;
        A022.setCallback(callback);
        C306386Ly r1 = this.A0C;
        this.A04 = r1.A0A;
        this.A03 = r1.A06;
        C306386Ly A023 = A02(iArr[1]);
        this.A0D = A023;
        A023.setCallback(callback);
        C306386Ly r0 = this.A0D;
        int i2 = r0.A0A;
        this.A08 = i2;
        this.A07 = r0.A06;
        int i3 = iArr[0];
        if (i3 != 0 || iArr[1] != 0) {
            int i4 = this.A0f;
            int i5 = i4 * 2;
            int A052 = AnonymousClass7TE.A05(((float) i3) / 100.0f, (float) i5);
            if (A052 > 0) {
                i = Math.max(A052, Math.max(this.A05, this.A04) + (this.A0w * 2));
            } else {
                i = A052;
            }
            int i6 = i5 - A052;
            int i7 = i5 - i;
            if (i7 > 0) {
                i7 = Math.max(i7, Math.max(this.A09, i2) + (this.A0w * 2));
            }
            float f = (float) A052;
            float f2 = (float) i4;
            this.A0L = f / f2;
            this.A0T = ((float) i6) / f2;
            this.A0H = (float) (A052 - i4);
            float f3 = f2 / 2.0f;
            this.A0M = (((float) (i5 - i7)) / 2.0f) - f3;
            int i8 = this.A10;
            float f4 = (float) i8;
            float f5 = f4 - f3;
            this.A0U = (f4 - (((float) i7) / 2.0f)) - f5;
            if (i3 == 0) {
                int i9 = this.A0Z;
                this.A0H = (float) ((-i9) - i4);
                this.A0M = (((float) (-Math.max(this.A05, this.A04))) / 2.0f) - f3;
                this.A0T = ((float) (i9 + i6)) / f2;
            } else if (iArr[1] == 0) {
                this.A0H = (float) (i8 - i4);
                this.A0U = (f4 + (((float) Math.max(this.A09, i2)) / 2.0f)) - f5;
                this.A0L = ((float) (this.A0Z + A052)) / f2;
            }
            if (this.A0o) {
                float f6 = (float) this.A0b;
                int[] iArr2 = this.A0p;
                float[] fArr = AnonymousClass6LW.A00;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.A0A = new LinearGradient(0.0f, 0.0f, f, f6, iArr2, fArr, tileMode);
                int i10 = A052 + this.A0Z;
                Shader.TileMode tileMode2 = tileMode;
                this.A0B = new LinearGradient((float) i10, 0.0f, (float) (i10 + i6), f6, this.A0q, fArr, tileMode2);
                int intValue = A03().intValue();
                if (intValue == 3) {
                    A04(this.A0a, this.A0g);
                    if (this.A0n) {
                        context = this.A0h;
                        r8 = this.A0k;
                    }
                } else if (intValue == 4) {
                    A04(this.A0g, this.A0a);
                    if (this.A0n) {
                        context = this.A0h;
                        r8 = this.A0l;
                    }
                } else if (intValue == 5) {
                    int i11 = this.A0a;
                    A04(i11, i11);
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(r8.A0F);
                int length = spannableStringBuilder.length();
                Drawable mutate = context.getDrawable(R.drawable.instagram_circle_check_pano_filled_24).mutate();
                AnonymousClass7TE.A1R(mutate, -1);
                float textSize = r8.A0b.getTextSize() / ((float) context.getResources().getDimensionPixelSize(R.dimen.audition_flow_picker_subtitle_margin_bottom));
                int A053 = AnonymousClass7TE.A05((float) mutate.getIntrinsicWidth(), textSize);
                mutate.setBounds(0, 0, A053, AnonymousClass7TE.A05((float) mutate.getIntrinsicHeight(), textSize));
                int A0H2 = AnonymousClass7TE.A0H(context.getResources());
                C2606346l r2 = new C2606346l(mutate);
                r2.A02 = AnonymousClass05K.A01;
                r2.A00 = A0H2;
                spannableStringBuilder.append(" ");
                spannableStringBuilder.setSpan(r2, length, length + 1, 33);
                r8.A0E((i4 - (this.A0c * 2)) + A053 + (A0H2 * 2));
                r8.A0L(spannableStringBuilder);
            }
            invalidateSelf();
        }
    }

    public final C2802350v BzV() {
        String str;
        float f;
        int i;
        int i2;
        C39711A6c a6c = this.A0j;
        if (a6c != null) {
            f = a6c.A00;
            i = a6c.A01;
            i2 = a6c.A02;
            str = a6c.A03;
        } else {
            str = null;
            f = 0.0f;
            i = 0;
            i2 = 0;
        }
        C306386Ly r2 = this.A0k;
        String obj = r2.A0F.toString();
        C306386Ly r1 = this.A0l;
        String obj2 = r1.A0F.toString();
        float textSize = r2.A0b.getTextSize();
        float textSize2 = r1.A0b.getTextSize();
        AnonymousClass7TG.A1O(obj, obj2);
        C40606Aeu aeu = new C40606Aeu();
        aeu.A05 = obj;
        aeu.A07 = obj2;
        aeu.A00 = textSize;
        aeu.A02 = textSize2;
        aeu.A06 = str;
        aeu.A01 = f;
        aeu.A03 = i;
        aeu.A04 = i2;
        return aeu;
    }

    public final void DmC(2cs r8) {
        Runnable runnable;
        double d = r8.A01;
        if (d == 1.0d) {
            r8.A06(2.0d);
        } else if (d == 2.0d && (runnable = this.A0F) != null) {
            runnable.run();
        }
    }

    public final void DmE(2cs r24) {
        float f = (float) r24.A09.A00;
        float min = Math.min(f, 1.0f);
        double d = (double) min;
        float f2 = this.A00;
        int i = this.A0b;
        int i2 = i - this.A0d;
        int i3 = this.A03;
        int i4 = i2 - i3;
        int i5 = this.A0e * 2;
        this.A0J = ((float) AnonymousClass37Q.A03(d, (double) f2, (double) (((float) (i4 - i5)) / ((float) this.A02)))) - f2;
        float f3 = this.A01;
        this.A0R = ((float) AnonymousClass37Q.A03(d, (double) f3, (double) (((float) ((i2 - this.A07) - i5)) / ((float) this.A06)))) - f3;
        float f4 = ((float) i) / 2.0f;
        this.A0Q = (float) AnonymousClass37Q.A01(d, (double) ((((float) i4) / 2.0f) - f4));
        this.A0P = (float) AnonymousClass37Q.A01(d, (double) ((((float) i2) - (((float) i3) / 2.0f)) - f4));
        this.A0O = min;
        this.A0G = min * this.A0r;
        if (f > 1.0f) {
            double d2 = (double) (f - 1.0f);
            double d3 = d2;
            this.A0K = (float) AnonymousClass37Q.A03(d3, 1.0d, (double) this.A0L);
            this.A0S = (float) AnonymousClass37Q.A03(d3, 1.0d, (double) this.A0T);
            this.A0N = (float) AnonymousClass37Q.A01(d2, (double) this.A0M);
            this.A0V = (float) AnonymousClass37Q.A01(d2, (double) this.A0U);
            this.A0I = (float) AnonymousClass37Q.A01(d2, (double) this.A0H);
        }
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        Canvas canvas2 = canvas;
        int save = canvas2.save();
        AnonymousClass7TF.A13(canvas2, bounds);
        C39711A6c a6c = this.A0j;
        if (a6c != null) {
            canvas2.save();
            int i = this.A10;
            C306386Ly r1 = this.A18;
            r1.getClass();
            AnonymousClass7TF.A15(canvas2, r1, (float) ((i - r1.A0A) / 2), 0.0f);
            canvas2.translate(0.0f, (float) (r1.A06 + a6c.A02));
        }
        Drawable drawable = this.A17;
        if (drawable != null) {
            RectF rectF = this.A13;
            int i2 = this.A0z;
            drawable.setBounds(((int) rectF.left) - i2, ((int) rectF.top) - i2, ((int) rectF.right) + i2, ((int) rectF.bottom) + i2);
            drawable.draw(canvas2);
        }
        RectF rectF2 = this.A13;
        canvas2.clipRect(rectF2);
        Integer A032 = A03();
        if (A032 == AnonymousClass05K.A00) {
            Paint paint = this.A11;
            paint.setColor(this.A0s);
            float f = (float) this.A0t;
            canvas2.drawRoundRect(rectF2, f, f, paint);
            paint.setColor(this.A0u);
            float f2 = ((float) this.A0f) + this.A0I;
            canvas2.drawRect(f2, 0.0f, f2 + ((float) this.A0Z), (float) this.A0b, paint);
        } else {
            if (this.A0W == null) {
                Bitmap createBitmap = Bitmap.createBitmap(this.A10, this.A0b, Bitmap.Config.ARGB_8888);
                this.A0W = createBitmap;
                this.A0X = new Canvas(createBitmap);
            }
            this.A0W.eraseColor(0);
            Canvas canvas3 = this.A0X;
            canvas3.getClass();
            canvas3.save();
            Paint paint2 = this.A11;
            paint2.setColor(this.A0s);
            Canvas canvas4 = this.A0X;
            float f3 = (float) this.A0t;
            canvas4.drawRoundRect(rectF2, f3, f3, paint2);
            paint2.setXfermode(this.A12);
            switch (A032.intValue()) {
                case 0:
                case 1:
                case 2:
                    paint2.setColor(this.A0u);
                    Canvas canvas5 = this.A0X;
                    float f4 = ((float) this.A0f) + this.A0I;
                    canvas5.drawRect(f4, 0.0f, f4 + ((float) this.A0Z), (float) this.A0b, paint2);
                    break;
            }
            int intValue = A032.intValue();
            if (intValue != 3) {
                if (intValue != 4) {
                    if (intValue == 5) {
                        paint2.setShader(this.A0A);
                        A05(this.A0X, 0);
                    } else if (intValue == 1) {
                        paint2.setColor(this.A0y);
                        A05(this.A0X, 0);
                    } else if (intValue == 2) {
                        paint2.setColor(this.A0y);
                        A05(this.A0X, 1);
                    }
                }
                paint2.setShader(this.A0B);
                A05(this.A0X, 1);
            } else {
                paint2.setShader(this.A0A);
                A05(this.A0X, 0);
            }
            paint2.setShader((Shader) null);
            paint2.setXfermode((Xfermode) null);
            this.A0X.restore();
            canvas2.drawBitmap(this.A0W, 0.0f, 0.0f, paint2);
        }
        if (this.A0C != null) {
            canvas2.save();
            canvas2.translate(((float) (this.A0f - this.A04)) / 2.0f, ((float) (this.A0b - this.A03)) / 2.0f);
            canvas2.translate(this.A0N, this.A0P);
            float f5 = this.A0O;
            canvas2.scale(f5, f5, ((float) this.A04) / 2.0f, ((float) this.A03) / 2.0f);
            this.A0C.draw(canvas2);
            canvas2.restore();
        }
        canvas2.save();
        int i3 = this.A0f;
        int i4 = this.A0b;
        canvas2.translate(((float) (i3 - this.A05)) / 2.0f, (((float) (i4 - this.A02)) + 0.0f) / 2.0f);
        canvas2.translate(this.A0N, this.A0Q);
        float f6 = this.A00 + this.A0J;
        canvas2.scale(f6, f6, ((float) this.A05) / 2.0f, ((float) this.A02) / 2.0f);
        this.A0k.draw(canvas2);
        canvas2.restore();
        if (this.A0D != null) {
            canvas2.save();
            canvas2.translate((float) (this.A0Z + i3), 0.0f);
            canvas2.translate(((float) (i3 - this.A08)) / 2.0f, ((float) (i4 - this.A07)) / 2.0f);
            canvas2.translate(this.A0V, this.A0P);
            float f7 = this.A0O;
            canvas2.scale(f7, f7, ((float) this.A08) / 2.0f, ((float) this.A07) / 2.0f);
            this.A0D.draw(canvas2);
            canvas2.restore();
        }
        canvas2.save();
        canvas2.translate((float) (this.A0Z + i3), 0.0f);
        canvas2.translate(((float) (i3 - this.A09)) / 2.0f, (((float) (i4 - this.A06)) + 0.0f) / 2.0f);
        canvas2.translate(this.A0V, this.A0Q);
        float f8 = this.A01 + this.A0R;
        canvas2.scale(f8, f8, ((float) this.A09) / 2.0f, ((float) this.A06) / 2.0f);
        this.A0l.draw(canvas2);
        canvas2.restore();
        canvas2.restoreToCount(save);
    }

    public final int getIntrinsicHeight() {
        return this.A0v;
    }

    public final int getIntrinsicWidth() {
        return this.A10;
    }

    private void A05(Canvas canvas, int i) {
        boolean z;
        float f;
        canvas.save();
        switch (A03().intValue()) {
            case 0:
            case 1:
            case 2:
                z = true;
                break;
            default:
                z = false;
                break;
        }
        if (z) {
            f = 0.0f;
        } else {
            f = (((float) this.A0Z) / 2.0f) + 1.0f;
        }
        RectF rectF = this.A14;
        if (i == 0) {
            rectF.set(0.0f, 0.0f, (((float) this.A0f) * this.A0K) + f, (float) this.A0b);
        } else {
            float f2 = (float) this.A10;
            rectF.set((f2 - (((float) this.A0f) * this.A0S)) - f, 0.0f, f2, (float) this.A0b);
        }
        canvas.clipRect(rectF);
        if (this.A0G < this.A0r) {
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), this.A0G, this.A11);
        } else {
            canvas.drawRect(rectF, this.A11);
        }
        canvas.restore();
    }

    public final List A07() {
        return Collections.emptyList();
    }

    public final Rect BIJ() {
        Rect rect = new Rect(getBounds());
        C39711A6c a6c = this.A0j;
        if (a6c != null) {
            int i = rect.top;
            C306386Ly r0 = this.A18;
            r0.getClass();
            rect.top = i + r0.A06 + a6c.A02;
        }
        return rect;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0191, code lost:
        if (r41 != false) goto L_0x0193;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x00ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C389529pm(android.content.Context r20, android.graphics.Typeface r21, X.C39711A6c r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, int[] r26, int[] r27, int[] r28, int[] r29, float r30, float r31, int r32, int r33, int r34, int r35, int r36, int r37, int r38, int r39, boolean r40, boolean r41, boolean r42, boolean r43, boolean r44) {
        /*
            r19 = this;
            r9 = r23
            r8 = r25
            r15 = r30
            r14 = r31
            r12 = r19
            r12.<init>()
            r2 = 1
            X.9Nb r6 = new X.9Nb
            r6.<init>(r12, r2)
            r12.A16 = r6
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuffXfermode r0 = new android.graphics.PorterDuffXfermode
            r0.<init>(r1)
            r12.A12 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r12.A00 = r0
            r12.A0L = r0
            r12.A0K = r0
            r12.A01 = r0
            r12.A0T = r0
            r12.A0S = r0
            r11 = r20
            r12.A0h = r11
            X.2cs r1 = X.AnonymousClass7TF.A0J()
            r16 = 1
            r1.A06 = r2
            X.2co r0 = A1B
            r1.A09(r0)
            r1.A0A(r12)
            r12.A0i = r1
            r0 = r24
            r12.A0m = r0
            r7 = r44
            r12.A0o = r7
            r0 = r40
            r12.A0n = r0
            r0 = r32
            r12.A0t = r0
            r18 = r27
            r0 = r18
            r12.A19 = r0
            r17 = r29
            r0 = r17
            r12.A1A = r0
            r0 = r26
            r12.A0p = r0
            r0 = r28
            r12.A0q = r0
            r10 = r21
            r12.A15 = r10
            r0 = r38
            r12.A0x = r0
            r0 = r39
            r12.A0g = r0
            r0 = r33
            r12.A0a = r0
            android.content.res.Resources r1 = r11.getResources()
            int r0 = X.AnonymousClass7TE.A09(r11)
            r12.A0s = r0
            r2 = 2131099912(0x7f060108, float:1.781219E38)
            int r0 = r11.getColor(r2)
            r12.A0y = r0
            int r0 = r11.getColor(r2)
            r12.A0u = r0
            r0 = 2131165324(0x7f07008c, float:1.7944862E38)
            int r5 = r1.getDimensionPixelSize(r0)
            r12.A0f = r5
            r0 = 2131165295(0x7f07006f, float:1.7944803E38)
            int r4 = r1.getDimensionPixelSize(r0)
            r12.A0b = r4
            r0 = r37
            r12.A0e = r0
            r0 = 2131165217(0x7f070021, float:1.7944645E38)
            r1.getDimensionPixelSize(r0)
            r0 = r34
            r12.A0c = r0
            r0 = r35
            r12.A0w = r0
            r0 = r36
            r12.A0d = r0
            r0 = 2131165277(0x7f07005d, float:1.7944767E38)
            int r3 = r1.getDimensionPixelSize(r0)
            r12.A0Z = r3
            r0 = 2131165217(0x7f070021, float:1.7944645E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r12.A0z = r0
            float r2 = (float) r5
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = java.lang.Math.sqrt(r0)
            float r13 = (float) r0
            float r2 = r2 * r13
            r0 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r0
            r12.A0r = r2
            if (r42 != 0) goto L_0x0191
            if (r41 != 0) goto L_0x0193
            r16 = 0
        L_0x00dd:
            r2 = 4
        L_0x00de:
            int r1 = r12.A0f
            int r0 = r12.A0c
            X.6Ly r1 = X.AnonymousClass7TF.A0P(r11, r0, r1)
            r12.A0k = r1
            if (r16 == 0) goto L_0x00ee
            float r15 = r12.A00(r9, r2)
        L_0x00ee:
            r0 = 0
            r1.A0I(r10)
            X.AJB.A0B(r1, r15, r0, r0)
            if (r44 != 0) goto L_0x00fd
            r13 = r18
            android.text.SpannableString r9 = A01(r9, r13)
        L_0x00fd:
            r1.A0M(r9)
            r1.setCallback(r6)
            int r9 = r1.A0A
            r12.A05 = r9
            int r1 = r1.A06
            r12.A02 = r1
            int r9 = r12.A0f
            int r1 = r12.A0c
            X.6Ly r9 = X.AnonymousClass7TF.A0P(r11, r1, r9)
            r12.A0l = r9
            if (r16 == 0) goto L_0x011b
            float r14 = r12.A00(r8, r2)
        L_0x011b:
            r9.A0I(r10)
            X.AJB.A0B(r9, r14, r0, r0)
            if (r44 != 0) goto L_0x0129
            r1 = r17
            android.text.SpannableString r8 = A01(r8, r1)
        L_0x0129:
            r9.A0M(r8)
            r9.setCallback(r6)
            int r1 = r9.A0A
            r12.A09 = r1
            int r1 = r9.A06
            r12.A06 = r1
            r7 = r22
            r12.A0j = r7
            r6 = 0
            if (r22 == 0) goto L_0x018e
            int r1 = r7.A01
            X.6Ly r2 = X.AnonymousClass7TE.A0s(r11, r1)
            r12.A18 = r2
            float r1 = r7.A00
            X.AJB.A07(r11, r2, r1, r0)
            java.lang.String r1 = r7.A03
            r2.A0M(r1)
        L_0x0150:
            if (r43 == 0) goto L_0x018b
            r1 = 2131239994(0x7f08243a, float:1.809631E38)
            android.graphics.drawable.Drawable r1 = r11.getDrawable(r1)
            r12.A17 = r1
        L_0x015b:
            if (r22 == 0) goto L_0x0189
            X.6Ly r1 = r12.A18
            r1.getClass()
            int r6 = r1.A06
            int r1 = r7.A02
            int r6 = r6 + r1
        L_0x0167:
            int r2 = r5 * 2
            int r2 = r2 + r3
            r12.A10 = r2
            int r6 = r6 + r4
            r12.A0v = r6
            r1 = 7
            android.graphics.Paint r1 = X.AnonymousClass7TE.A0V(r1)
            r12.A11 = r1
            X.AnonymousClass7TE.A1Q(r1)
            float r3 = (float) r2
            float r2 = (float) r4
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>(r0, r0, r3, r2)
            r12.A13 = r1
            android.graphics.RectF r0 = X.AnonymousClass7TE.A0Y()
            r12.A14 = r0
            return
        L_0x0189:
            r6 = 0
            goto L_0x0167
        L_0x018b:
            r12.A17 = r6
            goto L_0x015b
        L_0x018e:
            r12.A18 = r6
            goto L_0x0150
        L_0x0191:
            if (r41 == 0) goto L_0x00dd
        L_0x0193:
            r2 = 5
            goto L_0x00de
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C389529pm.<init>(android.content.Context, android.graphics.Typeface, X.A6c, java.lang.String, java.lang.String, java.lang.String, int[], int[], int[], int[], float, float, int, int, int, int, int, int, int, int, boolean, boolean, boolean, boolean, boolean):void");
    }
}
