package com.facebookpay.form.view;

import X.0qQ;
import X.AnonymousClass0fD;
import X.AnonymousClass2E0;
import X.C12411Sto;
import X.C13449Tac;
import X.C18910WCe;
import X.C51965G9l;
import X.C51969G9p;
import X.C62320sa;
import X.C74189PqV;
import X.QDM;
import X.RIb;
import X.SUU;
import X.Ste;
import X.U47;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.autofill.AutofillValue;
import android.widget.AdapterView;
import com.facebookpay.logging.LoggingContext;
import com.instagram.android.R;

public final class BaseAutoCompleteTextView extends U47 {
    public C13449Tac A00;
    public Integer A01;
    public C62320sa A02;
    public C62320sa A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        A00();
    }

    public final boolean enoughToFilter() {
        return true;
    }

    public final void replaceText(CharSequence charSequence) {
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        super.setOnItemClickListener(new C18910WCe(onItemClickListener, 1));
    }

    public int getAutofillType() {
        Integer num = this.A01;
        if (num != null) {
            return num.intValue();
        }
        return super.getAutofillType();
    }

    public final C62320sa getOnAutofillListener() {
        return this.A02;
    }

    public final C62320sa getOnAutofillPromptListener() {
        return this.A03;
    }

    public final C13449Tac getOnShowListener() {
        return this.A00;
    }

    public final void setAutofillType(Integer num) {
        this.A01 = num;
    }

    public final void setOnAutofillListener(C62320sa r1) {
        this.A02 = r1;
    }

    public final void setOnAutofillPromptListener(C62320sa r1) {
        this.A03 = r1;
    }

    public final void setOnShowListener(C13449Tac tac) {
        this.A00 = tac;
    }

    private final void A00() {
        Context context = getContext();
        Drawable drawable = context.getDrawable(R.drawable.apm_buttons_shimmer_background);
        AnonymousClass2E0.A0A();
        int color = context.getColor(R.color.igds_elevated_background);
        if (drawable instanceof GradientDrawable) {
            ((GradientDrawable) drawable).setColor(color);
        } else if (drawable instanceof ShapeDrawable) {
            ((ShapeDrawable) drawable).getPaint().setColor(color);
        } else if (drawable instanceof ColorDrawable) {
            ((ColorDrawable) drawable).setColor(color);
        }
        setDropDownBackgroundDrawable(drawable);
    }

    public final void autofill(AutofillValue autofillValue) {
        super.autofill(autofillValue);
        C62320sa r0 = this.A02;
        if (r0 != null) {
            r0.invoke();
        }
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        LoggingContext loggingContext;
        RIb rIb;
        C12411Sto sto;
        QDM qdm;
        int A06 = AnonymousClass0fD.A06(26264688);
        super.onFocusChanged(z, i, rect);
        if (z && getAdapter() != null) {
            performFiltering(getText(), 0);
            if (getAdapter() != null && !isPopupShowing() && hasFocus() && getAdapter().getCount() > 0) {
                C13449Tac tac = this.A00;
                if (tac != null) {
                    Ste ste = (Ste) tac;
                    int i2 = ste.A00;
                    if (i2 == 0 || i2 == 1) {
                        sto = C51965G9l.A0g();
                        qdm = ste.A01;
                        loggingContext = qdm.A0R;
                        rIb = RIb.CONTACT_INFO;
                    } else if (i2 == 2 || i2 == 5) {
                        sto = C51965G9l.A0g();
                        qdm = ste.A01;
                        loggingContext = qdm.A0R;
                        rIb = RIb.SHIPPING_ADDRESS;
                    }
                    C12411Sto.A03(C51965G9l.A0U(C51969G9p.A0d(sto.A00, "client_load_ecpautofill_display"), 51), loggingContext, new C74189PqV((Object) rIb, (Object) loggingContext, (Object) SUU.A08(qdm.A0S), "nux_checkout", 12));
                }
                showDropDown();
            }
        }
        AnonymousClass0fD.A0D(-677820535, A06);
    }

    public final void setParentAnchorId(int i) {
        setDropDownAnchor(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        0qQ.A0B(context, 1);
        A00();
    }

    /* renamed from: getAutofillType  reason: collision with other method in class */
    public final Integer m21getAutofillType() {
        return this.A01;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseAutoCompleteTextView(Context context) {
        super(context, (AttributeSet) null, R.attr.autoCompleteTextViewStyle);
        0qQ.A0B(context, 1);
        A00();
    }
}
