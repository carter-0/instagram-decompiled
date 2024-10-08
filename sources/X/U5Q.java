package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.instagram.android.R;

public class U5Q extends ListView {
    public int A00;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 0;
    public int A04 = 0;
    public C19890WhL A05;
    public boolean A06;
    public boolean A07;
    public U1G A08;
    public WC4 A09;
    public boolean A0A;
    public final Rect A0B = new Rect();

    private void setSelectorEnabled(boolean z) {
        U1G u1g = this.A08;
        if (u1g != null) {
            u1g.A01 = z;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r14 != 3) goto L_0x0011;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01(android.view.MotionEvent r18, int r19) {
        /*
            r17 = this;
            r11 = r18
            int r14 = r11.getActionMasked()
            r10 = 1
            r12 = r17
            if (r14 == r10) goto L_0x0025
            r0 = 2
            if (r14 == r0) goto L_0x0023
            r0 = 3
            if (r14 == r0) goto L_0x0122
        L_0x0011:
            r3 = 1
        L_0x0012:
            X.WC4 r0 = r12.A09
            if (r0 != 0) goto L_0x001d
            X.WC4 r0 = new X.WC4
            r0.<init>(r12)
            r12.A09 = r0
        L_0x001d:
            r0.A04 = r10
            r0.onTouch(r12, r11)
        L_0x0022:
            return r3
        L_0x0023:
            r3 = 1
            goto L_0x0026
        L_0x0025:
            r3 = 0
        L_0x0026:
            r0 = r19
            int r1 = r11.findPointerIndex(r0)
            if (r1 < 0) goto L_0x0122
            float r0 = r11.getX(r1)
            int r2 = (int) r0
            float r0 = r11.getY(r1)
            int r0 = (int) r0
            int r9 = r12.pointToPosition(r2, r0)
            r1 = -1
            if (r9 == r1) goto L_0x0123
            android.view.View r8 = X.C13989Tnp.A0O(r12, r9)
            float r13 = (float) r2
            float r7 = (float) r0
            r12.A06 = r10
            r12.drawableHotspotChanged(r13, r7)
            boolean r0 = r12.isPressed()
            if (r0 != 0) goto L_0x0053
            r12.setPressed(r10)
        L_0x0053:
            r12.layoutChildren()
            int r0 = r12.A00
            r6 = 0
            if (r0 == r1) goto L_0x006c
            android.view.View r1 = X.C13989Tnp.A0O(r12, r0)
            if (r1 == 0) goto L_0x006c
            if (r1 == r8) goto L_0x006c
            boolean r0 = r1.isPressed()
            if (r0 == 0) goto L_0x006c
            r1.setPressed(r6)
        L_0x006c:
            r12.A00 = r9
            int r0 = r8.getLeft()
            float r0 = (float) r0
            float r1 = r13 - r0
            int r0 = r8.getTop()
            float r0 = (float) r0
            float r0 = r7 - r0
            r8.drawableHotspotChanged(r1, r0)
            boolean r0 = r8.isPressed()
            if (r0 != 0) goto L_0x0088
            r8.setPressed(r10)
        L_0x0088:
            android.graphics.drawable.Drawable r5 = r12.getSelector()
            r4 = 1
            r16 = 0
            if (r5 == 0) goto L_0x0096
            r16 = 1
            r5.setVisible(r6, r6)
        L_0x0096:
            android.graphics.Rect r3 = r12.A0B
            X.C13992Tns.A0b(r8, r3)
            int r1 = r3.left
            int r0 = r12.A02
            int r1 = r1 - r0
            r3.left = r1
            int r1 = r3.top
            int r0 = r12.A04
            int r1 = r1 - r0
            r3.top = r1
            int r1 = r3.right
            int r0 = r12.A03
            int r1 = r1 + r0
            r3.right = r1
            int r1 = r3.bottom
            int r0 = r12.A01
            int r1 = r1 + r0
            r3.bottom = r1
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r2 < r1) goto L_0x0113
            boolean r0 = X.C18082VlC.A01(r12)
        L_0x00c1:
            boolean r15 = r8.isEnabled()
            if (r15 == r0) goto L_0x00d1
            r0 = r0 ^ 1
            if (r2 < r1) goto L_0x0102
            X.C18082VlC.A00(r12, r0)
        L_0x00ce:
            r12.refreshDrawableState()
        L_0x00d1:
            if (r16 == 0) goto L_0x00e8
            float r2 = r3.exactCenterX()
            float r1 = r3.exactCenterY()
            int r0 = r12.getVisibility()
            if (r0 == 0) goto L_0x00e2
            r4 = 0
        L_0x00e2:
            r5.setVisible(r4, r6)
            r5.setHotspot(r2, r1)
        L_0x00e8:
            android.graphics.drawable.Drawable r0 = r12.getSelector()
            if (r0 == 0) goto L_0x00f1
            r0.setHotspot(r13, r7)
        L_0x00f1:
            r12.setSelectorEnabled(r6)
            r12.refreshDrawableState()
            if (r14 != r10) goto L_0x0011
            long r0 = r12.getItemIdAtPosition(r9)
            r12.performItemClick(r8, r9, r0)
            goto L_0x0011
        L_0x0102:
            java.lang.reflect.Field r1 = X.VJF.A00
            if (r1 == 0) goto L_0x00ce
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalAccessException -> 0x010e }
            r1.set(r12, r0)     // Catch:{ IllegalAccessException -> 0x010e }
            goto L_0x00ce
        L_0x010e:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x00ce
        L_0x0113:
            java.lang.reflect.Field r0 = X.VJF.A00
            if (r0 == 0) goto L_0x0120
            boolean r0 = r0.getBoolean(r12)     // Catch:{ IllegalAccessException -> 0x011c }
            goto L_0x00c1
        L_0x011c:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0120:
            r0 = 0
            goto L_0x00c1
        L_0x0122:
            r3 = 0
        L_0x0123:
            r2 = 0
            r12.A06 = r2
            r12.setPressed(r2)
            r12.drawableStateChanged()
            int r0 = r12.A00
            android.view.View r0 = X.C13989Tnp.A0O(r12, r0)
            if (r0 == 0) goto L_0x0137
            r0.setPressed(r2)
        L_0x0137:
            if (r3 != 0) goto L_0x0012
            X.WC4 r1 = r12.A09
            if (r1 == 0) goto L_0x0022
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x0144
            X.WC4.A01(r1)
        L_0x0144:
            r1.A04 = r2
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U5Q.A01(android.view.MotionEvent, int):boolean");
    }

    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.A0B;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    public final void drawableStateChanged() {
        if (this.A05 == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            Drawable selector = getSelector();
            if (selector != null && this.A06 && isPressed()) {
                C13988Tno.A0x(selector, this);
            }
        }
    }

    public final boolean hasFocus() {
        if (this.A0A || super.hasFocus()) {
            return true;
        }
        return false;
    }

    public final boolean hasWindowFocus() {
        if (this.A0A || super.hasWindowFocus()) {
            return true;
        }
        return false;
    }

    public final boolean isFocused() {
        if (this.A0A || super.isFocused()) {
            return true;
        }
        return false;
    }

    public final boolean isInTouchMode() {
        if ((!this.A0A || !this.A07) && !super.isInTouchMode()) {
            return false;
        }
        return true;
    }

    public void setListSelectionHidden(boolean z) {
        this.A07 = z;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [android.graphics.drawable.Drawable$Callback, X.U1G, android.graphics.drawable.Drawable] */
    public void setSelector(Drawable drawable) {
        U1G u1g;
        if (drawable != null) {
            ? drawable2 = new Drawable();
            C13989Tnp.A14(drawable2.A00);
            drawable2.A00 = drawable;
            drawable.setCallback(drawable2);
            drawable2.A01 = true;
            u1g = drawable2;
        } else {
            u1g = null;
        }
        this.A08 = u1g;
        super.setSelector(u1g);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.A02 = rect.left;
        this.A04 = rect.top;
        this.A03 = rect.right;
        this.A01 = rect.bottom;
    }

    public U5Q(Context context, boolean z) {
        super(context, (AttributeSet) null, R.attr.dropDownListViewStyle);
        this.A0A = z;
        setCacheColorHint(0);
    }

    public final int A00(int i, int i2) {
        int makeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i3 = listPaddingTop + listPaddingBottom;
        if (adapter != null) {
            if (dividerHeight <= 0 || divider == null) {
                dividerHeight = 0;
            }
            int count = adapter.getCount();
            View view = null;
            int i4 = 0;
            for (int i5 = 0; i5 < count; i5++) {
                int itemViewType = adapter.getItemViewType(i5);
                if (itemViewType != i4) {
                    view = null;
                    i4 = itemViewType;
                }
                view = adapter.getView(i5, view, this);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = generateDefaultLayoutParams();
                    view.setLayoutParams(layoutParams);
                }
                int i6 = layoutParams.height;
                if (i6 > 0) {
                    makeMeasureSpec = C13988Tno.A04(i6);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                }
                view.measure(i, makeMeasureSpec);
                view.forceLayout();
                if (i5 > 0) {
                    i3 += dividerHeight;
                }
                i3 += view.getMeasuredHeight();
                if (i3 >= i2) {
                    return i2;
                }
            }
        }
        return i3;
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(1921099090);
        this.A05 = null;
        super.onDetachedFromWindow();
        AnonymousClass0fD.A0D(1743956562, A062);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.A05 == null) {
            C19890WhL whL = new C19890WhL(this);
            this.A05 = whL;
            whL.A00.post(whL);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View A0O = C13989Tnp.A0O(this, pointToPosition);
                if (A0O.isEnabled()) {
                    requestFocus();
                    if (Build.VERSION.SDK_INT < 30 || !C18721Vyv.A01()) {
                        setSelectionFromTop(pointToPosition, A0O.getTop() - getTop());
                    } else {
                        C18721Vyv.A00(A0O, this, pointToPosition);
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.A06 && isPressed()) {
                    C13988Tno.A0x(selector, this);
                    return onHoverEvent;
                }
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int A052 = AnonymousClass0fD.A05(-1984569987);
        if (motionEvent.getAction() == 0) {
            this.A00 = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        C19890WhL whL = this.A05;
        if (whL != null) {
            U5Q u5q = whL.A00;
            u5q.A05 = null;
            u5q.removeCallbacks(whL);
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        AnonymousClass0fD.A0C(562774048, A052);
        return onTouchEvent;
    }
}
