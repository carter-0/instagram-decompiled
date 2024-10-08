package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import java.util.BitSet;

/* renamed from: X.5sV  reason: invalid class name and case insensitive filesystem */
public class C297875sV extends Drawable implements C297885sW {
    public static final Paint A0M = new Paint(1);
    public C297955sd A00;
    public C297895sX A01;
    public boolean A02;
    public boolean A03;
    public PorterDuffColorFilter A04;
    public PorterDuffColorFilter A05;
    public final Paint A06;
    public final Paint A07;
    public final Path A08;
    public final Path A09;
    public final RectF A0A;
    public final RectF A0B;
    public final RectF A0C;
    public final C298015sj A0D;
    public final C297985sg A0E;
    public final BitSet A0F;
    public final C297965se[] A0G;
    public final C297965se[] A0H;
    public final Matrix A0I;
    public final Region A0J;
    public final Region A0K;
    public final C297975sf A0L;

    public final void A09() {
        C297955sd r1 = this.A00;
        if (r1.A07 != 2) {
            r1.A07 = 2;
            super.invalidateSelf();
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void invalidateSelf() {
        this.A02 = true;
        super.invalidateSelf();
    }

    public final void onBoundsChange(Rect rect) {
        this.A02 = true;
        super.onBoundsChange(rect);
    }

    private float A00() {
        Paint.Style style = this.A00.A0G;
        if (style != Paint.Style.FILL_AND_STROKE && style != Paint.Style.STROKE) {
            return 0.0f;
        }
        Paint paint = this.A07;
        if (paint.getStrokeWidth() > 0.0f) {
            return paint.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private void A01(Canvas canvas) {
        if (this.A0F.cardinality() > 0) {
            Log.w("MaterialShapeDrawable", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.A00.A08 != 0) {
            canvas.drawPath(this.A08, this.A0L.A06);
        }
        int i = 0;
        do {
            C297965se r1 = this.A0G[i];
            C297975sf r3 = this.A0L;
            int i2 = this.A00.A09;
            Matrix matrix = C297965se.A00;
            r1.A00(canvas, matrix, r3, i2);
            this.A0H[i].A00(canvas, matrix, r3, this.A00.A09);
            i++;
        } while (i < 4);
        if (this.A03) {
            C297955sd r12 = this.A00;
            double d = (double) r12.A08;
            double radians = Math.toRadians((double) r12.A0A);
            int sin = (int) (d * Math.sin(radians));
            int cos = (int) (d * Math.cos(radians));
            canvas.translate((float) (-sin), (float) (-cos));
            canvas.drawPath(this.A08, A0M);
            canvas.translate((float) sin, (float) cos);
        }
    }

    private void A02(Path path, RectF rectF) {
        C297985sg r4 = this.A0E;
        C297955sd r0 = this.A00;
        Path path2 = path;
        RectF rectF2 = rectF;
        r4.A01(path2, rectF2, r0.A0K, this.A0D, r0.A01);
        if (this.A00.A03 != 1.0f) {
            Matrix matrix = this.A0I;
            matrix.reset();
            float f = this.A00.A03;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.A0B, true);
    }

    public static void A03(C297875sV r5) {
        C297955sd r4 = r5.A00;
        float f = r4.A00 + r4.A05;
        r4.A09 = (int) Math.ceil((double) (0.75f * f));
        r4.A08 = (int) Math.ceil((double) (f * 0.25f));
        r5.A04();
        super.invalidateSelf();
    }

    private boolean A04() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2;
        PorterDuffColorFilter porterDuffColorFilter3 = this.A05;
        PorterDuffColorFilter porterDuffColorFilter4 = this.A04;
        C297955sd r0 = this.A00;
        ColorStateList colorStateList = r0.A0E;
        PorterDuff.Mode mode = r0.A0H;
        Paint paint = this.A06;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int A082 = A08(color);
            if (A082 != color) {
                porterDuffColorFilter = new PorterDuffColorFilter(A082, PorterDuff.Mode.SRC_IN);
            } else {
                porterDuffColorFilter = null;
            }
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(A08(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.A05 = porterDuffColorFilter;
        C297955sd r02 = this.A00;
        ColorStateList colorStateList2 = r02.A0D;
        PorterDuff.Mode mode2 = r02.A0H;
        if (colorStateList2 == null || mode2 == null) {
            porterDuffColorFilter2 = null;
        } else {
            porterDuffColorFilter2 = new PorterDuffColorFilter(colorStateList2.getColorForState(getState(), 0), mode2);
        }
        this.A04 = porterDuffColorFilter2;
        C297955sd r1 = this.A00;
        if (r1.A0L) {
            this.A0L.A00(r1.A0E.getColorForState(getState(), 0));
        }
        if (!02S.A00(porterDuffColorFilter3, this.A05) || !02S.A00(porterDuffColorFilter4, this.A04)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r2 = r5.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        r2 = r5.A07;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A05(int[] r6) {
        /*
            r5 = this;
            X.5sd r0 = r5.A00
            android.content.res.ColorStateList r0 = r0.A0B
            r4 = 1
            if (r0 == 0) goto L_0x0035
            android.graphics.Paint r2 = r5.A06
            int r1 = r2.getColor()
            X.5sd r0 = r5.A00
            android.content.res.ColorStateList r0 = r0.A0B
            int r0 = r0.getColorForState(r6, r1)
            if (r1 == r0) goto L_0x0035
            r2.setColor(r0)
            r3 = 1
        L_0x001b:
            X.5sd r0 = r5.A00
            android.content.res.ColorStateList r0 = r0.A0C
            if (r0 == 0) goto L_0x0037
            android.graphics.Paint r2 = r5.A07
            int r1 = r2.getColor()
            X.5sd r0 = r5.A00
            android.content.res.ColorStateList r0 = r0.A0C
            int r0 = r0.getColorForState(r6, r1)
            if (r1 == r0) goto L_0x0037
            r2.setColor(r0)
            return r4
        L_0x0035:
            r3 = 0
            goto L_0x001b
        L_0x0037:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C297875sV.A05(int[]):boolean");
    }

    public final float A07() {
        C297935sb r2 = this.A00.A0K.A02;
        RectF rectF = this.A0C;
        rectF.set(getBounds());
        return r2.ArV(rectF);
    }

    public final int A08(int i) {
        C297955sd r2 = this.A00;
        float f = r2.A00 + r2.A05 + r2.A02;
        C298025sk r0 = r2.A0J;
        if (r0 != null) {
            return r0.A00(i, f);
        }
        return i;
    }

    public final void A0A(float f) {
        C297955sd r1 = this.A00;
        if (r1.A00 != f) {
            r1.A00 = f;
            A03(this);
        }
    }

    public final void A0B(float f) {
        C297955sd r1 = this.A00;
        if (r1.A01 != f) {
            r1.A01 = f;
            this.A02 = true;
            invalidateSelf();
        }
    }

    public final void A0C(int i) {
        this.A0L.A00(i);
        this.A00.A0L = false;
        super.invalidateSelf();
    }

    public final void A0D(int i) {
        C297955sd r1 = this.A00;
        if (r1.A08 != i) {
            r1.A08 = i;
            super.invalidateSelf();
        }
    }

    public final void A0E(Context context) {
        this.A00.A0J = new C298025sk(context);
        A03(this);
    }

    public final void A0F(ColorStateList colorStateList) {
        C297955sd r1 = this.A00;
        if (r1.A0B != colorStateList) {
            r1.A0B = colorStateList;
            onStateChange(getState());
        }
    }

    public final void A0G(ColorStateList colorStateList) {
        C297955sd r1 = this.A00;
        if (r1.A0C != colorStateList) {
            r1.A0C = colorStateList;
            onStateChange(getState());
        }
    }

    public final void A0H(ColorStateList colorStateList, float f) {
        this.A00.A04 = f;
        invalidateSelf();
        A0G(colorStateList);
    }

    public final boolean A0I() {
        C297895sX r2 = this.A00.A0K;
        RectF rectF = this.A0C;
        rectF.set(getBounds());
        return r2.A03(rectF);
    }

    public void draw(Canvas canvas) {
        Paint paint = this.A06;
        paint.setColorFilter(this.A05);
        int alpha = paint.getAlpha();
        int i = this.A00.A06;
        paint.setAlpha((alpha * (i + (i >>> 7))) >>> 8);
        Paint paint2 = this.A07;
        paint2.setColorFilter(this.A04);
        paint2.setStrokeWidth(this.A00.A04);
        int alpha2 = paint2.getAlpha();
        int i2 = this.A00.A06;
        paint2.setAlpha((alpha2 * (i2 + (i2 >>> 7))) >>> 8);
        if (this.A02) {
            float f = -A00();
            C297955sd r2 = this.A00;
            C297895sX r9 = r2.A0K;
            C324126yg r3 = new C324126yg(r9);
            C297935sb r1 = r9.A02;
            if (!(r1 instanceof C324136yh)) {
                r1 = new C324146yi(r1, f);
            }
            r3.A02 = r1;
            C297935sb r12 = r9.A03;
            if (!(r12 instanceof C324136yh)) {
                r12 = new C324146yi(r12, f);
            }
            r3.A03 = r12;
            C297935sb r13 = r9.A00;
            if (!(r13 instanceof C324136yh)) {
                r13 = new C324146yi(r13, f);
            }
            r3.A00 = r13;
            C297935sb r14 = r9.A01;
            if (!(r14 instanceof C324136yh)) {
                r14 = new C324146yi(r14, f);
            }
            r3.A01 = r14;
            C297895sX r11 = new C297895sX(r3);
            this.A01 = r11;
            C297985sg r8 = this.A0E;
            float f2 = r2.A01;
            RectF rectF = this.A0A;
            RectF rectF2 = this.A0C;
            rectF2.set(getBounds());
            rectF.set(rectF2);
            float A002 = A00();
            rectF.inset(A002, A002);
            r8.A01(this.A09, rectF, r11, (C298015sj) null, f2);
            rectF2.set(getBounds());
            A02(this.A08, rectF2);
            this.A02 = false;
        }
        C297955sd r22 = this.A00;
        int i3 = r22.A07;
        if (i3 != 1 && r22.A09 > 0 && (i3 == 2 || (!A0I() && !this.A08.isConvex() && Build.VERSION.SDK_INT < 29))) {
            canvas.save();
            C297955sd r15 = this.A00;
            double d = (double) r15.A08;
            double radians = Math.toRadians((double) r15.A0A);
            canvas.translate((float) ((int) (d * Math.sin(radians))), (float) ((int) (d * Math.cos(radians))));
            if (!this.A03) {
                A01(canvas);
            } else {
                RectF rectF3 = this.A0B;
                int width = (int) (rectF3.width() - ((float) getBounds().width()));
                int height = (int) (rectF3.height() - ((float) getBounds().height()));
                if (width < 0 || height < 0) {
                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                }
                Bitmap createBitmap = Bitmap.createBitmap(((int) rectF3.width()) + (this.A00.A09 * 2) + width, ((int) rectF3.height()) + (this.A00.A09 * 2) + height, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap);
                float f3 = (float) ((getBounds().left - this.A00.A09) - width);
                float f4 = (float) ((getBounds().top - this.A00.A09) - height);
                canvas2.translate(-f3, -f4);
                A01(canvas2);
                canvas.drawBitmap(createBitmap, f3, f4, (Paint) null);
                createBitmap.recycle();
            }
            canvas.restore();
        }
        C297955sd r23 = this.A00;
        Paint.Style style = r23.A0G;
        Paint.Style style2 = Paint.Style.FILL_AND_STROKE;
        if (style == style2 || style == Paint.Style.FILL) {
            Path path = this.A08;
            C297895sX r16 = r23.A0K;
            RectF rectF4 = this.A0C;
            rectF4.set(getBounds());
            if (r16.A03(rectF4)) {
                float ArV = r16.A03.ArV(rectF4) * this.A00.A01;
                canvas.drawRoundRect(rectF4, ArV, ArV, paint);
            } else {
                canvas.drawPath(path, paint);
            }
        }
        Paint.Style style3 = this.A00.A0G;
        if ((style3 == style2 || style3 == Paint.Style.STROKE) && paint2.getStrokeWidth() > 0.0f) {
            Path path2 = this.A09;
            C297895sX r32 = this.A01;
            RectF rectF5 = this.A0A;
            RectF rectF6 = this.A0C;
            rectF6.set(getBounds());
            rectF5.set(rectF6);
            float A003 = A00();
            rectF5.inset(A003, A003);
            if (r32.A03(rectF5)) {
                float ArV2 = r32.A03.ArV(rectF5) * this.A00.A01;
                canvas.drawRoundRect(rectF5, ArV2, ArV2, paint2);
            } else {
                canvas.drawPath(path2, paint2);
            }
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public final Drawable.ConstantState getConstantState() {
        return this.A00;
    }

    public void getOutline(Outline outline) {
        if (this.A00.A07 == 2) {
            return;
        }
        if (A0I()) {
            outline.setRoundRect(getBounds(), A07() * this.A00.A01);
            return;
        }
        RectF rectF = this.A0C;
        rectF.set(getBounds());
        Path path = this.A08;
        A02(path, rectF);
        if (path.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.A00.A0I;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public final C297895sX getShapeAppearanceModel() {
        return this.A00.A0K;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.graphics.drawable.Drawable$ConstantState, X.5sd] */
    public final Drawable mutate() {
        C297955sd r1 = this.A00;
        ? constantState = new Drawable.ConstantState();
        constantState.A0B = null;
        constantState.A0C = null;
        constantState.A0D = null;
        constantState.A0E = null;
        constantState.A0H = PorterDuff.Mode.SRC_IN;
        constantState.A0I = null;
        constantState.A03 = 1.0f;
        constantState.A01 = 1.0f;
        constantState.A06 = 255;
        constantState.A02 = 0.0f;
        constantState.A00 = 0.0f;
        constantState.A05 = 0.0f;
        constantState.A07 = 0;
        constantState.A09 = 0;
        constantState.A08 = 0;
        constantState.A0A = 0;
        constantState.A0L = false;
        constantState.A0G = Paint.Style.FILL_AND_STROKE;
        constantState.A0K = r1.A0K;
        constantState.A0J = r1.A0J;
        constantState.A04 = r1.A04;
        constantState.A0F = r1.A0F;
        constantState.A0B = r1.A0B;
        constantState.A0C = r1.A0C;
        constantState.A0H = r1.A0H;
        constantState.A0E = r1.A0E;
        constantState.A06 = r1.A06;
        constantState.A03 = r1.A03;
        constantState.A08 = r1.A08;
        constantState.A07 = r1.A07;
        constantState.A0L = r1.A0L;
        constantState.A01 = r1.A01;
        constantState.A02 = r1.A02;
        constantState.A00 = r1.A00;
        constantState.A05 = r1.A05;
        constantState.A09 = r1.A09;
        constantState.A0A = r1.A0A;
        constantState.A0D = r1.A0D;
        constantState.A0G = r1.A0G;
        Rect rect = r1.A0I;
        if (rect != null) {
            constantState.A0I = new Rect(rect);
        }
        this.A00 = constantState;
        return this;
    }

    public void setAlpha(int i) {
        C297955sd r1 = this.A00;
        if (r1.A06 != i) {
            r1.A06 = i;
            super.invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A00.A0F = colorFilter;
        super.invalidateSelf();
    }

    public final void setShapeAppearanceModel(C297895sX r2) {
        this.A00.A0K = r2;
        invalidateSelf();
    }

    public void setTintList(ColorStateList colorStateList) {
        this.A00.A0E = colorStateList;
        A04();
        super.invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C297955sd r1 = this.A00;
        if (r1.A0H != mode) {
            r1.A0H = mode;
            A04();
            super.invalidateSelf();
        }
    }

    public C297875sV(C297955sd r6) {
        C297985sg r0;
        this.A0G = new C297965se[4];
        this.A0H = new C297965se[4];
        this.A0F = new BitSet(8);
        this.A0I = new Matrix();
        this.A08 = new Path();
        this.A09 = new Path();
        this.A0C = new RectF();
        this.A0A = new RectF();
        this.A0K = new Region();
        this.A0J = new Region();
        Paint paint = new Paint(1);
        this.A06 = paint;
        Paint paint2 = new Paint(1);
        this.A07 = paint2;
        this.A0L = new C297975sf();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            r0 = C323636xp.A00;
        } else {
            r0 = new C297985sg();
        }
        this.A0E = r0;
        this.A0B = new RectF();
        this.A03 = true;
        this.A00 = r6;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = A0M;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        A04();
        A05(getState());
        this.A0D = new C298005si(this);
    }

    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.A0K;
        region.set(bounds);
        RectF rectF = this.A0C;
        rectF.set(getBounds());
        Path path = this.A08;
        A02(path, rectF);
        Region region2 = this.A0J;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.A00.A0E;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.A00.A0D;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.A00.A0C;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.A00.A0B;
        if (colorStateList4 == null || !colorStateList4.isStateful()) {
            return false;
        }
        return true;
    }

    public boolean onStateChange(int[] iArr) {
        boolean A052 = A05(iArr);
        boolean A042 = A04();
        if (!A052 && !A042) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.graphics.drawable.Drawable$ConstantState, X.5sd] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C297875sV(X.C297895sX r4) {
        /*
            r3 = this;
            r2 = 0
            X.5sd r1 = new X.5sd
            r1.<init>()
            r1.A0B = r2
            r1.A0C = r2
            r1.A0D = r2
            r1.A0E = r2
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r1.A0H = r0
            r1.A0I = r2
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.A03 = r0
            r1.A01 = r0
            r0 = 255(0xff, float:3.57E-43)
            r1.A06 = r0
            r0 = 0
            r1.A02 = r0
            r1.A00 = r0
            r1.A05 = r0
            r0 = 0
            r1.A07 = r0
            r1.A09 = r0
            r1.A08 = r0
            r1.A0A = r0
            r1.A0L = r0
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL_AND_STROKE
            r1.A0G = r0
            r1.A0K = r4
            r1.A0J = r2
            r3.<init>((X.C297955sd) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C297875sV.<init>(X.5sX):void");
    }

    public C297875sV() {
        this(new C297895sX());
    }
}
