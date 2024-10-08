package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.ui.widget.search.SearchController;
import com.instagram.user.model.User;

public final class E7F extends C273374mT implements C74502Pvw, AnonymousClass4DS, G7T {
    public static final String __redex_internal_original_name = "RestrictSearchFragment";
    public C337257fy A00;
    public SearchController A01;
    public boolean A02;

    public final float Abo(SearchController searchController, Integer num) {
        return 0.0f;
    }

    public final void CvL(SearchController searchController, Integer num, float f, float f2) {
    }

    public final void DRx() {
    }

    public final void DRz() {
    }

    public final void Dhf(SearchController searchController, boolean z) {
    }

    public final void Dht(String str, boolean z) {
    }

    public final void Dhw(String str, String str2) {
        0qQ.A0B(str, 0);
        C337257fy r0 = this.A00;
        if (r0 == null) {
            0qQ.A0F("searchProvider");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r0.EhX(str);
        }
    }

    public final void Dmq(SearchController searchController, Integer num, Integer num2) {
    }

    public final void Dw0(User user, int i) {
        Fragment fragment;
        0hq r1;
        if (getTargetFragment() instanceof E73) {
            Fragment targetFragment = getTargetFragment();
            if ((targetFragment instanceof E73) && (fragment = (E73) targetFragment) != null && (r1 = fragment.mFragmentManager) != null) {
                r1.A13();
                if (i == 0) {
                    0wc r3 = fragment.A00;
                    if (r3 != null) {
                        AnonymousClass73V.A0A(r3, user, "click", "add_account");
                        1YZ r2 = fragment.A02;
                        if (r2 != null) {
                            r2.A03(fragment.requireContext(), AnonymousClass07i.A00(fragment), fragment.getSession(), new C51090FoK(fragment.requireActivity(), true), user.getId(), "restrict_home", (String) null, (String) null);
                            return;
                        }
                        return;
                    }
                } else if (i != 1) {
                    return;
                } else {
                    if (C324536zU.A00(fragment.getSession())) {
                        FFO.A02(fragment.requireContext(), fragment.getSession(), "unrestrict_account");
                        return;
                    }
                    0wc r32 = fragment.A00;
                    if (r32 != null) {
                        AnonymousClass73V.A0A(r32, user, "click", "remove_restricted_account");
                        1YZ r5 = fragment.A02;
                        if (r5 != null) {
                            r5.A02(fragment.requireContext(), AnonymousClass07i.A00(fragment), fragment.getSession(), new C51090FoK(fragment.requireActivity(), false), user.getId(), "restrict_home");
                            return;
                        }
                        return;
                    }
                }
                DbS.A12();
                throw AnonymousClass00P.createAndThrow();
            }
            return;
        }
        0wb.A03(__redex_internal_original_name, "Target fragment does not implement search delegate.");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r19, android.os.Bundle r20) {
        /*
            r18 = this;
            r10 = 0
            r1 = r19
            X.0qQ.A0B(r1, r10)
            r7 = r18
            r0 = r20
            super.onViewCreated(r1, r0)
            com.instagram.common.session.UserSession r0 = r7.getSession()
            boolean r3 = X.C324536zU.A00(r0)
            android.app.Activity r2 = r7.getRootActivity()
            if (r2 != 0) goto L_0x001f
            android.content.Context r2 = r1.getContext()
        L_0x001f:
            X.0qQ.A0A(r2)
            com.instagram.common.session.UserSession r0 = r7.getSession()
            X.E8y r4 = new X.E8y
            r4.<init>(r2, r0, r7, r3)
            com.instagram.common.session.UserSession r12 = r7.getSession()
            android.content.Context r2 = r7.requireContext()
            X.0gy r0 = X.AnonymousClass07i.A00(r7)
            r6 = 0
            X.2lw r13 = new X.2lw
            r13.<init>(r2, r0, r6)
            r0 = 9
            X.Lwt r14 = new X.Lwt
            r14.<init>(r7, r0)
            r0 = 4510(0x119e, float:6.32E-42)
            java.lang.String r15 = X.AnonymousClass000.A00(r0)
            r11 = r6
            r16 = r6
            r17 = r10
            X.7eO r0 = X.C336237eI.A00(r11, r12, r13, r14, r15, r16, r17)
            r7.A00 = r0
            r0.EcJ(r4)
            androidx.fragment.app.FragmentActivity r2 = r7.requireActivity()
            r0 = 2131439954(0x7f0b3152, float:1.8501878E38)
            android.view.ViewGroup r3 = X.DbU.A0C(r1, r0)
            com.instagram.common.session.UserSession r5 = r7.getSession()
            r8 = -1
            android.app.Activity r0 = r7.getRootActivity()
            if (r0 != 0) goto L_0x0072
            android.content.Context r0 = r1.getContext()
        L_0x0072:
            X.0qQ.A0A(r0)
            int r9 = X.AnonymousClass3D4.A00(r0)
            com.instagram.ui.widget.search.SearchController r1 = new com.instagram.ui.widget.search.SearchController
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r7.A01 = r1
            r7.registerLifecycleListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E7F.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void DDU() {
        if (AnonymousClass06S.A01(this.mFragmentManager)) {
            DbX.A1J(this);
        }
    }

    public final String getModuleName() {
        return "restrict_search";
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0010: MOVE  (r4v1 X.4mT) = (r4v0 X.4mT)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void DwX(java.lang.String r6) {
        /*
            r5 = this;
            androidx.fragment.app.Fragment r0 = r5.getTargetFragment()
            boolean r0 = r0 instanceof X.E73
            if (r0 == 0) goto L_0x0037
            androidx.fragment.app.Fragment r4 = r5.getTargetFragment()
            boolean r0 = r4 instanceof X.E73
            if (r0 == 0) goto L_0x0036
            X.4mT r4 = (X.C273374mT) r4
            if (r4 == 0) goto L_0x0036
            X.0hq r0 = r4.mFragmentManager
            if (r0 == 0) goto L_0x0036
            r0.A13()
            com.instagram.common.session.UserSession r2 = r4.getSession()
            java.lang.String r1 = "restrict_home"
            java.lang.String r0 = "restrict_search_user_row"
            X.Dfc r3 = X.C46548Dgp.A01(r2, r6, r0, r1)
            X.6Yo r2 = X.Dbb.A0G(r4)
            X.1a1 r1 = X.C46447Df9.A02()
            com.instagram.common.session.UserSession r0 = r4.getSession()
            X.C46474Dfc.A03(r2, r0, r1, r3)
        L_0x0036:
            return
        L_0x0037:
            java.lang.String r1 = "RestrictSearchFragment"
            java.lang.String r0 = "Target fragment does not implement search delegate."
            X.0wb.A03(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E7F.DwX(java.lang.String):void");
    }

    public final void afterOnResume() {
        super.afterOnResume();
        if (this.A02) {
            SearchController searchController = this.A01;
            if (searchController != null) {
                searchController.A02(true, 0.0f);
            }
            this.A02 = false;
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-199464524);
        0qQ.A0B(layoutInflater, 0);
        this.A02 = true;
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.fragment_restrict_search, false);
        AnonymousClass0fD.A09(2027121207, A022);
        return A0D;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(983066777);
        super.onDestroyView();
        this.A01 = null;
        AnonymousClass0fD.A09(583616148, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(2092069830);
        E7F.super.onPause();
        SearchController searchController = this.A01;
        if (searchController != null) {
            searchController.A00();
        }
        AnonymousClass0fD.A09(1178945226, A022);
    }

    public final void configureActionBar(2da r1) {
        Dba.A1G(r1);
    }
}
