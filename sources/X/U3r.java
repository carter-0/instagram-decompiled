package X;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.uimanager.ViewGroupManager;
import com.instagram.android.R;

public class U3r extends ViewGroup implements X7W, X60, XBf, C20828X0d, C20829X0e, C20830X0f {
    public static final Rect A0E = new Rect();
    public static final ViewGroup.LayoutParams A0F = new ViewGroup.LayoutParams(0, 0);
    public int A00;
    public Rect A01;
    public Rect A02;
    public C20827X0c A03;
    public C16510UwB A04;
    public WBR A05;
    public boolean A06;
    public boolean A07;
    public View[] A08;
    public float A09;
    public C17975VjD A0A;
    public Integer A0B;
    public String A0C;
    public final Rect A0D = new Rect();

    private void A01() {
        setClipChildren(false);
        this.A07 = false;
        this.A08 = null;
        this.A00 = 0;
        this.A01 = null;
        this.A02 = null;
        this.A0B = AnonymousClass05K.A00;
        this.A04 = C16510UwB.AUTO;
        this.A05 = null;
        this.A03 = null;
        this.A06 = false;
        this.A0A = null;
        this.A09 = 1.0f;
        this.A0C = "visible";
    }

    public final void dispatchSetPressed(boolean z) {
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public final void removeViews(int i, int i2) {
        int i3 = i2 + i;
        for (int i4 = i; i4 < i3; i4++) {
            if (i4 < getChildCount()) {
                A05(getChildAt(i4));
            }
        }
        super.removeViews(i, i2);
    }

    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i2 + i;
        for (int i4 = i; i4 < i3; i4++) {
            if (i4 < getChildCount()) {
                A05(getChildAt(i4));
            }
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void requestLayout() {
    }

    @Deprecated(forRemoval = true, since = "0.75.0")
    public void setBorderRadius(float f) {
        C13988Tno.A13(this, C13991Tnr.A0J(f), 0);
    }

    private void A02(Rect rect) {
        0Sd.A00(this.A08);
        int i = 0;
        for (int i2 = 0; i2 < this.A00; i2++) {
            A03(rect, this, i2, i);
            if (this.A08[i2].getParent() == null) {
                i++;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0024, code lost:
        if (r0.hasEnded() != false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(android.graphics.Rect r5, X.U3r r6, int r7, int r8) {
        /*
            android.view.View[] r0 = r6.A08
            X.0Sd.A00(r0)
            r4 = r0[r7]
            android.graphics.Rect r0 = A0E
            X.C13992Tns.A0b(r4, r0)
            int r3 = r0.left
            int r2 = r0.top
            int r1 = r0.right
            int r0 = r0.bottom
            boolean r3 = r5.intersects(r3, r2, r1, r0)
            android.view.animation.Animation r0 = r4.getAnimation()
            r2 = 1
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.hasEnded()
            r1 = 1
            if (r0 == 0) goto L_0x0027
        L_0x0026:
            r1 = 0
        L_0x0027:
            android.view.ViewParent r0 = r4.getParent()
            if (r3 != 0) goto L_0x0044
            if (r0 == 0) goto L_0x0043
            if (r1 != 0) goto L_0x0043
            r6.removeViewInLayout(r4)
        L_0x0034:
            boolean r0 = r4 instanceof X.X7W
            if (r0 == 0) goto L_0x0043
            X.X7W r4 = (X.X7W) r4
            boolean r0 = r4.getRemoveClippedSubviews()
            if (r0 == 0) goto L_0x0043
            r4.FJu()
        L_0x0043:
            return
        L_0x0044:
            if (r0 != 0) goto L_0x0034
            int r7 = r7 - r8
            android.view.ViewGroup$LayoutParams r0 = A0F
            r6.addViewInLayout(r4, r7, r0, r2)
            r6.invalidate()
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U3r.A03(android.graphics.Rect, X.U3r, int, int):void");
    }

    private C17975VjD getDrawingOrderHelper() {
        C17975VjD vjD = this.A0A;
        if (vjD != null) {
            return vjD;
        }
        C17975VjD vjD2 = new C17975VjD(this);
        this.A0A = vjD2;
        return vjD2;
    }

    public final void A07() {
        if (!(this.A08 == null || this.A05 == null)) {
            for (int i = 0; i < this.A00; i++) {
                this.A08[i].removeOnLayoutChangeListener(this.A05);
            }
        }
        A01();
        this.A0D.setEmpty();
        A0E.setEmpty();
        removeAllViews();
        super.setBackground((Drawable) null);
        this.A04 = C16510UwB.AUTO;
    }

    public final void A08() {
        float f;
        if (!this.A0C.equals("visible")) {
            float rotationX = getRotationX();
            float rotationY = getRotationY();
            if (rotationX < -90.0f || rotationX >= 90.0f || rotationY < -90.0f || rotationY >= 90.0f) {
                f = 0.0f;
                setAlpha(f);
            }
        }
        f = this.A09;
        setAlpha(f);
    }

    public final void Anq(Rect rect) {
        rect.set(this.A01);
    }

    public final void FJu() {
        if (this.A07) {
            0Sd.A00(this.A01);
            0Sd.A00(this.A08);
            C18702VyT.A00(this, this.A01);
            A02(this.A01);
        }
    }

    public final void dispatchDraw(Canvas canvas) {
        if (!(this.A0B == AnonymousClass05K.A00 && getTag(R.id.filter) == null)) {
            W3s.A03(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (!C18669VwS.A01(this.A04)) {
            return false;
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    public int getAllChildrenCount() {
        return this.A00;
    }

    public Rect getHitSlopRect() {
        return this.A02;
    }

    public String getOverflow() {
        return C13992Tns.A0M(this.A0B);
    }

    public Rect getOverflowInset() {
        return this.A0D;
    }

    public C16510UwB getPointerEvents() {
        return this.A04;
    }

    public boolean getRemoveClippedSubviews() {
        return this.A07;
    }

    public final boolean hasOverlappingRendering() {
        return this.A06;
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (!ReactFeatureFlags.dispatchPointerEvents) {
            return super.onHoverEvent(motionEvent);
        }
        C16510UwB uwB = this.A04;
        0qQ.A0B(uwB, 0);
        if (uwB == C16510UwB.AUTO || uwB == C16510UwB.BOX_ONLY) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (getId() == r1) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            X.X0c r0 = r3.A03
            r2 = 1
            if (r0 == 0) goto L_0x001c
            X.WIq r0 = (X.C19061WIq) r0
            X.0qQ.A0B(r4, r2)
            int r1 = r0.A01
            r0 = -1
            if (r1 == r0) goto L_0x001c
            int r0 = r4.getAction()
            if (r0 == r2) goto L_0x001c
            int r0 = r3.getId()
            if (r0 != r1) goto L_0x001c
        L_0x001b:
            return r2
        L_0x001c:
            X.UwB r0 = r3.A04
            boolean r0 = X.C18669VwS.A01(r0)
            if (r0 == 0) goto L_0x001b
            boolean r2 = super.onInterceptTouchEvent(r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U3r.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setBackfaceVisibility(String str) {
        this.A0C = str;
        A08();
    }

    public void setHitSlopRect(Rect rect) {
        this.A02 = rect;
    }

    public void setNeedsOffscreenAlphaCompositing(boolean z) {
        this.A06 = z;
    }

    public void setOnInterceptTouchEventListener(C20827X0c x0c) {
        this.A03 = x0c;
    }

    public void setOpacityIfPossible(float f) {
        this.A09 = f;
        A08();
    }

    public void setOverflow(String str) {
        Integer num;
        if (str == null || (num = C18105VlZ.A00(str)) == null) {
            num = AnonymousClass05K.A00;
        }
        this.A0B = num;
        invalidate();
    }

    public void setPointerEvents(C16510UwB uwB) {
        this.A04 = uwB;
    }

    public void setRemoveClippedSubviews(boolean z) {
        if (z != this.A07) {
            this.A07 = z;
            if (z) {
                Rect rect = new Rect();
                this.A01 = rect;
                C18702VyT.A00(this, rect);
                int childCount = getChildCount();
                this.A00 = childCount;
                this.A08 = new View[Math.max(12, childCount)];
                this.A05 = new WBR(this);
                for (int i = 0; i < this.A00; i++) {
                    View childAt = getChildAt(i);
                    this.A08[i] = childAt;
                    childAt.addOnLayoutChangeListener(this.A05);
                }
                FJu();
                return;
            }
            0Sd.A00(this.A01);
            0Sd.A00(this.A08);
            0Sd.A00(this.A05);
            for (int i2 = 0; i2 < this.A00; i2++) {
                this.A08[i2].removeOnLayoutChangeListener(this.A05);
            }
            getDrawingRect(this.A01);
            A02(this.A01);
            this.A08 = null;
            this.A01 = null;
            this.A00 = 0;
            this.A05 = null;
        }
    }

    public U3r(Context context) {
        super(context);
        A01();
    }

    private void A04(View view) {
        boolean z;
        if (!A06()) {
            C17975VjD drawingOrderHelper = getDrawingOrderHelper();
            if (ViewGroupManager.getViewZIndex(view) != null) {
                drawingOrderHelper.A00++;
            }
            drawingOrderHelper.A01 = null;
            z = AnonymousClass7TF.A1R(getDrawingOrderHelper().A00);
        } else {
            z = false;
        }
        setChildrenDrawingOrderEnabled(z);
    }

    private void A05(View view) {
        boolean z;
        if (A06()) {
            z = false;
        } else if (indexOfChild(view) != -1) {
            C17975VjD drawingOrderHelper = getDrawingOrderHelper();
            if (ViewGroupManager.getViewZIndex(view) != null) {
                drawingOrderHelper.A00--;
            }
            drawingOrderHelper.A01 = null;
            z = AnonymousClass7TF.A1R(getDrawingOrderHelper().A00);
        } else {
            return;
        }
        setChildrenDrawingOrderEnabled(z);
    }

    private boolean A06() {
        if (getId() == -1 || getId() % 2 != 0) {
            return false;
        }
        return true;
    }

    public final int CHb(int i) {
        if (A06() || getDrawingOrderHelper().A00 <= 0) {
            return i;
        }
        return getDrawingOrderHelper().A00(getChildCount(), i);
    }

    public final void FKE() {
        if (!A06()) {
            getDrawingOrderHelper().A01();
            setChildrenDrawingOrderEnabled(AnonymousClass7TF.A1R(getDrawingOrderHelper().A00));
            invalidate();
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        A04(view);
        super.addView(view, i, layoutParams);
    }

    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        A04(view);
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        try {
            super.dispatchProvideStructure(viewStructure);
        } catch (NullPointerException e) {
            0I1.A05("ReactNative", "NullPointerException when executing dispatchProvideStructure", e);
        }
    }

    public final void draw(Canvas canvas) {
        int A032 = AnonymousClass0fD.A03(-1061329973);
        Canvas canvas2 = canvas;
        if (Build.VERSION.SDK_INT >= 29 && C18103VlX.A00(this) == 2) {
            int i = 0;
            while (true) {
                if (i >= getChildCount()) {
                    break;
                } else if (getChildAt(i).getTag(R.id.mix_blend_mode) != null) {
                    Rect rect = this.A0D;
                    canvas2.saveLayer((float) rect.left, (float) rect.top, (float) (getWidth() + (-rect.right)), (float) (getHeight() + (-rect.bottom)), (Paint) null);
                    super.draw(canvas);
                    canvas.restore();
                    break;
                } else {
                    i++;
                }
            }
        }
        super.draw(canvas);
        AnonymousClass0fD.A0A(307627363, A032);
    }

    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z = false;
        Canvas canvas2 = canvas;
        if (view.getElevation() > 0.0f) {
            z = true;
            SCq.A00(canvas, true);
        }
        BlendMode blendMode = null;
        if (Build.VERSION.SDK_INT >= 29) {
            int i = 0;
            while (true) {
                if (i >= getChildCount()) {
                    break;
                } else if (getChildAt(i).getTag(R.id.mix_blend_mode) != null) {
                    blendMode = (BlendMode) view.getTag(R.id.mix_blend_mode);
                    if (blendMode != null) {
                        Paint paint = new Paint();
                        paint.setBlendMode(blendMode);
                        Rect rect = this.A0D;
                        canvas2.saveLayer((float) rect.left, (float) rect.top, (float) (getWidth() + (-rect.right)), (float) (getHeight() + (-rect.bottom)), paint);
                    }
                } else {
                    i++;
                }
            }
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        if (blendMode != null) {
            canvas.restore();
        }
        if (z) {
            SCq.A00(canvas, false);
        }
        return drawChild;
    }

    public int getBackgroundColor() {
        C14681U1c u1c;
        U1B u1b;
        Drawable background = getBackground();
        if (!(!(background instanceof C14681U1c) || (u1c = (C14681U1c) background) == null || (u1b = u1c.A03) == null)) {
            int i = u1b.A01;
            if (Integer.valueOf(i) == null) {
                return 0;
            }
            return i;
        }
        return 0;
    }

    public final int getChildDrawingOrder(int i, int i2) {
        if (!A06()) {
            return getDrawingOrderHelper().A00(i, i2);
        }
        return i2;
    }

    public void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(-1104786157);
        super.onAttachedToWindow();
        if (this.A07) {
            FJu();
        }
        AnonymousClass0fD.A0D(-1784533721, A062);
    }

    public final void onMeasure(int i, int i2) {
        C18100VlU.A00(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0fD.A06(234321197);
        super.onSizeChanged(i, i2, i3, i4);
        if (this.A07) {
            FJu();
        }
        AnonymousClass0fD.A0D(1874857776, A062);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r3 == X.C16510UwB.A04) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            r0 = 1297029251(0x4d4f1883, float:2.17155632E8)
            int r4 = X.AnonymousClass0fD.A05(r0)
            X.UwB r3 = r5.A04
            r0 = 0
            X.0qQ.A0B(r3, r0)
            X.UwB r0 = X.C16510UwB.AUTO
            if (r3 == r0) goto L_0x0019
            X.UwB r2 = X.C16510UwB.BOX_ONLY
            r1 = 0
            r0 = -1702743922(0xffffffff9a82308e, float:-5.3845184E-23)
            if (r3 != r2) goto L_0x001d
        L_0x0019:
            r1 = 1
            r0 = 400799890(0x17e3b892, float:1.4716123E-24)
        L_0x001d:
            X.AnonymousClass0fD.A0C(r0, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U3r.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void removeView(View view) {
        A05(view);
        super.removeView(view);
    }

    public final void removeViewAt(int i) {
        A05(getChildAt(i));
        super.removeViewAt(i);
    }

    public final void removeViewInLayout(View view) {
        A05(view);
        super.removeViewInLayout(view);
    }

    public void setBorderStyle(String str) {
        W3s.A0C(this, C13991Tnr.A0X(str));
    }

    public void setBackgroundColor(int i) {
        C13988Tno.A10(this, i);
    }

    @Deprecated(forRemoval = true, since = "0.76.0")
    public void setTranslucentBackgroundDrawable(Drawable drawable) {
        W3s.A04(drawable, this);
    }

    public void setBorderRadius(C16525UwU uwU, C18649Vw1 vw1) {
        W3s.A08(this, vw1, uwU);
    }
}
