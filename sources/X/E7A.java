package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.instagram.accountlinking.model.AccountFamily;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class E7A extends C273374mT implements AnonymousClass4DR, AnonymousClass4DS, G5O {
    public static final String __redex_internal_original_name = "AccountLinkingChildGroupManagementFragment";
    public C47580E8s A00;
    public F2W A01;

    public final void configureActionBar(2da r3) {
        r3.Etr(true);
        r3.Eu4(true);
        r3.setTitle(requireActivity().getString(2131952063));
    }

    public final String getModuleName() {
        return "account_linking_child_group_management";
    }

    public final void DWL(String str, String str2) {
        Iterator it = this.A00.A00.iterator();
        while (it.hasNext()) {
            User A0k = DbT.A0k(it);
            if (A0k.getId().equals(str2)) {
                C59689JTv.A03(getContext(), getString(2131952058, new Object[]{DbX.A0q(getSession()), A0k.getUsername()}), (String) null, 1);
                getSession();
                Long.parseLong(A0k.getId());
                UserSession session = getSession();
                String id = A0k.getId();
                1NY A0N = DbU.A0N(session);
                A0N.A0A("multiple_accounts/unlink_from_main_accounts/");
                A0N.A0R(1XP.class, 1XY.class);
                1ES.A06(DbT.A0T(A0N, "main_account_ids", id), 245, false);
                AnonymousClass9BE.A00(getSession()).A01();
                DbT.A1I(this);
                return;
            }
        }
    }

    public final boolean onBackPressed() {
        DbT.A1I(this);
        return true;
    }

    public final void onCreate(Bundle bundle) {
        List list;
        int A02 = AnonymousClass0fD.A02(-1415752113);
        E7A.super.onCreate(bundle);
        this.A00 = new C47580E8s(requireContext(), this, this);
        AccountFamily A09 = Dba.A09(AnonymousClass9BG.A01(getSession()), getSession());
        if (A09 != null) {
            list = A09.A04;
        } else {
            list = null;
        }
        C47580E8s e8s = this.A00;
        ArrayList arrayList = e8s.A00;
        arrayList.clear();
        if (list != null) {
            arrayList.addAll(list);
        }
        C47580E8s.A00(e8s);
        this.A01 = new F2W(getSession());
        AnonymousClass0fD.A09(432970682, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1332168234);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.account_linking_child_group_management_fragment);
        ((AbsListView) A0C.requireViewById(R.id.list_view)).setAdapter(this.A00);
        AnonymousClass0fD.A09(2143795414, A02);
        return A0C;
    }

    public final void onDestroy() {
        int A02 = AnonymousClass0fD.A02(-1562959792);
        super.onDestroy();
        AnonymousClass9BE.A00(getSession()).A01();
        AnonymousClass0fD.A09(1854044197, A02);
    }

    public final void onStart() {
        int A02 = AnonymousClass0fD.A02(-806016793);
        E7A.super.onStart();
        this.A01.A00(requireActivity(), false);
        AnonymousClass0fD.A09(2079227626, A02);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        List emptyList;
        super.onViewCreated(view, bundle);
        if (this.A00.isEmpty()) {
            F44.A00(requireContext(), C50023FJi.A00(this, 3));
        }
        AccountFamily A09 = Dba.A09(AnonymousClass9BG.A01(getSession()), getSession());
        if (A09 != null) {
            emptyList = A09.A04;
        } else {
            emptyList = Collections.emptyList();
        }
        UserSession session = getSession();
        HashSet hashSet = new HashSet(emptyList.size());
        Iterator it = emptyList.iterator();
        while (it.hasNext()) {
            hashSet.add(DbV.A0q(DbT.A0k(it).getId()));
        }
        0Aj A0e = AnonymousClass7TE.A0e(DbX.A0Q(session), "ig_my_main_account_impression");
        A0e.AAJ("account_linking_session_id", String.valueOf(((EtA) session.A01(EtA.class, G1F.A00)).A00));
        A0e.AAF("array_current_main_account_ids", hashSet);
        A0e.Cgf();
    }
}
