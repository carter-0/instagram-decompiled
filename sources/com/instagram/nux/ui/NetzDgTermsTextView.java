package com.instagram.nux.ui;

import X.0Tu;
import X.0lg;
import X.0qQ;
import X.1AW;
import X.AnonymousClass1Q2;
import X.AnonymousClass3Tj;
import X.Dbc;
import X.FPG;
import android.content.Context;
import android.util.AttributeSet;
import java.util.Locale;

public final class NetzDgTermsTextView extends AnonymousClass3Tj {
    public String A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NetzDgTermsTextView(Context context) {
        super(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
        Dbc.A0J(context, (AttributeSet) null, this);
    }

    public final void A00(0lg r4) {
        0Tu r2 = 0Tu.A05;
        if (!1AW.A06(r2, 18306198587646616L) ? 1AW.A06(r2, 18306198587581079L) : Locale.GERMANY.getCountry().equalsIgnoreCase(AnonymousClass1Q2.A02().getCountry()) || Locale.GERMANY.getCountry().equalsIgnoreCase(AnonymousClass1Q2.A03().getCountry())) {
            setVisibility(0);
            setClickable(true);
            setOnClickListener(new FPG(15, (Object) r4, (Object) this));
            return;
        }
        setVisibility(8);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NetzDgTermsTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        Dbc.A0J(context, attributeSet, this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NetzDgTermsTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        Dbc.A0J(context, attributeSet, this);
    }
}
