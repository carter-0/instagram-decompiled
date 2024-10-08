package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.creatortools.api.schemas.ValuePropsFlow;

public final class E2L extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "CreatorToolsValuePropsFragment";
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01 = Dbl.A00(this, 20);
    public final AnonymousClass0eM A02 = Dbl.A00(this, 21);
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;

    public final void configureActionBar(2da r4) {
        int i;
        0qQ.A0B(r4, 0);
        r4.Eu4(true);
        String A0t = DbS.A0t(this.A02);
        0qQ.A0B(A0t, 0);
        if (A0t.equals(ValuePropsFlow.INSIGHTS.A00)) {
            i = 2131964354;
        } else if (A0t.equals(ValuePropsFlow.INSPIRATION.A00)) {
            i = 2131964358;
        } else if (A0t.equals(ValuePropsFlow.BONUSES.A00)) {
            i = 2131966697;
        } else if (A0t.equals(ValuePropsFlow.SUBSCRIPTION.A00)) {
            i = 2131966709;
        } else if (A0t.equals(ValuePropsFlow.BADGES.A00)) {
            i = 2131966696;
        } else {
            boolean equals = A0t.equals(ValuePropsFlow.CREATOR_MARKETPLACE.A00);
            i = 2131976368;
            if (equals) {
                i = 2131966699;
            }
        }
        r4.Eom(i);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.0rm, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r13v0, types: [X.0rm, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v0, types: [X.0rm, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v0, types: [X.0rm, java.lang.Object] */
    public final void onViewCreated(View view, Bundle bundle) {
        FPI A002;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        AnonymousClass0eM r4 = this.A01;
        if (r4.getValue() != null) {
            ((C46791DlQ) this.A04.getValue()).A00 = DbS.A0t(r4);
        }
        Dba.A17(DbZ.A0F(view2, R.id.value_props_recycle_view), this.A00);
        AnonymousClass0eM r1 = this.A04;
        C46791DlQ dlQ = (C46791DlQ) r1.getValue();
        String A0t = DbS.A0t(this.A02);
        0qQ.A0B(A0t, 0);
        AnonymousClass7TF.A1O(dlQ.A0D, true);
        ? obj = new Object();
        0sn r0 = 0sn.A00;
        obj.A00 = r0;
        ? obj2 = new Object();
        obj2.A00 = r0;
        ? obj3 = new Object();
        C62484KgZ kgZ = C62484KgZ.FETCHING;
        obj3.A00 = kgZ;
        ? obj4 = new Object();
        obj4.A00 = kgZ;
        C318136oS A003 = C318116oQ.A00(dlQ);
        MHM mhm = new MHM(dlQ, A0t, (AnonymousClass4D7) null, (0rm) obj, (0rm) obj3, (0rm) obj4, (0rm) obj2, 10);
        19B r42 = 19B.A00;
        1Eo.A05(r42, mhm, A003);
        1Eo.A05(r42, new MHM(dlQ, A0t, (AnonymousClass4D7) null, (0rm) obj2, (0rm) obj4, (0rm) obj3, (0rm) obj, 11), C318116oQ.A00(dlQ));
        boolean A2L = DbX.A0l(AnonymousClass0t1.A01, this.A03).A2L();
        C3021461u r5 = (C3021461u) view2.findViewById(R.id.value_props_bottom_button_layout);
        if (A2L) {
            if (r5 != null) {
                DbZ.A1A(this, r5, 2131964896);
                A002 = FPI.A00(this, 7);
            }
            Dba.A15(getViewLifecycleOwner(), ((C46791DlQ) r1.getValue()).A06, new MP9(this, 47), 22);
            Dba.A15(getViewLifecycleOwner(), ((C46791DlQ) r1.getValue()).A02, new C74191PqX(18, (Object) view2, (Object) this), 22);
            Dba.A15(getViewLifecycleOwner(), ((C46791DlQ) r1.getValue()).A03, new C74191PqX(19, (Object) view2, (Object) this), 22);
            1Eo.A05(r42, new MFR(this, (AnonymousClass4D7) null, 13), DbV.A0J(this));
        }
        if (r5 != null) {
            DbZ.A1A(this, r5, 2131956741);
            A002 = FPI.A00(this, 8);
        }
        Dba.A15(getViewLifecycleOwner(), ((C46791DlQ) r1.getValue()).A06, new MP9(this, 47), 22);
        Dba.A15(getViewLifecycleOwner(), ((C46791DlQ) r1.getValue()).A02, new C74191PqX(18, (Object) view2, (Object) this), 22);
        Dba.A15(getViewLifecycleOwner(), ((C46791DlQ) r1.getValue()).A03, new C74191PqX(19, (Object) view2, (Object) this), 22);
        1Eo.A05(r42, new MFR(this, (AnonymousClass4D7) null, 13), DbV.A0J(this));
        r5.setPrimaryActionOnClickListener(A002);
        Dba.A15(getViewLifecycleOwner(), ((C46791DlQ) r1.getValue()).A06, new MP9(this, 47), 22);
        Dba.A15(getViewLifecycleOwner(), ((C46791DlQ) r1.getValue()).A02, new C74191PqX(18, (Object) view2, (Object) this), 22);
        Dba.A15(getViewLifecycleOwner(), ((C46791DlQ) r1.getValue()).A03, new C74191PqX(19, (Object) view2, (Object) this), 22);
        1Eo.A05(r42, new MFR(this, (AnonymousClass4D7) null, 13), DbV.A0J(this));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public E2L() {
        Dbl dbl = new Dbl(this, 25);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new Dbl(new Dbl(this, 22), 23));
        this.A04 = DbS.A0I(new Dbl(A002, 24), dbl, new C73664Phd(18, A002, (Object) null), DbS.A0z(C46791DlQ.class));
        this.A00 = Dbl.A00(this, 19);
        this.A03 = C227642jf.A02(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-628175983);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.creator_tools_value_props_screen, viewGroup, false);
        AnonymousClass0fD.A09(-1754488417, A022);
        return inflate;
    }
}
