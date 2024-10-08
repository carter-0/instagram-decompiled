package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.ui.base.IgTextView;

public final class UZ8 extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "PromoteAudienceSizeEducationBottomSheetFragment";
    public SpannableStringBuilder A00;
    public IgTextView A01;
    public PromoteData A02;
    public IgTextView A03;
    public String A04;
    public final String A05 = "https://www.facebook.com/business/help/1665333080167380?id=176276233019487";
    public final String A06 = AnonymousClass000.A00(630);
    public final String A07 = "https://www.facebook.com/business/help/283579896000936";
    public final AnonymousClass0eM A08 = C227642jf.A02(this);
    public final String A09 = "promote_audience_size_education_bottom_sheet_fragment";

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005d, code lost:
        if (r0 != null) goto L_0x005f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r6, android.os.Bundle r7) {
        /*
            r5 = this;
            r3 = 0
            X.0qQ.A0B(r6, r3)
            super.onViewCreated(r6, r7)
            com.instagram.business.promote.model.PromoteData r0 = X.XAI.A00(r5)
            r5.A02 = r0
            android.widget.TextView r1 = X.Dba.A06(r6)
            java.lang.String r0 = r5.A04
            r4 = 0
            if (r0 != 0) goto L_0x0020
            java.lang.String r2 = "title"
        L_0x0018:
            X.0qQ.A0F(r2)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0020:
            r1.setText(r0)
            r0 = 2131428824(0x7f0b05d8, float:1.8479303E38)
            com.instagram.common.ui.base.IgTextView r0 = X.DbT.A0a(r6, r0)
            r5.A01 = r0
            r0 = 2131428832(0x7f0b05e0, float:1.847932E38)
            com.instagram.common.ui.base.IgTextView r2 = X.DbT.A0a(r6, r0)
            r5.A03 = r2
            if (r2 == 0) goto L_0x0046
            r0 = 2131970202(0x7f13489a, float:1.9577348E38)
            java.lang.String r1 = r5.getString(r0)
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r1)
            r2.setText(r0)
        L_0x0046:
            com.instagram.business.promote.model.PromoteData r0 = r5.A02
            if (r0 != 0) goto L_0x004d
            java.lang.String r2 = "promoteData"
            goto L_0x0018
        L_0x004d:
            com.instagram.business.promote.model.PromoteAudienceInfo r0 = r0.A0q
            com.instagram.api.schemas.AdvantageAudienceData r0 = r0.A02
            if (r0 == 0) goto L_0x0057
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r4 = r0.Aa9()
        L_0x0057:
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r1 = com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus.ON
            com.instagram.common.ui.base.IgTextView r0 = r5.A03
            if (r4 != r1) goto L_0x0093
            if (r0 == 0) goto L_0x0062
        L_0x005f:
            r0.setVisibility(r3)
        L_0x0062:
            r0 = 2131970207(0x7f13489f, float:1.9577359E38)
            java.lang.String r1 = X.DbU.A0m(r5, r0)
            java.lang.String r0 = r5.A07
            r5.A00(r1, r0)
            r0 = 2131970206(0x7f13489e, float:1.9577357E38)
            java.lang.String r1 = X.DbU.A0m(r5, r0)
            java.lang.String r0 = r5.A06
            r5.A00(r1, r0)
            r0 = 2131970205(0x7f13489d, float:1.9577355E38)
            java.lang.String r1 = X.DbU.A0m(r5, r0)
            java.lang.String r0 = r5.A05
            r5.A00(r1, r0)
            com.instagram.common.ui.base.IgTextView r1 = r5.A01
            java.lang.String r2 = "bodyView"
            if (r1 == 0) goto L_0x0018
            android.text.SpannableStringBuilder r0 = r5.A00
            if (r0 != 0) goto L_0x0098
            java.lang.String r2 = "body"
            goto L_0x0018
        L_0x0093:
            if (r0 == 0) goto L_0x0062
            r3 = 8
            goto L_0x005f
        L_0x0098:
            r1.setText(r0)
            com.instagram.common.ui.base.IgTextView r0 = r5.A01
            if (r0 == 0) goto L_0x0018
            X.DbT.A1H(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UZ8.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    private final void A00(String str, String str2) {
        SpannableStringBuilder spannableStringBuilder = this.A00;
        if (spannableStringBuilder == null) {
            0qQ.A0F("body");
            throw AnonymousClass00P.createAndThrow();
        }
        Context requireContext = requireContext();
        0lg A0X = DbT.A0X(this.A08);
        String A012 = SQU.A01(requireContext(), str2);
        0qQ.A07(A012);
        AnonymousClass7AV.A02(spannableStringBuilder, new C69192Ngq(requireContext, A0X, (OAJ) null, A012, Dbb.A04(this)), str);
        this.A00 = spannableStringBuilder;
    }

    public final String getModuleName() {
        return this.A09;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A08);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1471947060);
        UZ8.super.onCreate(bundle);
        this.A04 = getString(2131970204);
        this.A00 = new SpannableStringBuilder(getString(2131970203));
        AnonymousClass0fD.A09(-567529860, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1760138725);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_audience_size_education_bottom_sheet_view, viewGroup, false);
        AnonymousClass0fD.A09(2105866232, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1979009073);
        super.onDestroyView();
        this.A03 = null;
        AnonymousClass0fD.A09(-566483291, A022);
    }
}
