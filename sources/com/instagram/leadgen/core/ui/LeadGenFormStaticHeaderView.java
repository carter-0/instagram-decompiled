package com.instagram.leadgen.core.ui;

import X.0qQ;
import X.AnonymousClass0iw;
import X.DbT;
import X.DbU;
import X.JTT;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.leadgen.core.model.LeadGenProfileContentInfo;
import com.instagram.leadgen.core.model.LeadGenTrustSignalsPayload;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class LeadGenFormStaticHeaderView extends ConstraintLayout {
    public final IgTextView A00;
    public final IgTextView A01;
    public final CircularImageView A02;
    public final IgImageView A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LeadGenFormStaticHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        View.inflate(context, R.layout.lead_gen_view_form_static_header, this);
        this.A02 = DbU.A0X(this, R.id.static_header_profile_image);
        this.A03 = DbT.A0b(this, R.id.static_header_info_icon);
        this.A00 = DbT.A0a(this, R.id.static_header_business_name);
        this.A01 = DbT.A0a(this, R.id.static_header_business_info_text);
    }

    public final void A0D(AnonymousClass0iw r3, LeadGenProfileContentInfo leadGenProfileContentInfo) {
        this.A00.setText(leadGenProfileContentInfo.A02);
        this.A02.setUrl(leadGenProfileContentInfo.A00, r3);
        LeadGenTrustSignalsPayload leadGenTrustSignalsPayload = leadGenProfileContentInfo.A01;
        if (leadGenTrustSignalsPayload != null) {
            setUpHeaderFromPayload(leadGenTrustSignalsPayload);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        if (r1 == 0) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setUpHeaderFromPayload(com.instagram.leadgen.core.model.LeadGenTrustSignalsPayload r6) {
        /*
            r5 = this;
            X.Uy7 r0 = r6.A00()
            int r3 = r0.ordinal()
            r2 = 1
            r1 = 4
            r0 = 0
            if (r3 == r1) goto L_0x0058
            if (r3 != r2) goto L_0x0036
            com.instagram.leadgen.core.model.LeadGenTrustSignal r1 = r6.A02
            if (r1 == 0) goto L_0x0036
            java.lang.String r1 = r1.A02
            if (r1 == 0) goto L_0x0036
            java.lang.Integer r3 = X.00y.A0l(r1)
            if (r3 == 0) goto L_0x0036
            int r1 = r3.intValue()
            if (r1 <= 0) goto L_0x0036
            android.content.Context r2 = r5.getContext()
            android.content.res.Resources r0 = X.AnonymousClass7TF.A0A(r2)
            java.lang.String r1 = X.C253673rC.A03(r0, r3)
            r0 = 2131964825(0x7f133399, float:1.9566443E38)
            java.lang.String r0 = X.DbW.A0h(r2, r1, r0)
        L_0x0036:
            boolean r4 = r6.A01()
            com.instagram.common.ui.base.IgTextView r3 = r5.A01
            r3.setText(r0)
            r2 = 0
            if (r0 == 0) goto L_0x0049
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x004b
        L_0x0049:
            r0 = 8
        L_0x004b:
            r3.setVisibility(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r5.A03
            if (r4 != 0) goto L_0x0054
            r2 = 8
        L_0x0054:
            r0.setVisibility(r2)
            return
        L_0x0058:
            com.instagram.leadgen.core.model.LeadGenTrustSignal r1 = r6.A00
            if (r1 == 0) goto L_0x0036
            java.lang.String r0 = r1.A02
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.leadgen.core.ui.LeadGenFormStaticHeaderView.setUpHeaderFromPayload(com.instagram.leadgen.core.model.LeadGenTrustSignalsPayload):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LeadGenFormStaticHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LeadGenFormStaticHeaderView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public /* synthetic */ LeadGenFormStaticHeaderView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }
}
