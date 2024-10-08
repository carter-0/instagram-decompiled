package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.igds.components.checkbox.IgdsCheckBox;
import com.instagram.user.model.User;
import java.util.Set;

/* renamed from: X.KXa  reason: case insensitive filesystem */
public final class C62038KXa extends K6S {
    public static final String __redex_internal_original_name = "ShareToFriendsStoryAudiencePickerFragment";
    public IngestSessionShim A00;
    public IgdsButton A01;
    public boolean A02;
    public boolean A03;
    public final AnonymousClass0eM A04 = C227642jf.A02(this);

    public final void CtJ(C46448DfA dfA) {
    }

    public final String getModuleName() {
        return "audience_selection";
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.KXa, X.07Z, androidx.fragment.app.Fragment, java.lang.Object, X.K6S] */
    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView A0R = AnonymousClass7TG.A0R(requireView(), R.id.audience_picker_disclaimer_text);
        SpannableStringBuilder A0E = C51965G9l.A0E();
        String A0m = DbU.A0m(this, 2131973578);
        Context A002 = K6S.A00(A0E, this, A0m, 2131973583);
        AnonymousClass7AV.A05(A0E, new C2806552w(DbV.A0n(A002, 2Yu.A0D(A002))), A0m);
        A0R.setText(A0E);
        C64273LXz.A00(A0R, 52, this);
        IgdsButton A0b = DbU.A0b(requireView(), R.id.done_button);
        A0b.setEnabled(false);
        A0b.setText(2131973082);
        A0b.setVisibility(0);
        C64273LXz.A00(A0b, 53, this);
        this.A01 = A0b;
        A09().A00 = new C63870L9z(AnonymousClass7TE.A0S(view), (String) null, (String) null, 0, false);
        K6S.A02(this);
        Context requireContext = requireContext();
        0gy A003 = AnonymousClass07i.A00(this);
        1NY A0b2 = AnonymousClass7TG.A0b(AnonymousClass7TF.A0L(this.A04, 0));
        A0b2.A0A("friendships/share_to_friends_story_suggested_users/");
        A0b2.A9m(C66579MXk.A00(41), "share_to_friends_story_share_sheet");
        1OC A0S = DbU.A0S(A0b2, C43838CFe.class, D2W.class);
        C61500KAf.A00(A0S, this, 34);
        1ES.A00(requireContext, A003, A0S);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public final void A0C(IgdsCheckBox igdsCheckBox, C61036Jva jva) {
        Context requireContext;
        int i;
        AnonymousClass7TG.A1N(jva, igdsCheckBox);
        User user = jva.A02;
        if (user.A2R()) {
            requireContext = requireContext();
            i = 2131973587;
        } else {
            Boolean Ajy = user.A03.Ajy();
            if (Ajy == null || !Ajy.booleanValue()) {
                requireContext = requireContext();
                i = 2131973579;
            } else {
                super.A0C(igdsCheckBox, jva);
                Activity rootActivity = getRootActivity();
                if (rootActivity != null) {
                    0nA.A0J(rootActivity);
                }
                K9H A09 = A09();
                Set set = this.A03.A03;
                A09.A03(set.size());
                A09().A02();
                IgdsButton igdsButton = this.A01;
                if (igdsButton != null) {
                    igdsButton.setEnabled(AnonymousClass7TF.A1R(set.size()));
                    return;
                }
                return;
            }
        }
        String A0b = DbY.A0b(requireContext, user, i);
        0qQ.A07(A0b);
        C358248ab A0U = DbW.A0U(this);
        A0U.A09(2131973568);
        A0U.A0q(A0b);
        Dba.A1L(A0U);
    }

    public final void configureActionBar(2da r4) {
        DbX.A1A(new C64273LXz(this, 51), K6S.A01(r4, JTT.A0B(this, r4).getString(2131973582)), r4);
    }

    public final boolean onBackPressed() {
        DbT.A1K(this);
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1005057803);
        C62038KXa.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = (IngestSessionShim) requireArguments.getParcelable("bundle_extra_ingest_session");
        this.A02 = requireArguments.getBoolean("ShareToFriendsStoryAudiencePickerFragment.ARGUMENTS_IS_FROM_SHARECUT", false);
        this.A03 = requireArguments.getBoolean("ShareToFriendsStoryAudiencePickerFragment.ARGUMENTS_IS_PARTIAL_SCREEN_BOTTOMSHEET", false);
        this.A02 = "share_to_friends_story_share_sheet";
        AnonymousClass0fD.A09(1731084547, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(541981231);
        LayoutInflater layoutInflater2 = layoutInflater;
        this.A00 = new K9H(DbT.A06(this, layoutInflater2, 0), this, this, this, this, this, A0B(), true, true);
        View inflate = layoutInflater2.inflate(R.layout.layout_audience_picker, viewGroup, false);
        if (this.A03) {
            ViewGroup.LayoutParams layoutParams = AnonymousClass7TF.A0G(inflate, R.id.main_container).getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && layoutParams != null) {
                layoutParams.height = (int) (((double) AnonymousClass0nB.A00(requireContext())) * 0.6d);
            }
        }
        AnonymousClass0fD.A09(-24950860, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-559687641);
        super.onDestroyView();
        this.A01 = null;
        AnonymousClass0fD.A09(-37664739, A022);
    }
}
