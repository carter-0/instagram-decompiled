package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.form.IgFormField;

/* renamed from: X.UaA  reason: case insensitive filesystem */
public final class C15303UaA extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "LeadGenEditFormNameFragmentV2";
    public IgFormField A00;
    public boolean A01;
    public C262204Co A02;
    public final AnonymousClass0eM A03;

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        C13992Tns.A0r(r3, 2131964776);
        W0D.A01(W0D.A00(this, r3), this, 39);
    }

    public final String getModuleName() {
        return "organic_lead_gen_edit_form_name";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgFormField A0d = DbT.A0d(view, R.id.form_name);
        this.A00 = A0d;
        if (A0d != null) {
            A0d.setText(((U8X) this.A03.getValue()).A00);
            A0d.setRuleChecker(new C19403WXw(3, A0d, this));
            A0d.setInputType(49152);
            W7b.A00(A0d, this, 15).setOnEditorActionListener(new WDC(this, 7));
            A0d.getMEditText().setImeOptions(6);
            A0d.getMEditText().requestFocus();
        }
        U8X u8x = (U8X) this.A03.getValue();
        C17776Vfn vfn = u8x.A02;
        String str = u8x.A04;
        0qQ.A0B(str, 0);
        XB6.A02(vfn.A00, str, "lead_gen_edit_form_name", "edit_form_screen_impression");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return ((U8X) this.A03.getValue()).A01;
    }

    public final boolean onBackPressed() {
        if (this.A01) {
            return false;
        }
        U8X u8x = (U8X) this.A03.getValue();
        C17776Vfn vfn = u8x.A02;
        String str = u8x.A04;
        0qQ.A0B(str, 0);
        XB6.A01(vfn.A00, str, "lead_gen_edit_form_name", "cancel");
        return false;
    }

    public C15303UaA() {
        C20700WxW wxW = new C20700WxW(this, 10);
        AnonymousClass0eM A002 = C20700WxW.A00(new C20700WxW(this, 7), 0eO.A02, 8);
        this.A03 = new C227862kA(new C20700WxW(A002, 9), wxW, new C20612Wvt(19, (Object) null, A002), new 0Yh(U8X.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(102762454);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.lead_gen_fragment_edit_form_name, viewGroup, false);
        AnonymousClass0fD.A09(-2097138503, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(329322691);
        super.onDestroyView();
        this.A00 = null;
        this.A01 = false;
        AnonymousClass0fD.A09(-1844220845, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-906926491);
        super.onResume();
        IgFormField igFormField = this.A00;
        if (igFormField != null) {
            igFormField.post(new C20045Wk5(this));
        }
        AnonymousClass0fD.A09(1222811718, A022);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.07Z, X.UaA, androidx.fragment.app.Fragment] */
    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(316365697);
        C15303UaA.super.onStart();
        this.A02 = C20592WvV.A00(this, ((U8X) this.A03.getValue()).A06, 32);
        AnonymousClass0fD.A09(-889159901, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-1879101994);
        C15303UaA.super.onStop();
        this.A02 = JTQ.A0n(this.A02);
        AnonymousClass0fD.A09(-2124256354, A022);
    }
}
