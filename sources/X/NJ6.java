package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.request.DirectThreadApi;
import java.util.Collections;
import java.util.Set;

public final class NJ6 extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "DirectAllThreadJoinRequestsFragment";
    public UserSession A00;
    public C67808MvC A01;
    public OLT A02;
    public String A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public View A0A;
    public RecyclerView A0B;
    public final Set A0C = AnonymousClass7TE.A1F();
    public final PRX A0D = new PRX(this);
    public final C74402PuI A0E = new P4B(this, 0);
    public final C229132mt A0F = new C72693PFx(this, 2);
    public final C229122ms A0G = new PRL(this, 5);

    public final String getModuleName() {
        return "all_join_requests";
    }

    public static void A00(NJ6 nj6) {
        boolean A1b = C66580MXl.A1b(nj6.A0C);
        View view = nj6.A0A;
        int i = 2131958575;
        if (nj6.A07) {
            i = 2131958574;
        }
        String string = nj6.getString(i);
        C71401Ok0 A002 = C71401Ok0.A00(nj6, 41);
        0qQ.A0B(string, 1);
        O30.A00(view, new C70661OFi(A002, string, (String) null, -1), A1b, false, nj6.A05);
    }

    public static void A01(NJ6 nj6) {
        if (!nj6.A06) {
            OLT olt = nj6.A02;
            if (olt == null || !2PP.A00(olt.A02, "MINCURSOR")) {
                if (nj6.A02 == null) {
                    C69943Nuj.A00(nj6.A00, nj6.A0E, nj6.A04);
                } else {
                    boolean z = !nj6.A03();
                    UserSession userSession = nj6.A00;
                    String str = nj6.A04;
                    OLT olt2 = nj6.A02;
                    C74402PuI puI = nj6.A0E;
                    C51974G9v.A1K(userSession, str, olt2);
                    0qQ.A0B(puI, 4);
                    int i = 20;
                    if (z) {
                        i = C355538Qj.DEFAULT_SWIPE_ANIMATION_DURATION;
                    }
                    1OC A082 = DirectThreadApi.A08(userSession, str, olt2.A02, i);
                    NMH.A00(A082, puI, olt2, 7);
                    1ES.A03(A082);
                }
                C67808MvC mvC = nj6.A01;
                mvC.A01 = true;
                mvC.notifyDataSetChanged();
                nj6.A06 = true;
                nj6.A08 = false;
            }
        }
    }

    public static void A02(NJ6 nj6, OLT olt) {
        nj6.A02 = olt;
        C67808MvC mvC = nj6.A01;
        if (mvC != null) {
            0qQ.A0B(olt, 0);
            mvC.A00 = Collections.unmodifiableList(olt.A04);
            mvC.notifyDataSetChanged();
            if (nj6.getActivity() != null) {
                Dbb.A0u(nj6);
            }
        }
    }

    private boolean A03() {
        OLT olt = this.A02;
        if (olt == null) {
            return false;
        }
        int size = Collections.unmodifiableList(olt.A04).size();
        OLT olt2 = this.A02;
        boolean A1S = AnonymousClass7TF.A1S(olt2.A00, size);
        boolean A1P = JTQ.A1P(size + olt2.A01, C355538Qj.DEFAULT_SWIPE_ANIMATION_DURATION);
        if (A1S || A1P) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0031, code lost:
        if (r2 != r0) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configureActionBar(X.2da r4) {
        /*
            r3 = this;
            X.OLT r0 = r3.A02
            r2 = 1
            if (r0 == 0) goto L_0x0053
            r1 = 2131959616(0x7f131f40, float:1.9555877E38)
            int r0 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = X.DbV.A0z(r3, r0, r1)
        L_0x0012:
            r4.setTitle(r0)
            r4.Eu4(r2)
            X.OLT r0 = r3.A02
            if (r0 == 0) goto L_0x0033
            java.util.Set r0 = r3.A0C
            int r2 = r0.size()
            X.OLT r0 = r3.A02
            java.util.List r0 = r0.A04
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            int r0 = r0.size()
            r1 = 2131239905(0x7f0823e1, float:1.809613E38)
            if (r2 == r0) goto L_0x0036
        L_0x0033:
            r1 = 2131239906(0x7f0823e2, float:1.8096132E38)
        L_0x0036:
            r0 = 42
            X.Ok0 r0 = X.C71401Ok0.A00(r3, r0)
            com.instagram.actionbar.ActionButton r1 = r4.ErD(r0, r1)
            boolean r0 = r3.A03()
            r4.Ets(r0)
            android.content.Context r0 = r3.requireContext()
            int r0 = X.DbY.A01(r0)
            X.0nA.A0b(r1, r0)
            return
        L_0x0053:
            r0 = 2131959617(0x7f131f41, float:1.955588E38)
            java.lang.String r0 = r3.getString(r0)
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NJ6.configureActionBar(X.2da):void");
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(404585631);
        NJ6.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = DbX.A0U(this);
        this.A04 = DbU.A0l(requireArguments, "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID");
        this.A03 = requireArguments.getString(C66654MaN.A00());
        this.A07 = DbT.A1X(requireArguments, "is_public_channel");
        AnonymousClass0fD.A09(970593010, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1263977105);
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.fragment_direct_all_join_requests, viewGroup, false);
        View inflate = LayoutInflater.from(requireActivity()).inflate(R.layout.row_large_button_item, viewGroup2, false);
        inflate.setTag(new C67960Mxk(inflate));
        this.A0A = inflate;
        A00(this);
        viewGroup2.addView(this.A0A);
        ((FrameLayout.LayoutParams) this.A0A.getLayoutParams()).gravity = 80;
        AnonymousClass0fD.A09(-847897091, A022);
        return viewGroup2;
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(2023497810);
        super.onResume();
        if (this.A09) {
            this.A09 = false;
            this.A01.notifyDataSetChanged();
        }
        AnonymousClass0fD.A09(-1058318258, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext(), 1, false);
        RecyclerView A0K = DbX.A0K(view);
        this.A0B = A0K;
        A0K.setLayoutManager(linearLayoutManager);
        C67808MvC mvC = new C67808MvC(this, this.A00, this.A0D, this.A0G);
        this.A01 = mvC;
        OLT olt = this.A02;
        if (olt != null) {
            mvC.A00 = Collections.unmodifiableList(olt.A04);
            mvC.notifyDataSetChanged();
        }
        this.A0B.setAdapter(this.A01);
        this.A0B.A15(new C3251871j(linearLayoutManager, this.A0F, C3251771i.A0A));
        if (!A03()) {
            A01(this);
        }
    }
}
