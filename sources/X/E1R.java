package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.android.R;
import com.instagram.igds.components.peoplecell.IgdsPeopleCell;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.user.model.User;

public final class E1R extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "OneTapUpsellLogOutFragment";
    public boolean A00;
    public LinearLayout A01;
    public User A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);

    public final String getModuleName() {
        return "one_tap_upsell_logout_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i = 0;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        if (1AW.A06(0Tu.A05, 18296148364296377L)) {
            IgdsPeopleCell igdsPeopleCell = new IgdsPeopleCell(requireContext, false);
            User user = this.A02;
            if (user != null) {
                igdsPeopleCell.A08(user.getUsername(), false);
                User user2 = this.A02;
                if (user2 != null) {
                    igdsPeopleCell.A04(user2.Bh3(), (View.OnClickListener) null);
                    LinearLayout linearLayout = this.A01;
                    if (linearLayout != null) {
                        linearLayout.addView(igdsPeopleCell, 0);
                        i = 1;
                    }
                    0qQ.A0F("linearLayout");
                    throw AnonymousClass00P.createAndThrow();
                }
            }
            0qQ.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
            throw AnonymousClass00P.createAndThrow();
        }
        IgdsListCell igdsListCell = new IgdsListCell(requireContext, (AttributeSet) null);
        igdsListCell.A0I(AnonymousClass7TF.A0d(DbV.A05(this), 2131968825));
        FdS.A00(igdsListCell, this, 14);
        igdsListCell.setChecked(this.A00);
        igdsListCell.setTextCellType(C69349Njo.TYPE_SWITCH);
        LinearLayout linearLayout2 = this.A01;
        if (linearLayout2 != null) {
            linearLayout2.addView(igdsListCell, i);
            LinearLayout linearLayout3 = this.A01;
            if (linearLayout3 != null) {
                TextView A0R = AnonymousClass7TG.A0R(linearLayout3, R.id.one_tap_upsell_bottom_sheet_text_message);
                Resources A05 = DbV.A05(this);
                User user3 = this.A02;
                if (user3 != null) {
                    A0R.setText(AnonymousClass7TF.A0e(A05, user3.getUsername(), 2131968826), TextView.BufferType.NORMAL);
                    return;
                }
                0qQ.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                throw AnonymousClass00P.createAndThrow();
            }
        }
        0qQ.A0F("linearLayout");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1619696464);
        E1R.super.onCreate(bundle);
        this.A02 = DbX.A0l(AnonymousClass0t1.A01, this.A03);
        AnonymousClass0fD.A09(292409207, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(869693156);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.one_tap_upsell_bottom_sheet_layout, viewGroup, false);
        this.A01 = (LinearLayout) inflate.requireViewById(R.id.container);
        AnonymousClass0fD.A09(5794415, A022);
        return inflate;
    }
}
