package com.instagram.leadgen.core.ui;

import X.0qQ;
import X.0sP;
import X.AnonymousClass7TE;
import X.C16017Un5;
import X.JTT;
import X.W33;
import X.W7Z;
import android.content.Context;
import android.util.AttributeSet;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class LeadGenFormZipView extends C16017Un5 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LeadGenFormZipView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, (0sP) null);
        0qQ.A0B(context, 1);
    }

    public final void A0G(LeadGenFormBaseQuestion leadGenFormBaseQuestion, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(leadGenFormBaseQuestion, 0);
        super.A0G(leadGenFormBaseQuestion, z, z2, z3);
        IgFormField igFormField = this.A04;
        igFormField.setText(leadGenFormBaseQuestion.A00);
        setLastKnownInput(leadGenFormBaseQuestion.A00);
        igFormField.A0G(new W7Z(6, leadGenFormBaseQuestion, this));
        FLQ(W33.A00(AnonymousClass7TE.A0S(this), getCurrentCountryCode()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002e, code lost:
        if (r1 == false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FLQ(X.N4R r4) {
        /*
            r3 = this;
            r0 = 0
            X.0qQ.A0B(r4, r0)
            super.FLQ(r4)
            com.instagram.common.ui.base.IgTextView r1 = r3.A03
            java.lang.String r0 = r4.A03()
            r1.setText(r0)
            com.instagram.igds.components.form.IgFormField r2 = r3.A04
            java.text.SimpleDateFormat r0 = X.W33.A04
            java.lang.String r1 = r4.A03()     // Catch:{ IllegalArgumentException -> 0x0030 }
            r0 = 0
            com.facebook.common.locale.Country r0 = com.facebook.common.locale.Country.A00(r0, r1)     // Catch:{ IllegalArgumentException -> 0x0030 }
            if (r0 == 0) goto L_0x0030
            com.google.common.collect.ImmutableSet r1 = X.C21351XYe.A02
            java.util.Locale r0 = r0.A00
            java.lang.String r0 = r0.getCountry()
            boolean r1 = r1.contains(r0)
            r0 = 528497(0x81071, float:7.40582E-40)
            if (r1 != 0) goto L_0x0031
        L_0x0030:
            r0 = 3
        L_0x0031:
            r2.setInputType(r0)
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r1 = r3.A00
            if (r1 == 0) goto L_0x003d
            java.lang.String r0 = r1.A00
            r3.A0F(r1, r0)
        L_0x003d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.leadgen.core.ui.LeadGenFormZipView.FLQ(X.N4R):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LeadGenFormZipView(Context context, AttributeSet attributeSet, int i, 0sP r5) {
        super(context, attributeSet, i, r5);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LeadGenFormZipView(Context context) {
        super(context, (AttributeSet) null, 0, (0sP) null);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LeadGenFormZipView(Context context, AttributeSet attributeSet, int i, 0sP r7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, JTT.A01(i2, i), (i2 & 8) != 0 ? null : r7);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LeadGenFormZipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, (0sP) null);
        0qQ.A0B(context, 1);
    }
}
