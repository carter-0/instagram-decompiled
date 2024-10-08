package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.spinner.SpinnerImageView;

public final class E42 extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "GuidedActivationConfirmationFragment";
    public IgLinearLayout A00;
    public IgTextView A01;
    public IgTextView A02;
    public IgTextView A03;
    public C60424JlH A04;
    public SpinnerImageView A05;
    public RecyclerView A06;
    public final AnonymousClass0eM A07 = C51798G2h.A00(this, 31);
    public final AnonymousClass0eM A08 = C227642jf.A02(this);
    public final AnonymousClass0eM A09;

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final boolean onBackPressed() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = (IgLinearLayout) view.requireViewById(R.id.guided_activation_container);
        this.A05 = DbX.A0k(view);
        this.A03 = DbT.A0a(view, R.id.guided_activation_confirmation_title);
        this.A02 = DbT.A0a(view, R.id.guided_activation_confirmation_subtitle);
        this.A01 = DbT.A0a(view, R.id.guided_activation_notify_now);
        this.A06 = DbT.A0I(view, R.id.notification_deferral_next_steps_recycler_view);
        C60424JlH jlH = new C60424JlH(AnonymousClass7TE.A0l(this.A08));
        this.A04 = jlH;
        jlH.A00 = this;
        RecyclerView recyclerView = this.A06;
        if (recyclerView == null) {
            0qQ.A0F("nextSteps");
            throw AnonymousClass00P.createAndThrow();
        }
        recyclerView.setAdapter(jlH);
        C60212JhV jhV = (C60212JhV) this.A09.getValue();
        C318136oS A002 = C318116oQ.A00(jhV);
        JTZ jtz = new JTZ(jhV, (AnonymousClass4D7) null);
        19B r1 = 19B.A00;
        1Eo.A05(r1, jtz, A002);
        07U r4 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        1Eo.A05(r1, new MHE(viewLifecycleOwner, r4, this, (AnonymousClass4D7) null, 13), AnonymousClass07a.A00(viewLifecycleOwner));
        AnonymousClass07Z viewLifecycleOwner2 = getViewLifecycleOwner();
        1Eo.A05(r1, new MHE(viewLifecycleOwner2, r4, this, (AnonymousClass4D7) null, 14), AnonymousClass07a.A00(viewLifecycleOwner2));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A08);
    }

    public E42() {
        C51798G2h g2h = new C51798G2h(this, 35);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C51798G2h(new C51798G2h(this, 32), 33));
        this.A09 = DbS.A0I(new C51798G2h(A002, 34), g2h, new C58187Inr(11, A002, (Object) null), DbS.A0z(C60212JhV.class));
    }

    public final void configureActionBar(2da r2) {
        Dbb.A1I(r2);
        Dbc.A0k(r2);
        r2.Eom(2131963251);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(35958899);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.guided_activation_confirmation, viewGroup, false);
        AnonymousClass0fD.A09(1353784320, A022);
        return inflate;
    }
}
