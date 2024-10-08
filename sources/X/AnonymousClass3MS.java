package X;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: X.3MS  reason: invalid class name */
public abstract class AnonymousClass3MS extends C252043oT {
    public boolean A00;
    public boolean A01;

    public abstract void A0B(AnonymousClass3MR r1, int i, int i2);

    public void A06(AttributeSet attributeSet) {
        super.A06(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C71482dO.A01);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.A01 = true;
                } else if (index == 22) {
                    this.A00 = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public final void onAttachedToWindow() {
        int A06 = AnonymousClass0fD.A06(-422508771);
        super.onAttachedToWindow();
        if (this.A01 || this.A00) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.A00; i++) {
                    View view = (View) constraintLayout.A08.get(this.A05[i]);
                    if (view != null) {
                        if (this.A01) {
                            view.setVisibility(visibility);
                        }
                        if (this.A00 && elevation > 0.0f) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
        AnonymousClass0fD.A0D(1246072323, A06);
    }

    public void setElevation(float f) {
        super.setElevation(f);
        A05();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        A05();
    }
}
