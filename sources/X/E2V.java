package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

public final class E2V extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "ProfileChannelListFragment";
    public C355568Qm A00;
    public RecyclerView A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final AnonymousClass0eM A04;

    public final void configureActionBar(2da r4) {
        int i;
        View.OnClickListener A002;
        0qQ.A0B(r4, 0);
        r4.Eom(2131955055);
        r4.Eu4(true);
        Object A022 = ((C46769Dkw) this.A04.getValue()).A01.A02();
        if (0qQ.A0K(A022, EPM.A00)) {
            r4.Ett((View.OnClickListener) null, true);
            r4.setIsLoading(true);
            return;
        }
        if (0qQ.A0K(A022, EPK.A00)) {
            i = 2131969920;
            A002 = new FPG(35, (Object) r4, (Object) this);
        } else if (0qQ.A0K(A022, EPL.A00)) {
            i = 2131969921;
            A002 = FPC.A00(this, 35);
        } else {
            throw AnonymousClass7TE.A0z("invalid action bar state");
        }
        r4.AA9(A002, i);
    }

    public final String getModuleName() {
        return "edit_channels";
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.2tE, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v6, types: [X.2tE, java.lang.Object] */
    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = DbX.A0K(view);
        AnonymousClass2tC A002 = AnonymousClass2t9.A00(view.getContext());
        A002.A0C.addAll(0sr.A1P(new C232222tE[]{new Object(), new EGF(this, (E12) null, new JJR(this, 49), requireContext().getColor(2Yu.A0C(getContext()))), new Object()}));
        AnonymousClass2t9 A003 = A002.A00();
        AnonymousClass0eM r5 = this.A04;
        Object value = r5.getValue();
        AnonymousClass0xx A0E = DbW.A0E(this);
        C66166MGd mGd = new C66166MGd(value, new G4S(A003, 23), (AnonymousClass4D7) null, 16);
        19B r3 = 19B.A00;
        1Eo.A05(r3, mGd, A0E);
        this.A00 = new C355568Qm(new C46806Dli(new C59343JFv(this, 9)));
        RecyclerView recyclerView = this.A01;
        if (recyclerView != null) {
            recyclerView.setAdapter(A003);
            AnonymousClass3AQ r1 = new AnonymousClass3AQ();
            RecyclerView recyclerView2 = this.A01;
            if (recyclerView2 != null) {
                recyclerView2.setItemAnimator(r1);
                r1.A00 = false;
                DbV.A1F(this, ((C46769Dkw) r5.getValue()).A01, new G4S(this, 24), 37);
                07U r7 = 07U.A05;
                AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
                1Eo.A05(r3, new MH5(r7, this, viewLifecycleOwner, (AnonymousClass4D7) null, 7), AnonymousClass07a.A00(viewLifecycleOwner));
                return;
            }
        }
        0qQ.A0F("recyclerView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public E2V() {
        C51800G2j A002 = C51800G2j.A00(this, 32);
        C51800G2j A003 = C51800G2j.A00(this, 29);
        0eO r6 = 0eO.A02;
        AnonymousClass0eM A004 = AnonymousClass0eN.A00(r6, C51800G2j.A00(A003, 30));
        this.A04 = DbS.A0I(C51800G2j.A00(A004, 31), A002, new MJ4(35, (Object) null, A004), DbS.A0z(C46769Dkw.class));
        this.A02 = AnonymousClass0eN.A00(r6, C51800G2j.A00(this, 28));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(948294763);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.edit_channels, false);
        AnonymousClass0fD.A09(-362190555, A022);
        return A0D;
    }

    public final void onDetach() {
        int A022 = AnonymousClass0fD.A02(1001108536);
        E2V.super.onDetach();
        C46769Dkw dkw = (C46769Dkw) this.A04.getValue();
        ExW exW = dkw.A00;
        if (exW != null) {
            dkw.A03.A03(exW);
        }
        dkw.A00();
        AnonymousClass0fD.A09(-450617276, A022);
    }
}
