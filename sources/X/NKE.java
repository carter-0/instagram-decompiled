package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public final class NKE extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "PromptNoteConsumptionSheetFragment";
    public View A00;
    public View A01;
    public View A02;
    public FrameLayout A03;
    public AnonymousClass2t9 A04;
    public IgLinearLayout A05;
    public IgLinearLayout A06;
    public IgTextView A07;
    public IgTextView A08;
    public IgTextView A09;
    public IgTextView A0A;
    public NotesRepository A0B;
    public AnonymousClass4AF A0C;
    public AnonymousClass4AD A0D;
    public C71036OZy A0E;
    public C71126OdL A0F;
    public SpinnerImageView A0G;
    public String A0H;
    public boolean A0I;
    public RecyclerView A0J;
    public IgTextView A0K;
    public 2el A0L;
    public final C72957PQp A0M = new C72957PQp(this);
    public final String A0N = "prompt_note_consumption_sheet";
    public final AnonymousClass0eM A0O = AnonymousClass0eN.A01(C73924Pm4.A01(this, 16));
    public final AnonymousClass0eM A0P;
    public final AnonymousClass0eM A0Q = C227642jf.A02(this);
    public final AnonymousClass0eM A0R = C227642jf.A02(this);
    public final AnonymousClass0eM A0S;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (AnonymousClass7TF.A1Z(this.A0O)) {
            07U r4 = 07U.A04;
            AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
            AnonymousClass0xx A002 = AnonymousClass07a.A00(viewLifecycleOwner);
            MHI mhi = new MHI(viewLifecycleOwner, r4, this, (AnonymousClass4D7) null, 34);
            19B r1 = 19B.A00;
            AnonymousClass07Z A0I2 = JTP.A0I(this, r1, mhi, A002);
            1Eo.A05(r1, new MHI(A0I2, r4, this, (AnonymousClass4D7) null, 35), AnonymousClass07a.A00(A0I2));
        }
    }

    public final /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
    }

    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    public final String getModuleName() {
        return this.A0N;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0Q);
    }

    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = this.A0J;
        if (recyclerView == null || !JTP.A1Y(recyclerView)) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public NKE() {
        C73924Pm4 A012 = C73924Pm4.A01(this, 24);
        C73924Pm4 A013 = C73924Pm4.A01(this, 18);
        0eO r7 = 0eO.A02;
        AnonymousClass0eM A002 = C73924Pm4.A00(A013, r7, 19);
        this.A0S = DbS.A0I(C73924Pm4.A01(A002, 20), A012, new C73916Plr(20, (Object) null, A002), DbS.A0z(C67756MuB.class));
        C73924Pm4 A014 = C73924Pm4.A01(this, 17);
        AnonymousClass0eM A003 = C73924Pm4.A00(C73924Pm4.A01(this, 21), r7, 22);
        this.A0P = DbS.A0I(C73924Pm4.A01(A003, 23), A014, new C73916Plr(21, (Object) null, A003), DbS.A0z(C67755MuA.class));
    }

    public static final void A00(View view, NKE nke, String str, int i, boolean z) {
        C310336ap A0X = DbV.A0X();
        A0X.A0H = str;
        DbT.A1D(DbV.A05(nke), A0X, i);
        view.postDelayed(new C73309PaU(nke, A0X.A00(), z), 1000);
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(25948151);
        NKE.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (str = bundle2.getString("arg_prompt_id")) == null) {
            str = "";
        }
        this.A0H = str;
        C72957PQp pQp = this.A0M;
        FragmentActivity requireActivity = requireActivity();
        AnonymousClass0eM r5 = this.A0Q;
        UserSession A0l = AnonymousClass7TE.A0l(r5);
        String str2 = this.A0H;
        String str3 = "promptId";
        if (str2 != null) {
            0qQ.A0B(A0l, 1);
            pQp.A01 = str2;
            pQp.A00 = A0l;
            pQp.A02 = C51965G9l.A0v(requireActivity);
            this.A0B = AnonymousClass43C.A00(AnonymousClass7TE.A0l(r5));
            this.A0D = new C72371P3k(this, 2);
            UserSession A0l2 = AnonymousClass7TE.A0l(r5);
            AnonymousClass4AD r11 = this.A0D;
            if (r11 == null) {
                str3 = "notesViewModelListener";
            } else {
                String str4 = this.A0H;
                if (str4 != null) {
                    0qQ.A0B(A0l2, 0);
                    this.A0C = new AnonymousClass4AF(this, this, A0l2, r11, str4, false);
                    this.A0L = 2el.A00();
                    AnonymousClass0fD.A09(310753578, A022);
                    return;
                }
            }
        }
        0qQ.A0F(str3);
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-2044273246);
        LayoutInflater layoutInflater2 = layoutInflater;
        0qQ.A0B(layoutInflater2, 0);
        View inflate = layoutInflater2.inflate(R.layout.layout_prompt_note_reply_sheet, viewGroup, false);
        this.A06 = (IgLinearLayout) inflate.findViewById(R.id.prompt_note_consumption_sheet_root_view);
        this.A0A = JTO.A0X(inflate, R.id.prompt_note_title);
        this.A07 = JTO.A0X(inflate, R.id.prompt_note_original_author_attribute);
        this.A0K = JTO.A0X(inflate, R.id.prompt_note_user_education_text);
        this.A0G = (SpinnerImageView) inflate.findViewById(R.id.loading_indicator);
        View findViewById = inflate.findViewById(R.id.prompt_note_response_separator_line);
        this.A01 = findViewById;
        if (findViewById != null) {
            findViewById.setVisibility(8);
            AnonymousClass0eM r33 = this.A0Q;
            0lg A0X = DbT.A0X(r33);
            0Tu r10 = 0Tu.A05;
            if (182.A06(r10, A0X, 36321310062748939L)) {
                View findViewById2 = inflate.findViewById(R.id.more_option_button);
                findViewById2.setVisibility(0);
                C71397Ojw.A00(findViewById2, 28, this);
                2eS.A01(findViewById2);
            }
            1Am A012 = 1Al.A01(AnonymousClass7TE.A0l(r33));
            1An r8 = 1An.A2K;
            String str = "promptNoteReplyEducationText";
            if (!C51969G9p.A0n(A012, r8, inflate).getBoolean("has_user_acknowledged_prompt_response_education", false)) {
                IgTextView igTextView = this.A0K;
                if (igTextView != null) {
                    igTextView.setVisibility(0);
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            this.A0J = DbZ.A0F(inflate, R.id.responses_recycler_view);
            AnonymousClass0eM r13 = this.A0O;
            if (AnonymousClass7TF.A1Z(r13)) {
                RecyclerView recyclerView = this.A0J;
                if (recyclerView != null) {
                    recyclerView.setItemAnimator((AnonymousClass3AS) null);
                    IgTextView igTextView2 = this.A0K;
                    if (igTextView2 != null) {
                        igTextView2.setVisibility(8);
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                0qQ.A0F("recyclerView");
                throw AnonymousClass00P.createAndThrow();
            }
            Context context = inflate.getContext();
            AnonymousClass2tC A002 = AnonymousClass2t9.A00(context);
            UserSession A0l = AnonymousClass7TE.A0l(r33);
            AnonymousClass4AF r5 = this.A0C;
            String str2 = "listener";
            if (r5 != null) {
                A002.A01(new AnonymousClass4AK(this, A0l, r5, true, true));
                UserSession A0l2 = AnonymousClass7TE.A0l(r33);
                AnonymousClass07V r14 = this.mLifecycleRegistry;
                0qQ.A07(r14);
                AnonymousClass4AF r52 = this.A0C;
                if (r52 != null) {
                    2el r4 = this.A0L;
                    str = "viewpointManager";
                    if (r4 != null) {
                        AnonymousClass2t9 A0U = DbU.A0U(A002, new AnonymousClass4AL(r14, this, A0l2, r4, r52, (C62320sa) null, true, true));
                        this.A04 = A0U;
                        RecyclerView recyclerView2 = this.A0J;
                        if (recyclerView2 != null) {
                            recyclerView2.setAdapter(A0U);
                            RecyclerView recyclerView3 = this.A0J;
                            if (recyclerView3 != null) {
                                GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 6);
                                gridLayoutManager.A01 = new C67774MuY(this, 4);
                                recyclerView3.setLayoutManager(gridLayoutManager);
                                if (AnonymousClass7TF.A1Z(r13)) {
                                    View A0V = JTR.A0V(inflate, R.id.layout_stub_composer_bar);
                                    0qQ.A0C(A0V, C273654mx.A00(2));
                                    this.A03 = (FrameLayout) A0V;
                                    IgLinearLayout igLinearLayout = (IgLinearLayout) inflate.findViewById(R.id.note_prompt_response_reply_context_container);
                                    this.A05 = igLinearLayout;
                                    if (igLinearLayout != null) {
                                        this.A09 = JTO.A0X(igLinearLayout, R.id.note_prompt_reply_context);
                                        IgLinearLayout igLinearLayout2 = this.A05;
                                        if (igLinearLayout2 != null) {
                                            this.A08 = JTO.A0X(igLinearLayout2, R.id.note_prompt_reply_context_text);
                                            AnonymousClass0eM r142 = this.A0R;
                                            boolean A062 = 182.A06(r10, AnonymousClass7TF.A0L(r142, 0), 36329028118003449L);
                                            str2 = "composerBar";
                                            FrameLayout frameLayout = this.A03;
                                            if (A062) {
                                                if (frameLayout != null) {
                                                    frameLayout.setVisibility(0);
                                                    View view = this.A01;
                                                    if (view != null) {
                                                        view.setVisibility(0);
                                                    }
                                                }
                                            } else if (frameLayout != null) {
                                                frameLayout.setVisibility(8);
                                                View view2 = this.A01;
                                                if (view2 != null) {
                                                    view2.setVisibility(8);
                                                }
                                            }
                                            IgLinearLayout igLinearLayout3 = this.A05;
                                            if (igLinearLayout3 != null) {
                                                igLinearLayout3.setVisibility(8);
                                                0qQ.A07(context);
                                                Bundle bundle2 = this.mArguments;
                                                BaseFragmentActivity activity = getActivity();
                                                0qQ.A0C(activity, "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity");
                                                BaseFragmentActivity baseFragmentActivity = activity;
                                                UserSession A0l3 = AnonymousClass7TE.A0l(r142);
                                                C72375P3o p3o = new C72375P3o(this);
                                                IgLinearLayout igLinearLayout4 = this.A06;
                                                if (igLinearLayout4 == null) {
                                                    str = "rootView";
                                                } else {
                                                    C71126OdL odL = new C71126OdL(context, bundle2, baseFragmentActivity, this, A0l3, igLinearLayout4, p3o, (C67755MuA) this.A0P.getValue(), (C234502xy) null, this.A0N, 0, false, true);
                                                    this.A0F = odL;
                                                    odL.A05();
                                                }
                                            }
                                        }
                                    }
                                    0qQ.A0F("promptContextView");
                                    throw AnonymousClass00P.createAndThrow();
                                }
                                AnonymousClass3DZ A003 = AnonymousClass3DZ.A00(this);
                                2el r53 = this.A0L;
                                if (r53 != null) {
                                    RecyclerView recyclerView4 = this.A0J;
                                    if (recyclerView4 != null) {
                                        r53.A08(recyclerView4, A003, new AnonymousClass2eo[0]);
                                        0xa A0n = C51969G9p.A0n(1Al.A01(AnonymousClass7TE.A0l(r33)), r8, this);
                                        if (!A0n.getBoolean("has_shown_prompts_consumption_dialog", false)) {
                                            C358248ab A0U2 = DbW.A0U(this);
                                            A0U2.A0j(requireContext().getDrawable(R.drawable.ig_illustrations_illo_prompts_refresh));
                                            A0U2.A0r(false);
                                            A0U2.A09(2131968601);
                                            A0U2.A08(2131968599);
                                            Dba.A0t(C71231Ofw.A00, A0U2, 2131968600);
                                            DbX.A1V(A0n, "has_shown_prompts_consumption_dialog", true);
                                        }
                                        07U r82 = 07U.A04;
                                        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
                                        AnonymousClass0xx A004 = AnonymousClass07a.A00(viewLifecycleOwner);
                                        View view3 = inflate;
                                        MHF mhf = new MHF(view3, viewLifecycleOwner, r82, this, (AnonymousClass4D7) null, 29);
                                        19B r42 = 19B.A00;
                                        AnonymousClass07Z A0I2 = JTP.A0I(this, r42, mhf, A004);
                                        1Eo.A05(r42, new MHF(view3, A0I2, r82, this, (AnonymousClass4D7) null, 31), AnonymousClass07a.A00(A0I2));
                                        AnonymousClass0fD.A09(1365019449, A022);
                                        return inflate;
                                    }
                                }
                            }
                        }
                        0qQ.A0F("recyclerView");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
            }
            0qQ.A0F(str2);
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F("separatorLine");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onDestroyView() {
        C71036OZy oZy;
        C234502xy r0;
        int A022 = AnonymousClass0fD.A02(-420576539);
        super.onDestroyView();
        this.A00 = null;
        C71036OZy oZy2 = this.A0E;
        if (!(oZy2 == null || (r0 = oZy2.A00) == null)) {
            r0.release();
        }
        if (182.A06(0Tu.A05, DbT.A0X(this.A0R), 36330754695316232L) && (oZy = this.A0E) != null) {
            oZy.A00 = null;
        }
        this.A0E = null;
        this.A02 = null;
        AnonymousClass0eM r9 = this.A0Q;
        C3018760k A0S2 = C66582MXn.A0S(r9);
        String str = A0S2.A07.A00;
        if (str != null || A0S2.A04) {
            Iterator it = A0S2.A0D.iterator();
            while (it.hasNext()) {
                0eP A1A = JTO.A1A(it);
                C3018760k.A06(A0S2, (AnonymousClass4AB) A1A.A00, str, (double) AnonymousClass7TE.A0R(A1A.A01));
            }
        }
        C66582MXn.A0S(r9).A0D.clear();
        AnonymousClass0fD.A09(1246250962, A022);
    }

    public final void onPause() {
        C234502xy r0;
        C71036OZy oZy;
        C234502xy r02;
        int A022 = AnonymousClass0fD.A02(1905330405);
        NKE.super.onPause();
        C71036OZy oZy2 = this.A0E;
        if (!(oZy2 == null || (r0 = oZy2.A00) == null || !r0.isPlaying() || (oZy = this.A0E) == null || (r02 = oZy.A00) == null)) {
            r02.pause();
        }
        ((C67756MuB) this.A0S.getValue()).A04();
        AnonymousClass0fD.A09(124711108, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1376683604);
        super.onResume();
        C67756MuB muB = (C67756MuB) this.A0S.getValue();
        Set keySet = muB.A04.keySet();
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : keySet) {
            JTR.A1P(muB.A04.get(next), true, next, A1C);
        }
        ArrayList A0r = AnonymousClass7TG.A0r(A1C);
        Iterator it = A1C.iterator();
        while (it.hasNext()) {
            JTS.A1V(A0r, it);
        }
        if (AnonymousClass7TE.A1b(A0r)) {
            muB.A00 = C66581MXm.A06();
        }
        C72957PQp pQp = this.A0M;
        pQp.A02 = C51965G9l.A0v(pQp.A04.requireActivity());
        pQp.A03 = false;
        AnonymousClass0fD.A09(1196085031, A022);
    }
}
