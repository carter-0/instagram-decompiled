package com.google.android.material.timepicker;

import X.02K;
import X.02Z;
import X.03v;
import X.AnonymousClass0fD;
import X.C13988Tno;
import X.C19973Wik;
import X.C270354gb;
import X.C297865sU;
import X.C297875sV;
import X.C297895sX;
import X.C309286Xr;
import X.C320086rk;
import X.C324126yg;
import X.C324136yh;
import X.DbV;
import X.JTP;
import X.JTQ;
import X.U7M;
import X.WCE;
import X.X1D;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import java.util.Arrays;

public class ClockFaceView extends ConstraintLayout implements X1D {
    public float A00;
    public int A01;
    public C297875sV A02;
    public String[] A03;
    public final int A04;
    public final ColorStateList A05;
    public final RectF A06;
    public final SparseArray A07;
    public final 02Z A08;
    public final ClockHandView A09;
    public final Runnable A0A;
    public final float[] A0B;
    public final int[] A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final Rect A0G;

    public ClockFaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        C297875sV r3 = new C297875sV();
        this.A02 = r3;
        C324136yh r2 = new C324136yh(0.5f);
        C324126yg r1 = new C324126yg(r3.A00.A0K);
        r1.A02 = r2;
        r1.A03 = r2;
        r1.A01 = r2;
        r1.A00 = r2;
        r3.setShapeAppearanceModel(new C297895sX(r1));
        this.A02.A0F(ColorStateList.valueOf(-1));
        setBackground(this.A02);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C297865sU.A0U, i, 0);
        this.A01 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.A0A = new C19973Wik(this);
        obtainStyledAttributes.recycle();
        this.A0G = new Rect();
        this.A06 = new RectF();
        this.A07 = new SparseArray();
        this.A0B = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C297865sU.A09, i, 2132018570);
        Resources resources = getResources();
        ColorStateList A012 = C309286Xr.A01(context, obtainStyledAttributes2, 1);
        this.A05 = A012;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.A09 = clockHandView;
        this.A04 = JTP.A03(resources);
        int colorForState = A012.getColorForState(new int[]{16842913}, A012.getDefaultColor());
        this.A0C = new int[]{colorForState, colorForState, A012.getDefaultColor()};
        clockHandView.A09.add(this);
        int defaultColor = 02K.A02(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList A013 = C309286Xr.A01(context, obtainStyledAttributes2, 0);
        setBackgroundColor(A013 != null ? A013.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new WCE(this, 0));
        setFocusable(true);
        obtainStyledAttributes2.recycle();
        this.A08 = new U7M(this, 4);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.A03 = strArr;
        LayoutInflater A0D2 = DbV.A0D(this);
        SparseArray sparseArray = this.A07;
        int size = sparseArray.size();
        int i2 = 0;
        while (true) {
            int length = this.A03.length;
            if (i2 < Math.max(length, size)) {
                TextView textView = (TextView) sparseArray.get(i2);
                if (i2 >= length) {
                    removeView(textView);
                    sparseArray.remove(i2);
                } else {
                    if (textView == null) {
                        textView = (TextView) A0D2.inflate(R.layout.material_clockface_textview, this, false);
                        sparseArray.put(i2, textView);
                        addView(textView);
                    }
                    textView.setVisibility(0);
                    textView.setText(this.A03[i2]);
                    textView.setTag(R.id.material_value_index, Integer.valueOf(i2));
                    03v.A0B(textView, this.A08);
                    textView.setTextColor(this.A05);
                }
                i2++;
            } else {
                this.A0E = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
                this.A0F = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
                this.A0D = resources.getDimensionPixelSize(R.dimen.direct_clips_stacks_message_height);
                return;
            }
        }
    }

    public static void A00(ClockFaceView clockFaceView) {
        RadialGradient radialGradient;
        RectF rectF = clockFaceView.A09.A08;
        int i = 0;
        while (true) {
            SparseArray sparseArray = clockFaceView.A07;
            if (i < sparseArray.size()) {
                TextView textView = (TextView) sparseArray.get(i);
                if (textView != null) {
                    Rect rect = clockFaceView.A0G;
                    textView.getDrawingRect(rect);
                    rect.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                    clockFaceView.offsetDescendantRectToMyCoords(textView, rect);
                    RectF rectF2 = clockFaceView.A06;
                    rectF2.set(rect);
                    if (!RectF.intersects(rectF, rectF2)) {
                        radialGradient = null;
                    } else {
                        radialGradient = new RadialGradient(rectF.centerX() - rectF2.left, rectF.centerY() - rectF2.top, rectF.width() * 0.5f, clockFaceView.A0C, clockFaceView.A0B, Shader.TileMode.CLAMP);
                    }
                    textView.getPaint().setShader(radialGradient);
                    textView.invalidate();
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final void setBackgroundColor(int i) {
        this.A02.A0F(ColorStateList.valueOf(i));
    }

    public final void A0D() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            if ("skip".equals(getChildAt(i2).getTag())) {
                i++;
            }
        }
        C270354gb A0C2 = JTQ.A0C(this);
        float f = 0.0f;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int id = childAt.getId();
                int i4 = this.A01;
                C320086rk r0 = C270354gb.A02(A0C2, id).A03;
                r0.A0F = R.id.circle_center;
                r0.A0G = i4;
                r0.A00 = f;
                f += 360.0f / ((float) (childCount - i));
            }
        }
        A0C2.A0G(this);
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            JTP.A13(view);
        }
        Handler handler = getHandler();
        if (handler != null) {
            Runnable runnable = this.A0A;
            handler.removeCallbacks(runnable);
            handler.post(runnable);
        }
    }

    public final void onFinishInflate() {
        int A062 = AnonymousClass0fD.A06(2057602936);
        super.onFinishInflate();
        A0D();
        AnonymousClass0fD.A0D(-1193058468, A062);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.A03.length, false, 1));
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        A00(this);
    }

    public final void onMeasure(int i, int i2) {
        DisplayMetrics A0F2 = C13988Tno.A0F(this);
        int max = (int) (((float) this.A0D) / Math.max(Math.max(((float) this.A0E) / ((float) A0F2.heightPixels), ((float) this.A0F) / ((float) A0F2.widthPixels)), 1.0f));
        int A042 = C13988Tno.A04(max);
        setMeasuredDimension(max, max);
        super.onMeasure(A042, A042);
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            Runnable runnable = this.A0A;
            handler.removeCallbacks(runnable);
            handler.post(runnable);
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialClockStyle);
    }

    public ClockFaceView(Context context) {
        this(context, (AttributeSet) null);
    }
}
