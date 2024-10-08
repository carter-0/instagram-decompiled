package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.recyclerview.RefreshableRecyclerViewLayout;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public final class UZ2 extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "VotingInfoCenterFragment";
    public C229382nI A00;
    public UserSession A01;
    public RefreshableRecyclerViewLayout A02;
    public W1R A03;
    public C17356VSj A04;
    public C17934ViP A05;
    public U9i A06;
    public C18008Vjk A07;
    public AnonymousClass6ST A08;
    public 2el A09;
    public boolean A0A;
    public final VOG A0B = new VOG(this);

    /* JADX WARNING: type inference failed for: r10v0, types: [X.07Z, androidx.fragment.app.Fragment, X.UZ2] */
    public final void A01() {
        C16724V3h v3h;
        VW1 vw1;
        String str;
        this.A07.A00("change_state");
        C17934ViP viP = this.A05;
        FragmentActivity requireActivity = requireActivity();
        C229382nI r6 = this.A00;
        0qQ.A0B(r6, 2);
        C15256UXq uXq = viP.A00;
        if (uXq != null && (v3h = uXq.A02) != null && (vw1 = v3h.A00) != null && (str = vw1.A00) != null) {
            Map map = vw1.A02;
            if (map == null) {
                map = new LinkedHashMap();
            }
            map.put("module", "voting_info_center");
            C360678ey A052 = C359988do.A05(viP.A03, str, map);
            A052.A00(new C15411UcN(4, r6, viP, this, this));
            1ES.A00(requireActivity, AnonymousClass07i.A00(this), A052);
        }
    }

    public final String getModuleName() {
        return "voting_info_center";
    }

    public final int A00() {
        C15256UXq uXq = this.A05.A00;
        if (uXq == null || !uXq.A08) {
            return R.color.canvas_bottom_sheet_description_text_color;
        }
        return 2Yu.A0B(requireContext());
    }

    public final AnonymousClass0wW getSession() {
        return this.A01;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-525947184);
        UZ2.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = DbX.A0U(this);
        EWI ewi = (EWI) requireArguments.getSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        if (ewi == null) {
            ewi = EWI.UNKNOWN;
        }
        String string = requireArguments.getString("media_id");
        String string2 = requireArguments.getString("utm_source");
        String string3 = requireArguments.getString("hoisted_module_id_or_url_path");
        2el A0U = DbY.A0U();
        this.A09 = A0U;
        C229382nI A023 = C229382nI.A02(this, this, this.A01, A0U);
        this.A00 = A023;
        A023.A01.put(R.id.info_center_refresh_callback, new WYQ(this));
        C18008Vjk vjk = new C18008Vjk(this, this.A01, ewi, string, string2);
        this.A07 = vjk;
        this.A05 = new C17934ViP(this.A01, ewi, vjk, string, string3);
        this.A03 = new W1R(requireActivity(), this.A01, this.A05, this);
        this.A04 = new C17356VSj(this.A09, this.A07);
        C18008Vjk vjk2 = this.A07;
        vjk2.A00 = System.currentTimeMillis();
        vjk2.A01("entry", false);
        UserSession userSession = this.A01;
        C229382nI r4 = this.A00;
        VOG vog = this.A0B;
        2Rw r1 = new 2Rw();
        r1.A07 = new ArrayList();
        r1.A00 = r4;
        r1.A03 = this;
        r1.A05 = AnonymousClass05K.A01;
        r1.A02 = vog;
        r1.A01 = userSession;
        this.A06 = r1;
        this.A0A = true;
        AnonymousClass0fD.A09(930512646, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1887102813);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.layout_info_center);
        AnonymousClass0fD.A09(1112892486, A022);
        return A0C;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1571822574);
        this.A07.A01("exit", true);
        super.onDestroy();
        AnonymousClass0fD.A09(-1157812956, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-2053577922);
        super.onDestroyView();
        RefreshableRecyclerViewLayout refreshableRecyclerViewLayout = this.A02;
        if (refreshableRecyclerViewLayout != null) {
            refreshableRecyclerViewLayout.setAdapter((2Rw) null);
        }
        this.A02 = null;
        W1R w1r = this.A03;
        w1r.A0F = null;
        w1r.A0D = null;
        w1r.A0A = null;
        w1r.A05 = null;
        w1r.A0L.removeAllUpdateListeners();
        AnonymousClass0fD.A09(-1671501241, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(698534998);
        UZ2.super.onPause();
        this.A03.A0L.cancel();
        AnonymousClass0fD.A09(300739882, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-987784982);
        super.onResume();
        W1R w1r = this.A03;
        Activity rootActivity = getRootActivity();
        rootActivity.getClass();
        w1r.A03();
        2db.A02(rootActivity, rootActivity.getColor(R.color.fds_transparent));
        W1R.A02(w1r);
        AnonymousClass0fD.A09(1011841913, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(-571812501);
        UZ2.super.onStart();
        DbZ.A1P(this, 8);
        W1R w1r = this.A03;
        Activity rootActivity = getRootActivity();
        View view = w1r.A0A;
        if (view != null) {
            if (!(rootActivity == null || rootActivity.getWindow() == null)) {
                2db.A08(rootActivity.getWindow(), true);
            }
            int A012 = 2db.A01(rootActivity);
            w1r.A04 = A012;
            view.setLayoutParams(new C71492dQ(-1, A012));
            2dZ r0 = w1r.A0D;
            if (r0 != null) {
                r0.A0P.setTranslationY((float) w1r.A04);
            }
            View view2 = w1r.A09;
            if (view2 != null) {
                view2.setTranslationY((float) w1r.A04);
            }
        }
        AnonymousClass0fD.A09(-224132799, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(928032536);
        UZ2.super.onStop();
        DbZ.A1P(this, 0);
        W1R w1r = this.A03;
        Activity rootActivity = getRootActivity();
        rootActivity.getClass();
        if (rootActivity.getWindow() != null) {
            2db.A08(rootActivity.getWindow(), false);
            2db.A02(rootActivity, w1r.A0K);
        }
        AnonymousClass0fD.A09(-2131023281, A022);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x00a6, code lost:
        if (r1 < 0) goto L_0x00a8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r10, android.os.Bundle r11) {
        /*
            r9 = this;
            super.onViewCreated(r10, r11)
            r0 = 2131439344(0x7f0b2ef0, float:1.850064E38)
            android.view.View r0 = r10.requireViewById(r0)
            com.instagram.common.ui.widget.recyclerview.RefreshableRecyclerViewLayout r0 = (com.instagram.common.ui.widget.recyclerview.RefreshableRecyclerViewLayout) r0
            r9.A02 = r0
            androidx.recyclerview.widget.RecyclerView r1 = r0.A0P
            r0 = 0
            r1.setItemAnimator(r0)
            com.instagram.common.ui.widget.recyclerview.RefreshableRecyclerViewLayout r2 = r9.A02
            android.content.Context r1 = r10.getContext()
            android.widget.Scroller r0 = new android.widget.Scroller
            r0.<init>(r1)
            r2.A06 = r0
            com.instagram.common.ui.widget.recyclerview.RefreshableRecyclerViewLayout r2 = r9.A02
            android.content.Context r1 = r9.getContext()
            X.U9Y r0 = new X.U9Y
            r0.<init>(r1)
            r2.setLayoutManager(r0)
            com.instagram.common.ui.widget.recyclerview.RefreshableRecyclerViewLayout r1 = r9.A02
            X.U9i r0 = r9.A06
            r1.setAdapter(r0)
            com.instagram.common.ui.widget.recyclerview.RefreshableRecyclerViewLayout r1 = r9.A02
            X.WTY r0 = new X.WTY
            r0.<init>(r9)
            r1.A08 = r0
            X.W1R r4 = r9.A03
            android.app.Activity r3 = r9.getRootActivity()
            r3.getClass()
            com.instagram.common.ui.widget.recyclerview.RefreshableRecyclerViewLayout r7 = r9.A02
            r0 = 2131442895(0x7f0b3ccf, float:1.8507843E38)
            android.view.View r0 = r10.requireViewById(r0)
            r4.A09 = r0
            r0 = 2131441735(0x7f0b3847, float:1.850549E38)
            android.widget.TextView r0 = X.DbU.A0G(r10, r0)
            r4.A0C = r0
            r0 = 2131429812(0x7f0b09b4, float:1.8481307E38)
            android.widget.TextView r0 = X.DbU.A0G(r10, r0)
            r4.A0B = r0
            android.widget.TextView r1 = r4.A0C
            java.lang.String r0 = r4.A0H
            r1.setText(r0)
            android.widget.TextView r1 = r4.A0B
            java.lang.String r0 = r4.A0G
            r1.setText(r0)
            r4.A0F = r9
            r0 = 2131443671(0x7f0b3fd7, float:1.8509417E38)
            android.view.ViewGroup r2 = X.DbU.A0C(r10, r0)
            r1 = 37
            X.WB9 r0 = new X.WB9
            r0.<init>((java.lang.Object) r4, (int) r1)
            X.2dZ r0 = X.2dY.A01(r0, r2)
            r4.A0D = r0
            X.VOF r6 = r4.A0S
            r8 = 0
            X.0qQ.A0B(r6, r8)
            java.util.List r5 = r7.A0T
            int r2 = r5.size()
            r1 = 0
        L_0x0096:
            if (r1 >= r2) goto L_0x00a8
            java.lang.Object r0 = r5.get(r1)
            X.34S r0 = (X.AnonymousClass34S) r0
            java.lang.Object r0 = r0.A00
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0166
            if (r1 >= 0) goto L_0x00ba
        L_0x00a8:
            X.UAs r1 = new X.UAs
            r1.<init>(r7, r6)
            X.34S r0 = new X.34S
            r0.<init>(r6, r1)
            r5.add(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r7.A0P
            r0.A15(r1)
        L_0x00ba:
            r0 = 2131443674(0x7f0b3fda, float:1.8509423E38)
            android.view.View r1 = r10.requireViewById(r0)
            r4.A0A = r1
            android.graphics.drawable.ColorDrawable r0 = r4.A0N
            r1.setBackground(r0)
            android.animation.ValueAnimator r2 = r4.A0L
            r1 = 5
            X.W4K r0 = new X.W4K
            r0.<init>(r1, r4, r3)
            r2.addUpdateListener(r0)
            r4.A03()
            X.W1R.A00(r3, r4)
            r0 = 2131442895(0x7f0b3ccf, float:1.8507843E38)
            android.view.View r2 = r10.requireViewById(r0)
            r1 = 42
            X.WB9 r0 = new X.WB9
            r0.<init>((X.UZ2) r9, (int) r1)
            X.AnonymousClass0fU.A00(r0, r2)
            X.2el r2 = r9.A09
            X.3DZ r1 = X.AnonymousClass3DZ.A00(r9)
            com.instagram.common.ui.widget.recyclerview.RefreshableRecyclerViewLayout r0 = r9.A02
            r2.A06(r0, r1)
            androidx.fragment.app.FragmentActivity r0 = r9.requireActivity()
            X.6ST r2 = new X.6ST
            r2.<init>(r0)
            r9.A08 = r2
            androidx.fragment.app.FragmentActivity r1 = r9.requireActivity()
            r0 = 2131965491(0x7f133633, float:1.9567793E38)
            java.lang.String r0 = r1.getString(r0)
            r2.A00(r0)
            boolean r0 = r9.isAdded()
            if (r0 == 0) goto L_0x015a
            android.content.Context r3 = r9.requireContext()
            r6 = 2131100246(0x7f060256, float:1.7812868E38)
            r7 = 2131100269(0x7f06026d, float:1.7812915E38)
            r0 = 2131100221(0x7f06023d, float:1.7812817E38)
            int[] r4 = new int[]{r6, r7, r0}
            r5 = 1069547520(0x3fc00000, float:1.5)
            X.6xz r2 = X.C323716xz.A00(r3, r4, r5, r6, r7, r8)
            r0 = 84
            float r0 = X.0nA.A04(r3, r0)
            int r0 = (int) r0
            r2.A02 = r0
            r2.invalidateSelf()
            r2.A01 = r0
            r2.invalidateSelf()
            com.instagram.common.ui.widget.recyclerview.RefreshableRecyclerViewLayout r1 = r9.A02
            r1.getClass()
            r0 = 8
            float r0 = X.0nA.A04(r3, r0)
            int r0 = (int) r0
            r1.A03 = r0
            r1.A07 = r2
            android.widget.ImageView r0 = r1.A0O
            r0.setImageDrawable(r2)
            com.instagram.common.ui.widget.recyclerview.RefreshableRecyclerViewLayout r1 = r9.A02
            X.WTZ r0 = new X.WTZ
            r0.<init>(r9)
            r1.A09 = r0
        L_0x015a:
            boolean r0 = r9.A0A
            if (r0 == 0) goto L_0x0165
            X.ViP r0 = r9.A05
            r0.A00(r9, r9)
            r9.A0A = r8
        L_0x0165:
            return
        L_0x0166:
            int r1 = r1 + 1
            goto L_0x0096
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UZ2.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
