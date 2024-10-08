package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.ui.widget.stackedavatar.StackedAvatarView;

public final class K4U extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "InstantAvatarsBottomSheetFragment";
    public TextView A00;
    public TextView A01;
    public TextView A02;
    public C267624bv A03;
    public IgdsButton A04;
    public StackedAvatarView A05;
    public String A06;
    public final AnonymousClass0eM A07 = C227642jf.A02(this);
    public final AnonymousClass0eM A08;

    public final String getModuleName() {
        return "instant_avatars_bottom_sheet_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        this.A05 = (StackedAvatarView) view2.requireViewById(R.id.stacked_avatar_view);
        this.A02 = DbU.A0G(view2, R.id.instant_avatar_upsell_title);
        this.A01 = DbU.A0G(view2, R.id.instant_avatar_upsell_subtitle);
        this.A04 = DbU.A0b(view2, R.id.instant_avatar_upsell_cta_button);
        this.A00 = DbU.A0G(view2, R.id.instant_avatar_upsell_secondary_cta_button);
        String A16 = AnonymousClass7TE.A16(requireContext(), 2131964394);
        String A162 = AnonymousClass7TE.A16(requireContext(), 2131964396);
        SpannableStringBuilder append = DbZ.A0B(A16, A162).append(".");
        C46679Dj8 dj8 = new C46679Dj8(this, 0);
        0qQ.A0A(append);
        AnonymousClass7AV.A05(append, dj8, A162);
        StackedAvatarView stackedAvatarView = this.A05;
        if (stackedAvatarView != null) {
            stackedAvatarView.setBackAvatarUrl(DbX.A0l(AnonymousClass0t1.A01, this.A07).Bh3(), this);
            stackedAvatarView.setFrontAvatarDrawable(new C59921Jbk(requireContext(), (Drawable) null, requireContext().getDrawable(R.drawable.ig_avatar_assets_instant_avatar_nux_2), (String) null, R.dimen.action_bar_item_spacing_left, 0, 0, 0, 1528, false));
        }
        TextView textView = this.A02;
        if (textView != null) {
            DbT.A18(requireContext(), textView, 2131964397);
        }
        TextView textView2 = this.A01;
        if (textView2 != null) {
            textView2.setText(append);
            textView2.setLinksClickable(true);
            textView2.setClickable(true);
            DbT.A1H(textView2);
        }
        IgdsButton igdsButton = this.A04;
        if (igdsButton != null) {
            igdsButton.setText(requireContext().getString(2131964392));
            FP6.A00(igdsButton, 40, this);
        }
        TextView textView3 = this.A00;
        if (textView3 != null) {
            DbT.A18(requireContext(), textView3, 2131964393);
            FP6.A00(textView3, 41, this);
        }
        C46735DkO dkO = (C46735DkO) this.A08.getValue();
        String str = this.A06;
        if (str != null) {
            LRq.A01(dkO.A00, str);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
    }

    public K4U() {
        C51799G2i A002 = C51799G2i.A00(this, 49);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(0eO.A02, C51799G2i.A00(C51799G2i.A00(this, 46), 47));
        this.A08 = DbS.A0I(C51799G2i.A00(A003, 48), A002, new MMX(27, (Object) null, (Object) A003), DbS.A0z(C46735DkO.class));
    }

    public static final void A00(K4U k4u, boolean z) {
        String str;
        FragmentActivity requireActivity = k4u.requireActivity();
        String A0j = AnonymousClass7TG.A0j();
        C46735DkO dkO = (C46735DkO) k4u.A08.getValue();
        String str2 = k4u.A06;
        if (str2 != null) {
            if (z) {
                str = "instant_avatars_cta_button";
            } else {
                str = "create_from_scratch_cta_button";
            }
            LRq.A03(dkO.A00, str2, str, A0j);
            AnonymousClass37D A0i = DbT.A0i(requireActivity);
            if (A0i != null) {
                DbU.A1U(new C65752Lz6(requireActivity, k4u, A0j, z), A0i, A0i);
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(176806918);
        K4U.super.onCreate(bundle);
        this.A06 = requireArguments().getString("args_logging_surface");
        AnonymousClass0fD.A09(1120795612, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1168449839);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.instant_avatar_upsell_bottom_sheet, viewGroup, false);
        AnonymousClass0fD.A09(-1728188908, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1030075558);
        super.onDestroyView();
        this.A05 = null;
        this.A02 = null;
        this.A01 = null;
        this.A04 = null;
        this.A00 = null;
        AnonymousClass0fD.A09(-563791404, A022);
    }
}
