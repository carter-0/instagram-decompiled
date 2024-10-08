package X;

import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.leadgen.core.ui.LeadGenFormHeaderView;
import com.instagram.leadgen.core.ui.LeadGenFormHeaderViewWithoutWelcomeMessage;
import com.instagram.leadgen.organic.model.LeadGenConsumerFormData;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.UaL  reason: case insensitive filesystem */
public final class C15314UaL extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "LeadGenConsumerFragmentV2";
    public View A00;
    public NestedScrollView A01;
    public IgLinearLayout A02;
    public IgLinearLayout A03;
    public IgTextView A04;
    public IgdsBottomButtonLayout A05;
    public LeadGenFormHeaderView A06;
    public LeadGenFormHeaderViewWithoutWelcomeMessage A07;
    public SpinnerImageView A08;
    public AnonymousClass3E6 A09;
    public C262204Co A0A;
    public final Rect A0B = new Rect();
    public final ViewTreeObserver.OnPreDrawListener A0C = new WCE(this, 6);
    public final Map A0D = new LinkedHashMap();
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F;
    public final AnonymousClass0eM A0G;
    public final C252213ok A0H = new WTW(this, 3);

    public final String getModuleName() {
        return "organic_lead_gen_consumer";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        this.A00 = view2.requireViewById(R.id.main_container);
        AnonymousClass3E5 A012 = AnonymousClass3E4.A01(this, false, false);
        this.A09 = A012;
        A012.A9Y(this.A0H);
        AnonymousClass0eM r6 = this.A0G;
        C14765U8b A0S = C13990Tnq.A0S(r6);
        LeadGenConsumerFormData leadGenConsumerFormData = A0S.A0D;
        if (leadGenConsumerFormData != null) {
            A0S.A00 = leadGenConsumerFormData.A09;
            A0S.A03 = leadGenConsumerFormData.A0D;
            05G r3 = A0S.A0J;
            AnonymousClass7TF.A1O(r3, leadGenConsumerFormData.A0C);
            if (!DbX.A1b(r3)) {
                WYY wyy = A0S.A0C;
                String str = A0S.A00;
                boolean z = A0S.A03;
                0qQ.A0B(str, 0);
                WYY.A01(wyy, "consumer_question_screen_impression", "impression", str, z);
            }
            List list = leadGenConsumerFormData.A0B;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C13991Tnr.A1O(arrayList, it);
            }
            05G r8 = A0S.A0H;
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C13991Tnr.A1N(arrayList2, it2);
            }
            r8.Epw(arrayList2);
            A0S.A0G.Epw(arrayList);
            05G r32 = A0S.A0K;
            String str2 = leadGenConsumerFormData.A07;
            ImageUrl imageUrl = leadGenConsumerFormData.A03;
            int i = leadGenConsumerFormData.A01;
            int size = arrayList.size();
            r32.Epw(new C15027UKg(W33.A01(leadGenConsumerFormData.A0A), imageUrl, leadGenConsumerFormData.A04, AnonymousClass05K.A00, str2, 0sn.A00, i, size, true));
            A0S.A0L.Epw(leadGenConsumerFormData.A05);
            A0S.A0I.Epw(new N4R((C266444Yx) null, (Integer) null, 2));
        }
        this.A08 = DbX.A0k(view2);
        this.A01 = (NestedScrollView) view2.requireViewById(R.id.form_scrolling_area);
        DbV.A1F(getViewLifecycleOwner(), C13990Tnq.A0S(r6).A09, new C20786Wyx(this, 27), 13);
        C20786Wyx.A00(getViewLifecycleOwner(), C13990Tnq.A0S(r6).A08, this, 28, 13);
        this.A05 = C13990Tnq.A0Q(view2);
        C20786Wyx.A00(getViewLifecycleOwner(), C13990Tnq.A0S(r6).A06, this, 29, 13);
        C20786Wyx.A00(getViewLifecycleOwner(), C13990Tnq.A0S(r6).A05, this, 30, 13);
        C20786Wyx.A00(getViewLifecycleOwner(), C13990Tnq.A0S(r6).A04, this, 31, 13);
        LeadGenFormHeaderView leadGenFormHeaderView = (LeadGenFormHeaderView) view2.findViewById(R.id.lead_form_header_view);
        this.A06 = leadGenFormHeaderView;
        int A022 = JTQ.A02(leadGenFormHeaderView);
        this.A07 = (LeadGenFormHeaderViewWithoutWelcomeMessage) view2.findViewById(R.id.lead_form_header_view_without_welcome_message);
        this.A02 = (IgLinearLayout) view2.findViewById(R.id.custom_questions_container);
        this.A03 = (IgLinearLayout) view2.findViewById(R.id.customer_info_questions_container);
        IgTextView A0X = JTO.A0X(view2, R.id.inline_legal_text);
        this.A04 = A0X;
        if (A0X != null) {
            DbT.A1H(A0X);
        }
        C20786Wyx.A00(getViewLifecycleOwner(), C13990Tnq.A0S(r6).A0A, this, 32, 13);
        C20786Wyx.A00(getViewLifecycleOwner(), C13990Tnq.A0S(r6).A07, this, 33, 13);
        07U r82 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new C66170MGh(viewLifecycleOwner, r82, this, (AnonymousClass4D7) null, 14), AnonymousClass07a.A00(viewLifecycleOwner));
        Dbb.A0t(view2, R.id.preview_warning_banner, A022);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return C13990Tnq.A0S(this.A0G).A0B;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.0rm, java.lang.Object] */
    public final boolean onBackPressed() {
        AnonymousClass0eM r6 = this.A0G;
        C14765U8b A0S = C13990Tnq.A0S(r6);
        WYY wyy = A0S.A0C;
        String str = A0S.A00;
        boolean z = A0S.A03;
        0qQ.A0B(str, 0);
        WYY.A01(wyy, "cancel", "click", str, z);
        Iterator A0v = AnonymousClass7TF.A0v(this.A0D);
        while (A0v.hasNext()) {
            if (((C14746U6n) A0v.next()).A05) {
                C46498Dg1 dg1 = new C46498Dg1(requireContext(), C13990Tnq.A0S(r6).A0B);
                ? obj = new Object();
                dg1.A08(requireContext().getString(2131964722));
                dg1.A04(new WBA((Object) this, 26), 2131964724);
                WBG.A02(this, dg1, obj, 59, 2131964725);
                C14765U8b A0S2 = C13990Tnq.A0S(r6);
                WYY wyy2 = A0S2.A0C;
                String str2 = A0S2.A00;
                boolean z2 = A0S2.A03;
                0qQ.A0B(str2, 0);
                WYY.A01(wyy2, "discard_confirmation_dialog_impression", "impression", str2, z2);
                return true;
            }
        }
        A01(this);
        return true;
    }

    public C15314UaL() {
        C20691WxN wxN = new C20691WxN(this, 24);
        C20691WxN wxN2 = new C20691WxN(this, 16);
        0eO r7 = 0eO.A02;
        AnonymousClass0eM A002 = C20691WxN.A00(wxN2, r7, 17);
        this.A0G = new C227862kA(new C20691WxN(A002, 18), wxN, new C20612Wvt(9, (Object) null, A002), new 0Yh(C14765U8b.class));
        C20691WxN wxN3 = new C20691WxN(this, 22);
        AnonymousClass0eM A003 = C20691WxN.A00(new C20691WxN(this, 19), r7, 20);
        this.A0E = new C227862kA(new C20691WxN(A003, 21), wxN3, new C20612Wvt(10, (Object) null, A003), new 0Yh(U8U.class));
        C20691WxN wxN4 = new C20691WxN(this, 23);
        AnonymousClass0eM A004 = C20691WxN.A00(new C20691WxN(this, 13), r7, 14);
        this.A0F = new C227862kA(new C20691WxN(A004, 15), wxN4, new C20612Wvt(8, (Object) null, A004), new 0Yh(C14771U8h.class));
    }

    public static final void A00(IgLinearLayout igLinearLayout, C15314UaL uaL, List list) {
        C14746U6n u6n;
        igLinearLayout.removeAllViews();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LeadGenFormBaseQuestion leadGenFormBaseQuestion = (LeadGenFormBaseQuestion) it.next();
            int ordinal = leadGenFormBaseQuestion.A03.ordinal();
            if (ordinal == 33) {
                u6n = null;
            } else if (ordinal != 0) {
                u6n = new Un0(uaL.requireContext(), (AttributeSet) null, 0);
            } else {
                u6n = C14746U6n.A00(uaL, leadGenFormBaseQuestion);
            }
            W33 w33 = W33.A00;
            String A072 = w33.A07(leadGenFormBaseQuestion);
            w33.A06(leadGenFormBaseQuestion);
            if (u6n != null) {
                uaL.A0D.put(leadGenFormBaseQuestion, u6n);
                u6n.setEnabled(true);
                u6n.A0G(leadGenFormBaseQuestion, true, false, false);
                if (Dba.A1X(C16534Uwe.MULTIPLE_CHOICE, A072)) {
                    u6n.A01 = C19413WYg.A00;
                } else {
                    u6n.A02 = C19417WYk.A00;
                }
                igLinearLayout.addView(u6n);
            }
            AnonymousClass0eM r6 = uaL.A0G;
            if (!AnonymousClass7TF.A1Y(C13990Tnq.A0S(r6).A07.A02(), true)) {
                C14765U8b A0S = C13990Tnq.A0S(r6);
                0qQ.A0B(A072, 0);
                WYY wyy = A0S.A0C;
                String str = A0S.A00;
                boolean z = A0S.A03;
                0qQ.A0B(str, 0);
                WYY.A02(wyy, "question_impression", str, A072, z);
                if (leadGenFormBaseQuestion.A01) {
                    C14765U8b A0S2 = C13990Tnq.A0S(r6);
                    WYY wyy2 = A0S2.A0C;
                    String str2 = A0S2.A00;
                    boolean z2 = A0S2.A03;
                    0qQ.A0B(str2, 0);
                    WYY.A02(wyy2, "answer_prefilled", str2, A072, z2);
                }
            }
        }
    }

    public static final void A01(C15314UaL uaL) {
        C309516Yo r1;
        int i;
        0hq parentFragmentManager = uaL.getParentFragmentManager();
        String A002 = AnonymousClass000.A00(1546);
        Fragment A0R = parentFragmentManager.A0R(A002);
        FragmentActivity requireActivity = uaL.requireActivity();
        UserSession userSession = C13990Tnq.A0S(uaL.A0G).A0B;
        if (A0R != null) {
            i = 1;
        } else {
            r1 = new C309516Yo(requireActivity, userSession);
            A002 = null;
            i = 0;
        }
        r1.A0G(A002, i);
    }

    public final void configureActionBar(2da r1) {
        Dbb.A1J(r1);
        Dbc.A0k(r1);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1273144434);
        0qQ.A0B(layoutInflater, 0);
        Dbb.A1N(this);
        View inflate = layoutInflater.inflate(R.layout.lead_gen_fragment_form_preview, viewGroup, false);
        AnonymousClass0fD.A09(24726589, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-650821951);
        super.onDestroy();
        AnonymousClass3E6 r0 = this.A09;
        if (r0 != null) {
            r0.onDestroy();
        }
        AnonymousClass0fD.A09(-357699665, A022);
    }

    public final void onDestroyView() {
        ViewTreeObserver viewTreeObserver;
        int A022 = AnonymousClass0fD.A02(-1794234003);
        super.onDestroyView();
        this.A00 = null;
        AnonymousClass3E6 r1 = this.A09;
        if (r1 != null) {
            r1.EEH(this.A0H);
        }
        IgTextView igTextView = this.A04;
        if (!(igTextView == null || (viewTreeObserver = igTextView.getViewTreeObserver()) == null)) {
            viewTreeObserver.removeOnPreDrawListener(this.A0C);
        }
        this.A06 = null;
        this.A07 = null;
        this.A02 = null;
        this.A03 = null;
        this.A05 = null;
        this.A04 = null;
        this.A01 = null;
        AnonymousClass0fD.A09(-610647817, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1738309947);
        C15314UaL.super.onPause();
        DbS.A1D(this);
        AnonymousClass0fD.A09(-375985968, A022);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.07Z, X.UaL, androidx.fragment.app.Fragment] */
    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(-1874794372);
        C15314UaL.super.onStart();
        AnonymousClass3E6 r0 = this.A09;
        if (r0 != null) {
            JTP.A17(this, r0);
        }
        this.A0A = C20592WvV.A00(this, ((U8U) this.A0E.getValue()).A03, 27);
        AnonymousClass0fD.A09(313971834, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-1009467491);
        C15314UaL.super.onStop();
        AnonymousClass3E6 r0 = this.A09;
        if (r0 != null) {
            r0.onStop();
        }
        this.A0A = JTQ.A0n(this.A0A);
        AnonymousClass0fD.A09(1913486340, A022);
    }
}
