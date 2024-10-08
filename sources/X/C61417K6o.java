package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.modal.ModalActivity;

/* renamed from: X.K6o  reason: case insensitive filesystem */
public final class C61417K6o extends AnonymousClass4DH implements AnonymousClass4DU, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "IGTVSeriesFragment";
    public C61292K1d A00;
    public C60430JlN A01;
    public ERQ A02;
    public String A03;
    public RecyclerView A04;
    public final AnonymousClass0eM A05 = C66306MMp.A01(this, 2);
    public final AnonymousClass0eM A06 = C66306MMp.A01(this, 3);
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08 = C66306MMp.A01(this, 4);
    public final AnonymousClass0eM A09;

    public final void configureActionBar(2da r6) {
        FragmentActivity activity;
        0qQ.A0B(r6, 0);
        String str = this.A03;
        if (str == null) {
            0qQ.A0F("_actionBarTitle");
            throw AnonymousClass00P.createAndThrow();
        }
        DbW.A1C(r6, str);
        if (((C60280Jib) this.A09.getValue()).A0F && (activity = getActivity()) != null) {
            Integer num = AnonymousClass05K.A00;
            int A032 = JTQ.A03(this, 2Yu.A0B(getContext()));
            C58185Inp inp = new C58185Inp(44, activity, this);
            AnonymousClass3JR A0K = DbS.A0K();
            A0K.A06 = Tt3.A01(num);
            A0K.A05 = Tt3.A00(num);
            A0K.A0G = LY6.A00(inp, 34);
            A0K.A02 = A032;
            0qQ.A0C(C51970G9q.A0P(A0K, r6), "null cannot be cast to non-null type android.widget.ImageView");
        }
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: X.4DU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: X.K6o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: X.K6o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: X.K6o} */
    /* JADX WARNING: type inference failed for: r0v24, types: [java.lang.Object, X.LZi] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r20, android.os.Bundle r21) {
        /*
            r19 = this;
            r3 = 0
            r1 = r20
            X.0qQ.A0B(r1, r3)
            r6 = r19
            r0 = r21
            super.onViewCreated(r1, r0)
            android.os.Bundle r2 = r6.requireArguments()
            android.content.Context r12 = r6.requireContext()
            java.lang.String r0 = "igtv_base_analytics_module_arg"
            r2.getString(r0)
            X.K1d r0 = r6.A00
            if (r0 != 0) goto L_0x0028
            java.lang.String r0 = "series"
        L_0x0020:
            X.0qQ.A0F(r0)
        L_0x0023:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0028:
            java.lang.String r0 = r0.A03
            java.lang.String r4 = X.LQM.A02(r0)
            X.0qQ.A07(r4)
            X.2el r8 = X.2el.A00()
            X.0eM r2 = r6.A07
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r2)
            android.content.Context r5 = r6.requireContext()
            X.1L1 r0 = X.1L2.A00()
            java.lang.String r10 = r0.A00
            r0 = 37
            X.MYK r11 = new X.MYK
            r11.<init>(r4, r0)
            X.Hnp r4 = new X.Hnp
            r9 = r6
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            com.instagram.common.session.UserSession r14 = X.AnonymousClass7TE.A0l(r2)
            X.JlN r11 = new X.JlN
            r13 = r6
            r15 = r4
            r16 = r6
            r17 = r6
            r18 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r6.A01 = r11
            androidx.recyclerview.widget.LinearLayoutManager r4 = new androidx.recyclerview.widget.LinearLayoutManager
            r4.<init>(r12)
            r0 = 2131441157(0x7f0b3605, float:1.8504318E38)
            androidx.recyclerview.widget.RecyclerView r2 = X.DbZ.A0F(r1, r0)
            r0 = 1
            r2.A0S = r0
            r2.setLayoutManager(r4)
            X.JlN r0 = r6.A01
            java.lang.String r1 = "seriesAdapter"
            if (r0 == 0) goto L_0x009b
            r2.setAdapter(r0)
            X.JlN r0 = r6.A01
            if (r0 == 0) goto L_0x009b
            X.L6k r1 = new X.L6k
            r1.<init>(r4, r0, r2)
            X.Jm8 r0 = new X.Jm8
            r0.<init>(r6, r6, r1)
            r6.A04 = r2
            X.3DZ r2 = X.AnonymousClass3DZ.A00(r6)
            androidx.recyclerview.widget.RecyclerView r1 = r6.A04
            if (r1 != 0) goto L_0x009f
            java.lang.String r0 = "recyclerView"
            goto L_0x0020
        L_0x009b:
            X.0qQ.A0F(r1)
            goto L_0x0023
        L_0x009f:
            X.2eo[] r0 = new X.AnonymousClass2eo[r3]
            r8.A08(r1, r2, r0)
            X.07Z r5 = r6.getViewLifecycleOwner()
            X.0eM r4 = r6.A09
            java.lang.Object r3 = r4.getValue()
            X.Jib r3 = (X.C60280Jib) r3
            X.2Fj r1 = r3.A04
            r0 = 13
            X.MPA r0 = X.MPA.A00(r6, r0)
            r2 = 63
            X.Dba.A15(r5, r1, r0, r2)
            X.2Fj r1 = r3.A03
            r0 = 14
            X.MPA r0 = X.MPA.A00(r6, r0)
            X.Dba.A15(r5, r1, r0, r2)
            X.2Fj r1 = r3.A02
            r0 = 15
            X.MPA r0 = X.MPA.A00(r6, r0)
            X.Dba.A15(r5, r1, r0, r2)
            X.2Fj r1 = r3.A01
            r0 = 16
            X.MPA r0 = X.MPA.A00(r6, r0)
            X.Dba.A15(r5, r1, r0, r2)
            X.MWn r2 = r3.A09
            r1 = 2
            X.LZp r0 = new X.LZp
            r0.<init>(r1, r3, r6)
            r2.CsP(r5, r0)
            X.MWn r2 = r3.A08
            r1 = 19
            X.LZr r0 = new X.LZr
            r0.<init>(r6, r1)
            r2.CsP(r5, r0)
            X.MWn r2 = r3.A0A
            r1 = 3
            X.LZp r0 = new X.LZp
            r0.<init>(r1, r3, r6)
            r2.CsP(r5, r0)
            X.2YL r4 = X.DbS.A0H(r4)
            X.6oS r3 = X.C318116oQ.A00(r4)
            r2 = 0
            r1 = 30
            X.MH0 r0 = new X.MH0
            r0.<init>(r4, r2, r1)
            X.AnonymousClass7TE.A1Z(r0, r3)
            A00(r6)
            X.LZi r0 = new X.LZi
            r0.<init>()
            X.C63064Kqt.A00(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61417K6o.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A00(C61417K6o k6o) {
        AnonymousClass0eM r4 = k6o.A09;
        if (!((C60280Jib) r4.getValue()).A00) {
            C60430JlN jlN = k6o.A01;
            if (jlN == null) {
                0qQ.A0F("seriesAdapter");
                throw AnonymousClass00P.createAndThrow();
            }
            Integer num = AnonymousClass05K.A00;
            if (jlN.A01 != num) {
                jlN.A01 = num;
                jlN.A00(false);
                jlN.notifyDataSetChanged();
            }
            C60280Jib jib = (C60280Jib) r4.getValue();
            C60280Jib.A00(jib, new C59675JTg(jib, (AnonymousClass4D7) null, 11), true);
        }
    }

    public final String getModuleName() {
        String A002 = new LC5(EXG.A0O).A00();
        0qQ.A07(A002);
        return A002;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
    }

    public C61417K6o() {
        C66306MMp A022 = C66306MMp.A02(this, 8);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, C66306MMp.A02(C66306MMp.A02(this, 5), 6));
        this.A09 = DbS.A0I(C66306MMp.A02(A002, 7), A022, new C58185Inp(45, (Object) null, A002), DbS.A0z(C60280Jib.class));
        this.A07 = C227642jf.A02(this);
    }

    public final void A01() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        if (activity instanceof ModalActivity) {
            AnonymousClass0eM r0 = this.A07;
            Dba.A12(C46447Df9.A02().A02(AnonymousClass7TE.A0l(r0), C46474Dfc.A01(AnonymousClass7TE.A0l(r0), ((C60280Jib) this.A09.getValue()).A0D.A00, "igtv_series_username_row", getModuleName())), DbX.A0N(activity, r0));
            return;
        }
        ((C55942Hq6) this.A05.getValue()).A00(activity, ((C60280Jib) this.A09.getValue()).A0D.A00, "igtv_series_username_row");
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1613114852);
        C61417K6o.super.onCreate(bundle);
        C61292K1d k1d = ((C60280Jib) this.A09.getValue()).A07;
        this.A00 = k1d;
        this.A03 = k1d.A08;
        AnonymousClass0fD.A09(929367336, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1642849006);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.igtv_series, viewGroup, false);
        AnonymousClass0fD.A09(361235070, A022);
        return inflate;
    }
}
