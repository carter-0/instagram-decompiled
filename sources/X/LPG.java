package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.tagging.widget.TagsLayout;

public final class LPG {
    public int A00;
    public int A01;
    public ImageView A02;
    public boolean A03;
    public final int A04;
    public final Resources A05;
    public final PointF A06;
    public final PointF A07 = new PointF(0.0f, 0.0f);
    public final Rect A08 = new Rect(0, 0, 0, 0);
    public final Rect A09 = new Rect(0, 0, 0, 0);
    public final Rect A0A = new Rect(0, 0, 0, 0);
    public final Rect A0B = new Rect(0, 0, 0, 0);
    public final ViewGroup A0C;
    public final ImageView A0D;
    public final ImageView A0E;
    public final TextView A0F;
    public final UserSession A0G;
    public final 1Xj A0H;
    public final C60046JeE A0I;
    public final boolean A0J;
    public final int A0K;

    public static ImageView A00(LPG lpg) {
        if (lpg.A02 == null) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
            C60046JeE jeE = lpg.A0I;
            Context context = jeE.getContext();
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.legacy_tag_close_bg);
            imageView.setVisibility(8);
            imageView.setFocusable(true);
            DbU.A12(context, imageView, 2131972120);
            lpg.A02 = imageView;
            jeE.addView(imageView, layoutParams);
        }
        return lpg.A02;
    }

    public final PointF A01() {
        PointF pointF = this.A07;
        float f = pointF.x;
        Rect rect = this.A09;
        return new PointF(f - ((float) rect.left), pointF.y - ((float) rect.top));
    }

    public final void A02() {
        ViewGroup viewGroup = this.A0C;
        viewGroup.measure(0, 0);
        int measuredWidth = viewGroup.getMeasuredWidth() / 2;
        Rect rect = this.A0A;
        int i = ((int) this.A07.x) - measuredWidth;
        rect.left = i;
        rect.right = i + viewGroup.getMeasuredWidth();
    }

    public final void A03(int i) {
        Rect rect = this.A0A;
        int width = i - (rect.width() / 2);
        int width2 = rect.width();
        PointF pointF = this.A07;
        Resources resources = this.A05;
        int min = Math.min(Math.max(Math.max((((int) pointF.x) + resources.getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material)) - rect.width(), Math.min(((int) pointF.x) - resources.getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material), width)), 0), this.A0I.getMeasuredWidth() - width2);
        Rect rect2 = this.A08;
        int i2 = this.A0K;
        rect2.set(i2 + min, rect.top, min + this.A0C.getMeasuredWidth() + i2, rect.bottom);
    }

    public final void A04(PointF pointF) {
        Rect rect;
        float f = pointF.x;
        Resources resources = this.A05;
        float max = Math.max(f, AnonymousClass7TE.A01(resources, R.dimen.abc_select_dialog_padding_start_material));
        pointF.x = max;
        C60046JeE jeE = this.A0I;
        pointF.x = Math.min(max, (float) (jeE.getMeasuredWidth() - resources.getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material)));
        float max2 = Math.max(pointF.y, AnonymousClass7TE.A01(resources, R.dimen.accent_edge_thickness));
        pointF.y = max2;
        pointF.y = Math.min(max2, (float) (jeE.getMeasuredHeight() - resources.getDimensionPixelSize(R.dimen.accent_edge_thickness)));
        PointF pointF2 = this.A07;
        pointF2.set(pointF);
        this.A06.set(pointF.x / ((float) this.A01), pointF.y / ((float) this.A00));
        float f2 = pointF2.y - ((float) this.A04);
        pointF2.y = f2;
        int i = (int) pointF2.x;
        int i2 = (int) f2;
        ViewGroup viewGroup = this.A0C;
        int measuredWidth = viewGroup.getMeasuredWidth() / 2;
        if (!this.A0J ? i2 + this.A0E.getMeasuredHeight() + viewGroup.getMeasuredHeight() + resources.getDimensionPixelSize(R.dimen.accent_edge_thickness) <= this.A00 : ((i2 - this.A0D.getMeasuredHeight()) - viewGroup.getMeasuredHeight()) - resources.getDimensionPixelSize(R.dimen.accent_edge_thickness) <= 0) {
            ImageView imageView = this.A0E;
            imageView.setVisibility(0);
            this.A0D.setVisibility(8);
            int measuredHeight = imageView.getMeasuredHeight() + i2;
            rect = this.A0A;
            int i3 = i - measuredWidth;
            int i4 = i + measuredWidth;
            rect.set(i3, measuredHeight, i4, viewGroup.getMeasuredHeight() + measuredHeight);
            this.A0B.set(i3, i2, i4, measuredHeight + viewGroup.getMeasuredHeight());
        } else {
            this.A0E.setVisibility(8);
            ImageView imageView2 = this.A0D;
            imageView2.setVisibility(0);
            int measuredHeight2 = i2 - imageView2.getMeasuredHeight();
            rect = this.A0A;
            int i5 = i - measuredWidth;
            int i6 = i + measuredWidth;
            rect.set(i5, measuredHeight2 - viewGroup.getMeasuredHeight(), i6, measuredHeight2);
            this.A0B.set(i5, measuredHeight2 - viewGroup.getMeasuredHeight(), i6, i2);
        }
        Context context = jeE.getContext();
        UserSession userSession = this.A0G;
        0Tu A0J2 = DbS.A0J(userSession, 0);
        int A002 = (int) 0nA.A00(context, (float) 182.A00(A0J2, userSession, 37172168853357110L));
        int A003 = (int) 0nA.A00(context, (float) 182.A00(A0J2, userSession, 37172168853291573L));
        1Xj r11 = this.A0H;
        boolean z = jeE instanceof C62105KaC;
        if (r11 != null && 182.A06(A0J2, userSession, 36327743923108509L) && (((r11.CcK() && z) || 182.A06(A0J2, userSession, 36327743923829408L)) && A002 > 0 && A003 > 0)) {
            Rect A0W = AnonymousClass7TE.A0W();
            A0W.left = Math.max(0, rect.left - A003);
            A0W.right = Math.min(rect.right + A003, this.A01);
            A0W.top = Math.max(0, rect.top - A002);
            A0W.bottom = Math.min(this.A00, rect.bottom + A002);
            ViewParent parent = jeE.getParent();
            if (parent != null && (parent instanceof TagsLayout)) {
                ((View) parent).setTouchDelegate(new C60037Jdp(A0W, A0W, jeE, this));
            }
        }
        A03((int) pointF2.x);
    }

    public final boolean A06(MotionEvent motionEvent) {
        C60046JeE jeE = this.A0I;
        if (jeE.isClickable()) {
            if (A05((int) motionEvent.getX(), (int) motionEvent.getY())) {
                if (motionEvent.getAction() == 0) {
                    this.A03 = true;
                } else if (motionEvent.getAction() == 1) {
                    this.A03 = false;
                    jeE.setPressed(false);
                }
                ViewParent parent = jeE.getParent();
                if (parent != null && (parent instanceof TagsLayout)) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    int childCount = viewGroup.getChildCount();
                    int i = 0;
                    while (i < childCount && viewGroup.getChildAt(i) != jeE) {
                        i++;
                    }
                    Resources resources = viewGroup.getResources();
                    int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.bubble_external_padding);
                    Rect rect = new Rect(C60046JeE.A01(jeE).A08);
                    rect.inset(dimensionPixelSize, dimensionPixelSize);
                    Rect A0W = AnonymousClass7TE.A0W();
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    RectF rectF = 0nA.A01;
                    int applyDimension = (int) TypedValue.applyDimension(1, 250.0f, displayMetrics);
                    while (true) {
                        i++;
                        if (i < childCount) {
                            if (A0W.setIntersect(C60046JeE.A01((C60046JeE) viewGroup.getChildAt(i)).A08, rect)) {
                                A0W.inset(dimensionPixelSize, dimensionPixelSize);
                                if (!A0W.isEmpty() && A0W.width() * A0W.height() >= applyDimension) {
                                    if (motionEvent.getAction() == 1) {
                                        jeE.bringToFront();
                                        ((View) parent).invalidate();
                                    }
                                }
                            }
                        } else if (motionEvent.getAction() == 0) {
                            jeE.setPressed(true);
                            return true;
                        } else if (motionEvent.getAction() == 1) {
                            jeE.performClick();
                            return true;
                        }
                    }
                }
                return true;
            } else if (this.A03) {
                motionEvent.setAction(3);
                jeE.setPressed(false);
                this.A03 = false;
                return true;
            }
        }
        return false;
    }

    public LPG(PointF pointF, ViewGroup viewGroup, ImageView imageView, ImageView imageView2, TextView textView, UserSession userSession, 1Xj r9, C60046JeE jeE, int i, int i2, boolean z) {
        this.A0I = jeE;
        this.A0C = viewGroup;
        this.A0F = textView;
        this.A0E = imageView;
        this.A0D = imageView2;
        this.A06 = pointF;
        this.A05 = DbU.A05(jeE);
        this.A0K = i;
        this.A04 = i2;
        this.A0J = z;
        this.A0H = r9;
        this.A0G = userSession;
    }

    public final boolean A05(int i, int i2) {
        Rect A0W = AnonymousClass7TE.A0W();
        int i3 = 0;
        while (true) {
            C60046JeE jeE = this.A0I;
            if (i3 >= jeE.getChildCount()) {
                return false;
            }
            View childAt = jeE.getChildAt(i3);
            if (childAt.getVisibility() == 0) {
                childAt.getHitRect(A0W);
                if (A0W.contains(i, i2)) {
                    return true;
                }
            }
            i3++;
        }
    }
}
