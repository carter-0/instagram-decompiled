package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout;

/* renamed from: X.Nh3  reason: case insensitive filesystem */
public final class C69203Nh3 extends RoundedCornerMediaFrameLayout {
    public IgSimpleImageView A00;
    public C70421O5y A01;
    public C74235PrO A02;
    public Integer A03;
    public final AnonymousClass0eM A04 = DbW.A0p(this, 5);
    public final AnonymousClass0eM A05 = DbW.A0p(this, 6);
    public final AnonymousClass0eM A06 = DbW.A0p(this, 7);
    public final AnonymousClass0eM A07 = DbW.A0p(this, 9);
    public final AnonymousClass0eM A08 = DbW.A0p(this, 8);

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C69203Nh3(android.content.Context r5) {
        /*
            r4 = this;
            r0 = 0
            boolean r3 = X.DbW.A1X(r5)
            r4.<init>(r5, r0, r3)
            r0 = 9
            X.0eM r0 = X.DbW.A0p(r4, r0)
            r4.A07 = r0
            r0 = 6
            X.0eM r0 = X.DbW.A0p(r4, r0)
            r4.A05 = r0
            r0 = 7
            X.0eM r0 = X.DbW.A0p(r4, r0)
            r4.A06 = r0
            r0 = 5
            X.0eM r0 = X.DbW.A0p(r4, r0)
            r4.A04 = r0
            r2 = 8
            X.0eM r0 = X.DbW.A0p(r4, r2)
            r4.A08 = r0
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131165204(0x7f070014, float:1.7944619E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r4.setRadius(r0)
            r4.setCornerBackgroundColor(r3)
            r0 = 1061158912(0x3f400000, float:0.75)
            r4.A00 = r0
            r0 = 0
            r4.setAlpha(r0)
            r4.setVisibility(r2)
            r1 = 36
            X.Ok2 r0 = new X.Ok2
            r0.<init>(r4, r1)
            r4.setOnClickListener(r0)
            X.OkQ r0 = new X.OkQ
            r0.<init>((java.lang.Object) r4, (int) r3)
            r4.setOnLongClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69203Nh3.<init>(android.content.Context):void");
    }

    public final void setClickCallback(C74235PrO prO) {
        0qQ.A0B(prO, 0);
        this.A02 = prO;
    }

    private final int getDecorMarginBottom() {
        return DbX.A07(this.A04);
    }

    private final int getDecorMarginHorizontal() {
        return DbX.A07(this.A05);
    }

    private final int getDecorMarginTop() {
        return DbX.A07(this.A06);
    }

    private final N1U getDraggableTouchListener() {
        return (N1U) this.A08.getValue();
    }

    private final int getSize() {
        return DbX.A07(this.A07);
    }

    public final ViewGroup.LayoutParams getDesiredContextAvatarLayoutParams() {
        AnonymousClass0eM r0 = this.A07;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(DbX.A07(r0), DbX.A07(r0));
        layoutParams.gravity = 17;
        return layoutParams;
    }

    public final FrameLayout.LayoutParams getDesiredDecorLayoutParams() {
        AnonymousClass0eM r0 = this.A07;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(DbX.A07(r0), DbX.A07(r0));
        AnonymousClass0eM r1 = this.A05;
        layoutParams.leftMargin = DbX.A07(r1);
        layoutParams.topMargin = DbX.A07(this.A06);
        layoutParams.rightMargin = DbX.A07(r1);
        layoutParams.bottomMargin = DbX.A07(this.A04);
        layoutParams.gravity = 53;
        return layoutParams;
    }

    public final void setBottomBounds(Integer num) {
        this.A03 = num;
        A00();
    }

    private final void A00() {
        View view;
        int i;
        int i2;
        int i3;
        ViewParent parent = getParent();
        if (parent instanceof View) {
            view = (View) parent;
        } else {
            view = null;
        }
        int i4 = 0;
        if (view != null) {
            i = view.getWidth();
            i4 = view.getHeight();
        } else {
            i = 0;
        }
        N1U draggableTouchListener = getDraggableTouchListener();
        AnonymousClass0eM r1 = this.A05;
        int A072 = DbX.A07(r1);
        int A073 = DbX.A07(this.A06);
        int A074 = i - DbX.A07(r1);
        int A042 = C51967G9n.A04(this.A03, i4) - DbX.A07(this.A04);
        if (A072 != draggableTouchListener.A01 || A073 != draggableTouchListener.A03 || A074 != draggableTouchListener.A02 || A042 != draggableTouchListener.A00) {
            draggableTouchListener.A01 = A072;
            draggableTouchListener.A03 = A073;
            draggableTouchListener.A02 = A074;
            draggableTouchListener.A00 = A042;
            View view2 = draggableTouchListener.A0A;
            if (view2.getWidth() > 0 && view2.getHeight() > 0) {
                Integer num = draggableTouchListener.A05;
                Integer num2 = draggableTouchListener.A06;
                C15048ULb A002 = N1U.A00(draggableTouchListener);
                draggableTouchListener.A05 = num;
                draggableTouchListener.A06 = num2;
                Integer num3 = AnonymousClass05K.A00;
                if (num == num3) {
                    i2 = A002.A01;
                } else {
                    i2 = A002.A02;
                }
                if (num2 == num3) {
                    i3 = A002.A03;
                } else {
                    i3 = A002.A00;
                }
                double translationX = ((double) view2.getTranslationX()) + ((double) (i2 - C66584MXp.A03(view2)));
                double translationY = ((double) view2.getTranslationY()) + ((double) (i3 - C66584MXp.A04(view2)));
                draggableTouchListener.A0C.A08(translationX, true);
                draggableTouchListener.A0D.A08(translationY, true);
            }
        }
    }

    public final void A02() {
        N1U draggableTouchListener = getDraggableTouchListener();
        2cs r0 = draggableTouchListener.A0C;
        C383699g0 r1 = draggableTouchListener.A0B;
        r0.A0B(r1);
        draggableTouchListener.A0D.A0B(r1);
        setOnTouchListener((View.OnTouchListener) null);
        getDraggableTouchListener().A04 = null;
    }

    public final void A03() {
        clearAnimation();
        ViewPropertyAnimator withStartAction = DbY.A0G(this).withStartAction(new C73064PUx(this));
        withStartAction.setDuration(350);
        withStartAction.setStartDelay(50);
        withStartAction.start();
    }

    public final void A04(A42 a42) {
        A00();
        N1U draggableTouchListener = getDraggableTouchListener();
        2cs r0 = draggableTouchListener.A0C;
        C383699g0 r1 = draggableTouchListener.A0B;
        r0.A0A(r1);
        draggableTouchListener.A0D.A0A(r1);
        getDraggableTouchListener().A04 = a42;
        setOnTouchListener(getDraggableTouchListener());
    }

    public final void A05(C62320sa r4) {
        clearAnimation();
        ViewPropertyAnimator withEndAction = C51972G9s.A0I(this).withEndAction(new C73177PYH(this, r4));
        withEndAction.setDuration(300);
        withEndAction.start();
    }

    public final String getCurrentDecorAvatarPosition() {
        N1U draggableTouchListener = getDraggableTouchListener();
        Integer num = draggableTouchListener.A05;
        Integer num2 = draggableTouchListener.A06;
        Integer num3 = AnonymousClass05K.A00;
        if (num2 == num3) {
            if (num == num3) {
                return "top_left";
            }
            if (num == AnonymousClass05K.A01) {
                return "top_right";
            }
        }
        if (num2 == AnonymousClass05K.A01 && num == num3) {
            return "bottom_left";
        }
        return "bottom_right";
    }
}
