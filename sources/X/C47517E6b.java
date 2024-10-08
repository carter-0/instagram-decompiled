package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.emptystaterow.EmptyStateView;
import com.instagram.user.model.User;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.E6b  reason: case insensitive filesystem */
public final class C47517E6b extends AnonymousClass32G implements G7T, C41800B1f {
    public static final String __redex_internal_original_name = "RestrictListFragment";
    public 0wc A00;
    public EmptyStateView A01;
    public C48076EUu A02;
    public C333937aO A03;
    public C47586E8y A04;
    public final AnonymousClass0eM A05 = C227642jf.A02(this);
    public final 1wn A06 = new FXT(this, 6);

    /* JADX WARNING: type inference failed for: r12v0, types: [X.07Z, X.E6b, androidx.fragment.app.Fragment] */
    public final void Dw0(User user, int i) {
        if (i == 0) {
            0wc r2 = this.A00;
            if (r2 != null) {
                AnonymousClass73V.A0A(r2, user, "click", "add_account");
                1YZ r22 = 1YZ.A02;
                if (r22 != null) {
                    r22.A03(requireContext(), AnonymousClass07i.A00(this), AnonymousClass7TE.A0l(this.A05), new C51090FoK(requireActivity(), true), user.getId(), "restrict_list", (String) null, (String) null);
                    return;
                }
                return;
            }
        } else if (i == 1) {
            AnonymousClass0eM r4 = this.A05;
            if (C324536zU.A00(AnonymousClass7TE.A0l(r4))) {
                FFO.A02(requireContext(), AnonymousClass7TE.A0l(r4), "unrestrict_account");
                return;
            }
            0wc r23 = this.A00;
            if (r23 != null) {
                AnonymousClass73V.A0A(r23, user, "click", "remove_restricted_account");
                1YZ r5 = 1YZ.A02;
                if (r5 != null) {
                    r5.A02(requireContext(), AnonymousClass07i.A00(this), AnonymousClass7TE.A0l(r4), new C51090FoK(requireActivity(), false), user.getId(), "restrict_list");
                    return;
                }
                return;
            }
        } else {
            return;
        }
        DbS.A12();
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        return "restrict_list";
    }

    public static final void A01(C47517E6b e6b) {
        1OC r1;
        if (1YZ.A02 != null) {
            UserSession A0l = AnonymousClass7TE.A0l(e6b.A05);
            0qQ.A0B(A0l, 0);
            r1 = C334237aw.A00(A0l);
            C47696EDf.A01(r1, e6b, 56);
        } else {
            r1 = null;
        }
        e6b.schedule(r1);
    }

    public final /* bridge */ /* synthetic */ 0lg A0Y() {
        return DbT.A0X(this.A05);
    }

    public final void DwX(String str) {
        AnonymousClass0eM r4 = this.A05;
        C46474Dfc A012 = C46548Dgp.A01(AnonymousClass7TE.A0l(r4), str, "restrict_list_user_row", "restrict_list");
        C46474Dfc.A03(DbZ.A0P(this, r4), AnonymousClass7TE.A0l(r4), C46447Df9.A02(), A012);
    }

    public final void Dwk(List list) {
        int ordinal;
        C320156rr r1;
        C48076EUu eUu = this.A02;
        if (eUu != null && (ordinal = eUu.ordinal()) != -1) {
            if (ordinal == 0) {
                C47586E8y e8y = this.A04;
                if (e8y != null) {
                    e8y.A06();
                    for (Object A09 : list) {
                        e8y.A09(e8y.A00, A09, true);
                    }
                    e8y.A07();
                }
                if (list.isEmpty()) {
                    r1 = C320156rr.EMPTY;
                } else {
                    r1 = C320156rr.GONE;
                }
                EmptyStateView emptyStateView = this.A01;
                if (emptyStateView != null) {
                    emptyStateView.A0P(r1);
                }
            } else if (ordinal != 1) {
                throw AnonymousClass7TE.A1K();
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        C48076EUu eUu;
        int A022 = AnonymousClass0fD.A02(1391276577);
        C47517E6b.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        AnonymousClass0eM r1 = this.A05;
        this.A00 = DbX.A0P(this, r1);
        this.A04 = new C47586E8y(getRootActivity(), AnonymousClass7TE.A0l(r1), this, C324536zU.A00(AnonymousClass7TE.A0l(r1)));
        Serializable serializable = requireArguments.getSerializable("list_tab");
        if (serializable instanceof C48076EUu) {
            eUu = (C48076EUu) serializable;
        } else {
            eUu = null;
        }
        this.A02 = eUu;
        if (eUu != null && eUu.ordinal() == 0) {
            A01(this);
        }
        AnonymousClass0fD.A09(-248478393, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-254584183);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_restrict_list, viewGroup, false);
        ((AbsListView) AnonymousClass7TF.A0F(inflate, 16908298)).setAdapter(this.A04);
        EmptyStateView emptyStateView = (EmptyStateView) inflate.requireViewById(16908292);
        emptyStateView.A0V(C320156rr.EMPTY, getString(2131968418));
        emptyStateView.A0P(C320156rr.NOT_LOADED);
        emptyStateView.A0N(FP4.A00(this, 70), C320156rr.ERROR);
        this.A01 = emptyStateView;
        AnonymousClass0fD.A09(1021452588, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(993463998);
        super.onDestroyView();
        this.A01 = null;
        this.A04 = null;
        AnonymousClass0fD.A09(-933464259, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1880860755);
        C47517E6b.super.onPause();
        C333937aO r0 = this.A03;
        if (r0 != null) {
            r0.A02(this);
        }
        DbX.A0R(this.A05).A02(this.A06, C290835g2.class);
        AnonymousClass0fD.A09(1705696020, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-2004441339);
        super.onResume();
        C333937aO r2 = this.A03;
        if (r2 != null) {
            r2.A03.add(new WeakReference(this));
            Dwk(AnonymousClass7TE.A1D(r2.A01));
        }
        DbX.A0R(this.A05).A01(this.A06, C290835g2.class);
        AnonymousClass0fD.A09(1735582649, A022);
    }
}
