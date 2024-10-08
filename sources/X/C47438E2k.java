package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: X.E2k  reason: case insensitive filesystem */
public final class C47438E2k extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "GlobalBlocksFragment";
    public UserSession A00;
    public C49707F2s A01;
    public RecyclerView A02;
    public AnonymousClass2t9 A03;
    public final View.OnClickListener A04 = FP4.A00(this, 43);
    public final View.OnClickListener A05 = FP4.A00(this, 44);
    public final C229132mt A06 = new C50436Fbj(this, 5);
    public final G5G A07 = new C50997Fmk(this);

    public final void configureActionBar(2da r5) {
        0qQ.A0B(r5, 0);
        DbW.A1B(r5, 2131963001);
        if (DbY.A1Y(0Tu.A05, this.A00, 36311685040046813L)) {
            AnonymousClass3JR A0K = DbS.A0K();
            A0K.A06 = R.drawable.instagram_add_pano_outline_24;
            A0K.A05 = 2131972797;
            DbX.A19(this.A04, A0K, r5);
        }
    }

    public final String getModuleName() {
        return "blocked_list";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A02 = DbT.A0I(view, R.id.global_blocks_recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext(), 1, false);
        RecyclerView recyclerView = this.A02;
        0qQ.A0A(recyclerView);
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView2 = this.A02;
        0qQ.A0A(recyclerView2);
        recyclerView2.setAdapter(this.A03);
        RecyclerView recyclerView3 = this.A02;
        0qQ.A0A(recyclerView3);
        recyclerView3.A15(new C3251871j(linearLayoutManager, this.A06, C3251771i.A0A, false, false));
        C49707F2s f2s = this.A01;
        0qQ.A0A(f2s);
        if (!f2s.A01) {
            FAH fah = f2s.A07;
            fah.A00.clear();
            fah.A01.clear();
            f2s.A00();
            f2s.A01 = true;
        }
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    public final void A00(ViewModelListUpdate viewModelListUpdate) {
        if (isAdded()) {
            AnonymousClass2t9 r0 = this.A03;
            0qQ.A0A(r0);
            r0.A05(viewModelListUpdate);
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v7, types: [X.2tF, java.lang.Object] */
    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-903076197);
        C47438E2k.super.onCreate(bundle);
        this.A00 = DbX.A0V(this);
        Context requireContext = requireContext();
        FragmentActivity requireActivity = requireActivity();
        UserSession userSession = this.A00;
        0qQ.A0A(userSession);
        this.A01 = new C49707F2s(requireContext, requireActivity, userSession, this);
        Context requireContext2 = requireContext();
        UserSession userSession2 = this.A00;
        0qQ.A0A(userSession2);
        C49665F0x f0x = new C49665F0x(requireContext2, this, EZZ.BLOCKED_ACCOUNTS, this, userSession2, (G8B) null, "blocked_list_user_row", "blocked_accounts_list", "blocked_accounts_list");
        AnonymousClass2tC A0S = DbV.A0S(this);
        A0S.A01(new EGE(requireContext(), this, f0x));
        A0S.A01(new EGK(this.A07));
        A0S.A01(new Object());
        A0S.A01(new EFx(this.A05));
        this.A03 = DbU.A0U(A0S, new Object());
        AnonymousClass0fD.A09(-1437744829, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2007198768);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.global_blocks_fragment, viewGroup, false);
        AnonymousClass0fD.A09(1357587765, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(853577452);
        super.onDestroyView();
        RecyclerView recyclerView = this.A02;
        if (recyclerView != null) {
            recyclerView.setLayoutManager((C252553pI) null);
            RecyclerView recyclerView2 = this.A02;
            0qQ.A0A(recyclerView2);
            recyclerView2.setAdapter((2Rw) null);
            RecyclerView recyclerView3 = this.A02;
            0qQ.A0A(recyclerView3);
            recyclerView3.A0b();
            this.A02 = null;
        }
        AnonymousClass0fD.A09(-37825919, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(500071817);
        C47438E2k.super.onPause();
        C49707F2s f2s = this.A01;
        0qQ.A0A(f2s);
        FAH fah = f2s.A07;
        C49415EvH evH = f2s.A05;
        Iterator it = fah.A02.iterator();
        while (it.hasNext()) {
            Object obj = ((Reference) it.next()).get();
            if (obj == null || obj == evH) {
                it.remove();
            }
        }
        AnonymousClass0fD.A09(-812361161, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1786310552);
        super.onResume();
        C49707F2s f2s = this.A01;
        0qQ.A0A(f2s);
        FAH fah = f2s.A07;
        fah.A02.add(new WeakReference(f2s.A05));
        C49607EzQ ezQ = f2s.A04;
        if (!ezQ.A02) {
            f2s.A08.A00(f2s.A06.A00(ezQ, DbU.A0K(fah.A00)));
        }
        AnonymousClass0fD.A09(1039913311, A022);
    }
}
