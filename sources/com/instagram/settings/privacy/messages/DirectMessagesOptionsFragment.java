package com.instagram.settings.privacy.messages;

import X.0Aj;
import X.0Tu;
import X.0lg;
import X.0qQ;
import X.16V;
import X.182;
import X.1Av;
import X.1NY;
import X.1OC;
import X.2Ek;
import X.2da;
import X.AnonymousClass00P;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass0t1;
import X.AnonymousClass0wW;
import X.AnonymousClass2o3;
import X.AnonymousClass3DZ;
import X.AnonymousClass430;
import X.AnonymousClass4DS;
import X.AnonymousClass7AV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C227642jf;
import X.C299935wF;
import X.C320156rr;
import X.C359608dC;
import X.C363388je;
import X.C46448DfA;
import X.C46649DiU;
import X.C47518E6c;
import X.C66583MXo;
import X.C68504NKx;
import X.C69192Ngq;
import X.C69453Nlx;
import X.C70332O2k;
import X.C70966OTn;
import X.C71109Ocn;
import X.C71396Ojv;
import X.C72197OyI;
import X.C74279Ps7;
import X.C74431Pul;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbV;
import X.DbW;
import X.DbX;
import X.DbY;
import X.DbZ;
import X.F0T;
import X.FAZ;
import X.FGF;
import X.FQ0;
import X.JTP;
import X.JTS;
import X.JYR;
import X.NHW;
import X.NMJ;
import X.OAI;
import X.OAJ;
import X.OBI;
import X.ORB;
import X.ORD;
import X.OTN;
import X.OVB;
import X.PR9;
import X.SQU;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.android.R;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.ui.emptystaterow.EmptyStateView;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;

public final class DirectMessagesOptionsFragment extends C47518E6c implements AnonymousClass4DS, C74431Pul, CallerContextable, C74279Ps7 {
    public static final CallerContext A04 = CallerContext.A00(DirectMessagesOptionsFragment.class);
    public OBI A00;
    public NMJ A01;
    public boolean A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public EmptyStateView emptyStateView;

