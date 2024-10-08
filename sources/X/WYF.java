package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.modal.ModalActivity;
import com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment;
import com.instagram.user.model.Product;
import java.util.List;

public final class WYF implements MVB {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public WYF(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void onButtonClick(View view) {
        0Aj r4;
        switch (this.A00) {
            case 0:
                C15325UaY uaY = (C15325UaY) this.A02;
                if (!uaY.A06) {
                    C15691Ugw ugw = uaY.A01;
                    if (ugw == null) {
                        0qQ.A0F("listController");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    List list = (List) this.A01;
                    if (ugw.A03) {
                        ugw.A07.A04(list);
                        if (!ugw.A05) {
                            ugw.A09.A07(list);
                        }
                        ugw.A02();
                    }
                    C15325UaY.A00(uaY);
                    C297555rw A002 = C297545rv.A00(AnonymousClass7TE.A0l(uaY.A0B));
                    String A0k = C13991Tnr.A0k(uaY.A0A);
                    r4 = AnonymousClass7TE.A0e(DbW.A0J(A002.A00, "favorites_management"), "instagram_feed_favorites_remove_all_undo");
                    if (r4.isSampled()) {
                        r4.AAJ("module", "favorites_management");
                        r4.AAJ("management_session_id", A0k);
                        break;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                C19582Wc7 wc7 = (C19582Wc7) this.A01;
                C17713Vci vci = wc7.A00;
                Product product = wc7.A01;
                C249713kF.A00.A01(vci.A02.requireActivity(), vci.A03, AnonymousClass3ZA.A00(product.A0B), vci.A0C, vci.A04.getModuleName(), "add_to_bag_cta", (String) null, ((W0O) this.A02).A04());
                return;
            case 2:
                C18661VwI.A00((C18661VwI) this.A02, (Product) this.A01, "add_to_bag_cta");
                return;
            case 3:
                C19560Wbk wbk = (C19560Wbk) this.A01;
                C19560Wbk.A02(wbk, new C20073WkX(this), 0);
                MerchantShoppingCartFragment merchantShoppingCartFragment = wbk.A00;
                C18785W1l w1l = merchantShoppingCartFragment.A09;
                String str = merchantShoppingCartFragment.A0U;
                String str2 = merchantShoppingCartFragment.A0N;
                W0O w0o = (W0O) this.A02;
                String str3 = merchantShoppingCartFragment.A0Q;
                String str4 = merchantShoppingCartFragment.A0T;
                boolean A1U = AnonymousClass7TF.A1U(0, str, str2);
                r4 = AnonymousClass7TE.A0e(w1l.A02, "instagram_shopping_bag_undo_remove_item");
                String A04 = w0o.A04();
                0qQ.A07(A04);
                C13991Tnr.A17(r4, A04);
                W0O.A01(r4, w0o);
                Product A03 = w0o.A03();
                boolean z = true;
                if (A03 == null || A03.A0P != A1U) {
                    z = false;
                }
                C13991Tnr.A18(r4, str, z);
                String str5 = w1l.A05;
                if (str5 != null) {
                    r4.AAJ("merchant_bag_entry_point", str5);
                    String str6 = w1l.A06;
                    if (str6 != null) {
                        C18785W1l.A02(r4, w1l, C18785W1l.A01(r4, w1l, "merchant_bag_prior_module", str6, str2), str3);
                        C13991Tnr.A16(r4, str4);
                        break;
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            default:
                C15372UbQ ubQ = (C15372UbQ) this.A02;
                ubQ.A0E.getValue();
                C56058Hs7 hs7 = (C56058Hs7) ubQ.A0D.getValue();
                String str7 = ubQ.A07;
                AnonymousClass7TG.A1N(hs7, str7);
                hs7.A02(C66579MXk.A00(43), str7, "comment_block_comments_from", "block_comments_from_review");
                Bundle bundle = new Bundle();
                bundle.putString(DialogModule.KEY_TITLE, ((Context) this.A01).getString(2131976105));
                DbT.A1M(ubQ, DbV.A0Y(ubQ.getActivity(), bundle, DbT.A0X(ubQ.A0A), ModalActivity.class, C273654mx.A00(2187)));
                return;
        }
        r4.Cgf();
    }

    public final void onDismiss() {
        if (this.A00 == 0) {
            ((C15325UaY) this.A02).A04 = null;
        }
    }

    public final void onShow() {
    }

    public final /* synthetic */ void onTextClick(View view) {
    }
}
