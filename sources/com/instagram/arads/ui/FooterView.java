package com.instagram.arads.ui;

import X.0qQ;
import X.DbT;
import X.JTT;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class FooterView extends ConstraintLayout {
    public final IgLinearLayout A00;
    public final IgTextView A01;
    public final IgTextView A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FooterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        LayoutInflater.from(context).inflate(R.layout.arads_camera_footer, this);
        this.A02 = DbT.A0a(this, R.id.footer_title);
        this.A01 = DbT.A0a(this, R.id.footer_subtitle);
        this.A00 = (IgLinearLayout) requireViewById(R.id.footer_background);
    }

    public final int getCurrentSubTitleColor() {
        return this.A01.getCurrentTextColor();
    }

    public final int getCurrentTitleColor() {
        return this.A02.getCurrentTextColor();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r5.length() == 0) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setFooterText(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0007
            com.instagram.common.ui.base.IgTextView r0 = r4.A02
            r0.setText(r5)
        L_0x0007:
            com.instagram.common.ui.base.IgTextView r3 = r4.A02
            r2 = 0
            if (r5 == 0) goto L_0x0013
            int r1 = r5.length()
            r0 = 0
            if (r1 != 0) goto L_0x0015
        L_0x0013:
            r0 = 8
        L_0x0015:
            r3.setVisibility(r0)
            if (r6 == 0) goto L_0x001f
            com.instagram.common.ui.base.IgTextView r0 = r4.A01
            r0.setText(r6)
        L_0x001f:
            com.instagram.common.ui.base.IgTextView r1 = r4.A01
            if (r6 == 0) goto L_0x0029
            int r0 = r6.length()
            if (r0 != 0) goto L_0x002b
        L_0x0029:
            r2 = 8
        L_0x002b:
            r1.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.arads.ui.FooterView.setFooterText(java.lang.String, java.lang.String):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FooterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FooterView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public /* synthetic */ FooterView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }
}
