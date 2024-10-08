package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

public final class UZ9 extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "PromoteAudienceSizeEducationBottomSheetFragmentV2";
    public SpannableStringBuilder A00;
    public IgTextView A01;
    public IgTextView A02;
    public String A03;
    public final String A04 = "https://www.facebook.com/business/help/1665333080167380?id=176276233019487";
    public final String A05 = AnonymousClass000.A00(630);
    public final String A06 = "https://www.facebook.com/business/help/283579896000936";
    public final AnonymousClass0eM A07 = C227642jf.A02(this);
    public final AnonymousClass0eM A08 = new C227862kA(new C20694WxQ(this, 35), new C20694WxQ(this, 36), new C41566AwY(19, (Object) null, this), new 0Yh(U92.class));
    public final String A09 = "promote_audience_size_education_bottom_sheet_fragment";

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0045, code lost:
        if (r0 != null) goto L_0x0047;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r5, android.os.Bundle r6) {
        /*
            r4 = this;
            r3 = 0
            X.0qQ.A0B(r5, r3)
            super.onViewCreated(r5, r6)
            android.widget.TextView r1 = X.Dba.A06(r5)
            java.lang.String r0 = r4.A03
            r1.setText(r0)
            r0 = 2131428824(0x7f0b05d8, float:1.8479303E38)
            com.instagram.common.ui.base.IgTextView r0 = X.DbT.A0a(r5, r0)
            r4.A01 = r0
            r0 = 2131428832(0x7f0b05e0, float:1.847932E38)
            com.instagram.common.ui.base.IgTextView r2 = X.DbT.A0a(r5, r0)
            r4.A02 = r2
            if (r2 == 0) goto L_0x0033
            r0 = 2131970202(0x7f13489a, float:1.9577348E38)
            java.lang.String r1 = r4.getString(r0)
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r1)
            r2.setText(r0)
        L_0x0033:
            X.0eM r0 = r4.A08
            X.ULv r0 = X.U92.A00(r0)
            com.instagram.api.schemas.AdvantageAudienceData r0 = r0.A02
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r2 = X.C13991Tnr.A0L(r0)
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r1 = com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus.ON
            com.instagram.common.ui.base.IgTextView r0 = r4.A02
            if (r2 != r1) goto L_0x007f
            if (r0 == 0) goto L_0x004a
        L_0x0047:
            r0.setVisibility(r3)
        L_0x004a:
            r0 = 2131970207(0x7f13489f, float:1.9577359E38)
            java.lang.String r1 = X.DbU.A0m(r4, r0)
            java.lang.String r0 = r4.A06
            r4.A00(r1, r0)
            r0 = 2131970206(0x7f13489e, float:1.9577357E38)
            java.lang.String r1 = X.DbU.A0m(r4, r0)
            java.lang.String r0 = r4.A05
            r4.A00(r1, r0)
            r0 = 2131970205(0x7f13489d, float:1.9577355E38)
            java.lang.String r1 = X.DbU.A0m(r4, r0)
            java.lang.String r0 = r4.A04
            r4.A00(r1, r0)
            com.instagram.common.ui.base.IgTextView r1 = r4.A01
            if (r1 == 0) goto L_0x0077
            android.text.SpannableStringBuilder r0 = r4.A00
            r1.setText(r0)
        L_0x0077:
            com.instagram.common.ui.base.IgTextView r0 = r4.A01
            if (r0 == 0) goto L_0x007e
            X.DbT.A1H(r0)
        L_0x007e:
            return
        L_0x007f:
            if (r0 == 0) goto L_0x004a
            r3 = 8
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UZ9.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    private final void A00(String str, String str2) {
        SpannableStringBuilder spannableStringBuilder = this.A00;
        if (spannableStringBuilder != null) {
            Context requireContext = requireContext();
            0lg A0X = DbT.A0X(this.A07);
            String A012 = SQU.A01(requireContext(), str2);
            0qQ.A07(A012);
            AnonymousClass7AV.A02(spannableStringBuilder, new C69192Ngq(requireContext, A0X, (OAJ) null, A012, Dbb.A04(this)), str);
            this.A00 = spannableStringBuilder;
        }
    }

    public final String getModuleName() {
        return this.A09;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1813173780);
        UZ9.super.onCreate(bundle);
        this.A03 = getString(2131970204);
        this.A00 = new SpannableStringBuilder(getString(2131970203));
        AnonymousClass0fD.A09(170418715, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1288940663);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_audience_size_education_bottom_sheet_view, viewGroup, false);
        AnonymousClass0fD.A09(536070274, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1996764323);
        super.onDestroyView();
        this.A03 = null;
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
        AnonymousClass0fD.A09(1705181844, A022);
    }
}
