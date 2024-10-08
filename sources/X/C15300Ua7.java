package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.ui.widget.radiogroup.IgRadioGroup;

/* renamed from: X.Ua7  reason: case insensitive filesystem */
public final class C15300Ua7 extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "PromoteLeadGenCtaSelectionFragment";
    public IgdsBottomButtonLayout A00;
    public IgRadioGroup A01;
    public C262204Co A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        C13992Tns.A0r(r2, 2131970571);
    }

    public final String getModuleName() {
        return "promote_lead_gen_cta_selection";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass0eM r4 = this.A04;
        U8Y u8y = (U8Y) r4.getValue();
        WYX.A02(u8y.A01, u8y.A05, "lead_gen_cta_selection", "cta_selection_impression");
        Dba.A16(getViewLifecycleOwner(), ((U8Y) r4.getValue()).A00, new C58728Iwb(this, 46), 53);
        Dba.A16(getViewLifecycleOwner(), ((C14786U8w) this.A03.getValue()).A00, new C58728Iwb(this, 47), 53);
        IgRadioGroup igRadioGroup = (IgRadioGroup) view.requireViewById(R.id.lead_gen_cta_option_group);
        for (XIGIGBoostCallToAction xIGIGBoostCallToAction : 0sr.A1P(new XIGIGBoostCallToAction[]{XIGIGBoostCallToAction.APPLY_NOW, XIGIGBoostCallToAction.LEARN_MORE, XIGIGBoostCallToAction.GET_QUOTE, XIGIGBoostCallToAction.SIGN_UP, XIGIGBoostCallToAction.SUBSCRIBE})) {
            U5O u5o = new U5O(requireActivity());
            u5o.setTag(xIGIGBoostCallToAction);
            u5o.setPrimaryText((CharSequence) DbU.A0m(this, C18677Vwa.A00(xIGIGBoostCallToAction)));
            igRadioGroup.addView(u5o);
        }
        igRadioGroup.A02 = new C19752Wet(this, 2);
        this.A01 = igRadioGroup;
        IgdsBottomButtonLayout A0Q = C13990Tnq.A0Q(view);
        this.A00 = A0Q;
        if (A0Q != null) {
            A0Q.setPrimaryAction(getString(2131964767), new WBB(this, 57));
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return ((U8Y) this.A04.getValue()).A04;
    }

    public final boolean onBackPressed() {
        U8Y u8y = (U8Y) this.A04.getValue();
        WYX.A01(u8y.A01, u8y.A05, "lead_gen_cta_selection", "cancel");
        C61060Jvy jvy = (C61060Jvy) ((C14786U8w) this.A03.getValue()).A00.A02();
        if (jvy != null && jvy.A03) {
            return true;
        }
        DbT.A1I(this);
        return true;
    }

    public C15300Ua7() {
        C20690WxM wxM = new C20690WxM(this, 7);
        C20690WxM wxM2 = new C20690WxM(this, 1);
        0eO r7 = 0eO.A02;
        AnonymousClass0eM A002 = C20690WxM.A00(wxM2, r7, 2);
        this.A04 = new C227862kA(new C20690WxM(A002, 3), wxM, new C41566AwY(29, (Object) null, A002), new 0Yh(U8Y.class));
        C20690WxM wxM3 = new C20690WxM(this, 0);
        AnonymousClass0eM A003 = C20690WxM.A00(new C20690WxM(this, 4), r7, 5);
        this.A03 = new C227862kA(new C20690WxM(A003, 6), wxM3, new C41566AwY(30, (Object) null, A003), new 0Yh(C16046UnZ.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1796017619);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.lead_gen_fragment_cta_selection, viewGroup, false);
        AnonymousClass0fD.A09(2107172525, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(2108863102);
        super.onDestroyView();
        this.A00 = null;
        this.A01 = null;
        AnonymousClass0fD.A09(-1407791894, A022);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.07Z, androidx.fragment.app.Fragment, java.lang.Object, X.Ua7] */
    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(1556276316);
        C15300Ua7.super.onStart();
        this.A02 = AnonymousClass11O.A03(AnonymousClass07a.A00(this), new C61860pz(new MGZ(this, (AnonymousClass4D7) null, 33), ((C14786U8w) this.A03.getValue()).A03));
        AnonymousClass0fD.A09(2055178168, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(1825516099);
        C15300Ua7.super.onStop();
        this.A02 = JTQ.A0n(this.A02);
        AnonymousClass0fD.A09(1618147064, A022);
    }
}
