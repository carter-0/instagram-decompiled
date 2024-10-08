package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.business.activity.BusinessConversionActivity;
import java.util.Map;

public final class E78 extends C273374mT implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "ProfessionalAccountSelectionFragment";
    public Activity A00;
    public G8D A01;
    public C46743DkW A02;
    public String A03;

    public final String getModuleName() {
        return "professional_account_selection";
    }

    public final boolean onBackPressed() {
        C46743DkW dkW = this.A02;
        dkW.A00.ChP(new C22030Xtl("personal_or_professional_account_selection", dkW.A01, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        ((BusinessConversionActivity) this.A01).EJN((Bundle) null);
        return true;
    }

    private void A00(Drawable drawable, LayoutInflater layoutInflater, ViewGroup viewGroup, String str, String str2, boolean z) {
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.account_type_card);
        viewGroup.addView(A0C);
        TextView A0G = DbU.A0G(A0C, R.id.card_title);
        TextView A0G2 = DbU.A0G(A0C, R.id.card_subtitle);
        ImageView A0F = DbU.A0F(A0C, R.id.card_icon);
        TextView A0G3 = DbU.A0G(A0C, R.id.card_cta);
        A0G.setText(str);
        A0G2.setText(str2);
        A0F.setImageDrawable(drawable);
        AnonymousClass0fU.A00(new C50100FOq(1, (Object) this, z), A0C);
        StringBuilder A0n = AnonymousClass7TF.A0n(str);
        A0n.append(",");
        A0n.append(str2);
        A0n.append(",");
        A0C.setContentDescription(AnonymousClass7TF.A0i(A0G3.getText(), A0n));
        2eS.A01(A0C);
    }

    public final void onAttach(Context context) {
        E78.super.onAttach(context);
        G8D A012 = FG1.A01(this);
        A012.getClass();
        this.A01 = A012;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.07g, androidx.fragment.app.Fragment, X.4mT, X.E78] */
    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-676310747);
        E78.super.onCreate(bundle);
        this.A00 = requireActivity();
        String A0o = DbX.A0o(this);
        A0o.getClass();
        this.A03 = A0o;
        this.A02 = new 2YN(new EFM(this.A01, getSession(), this.A03), this).A00(C46743DkW.class);
        AnonymousClass0fD.A09(-16143230, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2035307516);
        LayoutInflater layoutInflater2 = layoutInflater;
        View inflate = layoutInflater.inflate(R.layout.account_type_selection_fragment, viewGroup, false);
        TextView A06 = Dba.A06(inflate);
        A06.setText(2131955118);
        ViewGroup.MarginLayoutParams A0D = DbS.A0D(A06);
        A0D.bottomMargin = DbV.A05(this).getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
        A06.setLayoutParams(A0D);
        ViewGroup A0C = DbU.A0C(inflate, R.id.cards_container);
        A00(requireContext().getDrawable(R.drawable.instagram_media_account_pano_outline_24), layoutInflater2, A0C, getString(2131952108), getString(2131952107), true);
        A00(requireContext().getDrawable(R.drawable.instagram_user_pano_outline_24), layoutInflater2, A0C, getString(2131952106), getString(2131952105), false);
        View requireViewById = inflate.requireViewById(R.id.cross_button);
        requireContext();
        FPB.A01(requireViewById, 61, this);
        AnonymousClass0fD.A09(65905087, A022);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C46743DkW dkW = this.A02;
        dkW.A00.Cka(new C22030Xtl("personal_or_professional_account_selection", dkW.A01, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
    }
}
