package com.instagram.leadgen.core.ui;

import X.0qQ;
import X.0sP;
import X.AnonymousClass7TE;
import X.C16015Umx;
import X.JTT;
import X.W33;
import android.content.Context;
import android.util.AttributeSet;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class LeadGenFormPrismZipView extends C16015Umx {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LeadGenFormPrismZipView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (0sP) null);
        0qQ.A0B(context, 1);
    }

    public final void A0G(LeadGenFormBaseQuestion leadGenFormBaseQuestion, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(leadGenFormBaseQuestion, 0);
        super.A0G(leadGenFormBaseQuestion, z, z2, z3);
        FLQ(W33.A00(AnonymousClass7TE.A0S(this), getCurrentCountryCode()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003d, code lost:
        if (r1 == false) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FLQ(X.N4R r6) {
        /*
            r5 = this;
            r0 = 0
            X.0qQ.A0B(r6, r0)
            r5.A00 = r6
            android.content.Context r4 = r5.getContext()
            r0 = 2131964683(0x7f13330b, float:1.9566155E38)
            java.lang.String r3 = X.AnonymousClass7TE.A16(r4, r0)
            com.instagram.igds.components.form.IgFormField r2 = r5.A02
            java.lang.String r1 = r6.A03()
            r0 = 2131964685(0x7f13330d, float:1.9566159E38)
            java.lang.String r0 = X.DbV.A0u(r4, r3, r1, r0)
            r2.setComboFieldText(r1, r0)
            java.text.SimpleDateFormat r0 = X.W33.A04
            java.lang.String r1 = r6.A03()     // Catch:{ IllegalArgumentException -> 0x003f }
            r0 = 0
            com.facebook.common.locale.Country r0 = com.facebook.common.locale.Country.A00(r0, r1)     // Catch:{ IllegalArgumentException -> 0x003f }
            if (r0 == 0) goto L_0x003f
            com.google.common.collect.ImmutableSet r1 = X.C21351XYe.A02
            java.util.Locale r0 = r0.A00
            java.lang.String r0 = r0.getCountry()
            boolean r1 = r1.contains(r0)
            r0 = 528497(0x81071, float:7.40582E-40)
            if (r1 != 0) goto L_0x0040
        L_0x003f:
            r0 = 3
        L_0x0040:
            r2.setInputType(r0)
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r1 = r5.A00
            if (r1 == 0) goto L_0x004c
            java.lang.String r0 = r1.A00
            r5.A0F(r1, r0)
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.leadgen.core.ui.LeadGenFormPrismZipView.FLQ(X.N4R):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LeadGenFormPrismZipView(Context context, AttributeSet attributeSet, int i, 0sP r5) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A01 = r5;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LeadGenFormPrismZipView(Context context) {
        this(context, (AttributeSet) null, 0, (0sP) null);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LeadGenFormPrismZipView(Context context, AttributeSet attributeSet, int i, 0sP r7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, JTT.A01(i2, i), (i2 & 8) != 0 ? null : r7);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LeadGenFormPrismZipView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, (0sP) null);
        0qQ.A0B(context, 1);
    }
}
