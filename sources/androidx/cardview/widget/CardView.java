package androidx.cardview.widget;

import X.C2805552m;
import X.C2805652n;
import X.C2805752o;
import X.C2805852p;
import X.C2805952q;
import X.C2806052r;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.instagram.android.R;

public class CardView extends FrameLayout {
    public static final C2805652n A05 = new Object();
    public static final int[] A06 = {16842801};
    public boolean A00;
    public boolean A01;
    public final Rect A02;
    public final Rect A03;
    public final C2805852p A04;

    public CardView(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public ColorStateList getCardBackgroundColor() {
        return ((C2806052r) ((C2805752o) this.A04).A00).A02;
    }

    public float getCardElevation() {
        return ((C2805752o) this.A04).A01.getElevation();
    }

    public int getContentPaddingBottom() {
        return this.A02.bottom;
    }

    public int getContentPaddingLeft() {
        return this.A02.left;
    }

    public int getContentPaddingRight() {
        return this.A02.right;
    }

    public int getContentPaddingTop() {
        return this.A02.top;
    }

    public float getMaxCardElevation() {
        return ((C2806052r) ((C2805752o) this.A04).A00).A00;
    }

    public boolean getPreventCornerOverlap() {
        return this.A01;
    }

    public float getRadius() {
        return ((C2806052r) ((C2805752o) this.A04).A00).A01;
    }

    public boolean getUseCompatPadding() {
        return this.A00;
    }

    public void setCardBackgroundColor(int i) {
        A05.EPU(ColorStateList.valueOf(i), this.A04);
    }

    public void setCardElevation(float f) {
        ((C2805752o) this.A04).A01.setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        A05.Ecn(this.A04, f);
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.A01) {
            this.A01 = z;
            C2805652n r2 = A05;
            C2805852p r1 = this.A04;
            ((C2805552m) r2).Ecn(r1, ((C2806052r) ((C2805752o) r1).A00).A00);
        }
    }

    public void setRadius(float f) {
        C2806052r r1 = (C2806052r) ((C2805752o) this.A04).A00;
        if (f != r1.A01) {
            r1.A01 = f;
            C2806052r.A00((Rect) null, r1);
            r1.invalidateSelf();
        }
    }

    public void setUseCompatPadding(boolean z) {
        if (this.A00 != z) {
            this.A00 = z;
            C2805652n r2 = A05;
            C2805852p r1 = this.A04;
            ((C2805552m) r2).Ecn(r1, ((C2806052r) ((C2805752o) r1).A00).A00);
        }
    }

    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.A02 = rect;
        this.A03 = new Rect();
        C2805752o r3 = new C2805752o(this);
        this.A04 = r3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2805952q.A00, i, R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(A06);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            valueOf = ColorStateList.valueOf(getResources().getColor(fArr[2] > 0.5f ? R.color.abc_decor_view_status_guard_light : R.color.cardview_dark_background));
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.A00 = obtainStyledAttributes.getBoolean(7, false);
        this.A01 = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        C2806052r r1 = new C2806052r(valueOf, dimension);
        r3.A00 = r1;
        CardView cardView = r3.A01;
        cardView.setBackgroundDrawable(r1);
        cardView.setClipToOutline(true);
        cardView.setElevation(dimension2);
        ((C2805552m) A05).Ecn(r3, dimension3);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        A05.EPU(colorStateList, this.A04);
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.cardViewStyle);
    }
}
