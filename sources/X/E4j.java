package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.instagram.accountlinking.model.AccountFamily;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public final class E4j extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS, G5O {
    public static final String __redex_internal_original_name = "AccountLinkingMainGroupManagementFragment";
    public C47576E8o A00;
    public AnonymousClass9BG A01;
    public 2da A02;
    public 1wn A03;
    public UserSession A04;
    public List A05;
    public boolean A06;
    public F2W A07;
    public String A08;
    public Set A09 = AnonymousClass7TE.A1F();
    public boolean A0A;

    public final String getModuleName() {
        return "account_linking_main_group_management";
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, X.0Js] */
    public static void A00(C49445Evm evm, E4j e4j) {
        ArrayList A1D = AnonymousClass7TE.A1D(e4j.A00.A04);
        e4j.A06 = true;
        Dbb.A17(e4j, true);
        2da r1 = e4j.A02;
        if (r1 != null) {
            r1.EVS(false);
        }
        C49579Eyo eyo = new C49579Eyo(e4j.requireContext(), AnonymousClass07i.A00(e4j), new EDV(1, e4j, evm), A1D);
        String str = e4j.A04.A06;
        if (!09i.A0A.A0A(new Object(), (0Jv) null, eyo, str)) {
            F44.A00(e4j.requireContext(), (DialogInterface.OnClickListener) null);
            e4j.A06 = false;
            Dbb.A17(e4j, false);
            2da r0 = e4j.A02;
            if (r0 != null) {
                r0.EVS(true);
            }
        }
        0xI A002 = 0xI.A00(e4j, "ig_manage_main_account_attempt");
        A03(e4j, A002);
        A02(e4j, A002);
        C48310EcT.A00(A002, e4j.A04);
    }

    public static void A02(E4j e4j, 0xI r6) {
        List list = e4j.A05;
        list.getClass();
        ArrayList A0v = DbS.A0v(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DbY.A1W(A0v, it);
        }
        HashSet hashSet = new HashSet(A0v);
        Set set = e4j.A09;
        17k.A07(set, "set2");
        R1J r1j = new R1J(hashSet, set);
        Set set2 = e4j.A00.A04;
        Set set3 = e4j.A09;
        17k.A07(set2, "set1");
        17k.A07(set3, "set2");
        R1J r1j2 = new R1J(set2, set3);
        r6.A0D("array_currently_connected_account_ids", new LinkedList(e4j.A09));
        r6.A0D("array_currently_unconnected_account_ids", new LinkedList(r1j));
        r6.A0D("array_new_connected_account_ids", new LinkedList(r1j2));
    }

    public static void A03(E4j e4j, 0xI r3) {
        r3.A09("is_removing", DbT.A0l(e4j.A00.A04.containsAll(e4j.A09)));
    }

    public static void A04(E4j e4j, boolean z) {
        AccountFamily A092 = Dba.A09(e4j.A01, e4j.A04);
        A092.getClass();
        Iterator it = A092.A03.iterator();
        while (it.hasNext()) {
            e4j.A00.A0C(DbT.A0k(it).getId(), true);
        }
        if (z) {
            e4j.A09 = new HashSet(e4j.A00.A04);
        }
    }

    public final AnonymousClass0wW getSession() {
        return this.A04;
    }

    public final boolean onBackPressed() {
        if (this.A06) {
            return true;
        }
        boolean z = this.A0A;
        0hq parentFragmentManager = getParentFragmentManager();
        if (z) {
            parentFragmentManager.A0c();
            return true;
        }
        parentFragmentManager.A0y(C273654mx.A00(528), 0);
        return true;
    }

    public static void A01(E4j e4j) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        AccountFamily A092 = Dba.A09(e4j.A01, e4j.A04);
        if (A092 != null) {
            Iterator it = A092.A03.iterator();
            while (it.hasNext()) {
                User A0k = DbT.A0k(it);
                A1H.put(A0k.getId(), A0k);
            }
            e4j.A05 = new LinkedList(A1H.values());
        }
    }

    public final void configureActionBar(2da r4) {
        r4.setTitle(requireActivity().getString(2131952063));
        r4.ErD((View.OnClickListener) null, R.drawable.zero_size_shape).setEnabled(false);
        DbX.A1A(new FP6((Object) this, 4), DbV.A0K(), r4);
        r4.EVS(!this.A06);
        r4.setIsLoading(this.A06);
        this.A02 = r4;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1748545269);
        E4j.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        UserSession A0U = DbX.A0U(this);
        this.A04 = A0U;
        this.A01 = AnonymousClass9BG.A01(A0U);
        this.A07 = new F2W(this.A04);
        this.A0A = DbT.A1X(requireArguments, "should_pop_back_stack_without_name");
        this.A00 = new C47576E8o(requireActivity(), this, this, this);
        A01(this);
        this.A00.A0D(this.A05);
        A04(this, true);
        this.A03 = FXZ.A00(this, 1);
        AnonymousClass0fD.A09(582711279, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-740378673);
        View inflate = layoutInflater.inflate(R.layout.account_linking_main_group_management_fragment, viewGroup, false);
        TextView A0G = DbU.A0G(inflate, R.id.main_account_explanation_textview);
        Resources resources = requireActivity().getResources();
        UserSession userSession = this.A04;
        0eE r8 = AnonymousClass0t1.A01;
        A0G.setText(0bC.A01(resources, new String[]{DbU.A0n(userSession, r8), DbU.A0n(this.A04, r8)}, 2131952076));
        View requireViewById = inflate.requireViewById(R.id.main_account_row);
        Context requireContext = requireContext();
        User A012 = r8.A01(this.A04);
        F44.A01(requireContext, this, DbU.A0X(requireViewById, R.id.avatar_imageview), A012);
        requireViewById.setBackgroundResource(2Yu.A0H(requireContext, R.attr.accountLinkingMainAccountBackground));
        DbU.A1H(DbU.A0G(requireViewById, R.id.username_textview), A012);
        C71662eb A0T = DbY.A0T(requireViewById, R.id.checkbox_viewstub);
        A0T.A01().setBackgroundDrawable(AnonymousClass3JT.A07(requireContext, R.color.blue_5_30_transparent));
        ((CompoundButton) A0T.A01()).setChecked(true);
        A0T.A01().setClickable(false);
        ((AbsListView) inflate.requireViewById(R.id.list_view)).setAdapter(this.A00);
        AnonymousClass0fD.A09(-86861325, A022);
        return inflate;
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1801854969);
        super.onResume();
        if (!TextUtils.isEmpty(this.A08)) {
            String str = this.A08;
            this.A08 = null;
            C47576E8o e8o = this.A00;
            0qQ.A0B(str, 0);
            C49445Evm evm = (C49445Evm) e8o.A03.get(str);
            evm.getClass();
            C59689JTv.A03(getContext(), getString(2131952058, new Object[]{evm.A01.getUsername(), DbX.A0q(this.A04)}), (String) null, 1);
            this.A00.A0C(str, false);
            1xC.A01.A02(this.A03, C298125sv.class);
            A00(evm, this);
        }
        AnonymousClass0fD.A09(-55098823, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(1273376474);
        E4j.super.onStart();
        this.A07.A00(requireActivity(), true);
        AnonymousClass0fD.A09(772709542, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-557261066);
        E4j.super.onStop();
        1xC.A01.A03(this.A03, C298125sv.class);
        this.A02 = null;
        AnonymousClass0fD.A09(-133428674, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.A00.isEmpty()) {
            F44.A00(requireContext(), C50023FJi.A00(this, 4));
        }
        0xI A002 = 0xI.A00(this, "ig_manage_main_account_impression");
        A02(this, A002);
        C48310EcT.A00(A002, this.A04);
    }

    public final void DWL(String str, String str2) {
        this.A08 = str;
    }
}
