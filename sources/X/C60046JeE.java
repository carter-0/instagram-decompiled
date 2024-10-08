package X;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: X.JeE  reason: case insensitive filesystem */
public abstract class C60046JeE extends ViewGroup {
    public int A00 = -1;
    public AnonymousClass3W1 A01;
    public LPG A02;
    public AnonymousClass3ZT A03;
    public boolean A04 = true;

    public C60046JeE(Context context) {
        super(context, (AttributeSet) null, 0);
    }

    public static 0rN A00(Layout.Alignment alignment, TextView textView) {
        return new 0rN(alignment, textView.getPaint(), (String) null, textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier(), textView.getMaxWidth(), textView.getIncludeFontPadding());
    }

    public abstract String getTaggedId();

    public abstract CharSequence getText();

    public abstract 0rN getTextLayoutParams();

    public abstract int getTextLineHeight();

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public final void onMeasure(int i, int i2) {
        PointF pointF;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            getChildAt(i3).measure(0, 0);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        LPG A012 = A01(this);
        C60046JeE jeE = A012.A0I;
        int measuredWidth = jeE.getMeasuredWidth();
        int measuredHeight = jeE.getMeasuredHeight();
        if ((A012.A01 != measuredWidth || A012.A00 != measuredHeight) && measuredWidth != 0 && measuredHeight != 0 && (pointF = A012.A06) != null) {
            A012.A01 = measuredWidth;
            A012.A00 = measuredHeight;
            PointF pointF2 = new PointF();
            pointF2.x = pointF.x * ((float) A012.A01);
            pointF2.y = pointF.y * ((float) A012.A00);
            A012.A04(pointF2);
        }
    }

    public static LPG A01(C60046JeE jeE) {
        LPG lpg = jeE.A02;
        17k.A07(lpg, "mTagViewDelegate not initialized");
        return lpg;
    }

    public final void A04() {
        int i;
        if (!(this instanceof C62106KaD)) {
            LPG A012 = A01(this);
            ImageView imageView = A012.A02;
            if (imageView == null || imageView.getVisibility() != 0) {
                imageView = LPG.A00(A012);
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    public final boolean A07() {
        ImageView imageView;
        if ((this instanceof C62106KaD) || (imageView = A01(this).A02) == null || imageView.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Deprecated
    public final 1Xj getMedia() {
        AnonymousClass3ZT r0 = this.A03;
        if (r0 != null) {
            return r0.A00();
        }
        return null;
    }

    public final LPG A03() {
        return A01(this);
    }

    public final void A05() {
        int measuredWidth;
        int i;
        int i2;
        int measuredHeight;
        LPG A012 = A01(this);
        Rect rect = A012.A09;
        Rect rect2 = A012.A08;
        rect.set(rect2);
        ViewGroup viewGroup = A012.A0C;
        Rect rect3 = new Rect(0, 0, viewGroup.getMeasuredWidth(), viewGroup.getMeasuredHeight());
        int A042 = JTP.A04(A012.A05);
        ImageView imageView = A012.A02;
        if (imageView != null && imageView.getVisibility() == 0) {
            rect.top -= A042;
            rect3.top += A042;
            rect3.bottom += A042;
            if (rect2.right + A042 > A012.A0I.getMeasuredWidth()) {
                rect.left -= A042;
                rect3.left += A042;
                rect3.right += A042;
            } else {
                rect.right += A042;
            }
        }
        ImageView imageView2 = A012.A0E;
        if (imageView2.getVisibility() == 0) {
            int measuredHeight2 = rect.top - imageView2.getMeasuredHeight();
            rect.top = measuredHeight2;
            A012.A0I.layout(rect.left, measuredHeight2, rect.right, rect.bottom);
            int measuredWidth2 = imageView2.getMeasuredWidth() / 2;
            PointF A013 = A012.A01();
            int i3 = (int) A013.x;
            int i4 = (int) A013.y;
            imageView2.layout(i3 - measuredWidth2, i4, i3 + measuredWidth2, imageView2.getMeasuredHeight() + i4);
            rect3.top += imageView2.getMeasuredHeight();
            rect3.bottom += imageView2.getMeasuredHeight();
        } else {
            ImageView imageView3 = A012.A0D;
            if (imageView3.getVisibility() == 0) {
                int measuredHeight3 = rect.bottom + imageView3.getMeasuredHeight();
                rect.bottom = measuredHeight3;
                A012.A0I.layout(rect.left, rect.top, rect.right, measuredHeight3);
                int measuredWidth3 = imageView3.getMeasuredWidth() / 2;
                PointF A014 = A012.A01();
                imageView3.layout(((int) A014.x) - measuredWidth3, ((int) A014.y) - imageView3.getMeasuredHeight(), ((int) A014.x) + measuredWidth3, (int) A014.y);
            }
        }
        viewGroup.layout(rect3.left, rect3.top, rect3.right, rect3.bottom);
        ImageView imageView4 = A012.A02;
        if (imageView4 != null && imageView4.getVisibility() == 0) {
            ImageView A002 = LPG.A00(A012);
            if (rect2.right + A042 > A012.A0I.getMeasuredWidth()) {
                measuredWidth = 0;
                i = rect3.top - A042;
                i2 = A002.getMeasuredWidth();
                measuredHeight = (rect3.top - A042) + A002.getMeasuredHeight();
            } else {
                measuredWidth = (rect3.right + A042) - A002.getMeasuredWidth();
                i = rect3.top - A042;
                i2 = rect3.right + A042;
                measuredHeight = i + A002.getMeasuredHeight();
            }
            A002.layout(measuredWidth, i, i2, measuredHeight);
        }
    }

    public void A06(CharSequence charSequence, int i) {
        LPG A012 = A01(this);
        TextView textView = A012.A0F;
        DbT.A17(textView.getContext(), textView, i);
        textView.setText(charSequence);
        textView.measure(0, 0);
        A012.A02();
    }

    public PointF getAbsoluteTagPosition() {
        return A01(this).A07;
    }

    public int getBubbleWidth() {
        return A01(this).A0A.width();
    }

    public Rect getDrawingBounds() {
        return A01(this).A08;
    }

    public PointF getNormalizedPosition() {
        return A01(this).A06;
    }

    public Rect getPreferredBounds() {
        return A01(this).A0A;
    }

    public PointF getRelativeTagPosition() {
        return A01(this).A01();
    }

    public Rect getVisibleBounds() {
        return A01(this).A0B;
    }

    public void setPosition(PointF pointF) {
        A01(this).A04(pointF);
    }

    public void setText(CharSequence charSequence) {
        LPG A012 = A01(this);
        TextView textView = A012.A0F;
        textView.setText(charSequence);
        textView.measure(0, 0);
        A012.A02();
    }

    public void setCarouselIndex(int i) {
        this.A00 = i;
    }

    public void setLazyMediaFetcher(AnonymousClass3ZT r1) {
        this.A03 = r1;
    }

    public void setMediaState(AnonymousClass3W1 r1) {
        this.A01 = r1;
    }
}
