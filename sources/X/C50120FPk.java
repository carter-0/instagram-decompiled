package X;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.ui.widget.inlineerror.InlineErrorMessageView;

/* renamed from: X.FPk  reason: case insensitive filesystem */
public final class C50120FPk implements ViewTreeObserver.OnPreDrawListener {
    public final int A00;
    public final Object A01;

    public C50120FPk(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean onPreDraw() {
        BaseFragmentActivity baseFragmentActivity;
        View view;
        switch (this.A00) {
            case 0:
                AnonymousClass4DH r1 = (AnonymousClass4DH) this.A01;
                View view2 = r1.mView;
                if (view2 == null) {
                    return true;
                }
                view2.getViewTreeObserver().removeOnPreDrawListener(this);
                if (!r1.isAdded()) {
                    return false;
                }
                Activity rootActivity = r1.getRootActivity();
                if (!(rootActivity instanceof BaseFragmentActivity) || (baseFragmentActivity = (BaseFragmentActivity) rootActivity) == null) {
                    return true;
                }
                baseFragmentActivity.A0Z();
                baseFragmentActivity.A0d();
                return false;
            case 1:
                ViewGroup viewGroup = ((EEG) this.A01).A05;
                viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
                TimeInterpolator timeInterpolator = InlineErrorMessageView.A09;
                C49165EqW.A00(viewGroup);
                break;
            case 2:
                View view3 = ((C50653FgE) this.A01).A02;
                view3.getViewTreeObserver().removeOnPreDrawListener(this);
                view3.setTranslationY((float) (view3.getHeight() / 4));
                return false;
            default:
                InlineErrorMessageView inlineErrorMessageView = (InlineErrorMessageView) this.A01;
                TimeInterpolator timeInterpolator2 = InlineErrorMessageView.A09;
                int i = inlineErrorMessageView.A00;
                int i2 = inlineErrorMessageView.A03;
                if (i != 0) {
                    if (i2 == 0) {
                        view = inlineErrorMessageView.getChildAt(0);
                        inlineErrorMessageView.A05 = view;
                        if (view == null) {
                            throw AnonymousClass7TE.A0z("Error background was provided but no child view exists to apply it to");
                        }
                    } else {
                        view = inlineErrorMessageView.findViewById(i2);
                        inlineErrorMessageView.A05 = view;
                        if (view == null) {
                            throw AnonymousClass7TE.A0z("Descendant view (to apply error background to) wasn't found by provided id");
                        }
                    }
                    inlineErrorMessageView.A04 = view.getBackground();
                } else if (i2 != 0) {
                    throw AnonymousClass7TE.A0z("Descendant view was provided without specifying the error background");
                }
                inlineErrorMessageView.getViewTreeObserver().removeOnPreDrawListener(this);
                break;
        }
        return true;
    }
}
