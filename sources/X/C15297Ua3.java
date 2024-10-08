package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.form.IgFormField;

/* renamed from: X.Ua3  reason: case insensitive filesystem */
public abstract class C15297Ua3 extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "LeadGenEditFormNameBaseFragment";
    public IgFormField A00;
    public boolean A01;
    public C262204Co A02;

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        C13992Tns.A0r(r3, 2131964776);
        W0D.A01(W0D.A00(this, r3), this, 2);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgFormField A0d = DbT.A0d(view, R.id.form_name);
        this.A00 = A0d;
        if (A0d != null) {
            A0d.setText(A00().A00);
            A0d.setRuleChecker(new C19403WXw(2, A0d, this));
            A0d.setInputType(49152);
            W7b.A00(A0d, this, 13).setOnEditorActionListener(new WDC(this, 6));
            A0d.getMEditText().setImeOptions(6);
            A0d.getMEditText().requestFocus();
        }
        C14769U8f A002 = A00();
        C17776Vfn vfn = A002.A01;
        String A003 = A002.A00();
        0qQ.A0B(A003, 0);
        XB6.A02(vfn.A00, A003, "lead_gen_edit_form_name", "edit_form_screen_impression");
    }

    public final C14769U8f A00() {
        AnonymousClass0eM r0;
        if (this instanceof C16004Uml) {
            r0 = ((C16004Uml) this).A00;
        } else {
            r0 = ((C16003Umk) this).A00;
        }
        return (C14769U8f) r0.getValue();
    }

    public final boolean onBackPressed() {
        if (this.A01) {
            return false;
        }
        C14769U8f A002 = A00();
        C17776Vfn vfn = A002.A01;
        String A003 = A002.A00();
        0qQ.A0B(A003, 0);
        XB6.A01(vfn.A00, A003, "lead_gen_edit_form_name", "cancel");
        return false;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        C14769U8f A002 = A00();
        if (A002 instanceof C16054Unh) {
            return ((C16054Unh) A002).A00;
        }
        return ((C16053Ung) A002).A01;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(120605612);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.lead_gen_fragment_edit_form_name, viewGroup, false);
        AnonymousClass0fD.A09(1011019047, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1153135948);
        super.onDestroyView();
        this.A00 = null;
        this.A01 = false;
        AnonymousClass0fD.A09(328593229, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-928478169);
        super.onResume();
        IgFormField igFormField = this.A00;
        if (igFormField != null) {
            igFormField.post(new C20035Wjv(this));
        }
        AnonymousClass0fD.A09(1598547166, A022);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.07Z, androidx.fragment.app.Fragment, X.Ua3] */
    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(-1440946661);
        C15297Ua3.super.onStart();
        this.A02 = C20592WvV.A00(this, A00().A03, 16);
        AnonymousClass0fD.A09(1953068431, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(211188881);
        C15297Ua3.super.onStop();
        this.A02 = JTQ.A0n(this.A02);
        AnonymousClass0fD.A09(-395158745, A022);
    }
}
