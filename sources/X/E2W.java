package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.form.IgFormField;

public final class E2W extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "EditLinksEditUrlFragment";
    public 1Ng A00;
    public IgFormField A01;
    public F1D A02;
    public AnonymousClass6ST A03;
    public final AnonymousClass0eM A04 = C227642jf.A02(this);

    public final String getModuleName() {
        return "edit_links_edit_url_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = (IgFormField) view.findViewById(R.id.link_action_edit_url_formfield);
        AnonymousClass6ST A0h = DbV.A0h(requireContext());
        this.A03 = A0h;
        DbX.A15(requireContext(), A0h);
        AnonymousClass6ST r0 = this.A03;
        if (r0 == null) {
            0qQ.A0F("dialog");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass0fN.A00(r0);
        FG4.A02(AnonymousClass7TE.A0l(this.A04), this, 14);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public final void configureActionBar(2da r3) {
        C59922Jbl A002 = C59922Jbl.A00(r3);
        A002.A02 = getString(2131970030);
        C59904JbT.A01(FPC.A00(this, 36), r3, A002);
        Dbb.A0s(FPC.A00(this, 37), DbX.A0M(), r3);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(963053126);
        E2W.super.onCreate(bundle);
        this.A00 = DbX.A0R(this.A04);
        AnonymousClass0fD.A09(-1412670178, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2017195613);
        0qQ.A0B(layoutInflater, 0);
        View A09 = DbW.A09(layoutInflater, viewGroup, R.layout.layout_links_edit_link_fragment, false);
        AnonymousClass0fD.A09(1131433578, A022);
        return A09;
    }
}