    public final void Cq3(DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel, Integer num, String str, DirectMessageInteropReachabilityOptions[] directMessageInteropReachabilityOptionsArr, int i, boolean z) {
        0qQ.A0B(directMessageInteropReachabilityOptionsArr, 3);
        UserSession A0l = AnonymousClass7TE.A0l(this.A03);
        FragmentActivity requireActivity = requireActivity();
        ORB.A00(this.mArguments, requireActivity, A0l, directMessagesInteropOptionsViewModel, num, str, directMessageInteropReachabilityOptionsArr, i, z);
    }

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1C(r2, getString(2131966245));
    }

    public final String getModuleName() {
        return "direct_messages_options";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View view2 = this.mEmptyView;
        0qQ.A0C(view2, "null cannot be cast to non-null type com.instagram.ui.emptystaterow.EmptyStateView");
        EmptyStateView emptyStateView2 = (EmptyStateView) view2;
        0qQ.A0B(emptyStateView2, 0);
        this.emptyStateView = emptyStateView2;
        emptyStateView2.A0P(C320156rr.LOADING);
        NMJ nmj = this.A01;
        if (nmj != null) {
            C72197OyI oyI = nmj.A0D;
            synchronized (oyI) {
                oyI.A08.add(nmj);
            }
            OAI oai = nmj.A0B;
            synchronized (oyI) {
                0qQ.A0B(oai, 0);
                oyI.A07.add(oai);
            }
            synchronized (oyI) {
                oyI.A04 = nmj;
            }
        }
        C68504NKx nKx = (C68504NKx) getScrollingViewProxy().AZK();
        if (nKx != null) {
            nKx.switchItemViewPointDelegate = this;
        }
        OBI obi = this.A00;
        if (obi != null) {
            AnonymousClass3DZ A002 = AnonymousClass3DZ.A00(this);
            obi.A00.A06(getScrollingViewProxy().CEd(), A002);
            return;
        }
        0qQ.A0F("messageAccessToggleViewPointHelper");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void CpJ() {
        IgBloksScreenConfig A0N = DbS.A0N(DbT.A0X(this.A03));
        A0N.A0R = "com.bloks.www.instagram.partnership_messages.settings";
        A0N.A0S = "com.bloks.www.instagram.partnership_messages.settings";
        A0N.A0U = getString(2131953748);
        A0N.A0l = true;
        Context context = getContext();
        HashMap A1E = AnonymousClass7TE.A1E();
        HashMap A1E2 = AnonymousClass7TE.A1E();
        HashMap A1E3 = AnonymousClass7TE.A1E();
        BitSet bitSet = new BitSet(1);
        A1E.put("entrypoint", "messaging_controls");
        bitSet.set(0);
        if (bitSet.nextClearBit(0) >= 1) {
            C46649DiU A06 = C46649DiU.A06("com.bloks.www.instagram.partnership_messages.settings", C359608dC.A01(A1E), A1E2);
            C46649DiU.A0B(A06, 719983200);
            A06.A03 = null;
            A06.A02 = null;
            A06.A04 = null;
            A06.A0H(A1E3);
            A06.A0D(context, A0N);
            return;
        }
        throw AnonymousClass7TE.A0z("Missing Required Props");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public final void A00() {
        Boolean bool;
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions;
        ArrayList A1C = AnonymousClass7TE.A1C();
        NMJ nmj = this.A01;
        if (nmj != null) {
            OTN otn = nmj.A0C;
            0lg r10 = nmj.A07;
            DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel = nmj.A00;
            if (nmj.A04) {
                1Av r4 = nmj.A09;
                bool = (Boolean) r4.A6J.CDM(r4, 1Av.A8a[264]);
            } else {
                bool = null;
            }
            boolean z = nmj.A02;
            ArrayList A0q = AnonymousClass7TF.A0q(r10, 0);
            int i = 2131966247;
            if (otn.A01 == 16V.A07) {
                i = 2131966246;
            }
            FAZ faz = new FAZ(i);
            Context context = otn.A00;
            Resources resources = context.getResources();
            faz.A05 = new F0T(0, JTP.A03(resources), 0, AnonymousClass7TE.A0D(resources), resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding), resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
            faz.A03 = R.style.DirectMessagesOptionsText;
            faz.A02 = 2;
            A0q.add(faz);
            if (directMessagesInteropOptionsViewModel != null) {
                OTN otn2 = otn;
                boolean z2 = z;
                NMJ nmj2 = nmj;
                A0q.add(OTN.A00(directMessagesInteropOptionsViewModel.A05, nmj2, otn2, "ig_followers", 2131966265, z2));
                A0q.add(OTN.A00(directMessagesInteropOptionsViewModel.A08, nmj2, otn2, "others_on_ig", 2131966257, z2));
                if ((AnonymousClass430.A01(r10) && (JYR.A01(r10) || JYR.A00(r10))) || ((182.A06(0Tu.A05, r10, 36312995005597263L) && AnonymousClass2o3.A00(r10).A06(UserMonetizationProductType.BRANDED_CONTENT_DEAL_CREATOR)) || AnonymousClass2o3.A00(r10).A05)) {
                    A0q.add(OTN.A00((DirectMessageInteropReachabilityOptions) null, nmj2, otn2, "eligible_for_bc_partnership", 2131966250, z2));
                }
                directMessageInteropReachabilityOptions = directMessagesInteropOptionsViewModel.A06;
            } else {
                directMessageInteropReachabilityOptions = null;
            }
            if (directMessageInteropReachabilityOptions != null && 182.A06(0Tu.A06, r10, 36316628547342879L)) {
                DbV.A1W(A0q, true);
                C66583MXo.A1J(context.getString(2131966267), A0q);
                A0q.add(OTN.A00(directMessagesInteropOptionsViewModel.A06, nmj, otn, "ig_verified", 2131966243, z));
            }
            DbV.A1W(A0q, true);
            C66583MXo.A1J(context.getString(2131966268), A0q);
            C70966OTn oTn = new C70966OTn((View.OnClickListener) new C71396Ojv(nmj, 58), 2131966240);
            oTn.A05 = !z;
            A0q.add(oTn);
            String A16 = AnonymousClass7TE.A16(context, 2131966272);
            SpannableStringBuilder A0D = DbY.A0D(context, A16, 2131966233);
            String A012 = SQU.A01(context, "https://help.instagram.com/585369912141614");
            0qQ.A07(A012);
            AnonymousClass7AV.A05(A0D, new C69192Ngq(context, r10, (OAJ) null, A012, DbV.A02(context)), A16);
            A0q.add(new FGF(A0D));
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                DbV.A1W(A0q, true);
                C46448DfA.A02(A0q, 2131966236);
                PR9 pr9 = new PR9((CompoundButton.OnCheckedChangeListener) new FQ0(2, nmj, z), 2131966237, booleanValue);
                if (!z) {
                    pr9.A0E = true;
                    pr9.A0D = false;
                }
                A0q.add(pr9);
                OAJ oaj = new OAJ(nmj);
                String A162 = AnonymousClass7TE.A16(context, 2131966234);
                SpannableStringBuilder A0D2 = DbY.A0D(context, A162, 2131966235);
                String A013 = SQU.A01(context, "https://www.facebook.com/help/instagram/791161338412168?ref=igapp");
                0qQ.A07(A013);
                AnonymousClass7AV.A05(A0D2, new C69192Ngq(context, r10, oaj, A013, DbV.A02(context)), A162);
                A0q.add(new FGF(A0D2));
            }
            A1C.addAll(A0q);
        }
        EmptyStateView emptyStateView2 = this.emptyStateView;
        if (emptyStateView2 != null) {
            emptyStateView2.A0P(C320156rr.GONE);
            setItems(A1C);
            if (this.A02) {
                getScrollingViewProxy().Evq(A1C.size() - 1);
                this.A02 = false;
                return;
            }
            return;
        }
        0qQ.A0F("emptyStateView");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r26v0, types: [java.lang.Object, X.O2l] */
    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, X.O2j] */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, X.O2l] */
    /* JADX WARNING: type inference failed for: r21v0, types: [java.lang.Object, X.OR9] */
    public final void onCreate(Bundle bundle) {
        boolean A1Z;
        boolean A1Z2;
        int A022 = AnonymousClass0fD.A02(867926910);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        AnonymousClass0eM r9 = this.A03;
        boolean z = false;
        if (182.A06(0Tu.A06, DbT.A0X(r9), 36311891198346028L) && requireArguments.getBoolean("scroll_to_message_access_toggle", false)) {
            z = true;
        }
        this.A02 = z;
        16V A0J = DbX.A0l(AnonymousClass0t1.A01, r9).A0J();
        ? obj = new Object();
        OTN otn = new OTN(requireContext(), new Object(), A0J);
        C72197OyI A002 = C70332O2k.A00(AnonymousClass7TE.A0l(r9), DbX.A0h(r9), new Object());
        ? obj2 = new Object();
        String string = requireArguments.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        OVB ovb = new OVB(this, AnonymousClass7TE.A0l(r9), string);
        C299935wF A003 = C363388je.A00(AnonymousClass7TE.A0l(r9)).A00(A04);
        boolean A032 = C363388je.A03(A003);
        boolean A023 = C363388je.A02(A003);
        Context requireContext = requireContext();
        UserSession A0l = AnonymousClass7TE.A0l(r9);
        1Av A0h = DbX.A0h(r9);
        C71109Ocn ocn = new C71109Ocn(this, JTS.A0J(r9), string);
        UserSession A0l2 = AnonymousClass7TE.A0l(r9);
        0qQ.A0B(A0l2, 0);
        if (!2Ek.A03(AnonymousClass7TF.A0Q(A0l2))) {
            A1Z = false;
        } else {
            A1Z = DbY.A1Z(0Tu.A05, A0l2, 36311955622855500L);
        }
        UserSession A0l3 = AnonymousClass7TE.A0l(r9);
        0qQ.A0B(A0l3, 0);
        if (!2Ek.A03(AnonymousClass7TF.A0Q(A0l3))) {
            A1Z2 = false;
        } else {
            A1Z2 = DbY.A1Z(0Tu.A05, A0l3, 36311955622921037L);
        }
        C69453Nlx nlx = (C69453Nlx) requireArguments.getSerializable("reachability_settings_upsell");
        this.A01 = new NMJ(requireContext, nlx, A0l, ovb, A0h, ocn, obj2, otn, A002, this, this, obj, A0J, A032, A023, A1Z, A1Z2);
        0Aj A0e = AnonymousClass7TE.A0e(ovb.A00, "instagram_waverly_ig_event");
        DbS.A1I(A0e, "start_step");
        A0e.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, ovb.A01);
        A0e.AAJ("step", "ig_message_settings");
        A0e.AAJ("message_controls_settings_version", "v2");
        A0e.Cgf();
        this.A00 = new OBI(ovb);
        AnonymousClass0fD.A09(-940810256, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1961963747);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_listview_with_empty_state, false);
        AnonymousClass0fD.A09(1478894261, A022);
        return A0D;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1901321221);
        super.onDestroyView();
        NMJ nmj = this.A01;
        if (nmj != null) {
            C72197OyI oyI = nmj.A0D;
            synchronized (oyI) {
                oyI.A04 = null;
            }
        }
        AnonymousClass0fD.A09(1798571806, A022);
    }

    public final void onResume() {
        boolean z;
        int A022 = AnonymousClass0fD.A02(-456181634);
        super.onResume();
        NMJ nmj = this.A01;
        if (nmj != null) {
            C72197OyI oyI = nmj.A0D;
            synchronized (oyI) {
                if (oyI.A03 == null) {
                    z = false;
                    if (oyI.A02 != null) {
                    }
                }
                z = true;
            }
            if (!z) {
                1NY A0M = DbZ.A0M(nmj.A07);
                A0M.A0A("users/get_message_settings_v2/");
                1OC A0S = DbU.A0S(A0M, NHW.class, ORD.class);
                A0S.A00 = nmj;
                nmj.A0E.schedule(A0S);
            } else {
                NMJ.A01(nmj);
                nmj.A02 = false;
                nmj.A0E.A00();
            }
            C69453Nlx nlx = nmj.A06;
            if (nlx != null) {
                0Aj A0e = AnonymousClass7TE.A0e(nmj.A0A.A00, "direct_reachability_settings_view");
                if (A0e.isSampled()) {
                    DbV.A1J(A0e, nlx.name());
                }
            }
        }
        AnonymousClass0fD.A09(1846816093, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-1082417889);
        DirectMessagesOptionsFragment.super.onStop();
        NMJ nmj = this.A01;
        if (nmj != null) {
            C72197OyI oyI = nmj.A0D;
            synchronized (oyI) {
                oyI.A08.remove(nmj);
            }
            OAI oai = nmj.A0B;
            synchronized (oyI) {
                0qQ.A0B(oai, 0);
                oyI.A07.remove(oai);
            }
        }
        AnonymousClass0fD.A09(-1910617716, A022);
    }
}
