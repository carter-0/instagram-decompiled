package X;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;

public final class Q9N extends FrameLayout {
    public View.OnClickListener A00;
    public final View A01;
    public final View A02;

    public final void A01() {
        setFocusableInTouchMode(true);
        requestFocus();
        DbY.A0G(this.A02).setDuration(250).start();
        this.A01.getViewTreeObserver().addOnPreDrawListener(new C11518Sbf(this, 1));
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        0qQ.A0B(keyEvent, 1);
        if (i != 4 || keyEvent.getAction() != 1) {
            return super.onKeyUp(i, keyEvent);
        }
        A00();
        return true;
    }

    public final void A00() {
        C51972G9s.A0I(this.A02).setDuration(250).start();
        View view = this.A01;
        view.animate().translationY(AnonymousClass7TE.A03(view)).setInterpolator(new AccelerateInterpolator()).setDuration(250).setListener(new C7345Q4x(this, 4)).start();
        View.OnClickListener onClickListener = this.A00;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public final void setOnHideListener(View.OnClickListener onClickListener) {
        this.A00 = onClickListener;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Q9N(Context context, View view, int i, boolean z) {
        super(context);
        AnonymousClass7TG.A1O(context, view);
        this.A01 = view;
        View view2 = new View(context);
        Pxf.A1B(view2, i);
        view2.setOnClickListener(new C11497SbK(this, 62));
        view2.setAlpha(0.0f);
        this.A02 = view2;
        addView(view2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, z ? -1 : -2);
        layoutParams.gravity = 80;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
        addView(view, layoutParams);
    }
}
