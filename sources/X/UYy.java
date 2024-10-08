package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;

public final class UYy extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "PromoteDeleteDraftBottomSheetFragment";
    public View A00;
    public View A01;
    public WGU A02;
    public C18784W1k A03;
    public PromoteData A04;
    public UserSession A05;
    public final AnonymousClass0eM A06 = C20694WxQ.A00(this, 15);

    public final String getModuleName() {
        return "promote_delete_draft_bottom_sheet";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        DbU.A1A(DbV.A05(this), AnonymousClass7TG.A0R(view, R.id.delete_draft_bottom_sheet_title), 2131970357);
        View requireViewById = view.requireViewById(R.id.discard_button_row);
        this.A01 = requireViewById;
        String str = "discardButtonRow";
        if (requireViewById != null) {
            TextView A0R = AnonymousClass7TG.A0R(requireViewById, R.id.promote_bottom_sheet_button_text);
            DbU.A1A(DbV.A05(this), A0R, 2131970459);
            DbT.A17(requireContext(), A0R, 2Yu.A03(getContext()));
            View view2 = this.A01;
            if (view2 != null) {
                C18887WAz.A00(view2, 65, this);
                View view3 = this.A01;
                if (view3 != null) {
                    view3.setClickable(true);
                    View requireViewById2 = view.requireViewById(R.id.cancel_button_row);
                    this.A00 = requireViewById2;
                    str = "cancelButtonRow";
                    if (requireViewById2 != null) {
                        DbU.A1A(DbV.A05(this), AnonymousClass7TG.A0R(requireViewById2, R.id.promote_bottom_sheet_button_text), 2131970458);
                        View view4 = this.A00;
                        if (view4 != null) {
                            C18887WAz.A00(view4, 66, this);
                            View view5 = this.A00;
                            if (view5 != null) {
                                view5.setClickable(true);
                                return;
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        UserSession userSession = this.A05;
        if (userSession != null) {
            return userSession;
        }
        DbS.A14();
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-908623939);
        UYy.super.onCreate(bundle);
        PromoteData A002 = XAI.A00(this);
        this.A04 = A002;
        UserSession userSession = A002.A0y;
        this.A05 = userSession;
        this.A03 = C18784W1k.A01(this, userSession);
        UserSession userSession2 = this.A05;
        if (userSession2 != null) {
            this.A02 = WGU.A00(userSession2);
            AnonymousClass0fD.A09(-191386834, A022);
            return;
        }
        DbS.A14();
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1466813216);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.promote_delete_draft_bottom_sheet_view, false);
        AnonymousClass0fD.A09(-1858800277, A022);
        return A0D;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(945054142);
        super.onDestroyView();
        AnonymousClass0fD.A09(252659642, A022);
    }
}
