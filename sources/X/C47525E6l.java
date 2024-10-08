package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.quickpromotion.intf.Trigger;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.E6l  reason: case insensitive filesystem */
public final class C47525E6l extends C227812jx implements C21002X8z, AnonymousClass4DS, C51909G7d, AnonymousClass32K {
    public static final String __redex_internal_original_name = "FollowRequestsFragment";
    public TextView A00;
    public final AnonymousClass0eM A01 = C51792G2b.A00(this, 15);
    public final AnonymousClass0eM A02 = C51792G2b.A00(this, 16);
    public final AnonymousClass0eM A03 = AnonymousClass1YB.A00(G23.A00);
    public final AnonymousClass0eM A04 = C51792G2b.A00(this, 17);
    public final AnonymousClass0eM A05 = C51792G2b.A00(this, 18);
    public final AnonymousClass0eM A06 = C51792G2b.A00(this, 19);
    public final AnonymousClass0eM A07 = C51792G2b.A00(this, 20);
    public final AnonymousClass0eM A08 = C51792G2b.A00(this, 21);
    public final AnonymousClass0eM A09 = AnonymousClass1YB.A00(G24.A00);
    public final AnonymousClass0eM A0A = C51792G2b.A00(this, 22);
    public final AnonymousClass0eM A0B = C51792G2b.A00(this, 23);
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D = C51792G2b.A00(this, 24);
    public final AnonymousClass0eM A0E = C51792G2b.A00(this, 25);
    public final AnonymousClass0eM A0F = C51792G2b.A00(this, 26);
    public final AnonymousClass0eM A0G = C51792G2b.A00(this, 27);
    public final AnonymousClass0eM A0H;

    public final void DGc() {
    }

    public final void DgC(User user, int i) {
        0qQ.A0B(user, 1);
        C47539E7c.A00(this.A0H).A02(user.getId(), i);
    }

