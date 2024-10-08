package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.ui.widget.radiogroup.IgRadioGroup;

/* renamed from: X.UaI  reason: case insensitive filesystem */
public final class C15311UaI extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "LeadGenManageFormsFragmentV2";
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public IgdsBottomButtonLayout A04;
    public IgRadioGroup A05;
    public C262204Co A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;

    public static final void A00(C15311UaI uaI, boolean z, boolean z2) {
        AnonymousClass6ST r10 = new AnonymousClass6ST(uaI.requireContext(), true);
        r10.A00(uaI.requireContext().getString(2131969783));
        r10.setCancelable(false);
        C14783U8t A012 = uaI.A01();
        boolean z3 = z;
        A012.A09.A06(A012.A0B, C13989Tnp.A0p(A012.A08), A012.A0C, z3, z2);
        DbV.A1F(uaI.getViewLifecycleOwner(), ((U8M) uaI.A07.getValue()).A00, new C14307Tth(uaI, r10, 3, z2, z3), 17);
    }

    public final void configureActionBar(2da r3) {
        String string;
        0qQ.A0B(r3, 0);
        if (A01().A0A == C16602Uxw.A04) {
            string = "";
        } else {
            string = getString(2131964829);
            0qQ.A0A(string);
        }
        C13992Tns.A0s(r3, string);
    }

    public final String getModuleName() {
        return "lead_gen_manage_forms_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A02 = view.requireViewById(R.id.lead_form_list_loading_spinner);
        this.A00 = view.requireViewById(R.id.lead_gen_fragment_content);
        this.A05 = (IgRadioGroup) view.requireViewById(R.id.lead_form_radio_group);
        this.A03 = view.requireViewById(R.id.see_all_row);
        this.A04 = C13990Tnq.A0Q(view);
        DbV.A1F(getViewLifecycleOwner(), A01().A04, new C20786Wyx(this, 39), 17);
        DbV.A1F(getViewLifecycleOwner(), A01().A05, new MPB(25, (Object) view, (Object) this), 17);
    }

    public final C14783U8t A01() {
        return (C14783U8t) this.A08.getValue();
    }

    public C15311UaI() {
        C20700WxW wxW = new C20700WxW(this, 34);
        C20700WxW wxW2 = new C20700WxW(this, 27);
        0eO r7 = 0eO.A02;
        AnonymousClass0eM A002 = C20700WxW.A00(wxW2, r7, 28);
        this.A08 = new C227862kA(new C20700WxW(A002, 29), wxW, new C20612Wvt(24, (Object) null, A002), new 0Yh(C14783U8t.class));
        C20700WxW wxW3 = new C20700WxW(this, 33);
        AnonymousClass0eM A003 = C20700WxW.A00(new C20700WxW(this, 30), r7, 31);
        this.A07 = new C227862kA(new C20700WxW(A003, 32), wxW3, new C20612Wvt(25, (Object) null, A003), new 0Yh(U8M.class));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return A01().A06;
    }

    public final boolean onBackPressed() {
        C14783U8t A012 = A01();
        C18028Vk6 vk6 = A012.A07;
        String str = A012.A0C;
        0qQ.A0B(str, 0);
        XB6.A01(vk6.A00, str, "lead_gen_manage_lead_forms_and_cta", "cancel");
        return A01().A03;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1065172241);
        C15311UaI.super.onCreate(bundle);
        C14783U8t A012 = A01();
        A012.A00 = A012.A08.A00;
        C14783U8t A013 = A01();
        FragmentActivity requireActivity = requireActivity();
        String str = A013.A02;
        if (str != null) {
            C14783U8t.A00(A013, str);
        } else {
            C18794W2b.A02(requireActivity, AnonymousClass07i.A00(requireActivity), new C19182WOo((Object) A013, 4), A013.A06, false);
        }
        AnonymousClass0fD.A09(-561481409, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1047160554);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.lead_gen_manage_forms_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-322918151, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1206651932);
        super.onDestroyView();
        this.A02 = null;
        this.A00 = null;
        this.A05 = null;
        this.A03 = null;
        this.A01 = null;
        this.A04 = null;
        AnonymousClass0fD.A09(-1765566570, A022);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.07Z, androidx.fragment.app.Fragment, X.UaI] */
    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(1036343881);
        C15311UaI.super.onStart();
        this.A06 = C20592WvV.A00(this, A01().A0E, 34);
        AnonymousClass0fD.A09(910413885, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(1519411921);
        C15311UaI.super.onStop();
        this.A06 = JTQ.A0n(this.A06);
        AnonymousClass0fD.A09(-1691309406, A022);
    }
}
