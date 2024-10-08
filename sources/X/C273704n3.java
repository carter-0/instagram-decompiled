package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: X.4n3  reason: invalid class name and case insensitive filesystem */
public class C273704n3 extends C70682Ty {
    public Y8U A00;
    public boolean A01;
    public boolean A02;
    public int[] A03 = new int[0];
    public C246113e2[] A04 = new C246113e2[8];
    public C246113e2[] A05;
    public Drawable A06;
    public SparseArray A07;
    public Object A08;
    public final C300975yG A09 = new C300975yG(this);

    public C273704n3(Context context) {
        super(context, (AttributeSet) null);
        setClipChildren(true);
        setWillNotDraw(false);
        setChildrenDrawingOrderEnabled(true);
    }

    public static /* synthetic */ void getDescriptionOfMountedItems$annotations() {
    }

    public final void A0J() {
        this.A01 = true;
    }

    public final void A0K() {
        this.A01 = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        if (r2 > -1) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0057, code lost:
        if (r3[r2] == null) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0L(X.C246113e2 r10) {
        /*
            r9 = this;
            r5 = 0
            X.3e2[] r4 = r9.A04
            r2 = -1
            if (r4 == 0) goto L_0x0013
            r3 = 0
            int r1 = r4.length
        L_0x0008:
            if (r3 >= r1) goto L_0x0013
            r0 = r4[r3]
            boolean r0 = X.0qQ.A0K(r0, r10)
            if (r0 == 0) goto L_0x0096
            r2 = r3
        L_0x0013:
            r4 = -1
            if (r2 > r4) goto L_0x0028
            X.3e2[] r3 = r9.A05
            if (r3 == 0) goto L_0x009f
            r2 = 0
            int r1 = r3.length
        L_0x001c:
            if (r2 >= r1) goto L_0x009f
            r0 = r3[r2]
            boolean r0 = X.0qQ.A0K(r0, r10)
            if (r0 == 0) goto L_0x0093
            if (r2 <= r4) goto L_0x009f
        L_0x0028:
            r4 = 1
            com.facebook.rendercore.RenderTreeNode r0 = r10.A01
            X.2Th r0 = r0.A06
            java.lang.Integer r3 = r0.A04
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            java.lang.Object r1 = r10.A04
            if (r3 != r0) goto L_0x0073
            r0 = 13
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            r0 = 0
            r1.setCallback(r0)
            android.graphics.Rect r0 = r1.getBounds()
            r9.invalidate(r0)
        L_0x004b:
            X.3e2[] r5 = r9.A04
            X.3e2[] r3 = r9.A05
            X.0qQ.A0B(r5, r4)
            if (r3 == 0) goto L_0x0059
            r1 = r3[r2]
            r0 = 1
            if (r1 != 0) goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            r4 = 0
            if (r0 == 0) goto L_0x0070
            if (r3 == 0) goto L_0x0061
            r3[r2] = r4
        L_0x0061:
            X.3e2[] r3 = r9.A05
            if (r3 == 0) goto L_0x009a
            int r2 = r3.length
            r1 = 0
        L_0x0067:
            if (r1 >= r2) goto L_0x009a
            r0 = r3[r1]
            if (r0 != 0) goto L_0x009c
            int r1 = r1 + 1
            goto L_0x0067
        L_0x0070:
            r5[r2] = r4
            goto L_0x0061
        L_0x0073:
            java.lang.String r0 = "null cannot be cast to non-null type android.view.View"
            X.0qQ.A0C(r1, r0)
            android.view.View r1 = (android.view.View) r1
            r9.A02 = r4
            boolean r0 = r1.isPressed()
            if (r0 == 0) goto L_0x0085
            r1.setPressed(r5)
        L_0x0085:
            boolean r0 = r9.A01
            if (r0 == 0) goto L_0x008f
            super.removeViewInLayout(r1)
        L_0x008c:
            r9.A02 = r4
            goto L_0x004b
        L_0x008f:
            super.removeView(r1)
            goto L_0x008c
        L_0x0093:
            int r2 = r2 + 1
            goto L_0x001c
        L_0x0096:
            int r3 = r3 + 1
            goto L_0x0008
        L_0x009a:
            r9.A05 = r4
        L_0x009c:
            r10.A00 = r4
            return
        L_0x009f:
            java.lang.String r2 = "\n              Mount item was not found in the list of mounted items.\n              Item to remove: "
            com.facebook.rendercore.RenderTreeNode r1 = r10.A01
            r0 = 0
            java.lang.String r3 = r1.A00(r0)
            java.lang.String r4 = "\n              Mounted items: "
            X.3e2[] r0 = r9.A04
            java.lang.String r5 = A00(r0)
            java.lang.String r6 = "\n              Scraped items: "
            X.3e2[] r0 = r9.A05
            java.lang.String r7 = A00(r0)
            java.lang.String r8 = "\n              "
            java.lang.String r0 = X.002.A15(r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r1 = X.0rw.A0t(r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C273704n3.A0L(X.3e2):void");
    }

    public final void A0M(C246113e2 r6, int i) {
        Integer num = r6.A01.A06.A04;
        Integer num2 = AnonymousClass05K.A00;
        Object obj = r6.A04;
        if (num == num2) {
            0qQ.A0C(obj, AnonymousClass000.A00(13));
            Drawable drawable = (Drawable) obj;
            0qQ.A0B(drawable, 1);
            boolean z = false;
            if (getVisibility() == 0) {
                z = true;
            }
            drawable.setVisible(z, false);
            drawable.setCallback(this);
            if (drawable.isStateful()) {
                drawable.setState(getDrawableState());
            }
            invalidate(r6.A01.A03);
        } else {
            0qQ.A0C(obj, "null cannot be cast to non-null type android.view.View");
            View view = (View) obj;
            this.A02 = true;
            if (!(view instanceof C273704n3) || view.getParent() != this) {
                if (view.getLayoutParams() == null) {
                    view.setLayoutParams(generateDefaultLayoutParams());
                }
                if (this.A01) {
                    super.addViewInLayout(view, -1, view.getLayoutParams(), true);
                } else {
                    super.addView(view, -1, view.getLayoutParams());
                }
            } else {
                view.dispatchFinishTemporaryDetach();
                view.setVisibility(0);
            }
        }
        C246113e2[] r3 = this.A04;
        int length = r3.length;
        if (i >= length) {
            int i2 = length;
            do {
                i2 *= 2;
            } while (i >= i2);
            C246113e2[] r1 = new C246113e2[i2];
            System.arraycopy(r3, 0, r1, 0, length);
            this.A04 = r1;
            r3 = r1;
        }
        r3[i] = r6;
        r6.A00 = this;
    }

    public void dispatchDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        C300975yG r2 = this.A09;
        r2.A02 = canvas;
        r2.A00 = 0;
        r2.A01 = r2.A03.A04.length;
        super.dispatchDraw(canvas);
        if (r2.A02 != null && r2.A00 < r2.A01) {
            r2.A00();
        }
        r2.A02 = null;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C307026On r4;
        0qQ.A0B(motionEvent, 0);
        Y8U y8u = this.A00;
        if (!(y8u == null || (r4 = ((C22264XyZ) y8u).A00.A00) == null || !r4.A07)) {
            boolean z = true;
            if (motionEvent.getAction() == 0) {
                r4.A00 = motionEvent.getX();
                r4.A01 = motionEvent.getY();
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    r4.A02 = true;
                }
            }
            if (motionEvent.getAction() != 2 || (Math.abs(motionEvent.getX() - r4.A00) <= 10.0f && Math.abs(motionEvent.getY() - r4.A01) <= 10.0f)) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            if (valueOf != null) {
                return valueOf.booleanValue();
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.A01 = true;
        A0O(z, i, i2, i3, i4);
        this.A01 = false;
    }

    public final void requestLayout() {
        ViewParent viewParent = this;
        while (viewParent instanceof C273704n3) {
            C273704n3 r1 = (C273704n3) viewParent;
            if (!r1.A01) {
                viewParent = r1.getParent();
            } else {
                return;
            }
        }
        super.requestLayout();
    }

    public final void setViewTags(SparseArray sparseArray) {
        0qQ.A0B(sparseArray, 0);
        this.A07 = sparseArray;
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return true;
    }

    public static final String A00(C246113e2[] r6) {
        if (r6 == null) {
            return "<null>";
        }
        StringBuilder sb = new StringBuilder();
        int length = r6.length;
        for (int i = 0; i < length; i++) {
            C246113e2 r2 = r6[i];
            sb.append("Item at index: ");
            if (r2 != null) {
                sb.append(i);
                sb.append(" Type: ");
                sb.append(r2.A01.A06.A04());
                sb.append(" Position in parent: ");
                sb.append(r2.A01.A02);
            } else {
                sb.append(i);
                sb.append(" item is null");
            }
            sb.append("\n");
        }
        String obj = sb.toString();
        0qQ.A07(obj);
        return obj;
    }

    private final void setForegroundLollipop(Drawable drawable) {
        Drawable drawable2 = this.A06;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(drawable2);
            }
            this.A06 = drawable;
            if (drawable != null) {
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
            }
            invalidate();
        }
    }

    public final C246113e2 A0H(int i) {
        C246113e2 r0 = this.A04[i];
        if (r0 != null) {
            return r0;
        }
        throw new IllegalArgumentException(002.A0O("No MountItem exists at position ", i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        if (r7[r10] == null) goto L_0x004b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0N(X.C246113e2 r9, int r10, int r11) {
        /*
            r8 = this;
            java.lang.Object r6 = r9.A04
            r8.invalidate()
            com.facebook.rendercore.RenderTreeNode r0 = r9.A01
            X.2Th r0 = r0.A06
            java.lang.Integer r0 = r0.A04
            java.lang.Integer r5 = X.AnonymousClass05K.A01
            java.lang.String r4 = "null cannot be cast to non-null type android.view.View"
            if (r0 != r5) goto L_0x0020
            r0 = 1
            r8.A02 = r0
            X.0qQ.A0C(r6, r4)
            r0 = r6
            android.view.View r0 = (android.view.View) r0
            r0.cancelPendingInputEvents()
            r0.dispatchStartTemporaryDetach()
        L_0x0020:
            X.3e2[] r2 = r8.A04
            int r3 = r2.length
            if (r11 < r3) goto L_0x0033
            r0 = r3
        L_0x0026:
            int r0 = r0 * 2
            if (r11 >= r0) goto L_0x0026
            X.3e2[] r1 = new X.C246113e2[r0]
            r0 = 0
            java.lang.System.arraycopy(r2, r0, r1, r0, r3)
            r8.A04 = r1
            r2 = r1
        L_0x0033:
            r1 = r2[r11]
            if (r1 == 0) goto L_0x0042
            X.3e2[] r0 = r8.A05
            if (r0 != 0) goto L_0x0040
            int r0 = r2.length
            X.3e2[] r0 = new X.C246113e2[r0]
            r8.A05 = r0
        L_0x0040:
            r0[r11] = r1
        L_0x0042:
            X.3e2[] r7 = r8.A05
            if (r7 == 0) goto L_0x004b
            r1 = r7[r10]
            r0 = 1
            if (r1 != 0) goto L_0x004c
        L_0x004b:
            r0 = 0
        L_0x004c:
            r3 = 0
            if (r0 == 0) goto L_0x0066
            if (r7 == 0) goto L_0x0064
            r0 = r7[r10]
            r7[r10] = r3
        L_0x0055:
            r2[r11] = r0
            if (r7 == 0) goto L_0x006b
            int r2 = r7.length
            r1 = 0
        L_0x005b:
            if (r1 >= r2) goto L_0x006b
            r0 = r7[r1]
            if (r0 != 0) goto L_0x006d
            int r1 = r1 + 1
            goto L_0x005b
        L_0x0064:
            r0 = r3
            goto L_0x0055
        L_0x0066:
            r0 = r2[r10]
            r2[r10] = r3
            goto L_0x0055
        L_0x006b:
            r8.A05 = r3
        L_0x006d:
            com.facebook.rendercore.RenderTreeNode r0 = r9.A01
            X.2Th r0 = r0.A06
            java.lang.Integer r0 = r0.A04
            if (r0 != r5) goto L_0x007d
            X.0qQ.A0C(r6, r4)
            android.view.View r6 = (android.view.View) r6
            r6.dispatchFinishTemporaryDetach()
        L_0x007d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C273704n3.A0N(X.3e2, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.4n2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: X.5uS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: X.4n2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: X.4n2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: X.4n2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: X.4n2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: X.4n2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0O(boolean r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.C299025uS
            if (r0 == 0) goto L_0x0027
            r3 = r7
            X.5uS r3 = (X.C299025uS) r3
            X.3dH r0 = r3.A00
            if (r0 == 0) goto L_0x0062
            X.2UL r4 = r3.A01
            r4.A0E(r0)
            r2 = 0
        L_0x0011:
            X.3dH r1 = r3.A00
            if (r0 == r1) goto L_0x0062
            r0 = 4
            if (r2 <= r0) goto L_0x0020
            java.lang.String r1 = "RenderTreeHostView"
            java.lang.String r0 = "More than 4 recursive mount attempts. Skipping mounting the latest version."
            X.2SK.A02(r1, r0)
        L_0x001f:
            return
        L_0x0020:
            r4.A0E(r1)
            int r2 = r2 + 1
            r0 = r1
            goto L_0x0011
        L_0x0027:
            boolean r0 = r7 instanceof X.C273694n2
            if (r0 == 0) goto L_0x001f
            r3 = r7
            X.4n2 r3 = (X.C273694n2) r3
            X.TqD r5 = r3.A00
            X.6NZ r6 = r5.A00
            boolean r0 = r5.A02
            r4 = 0
            if (r0 == 0) goto L_0x0047
            if (r6 == 0) goto L_0x0047
            int r11 = r11 - r9
            int r12 = r12 - r10
            X.3bx r0 = X.C244913bx.A00
            long r1 = r0.A00(r11, r11, r12, r12)
            r0 = 0
            r6.A04(r1, r0)
            r5.A02 = r4
        L_0x0047:
            X.3dH r2 = r5.A01
            if (r2 == 0) goto L_0x0062
            X.2UL r1 = r5.A03
            r1.A0E(r2)
        L_0x0050:
            X.3dH r0 = r5.A01
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 != 0) goto L_0x0062
            r0 = 4
            if (r4 <= r0) goto L_0x0066
            java.lang.String r1 = "RootHostDelegate"
            java.lang.String r0 = "More than 4 recursive mount attempts. Skipping mounting the latest version."
            X.2SK.A02(r1, r0)
        L_0x0062:
            X.C299265uq.A00(r3)
            return
        L_0x0066:
            X.3dH r2 = r5.A01
            r1.A0E(r2)
            int r4 = r4 + 1
            goto L_0x0050
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C273704n3.A0O(boolean, int, int, int, int):void");
    }

    public final int getChildDrawingOrder(int i, int i2) {
        if (this.A02) {
            int childCount = getChildCount();
            if (this.A03.length < childCount) {
                this.A03 = new int[(childCount + 5)];
            }
            int i3 = 0;
            for (C246113e2 r2 : this.A04) {
                if (r2 != null && r2.A01.A06.A04 == AnonymousClass05K.A01) {
                    Object obj = r2.A04;
                    0qQ.A0C(obj, "null cannot be cast to non-null type android.view.View");
                    this.A03[i3] = indexOfChild((View) obj);
                    i3++;
                }
            }
            this.A02 = false;
        }
        C300975yG r22 = this.A09;
        if (r22.A02 != null && r22.A00 < r22.A01) {
            r22.A00();
        }
        return this.A03[i2];
    }

    public String getDescriptionOfMountedItems() {
        String A0u = 002.A0u("\nMounted Items", A00(this.A04), "\nScraped Items: ", A00(this.A05));
        0qQ.A07(A0u);
        return A0u;
    }

    public int getMountItemCount() {
        int i = 0;
        for (C246113e2 r0 : this.A04) {
            if (r0 != null) {
                i++;
            }
        }
        return i;
    }

    public final Object getTag(int i) {
        Object obj;
        SparseArray sparseArray = this.A07;
        if (sparseArray == null || (obj = sparseArray.get(i)) == null) {
            return super.getTag(i);
        }
        return obj;
    }

    public final void draw(Canvas canvas) {
        int A032 = AnonymousClass0fD.A03(558765593);
        0qQ.A0B(canvas, 0);
        super.draw(canvas);
        Drawable drawable = this.A06;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        AnonymousClass0fD.A0A(691222143, A032);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        for (C246113e2 r2 : this.A04) {
            if (r2 != null && r2.A01.A06.A04 == AnonymousClass05K.A00) {
                Object obj = r2.A04;
                0qQ.A0C(obj, AnonymousClass000.A00(13));
                Drawable drawable = (Drawable) obj;
                0qQ.A0B(drawable, 1);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
            }
        }
        Drawable drawable2 = this.A06;
        if (drawable2 != null) {
            drawable2.setState(getDrawableState());
        }
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        for (C246113e2 r2 : this.A04) {
            if (r2 != null && r2.A01.A06.A04 == AnonymousClass05K.A00) {
                Object obj = r2.A04;
                0qQ.A0C(obj, AnonymousClass000.A00(13));
                ((Drawable) obj).jumpToCurrentState();
            }
        }
        Drawable drawable = this.A06;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0fD.A06(1070875406);
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.A06;
        if (drawable != null) {
            drawable.setBounds(0, 0, getRight(), getBottom());
        }
        AnonymousClass0fD.A0D(-747375264, A062);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C246113e2[] r0;
        int A052 = AnonymousClass0fD.A05(24382110);
        0qQ.A0B(motionEvent, 0);
        if (isEnabled() && (r0 = this.A04) != null) {
            for (int length = r0.length - 1; -1 < length; length--) {
            }
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        AnonymousClass0fD.A0C(763570443, A052);
        return onTouchEvent;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        for (C246113e2 r2 : this.A04) {
            if (r2 != null && r2.A01.A06.A04 == AnonymousClass05K.A00) {
                Object obj = r2.A04;
                0qQ.A0C(obj, AnonymousClass000.A00(13));
                Drawable drawable = (Drawable) obj;
                boolean z = false;
                if (i == 0) {
                    z = true;
                }
                drawable.setVisible(z, false);
            }
        }
    }

    public final void setForegroundCompat(Drawable drawable) {
        setForeground(drawable);
    }

    public final void setInterceptTouchEventHandler(Y8U y8u) {
        this.A00 = y8u;
    }

    public final void setViewTag(Object obj) {
        this.A08 = obj;
    }

    public Object getTag() {
        Object obj = this.A08;
        if (obj == null) {
            return super.getTag();
        }
        return obj;
    }
}
