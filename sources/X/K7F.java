package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

public final class K7F extends AnonymousClass4DH implements C268594df {
    public static final String __redex_internal_original_name = "IgLiveFundraiserDonorListBottomSheetFragment";
    public float A00 = 0.4f;
    public QP7 A01;
    public C60418JlB A02;
    public String A03;
    public RecyclerView A04;
    public final AnonymousClass0eM A05 = C227642jf.A02(this);
    public final boolean A06 = true;

    public final int AqL() {
        return -1;
    }

    public final float Cmb() {
        return 1.0f;
    }

    public final void DMt() {
    }

    public final void DMu(int i) {
    }

    public final boolean Erf() {
        return true;
    }

    public final String getModuleName() {
        return "live_fundraiser_donor_list";
    }

    public final void onBottomSheetClosed() {
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0095, code lost:
        if (r11 != true) goto L_0x0097;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r19, android.os.Bundle r20) {
        /*
            r18 = this;
            r13 = 0
            r8 = r19
            X.0qQ.A0B(r8, r13)
            r0 = r20
            r3 = r18
            super.onViewCreated(r8, r0)
            r0 = 2131432001(0x7f0b1241, float:1.8485747E38)
            androidx.recyclerview.widget.RecyclerView r2 = X.DbZ.A0F(r8, r0)
            android.content.Context r1 = r3.requireContext()
            r7 = 1
            com.instagram.common.ui.widget.recyclerview.FastScrollingLinearLayoutManager r0 = new com.instagram.common.ui.widget.recyclerview.FastScrollingLinearLayoutManager
            r0.<init>(r1)
            r2.setLayoutManager(r0)
            X.JlB r0 = r3.A02
            if (r0 != 0) goto L_0x002d
            X.DbS.A13()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x002d:
            r2.setAdapter(r0)
            r3.A04 = r2
            r0 = 2131434139(0x7f0b1a9b, float:1.8490083E38)
            android.widget.ImageView r4 = X.DbS.A0G(r8, r0)
            r0 = 2131434137(0x7f0b1a99, float:1.849008E38)
            android.view.View r2 = r8.findViewById(r0)
            r0 = 2131434136(0x7f0b1a98, float:1.8490077E38)
            android.view.View r0 = r8.findViewById(r0)
            r1 = 2131434140(0x7f0b1a9c, float:1.8490086E38)
            android.widget.TextView r1 = X.AnonymousClass7TE.A0d(r8, r1)
            r5 = 2131434134(0x7f0b1a96, float:1.8490073E38)
            android.widget.TextView r5 = X.AnonymousClass7TE.A0d(r8, r5)
            r6 = 2131434135(0x7f0b1a97, float:1.8490075E38)
            android.widget.TextView r6 = X.AnonymousClass7TE.A0d(r8, r6)
            android.content.Context r9 = X.AnonymousClass7TE.A0S(r8)
            android.content.Context r8 = r3.requireContext()
            int r11 = X.Dbb.A01(r8)
            android.content.Context r8 = r3.requireContext()
            int r12 = X.AnonymousClass7TG.A03(r8)
            r10 = 0
            r16 = -1
            X.GIH r8 = new X.GIH
            r14 = r13
            r15 = r13
            r17 = r13
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r4.setImageDrawable(r8)
            X.QP7 r9 = r3.A01
            if (r9 == 0) goto L_0x00e4
            java.lang.Object r10 = r9.A02
            com.instagram.common.typedurl.ImageUrl r10 = (com.instagram.common.typedurl.ImageUrl) r10
            r8 = 0
            if (r10 == 0) goto L_0x0097
            java.lang.String r10 = r10.getUrl()
            if (r10 == 0) goto L_0x0097
            boolean r11 = X.C51966G9m.A1X(r10)
            r10 = 1
            if (r11 == r7) goto L_0x0098
        L_0x0097:
            r10 = 0
        L_0x0098:
            r7 = 8
            if (r10 == 0) goto L_0x00e5
            X.Dba.A0y(r4, r2, r0, r13, r7)
            java.lang.Object r0 = r9.A02
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0
            if (r0 == 0) goto L_0x00a8
            X.JYP.A00(r4, r0)
        L_0x00a8:
            java.lang.String r0 = r9.A06
            r1.setText(r0)
            android.content.res.Resources r7 = X.DbV.A05(r3)
            r4 = 2131965236(0x7f133534, float:1.9567276E38)
            java.lang.String r3 = r9.A07
            java.lang.Object r2 = r9.A01
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            java.lang.String r1 = ""
            if (r2 == 0) goto L_0x00ca
            java.lang.String r0 = r2.getFullName()
            if (r0 != 0) goto L_0x00cb
            java.lang.String r0 = r2.getShortName()
            if (r0 != 0) goto L_0x00cb
        L_0x00ca:
            r0 = r1
        L_0x00cb:
            java.lang.String[] r0 = new java.lang.String[]{r3, r0}
            android.text.Spanned r0 = X.0bC.A01(r7, r0, r4)
            r6.setText(r0)
            r5.setText(r1)
            int r0 = r1.length()
            if (r0 != 0) goto L_0x00e1
            r8 = 8
        L_0x00e1:
            r5.setVisibility(r8)
        L_0x00e4:
            return
        L_0x00e5:
            X.Dba.A0y(r4, r2, r0, r7, r13)
            goto L_0x00a8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K7F.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final /* synthetic */ boolean AB6() {
        return false;
    }

    public final /* synthetic */ boolean ANU() {
        return false;
    }

    public final View C4U() {
        return this.mView;
    }

    public final int C8P() {
        return 0;
    }

    public final float CMx() {
        return this.A00;
    }

    public final boolean CPc() {
        return this.A06;
    }

    public final /* synthetic */ float CoU() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = this.A04;
        if (recyclerView == null || JTP.A1Y(recyclerView)) {
            return false;
        }
        return true;
    }

    public final int AhP(Context context) {
        return Dbb.A02(context);
    }

    public final void onCreate(Bundle bundle) {
        QP7 qp7;
        int A022 = AnonymousClass0fD.A02(-690793487);
        K7F.super.onCreate(bundle);
        this.A03 = requireArguments().getString("IgLiveCapture.CAPTURE_FRAGMENT_ARGUMENTS_KEY_BROADCAST_ID");
        AnonymousClass0eM r2 = this.A05;
        C257443xP r0 = (C257443xP) ((C70599OCw) LKG.A01(AnonymousClass7TE.A0l(r2)).A01.getValue()).A00.A0X();
        if (r0 != null) {
            qp7 = (QP7) r0.A04();
        } else {
            qp7 = null;
        }
        this.A01 = qp7;
        LKG.A01(AnonymousClass7TE.A0l(r2)).A01.getValue();
        this.A02 = new C60418JlB(this, AnonymousClass7TE.A0l(r2), this);
        String str = this.A03;
        if (str != null) {
            1NY A0b = AnonymousClass7TG.A0b(DbY.A0R(r2));
            A0b.A0K("live/%s/charity_donations/", new Object[]{str});
            1OC A0R = DbT.A0R((15p) null, A0b, K1G.class, LK5.class, true);
            C61500KAf.A00(A0R, this, 39);
            schedule(A0R);
        }
        AnonymousClass0fD.A09(-1127771596, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(266916651);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_iglive_fundraiser_donor_list, false);
        AnonymousClass0fD.A09(-1509282899, A022);
        return A0D;
    }
}
