package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.headline.IgdsHeadline;
import java.util.Locale;

public final class E46 extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "LeadGenFlaggedFormErrorFragment";
    public WYZ A00;
    public Long A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);

    public final String getModuleName() {
        return "lead_gen_flagged_form_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        UserSession A0l = AnonymousClass7TE.A0l(this.A02);
        FragmentActivity activity = getActivity();
        0qQ.A0B(A0l, 1);
        String A16 = AnonymousClass7TE.A16(requireContext, 2131964820);
        String A0c = DbY.A0c(requireContext, A16, 2131964823);
        String A162 = AnonymousClass7TE.A16(requireContext, 2131964821);
        SpannableStringBuilder A012 = W3L.A01(requireContext, A0c);
        AnonymousClass7AV.A05(A012, new C48049ESs((Activity) activity, requireContext, A0l, "https://transparency.fb.com/policies/community-standards/", requireContext.getColor(2Yu.A06(requireContext))), A16);
        A012.append(System.getProperty("line.separator"));
        A012.append(System.getProperty("line.separator"));
        A012.append(A162);
        ((IgdsHeadline) AnonymousClass7TF.A0F(view, R.id.warning_headline)).setBody((CharSequence) A012);
        ((C3021461u) AnonymousClass7TF.A0F(view, R.id.action_bottom_button)).setPrimaryAction(getString(2131964822), FP1.A00(this, 63));
        FP1.A01(AnonymousClass7TF.A0G(view, R.id.learn_more_button), 64, this);
        WYZ wyz = this.A00;
        if (wyz == null) {
            DbS.A12();
            throw AnonymousClass00P.createAndThrow();
        } else {
            WYZ.A00(wyz, this.A01, "lead_gen_flagged_form", "flagged_form_warning_screen_impression", "impression", DbT.A12(Locale.ROOT, "FLAGGED_FORM")).Cgf();
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final boolean onBackPressed() {
        WYZ wyz = this.A00;
        if (wyz == null) {
            DbS.A12();
            throw AnonymousClass00P.createAndThrow();
        }
        WYZ.A00(wyz, this.A01, "lead_gen_flagged_form", "cancel", "click", DbT.A12(Locale.ROOT, "FLAGGED_FORM")).Cgf();
        DbX.A0N(requireActivity(), this.A02).A06();
        return true;
    }

    public final void configureActionBar(2da r3) {
        Dbb.A1J(r3);
        r3.ErG(new AnonymousClass3Jb(DbV.A0K()));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1431128638);
        E46.super.onCreate(bundle);
        AnonymousClass0eM r1 = this.A02;
        this.A01 = DbZ.A0d(DbX.A0m(AnonymousClass7TE.A0l(r1)).getFbidV2());
        this.A00 = new WYZ(this, AnonymousClass7TE.A0l(r1));
        AnonymousClass0fD.A09(-96315852, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-873153192);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.lead_gen_flagged_form_view, viewGroup, false);
        AnonymousClass0fD.A09(-1207172609, A022);
        return inflate;
    }
}
