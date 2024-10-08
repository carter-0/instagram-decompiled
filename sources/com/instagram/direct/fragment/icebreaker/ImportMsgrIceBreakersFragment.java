package com.instagram.direct.fragment.icebreaker;

import X.0sn;
import X.1ES;
import X.1NY;
import X.1OC;
import X.1P0;
import X.2Ru;
import X.2da;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass3JR;
import X.AnonymousClass4DS;
import X.AnonymousClass7TE;
import X.C227812jx;
import X.C231642s0;
import X.C320156rr;
import X.C322776wO;
import X.C336947fR;
import X.C47637EAx;
import X.C51968G9o;
import X.C51970G9q;
import X.C66580MXl;
import X.C69672Npu;
import X.C69903Nu5;
import X.C70814OMj;
import X.C70932OSf;
import X.C71407Ok6;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbW;
import X.DbX;
import X.DbY;
import X.NGt;
import X.NL9;
import X.NLb;
import X.NMI;
import X.OJU;
import X.OPC;
import X.OyN;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.recyclerview.LinearLayoutManagerCompat;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.ui.emptystaterow.EmptyStateView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class ImportMsgrIceBreakersFragment extends C227812jx implements AnonymousClass4DS, C322776wO {
    public Context A00;
    public FragmentActivity A01;
    public NL9 A02;
    public C70932OSf A03;
    public OyN A04;
    public List A05 = 0sn.A00;
    public View A06;
    public UserSession A07;
    public final OJU A08 = new OJU(this);
    public final Set A09 = AnonymousClass7TE.A1F();
    public final 1P0 A0A = new NMI((Object) this, 4);
    public final 1P0 A0B = new NMI((Object) this, 3);
    public IgdsBottomButtonLayout mBottomButton;
    public EmptyStateView mEmptyStateView;

    public final void DBx() {
    }

    public final /* synthetic */ void DBz(C320156rr r1) {
    }

    public static void A00(ImportMsgrIceBreakersFragment importMsgrIceBreakersFragment) {
        int i = 0;
        for (C69672Npu npu : importMsgrIceBreakersFragment.A05) {
            Set set = importMsgrIceBreakersFragment.A09;
            C70814OMj oMj = npu.A00;
            if (set.contains(oMj.A01) && !TextUtils.isEmpty(oMj.A03)) {
                i++;
            }
        }
        C70932OSf oSf = importMsgrIceBreakersFragment.A03;
        int size = importMsgrIceBreakersFragment.A09.size();
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("selected_icebreaker_num", String.valueOf(size));
        A1E.put("selected_icebreaker_response_num", String.valueOf(i));
        C70932OSf.A00(oSf, "icebreaker_settings_import_button_click", (String) null, A1E);
    }

    public static void A01(ImportMsgrIceBreakersFragment importMsgrIceBreakersFragment, C320156rr r5) {
        EmptyStateView emptyStateView = importMsgrIceBreakersFragment.mEmptyStateView;
        if (emptyStateView != null) {
            emptyStateView.A0P(r5);
            int ordinal = r5.ordinal();
            EmptyStateView emptyStateView2 = importMsgrIceBreakersFragment.mEmptyStateView;
            int i = 8;
            if (ordinal != 4) {
                i = 0;
            }
            emptyStateView2.setVisibility(i);
        }
    }

    public final void A02() {
        OyN oyN = this.A04;
        ArrayList A1D = AnonymousClass7TE.A1D(this.A09);
        1P0 r3 = this.A0A;
        1NY A0N = DbU.A0N(oyN.A0B);
        A0N.A0A("direct_v2/icebreakers/import/");
        A0N.A9m("icebreakers", C51970G9q.A0k(A1D));
        1OC A0S = DbT.A0S(A0N, NGt.class, OPC.class);
        A0S.A00 = r3;
        1ES.A03(A0S);
    }

    public final void A03() {
        OyN oyN = this.A04;
        1P0 r3 = this.A0B;
        1NY A0O = DbU.A0O(oyN.A0B);
        A0O.A0A("direct_v2/icebreakers/get_msgr_ibs/");
        1OC A0S = DbT.A0S(A0O, NGt.class, OPC.class);
        A0S.A00 = r3;
        1ES.A03(A0S);
    }

    public final void A04() {
        String A0h;
        String str;
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.mBottomButton;
        Set set = this.A09;
        igdsBottomButtonLayout.setPrimaryButtonEnabled(C66580MXl.A1b(set));
        IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.mBottomButton;
        boolean isEmpty = set.isEmpty();
        Context context = this.A00;
        if (isEmpty) {
            A0h = context.getString(2131959258);
        } else {
            A0h = DbW.A0h(context, Integer.valueOf(set.size()), 2131959259);
        }
        igdsBottomButtonLayout2.setPrimaryActionText(A0h);
        IgdsBottomButtonLayout igdsBottomButtonLayout3 = this.mBottomButton;
        if (this.A05.size() > 4) {
            str = DbY.A0d(this.A00.getResources(), 4, R.plurals.direct_faq_import_bottom_button_footer);
        } else {
            str = null;
        }
        igdsBottomButtonLayout3.setFooterText(str);
    }

    public final void configureActionBar(2da r4) {
        r4.setTitle("");
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A00();
        DbX.A1A(new C71407Ok6(this, 67), A0K, r4);
    }

    public final AnonymousClass0wW getSession() {
        return this.A07;
    }

    public final void DBy() {
        A03();
    }

    public final String getModuleName() {
        return C51968G9o.A16(this);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1310044864);
        super.onCreate(bundle);
        this.A07 = DbX.A0U(this);
        this.A00 = requireContext();
        this.A01 = requireActivity();
        Context requireContext = requireContext();
        UserSession userSession = this.A07;
        OJU oju = this.A08;
        2Ru r5 = new 2Ru();
        String string = requireContext.getString(2131959267);
        int i = 2131959260;
        if (!C69903Nu5.A00(userSession)) {
            i = 2131959261;
        }
        C47637EAx eAx = new C47637EAx(requireContext, string, requireContext.getString(i));
        r5.A00 = eAx;
        C336947fR r1 = new C336947fR(requireContext);
        r5.A02 = r1;
        NLb nLb = new NLb(requireContext, userSession, oju);
        r5.A01 = nLb;
        r5.init(new C231642s0[]{eAx, r1, nLb});
        this.A02 = r5;
        this.A04 = OyN.A00(this.A07);
        this.A03 = new C70932OSf(this, this.A07);
        AnonymousClass0fD.A09(-129308937, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1679400944);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.fragment_import_messenger_icebreakers);
        this.A06 = A0C;
        AnonymousClass0fD.A09(726342154, A022);
        return A0C;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(882534712);
        super.onDestroy();
        AnonymousClass0fD.A09(-2051746071, A022);
    }

    public final void onRecyclerViewCreated(RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new LinearLayoutManagerCompat(requireContext()));
        setAdapter(this.A02);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) this.A06.requireViewById(R.id.import_bottom_button);
        this.mBottomButton = igdsBottomButtonLayout;
        C71407Ok6.A02(igdsBottomButtonLayout, this, 68);
        A04();
        EmptyStateView emptyStateView = (EmptyStateView) view.requireViewById(16908292);
        this.mEmptyStateView = emptyStateView;
        C320156rr r2 = C320156rr.ERROR;
        emptyStateView.A0T(r2, 2131959379);
        this.mEmptyStateView.A0Q(r2, 2131959386);
        this.mEmptyStateView.A0O(this, r2);
        A03();
    }
}
