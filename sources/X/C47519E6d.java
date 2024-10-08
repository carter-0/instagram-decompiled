package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

/* renamed from: X.E6d  reason: case insensitive filesystem */
public final class C47519E6d extends C227812jx implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "CommentPollVotersListFragment";
    public E9N A00;
    public C46434Dew A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07 = C227642jf.A02(this);
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;
    public final M0A A0A;
    public final C51041FnX A0B;

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = getRecyclerView();
        C46434Dew dew = this.A01;
        if (dew == null) {
            0qQ.A0F("paginationHelper");
            throw AnonymousClass00P.createAndThrow();
        }
        recyclerView.A15(dew);
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new C59845JaL(viewLifecycleOwner, r3, this, (AnonymousClass4D7) null, 30), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public static final void A00(C47519E6d e6d) {
        E9N e9n = e6d.A00;
        if (e9n == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        }
        e9n.A0C = false;
        DbY.A17(e6d, 2dZ.A0t, false);
        C46445Df7.A01(e6d, false);
    }

    public final String getModuleName() {
        return DbT.A0O(this.A03).getModuleName();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
    }

    public C47519E6d() {
        C51796G2f g2f = new C51796G2f(this, 36);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C51796G2f(new C51796G2f(this, 33), 34));
        this.A09 = DbS.A0I(new C51796G2f(A002, 35), g2f, new C20614Wvv(24, (Object) null, A002), DbS.A0z(C60254JiB.class));
        this.A03 = C51796G2f.A00(this, 29);
        this.A02 = C51796G2f.A00(this, 28);
        this.A04 = C51796G2f.A00(this, 30);
        this.A08 = C51796G2f.A00(this, 32);
        this.A05 = AnonymousClass1YB.A00(G2U.A00);
        this.A06 = C51796G2f.A00(this, 31);
        this.A0B = new C51041FnX(this);
        this.A0A = new M0A(this, 3);
    }

    public final void configureActionBar(2da r3) {
        Dba.A1G(r3);
        DbW.A1C(r3, requireContext().getString(2131969561));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r33) {
        /*
            r32 = this;
            r0 = -1640182213(0xffffffff9e3cce3b, float:-9.9952846E-21)
            int r4 = X.AnonymousClass0fD.A02(r0)
            r5 = r32
            r0 = r33
            super.onCreate(r0)
            int r0 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            X.M0A r3 = r5.A0A
            X.0eM r2 = r5.A07
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r2)
            X.Dew r0 = new X.Dew
            r0.<init>(r5, r1, r3)
            r5.A01 = r0
            android.content.Context r9 = r5.requireContext()
            com.instagram.common.session.UserSession r13 = X.AnonymousClass7TE.A0l(r2)
            X.0eM r0 = r5.A03
            X.0iw r12 = X.DbT.A0O(r0)
            X.FnX r1 = r5.A0B
            r10 = 0
            r0 = 2
            X.AnonymousClass7TG.A0w(r0, r13, r12, r1)
            r7 = 1
            X.Dew r15 = r5.A01
            java.lang.String r6 = "paginationHelper"
            if (r15 == 0) goto L_0x00a4
            r3 = 0
            X.E9N r8 = new X.E9N
            r11 = r10
            r14 = r10
            r16 = r10
            r18 = r10
            r19 = r10
            r20 = r10
            r21 = r10
            r22 = r10
            r23 = r3
            r24 = r3
            r25 = r3
            r26 = r3
            r27 = r3
            r28 = r7
            r29 = r3
            r30 = r3
            r31 = r7
            r17 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r5.A00 = r8
            java.lang.String r2 = "adapter"
            r5.setAdapter(r8)
            X.0eM r0 = r5.A08
            boolean r1 = X.AnonymousClass7TF.A1Z(r0)
            X.E9N r0 = r5.A00
            if (r1 == 0) goto L_0x0084
            if (r0 == 0) goto L_0x00a8
            r0.A0C = r3
            r0.A0D = r7
            r0.A03()
        L_0x007d:
            r0 = -676828003(0xffffffffd7a86c9d, float:-3.70368888E14)
            X.AnonymousClass0fD.A09(r0, r4)
            return
        L_0x0084:
            if (r0 == 0) goto L_0x00a8
            r0.A0C = r7
            X.0eM r0 = r5.A09
            java.lang.Object r3 = r0.getValue()
            X.JiB r3 = (X.C60254JiB) r3
            X.0eM r0 = r5.A02
            java.lang.String r2 = X.DbS.A0t(r0)
            X.0eM r0 = r5.A04
            java.lang.String r1 = X.DbS.A0t(r0)
            X.Dew r0 = r5.A01
            if (r0 == 0) goto L_0x00a4
            r3.A00(r0, r2, r1)
            goto L_0x007d
        L_0x00a4:
            X.0qQ.A0F(r6)
            goto L_0x00ab
        L_0x00a8:
            X.0qQ.A0F(r2)
        L_0x00ab:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47519E6d.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-307788651);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_recyclerview_with_progress, false);
        AnonymousClass0fD.A09(134983800, A022);
        return A0D;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(1641439480);
        super.onDestroy();
        E9N e9n = this.A00;
        if (e9n == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass7Q8 r0 = e9n.A06;
        if (r0 != null) {
            r0.A01();
        }
        AnonymousClass0fD.A09(1679029081, A022);
    }

    public final void onRecyclerViewCreated(RecyclerView recyclerView) {
        DbZ.A1D(recyclerView);
        recyclerView.A0S = true;
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(534435885);
        super.onResume();
        Dbc.A0Q(this);
        AnonymousClass0fD.A09(-393153900, A022);
    }
}
