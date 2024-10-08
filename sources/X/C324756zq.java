package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.badge.BadgeDrawable$SavedState;
import com.google.android.material.tabs.TabLayout;
import com.instagram.android.R;
import java.lang.ref.WeakReference;

/* renamed from: X.6zq  reason: invalid class name and case insensitive filesystem */
public final class C324756zq extends LinearLayout {
    public Drawable A00;
    public View A01;
    public ImageView A02;
    public ImageView A03;
    public TextView A04;
    public TextView A05;
    public U1Y A06;
    public int A07 = 2;
    public View A08;
    public C324746zp A09;
    public final /* synthetic */ TabLayout A0A;

    public int getContentHeight() {
        int i = 0;
        View[] viewArr = {this.A05, this.A03, this.A08};
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        do {
            View view = viewArr[i];
            if (view != null && view.getVisibility() == 0) {
                if (z) {
                    i3 = Math.min(i3, view.getTop());
                    i2 = Math.max(i2, view.getBottom());
                } else {
                    i3 = view.getTop();
                    i2 = view.getBottom();
                }
                z = true;
            }
            i++;
        } while (i < 3);
        return i2 - i3;
    }

    public int getContentWidth() {
        int i = 0;
        View[] viewArr = {this.A05, this.A03, this.A08};
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        do {
            View view = viewArr[i];
            if (view != null && view.getVisibility() == 0) {
                if (z) {
                    i3 = Math.min(i3, view.getLeft());
                    i2 = Math.max(i2, view.getRight());
                } else {
                    i3 = view.getLeft();
                    i2 = view.getRight();
                }
                z = true;
            }
            i++;
        } while (i < 3);
        return i2 - i3;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C324756zq(Context context, TabLayout tabLayout) {
        super(context);
        this.A0A = tabLayout;
        A02(context, this);
        setPaddingRelative(tabLayout.A0A, tabLayout.A0B, tabLayout.A09, tabLayout.A08);
        setGravity(17);
        setOrientation(tabLayout.A0L ^ true ? 1 : 0);
        setClickable(true);
        setPointerIcon(PointerIcon.getSystemIcon(getContext(), 1002));
    }

    private void A00() {
        if (this.A06 != null) {
            setClipChildren(true);
            setClipToPadding(true);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            View view = this.A01;
            if (view != null) {
                U1Y u1y = this.A06;
                if (u1y != null) {
                    WeakReference weakReference = u1y.A07;
                    if (weakReference == null || weakReference.get() == null) {
                        view.getOverlay().remove(u1y);
                    } else {
                        ((View) weakReference.get()).setForeground((Drawable) null);
                    }
                }
                this.A01 = null;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A01() {
        /*
            r4 = this;
            X.U1Y r3 = r4.A06
            if (r3 == 0) goto L_0x005e
            android.view.View r0 = r4.A08
            if (r0 != 0) goto L_0x008b
            android.widget.ImageView r2 = r4.A03
            if (r2 == 0) goto L_0x0067
            X.6zp r0 = r4.A09
            if (r0 == 0) goto L_0x0067
            android.graphics.drawable.Drawable r0 = r0.A02
            if (r0 == 0) goto L_0x0067
            android.view.View r0 = r4.A01
            if (r0 == r2) goto L_0x0079
            r4.A00()
            android.widget.ImageView r3 = r4.A03
        L_0x001d:
            X.U1Y r0 = r4.A06
            if (r0 == 0) goto L_0x005e
            if (r3 == 0) goto L_0x005e
            r1 = 0
            r4.setClipChildren(r1)
            r4.setClipToPadding(r1)
            android.view.ViewParent r0 = r4.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto L_0x0038
            r0.setClipChildren(r1)
            r0.setClipToPadding(r1)
        L_0x0038:
            X.U1Y r2 = r4.A06
            r1 = 0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r3.getDrawingRect(r0)
            r2.setBounds(r0)
            r2.A02(r3, r1)
            java.lang.ref.WeakReference r1 = r2.A07
            if (r1 == 0) goto L_0x005f
            java.lang.Object r0 = r1.get()
            if (r0 == 0) goto L_0x005f
            java.lang.Object r0 = r1.get()
            android.view.View r0 = (android.view.View) r0
            r0.setForeground(r2)
        L_0x005c:
            r4.A01 = r3
        L_0x005e:
            return
        L_0x005f:
            android.view.ViewOverlay r0 = r3.getOverlay()
            r0.add(r2)
            goto L_0x005c
        L_0x0067:
            android.widget.TextView r2 = r4.A05
            if (r2 == 0) goto L_0x008b
            X.6zp r0 = r4.A09
            if (r0 == 0) goto L_0x008b
            android.view.View r0 = r4.A01
            if (r0 == r2) goto L_0x0079
            r4.A00()
            android.widget.TextView r3 = r4.A05
            goto L_0x001d
        L_0x0079:
            if (r2 != r0) goto L_0x005e
            r1 = 0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.getDrawingRect(r0)
            r3.setBounds(r0)
            r3.A02(r2, r1)
            return
        L_0x008b:
            r4.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C324756zq.A01():void");
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [android.graphics.drawable.RippleDrawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(android.content.Context r9, X.C324756zq r10) {
        /*
            com.google.android.material.tabs.TabLayout r4 = r10.A0A
            int r1 = r4.A0Y
            r3 = 0
            if (r1 == 0) goto L_0x009f
            X.2X8 r0 = X.2X8.A02()
            android.graphics.drawable.Drawable r0 = r0.A05(r9, r1)
            r10.A00 = r0
            if (r0 == 0) goto L_0x0022
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0022
            android.graphics.drawable.Drawable r1 = r10.A00
            int[] r0 = r10.getDrawableState()
            r1.setState(r0)
        L_0x0022:
            android.graphics.drawable.GradientDrawable r5 = new android.graphics.drawable.GradientDrawable
            r5.<init>()
            r0 = 0
            r5.setColor(r0)
            android.content.res.ColorStateList r0 = r4.A0F
            if (r0 == 0) goto L_0x0092
            android.graphics.drawable.GradientDrawable r6 = new android.graphics.drawable.GradientDrawable
            r6.<init>()
            r0 = 925353388(0x3727c5ac, float:1.0E-5)
            r6.setCornerRadius(r0)
            r0 = -1
            r6.setColor(r0)
            android.content.res.ColorStateList r9 = r4.A0F
            int[] r2 = X.C324766zr.A02
            int[] r1 = X.C324766zr.A01
            if (r9 == 0) goto L_0x009d
            int r0 = r9.getDefaultColor()
            int r1 = r9.getColorForState(r1, r0)
        L_0x004e:
            int r0 = android.graphics.Color.alpha(r1)
            int r0 = r0 * 2
            r8 = 255(0xff, float:3.57E-43)
            int r0 = java.lang.Math.min(r0, r8)
            int r7 = X.2eL.A06(r1, r0)
            int[] r0 = android.util.StateSet.NOTHING
            int[][] r2 = new int[][]{r2, r0}
            int[] r1 = X.C324766zr.A00
            if (r9 == 0) goto L_0x009b
            int r0 = r9.getDefaultColor()
            int r1 = r9.getColorForState(r1, r0)
        L_0x0070:
            int r0 = android.graphics.Color.alpha(r1)
            int r0 = r0 * 2
            int r0 = java.lang.Math.min(r0, r8)
            int r0 = X.2eL.A06(r1, r0)
            int[] r0 = new int[]{r7, r0}
            android.content.res.ColorStateList r1 = new android.content.res.ColorStateList
            r1.<init>(r2, r0)
            boolean r0 = r4.A0N
            if (r0 == 0) goto L_0x0099
            r5 = r3
        L_0x008c:
            android.graphics.drawable.RippleDrawable r0 = new android.graphics.drawable.RippleDrawable
            r0.<init>(r1, r5, r3)
            r5 = r0
        L_0x0092:
            r10.setBackground(r5)
            r4.invalidate()
            return
        L_0x0099:
            r3 = r6
            goto L_0x008c
        L_0x009b:
            r1 = 0
            goto L_0x0070
        L_0x009d:
            r1 = 0
            goto L_0x004e
        L_0x009f:
            r10.A00 = r3
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C324756zq.A02(android.content.Context, X.6zq):void");
    }

    public static void A03(ImageView imageView, TextView textView, C324756zq r9) {
        Drawable drawable;
        CharSequence charSequence;
        int i;
        Drawable drawable2;
        C324746zp r0 = r9.A09;
        CharSequence charSequence2 = null;
        if (r0 == null || (drawable2 = r0.A02) == null) {
            drawable = null;
        } else {
            drawable = drawable2.mutate();
        }
        C324746zp r02 = r9.A09;
        if (r02 != null) {
            charSequence = r02.A07;
        } else {
            charSequence = null;
        }
        if (imageView != null) {
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                r9.setVisibility(0);
            } else {
                imageView.setVisibility(8);
                imageView.setImageDrawable((Drawable) null);
            }
        }
        boolean z = !TextUtils.isEmpty(charSequence);
        if (textView != null) {
            if (z) {
                textView.setText(charSequence);
                textView.setVisibility(0);
                r9.setVisibility(0);
            } else {
                textView.setVisibility(8);
                textView.setText((CharSequence) null);
            }
        }
        if (imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            if (!z || imageView.getVisibility() != 0) {
                i = 0;
            } else {
                i = (int) C295305nv.A00(r9.getContext(), 8);
            }
            if (r9.A0A.A0L) {
                if (i != marginLayoutParams.getMarginEnd()) {
                    marginLayoutParams.setMarginEnd(i);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (i != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = i;
                marginLayoutParams.setMarginEnd(0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        C324746zp r03 = r9.A09;
        if (r03 != null) {
            charSequence2 = r03.A06;
        }
        if (!z) {
            charSequence = charSequence2;
        }
        r9.setTooltipText(charSequence);
    }

    private U1Y getBadge() {
        return this.A06;
    }

    private U1Y getOrCreateBadge() {
        FrameLayout frameLayout;
        int max;
        if (this.A06 == null) {
            Context context = getContext();
            U1Y u1y = new U1Y(context);
            TypedArray A002 = C297855sT.A00(context, (AttributeSet) null, C297865sU.A02, new int[0], R.attr.badgeStyle, 2132018505);
            int i = A002.getInt(4, 4);
            BadgeDrawable$SavedState badgeDrawable$SavedState = u1y.A0B;
            if (badgeDrawable$SavedState.A09 != i) {
                badgeDrawable$SavedState.A09 = i;
                u1y.A05 = ((int) Math.pow(10.0d, ((double) i) - 1.0d)) - 1;
                u1y.A0C.A02 = true;
                U1Y.A01(u1y);
                u1y.invalidateSelf();
            }
            if (A002.hasValue(5) && badgeDrawable$SavedState.A0A != (max = Math.max(0, A002.getInt(5, 0)))) {
                badgeDrawable$SavedState.A0A = max;
                u1y.A0C.A02 = true;
                U1Y.A01(u1y);
                u1y.invalidateSelf();
            }
            int defaultColor = C309286Xr.A01(context, A002, 0).getDefaultColor();
            badgeDrawable$SavedState.A03 = defaultColor;
            ColorStateList valueOf = ColorStateList.valueOf(defaultColor);
            C297875sV r1 = u1y.A0D;
            if (r1.A00.A0B != valueOf) {
                r1.A0F(valueOf);
                u1y.invalidateSelf();
            }
            if (A002.hasValue(2)) {
                int defaultColor2 = C309286Xr.A01(context, A002, 2).getDefaultColor();
                badgeDrawable$SavedState.A05 = defaultColor2;
                TextPaint textPaint = u1y.A0C.A04;
                if (textPaint.getColor() != defaultColor2) {
                    textPaint.setColor(defaultColor2);
                    u1y.invalidateSelf();
                }
            }
            int i2 = A002.getInt(1, 8388661);
            if (badgeDrawable$SavedState.A04 != i2) {
                badgeDrawable$SavedState.A04 = i2;
                WeakReference weakReference = u1y.A06;
                if (!(weakReference == null || weakReference.get() == null)) {
                    View view = (View) weakReference.get();
                    WeakReference weakReference2 = u1y.A07;
                    if (weakReference2 != null) {
                        frameLayout = (FrameLayout) weakReference2.get();
                    } else {
                        frameLayout = null;
                    }
                    u1y.A02(view, frameLayout);
                }
            }
            badgeDrawable$SavedState.A08 = A002.getDimensionPixelOffset(3, 0);
            U1Y.A01(u1y);
            badgeDrawable$SavedState.A0B = A002.getDimensionPixelOffset(6, 0);
            U1Y.A01(u1y);
            A002.recycle();
            this.A06 = u1y;
        }
        A01();
        U1Y u1y2 = this.A06;
        if (u1y2 != null) {
            return u1y2;
        }
        throw new IllegalStateException("Unable to create badge");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f8, code lost:
        if (r2 != r3.A01) goto L_0x00fa;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04() {
        /*
            r5 = this;
            X.6zp r3 = r5.A09
            r1 = 0
            if (r3 == 0) goto L_0x0109
            android.view.View r4 = r3.A03
            if (r4 == 0) goto L_0x0109
            android.view.ViewParent r0 = r4.getParent()
            if (r0 == r5) goto L_0x0019
            if (r0 == 0) goto L_0x0016
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeView(r4)
        L_0x0016:
            r5.addView(r4)
        L_0x0019:
            r5.A08 = r4
            android.widget.TextView r0 = r5.A05
            r2 = 8
            if (r0 == 0) goto L_0x0024
            r0.setVisibility(r2)
        L_0x0024:
            android.widget.ImageView r0 = r5.A03
            if (r0 == 0) goto L_0x0030
            r0.setVisibility(r2)
            android.widget.ImageView r0 = r5.A03
            r0.setImageDrawable(r1)
        L_0x0030:
            r0 = 16908308(0x1020014, float:2.3877285E-38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.A04 = r0
            if (r0 == 0) goto L_0x0043
            int r0 = r0.getMaxLines()
            r5.A07 = r0
        L_0x0043:
            r0 = 16908294(0x1020006, float:2.3877246E-38)
            android.view.View r1 = r4.findViewById(r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
        L_0x004c:
            r5.A02 = r1
            android.view.View r0 = r5.A08
            if (r0 != 0) goto L_0x00ff
            android.widget.ImageView r0 = r5.A03
            if (r0 != 0) goto L_0x006d
            r2 = 0
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131624804(0x7f0e0364, float:1.8876798E38)
            android.view.View r0 = r1.inflate(r0, r5, r2)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r5.A03 = r0
            r5.addView(r0, r2)
        L_0x006d:
            if (r3 == 0) goto L_0x0087
            android.graphics.drawable.Drawable r0 = r3.A02
            if (r0 == 0) goto L_0x0087
            android.graphics.drawable.Drawable r2 = r0.mutate()
            if (r2 == 0) goto L_0x0087
            com.google.android.material.tabs.TabLayout r1 = r5.A0A
            android.content.res.ColorStateList r0 = r1.A0E
            r2.setTintList(r0)
            android.graphics.PorterDuff$Mode r0 = r1.A0H
            if (r0 == 0) goto L_0x0087
            r2.setTintMode(r0)
        L_0x0087:
            android.widget.TextView r0 = r5.A05
            if (r0 != 0) goto L_0x00aa
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r1 = 2131624805(0x7f0e0365, float:1.88768E38)
            r0 = 0
            android.view.View r0 = r2.inflate(r1, r5, r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.A05 = r0
            r5.addView(r0)
            android.widget.TextView r0 = r5.A05
            int r0 = r0.getMaxLines()
            r5.A07 = r0
        L_0x00aa:
            android.widget.TextView r2 = r5.A05
            com.google.android.material.tabs.TabLayout r1 = r5.A0A
            int r0 = r1.A0D
            r2.setTextAppearance(r0)
            android.content.res.ColorStateList r1 = r1.A0G
            if (r1 == 0) goto L_0x00bc
            android.widget.TextView r0 = r5.A05
            r0.setTextColor(r1)
        L_0x00bc:
            android.widget.TextView r1 = r5.A05
            android.widget.ImageView r0 = r5.A03
            A03(r0, r1, r5)
            r5.A01()
            android.widget.ImageView r1 = r5.A03
            if (r1 == 0) goto L_0x00d2
            X.6zs r0 = new X.6zs
            r0.<init>(r1, r5)
            r1.addOnLayoutChangeListener(r0)
        L_0x00d2:
            android.widget.TextView r1 = r5.A05
            if (r1 == 0) goto L_0x00de
            X.6zs r0 = new X.6zs
            r0.<init>(r1, r5)
            r1.addOnLayoutChangeListener(r0)
        L_0x00de:
            if (r3 == 0) goto L_0x00fa
            java.lang.CharSequence r0 = r3.A06
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00ed
            java.lang.CharSequence r0 = r3.A06
            r5.setContentDescription(r0)
        L_0x00ed:
            com.google.android.material.tabs.TabLayout r0 = r3.A05
            if (r0 == 0) goto L_0x0116
            int r2 = r0.getSelectedTabPosition()
            int r1 = r3.A01
            r0 = 1
            if (r2 == r1) goto L_0x00fb
        L_0x00fa:
            r0 = 0
        L_0x00fb:
            r5.setSelected(r0)
            return
        L_0x00ff:
            android.widget.TextView r0 = r5.A04
            if (r0 != 0) goto L_0x0105
            if (r1 == 0) goto L_0x00de
        L_0x0105:
            A03(r1, r0, r5)
            goto L_0x00de
        L_0x0109:
            android.view.View r0 = r5.A08
            if (r0 == 0) goto L_0x0112
            r5.removeView(r0)
            r5.A08 = r1
        L_0x0112:
            r5.A04 = r1
            goto L_0x004c
        L_0x0116:
            java.lang.String r1 = "Tab not attached to a TabLayout"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C324756zq.A04():void");
    }

    public C324746zp getTab() {
        return this.A09;
    }

    public void setTab(C324746zp r2) {
        if (r2 != this.A09) {
            this.A09 = r2;
            A04();
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.A00;
        if (drawable != null && drawable.isStateful() && this.A00.setState(drawableState)) {
            invalidate();
            this.A0A.invalidate();
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        Context context;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        U1Y u1y = this.A06;
        if (u1y != null && u1y.isVisible()) {
            CharSequence contentDescription = getContentDescription();
            StringBuilder sb = new StringBuilder();
            sb.append(contentDescription);
            sb.append(", ");
            U1Y u1y2 = this.A06;
            Object obj = null;
            if (u1y2.isVisible()) {
                BadgeDrawable$SavedState badgeDrawable$SavedState = u1y2.A0B;
                int i = badgeDrawable$SavedState.A0A;
                if (i != -1) {
                    int i2 = badgeDrawable$SavedState.A07;
                    if (i2 > 0 && (context = (Context) u1y2.A0E.get()) != null) {
                        int i3 = u1y2.A05;
                        if (i <= i3) {
                            Resources resources = context.getResources();
                            int i4 = badgeDrawable$SavedState.A0A;
                            int i5 = 0;
                            if (i4 != -1) {
                                i5 = i4;
                            }
                            obj = resources.getQuantityString(i2, i5, new Object[]{Integer.valueOf(i5)});
                        } else {
                            obj = context.getString(badgeDrawable$SavedState.A06, new Object[]{Integer.valueOf(i3)});
                        }
                    }
                } else {
                    obj = badgeDrawable$SavedState.A0C;
                }
            }
            sb.append(obj);
            accessibilityNodeInfo.setContentDescription(sb.toString());
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(accessibilityNodeInfo);
        accessibilityNodeInfoCompat.mInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, this.A09.A01, 1, false, isSelected()));
        if (isSelected()) {
            accessibilityNodeInfoCompat.setClickable(false);
            accessibilityNodeInfoCompat.removeAction(04x.A08);
        }
        accessibilityNodeInfoCompat.setRoleDescription(getResources().getString(2131964518));
    }

    public final void onMeasure(int i, int i2) {
        Layout layout;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        TabLayout tabLayout = this.A0A;
        int i3 = tabLayout.A07;
        if (i3 > 0 && (mode == 0 || size > i3)) {
            i = View.MeasureSpec.makeMeasureSpec(i3, AnonymousClass972.MUTABLE_FLAG_MASK);
        }
        super.onMeasure(i, i2);
        if (this.A05 != null) {
            float f = tabLayout.A01;
            int i4 = this.A07;
            ImageView imageView = this.A03;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.A05;
                if (textView != null && textView.getLineCount() > 1) {
                    f = tabLayout.A00;
                }
            } else {
                i4 = 1;
            }
            float textSize = this.A05.getTextSize();
            int lineCount = this.A05.getLineCount();
            int maxLines = this.A05.getMaxLines();
            if (f == textSize && (maxLines < 0 || i4 == maxLines)) {
                return;
            }
            if (tabLayout.A02 != 1 || f <= textSize || lineCount != 1 || ((layout = this.A05.getLayout()) != null && layout.getLineWidth(0) * (f / layout.getPaint().getTextSize()) <= ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())))) {
                this.A05.setTextSize(0, f);
                this.A05.setMaxLines(i4);
                super.onMeasure(i, i2);
            }
        }
    }

    public final boolean performClick() {
        boolean performClick = super.performClick();
        if (this.A09 == null) {
            return performClick;
        }
        if (!performClick) {
            playSoundEffect(0);
        }
        this.A09.A01();
        return true;
    }

    public void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        TextView textView = this.A05;
        if (textView != null) {
            textView.setSelected(z);
        }
        ImageView imageView = this.A03;
        if (imageView != null) {
            imageView.setSelected(z);
        }
        View view = this.A08;
        if (view != null) {
            view.setSelected(z);
        }
    }
}
