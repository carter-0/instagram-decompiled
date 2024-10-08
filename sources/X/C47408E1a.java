package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.fanclub.gifting.FanClubGiftingViewModel;
import com.instagram.fanclub.gifting.FanClubGiftingViewModel$fetchGiftOptions$1;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.User;

/* renamed from: X.E1a  reason: case insensitive filesystem */
public final class C47408E1a extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "FanClubGiftingPriceSelectionFragment";
    public View A00;
    public AnonymousClass2t9 A01;
    public SpinnerImageView A02;
    public final AnonymousClass0eM A03 = C51798G2h.A00(this, 9);
    public final AnonymousClass0eM A04 = C51798G2h.A00(this, 10);
    public final AnonymousClass0eM A05 = C51798G2h.A00(this, 11);
    public final AnonymousClass0eM A06 = C51798G2h.A00(this, 12);
    public final AnonymousClass0eM A07 = C227642jf.A02(this);
    public final AnonymousClass0eM A08;

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [X.2tF, java.lang.Object] */
    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        SpinnerImageView A0k = DbX.A0k(view);
        DbS.A1T(A0k);
        this.A02 = A0k;
        this.A00 = view.requireViewById(R.id.price_selection_view);
        IgdsHeadline A0U = DbZ.A0U(view, R.id.price_selection_headline);
        Context A0S = AnonymousClass7TE.A0S(A0U);
        AnonymousClass0eM r2 = this.A03;
        A0U.setImageDrawable(FC9.A00(A0S, (User) r2.getValue()));
        A0U.setHeadline(2131963083);
        A0U.setBody(2131963081);
        this.A01 = DbU.A0U(DbV.A0S(this), new Object());
        RecyclerView A0K = DbX.A0K(view);
        AnonymousClass2t9 r0 = this.A01;
        if (r0 == null) {
            0qQ.A0F("recyclerViewAdapter");
            throw AnonymousClass00P.createAndThrow();
        }
        A0K.setAdapter(r0);
        DbU.A15(requireContext(), A0K, 1, false);
        TextView A0G = DbU.A0G(view, R.id.price_selection_footer);
        Context context = A0G.getContext();
        String A16 = AnonymousClass7TE.A16(context, 2131963084);
        SpannableStringBuilder A0E = DbY.A0E(this, A16, 2131963082);
        AnonymousClass7AV.A03(A0E, new ESx(this, DbV.A02(context)), A16);
        DbX.A1G(A0G, A0E);
        07U r11 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass0xx A002 = AnonymousClass07a.A00(viewLifecycleOwner);
        MHE mhe = new MHE(viewLifecycleOwner, r11, this, (AnonymousClass4D7) null, 11);
        19B r1 = 19B.A00;
        1Eo.A05(r1, mhe, A002);
        FanClubGiftingViewModel fanClubGiftingViewModel = (FanClubGiftingViewModel) this.A08.getValue();
        FragmentActivity requireActivity = requireActivity();
        Context requireContext = requireContext();
        User user = (User) r2.getValue();
        String A0t = DbS.A0t(this.A06);
        AnonymousClass7TG.A1Q(user, A0t);
        1Eo.A05(r1, new FanClubGiftingViewModel$fetchGiftOptions$1(requireContext, requireActivity, fanClubGiftingViewModel, user, A0t, (AnonymousClass4D7) null), C318116oQ.A00(fanClubGiftingViewModel));
        AnonymousClass07Z viewLifecycleOwner2 = getViewLifecycleOwner();
        1Eo.A05(r1, new MHE(viewLifecycleOwner2, r11, this, (AnonymousClass4D7) null, 12), AnonymousClass07a.A00(viewLifecycleOwner2));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
    }

    public C47408E1a() {
        C51798G2h g2h = new C51798G2h(this, 16);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C51798G2h(new C51798G2h(this, 13), 14));
        this.A08 = DbS.A0I(new C51798G2h(A002, 15), g2h, new C58187Inr(5, A002, (Object) null), DbS.A0z(FanClubGiftingViewModel.class));
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 6) {
            DbX.A1I(this);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1915506983);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fan_club_gifting_price_selection, viewGroup, false);
        AnonymousClass0fD.A09(571108326, A022);
        return inflate;
    }
}
