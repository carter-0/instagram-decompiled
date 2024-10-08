package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.Currency;

public final class WA3 implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public WA3(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A01 = obj3;
        this.A04 = str;
        this.A02 = obj;
        this.A03 = obj2;
    }

    public final void onClick(View view) {
        int A05;
        int i;
        View view2 = view;
        switch (this.A00) {
            case 0:
                A05 = AnonymousClass0fD.A05(-1605414658);
                String str = this.A04;
                if (str != null) {
                    UserSession userSession = ((C17578VaW) this.A01).A02;
                    C17422VVb vVb = new C17422VVb(userSession, "direct_create_order_fragment");
                    String str2 = userSession.A06;
                    0Aj A0e = AnonymousClass7TE.A0e(vVb.A01, "biig_order_management_create_order_form_send_button_click");
                    if (A0e.isSampled()) {
                        C13992Tns.A0i(A0e, str2, str);
                    }
                }
                Context context = (Context) this.A02;
                C70573OBv oBv = (C70573OBv) this.A03;
                C17578VaW vaW = (C17578VaW) this.A01;
                UserSession userSession2 = vaW.A02;
                C15364UbH ubH = vaW.A03;
                String str3 = ubH.A03;
                String str4 = ubH.A02;
                String str5 = vaW.A00;
                String A0c = AnonymousClass7TF.A0c();
                AnonymousClass0K0 r6 = GraphQlCallInput.A02;
                Currency A032 = C18792W1y.A03(userSession2);
                Boolean A0R = AnonymousClass7TF.A0R(0Tu.A05, userSession2, 36315885518065303L);
                String str6 = userSession2.A06;
                0Df A033 = C41845B3m.A03(r6, str6, "actor_id");
                0Df.A00(A033, A0c, "client_mutation_id");
                0Df.A00(A033, str6, "instagram_business_id");
                String str7 = "";
                String str8 = str7;
                if (str != null) {
                    str8 = str;
                }
                0Df.A00(A033, str8, C273654mx.A00(310));
                if (A032 != null) {
                    str7 = A032.toString();
                }
                0Df.A00(A033, str7, "currency");
                0Df.A00(A033, str3, Pxd.A00(43));
                2IS A0D = JTQ.A0D(A033, str4, "note");
                DbW.A18(A033, A0D, "input");
                C239113Fa r5 = new C239113Fa(A0D, UJQ.class, "IGP2MOrderManagementCreateOrderMutation", true);
                C363088j4.A00(userSession2).ATL(new C71567On2(oBv, 16), new C71575OnC(context, userSession2, oBv, A0R, str5, str3, str, str4, A032), r5);
                0nA.A0N(view2);
                i = 507426209;
                break;
            case 1:
                A05 = AnonymousClass0fD.A05(478477937);
                view2.setOnClickListener((View.OnClickListener) null);
                ((TextView) this.A01).setText(this.A04);
                C18077Vl6 vl6 = ((C14898UEa) this.A03).A00;
                if (vl6 != null) {
                    String obj = ((C15045UKy) this.A02).A03.toString();
                    0qQ.A0B(obj, 0);
                    C18462VsB A002 = C16039UnS.A00(vl6.A00);
                    XB6.A00(C18462VsB.A00(A002, obj, (String) null), A002.A00, A002.A01, "lead_gen_multi_step_consumer_questions", "inline_context_card_expand_description");
                }
                i = 254635874;
                break;
            case 2:
                A05 = AnonymousClass0fD.A05(996450363);
                C59689JTv.A07(((C46498Dg1) this.A02).A00, 2131969822);
                Product product = (Product) this.A01;
                C17641VbX vbX = (C17641VbX) this.A03;
                product.A00(vbX.A02);
                C17536VZp vZp = vbX.A04;
                String str9 = product.A0H;
                String A0q = C13989Tnp.A0q(product);
                0qQ.A0A(A0q);
                String str10 = this.A04;
                AnonymousClass7TF.A1H(str9, A0q);
                0Aj A0e2 = AnonymousClass7TE.A0e(vZp.A00, "instagram_shopping_product_see_less");
                if (A0e2.isSampled()) {
                    C13991Tnr.A17(A0e2, str9);
                    C13988Tno.A1A(A0e2, A0q);
                    C13988Tno.A1D(A0e2, vZp.A02);
                    C13988Tno.A1C(A0e2, vZp.A01);
                    C51973G9u.A14(A0e2, "prior_submodule", str10);
                    A0e2.Cgf();
                }
                i = -587921976;
                break;
            case 3:
                A05 = AnonymousClass0fD.A05(324255742);
                VXB vxb = (VXB) this.A02;
                C15401Uc7 uc7 = vxb.A01;
                User user = vxb.A02;
                C15401Uc7.A00(uc7, user, vxb.A00);
                X76 x76 = uc7.A05;
                if (x76 != null) {
                    x76.AAN(user, false);
                }
                C18697Vwv.A01(AnonymousClass7TE.A0e((0wc) this.A01, "ig_add_collaborator_edit_confirmation_tag_tap"), this.A04);
                i = -611375723;
                break;
            default:
                A05 = AnonymousClass0fD.A05(1897582920);
                VXB vxb2 = (VXB) this.A02;
                C15401Uc7.A01(vxb2.A01, vxb2.A02, vxb2.A00);
                C18697Vwv.A01(AnonymousClass7TE.A0e((0wc) this.A01, "ig_add_collaborator_edit_confirmation_confirm_tap"), this.A04);
                i = -1647909391;
                break;
        }
        AnonymousClass0fD.A0C(i, A05);
    }
}
