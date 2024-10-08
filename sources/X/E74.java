package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

public final class E74 extends C273374mT implements AnonymousClass0iw {
    public static final String __redex_internal_original_name = "CheckoutAwarenessValuePropsFragment";
    public 0wc A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;

    public final String getModuleName() {
        return "instagram_shopping_checkout_awareness_value_props";
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1802715821);
        E74.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = requireArguments.getString("merchant_username");
        this.A02 = DbU.A0l(requireArguments, "prior_module_name");
        this.A03 = DbU.A0l(requireArguments, AnonymousClass000.A00(741));
        this.A04 = C228022kf.A00(requireArguments);
        0wc A012 = AnonymousClass0kN.A01(this, getSession());
        this.A00 = A012;
        0Aj A0e = AnonymousClass7TE.A0e(A012, "instagram_shopping_checkout_awareness_value_props_entry");
        A0e.AAJ("visual_style", AnonymousClass000.A00(268));
        A0e.AAJ("prior_module", this.A02);
        A0e.AAJ("prior_submodule", this.A03);
        A0e.AAJ("shopping_session_id", this.A04);
        A0e.Cgf();
        AnonymousClass0fD.A09(903806204, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(899488463);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.checkout_awareness);
        AnonymousClass0fD.A09(890074031, A022);
        return A0C;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(995547152);
        super.onDestroy();
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "instagram_shopping_checkout_awareness_value_props_closed");
        A0e.AAJ("visual_style", AnonymousClass000.A00(268));
        A0e.AAJ("prior_module", this.A02);
        A0e.AAJ("shopping_session_id", this.A04);
        A0e.Cgf();
        AnonymousClass0fD.A09(-1499667995, A022);
    }

    /* JADX WARNING: type inference failed for: r0v36, types: [X.U22, android.text.method.LinkMovementMethod] */
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        super.onViewCreated(view, bundle);
        View requireViewById = view.requireViewById(R.id.shipping_information);
        ImageView A0F = DbU.A0F(requireViewById, R.id.icon);
        TextView A06 = Dba.A06(requireViewById);
        TextView A0G = DbU.A0G(requireViewById, R.id.description);
        DbU.A1A(DbV.A05(this), A06, 2131955094);
        String str = this.A01;
        if (str == null || str.isEmpty()) {
            string = DbV.A05(this).getString(2131955096);
        } else {
            string = AnonymousClass7TF.A0e(DbV.A05(this), str, 2131955095);
        }
        A0G.setText(string);
        Context context = A0F.getContext();
        DbU.A13(context, A0F, R.drawable.instagram_device_phone_pano_outline_24);
        DbX.A12(context, A0F, 2Yu.A0B(context));
        View requireViewById2 = view.requireViewById(R.id.secure_payment_information);
        ImageView A0F2 = DbU.A0F(requireViewById2, R.id.icon);
        TextView A062 = Dba.A06(requireViewById2);
        TextView A0G2 = DbU.A0G(requireViewById2, R.id.description);
        DbU.A1A(DbV.A05(this), A062, 2131955101);
        DbU.A1A(DbV.A05(this), A0G2, 2131955102);
        Context context2 = A0F2.getContext();
        DbU.A13(context2, A0F2, R.drawable.instagram_lock_pano_outline_24);
        DbX.A12(context2, A0F2, 2Yu.A0B(context2));
        View requireViewById3 = view.requireViewById(R.id.purchase_protection_information);
        ImageView A0F3 = DbU.A0F(requireViewById3, R.id.icon);
        TextView A063 = Dba.A06(requireViewById3);
        TextView A0G3 = DbU.A0G(requireViewById3, R.id.description);
        DbU.A1A(DbV.A05(this), A063, 2131955103);
        String string2 = DbV.A05(this).getString(2131955105);
        AnonymousClass7AV.A07(new ESx(Integer.valueOf(DbZ.A01(this)), (Object) this, 52), A0G3, string2, AnonymousClass7TF.A0e(DbV.A05(this), string2, 2131955104));
        Context context3 = A0F3.getContext();
        DbU.A13(context3, A0F3, R.drawable.instagram_shield_pano_outline_24);
        DbX.A12(context3, A0F3, 2Yu.A0B(context3));
        TextView A0G4 = DbU.A0G(view, R.id.learn_more_help_center);
        Uri A07 = DbV.A07(requireActivity(), "https://help.instagram.com/357872324807367/");
        String string3 = DbV.A05(this).getString(2131955100);
        A0G4.setText(AnonymousClass7AV.A00(A07, string3, AnonymousClass7TF.A0e(DbV.A05(this), string3, 2131955099)));
        U22 u22 = U22.A00;
        U22 u222 = u22;
        if (u22 == null) {
            ? linkMovementMethod = new LinkMovementMethod();
            U22.A00 = linkMovementMethod;
            u222 = linkMovementMethod;
        }
        A0G4.setMovementMethod(u222);
        ImageView A0F4 = DbU.A0F(view, R.id.close_button);
        Context context4 = A0F4.getContext();
        DbX.A12(context4, A0F4, 2Yu.A0B(context4));
        FP4.A01(A0F4, 21, this);
        DbU.A0F(view, R.id.main_image_icon).setImageResource(R.drawable.checkout_chevron_96);
    }
}
