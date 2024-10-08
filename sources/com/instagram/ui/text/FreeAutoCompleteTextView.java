package com.instagram.ui.text;

import X.0qQ;
import X.AnonymousClass0fD;
import X.C13988Tno;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.instagram.common.ui.base.IgSimpleAutoCompleteTextView;

public final class FreeAutoCompleteTextView extends IgSimpleAutoCompleteTextView {
    public int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FreeAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A00 = super.getThreshold();
    }

    public final boolean enoughToFilter() {
        if (this.A00 == 0) {
            return true;
        }
        if (getText() == null || C13988Tno.A0C(this) < this.A00) {
            return false;
        }
        return true;
    }

    public int getThreshold() {
        return this.A00;
    }

    public void setAdapter(Filterable filterable) {
        super.setAdapter((ListAdapter) filterable);
        A00();
    }

    public void setThreshold(int i) {
        if (i < 0) {
            i = 1;
        }
        this.A00 = i;
        A00();
    }

    private final void A00() {
        if (!isTemporarilyDetached() && enoughToFilter() && getAdapter() != null) {
            performFiltering(getText(), 0);
            showDropDown();
        }
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int A06 = AnonymousClass0fD.A06(-2073548998);
        super.onFocusChanged(z, i, rect);
        if (z) {
            A00();
        }
        AnonymousClass0fD.A0D(942823085, A06);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FreeAutoCompleteTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        0qQ.A0B(context, 1);
        this.A00 = super.getThreshold();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FreeAutoCompleteTextView(Context context) {
        super(context);
        0qQ.A0B(context, 1);
        this.A00 = super.getThreshold();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FreeAutoCompleteTextView(Context context, AttributeSet attributeSet, int i, int i2, Resources.Theme theme) {
        super(context, attributeSet, i, i2, theme);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FreeAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        this.A00 = super.getThreshold();
    }
}
