package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.instagram.android.R;

@Deprecated
public abstract class QHO extends C11993SkC {
    public final View A00;
    public final C11193SEt A01;

    public final C13837TiC Bn5() {
        Object tag = this.A00.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof C13837TiC) {
            return (C13837TiC) tag;
        }
        throw AnonymousClass7TE.A0w("You must not call setTag() on a view Glide is targeting");
    }

    public final void Bwf(C11990Sk9 sk9) {
        int i;
        int i2;
        C11193SEt sEt = this.A01;
        View view = sEt.A01;
        int paddingLeft = view.getPaddingLeft() + view.getPaddingRight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            i = layoutParams.width;
        } else {
            i = 0;
        }
        int A002 = C11193SEt.A00(sEt, view.getWidth(), i, paddingLeft);
        int paddingTop = view.getPaddingTop() + view.getPaddingBottom();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 != null) {
            i2 = layoutParams2.height;
        } else {
            i2 = 0;
        }
        int A003 = C11193SEt.A00(sEt, view.getHeight(), i2, paddingTop);
        if ((A002 > 0 || A002 == Integer.MIN_VALUE) && (A003 > 0 || A003 == Integer.MIN_VALUE)) {
            sk9.A03(A002, A003);
            return;
        }
        JTR.A1T(sk9, sEt.A02);
        if (sEt.A00 == null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            C11517Sbe sbe = new C11517Sbe(sEt);
            sEt.A00 = sbe;
            viewTreeObserver.addOnPreDrawListener(sbe);
        }
    }

    public void DO8(Drawable drawable) {
        C11193SEt sEt = this.A01;
        ViewTreeObserver viewTreeObserver = sEt.A01.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(sEt.A00);
        }
        sEt.A00 = null;
        sEt.A02.clear();
    }

    public final void EDP(C11990Sk9 sk9) {
        this.A01.A02.remove(sk9);
    }

    public final void Eig(C13837TiC tiC) {
        this.A00.setTag(R.id.glide_custom_view_target_tag, tiC);
    }

    public QHO(View view) {
        C9217RTu.A00(view);
        this.A00 = view;
        this.A01 = new C11193SEt(view);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Target for: ");
        return AnonymousClass7TF.A0i(this.A00, A1A);
    }
}