    public final void DgG(User user, int i) {
        0qQ.A0B(user, 1);
        C47539E7c.A00(this.A0H).A03(user.getId(), i);
    }

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        if (isAdded() && getContext() != null) {
            DbW.A1B(r4, 2131962574);
            TextView A0D2 = DbZ.A0D(this, (2dZ) r4);
            DbU.A1G(A0D2, this, 2131962572);
            DbT.A17(requireContext(), A0D2, 2Yu.A07(A0D2.getContext()));
            FP3.A00(A0D2, 65, this);
            this.A00 = A0D2;
            AnonymousClass3JR A0K = DbS.A0K();
            A0K.A0I = this.A00;
            r4.AA4(new AnonymousClass3Jb(A0K));
            boolean z = ((LMY) ((C47539E7c) this.A0H.getValue()).A0A.getValue()).A02;
            TextView textView = this.A00;
            if (textView != null) {
                textView.setEnabled(z);
                float f = 0.35f;
                if (textView.isEnabled()) {
                    f = 1.0f;
                }
                textView.setAlpha(f);
            }
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        ArrayList<String> arrayList;
        if (i2 == -1 && i == 277) {
            boolean z = false;
            if (intent != null) {
                z = intent.getBooleanExtra("ARG_IS_POSITIVE_ACTION", false);
                arrayList = intent.getStringArrayListExtra("ARG_USER_IDS");
            } else {
                arrayList = null;
            }
            2YL A0H2 = DbS.A0H(this.A0H);
            AnonymousClass7TE.A1Z(new C59673JTe(arrayList, A0H2, (AnonymousClass4D7) null, 23, z), C318116oQ.A00(A0H2));
        }
        super.onActivityResult(i, i2, intent);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ((2bu) this.A0A.getValue()).Dh3();
        AbsListView absListView = (AbsListView) AnonymousClass7TF.A0F(view, 16908298);
        absListView.setAdapter((C331047Ph) this.A01.getValue());
        absListView.setImportantForAccessibility(1);
        absListView.setOnScrollListener((C249383je) this.A05.getValue());
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new C66170MGh(viewLifecycleOwner, r3, this, (AnonymousClass4D7) null, 31), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final void Ct2(C53329GmF gmF) {
        C47539E7c.A00(this.A0H).A00(gmF);
    }

    public final void DGX() {
        this.A07.getValue();
        C47539E7c.A01((C47539E7c) this.A0H.getValue());
    }

    public final void DJp(User user, int i) {
        C47539E7c.A00(this.A0H).A04(user.getId(), i);
        Set singleton = Collections.singleton(Trigger.A0d);
        0qQ.A07(singleton);
        ((2bu) this.A0A.getValue()).AVg(singleton);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: X.0iw} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DVq(com.instagram.user.model.User r26, int r27) {
        /*
            r25 = this;
            r12 = r25
            X.0eM r0 = r12.A07
            java.lang.Object r1 = r0.getValue()
            X.EwV r1 = (X.C49490EwV) r1
            r3 = r26
            java.lang.String r4 = r3.getId()
            com.instagram.common.session.UserSession r0 = r1.A01
            X.0iw r2 = r1.A00
            X.0wc r1 = X.AnonymousClass0kN.A01(r2, r0)
            java.lang.String r0 = "follow_request_overflow_menu_tapped"
            r5 = r27
            X.0Aj r0 = X.DbZ.A0H(r1, r0, r4, r5)
            X.DbW.A15(r0, r2)
            r0.Cgf()
            X.Fno r2 = new X.Fno
            r2.<init>(r12, r3)
            androidx.fragment.app.FragmentActivity r10 = r12.requireActivity()
            android.content.Context r9 = r12.requireContext()
            X.0eM r1 = r12.A0C
            com.instagram.common.session.UserSession r15 = X.AnonymousClass7TE.A0l(r1)
            X.0gy r11 = X.AnonymousClass07i.A00(r12)
            X.0wc r14 = X.DbX.A0P(r12, r1)
            r16 = 0
            r0 = 4
            X.0qQ.A0B(r15, r0)
            X.FV7 r8 = new X.FV7
            r13 = r12
            r17 = r16
            r18 = r16
            r19 = r3
            r20 = r2
            r21 = r16
            r22 = r16
            r23 = r16
            r24 = r16
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            android.content.Context r0 = r12.requireContext()
            X.Dg1 r7 = X.C46498Dg1.A00(r0, r1)
            java.util.List r6 = r8.A03()
            int r5 = r6.size()
            r4 = 0
        L_0x006e:
            if (r4 >= r5) goto L_0x0089
            java.lang.Object r3 = r6.get(r4)
            android.util.Pair r3 = (android.util.Pair) r3
            java.lang.Object r0 = r3.second
            java.lang.String r2 = r0.toString()
            r1 = 63
            X.FPF r0 = new X.FPF
            r0.<init>((int) r1, (java.lang.Object) r3, (java.lang.Object) r8)
            r7.A0C(r2, r0)
            int r4 = r4 + 1
            goto L_0x006e
        L_0x0089:
            X.FFy r1 = new X.FFy
            r1.<init>(r7)
            android.content.Context r0 = r12.requireContext()
            r1.A05(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47525E6l.DVq(com.instagram.user.model.User, int):void");
    }

    public final void DpP() {
        this.A07.getValue();
        if (AnonymousClass7TF.A1V(C66571pQ.A02)) {
            C309516Yo A0N = DbX.A0N(requireActivity(), this.A0C);
            A0N.A0B((Bundle) null, FC6.A00().A00().A01("newsfeed_follow_requests", getString(2131960850)));
            A0N.A04();
        }
    }

    public final String getModuleName() {
        return DbT.A0O(this.A02).getModuleName();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0C);
    }

    public C47525E6l() {
        C51792G2b g2b = new C51792G2b(this, 31);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C51792G2b(new C51792G2b(this, 28), 29));
        this.A0H = DbS.A0I(new C51792G2b(A002, 30), g2b, new MJ7(14, (Object) null, A002), DbS.A0z(C47539E7c.class));
        this.A0C = C227642jf.A02(this);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-880939606);
        super.onCreate(bundle);
        AnonymousClass0eM r4 = this.A08;
        DbY.A0v(requireContext(), (MYU) r4.getValue(), this, this.A0C);
        C49284EsT.A00(r4);
        AnonymousClass0eM r42 = this.A0H;
        C47539E7c e7c = (C47539E7c) r42.getValue();
        C51645Fy4.A01(e7c, C318116oQ.A00(e7c), 30);
        C47539E7c.A00(r42).A00 = new C51657FyJ(this, 4);
        ((F2T) ((C47539E7c) r42.getValue()).A04.A04.getValue()).A00 = new C51657FyJ(this, 5);
        AnonymousClass0fD.A09(-1710284624, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1359653101);
        0qQ.A0B(layoutInflater, 0);
        registerLifecycleListener((C229402nK) this.A05.getValue());
        View inflate = layoutInflater.inflate(R.layout.layout_listview_with_progress, viewGroup, false);
        AnonymousClass0fD.A09(-1222827728, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1950013227);
        super.onDestroyView();
        unregisterLifecycleListener((C229402nK) this.A05.getValue());
        AnonymousClass0fD.A09(6311250, A022);
    }

    public final C358248ab ALt(C358248ab r1) {
        Dba.A1K(this, r1);
        return r1;
    }
}
