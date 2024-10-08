package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;

/* renamed from: X.Mey  reason: case insensitive filesystem */
public final class C66914Mey extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "ModalFragment";
    public 2dZ A00;
    public AnonymousClass37D A01;
    public boolean A02 = true;
    public boolean A03;
    public boolean A04;
    public final AnonymousClass0eM A05 = C227642jf.A02(this);
    public final AnonymousClass06Q A06 = new C71495Olk(this, 2);

    public final void onSaveInstanceState(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("BUNDLE_KEY_IS_RIGHT_PANE_MODAL", this.A04);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        if (!(bundle2 == null || (i = bundle2.getInt("MODAL_FRAGMENT_ARG_BACKGROUND_COLOR")) == -1)) {
            view.setBackgroundColor(i);
        }
        this.A00 = 2dY.A01(new C71396Ojv(this, 6), DbX.A0I(view, R.id.action_bar_container));
        if (this.A03) {
            this.A01 = AnonymousClass37D.A00.A01(getRootActivity());
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    public final boolean onBackPressed() {
        AnonymousClass37D r0 = this.A01;
        if (r0 != null && r0.A0X()) {
            return true;
        }
        0hq childFragmentManager = getChildFragmentManager();
        0qQ.A07(childFragmentManager);
        AnonymousClass4DR A0P = childFragmentManager.A0P(R.id.child_container_view);
        if ((A0P instanceof AnonymousClass4DR) && A0P.onBackPressed()) {
            return true;
        }
        if (childFragmentManager.A0M() <= 0 || childFragmentManager.A12()) {
            return false;
        }
        C71342cb.A00(DbT.A0X(this.A05)).A0D((AnonymousClass0iw) A0P, "back", childFragmentManager.A0M());
        childFragmentManager.A13();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006d, code lost:
        if (r1 <= 0) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00ca, code lost:
        if (r2 != null) goto L_0x0014;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r6 = this;
            X.0hq r0 = r6.getChildFragmentManager()
            r3 = 2131429903(0x7f0b0a0f, float:1.8481492E38)
            androidx.fragment.app.Fragment r2 = r0.A0P(r3)
            X.2dZ r0 = r6.A00
            if (r0 == 0) goto L_0x00ca
            if (r2 == 0) goto L_0x0029
            X.AnonymousClass37C.A00(r2, r0)
        L_0x0014:
            X.2dZ r1 = r6.A00
            boolean r0 = r2 instanceof X.C227272iw
            if (r0 == 0) goto L_0x0023
            r0 = r2
            X.2iw r0 = (X.C227272iw) r0
            boolean r0 = r0.COC()
            if (r0 != 0) goto L_0x0029
        L_0x0023:
            if (r1 == 0) goto L_0x00ac
            boolean r0 = r1.A0A
            if (r0 != 0) goto L_0x00ac
        L_0x0029:
            android.view.View r5 = r6.mView
            if (r5 == 0) goto L_0x007a
            boolean r0 = r6.A03
            if (r0 != 0) goto L_0x007a
            boolean r0 = r6.A02
            if (r0 == 0) goto L_0x007a
            boolean r0 = r6.isAdded()
            if (r0 == 0) goto L_0x00aa
            X.0hq r0 = r6.getChildFragmentManager()
            androidx.fragment.app.Fragment r2 = r0.A0P(r3)
        L_0x0043:
            boolean r1 = r2 instanceof X.C262304De
            r0 = 0
            if (r1 == 0) goto L_0x00a8
            X.4De r2 = (X.C262304De) r2
        L_0x004a:
            r4 = 0
            if (r2 == 0) goto L_0x00a6
            boolean r3 = r2.CcT()
        L_0x0051:
            androidx.fragment.app.FragmentActivity r2 = r6.getActivity()
            boolean r0 = r2 instanceof X.AnonymousClass2Zo
            if (r0 == 0) goto L_0x009d
            X.2Zo r2 = (X.AnonymousClass2Zo) r2
            if (r2 == 0) goto L_0x009d
            com.instagram.mainactivity.InstagramMainActivity r2 = (com.instagram.mainactivity.InstagramMainActivity) r2
            int r1 = r2.A00
            r0 = -1
            if (r1 != r0) goto L_0x006b
            java.lang.String r1 = "MainActivity_getStatusBarHeightStable"
            java.lang.String r0 = "Status bar has invalid stable value. This is most likely because it has not been calculated yet."
            X.0wb.A03(r1, r0)
        L_0x006b:
            int r1 = r2.A00
            if (r1 <= 0) goto L_0x009d
        L_0x006f:
            if (r3 == 0) goto L_0x009b
            boolean r0 = X.C61290mR.A07()
            if (r0 != 0) goto L_0x009b
        L_0x0077:
            X.0nA.A0c(r5, r4)
        L_0x007a:
            boolean r0 = r6.isAdded()
            if (r0 == 0) goto L_0x009a
            boolean r0 = r6.A03
            if (r0 != 0) goto L_0x009a
            int r2 = X.AnonymousClass2uJ.A01
            if (r2 <= 0) goto L_0x009a
            androidx.fragment.app.FragmentActivity r1 = r6.getActivity()
            if (r1 == 0) goto L_0x009a
            r0 = 2131436510(0x7f0b23de, float:1.8494892E38)
            android.view.View r0 = r1.findViewById(r0)
            if (r0 == 0) goto L_0x009a
            X.0nA.A0T(r0, r2)
        L_0x009a:
            return
        L_0x009b:
            r4 = r1
            goto L_0x0077
        L_0x009d:
            androidx.fragment.app.FragmentActivity r0 = r6.getActivity()
            int r1 = X.2db.A01(r0)
            goto L_0x006f
        L_0x00a6:
            r3 = 0
            goto L_0x0051
        L_0x00a8:
            r2 = r0
            goto L_0x004a
        L_0x00aa:
            r2 = 0
            goto L_0x0043
        L_0x00ac:
            boolean r0 = r2 instanceof X.AnonymousClass4DS
            if (r0 == 0) goto L_0x0029
            int r0 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            boolean r0 = X.C227752jr.A01(r2)
            if (r0 != 0) goto L_0x0029
            android.view.View r2 = r2.mView
            if (r2 == 0) goto L_0x0029
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r2)
            int r1 = X.AnonymousClass3D4.A00(r0)
            r0 = 0
            r2.setPadding(r0, r1, r0, r0)
            goto L_0x0029
        L_0x00ca:
            if (r2 == 0) goto L_0x0029
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66914Mey.A00():void");
    }

    public final String getModuleName() {
        Fragment fragment;
        AnonymousClass0iw r1;
        String moduleName;
        if (isAdded()) {
            fragment = getChildFragmentManager().A0P(R.id.child_container_view);
        } else {
            fragment = null;
        }
        if (!(fragment instanceof AnonymousClass0iw) || (r1 = (AnonymousClass0iw) fragment) == null || (moduleName = r1.getModuleName()) == null) {
            return "modal_fragment_empty";
        }
        return moduleName;
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        int A022 = AnonymousClass0fD.A02(117439828);
        C66914Mey.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        if (!isAdded() || getChildFragmentManager().A0P(R.id.child_container_view) == null) {
            String A012 = C320236s2.A01(requireArguments, "MODAL_FRAGMENT_ARG_CHILD_FRAGMENT_NAME");
            Bundle bundle2 = requireArguments.getBundle("MODAL_FRAGMENT_ARG_CHILD_FRAGMENT_ARGS");
            if (bundle2 != null) {
                AnonymousClass0eM r1 = this.A05;
                AnonymousClass0Dg.A00(bundle2, DbT.A0X(r1));
                Fragment A002 = AnonymousClass6WB.A00(bundle2, requireActivity(), DbT.A0X(r1), A012);
                if (A002 != null) {
                    0s1 A0C = DbW.A0C(this);
                    A0C.A0A(A002, R.id.child_container_view);
                    A0C.A0K();
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            } else {
                IllegalStateException A0y = AnonymousClass7TE.A0y();
                AnonymousClass0fD.A09(1450731163, A022);
                throw A0y;
            }
        }
        getChildFragmentManager().A0s(this.A06);
        if (bundle != null) {
            z = bundle.getBoolean("BUNDLE_KEY_IS_RIGHT_PANE_MODAL");
        } else {
            z = requireArguments.getBoolean("MODAL_FRAGMENT_ARG_IS_RIGHT_PANE_MODAL");
        }
        this.A04 = z;
        this.A03 = requireArguments.getBoolean("MODAL_FRAGMENT_ARG_IS_TWO_PANE_MODAL");
        this.A02 = requireArguments.getBoolean("ARG_ADJUST_STATUS_BAR_OFFSET");
        AnonymousClass0fD.A09(367988357, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1572700376);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.modal_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-1182946552, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1500025760);
        super.onDestroy();
        0hq childFragmentManager = getChildFragmentManager();
        childFragmentManager.A0F.remove(this.A06);
        AnonymousClass0fD.A09(444243753, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-130678706);
        super.onDestroyView();
        this.A00 = null;
        AnonymousClass0fD.A09(-600605240, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1137690854);
        super.onResume();
        A00();
        AnonymousClass0fD.A09(-608428850, A022);
    }
}
