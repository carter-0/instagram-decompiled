package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.leadgen.organic.model.LeadFormCustomQuestion;
import com.instagram.leadgen.organic.model.LeadGenFormData;
import com.instagram.ui.widget.radiogroup.IgRadioGroup;

/* renamed from: X.UaD  reason: case insensitive filesystem */
public final class C15306UaD extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "LeadGenOneTapOnboardingFragmentV2";
    public IgdsBottomButtonLayout A00;
    public IgRadioGroup A01;
    public boolean A02;
    public boolean A03 = true;
    public NestedScrollView A04;
    public C262204Co A05;
    public final ViewTreeObserver.OnPreDrawListener A06 = new WCE(this, 7);
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final int[] A09 = new int[2];
    public final int[] A0A = new int[2];

    public final void configureActionBar(2da r4) {
        String A0d;
        0qQ.A0B(r4, 0);
        AnonymousClass0eM r2 = this.A08;
        if (C13990Tnq.A0U(r2).A04 == C16602Uxw.A04) {
            A0d = "";
        } else {
            A0d = C13991Tnr.A0d(this, getString(C13990Tnq.A0U(r2).A04.A00), 2131964705);
        }
        r4.setTitle(A0d);
        Dbc.A0k(r4);
    }

    public final String getModuleName() {
        return "organic_lead_gen_one_tap_onboarding";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        int i2;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A04 = (NestedScrollView) view.requireViewById(R.id.one_tap_onboarding_container);
        DbU.A0G(view, R.id.one_tap_onboarding_title).setText(DbU.A0m(this, 2131964846));
        TextView A0G = DbU.A0G(view, R.id.one_tap_onboarding_subtitle);
        AnonymousClass0eM r6 = this.A08;
        int i3 = 2131964844;
        if (C13990Tnq.A0U(r6).A04 == C16602Uxw.A06) {
            i3 = 2131964845;
        }
        A0G.setText(DbU.A0m(this, i3));
        IgRadioGroup igRadioGroup = (IgRadioGroup) view.requireViewById(R.id.onboarding_options);
        for (C16607Uy3 uy3 : C16607Uy3.values()) {
            U5O u5o = new U5O(requireActivity());
            u5o.setTag(uy3);
            int ordinal = uy3.ordinal();
            if (ordinal == 0) {
                i = 2131964841;
            } else if (ordinal == 1) {
                i = 2131964839;
            } else {
                throw new RuntimeException();
            }
            u5o.setPrimaryText(i);
            int i4 = 2131964843;
            if (ordinal != 0) {
                i4 = 2131964840;
            }
            Integer valueOf = Integer.valueOf(i4);
            if (valueOf != null) {
                i2 = valueOf.intValue();
            } else {
                i2 = uy3.A01;
            }
            u5o.setSecondaryText(i2);
            u5o.A04(true);
            Integer num = uy3.A02;
            if (num != null) {
                u5o.setActionLabel(DbU.A0m(this, num.intValue()), C13990Tnq.A0U(r6).A02, new WBG(61, this, uy3));
            }
            u5o.A9W(new C19746Wen(8, uy3, u5o));
            igRadioGroup.addView(u5o);
        }
        igRadioGroup.A02 = new C19753Weu(2, this, igRadioGroup);
        this.A01 = igRadioGroup;
        this.A00 = (IgdsBottomButtonLayout) view.requireViewById(R.id.one_tap_onboarding_bottom_button_layout);
        SpannableStringBuilder A082 = VK1.A00.A08(getActivity(), requireContext(), C13990Tnq.A0U(r6).A02);
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A00;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setFooterText(A082);
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A00;
        if (igdsBottomButtonLayout2 != null) {
            igdsBottomButtonLayout2.setPrimaryActionOnClickListener(new WBA((Object) this, 46));
        }
        View A0G2 = AnonymousClass7TF.A0G(view, R.id.main_container);
        View A0G3 = AnonymousClass7TF.A0G(view, R.id.bottom_banner);
        View A0G4 = AnonymousClass7TF.A0G(A0G3, R.id.banner_close);
        DbV.A1F(getViewLifecycleOwner(), C13990Tnq.A0U(r6).A01, new C59104J6m(1, (Object) A0G2, (Object) A0G3, (Object) this), 18);
        WBG.A01(A0G4, 60, this, A0G3);
        U8Z A0U = C13990Tnq.A0U(r6);
        C17778Vfp vfp = A0U.A03;
        String str = A0U.A06;
        0qQ.A0B(str, 0);
        XB6.A02(vfp.A00, str, "lead_gen_one_tap_setup", "one_tap_setup_impression");
        U8Z A0U2 = C13990Tnq.A0U(r6);
        FragmentActivity requireActivity = requireActivity();
        LeadGenFormData leadGenFormData = A0U2.A05;
        leadGenFormData.A07 = true;
        leadGenFormData.A09 = true;
        leadGenFormData.A06 = 0sr.A1L(new LeadFormCustomQuestion[]{new LeadFormCustomQuestion(C16534Uwe.SHORT_ANSWER, AnonymousClass7TE.A16(requireActivity, 2131964850), 0sn.A00)});
        C20786Wyx.A00(getViewLifecycleOwner(), C13990Tnq.A0U(r6).A00, this, 40, 18);
        C20786Wyx.A00(getViewLifecycleOwner(), C13990Tnq.A0T(this.A07).A00, this, 41, 18);
    }

    public static final boolean A00(C15306UaD uaD) {
        View findViewWithTag;
        NestedScrollView nestedScrollView;
        IgRadioGroup igRadioGroup = uaD.A01;
        if (igRadioGroup == null || (findViewWithTag = igRadioGroup.findViewWithTag(C16607Uy3.A05)) == null || (nestedScrollView = uaD.A04) == null) {
            return false;
        }
        int[] iArr = uaD.A09;
        findViewWithTag.getLocationInWindow(iArr);
        int[] iArr2 = uaD.A0A;
        nestedScrollView.getLocationInWindow(iArr2);
        if (iArr2[1] + nestedScrollView.getHeight() >= iArr[1] + (findViewWithTag.getHeight() / 3)) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return C13990Tnq.A0U(this.A08).A02;
    }

    public final boolean onBackPressed() {
        AnonymousClass0eM r3 = this.A08;
        U8Z A0U = C13990Tnq.A0U(r3);
        C17778Vfp vfp = A0U.A03;
        String str = A0U.A06;
        0qQ.A0B(str, 0);
        XB6.A01(vfp.A00, str, "lead_gen_one_tap_setup", "cancel");
        if (!AnonymousClass7TF.A1Y(C13990Tnq.A0T(this.A07).A00.A02(), true)) {
            if (C13990Tnq.A0U(r3).A04 == C16602Uxw.A06) {
                DbT.A1K(this);
            } else {
                C13990Tnq.A0y(requireActivity(), C13990Tnq.A0U(r3).A02);
                return true;
            }
        }
        return true;
    }

    public C15306UaD() {
        C58180Ink ink = new C58180Ink(this, 0);
        C20700WxW wxW = new C20700WxW(this, 44);
        0eO r7 = 0eO.A02;
        AnonymousClass0eM A002 = C20700WxW.A00(wxW, r7, 45);
        this.A08 = new C227862kA(new C20700WxW(A002, 46), ink, new C20612Wvt(28, (Object) null, A002), new 0Yh(U8Z.class));
        C20700WxW wxW2 = new C20700WxW(this, 43);
        AnonymousClass0eM A003 = C20700WxW.A00(new C20700WxW(this, 47), r7, 48);
        this.A07 = new C227862kA(new C20700WxW(A003, 49), wxW2, new C20612Wvt(29, (Object) null, A003), new 0Yh(C14787U8y.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1573636533);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.lead_gen_fragment_one_tap_onboarding, viewGroup, false);
        AnonymousClass0fD.A09(-1314020296, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(144312982);
        super.onDestroyView();
        this.A01 = null;
        this.A00 = null;
        this.A04 = null;
        AnonymousClass0fD.A09(1774583010, A022);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.07Z, androidx.fragment.app.Fragment, X.UaD] */
    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(-1031251722);
        C15306UaD.super.onStart();
        this.A05 = C20592WvV.A00(this, C13990Tnq.A0T(this.A07).A0A, 35);
        AnonymousClass0fD.A09(-1299048844, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-1900433499);
        C15306UaD.super.onStop();
        this.A05 = JTQ.A0n(this.A05);
        AnonymousClass0fD.A09(-147797542, A022);
    }
}
