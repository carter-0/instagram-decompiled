package X;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.81v  reason: invalid class name and case insensitive filesystem */
public class C3497981v implements C3498081w {
    public A68 A00;
    public final View A01;

    public C3497981v(View view) {
        0qQ.A0B(view, 1);
        this.A01 = view;
    }

    public final boolean AJY(int i, int i2, boolean z) {
        Rect rect = new Rect();
        View view = getView();
        if (view.getVisibility() != 0) {
            return false;
        }
        if (z) {
            view.getGlobalVisibleRect(rect);
        } else {
            view.getHitRect(rect);
        }
        return rect.contains(i, i2);
    }

    public final View getView() {
        if (this instanceof AnonymousClass8E0) {
            return ((AnonymousClass8E0) this).A00;
        }
        if (this instanceof AnonymousClass8E2) {
            return ((AnonymousClass8E2) this).A00;
        }
        if (this instanceof AnonymousClass8GE) {
            return ((AnonymousClass8GE) this).A03;
        }
        return this.A01;
    }

    public final void A00(String str) {
        View view = getView();
        if (view instanceof IgTextView) {
            0qQ.A0C(view, AnonymousClass000.A00(9));
            ((TextView) view).setText(str);
        }
    }

    public final AnonymousClass8GF CrP() {
        return new AnonymousClass8GF(getView());
    }

    public final void EOX(float f) {
        View view = getView();
        view.setAlpha(f);
        if (view instanceof ImageView) {
            0qQ.A0C(view, "null cannot be cast to non-null type android.widget.ImageView");
            ((ImageView) view).setImageAlpha((int) 0mi.A02(f, 0.0f, 1.0f, 0.0f, 255.0f));
        }
    }

    public final void ESF(int i) {
        View view = getView();
        if (!(view instanceof ImageView)) {
            String A0R = 002.A0R("setColorFilter() called with a View of type ", view.getClass().getSimpleName());
            0qQ.A0B(A0R, 1);
            0kD.A04("CameraButtonImpl", A0R, 817903175, (Throwable) null);
            return;
        }
        0qQ.A0C(view, "null cannot be cast to non-null type android.widget.ImageView");
        ((ImageView) view).setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }

    public final void EZd(Drawable drawable) {
        View view = getView();
        if (!(view instanceof ImageView)) {
            String A0R = 002.A0R("setImageDrawable() called with a View of type ", view.getClass().getSimpleName());
            0qQ.A0B(A0R, 1);
            0kD.A04("CameraButtonImpl", A0R, 817903175, (Throwable) null);
            return;
        }
        11Z.A02(new AnonymousClass8E1(drawable, this));
    }

    public final void Eql(boolean z, boolean z2) {
        View[] viewArr = {getView()};
        if (z) {
            C71392co r0 = C315596kB.A02;
            C294975nL.A04((C295005nO) null, viewArr, z2);
            return;
        }
        C315596kB.A08(viewArr, z2);
    }

    public final void setEnabled(boolean z) {
        getView().setEnabled(z);
    }
}
