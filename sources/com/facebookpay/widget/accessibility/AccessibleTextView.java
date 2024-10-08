package com.facebookpay.widget.accessibility;

import X.03v;
import X.0qQ;
import X.C14749U7g;
import X.C17618VbA;
import X.C20995X8s;
import X.DbT;
import X.JTT;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.TextView;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class AccessibleTextView extends TextView implements C20995X8s {
    public final C14749U7g A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccessibleTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        C14749U7g u7g = new C14749U7g(this);
        this.A00 = u7g;
        C14749U7g.A04 = -1;
        u7g.A00 = false;
        03v.A0B(this, u7g);
    }

    public final void A00(String str) {
        C14749U7g u7g = this.A00;
        C14749U7g.A00(u7g);
        List list = u7g.A03;
        if (0 < list.size()) {
            ((C17618VbA) list.get(0)).A04 = str;
        }
    }

    public float getTextSize() {
        Layout layout = getLayout();
        if (layout == null) {
            return 0.0f;
        }
        float textSize = layout.getPaint().getTextSize();
        if (textSize > 0.0f) {
            return textSize;
        }
        throw DbT.A0m();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AccessibleTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AccessibleTextView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public /* synthetic */ AccessibleTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }
}
