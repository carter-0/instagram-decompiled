package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.SparseArray;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* renamed from: X.6Ly  reason: invalid class name and case insensitive filesystem */
public class C306386Ly extends Drawable {
    public static final Spannable A0d = new SpannableString("");
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public ColorStateList A0B;
    public Bitmap A0C;
    public PorterDuffColorFilter A0D;
    public Layout.Alignment A0E;
    public Spannable A0F;
    public StaticLayout A0G;
    public StaticLayout A0H;
    public C306396Lz A0I;
    public C362938ik A0J;
    public C321176th A0K;
    public CharSequence A0L;
    public Integer A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public int A0S;
    public int A0T;
    public int A0U;
    public PorterDuff.Mode A0V;
    public CharSequence A0W;
    public Object A0X;
    public boolean A0Y;
    public final Context A0Z;
    public final Rect A0a = new Rect();
    public final TextPaint A0b;
    public final SparseArray A0c;

    public final void A09() {
        if (!this.A0R) {
            this.A0R = true;
            A02();
            invalidateSelf();
        }
    }

    public final void A0G(int i, CharSequence charSequence) {
        A0N(charSequence, i, false);
    }

    public final void A0J(Typeface typeface, int i) {
        Typeface create;
        int i2;
        float f = 0.0f;
        boolean z = false;
        if (i > 0) {
            if (typeface == null) {
                create = Typeface.defaultFromStyle(i);
            } else {
                create = Typeface.create(typeface, i);
            }
            TextPaint textPaint = this.A0b;
            textPaint.setTypeface(create);
            if (create != null) {
                i2 = create.getStyle();
            } else {
                i2 = 0;
            }
            int i3 = (i2 ^ -1) & 1;
            if ((i3 & 1) != 0) {
                z = true;
            }
            textPaint.setFakeBoldText(z);
            if ((i3 & 2) != 0) {
                f = -0.25f;
            }
            textPaint.setTextSkewX(f);
        } else {
            TextPaint textPaint2 = this.A0b;
            textPaint2.setFakeBoldText(false);
            textPaint2.setTextSkewX(0.0f);
            textPaint2.setTypeface(typeface);
        }
        A0R();
    }

