package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimer;
import com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimerBody;
import com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimerBodyUrlRanges;
import com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimerCheckbox;
import com.instagram.leadgen.core.model.privacypolicy.LeadGenPrivacyPolicy;
import java.util.ArrayList;
import java.util.List;

public final class UZ0 extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "LeadGenSubmissionBottomSheetFragment";
    public View A00;
    public NestedScrollView A01;
    public IgLinearLayout A02;
    public IgTextView A03;
    public final Rect A04 = new Rect();
    public final ViewTreeObserver.OnPreDrawListener A05 = new WCE(this, 4);
    public final AnonymousClass0eM A06;

    public final String getModuleName() {
        return "lead_gen_submission_bottom_sheet";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        LeadGenPrivacyPolicy leadGenPrivacyPolicy;
        ViewTreeObserver viewTreeObserver;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = (NestedScrollView) view.requireViewById(R.id.scroll_view);
        AnonymousClass0eM r4 = this.A06;
        DbV.A1F(getViewLifecycleOwner(), ((C14776U8m) r4.getValue()).A01, new C20786Wyx(this, 25), 11);
        if (00l.A0W(((C14776U8m) r4.getValue()).A05)) {
            JTS.A0y(view, R.id.personal_info_group);
        } else {
            DbU.A0G(view, R.id.personal_info_body).setText(((C14776U8m) r4.getValue()).A05);
        }
        LeadGenCustomDisclaimer leadGenCustomDisclaimer = ((C14776U8m) r4.getValue()).A03;
        int i = 8;
        if (leadGenCustomDisclaimer == null) {
            Dbb.A0t(view, R.id.custom_disclaimer_group, 8);
        } else {
            TextView A0R = AnonymousClass7TG.A0R(view, R.id.custom_disclaimer_title);
            String str2 = leadGenCustomDisclaimer.A01;
            A0R.setText(str2);
            if (str2 != null && C51966G9m.A1X(str2)) {
                i = 0;
            }
            A0R.setVisibility(i);
            TextView A0R2 = AnonymousClass7TG.A0R(view, R.id.custom_disclaimer_body);
            DbT.A1H(A0R2);
            LeadGenCustomDisclaimerBody leadGenCustomDisclaimerBody = leadGenCustomDisclaimer.A00;
            Context A0S = AnonymousClass7TE.A0S(view);
            String str3 = leadGenCustomDisclaimerBody.A00;
            AnonymousClass0eM r0 = 0mp.A09;
            if (str3 == null) {
                str3 = "";
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
            for (LeadGenCustomDisclaimerBodyUrlRanges leadGenCustomDisclaimerBodyUrlRanges : leadGenCustomDisclaimerBody.A01) {
                int i2 = leadGenCustomDisclaimerBodyUrlRanges.A01;
                int i3 = i2 + leadGenCustomDisclaimerBodyUrlRanges.A00;
                if (i3 < spannableStringBuilder.length() && (str = leadGenCustomDisclaimerBodyUrlRanges.A02) != null) {
                    spannableStringBuilder.setSpan(new U2J(A0S, DbT.A09(str), ((C14776U8m) r4.getValue()).A02, false), i2, i3, 33);
                }
            }
            A0R2.setText(spannableStringBuilder);
            this.A02 = (IgLinearLayout) view.requireViewById(R.id.custom_disclaimer_checkbox_container);
            for (LeadGenCustomDisclaimerCheckbox leadGenCustomDisclaimerCheckbox : leadGenCustomDisclaimer.A02) {
                IgLinearLayout igLinearLayout = this.A02;
                if (igLinearLayout != null) {
                    View inflate = getLayoutInflater().inflate(R.layout.lead_gen_view_checkbox_row, this.A02, false);
                    inflate.setTag(leadGenCustomDisclaimerCheckbox.A00);
                    TextView A0R3 = AnonymousClass7TG.A0R(inflate, R.id.checkbox_title);
                    String str4 = leadGenCustomDisclaimerCheckbox.A01;
                    if (str4 == null) {
                        str4 = "";
                    }
                    String A0m = DbU.A0m(this, 2131964676);
                    if (!leadGenCustomDisclaimerCheckbox.A03) {
                        str4 = C66580MXl.A10(str4, A0m);
                    }
                    A0R3.setText(str4);
                    CompoundButton compoundButton = (CompoundButton) AnonymousClass7TF.A0F(inflate, R.id.checkbox);
                    C18922WCz.A00(compoundButton, this, leadGenCustomDisclaimerCheckbox, 2);
                    compoundButton.setChecked(leadGenCustomDisclaimerCheckbox.A02);
                    igLinearLayout.addView(inflate);
                }
            }
        }
        int i4 = R.id.privacy_policy_text_view;
        IgTextView A0a = DbT.A0a(view, R.id.privacy_policy_text_view);
        this.A03 = A0a;
        if (!(A0a == null || (viewTreeObserver = A0a.getViewTreeObserver()) == null)) {
            viewTreeObserver.addOnPreDrawListener(this.A05);
        }
        IgTextView igTextView = this.A03;
        if (!(igTextView == null || (leadGenPrivacyPolicy = ((C14776U8m) r4.getValue()).A04) == null)) {
            VEQ.A00(igTextView, ((C14776U8m) r4.getValue()).A02, leadGenPrivacyPolicy, false);
        }
        if (C51966G9m.A1X(((C14776U8m) r4.getValue()).A05)) {
            i4 = R.id.personal_info_title;
        } else if (((C14776U8m) r4.getValue()).A03 != null) {
            i4 = R.id.custom_disclaimer_title;
        }
        this.A00 = view.requireViewById(i4);
    }

    public final List A00() {
        List<LeadGenCustomDisclaimerCheckbox> list;
        C14776U8m u8m = (C14776U8m) this.A06.getValue();
        LeadGenCustomDisclaimer leadGenCustomDisclaimer = u8m.A03;
        if (leadGenCustomDisclaimer == null || (list = leadGenCustomDisclaimer.A02) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (LeadGenCustomDisclaimerCheckbox leadGenCustomDisclaimerCheckbox : list) {
            C13989Tnp.A1R(leadGenCustomDisclaimerCheckbox.A00, arrayList, u8m.A06);
        }
        return arrayList;
    }

    public final void A01() {
        AnonymousClass0eM r3 = this.A06;
        String str = (String) 00k.A0O(JTO.A16(((C14776U8m) r3.getValue()).A07), 0);
        if (str != null) {
            AnonymousClass7TF.A1O(((C14776U8m) r3.getValue()).A08, true);
            IgLinearLayout igLinearLayout = this.A02;
            if (igLinearLayout != null) {
                igLinearLayout.post(new C20229WnT(this, str));
            }
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return ((C14776U8m) this.A06.getValue()).A02;
    }

    public UZ0() {
        C20696WxS wxS = new C20696WxS(this, 48);
        AnonymousClass0eM A002 = C20696WxS.A00(new C20696WxS(this, 45), 0eO.A02, 46);
        this.A06 = new C227862kA(new C20696WxS(A002, 47), wxS, new C20612Wvt(0, (Object) null, A002), new 0Yh(C14776U8m.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(768223807);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.fragment_lead_gen_submission_bottom_sheet, false);
        AnonymousClass0fD.A09(-1070941881, A022);
        return A0D;
    }

    public final void onDestroyView() {
        ViewTreeObserver viewTreeObserver;
        int A022 = AnonymousClass0fD.A02(1207258141);
        super.onDestroyView();
        IgTextView igTextView = this.A03;
        if (!(igTextView == null || (viewTreeObserver = igTextView.getViewTreeObserver()) == null)) {
            viewTreeObserver.removeOnPreDrawListener(this.A05);
        }
        this.A03 = null;
        this.A01 = null;
        this.A00 = null;
        this.A02 = null;
        AnonymousClass0fD.A09(2128287868, A022);
    }
}
