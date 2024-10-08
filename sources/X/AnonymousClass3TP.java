package X;

import android.content.Context;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* renamed from: X.3TP  reason: invalid class name */
public final class AnonymousClass3TP extends FrameLayout {
    public boolean A00 = true;
    public final ViewTreeObserver.OnScrollChangedListener A01 = new AnonymousClass3TQ(this);
    public final boolean A02;

    public AnonymousClass3TP(Context context, boolean z) {
        super(context);
        this.A02 = z;
    }

    public final void onAttachedToWindow() {
        int A06 = AnonymousClass0fD.A06(-531461624);
        super.onAttachedToWindow();
        if (this.A02) {
            getViewTreeObserver().addOnScrollChangedListener(this.A01);
        }
        AnonymousClass0fD.A0D(-1863031934, A06);
    }

    public final void onDetachedFromWindow() {
        int A06 = AnonymousClass0fD.A06(-116752463);
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnScrollChangedListener(this.A01);
        AnonymousClass0fD.A0D(-1861158321, A06);
    }

    public void setTranslationY(float f) {
        super.setTranslationY(f);
        if (this.A02 && this.A00) {
            C245863db.A03((C249753kJ) null, this);
        }
    }

    public final void setPropagationEnabled(boolean z) {
        this.A00 = z;
    }

    public void setTranslationX(float f) {
        super.setTranslationX(f);
    }
}