    public final boolean A0Q(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return false;
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        SparseArray sparseArray = this.A0c;
        PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) sparseArray.get(colorForState);
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(colorForState, mode);
            sparseArray.put(colorForState, porterDuffColorFilter);
        }
        PorterDuffColorFilter porterDuffColorFilter2 = this.A0D;
        this.A0D = porterDuffColorFilter;
        this.A0b.setColorFilter(porterDuffColorFilter);
        return porterDuffColorFilter2 == null || !porterDuffColorFilter2.equals(this.A0D);
    }

    public final int getOpacity() {
        return -3;
    }

    private void A00() {
        boolean z;
        int i;
        C381609c2 r6;
        int i2;
        int lastIndexOf;
        CharSequence charSequence = this.A0F;
        if (charSequence != null) {
            int i3 = this.A0U;
            if (i3 > 0) {
                CharSequence charSequence2 = charSequence;
                charSequence = C252993q2.A01(A08(), "", charSequence2, this.A0W, i3, this.A0Y);
                if (!charSequence.equals(this.A0F)) {
                    charSequence = TextUtils.concat(new CharSequence[]{charSequence, this.A0W});
                }
                if (this.A0Q && (lastIndexOf = charSequence.toString().lastIndexOf(32)) != -1) {
                    charSequence = TextUtils.concat(new CharSequence[]{TextUtils.concat(new CharSequence[]{charSequence.subSequence(0, lastIndexOf), " "}), charSequence.subSequence(lastIndexOf + 1, charSequence.length())});
                }
            }
            TextPaint textPaint = this.A0b;
            textPaint.setColorFilter(this.A0D);
            this.A0G = new StaticLayout(charSequence, textPaint, this.A07, this.A0E, this.A03, this.A02, false);
            this.A0L = charSequence;
            if (!TextUtils.isEmpty(this.A0F)) {
                z = 0mp.A0A(this.A0F);
            } else {
                z = false;
            }
            int i4 = 0;
            if (z) {
                String obj = this.A0F.toString();
                int length = this.A0F.length();
                Rect rect = this.A0a;
                textPaint.getTextBounds(obj, 0, length, rect);
                int height = rect.height();
                StaticLayout staticLayout = this.A0G;
                if (staticLayout != null) {
                    i2 = staticLayout.getLineBottom(0);
                } else {
                    i2 = 0;
                }
                i4 = Math.max(0, height - i2);
            }
            this.A08 = i4;
            this.A0A = AnonymousClass6M0.A02(this.A0G) + Math.round(this.A00 * 2.0f);
            StaticLayout staticLayout2 = this.A0G;
            if (staticLayout2 != null) {
                i = staticLayout2.getHeight();
            } else {
                i = 0;
            }
            this.A06 = i + Math.round(this.A01 * 2.0f) + this.A08;
            this.A0H = null;
            A02();
            if (this.A0I == C306396Lz.SPARKLE) {
                ArrayList arrayList = new ArrayList();
                if (this.A0G != null) {
                    Path path = new Path();
                    float f = this.A00;
                    if (A0P()) {
                        f -= (float) AnonymousClass6M0.A00(this.A0G);
                    }
                    float f2 = this.A01 + ((float) this.A08);
                    float f3 = 0.0f;
                    for (int i5 = 0; i5 < this.A0G.getLineCount(); i5++) {
                        Path path2 = new Path();
                        float lineLeft = f + this.A0G.getLineLeft(i5);
                        float lineBaseline = f2 + ((float) this.A0G.getLineBaseline(i5));
                        int lineStart = this.A0G.getLineStart(i5);
                        int lineEnd = this.A0G.getLineEnd(i5);
                        textPaint.getTextPath(this.A0F.toString(), lineStart, lineEnd, lineLeft, lineBaseline, path2);
                        path.addPath(path2);
                        PathMeasure pathMeasure = new PathMeasure(path2, false);
                        float length2 = pathMeasure.getLength();
                        float f4 = 0.0f;
                        while (true) {
                            length2 += f4;
                            if (!pathMeasure.nextContour()) {
                                break;
                            }
                            f4 = pathMeasure.getLength();
                        }
                        f3 += length2;
                        ArrayList A072 = 0mp.A07(this.A0F.subSequence(lineStart, lineEnd));
                        for (int i6 = 0; i6 < A072.size(); i6++) {
                            int intValue = lineStart + ((Number) A072.get(i6)).intValue();
                            if (intValue >= 0) {
                                Rect rect2 = new Rect();
                                float measureText = textPaint.measureText(this.A0F, lineStart, intValue);
                                textPaint.getTextBounds(this.A0F.toString(), intValue, Math.min(intValue + 2, this.A0F.length()), rect2);
                                RectF rectF = new RectF(rect2);
                                rectF.offset(lineLeft + measureText, lineBaseline);
                                Path path3 = new Path();
                                path3.addRect(rectF, Path.Direction.CW);
                                PathMeasure pathMeasure2 = new PathMeasure(path3, false);
                                float length3 = pathMeasure2.getLength();
                                float f5 = 0.0f;
                                while (true) {
                                    length3 += f5;
                                    if (!pathMeasure2.nextContour()) {
                                        break;
                                    }
                                    f5 = pathMeasure2.getLength();
                                }
                                f3 += length3;
                                path.addPath(path3);
                            }
                        }
                    }
                    if (f3 > 0.0f) {
                        Random random = new Random();
                        String replaceAll = this.A0F.toString().replaceAll("\\s+", "");
                        for (int i7 = 0; i7 < Math.min(16, ((int) ((float) Math.floor((double) (((float) replaceAll.length()) / 3.0f)))) + 3); i7++) {
                            float nextFloat = random.nextFloat() * f3;
                            PathMeasure pathMeasure3 = new PathMeasure(path, false);
                            while (pathMeasure3.getLength() < nextFloat) {
                                nextFloat -= pathMeasure3.getLength();
                                if (!pathMeasure3.nextContour()) {
                                    break;
                                }
                            }
                            float[] fArr = new float[2];
                            pathMeasure3.getPosTan(nextFloat, fArr, (float[]) null);
                            arrayList.add(Float.valueOf(fArr[0]));
                            arrayList.add(Float.valueOf(fArr[1]));
                            arrayList.add(Float.valueOf(1.0f));
                        }
                    }
                }
                r6 = new C381609c2(arrayList);
            } else {
                this.A0J = null;
                r6 = null;
            }
            C306396Lz r7 = this.A0I;
            if (r7 != null) {
                C306396Lz r10 = r7;
                C381609c2 r11 = r6;
                this.A0J = new C362938ik(textPaint.getTypeface(), r10, r11, (List) null, 1.0f, 1.0f, 0.0f, 0nA.A02(this.A0Z, textPaint.getTextSize()) / this.A04, this.A05, this.A09, this.A0P);
            }
        }
    }

    private void A01() {
        if (!TextUtils.isEmpty(this.A0F)) {
            ViewTreeObserver.OnPreDrawListener[] onPreDrawListenerArr = (ViewTreeObserver.OnPreDrawListener[]) C263324Kh.A06(this.A0F, ViewTreeObserver.OnPreDrawListener.class);
            for (ViewTreeObserver.OnPreDrawListener onPreDraw : onPreDrawListenerArr) {
                onPreDraw.onPreDraw();
            }
        }
    }

    private void A02() {
        Bitmap bitmap = this.A0C;
        if (bitmap != null) {
            bitmap.recycle();
            this.A0C = null;
        }
        if (this.A0A > 0 && this.A06 > 0) {
            if ((this.A0R && !TextUtils.isEmpty(this.A0F) && 0mp.A0A(this.A0F)) || this.A0B != null) {
                TextPaint textPaint = this.A0b;
                Bitmap createBitmap = Bitmap.createBitmap(this.A0A, this.A06 + Math.round((((float) textPaint.getFontMetricsInt((Paint.FontMetricsInt) null)) * (this.A03 - 1.0f)) + this.A02), Bitmap.Config.ARGB_8888);
                this.A0C = createBitmap;
                Canvas canvas = new Canvas(createBitmap);
                textPaint.setColorFilter((ColorFilter) null);
                A03(canvas);
                textPaint.setColorFilter(this.A0D);
            }
        }
    }

    public final 0rN A08() {
        TextPaint textPaint = this.A0b;
        int i = this.A07;
        return new 0rN(Layout.Alignment.ALIGN_NORMAL, textPaint, (String) null, this.A02, this.A03, i, false);
    }

    public void A0A(float f) {
        this.A0b.setTextSize(f);
        A0R();
    }

    public final void A0B(float f, float f2) {
        this.A02 = f;
        this.A03 = f2;
        A0R();
    }

    public final void A0C(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
        A0R();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.6th, java.lang.Object] */
    public final void A0D(float f, float f2, float f3, int i) {
        ? obj = new Object();
        obj.A02 = f;
        obj.A00 = f2;
        obj.A01 = f3;
        obj.A03 = i;
        this.A0K = obj;
        this.A0b.setShadowLayer(f, f2, f3, i);
        A0R();
    }

    public final void A0E(int i) {
        this.A07 = i;
        A0R();
    }

    public final void A0F(int i) {
        TextPaint textPaint = this.A0b;
        if (textPaint.getColor() != i) {
            textPaint.setColor(i);
            A0R();
        }
    }

    public final void A0H(Canvas canvas) {
        canvas.translate(this.A00, this.A01 + ((float) this.A08));
        if (A0P()) {
            canvas.translate((float) (-AnonymousClass6M0.A00(this.A0G)), 0.0f);
        }
    }

    public final void A0I(Typeface typeface) {
        this.A0b.setTypeface(typeface);
        A0R();
    }

    public final void A0K(Layout.Alignment alignment) {
        if (this.A0E != alignment) {
            this.A0E = alignment;
            A0R();
        }
    }

    public void A0L(Spannable spannable) {
        Spannable spannable2 = this.A0F;
        if (spannable2 == A0d || !spannable2.equals(spannable)) {
            this.A0F = spannable;
            if (spannable != null) {
                C70572Rz.A00().A8I(spannable, -1);
            }
            A0R();
        }
    }

    public void A0M(CharSequence charSequence) {
        A0L(new SpannableString(charSequence));
    }

    public final void A0N(CharSequence charSequence, int i, boolean z) {
        this.A0U = i;
        this.A0W = charSequence;
        this.A0Y = z;
        A0R();
    }

    public final boolean A0O() {
        StaticLayout staticLayout = this.A0G;
        if (staticLayout == null) {
            return false;
        }
        return C304216Cp.A02().A04(staticLayout.getText().toString());
    }

    public final boolean A0P() {
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        if (!this.A0O) {
            alignment = this.A0E;
            alignment2 = Layout.Alignment.ALIGN_NORMAL;
        } else {
            boolean A0O2 = A0O();
            alignment = this.A0E;
            if (A0O2) {
                alignment2 = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (alignment != Layout.Alignment.ALIGN_NORMAL) {
                return true;
            } else {
                return false;
            }
        }
        if (alignment == alignment2) {
            return false;
        }
        return true;
    }

    public void A0T(Canvas canvas) {
        if (this.A0H == null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.A0L);
            ViewTreeObserver.OnPreDrawListener[] onPreDrawListenerArr = (ViewTreeObserver.OnPreDrawListener[]) C263324Kh.A06(spannableStringBuilder, ViewTreeObserver.OnPreDrawListener.class);
            for (int i = 0; i < onPreDrawListenerArr.length; i++) {
                ViewTreeObserver.OnPreDrawListener onPreDrawListener = onPreDrawListenerArr[i];
                if ((onPreDrawListener instanceof AnonymousClass6MQ) && ((AnonymousClass6MQ) onPreDrawListener).By7() == AnonymousClass05K.A00) {
                    spannableStringBuilder.removeSpan(onPreDrawListenerArr[i]);
                }
            }
            this.A0H = new StaticLayout(spannableStringBuilder, this.A0b, this.A07, this.A0E, this.A03, this.A02, false);
        }
        canvas.save();
        canvas.translate((float) this.A0S, (float) this.A0T);
        A0H(canvas);
        StaticLayout staticLayout = this.A0H;
        if (staticLayout != null) {
            staticLayout.draw(canvas);
        }
        canvas.restore();
    }

    public final int getAlpha() {
        return this.A0b.getAlpha();
    }

    public final int getIntrinsicHeight() {
        return this.A06;
    }

    public final int getIntrinsicWidth() {
        return this.A0A;
    }

    public final boolean isStateful() {
        if (this.A0B != null) {
            return true;
        }
        return false;
    }

    public void onBoundsChange(Rect rect) {
        this.A0S = rect.left;
        this.A0T = rect.top;
    }

    public final boolean onStateChange(int[] iArr) {
        return A0Q(this.A0B, this.A0V);
    }

    public final void setAlpha(int i) {
        C321176th r4;
        this.A0b.setAlpha(i);
        Spannable spannable = this.A0F;
        if (spannable != null) {
            for (ImageSpan drawable : (ImageSpan[]) spannable.getSpans(0, spannable.length(), ImageSpan.class)) {
                Drawable drawable2 = drawable.getDrawable();
                if (drawable2 != null) {
                    drawable2.mutate().setAlpha(i);
                }
            }
            for (C358858ba r1 : (C358858ba[]) spannable.getSpans(0, spannable.length(), C358858ba.class)) {
                ((C358848bZ) r1).A03 = Integer.valueOf(i);
            }
        }
        if (this.A0N && (r4 = this.A0K) != null) {
            A0D(r4.A02, r4.A00, r4.A01, 2eL.A06(r4.A03, (int) (((float) i) * 0.8f)));
        }
        A0R();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0b.setColorFilter(colorFilter);
        A0R();
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.A0B = colorStateList;
        A00();
        A0Q(colorStateList, this.A0V);
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        this.A0V = mode;
        this.A0c.clear();
        A0Q(this.A0B, this.A0V);
    }

    public C306386Ly(Context context, int i) {
        Spannable spannable = A0d;
        this.A0F = spannable;
        this.A0L = spannable;
        this.A0H = null;
        this.A0X = "TextDrawable";
        this.A0E = Layout.Alignment.ALIGN_CENTER;
        this.A0W = "";
        this.A02 = 0.0f;
        this.A03 = 1.0f;
        this.A0V = PorterDuff.Mode.SRC_IN;
        this.A0c = new SparseArray();
        this.A0N = false;
        this.A0Q = false;
        this.A0I = null;
        this.A0J = null;
        this.A04 = 1.0f;
        this.A05 = 0.5f;
        this.A09 = -1;
        this.A0P = false;
        this.A07 = i;
        this.A0Z = context;
        TextPaint textPaint = new TextPaint();
        this.A0b = textPaint;
        textPaint.density = context.getResources().getDisplayMetrics().density;
        textPaint.setAntiAlias(true);
        textPaint.setDither(true);
        textPaint.setFilterBitmap(true);
        textPaint.setColor(-1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A03(android.graphics.Canvas r3) {
        /*
            r2 = this;
            r2.A01()
            r3.save()
            r2.A0H(r3)
            android.text.StaticLayout r0 = r2.A0G     // Catch:{ NullPointerException -> 0x001d, ArrayIndexOutOfBoundsException -> 0x0011 }
            if (r0 == 0) goto L_0x002a
            r0.draw(r3)     // Catch:{ NullPointerException -> 0x001d, ArrayIndexOutOfBoundsException -> 0x0011 }
            goto L_0x002a
        L_0x0011:
            android.text.Spannable r1 = r2.A0F
            java.lang.Class<android.view.ViewTreeObserver$OnPreDrawListener> r0 = android.view.ViewTreeObserver.OnPreDrawListener.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            X.C263324Kh.A05(r1, r0)
            goto L_0x0023
        L_0x001d:
            android.text.Spannable r1 = r2.A0F
            r0 = 0
            r1.removeSpan(r0)
        L_0x0023:
            android.text.StaticLayout r0 = r2.A0G
            if (r0 == 0) goto L_0x002a
            r0.draw(r3)
        L_0x002a:
            r3.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C306386Ly.A03(android.graphics.Canvas):void");
    }

    public void A0R() {
        A00();
        invalidateSelf();
    }

    public void A0S(Canvas canvas) {
        canvas.save();
        canvas.translate((float) this.A0S, (float) this.A0T);
        A01();
        A0H(canvas);
        for (ViewTreeObserver.OnPreDrawListener onPreDrawListener : (ViewTreeObserver.OnPreDrawListener[]) C263324Kh.A06((Spanned) this.A0L, ViewTreeObserver.OnPreDrawListener.class)) {
            if (onPreDrawListener instanceof AnonymousClass6MQ) {
                AnonymousClass6MQ r2 = (AnonymousClass6MQ) onPreDrawListener;
                if (r2.By7() == AnonymousClass05K.A00) {
                    ((AnonymousClass6MP) r2).AQG(canvas);
                }
            }
        }
        canvas.restore();
    }

    public void draw(Canvas canvas) {
        canvas.save();
        canvas.translate((float) this.A0S, (float) this.A0T);
        Bitmap bitmap = this.A0C;
        if (bitmap == null || bitmap.isRecycled()) {
            A03(canvas);
        } else {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.A0b);
        }
        canvas.restore();
    }
}
