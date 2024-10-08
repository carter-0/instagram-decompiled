package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.nux.cal.model.ConnectContent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class E6M extends AnonymousClass32G {
    public static final String __redex_internal_original_name = "SeeAllAccountsFragment";
    public AnonymousClass0wW A00;
    public C47581E8t A01;
    public ConnectContent A02;

    public final String getModuleName() {
        return "signup_see_all_accounts";
    }

    public final /* bridge */ /* synthetic */ 0lg A0Y() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        ImmutableList immutableList;
        int A022 = AnonymousClass0fD.A02(-1494607259);
        E6M.super.onCreate(bundle);
        this.A00 = DbX.A0T(this);
        Parcelable parcelable = requireArguments().getParcelable("argument_content");
        parcelable.getClass();
        ConnectContent connectContent = (ConnectContent) parcelable;
        this.A02 = connectContent;
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1C.add(connectContent.A03);
        List list = connectContent.A0J;
        if (!(list == null || ImmutableList.copyOf((Collection) list) == null)) {
            List list2 = this.A02.A0J;
            if (list2 != null) {
                immutableList = ImmutableList.copyOf((Collection) list2);
            } else {
                immutableList = null;
            }
            A1C.addAll(immutableList);
        }
        C47581E8t e8t = new C47581E8t(requireActivity(), this, DbX.A0U(this));
        this.A01 = e8t;
        List list3 = e8t.A00;
        list3.clear();
        list3.addAll(A1C);
        C47581E8t.A00(e8t);
        A0V(this.A01);
        AnonymousClass0fD.A09(-302494964, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1921547061);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.all_accounts_bottom_sheet);
        AnonymousClass0fD.A09(1810090899, A022);
        return A0C;
    }
}
