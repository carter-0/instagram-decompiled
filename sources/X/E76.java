package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.user.model.User;

public final class E76 extends C273374mT implements AnonymousClass0iw, AnonymousClass4DR, C227272iw {
    public static final String __redex_internal_original_name = "OneTapOptInFragment";
    public TextView A00;
    public TextView A01;
    public G8D A02;
    public FRN A03;
    public ProgressButton A04;
    public User A05;
    public final View.OnClickListener A06 = new FPD(this, 3);

    public final boolean COC() {
        return true;
    }

    public final void configureActionBar(2da r2) {
        r2.Etr(false);
    }

    public final String getModuleName() {
        return "one_tap_upsell_nux";
    }

    public final boolean onBackPressed() {
        C49920FEv.A00.A02(getSession(), "nux_one_tap_upsell");
        G8D g8d = this.A02;
        if (g8d == null) {
            return false;
        }
        if (g8d.E2J() == null) {
            return true;
        }
        Dba.A1R(this.A02);
        return true;
    }

    public final void onAttach(Context context) {
        E76.super.onAttach(context);
        this.A02 = FG1.A01(this);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1896596510);
        E76.super.onCreate(bundle);
        this.A03 = new FRN(this, this, getSession());
        AnonymousClass0fD.A09(-2106445980, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-2036209396);
        this.A05 = DbT.A0j(getSession());
        View inflate = layoutInflater.inflate(R.layout.nux_onetap_opt_in_redesign, viewGroup, false);
        this.A01 = DbU.A0G(inflate, R.id.field_title);
        this.A00 = DbU.A0G(inflate, R.id.field_detail);
        this.A04 = (ProgressButton) inflate.requireViewById(R.id.progress_button_text);
        View requireViewById = inflate.requireViewById(R.id.skip_button);
        View requireViewById2 = inflate.requireViewById(R.id.nux_one_tap_lock);
        View requireViewById3 = inflate.requireViewById(R.id.nux_one_tap_phone_logo_container);
        if (182.A06(0Tu.A05, getSession(), 36329826981790045L)) {
            requireViewById2.setVisibility(0);
            requireViewById3.setVisibility(8);
        } else {
            requireViewById2.setVisibility(8);
            requireViewById3.setVisibility(0);
            ImageView A0F = DbU.A0F(inflate, R.id.ig_logo);
            Context context = getContext();
            if (context != null) {
                Dba.A0p(context, A0F);
            }
            IgImageView A0b = DbT.A0b(inflate, R.id.profile_image_view);
            this.A05.Bh3();
            DbU.A1S(this, A0b, this.A05);
            DbU.A1H(DbU.A0G(inflate, R.id.username), this.A05);
        }
        this.A01.setText(2131968726);
        this.A00.setText(2131968724);
        this.A04.setText(2131968725);
        AnonymousClass0fU.A00(this.A06, this.A04);
        AnonymousClass0fU.A00(new FPD(this, 2), requireViewById);
        UserSession session = getSession();
        AnonymousClass7TG.A1N(session, "nux_one_tap_upsell");
        C49938FFr.A01(session, "nux_one_tap_upsell");
        AnonymousClass0fD.A09(-1853645408, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-459777844);
        super.onDestroyView();
        this.A00 = null;
        this.A01 = null;
        this.A04 = null;
        AnonymousClass0fD.A09(-1646547496, A022);
    }
}
