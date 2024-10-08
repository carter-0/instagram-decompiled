package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.search.SearchController;

/* renamed from: X.E2l  reason: case insensitive filesystem */
public final class C47439E2l extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "GlobalBlocksSearchFragment";
    public AnonymousClass2t9 A00;
    public F04 A01;
    public UserSession A02;
    public C337257fy A03;
    public SearchController A04;
    public boolean A05;
    public final C74502Pvw A06 = new C51002Fmp(this);
    public final G8B A07 = new C51051Fnh(this, 4);

    public final String getModuleName() {
        return "global_blocks_search";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        this.A05 = true;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext(), 1, false);
        F04 f04 = this.A01;
        0qQ.A0A(f04);
        f04.A00.EcJ(f04.A02);
        FragmentActivity requireActivity = requireActivity();
        ViewGroup A0C = DbU.A0C(view2, R.id.global_blocks_search_container);
        UserSession userSession = this.A02;
        if (userSession != null) {
            int A002 = AnonymousClass3D4.A00(DbT.A03(this));
            AnonymousClass2t9 r8 = this.A00;
            0qQ.A0A(r8);
            SearchController searchController = new SearchController(requireActivity, A0C, r8, linearLayoutManager, userSession, (C72208OyY) null, (C249383je) null, (C70598OCv) null, this.A06, A002, 0, false, false, false, false, false, false, false);
            this.A04 = searchController;
            searchController.A07 = true;
            registerLifecycleListener(searchController);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final AnonymousClass0wW getSession() {
        return this.A02;
    }

    public final void afterOnResume() {
        super.afterOnResume();
        if (this.A05) {
            SearchController searchController = this.A04;
            0qQ.A0A(searchController);
            searchController.A02(true, 0.0f);
            this.A05 = false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: type inference failed for: r0v4, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v6, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r16) {
        /*
            r15 = this;
            r0 = -2053081303(0xffffffff85a07729, float:-1.50901E-35)
            int r4 = X.AnonymousClass0fD.A02(r0)
            r7 = r15
            r0 = r16
            X.C47439E2l.super.onCreate(r0)
            com.instagram.common.session.UserSession r0 = X.DbX.A0V(r15)
            r15.A02 = r0
            android.content.Context r6 = r15.requireContext()
            com.instagram.common.session.UserSession r10 = r15.A02
            X.0qQ.A0A(r10)
            X.EZZ r8 = X.EZZ.BLOCKED_ACCOUNTS
            X.G8B r11 = r15.A07
            java.lang.String r12 = "blocked_list_user_row"
            java.lang.String r13 = "inbox_search"
            java.lang.String r14 = "search"
            X.F0x r5 = new X.F0x
            r9 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.2tC r2 = X.DbV.A0S(r15)
            android.content.Context r1 = r15.requireContext()
            X.EGE r0 = new X.EGE
            r0.<init>(r1, r15, r5)
            r2.A01(r0)
            X.EFm r0 = new X.EFm
            r0.<init>()
            r2.A01(r0)
            android.content.Context r1 = r15.requireContext()
            r6 = 0
            X.EG8 r0 = new X.EG8
            r0.<init>(r1, r6)
            r2.A01(r0)
            X.EFn r0 = new X.EFn
            r0.<init>()
            X.2t9 r0 = X.DbU.A0U(r2, r0)
            r15.A00 = r0
            android.content.Context r5 = r15.requireContext()
            com.instagram.common.session.UserSession r3 = r15.A02
            X.0qQ.A0A(r3)
            android.content.Context r2 = r15.requireContext()
            X.0gy r0 = X.AnonymousClass07i.A00(r15)
            X.2lw r1 = new X.2lw
            r1.<init>(r2, r0, r6)
            X.N3d r0 = X.C70975OTw.A00()
            X.7eL r0 = X.C67562Mpw.A04(r5, r3, r1, r0)
            r15.A03 = r0
            com.instagram.common.session.UserSession r3 = r15.A02
            X.0qQ.A0A(r3)
            X.7fy r2 = r15.A03
            X.0qQ.A0A(r2)
            android.content.Context r0 = r15.requireContext()
            X.F1s r1 = new X.F1s
            r1.<init>(r0)
            X.F04 r0 = new X.F04
            r0.<init>(r3, r2, r1, r15)
            r15.A01 = r0
            r0 = 270863474(0x10250c72, float:3.25501E-29)
            X.AnonymousClass0fD.A09(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47439E2l.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1536715687);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.global_blocks_search_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-1064009667, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-606611261);
        super.onDestroy();
        this.A00 = null;
        C337257fy r0 = this.A03;
        0qQ.A0A(r0);
        r0.DDU();
        AnonymousClass0fD.A09(-1520369749, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1295373414);
        super.onDestroyView();
        unregisterLifecycleListener(this.A04);
        this.A04 = null;
        AnonymousClass0fD.A09(1357903107, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1314990215);
        C47439E2l.super.onPause();
        SearchController searchController = this.A04;
        0qQ.A0A(searchController);
        searchController.A00();
        AnonymousClass0fD.A09(1686773302, A022);
    }

    public final void configureActionBar(2da r1) {
        Dba.A1G(r1);
    }
}
