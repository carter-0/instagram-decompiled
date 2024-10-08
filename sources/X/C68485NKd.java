package X;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.NKd  reason: case insensitive filesystem */
public final class C68485NKd extends C273374mT {
    public static final String __redex_internal_original_name = "ShhModeUserEducationFragment";
    public AnonymousClass7L2 A00;
    public LinearLayout A01;
    public TextView A02;
    public Boolean A03;
    public boolean A04;
    public final List A05 = AnonymousClass7TE.A1C();

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        A00(this);
    }

    public static final void A00(C68485NKd nKd) {
        AnonymousClass7L2 r0 = nKd.A00;
        LinearLayout linearLayout = nKd.A01;
        if (linearLayout != null && r0 != null) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(nKd.getContext(), r0.A07.A0E);
            linearLayout.setBackgroundColor(2Yu.A0F(contextThemeWrapper, R.attr.elevatedBackgroundColor));
            TextView textView = nKd.A02;
            if (textView != null) {
                textView.setTextColor(2Yu.A0F(contextThemeWrapper, R.attr.textColorPrimary));
            }
            for (OLN oln : nKd.A05) {
                TextView textView2 = oln.A03;
                if (textView2 != null) {
                    textView2.setTextColor(2Yu.A0F(contextThemeWrapper, R.attr.textColorPrimary));
                }
                TextView textView3 = oln.A02;
                if (textView3 != null) {
                    textView3.setTextColor(2Yu.A0F(contextThemeWrapper, R.attr.textColorSecondary));
                }
                ImageView imageView = oln.A01;
                if (imageView != null) {
                    imageView.setColorFilter(2Yu.A0F(contextThemeWrapper, R.attr.textColorPrimary));
                }
            }
        }
    }

    public final String getModuleName() {
        return "shh_mode_user_education";
    }

    public final void afterOnCreate(Bundle bundle) {
        super.afterOnCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A04 = requireArguments.getBoolean("IS_SHH_REPLAY_ENABLED");
        this.A03 = DbU.A0g(requireArguments, "IS_CUTOVER_THREAD");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(994613104);
        0qQ.A0B(layoutInflater, 0);
        boolean z = false;
        LinearLayout linearLayout = (LinearLayout) C66583MXo.A0A(layoutInflater, viewGroup, R.layout.layout_shh_user_education);
        this.A01 = linearLayout;
        this.A02 = DbU.A0G(linearLayout, R.id.education_title);
        OLN A002 = C70047NwP.A00(requireContext());
        int i = 2131973696;
        int i2 = 2131973694;
        if (this.A04) {
            i = 2131973697;
            i2 = 2131973695;
        }
        A002.A00(i, i2, R.drawable.instagram_eye_pano_outline_24);
        List<OLN> list = this.A05;
        list.add(A002);
        OLN A003 = C70047NwP.A00(requireContext());
        UserSession session = getSession();
        Boolean bool = this.A03;
        if (bool != null) {
            z = bool.booleanValue();
        }
        0qQ.A0B(session, 0);
        int i3 = 2131973712;
        if (C66642MaB.A02(session, z)) {
            i3 = 2131973711;
        }
        A003.A00(i3, 2131973710, R.drawable.up_arrow);
        list.add(A003);
        OLN A004 = C70047NwP.A00(requireContext());
        A004.A00(2131973709, 2131973708, R.drawable.instagram_users_pano_outline_24);
        list.add(A004);
        OLN A005 = C70047NwP.A00(requireContext());
        A005.A00(2131973707, 2131973706, R.drawable.instagram_shield_pano_outline_24);
        list.add(A005);
        for (OLN oln : list) {
            linearLayout.addView(oln.A00);
        }
        AnonymousClass0fD.A09(1423715474, A022);
        return linearLayout;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-279420231);
        super.onDestroyView();
        this.A01 = null;
        this.A02 = null;
        AnonymousClass0fD.A09(-459373808, A022);
    }
}
