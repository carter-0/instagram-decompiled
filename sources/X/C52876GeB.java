package X;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.PopupWindow;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* renamed from: X.GeB  reason: case insensitive filesystem */
public final class C52876GeB extends PopupWindow {
    public int A00;
    public View A01;
    public C62320sa A02;
    public C62320sa A03;
    public C62320sa A04;
    public final View.OnLayoutChangeListener A05 = new ID7(this, 0);

    public C52876GeB(Context context) {
        super(context);
        setContentView(new C299025uS(context));
        setInputMethodMode(2);
        setBackgroundDrawable(C51965G9l.A0D(0));
        setAnimationStyle(0);
        setFocusable(true);
        setOutsideTouchable(true);
    }

    public final void A01(View view, int i, int i2) {
        if (!isShowing()) {
            this.A01 = view;
            this.A00 = view.getResources().getConfiguration().orientation;
            View view2 = this.A01;
            if (view2 != null) {
                View rootView = view2.getRootView();
                View.OnLayoutChangeListener onLayoutChangeListener = this.A05;
                rootView.removeOnLayoutChangeListener(onLayoutChangeListener);
                view2.getRootView().addOnLayoutChangeListener(onLayoutChangeListener);
                super.showAtLocation(view, 0, i, i2);
                return;
            }
            throw DbU.A0h();
        }
    }

    @Deprecated(level = C16705V2i.ERROR, message = "Use show() instead", replaceWith = @ReplaceWith(expression = "show()", imports = {}))
    public final void showAsDropDown(View view) {
    }

    @Deprecated(level = C16705V2i.ERROR, message = "Use show() instead", replaceWith = @ReplaceWith(expression = "show()", imports = {}))
    public final void showAsDropDown(View view, int i, int i2) {
    }

    @Deprecated(level = C16705V2i.ERROR, message = "Use show() instead", replaceWith = @ReplaceWith(expression = "show()", imports = {}))
    public final void showAsDropDown(View view, int i, int i2, int i3) {
    }

    @Deprecated(level = C16705V2i.ERROR, message = "Use show() instead", replaceWith = @ReplaceWith(expression = "show()", imports = {}))
    public final void showAtLocation(View view, int i, int i2, int i3) {
    }

    public final void A00() {
        if (isShowing()) {
            super.dismiss();
            View view = this.A01;
            if (view != null) {
                view.getRootView().removeOnLayoutChangeListener(this.A05);
                this.A01 = null;
                this.A00 = 0;
                View contentView = getContentView();
                0qQ.A0C(contentView, AnonymousClass000.A00(717));
                ((C299025uS) contentView).setRenderTree((C245663dH) null);
                this.A04 = null;
                this.A02 = null;
                this.A03 = null;
                return;
            }
            throw DbU.A0h();
        }
    }

    @Deprecated(level = C16705V2i.ERROR, message = "Use hide() instead", replaceWith = @ReplaceWith(expression = "hide()", imports = {}))
    public final void dismiss() {
        C62320sa r0;
        if (getContentView().getKeyDispatcherState().isTracking(new KeyEvent(0, 4))) {
            r0 = this.A02;
        } else {
            r0 = this.A04;
        }
        if (r0 != null) {
            r0.invoke();
        }
    }
}
